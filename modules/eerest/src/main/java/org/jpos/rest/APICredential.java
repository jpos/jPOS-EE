/*
 * jPOS Project [http://jpos.org]
 * Copyright (C) 2000-2013 Alejandro P. Revilla
 *
 * THIS PROGRAM IS NOT FREE SOFTWARE and access to it should
 * be considered PRIVILEGED and CONFIDENTIAL.
 *
 * See license details in the PGP-signed file LICENSE.asc
 * available in the top level directory of this project.
 *
 * LICENSE.asc SHA-1 b1f42375545e1eb6351af9219f8949bc8563f1a3
 */

package org.jpos.rest;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.bouncycastle.util.encoders.Base64;
import org.jpos.iso.ISODate;

import javax.ws.rs.core.SecurityContext;

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
