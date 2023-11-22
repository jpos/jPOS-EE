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

package org.jpos.iso20022.acmt_029_001_04;

import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DirectDebitInstructionDetails2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="DirectDebitInstructionDetails2">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="MndtId" type="{urn:iso:std:iso:20022:tech:xsd:acmt.029.001.04}Max35Text"/>
 *         <element name="AutomtdDrctDbtInstrInd" type="{urn:iso:std:iso:20022:tech:xsd:acmt.029.001.04}YesNoIndicator" minOccurs="0"/>
 *         <element name="DrctDbtTrfblInd" type="{urn:iso:std:iso:20022:tech:xsd:acmt.029.001.04}YesNoIndicator" minOccurs="0"/>
 *         <element name="Cdtr" type="{urn:iso:std:iso:20022:tech:xsd:acmt.029.001.04}PartyIdentification135"/>
 *         <element name="LastColltnCcyAmt" type="{urn:iso:std:iso:20022:tech:xsd:acmt.029.001.04}ActiveOrHistoricCurrencyAndAmount" minOccurs="0"/>
 *         <element name="LastColltnDt" type="{urn:iso:std:iso:20022:tech:xsd:acmt.029.001.04}ISODate" minOccurs="0"/>
 *         <element name="OthrDtls" type="{urn:iso:std:iso:20022:tech:xsd:acmt.029.001.04}TransferInstruction1" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DirectDebitInstructionDetails2", propOrder = {
    "mndtId",
    "automtdDrctDbtInstrInd",
    "drctDbtTrfblInd",
    "cdtr",
    "lastColltnCcyAmt",
    "lastColltnDt",
    "othrDtls"
})
public class DirectDebitInstructionDetails2 {

    @XmlElement(name = "MndtId", required = true)
    protected String mndtId;
    @XmlElement(name = "AutomtdDrctDbtInstrInd")
    protected Boolean automtdDrctDbtInstrInd;
    @XmlElement(name = "DrctDbtTrfblInd")
    protected Boolean drctDbtTrfblInd;
    @XmlElement(name = "Cdtr", required = true)
    protected PartyIdentification135 cdtr;
    @XmlElement(name = "LastColltnCcyAmt")
    protected ActiveOrHistoricCurrencyAndAmount lastColltnCcyAmt;
    @XmlElement(name = "LastColltnDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar lastColltnDt;
    @XmlElement(name = "OthrDtls")
    protected List<TransferInstruction1> othrDtls;

    /**
     * Gets the value of the mndtId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMndtId() {
        return mndtId;
    }

    /**
     * Sets the value of the mndtId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMndtId(String value) {
        this.mndtId = value;
    }

    /**
     * Gets the value of the automtdDrctDbtInstrInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAutomtdDrctDbtInstrInd() {
        return automtdDrctDbtInstrInd;
    }

    /**
     * Sets the value of the automtdDrctDbtInstrInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAutomtdDrctDbtInstrInd(Boolean value) {
        this.automtdDrctDbtInstrInd = value;
    }

    /**
     * Gets the value of the drctDbtTrfblInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDrctDbtTrfblInd() {
        return drctDbtTrfblInd;
    }

    /**
     * Sets the value of the drctDbtTrfblInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDrctDbtTrfblInd(Boolean value) {
        this.drctDbtTrfblInd = value;
    }

    /**
     * Gets the value of the cdtr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification135 }
     *     
     */
    public PartyIdentification135 getCdtr() {
        return cdtr;
    }

    /**
     * Sets the value of the cdtr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification135 }
     *     
     */
    public void setCdtr(PartyIdentification135 value) {
        this.cdtr = value;
    }

    /**
     * Gets the value of the lastColltnCcyAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public ActiveOrHistoricCurrencyAndAmount getLastColltnCcyAmt() {
        return lastColltnCcyAmt;
    }

    /**
     * Sets the value of the lastColltnCcyAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public void setLastColltnCcyAmt(ActiveOrHistoricCurrencyAndAmount value) {
        this.lastColltnCcyAmt = value;
    }

    /**
     * Gets the value of the lastColltnDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastColltnDt() {
        return lastColltnDt;
    }

    /**
     * Sets the value of the lastColltnDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastColltnDt(XMLGregorianCalendar value) {
        this.lastColltnDt = value;
    }

    /**
     * Gets the value of the othrDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the othrDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOthrDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TransferInstruction1 }
     * 
     * 
     * @return
     *     The value of the othrDtls property.
     */
    public List<TransferInstruction1> getOthrDtls() {
        if (othrDtls == null) {
            othrDtls = new ArrayList<>();
        }
        return this.othrDtls;
    }

}
