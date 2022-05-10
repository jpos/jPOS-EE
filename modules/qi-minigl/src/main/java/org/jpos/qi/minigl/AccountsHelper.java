/*
 * jPOS Project [http://jpos.org]
 * Copyright (C) 2000-2021 jPOS Software SRL
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

package org.jpos.qi.minigl;

import com.vaadin.data.Binder;
import com.vaadin.data.provider.*;
import com.vaadin.shared.data.sort.SortDirection;
import org.jpos.ee.BLException;
import org.jpos.ee.DB;
import org.jpos.gl.Account;
import org.jpos.gl.CompositeAccount;
import org.jpos.gl.Journal;
import org.jpos.gl.Layer;
import org.jpos.qi.QIHelper;

import java.util.*;
import java.util.stream.Stream;

/**
 * Created by alcarraz on 09/10/15.
 */
public class AccountsHelper extends QIHelper {
    private int maxLevel;
    private boolean isOnlyComposites;

    public AccountsHelper() {
        super(Account.class);
    }

    public AccountsHelper(boolean isOnlyComposites) {
        this(isOnlyComposites, 2);
    }

    public AccountsHelper(boolean isOnlyComposites, int maxLevel) {
        super(Account.class);
        this.isOnlyComposites = isOnlyComposites;
        this.maxLevel = maxLevel;
    }

    @Override
    public String getItemId(Object item) {
        return String.valueOf(((Account)item).getId());
    }

    @Override
    public boolean updateEntity(Binder binder) throws BLException {
        try {
            return DB.execWithTransaction((db) -> {
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
        List accounts = DB.exec(db -> {
            AccountManager mgr = new AccountManager(db);
            if (isOnlyComposites)
                return mgr.getCompositeAccounts(offset, limit, orders);
            return mgr.getAll(offset,limit,orders);

        });
        return accounts.stream();
    }

    private Stream getAllChildren(int offset, int limit, Map<String,Boolean> orders, Account parent) throws Exception {
        List accounts = DB.exec(db -> {
            AccountManager mgr = new AccountManager(db);
            if (isOnlyComposites)
                return mgr.getAllCompositeChildren(offset, limit, orders, parent);
            return  mgr.getAllChildren(offset,limit,orders,parent);
        });
        return accounts.stream();
    }

    private boolean hasChildrenAccounts(Account parent) throws Exception {
        if (parent.getLevel() >= maxLevel)
            return false;
        return DB.exec(db -> {
            if (isOnlyComposites) {
                AccountManager mgr = new AccountManager(db);
                return mgr.getCompositeChildrenCount(parent) > 0;
            }
            return parent.getChildren() != null && parent.getChildren().size() > 0;
        });
    }

    private int getChildrenCount(Account parent) throws Exception {
        return DB.exec(db -> {
            if (isOnlyComposites) {
                AccountManager mgr = new AccountManager(db);
                return mgr.getCompositeChildrenCount(parent);
            }
            db.session().refresh(parent);
            return parent.getChildren().size();
        });

    }

    @Override
    public int getItemCount() throws Exception {
        return DB.exec(db -> {
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
        return DB.exec(db -> {
            AccountManager mgr = new AccountManager(db);
            return mgr.getCompositeAccountsCount();
        });
    }

    private Stream getPossibleParents(int offset, int limit, Map<String,Boolean> orders) throws Exception {
        List<CompositeAccount> accounts = DB.exec(db -> {
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

    public List<Layer> getLayers (Journal journal) {
        try {
            return DB.exec(db -> {
                db.session().enableFetchProfile("eager");
                db.session().refresh(journal);
                return new ArrayList<Layer>(journal.getLayers());
            });
        } catch (Exception e) {
            getApp().getLog().error(e);
            return null;
        }
    }

    public boolean isOnlyComposites() {
        return isOnlyComposites;
    }

    public void setOnlyComposites(boolean onlyComposites) {
        isOnlyComposites = onlyComposites;
    }
}
