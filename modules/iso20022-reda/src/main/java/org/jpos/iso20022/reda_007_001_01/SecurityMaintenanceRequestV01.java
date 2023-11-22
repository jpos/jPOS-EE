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

package org.jpos.iso20022.reda_007_001_01;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SecurityMaintenanceRequestV01 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="SecurityMaintenanceRequestV01">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="MsgHdr" type="{urn:iso:std:iso:20022:tech:xsd:reda.007.001.01}MessageHeader1" minOccurs="0"/>
 *         <element name="UpdTp" type="{urn:iso:std:iso:20022:tech:xsd:reda.007.001.01}UpdateType36Choice"/>
 *         <element name="UpdRsn" type="{urn:iso:std:iso:20022:tech:xsd:reda.007.001.01}SecuritiesUpdateReason1Choice" minOccurs="0"/>
 *         <element name="FinInstrmId" type="{urn:iso:std:iso:20022:tech:xsd:reda.007.001.01}SecurityIdentification39"/>
 *         <element name="SplmtryData" type="{urn:iso:std:iso:20022:tech:xsd:reda.007.001.01}SupplementaryData1" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecurityMaintenanceRequestV01", propOrder = {
    "msgHdr",
    "updTp",
    "updRsn",
    "finInstrmId",
    "splmtryData"
})
public class SecurityMaintenanceRequestV01 {

    @XmlElement(name = "MsgHdr")
    protected MessageHeader1 msgHdr;
    @XmlElement(name = "UpdTp", required = true)
    protected UpdateType36Choice updTp;
    @XmlElement(name = "UpdRsn")
    protected SecuritiesUpdateReason1Choice updRsn;
    @XmlElement(name = "FinInstrmId", required = true)
    protected SecurityIdentification39 finInstrmId;
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
     * Gets the value of the updTp property.
     * 
     * @return
     *     possible object is
     *     {@link UpdateType36Choice }
     *     
     */
    public UpdateType36Choice getUpdTp() {
        return updTp;
    }

    /**
     * Sets the value of the updTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdateType36Choice }
     *     
     */
    public void setUpdTp(UpdateType36Choice value) {
        this.updTp = value;
    }

    /**
     * Gets the value of the updRsn property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesUpdateReason1Choice }
     *     
     */
    public SecuritiesUpdateReason1Choice getUpdRsn() {
        return updRsn;
    }

    /**
     * Sets the value of the updRsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesUpdateReason1Choice }
     *     
     */
    public void setUpdRsn(SecuritiesUpdateReason1Choice value) {
        this.updRsn = value;
    }

    /**
     * Gets the value of the finInstrmId property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityIdentification39 }
     *     
     */
    public SecurityIdentification39 getFinInstrmId() {
        return finInstrmId;
    }

    /**
     * Sets the value of the finInstrmId property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityIdentification39 }
     *     
     */
    public void setFinInstrmId(SecurityIdentification39 value) {
        this.finInstrmId = value;
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
