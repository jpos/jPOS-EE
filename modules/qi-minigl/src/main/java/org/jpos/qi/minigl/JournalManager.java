package org.jpos.qi.minigl;

import org.jpos.ee.DB;
import org.jpos.ee.DBManager;
import org.jpos.gl.Journal;

public class JournalManager extends DBManager<Journal>{

    public JournalManager(DB db) {
        super(db, Journal.class);
    }

}
