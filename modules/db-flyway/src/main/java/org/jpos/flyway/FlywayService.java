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
            getLog().error(e.getMessage());
        }
    }

    @Override
    public void setConfiguration(Element e) throws ConfigurationException {
        commands = e.getChildText("commands");
        if (commands == null)
            commands = "info";
    }
}
