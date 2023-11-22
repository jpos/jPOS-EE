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

package org.jpos.iso20022.pain_018_001_03;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MandateSuspension3 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="MandateSuspension3">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="SspnsnReqId" type="{urn:iso:std:iso:20022:tech:xsd:pain.018.001.03}Max35Text"/>
 *         <element name="OrgnlMsgInf" type="{urn:iso:std:iso:20022:tech:xsd:pain.018.001.03}OriginalMessageInformation1" minOccurs="0"/>
 *         <element name="SspnsnRsn" type="{urn:iso:std:iso:20022:tech:xsd:pain.018.001.03}MandateSuspensionReason2"/>
 *         <element name="OrgnlMndt" type="{urn:iso:std:iso:20022:tech:xsd:pain.018.001.03}OriginalMandate9Choice"/>
 *         <element name="SplmtryData" type="{urn:iso:std:iso:20022:tech:xsd:pain.018.001.03}SupplementaryData1" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MandateSuspension3", propOrder = {
    "sspnsnReqId",
    "orgnlMsgInf",
    "sspnsnRsn",
    "orgnlMndt",
    "splmtryData"
})
public class MandateSuspension3 {

    @XmlElement(name = "SspnsnReqId", required = true)
    protected String sspnsnReqId;
    @XmlElement(name = "OrgnlMsgInf")
    protected OriginalMessageInformation1 orgnlMsgInf;
    @XmlElement(name = "SspnsnRsn", required = true)
    protected MandateSuspensionReason2 sspnsnRsn;
    @XmlElement(name = "OrgnlMndt", required = true)
    protected OriginalMandate9Choice orgnlMndt;
    @XmlElement(name = "SplmtryData")
    protected List<SupplementaryData1> splmtryData;

    /**
     * Gets the value of the sspnsnReqId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSspnsnReqId() {
        return sspnsnReqId;
    }

    /**
     * Sets the value of the sspnsnReqId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSspnsnReqId(String value) {
        this.sspnsnReqId = value;
    }

    /**
     * Gets the value of the orgnlMsgInf property.
     * 
     * @return
     *     possible object is
     *     {@link OriginalMessageInformation1 }
     *     
     */
    public OriginalMessageInformation1 getOrgnlMsgInf() {
        return orgnlMsgInf;
    }

    /**
     * Sets the value of the orgnlMsgInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link OriginalMessageInformation1 }
     *     
     */
    public void setOrgnlMsgInf(OriginalMessageInformation1 value) {
        this.orgnlMsgInf = value;
    }

    /**
     * Gets the value of the sspnsnRsn property.
     * 
     * @return
     *     possible object is
     *     {@link MandateSuspensionReason2 }
     *     
     */
    public MandateSuspensionReason2 getSspnsnRsn() {
        return sspnsnRsn;
    }

    /**
     * Sets the value of the sspnsnRsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link MandateSuspensionReason2 }
     *     
     */
    public void setSspnsnRsn(MandateSuspensionReason2 value) {
        this.sspnsnRsn = value;
    }

    /**
     * Gets the value of the orgnlMndt property.
     * 
     * @return
     *     possible object is
     *     {@link OriginalMandate9Choice }
     *     
     */
    public OriginalMandate9Choice getOrgnlMndt() {
        return orgnlMndt;
    }

    /**
     * Sets the value of the orgnlMndt property.
     * 
     * @param value
     *     allowed object is
     *     {@link OriginalMandate9Choice }
     *     
     */
    public void setOrgnlMndt(OriginalMandate9Choice value) {
        this.orgnlMndt = value;
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
