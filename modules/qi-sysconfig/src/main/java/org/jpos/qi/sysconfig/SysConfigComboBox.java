package org.jpos.qi.sysconfig;

import com.vaadin.data.provider.DataProvider;
import com.vaadin.ui.ComboBox;
import com.vaadin.ui.ItemCaptionGenerator;
import org.jpos.ee.SysConfig;

public class SysConfigComboBox extends ComboBox {
    public SysConfigComboBox (String caption, DataProvider dataProvider) {
        super(caption);
        setDataProvider(dataProvider);
        setItemCaptionGenerator((ItemCaptionGenerator<SysConfig>) SysConfig::getValue);
        setEmptySelectionAllowed(false);
    }
}
