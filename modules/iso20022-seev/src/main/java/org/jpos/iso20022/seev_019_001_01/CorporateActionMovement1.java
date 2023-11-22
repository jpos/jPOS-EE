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

package org.jpos.iso20022.seev_019_001_01;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CorporateActionMovement1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="CorporateActionMovement1">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="OrdrTp" type="{urn:iso:std:iso:20022:tech:xsd:seev.019.001.01}DistributionInstructionType1Code"/>
 *         <element name="HghPrtyInd" type="{urn:iso:std:iso:20022:tech:xsd:seev.019.001.01}YesNoIndicator"/>
 *         <element name="OptnNb" type="{urn:iso:std:iso:20022:tech:xsd:seev.019.001.01}Exact3NumericText" minOccurs="0"/>
 *         <element name="OptnTp" type="{urn:iso:std:iso:20022:tech:xsd:seev.019.001.01}CorporateActionOption1FormatChoice" minOccurs="0"/>
 *         <element name="ReqdExctnDt" type="{urn:iso:std:iso:20022:tech:xsd:seev.019.001.01}ISODate"/>
 *         <element name="AcctOwnrId" type="{urn:iso:std:iso:20022:tech:xsd:seev.019.001.01}PartyIdentification2Choice" minOccurs="0"/>
 *         <element name="AcctId" type="{urn:iso:std:iso:20022:tech:xsd:seev.019.001.01}Max35Text" minOccurs="0"/>
 *         <element name="ConfdBalSctiesQty" type="{urn:iso:std:iso:20022:tech:xsd:seev.019.001.01}UnitOrFaceAmount1Choice" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CorporateActionMovement1", propOrder = {
    "ordrTp",
    "hghPrtyInd",
    "optnNb",
    "optnTp",
    "reqdExctnDt",
    "acctOwnrId",
    "acctId",
    "confdBalSctiesQty"
})
public class CorporateActionMovement1 {

    @XmlElement(name = "OrdrTp", required = true)
    @XmlSchemaType(name = "string")
    protected DistributionInstructionType1Code ordrTp;
    @XmlElement(name = "HghPrtyInd")
    protected boolean hghPrtyInd;
    @XmlElement(name = "OptnNb")
    protected String optnNb;
    @XmlElement(name = "OptnTp")
    protected CorporateActionOption1FormatChoice optnTp;
    @XmlElement(name = "ReqdExctnDt", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar reqdExctnDt;
    @XmlElement(name = "AcctOwnrId")
    protected PartyIdentification2Choice acctOwnrId;
    @XmlElement(name = "AcctId")
    protected String acctId;
    @XmlElement(name = "ConfdBalSctiesQty")
    protected UnitOrFaceAmount1Choice confdBalSctiesQty;

    /**
     * Gets the value of the ordrTp property.
     * 
     * @return
     *     possible object is
     *     {@link DistributionInstructionType1Code }
     *     
     */
    public DistributionInstructionType1Code getOrdrTp() {
        return ordrTp;
    }

    /**
     * Sets the value of the ordrTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link DistributionInstructionType1Code }
     *     
     */
    public void setOrdrTp(DistributionInstructionType1Code value) {
        this.ordrTp = value;
    }

    /**
     * Gets the value of the hghPrtyInd property.
     * 
     */
    public boolean isHghPrtyInd() {
        return hghPrtyInd;
    }

    /**
     * Sets the value of the hghPrtyInd property.
     * 
     */
    public void setHghPrtyInd(boolean value) {
        this.hghPrtyInd = value;
    }

    /**
     * Gets the value of the optnNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOptnNb() {
        return optnNb;
    }

    /**
     * Sets the value of the optnNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOptnNb(String value) {
        this.optnNb = value;
    }

    /**
     * Gets the value of the optnTp property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionOption1FormatChoice }
     *     
     */
    public CorporateActionOption1FormatChoice getOptnTp() {
        return optnTp;
    }

    /**
     * Sets the value of the optnTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionOption1FormatChoice }
     *     
     */
    public void setOptnTp(CorporateActionOption1FormatChoice value) {
        this.optnTp = value;
    }

    /**
     * Gets the value of the reqdExctnDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getReqdExctnDt() {
        return reqdExctnDt;
    }

    /**
     * Sets the value of the reqdExctnDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setReqdExctnDt(XMLGregorianCalendar value) {
        this.reqdExctnDt = value;
    }

    /**
     * Gets the value of the acctOwnrId property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification2Choice }
     *     
     */
    public PartyIdentification2Choice getAcctOwnrId() {
        return acctOwnrId;
    }

    /**
     * Sets the value of the acctOwnrId property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification2Choice }
     *     
     */
    public void setAcctOwnrId(PartyIdentification2Choice value) {
        this.acctOwnrId = value;
    }

    /**
     * Gets the value of the acctId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcctId() {
        return acctId;
    }

    /**
     * Sets the value of the acctId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcctId(String value) {
        this.acctId = value;
    }

    /**
     * Gets the value of the confdBalSctiesQty property.
     * 
     * @return
     *     possible object is
     *     {@link UnitOrFaceAmount1Choice }
     *     
     */
    public UnitOrFaceAmount1Choice getConfdBalSctiesQty() {
        return confdBalSctiesQty;
    }

    /**
     * Sets the value of the confdBalSctiesQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnitOrFaceAmount1Choice }
     *     
     */
    public void setConfdBalSctiesQty(UnitOrFaceAmount1Choice value) {
        this.confdBalSctiesQty = value;
    }

}
