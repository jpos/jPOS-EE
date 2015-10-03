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

package org.jpos.rest;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.bouncycastle.util.encoders.Base64;
import javax.ws.rs.core.SecurityContext;

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
    private final byte[] hash;
    private final SecurityContext securityContext;
    private final String nonce;

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
        return hash;
    }

    public String getHashAsBase64String() {
        return hash != null ? Base64.toBase64String(hash) : null;
    }

    public String getNonce() { return nonce; }

    public SecurityContext getSecurityContext() {
        return securityContext;
    }

    public String toString() {
        return new ToStringBuilder(this)
            .append("version", getVersion())
            .append("consumerId", getConsumerId())
            .append("timestamp", timestamp)
            .toString();
    }

    public static Builder builder() {
        return new Builder();
    }

    private APICredential (Builder builder) {
        this.version         = builder.version;
        this.consumerId      = builder.consumerId;
        this.timestamp       = builder.timestamp;
        this.hash            = builder.hash;
        this.securityContext = builder.securityContext;
        this.nonce           = builder.nonce;
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
