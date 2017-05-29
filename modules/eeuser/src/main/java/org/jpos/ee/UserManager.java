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

package org.jpos.ee;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.encoders.Base64;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.criterion.Restrictions;
import org.hibernate.query.criteria.internal.OrderImpl;
import org.jpos.iso.ISOUtil;
import org.jpos.security.SystemSeed;

import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEKeySpec;
import javax.persistence.criteria.*;

/**
 * @author Alejandro Revilla
 */
public class UserManager {
    DB db;
    VERSION version;

    public UserManager (DB db) {
        this (db, VERSION.ONE);
    }

    public UserManager (DB db, VERSION version) {
        super ();
        this.db = db;
        this.version = version;
    }

    public void setPassword (User u, String clearpass) throws BLException {
        setPassword(u, clearpass, null, version);
    }

    public void setPassword (User u, String clearpass, User author) throws BLException {
        setPassword(u, clearpass, author, version);
    }

    public void setPassword (User u, String clearpass, User author, VERSION v) throws BLException {
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
        return db.session().createCriteria (User.class)
                .add (Restrictions.eq ("deleted", Boolean.FALSE))
                .list();
    }

    public List getAll(int offset, int limit, Map<String,Boolean> orders) {
        CriteriaBuilder criteriaBuilder = db.session().getCriteriaBuilder();
        CriteriaQuery<User> query = criteriaBuilder.createQuery(User.class);
        Root<User> root = query.from(User.class);
        List<Order> orderList = new ArrayList<>();
        //ORDERS
        for (Map.Entry<String,Boolean> entry : orders.entrySet()) {
            OrderImpl order = new OrderImpl(root.get(entry.getKey()),entry.getValue());
            orderList.add(order);
        }
        //Get only non-deleted
        Predicate notDeleted = criteriaBuilder.isFalse(root.get("deleted"));

        query.select(root);
        query.orderBy(orderList);
        query.where(notDeleted);
        return db.session().createQuery(query)
                .setFirstResult(offset)
                .setMaxResults(limit)
                .getResultList();
    }

    public int getItemCount() {
        CriteriaBuilder criteriaBuilder = db.session().getCriteriaBuilder();
        CriteriaQuery<Long> query = criteriaBuilder.createQuery(Long.class);
        Root<User> root = query.from(User.class);
        Predicate notDeleted = criteriaBuilder.isFalse(root.get("deleted"));
        query.where(notDeleted);
        query.select(criteriaBuilder.count(root));
        return db.session().createQuery(query).getSingleResult().intValue();
    }

    public User getUserByNick (String nick)
            throws HibernateException
    {
        return getUserByNick(nick, false);
    }
    public User getUserByNick (String nick, boolean includeDeleted)
        throws HibernateException
    {
        Criteria crit = db.session().createCriteria(User.class)
                .add(Restrictions.eq("nick", nick));
        if (!includeDeleted)
            crit = crit.add (Restrictions.eq ("deleted", Boolean.FALSE));
        return (User) crit.uniqueResult();
    }

    /**
     * @param nick name.
     * @param pass hash
     * @return the user
     * @throws BLException if invalid user/pass
     * @throws HibernateException on low level hibernate related exception
     */
    public User getUserByNick (String nick, String pass)
        throws HibernateException, BLException
    {
        User u = getUserByNick(nick);
        assertNotNull (u, "User does not exist");
        assertTrue(checkPassword(u, pass), "Invalid password");
        return u;
    }

    public User getUserById(long id, boolean includeDeleted) throws HibernateException {
        Criteria crit = db.session().createCriteria(User.class)
                .add(Restrictions.eq("id", id));
        if (!includeDeleted)
            crit = crit.add (Restrictions.eq ("deleted", Boolean.FALSE));
        return (User) crit.uniqueResult();
    }

    public User getUserById(long id)
            throws HibernateException {
        return getUserById(id,false);
    }

    public boolean checkPassword (User u, String clearpass)
            throws HibernateException, BLException
    {
        assertNotNull(clearpass, "Invalid pass");
        String passwordHash = u.getPasswordHash();
        assertNotNull(passwordHash, "Password is null");
        VERSION v = VERSION.getVersion(passwordHash);
        assertTrue(v != VERSION.UNKNOWN, "Unknown password");
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
    public boolean checkNewPassword (User u, String clearpass) throws BLException {
        if (checkPassword (u, clearpass)) {
            return false; // same password not allowed
        }
        for (PasswordHistory p : u.getPasswordhistory()) {
            VERSION v = VERSION.getVersion(p.getValue());
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

    public boolean upgradePassword (User u, String clearpass)
            throws HibernateException, BLException
    {
        assertNotNull(clearpass, "Invalid pass");
        String passwordHash = u.getPasswordHash();
        assertNotNull(passwordHash, "Password is null");
        VERSION v = VERSION.getVersion(passwordHash);
        if (v == VERSION.ZERO && checkV0Password(passwordHash, u.getId(), clearpass)) {
            setPassword(u, clearpass, null, VERSION.ONE);
            return true;
        }
        return false;
    }

    public VERSION getVersion() {
        return version;
    }

    public void setVersion(VERSION version) {
        this.version = version;
    }

    private void setV1Password (User u, String clearpass) throws BLException {
        assertNotNull(clearpass, "Invalid password");
        byte[] salt = genSalt(VERSION.ONE.getSalt().length);
        u.setPasswordHash(genV1Hash(clearpass, salt));
    }

    private String genV1Hash(String password, byte[] salt) throws BLException {
        try {
            SecretKeyFactory skf = SecretKeyFactory.getInstance("PBKDF2WithHmacSHA256");
            int iterations = VERSION.ONE.getIterations();
            PBEKeySpec spec = new PBEKeySpec(password.toCharArray(), salt, iterations, VERSION.ONE.getKeylength());
            return org.bouncycastle.util.encoders.Base64.toBase64String(
                Arrays.concatenate(
                    new byte[]{VERSION.ONE.getVersion()},
                    VERSION.ONE.getSalt(salt),
                    skf.generateSecret(spec).getEncoded())
            );
        } catch (Exception e) {
            throw new BLException (e.getLocalizedMessage());
        }
    }

    private boolean checkV1Password (String passwordHash, String clearpass) throws BLException {
        byte[] b = Base64.decode(passwordHash);
        byte[] salt = new byte[VERSION.ONE.getSalt().length];
        System.arraycopy (b, 1, salt, 0, salt.length);
        String computedPasswordHash = genV1Hash(clearpass, VERSION.ONE.getSalt(salt));
        return computedPasswordHash.equals(passwordHash);
    }

    private boolean checkV0Password(String passwordHash, long id, String clearpass) {
        return passwordHash.equals(genV0Hash(id, clearpass));
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

    private static String genV0Hash(long id, String clearpass) {
        String hash = null;
        try {
            MessageDigest md = MessageDigest.getInstance ("SHA");
            md.update (Long.toString(id,16).getBytes());
            hash = ISOUtil.hexString (
                md.digest (clearpass.getBytes())
            ).toLowerCase();
        } catch (NoSuchAlgorithmException e) {
            // should never happen
        }
        return hash;
    }
    private void setV0Password (User u, String clearpass) throws BLException {
        assertNotNull(clearpass, "Invalid password");
        u.setPasswordHash(genV0Hash(u.getId(), clearpass));
    }

    private byte[] genSalt(int len) {
        SecureRandom sr;
        try {
            sr = SecureRandom.getInstance("SHA1PRNG");
            byte[] salt = new byte[len];
            sr.nextBytes(salt);
            return salt;
        } catch (NoSuchAlgorithmException ignored) {
            // Should never happen, SHA1PRNG is a supported algorithm
        }
        return null;
    }

    public enum VERSION {
        UNKNOWN((byte)0xFF, 0, 0, 0, null),
        ZERO((byte)0, 0, 160, 40, null),
        ONE((byte) 1,100000,2048, 388, Base64.decode("K7f2dgQQHK5CW6Wz+CscUA=="));

        private byte version;
        private int iterations;
        private int keylength;
        private int encodedLength;
        private byte[] salt;

        VERSION(byte version, int iterations, int keylength, int encodedLength, byte[] salt) {
            this.version = version;
            this.iterations = iterations;
            this.keylength = keylength;
            this.encodedLength = encodedLength;
            this.salt = salt;
        }

        public byte getVersion() {
            return version;
        }
        public int getIterations() {
            return iterations;
        }
        public int getKeylength() {
            return keylength;
        }

        public int getEncodedLength() {
            return encodedLength;
        }

        public byte[] getSalt() {
            return ISOUtil.xor(salt, SystemSeed.getSeed(salt.length, salt.length));
        }
        public byte[] getSalt(byte[] salt) {
            return ISOUtil.xor(salt, getSalt());
        }
        public static VERSION getVersion (String hash) {
            for (VERSION v : VERSION.values()) {
                if (v.getEncodedLength() == hash.length())
                    return v;
                if (v != UNKNOWN && v != ZERO) {
                    byte[] b = Base64.decode(hash);
                    if (b[0] == v.getVersion())
                        return v;
                }
            }
            return UNKNOWN;
        }
    }
}
