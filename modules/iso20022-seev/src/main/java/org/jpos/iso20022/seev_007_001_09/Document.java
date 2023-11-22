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

package org.jpos.iso20022.seev_007_001_09;

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
 *         <element name="MtgVoteExctnConf" type="{urn:iso:std:iso:20022:tech:xsd:seev.007.001.09}MeetingVoteExecutionConfirmationV09"/>
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
    "mtgVoteExctnConf"
})
public class Document {

    @XmlElement(name = "MtgVoteExctnConf", required = true)
    protected MeetingVoteExecutionConfirmationV09 mtgVoteExctnConf;

    /**
     * Gets the value of the mtgVoteExctnConf property.
     * 
     * @return
     *     possible object is
     *     {@link MeetingVoteExecutionConfirmationV09 }
     *     
     */
    public MeetingVoteExecutionConfirmationV09 getMtgVoteExctnConf() {
        return mtgVoteExctnConf;
    }

    /**
     * Sets the value of the mtgVoteExctnConf property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeetingVoteExecutionConfirmationV09 }
     *     
     */
    public void setMtgVoteExctnConf(MeetingVoteExecutionConfirmationV09 value) {
        this.mtgVoteExctnConf = value;
    }

}
