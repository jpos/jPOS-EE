package org.jpos.qi.minigl;

import com.vaadin.data.Binder;
import com.vaadin.data.provider.*;
import com.vaadin.shared.data.sort.SortDirection;
import com.vaadin.v7.data.fieldgroup.BeanFieldGroup;
import com.vaadin.v7.data.fieldgroup.FieldGroup;
import com.vaadin.v7.data.util.BeanItem;
import org.jpos.ee.BLException;
import org.jpos.ee.DB;
import org.jpos.gl.Account;
import org.jpos.gl.GLSession;
import org.jpos.gl.Journal;
import org.jpos.gl.Layer;
import org.jpos.qi.QI;
import org.jpos.qi.QIHelper;

import java.util.*;
import java.util.stream.Stream;

/**
 * Created by alcarraz on 09/10/15.
 */
public class AccountsHelper extends QIHelper {

    protected AccountsHelper() {
        super(Account.class);
    }

    @Override
    public String getItemId(Object item) {
        return String.valueOf(((Account)item).getId());
    }

    @Override
    public boolean updateEntity(Binder binder) throws BLException {
        try {
            return (boolean) DB.execWithTransaction((db) -> {
                Account oldAcct = (Account) ((Account) getOriginalEntity()).clone();
                binder.writeBean(getOriginalEntity());
                Account a = (Account) getOriginalEntity();
                db.session().merge(a);
                return addRevisionUpdated(db, getEntityName(),
                        String.valueOf(a.getId()),
                        oldAcct,
                        a,
                        new String[]{"code","description","created","expired"});
            });
        } catch (Exception e) {
            getApp().getLog().error(e);
            return false;
        }

    }

    @Override
    public Stream getAll(int offset, int limit, Map<String, Boolean> orders) throws Exception {
        List<Account> agents = (List<Account>) DB.exec(db -> {
            AccountManager mgr = new AccountManager(db);
            return mgr.getAll(offset,limit,orders);

        });
        return agents.stream();
    }

    private Stream getAllChildren(int offset, int limit, Map<String,Boolean> orders, Account parent) throws Exception {
        List<Account> accounts = (List<Account>) DB.exec(db -> {
            AccountManager mgr = new AccountManager(db);
            return  mgr.getAllChildren(offset,limit,orders,parent);
        });
        return accounts.stream();
    }

    private boolean hasChildrenAccounts(Account parent) throws Exception {
        return (boolean) DB.exec(db -> {
            db.session().refresh(parent);
            return parent.getChildren() != null && parent.getChildren().size() > 0;
        });
    }

    private int getChildrenCount(Account parent) throws Exception {
        return (int) DB.exec(db -> {
            db.session().refresh(parent);
            return parent.getChildren().size();
        });

    }

    @Override
    public int getItemCount() throws Exception {
        return (int) DB.exec(db -> {
            AccountManager mgr = new AccountManager(db);
            return mgr.getItemCount();
        });
    }

    //Needs override to be a Hierachical Data Provider.
    @Override
    public DataProvider getDataProvider() {
        Map<String,Boolean> orders = new HashMap<>();
        HierarchicalDataProvider dataProvider = new AbstractBackEndHierarchicalDataProvider() {
            @Override
            protected Stream fetchChildrenFromBackEnd(HierarchicalQuery query) {
                int offset = query.getOffset();
                int limit = query.getLimit();
                Account parent = (Account) query.getParent();
                Iterator it = query.getSortOrders().iterator();
                while (it.hasNext()) {
                    QuerySortOrder order = (QuerySortOrder) it.next();
                    orders.put(order.getSorted(),order.getDirection() == SortDirection.DESCENDING);
                }
                try {
                    return getAllChildren(offset,limit,orders,parent);
                } catch (Exception e) {
                    getApp().getLog().error(e);
                    return null;
                }
            }
            @Override
            public int getChildCount(HierarchicalQuery query) {
                try {
                    if (query.getParent() != null)
                        return getChildrenCount((Account) query.getParent());
                    return getItemCount();
                } catch (Exception e) {
                    getApp().getLog().error(e);
                    return 0;
                }
            }

            @Override
            public boolean hasChildren(Object item) {
                try {
                    return hasChildrenAccounts((Account) item);
                } catch (Exception e) {
                    getApp().getLog().error(e);
                    return false;
                }
            }
        };
        return dataProvider;
    }

    private int getPossibleParentsCount() throws Exception {
        return (int) DB.exec(db -> {
            AccountManager mgr = new AccountManager(db);
            return mgr.getCompositeAccountsCount();
        });
    }

    private Stream getPossibleParents(int offset, int limit, Map<String,Boolean> orders) throws Exception {
        List<Account> accounts = (List<Account>) DB.exec(db -> {
            AccountManager mgr = new AccountManager(db);
            return  mgr.getCompositeAccounts(offset,limit,orders);
        });
        return accounts.stream();
    }

    public DataProvider getParentDataProvider() {
        Map<String,Boolean> orders = new HashMap<>();
        DataProvider dataProvider = DataProvider.fromCallbacks(
                (CallbackDataProvider.FetchCallback) query -> {
                    int offset = query.getOffset();
                    int limit = query.getLimit();
                    Iterator it = query.getSortOrders().iterator();
                    while (it.hasNext()) {
                        QuerySortOrder order = (QuerySortOrder) it.next();
                        orders.put(order.getSorted(),order.getDirection() == SortDirection.DESCENDING);
                    }
                    try {
                        return getPossibleParents(offset,limit,orders);
                    } catch (Exception e) {
                        getApp().getLog().error(e);
                        return null;
                    }
                },
                (CallbackDataProvider.CountCallback<Account, Void>) query -> {
                    try {
                        return getPossibleParentsCount();
                    } catch (Exception e) {
                        getApp().getLog().error(e);
                        return 0;
                    }
                });
        return dataProvider;
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
}
