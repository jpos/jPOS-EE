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

package org.jpos.transaction.participant;

import groovy.lang.Script;
import org.codehaus.groovy.runtime.StackTraceUtils;
import org.jdom2.Element;
import org.jpos.core.ConfigurationException;
import org.jpos.groovy.GroovySetup;
import org.jpos.transaction.GroupSelector;
import org.jpos.util.LogEvent;
import org.jpos.util.Logger;

import java.io.Serializable;
import java.net.URL;

/**
 * GroovyGroupSelector
 *
*/
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
            error(StackTraceUtils.deepSanitize(e));
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
