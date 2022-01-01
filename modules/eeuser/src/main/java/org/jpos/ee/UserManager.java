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

package org.jpos.ee;

import java.util.Date;
import java.util.List;

import org.bouncycastle.util.encoders.Base64;
import org.hibernate.HibernateException;

import javax.persistence.criteria.*;

/**
 * @author Alejandro Revilla
 */
public class UserManager extends DBManager<User> {
    private HashVersion version;

    public UserManager (DB db) {
        this (db, HashVersion.ONE);
    }

    public UserManager (DB db, HashVersion version) {
        super (db, User.class);
        this.version = version;
    }

    public void setPassword (User u, String clearpass) throws Exception {
        setPassword(u, clearpass, null, version);
    }

    public void setPassword (User u, String clearpass, User author) throws Exception {
        setPassword(u, clearpass, author, version);
    }

    public void setPassword (User u, String clearpass, User author, HashVersion v) throws Exception {
        if (u.getPasswordHash() != null)
            u.addPasswordHistoryValue(u.getPasswordHash());
        switch (v) {
            case ZERO:
                setV0Password (u, clearpass);
                break;
            case ONE:
                setV1Password (u, clearpass);
                break;
        }
        u.setPasswordChanged(new Date());
        u.setForcePasswordChange(false);
        RevisionManager revmgr = new RevisionManager(db);
        if (author == null)
            author = u;
        revmgr.createRevision(author, "user." + u.getId(), "Password changed");
        db.session().saveOrUpdate(u);
    }

    /**
     * @return all users
     * @throws HibernateException on low level hibernate related exception
     */
    public List findAll () throws HibernateException {
        return super.getAll();
    }

    @Override
    protected Predicate[] buildFilters(Root<User> root) {
        return new Predicate[] {
                db.session().getCriteriaBuilder().isFalse(root.get("deleted"))
        };
    }

    public User getUserByNick (String nick)
            throws HibernateException
    {
        return getUserByNick(nick, false);
    }
    public User getUserByNick (String nick, boolean includeDeleted)
        throws HibernateException
    {
        return getItemByParam("nick",nick,!includeDeleted);
    }

    /**
     * @param nick name.
     * @param pass hash
     * @return the user
     * @throws BLException if invalid user/pass
     * @throws HibernateException on low level hibernate related exception
     */
    public User getUserByNick (String nick, String pass) throws Exception {
        User u = getUserByNick(nick);
        assertNotNull (u, "User does not exist");
        assertTrue(checkPassword(u, pass), "Invalid password");
        return u;
    }

    public User getUserById(long id, boolean includeDeleted) throws HibernateException {
        return getItemByParam("id",id,!includeDeleted);
    }

    public User getUserById(long id)
            throws HibernateException {
        return getUserById(id,false);
    }

    public boolean checkPassword (User u, String clearpass) throws Exception {
        assertNotNull(clearpass, "Invalid pass");
        String passwordHash = u.getPasswordHash();
        assertNotNull(passwordHash, "Password is null");
        HashVersion v = HashVersion.getVersion(passwordHash);
        assertTrue(v != HashVersion.UNKNOWN, "Unknown password");
        switch (v) {
            case ZERO:
                return checkV0Password(passwordHash, u.getId(), clearpass);
            case ONE:
                return checkV1Password(passwordHash, clearpass);
        }
        return false;
    }

    /**
     * @param u the user
     * @param clearpass new password in clear
     * @return true if password is in PasswordHistory
     */
    public boolean checkNewPassword (User u, String clearpass) throws Exception {
        if (checkPassword (u, clearpass)) {
            return false; // same password not allowed
        }
        for (PasswordHistory p : u.getPasswordhistory()) {
            HashVersion v = HashVersion.getVersion(p.getValue());
            switch (v) {
                case ZERO:
                    if (checkV0Password(p.getValue(), u.getId(), clearpass))
                        return false;
                case ONE:
                    if (checkV1Password (p.getValue(), clearpass))
                        return false;
            }
        }
        return true;
    }

    public boolean upgradePassword (User u, String clearpass) throws Exception
    {
        assertNotNull(clearpass, "Invalid pass");
        String passwordHash = u.getPasswordHash();
        assertNotNull(passwordHash, "Password is null");
        HashVersion v = HashVersion.getVersion(passwordHash);
        if (v == HashVersion.ZERO && checkV0Password(passwordHash, u.getId(), clearpass)) {
            setPassword(u, clearpass, null, HashVersion.ONE);
            return true;
        }
        return false;
    }

    public HashVersion getVersion() {
        return version;
    }

    public void setVersion(HashVersion version) {
        this.version = version;
    }

    private void setV1Password (User u, String clearpass) throws Exception {
        assertNotNull(clearpass, "Invalid password");
        u.setPasswordHash(HashVersion.ONE.hash(Long.toString(u.getId(),16), clearpass, HashVersion.ONE.getSalt()));
    }

    private boolean checkV1Password (String passwordHash, String clearpass) throws Exception {
        return HashVersion.ONE.check("", clearpass, passwordHash);
    }

    private boolean checkV0Password(String passwordHash, long id, String clearpass) throws Exception {
        return passwordHash.equals(HashVersion.ZERO.hash(Long.toString(id, 16), clearpass, null));
    }

    // HELPER METHODS
    protected void assertNotNull (Object obj, String error) throws BLException {
        if (obj == null)
            throw new BLException (error);
    }
    protected void assertTrue (boolean condition, String error)
            throws BLException
    {
        if (!condition)
            throw new BLException (error);
    }

    private void setV0Password (User u, String clearpass) throws Exception {
        assertNotNull(clearpass, "Invalid password");
        u.setPasswordHash(HashVersion.ZERO.hash(Long.toString(u.getId()), clearpass, null));
    }
}
