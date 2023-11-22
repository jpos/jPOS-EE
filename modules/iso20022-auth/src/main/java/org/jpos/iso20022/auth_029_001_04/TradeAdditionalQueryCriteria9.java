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

package org.jpos.iso20022.auth_029_001_04;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TradeAdditionalQueryCriteria9 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="TradeAdditionalQueryCriteria9">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="ActnTp" type="{urn:iso:std:iso:20022:tech:xsd:auth.029.001.04}TransactionOperationType8Code" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="ExctnVn" type="{urn:iso:std:iso:20022:tech:xsd:auth.029.001.04}SecuritiesTradeVenueCriteria1Choice" minOccurs="0"/>
 *         <element name="NtrOfCtrPty" type="{urn:iso:std:iso:20022:tech:xsd:auth.029.001.04}PartyNatureType1Code" minOccurs="0"/>
 *         <element name="CorpSctr" type="{urn:iso:std:iso:20022:tech:xsd:auth.029.001.04}CorporateSectorCriteria6" minOccurs="0"/>
 *         <element name="AsstClss" type="{urn:iso:std:iso:20022:tech:xsd:auth.029.001.04}ProductType4Code" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="PdctClssfctn" type="{urn:iso:std:iso:20022:tech:xsd:auth.029.001.04}ProductClassificationCriteria1" minOccurs="0"/>
 *         <element name="Lvl" type="{urn:iso:std:iso:20022:tech:xsd:auth.029.001.04}ModificationLevel1Code" minOccurs="0"/>
 *         <element name="EvtTp" type="{urn:iso:std:iso:20022:tech:xsd:auth.029.001.04}DerivativeEventType3Code" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TradeAdditionalQueryCriteria9", propOrder = {
    "actnTp",
    "exctnVn",
    "ntrOfCtrPty",
    "corpSctr",
    "asstClss",
    "pdctClssfctn",
    "lvl",
    "evtTp"
})
public class TradeAdditionalQueryCriteria9 {

    @XmlElement(name = "ActnTp")
    @XmlSchemaType(name = "string")
    protected List<TransactionOperationType8Code> actnTp;
    @XmlElement(name = "ExctnVn")
    protected SecuritiesTradeVenueCriteria1Choice exctnVn;
    @XmlElement(name = "NtrOfCtrPty")
    @XmlSchemaType(name = "string")
    protected PartyNatureType1Code ntrOfCtrPty;
    @XmlElement(name = "CorpSctr")
    protected CorporateSectorCriteria6 corpSctr;
    @XmlElement(name = "AsstClss")
    @XmlSchemaType(name = "string")
    protected List<ProductType4Code> asstClss;
    @XmlElement(name = "PdctClssfctn")
    protected ProductClassificationCriteria1 pdctClssfctn;
    @XmlElement(name = "Lvl")
    @XmlSchemaType(name = "string")
    protected ModificationLevel1Code lvl;
    @XmlElement(name = "EvtTp")
    @XmlSchemaType(name = "string")
    protected List<DerivativeEventType3Code> evtTp;

    /**
     * Gets the value of the actnTp property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the actnTp property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getActnTp().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TransactionOperationType8Code }
     * 
     * 
     * @return
     *     The value of the actnTp property.
     */
    public List<TransactionOperationType8Code> getActnTp() {
        if (actnTp == null) {
            actnTp = new ArrayList<>();
        }
        return this.actnTp;
    }

    /**
     * Gets the value of the exctnVn property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesTradeVenueCriteria1Choice }
     *     
     */
    public SecuritiesTradeVenueCriteria1Choice getExctnVn() {
        return exctnVn;
    }

    /**
     * Sets the value of the exctnVn property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesTradeVenueCriteria1Choice }
     *     
     */
    public void setExctnVn(SecuritiesTradeVenueCriteria1Choice value) {
        this.exctnVn = value;
    }

    /**
     * Gets the value of the ntrOfCtrPty property.
     * 
     * @return
     *     possible object is
     *     {@link PartyNatureType1Code }
     *     
     */
    public PartyNatureType1Code getNtrOfCtrPty() {
        return ntrOfCtrPty;
    }

    /**
     * Sets the value of the ntrOfCtrPty property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyNatureType1Code }
     *     
     */
    public void setNtrOfCtrPty(PartyNatureType1Code value) {
        this.ntrOfCtrPty = value;
    }

    /**
     * Gets the value of the corpSctr property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateSectorCriteria6 }
     *     
     */
    public CorporateSectorCriteria6 getCorpSctr() {
        return corpSctr;
    }

    /**
     * Sets the value of the corpSctr property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateSectorCriteria6 }
     *     
     */
    public void setCorpSctr(CorporateSectorCriteria6 value) {
        this.corpSctr = value;
    }

    /**
     * Gets the value of the asstClss property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the asstClss property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAsstClss().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProductType4Code }
     * 
     * 
     * @return
     *     The value of the asstClss property.
     */
    public List<ProductType4Code> getAsstClss() {
        if (asstClss == null) {
            asstClss = new ArrayList<>();
        }
        return this.asstClss;
    }

    /**
     * Gets the value of the pdctClssfctn property.
     * 
     * @return
     *     possible object is
     *     {@link ProductClassificationCriteria1 }
     *     
     */
    public ProductClassificationCriteria1 getPdctClssfctn() {
        return pdctClssfctn;
    }

    /**
     * Sets the value of the pdctClssfctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductClassificationCriteria1 }
     *     
     */
    public void setPdctClssfctn(ProductClassificationCriteria1 value) {
        this.pdctClssfctn = value;
    }

    /**
     * Gets the value of the lvl property.
     * 
     * @return
     *     possible object is
     *     {@link ModificationLevel1Code }
     *     
     */
    public ModificationLevel1Code getLvl() {
        return lvl;
    }

    /**
     * Sets the value of the lvl property.
     * 
     * @param value
     *     allowed object is
     *     {@link ModificationLevel1Code }
     *     
     */
    public void setLvl(ModificationLevel1Code value) {
        this.lvl = value;
    }

    /**
     * Gets the value of the evtTp property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the evtTp property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEvtTp().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DerivativeEventType3Code }
     * 
     * 
     * @return
     *     The value of the evtTp property.
     */
    public List<DerivativeEventType3Code> getEvtTp() {
        if (evtTp == null) {
            evtTp = new ArrayList<>();
        }
        return this.evtTp;
    }

}
