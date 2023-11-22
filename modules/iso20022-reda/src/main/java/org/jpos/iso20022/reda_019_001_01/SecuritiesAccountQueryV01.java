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

package org.jpos.iso20022.reda_019_001_01;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SecuritiesAccountQueryV01 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="SecuritiesAccountQueryV01">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="MsgHdr" type="{urn:iso:std:iso:20022:tech:xsd:reda.019.001.01}MessageHeader2" minOccurs="0"/>
 *         <element name="SchCrit" type="{urn:iso:std:iso:20022:tech:xsd:reda.019.001.01}SecuritiesAccountSearchCriteria2"/>
 *         <element name="RtrCrit" type="{urn:iso:std:iso:20022:tech:xsd:reda.019.001.01}SecuritiesAccountReturnCriteria1" minOccurs="0"/>
 *         <element name="SplmtryData" type="{urn:iso:std:iso:20022:tech:xsd:reda.019.001.01}SupplementaryData1" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecuritiesAccountQueryV01", propOrder = {
    "msgHdr",
    "schCrit",
    "rtrCrit",
    "splmtryData"
})
public class SecuritiesAccountQueryV01 {

    @XmlElement(name = "MsgHdr")
    protected MessageHeader2 msgHdr;
    @XmlElement(name = "SchCrit", required = true)
    protected SecuritiesAccountSearchCriteria2 schCrit;
    @XmlElement(name = "RtrCrit")
    protected SecuritiesAccountReturnCriteria1 rtrCrit;
    @XmlElement(name = "SplmtryData")
    protected List<SupplementaryData1> splmtryData;

    /**
     * Gets the value of the msgHdr property.
     * 
     * @return
     *     possible object is
     *     {@link MessageHeader2 }
     *     
     */
    public MessageHeader2 getMsgHdr() {
        return msgHdr;
    }

    /**
     * Sets the value of the msgHdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageHeader2 }
     *     
     */
    public void setMsgHdr(MessageHeader2 value) {
        this.msgHdr = value;
    }

    /**
     * Gets the value of the schCrit property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesAccountSearchCriteria2 }
     *     
     */
    public SecuritiesAccountSearchCriteria2 getSchCrit() {
        return schCrit;
    }

    /**
     * Sets the value of the schCrit property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesAccountSearchCriteria2 }
     *     
     */
    public void setSchCrit(SecuritiesAccountSearchCriteria2 value) {
        this.schCrit = value;
    }

    /**
     * Gets the value of the rtrCrit property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesAccountReturnCriteria1 }
     *     
     */
    public SecuritiesAccountReturnCriteria1 getRtrCrit() {
        return rtrCrit;
    }

    /**
     * Sets the value of the rtrCrit property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesAccountReturnCriteria1 }
     *     
     */
    public void setRtrCrit(SecuritiesAccountReturnCriteria1 value) {
        this.rtrCrit = value;
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
