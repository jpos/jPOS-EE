package org.jpos.q2.cli.flyway;

import org.flywaydb.core.Flyway;
import org.flywaydb.core.api.MigrationInfo;
import org.flywaydb.core.api.MigrationInfoService;
import org.flywaydb.core.api.MigrationVersion;
import org.flywaydb.core.internal.info.MigrationInfoDumper;
import org.jpos.flyway.FlywaySupport;
import org.jpos.q2.CLICommand;
import org.jpos.q2.CLIContext;
import org.jpos.q2.cli.FLYWAY;

public class INFO extends FlywaySupport implements CLICommand{
    @Override
    public void exec(CLIContext cli, String[] args) {
        try {
            Flyway flyway = getFlyway((String) cli.getUserData().get(FLYWAY.PREFIX), args);
            MigrationInfoService info = flyway.info();
            MigrationInfo current = info.current();
            MigrationVersion currentSchemaVersion = current == null ? MigrationVersion.EMPTY : current.getVersion();
            MigrationVersion schemaVersionToOutput = currentSchemaVersion == null ? MigrationVersion.EMPTY : currentSchemaVersion;

            cli.println("Schema version: " + schemaVersionToOutput);
            cli.println("");
            cli.println(MigrationInfoDumper.dumpToAsciiTable(info.all()));
        } catch (Exception e) {
            cli.println (e.getMessage());
        }
    }
}
