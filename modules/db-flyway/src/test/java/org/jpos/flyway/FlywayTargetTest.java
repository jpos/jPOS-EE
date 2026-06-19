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

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FlywayTargetTest {
    @Test
    void parsesLegacyDbModifier() {
        FlywayTarget target = FlywayTarget.fromCli(new String[] { "flyway", "entity-acme:tenant" });

        assertEquals("entity-acme:tenant", target.configModifier());
        assertEquals("entity-acme:tenant", target.label());
    }

    @Test
    void parsesNamedDbAndTable() {
        FlywayTarget target = FlywayTarget.fromCli(new String[] {
          "flyway",
          "--db", "entity-acme:tenant",
          "--table", "flyway_schema_history_jpts"
        });

        assertEquals("entity-acme:tenant", target.configModifier());
        assertEquals("flyway_schema_history_jpts", target.historyTable());
        assertEquals("entity-acme:tenant/flyway_schema_history_jpts", target.label());
    }

    @Test
    void parsesPrefixAsHistoryTablePrefix() {
        FlywayTarget target = FlywayTarget.fromCli(new String[] {
          "flyway",
          "--db=entity-acme:tenant",
          "--prefix", "jpts"
        });

        assertEquals("jpts_schema_history", target.historyTable());
    }
}
