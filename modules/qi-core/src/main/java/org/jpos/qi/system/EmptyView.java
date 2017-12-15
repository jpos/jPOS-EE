package org.jpos.qi.system;

import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewDisplay;
import com.vaadin.ui.Button;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Label;
import com.vaadin.ui.themes.ValoTheme;
import org.jpos.qi.QI;
import org.jpos.qi.views.DefaultView;

/**
 * Created by jr on 12/14/17.
 */
public class EmptyView extends DefaultView implements ViewDisplay  {

    public EmptyView(boolean canAdd) {
        if (canAdd) {
            Button addNew = new Button(QI.getQI().getMessage("add"));
            String actualRoute = QI.getQI().getNavigator().getState();
            addNew.addClickListener(listener -> QI.getQI().getNavigator().navigateTo(actualRoute + "/new"));
            addNew.addStyleName(ValoTheme.BUTTON_LARGE);
            addNew.addStyleName(ValoTheme.BUTTON_FRIENDLY);
            HorizontalLayout hl = new HorizontalLayout(addNew);
            addComponentsAndExpand(hl);
        } else {
            HorizontalLayout hl = new HorizontalLayout(new Label("empty"));
            addComponentsAndExpand(hl);
        }

    }


    @Override
    public void showView(View view) {

    }
}
