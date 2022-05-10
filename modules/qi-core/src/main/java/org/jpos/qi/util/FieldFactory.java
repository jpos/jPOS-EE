/*
 * jPOS Project [http://jpos.org]
 * Copyright (C) 2000-2021 jPOS Software SRL
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package org.jpos.qi.util;

import com.vaadin.data.Binder;
import com.vaadin.data.HasValue;
import com.vaadin.data.Validator;
import com.vaadin.data.converter.LocalDateToDateConverter;
import com.vaadin.data.converter.StringToIntegerConverter;
import com.vaadin.data.validator.EmailValidator;
import com.vaadin.data.validator.RegexpValidator;
import com.vaadin.data.validator.StringLengthValidator;
import com.vaadin.ui.*;
import com.vaadin.ui.themes.ValoTheme;
import org.apache.commons.lang3.StringUtils;
import org.jpos.qi.QI;
import org.jpos.qi.ViewConfig;

import java.math.BigDecimal;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.*;

import static org.jpos.qi.util.QIUtils.getCaptionFromId;

public class FieldFactory {
    private Object bean;
    private ViewConfig viewConfig;
    private Binder binder;
    private Map<String, List<Validator>> validators;

    public FieldFactory(Object bean, ViewConfig viewConfig, Binder binder) {
        this.bean = bean;
        this.viewConfig = viewConfig;
        this.binder = binder;
    }

    public FieldFactory(Object bean, ViewConfig viewConfig, Binder binder, Map<String, List<Validator>> validators) {
        this(bean, viewConfig, binder);
        this.validators = validators;
    }

    public HasValue buildAndBindField (String id) throws NoSuchFieldException {
        if (viewConfig != null) {
            ViewConfig.FieldConfig config = viewConfig.getFields().get(id);
            if (config != null && config.getOptions() != null) {
                String[] options = config.getOptions();
                HasValue optionsField = buildAndBindOptionsField(id, options);
                if (optionsField != null)
                    return optionsField;
            }
        }
        Class dataType = getDataType(id);
        if (dataType.equals(Date.class)) {
            return buildAndBindTimestampField(id);
        } else if (dataType.equals(BigDecimal.class)) {
            return buildAndBindBigDecimalField(id);
        } else if (dataType.equals(Long.class) || dataType.equals(long.class)) {
            return buildAndBindLongField(id);
        } else if (dataType.equals(Integer.class) || dataType.equals(int.class)) {
            return buildAndBindIntField(id);
        } else if (dataType.equals(Short.class) || dataType.equals(short.class)) {
            return buildAndBindShortField(id);
        } else if (dataType.equals(Boolean.class) || dataType.equals(boolean.class)) {
            return buildAndBindBooleanField(id);
        } else if (dataType.equals(String.class)) {
            return buildAndBindTextField(id);
        } else {
            return new TextField("unconfigured data type " + dataType);
        }
    }

    private Class getDataType(String id) throws NoSuchFieldException {
        Object o = bean;
        try {
            return o.getClass().getDeclaredField(id).getType();
        } catch(NoSuchFieldException e) {
            return o.getClass().getSuperclass().getDeclaredField(id).getType();
        }
    }

    protected TextField buildAndBindLongField(String id) {
        TextField field = new TextField(getCaptionFromId("field." + id));
        Binder.BindingBuilder builder = formatField(id,field);
        builder = builder.withConverter(new StringToLongFormattedConverter(0l,getApp().getMessage("errorMessage.NaN",id)));
        builder.bind(id);
        return field;
    }

    protected TextField buildAndBindIntField(String id) {
        TextField field = new TextField(getCaptionFromId("field." + id));
        Binder.BindingBuilder builder = formatField(id,field);
        builder = builder.withConverter(new StringToIntegerConverter(getApp().getMessage("errorMessage.NaN",id)));
        builder.bind(id);
        return field;
    }

    protected TextField buildAndBindShortField(String id) {
        TextField field = new TextField(getCaptionFromId("field." + id));
        Binder.BindingBuilder builder = formatField(id,field);
        builder = builder.withConverter(new StringToShortConverter());
        builder.bind(id);
        return field;
    }

    protected CheckBox buildAndBindBooleanField(String id) {
        CheckBox box = new CheckBox(StringUtils.capitalize(getCaptionFromId("field." + id)),false);
        Binder.BindingBuilder builder = formatField(id,box);
        builder.bind(id);
        return box;
    }

    protected TextField buildAndBindTextField(String id) {
        TextField field = new TextField(getCaptionFromId("field." + id));
        Binder.BindingBuilder builder = formatField(id,field);
        builder.bind(id);
        return field;
    }


    protected TextField buildAndBindTimestampField(String id) {
        TextField field = new TextField(getCaptionFromId("field." + id));
        getBinder().forField(field).withConverter(toModel -> null, toPresentation -> {
            if (toPresentation != null) {
                DateFormat dateFormat = new SimpleDateFormat(getApp().getMessage("timestampformat"));
                return dateFormat.format(toPresentation);
            }
            return "";
        }).bind(id);
        return field;
    }

    public DateField buildAndBindDateField(String id) {
        DateField dateField = new DateField(getCaptionFromId("field." + id));
        Binder.BindingBuilder builder = getBinder().forField(dateField);
        builder.withConverter(new LocalDateToDateConverter()).bind(id);
        if (viewConfig == null)
            return dateField;
        List<Validator> v = getValidators(id);
        for (Validator val : v)
            builder.withValidator(val);
        if (isRequired(id))
            builder.asRequired(getApp().getMessage("errorMessage.req", StringUtils.capitalize(getCaptionFromId("field."+id))));
        if ("endDate".equals(id))
            dateField.addValueChangeListener((HasValue.ValueChangeListener<LocalDate>) event -> dateField.addStyleName("expired-date"));
        return dateField;
    }

    public DateTimeField buildAndBindDateTimeField(String id) {
        DateTimeField dateField = new DateTimeField(getCaptionFromId("field." + id));
        Binder.BindingBuilder builder = getBinder().forField(dateField);
        builder.withConverter(new LocalDateToDateConverter()).bind(id);
        if (viewConfig == null)
            return dateField;
        List<Validator> v = getValidators(id);
        for (Validator val : v)
            builder.withValidator(val);
        if (isRequired(id))
            builder.asRequired(getApp().getMessage("errorMessage.req", StringUtils.capitalize(getCaptionFromId("field."+id))));
        if ("endDate".equals(id))
            dateField.addValueChangeListener((HasValue.ValueChangeListener<LocalDateTime>) event -> dateField.addStyleName("expired-date"));
        return dateField;
    }

    protected TextField buildAndBindBigDecimalField(String id) {
        TextField field = new TextField(getCaptionFromId("field." + id));
        field.addStyleName(ValoTheme.TEXTFIELD_ALIGN_RIGHT);
        Binder.BindingBuilder builder = formatField(id,field);
        builder = builder.withConverter(new AmountConverter(getApp().getMessage("errorMessage.NaN",id)));
        builder.withNullRepresentation(BigDecimal.ZERO).bind(id);
        return field;
    }

    protected ComboBox buildAndBindOptionsField(String id, String[] options) {
        if (options != null) {
            ComboBox field = new ComboBox(getCaptionFromId("field." + id), Arrays.asList(options));
            Binder.BindingBuilder builder = formatField(id, field);
            builder.bind(id);
            return field;
        }
        return null;
    }

    public Binder.BindingBuilder formatField(String id, HasValue field) {
        Binder.BindingBuilder builder = getBinder().forField(field);
        if (viewConfig == null)
            return builder;
        List<Validator> v = getValidators(id);
        for (Validator val : v)
            builder.withValidator(val);
        if (isRequired(id))
            builder.asRequired(getApp().getMessage("errorMessage.req",StringUtils.capitalize(getCaptionFromId("field."+id))));
        if (!(field instanceof ComboBox))
            builder = builder.withNullRepresentation("");
        ViewConfig.FieldConfig config = viewConfig.getFields().get(id);
        String width = config != null ? config.getWidth() : null;
        if (field instanceof AbstractComponent)
            ((AbstractComponent)field).setWidth(width);
        return builder;
    }

    //Reads regex and length from 00_qi.xml
    //Override to add more customValidators
    public List<Validator> getValidators(String propertyId) {
        if (viewConfig == null)
            return Collections.emptyList();
        List<Validator> validators = new ArrayList<>();
        ViewConfig.FieldConfig config = viewConfig.getFields().get(propertyId);
        if (config != null) {
            String regex = config.getRegex();
            int length = config.getLength();
            if (regex != null)
                validators.add(new RegexpValidator(getApp().getMessage("errorMessage.invalidField", getApp().getMessage("field." + propertyId)),regex));
            if (length > 0)
                validators.add(new StringLengthValidator(getApp().getMessage("errorMessage.invalidField", getApp().getMessage("field." + propertyId)),0,length));
            if ("email".equals(propertyId)) {
                validators.add(new EmailValidator(getApp().getMessage("errorMessage.invalidEmail")) {
                    @Override
                    protected boolean isValid(String value) {
                        return value == null || value.isEmpty() || super.isValid(value);
                    }
                });
            }
        }

        if (this.validators != null)
            validators.addAll(this.validators.getOrDefault(propertyId, Collections.emptyList()));

        return validators;
    }

    public boolean isLinkField (String propertyId) {
        return viewConfig != null && viewConfig.getFields().keySet().contains(propertyId) &&
                viewConfig.getFields().get(propertyId).getLink() != null;
    }

    public boolean isRequired(String propertyId) {
        return viewConfig != null && viewConfig.getFields().keySet().contains(propertyId) &&
          viewConfig.getFields().get(propertyId).isRequired();
    }

    public Binder getBinder() {
        return binder;
    }

    public void setBinder(Binder binder) {
        this.binder = binder;
    }

    public QI getApp () {
        return (QI) QI.getCurrent();
    }
}
