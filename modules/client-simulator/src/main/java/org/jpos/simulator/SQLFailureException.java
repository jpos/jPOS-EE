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

package org.jpos.simulator;

/**
 * Exception thrown when SQL execution fails and continue-on-error is disabled.
 * <p>
 * This exception is thrown by {@link TestRunner#executeSQL(String, boolean)} when:
 * <ul>
 *   <li>The SQL statement(s) cannot be executed</li>
 *   <li>The {@code continueOnError} parameter is {@code false}</li>
 * </ul>
 * </p>
 * <p>
 * It carries the failed SQL statement and the underlying cause.
 * </p>
 *
 * @see TestRunner#executeSQL(String, boolean)
 */
public class SQLFailureException extends RuntimeException {
    /** The SQL statement that failed */
    private final String sql;

    /**
     * Creates a new SQLFailureException with the specified SQL and cause.
     *
     * @param sql   The SQL statement that failed
     * @param cause The underlying cause of the failure
     */
    public SQLFailureException (String sql, Throwable cause) {
        super("SQL execution failed: " + sql, cause);
        this.sql = sql;
    }

    /**
     * Returns the SQL statement that failed.
     *
     * @return The failed SQL statement
     */
    public String getSql () {
        return sql;
    }
}