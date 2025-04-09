/*
 * jPOS Project [http://jpos.org]
 * Copyright (C) 2000-2025 jPOS Software SRL
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

import org.jdom2.Element;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author Arturo Volpe
 * @since 2022-05-12
 */
class FlywayServiceTest {

    @Test
    void test_empty_config() throws Exception {

        FlywayService flywayService = new FlywayService();
        flywayService.setConfiguration(new Element("flyway"));

        assertEquals("info", flywayService.commands);
    }

    @Test
    void test_static_config() throws Exception {

        FlywayService flywayService = new FlywayService();
        flywayService.setConfiguration(new Element("flyway")
                .addContent(new Element("commands").addContent("info"))
        );

        assertEquals("info", flywayService.commands);
    }

    @Test
    void test_env_config() throws Exception {

        System.setProperty("flyway_commands", "info migrate");
        FlywayService flywayService = new FlywayService();
        flywayService.setConfiguration(new Element("flyway")
                .addContent(new Element("commands").addContent("${flyway_commands}"))
        );

        assertEquals("info migrate", flywayService.commands);
    }
}
