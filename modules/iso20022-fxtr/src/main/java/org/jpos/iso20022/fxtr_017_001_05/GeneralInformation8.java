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

package org.jpos.iso20022.fxtr_017_001_05;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GeneralInformation8 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="GeneralInformation8">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="BlckInd" type="{urn:iso:std:iso:20022:tech:xsd:fxtr.017.001.05}YesNoIndicator" minOccurs="0"/>
 *         <element name="RltdTradRef" type="{urn:iso:std:iso:20022:tech:xsd:fxtr.017.001.05}Max35Text" minOccurs="0"/>
 *         <element name="DealgMtd" type="{urn:iso:std:iso:20022:tech:xsd:fxtr.017.001.05}Trading1MethodCode" minOccurs="0"/>
 *         <element name="BrkrId" type="{urn:iso:std:iso:20022:tech:xsd:fxtr.017.001.05}PartyIdentification242Choice" minOccurs="0"/>
 *         <element name="CtrPtyRef" type="{urn:iso:std:iso:20022:tech:xsd:fxtr.017.001.05}Max35Text" minOccurs="0"/>
 *         <element name="BrkrsComssn" type="{urn:iso:std:iso:20022:tech:xsd:fxtr.017.001.05}ActiveCurrencyAndAmount" minOccurs="0"/>
 *         <element name="SndrToRcvrInf" type="{urn:iso:std:iso:20022:tech:xsd:fxtr.017.001.05}Max210Text" minOccurs="0"/>
 *         <element name="DealgBrnchTradgSd" type="{urn:iso:std:iso:20022:tech:xsd:fxtr.017.001.05}PartyIdentification242Choice" minOccurs="0"/>
 *         <element name="DealgBrnchCtrPtySd" type="{urn:iso:std:iso:20022:tech:xsd:fxtr.017.001.05}PartyIdentification242Choice" minOccurs="0"/>
 *         <element name="CtctInf" type="{urn:iso:std:iso:20022:tech:xsd:fxtr.017.001.05}ContactInformation1" minOccurs="0"/>
 *         <element name="AgrmtDtls" type="{urn:iso:std:iso:20022:tech:xsd:fxtr.017.001.05}AgreementConditions1" minOccurs="0"/>
 *         <element name="DefsYr" type="{urn:iso:std:iso:20022:tech:xsd:fxtr.017.001.05}ISOYear" minOccurs="0"/>
 *         <element name="BrkrsRef" type="{urn:iso:std:iso:20022:tech:xsd:fxtr.017.001.05}Max35Text" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GeneralInformation8", propOrder = {
    "blckInd",
    "rltdTradRef",
    "dealgMtd",
    "brkrId",
    "ctrPtyRef",
    "brkrsComssn",
    "sndrToRcvrInf",
    "dealgBrnchTradgSd",
    "dealgBrnchCtrPtySd",
    "ctctInf",
    "agrmtDtls",
    "defsYr",
    "brkrsRef"
})
public class GeneralInformation8 {

    @XmlElement(name = "BlckInd")
    protected Boolean blckInd;
    @XmlElement(name = "RltdTradRef")
    protected String rltdTradRef;
    @XmlElement(name = "DealgMtd")
    @XmlSchemaType(name = "string")
    protected Trading1MethodCode dealgMtd;
    @XmlElement(name = "BrkrId")
    protected PartyIdentification242Choice brkrId;
    @XmlElement(name = "CtrPtyRef")
    protected String ctrPtyRef;
    @XmlElement(name = "BrkrsComssn")
    protected ActiveCurrencyAndAmount brkrsComssn;
    @XmlElement(name = "SndrToRcvrInf")
    protected String sndrToRcvrInf;
    @XmlElement(name = "DealgBrnchTradgSd")
    protected PartyIdentification242Choice dealgBrnchTradgSd;
    @XmlElement(name = "DealgBrnchCtrPtySd")
    protected PartyIdentification242Choice dealgBrnchCtrPtySd;
    @XmlElement(name = "CtctInf")
    protected ContactInformation1 ctctInf;
    @XmlElement(name = "AgrmtDtls")
    protected AgreementConditions1 agrmtDtls;
    @XmlElement(name = "DefsYr")
    @XmlSchemaType(name = "gYear")
    protected XMLGregorianCalendar defsYr;
    @XmlElement(name = "BrkrsRef")
    protected String brkrsRef;

    /**
     * Gets the value of the blckInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBlckInd() {
        return blckInd;
    }

    /**
     * Sets the value of the blckInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBlckInd(Boolean value) {
        this.blckInd = value;
    }

    /**
     * Gets the value of the rltdTradRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRltdTradRef() {
        return rltdTradRef;
    }

    /**
     * Sets the value of the rltdTradRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRltdTradRef(String value) {
        this.rltdTradRef = value;
    }

    /**
     * Gets the value of the dealgMtd property.
     * 
     * @return
     *     possible object is
     *     {@link Trading1MethodCode }
     *     
     */
    public Trading1MethodCode getDealgMtd() {
        return dealgMtd;
    }

    /**
     * Sets the value of the dealgMtd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Trading1MethodCode }
     *     
     */
    public void setDealgMtd(Trading1MethodCode value) {
        this.dealgMtd = value;
    }

    /**
     * Gets the value of the brkrId property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification242Choice }
     *     
     */
    public PartyIdentification242Choice getBrkrId() {
        return brkrId;
    }

    /**
     * Sets the value of the brkrId property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification242Choice }
     *     
     */
    public void setBrkrId(PartyIdentification242Choice value) {
        this.brkrId = value;
    }

    /**
     * Gets the value of the ctrPtyRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCtrPtyRef() {
        return ctrPtyRef;
    }

    /**
     * Sets the value of the ctrPtyRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCtrPtyRef(String value) {
        this.ctrPtyRef = value;
    }

    /**
     * Gets the value of the brkrsComssn property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getBrkrsComssn() {
        return brkrsComssn;
    }

    /**
     * Sets the value of the brkrsComssn property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public void setBrkrsComssn(ActiveCurrencyAndAmount value) {
        this.brkrsComssn = value;
    }

    /**
     * Gets the value of the sndrToRcvrInf property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSndrToRcvrInf() {
        return sndrToRcvrInf;
    }

    /**
     * Sets the value of the sndrToRcvrInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSndrToRcvrInf(String value) {
        this.sndrToRcvrInf = value;
    }

    /**
     * Gets the value of the dealgBrnchTradgSd property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification242Choice }
     *     
     */
    public PartyIdentification242Choice getDealgBrnchTradgSd() {
        return dealgBrnchTradgSd;
    }

    /**
     * Sets the value of the dealgBrnchTradgSd property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification242Choice }
     *     
     */
    public void setDealgBrnchTradgSd(PartyIdentification242Choice value) {
        this.dealgBrnchTradgSd = value;
    }

    /**
     * Gets the value of the dealgBrnchCtrPtySd property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification242Choice }
     *     
     */
    public PartyIdentification242Choice getDealgBrnchCtrPtySd() {
        return dealgBrnchCtrPtySd;
    }

    /**
     * Sets the value of the dealgBrnchCtrPtySd property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification242Choice }
     *     
     */
    public void setDealgBrnchCtrPtySd(PartyIdentification242Choice value) {
        this.dealgBrnchCtrPtySd = value;
    }

    /**
     * Gets the value of the ctctInf property.
     * 
     * @return
     *     possible object is
     *     {@link ContactInformation1 }
     *     
     */
    public ContactInformation1 getCtctInf() {
        return ctctInf;
    }

    /**
     * Sets the value of the ctctInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactInformation1 }
     *     
     */
    public void setCtctInf(ContactInformation1 value) {
        this.ctctInf = value;
    }

    /**
     * Gets the value of the agrmtDtls property.
     * 
     * @return
     *     possible object is
     *     {@link AgreementConditions1 }
     *     
     */
    public AgreementConditions1 getAgrmtDtls() {
        return agrmtDtls;
    }

    /**
     * Sets the value of the agrmtDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link AgreementConditions1 }
     *     
     */
    public void setAgrmtDtls(AgreementConditions1 value) {
        this.agrmtDtls = value;
    }

    /**
     * Gets the value of the defsYr property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDefsYr() {
        return defsYr;
    }

    /**
     * Sets the value of the defsYr property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDefsYr(XMLGregorianCalendar value) {
        this.defsYr = value;
    }

    /**
     * Gets the value of the brkrsRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBrkrsRef() {
        return brkrsRef;
    }

    /**
     * Sets the value of the brkrsRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBrkrsRef(String value) {
        this.brkrsRef = value;
    }

}
