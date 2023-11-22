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

package org.jpos.iso20022.camt_073_001_01;

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
 *         <element name="IntraBalMvmntModReqStsAdvc" type="{urn:iso:std:iso:20022:tech:xsd:camt.073.001.01}IntraBalanceMovementModificationRequestStatusAdviceV01"/>
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
    "intraBalMvmntModReqStsAdvc"
})
public class Document {

    @XmlElement(name = "IntraBalMvmntModReqStsAdvc", required = true)
    protected IntraBalanceMovementModificationRequestStatusAdviceV01 intraBalMvmntModReqStsAdvc;

    /**
     * Gets the value of the intraBalMvmntModReqStsAdvc property.
     * 
     * @return
     *     possible object is
     *     {@link IntraBalanceMovementModificationRequestStatusAdviceV01 }
     *     
     */
    public IntraBalanceMovementModificationRequestStatusAdviceV01 getIntraBalMvmntModReqStsAdvc() {
        return intraBalMvmntModReqStsAdvc;
    }

    /**
     * Sets the value of the intraBalMvmntModReqStsAdvc property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntraBalanceMovementModificationRequestStatusAdviceV01 }
     *     
     */
    public void setIntraBalMvmntModReqStsAdvc(IntraBalanceMovementModificationRequestStatusAdviceV01 value) {
        this.intraBalMvmntModReqStsAdvc = value;
    }

}
