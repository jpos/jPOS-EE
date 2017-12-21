package org.jpos.qi.system;

import com.vaadin.icons.VaadinIcons;
import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewDisplay;
import com.vaadin.ui.*;
import com.vaadin.ui.themes.ValoTheme;
import org.jpos.qi.QI;
import org.jpos.qi.views.DefaultView;

/**
 * Created by jr on 12/14/17.
 */
public class EmptyView extends DefaultView implements ViewDisplay  {

    public EmptyView(boolean canAdd) {
        Label emptyLabel = new Label("There are no items in this view");
        emptyLabel.addStyleName(ValoTheme.LABEL_H2);
        addComponents(emptyLabel);
        setComponentAlignment(emptyLabel, Alignment.TOP_CENTER);
        setExpandRatio(emptyLabel,0);
        if (canAdd) {
            Button addNew = new Button(QI.getQI().getMessage("add"));
            addNew.setIcon(VaadinIcons.PLUS);
            String actualRoute = QI.getQI().getNavigator().getState();
            addNew.addClickListener(listener -> QI.getQI().getNavigator().navigateTo(actualRoute + "/new"));
            addNew.addStyleName(ValoTheme.BUTTON_LARGE);
            addNew.addStyleName(ValoTheme.BUTTON_FRIENDLY);
            addComponent(addNew);
            setComponentAlignment(addNew,Alignment.TOP_CENTER);
            setExpandRatio(addNew,1);
        }

    }


    @Override
    public void showView(View view) {

    }
}
