/*
 * jPOS Project [http://jpos.org]
 * Copyright (C) 2000-2017 jPOS Software SRL
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package org.jpos.qi;

import com.vaadin.v7.data.Container;
import com.vaadin.v7.data.Item;
import com.vaadin.v7.data.Property;
import com.vaadin.v7.data.util.BeanItem;
import com.vaadin.v7.data.util.MethodProperty;
import org.hibernate.Criteria;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.jpos.ee.DB;
import org.jpos.ee.SoftDelete;

import java.io.Serializable;
import java.util.*;

/*
 * EntityContainer, based on Vaadin's HbnContainer
 */
public class EntityContainer<T>
        implements
        Container.ItemSetChangeNotifier,
        Container.Sortable,
        Container.Indexed
{
    protected static final int MAX_ENTITY_CACHE_SIZE = 100;
    protected static final int ROW_BUF_SIZE = 100;
    protected static final int ID_TO_INDEX_MAX_SIZE = 500;

    public Class<T> clazz;
    protected Map<String, Class> props;
    private Collection<String> sortableProps;
    protected Map<Object,Item> entityItemsCache;
    private List<T> ascRowBuffer;
    private List<T> descRowBuffer;
    protected List<T> indexRowBuffer;
    protected int indexRowBufferFirstIndex;
    protected Long size; // cached size
    protected Object firstId; // cached firstId
    protected Object lastId;  // cached lastId
    private boolean removeAll;

    /**
     * Map from entity/item identifiers to index. Maps does not contain mapping
     * for all identifiers in container, but only those that are recently
     * loaded. Map gets cleaned during usage, to free memory.
     */
    protected final Map<Object, Integer> idToIndex = new LinkedHashMap<>();

    /** internal flag used to temporarily invert order of listing */
    protected boolean normalOrder = true;

    private Object[] orderPropertyIds;
    private boolean[] orderAscendings;

    private LinkedList<ItemSetChangeListener> itemSetChangeListeners = null;
    private List<Criterion> restrictions;
    private List<Criterion> searchRestrictions;

    public EntityContainer
            (Class<T> clazz, Map<String, Class> props, Collection<String> sortableProperties)
    {
        this.clazz = clazz;
        this.props = props;
        this.sortableProps = sortableProperties;
        entityItemsCache = new HashMap<>();
    }

    /* ---------- Container Implementation ------------ */
    public boolean addContainerProperty(Object o, Class<?> aClass, Object o1) throws UnsupportedOperationException {
        throw new UnsupportedOperationException();
    }

    public Item addItem(Object o) {
        clearInternalCache();
        try {
            DB.execWithTransaction((db) -> {
                db.session().save(o);
                return null;
            });
        } catch (Exception e) {
            QI.getQI().getLog().error(e);
        }
        fireContentsChange(this.getItemIds().size() - 1);
        return new BeanItem<>(o);
    }

    public Object addItem() {
        Object o;
        try {
            o = clazz.newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
            return null;
        } catch (IllegalAccessException e) {
            e.printStackTrace();
            return null;
        }
        return o;
    }

    public boolean containsId(Object o) {
        try {
            return (boolean) DB.exec((db) -> db.session().get(clazz, (Serializable) o) != null);
        } catch (Exception e) {
            QI.getQI().getLog().error(e);
            return false; 
        }
    }

    public Property getContainerProperty(final Object id, final Object attribute) {
        Item item = getItem(id);
        return item == null ? null : item.getItemProperty(attribute);
    }

    public Collection<String> getContainerPropertyIds() {
        return props.keySet();
    }

    public Item getItem(Object id) {
        Item item = null;
        if (id != null) {
            item = entityItemsCache.get (id);
            if (item == null) {
                Object obj;
                try {
                    obj = DB.exec((db) -> {
                        db.session().enableFetchProfile("eager");
                        return db.session().get(clazz,(Serializable) id);
                    });
                } catch (Exception e) {

                    obj = null;
                }
                item = (obj != null ? new EntityItem<>(obj, props) : null);
                if (item != null) {
                    if (entityItemsCache.size() > MAX_ENTITY_CACHE_SIZE) {
                        entityItemsCache.clear();
                    }
                    entityItemsCache.put (id, item);
                }
            }
        }
        return item;
    }

    public Collection<?> getItemIds() {
        try {
            return (Collection<?>) DB.exec((db) -> {
                Criteria crit = getCriteria(db);
                crit.setProjection(Projections.id());
                return crit.list();
            });
        } catch (Exception e) {
            QI.getQI().getLog().error(e);
            return null;
        }
    }

    public Class getType(Object o) {
        return props.get(o);
    }

    public void addRestriction (Criterion c) {
        if (restrictions == null)
            restrictions = new ArrayList<>();
        restrictions.add (c);
        clearInternalCache();
        fireContentsChange(-1);
    }

    public void removeRestrictions () {
        if(restrictions != null)
            restrictions.clear();
        clearInternalCache();
        fireContentsChange(-1);
    }

    public boolean removeAllItems() {
        if (!isRemoveAll())
            throw new IllegalAccessError("removeAll not enabled");
        boolean allRemoved = true;
        Collection lst =  getItemIds();
        for (Object itemId : lst) {
            if (!removeItem(itemId)) {
                allRemoved = false;
            }
        }
        fireContentsChange(-1);
        return allRemoved;
    }

    public boolean removeContainerProperty(Object o) throws UnsupportedOperationException {
        throw new UnsupportedOperationException();
    }

    public boolean removeItem(Object itemId) {
        try {
            return (boolean) DB.execWithTransaction((db) -> {
                Object obj = db.session().get(clazz, (Serializable) itemId);
                if (obj != null) {
                    if (SoftDelete.class.isAssignableFrom(clazz)) {
                        ((SoftDelete) obj).setDeleted(true);
                    } else {
                        db.session().delete(obj);
                    }
                    clearInternalCache();
                    fireContentsChange(-1);
                    return true;
                }
                return false;
            });
        } catch (Exception e) {
            QI.getQI().getLog().error(e);
            return false;
        }
    }

    public int size() {
        if (size == null) {
            try {
                size = (Long) DB.exec((db) -> {
                    Criteria crit = getBaseCriteria(db);
                    if (searchRestrictions != null && searchRestrictions.size() > 0) {
                        for (Criterion c : searchRestrictions) {
                            crit.add(c);
                        }
                    }
                    if (restrictions != null && restrictions.size() > 0) {
                        for (Criterion c : restrictions) {
                            crit.add(c);
                        }
                    }
                    crit = crit.setProjection(Projections.projectionList().add(Projections.rowCount()).add(Projections.groupProperty("id")));
                    return (long) crit.list().size();
                });
            } catch (Exception e) {
                QI.getQI().getLog().error(e);
                return 0;
            }
        }
        return (int) size.longValue();
    }

    // Helper method
    protected Criteria getBaseCriteria (DB db) {
        Criteria crit = db.session().createCriteria(clazz);
        if (SoftDelete.class.isAssignableFrom (clazz))
            crit.add (Restrictions.eq ("deleted", false));
        if (restrictions != null)
            restrictions.forEach(crit::add);
        if (searchRestrictions != null)
            searchRestrictions.forEach(crit::add);
        return crit;
    }

    /* ---------- Container.ItemSetChangeNotifier implementation ------------ */
    @Override
    public void addListener(ItemSetChangeListener listener) {
        addItemSetChangeListener(listener);
    }

    @Override
    public void addItemSetChangeListener(ItemSetChangeListener listener) {
        if (itemSetChangeListeners == null) {
            itemSetChangeListeners = new LinkedList<>();
        }
        itemSetChangeListeners.add(listener);
    }

    @Override
    public void removeItemSetChangeListener(ItemSetChangeListener listener) {
        if (itemSetChangeListeners != null) {
            itemSetChangeListeners.remove(listener);
        }
    }

    @Override
    public void removeListener(ItemSetChangeListener listener) {
        removeItemSetChangeListener(listener);
    }

    /* ---- Container.Sortable --------------------- */
    public void sort(Object[] propertyId, boolean[] ascending) {
        clearInternalCache();
        orderPropertyIds = propertyId;
        orderAscendings = ascending;
        fireContentsChange(-1);
    }

    public Collection<String> getSortableContainerPropertyIds() {
        return sortableProps;
    }

    /* -------- Container.Indexed --------------------------------*/
    public Object addItemAt(int i) throws UnsupportedOperationException {
        throw new UnsupportedOperationException();
    }

    public Item addItemAt(int i, Object o) throws UnsupportedOperationException {
        throw new UnsupportedOperationException();
    }

    public Object getIdByIndex(int index) {
        if (indexRowBuffer == null) {
            resetIndexRowBuffer(index);
        }
        int indexInCache = index - indexRowBufferFirstIndex;
        if (!(indexInCache >= 0 && indexInCache < indexRowBuffer.size())) {
            /*
             * If requested index is not currently in cache, reset it starting
             * from queried index.
             */
            resetIndexRowBuffer(index);
            indexInCache = 0;
        }
        T pojo = indexRowBuffer.get(indexInCache);
        Object id = getPojoId (pojo);
        idToIndex.put(id, index);
        if (idToIndex.size() > ID_TO_INDEX_MAX_SIZE) {
            // clear one from beginning, if ID_TO_INDEX_MAX_SIZE is total of all
            // caches, only detached indexes should get removed
            idToIndex.remove(idToIndex.keySet().iterator().next());
        }
        return id;
    }

    @Override
    public List<?> getItemIds(int startIndex, int numberOfItems) {
        try {
            return (List<?>) DB.exec((db) -> {
                Criteria crit = getCriteria(db);
                crit.setProjection(Projections.id());
                crit.setFirstResult(startIndex);
                crit.setFetchSize(numberOfItems);
                return crit.list();
            });
        } catch (Exception e) {
            QI.getQI().getLog().error(e);
            return null;
        }

    }

    public boolean isRemoveAll() {
        return removeAll;
    }

    public void setRemoveAll(boolean removeAll) {
        this.removeAll = removeAll;
    }

    private void resetIndexRowBuffer(int index) {
        try {
            DB.exec((db) -> {
                indexRowBufferFirstIndex = index;
                indexRowBuffer = getCriteria(db).setFirstResult(index).setMaxResults(ROW_BUF_SIZE).list();
                return null;
            });
        } catch (Exception e) {
            QI.getQI().getLog().error(e);
        }
    }

    public int indexOfId(Object itemId) {
        Integer I = idToIndex.get(itemId);
        return I != null ? I : 0;
    }

    /* ---- Container.Ordered ------------------------ */
    public Object addItemAfter(Object o) throws UnsupportedOperationException {
        throw new UnsupportedOperationException();
    }

    public Item addItemAfter(Object o, Object o1) throws UnsupportedOperationException {
        throw new UnsupportedOperationException();
    }

    public Object firstItemId() {
        if (firstId == null) {
            T first = null;
            try {
                first = (T) DB.exec((db) -> getCriteria(db).setMaxResults(1).setCacheable(true)
                        .uniqueResult());
                Object id = getPojoId(first);
                idToIndex.put(id, normalOrder ? 0 : size() - 1);
                firstId = id;
            } catch (Exception e) {
                QI.getQI().getLog().error(e);
                return null;
            }
        }
        return firstId;
    }

    public boolean isFirstId(Object itemId) {
        return itemId.equals(firstItemId());
    }

    public boolean isLastId(Object itemId) {
        return itemId.equals(lastItemId());
    }

    public Object lastItemId() {
        if (lastId == null) {
            normalOrder = !normalOrder;
            T last = null;
            try {
                last = (T) DB.exec((db) -> getCriteria(db).setMaxResults(1).setCacheable(true)
                        .uniqueResult());
            } catch (Exception e) {
                QI.getQI().getLog().error(e);
                return null;
            }
            Object id = getPojoId(last);
            idToIndex.put(id, normalOrder ? size() - 1 : 0);
            normalOrder = !normalOrder;
            lastId = id;
        }
        return lastId;
    }

    public Object nextItemId(Object itemId) {
        if (isLastId(itemId))
            return null;
        int currentIndex = indexOfId(itemId);
        int firstIndex = normalOrder ? currentIndex + 1 : size()-currentIndex-1;
        List<T> buffer = getRowBuffer();
        try {
            int curBufIndex = buffer.indexOf(itemId);
            if (curBufIndex != -1) {
                T object = buffer.get(curBufIndex + 1);
                return getPojoId(object);
            }
        } catch (Exception e) {
            // not in buffer
        }
        List<T> newBuffer = null;
        try {
            newBuffer = (List<T>) DB.exec((db) -> {
                Criteria crit = getCriteria(db)
                        .setFirstResult(firstIndex)
                        .setMaxResults(ROW_BUF_SIZE)
                        .setCacheable(true);
                crit.setProjection(Projections.id());
                return crit.list();
            });
        } catch (Exception e) {
            QI.getQI().getLog().error(e);
        }
        if (newBuffer.size() > 0) {
            setRowBuffer(newBuffer, firstIndex);
            return newBuffer.get(0);
        }
        return null;
    }

    public Object prevItemId(Object itemId) {
        // temp flip order and use nextItemId implementation
        normalOrder = !normalOrder;
        Object prev = nextItemId(itemId);
        normalOrder = !normalOrder;
        return prev;
    }

    // Helper methods
    protected List<T> getRowBuffer() {
        if (normalOrder) {
            return ascRowBuffer;
        } else {
            return descRowBuffer;
        }
    }

    protected void setRowBuffer (List<T> list, int firstIndex) {
        if (normalOrder) {
            ascRowBuffer = list;
            for (int i = 0; i < list.size(); ++i) {
                // TODO FIXME idToIndex.put(getPojoId (list.get(i)), firstIndex + i);
                idToIndex.put(list.get(i), firstIndex + i);
            }
        } else {
            descRowBuffer = list;
            int lastIndex = size() - 1;
            for (int i = 0; i < list.size(); ++i) {
                // TODO FIXME idToIndex.put(getPojoId (list.get(i)), lastIndex - firstIndex - i);
                idToIndex.put(list.get(i), lastIndex - firstIndex - i);
            }
        }
        while (idToIndex.size() > ID_TO_INDEX_MAX_SIZE) {
            idToIndex.remove(idToIndex.keySet().iterator().next());
        }
    }

    private Criteria getCriteria (DB db) {
        Criteria crit = getBaseCriteria (db);
        List<Order> orders = getOrder(!normalOrder);
        orders.forEach(crit::addOrder);
        return crit;
    }

    protected final List<Order> getOrder(boolean flipOrder) {
        List<Order> orders = new ArrayList<>();
        orders.addAll(getDefaultOrder(flipOrder));
        orders.add(getNaturalOrder(flipOrder));
        return orders;
    }

    /**
     * Returns the ordering to use for the container contents. The default
     * implementation provides the {@link com.vaadin.v7.data.Container.Sortable} functionality.
     *
     * Can be overridden to customize item sort order.
     *
     * @param flipOrder reverse the order if true
     * @return List orders to apply, first item has the highest priority
     */
    protected List<Order> getDefaultOrder (boolean flipOrder) {
        List<Order> orders = new ArrayList<>();
        if (orderPropertyIds != null) {
            for (int i = 0; i < orderPropertyIds.length; i++) {
                String orderPropertyId = orderPropertyIds[i].toString();
                boolean a = flipOrder != orderAscendings[i];
                if (a) {
                    orders.add(Order.asc(orderPropertyId));
                } else {
                    orders.add(Order.desc(orderPropertyId));
                }
            }
        }
        return orders;
    }

    protected Order getNaturalOrder (boolean flipOrder) {
        if (flipOrder) {
            return Order.desc("id");
        } else {
            return Order.asc("id");
        }
    }
    /* ---------------------------------------------------------- */

    public void fireContentsChange(int addedItemIndex) {
        if (itemSetChangeListeners != null) {
            final Object[] iscl = itemSetChangeListeners.toArray();
            final Container.ItemSetChangeEvent event =
                    new ItemSetChangeEvent(this, addedItemIndex);
            for (Object l : iscl) {
                ((ItemSetChangeListener) l).containerItemSetChange(event);
            }
        }
    }

    public void clearInternalCache() {
        idToIndex.clear();
        indexRowBuffer = null;
        ascRowBuffer = null;
        descRowBuffer = null;
        firstId = null;
        lastId = null;
        size = null;
        entityItemsCache.clear();
    }

    protected Object getPojoId(Object entity) {
        return new MethodProperty(entity, "id").getValue();
    }

    public void addSearchRestriction (Criterion c) {
        if(searchRestrictions == null)
            searchRestrictions = new ArrayList<>();
        searchRestrictions.add(c);
        clearInternalCache();
        fireContentsChange(-1);
    }

    public void removeSearchRestrictions () {
        if(searchRestrictions != null)
            searchRestrictions.clear();
        clearInternalCache();
        fireContentsChange(-1);
    }

    public void updateItem (Item item) {
        clearInternalCache();
        Object id = item.getItemProperty("id").getValue();
        try {
            DB.execWithTransaction((db) -> {
                Object obj = db.session().get(clazz, (Serializable) id);
                for (String propertyId : props.keySet()) {
                    MethodProperty<Object> p = new MethodProperty<>(obj, propertyId);
                    if (!p.isReadOnly())
                        p.setValue(item.getItemProperty(propertyId).getValue());
                }
                db.session().update(obj);
                ((EntityItem) item).setEntity(obj); // refresh entity
                return null;
            });
        } catch (Exception e) {
            QI.getQI().getLog().error(e);
        }
        fireContentsChange(-1);
    }

    public class ItemSetChangeEvent extends EventObject implements Container.ItemSetChangeEvent, Serializable {
        private final int addedItemIndex;

        private ItemSetChangeEvent(EntityContainer source, int addedItemIndex) {
            super(source);
            this.addedItemIndex = addedItemIndex;
        }

        public Container getContainer() {
            return (Container) getSource();
        }

        public int getAddedItemIndex() {
            return addedItemIndex;
        }
    }

    public List<Criterion> getRestrictions () {
        return restrictions;
    }

    public void setRestrictions (List<Criterion> restrictions) {
        this.restrictions = restrictions;
    }

    public boolean isNormalOrder() {
        return normalOrder;
    }

    public void setNormalOrder(boolean normalOrder) {
        this.normalOrder = normalOrder;
    }


}
