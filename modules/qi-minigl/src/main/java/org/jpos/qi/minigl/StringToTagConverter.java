package org.jpos.qi.minigl;


import com.vaadin.data.Converter;
import com.vaadin.data.Result;
import com.vaadin.data.ValueContext;
import org.jpos.util.Tags;

/**
 * Created by jr on 4/25/16.
 */
public class StringToTagConverter implements Converter<String,Tags> {
    @Override
    public Result<Tags> convertToModel(String value, ValueContext context) {
        if (value != null && !value.isEmpty())
            return Result.ok(new Tags(value));
        return Result.ok(null);
    }

    @Override
    public String convertToPresentation(Tags value, ValueContext context) {
        if (value != null)
            return value.toString();
        return "";
    }
}
