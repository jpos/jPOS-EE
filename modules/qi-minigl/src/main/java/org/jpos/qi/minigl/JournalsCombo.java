package org.jpos.qi.minigl;

import com.vaadin.ui.ComboBox;
import com.vaadin.ui.themes.ValoTheme;
import org.jpos.ee.DB;
import org.jpos.ee.SysConfigManager;
import org.jpos.gl.GLSession;
import org.jpos.gl.Journal;
import org.jpos.qi.QI;

import java.util.List;

public class JournalsCombo extends ComboBox<Journal> {
    /**
     * Create and fill journals combo
     */
    public JournalsCombo (boolean required) {
        super(QI.getQI().getMessage("journal"));
        setItemCaptionGenerator(Journal::getName);
        setStyleName(ValoTheme.COMBOBOX_SMALL);
        setEmptySelectionAllowed(!required);

        List<Journal> journals = getJournals();
        if (journals != null) {
            setItems(journals);

            String defJournalName= getDefaultJournalName();
            Journal defJournal= journals.stream().filter(j -> defJournalName.equals(j.getName())).findFirst().orElse(null);
            setSelectedItem(defJournal);
        }ac
    }

    private List<Journal> getJournals () {
        try {
            return DB.exec(db -> {
                GLSession session = new GLSession(db);
                return session.getAllJournals();
            });
        } catch (Exception e) {
            QI.getQI().getLog().error(e);
            return null;
        }
    }

    private String getDefaultJournalName() {
        try {
            return DB.exec(db -> {
                SysConfigManager syscMgr= new SysConfigManager(db);
                return  syscMgr.get(MiniGLConstants.DEFAULT_GL_JOURNAL.toString(), "jcard");
            });
        } catch (Exception e) {
            QI.getQI().getLog().error(e);
            return null;
        }
    }
}
