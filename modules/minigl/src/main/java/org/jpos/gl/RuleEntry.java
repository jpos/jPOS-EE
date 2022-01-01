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

package org.jpos.gl;

class RuleEntry {
    RuleInfo ri;
    String param;
    Account account;
    int[] offsets;

    public RuleEntry (RuleInfo ri) {
        super();
        this.ri = ri;
    }
    public RuleEntry (RuleInfo ri, Account acct) {
        super();
        this.ri = ri;
        this.account = acct;
    }
    public String getKey() {
        StringBuffer sb = new StringBuffer (Long.toString (ri.getId()));
        if (account != null) {
            sb.append ('.');
            sb.append (Long.toString (account.getId()));
        }
        return sb.toString();
    }
    public RuleInfo getRuleInfo() {
        return ri;
    }
    public Account getAccount() {
        return account;
    }
    public void addOffset (int i) {
        if (offsets == null) {
            offsets = new int[1];
        } else {
            int[] o = new int[offsets.length + 1];
            System.arraycopy (offsets, 0, o, 0, offsets.length);
            offsets = o;
        }
        offsets[offsets.length-1] = i;
    }
    public int[] getOffsets () {
        return offsets;
    }
    public String toString() {
        StringBuffer sb = new StringBuffer ();
        sb.append (ri.getClazz());
        if (ri.getParam() != null) {
            sb.append ('[');
            sb.append (ri.getParam());
            sb.append (']');
        }
        if (account != null) {
            sb.append ('[');
            sb.append (account.toString());
            sb.append (']');
        }
        if (offsets != null) {
            sb.append ('[');
            for (int i=0; i<offsets.length; i++) {
                if (i > 0)
                    sb.append (',');
                sb.append (offsets[i]);
            }
            sb.append (']');
        }
        return sb.toString();
    }
}

