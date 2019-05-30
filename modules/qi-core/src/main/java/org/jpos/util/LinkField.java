package org.jpos.util;

import com.vaadin.ui.Button;
import com.vaadin.ui.Component;
import com.vaadin.ui.CustomField;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.themes.ValoTheme;

public abstract class LinkField extends CustomField<Object> {
    private Button link;
    private String url;

    public LinkField (String url) {
        link = new Button();
        link.setStyleName(ValoTheme.BUTTON_LINK);
        this.url = url;
    }

    @Override
    protected Component initContent() {
        VerticalLayout vl = new VerticalLayout(link);
        vl.setMargin(false);
        vl.setSpacing(false);
        return vl;
    }

    @Override
    protected abstract void doSetValue(Object value);

    @Override
    public Object getValue() {
        return link.getCaption();
    }

    public Button getLink() {
        return link;
    }

    public void setLink(Button link) {
        this.link = link;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
