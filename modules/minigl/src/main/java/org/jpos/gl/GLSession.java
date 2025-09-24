/*
 * jPOS Project [http://jpos.org]
 * Copyright (C) 2000-2025 jPOS Software SRL
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

import java.math.BigInteger;
import java.time.Instant;
import java.util.*;
import java.math.BigDecimal;
import java.util.function.Consumer;
import java.util.stream.Collectors;

import jakarta.persistence.NoResultException;
import jakarta.persistence.Tuple;
import jakarta.persistence.TypedQuery;
import jakarta.persistence.criteria.*;
import org.hibernate.*;
import org.hibernate.exception.ConstraintViolationException;
import org.hibernate.query.MutationQuery;
import org.hibernate.query.NativeQuery;
import org.hibernate.query.Query;
import org.hibernate.transform.AliasToEntityMapResultTransformer;
import org.hibernate.type.StandardBasicTypes;
import org.jpos.ee.DB;
import org.jpos.transaction.TxnId;
import org.jpos.util.LogEvent;

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

    private long SAFE_WINDOW = 120L;
    private boolean ignoreBalanceCache = false;
    private boolean strictAccountCodes = true;
    private NativeDialect nativeDialect = NativeDialect.ORM;

    private static String POSTGRESQL_GET_BALANCES =
      "SELECT SUM(CASE WHEN entry.credit='N' THEN entry.amount ELSE -entry.amount end) AS balance,\n" +
      " COUNT(entry.id) AS entry_count\n" +
      " FROM transentry AS entry\n";

    private static String MYSQL_GET_BALANCES =
      "SELECT SUM(if(entry.credit='N',entry.amount,-entry.amount)) AS balance,\n" +
        "  COUNT(entry.id) AS entry_count\n" +
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
     * Checks whether the user has the permission to perform the specified action.
     *
     * <p>
     * This method iterates through the user's permissions and returns {@code true} if a global permission
     * (indicated by a {@code null} journal) exists whose name matches the specified action.
     * </p>
     *
     * @param action the name of the action to check for permission
     * @return {@code true} if the user has a global permission matching the action, {@code false} otherwise
     * @see GLPermission
     */
    public boolean hasPermission(String action) {
        for (GLPermission p : user.getPermissions()) {
            if (p.getJournal() == null && action.equals(p.getName())) {
                return true;
            }
        }
        return false;
    }
    /**
     * Checks whether the current user has the specified permission.
     *
     * <p>
     * If the user does not have the required permission, a {@link GLException} is thrown.
     * This method uses the {@link #hasPermission(String)} method to perform the check.
     * </p>
     *
     * @param action the name of the permission to check
     * @throws GLException if the user does not have the specified permission
     * @see GLPermission
     */
    public void checkPermission(String action) throws GLException {
        if (!hasPermission(action)) {
            throw new GLException("User '" + user.getName() + "' (" + user.getId() +
              ") does not have '" + action + "' permission.");
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
     * Retrieves the top-level chart of accounts corresponding to the specified code.
     *
     * <p>This method queries the database for an {@link Account} that matches the given code and has no parent,
     * indicating that it is a top-level chart. If no such account exists, the method returns {@code null}.</p>
     *
     * @param code the unique code identifying the chart of account
     * @return the top-level {@link Account} corresponding to the specified code, or {@code null} if not found
     * @throws HibernateException if an error occurs while accessing the database
     * @throws GLException if the user does not have the required global READ permission
     * @see GLPermission
     */
    public Account getChart (String code) throws HibernateException, GLException {
        checkPermission (GLPermission.READ);
        Query<Account> query = session.createQuery(
          "from org.jpos.gl.CompositeAccount acct where code = :code and parent is null",
          Account.class
        );
        query.setParameter("code", code);
        return query.uniqueResultOptional().orElse(null);

    }

    /**
     * Retrieves a list of top-level charts of accounts.
     *
     * <p>This method returns all {@link Account} instances that do not have a parent account,
     * meaning they are considered top-level. If no top-level accounts exist, an empty list is returned.</p>
     *
     * @return a {@link List} of top-level {@link Account} objects
     * @throws HibernateException if an error occurs while accessing the database
     * @throws GLException if the user does not have the required global READ permission
     * @see GLPermission
     */
    public List<Account> getCharts() throws HibernateException, GLException {
        checkPermission(GLPermission.READ);
        Query<Account> query = session.createQuery(
          "from org.jpos.gl.CompositeAccount acct where parent is null",
          Account.class
        );
        return query.getResultList();
    }

    /**
     * Retrieves the account with the specified code within the given chart of accounts.
     *
     * <p>This method looks up the {@link Account} that belongs to the provided chart (identified by its ID)
     * and matches the given account code. If no such account exists, the method returns {@code null}.</p>
     *
     * @param chart the chart of accounts in which to search for the account
     * @param code  the unique code identifying the account within the chart
     * @return the {@link Account} with the specified code in the given chart, or {@code null} if not found
     * @throws HibernateException if an error occurs while accessing the database
     * @throws GLException if the user does not have the required global READ permission
     * @see GLPermission
     */
    public Account getAccount(Account chart, String code) throws HibernateException, GLException {
        checkPermission(GLPermission.READ);
        Query<Account> query = session.createQuery(
          "from org.jpos.gl.Account acct where acct.root = :chart and acct.code = :code",
          Account.class
        );
        query.setParameter("chart", chart);
        query.setParameter("code", code);
        return query.uniqueResultOptional().orElse(null);
    }

    /**
     * Adds the specified account as a child to the given composite parent account using fast addition.
     *
     * <p>
     * This method verifies that the user has the necessary permissions and checks that the parent's type is valid before adding the account.
     * In fast mode, the operation avoids eagerly loading the parent's children collection.
     * </p>
     *
     * <p>
     * Internally, this method delegates to {@link #addAccount(CompositeAccount, Account, boolean)} with the {@code fast} flag set to {@code true}.
     * </p>
     *
     * @param parent the composite parent account to which the new account will be added
     * @param acct   the account to add as a child
     * @throws HibernateException if an error occurs during database operations
     * @throws GLException if the user lacks the required permissions or if there is a type or currency mismatch
     */
    public void addAccount (CompositeAccount parent, Account acct)
        throws HibernateException, GLException
    {
        addAccount (parent, acct, true);
    }

    /**
     * Adds the specified account as a child of the given composite parent account.
     *
     * <p>
     * This method performs several validations before adding the account:
     * </p>
     * <ul>
     *   <li>Verifies that the current user has the {@link GLPermission#WRITE} permission.</li>
     *   <li>If strict account codes are enforced, validates the account code against the parent.</li>
     *   <li>Ensures that the parent's type is compatible with the account's type (unless the parent is a chart).</li>
     *   <li>If the parent specifies a currency code, confirms that the account's currency code matches it.</li>
     * </ul>
     *
     * <p>
     * The {@code fast} parameter determines whether the addition is performed in "fast" mode:
     * when {@code true}, the account is added without eagerly loading the parent's children; when {@code false},
     * the account is also added to the parent's children collection.
     * </p>
     *
     * <p>
     * If a database constraint is violated (such as a duplicate account code), a {@link GLException}
     * with the message "Duplicate code" is thrown.
     * </p>
     *
     * @param parent the composite parent account to which the account is added
     * @param acct the account to add as a child
     * @param fast {@code true} to perform a fast add (avoiding the eager loading of children); {@code false} to update the parent's children collection
     * @throws HibernateException if an error occurs during database operations
     * @throws GLException if the user lacks the required {@link GLPermission#WRITE} permission, if there is a type or currency mismatch,
     * or if a duplicate account code is detected
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
     * Persists a new chart of accounts to the database.
     *
     * <p>
     * This method first verifies that the current user has the {@link GLPermission#WRITE} permission.
     * If the permission check passes, the chart of accounts represented by the given {@link Account} object
     * is persisted using the underlying Hibernate session.
     * </p>
     *
     * @param acct the chart of accounts to add; should be a valid {@link Account} instance representing a chart
     * @throws HibernateException if an error occurs while persisting the chart of accounts
     * @throws GLException if the user does not have the required write permission
     */
    public void addChart(Account acct)
      throws HibernateException, GLException {
        checkPermission(GLPermission.WRITE);
        session.persist(acct);
    }

    /**
     * Persists a new Journal entry to the database.
     *
     * <p>
     * This method first verifies that the current user has the {@link GLPermission#WRITE} permission.
     * If the permission check passes, the provided {@link Journal} instance is persisted using the Hibernate session.
     * </p>
     *
     * @param j the new Journal to add; must be a valid {@link Journal} instance
     * @throws HibernateException if an error occurs during persistence
     * @throws GLException if the user does not have the required write permission
     */
    public void addJournal(Journal j) throws HibernateException, GLException {
        checkPermission(GLPermission.WRITE);
        session.persist(j);
    }

    /**
     * Retrieves the final account with the specified code from the given chart of accounts.
     *
     * <p>
     * This method first ensures that the current user has the global READ permission. It then queries for a
     * {@link FinalAccount} that is associated with the provided chart (identified by its ID) and has the matching code.
     * If no such account exists, {@code null} is returned.
     * </p>
     *
     * @param chart the chart of accounts within which to search for the final account
     * @param code  the unique code identifying the final account
     * @return the {@link FinalAccount} with the given code in the specified chart, or {@code null} if no match is found
     * @throws HibernateException if an error occurs while accessing the database
     * @throws GLException if the user does not have the required global READ permission
     * @see GLPermission
     */
    public FinalAccount getFinalAccount(Account chart, String code)
      throws HibernateException, GLException {
        checkPermission(GLPermission.READ);

        Query<FinalAccount> query = session.createQuery(
          "from org.jpos.gl.FinalAccount acct where acct.root = :chart and acct.code = :code",
          FinalAccount.class
        );
        query.setParameter("chart", chart);
        query.setParameter("code", code);

        return query.uniqueResultOptional().orElse(null);
    }
    /**
     * Retrieves a list of final accounts associated with the specified chart of accounts.
     *
     * <p>
     * This method first verifies that the current user has the global READ permission. It then returns all
     * {@link FinalAccount} entities that belong to the given chart (identified by its ID). If no final accounts are found,
     * an empty list is returned.
     * </p>
     *
     * @param chart the chart of accounts within which to search for final accounts
     * @return a list of {@link FinalAccount} instances associated with the specified chart
     * @throws HibernateException if an error occurs while accessing the database
     * @throws GLException if the user does not have the required global READ permission
     * @see GLPermission
     */
    public List<FinalAccount> getFinalAccounts(Account chart)
      throws HibernateException, GLException {
        checkPermission(GLPermission.READ);

        Query<FinalAccount> query = session.createQuery(
          "from org.jpos.gl.FinalAccount acct where acct.root = :chart",
          FinalAccount.class
        );
        query.setParameter("chart", chart);

        return query.getResultList();
    }

    /**
     * Retrieves the composite account children for the specified parent account.
     *
     * <p>
     * This method first verifies that the current user has the global READ permission. It then queries the database
     * for all {@link CompositeAccount} entities whose parent field matches the provided parent account. If no children
     * are found, an empty list is returned.
     * </p>
     *
     * @param parent the parent account for which to retrieve composite children
     * @return a list of {@link CompositeAccount} entities that are children of the specified parent account
     * @throws HibernateException if an error occurs while accessing the database
     * @throws GLException if the user does not have the required global READ permission
     * @see GLPermission
     */
    public List<CompositeAccount> getCompositeChildren(Account parent)
      throws HibernateException, GLException {
        checkPermission(GLPermission.READ);
        Query<CompositeAccount> query = session.createQuery(
          "from org.jpos.gl.CompositeAccount acct where acct.parent = :parent",
          CompositeAccount.class
        );
        query.setParameter("parent", parent);
        return query.getResultList();
    }

    /**
     * Retrieves the final account children of the specified parent account.
     *
     * <p>
     * This method first verifies that the current user has the global READ permission. It then queries the database
     * for all {@link FinalAccount} entities that have the given account as their parent. If no such accounts are found,
     * an empty list is returned.
     * </p>
     *
     * @param parent the parent account for which to retrieve final account children
     * @return a list of {@link FinalAccount} entities that are direct children of the specified parent account
     * @throws HibernateException if an error occurs while accessing the database
     * @throws GLException if the user does not have the required global READ permission
     * @see GLPermission
     */
    public List<FinalAccount> getFinalChildren(Account parent) throws HibernateException, GLException {
        checkPermission(GLPermission.READ);

        Query<FinalAccount> query = session.createQuery(
          "from org.jpos.gl.FinalAccount acct where acct.parent = :parent",
          FinalAccount.class
        );
        query.setParameter("parent", parent);

        return query.getResultList();
    }

    /**
     * Retrieves a list of all accounts associated with the specified chart of accounts.
     *
     * <p>
     * This method first verifies that the current user has the global READ permission. It then queries the database
     * for all {@link Account} entities whose root matches the provided chart's identifier. If no matching accounts are found,
     * an empty list is returned.
     * </p>
     *
     * @param chart the chart of accounts used to filter the accounts
     * @return a list of {@link Account} objects associated with the specified chart
     * @throws HibernateException if an error occurs during database operations
     * @throws GLException if the user does not have the required global READ permission
     * @see GLPermission
     */
    public List<Account> getAllAccounts(Account chart) throws HibernateException, GLException {
        checkPermission(GLPermission.READ);

        Query<Account> query = session.createQuery(
          "from org.jpos.gl.Account acct where acct.root = :chart",
          Account.class
        );
        query.setParameter("chart", chart);

        return query.getResultList();
    }

    /**
     * Retrieves the composite account with the specified code from the given chart of accounts.
     *
     * <p>
     * This method first ensures that the current user has the global READ permission. It then queries the database
     * for a {@link CompositeAccount} that is associated with the provided chart (using the chart's ID as the root)
     * and matches the specified account code. If no matching composite account is found, {@code null} is returned.
     * </p>
     *
     * @param chart the chart of accounts used as the root for the search
     * @param code  the unique code of the composite account to retrieve
     * @return the {@link CompositeAccount} with the specified code in the given chart, or {@code null} if no match is found
     * @throws HibernateException if an error occurs while accessing the database
     * @throws GLException if the user does not have the required global READ permission
     * @see GLPermission
     */
    public CompositeAccount getCompositeAccount(Account chart, String code)
      throws HibernateException, GLException {
        checkPermission(GLPermission.READ);

        Query<CompositeAccount> query = session.createQuery(
          "from org.jpos.gl.CompositeAccount acct where acct.root = :chart and acct.code = :code",
          CompositeAccount.class
        );
        query.setParameter("chart", chart);
        query.setParameter("code", code);

        return query.uniqueResultOptional().orElse(null);
    }

    /**
     * Retrieves the account with the specified code from the chart identified by the given chart name.
     *
     * <p>
     * This method first looks up the chart of accounts using the provided chart name. If the chart is not found,
     * a {@link GLException} is thrown indicating that the specified chart does not exist. If the chart exists,
     * the method then retrieves the account with the given code within that chart. If no matching account is found,
     * {@code null} is returned.
     * </p>
     *
     * @param chartName the identifier (code) of the chart of accounts to search
     * @param code the unique code of the account within the chart
     * @return the {@link Account} with the specified code in the given chart, or {@code null} if no such account exists
     * @throws HibernateException if an error occurs during database operations
     * @throws GLException if the user does not have the required global READ permission or if the specified chart does not exist
     * @see GLPermission
     */
    public Account getAccount(String chartName, String code)
      throws HibernateException, GLException {
        Account chart = getChart(chartName);
        if (chart == null) {
            throw new GLException("Chart '" + chartName + "' does not exist");
        }
        return getAccount(chart, code);
    }

    /**
     * Retrieves the final account with the specified code from the chart identified by the given chart name.
     *
     * <p>
     * This method first attempts to obtain the chart of accounts using the provided chart name.
     * If the chart cannot be found, a {@link GLException} is thrown. Otherwise, the method returns the final account
     * associated with the specified account code from the retrieved chart. If no such final account exists, {@code null}
     * is returned.
     * </p>
     *
     * @param chartName the code identifying the chart of accounts to search
     * @param code the unique code of the final account within the specified chart
     * @return the {@link FinalAccount} with the given code in the specified chart, or {@code null} if no match is found
     * @throws HibernateException if an error occurs while accessing the database
     * @throws GLException if the user does not have the required global READ permission or if the specified chart does not exist
     * @see GLPermission
     */
    public FinalAccount getFinalAccount(String chartName, String code)
      throws HibernateException, GLException {
        Account chart = getChart(chartName);
        if (chart == null) {
            throw new GLException("Chart '" + chartName + "' does not exist");
        }
        return getFinalAccount(chart, code);
    }

    /**
     * Retrieves the composite account with the specified code from the chart identified by the given chart name.
     *
     * <p>
     * This method first attempts to obtain the chart of accounts using the provided chart name. If the chart cannot be found,
     * a {@link GLException} is thrown indicating that the specified chart does not exist. If the chart exists, the method
     * delegates to {@link #getCompositeAccount(Account, String)} to retrieve the composite account with the given code.
     * If no matching composite account is found, {@code null} is returned.
     * </p>
     *
     * @param chartName the code identifying the chart of accounts to search
     * @param code the unique code of the composite account within the specified chart
     * @return the {@link CompositeAccount} with the specified code in the given chart, or {@code null} if no match is found
     * @throws HibernateException if an error occurs while accessing the database
     * @throws GLException if the user does not have the required global READ permission or if the specified chart does not exist
     * @see GLPermission
     */
    public CompositeAccount getCompositeAccount(String chartName, String code)
      throws HibernateException, GLException {
        Account chart = getChart(chartName);
        if (chart == null)
            throw new GLException("Chart '" + chartName + "' does not exist");
        return getCompositeAccount(chart, code);
    }

    /**
     * Retrieves the journal with the specified name.
     *
     * <p>
     * This method queries the database for a {@link Journal} entity that has the given name.
     * If no journal is found, a {@link GLException} is thrown indicating that the specified journal does not exist.
     * After retrieval, the method checks that the current user has the global READ permission on the journal.
     * </p>
     *
     * @param name the name of the journal to retrieve
     * @return the {@link Journal} corresponding to the specified name
     * @throws HibernateException if an error occurs during database operations
     * @throws GLException if the user does not have the required global READ permission or if the journal does not exist
     * @see GLPermission
     */
    public Journal getJournal(String name) throws HibernateException, GLException {
        Query<Journal> query = session.createQuery(
          "from org.jpos.gl.Journal j where j.name = :name",
          Journal.class
        );
        query.setParameter("name", name);

        Journal journal = query.uniqueResultOptional()
          .orElseThrow(() -> new GLException("Journal '" + name + "' does not exist"));

        checkPermission(GLPermission.READ, journal);
        return journal;
    }


    /**
     * Retrieves a list of all journals.
     *
     * <p>
     * This method first verifies that the current user has the global READ permission before querying the database.
     * It returns all {@link Journal} entities ordered by their associated chart.
     * </p>
     *
     * @return a list of all {@link Journal} entities
     * @throws HibernateException if an error occurs during database operations
     * @throws GLException if the user does not have the required global READ permission
     * @see GLPermission
     */
    public List<Journal> getAllJournals() throws HibernateException, GLException {
        checkPermission(GLPermission.READ);
        Query<Journal> query = session.createQuery(
          "from org.jpos.gl.Journal j order by j.chart",
          Journal.class
        );
        return query.getResultList();
    }

    /**
     * Returns a list of all currency IDs.
     *
     * @return a list of currency IDs
     * @see org.jpos.gl.Currency
     */
    public List<String> getCurrencyCodes() {
        return db.session()
          .createQuery("select c.id from Currency c", String.class)
          .getResultList();
    }

    /**
     * Posts the specified transaction to the given journal.
     *
     * <p>
     * This method performs the following steps:
     * </p>
     * <ol>
     *   <li>Verifies that the user has the {@link GLPermission#POST} permission on the provided journal.</li>
     *   <li>Associates the transaction with the journal and sets the current timestamp.</li>
     *   <li>If the transaction's post date is not already set, it initializes it using a floor operation on the timestamp.
     *       Otherwise, it invalidates any existing checkpoints for the transaction.</li>
     *   <li>Retrieves any applicable journal rules and applies them to the transaction.</li>
     *   <li>Persists the transaction to the database.</li>
     * </ol>
     *
     * @param journal the journal in which the transaction will be posted
     * @param txn the transaction to post
     * @throws GLException if the user lacks POST permission, if a rule associated with the journal or account raises an exception,
     *                   or if any business rule is violated
     * @throws HibernateException if an error occurs during database operations
     * @see GLPermission
     * @see JournalRule
     */
    public void post(Journal journal, GLTransaction txn)
      throws HibernateException, GLException {
        checkPermission(GLPermission.POST, journal);

        txn.setJournal(journal);
        txn.setTimestamp(new Date());

        if (txn.getPostDate() == null) {
            txn.setPostDate(Util.floor(txn.getTimestamp()));
        } else {
            invalidateCheckpoints(txn);
        }

        Collection<RuleEntry> rules = getRules(txn);
        // dumpRules(rules); // Uncomment for debugging purposes if needed.
        applyRules(txn, rules);
        session.persist(txn);
    }

    /**
     * Moves a transaction to a new journal.
     *
     * <p>
     * This method performs the following steps:
     * </p>
     * <ol>
     *   <li>Checks that the user has the required POST permission on both the new journal and the transaction's current journal.</li>
     *   <li>Invalidates any existing checkpoints for the transaction in its old journal context.</li>
     *   <li>Updates the transaction to reference the new journal.</li>
     *   <li>Invalidates checkpoints again in the new journal context.</li>
     *   <li>Applies any applicable rules to the transaction.</li>
     *   <li>Updates the transaction in the database.</li>
     * </ol>
     *
     * @param txn the transaction to move
     * @param journal the new journal to which the transaction will be moved
     * @throws GLException if the user lacks POST permission on either the current or new journal,
     *                     or if any business rule is violated during the move operation
     * @throws HibernateException if a database error occurs
     */
    public void move(GLTransaction txn, Journal journal)
      throws GLException, HibernateException {
        checkPermission(GLPermission.POST, journal);
        checkPermission(GLPermission.POST, txn.getJournal());
        invalidateCheckpoints(txn);
        txn.setJournal(journal);
        invalidateCheckpoints(txn);
        applyRules(txn, getRules(txn));
        session.merge(txn);
    }

    /**
     * Summarizes transactions in a given journal.
     *
     * <p>
     * This method aggregates transactions within the specified date range for the provided journal and creates a
     * summary transaction with the given description. The start and end dates are adjusted to the beginning and end
     * of the period (using floor and ceil operations, respectively). The method validates that the date range is
     * correct and that the journal is not locked for the period. It then processes debit and credit entries for each
     * layer specified in the <code>layers</code> array. For each layer, it retrieves the summarized entries, creates
     * debit and credit entries in the summary transaction accordingly, and then deletes the original transactions in
     * that range.
     * </p>
     *
     * @param journal the journal for which transactions will be summarized
     * @param start the start date (inclusive) of the summary period
     * @param end the end date (inclusive) of the summary period
     * @param description the description for the summary transaction
     * @param layers an array of short values representing the layers to be processed
     * @return a {@link GLTransaction} representing the summary transaction
     * @throws GLException if the user lacks the required SUMMARIZE permission on the journal, if the date range is invalid,
     *                     or if the journal is locked for the specified period
     * @throws HibernateException if an error occurs during database operations or mapping
     */
    public GLTransaction summarize(Journal journal, Date start, Date end, String description, short[] layers)
      throws HibernateException, GLException {
        checkPermission(GLPermission.SUMMARIZE, journal);
        start = Util.floor(start);
        end = Util.ceil(end);
        if (end.compareTo(start) < 0) {
            throw new GLException("Invalid date range " + Util.dateToString(start) + ":" + Util.dateToString(end));
        }

        // Ensure the journal is not locked for the given period.
        Date lockDate = journal.getLockDate();
        if (lockDate != null && start.compareTo(lockDate) <= 0) {
            throw new GLException("Journal is locked at " + Util.dateToString(lockDate));
        }
        setLockDate(journal, end);

        // Create a new summary transaction.
        GLTransaction txn = new GLTransaction(description);

        // Process each layer provided.
        for (int i = 0; i < layers.length; i++) {
            short currentLayer = layers[i];
            Iterator<Object[]> debits = findSummarizedGLEntries(journal, start, end, false, currentLayer);
            Iterator<Object[]> credits = findSummarizedGLEntries(journal, start, end, true, currentLayer);

            // Process debit entries.
            while (debits.hasNext()) {
                Object[] obj = debits.next();
                FinalAccount account = (FinalAccount) obj[0];
                BigDecimal amount = (BigDecimal) obj[1];
                txn.createDebit(account, amount, null, currentLayer);
            }

            // Process credit entries.
            while (credits.hasNext()) {
                Object[] obj = credits.next();
                FinalAccount account = (FinalAccount) obj[0];
                BigDecimal amount = (BigDecimal) obj[1];
                txn.createCredit(account, amount, null, currentLayer);
            }
        }
        session.clear();
        deleteGLTransactions(journal, start, end);

        // Finalize the summary transaction.
        txn.setJournal(journal);
        txn.setTimestamp(new Date());
        txn.setPostDate(end);
        // Persist the summary transaction (using persist() is preferred in Hibernate 6).
        session.persist(txn);
        session.refresh(journal);
        journal.setLockDate(null);
        return txn;
    }
    /**
     * Retrieves a transaction from the specified journal with permission validation.
     *
     * @param journal The journal to search in (must not be null)
     * @param id      The transaction ID to retrieve
     * @return The found transaction, or {@code null} if not found
     * @throws GLException          If READ permission is denied or transaction belongs to wrong journal
     * @throws IllegalArgumentException If journal is {@code null}
     * @throws HibernateException   For database access errors
     */
    public GLTransaction getTransaction(Journal journal, long id)
      throws HibernateException, GLException
    {
        checkPermission(GLPermission.READ, journal);
        Objects.requireNonNull(journal, "Journal must not be null");

        final GLTransaction txn = session.get(GLTransaction.class, id);

        if (txn != null) {
            final Journal transactionJournal = txn.getJournal();
            if (transactionJournal == null || !transactionJournal.equals(journal)) {
                throw new GLException("Transaction %d belongs to journal %s (expected %s)"
                  .formatted(id,
                    transactionJournal != null ? transactionJournal.getName() : "null",
                    journal.getName()));
            }
        }

        return txn;
    }

    /**
     * Creates a query to find transactions in the given journal using pagination.
     *
     * <p>
     * This method calculates the starting result index based on the provided 1-indexed page number and page size,
     * then delegates to {@link #createFindTransactionsCriteriaByRange(Journal, Date, Date, String, boolean, int, int)}
     * to create the query.
     * </p>
     *
     * @param journal the journal in which to search for transactions
     * @param start the start date (inclusive)
     * @param end the end date (inclusive)
     * @param searchString an optional search string to filter transactions by detail
     * @param findByPostDate if {@code true}, the date filtering is applied on the postDate field; if {@code false},
     *                       on the timestamp field
     * @param pageNumber the 1-indexed page number (must be > 0)
     * @param pageSize the number of results per page (must be > 0)
     * @return a {@code Query<GLTransaction>} representing the search criteria for transactions
     * @throws GLException if the user does not have READ permission on the specified journal
     * @throws HibernateException if an error occurs during query creation
     */
    public Query<GLTransaction> createFindTransactionsCriteria(
      Journal journal, Date start, Date end, String searchString,
      boolean findByPostDate, int pageNumber, int pageSize)
      throws HibernateException, GLException {

        int firstResult = 0;
        if (pageSize > 0 && pageNumber > 0) {
            firstResult = pageSize * (pageNumber - 1);
        }
        return createFindTransactionsCriteriaByRange(
          journal, start, end, searchString, findByPostDate, firstResult, pageSize
        );
    }

    /**
     * Creates a query to find transactions in a given journal within a specified date range.
     *
     * <p>
     * The date range is applied on either the <em>postDate</em> or <em>timestamp</em> field (depending on the
     * {@code findByPostDate} flag). If a search string is provided, it will be used to filter transactions by
     * their detail. This method also supports pagination by specifying the first result index and the page size.
     * </p>
     *
     * @param journal the journal in which to search for transactions
     * @param start the start date (inclusive)
     * @param end the end date (inclusive)
     * @param searchString an optional search string to filter transactions by detail
     * @param findByPostDate if {@code true}, the date filtering is applied on the postDate field; if {@code false},
     *                       on the timestamp field
     * @param firstResult the index of the first result (for pagination)
     * @param pageSize the maximum number of results to return
     * @return a {@code Query<GLTransaction>} representing the query for matching transactions
     * @throws GLException if the user does not have READ permission on the journal
     */
    public Query<GLTransaction> createFindTransactionsCriteriaByRange(
      Journal journal, Date start, Date end, String searchString,
      boolean findByPostDate, int firstResult, int pageSize)
      throws HibernateException, GLException {
        checkPermission(GLPermission.READ, journal);
        String dateField = findByPostDate ? "postDate" : "timestamp";
        if (findByPostDate) {
            if (start != null) {
                start = Util.floor(start);
            }
            if (end != null) {
                end = Util.ceil(end);
            }
        }

        // Obtain the CriteriaBuilder and create a CriteriaQuery.
        CriteriaBuilder cb = session.getCriteriaBuilder();
        CriteriaQuery<GLTransaction> cq = cb.createQuery(GLTransaction.class);
        Root<GLTransaction> root = cq.from(GLTransaction.class);

        // Build the predicates.
        List<Predicate> predicates = new ArrayList<>();
        // Filter by journal.
        predicates.add(cb.equal(root.get("journal"), journal));

        // Filter by date range.
        if (start != null && start.equals(end)) {
            predicates.add(cb.equal(root.get(dateField), start));
        } else {
            if (start != null) {
                predicates.add(cb.greaterThanOrEqualTo(root.get(dateField), start));
            }
            if (end != null) {
                predicates.add(cb.lessThanOrEqualTo(root.get(dateField), end));
            }
        }

        // Apply the search string filter on the "detail" field if provided.
        if (searchString != null) {
            predicates.add(cb.like(root.get("detail"), "%" + searchString + "%"));
        }

        // Complete the CriteriaQuery.
        cq.select(root).where(predicates.toArray(new Predicate[0]));

        // Create the query from the CriteriaQuery.
        Query<GLTransaction> query = session.createQuery(cq);

        // Set pagination if applicable.
        if (pageSize > 0 && firstResult > 0) {
            query.setMaxResults(pageSize);
            query.setFirstResult(firstResult);
        }

        return query;
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
     * Retrieves a list of transaction IDs in the given journal that match the specified criteria.
     *
     * <p>
     * The search is performed on transactions within the given date range (inclusive). When searching by postDate,
     * the start date is adjusted (floored) and the end date is adjusted (ceiled). If a search string is provided,
     * the transaction detail is filtered to include that string. Pagination is applied based on the page number (1-indexed)
     * and page size.
     * </p>
     *
     * @param journal the journal in which to search for transactions
     * @param start the start date (inclusive)
     * @param end the end date (inclusive)
     * @param searchString an optional search string to filter transactions by detail
     * @param findByPostDate if {@code true}, the search is performed using the postDate field; if {@code false},
     *                       the search is performed using the timestamp field
     * @param pageNumber the 1-indexed page number
     * @param pageSize the maximum number of results per page
     * @return a list of transaction IDs
     * @throws GLException if the user does not have READ permission on the specified journal
     * @throws HibernateException if an error occurs during query execution
     */
    public List<?> findTransactionsIds(Journal journal, Date start, Date end, String searchString,
                                       boolean findByPostDate, int pageNumber, int pageSize)
      throws HibernateException, GLException {
        checkPermission(GLPermission.READ, journal);
        String dateField = findByPostDate ? "postDate" : "timestamp";
        if (findByPostDate) {
            if (start != null) {
                start = Util.floor(start);
            }
            if (end != null) {
                end = Util.ceil(end);
            }
        }
        CriteriaBuilder cb = session.getCriteriaBuilder();
        CriteriaQuery<Object> cq = cb.createQuery();
        Root<GLTransaction> root = cq.from(GLTransaction.class);
        cq.select(root.get("id"));

        List<Predicate> predicates = new ArrayList<>();
        predicates.add(cb.equal(root.get("journal"), journal));

        if (start != null && start.equals(end)) {
            predicates.add(cb.equal(root.get(dateField), start));
        } else {
            if (start != null) {
                predicates.add(cb.greaterThanOrEqualTo(root.get(dateField), start));
            }
            if (end != null) {
                predicates.add(cb.lessThanOrEqualTo(root.get(dateField), end));
            }
        }

        if (searchString != null) {
            predicates.add(cb.like(root.get("detail"), "%" + searchString + "%"));
        }

        cq.where(predicates.toArray(new Predicate[0]));
        Query<Object> query = session.createQuery(cq);

        if (pageSize > 0 && pageNumber > 0) {
            int firstResult = pageSize * (pageNumber - 1);
            query.setMaxResults(pageSize);
            query.setFirstResult(firstResult);
        }
        return query.getResultList();
    }

    /**
     * Finds the count of transactions in a journal within a date range, optionally filtered by a search string.
     *
     * @param journal        the journal to search in (required)
     * @param start          start date (inclusive). Time component is floored if {@code findByPostDate} is true
     * @param end            end date (inclusive). Time component is ceiled if {@code findByPostDate} is true
     * @param searchString   optional search string to match in transaction details (case-sensitive partial match)
     * @param findByPostDate {@code true} to filter by postDate, {@code false} to use timestamp
     * @return count of matching transactions as a {@link Long}
     * @throws GLException          if user lacks READ permission on the journal
     * @throws HibernateException   if there's a database access problem
     * @throws IllegalArgumentException if journal is {@code null}
     */
    public Long findTransactionsRowCount
    (Journal journal, Date start, Date end, String searchString, boolean findByPostDate)
      throws HibernateException, GLException
    {
        checkPermission(GLPermission.READ, journal);
        Objects.requireNonNull(journal, "Journal must not be null");

        final String dateField = findByPostDate ? "postDate" : "timestamp";
        if (findByPostDate) {
            start = start != null ? Util.floor(start) : null;
            end = end != null ? Util.ceil(end) : null;
        }

        final CriteriaBuilder cb = session.getCriteriaBuilder();
        final CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        final Root<GLTransaction> root = cq.from(GLTransaction.class);

        final List<Predicate> predicates = new ArrayList<>();
        predicates.add(cb.equal(root.get("journal"), journal));

        if (start != null && end != null && start.equals(end)) {
            predicates.add(cb.equal(root.get(dateField), start));
        } else {
            if (start != null) {
                predicates.add(cb.greaterThanOrEqualTo(root.get(dateField), start));
            }
            if (end != null) {
                predicates.add(cb.lessThanOrEqualTo(root.get(dateField), end));
            }
        }

        if (searchString != null && !searchString.isBlank()) {
            predicates.add(cb.like(root.get("detail"), "%" + searchString + "%"));
        }

        cq.select(cb.count(root)).where(predicates.toArray(new Predicate[0]));
        return session.createQuery(cq).getSingleResult();
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
     * Calculates account balances and entry count up to a specified date, considering checkpoints and balance cache.
     *
     * @param journal    the journal to query (required)
     * @param acct       the account to calculate balances for (required)
     * @param date       cutoff date (inclusive). Time component handled according to {@code inclusive} flag
     * @param inclusive  {@code true} to include transactions on the exact date, {@code false} to exclude
     * @param layers     accounting layers to consider (empty array means all layers)
     * @param maxId      maximum entry ID to consider (0 disables this filter)
     * @return array where [0] = running balance, [1] = entry count since last checkpoint/cache
     * @throws GLException          if READ permission is denied on the journal
     * @throws HibernateException   if there's a database access issue
     * @throws IllegalArgumentException if journal or account is null
     */
    public BigDecimal[] getBalancesORM
    (Journal journal, Account acct, Date date, boolean inclusive, short[] layers, long maxId)
      throws HibernateException, GLException
    {
        checkPermission(GLPermission.READ, journal);
        Objects.requireNonNull(journal, "Journal must not be null");
        Objects.requireNonNull(acct, "Account must not be null");

        final BigDecimal[] balance = {ZERO, ZERO};
        final short[] layersCopy = Arrays.copyOf(layers, layers.length);

        if (acct.getChildren() != null && !acct.getChildren().isEmpty()) {
            if (acct.isChart()) {
                return getChartBalances(journal, (CompositeAccount) acct, date, inclusive, layersCopy, maxId);
            }

            for (Account child : acct.getChildren()) {
                BigDecimal[] childBalance = getBalancesORM(journal, child, date, inclusive, layersCopy, maxId);
                balance[0] = balance[0].add(childBalance[0]);
            }
            return balance;
        }

        if (acct.isFinalAccount()) {
            final CriteriaBuilder cb = session.getCriteriaBuilder();

            // Query for entries with their increase/decrease status
            CriteriaQuery<GLEntry> entryQuery = cb.createQuery(GLEntry.class);
            Root<GLEntry> entryRoot = entryQuery.from(GLEntry.class);
            Join<GLEntry, GLTransaction> txnJoin = entryRoot.join("transaction");

            List<Predicate> predicates = new ArrayList<>();
            predicates.add(cb.equal(entryRoot.get("account"), acct));
            predicates.add(cb.equal(txnJoin.get("journal"), journal));

            if (maxId > 0L) {
                predicates.add(cb.le(entryRoot.get("id"), maxId));
            }

            if (layersCopy.length > 0) {
                List<Short> layerList = new ArrayList<>(layersCopy.length);
                for (short s : layersCopy) {
                    layerList.add(s);
                }
                predicates.add(entryRoot.get("layer").in(layerList));
            }

            Checkpoint checkpoint = null;
            if (date != null) {
                Date adjustedDate = inclusive ? Util.tomorrow(date) : Util.floor(date);
                predicates.add(cb.lessThan(txnJoin.get("postDate"), adjustedDate));

                checkpoint = getRecentCheckpoint(journal, acct, date, inclusive, layersCopy);
                if (checkpoint != null) {
                    balance[0] = checkpoint.getBalance();
                    predicates.add(cb.greaterThanOrEqualTo(txnJoin.get("postDate"), checkpoint.getDate()));
                }
            } else if (!ignoreBalanceCache) {
                BalanceCache cache = getBalanceCache(journal, acct, layersCopy);
                if (cache != null && (maxId == 0 || cache.getRef() <= maxId)) {
                    balance[0] = cache.getBalance();
                    predicates.add(cb.gt(entryRoot.get("id"), cache.getRef()));
                }
            }

            entryQuery.select(entryRoot)
              .where(predicates.toArray(new Predicate[0]));

            List<GLEntry> entries = session.createQuery(entryQuery).getResultList();
            balance[0] = applyEntries (balance[0], entries);
            balance[1] = new BigDecimal(entries.size());
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

    private BigDecimal[] getBalances0(Journal journal, Account acct, Date date, boolean inclusive,
                                      short[] layers, long maxId, BalanceCache bcache)
      throws HibernateException, GLException {

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

        checkPermission(GLPermission.READ, journal);
        BigDecimal[] balance = {ZERO, ZERO};
        select.append(", transacc as txn\n");

        if (date == null && !ignoreBalanceCache) {
            short[] layersCopy = Arrays.copyOf(layers, layers.length);
            if (bcache == null)
                bcache = getBalanceCache(journal, acct, layersCopy);
            if (maxId > 0 && bcache != null && bcache.getRef() > maxId)
                bcache = null;
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
        } else if (acct.isChart()) {
            where(qs, "entry.account = acct.id");
            where(qs, "acct.root = :acctId");
        } else {
            where(qs, "entry.account = acct.id");
            where(qs, "acct.code like :code");
        }
        where(qs, "(entry.transaction = txn.id and txn.journal = :journal)\n");
        if (date != null) {
            where(qs, "txn.postDate < :date");
        }
        where(qs, "entry.layer in");
        qs.append("  (");
        qs.append(layersToString(layers, ','));
        qs.append(')');
        select.append(qs);

        // Hibernate 6 Native Query Implementation
        NativeQuery<Object[]> q = session.createNativeQuery(select.toString());
        q.addScalar("balance", StandardBasicTypes.BIG_DECIMAL)
          .addScalar("entry_count", StandardBasicTypes.LONG);

        if (acct.isFinalAccount() || acct.isChart()) {
            q.setParameter("acctId", acct.getId());
        } else {
            q.setParameter("code", acct.getCode() + "%");
        }
        q.setParameter("journal", journal.getId());

        if (date != null) {
            q.setParameter("date", inclusive ? Util.tomorrow(date) : date);
        }

        if (maxId > 0L) {
            q.setParameter("maxId", maxId);
        }

        if (bcache != null) {
            q.setParameter("bcache_ref", bcache.getRef());
        }

        List<Object[]> result = q.list();
        if (!result.isEmpty()) {
            Object[] row = result.get(0);
            BigDecimal bd = (BigDecimal) row[0];  // balance column
            Long count = (Long) row[1];           // entry_count column

            if (bd != null) {
                balance[0] = bd;
                balance[1] = new BigDecimal(count);
                if (acct.isCredit()) {
                    balance[0] = balance[0].negate();
                }
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
     * Retrieves account details within a date range with balance calculations and entry ordering.
     *
     * @param journal         The journal to query (required)
     * @param acct            The account to analyze (required)
     * @param start           Start date (inclusive), null indicates no lower bound
     * @param end             End date (inclusive), null indicates no upper bound
     * @param layers          Accounting layers to include (empty array for all layers)
     * @param ascendingOrder  {@code true} for chronological order, {@code false} for reverse
     * @param maxResults      Maximum number of entries to return (0 for unlimited)
     * @return AccountDetail containing balance information and transaction entries
     * @throws GLException          If READ permission is denied
     * @throws HibernateException   For database access issues
     * @throws IllegalArgumentException If journal or account is null
     */
    public AccountDetail getAccountDetail(
      Journal journal, Account acct, Date start, Date end, short[] layers,
      boolean ascendingOrder, int maxResults
    ) throws HibernateException, GLException {
        checkPermission(GLPermission.READ);
        Objects.requireNonNull(journal, "Journal must not be null");
        Objects.requireNonNull(acct, "Account must not be null");

        final CriteriaBuilder cb = session.getCriteriaBuilder();
        final CriteriaQuery<GLEntry> cq = cb.createQuery(GLEntry.class);
        final Root<GLEntry> entryRoot = cq.from(GLEntry.class);
        final Join<GLEntry, GLTransaction> txnJoin = entryRoot.join("transaction");

        List<Predicate> predicates = new ArrayList<>();

        // Account filtering
        if (acct.isCompositeAccount()) {
            List<Long> childIds = getChildren(acct);
            if (childIds.isEmpty()) {
                // Return empty result for composite account with no children
                return new AccountDetail(journal, acct, BigDecimal.ZERO, start, end,
                  Collections.emptyList(), layers, ascendingOrder);
            }
            Join<GLEntry, Account> accountJoin = entryRoot.join("account");
            predicates.add(accountJoin.get("id").in(childIds));
        } else {
            predicates.add(cb.equal(entryRoot.get("account"), acct));
        }

        // Layer filtering
        if (layers.length > 0) {
            List<Short> layerList = new ArrayList<>(layers.length);
            for (short s : layers) layerList.add(s);
            predicates.add(entryRoot.get("layer").in(layerList));
        }

        // Journal filtering
        predicates.add(cb.equal(txnJoin.get("journal"), journal));

        // Date filtering
        if (start != null || (start == null && ascendingOrder)) {
            Date adjustedStart = start != null ? Util.floor(start) : Util.floor(new Date(0L));
            predicates.add(cb.greaterThanOrEqualTo(txnJoin.get("postDate"), adjustedStart));
        }
        if (end != null || (end == null && ascendingOrder)) {
            Date adjustedEnd = end != null ? Util.ceil(end) : Util.ceil(new Date());
            predicates.add(cb.lessThanOrEqualTo(txnJoin.get("postDate"), adjustedEnd));
        }

        cq.where(predicates.toArray(new Predicate[0]));

        // Ordering
        List<Order> orders = new ArrayList<>();
        if (ascendingOrder) {
            orders.add(cb.asc(txnJoin.get("postDate")));
            orders.add(cb.asc(txnJoin.get("timestamp")));
            orders.add(cb.asc(entryRoot.get("id")));
        } else {
            orders.add(cb.desc(txnJoin.get("postDate")));
            orders.add(cb.desc(txnJoin.get("timestamp")));
            orders.add(cb.desc(entryRoot.get("id")));
        }
        cq.orderBy(orders);

        // Execute query
        TypedQuery<GLEntry> query = session.createQuery(cq);
        if (maxResults > 0) {
            query.setMaxResults(maxResults);
        }
        List<GLEntry> entries = query.getResultList();

        // Balance calculation
        long maxEntry = entries.isEmpty() ? 0L : entries.get(0).getId();
        Date balanceDate = ascendingOrder ? start : end;
        BigDecimal[] initialBalance = getBalances(journal, acct, balanceDate, !ascendingOrder, layers, maxEntry);

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

    /**
     * Retrieves the most recent balance cache entry for a specific account/journal/layer combination.
     *
     * @param journal The journal to query (required)
     * @param acct The account to retrieve cache for (required)
     * @param layers Accounting layers to match (null for any layers)
     * @return The latest BalanceCache or null if none exists
     * @throws GLException If CHECKPOINT permission is denied
     * @throws HibernateException For database access issues
     * @throws IllegalArgumentException If journal or account is null
     */
    public BalanceCache getBalanceCache(Journal journal, Account acct, short[] layers)
      throws HibernateException, GLException
    {
        checkPermission(GLPermission.CHECKPOINT, journal);
        Objects.requireNonNull(journal, "Journal must not be null");
        Objects.requireNonNull(acct, "Account must not be null");

        final CriteriaBuilder cb = session.getCriteriaBuilder();
        final CriteriaQuery<BalanceCache> cq = cb.createQuery(BalanceCache.class);
        final Root<BalanceCache> root = cq.from(BalanceCache.class);

        List<Predicate> predicates = new ArrayList<>();
        predicates.add(cb.equal(root.get("journal"), journal));
        predicates.add(cb.equal(root.get("account"), acct));

        if (layers != null) {
            String layerString = layersToString(layers);
            predicates.add(cb.equal(root.get("layers"), layerString));
        }

        cq.where(predicates.toArray(new Predicate[0]))
          .orderBy(cb.desc(root.get("ref")));

        List<BalanceCache> results = session.createQuery(cq)
          .setMaxResults(1)
          .getResultList();

        return results.isEmpty() ? null : results.getFirst();
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
            Iterator iter = ((CompositeAccount) acct).getChildren().iterator();
            while (iter.hasNext()) {
                Account a = (Account) iter.next();
                balance = balance.add (createBalanceCache (journal, a, layers, maxId));
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
    /**
     * Retrieves a user by their unique nickname.
     *
     * @param nick The user's nickname (case-sensitive)
     * @return The matching GLUser or {@code null} if not found
     * @throws HibernateException if there's a database access problem
     * @throws IllegalArgumentException if nick is null or blank
     */
    public GLUser getUser(String nick) throws HibernateException {
        if (nick == null || nick.isBlank()) {
            throw new IllegalArgumentException("Nick cannot be null or blank");
        }
        List<GLUser> users = session.createQuery(
            "FROM GLUser u WHERE u.nick = :nick",
            GLUser.class
          )
          .setParameter("nick", nick)
          .setMaxResults(1)
          .getResultList();

        return users.isEmpty() ? null : users.getFirst();
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

    /**
     * Deletes balance cache entries matching specified criteria.
     *
     * @param journal  The journal to clear cache for (required)
     * @param account  The account to clear (optional)
     * @param layers   The accounting layers to clear (optional)
     * @throws HibernateException       If there's a database access problem
     * @throws IllegalArgumentException If journal is null
     */
    public void deleteBalanceCache(Journal journal, Account account, short[] layers)
      throws HibernateException
    {
        Objects.requireNonNull(journal, "Journal must not be null");
        StringBuilder hql = new StringBuilder("DELETE FROM BalanceCache bc WHERE bc.journal = :journal");
        List<Consumer<MutationQuery>> parameterSetters = new ArrayList<>();
        if (account != null) {
            hql.append(" AND bc.account = :account");
            parameterSetters.add(q -> q.setParameter("account", account));
        }
        if (layers != null && layers.length > 0) {
            hql.append(" AND bc.layers = :layers");
            String layerString = layersToString(layers);
            parameterSetters.add(q -> q.setParameter("layers", layerString));
        }
        MutationQuery query = session.createMutationQuery(hql.toString())
          .setParameter("journal", journal);
        parameterSetters.forEach(setter -> setter.accept(query));

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

    /**
     * Finds a transaction group by its exact name (case-sensitive).
     *
     * @param name The name to search for (must not be blank)
     * @return The matching transaction group or {@code null} if not found
     * @throws IllegalArgumentException if name is blank
     * @throws HibernateException if there's a database access problem
     */
    public GLTransactionGroup findTransactionGroup(String name) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Transaction group name cannot be blank");
        }
        return session.createQuery(
            "FROM GLTransactionGroup g WHERE g.name = :name",
            GLTransactionGroup.class
          )
          .setParameter("name", name)
          .setMaxResults(1)
          .getResultList()
          .stream()
          .findFirst()
          .orElse(null);
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
    private List<Account> getAccountHierarchy (Account acct)
        throws GLException
    {
        if (acct == null)
            throw new GLException ("Invalid entry - account is null");
        Account p = acct;
        List<Account> l = new ArrayList<>();
        while (p != null) {
            l.add (p);
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
    private void invalidateCheckpoints(Journal journal, Account[] accounts, Date start, Date end, short[] layers) {
        StringBuilder hql = new StringBuilder(
          "FROM Checkpoint cp WHERE cp.journal = :journal"
        );

        Map<String, Object> parameters = new HashMap<>();
        parameters.put("journal", journal);

        if (accounts.length > 0) {
            hql.append(" AND cp.account IN :accounts");
            parameters.put("accounts", Arrays.asList(accounts));
        }

        if (layers != null) {
            hql.append(" AND cp.layers = :layers");
            parameters.put("layers", layersToString(layers));
        }

        if (start.equals(end)) {
            hql.append(" AND cp.date = :date");
            parameters.put("date", start);
        } else {
            hql.append(" AND cp.date >= :startDate");
            parameters.put("startDate", start);

            if (end != null) {
                hql.append(" AND cp.date <= :endDate");
                parameters.put("endDate", end);
            }
        }

        var query = session.createQuery(hql.toString(), Checkpoint.class);
        parameters.forEach(query::setParameter);

        query.getResultList().forEach(session::delete);
    }
    private BigDecimal applyEntries(BigDecimal balance, List<GLEntry> entries) throws GLException {
        for (GLEntry entry : entries) {
            if (entry.isIncrease()) {
                balance = balance.add(entry.getAmount());
            }
            else if (entry.isDecrease()) {
                balance = balance.subtract(entry.getAmount());
            }
            else {
                throw new GLException(
                  entry + " has invalid account type"
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
    private void addRules(Map<String, RuleEntry> ruleMap, Journal journal, List<Account> acctHierarchy, int offset) {
        var query = session.createQuery(
          "FROM RuleInfo WHERE journal = :journal AND account IN (:accts) ORDER BY id",
          RuleInfo.class
        );

        query.setParameter("journal", journal)
          .setParameterList("accts", acctHierarchy)
          .setCacheable(true)
          .setCacheRegion("rules");

        for (RuleInfo ri : query.getResultList()) {
            var key = new RuleEntry(ri, ri.getAccount());
            var re = (RuleEntry) ruleMap.get(key.getKey());

            if (re == null) {
                re = key;
                ruleMap.put(key.getKey(), re);
            }

            re.addOffset(offset);
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
    private Collection<RuleEntry> getRules (GLTransaction txn)
        throws HibernateException, GLException
    {
        Map<String, RuleEntry> map = new LinkedHashMap<>();
        Journal journal   = txn.getJournal();

        Query<RuleInfo> query = session.createQuery(
          "from org.jpos.gl.RuleInfo where journal = :journal and account is null order by id",
          RuleInfo.class
        );
        query.setParameter("journal", journal);

        for (RuleInfo ri : query.getResultList()) {
            RuleEntry re = new RuleEntry(ri);
            map.put(re.getKey(), re);
        }
        int i = 0;
        for (GLEntry entry : txn.getEntries()) {
            addRules(map, journal, getAccountHierarchy(entry.getAccount()), i);
            i++;
        }

        return map.values();
    }
    private BigDecimal[] getChartBalances
        (Journal journal, CompositeAccount acct, Date date, boolean inclusive, short[] layers, long maxId)
        throws HibernateException, GLException
    {
        BigDecimal balance[] = { ZERO, ZERO };
        Iterator iter = acct.getChildren().iterator();
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
    private Iterator<Object[]> findSummarizedGLEntries(
      Journal journal, Date start, Date end, boolean credit, short layer)
      throws HibernateException, GLException {

        StringBuilder qs = new StringBuilder(
          "select entry.account, sum(entry.amount)" +
            " from org.jpos.gl.GLEntry entry" +
            " join entry.transaction txn" +
            " where entry.credit = :credit" +
            "   and txn.journal = :journal" +
            "   and entry.layer = :layer" +
            "   and txn.postDate >= :start" +
            "   and txn.postDate < :end" +  // Use < instead of <= for end date
            " group by entry.account"
        );

        Query<Object[]> q = session.createQuery(qs.toString(), Object[].class);
        q.setParameter("journal", journal);
        q.setParameter("credit", credit);
        q.setParameter("layer", layer);
        q.setParameter("start", start);
        // Use the next day for end date to include all transactions on the end date
        q.setParameter("end", Util.tomorrow(end));

        return q.getResultList().iterator();
    }
    private void deleteGLTransactions(Journal journal, Date start, Date end) {
        String deleteEntriesHql =
          "delete from org.jpos.gl.GLEntry entry " +
            "where entry.transaction.id in (" +
            "select txn.id from org.jpos.gl.GLTransaction txn " +
            "where txn.journal = :journal " +
            "and txn.postDate between :start and :end" +
            ")";

        session.createMutationQuery(deleteEntriesHql)
          .setParameter("journal", journal)
          .setParameter("start", start)
          .setParameter("end", end)
          .executeUpdate();

        String deleteTransactionsHql =
          "delete from org.jpos.gl.GLTransaction txn " +
            "where txn.journal = :journal " +
            "and txn.postDate between :start and :end";

        session.createMutationQuery(deleteTransactionsHql)
          .setParameter("journal", journal)
          .setParameter("start", start)
          .setParameter("end", end)
          .executeUpdate();
    }

    private static Short[] toShortArray (short[] i) {
        if (i == null)
            return new Short[0];
        Short[] sa = new Short[i.length];
        for (int j=0; j<i.length; j++)
            sa[j] = i[j];
        return sa;
    }

    private long getMaxGLEntryId() {
        return session.createQuery(
            "SELECT MAX(e.id) FROM GLEntry e",
            Long.class
          )
          .uniqueResultOptional()
          .orElse(0L);
    }
    private long getSafeMaxGLEntryId() {
        return TxnId.create(Instant.now().minusSeconds(SAFE_WINDOW), 0, 0).id();
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
