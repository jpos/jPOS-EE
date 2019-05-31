package org.jpos.qi.eeuser;

import com.vaadin.ui.Button;
import org.jpos.ee.User;
import org.jpos.qi.QI;
import org.jpos.qi.util.LinkField;

public class UserLinkField extends LinkField {

    public UserLinkField(String url) {
        super(url);
    }

    @Override
    protected void doSetValue(Object value) {
        if (value != null && value instanceof User) {
            getLink().setCaption(((User) value).getNickAndId());
            getLink().addClickListener((Button.ClickListener) event -> QI.getQI().getNavigator().navigateTo("/" + getUrl() + "/" + ((User) value).getId()));
        }
    }
}
