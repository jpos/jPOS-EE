package org.jpos.qi.minigl;

import org.jpos.ee.DB;
import org.jpos.ee.DBManager;
import org.jpos.gl.Layer;

public class LayerManager extends DBManager<Layer> {
    public LayerManager(DB db) {
        super(db, Layer.class);
    }
}
