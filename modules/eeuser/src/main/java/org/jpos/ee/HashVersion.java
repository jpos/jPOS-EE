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

import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.encoders.Base64;
import org.jpos.iso.ISOUtil;
import org.jpos.security.SystemSeed;

import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEKeySpec;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;

public enum HashVersion {
    UNKNOWN((byte)0xFF, 0, 0, 0, null) {
        @Override
        public String hash (String seed, String secret, byte[] salt) {
            throw new IllegalStateException("invalid version");
        }

        @Override
        public boolean check (String seed, String secret, String hash ) {
            throw new IllegalStateException("invalid version");
        }
    },
    ZERO((byte)0, 0, 160, 40, null) {
        @Override
        public String hash (String seed, String secret, byte[] salt) throws NoSuchAlgorithmException {
            MessageDigest md = MessageDigest.getInstance ("SHA");
            md.update (seed.getBytes());
            return ISOUtil.hexString (
              md.digest (secret.getBytes())
            ).toLowerCase();
        }

        @Override
        public boolean check (String seed, String secret, String hash) throws NoSuchAlgorithmException {
            return hash.equals(hash(seed, secret, null));
        }
    },
    ONE((byte) 1,100000,2048, 388, Base64.decode("K7f2dgQQHK5CW6Wz+CscUA==")) {
        @Override
        public String hash (String seed, String secret, byte[] salt) throws Exception {
            if (salt == null) {
                salt = ONE.genSalt();
            }
            SecretKeyFactory skf = SecretKeyFactory.getInstance("PBKDF2WithHmacSHA256");
            PBEKeySpec spec = new PBEKeySpec(secret.toCharArray(), salt, ONE.iterations, ONE.keylength);

            return org.bouncycastle.util.encoders.Base64.toBase64String(
              Arrays.concatenate(
                new byte[]{HashVersion.ONE.getVersion()},
                ONE.getSalt(salt),
                skf.generateSecret(spec).getEncoded())
            );
        }

        @Override
        public boolean check (String seed, String secret, String hash) throws Exception {
            byte[] b = Base64.decode(hash);
            byte[] salt = new byte[ONE.getSalt().length];
            System.arraycopy (b, 1, salt, 0, salt.length);
            String computedHash = ONE.hash(seed, secret, ONE.getSalt(salt));
            return computedHash.equals(hash);
        }

    };

    private byte version;
    private int iterations;
    private int keylength;
    private int encodedLength;
    private byte[] salt;

    HashVersion (byte version, int iterations, int keylength, int encodedLength, byte[] salt) {
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

    public static HashVersion getVersion (String hash) {
        for (HashVersion v : HashVersion.values()) {
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

    public abstract String hash (String seed, String secret, byte[] salt) throws Exception;
    public abstract boolean check (String seed, String secret, String hash) throws Exception;

    private byte[] genSalt () throws NoSuchAlgorithmException {
        return genSalt(salt.length);
    }

    private byte[] genSalt(int len) throws NoSuchAlgorithmException {
        SecureRandom sr = new SecureRandom();
        byte[] salt = new byte[len];
        sr.nextBytes(salt);
        return salt;
    }
}
