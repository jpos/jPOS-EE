package org.jpos.qi.minigl;

import com.vaadin.data.Converter;
import com.vaadin.data.Result;
import com.vaadin.data.ValueContext;
import org.jpos.ee.DB;
import org.jpos.gl.GLSession;
import org.jpos.gl.Journal;
import org.jpos.qi.QI;

public class JournalConverter implements Converter<String, Journal> {
    @Override
    public Result<Journal> convertToModel(String value, ValueContext context) {
        try {
            Journal j = DB.exec(db -> {
                GLSession gl = new GLSession(db);
                return gl.getJournal(value);
            });
            return Result.ok(j);
        } catch (Exception e) {
            QI.getQI().getLog().error(e.getMessage());
            return Result.error(e.getMessage());
        }
    }

    @Override
    public String convertToPresentation(Journal value, ValueContext context) {
        return value != null? value.getName() : null;
    }
}
