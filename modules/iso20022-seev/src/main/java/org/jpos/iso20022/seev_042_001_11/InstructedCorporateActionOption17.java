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

package org.jpos.iso20022.seev_042_001_11;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InstructedCorporateActionOption17 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="InstructedCorporateActionOption17">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="OptnNb" type="{urn:iso:std:iso:20022:tech:xsd:seev.042.001.11}Exact3NumericText" minOccurs="0"/>
 *         <element name="OptnTp" type="{urn:iso:std:iso:20022:tech:xsd:seev.042.001.11}CorporateActionOption30Choice"/>
 *         <element name="InstdBal" type="{urn:iso:std:iso:20022:tech:xsd:seev.042.001.11}BalanceFormat11Choice"/>
 *         <element name="DfltActn" type="{urn:iso:std:iso:20022:tech:xsd:seev.042.001.11}DefaultProcessingOrStandingInstruction1Choice" minOccurs="0"/>
 *         <element name="OptnAccptdInstdBal" type="{urn:iso:std:iso:20022:tech:xsd:seev.042.001.11}SignedQuantityFormat10" minOccurs="0"/>
 *         <element name="OptnCancInstrBal" type="{urn:iso:std:iso:20022:tech:xsd:seev.042.001.11}SignedQuantityFormat10" minOccurs="0"/>
 *         <element name="OptnPdgInstrBal" type="{urn:iso:std:iso:20022:tech:xsd:seev.042.001.11}SignedQuantityFormat10" minOccurs="0"/>
 *         <element name="OptnRjctdInstrBal" type="{urn:iso:std:iso:20022:tech:xsd:seev.042.001.11}SignedQuantityFormat10" minOccurs="0"/>
 *         <element name="OptnPrtctInstrBal" type="{urn:iso:std:iso:20022:tech:xsd:seev.042.001.11}SignedQuantityFormat10" minOccurs="0"/>
 *         <element name="EvtDdlns" type="{urn:iso:std:iso:20022:tech:xsd:seev.042.001.11}CorporateActionEventDeadlines3"/>
 *         <element name="OptnInstrDtls" type="{urn:iso:std:iso:20022:tech:xsd:seev.042.001.11}OptionInstructionDetails7" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InstructedCorporateActionOption17", propOrder = {
    "optnNb",
    "optnTp",
    "instdBal",
    "dfltActn",
    "optnAccptdInstdBal",
    "optnCancInstrBal",
    "optnPdgInstrBal",
    "optnRjctdInstrBal",
    "optnPrtctInstrBal",
    "evtDdlns",
    "optnInstrDtls"
})
public class InstructedCorporateActionOption17 {

    @XmlElement(name = "OptnNb")
    protected String optnNb;
    @XmlElement(name = "OptnTp", required = true)
    protected CorporateActionOption30Choice optnTp;
    @XmlElement(name = "InstdBal", required = true)
    protected BalanceFormat11Choice instdBal;
    @XmlElement(name = "DfltActn")
    protected DefaultProcessingOrStandingInstruction1Choice dfltActn;
    @XmlElement(name = "OptnAccptdInstdBal")
    protected SignedQuantityFormat10 optnAccptdInstdBal;
    @XmlElement(name = "OptnCancInstrBal")
    protected SignedQuantityFormat10 optnCancInstrBal;
    @XmlElement(name = "OptnPdgInstrBal")
    protected SignedQuantityFormat10 optnPdgInstrBal;
    @XmlElement(name = "OptnRjctdInstrBal")
    protected SignedQuantityFormat10 optnRjctdInstrBal;
    @XmlElement(name = "OptnPrtctInstrBal")
    protected SignedQuantityFormat10 optnPrtctInstrBal;
    @XmlElement(name = "EvtDdlns", required = true)
    protected CorporateActionEventDeadlines3 evtDdlns;
    @XmlElement(name = "OptnInstrDtls")
    protected List<OptionInstructionDetails7> optnInstrDtls;

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
     *     {@link CorporateActionOption30Choice }
     *     
     */
    public CorporateActionOption30Choice getOptnTp() {
        return optnTp;
    }

    /**
     * Sets the value of the optnTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionOption30Choice }
     *     
     */
    public void setOptnTp(CorporateActionOption30Choice value) {
        this.optnTp = value;
    }

    /**
     * Gets the value of the instdBal property.
     * 
     * @return
     *     possible object is
     *     {@link BalanceFormat11Choice }
     *     
     */
    public BalanceFormat11Choice getInstdBal() {
        return instdBal;
    }

    /**
     * Sets the value of the instdBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BalanceFormat11Choice }
     *     
     */
    public void setInstdBal(BalanceFormat11Choice value) {
        this.instdBal = value;
    }

    /**
     * Gets the value of the dfltActn property.
     * 
     * @return
     *     possible object is
     *     {@link DefaultProcessingOrStandingInstruction1Choice }
     *     
     */
    public DefaultProcessingOrStandingInstruction1Choice getDfltActn() {
        return dfltActn;
    }

    /**
     * Sets the value of the dfltActn property.
     * 
     * @param value
     *     allowed object is
     *     {@link DefaultProcessingOrStandingInstruction1Choice }
     *     
     */
    public void setDfltActn(DefaultProcessingOrStandingInstruction1Choice value) {
        this.dfltActn = value;
    }

    /**
     * Gets the value of the optnAccptdInstdBal property.
     * 
     * @return
     *     possible object is
     *     {@link SignedQuantityFormat10 }
     *     
     */
    public SignedQuantityFormat10 getOptnAccptdInstdBal() {
        return optnAccptdInstdBal;
    }

    /**
     * Sets the value of the optnAccptdInstdBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link SignedQuantityFormat10 }
     *     
     */
    public void setOptnAccptdInstdBal(SignedQuantityFormat10 value) {
        this.optnAccptdInstdBal = value;
    }

    /**
     * Gets the value of the optnCancInstrBal property.
     * 
     * @return
     *     possible object is
     *     {@link SignedQuantityFormat10 }
     *     
     */
    public SignedQuantityFormat10 getOptnCancInstrBal() {
        return optnCancInstrBal;
    }

    /**
     * Sets the value of the optnCancInstrBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link SignedQuantityFormat10 }
     *     
     */
    public void setOptnCancInstrBal(SignedQuantityFormat10 value) {
        this.optnCancInstrBal = value;
    }

    /**
     * Gets the value of the optnPdgInstrBal property.
     * 
     * @return
     *     possible object is
     *     {@link SignedQuantityFormat10 }
     *     
     */
    public SignedQuantityFormat10 getOptnPdgInstrBal() {
        return optnPdgInstrBal;
    }

    /**
     * Sets the value of the optnPdgInstrBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link SignedQuantityFormat10 }
     *     
     */
    public void setOptnPdgInstrBal(SignedQuantityFormat10 value) {
        this.optnPdgInstrBal = value;
    }

    /**
     * Gets the value of the optnRjctdInstrBal property.
     * 
     * @return
     *     possible object is
     *     {@link SignedQuantityFormat10 }
     *     
     */
    public SignedQuantityFormat10 getOptnRjctdInstrBal() {
        return optnRjctdInstrBal;
    }

    /**
     * Sets the value of the optnRjctdInstrBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link SignedQuantityFormat10 }
     *     
     */
    public void setOptnRjctdInstrBal(SignedQuantityFormat10 value) {
        this.optnRjctdInstrBal = value;
    }

    /**
     * Gets the value of the optnPrtctInstrBal property.
     * 
     * @return
     *     possible object is
     *     {@link SignedQuantityFormat10 }
     *     
     */
    public SignedQuantityFormat10 getOptnPrtctInstrBal() {
        return optnPrtctInstrBal;
    }

    /**
     * Sets the value of the optnPrtctInstrBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link SignedQuantityFormat10 }
     *     
     */
    public void setOptnPrtctInstrBal(SignedQuantityFormat10 value) {
        this.optnPrtctInstrBal = value;
    }

    /**
     * Gets the value of the evtDdlns property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionEventDeadlines3 }
     *     
     */
    public CorporateActionEventDeadlines3 getEvtDdlns() {
        return evtDdlns;
    }

    /**
     * Sets the value of the evtDdlns property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionEventDeadlines3 }
     *     
     */
    public void setEvtDdlns(CorporateActionEventDeadlines3 value) {
        this.evtDdlns = value;
    }

    /**
     * Gets the value of the optnInstrDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the optnInstrDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOptnInstrDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OptionInstructionDetails7 }
     * 
     * 
     * @return
     *     The value of the optnInstrDtls property.
     */
    public List<OptionInstructionDetails7> getOptnInstrDtls() {
        if (optnInstrDtls == null) {
            optnInstrDtls = new ArrayList<>();
        }
        return this.optnInstrDtls;
    }

}
