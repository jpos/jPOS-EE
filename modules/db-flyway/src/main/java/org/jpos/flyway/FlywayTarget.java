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

package org.jpos.flyway;

import org.jpos.core.Configuration;

public record FlywayTarget(String configModifier, String table, String tablePrefix) {
    public static final FlywayTarget DEFAULT = new FlywayTarget(null, null, null);

    public static FlywayTarget fromCli(String[] args) {
        String configModifier = null;
        String table = null;
        String tablePrefix = null;
        for (int i = 1; i < args.length; i++) {
            String arg = args[i];
            if ("--db".equals(arg) || "--config-modifier".equals(arg)) {
                configModifier = value(args, ++i, arg);
            } else if (arg.startsWith("--db=")) {
                configModifier = arg.substring("--db=".length());
            } else if (arg.startsWith("--config-modifier=")) {
                configModifier = arg.substring("--config-modifier=".length());
            } else if ("--table".equals(arg)) {
                table = value(args, ++i, arg);
            } else if (arg.startsWith("--table=")) {
                table = arg.substring("--table=".length());
            } else if ("--prefix".equals(arg) || "--table-prefix".equals(arg)) {
                tablePrefix = value(args, ++i, arg);
            } else if (arg.startsWith("--prefix=")) {
                tablePrefix = arg.substring("--prefix=".length());
            } else if (arg.startsWith("--table-prefix=")) {
                tablePrefix = arg.substring("--table-prefix=".length());
            } else if (!arg.startsWith("--") && configModifier == null) {
                configModifier = arg;
            } else {
                throw new IllegalArgumentException("Invalid flyway option '" + arg + "'");
            }
        }
        return new FlywayTarget(blankToNull(configModifier), blankToNull(table), blankToNull(tablePrefix));
    }

    public static FlywayTarget fromConfiguration(Configuration cfg) {
        return new FlywayTarget(
          blankToNull(cfg.get("config-modifier", null)),
          blankToNull(cfg.get("table", null)),
          blankToNull(cfg.get("table-prefix", null))
        );
    }

    public String historyTable() {
        if (table != null)
            return table;
        return tablePrefix != null ? tablePrefix + "_schema_history" : null;
    }

    public String label() {
        StringBuilder sb = new StringBuilder();
        if (configModifier != null)
            sb.append(configModifier);
        String historyTable = historyTable();
        if (historyTable != null) {
            if (sb.length() > 0)
                sb.append('/');
            sb.append(historyTable);
        }
        return sb.length() == 0 ? "" : sb.toString();
    }

    private static String value(String[] args, int index, String option) {
        if (index >= args.length)
            throw new IllegalArgumentException("Missing value for " + option);
        return args[index];
    }

    private static String blankToNull(String s) {
        return s == null || s.isBlank() ? null : s;
    }
}
