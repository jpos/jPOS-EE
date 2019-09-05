package org.jpos.qi.sysconfig;

import com.vaadin.data.Converter;
import com.vaadin.data.Result;
import com.vaadin.data.ValueContext;
import org.jpos.ee.DB;
import org.jpos.ee.SysConfig;
import org.jpos.ee.SysConfigManager;
import org.jpos.qi.QI;

public class SysConfigConverter implements Converter<SysConfig, String> {
    private String prefix;
    private boolean useValue;

    public SysConfigConverter () {
        this(null, false);
    }

    public SysConfigConverter (String prefix) {
        this (prefix, false);
    }
    public SysConfigConverter (String prefix, boolean useValue) {
        super();
        this.prefix = prefix;
        this.useValue = useValue;
    }

    @Override
    public Result<String> convertToModel(SysConfig value, ValueContext context) {
        if (value == null)
            return Result.error("NULL value");
        else {
            String id = prefix != null ? value.getId().substring(prefix.length()) : value.getId();
            String modelToSave = useValue ? value.getValue() : id;
            return Result.ok(modelToSave);
        }
    }

    @Override
    public SysConfig convertToPresentation(String value, ValueContext context) {
        if (value != null) {
            try {
                return DB.exec( (db) -> {
                    SysConfigManager mgr = new SysConfigManager(db, prefix);
                    return mgr.getObject(value);
                });
            } catch (Exception e) {
                QI.getQI().getLog().error(e);
            }
        }
        return null;
    }
}
