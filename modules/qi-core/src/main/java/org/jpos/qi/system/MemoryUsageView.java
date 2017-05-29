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
import com.vaadin.shared.ui.ContentMode;
import com.vaadin.ui.*;
import org.dussan.vaadin.dcharts.DCharts;
import org.dussan.vaadin.dcharts.base.elements.XYaxis;
import org.dussan.vaadin.dcharts.base.elements.XYseries;
import org.dussan.vaadin.dcharts.base.renderers.MarkerRenderer;
import org.dussan.vaadin.dcharts.data.DataSeries;
import org.dussan.vaadin.dcharts.metadata.XYaxes;
import org.dussan.vaadin.dcharts.metadata.renderers.LabelRenderers;
import org.dussan.vaadin.dcharts.metadata.styles.MarkerStyles;
import org.dussan.vaadin.dcharts.options.*;
import org.dussan.vaadin.dcharts.renderers.tick.AxisTickRenderer;
import org.jpos.iso.ISOUtil;
import org.jpos.qi.QI;
import org.vaadin.addons.d3Gauge.Gauge;
import org.vaadin.addons.d3Gauge.GaugeConfig;
import org.vaadin.addons.d3Gauge.GaugeStyle;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

public class MemoryUsageView extends VerticalLayout implements View, Runnable, ViewChangeListener {
    private Label available;
    private Label allocated;
    private Label used;
    private AtomicBoolean active = new AtomicBoolean();
    private Gauge memoryGauge;
    private Button forceGC;
    private DCharts chart;
    private DataSeries ds;
    private static final List<Integer> inUseMemory = new ArrayList<Integer>();
    private static ScheduledExecutorService checkMemory;
    private QI qi;

    static {
        checkMemory = Executors.newScheduledThreadPool(1);
        checkMemory.scheduleAtFixedRate(new Thread() {
            public void run() {
                logMemoryUsage();
            }
        }, 0L, 5, TimeUnit.SECONDS);
        for (int i = 0; i<60; i++)
            inUseMemory.add(0);
    }

    public MemoryUsageView () {
        super();
        qi = (QI) UI.getCurrent();
        setSpacing(false);
        setMargin(true);
        setSizeFull();
        available  = createLabel();
        allocated  = createLabel();
        used       = createLabel();
        forceGC    = new Button(qi.getMessage("memory-usage.force.gc"));

        GridLayout gl = new GridLayout (3,3);
        gl.addComponent(strong (qi.getMessage("memory-usage.availableMemory")));
        gl.addComponent (available); gl.setComponentAlignment(available, Alignment.TOP_RIGHT);
        gl.addComponent (createMBLabel());

        gl.addComponent(strong (qi.getMessage("memory-usage.allocatedMemory")));
        gl.addComponent (allocated); gl.setComponentAlignment(allocated, Alignment.TOP_RIGHT);
        gl.addComponent (createMBLabel());

        gl.addComponent(strong (qi.getMessage("memory-usage.usedMemory")));
        gl.addComponent (used); gl.setComponentAlignment(used, Alignment.TOP_RIGHT);
        gl.addComponent (createMBLabel());


        HorizontalLayout hl = new HorizontalLayout();
        hl.setWidth("75%");
        hl.addComponent (gl);
        hl.setComponentAlignment(gl, Alignment.MIDDLE_CENTER);
        hl.addComponent (memoryGauge = createGauge("Memory", 0));
        hl.setComponentAlignment(memoryGauge, Alignment.MIDDLE_CENTER);
        hl.addComponent (forceGC);
        hl.setComponentAlignment(forceGC, Alignment.MIDDLE_CENTER);
        forceGC.addClickListener((Button.ClickListener) event -> gc());

        addComponent (hl);
        setComponentAlignment(hl, Alignment.MIDDLE_CENTER);
        Label l = new Label(""); l.setHeight("30px");
        addComponent (l);

        chart = new DCharts();
        ds = new DataSeries();

        AxesDefaults axesDefaults = new AxesDefaults()
          .setLabelRenderer(LabelRenderers.CANVAS);

        Axes axes = new Axes()
          .addAxis (new XYaxis(XYaxes.X)
            .setLabel("Time (last 300 seconds)")
            .setLabelRenderer(LabelRenderers.AXIS)
            .setPad(0)
          )
          .addAxis (new XYaxis(XYaxes.Y)
            .setLabel("In use memory percentage")
            .setPad(0)
            .setTickOptions(new AxisTickRenderer()
              .setFormatString("%.2f%"))
          );
        Cursor cursor = new Cursor()
          .setShow(true);

        Series series = new Series()
          .addSeries(
            new XYseries()
            .setLineWidth(0.5f)
            .setMarkerOptions(
              new MarkerRenderer().setStyle(MarkerStyles.CIRCLE).setShadow(true)
            )
          );

        Options options = new Options()
          .setAxesDefaults(axesDefaults)
          .setCursor(cursor)
          .setSeries(series)
          .setAxes(axes);

        chart.setDataSeries(ds).show();
        chart.setOptions(options);
        chart.setSizeFull();
        // chart.setHeight("450px");
        // chart.setWidth("450px");
        addComponent(chart);
        // setComponentAlignment(chart, Alignment.BOTTOM_CENTER);
    }

    private Label createLabel () {
        Label l = new Label();
        l.setContentMode(ContentMode.HTML);
        l.setSizeUndefined();
        return l;
    }

    private Label strong (String s) {
        Label l = new Label ("<strong>" + s + "</strong>");
        l.setContentMode(ContentMode.HTML);
        l.setSizeUndefined();
        return l;
    }

    private void refresh() {
        Runtime r = Runtime.getRuntime();
        long max = r.maxMemory();
        long free = r.freeMemory();
        long total = r.totalMemory();
        long inUse = total - free;
        available.setValue (toMB (max));
        allocated.setValue (toMB  (total));
        used.setValue (toMB (total - free));
        memoryGauge.setValue ((int) (((float) inUse / total) * 100.00f));
        ds = new DataSeries();
        ds.newSeries();
        synchronized (inUseMemory) {
            for (int i=0; i < inUseMemory.size(); i++)
                ds.add(i * 5, inUseMemory.get(i));
        }
        chart.setDataSeries(ds).show();
    }

    public void enter(ViewChangeListener.ViewChangeEvent event) {
        event.getNavigator().addViewChangeListener(this);
        active.set(true);
        new Thread(this, getClass().getName()).start();
    }

    @Override
    public boolean beforeViewChange(ViewChangeEvent event) {
        if (event.getNewView() != this)
            active.set(false);
        return true;
    }

    @Override
    public void afterViewChange(ViewChangeEvent event) { }

    public void run() {
        while (active.get()) {
            try {
                qi.access(() -> {
                    refresh();
                    QI.getQI().push();
                });
            } catch (UIDetachedException e) {
                break;
            }
            ISOUtil.sleep(5000L);
        }
    }

    private String toMB (long l) {
        return String.format ("%.2f", (float) l / (1024*1000));
    }

    private String toPercent (long l, long max){
        float p = ((float) l / (float) max) * 100;
        return String.format ("&nbsp;MB (%.1f%%)", p);
    }

    private Gauge createGauge (String name, int initialValue) {
        GaugeConfig config = new GaugeConfig();
        config.setStyle(GaugeStyle.STYLE_DARK.toString());
        config.setTrackMax(true);
        return new Gauge(name, initialValue, 200, config);
    }

    private Label createMBLabel() {
        Label l = new Label("&nbsp;MB");
        l.setContentMode(ContentMode.HTML);
        return l;
    }

    private void gc() {
        new Thread() {
            public void run() {
                System.gc();
            }
        }.start();
    }

    private static void logMemoryUsage() {
        Runtime r = Runtime.getRuntime();
        long free = r.freeMemory();
        long total = r.totalMemory();
        long inUse = total - free;
        synchronized (inUseMemory) {
            inUseMemory.remove(0);
            int use =  ((int) (((float) inUse / total) * 100.00f));
            inUseMemory.add(use);
        }
    }
}
