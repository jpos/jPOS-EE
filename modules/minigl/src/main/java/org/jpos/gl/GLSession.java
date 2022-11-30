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

package org.jpos.gl;

import jakarta.persistence.criteria.*;
import org.hibernate.*;
import org.hibernate.exception.ConstraintViolationException;
import org.hibernate.query.Query;
import org.hibernate.transform.AliasToEntityMapResultTransformer;
import org.jpos.ee.DB;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.*;

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

    private long SAFE_WINDOW = 1000L;
    private boolean ignoreBalanceCache = false;
    private boolean strictAccountCodes = true;
    private NativeDialect nativeDialect = NativeDialect.ORM;

    private static final String POSTGRESQL_GET_BALANCES =
      "SELECT SUM(CASE WHEN entry.credit='N' THEN entry.amount ELSE -entry.amount end) AS balance,\n" +
      " COUNT(entry.id) AS count\n" +
      " FROM transentry AS entry\n";

    private static final String MYSQL_GET_BALANCES =
      "SELECT SUM(if(entry.credit='N',entry.amount,-entry.amount)) AS balance,\n" +
        "  COUNT(entry.id) AS count\n" +
        "  from transentry as entry\n";

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
        setDialect();
        if (username != null) {
            user = getUser (username);
            if (user == null) {
               close();
               throw new InvalidGLUserException(username);
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
        setDialect();
        if (username != null) {
            user = getUser (username);
            if (user == null) {
                if (autoClose)
                    close();
               throw new InvalidGLUserException(username);
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
                "User '" + user.getNick() + "' (" + user.getName() +
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
        Query<Account> q = session.createQuery (
            "from CompositeAccount  acct where code=:code and parent is null", Account.class
        );
        q.setParameter ("code", code);
        Iterator<Account> iter = q.list().iterator();
        return iter.hasNext() ? iter.next() : null;
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
        return session.createQuery(
            "from CompositeAccount  acct where parent is null", Account.class
        ).getResultList();
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
        Query<Account> q = session.createQuery (
            "from Account  acct where root=:chart and code=:code", Account.class
        );
        q.setParameter ("chart", chart);
        q.setParameter ("code", code);
        Iterator<Account> iter = q.list().iterator();
        return iter.hasNext() ? iter.next() : null;
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
        addAccount (parent, acct, true);
    }

    /**
     * Add account to parent.
     * Check permissions, parent's type and optional currency.
     *
     * @param parent parent account
     * @param acct account to add
     * @param fast true if we want a fast add that do not eagerly load all children
     * @throws HibernateException on error
     * @throws GLException if user doesn't have permissions, type mismatch or Duplicate Code
     */
    @SuppressWarnings("unchecked")
    public void addAccount (CompositeAccount parent, Account acct, boolean fast)
        throws HibernateException, GLException
    {
        checkPermission (GLPermission.WRITE);
        if (strictAccountCodes)
            validateAccountCode(parent, acct);

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
        try {
            session.save (acct);
            session.flush();
        } catch (ConstraintViolationException e) {
            e.fillInStackTrace();
            throw new GLException("Duplicate code", e);
        }
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
     * Add a Journal
     * Check permissions.
     *
     * @param j The new Journal
     * @throws HibernateException on error
     * @throws GLException if user doesn't have write permission
     */
    public void addJournal (Journal j) throws HibernateException, GLException
    {
        checkPermission (GLPermission.WRITE);
        session.save (j);
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
        Query<FinalAccount> q = session.createQuery (
            "from FinalAccount acct where root=:chart and code=:code", FinalAccount.class
        );
        q.setParameter ("chart", chart);
        q.setParameter ("code", code);
        Iterator<FinalAccount> iter = q.list().iterator();
        return iter.hasNext() ? iter.next() : null;
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
            "from FinalAccount acct where root=:chart"
        );
        q.setParameter ("chart", chart.getId());
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
                "from CompositeAccount acct where parent=:parent"
        );
        q.setParameter ("parent", parent);
        return (List<CompositeAccount>) q.list();
    }
    /**
     * @param parent parent account.
     * @return list of final accounts children of the parent account
     * @throws HibernateException on database errors.
     * @throws GLException if users doesn't have global READ permission.
     * @see GLPermission
     */
    public List<FinalAccount> getFinalChildren (Account parent) throws HibernateException, GLException {
        checkPermission (GLPermission.READ);
        Query q = session.createQuery(
                "from FinalAccount acct where parent=:parent"
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
            "from Account acct where root=:chart"
        );
        q.setParameter ("chart", chart.getId());
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
        Query<CompositeAccount> q = session.createQuery (
            "from CompositeAccount acct where root=:chart and code=:code", CompositeAccount.class
        );
        q.setParameter ("chart", chart);
        q.setParameter ("code", code);
        Iterator<CompositeAccount> iter = q.list().iterator();
        return iter.hasNext() ? iter.next() : null;
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
            "from Journal journal where name=:name"
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
            "from Journal acct order by chart"
        );
        return (List<Journal>) q.list();
    }

    /**
     * @return list of all currency ids
     * @see org.jpos.gl.Currency
     */
    public List<String> getCurrencyCodes() {
        CriteriaBuilder criteriaBuilder = db.session().getCriteriaBuilder();
        CriteriaQuery<String> query = criteriaBuilder.createQuery(String.class);
        Root<Currency> root = query.from(Currency.class);

        query = query
                .select(root.get("id"));

        return db.session().createQuery(query).getResultList();
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
            txn.setPostDate (Util.floor(txn.getTimestamp()));
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
    public Query<GLTransaction> createFindTransactionsCriteria
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
    public Query<GLTransaction> createFindTransactionsCriteriaByRange
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

        CriteriaBuilder criteriaBuilder = db.session().getCriteriaBuilder();
        CriteriaQuery<GLTransaction> query = criteriaBuilder.createQuery(GLTransaction.class);
        Root<GLTransaction> root = query.from(GLTransaction.class);

        List<Predicate> restrictions = new ArrayList<>();

        restrictions.add(criteriaBuilder.equal(root.get("journal"), journal));

        if (start != null && start.equals (end))
            restrictions.add(criteriaBuilder.equal(root.get(dateField), start));
        else {
            if (start != null)
                restrictions.add(criteriaBuilder.greaterThanOrEqualTo(root.get(dateField), start));
            if (end != null)
                restrictions.add(criteriaBuilder.lessThanOrEqualTo(root.get(dateField), end));
        }
        if (searchString != null)
            restrictions.add(criteriaBuilder.like(root.get("detail"), "%" + searchString + "%"));

        query.where(restrictions.toArray(new Predicate[] {}));

        Query<GLTransaction> toRet = db.session()
                .createQuery(query);

        if (pageSize > 0 && firstResult > 0) {
            toRet.setFirstResult(firstResult)
                    .setMaxResults(pageSize);
        }
        return toRet;
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
    public List<GLTransaction> findTransactions
        (Journal journal, Date start, Date end, String searchString,
         boolean findByPostDate, int pageNumber, int pageSize)
        throws HibernateException, GLException
    {
        return createFindTransactionsCriteria(journal, start, end, searchString, findByPostDate,  pageNumber, pageSize)
                .getResultList();
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
    public List<Long> findTransactionsIds
        (Journal journal, Date start, Date end, String searchString,
         boolean findByPostDate, int pageNumber, int pageSize)
            throws HibernateException, GLException {
        checkPermission(GLPermission.READ, journal);
        String dateField = findByPostDate ? "postDate" : "timestamp";
        if (findByPostDate) {
            if (start != null)
                start = Util.floor(start);
            if (end != null)
                end = Util.ceil(end);
        }

        CriteriaBuilder criteriaBuilder = db.session().getCriteriaBuilder();
        CriteriaQuery<Long> query = criteriaBuilder.createQuery(Long.class);
        Root<GLTransaction> root = query.from(GLTransaction.class);

        List<Predicate> predicates = new ArrayList<>();
        predicates.add(criteriaBuilder.equal(root.get("journal"), journal));

        if (start != null && start.equals(end))
            predicates.add(criteriaBuilder.equal(root.get(dateField), start));
        else{
            if (start != null)
                predicates.add(criteriaBuilder.greaterThanOrEqualTo(root.get(dateField), start));
            if (end != null)
                predicates.add(criteriaBuilder.lessThanOrEqualTo(root.get(dateField), end));
        }
        if (searchString != null)
            predicates.add(criteriaBuilder.equal(root.get("detail"), "%" + searchString + "%"));
        query = query.select(root.get("id"))
                .where(predicates.toArray(new Predicate[]{}));

        Query<Long> toRet = session.createQuery(query);
        if (pageSize > 0 && pageNumber > 0) {
            toRet = toRet.setMaxResults(pageSize)
                    .setFirstResult(pageSize * (pageNumber - 1));
        }
        return toRet.getResultList();
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
        CriteriaBuilder criteriaBuilder = db.session().getCriteriaBuilder();
        CriteriaQuery<Long> query = criteriaBuilder.createQuery(Long.class);
        Root<GLTransaction> root = query.from(GLTransaction.class);

        List<Predicate> predicates = new ArrayList<>();
        predicates.add(criteriaBuilder.equal(root.get("journal"), journal));

        if (start != null && start.equals(end))
            predicates.add(criteriaBuilder.equal(root.get(dateField), start));
        else{
            if (start != null)
                predicates.add(criteriaBuilder.greaterThanOrEqualTo(root.get(dateField), start));
            if (end != null)
                predicates.add(criteriaBuilder.lessThanOrEqualTo(root.get(dateField), end));
        }
        if (searchString != null)
            predicates.add(criteriaBuilder.equal(root.get("detail"), "%" + searchString + "%"));
        query = query
                .where(predicates.toArray(new Predicate[]{}))
                .select(criteriaBuilder.count(root.get("id")));

        return session.createQuery(query).getSingleResult();
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
     * @throws GLException if user doesn't have READ permission on this journal.
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
     * @throws GLException if user doesn't have READ permission on this journal.
     */
    public BigDecimal getBalance (Journal journal, Account acct, short layer)
        throws HibernateException, GLException
    {
        return getBalances (journal, acct, null, true, new short[] { layer }, 0L) [0];
    }
    /**
     * Current Balance for account in a given journal for a given set of layers.
     * @param journal the journal.
     * @param acct the account.
     * @param layers the layers.
     * @return current balance.
     * @throws GLException if user doesn't have READ permission on this journal.
     */
    public BigDecimal getBalance (Journal journal, Account acct, short[] layers)
        throws HibernateException, GLException
    {
        return getBalances (journal, acct, null, true, layers, 0L) [0];
    }

    /**
     * Minimum Balance for account in a given journal for a given set of layers
     * @param journal the journal.
     * @param acct the account.
     * @param layers set of layers
     * @return minimum balance among given layer sets
     * @throws GLException if user doesn't have READ permission on this journal.
     */
    public BigDecimal getMinBalance (Journal journal, Account acct, short[]... layers)
      throws HibernateException, GLException
    {
        BigDecimal minBalance = null;
        for (short[] layer : layers) {
            BigDecimal bd = getBalance (journal, acct, layer);
            if (minBalance == null || bd.compareTo(minBalance) < 0)
                minBalance = bd;
        }
        return minBalance == null ? ZERO : minBalance;
    }

    /**
     * Maximum Balance for account in a given journal for a given set of layers
     * @param journal the journal.
     * @param acct the account.
     * @param layers set of layers
     * @return maximum balance among given layer sets
     * @throws GLException if user doesn't have READ permission on this journal.
     */
    public BigDecimal getMaxBalance (Journal journal, Account acct, short[]... layers)
      throws HibernateException, GLException
    {
        BigDecimal maxBalance = null;
        for (short[] layer : layers) {
            BigDecimal bd = getBalance (journal, acct, layer);
            if (maxBalance == null || bd.compareTo(maxBalance) > 0)
                maxBalance = bd;
        }
        return maxBalance == null ? ZERO : maxBalance;
    }

    /**
     * Current Balance for account in a given journal.
     * @param journal the journal.
     * @param acct the account.
     * @param layers comma separated list of layers
     * @return current balance.
     * @throws GLException if user doesn't have READ permission on this journal.
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
     * @throws GLException if user doesn't have READ permission on this journal.
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
     * @throws GLException if user doesn't have READ permission on this journal.
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
     * @throws GLException if user doesn't have READ permission on this journal.
     */
    public BigDecimal getBalance (Journal journal, Account acct, Date date, short[] layers)
        throws HibernateException, GLException
    {
        return getBalances (journal, acct, date, true, layers, 0L) [0];
    }
    /**
     * Balance for account in a given journal in a given date.
     * @param journal the journal.
     * @param acct the account.
     * @param date date (inclusive).
     * @param layers comma separated list of layers
     * @return balance at given date.
     * @throws GLException if user doesn't have READ permission on this journal.
     */
    public BigDecimal getBalance (Journal journal, Account acct, Date date, String layers)
        throws HibernateException, GLException
    {
        return getBalances (journal, acct, date, true, toLayers(layers), 0L) [0];
    }
    /**
     * Get Both Balances at given date
     * @param journal the journal.
     * @param acct the account.
     * @param date date (inclusive).
     * @param inclusive either true or false
     * @return array of 2 BigDecimals with balance and entry count.
     * @throws GLException if user doesn't have READ permission on this journal.
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
     * @throws GLException if user doesn't have READ permission on this journal.
     */
    public BigDecimal[] getBalancesORM
        (Journal journal, Account acct, Date date, boolean inclusive, short[] layers, long maxId)
        throws HibernateException, GLException
    {
        checkPermission (GLPermission.READ, journal);
        BigDecimal[] balance = { ZERO, Z };
        short[] layersCopy = Arrays.copyOf(layers,layers.length);
        if (acct.getChildren() != null) {
            if (acct.isChart()) {
                return getChartBalances
                    (journal, (CompositeAccount) acct, date, inclusive, layersCopy, maxId);
            }
            for (Account a : acct.getChildren()) {
                BigDecimal[] b = getBalancesORM(journal, a, date, inclusive, layersCopy, maxId);
                balance[0] = balance[0].add(b[0]);
                // session.evict (a); FIXME this conflicts with r251 (cascade=evict generating a failed to lazily initialize a collection
            }
        }
        else if (acct.isFinalAccount()) {

            CriteriaBuilder criteriaBuilder = db.session().getCriteriaBuilder();
            CriteriaQuery<GLEntry> query = criteriaBuilder.createQuery(GLEntry.class);
            Root<GLEntry> root = query.from(GLEntry.class);

            List<Predicate> predicates = new ArrayList<>();
            predicates.add(criteriaBuilder.equal(root.get("account"), acct));
            predicates.add(root.get("layer").in(Arrays.asList(toShortArray(layersCopy))));

            if (maxId > 0L)
                predicates.add(criteriaBuilder.lessThanOrEqualTo(root.get("id"), maxId));

            Join<GLEntry, GLTransaction> joinTransaction = root.join("transaction");
            predicates.add(criteriaBuilder.equal(joinTransaction.get("journal"), journal));
            if (date != null) {
                if (inclusive) {
                    predicates.add(criteriaBuilder.lessThan(joinTransaction.get("postDate"), Util.tomorrow(date)));
                }
                else {
                    date = Util.floor(date);
                    predicates.add(criteriaBuilder.lessThan(joinTransaction.get("postDate"), date));
                }
                Checkpoint chkp = getRecentCheckpoint (journal, acct, date, inclusive, layersCopy);
                if (chkp != null) {
                    balance[0] = chkp.getBalance();
                    predicates.add(criteriaBuilder.greaterThanOrEqualTo(joinTransaction.get("postDate"), chkp.getDate()));
                }
            } else if (!ignoreBalanceCache) {
                BalanceCache bcache = getBalanceCache (journal, acct, layersCopy);
                if (bcache != null && (maxId == 0 || bcache.getRef() <= maxId)) {
                    balance[0] = bcache.getBalance();
                    predicates.add(criteriaBuilder.greaterThan(joinTransaction.get("id"), bcache.getRef()));
                }
            }
            query = query.where(predicates.toArray(new Predicate[] {}));
            List<GLEntry> l = session.createQuery(query).getResultList();
            balance[0] = applyEntries (balance[0], l);
            balance[1] = new BigDecimal (l.size()); // hint for checkpoint
        }
        return balance;
    }

    /**
     * Get Both Balances at given date.
     *
     * IMPORTANT NOTE: This function uses different implementations depending on the
     * dialect of the SQL server in use.  By default, native queries are generated for
     * the MySQL and PostgreSQL dialect, with other dialects using getBalancesORM instead.
     *
     * Regarding balances of composite accounts - getBalancesORM knows that a given account
     * is a child of a given parent correctly using the acct.parent reference, whereas the
     * native queries in getBalances cut some corners in order to take advantage of the
     * database index, it assumes that the parent shares the acct.code prefix.
     *
     * In such cases, if MySQL or PostgreSQL native queries are used for balance calculations,
     * accounts not following this convention are excluded from the results resulting in the
     * wrong balance.  This was the reason for adding stricter checks of account codes to
     * Import.createCharts and GLSession.addAccount.
     *
     * It's possible to force the use of getBalancesORM by calling `GLSession.forceDialect`
     *
     * @param journal the journal.
     * @param acct the account.
     * @param date date (inclusive).
     * @param inclusive either true or false
     * @param layers the layers
     * @param maxId maximum GLEntry ID to be considered in the query (if greater than zero)
     * @return array of 2 BigDecimals with balance and entry count.
     * @throws GLException if user doesn't have READ permission on this journal.
     */
    public BigDecimal[] getBalances
    (Journal journal, Account acct, Date date, boolean inclusive, short[] layers, long maxId)
      throws HibernateException, GLException
    {
        return getBalances0(journal, acct, date, inclusive, layers, maxId, null);
    }

    private BigDecimal[] getBalances0
      (Journal journal, Account acct, Date date, boolean inclusive, short[] layers, long maxId, BalanceCache bcache)
      throws HibernateException, GLException
    {
        StringBuilder select;
        switch (nativeDialect) {
            case MYSQL:
                select = new StringBuilder(MYSQL_GET_BALANCES);
                break;
            case POSTGRESQL:
                select = new StringBuilder(POSTGRESQL_GET_BALANCES);
                break;
            default:
                return getBalancesORM(journal, acct, date, inclusive, layers, maxId);
        }

        checkPermission (GLPermission.READ, journal);
        BigDecimal balance[] = { ZERO, Z };
        select.append(", transacc as txn\n");

        if (date == null && !ignoreBalanceCache) {
            short[] layersCopy = Arrays.copyOf(layers,layers.length);
            if (bcache == null)
                bcache = getBalanceCache(journal, acct, layersCopy);
            if (maxId > 0 && bcache != null && bcache.getRef() > maxId)
                bcache = null; // ignore bcache 'in the future'
        }
        if (!acct.isFinalAccount()) {
            select.append(", acct as acct");
        }
        StringBuffer qs = new StringBuffer();
        if (maxId > 0L) {
            where(qs, "entry.id <= :maxId");
        }
        if (bcache != null) {
            where(qs, "entry.id > :bcache_ref");
        }
        if (acct.isFinalAccount()) {
            where(qs, "entry.account = :acctId");
        }
        else if (acct.isChart()) {
            where(qs, "entry.account = acct.id");
            where(qs, "acct.root = :acctId");
        } else {
            where(qs, "entry.account = acct.id");
            where(qs, "acct.code like :code");
        }
        where(qs, "(entry.transaction = txn.id and txn.journal = :journal)\n");
        if  (date != null) {
            where(qs, "txn.postDate < :date");
        }
        where(qs, "entry.layer in");
        qs.append("  (");
        qs.append(layersToString(layers, ','));
        qs.append(')');
        select.append(qs);

        Query q = session.createNativeQuery(select.toString());
        q.setResultTransformer(AliasToEntityMapResultTransformer.INSTANCE);
        if (acct.isFinalAccount() || acct.isChart())
            q.setParameter("acctId", acct.getId());
        else {
            q.setParameter("code", acct.getCode() + "%");
        }
        q.setParameter("journal", journal.getId());
        if (date != null) {
            q.setParameter("date", inclusive ? Util.tomorrow(date) : date);
        }
        if (maxId > 0L)
            q.setParameter("maxId", maxId);
        if (bcache != null)
            q.setParameter("bcache_ref", bcache.getRef());

        List<Map<String,Object>> result = q.list();
        if (result.size() == 1) {
            Map m = result.get(0);
            BigDecimal bd = (BigDecimal) m.get("balance");
            if (bd != null) {
                balance[0] = bd;
                balance[1] = new BigDecimal((BigInteger) m.get("count"));
                if (acct.isCredit())
                    balance[0] = balance[0].negate();
            }
        }
        if (bcache != null) {
            balance[0] = balance[0].add(bcache.getBalance());
        }
        return balance;
    }

    public List<FinalAccount> getDeepFinalChildren(Account acct) throws HibernateException, GLException {
        checkPermission (GLPermission.READ);
        return getDeepFinalChildren0(acct);
    }


    private StringBuffer where (StringBuffer sb, String clausse) {
        sb.append(sb.length() == 0 ? " WHERE " : " AND ");
        sb.append(clausse);
        sb.append('\n');
        return sb;
    }
    private String layersToString (short[] layers, char sep) {
        StringBuffer sb = new StringBuffer();
        Arrays.sort (layers);
        for (int i=0; i<layers.length; i++) {
            if (i>0)
                sb.append (sep);
            sb.append (layers[i]);
        }
        return sb.toString();
    }
    private String layersToString (short[] layers) {
        return layersToString(layers, '.');
    }

    /**
     * AccountDetail for date range
     * @param journal the journal.
     * @param acct the account.
     * @param start date (inclusive).
     * @param end date (inclusive).
     * @param layers array of the layers included.
     * @param ascendingOrder boolean.
     * @param maxResults int.
     * @return Account detail for given period.
     * @throws GLException if user doesn't have READ permission on this journal.
     */
    public AccountDetail getAccountDetail
        (Journal journal, Account acct, Date start, Date end, short[] layers, boolean ascendingOrder, int maxResults)
        throws HibernateException, GLException
    {
        checkPermission (GLPermission.READ);

        CriteriaBuilder criteriaBuilder = db.session().getCriteriaBuilder();
        CriteriaQuery<GLEntry> query = criteriaBuilder.createQuery(GLEntry.class);
        Root<GLEntry> root = query.from(GLEntry.class);

        query = query
                .select(root);


        List<Predicate> ands = new ArrayList<>();
        boolean hasChildren = false;
        if (acct.isCompositeAccount()) {
            List<Predicate> disjuntions = new ArrayList<>();
            List<Long> childrenIds = getChildren(acct);
            hasChildren = !childrenIds.isEmpty();

            if (!childrenIds.isEmpty()) {
                Join<GLEntry, Account> joinAccount = root.join("account");
                for (Long l : getChildren (acct)) {
                    disjuntions.add(criteriaBuilder.equal(joinAccount.get("id"), l));
                }
                ands.add(criteriaBuilder.or(disjuntions.toArray(new Predicate[]{})));
            }
        }
        if (!hasChildren) {
            ands.add(criteriaBuilder.equal(root.get("account"), acct));
        }

        ands.add(root.get("layer").in(Arrays.asList(toShortArray(layers))));

        Join<GLEntry, GLTransaction> transaction = root.join("transaction");
        ands.add(criteriaBuilder.equal(transaction.get("journal"), journal));

        if (start != null || (start == null && ascendingOrder)) {
            start = Util.floor(start);
            ands.add(criteriaBuilder.greaterThanOrEqualTo(transaction.get("postDate"), start));
        }
        if (end != null || (end == null && ascendingOrder)) {
            end = Util.ceil(end);
            ands.add(criteriaBuilder.lessThanOrEqualTo(transaction.get("postDate"), end));
        }


        long maxEntry = 0L;
        BigDecimal[] initialBalance;
        boolean inclusive = false;
        if (ascendingOrder) {
            query.orderBy(
                    criteriaBuilder.asc(transaction.get("postDate")),
                    criteriaBuilder.asc(transaction.get("timestamp")),
                    criteriaBuilder.asc(transaction.get("id"))
            );
        } else {
            inclusive = true;
            query.orderBy(
                    criteriaBuilder.desc(transaction.get("postDate")),
                    criteriaBuilder.desc(transaction.get("timestamp")),
                    criteriaBuilder.desc(transaction.get("id"))
            );
        }

        Query<GLEntry> finalQuery = session.createQuery(query.where(ands.toArray(new Predicate[]{})));
        if (maxResults > 0) finalQuery = finalQuery.setMaxResults(maxResults);

        List <GLEntry>  entries = finalQuery.getResultList();
        if (inclusive && !entries.isEmpty()) {
            maxEntry = entries.get(0).getId();
        }

        initialBalance = getBalances(journal, acct, end, inclusive, layers, maxEntry);


        return new AccountDetail(journal, acct, initialBalance[0], start, end, entries, layers, ascendingOrder);
    }


    /**
     * AccountDetail for date range
     * @param journal the journal.
     * @param acct the account.
     * @param start date (inclusive).
     * @param end date (inclusive).
     * @return Account detail for given period.
     * @throws GLException if user doesn't have READ permission on this journal.
     */
    public AccountDetail getAccountDetail
    (Journal journal, Account acct, Date start, Date end, short[] layers)
            throws HibernateException, GLException
    {
        return getAccountDetail(journal, acct, start, end, layers, true, 0);
    }

    /**
     * AccountDetail for date range
     * @param journal the journal.
     * @param acct the account.
     * @param layers layer set
     * @param maxResults number of entries in mini statement
     * @return Account detail for given period.
     * @throws GLException if user doesn't have READ permission on this journal.
     */
    public AccountDetail getMiniStatement
    (Journal journal, Account acct, short[] layers, int maxResults)
            throws HibernateException, GLException
    {
        return getAccountDetail(journal, acct, null, null, layers, false, maxResults);
    }


    /**
     * @param journal the journal.
     * @param acct the account.
     * @param date date (null for last checkpoint)
     * @param inclusive either true or false
     * @return Most recent check point for given date.
     * @throws GLException if user doesn't have CHECKPOINT permission on this journal.
     */
    public Checkpoint getRecentCheckpoint
        (Journal journal, Account acct, Date date, boolean inclusive, short[] layers)
        throws HibernateException, GLException
    {
        checkPermission (GLPermission.CHECKPOINT, journal);

        String qryString= "from org.jpos.gl.Checkpoint where journal = :journal and account = :account "
                + ( (layers == null) ? "" : "and layers = :layers " )
                + ( (date == null) ? "" :
                    inclusive ? " and date <= :date " : " and date < :date ")
                + "order by date desc";

        org.hibernate.query.Query<Checkpoint> q= session.createQuery(qryString, Checkpoint.class);
        q.setParameter("journal", journal);
        q.setParameter("account", acct);
        if (layers != null)
            q.setParameter("layers", layersToString(layers));
        if (date != null)
            q.setParameter("date", date);

        q.setMaxResults(1);
        //q.setReadOnly(true);

        return q.uniqueResult();
    }


    public BalanceCache getBalanceCache
        (Journal journal, Account acct, short[] layers)
        throws HibernateException, GLException
    {
        checkPermission (GLPermission.CHECKPOINT, journal);
                CriteriaBuilder criteriaBuilder = db.session().getCriteriaBuilder();
        CriteriaQuery<BalanceCache> query = criteriaBuilder.createQuery(BalanceCache.class);
        Root<BalanceCache> root = query.from(BalanceCache.class);

        query = query
                .select(root);

        List<Predicate> ands = new ArrayList<>();
        ands.add(criteriaBuilder.equal(root.get("journal"), journal));
        ands.add(criteriaBuilder.equal(root.get("account"), acct));

        if (layers != null)
            ands.add(criteriaBuilder.equal(root.get("layers"), layersToString(layers)));

        query.where(ands.toArray(new Predicate[]{}));
        query.orderBy(criteriaBuilder.desc(root.get("ref")));

        List<BalanceCache> caches = session.createQuery(query)
                        .setMaxResults(1)
                        .getResultList();
        if (caches.isEmpty()) return null;
        return caches.get(0);
    }


    /**
     * @param journal the Journal
     * @param acct the account
     * @param date checkpoint date (inclusive)
     * @param threshold minimum number of  GLEntries required to create a checkpoint
     * @throws GLException if user doesn't have CHECKPOINT permission on this journal.
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
     * @throws GLException if user doesn't have CHECKPOINT permission on this journal.
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
        return createBalanceCache (journal, acct, layers, getSafeMaxGLEntryId());
    }
    private BigDecimal createBalanceCache
        (Journal journal, Account acct, short[] layers, long maxId)
        throws HibernateException, GLException
    {
        BigDecimal balance;
        BalanceCache bc = null;
        if (acct.isCompositeAccount()) {
            balance = ZERO;
            for (Account a : acct.getChildren()) {
                balance = balance.add(createBalanceCache(journal, a, layers, maxId));
            }
        }
        else if (acct.isFinalAccount())
            bc = createFinalBalanceCache(journal, (FinalAccount) acct, layers, maxId);

        return getBalances0 (journal, acct, null, true, layers, 0L, bc) [0];
    }

    public BalanceCache createFinalBalanceCache (Journal journal, FinalAccount acct, short[] layers) throws GLException {
        return createFinalBalanceCache(journal, acct, layers, getSafeMaxGLEntryId());
    }

    private BalanceCache createFinalBalanceCache (Journal journal, FinalAccount acct, short[] layers, long maxId) throws GLException {
        lock (journal, acct);
        BalanceCache c = getBalanceCache (journal, acct, layers);
        BigDecimal balance = getBalances0 (journal, acct, null, true, layers, maxId, c) [0];
        if (c == null) {
            c = new BalanceCache ();
            c.setJournal (journal);
            c.setAccount (acct);
            c.setLayers (layersToString(layers));
            c.setBalance(ZERO);     //Ensure we load a balance in the cache
                                    //if maxId > 0 then the cache includes some entries, and
                                    // we set the balance in the next if, before saving it.
        }
        if (maxId != c.getRef()) {
            c.setRef (maxId);
            c.setBalance (balance);
            session.saveOrUpdate (c);
        }
        return c;
    }

    /**
     * Lock a journal.
     * @param journal the journal.
     * @throws HibernateException on database errors.
     * @throws GLException if user doesn't have POST permission on this journal.
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
     * @throws GLException if user doesn't have POST permission on this journal.
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
        CriteriaBuilder criteriaBuilder = db.session().getCriteriaBuilder();
        CriteriaQuery<GLUser> query = criteriaBuilder.createQuery(GLUser.class);
        Root<GLUser> root = query.from(GLUser.class);

        query = query
                .where(criteriaBuilder.equal(root.get("nick"), nick))
                .select(root);

        return session.createQuery(query).uniqueResult();
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
                .setParameter ("journal", journal);
        if (account != null)
            query.setParameter ("account", account);
        if (layers != null)
            query.setParameter ("layers", layersToString (layers));

        query.executeUpdate();
    }

    public GLTransactionGroup createGroup (String name, List<GLTransaction> transactions) {
        GLTransactionGroup group = new GLTransactionGroup (name);
        Set<GLTransaction> txns = new HashSet<>(transactions);
        group.setTransactions(txns);
        session().save(group);
        return group;
    }

    public GLTransactionGroup findTransactionGroup(String name) {
        CriteriaBuilder criteriaBuilder = db.session().getCriteriaBuilder();
        CriteriaQuery<GLTransactionGroup> query = criteriaBuilder.createQuery(GLTransactionGroup.class);
        Root<GLTransactionGroup> root = query.from(GLTransactionGroup.class);

        query = query
                .where(criteriaBuilder.equal(root.get("name"), name))
                .select(root);

        return db.session().createQuery(query)
                .setMaxResults(1)
                .getSingleResult();
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

    public boolean isIgnoreBalanceCache() {
        return ignoreBalanceCache;
    }

    public void setIgnoreBalanceCache(boolean ignoreBalanceCache) {
        this.ignoreBalanceCache = ignoreBalanceCache;
    }

    public boolean isEnforcingStrictAccountCodes() { return strictAccountCodes; }

    public void setEnforceStrictAccountCodes(boolean strictAccountCodes) {
        this.strictAccountCodes = strictAccountCodes;
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
        if (acct.isCompositeAccount()) {
            Iterator iter = ((CompositeAccount) acct).getChildren().iterator();
            while (iter.hasNext()) {
                Account a = (Account) iter.next();
                createCheckpoint0 (journal, a, date, threshold, layers);
            }
        }
        else if (acct.isFinalAccount()) {
            Date sod = Util.floor (date);   // sod = start of day
            invalidateCheckpoints (journal, new Account[] { acct }, sod, sod, layers);
            BigDecimal b[] = getBalances (journal, acct, sod, false, layers, 0L);
            if (b[1].intValue() >= threshold) {
                Checkpoint c = new Checkpoint ();
                c.setDate (sod);
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
    private List<Long> getAccountHierarchyIds (Account acct)
        throws GLException
    {
        if (acct == null)
            throw new GLException ("Invalid entry - account is null");
        Account p = acct;
        List<Long> l = new ArrayList<>();
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
        CriteriaBuilder criteriaBuilder = db.session().getCriteriaBuilder();
        CriteriaQuery<Checkpoint> query = criteriaBuilder.createQuery(Checkpoint.class);
        Root<Checkpoint> root = query.from(Checkpoint.class);

        List<Predicate> predicates = new ArrayList<>();
        predicates.add(criteriaBuilder.equal(root.get("journal"), journal));

        query = query.select(root);

        if (accounts.length > 0)
            predicates.add(root.get("account").in(Arrays.asList(accounts)));

        if (layers != null)
            predicates.add(criteriaBuilder.equal(root.get("layers"), layersToString(layers)));
        if (start.equals (end))
            predicates.add(criteriaBuilder.equal(root.get("date"), start));
        else {
            predicates.add(criteriaBuilder.greaterThanOrEqualTo(root.get("date"), start));
            if (end != null) {
                predicates.add(criteriaBuilder.greaterThanOrEqualTo(root.get("date"), end));
            }
        }
        List<Checkpoint> checkPoints = session
                .createQuery(query.where(predicates.toArray(new Predicate[]{})))
                .getResultList();
        for (Checkpoint checkpoint: checkPoints) {
            session.delete (checkpoint);
        }
    }
    private BigDecimal applyEntries (BigDecimal balance, List<GLEntry> entries)
        throws GLException
    {
        for(GLEntry entry: entries) {
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
        (Map<String,Object> ruleMap, Journal journal, List<Long> acctHierarchy, int offset)
        throws HibernateException
    {
        Query<RuleInfo> q = session.createQuery (
            "from org.jpos.gl.RuleInfo where journal=:journal and account in (:accts) order by id",
                RuleInfo.class
        );
        q.setParameter ("journal", journal);
        q.setParameterList ("accts", acctHierarchy, Long.class);
        q.setCacheable (true);
        q.setCacheRegion ("rules");

        for (RuleInfo ri: q.list()) {
            RuleEntry k  = new RuleEntry (ri, ri.getAccount());
            RuleEntry re = (RuleEntry) ruleMap.get (k.getKey());
            if (re == null)
                ruleMap.put (k.getKey(), re = k);

            re.addOffset (offset);
        }
    }
    private void applyRules (GLTransaction txn, Collection<RuleEntry> rules)
        throws HibernateException, GLException
    {
        for (RuleEntry re: rules) {
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
        Map<String,Object> map = new LinkedHashMap<> ();
        Journal journal   = txn.getJournal();

        Query<RuleInfo> q = session.createQuery (
          "from org.jpos.gl.RuleInfo where journal=:journal and account is null order by id", RuleInfo.class
        );
        q.setParameter ("journal", journal);
        for (RuleInfo ri: q.getResultList()) {
            RuleEntry re = new RuleEntry (ri);
            map.put (re.getKey(), re);
        }
        for (int i = 0; i < txn.getEntries().size(); i++) {
            GLEntry entry = txn.getEntries().get(i);
            addRules(map, journal, getAccountHierarchyIds(entry.getAccount()), i);
        }
        return map.values();
    }
    private BigDecimal[] getChartBalances
        (Journal journal, CompositeAccount acct, Date date, boolean inclusive, short[] layers, long maxId)
        throws HibernateException, GLException
    {
        BigDecimal balance[] = { ZERO, ZERO };
        Iterator iter = (acct).getChildren().iterator();
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
                // We allow undefined type on composite accounts now (i.e. "order" accounts).
                // We don't add children balances.
                // throw new GLException ("Account " + a + " has wrong type");
            }
            // session.evict (a);  FIXME this conflicts with r251 (cascade=evict genearting a failed to lazily initialize a collection
        }
        return balance;
    }
    private Iterator findSummarizedGLEntries
        (Journal journal, Date start, Date end, boolean credit, short layer)
        throws HibernateException
    {
        StringBuilder qs = new StringBuilder (
            "select entry.account, sum(entry.amount)" +
            " from GLEntry entry join entry.transaction txn" +
            " where credit = :credit" +
            "   and txn.journal = :journal" +
            "   and entry.layer = :layer"
        );
        boolean equalDate = start.equals (end);
        if (equalDate) {
            qs.append (" and txn.postDate = :date");
        } else {
            qs.append (" and txn.postDate >= :start");
            qs.append (" and txn.postDate <= :end");
        }
        qs.append (" group by entry.account");
        Query q = session.createQuery(qs.toString());
        q.setParameter ("journal", journal);
        q.setParameter ("credit", credit);
        q.setParameter ("layer", layer);
        if (equalDate)
            q.setParameter ("date", start);
        else {
            q.setParameter ("start", start);
            q.setParameter ("end", end);
        }
        return q.list().iterator();
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
        Query<GLTransaction> q = session.createQuery (qs.toString(), GLTransaction.class);
        q.setParameter ("journal", journal);
        if (equalDate)
            q.setParameter ("date", start);
        else {
            q.setParameter ("start", start);
            q.setParameter ("endDate", end);
        }
        try (ScrollableResults<GLTransaction> sr = q.scroll(ScrollMode.FORWARD_ONLY)) {
            while (sr.next()) {
                session.delete(sr.get());
            }
        }
    }

    private static Short[] toShortArray(short[] i) {
        if (i == null)
            return new Short[0];
        Short[] sa = new Short[i.length];
        for (int j = 0; j < i.length; j++)
            sa[j] = i[j];
        return sa;
    }

    private long getMaxGLEntryId () {

        CriteriaBuilder criteriaBuilder = db.session().getCriteriaBuilder();
        CriteriaQuery<Long> query = criteriaBuilder.createQuery(Long.class);
        Root<GLEntry> root = query.from(GLEntry.class);

        query = query
                .orderBy(criteriaBuilder.desc(root.get("id")))
                .select(root.get("id"));

        return db.session()
                .createQuery(query)
                .setMaxResults(1)
                .getSingleResult();
    }

    private long getSafeMaxGLEntryId() {
        return Math.max (getMaxGLEntryId()-SAFE_WINDOW, 0L);
    }
    public void overrideSafeWindow (long l) {
        this.SAFE_WINDOW = l;
    }
    private void recurseChildren (Account acct, List<Long> list) {
        for (Account a : acct.getChildren()) {
            if (a.isFinalAccount())
                list.add (a.getId());
            else recurseChildren (a, list);
        }
    }
    private List<Long> getChildren (Account acct) {
        List<Long> list = new ArrayList<Long>();
        recurseChildren (acct, list);
        return list;
    }

    private List<FinalAccount> getDeepFinalChildren0(Account acct) throws HibernateException, GLException {
        List<FinalAccount> list = new ArrayList<>();
        if (acct.getChildren() != null) {
            for (Account a : acct.getChildren()) {
                list.addAll(getDeepFinalChildren0(a));
            }
        } else if (acct instanceof FinalAccount) {
            list.add((FinalAccount) acct);
        }
        return list;
    }

    private void validateAccountCode(Account parent, Account child)
            throws GLException
    {
        if (!parent.isChart() && !child.getCode().startsWith(parent.getCode())) {
            throw new GLException("Child account code `"+child.getCode()+"` must start with parent account code `"+parent.getCode()+"`");
        }
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

    private void setDialect() {
        String ds = ("" + db.getDialect()).toLowerCase();
        if (ds.contains("mysql"))
            nativeDialect = NativeDialect.MYSQL;
        else if (ds.contains("postgres"))
            nativeDialect = NativeDialect.POSTGRESQL;
    }
    public void forceDialect (NativeDialect dialect) {
        nativeDialect = dialect;
    }
    public enum NativeDialect {
        MYSQL, POSTGRESQL, ORM
    }
}
