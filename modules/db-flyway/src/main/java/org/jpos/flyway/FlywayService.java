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

import org.flywaydb.core.Flyway;
import org.flywaydb.core.api.MigrationInfo;
import org.flywaydb.core.api.MigrationInfoService;
import org.flywaydb.core.api.MigrationVersion;
import org.flywaydb.core.internal.info.MigrationInfoDumper;
import org.jdom2.Element;
import org.jpos.core.Environment;
import org.jpos.core.XmlConfigurable;
import org.jpos.q2.QBeanSupport;

public class FlywayService extends QBeanSupport implements XmlConfigurable {
    String commands;

    @Override
    protected void initService() {
        String dbId = "?";
        String currentCommand = "init";
        try {
            FlywaySupport support = new FlywaySupport();
            Flyway flyway = support.getFlyway(cfg.get("config-modifier", null),
              cfg.getBoolean("out-of-order") ? new String[] { "--out-of-order" } : new String[] {}
            );
            dbId = support.getDbId();
            for (String command : commands.split("\\s+")) {
                currentCommand = command.toLowerCase();
                String tag = "FLYWAY [" + dbId + "] " + currentCommand + ":";
                switch (currentCommand) {
                    case "info":
                        MigrationInfoService info = flyway.info();
                        MigrationInfo current = info.current();
                        MigrationVersion currentSchemaVersion = current == null ? MigrationVersion.EMPTY : current.getVersion();
                        MigrationVersion schemaVersionToOutput = currentSchemaVersion == null ? MigrationVersion.EMPTY : currentSchemaVersion;
                        getLog().info (tag + " schema version " + schemaVersionToOutput + System.lineSeparator() + MigrationInfoDumper.dumpToAsciiTable(info.all()));
                        break;
                    case "baseline":
                        flyway.baseline();
                        getLog().info(tag + " done");
                        break;
                    case "repair":
                        flyway.repair();
                        getLog().info(tag + " done");
                        break;
                    case "migrate":
                        var result = flyway.migrate();
                        getLog().info (tag + " applied " + result.migrationsExecuted + " migration(s)");
                        break;
                    case "validate":
                        flyway.validate();
                        getLog().info(tag + " done");
                        break;
                    case "clean":
                        flyway.clean();
                        getLog().info(tag + " done");
                        break;
                    default:
                        if (!command.isEmpty())
                            getLog().warn("FLYWAY [" + dbId + "]: invalid command '" + command + "'");
                }
            }
        } catch (Exception e) {
            getLog().error("FLYWAY [" + dbId + "] " + currentCommand + " failed", e);
        }
    }

    @Override
    public void setConfiguration(Element e) {
        commands = Environment.get(e.getChildText("commands"), "info");
    }
}
