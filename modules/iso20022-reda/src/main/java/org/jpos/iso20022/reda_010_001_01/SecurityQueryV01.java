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

package org.jpos.iso20022.reda_010_001_01;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SecurityQueryV01 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="SecurityQueryV01">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="MsgHdr" type="{urn:iso:std:iso:20022:tech:xsd:reda.010.001.01}MessageHeader1" minOccurs="0"/>
 *         <element name="ReqTp" type="{urn:iso:std:iso:20022:tech:xsd:reda.010.001.01}GenericIdentification1" minOccurs="0"/>
 *         <element name="SchCrit" type="{urn:iso:std:iso:20022:tech:xsd:reda.010.001.01}SecuritiesSearchCriteria4"/>
 *         <element name="SmlSetRtrCrit" type="{urn:iso:std:iso:20022:tech:xsd:reda.010.001.01}SecuritiesReturnCriteria1" minOccurs="0"/>
 *         <element name="SplmtryData" type="{urn:iso:std:iso:20022:tech:xsd:reda.010.001.01}SupplementaryData1" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecurityQueryV01", propOrder = {
    "msgHdr",
    "reqTp",
    "schCrit",
    "smlSetRtrCrit",
    "splmtryData"
})
public class SecurityQueryV01 {

    @XmlElement(name = "MsgHdr")
    protected MessageHeader1 msgHdr;
    @XmlElement(name = "ReqTp")
    protected GenericIdentification1 reqTp;
    @XmlElement(name = "SchCrit", required = true)
    protected SecuritiesSearchCriteria4 schCrit;
    @XmlElement(name = "SmlSetRtrCrit")
    protected SecuritiesReturnCriteria1 smlSetRtrCrit;
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
     * Gets the value of the reqTp property.
     * 
     * @return
     *     possible object is
     *     {@link GenericIdentification1 }
     *     
     */
    public GenericIdentification1 getReqTp() {
        return reqTp;
    }

    /**
     * Sets the value of the reqTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericIdentification1 }
     *     
     */
    public void setReqTp(GenericIdentification1 value) {
        this.reqTp = value;
    }

    /**
     * Gets the value of the schCrit property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesSearchCriteria4 }
     *     
     */
    public SecuritiesSearchCriteria4 getSchCrit() {
        return schCrit;
    }

    /**
     * Sets the value of the schCrit property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesSearchCriteria4 }
     *     
     */
    public void setSchCrit(SecuritiesSearchCriteria4 value) {
        this.schCrit = value;
    }

    /**
     * Gets the value of the smlSetRtrCrit property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesReturnCriteria1 }
     *     
     */
    public SecuritiesReturnCriteria1 getSmlSetRtrCrit() {
        return smlSetRtrCrit;
    }

    /**
     * Sets the value of the smlSetRtrCrit property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesReturnCriteria1 }
     *     
     */
    public void setSmlSetRtrCrit(SecuritiesReturnCriteria1 value) {
        this.smlSetRtrCrit = value;
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
