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

package org.jpos.iso20022.seev_053_001_01;

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
 *         <element name="MktClmCxlReqStsAdvc" type="{urn:iso:std:iso:20022:tech:xsd:seev.053.001.01}MarketClaimCancellationRequestStatusAdviceV01"/>
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
    "mktClmCxlReqStsAdvc"
})
public class Document {

    @XmlElement(name = "MktClmCxlReqStsAdvc", required = true)
    protected MarketClaimCancellationRequestStatusAdviceV01 mktClmCxlReqStsAdvc;

    /**
     * Gets the value of the mktClmCxlReqStsAdvc property.
     * 
     * @return
     *     possible object is
     *     {@link MarketClaimCancellationRequestStatusAdviceV01 }
     *     
     */
    public MarketClaimCancellationRequestStatusAdviceV01 getMktClmCxlReqStsAdvc() {
        return mktClmCxlReqStsAdvc;
    }

    /**
     * Sets the value of the mktClmCxlReqStsAdvc property.
     * 
     * @param value
     *     allowed object is
     *     {@link MarketClaimCancellationRequestStatusAdviceV01 }
     *     
     */
    public void setMktClmCxlReqStsAdvc(MarketClaimCancellationRequestStatusAdviceV01 value) {
        this.mktClmCxlReqStsAdvc = value;
    }

}
