/*
 * jPOS Project [http://jpos.org]
 * Copyright (C) 2000-2017 jPOS Software SRL
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

import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener;
import com.vaadin.server.FontAwesome;
import com.vaadin.shared.ui.ContentMode;
import com.vaadin.ui.*;
import com.vaadin.ui.themes.ValoTheme;
import org.jpos.core.Configurable;
import org.jpos.core.Configuration;
import org.jpos.iso.ISOUtil;
import org.jpos.qi.QI;
import org.jpos.server.ui.XLabel;
import org.jpos.space.Space;
import org.jpos.space.SpaceFactory;
import org.jpos.space.SpaceUtil;
import org.jpos.util.*;
import org.vaadin.sliderpanel.SliderPanel;
import org.vaadin.sliderpanel.SliderPanelBuilder;
import org.vaadin.sliderpanel.client.SliderMode;
import org.vaadin.sliderpanel.client.SliderTabPosition;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.*;
import java.util.concurrent.atomic.AtomicBoolean;

public class LogListenerView extends CssLayout
       implements Runnable, View, LogListener, ViewChangeListener, Configurable
{
    private AtomicBoolean active = new AtomicBoolean();
    private AtomicBoolean paused = new AtomicBoolean();
    private int maxSize;
    private BufferedLogListener bll;
    private static long BUFFER_TIMEOUT = 60000L;
    private Space<String,LogEvent> sp;
    private String key;
    private Thread runner;
    private Button pause;
    private Label label;
    private Configuration cfg;
    private Map<String, CheckBox> realms;
    private Layout realmsLayout;
    private boolean shouldResume;
    private QI qi;

    @SuppressWarnings("unchecked")
    public LogListenerView () {
        super();
        qi = QI.getQI();
        sp = (Space<String,LogEvent>) SpaceFactory.getSpace();
        key = toString();
        pause = new Button();
        pause.setIcon(FontAwesome.PAUSE);
        pause.addStyleName(ValoTheme.BUTTON_TINY);
        pause.addStyleName("qi-float-right");
        pause.addClickListener((Button.ClickListener) event -> togglePause());
        realms = new TreeMap<>();
        realmsLayout = new VerticalLayout();

        addStyleName("console");
        label = new XLabel ();
        label.setStyleName ("console");
        label.setWidth("100%");
        label.setContentMode(ContentMode.PREFORMATTED);

        addComponent(createSlider());
        addComponent (label);
        addComponent (pause);
    }

    public void enter(ViewChangeListener.ViewChangeEvent event) {
        String loggerName = cfg.get("name");
        bll = (BufferedLogListener) NameRegistrar.getIfExists (loggerName);
        if (bll == null) {
            QI.getQI().displayError ("loglistener.config.error", "loglistener.config.detail", loggerName);
            return;
        }
        maxSize = bll.getMaxSize();
        event.getNavigator().addViewChangeListener(this);
        if (bll != null) {
            bll.addListener(this);
        }
        active.set(true);
        runner = new Thread(this, getClass().getName());
        runner.start();
        // QI.getQI().getHeader().addComponent(pause);
    }

    @Override
    public boolean beforeViewChange(ViewChangeEvent event) {
        if (event.getNewView() != this) {
            active.set(false);
            if (bll != null)
                bll.removeListener (this);
            try {
                runner.join();
            } catch (InterruptedException ignore) { }
            removeAllComponents();
            SpaceUtil.wipe(sp, key);
            // QI.getQI().getHeader().removeComponent(pause);
        }
        return true;
    }

    @Override
    public void afterViewChange(ViewChangeEvent event) { }

    @Override
    public void run() {
        ISOUtil.sleep (500L);
        while (active.get() && !paused.get()) {
            boolean needScroll = false;
            sp.rd(key, 1000L);
            for (LogEvent evt; !paused.get() && (evt = sp.inp (key)) != null;) {
                label.setValue(toString(evt));
                try {
                    qi.access(() -> QI.getQI().push());
                } catch (UIDetachedException e) {
                    break;
                }
                needScroll = true;
            }
            if (needScroll) {
                qi.scrollIntoView(pause);
            }
        }
    }

    public LogEvent log(LogEvent event) {
        String r = event.getRealm();
        CheckBox cb = realms.get(r);
        if (cb != null) {
            if (!cb.getValue())
                return event; // ignore
        } else {
            cb = new CheckBox(r);
            cb.setValue(true);
            realms.put(r, cb);
            realmsLayout.setSizeUndefined();
            realmsLayout.addComponent (cb);
        }
        sp.out(key, new FrozenLogEvent(event), BUFFER_TIMEOUT);
        return event;
    }

    public void setConfiguration (Configuration cfg) {
        this.cfg = cfg;
    }

    private String toString(LogEvent evt) {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream p = new PrintStream (baos);
        evt.dump (p, " ");
        return baos.toString();
    }

    private void pause() {
        pause.setIcon(FontAwesome.PLAY);
        paused.set(true);
        try {
            if (runner != null)
                runner.join();
        } catch (InterruptedException ignore) { }
    }

    private void resume() {
        pause.setIcon(FontAwesome.PAUSE);
        pause.setEnabled(true);
        paused.set(false);
        if (active.get()) {
            runner = new Thread(this, getClass().getName());
            runner.start();
        }
    }

    private void togglePause() {
        if (paused.get()) {
            resume();
        } else {
            pause();
        }
    }

    private SliderPanel createSlider() {
        SliderPanel slider = new SliderPanelBuilder(realmsLayout, QI.getQI().getMessage("realms"))
          .expanded(false)
          .mode(SliderMode.TOP)
          .tabPosition(SliderTabPosition.MIDDLE)
          .build();
        slider.addToggleListener(event -> {
            if (event.isExpand()) {
                shouldResume = !paused.get();
                if (shouldResume) {
                    pause();
                    QI.getQI().scrollIntoView(slider);
                }
            } else if (shouldResume) {
                resume();
            }
        });
        return slider;
    }
}
