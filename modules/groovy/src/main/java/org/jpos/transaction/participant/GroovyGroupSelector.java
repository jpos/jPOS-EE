package org.jpos.transaction.participant;

import groovy.lang.Script;
import org.jdom2.Element;
import org.jpos.core.ConfigurationException;
import org.jpos.transaction.GroupSelector;
import org.jpos.util.LogEvent;
import org.jpos.util.Logger;

import java.io.Serializable;


public class GroovyGroupSelector extends GroovyParticipant implements GroupSelector {

    private Object select;

    @Override
    public String select(long id, Serializable context) {
        LogEvent ev = new LogEvent(this, "select");
        String result = null;
        if (select == null)  {
            result =  defaultSelect(id, context); // nothing to do
        }
        try {
            if (compiled) {
                Script s= ((Class<Script>)select).newInstance();
                s.setBinding(newBinding(id, context));
                result = (String) s.run();
            }
            else
                result = (String) eval(getShell(id, context), select, scriptNames.get("select"));
        } catch (Exception e) {
            error(e);
        }
        ev.addMessage("select", result);
        Logger.log(ev);
        return result;
    }
    @Override
    public void setConfiguration(Element e) throws ConfigurationException {

        super.setConfiguration(e);
        select = getScript(e.getChild("select"));
    }
    public String defaultSelect(long id, Serializable context) {
        return "";
    }
}
