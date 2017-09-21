package org.jpos.qi.minigl;

import com.vaadin.data.Binder;
import com.vaadin.data.provider.CallbackDataProvider;
import com.vaadin.data.provider.ConfigurableFilterDataProvider;
import com.vaadin.data.provider.DataProvider;
import com.vaadin.data.provider.QuerySortOrder;
import com.vaadin.shared.data.sort.SortDirection;
import org.jpos.ee.*;
import org.jpos.gl.*;
import org.jpos.qi.QI;
import org.jpos.qi.QIHelper;
import org.jpos.qi.components.DateRange;
import java.util.*;
import java.util.stream.Stream;

public class TransactionsHelper extends QIHelper {

    private static long defaultJournalId;

    protected TransactionsHelper(){
        super(GLTransaction.class);
        List<Journal> journals = getJournals();
        if (journals.size() > 0)
            setDefaultJournalId(journals.get(0).getId());
    }

    public void setDefaultJournalId(long defaultJournalId) {
        TransactionsHelper.defaultJournalId = defaultJournalId;
    }

    //Overridden because eager fetch profile has to be set.
    @Override
    public Object getEntityByParam(String param) {
        try {
            return DB.exec( db -> {
                db.session().enableFetchProfile("eager");
                GLTransaction t = db.session().get(GLTransaction.class, new Long(param));
                if (t != null)
                    t.getJournal().getName();
                return t;
            });
        } catch (Exception e) {
            QI.getQI().getLog().error(e);
            return null;
        }
    }

    public Stream getAll(int offset, int limit, Map<String, Boolean> orders, Long journalId, DateRange range) throws Exception {
        List<GLTransaction> list = (List<GLTransaction>) DB.exec(db -> {
            GLTransactionManager mgr;
            if (journalId != null && range != null) {
                mgr = new GLTransactionManager(db, journalId, range.getStart(), range.getEnd());
            } else
                mgr = new GLTransactionManager(db);
            return mgr.getAll(offset,limit,orders);
        });
        return list.stream();
    }

    public int getItemCount(Long journalId, DateRange range) throws Exception {
        return (int) DB.exec(db -> {
            GLTransactionManager mgr;
            if (journalId != null && range != null)
                mgr = new GLTransactionManager(db,journalId,range.getStart(),range.getEnd());
            else
                mgr = new GLTransactionManager(db);
            return mgr.getItemCount();
        });
    }

    @Override
    public Object createNewEntity () {
        GLTransaction txn = (GLTransaction) super.createNewEntity();
        txn.setJournal(getJournal(defaultJournalId));
        txn.setPostDate(new Date());
        return txn;
    }

    @Override
    public boolean updateEntity(Binder binder) throws BLException {
        return false;
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

    @Override
    public String getItemId(Object item) {
        return String.valueOf(((GLTransaction) item).getId());
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
                    DateRange dateRange = (DateRange) query.getFilter().orElse(null);
                    try {
                        return getAll(offset,limit,orders,defaultJournalId,dateRange);
                    } catch (Exception e) {
                        getApp().getLog().error(e);
                        return null;
                    }
                },
                (CallbackDataProvider.CountCallback) query -> {
                    DateRange dateRange = (DateRange) query.getFilter().orElse(null);
                    try {
                        return getItemCount(defaultJournalId,dateRange);
                    } catch (Exception e) {
                        getApp().getLog().error(e);
                        return 0;
                    }
                });
        return (ConfigurableFilterDataProvider<GLTransaction,Void,DateRange>) dataProvider.withConfigurableFilter();
    }

    protected boolean updateEntity (Binder binder, EntryGrid entryGrid, boolean shouldReverse) throws BLException {
        boolean wasUpdated;
        try {
            wasUpdated = (boolean) DB.execWithTransaction( (db) -> {
                GLTransaction oldTxn = ((GLTransaction) getOriginalEntity()).clone();
                binder.writeBean(getOriginalEntity());
                GLTransaction txn = (GLTransaction) getOriginalEntity();
                db.session().merge(txn);
                boolean addedRevision = addRevisionUpdated(
                        db, getEntityName(),
                        String.valueOf(txn.getId()),
                        oldTxn,
                        txn,
                        new String[]{"id","detail","tags","postDate"});
                if (shouldReverse) {
                    //Create reverse
                    GLTransaction reverse = txn.createReverse();
                    //Add the entries to the ones reversed.
                    GLTransaction entryGridTxn = entryGrid.getValue();
                    
                    List<GLEntry> entries = entryGridTxn.getEntries();
                    //Reset ids to 0
                    for (GLEntry e : entries)
                        e.setId(0);

                    reverse.getEntries().addAll(entryGridTxn.getEntries());
                    GLSession glSession = new GLSession(db);
                    glSession.post(txn.getJournal(), reverse);
                    addRevisionCreated(db, getEntityName(), String.valueOf(reverse.getId()));
                    addedRevision = true;
                }
                return addedRevision;
            });
        } catch (Exception e) {
            throw new BLException(e.getMessage());
        }
        return wasUpdated;
    }

    protected boolean saveEntity (Binder binder, EntryGrid entryGrid) {
        try {
            return (boolean) DB.execWithTransaction(db -> {
                if (binder.writeBeanIfValid(getOriginalEntity())) {
                    GLTransaction txn = (GLTransaction) getOriginalEntity();
                    List<GLEntry> entries = entryGrid.getValue().getEntries();
                    //Reset ids to 0
                    for (GLEntry e : entries)
                        e.setId(0);
                    txn.setEntries(entries);
                    txn.setTimestamp(new Date());
                    GLSession glSession = new GLSession(db);
                    glSession.post(txn.getJournal(), txn);
                    addRevisionCreated(db, getEntityName(), getItemId(getOriginalEntity()));
                    return true;
                }
                return false;
            });
        } catch (Exception e) {
            getApp().getLog().error(e);
            getApp().displayNotification(getApp().getMessage("errorMessage.unexpected"));
            return false;
        }
    }

    public List<Layer> getLayers (Journal journal) {
        try {
            return (List<Layer>) DB.exec(db -> {
                db.session().enableFetchProfile("eager");
                db.session().refresh(journal);
                return new ArrayList<Layer>(journal.getLayers());
            });
        } catch (Exception e) {
            getApp().getLog().error(e);
            return null;
        }
    }

    public Layer getLayer (Short id, Journal journal) {
        try {
            return (Layer) DB.exec(db -> db.session().get(Layer.class, new Layer(id, journal)));
        } catch (Exception e) {
            getApp().getLog().error(e);
            return null;
        }
    }
    
    public List<Journal> getJournals() {
        try {
            return (List<Journal>) DB.exec(db -> {
                GLSession session = new GLSession(db);
                return session.getAllJournals();
            });
        } catch (Exception e) {
            getApp().getLog().error(e);
            return null;
        }
    }

    public Journal getJournal (long id) {
        try {
            return (Journal) DB.exec(db -> db.session().get(Journal.class, id));
        } catch (Exception e) {
            getApp().getLog().error(e);
            return null;
        }
    }
}
