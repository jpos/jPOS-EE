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

package org.jpos.rest;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.bouncycastle.util.encoders.Base64;

import javax.ws.rs.core.SecurityContext;
import java.util.Arrays;

/**
 * Holder for a consumer's credential
 *
 * contains
 * <ul>
 *     <li>version</li>
 *     <li>consumerId</li>
 *     <li>timestamp</li>
 *     <li>hash</li>
 *     <li>nonce</li>
 *     <li>optional SecurityContext</li>
 * </ul>
 */

@SuppressWarnings("unused")
public class APICredential {
    private final String version;
    private final String consumerId;
    private final long timestamp;
    private byte[] hash;
    private final String nonce;
    private final SecurityContext securityContext;

    public String getVersion() {
        return version;
    }

    public String getConsumerId() {
        return consumerId;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public byte[] getHash() {
        return hash != null ? Arrays.copyOf(hash, hash.length) : null;
    }

    public APICredential withHash(byte[] hash) {
        if (this.hash == null && hash != null)
            this.hash = Arrays.copyOf(hash, hash.length);
        return this;
    }

    public String getHashAsBase64String() {
        return hash != null ? Base64.toBase64String(hash) : null;
    }

    public String getNonce() { return nonce; }

    public SecurityContext getSecurityContext() {
        return securityContext;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
            .append("version", getVersion())
            .append("consumerId", getConsumerId())
            .append("timestamp", timestamp)
            .append("hash", getHashAsBase64String())
            .toString();
    }

    @Override
    public boolean equals (Object obj) {
        if (obj == null) { return false; }
        if (obj == this) { return true; }
        if (obj.getClass() != getClass()) {
            return false;
        }
        APICredential a = (APICredential) obj;
        return new EqualsBuilder()
          .appendSuper(super.equals(obj))
          .append(version, a.version)
          .append(consumerId, a.consumerId)
          .append(timestamp, a.timestamp)
          .append(hash, a.hash)
          .append(nonce, a.nonce)
          .append(securityContext, a.securityContext).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder()
          .append(version)
          .append(consumerId)
          .append(timestamp)
          .append(hash)
          .append(nonce)
          .append(securityContext).hashCode();
    }

    public static Builder builder() {
        return new Builder();
    }

    private APICredential (Builder builder) {
        this.version         = builder.version;
        this.consumerId      = builder.consumerId;
        this.timestamp       = builder.timestamp;
        this.hash            = builder.hash;
        this.nonce           = builder.nonce;
        this.securityContext = builder.securityContext;
    }

    /**
     * API Credential builder
     */
    public static class Builder {
        // optional parameters
        private String version;
        private String consumerId;
        private long   timestamp;
        private byte[] hash;
        private SecurityContext securityContext;
        private String nonce;

        private Builder () { }

        public Builder version(String version) {
            this.version = version; return this;
        }
        public Builder consumerId(String consumerId) {
            this.consumerId = consumerId; return this;
        }
        public Builder timestamp (long timestamp) {
            this.timestamp = timestamp; return this;
        }
        public Builder hash (byte[] hash) {
            this.hash = hash; return this;
        }
        public Builder hash (String base64Hash) {
            this.hash = base64Hash != null ? Base64.decode(base64Hash) : null; return this;
        }
        public Builder securityContext (SecurityContext securityContext) {
            this.securityContext = securityContext; return this;
        }
        public Builder nonce (String nonce) {
            this.nonce = nonce; return this;
        }
        public APICredential build() {
            return new APICredential(this);
        }
    }
}
