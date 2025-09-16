package org.jpos.q2.cli.crypto;

import org.jpos.ee.DB;
import org.jpos.sysconfig.SysConfigManager;
import org.jpos.q2.CLICommand;
import org.jpos.q2.CLIContext;

import java.util.ArrayList;
import java.util.List;

public class REKEYALL implements CLICommand {
    @Override
    public void exec(CLIContext cli, String[] args) throws Exception {
        List<String> argl = new ArrayList<>();
        argl.add(args[0]);
        try (DB db = new DB()) {
            db.open();
            SysConfigManager mgr = new SysConfigManager(db, "key.");
            mgr.getAll()
              .stream()
              .map(sc -> sc.getId().substring(4))
              .forEach(argl::add);
        } catch (Exception e) {
            cli.println(e.getMessage());
        }
        new REKEY().exec(cli, argl.toArray(new String[0]));
    }
}

