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

package org.jpos.flyway;

import org.flywaydb.core.Flyway;
import org.flywaydb.core.api.MigrationInfo;
import org.flywaydb.core.api.MigrationInfoService;
import org.flywaydb.core.api.MigrationVersion;
import org.flywaydb.core.internal.info.MigrationInfoDumper;
import org.jdom2.Element;
import org.jpos.core.ConfigurationException;
import org.jpos.core.XmlConfigurable;
import org.jpos.q2.QBeanSupport;

public class FlywayService extends QBeanSupport implements XmlConfigurable {
    String commands;

    @Override
    protected void initService() {
        try {
            Flyway flyway = new FlywaySupport().getFlyway(cfg.get("config-modifier", null),
              cfg.getBoolean("out-of-order") ? new String[] { "--out-of-order" } : new String[] {}
            );
            for (String command : commands.split("\\s+")) {
                switch (command.toLowerCase()) {
                    case "info":
                        MigrationInfoService info = flyway.info();
                        MigrationInfo current = info.current();
                        MigrationVersion currentSchemaVersion = current == null ? MigrationVersion.EMPTY : current.getVersion();
                        MigrationVersion schemaVersionToOutput = currentSchemaVersion == null ? MigrationVersion.EMPTY : currentSchemaVersion;
                        getLog().info ("Schema version: " + schemaVersionToOutput + System.lineSeparator() + MigrationInfoDumper.dumpToAsciiTable(info.all()));
                        break;
                    case "baseline":
                        flyway.baseline();
                        getLog().info("FLYWAY: baseline done");
                        break;
                    case "repair":
                        flyway.repair();
                        getLog().info("FLYWAY: repair done");
                        break;
                    case "migrate":
                        int count = flyway.migrate();
                        getLog().info ("FLYWAY: applied " + count + " migration(s)");
                        break;
                    case "validate":
                        flyway.validate();
                        getLog().info("FLYWAY: validate done");
                        break;
                    case "clean":
                        flyway.clean();
                        getLog().info("FLYWAY: clean done");
                        break;
                    default:
                        if (!command.isEmpty())
                            getLog().warn("FLYWAY: invalid command '" + command + "'");
                }
            }
        } catch (Exception e) {
            getLog().error(e);
        }
    }

    @Override
    public void setConfiguration(Element e) throws ConfigurationException {
        commands = e.getChildText("commands");
        if (commands == null)
            commands = "info";
    }
}
