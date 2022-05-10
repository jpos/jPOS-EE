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

package org.jpos.qi.system;

import com.vaadin.navigator.ViewChangeListener;
import com.vaadin.server.FontAwesome;
import com.vaadin.ui.Button;
import com.vaadin.ui.UIDetachedException;
import com.vaadin.ui.themes.ValoTheme;
import org.jdom2.Element;
import org.jpos.core.ConfigurationException;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ProcessView extends ObjectView {
    private String script;
    private Process p = null;
    private Button refreshBtn = null;
    private int maxLines = 50;
    private String shell;
    private static String OS = System.getProperty("os.name").toLowerCase();

    @Override
    public void run() {
        if (refreshBtn != null)
            refreshBtn.setEnabled(false);
        while (isActive()) {
            try {
                label.setValue("");
                String [] cmd = {shell, OS.contains("windows") ? "/C" : "-c", script};
                p = Runtime.getRuntime().exec(cmd);
                BufferedReader in = new BufferedReader(new InputStreamReader(p.getInputStream()));
                String line;
                StringBuilder sb = new StringBuilder("");
                for (int lines = 0; isActive() && (line = in.readLine()) != null && lines < maxLines; lines++) {
                    sb.append(' ').append(line).append('\n');
                    label.setValue(sb.toString());
                    qi.access(() -> qi.push());
                }
            } catch (IOException e) {
                qi.getLog().warn(e);
                label.setValue(e.toString());
                qi.access(() -> qi.push());
            } catch (UIDetachedException e) {
                break;
            } finally {
                if (p != null) {
                    p.destroyForcibly();
                }
            }
            if (repeat == 0)
                break;
            try {
                Thread.sleep(repeat);
            } catch (InterruptedException e) {
                break;
            }
        }
        if (refreshBtn != null)
            refreshBtn.setEnabled(true);
    }
    protected String getChildElementName() {
        return "script";
    }

    @Override
    public void setConfiguration (Element config) throws ConfigurationException {
        super.setConfiguration(config);
        maxLines = Integer.parseInt(config.getAttributeValue("maxLines", "50"));
        Element scriptConfig = getXmlConfiguration();
        if (scriptConfig != null) {
            script = scriptConfig.getText();
            shell = scriptConfig.getAttributeValue("shell",  OS.contains("windows") ? "cmd.exe" : "/bin/sh");
        }
        if (repeat == 0) {
            refreshBtn = new Button("refresh", FontAwesome.REFRESH);
            refreshBtn.setStyleName(ValoTheme.BUTTON_SMALL);
            refreshBtn.addClickListener(event -> {
                Thread runner = new Thread(this, getClass().getName());
                runner.start();
            });
            addComponent(refreshBtn);
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
