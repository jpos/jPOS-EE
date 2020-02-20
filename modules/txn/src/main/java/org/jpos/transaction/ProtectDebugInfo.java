/*
 * jPOS Project [http://jpos.org]
 * Copyright (C) 2000-2020 jPOS Software SRL
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

package org.jpos.transaction;

import org.jpos.core.Configuration;
import org.jpos.core.ConfigurationException;
import org.jpos.iso.ISOException;
import org.jpos.iso.ISOMsg;
import org.jpos.iso.ISOUtil;
import org.jpos.util.FSDMsg;
import org.jpos.util.ProtectedLogListener;

import java.io.Serializable;

/**
 * @author Alejandro Revilla
 * @author David Bergert
 */

/**
 *Sample Usage:
 *
 *    &lt;participant class="org.jpos.transaction.ProtectDebugInfo" logger="Q2" realm="debug"&gt;
 *    
 *        &lt;property name="protect-entry" value="REQUEST" /&gt;
 *        &lt;property name="protect-entry" value="RESPONSE" /&gt;
 *        &lt;property name="protect-entry" value="PAN" /&gt;
 *
 *        &lt;property name="wipe-entry" value="EXPDATE" /&gt;
 *   
 *        &lt;property name="protect-ISOMsg" value="2" /&gt;
 *        &lt;property name="protect-ISOMsg" value="35" /&gt;
 *        &lt;property name="protect-ISOMsg" value="45" /&gt;
 *        &lt;property name="wipe-ISOMsg" value="52" /&gt;
 *        &lt;property name="wipe-ISOMsg" value="55" /&gt;
 *
 *        &lt;property name="protect-FSDMsg" value="account-number" /&gt;
 *        &lt;property name="protect-FSDMsg" value="track2-data" /&gt;
 *   
 *        &lt;/participant&gt;
 **/
 
 public class ProtectDebugInfo extends TxnSupport implements AbortParticipant {
     private String[] protectedEntrys;
     private String[] wipedEntrys;
     private String[] protectFSD;
     private String[] protectISO;
     private String[] wipeISO;

     public int prepare (long id, Serializable o) {
         return PREPARED | READONLY;
     }
     public int prepareForAbort (long id, Serializable o) {
         return PREPARED | READONLY;
     }
     public void commit (long id, Serializable o) {
         protect ((Context) o);
     }
     public void abort  (long id, Serializable o) {
         protect ((Context) o);
     }
     private void protect (Context ctx) {
         /* wipe by removing entries from the context  */
         for (String s: wipedEntrys)
             ctx.remove(s);
         /* Protect entry items */           
         for (String s: protectedEntrys) {
             Object o = ctx.get (s);
             if (o instanceof ISOMsg){
                 ISOMsg m = ctx.get (s);
                 if (m != null) {
                     m = (ISOMsg) m.clone();
                     ctx.put (s, m);   // place a clone in the context
                     for (String p: protectISO)
                         protectField(m,p);
                     for (String p: wipeISO)
                         wipeField(m,p);
                 }
             }
             if (o instanceof FSDMsg){
                 FSDMsg m = ctx.get (s);
                 if (m != null) {
                     for (String p: protectFSD)
                         protectField(m,p);
                 }
             }
             if (o instanceof String){
                 String p = ctx.get(s);
                 if (p != null){
                     ctx.put(s, protect (p));    
                 }
             }  
         }
     }
     private void protectField (ISOMsg m, String f) {
         if (m != null) {
             m.set (f, protect (m.getString (f)));
         }
     }
    private void wipeField (ISOMsg m, String f) {
        if (m != null) {
            Object v = null;
            try {
                v = m.getValue(f);
                if (v != null) {
                    if (v instanceof String)
                        m.set(f, ProtectedLogListener.WIPED);
                    else
                        m.set(f, ProtectedLogListener.BINARY_WIPED);
                }
            } catch (ISOException ignored) {
                //ignore, valid routes for some messages in the context may not be vaild for others
                //e.g. in transaction switches with protocol conversion
            }
        }
    }

    private void protectField (FSDMsg m, String f) {
         if (f != null) {
             String s = m.get (f);
             if (s != null) 
                 m.set (f, ISOUtil.protect (s));
         }
     }
     private void wipeField (FSDMsg m, String f) {
         if (m != null && m.get(f) != null) {
             m.set (f, "*");
         }
     }
     private String protect (String s) {
         return s != null ? ISOUtil.protect (s) : s;
     }
     public void setConfiguration (Configuration cfg) 
         throws ConfigurationException
     {
         super.setConfiguration (cfg);
         this.protectedEntrys = cfg.getAll("protect-entry");
         this.wipedEntrys = cfg.getAll("wipe-entry");
         this.protectFSD = cfg.getAll("protect-FSDMsg");

         this.protectISO = cfg.getAll("protect-ISOMsg");
         this.wipeISO = cfg.getAll("wipe-ISOMsg");
     }
     
 }
