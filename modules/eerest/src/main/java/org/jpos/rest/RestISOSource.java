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

import org.jpos.iso.ISOMsg;
import org.jpos.iso.ISOSource;

/**
 * ISOSource for REST api communication with txn manager. There must be one
 * instance of this source for each communication in order to work fine.
 *
 * @author jpaoletti
 */
public class RestISOSource implements ISOSource {
    private ISOMsg resp = null;
    public void send(ISOMsg m) {
        synchronized (this) {
            resp = m;
            this.notify();
        }
    }
    public boolean isConnected() {
        return true;
    }
    public ISOMsg getResponse(long timeout) {
        synchronized (this) {
            try {
                this.wait(timeout);
            } catch (InterruptedException ignored) { }
        }
        return resp;
    }
}

