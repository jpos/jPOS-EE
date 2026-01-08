/*
 * jPOS Project [http://jpos.org]
 * Copyright (C) 2000-2026 jPOS Software SRL
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

package org.jpos.security;

import java.io.PrintStream;

import org.jpos.iso.ISOUtil;

/**
 * {@code SecureARNKey} represents a secure DES-based key that is associated
 * with an Account Reference Number (ARN).
 *
 * <p>
 * This class is a specialization of {@link SecureDESKey} that binds a key
 * instance to an ARN, typically used to identify accounts or transactions
 * in card-processing environments. The ARN itself is treated as metadata
 * and is not cryptographically protected by this class.
 * </p>
 *
 * <p>
 * When dumped using {@link #dump(PrintStream, String)}, the key is rendered
 * in an XML-like format including:
 * </p>
 * <ul>
 *   <li>The key scheme (always {@link KeyScheme#S}).</li>
 *   <li>An optional key name, if configured.</li>
 *   <li>The associated ARN.</li>
 *   <li>An optional key check value (KCV), if available.</li>
 * </ul>
 *
 * <p>
 * The key scheme for {@code SecureARNKey} is fixed to {@link KeyScheme#S}.
 * </p>
 *
 * @see SecureDESKey
 * @see KeyScheme
 */
public class SecureARNKey extends SecureDESKey {

    private String arn;

    /**
     * Creates an uninitialized {@code SecureARNKey}.
     *
     * <p>
     * The ARN must be set explicitly using {@link #setARN(String)} before
     * the instance is considered valid for use.
     * </p>
     */
    public SecureARNKey() {
        super();
    }

    /**
     * Creates a {@code SecureARNKey} associated with the given ARN.
     *
     * @param arn the Account Reference Number to associate with this key.
     * @throws IllegalArgumentException if the ARN is {@code null}, empty,
     *         or consists solely of whitespace.
     */
    public SecureARNKey(String arn) {
        if (arn == null || arn.trim().length() == 0)
            throw new IllegalArgumentException("ARN not set.");
        setARN(arn);
    }

    /**
     * Dumps this key in an XML-like representation to the given
     * {@link PrintStream}.
     *
     * <p>
     * The output includes the key scheme, optional key name, ARN, and
     * optional key check value. This method is intended for diagnostic
     * and configuration-export purposes only and must not be used as
     * a secure serialization mechanism.
     * </p>
     *
     * @param p the {@link PrintStream} to which the dump is written.
     * @param indent a string used to indent the output for readability.
     */
    @Override
    public void dump(PrintStream p, String indent) {

        String inner = indent + "  ";

        p.print(indent + "<secure-arn-key");
        p.print(" scheme=\"" + this.getScheme() + "\"");

        if (keyName != null)
            p.print(" name=\"" + keyName + "\"");

        p.println(">");
        p.println(inner + "<arn>" + getARN() + "</arn>");

        if (getKeyCheckValue() != null)
            p.println(inner + "<check-value>"
              + ISOUtil.hexString(getKeyCheckValue())
              + "</check-value>");

        p.println(indent + "</secure-arn-key>");
    }

    /**
     * Returns the key scheme for this key.
     *
     * <p>
     * {@code SecureARNKey} always uses the {@link KeyScheme#S} scheme.
     * </p>
     *
     * @return {@link KeyScheme#S}.
     */
    @Override
    public KeyScheme getScheme() {
        return KeyScheme.S;
    }

    /**
     * Returns the Account Reference Number (ARN) associated with this key.
     *
     * @return the ARN.
     */
    public String getARN() {
        return arn;
    }

    /**
     * Sets the Account Reference Number (ARN) for this key.
     *
     * <p>
     * This method does not perform validation; callers are responsible
     * for ensuring the ARN is non-null and semantically valid.
     * </p>
     *
     * @param arn the ARN to associate with this key.
     */
    public void setARN(String arn) {
        this.arn = arn;
    }
}
