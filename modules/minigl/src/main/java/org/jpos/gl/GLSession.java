/*
 * jPOS Project [http://jpos.org]
 * Copyright (C) 2000-2012 Alejandro P. Revilla
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

package org.jpos.gl;

import java.util.*;
import java.math.BigDecimal;

import org.hibernate.*;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.hibernate.criterion.Disjunction;
import org.hibernate.type.LongType;


import org.jpos.ee.DB;

/**
 * MiniGL facility entry point.
 *
 * @author <a href="mailto:apr@jpos.org">Alejandro Revilla</a>
 */
public class GLSession {
    private static Map<String, Object> ruleCache = new HashMap<String, Object>();
    private GLUser user;
    private Session session;
    private DB db;
    public static final short[] LAYER_ZERO = new short[] { 0 };
    public static final BigDecimal ZERO = new BigDecimal ("0.00");
    public static final BigDecimal Z    = new BigDecimal ("0");

    /**
     * Construct a GLSession for a given user.
     *
     * User has to exist in MiniGL gluser table unless username is null.
     * @see GLUser
     *
     * @param username the user name.
     * @throws org.hibernate.HibernateException on database problems
     * @throws GLException if user is not valid
     */
    public GLSession (String username) 
        throws HibernateException, GLException
    {
        super();
        this.db = new DB();
        session = db.open();
        if (username != null) {
            user = getUser (username);
            if (user == null) {
               close();
               throw new GLException ("Invalid user '" + username + "'");
            }
        }
    }
    /**
     * Construct a GLSession using property <code>user.name</code>.
     * User has to exist in MiniGL gluser table.
     * @see GLUser
     * @throws org.hibernate.HibernateException on database problems
     * @throws GLException if user.name is not valid
     */
    public GLSession () throws HibernateException, GLException {
        this (System.getProperty ("user.name"));
    }
    /**
     * Construct a GLSession for a given user.
     *
     * User has to exist in MiniGL gluser table unless username is null.
     * @see GLUser
     *
     * @param db EE DB
     * @param username the user name.
     * @throws HibernateException on database related issue
     * @throws GLException if user is invalid
     */
    public GLSession (DB db, String username) 
        throws HibernateException, GLException
    {
        super();
        this.db = db;
        boolean autoClose = false;
        if (db.session() == null) {
            db.open();
            autoClose = !autoClose;
        }
        session = db.session();
        if (username != null) {
            user = getUser (username);
            if (user == null) {
                if (autoClose)
                    close();
               throw new GLException ("Invalid user '" + username + "'");
            }
        }
    }
    /**
     * Construct a GLSession using property <code>user.name</code>.
     * User has to exist in MiniGL gluser table.
     * @param db EE DB
     * @see GLUser
     * @throws org.hibernate.HibernateException on hibernate exception
     * @throws GLException on GL level exception
     */
    public GLSession (DB db) throws HibernateException, GLException {
        this (db, System.getProperty ("user.name"));
    }
    /**
     * @param action name
     * @return true if user has permission to perform given action
     * @see GLPermission
     */
    public boolean hasPermission (String action) {
        Iterator iter = user.getPermissions().iterator();
        while (iter.hasNext()) {
            GLPermission p = (GLPermission) iter.next();
            if (p.getJournal() == null && action.equals (p.getName()))
                return true;
        }
        return false;
    }
    /**
     * @param action name
     * @throws GLException if user doesn't have permission.
     * @see GLPermission
     */
    public void checkPermission (String action) throws GLException {
        if (!hasPermission (action)) {
            throw new GLException (
                "User '" + user.getName() + "' (" + user.getId() + 
                ") does not have '" + action + "' permission."
            );
        }
    }
    /**
     * Grant permission to user.
     * In order to grant a permission, we need to have both the permission
     * and GRANT.
     *
     * @param userName user name
     * @param permName permission name
     */
    public void grant (String userName, String permName) 
        throws GLException, HibernateException
    {
        checkPermission (GLPermission.GRANT);
        checkPermission (permName);
        GLPermission perm = new GLPermission(permName);
        session.save (perm);
        GLUser u = getUser (userName);
        u.grant (perm);
    }
    /**
     * Revoke permission from user.
     * In order to grant a permission, we need to have both the permission
     * and GRANT.
     *
     * @param userName user name
     * @param permName permission name
     */
    public void revoke (String userName, String permName) 
        throws GLException, HibernateException
    {
        checkPermission (GLPermission.GRANT);
        GLUser u = getUser (userName);
        u.revoke (permName);
    }

        /**
     * Grant permission to user no matter if we have the premission nor GRANT.
     *
     * @param userName user name
     * @param permName permission name
     */
    public void forceGrant (String userName, String permName) {
        GLPermission perm = new GLPermission(permName);
        session.save (perm);
        GLUser u = getUser (userName);
        u.grant (perm);
    }
    /**
     * Revoke permission from user no matter if we have the permission nor GRANT.
     *
     * @param userName user name
     * @param permName permission name
     */
    public void forceRevoke (String userName, String permName) {
        GLUser u = getUser (userName);
        u.revoke (permName);
    }

    /**
     * Verifies user's permission in a given journal.
     * @param action name
     * @param j journal
     * @return true if user has permission to perform given action.
     * @see GLPermission
     * @see Journal
     */
    public boolean hasPermission (String action, Journal j) {
        return getUser().hasPermission(action, j);
    }
    /**
     * Check user's permission in a given journal.
     * @param action name
     * @param j journal
     * @throws GLException if user doesn't have permission.
     * @see GLPermission
     * @see Journal
     */
    public void checkPermission (String action, Journal j) throws GLException {
        if (!hasPermission (action, j)) {
            throw new GLException (
                "User '" + user.getName() + "' (" + user.getId() + 
                ") does not have '" + action + "' permission in journal '" + 
                j.getName() + "' (" + j.getId() + ")"
            );
        }
    }
    /**
     * @param code chart of account's code
     * @return top level chart with given code or null.
     * @throws HibernateException on database errors.
     * @throws GLException if users doesn't have global READ permission.
     * @see GLPermission
     */
    public Account getChart (String code) 
        throws HibernateException, GLException
    {
        checkPermission (GLPermission.READ);
        Query q = session.createQuery (
            "from acct in class org.jpos.gl.CompositeAccount where code=:code and parent is null"
        );
        q.setParameter ("code", code);
        Iterator iter = q.list().iterator();
        return (Account) (iter.hasNext() ? iter.next() : null);
    }
    /**
     * @return List of charts of accounts.
     * @throws HibernateException on database errors.
     * @throws GLException if users doesn't have global READ permission.
     * @see GLPermission
     */
    public List<Account> getCharts ()
        throws HibernateException, GLException 
    {
        checkPermission (GLPermission.READ);
        Query q = session.createQuery(
            "from acct in class org.jpos.gl.CompositeAccount where parent is null"
        );
        return q.list();
    }

    /**
     * @param chart chart of accounts.
     * @param code  account's code.
     * @return account with given code in given chart, or null.
     *
     * @throws HibernateException on database errors.
     * @throws GLException if users doesn't have global READ permission.
     * @see GLPermission
     */
    public Account getAccount (Account chart, String code) 
        throws HibernateException, GLException
    {
        checkPermission (GLPermission.READ);
        Query q = session.createQuery (
            "from acct in class org.jpos.gl.Account where root=:chart and code=:code"
        );
        q.setLong ("chart", chart.getId());
        q.setParameter ("code", code);
        Iterator iter = q.list().iterator();
        return (Account) (iter.hasNext() ? iter.next() : null);
    }

    /**
     * Add account to parent.
     * Check permissions, parent's type and optional currency.
     *
     * @param parent parent account
     * @param acct account to add
     * @throws HibernateException on error
     * @throws GLException if user doesn't have permissions, or type mismatch
     */
    public void addAccount (CompositeAccount parent, Account acct) 
        throws HibernateException, GLException
    {
        addAccount (parent, acct, false);
    }
    /**
     * Add account to parent.
     * Check permissions, parent's type and optional currency.
     *
     * @param parent parent account
     * @param acct account to add
     * @param fast true if we want a fast add that do not eagerly load all childrens
     * @throws HibernateException on error
     * @throws GLException if user doesn't have permissions, or type mismatch
     */
    @SuppressWarnings("unchecked")
    public void addAccount (CompositeAccount parent, Account acct, boolean fast) 
        throws HibernateException, GLException
    {
        checkPermission (GLPermission.WRITE);
        if (!parent.isChart() && !parent.equalsType (acct)) {
            StringBuffer sb = new StringBuffer ("Type mismatch ");
            sb.append (parent.getTypeAsString());
            sb.append ('/');
            sb.append (acct.getTypeAsString());
            throw new GLException (sb.toString());
        }
        String currencyCode = parent.getCurrencyCode();
        if (currencyCode != null 
            && !currencyCode.equals (acct.getCurrencyCode())) 
        {
            StringBuffer sb = new StringBuffer ("Currency mismatch ");
            sb.append (currencyCode);
            sb.append ('/');
            sb.append (acct.getCurrencyCode());
            throw new GLException (sb.toString());
        }
        acct.setRoot (parent.getRoot());
        session.save (acct);
        acct.setParent (parent);
        if (!fast)
            parent.getChildren().add (acct);
    }

    /**
     * Add a chart of accounts.
     * Check permissions.
     *
     * @param acct chart to add
     * @throws HibernateException on error
     * @throws GLException if user doesn't have write permission
     */
    public void addChart (Account acct) 
        throws HibernateException, GLException 
    {
        checkPermission (GLPermission.WRITE);
        session.save (acct);
    }

    /**
     * @param chart chart of accounts.
     * @param code  account's code.
     * @return final account with given code in given chart, or null.
     *
     * @throws HibernateException on database errors.
     * @throws GLException if users doesn't have global READ permission.
     * @see GLPermission
     */
    public FinalAccount getFinalAccount (Account chart, String code)
        throws HibernateException, GLException
    {
        checkPermission (GLPermission.READ);
        Query q = session.createQuery (
            "from acct in class org.jpos.gl.FinalAccount where root=:chart and code=:code"
        );
        q.setLong ("chart", chart.getId());
        q.setParameter ("code", code);
        Iterator iter = q.list().iterator();
        return (FinalAccount) (iter.hasNext() ? iter.next() : null);
    }
    /**
     * @param chart chart of accounts.
     * @return list of final accounts
     * @throws HibernateException on database errors.
     * @throws GLException if users doesn't have global READ permission.
     * @see GLPermission
     */
    public List<FinalAccount> getFinalAccounts (Account chart)
        throws HibernateException, GLException
    {
        checkPermission (GLPermission.READ);
        Query q = session.createQuery (
            "from acct in class org.jpos.gl.FinalAccount where root=:chart"
        );
        q.setLong ("chart", chart.getId());
        return (List<FinalAccount>) q.list();
    }
    /**
     * @param parent parent account.
     * @return list of composite accounts children of the parent account
     * @throws HibernateException on database errors.
     * @throws GLException if users doesn't have global READ permission.
     * @see GLPermission
     */
    public List<CompositeAccount> getCompositeChildren (Account parent) throws HibernateException, GLException {
        checkPermission (GLPermission.READ);
        Query q = session.createQuery(
                "from acct in class org.jpos.gl.CompositeAccount where parent=:parent"
        );
        q.setParameter ("parent", parent);
        return (List<CompositeAccount>) q.list();
    }
    /**
     * @param parent parent account.
     * @return list of composite accounts children of the parent account
     * @throws HibernateException on database errors.
     * @throws GLException if users doesn't have global READ permission.
     * @see GLPermission
     */
    public List<FinalAccount> getFinalChildren (Account parent) throws HibernateException, GLException {
        checkPermission (GLPermission.READ);
        Query q = session.createQuery(
                "from acct in class org.jpos.gl.FinalAccount where parent=:parent"
        );
        q.setParameter ("parent", parent);
        return (List<FinalAccount>) q.list();
    }
    /**
     * @param chart chart of accounts.
     * @return list of all accounts
     * @throws HibernateException on database errors.
     * @throws GLException if users doesn't have global READ permission.
     * @see GLPermission
     */
    public List<Account> getAllAccounts (Account chart)
        throws HibernateException, GLException
    {
        checkPermission (GLPermission.READ);
        Query q = session.createQuery (
            "from acct in class org.jpos.gl.Account where root=:chart"
        );
        q.setLong ("chart", chart.getId());
        return (List<Account>) q.list();
    }

    /**
     * @param chart chart of accounts.
     * @param code  account's code.
     * @return composite account with given code in given chart, or null.
     *
     * @throws HibernateException on database errors.
     * @throws GLException if users doesn't have global READ permission.
     * @see GLPermission
     */
    public CompositeAccount getCompositeAccount (Account chart, String code) 
        throws HibernateException, GLException
    {
        checkPermission (GLPermission.READ);
        Query q = session.createQuery (
            "from acct in class org.jpos.gl.CompositeAccount where root=:chart and code=:code"
        );
        q.setLong ("chart", chart.getId());
        q.setParameter ("code", code);
        Iterator iter = q.list().iterator();
        return (CompositeAccount) (iter.hasNext() ? iter.next() : null);
    }
    /**
     * @param chartName chart of account's code.
     * @param code  account's code.
     * @return account with given code in given chart, or null.
     *
     * @throws HibernateException on database errors.
     * @throws GLException if users doesn't have global READ permission.
     * @see GLPermission
     */
    public Account getAccount (String chartName, String code) 
        throws HibernateException, GLException
    {
        Account chart = getChart(chartName);
        if (chart == null)
            throw new GLException ("Chart '" + chartName + "' does not exist");
        return getAccount(chart, code);
    }
    /**
     * @param chartName chart of account's code.
     * @param code  account's code.
     * @return final account with given code in given chart, or null.
     *
     * @throws HibernateException on database errors.
     * @throws GLException if users doesn't have global READ permission.
     * @see GLPermission
     */
    public FinalAccount getFinalAccount (String chartName, String code) 
        throws HibernateException, GLException
    {
        Account chart = getChart(chartName);
        if (chart == null)
            throw new GLException ("Chart '" + chartName + "' does not exist");
        return getFinalAccount (chart, code);
    }
    /**
     * @param chartName chart of account's code.
     * @param code  account's code.
     * @return composite account with given code in given chart, or null.
     *
     * @throws HibernateException on database errors.
     * @throws GLException if users doesn't have global READ permission.
     * @see GLPermission
     */
    public CompositeAccount getCompositeAccount (String chartName, String code) 
        throws HibernateException, GLException
    {
        Account chart = getChart(chartName);
        if (chart == null)
            throw new GLException ("Chart '" + chartName + "' does not exist");
        return getCompositeAccount (chart, code);
    }

    /**
     * @param name journal's name.
     * @return journal or null.
     * @throws GLException if users doesn't have global READ permission.
     * @throws HibernateException on database errors.
     * @see GLPermission
     */
    public Journal getJournal (String name) 
        throws HibernateException, GLException
    {
        Query q = session.createQuery (
            "from journal in class org.jpos.gl.Journal where name=:name"
        );
        q.setParameter ("name", name);
        Iterator iter = q.list().iterator();
        Journal j = iter.hasNext() ? (Journal) iter.next() : null;
        if (j == null)
            throw new GLException ("Journal '" + name + "' does not exist");
        checkPermission (GLPermission.READ, j);
        return j;
    }

    /**
    * @return list of all journals
    * @throws HibernateException on database errors.
    * @throws GLException if users doesn't have global READ permission.
    * @see GLPermission
    */
    public List<Journal> getAllJournals ()
        throws HibernateException, GLException
    {
        checkPermission (GLPermission.READ);
        Query q = session.createQuery (
            "from acct in class org.jpos.gl.Journal order by chart"
        );
        return (List<Journal>) q.list();
    }

    /**
     * Post transaction in a given journal.
     *
     * @param journal the journal.
     * @param txn the transaction.
     * @throws GLException if user doesn't have POST permission or any rule associated with this journal and/or account raises a GLException.
     * @throws HibernateException on database errors.
     * @see GLPermission
     * @see JournalRule
     */
    public void post (Journal journal, GLTransaction txn) 
        throws HibernateException, GLException
    {
        checkPermission (GLPermission.POST, journal);
        txn.setJournal (journal);
        txn.setTimestamp (new Date());
        if (txn.getPostDate() == null)
            txn.setPostDate (txn.getTimestamp());
        else
            invalidateCheckpoints (txn);
        Collection rules = getRules (txn);
        // dumpRules (rules);
        applyRules (txn, rules);
        session.save (txn);
    }
    /**
     * Moves a transaction to a new journal
     * @param txn the Transaction
     * @param journal the New Journal
     * @throws GLException if user doesn't have POST permission on the old and new journals.
     * @throws HibernateException on database errors.
     */
    public void move (GLTransaction txn, Journal journal) 
        throws GLException, HibernateException
    {
        checkPermission (GLPermission.POST, journal);
        checkPermission (GLPermission.POST, txn.getJournal());
        invalidateCheckpoints (txn);    // invalidate in old journal
        txn.setJournal (journal);
        invalidateCheckpoints (txn);    // invalidate in new journal
        applyRules (txn, getRules (txn));
        session.update (txn);
    }

    /**
     * Summarize transactions in a journal.
     *
     * @param journal the journal.
     * @param start date (inclusive).
     * @param end date (inclusive).
     * @param description summary transaction's description
     * @return GLTransaction a summary transaction
     * @throws GLException if user doesn't have READ permission on this journal.
     * @throws HibernateException on database/mapping errors
     */
    public GLTransaction summarize 
        (Journal journal, Date start, Date end, String description, short[] layers) 
        throws HibernateException, GLException
    {
        checkPermission (GLPermission.SUMMARIZE, journal);
        start = Util.floor (start);
        end   = Util.ceil (end);

        if (end.compareTo (start) < 0) {
            throw new GLException ("Invalid date range " 
                + Util.dateToString(start) + ":" + Util.dateToString (end));
        }
        Date lockDate = journal.getLockDate();
        if (lockDate != null && start.compareTo (lockDate) <= 0) {
            throw new GLException 
                ("Journal is locked at " + Util.dateToString (lockDate));
        }
        setLockDate (journal, end);

        GLTransaction txn = new GLTransaction (description);
        for (int i=0; i<layers.length; i++) {
            Iterator debits  = findSummarizedGLEntries (journal, start, end, false, layers[i]);
            Iterator credits = findSummarizedGLEntries (journal, start, end, true, layers[i]);
            while (debits.hasNext()) {
                Object[] obj = (Object[]) debits.next();
                txn.createDebit (
                    (FinalAccount) obj[0], 
                    (BigDecimal) obj[1], 
                    null, layers[i]
                );
            }
            while (credits.hasNext()) {
                Object[] obj = (Object[]) credits.next();
                txn.createCredit (
                    (FinalAccount) obj[0], 
                    (BigDecimal) obj[1], 
                    null, layers[i]
                );
            }
        }
        txn.setJournal (journal);
        txn.setTimestamp (new Date());
        txn.setPostDate (end);
        deleteGLTransactions (journal, start, end);
        session.save (txn); // force post - no rule validations
        journal.setLockDate (null);
        return txn;
    }

    /**
     * @param journal the journal.
     * @param id txn id
     * @return GLTransaction or null
     * @throws GLException if user doesn't have READ permission on this journal.
     */
    public GLTransaction getTransaction (Journal journal, long id)
        throws HibernateException, GLException
    {
        GLTransaction txn = null;
        checkPermission (GLPermission.READ, journal);
        try {
            txn = (GLTransaction) 
                session.load (GLTransaction.class, new Long(id));
            if (!txn.getJournal().equals(journal))
                throw new GLException (
                    "The transaction does not belong to the specified journal"
                );
        } catch (ObjectNotFoundException e) {
            // okay to happen
        }
        return txn;
    }

    /**
     * @param journal the journal.
     * @param start date (inclusive).
     * @param end date (inclusive).
     * @param searchString optional search string
     * @param findByPostDate true to find by postDate, false to find by timestamp
     * @param pageNumber the page number
     * @param pageSize the page size
     * @return list of transactions
     * @throws GLException if user doesn't have READ permission on this journal.
     */
    public Criteria createFindTransactionsCriteria
        (Journal journal, Date start, Date end, String searchString,
     boolean findByPostDate, int pageNumber, int pageSize)
            throws HibernateException, GLException
    {
        int firstResult = 0;
        if (pageSize > 0 && pageNumber > 0)
            firstResult = pageSize * (pageNumber - 1);

        return createFindTransactionsCriteriaByRange(
                journal, start, end, searchString, findByPostDate, firstResult, pageSize
        );
    }

    /**
     * @param journal the journal.
     * @param start date (inclusive).
     * @param end date (inclusive).
     * @param searchString optional search string
     * @param findByPostDate true to find by postDate, false to find by timestamp
     * @param firstResult the first result
     * @param pageSize the page size
     * @return list of transactions
     * @throws GLException if user doesn't have READ permission on this journal.
     */
    public Criteria createFindTransactionsCriteriaByRange
        (Journal journal, Date start, Date end, String searchString,
     boolean findByPostDate, int firstResult, int pageSize)
            throws HibernateException, GLException
    {
        checkPermission (GLPermission.READ, journal);
        String dateField = findByPostDate ? "postDate" : "timestamp";
        if (findByPostDate) {
            if (start != null)
                start = Util.floor (start);
            if (end != null)
                end   = Util.ceil (end);
        }
        Criteria crit = session.createCriteria (GLTransaction.class)
                .add (Restrictions.eq ("journal", journal));

        if (start != null && start.equals (end))
            crit.add (Restrictions.eq (dateField, start));
        else {
            if (start != null)
                crit.add (Restrictions.ge (dateField, start));
            if (end != null)
                crit.add (Restrictions.le (dateField, end));
        }
        if (searchString != null)
            crit.add (Restrictions.like ("detail", "%" + searchString + "%"));

        if (pageSize > 0 && firstResult > 0) {
            crit.setMaxResults (pageSize);
            crit.setFirstResult (firstResult);
        }
        return crit;
    }

    /**
     * @param journal the journal.
     * @param start date (inclusive).
     * @param end date (inclusive).
     * @param searchString optional search string
     * @param findByPostDate true to find by postDate, false to find by timestamp
     * @param pageNumber the page number
     * @param pageSize the page size
     * @return list of transactions
     * @throws GLException if user doesn't have READ permission on this journal.
     */
    public List findTransactions
        (Journal journal, Date start, Date end, String searchString,
         boolean findByPostDate, int pageNumber, int pageSize)
        throws HibernateException, GLException
    {
        return createFindTransactionsCriteria
            (journal, start, end, searchString, findByPostDate,  pageNumber, pageSize).list();
    }

    /**
     * @param journal the journal.
     * @param start date (inclusive).
     * @param end date (inclusive).
     * @param searchString optional search string
     * @param findByPostDate true to find by postDate, false to find by timestamp
     * @return list of transactions
     * @throws GLException if user doesn't have READ permission on this journal.
     */
    public List findTransactions 
        (Journal journal, Date start, Date end, String searchString, boolean findByPostDate)
        throws HibernateException, GLException
    {
        return findTransactions (journal, start, end, searchString, findByPostDate, 0, 0);
    }

    /**
     * @param journal the journal.
     * @param start date (inclusive).
     * @param end date (inclusive).
     * @param searchString optional search string
     * @param findByPostDate true to find by postDate, false to find by timestamp
     * @return list of transactions' ids
     * @throws GLException if user doesn't have READ permission on this journal.
     */
    public List findTransactionsIds
        (Journal journal, Date start, Date end, String searchString,
         boolean findByPostDate, int pageNumber, int pageSize)
            throws HibernateException, GLException
    {
        checkPermission (GLPermission.READ, journal);
        String dateField = findByPostDate ? "postDate" : "timestamp";
        if (findByPostDate) {
            if (start != null)
                start = Util.floor (start);
            if (end != null)
                end   = Util.ceil (end);
        }
        Criteria crit = session.createCriteria (GLTransaction.class)
            .add (Restrictions.eq ("journal", journal));
        crit.setProjection(Projections.id());
        if (start != null && start.equals (end))
            crit.add (Restrictions.eq (dateField, start));
        else {
            if (start != null)
                crit.add (Restrictions.ge (dateField, start));
            if (end != null)
                crit.add (Restrictions.le (dateField, end));
        }
        if (searchString != null)
            crit.add (Restrictions.like ("detail", "%" + searchString + "%"));
        if (pageSize > 0 && pageNumber > 0) {
            crit.setMaxResults (pageSize);
            crit.setFirstResult (pageSize * (pageNumber - 1));
        }
        return crit.list();
    }

    /**
     * @param journal the journal.
     * @param start date (inclusive).
     * @param end date (inclusive).
     * @param searchString optional search string
     * @param findByPostDate true to find by postDate, false to find by timestamp
     * @return number of transactions
     * @throws GLException if user doesn't have READ permission on this journal.
     */
    public Long findTransactionsRowCount
        (Journal journal, Date start, Date end, String searchString, boolean findByPostDate)
            throws HibernateException, GLException
    {
        checkPermission (GLPermission.READ, journal);
        String dateField = findByPostDate ? "postDate" : "timestamp";
        if (findByPostDate) {
            if (start != null)
                start = Util.floor (start);
            if (end != null)
                end   = Util.ceil (end);
        }
        Criteria crit = session.createCriteria (GLTransaction.class)
            .add (Restrictions.eq ("journal", journal));
        crit.setProjection(Projections.rowCount());
        if (start != null && start.equals (end))
            crit.add (Restrictions.eq (dateField, start));
        else {
            if (start != null)
                crit.add (Restrictions.ge (dateField, start));
            if (end != null)
                crit.add (Restrictions.le (dateField, end));
        }
        if (searchString != null)
            crit.add (Restrictions.like ("detail", "%" + searchString + "%"));
        return (Long)crit.uniqueResult();
    }

    /**
     * @return user object associated with this session.
     */
    public GLUser getUser() {
        return user;
    }
    /**
     * Current Balance for account in a given journal.
     * @param journal the journal.
     * @param acct the account.
     * @return current balance.
     * @throws GLException if user doesn't have READ permission on this jounral.
     */
    public BigDecimal getBalance (Journal journal, Account acct) 
        throws HibernateException, GLException
    {
        return getBalances (journal, acct, null, true) [0];
    }
    /**
     * Current Balance for account in a given journal.
     * @param journal the journal.
     * @param acct the account.
     * @param layer the layers.
     * @return current balance.
     * @throws GLException if user doesn't have READ permission on this jounral.
     */
    public BigDecimal getBalance (Journal journal, Account acct, short layer) 
        throws HibernateException, GLException
    {
        return getBalances (journal, acct, null, true, new short[] { layer }, 0L) [0];
    }
    /**
     * Current Balance for account in a given journal.
     * @param journal the journal.
     * @param acct the account.
     * @param layers the layers.
     * @return current balance.
     * @throws GLException if user doesn't have READ permission on this jounral.
     */
    public BigDecimal getBalance (Journal journal, Account acct, short[] layers) 
        throws HibernateException, GLException
    {
        return getBalances (journal, acct, null, true, layers, 0L) [0];
    }
    /**
     * Current Balance for account in a given journal.
     * @param journal the journal.
     * @param acct the account.
     * @param layers comma separated list of layers
     * @return current balance.
     * @throws GLException if user doesn't have READ permission on this jounral.
     */
    public BigDecimal getBalance (Journal journal, Account acct, String layers) 
        throws HibernateException, GLException
    {
        return getBalances (journal, acct, null, true, toLayers(layers), 0L) [0];
    }
    /**
     * Balance for account in a given journal in a given date.
     * @param journal the journal.
     * @param acct the account.
     * @param date date (inclusive).
     * @return balance at given date.
     * @throws GLException if user doesn't have READ permission on this jounral.
     */
    public BigDecimal getBalance (Journal journal, Account acct, Date date) 
        throws HibernateException, GLException
    {
        return getBalances (journal, acct, date, true) [0];
    }
    /**
     * Balance for account in a given journal in a given date.
     * @param journal the journal.
     * @param acct the account.
     * @param date date (inclusive).
     * @param layer layer
     * @return balance at given date.
     * @throws GLException if user doesn't have READ permission on this jounral.
     */
    public BigDecimal getBalance (Journal journal, Account acct, Date date, short layer) 
        throws HibernateException, GLException
    {
        return getBalances (journal, acct, date, true, new short[] { layer }, 0L) [0];
    }
    /**
     * Balance for account in a given journal in a given date.
     * @param journal the journal.
     * @param acct the account.
     * @param date date (inclusive).
     * @param layers layers
     * @return balance at given date.
     * @throws GLException if user doesn't have READ permission on this jounral.
     */
    public BigDecimal getBalance (Journal journal, Account acct, Date date, short[] layers) 
        throws HibernateException, GLException
    {
        return getBalances (journal, acct, date, true, layers, 0L) [0];
    }
    /**
     * Get Both Balances at given date
     * @param journal the journal.
     * @param acct the account.
     * @param date date (inclusive).
     * @param inclusive either true or false
     * @return array of 2 BigDecimals with balance and entry count.
     * @throws GLException if user doesn't have READ permission on this jounral.
     */
    public BigDecimal[] getBalances 
        (Journal journal, Account acct, Date date, boolean inclusive) 
        throws HibernateException, GLException
    {
        return getBalances (journal, acct, date, inclusive, LAYER_ZERO, 0L);
    }

    /**
     * Get Both Balances at given date
     * @param journal the journal.
     * @param acct the account.
     * @param date date (inclusive).
     * @param inclusive either true or false
     * @param layers the layers
     * @param maxId maximum GLEntry ID to be considered in the query (if greater than zero)
     * @return array of 2 BigDecimals with balance and entry count.
     * @throws GLException if user doesn't have READ permission on this jounral.
     */
    public BigDecimal[] getBalances 
        (Journal journal, Account acct, Date date, boolean inclusive, short[] layers, long maxId) 
        throws HibernateException, GLException
    {
        checkPermission (GLPermission.READ, journal);
        BigDecimal balance[] = { ZERO, Z };
        if (acct.getChildren() != null) {
            if (acct.isChart()) {
                return getChartBalances 
                    (journal, (CompositeAccount) acct, date, inclusive, layers, maxId);
            }
            Iterator iter = acct.getChildren().iterator();
            while (iter.hasNext()) {
                Account a = (Account) iter.next();
                BigDecimal[] b = getBalances (journal, a, date, inclusive, layers, maxId);
                balance[0] = balance[0].add (b[0]);
                // session.evict (a); FIXME this conflicts with r251 (cascade=evict genearting a failed to lazily initialize a collection
            }
        }
        else if (acct.isFinalAccount()) {
            Criteria entryCrit = session.createCriteria (GLEntry.class)
                .add (Restrictions.eq ("account", acct))
                .add (Restrictions.in ("layer", toShortArray (layers)));
            if (maxId > 0L)
                entryCrit.add (Restrictions.le ("id", maxId));

            Criteria txnCrit = entryCrit.createCriteria ("transaction")
                    .add (Restrictions.eq ("journal", journal));
            if (date != null) {
                if (inclusive) {
                    txnCrit.add (Restrictions.lt ("postDate", Util.tomorrow (date)));
                }
                else {
                    date = Util.floor (date);
                    txnCrit.add (Restrictions.lt ("postDate", date));
                }
                Checkpoint chkp = getRecentCheckpoint (journal, acct, date, inclusive, layers);
                if (chkp != null) {
                    balance[0] = chkp.getBalance();
                    txnCrit.add (Restrictions.gt ("postDate", chkp.getDate()));
                }

            } else {
                BalanceCache bcache = getBalanceCache (journal, acct, layers);
                if (bcache != null) {
                    balance[0] = bcache.getBalance();
                    entryCrit.add (Restrictions.gt("id", bcache.getRef()));
                }
            }
            List l = txnCrit.list();
            balance[0] = applyEntries (balance[0], l);
            balance[1] = new BigDecimal (l.size()); // hint for checkpoint
        } 
        return balance;
    }

    /**
     * AccountDetail for date range
     * @param journal the journal.
     * @param acct the account.
     * @param start date (inclusive).
     * @param end date (inclusive).
     * @return Account detail for given period.
     * @throws GLException if user doesn't have READ permission on this jounral.
     */
    public AccountDetail getAccountDetail 
        (Journal journal, Account acct, Date start, Date end, short[] layers) 
        throws HibernateException, GLException
    {
        checkPermission (GLPermission.READ);
        start = Util.floor (start);
        end   = Util.ceil (end);

        Criteria crit = session.createCriteria (GLEntry.class);

        boolean hasChildren = false;
        if (acct instanceof CompositeAccount) {
            Disjunction dis = Restrictions.disjunction();
            for (Long l : getChildren (acct)) {
                hasChildren = true;
                dis.add (Restrictions.idEq(l));
            }
            if (hasChildren) {
                Criteria subCrit = crit.createCriteria(("account"));
                subCrit.add (dis);
            } 
        }
        if (!hasChildren) {
            crit.add (Restrictions.eq ("account", acct));
        }

        crit.add (Restrictions.in ("layer", toShortArray (layers)));
        crit = crit.createCriteria ("transaction")
            .add (Restrictions.eq ("journal", journal))
            .add (Restrictions.ge ("postDate", start))
            .add (Restrictions.le ("postDate", end));

        BigDecimal initialBalance[] = getBalances (journal, acct, start, false, layers, 0L);
        crit.addOrder (Order.asc ("postDate"));
        crit.addOrder (Order.asc ("timestamp"));
        crit.addOrder (Order.asc ("id"));
        List entries = crit.list();
        // BigDecimal finalBalance = applyEntries (initialBalance[0], entries);

        return new AccountDetail (
                journal, acct, 
                initialBalance[0],
                start, end, entries, layers );
    }
    /**
     * @param journal the journal.
     * @param acct the account.
     * @param date date (null for last checkpoint)
     * @param inclusive either true or false
     * @return Most recent check point for given date.
     * @throws GLException if user doesn't have CHECKPOINT permission on this jounral.
     */
    public Checkpoint getRecentCheckpoint
        (Journal journal, Account acct, Date date, boolean inclusive, short[] layers) 
        throws HibernateException, GLException
    {
        checkPermission (GLPermission.CHECKPOINT, journal);

        Criteria crit = session.createCriteria (Checkpoint.class)
            .add (Restrictions.eq ("journal", journal))
            .add (Restrictions.eq ("account", acct));

        if (layers != null)
           crit.add (Restrictions.eq ("layers", layersToString(layers)));

        if (date != null) {
           if (inclusive)
               crit.add (Restrictions.le ("date", date));
           else
               crit.add (Restrictions.lt ("date", date));
        }
        crit.addOrder (Order.desc ("date"));
        crit.setMaxResults (1); 
        return (Checkpoint) crit.uniqueResult();
    }
    public BalanceCache getBalanceCache
        (Journal journal, Account acct, short[] layers)
        throws HibernateException, GLException
    {
        checkPermission (GLPermission.CHECKPOINT, journal);
        Criteria crit = session.createCriteria (BalanceCache.class)
            .add (Restrictions.eq ("journal", journal))
            .add (Restrictions.eq ("account", acct));

        if (layers != null)
           crit.add (Restrictions.eq ("layers", layersToString(layers)));

        crit.addOrder (Order.desc ("ref"));
        crit.setMaxResults (1);
        return (BalanceCache) crit.uniqueResult();
    }
    

    /**
     * @param journal the Journal
     * @param acct the account
     * @param date checkpoint date (inclusive)
     * @param threshold minimum number of  GLEntries required to create a checkpoint
     * @throws GLException if user doesn't have CHECKPOINT permission on this jounral.
     */
    public void createCheckpoint 
        (Journal journal, Account acct, Date date, int threshold)
        throws HibernateException, GLException
    {
        createCheckpoint(journal, acct, date, threshold, LAYER_ZERO);
    }
    /**
     * @param journal the Journal
     * @param acct the account
     * @param date checkpoint date (inclusive)
     * @param layers taken into account in this checkpoint
     * @param threshold minimum number of  GLEntries required to create a checkpoint
     * @throws GLException if user doesn't have CHECKPOINT permission on this jounral.
     */
    public void createCheckpoint 
        (Journal journal, Account acct, Date date, int threshold, short[] layers) 
        throws HibernateException, GLException
    {
        if (date == null)
            throw new GLException ("Invalid checkpoint date");
        checkPermission (GLPermission.CHECKPOINT, journal);
        // Transaction tx = session.beginTransaction();
        session.buildLockRequest(LockOptions.UPGRADE).lock(journal);
        createCheckpoint0 (journal, acct, date, threshold, layers);
        // tx.commit();
    }
    public BigDecimal createBalanceCache
        (Journal journal, Account acct, short[] layers)
        throws HibernateException, GLException
    {
        return createBalanceCache (journal, acct, layers, getMaxGLEntryId());
    }
    public BigDecimal createBalanceCache
        (Journal journal, Account acct, short[] layers, long maxId)
        throws HibernateException, GLException
    {
        BigDecimal balance = null;
        if (acct instanceof CompositeAccount) {
            balance = ZERO;
            Iterator iter = ((CompositeAccount) acct).getChildren().iterator();
            while (iter.hasNext()) {
                Account a = (Account) iter.next();
                balance = balance.add (createBalanceCache (journal, a, layers, maxId));
            }
        }
        else if (acct instanceof FinalAccount) {
            lock (journal, acct);
            balance = getBalances (journal, acct, null, true, layers, maxId) [0];
            BalanceCache c = getBalanceCache (journal, acct, layers);
            if (c == null) {
                c = new BalanceCache ();
                c.setJournal (journal);
                c.setAccount (acct);
                c.setLayers (layersToString(layers));
            }
            if (maxId != c.getRef()) {
                c.setRef (maxId);
                c.setBalance (balance);
                session.saveOrUpdate (c);
            }
        }
        return balance;
    }

    /**
     * Lock a journal.
     * @param journal the journal.
     * @throws HibernateException on database errors.
     * @throws GLException if user doesn't have POST permission on this jounral.
     */
    public void lock (Journal journal) 
        throws HibernateException, GLException
    {
        checkPermission (GLPermission.POST, journal);
        session.buildLockRequest(LockOptions.UPGRADE).lock(journal);
    }
    /**
     * Lock an account in a given journal.
     * @param journal the journal.
     * @param acct the account.
     * @throws GLException if user doesn't have POST permission on this jounral.
     * @throws HibernateException on database errors.
     */
    public void lock (Journal journal, Account acct) 
        throws HibernateException, GLException
    {
        checkPermission (GLPermission.POST, journal);
        AccountLock lck = getLock (journal, acct);
    }
    
    /**
     * Open underlying Hibernate session.
     * @throws HibernateException
     */
    public synchronized Session open () throws HibernateException {
        return db.open();
    }
    /**
     * Close underlying Hibernate session.
     * @throws HibernateException
     */
    public synchronized void close () throws HibernateException {
        db.close();
    }
    /**
     * @return underlying Hibernate Session.
     */
    public Session session () {
        return db.session();
    }
    /**
     * Begin hibernate transaction.
     * @return new Transaction
     */
    public Transaction beginTransaction() throws HibernateException {
        return session.beginTransaction();
    }
    /**
     * Begin hibernate transaction.
     * @param timeout timeout in seconds
     * @return new Transaction
     */
    public Transaction beginTransaction(int timeout) throws HibernateException {
        Transaction tx = session.beginTransaction();
        if (timeout > 0)
            tx.setTimeout (timeout);
        return tx;
    }
    public GLUser getUser (String nick) throws HibernateException
    {
        return (GLUser) session.createCriteria (GLUser.class)
                .add (Restrictions.eq ("nick", nick))
                .uniqueResult();
    }
    /**
     * set a journal's lockDate
     * @param journal the Journal
     * @param lockDate the lock date.
     * @throws HibernateException on database errors.
     * @throws GLException if users doesn't have global READ permission.
     */
    public void setLockDate (Journal journal, Date lockDate) 
        throws GLException, HibernateException
    {
        checkPermission (GLPermission.WRITE, journal);
        // Transaction tx = session.beginTransaction();
        session.buildLockRequest(LockOptions.UPGRADE).lock(journal);
        journal.setLockDate (lockDate);
        // tx.commit();
    }

     public void deleteBalanceCache
        (Journal journal, Account account, short[] layers)
        throws HibernateException
    {
        StringBuilder sb = new StringBuilder ("delete BalanceCache where journal = :journal");
        if (account != null)
            sb.append (" and account = :account");
        if (layers != null)
            sb.append (" and layers = :layers");

        Query query = session.createQuery (sb.toString())
                .setEntity ("journal", journal);
        if (account != null)
            query.setEntity ("account", account);
        if (layers != null)
            query.setString ("layers", layersToString (layers));

        query.executeUpdate();
    }

    public GLTransactionGroup createGroup (String name, List<GLTransaction> transactions) {
        GLTransactionGroup group = new GLTransactionGroup (name);
        Set txns = new HashSet();
        for (GLTransaction t : transactions)
            txns.add (t);
        group.setTransactions(txns);
        session().save (group);
        return group;
    }

    public GLTransactionGroup findTransactionGroup (String name) {
        Criteria crit = session.createCriteria (GLTransactionGroup.class)
                .add (Restrictions.eq ("name", name));
        crit.setMaxResults (1);
        return (GLTransactionGroup) crit.uniqueResult();
    }

    public BigDecimal getBalance
            (Journal journal, Account acct, GLTransactionGroup group, short[] layers)
            throws HibernateException, GLException
    {
        checkPermission (GLPermission.READ, journal);
        BigDecimal balance = ZERO;
        for (GLTransaction transaction : (Set<GLTransaction>) group.getTransactions()) {
            if (transaction.getJournal().equals (journal)) {
                for (GLEntry entry : (List<GLEntry>) transaction.getEntries()) {
                    if (acct.equals (entry.getAccount()) && entry.hasLayers(layers)) {
                        if (entry.isIncrease ()) {
                            balance = balance.add (entry.getAmount());
                        }
                        else if (entry.isDecrease()) {
                            balance = balance.subtract (entry.getAmount());
                        }
                    }
                }
            }
        }
        return balance;
    }



    // -----------------------------------------------------------------------
    // PUBLIC HELPERS 
    // -----------------------------------------------------------------------
    public short[] toLayers (String layers) {
        StringTokenizer st = new StringTokenizer (layers, ", ");
        short[] sa = new short[st.countTokens()];
        for (int i=0; st.hasMoreTokens(); i++) 
            sa[i] = Short.parseShort (st.nextToken());
        return sa;
    }

    // -----------------------------------------------------------------------
    // PRIVATE METHODS
    // -----------------------------------------------------------------------
    private AccountLock getLock (Journal journal, Account acct)
        throws HibernateException
    {
        AccountLock key = new AccountLock (journal, acct);
        AccountLock lck = (AccountLock) session.get (AccountLock.class, key, LockOptions.UPGRADE);
        if (lck == null)
            session.buildLockRequest(LockOptions.UPGRADE).lock(journal); // need a journal level lock
        lck = (AccountLock) session.get (AccountLock.class, key, LockOptions.UPGRADE); // try again
        if (lck == null) {
            session.save (lck = key);
            session.flush();
        }
        return lck;
    }
    private void createCheckpoint0 
        (Journal journal, Account acct, Date date, int threshold, short[] layers) 
        throws HibernateException, GLException
    {
        if (acct instanceof CompositeAccount) {
            Iterator iter = ((CompositeAccount) acct).getChildren().iterator();
            while (iter.hasNext()) {
                Account a = (Account) iter.next();
                createCheckpoint0 (journal, a, date, threshold, layers);
            }
        }
        else if (acct instanceof FinalAccount) {
            Date sod = Util.floor (date);   // sod = start of day
            invalidateCheckpoints (journal, new Account[] { acct }, sod, sod, layers);
            BigDecimal b[] = getBalances (journal, acct, date, true, layers, 0L);
            if (b[1].intValue() >= threshold) {
                Checkpoint c = new Checkpoint ();
                c.setDate (date);
                c.setBalance (b[0]);
                c.setJournal (journal);
                c.setAccount (acct);
                c.setLayers (layersToString(layers));
                session.save (c);
            }
        } 
    }
    private Account[] getAccounts (GLTransaction txn) {
        List list = txn.getEntries();
        Account[] accounts = new Account[list.size()];
        Iterator iter = list.iterator();
        for (int i=0; iter.hasNext(); i++) {
            GLEntry entry = (GLEntry) iter.next();
            accounts[i] = entry.getAccount();
        }
        return accounts;
    }
    private List getAccountHierarchyIds (Account acct) 
        throws GLException
    {
        if (acct == null)
            throw new GLException ("Invalid entry - account is null");
        Account p = acct;
        List<Long> l = new ArrayList<Long>();
        while (p != null) {
            l.add (p.getId());
            p = p.getParent();
        }
        return l;
    }
    private void invalidateCheckpoints (GLTransaction txn)
        throws HibernateException 
    {
        Account[] accounts = getAccounts (txn);
        invalidateCheckpoints (
            txn.getJournal(), accounts, txn.getPostDate(), null, null
        );
    }
    private void invalidateCheckpoints
        (Journal journal, Account[] accounts, Date start, Date end, short[] layers) 
        throws HibernateException
    {
        Criteria crit = session.createCriteria (Checkpoint.class)
            .add (Restrictions.eq ("journal", journal));
        if (accounts.length > 0)
            crit = crit.add (Restrictions.in ("account", accounts));

        if (layers != null)
            crit.add (Restrictions.eq ("layers", layersToString(layers)));
        if (start.equals (end))
            crit.add (Restrictions.eq ("date", start));
        else {
            crit.add (Restrictions.ge ("date", start));
            if (end != null) {
                crit.add (Restrictions.le ("date", end));
            }
        }
        Iterator iter = crit.list().iterator();
        while (iter.hasNext()) {
            Checkpoint cp = (Checkpoint) iter.next();
            session.delete (cp);
        }
        session.flush();
    }
    private BigDecimal applyEntries (BigDecimal balance, List entries) 
        throws GLException
    {
        Iterator iter = entries.iterator();
        while (iter.hasNext()) {
            GLEntry entry = (GLEntry) iter.next();
            if (entry.isIncrease ()) {
                balance = balance.add (entry.getAmount());
            }
            else if (entry.isDecrease()) {
                balance = balance.subtract (entry.getAmount());
            }
            else {
                throw new GLException (
                    entry.toString() + " has invalid account type"
                );
            }
        }
        return balance;
    }
    private Object getRuleImpl (String clazz) throws GLException
    {
        Object impl = ruleCache.get (clazz);
        if (impl == null) {
            synchronized (ruleCache) {
                impl = ruleCache.get (clazz);
                if (impl == null) {
                    try {
                        Class cls = Class.forName (clazz);
                        impl = cls.newInstance();
                        ruleCache.put (clazz, impl);
                    } catch (Exception e) {
                        throw new GLException ("Invalid rule " + clazz, e);
                    }
                }
            }
        }
        return impl;
    }
    private void addRules
        (Map<String,Object> ruleMap, Journal journal, List acctHierarchy, int offset)
        throws HibernateException, GLException
    {
        Query q = session.createQuery (
            "from org.jpos.gl.RuleInfo where journal=:journal and account in (:accts) order by id"
        );
        q.setParameter ("journal", journal);
        q.setParameterList ("accts", acctHierarchy, new LongType());
        q.setCacheable (true);
        q.setCacheRegion ("rules");
        Iterator iter = q.iterate();

        while (iter.hasNext()) {
            RuleInfo ri  = (RuleInfo) iter.next();
            RuleEntry k  = new RuleEntry (ri, ri.getAccount());
            RuleEntry re = (RuleEntry) ruleMap.get (k.getKey());
            if (re == null) 
                ruleMap.put (k.getKey(), re = k);

            re.addOffset (offset);
        }
    }
    private void applyRules (GLTransaction txn, Collection rules) 
        throws HibernateException, GLException
    {
        Iterator iter = rules.iterator();
        while (iter.hasNext()) {
            RuleEntry re = (RuleEntry) iter.next();
            RuleInfo  ri = re.getRuleInfo();
            JournalRule rule = (JournalRule) getRuleImpl (ri.getClazz());
            rule.check (
                this, txn, ri.getParam(), re.getAccount(), 
                re.getOffsets(), ri.getLayerArray()
            );
        }
    }
    private Collection getRules (GLTransaction txn) 
        throws HibernateException, GLException
    {
        Map<String,Object> map = new LinkedHashMap<String,Object> ();
        Journal journal   = txn.getJournal();

        Query q = session.createQuery (
          "from org.jpos.gl.RuleInfo where journal=:journal and account is null order by id"
        );
        q.setParameter ("journal", journal);
        Iterator iter = q.list().iterator();
        while (iter.hasNext()) {
            RuleInfo  ri = (RuleInfo) iter.next();
            RuleEntry re = new RuleEntry (ri);
            map.put (re.getKey(), re);
        }
        iter = txn.getEntries().iterator();
        for (int i=0; iter.hasNext(); i++) {
            GLEntry entry = (GLEntry) iter.next();
            addRules (map, journal, 
                getAccountHierarchyIds (entry.getAccount()), i);
        }
        return map.values();
    }
    private BigDecimal[] getChartBalances 
        (Journal journal, CompositeAccount acct, Date date, boolean inclusive, short[] layers, long maxId)
        throws HibernateException, GLException
    {
        BigDecimal balance[] = { ZERO, ZERO };
        Iterator iter = ((CompositeAccount) acct).getChildren().iterator();
        while (iter.hasNext()) {
            Account a = (Account) iter.next();
            BigDecimal[] b = getBalances (journal, a, date, inclusive, layers, maxId);
            if (a.isDebit()) {
                balance[0] = balance[0].add (b[0]);
                balance[1] = balance[1].add (b[1]);
            } else if (a.isCredit()) {
                balance[0] = balance[0].subtract (b[0]);
                balance[1] = balance[1].subtract (b[1]);
            } else {
                throw new GLException ("Account " + a + " has wrong type");
            }
            // session.evict (a);  FIXME this conflicts with r251 (cascade=evict genearting a failed to lazily initialize a collection
        }
        return balance;
    }
    private Iterator findSummarizedGLEntries 
        (Journal journal, Date start, Date end, boolean credit, short layer)
        throws HibernateException, GLException
    {
        StringBuffer qs = new StringBuffer (
            "select entry.account, sum(entry.amount)" +
            " from org.jpos.gl.GLEntry entry," +
            " org.jpos.gl.GLTransaction txn" +
            " where txn.id = entry.transaction" +
            " and credit = :credit" +
            " and txn.journal = :journal" +
            " and entry.layer = :layer"
        );
        boolean equalDate = start.equals (end);
        if (equalDate) {
            qs.append (" and txn.postDate = :date");
        } else {
            qs.append (" and txn.postDate >= :start");
            qs.append (" and txn.postDate <= :end");
        }
        qs.append (" group by entry.account");
        Query q = session.createQuery (qs.toString());
        q.setLong ("journal", journal.getId());
        q.setParameter ("credit", credit ? "Y" : "N");
        q.setShort ("layer", layer);
        if (equalDate)
            q.setParameter ("date", start);
        else {
            q.setParameter ("start", start);
            q.setParameter ("end", end);
        }
        return q.iterate();
    }
    private void deleteGLTransactions (Journal journal, Date start, Date end)
        throws HibernateException, GLException
    {
        boolean equalDate = start.equals (end);

        StringBuffer qs = new StringBuffer (
            "from org.jpos.gl.GLTransaction where journal = :journal"
        );
        if (equalDate) {
            qs.append (" and postDate = :date");
        } else {
            qs.append (" and postDate >= :start");
            qs.append (" and postDate <= :endDate");
        }
        Query q = session.createQuery (qs.toString());
        q.setLong ("journal", journal.getId());
        if (equalDate)
            q.setParameter ("date", start);
        else {
            q.setParameter ("start", start);
            q.setParameter ("endDate", end);
        }
        ScrollableResults sr = q.scroll(ScrollMode.FORWARD_ONLY);
        while (sr.next()) {
            session.delete (sr.get(0));
        }
    }
    private static Short[] toShortArray (short[] i) {
        if (i == null)
            return new Short[0];
        Short[] sa = new Short[i.length];
        for (int j=0; j<i.length; j++)
            sa[j] = new Short(i[j]);
        return sa;
    }
    private String layersToString (short[] layers) {
        StringBuffer sb = new StringBuffer();
        Arrays.sort (layers);
        for (int i=0; i<layers.length; i++) {
            if (i>0)
                sb.append ('.');
            sb.append (Short.toString(layers[i]));
        }
        return sb.toString();
    }
    private long getMaxGLEntryId () {
        Criteria crit = session.createCriteria (GLEntry.class);
        crit.addOrder (Order.desc ("id"));
        crit.setMaxResults (1);
        GLEntry entry = (GLEntry) crit.uniqueResult();
        return entry != null ? entry.getId() : 0L;
    }
    private void recurseChildren (Account acct, List<Long> list) {
        for (Account a : acct.getChildren()) {
            if (a instanceof FinalAccount)
                list.add (a.getId());
            else recurseChildren (a, list);
        }
    }
    private List<Long> getChildren (Account acct) {
        List<Long> list = new ArrayList<Long>();
        recurseChildren (acct, list);
        return list;        
    }

    public String toString() {
        return super.toString() + "[DB=" + db.toString() + "]";
    }

    /*
    private void dumpRules (Collection rules) {
        log.warn ("--- rules ---");
        Iterator iter = rules.iterator();
        while (iter.hasNext()) {
            log.warn (iter.next());
        }
    }
    */
}
