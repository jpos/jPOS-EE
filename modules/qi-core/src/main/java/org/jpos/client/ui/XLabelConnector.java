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

package org.jpos.client.ui;

/*
 * This code is based on Vaadin's Label that has the following copyright notice
 *
 * Copyright 2000-2014 Vaadin Ltd.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */

import com.google.gwt.dom.client.Document;
import com.google.gwt.dom.client.Element;
import com.google.gwt.dom.client.PreElement;
import com.vaadin.client.Profiler;
import com.vaadin.client.WidgetUtil;
import com.vaadin.client.communication.StateChangeEvent;
import com.vaadin.client.ui.AbstractComponentConnector;
import com.vaadin.client.ui.VLabel;
import com.vaadin.shared.ui.Connect;
import com.vaadin.shared.ui.Connect.LoadStyle;
import com.vaadin.v7.shared.ui.label.LabelState;
import org.jpos.server.ui.XLabel;

@Connect(value = XLabel.class, loadStyle = LoadStyle.EAGER)
public class XLabelConnector extends AbstractComponentConnector {

    @Override
    public LabelState getState() {
        return (LabelState) super.getState();
    }

    @Override
    public void onStateChanged(StateChangeEvent stateChangeEvent) {
        super.onStateChanged(stateChangeEvent);
        boolean sinkOnloads = false;
        Profiler.enter("LabelConnector.onStateChanged update content");
        switch (getState().contentMode) {
        case PREFORMATTED:
            Document doc = Document.get();
            Element e = getWidget().getElement();
            PreElement preElement = doc.createPreElement();
            preElement.setInnerText(getState().text);
            // DO NOT clear existing content
            // getWidget().setHTML("");
            // add preformatted text to dom
            e.appendChild(preElement);
            // e.appendChild(doc.createHRElement());
            break;
        case TEXT:
            getWidget().setText(getState().text);
            break;
        case HTML:
        case RAW:
            sinkOnloads = true;
        case XML:
            getWidget().setHTML(getState().text);
            break;
        default:
            getWidget().setText("");
            break;

        }
        Profiler.leave("LabelConnector.onStateChanged update content");

        if (sinkOnloads) {
            Profiler.enter("LabelConnector.onStateChanged sinkOnloads");
            WidgetUtil.sinkOnloadForImages(getWidget().getElement());
            Profiler.leave("LabelConnector.onStateChanged sinkOnloads");
        }
    }

    @Override
    public VLabel getWidget() {
        return (VLabel) super.getWidget();
    }
}
