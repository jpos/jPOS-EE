/*
 * jPOS Project [http://jpos.org]
 * Copyright (C) 2000-2016 Alejandro P. Revilla
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

package org.jpos.qi.system;

import com.vaadin.navigator.ViewChangeListener;
import com.vaadin.ui.UIDetachedException;
import org.jdom2.Element;
import org.jpos.core.ConfigurationException;
import org.jpos.iso.ISOUtil;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ProcessView extends ObjectView {
    private String script;
    private Process p = null;

    @Override
    public void run() {
        while (isActive()) {
            try {
                p = Runtime.getRuntime().exec(script);
                BufferedReader in = new BufferedReader(new InputStreamReader(p.getInputStream()));
                String line;
                while (isActive() && (line = in.readLine()) != null) {
                    label.setValue(line);
                    qi.access(() -> qi.push());
                }
            } catch (IOException e) {
                qi.getLog().warn(e);
            } catch (UIDetachedException e) {
                break;
            } finally {
                if (p != null) {
                    p.destroyForcibly();
                }
            }
            if (repeat == 0)
                break;
            ISOUtil.sleep(repeat);
        }
    }
    protected String getChildElementName() {
        return "script";
    }

    @Override
    public void setConfiguration (Element config) throws ConfigurationException {
        super.setConfiguration(config);
        Element scriptConfig = getXmlConfiguration();
        if (scriptConfig != null) {
            script = scriptConfig.getText();
        }
    }

    @Override
    protected boolean needsThread() {
        return true;
    }

    @Override
    public boolean beforeViewChange(ViewChangeListener.ViewChangeEvent event) {
        if (event.getNewView() != this) {
            if (p != null) {
                p.destroyForcibly();
                p = null;
            }
        }
        return super.beforeViewChange(event);
    }
}
