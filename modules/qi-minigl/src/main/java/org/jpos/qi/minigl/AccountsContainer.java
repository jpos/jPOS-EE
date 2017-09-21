package org.jpos.qi.minigl;

import com.vaadin.v7.data.Container;
import com.vaadin.v7.data.Item;
import org.jpos.ee.DB;
import org.jpos.gl.Account;
import org.jpos.gl.GLException;
import org.jpos.gl.GLSession;
import org.jpos.qi.EntityContainer;
import org.jpos.qi.EntityItem;
import org.jpos.qi.QI;

import java.util.*;
import java.util.logging.Logger;

/**
 * Created by spr on 11/20/15.
 */
public class AccountsContainer extends EntityContainer implements Container.Hierarchical {
    public AccountsContainer(Map props, Collection sortableProperties) {
        super(Account.class, props, sortableProperties);
    }

    @Override
    public Collection<?> getChildren (Object itemId) {
        List<Long> childrendIds = new ArrayList<>();
        EntityItem<Account> it = (EntityItem<Account>) getItem(itemId);
        Account acct = it.getEntity();
        try {
            return (Collection<?>) DB.exec((db) -> {
                db.session().refresh(acct);
                Set<Account> children = acct.getChildren();
                if (children != null) {
                    for (Account a : children)
                        childrendIds.add(a.getId());
                }
                return childrendIds;
            });
        } catch (Exception e) {
            QI.getQI().getLog().error(e);
            return null;
        }
    }

    @Override
    public Object getParent(Object itemId) {
        EntityItem<Account> it = (EntityItem<Account>) getItem(itemId);
        Account acct = it.getEntity();
        Account parent = acct.getParent();
        return parent != null ? parent.getId() : null;
    }

    @Override
    public Collection<?> rootItemIds() {
        List<Long> rootIds = new ArrayList<>();
        try {
            return (Collection<?>) DB.exec((db)-> {
                try {
                    GLSession gls = new GLSession(db);
                    Account chart = gls.getChart("jcard");
                    Set<Account> roots = chart.getChildren();
                    if (roots != null) {
                        for (Account a : roots){
                            rootIds.add(a.getId());
                        }
                    }
                    return rootIds;
                } catch (GLException e) {
                    e.printStackTrace();
                    return null;
                }
            });
        } catch (Exception e) {
            QI.getQI().getLog().error(e);
            return null;
        }
    }

    @Override
    public boolean setParent(Object itemId, Object newParentId) throws UnsupportedOperationException {
        return false;
    }

    @Override
    public boolean areChildrenAllowed (Object itemId) {
        EntityItem<Account> it = (EntityItem<Account>) getItem(itemId);
        Account acct = it.getEntity();
        try {
            return (boolean) DB.exec((db)-> {
                db.session().refresh(acct);
                Set children = acct.getChildren();
                return children != null && children.size() > 0;
            });
        } catch (Exception e) {
            QI.getQI().getLog().error(e);
            return false;
        }
    }

    @Override
    public boolean setChildrenAllowed(Object itemId, boolean areChildrenAllowed) throws UnsupportedOperationException {
        return false;
    }

    @Override
    public boolean isRoot (Object itemId) {
        EntityItem<Account> it = (EntityItem<Account>) getItem(itemId);
        Account acct = it.getEntity();
        return acct.getParent() != null && Account.CHART == acct.getParent().getType();
    }

    @Override
    public boolean hasChildren(Object itemId) {
        EntityItem<Account> it = (EntityItem<Account>) getItem(itemId);
        Account acct = it.getEntity();
        return acct.getChildren() != null && acct.getChildren().size() > 0;
    }

    @Override
    public Item getItem(Object id) {
        EntityItem<Account> it = (EntityItem<Account>) super.getItem(id);
        Account acct = it.getEntity();
        if (acct.getType() != Account.CHART) {
            return it;
        } else {
            return null;
        }
    }
}
