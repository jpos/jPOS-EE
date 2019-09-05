package org.jpos.qi.sysconfig;

import com.vaadin.data.provider.DataProvider;
import com.vaadin.ui.ComboBox;
import com.vaadin.ui.ItemCaptionGenerator;
import org.jpos.ee.DB;
import org.jpos.ee.SysConfig;
import org.jpos.ee.SysConfigManager;

import java.util.Collection;
import java.util.List;

public class SysConfigComboBox extends ComboBox {
    public SysConfigComboBox (String caption, DataProvider dataProvider) {
        super(caption);
        setDataProvider(dataProvider);
        setItemCaptionGenerator((ItemCaptionGenerator<SysConfig>) SysConfig::getValue);
        setEmptySelectionAllowed(false);
    }


    public SysConfigComboBox (String caption, Collection<SysConfig> items) {
        super(caption);
        setItems(items);
        setItemCaptionGenerator((ItemCaptionGenerator<SysConfig>) SysConfig::getValue);
        setEmptySelectionAllowed(false);
    }

    public SysConfigComboBox (String caption, String prefix) throws Exception {
        super(caption);
        List items = DB.exec(db -> {
            SysConfigManager mgr = new SysConfigManager(db, prefix);
            return mgr.getAllByValue();
        });
        setItems(items);
        setItemCaptionGenerator((ItemCaptionGenerator<SysConfig>) SysConfig::getValue);
        setEmptySelectionAllowed(false);
    }
}
