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

package org.jpos.iso20022.auth_061_001_01;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RepurchaseAgreement2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="RepurchaseAgreement2">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="MtrtyDt" type="{urn:iso:std:iso:20022:tech:xsd:auth.061.001.01}ISODate"/>
 *         <element name="ScndLegPric" type="{urn:iso:std:iso:20022:tech:xsd:auth.061.001.01}ActiveCurrencyAndAmount"/>
 *         <element name="CollMktVal" type="{urn:iso:std:iso:20022:tech:xsd:auth.061.001.01}ActiveCurrencyAndAmount"/>
 *         <element name="CtrPty" type="{urn:iso:std:iso:20022:tech:xsd:auth.061.001.01}LEIIdentifier"/>
 *         <element name="RpAgrmtTp" type="{urn:iso:std:iso:20022:tech:xsd:auth.061.001.01}RepurchaseAgreementType3Choice"/>
 *         <element name="TrptyAgtId" type="{urn:iso:std:iso:20022:tech:xsd:auth.061.001.01}LEIIdentifier" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RepurchaseAgreement2", propOrder = {
    "mtrtyDt",
    "scndLegPric",
    "collMktVal",
    "ctrPty",
    "rpAgrmtTp",
    "trptyAgtId"
})
public class RepurchaseAgreement2 {

    @XmlElement(name = "MtrtyDt", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar mtrtyDt;
    @XmlElement(name = "ScndLegPric", required = true)
    protected ActiveCurrencyAndAmount scndLegPric;
    @XmlElement(name = "CollMktVal", required = true)
    protected ActiveCurrencyAndAmount collMktVal;
    @XmlElement(name = "CtrPty", required = true)
    protected String ctrPty;
    @XmlElement(name = "RpAgrmtTp", required = true)
    protected RepurchaseAgreementType3Choice rpAgrmtTp;
    @XmlElement(name = "TrptyAgtId")
    protected String trptyAgtId;

    /**
     * Gets the value of the mtrtyDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMtrtyDt() {
        return mtrtyDt;
    }

    /**
     * Sets the value of the mtrtyDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMtrtyDt(XMLGregorianCalendar value) {
        this.mtrtyDt = value;
    }

    /**
     * Gets the value of the scndLegPric property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getScndLegPric() {
        return scndLegPric;
    }

    /**
     * Sets the value of the scndLegPric property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public void setScndLegPric(ActiveCurrencyAndAmount value) {
        this.scndLegPric = value;
    }

    /**
     * Gets the value of the collMktVal property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getCollMktVal() {
        return collMktVal;
    }

    /**
     * Sets the value of the collMktVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public void setCollMktVal(ActiveCurrencyAndAmount value) {
        this.collMktVal = value;
    }

    /**
     * Gets the value of the ctrPty property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCtrPty() {
        return ctrPty;
    }

    /**
     * Sets the value of the ctrPty property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCtrPty(String value) {
        this.ctrPty = value;
    }

    /**
     * Gets the value of the rpAgrmtTp property.
     * 
     * @return
     *     possible object is
     *     {@link RepurchaseAgreementType3Choice }
     *     
     */
    public RepurchaseAgreementType3Choice getRpAgrmtTp() {
        return rpAgrmtTp;
    }

    /**
     * Sets the value of the rpAgrmtTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link RepurchaseAgreementType3Choice }
     *     
     */
    public void setRpAgrmtTp(RepurchaseAgreementType3Choice value) {
        this.rpAgrmtTp = value;
    }

    /**
     * Gets the value of the trptyAgtId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrptyAgtId() {
        return trptyAgtId;
    }

    /**
     * Sets the value of the trptyAgtId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrptyAgtId(String value) {
        this.trptyAgtId = value;
    }

}
