/*
 * jPOS Project [http://jpos.org]
 * Copyright (C) 2000-2015 Alejandro P. Revilla
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

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.List;

import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.encoders.Base64;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.ObjectNotFoundException;
import org.hibernate.criterion.Restrictions;
import org.jpos.iso.ISOUtil;
import org.jpos.security.SystemSeed;

import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEKeySpec;

/**
 * @author Alejandro Revilla
 */
public class UserManager {
    DB db;
    VERSION version;
    public UserManager (DB db) {
        super ();
        this.db = db;
        version = VERSION.ZERO;
    }

    public UserManager (DB db, VERSION version) {
        super ();
        this.db = db;
        this.version = version;
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
    public User getUserByNick (String nick)
            throws HibernateException
    {
        return getUserByNick(nick, false);
    }
    public User getUserByNick (String nick, boolean includeDeleted)
        throws HibernateException
    {
        try {
            Criteria crit = db.session().createCriteria (User.class)
                .add (Restrictions.eq ("nick", nick));
            if (!includeDeleted)
                crit = crit.add (Restrictions.eq ("deleted", Boolean.FALSE));
            return (User) crit.uniqueResult();
        } catch (ObjectNotFoundException ignored) { }
        return null;
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

    public boolean checkPassword (User u, String clearpass)
            throws HibernateException, BLException
    {
        assertNotNull(clearpass, "Invalid pass");
        String passwordHash = u.getPassword();
        assertNotNull(passwordHash, "Password is null");
        VERSION v = VERSION.getVersion(passwordHash);
        assertTrue(v != VERSION.UNKNOWN, "Unknown password");
        switch (v.getVersion()) {
            case (byte) 0:
                return (passwordHash.equals(getV0Hash(u.getId(), clearpass)));
            case (byte) 1:
                byte[] b = Base64.decode(passwordHash);
                byte[] salt = new byte[VERSION.ONE.getSalt().length];
                byte[] clientSalt = new byte[VERSION.ONE.getSalt().length];
                System.arraycopy (b, 1, salt, 0, salt.length);
                System.arraycopy(b, 1 + salt.length, clientSalt, 0, clientSalt.length);
                clearpass = clearpass.startsWith("v1:") ? clearpass.substring(3) : upgradeClearPassword(clearpass, clientSalt);
                String computedPasswordHash = genV1Hash(clearpass, VERSION.ONE.getSalt(salt), clientSalt);
                return computedPasswordHash.equals(u.getPassword());
        }
        return false;
    }

    /**
     * @param u the user
     * @param clearpass new password in clear
     * @return true if password is in PasswordHistory
     */
    public boolean checkNewPassword (User u, String clearpass) {
        // TODO - we need to reuse client hash in order to check duplicates
        String newHash = getV0Hash(u.getId(), clearpass);
        if (newHash.equals(u.getPassword()))
            return false;
        for (PasswordHistory p : u.getPasswordhistory()) {
            if (p.getValue().equals(newHash))
                return false;
        }
        return true;
    }

    public void setPassword(User u, String clearpass) throws BLException {
        setPassword(u, clearpass, null);
    }

    public void setPassword (User u, String clearpass, User author) throws BLException {
        if (u.getPassword() != null)
            u.addPasswordHistoryValue(u.getPassword());
        switch (version) {
            case ZERO:
                setV0Password(u, clearpass);
                break;
            case ONE:
                setV1Password (u, clearpass);
                break;
        }
        RevisionManager revmgr = new RevisionManager(db);
        if (author == null)
            author = u;
        revmgr.createRevision (author, "user." + u.getId(), "Password changed");
        db.session().saveOrUpdate(u);
    }

    // VERSION ZERO IMPLEMENTATION
    private static String getV0Hash (long id, String pass) {
        String hash = null;
        try {
            MessageDigest md = MessageDigest.getInstance ("SHA");
            md.update (Long.toString(id,16).getBytes());
            hash = ISOUtil.hexString (
                md.digest (pass.getBytes())
            ).toLowerCase();
        } catch (NoSuchAlgorithmException e) {
            // should never happen
        }
        return hash;
    }
    private void setV0Password (User u, String clearpass) {
        u.setPassword(getV0Hash(u.getId(), clearpass));
    }

    // VERSION ONE IMPLEMENTATION
    private String upgradeClearPassword (String clearpass, byte[] salt) {
        return ISOUtil.hexString(genV1ClientHash(clearpass, salt));
    }

    private byte[] genSalt(int l) {
        SecureRandom sr;
        try {
            sr = SecureRandom.getInstance("SHA1PRNG");
            byte[] salt = new byte[l];
            sr.nextBytes(salt);
            return salt;
        } catch (NoSuchAlgorithmException ignored) {
            // Should never happen, SHA1PRNG is a supported algorithm
        }
        return null;
    }

    public boolean upgradePassword (User u, String clearpass)
            throws HibernateException, BLException
    {
        assertNotNull(clearpass, "Invalid pass");
        String passwordHash = u.getPassword();
        assertNotNull(passwordHash, "Password is null");
        VERSION v = VERSION.getVersion(passwordHash);
        if (v == VERSION.ZERO && passwordHash.equals(getV0Hash(u.getId(), clearpass))) {
            setV1Password(u, clearpass);
            return true;
        }
        return false;
    }

    private void setV1Password (User u, String pass) throws BLException {
        assertNotNull(pass, "Invalid password");
        byte[] clientSalt;
        byte[] serverSalt = genSalt(VERSION.ONE.getSalt().length);
        if (pass.startsWith("v1:")) {
            byte[] b = Base64.decode(u.getPassword());
            clientSalt = new byte[VERSION.ONE.getSalt().length];
            System.arraycopy (b, 1+clientSalt.length, clientSalt, 0, clientSalt.length);
            pass = pass.substring(3);
        } else {
            clientSalt = genSalt(VERSION.ONE.getSalt().length);
            pass = upgradeClearPassword(pass, clientSalt);
        }
        u.setPassword(genV1Hash(pass, serverSalt, clientSalt));
    }

    private String genV1Hash(String password, byte[] salt, byte[] clientSalt) throws BLException {
        try {
            SecretKeyFactory skf = SecretKeyFactory.getInstance("PBKDF2WithHmacSHA256");
            int iterations = VERSION.ONE.getIterations();
            PBEKeySpec spec = new PBEKeySpec(password.toCharArray(), salt, iterations, 2048);
            return org.bouncycastle.util.encoders.Base64.toBase64String(
                    Arrays.concatenate(
                            new byte[]{VERSION.ONE.getVersion()},
                            VERSION.ONE.getSalt(salt),
                            clientSalt,
                            skf.generateSecret(spec).getEncoded())
            );
        } catch (Exception e) {
            throw new BLException (e.getLocalizedMessage());
        }
    }

    private byte[] genV1ClientHash (String clearpass, byte[] seed) {
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            int iterations = VERSION.ONE.getIterations();
            byte[] passAsBytes = clearpass.getBytes(StandardCharsets.UTF_8);
            for (int i=0; i<iterations; i++) {
                if (i % 7 == 0)
                    md.update(seed);
                md.update(passAsBytes);
            }
            return md.digest();
        } catch (NoSuchAlgorithmException e) {
            // should never happen, SHA-256 is a supported algorithm
        }
        return null;
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
