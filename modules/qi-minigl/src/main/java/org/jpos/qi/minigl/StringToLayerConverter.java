package org.jpos.qi.minigl;

import com.vaadin.data.Converter;
import com.vaadin.data.Result;
import com.vaadin.data.ValueContext;
import org.jpos.gl.Journal;
import org.jpos.gl.Layer;

public class StringToLayerConverter implements Converter<Layer, String> {
    private Journal journal;

    public StringToLayerConverter(Journal journal) {
        super();
        this.journal = journal;
    }
    @Override
    public Result<String> convertToModel (Layer value, ValueContext context) {
        if (value != null)
            return Result.ok(String.valueOf(value.getId()));
        return Result.ok(null);
    }

    @Override
    public Layer convertToPresentation (String value, ValueContext context) {
        if (value != null) {
            TransactionsHelper helper = new TransactionsHelper();
            return helper.getLayer(Short.parseShort(value), journal);
        }
        return null;
    }
}
