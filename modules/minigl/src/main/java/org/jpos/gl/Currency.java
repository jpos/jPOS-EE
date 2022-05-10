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

package org.jpos.gl;

import java.text.ParseException;
import org.jdom2.Element;

/**
 * Represents a currency.
 * <p>See: <a href="http://www.evertype.com/standards/iso4217/iso4217-en.html">ISO-4217</a></p>
 * @author <a href="mailto:apr@jpos.org">Alejandro Revilla</a>
 */
public class Currency {
    private String id;
    private String name;
    private String symbol;
	
    public Currency () {
        super();
    }

    /**
     * Constructs a Currency out of a JDOM Element as defined in
     * <a href="http://jpos.org/minigl.dtd">minigl.dtd</a>
     * @param elem 
     */
    public Currency (Element elem) throws ParseException {
        super();
        fromXML (elem);
    }
    /**
     * Currency id.
     * It can be an ISO-4217 currency or any other internal use id.
     *
     * @return currency id
     */
    public String getId() {
        return id;
    }
    /**
     * Currency id.
     * @param id currency id
     */
    public void setId(String id) {
        this.id = id;
    }
    /**
     * Currency name.
     * @return currency name
     */
    public String getName() {
        return name;
    }
    /**
     * Currency name.
     * @param name currency name
     */
    public void setName(String name) {
        this.name = name;
    }
    /**
     * Currency symbol.
     * i.e. USD, EUR, UYU, etc.
     * @return currency symbol
     */
    public String getSymbol () {
        return symbol;
    }
    /**
     * Currency symbol.
     * (usually 3 chars, could be up to 16 chars)
     * @param symbol currency symbol
     */
    public void setSymbol (String symbol) {
        this.symbol = symbol;
    }
    /**
     * Parses a JDOM Element as defined in
     * <a href="http://jpos.org/minigl.dtd">minigl.dtd</a>
     */
    public void fromXML (Element elem) throws ParseException {
        setId (elem.getAttributeValue ("id"));
        setSymbol (elem.getChildTextTrim ("symbol"));
        setName   (elem.getChildTextTrim ("name"));
    }
    /**
     * Creates a JDOM Element as defined in
     * <a href="http://jpos.org/minigl.dtd">minigl.dtd</a>
     */
    public Element toXML () {
        Element e = new Element ("currency") .
            addContent (new Element ("symbol").setText (getSymbol())) .
            addContent (new Element ("name").setText (getName()));
        e.setAttribute ("id", getId());
        return e;
    }
}

