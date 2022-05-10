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

package org.jpos.crypto;

import org.bouncycastle.openpgp.PGPException;
import org.jdom2.Element;
import org.jpos.core.Configuration;
import org.jpos.core.ConfigurationException;
import org.jpos.core.XmlConfigurable;
import org.jpos.q2.QBeanSupport;
import org.jpos.q2.QFactory;
import org.jpos.space.Space;
import org.jpos.space.TSpace;
import org.jpos.util.*;
import org.jpos.security.SensitiveString;

import javax.crypto.*;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.security.*;
import java.util.*;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.Supplier;

/**
 * Provides AES encryption service
 *
 * Sample Configuration:
 * <pre>
 *  <crypto-service class='org.jpos.cryptoservice.CryptoService' logger='Q2'>
 *    <property name="custodian" value='demo@jpos.org' />
 *    <property name="pubkeyring" value='cfg/keyring.pub' />
 *    <property name="privkeyring" value='cfg/keyring.priv' />
 *    <property name="lazy" value="true" />
 *    <property name="keylength" value="256" />
 *   </crypto-service>
 * </pre>
 *
 * CryptoService generates a random AES key and stores it in sysconfig encrypted using PGP
 * under the custodian(s) keys. Before using decrypt operations, the key most be "loaded"
 * and that requires the private key-ring's password.
 *
 */
public final class CryptoService extends QBeanSupport implements Runnable, XmlConfigurable {
    private volatile UUID id;
    private volatile SecretKey sk;
    private volatile long timestamp;
    private Space<UUID, SecretKey> keys = new TSpace<>();

    private CountDownLatch ready = new CountDownLatch(1);
    private Semaphore sem = new Semaphore(1);
    private AtomicBoolean lazy = new AtomicBoolean(false);
    private static final String AES = "AES/CBC/PKCS5Padding";
    private String pubKeyRing;
    private String privKeyRing;
    private long waitTimeout;
    private long ttl;
    private long duration;
    private Supplier<String> unlock;
    private static SecureRandom rnd;
    private CryptoServiceKeyStoreProvider ksProvider;

    static {
        rnd = new SecureRandom();
    }

    /**
     * Encrypts data using the current key
     * @param b data to encrypt
     * @return SecureData object including cryptogram, key id, and IV
     * @throws Exception if crypto service not properly started
     */
    public SecureData aesEncrypt (byte[] b) throws Exception {
        if (lazy.getAndSet(false))
            new Thread(this, getName()+"-lazy").start();

        final Cipher cipher = Cipher.getInstance(AES, "BC");
        final byte[] iv = randomIV();

        if (!ready.await(waitTimeout, TimeUnit.MILLISECONDS))
            throw new IllegalStateException("Service unavailable");

        sem.acquire();
        if (isExpired()) {
            this.timestamp = System.currentTimeMillis();
            new Thread(this, getName() + "-renew").start();
        }
        SecretKey wk = sk;
        UUID wid = id;
        sem.release();
        
        cipher.init(Cipher.ENCRYPT_MODE, wk, new IvParameterSpec(iv));
        byte[] enc = cipher.doFinal(b);
        ByteBuffer buf = ByteBuffer.allocate(iv.length + enc.length);
        buf.put(iv);
        buf.put(enc);
        return new SecureData(wid, buf.array());
    }

    /**
     * Decrypts data. Requires a "loaded" key (@see loadKey method).
     *
     * @param jobId jobId
     * @param keyId the key id
     * @param encoded encoded cryptogram
     * @return clear text
     * @throws Exception if key is not loaded
     */
    public byte[] aesDecrypt (UUID jobId, UUID keyId, byte[] encoded) throws Exception
    {
        UUID xid = xor(jobId, keyId);
        SecretKey sk = keys.rdp(xid);
        if (sk == null && unlock != null) {
            loadKey(jobId, keyId, unlock.get().toCharArray());
            sk = keys.rdp(xid);
        }
        if (sk == null) {
            throw new SecurityException("Key not loaded");
        }
        byte[] iv = new byte[16];
        byte[] cryptogram = new byte[encoded.length - iv.length];
        System.arraycopy(encoded, 0, iv, 0, iv.length);
        System.arraycopy(encoded, iv.length, cryptogram, 0, cryptogram.length);
        return decrypt(sk, new IvParameterSpec(iv), cryptogram);
    }

    /**
     * Load key, enables decryption
     *
     * @param jobId job id
     * @param keyId key to load
     * @param password private key-ring password
     * @throws Exception if invalid key
     */
    public void loadKey (UUID jobId, UUID keyId, char[] password) throws Exception {
        UUID xid = xor(jobId, keyId);

        if (keys.rdp(xid) == null)
            keys.put(xid, getKey(keyId, password), ttl);
    }

    /**
     * Unloads key
     * @param jobId optional job id
     * @param keyId the key id
     * @return true if key was cached, false otherwise
     */
    public boolean unloadKey (UUID jobId, UUID keyId) {
        return keys.inp(xor(jobId, keyId)) != null;
    }

    /**
     * Unlock the CryptoService
     */
    public boolean unlock (Supplier<String> passwordSupplier) {
        try {
            if (isLocked()) {
                // attempt encrypt/decrypt
                UUID id = UUID.randomUUID();
                SecretKey sk = generateKey();
                byte[] b = pgpEncrypt(id.toString(), sk.getEncoded());
                PGPHelper.decrypt(b, privKeyRing, passwordSupplier.get().toCharArray());
                sem.acquire();
                this.unlock = passwordSupplier;
                sem.release();
            }
            return true;
        } catch (Exception e) {
            getLog().warn(e);
            return false;
        }
    }

    /**
     * Lock the CryptoService
     */
    public void lock () {
        this.unlock = null;
    }

    public boolean isLocked () {
        return unlock == null;
    }

    @Override
    protected void initService() throws ConfigurationException {
        if (!lazy.get())
            new Thread(this, getName()).start();
        NameRegistrar.register(getName(), this);
    }

    @Override
    protected void stopService() {
        NameRegistrar.unregister(getName());
    }

    @Override
    public void run() {
        try {
            renewKey();
        } catch (Exception e) {
            getLog().error(e);
        }
    }

    @Override
    public void setConfiguration (Configuration cfg) throws ConfigurationException {
        super.setConfiguration(cfg);
        lazy.set(cfg.getBoolean("lazy"));
        pubKeyRing = cfg.get("pubkeyring", "cfg/keyring.pub");
        privKeyRing = cfg.get("privkeyring", "cfg/keyring.priv");
        waitTimeout = cfg.getLong("timeout", 30000L);
        ttl = cfg.getLong("ttl", 3600000L);
        duration = cfg.getLong("duration", 86400000L);
        String unlockPassword = cfg.get("unlock-password", null);
        if (unlockPassword != null) {
            try {
                unlock (new SensitiveString(unlockPassword));
            } catch (NoSuchAlgorithmException | NoSuchPaddingException | InvalidKeyException | IllegalBlockSizeException | BadPaddingException | NoSuchProviderException | InvalidAlgorithmParameterException e) {
                throw new ConfigurationException(e);
            }
        }
    }

    private SecretKey generateKey() throws NoSuchAlgorithmException {
        KeyGenerator keyGen = KeyGenerator.getInstance("AES");
        keyGen.init(cfg.getInt("keylength", 256));
        return keyGen.generateKey();
    }

    private byte[] pgpEncrypt(String id, byte[] clearText)
      throws NoSuchAlgorithmException, PGPException, NoSuchProviderException, IOException {
        return PGPHelper.encrypt(clearText, pubKeyRing, id, true, true, cfg.getAll("custodian"));
    }

    private void renewKey () throws Exception {
        UUID id = UUID.randomUUID();
        SecretKey sk = generateKey();
        registerKey(id.toString(), new String(pgpEncrypt(id.toString(), sk.getEncoded())));
        sem.acquire();
        this.id = id;
        this.sk = sk;
        this.timestamp = System.currentTimeMillis();
        if (ready.getCount() > 0)
            ready.countDown();
        sem.release();
    }

    private void registerKey(String k, String v) throws Exception {
        ksProvider.put(k, v);
        LogEvent evt = getLog().createLogEvent("security");
        evt.addMessage("<id>" + k + "</id>");
        evt.addMessage(System.lineSeparator() + v);
        Logger.log(evt);
    }

    private SecretKey getKey (UUID keyId, char[] passPhrase) throws Exception {
        if (passPhrase == null && unlock == null)
            throw new SecurityException("Passphrase not available");
        passPhrase = passPhrase != null ? passPhrase : unlock.get().toCharArray();

        String v = ksProvider.get(keyId.toString());
        if (v == null) {
            throw new SecurityException("Invalid key");
        }
        byte[] key = PGPHelper.decrypt(
          v.getBytes(),
          privKeyRing,
          passPhrase
        );
        return new SecretKeySpec(key, 0, key.length, "AES");

    }

    private byte[] decrypt (SecretKey sk, IvParameterSpec iv, byte[] cryptogram)
      throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, BadPaddingException,
      IllegalBlockSizeException, NoSuchProviderException, InvalidAlgorithmParameterException
    {
        final Cipher cipher = Cipher.getInstance(AES, "BC");
        cipher.init(Cipher.DECRYPT_MODE, sk, iv);
        return cipher.doFinal(cryptogram);
    }

    private byte[] randomIV() {
        final byte[] b = new byte[16];
        rnd.nextBytes(b);
        return b;
    }

    private boolean isExpired () {
        return System.currentTimeMillis() - timestamp > duration;
    }

    private UUID xor (UUID a, UUID b) {
        return new UUID(
          a.getMostSignificantBits() ^ b.getMostSignificantBits(),
          a.getLeastSignificantBits() ^ b.getLeastSignificantBits());
    }


    @Override
    public void setConfiguration(Element e) throws ConfigurationException {
        Element kse = e.getChild("ks-provider");
        if (kse != null) {
            QFactory factory = getFactory();
            Object obj = factory.newInstance(kse.getAttributeValue("class"));
            if (obj instanceof CryptoServiceKeyStoreProvider) {
                factory.setLogger(obj, kse);
                factory.setConfiguration(obj, kse);
                ksProvider = (CryptoServiceKeyStoreProvider) obj;
            }
        }
        if (ksProvider == null) {
            throw new ConfigurationException ("Unconfigured ks-provider");
        }
    }
}
