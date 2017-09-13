package org.jpos.qi.eeuser;

import com.vaadin.data.Binder;
import com.vaadin.data.provider.CallbackDataProvider;
import com.vaadin.data.provider.ConfigurableFilterDataProvider;
import com.vaadin.data.provider.DataProvider;
import com.vaadin.data.provider.QuerySortOrder;
import com.vaadin.shared.data.sort.SortDirection;
import org.jpos.ee.*;
import org.jpos.qi.QIHelper;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

/**
 * Created by jr on 9/11/17.
 */
public class ConsumersHelper extends QIHelper {

    protected ConsumersHelper(Class clazz) {
        super(clazz);
    }

    @Override
    public boolean updateEntity(Binder binder) throws BLException {
        try {
            return (boolean) DB.execWithTransaction((db) -> {
                Consumer oldConsumer = (Consumer) ((Consumer) getOriginalEntity()).clone();
                binder.writeBean(getOriginalEntity());
                Consumer newConsumer = (Consumer) getOriginalEntity();
                db.session().merge(newConsumer);
                return addRevisionUpdated(db, getEntityName(),
                        String.valueOf(newConsumer.getId()),
                        oldConsumer,
                        newConsumer,
                        new String[]{"active","startdate","enddate"});
            });
        } catch (Exception e) {
            getApp().getLog().error(e);
            return false;
        }
    }

    //not used
    @Override
    public Stream getAll(int offset, int limit, Map<String, Boolean> orders) throws Exception {
        return null;
    }

    //not used
    @Override
    public int getItemCount() throws Exception {
        return 0;
    }

    public Stream getAll(int offset, int limit, Map<String, Boolean> orders, User user) throws Exception {
        return ((List<Consumer>) (DB.exec(db -> {
            ConsumerManager mgr = new ConsumerManager(db,user);
            return mgr.getAll(offset,limit,orders);
        }))).stream();
    }

    public int getItemCount(User user) throws Exception {
        return (int) DB.exec(db -> {
            ConsumerManager mgr = new ConsumerManager(db,user);
            return mgr.getItemCount();
        });
    }

    @Override
    public String getItemId(Object item) {
        return ((Consumer)item).getId();
    }

    @Override
    public Object getEntityByParam(String param)  {
        try {
            return  DB.exec(db -> {
                db.session().enableFetchProfile("eager");
                return db.session().get(clazz, param);
            });
        } catch (Exception e) {
            getApp().getLog().error(e);
            return null;
        }
    }

    //Overridden to call custom getAll that includes dateRange filter,
    // and to include the ConfigurableFilterDataProvider wrapper
    @Override
    public DataProvider getDataProvider() {
        Map<String,Boolean> orders = new HashMap<>();
        DataProvider dataProvider = DataProvider.fromCallbacks(
                (CallbackDataProvider.FetchCallback) query -> {
                    int offset = query.getOffset();
                    int limit = query.getLimit();
                    for (Object o : query.getSortOrders()) {
                        QuerySortOrder order = (QuerySortOrder) o;
                        orders.put(order.getSorted(), order.getDirection() == SortDirection.DESCENDING);
                    }
                    User user = (User) query.getFilter().orElse(null);
                    try {
                        return getAll(offset,limit,orders,user);
                    } catch (Exception e) {
                        getApp().getLog().error(e);
                        return null;
                    }
                },
                (CallbackDataProvider.CountCallback) query -> {
                    User user = (User) query.getFilter().orElse(null);
                    try {
                        return getItemCount(user);
                    } catch (Exception e) {
                        getApp().getLog().error(e);
                        return 0;
                    }
                });
        return (ConfigurableFilterDataProvider<Consumer,Void,User>) dataProvider.withConfigurableFilter();
    }

    public List<Role> getRoles() {
        try {
            return (List<Role>) DB.exec(db-> {
                RoleManager mgr = new RoleManager(db);
                return mgr.getAll();
            });
        } catch (Exception e) {
            getApp().getLog().error(e);
            return null;
        }
    }

}
