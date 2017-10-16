/*
 * jPOS Project [http://jpos.org]
 * Copyright (C) 2000-2017 jPOS Software SRL
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

import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;

import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TxnId {
    private long id;
    private static final long YMUL = 1000000000000000L;
    private static final long DMUL = 1000000000000L;
    private static final long SMUL = 10000000L;
    private static final long NMUL = 100000L;
    private Pattern pattern = Pattern.compile("^([\\d]{4})-([\\d]{3})-([\\d]{5})-([\\d]{2})-([\\d]{5})$");

    /**
     *
     * @param dt Transaction's TIMESTAMP DateTime
     * @param node node id
     * @param transactionId TransactionManager's ID
     */
    public TxnId(DateTime dt, int node, long transactionId) {
        if (dt.getZone() != DateTimeZone.UTC)
            dt = dt.toDateTime(DateTimeZone.UTC);

        init (dt.getYear(), dt.getDayOfYear(), dt.getSecondOfDay(), node, transactionId);
    }

    /**
     * @param idString TxnId in YYYY-DDD-SSS-NN-TTTTT format
     *
     * <ul>
     *   <li><code>YYYY</code> year</li>
     *   <li><code>DDD</code> day of year</li>
     *   <li><code>SSS</code> second of day</li>
     *   <li><code>NN</code> unique node number (00 to 99)</li>
     *   <li><code>TTTTT</code> last 5 digits of transaction manager's transaction id</li>
     * </ul>
     */
    public TxnId(String idString) {
        Matcher matcher = pattern.matcher(idString);
        if (!matcher.matches() && matcher.groupCount() != 5)
            throw new IllegalArgumentException("Invalid idString '" + idString + "'");
        init(
          Integer.parseInt(matcher.group(1)),
          Integer.parseInt(matcher.group(2)),
          Integer.parseInt(matcher.group(3)),
          Integer.parseInt(matcher.group(4)),
          Integer.parseInt(matcher.group(5))
        );
    }

    public TxnId(long l) {
        this.id = l;
    }

    public long id() {
        return id;
    }

    private void init (int year, int dayOfYear, int secondOfDay, int node, long transactionId) {
        id = year * YMUL
           + dayOfYear * DMUL
           + secondOfDay * SMUL
           + (node % 100) * NMUL
           + transactionId % 100000;
    }

    @Override
    public String toString() {
        long l = id;
        int yy = (int) (id / YMUL);
        l -= yy*YMUL;

        int dd = (int) (l / DMUL);
        l -= dd * DMUL;

        int ss = (int) (l / SMUL);
        l -= ss * SMUL;

        int node = (int) (l / NMUL);
        l -= node * NMUL;
        return String.format("%04d-%03d-%05d-%02d-%05d", yy, dd, ss, node, l);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TxnId tranLogId = (TxnId) o;
        return id == tranLogId.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
