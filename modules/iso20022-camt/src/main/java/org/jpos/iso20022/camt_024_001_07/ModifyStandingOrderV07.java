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

package org.jpos.iso20022.camt_024_001_07;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ModifyStandingOrderV07 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ModifyStandingOrderV07">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="MsgHdr" type="{urn:iso:std:iso:20022:tech:xsd:camt.024.001.07}MessageHeader1"/>
 *         <element name="StgOrdrId" type="{urn:iso:std:iso:20022:tech:xsd:camt.024.001.07}StandingOrderIdentification6"/>
 *         <element name="NewStgOrdrValSet" type="{urn:iso:std:iso:20022:tech:xsd:camt.024.001.07}StandingOrder8"/>
 *         <element name="SplmtryData" type="{urn:iso:std:iso:20022:tech:xsd:camt.024.001.07}SupplementaryData1" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ModifyStandingOrderV07", propOrder = {
    "msgHdr",
    "stgOrdrId",
    "newStgOrdrValSet",
    "splmtryData"
})
public class ModifyStandingOrderV07 {

    @XmlElement(name = "MsgHdr", required = true)
    protected MessageHeader1 msgHdr;
    @XmlElement(name = "StgOrdrId", required = true)
    protected StandingOrderIdentification6 stgOrdrId;
    @XmlElement(name = "NewStgOrdrValSet", required = true)
    protected StandingOrder8 newStgOrdrValSet;
    @XmlElement(name = "SplmtryData")
    protected List<SupplementaryData1> splmtryData;

    /**
     * Gets the value of the msgHdr property.
     * 
     * @return
     *     possible object is
     *     {@link MessageHeader1 }
     *     
     */
    public MessageHeader1 getMsgHdr() {
        return msgHdr;
    }

    /**
     * Sets the value of the msgHdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageHeader1 }
     *     
     */
    public void setMsgHdr(MessageHeader1 value) {
        this.msgHdr = value;
    }

    /**
     * Gets the value of the stgOrdrId property.
     * 
     * @return
     *     possible object is
     *     {@link StandingOrderIdentification6 }
     *     
     */
    public StandingOrderIdentification6 getStgOrdrId() {
        return stgOrdrId;
    }

    /**
     * Sets the value of the stgOrdrId property.
     * 
     * @param value
     *     allowed object is
     *     {@link StandingOrderIdentification6 }
     *     
     */
    public void setStgOrdrId(StandingOrderIdentification6 value) {
        this.stgOrdrId = value;
    }

    /**
     * Gets the value of the newStgOrdrValSet property.
     * 
     * @return
     *     possible object is
     *     {@link StandingOrder8 }
     *     
     */
    public StandingOrder8 getNewStgOrdrValSet() {
        return newStgOrdrValSet;
    }

    /**
     * Sets the value of the newStgOrdrValSet property.
     * 
     * @param value
     *     allowed object is
     *     {@link StandingOrder8 }
     *     
     */
    public void setNewStgOrdrValSet(StandingOrder8 value) {
        this.newStgOrdrValSet = value;
    }

    /**
     * Gets the value of the splmtryData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the splmtryData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSplmtryData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SupplementaryData1 }
     * 
     * 
     * @return
     *     The value of the splmtryData property.
     */
    public List<SupplementaryData1> getSplmtryData() {
        if (splmtryData == null) {
            splmtryData = new ArrayList<>();
        }
        return this.splmtryData;
    }

}
