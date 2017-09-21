package org.jpos.qi.minigl;

import com.vaadin.data.Converter;
import com.vaadin.data.Result;
import com.vaadin.data.ValueContext;
import org.jpos.gl.Journal;
import org.jpos.gl.Layer;

public class ShortToLayerConverter implements Converter<Layer, Short> {
    private Journal journal;

    public ShortToLayerConverter(Journal journal) {
        super();
        this.journal = journal;
    }
    @Override
    public Result<Short> convertToModel (Layer value, ValueContext context) {
        if (value != null)
            return Result.ok(value.getId());
        return Result.ok(null);
    }

    @Override
    public Layer convertToPresentation (Short value, ValueContext context) {
        if (value != null) {
            TransactionsHelper helper = new TransactionsHelper();
            return helper.getLayer(value, journal);
        }
        return null;
    }
}
