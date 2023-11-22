/*
 * jPOS Project [http://jpos.org]
 * Copyright (C) 2000-2023 jPOS Software SRL
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

package org.jpos.iso20022.fxtr_030_001_05;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Document complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="Document">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="FXTradBlkStsNtfctn" type="{urn:iso:std:iso:20022:tech:xsd:fxtr.030.001.05}ForeignExchangeTradeBulkStatusNotificationV05"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "fxTradBlkStsNtfctn"
})
public class Document {

    @XmlElement(name = "FXTradBlkStsNtfctn", required = true)
    protected ForeignExchangeTradeBulkStatusNotificationV05 fxTradBlkStsNtfctn;

    /**
     * Gets the value of the fxTradBlkStsNtfctn property.
     * 
     * @return
     *     possible object is
     *     {@link ForeignExchangeTradeBulkStatusNotificationV05 }
     *     
     */
    public ForeignExchangeTradeBulkStatusNotificationV05 getFXTradBlkStsNtfctn() {
        return fxTradBlkStsNtfctn;
    }

    /**
     * Sets the value of the fxTradBlkStsNtfctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link ForeignExchangeTradeBulkStatusNotificationV05 }
     *     
     */
    public void setFXTradBlkStsNtfctn(ForeignExchangeTradeBulkStatusNotificationV05 value) {
        this.fxTradBlkStsNtfctn = value;
    }

}
