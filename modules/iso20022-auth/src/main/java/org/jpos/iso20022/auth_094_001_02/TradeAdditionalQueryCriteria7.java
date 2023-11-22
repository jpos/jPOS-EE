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

package org.jpos.iso20022.auth_094_001_02;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TradeAdditionalQueryCriteria7 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="TradeAdditionalQueryCriteria7">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="ActnTp" type="{urn:iso:std:iso:20022:tech:xsd:auth.094.001.02}TransactionOperationType6Code" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="ExctnVn" type="{urn:iso:std:iso:20022:tech:xsd:auth.094.001.02}SecuritiesTradeVenueCriteria1Choice" minOccurs="0"/>
 *         <element name="NtrOfCtrPty" type="{urn:iso:std:iso:20022:tech:xsd:auth.094.001.02}PartyNatureType1Code" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="CorpSctr" type="{urn:iso:std:iso:20022:tech:xsd:auth.094.001.02}CorporateSectorCriteria5" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TradeAdditionalQueryCriteria7", propOrder = {
    "actnTp",
    "exctnVn",
    "ntrOfCtrPty",
    "corpSctr"
})
public class TradeAdditionalQueryCriteria7 {

    @XmlElement(name = "ActnTp")
    @XmlSchemaType(name = "string")
    protected List<TransactionOperationType6Code> actnTp;
    @XmlElement(name = "ExctnVn")
    protected SecuritiesTradeVenueCriteria1Choice exctnVn;
    @XmlElement(name = "NtrOfCtrPty")
    @XmlSchemaType(name = "string")
    protected List<PartyNatureType1Code> ntrOfCtrPty;
    @XmlElement(name = "CorpSctr")
    protected List<CorporateSectorCriteria5> corpSctr;

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
     * {@link TransactionOperationType6Code }
     * 
     * 
     * @return
     *     The value of the actnTp property.
     */
    public List<TransactionOperationType6Code> getActnTp() {
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
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the ntrOfCtrPty property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNtrOfCtrPty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PartyNatureType1Code }
     * 
     * 
     * @return
     *     The value of the ntrOfCtrPty property.
     */
    public List<PartyNatureType1Code> getNtrOfCtrPty() {
        if (ntrOfCtrPty == null) {
            ntrOfCtrPty = new ArrayList<>();
        }
        return this.ntrOfCtrPty;
    }

    /**
     * Gets the value of the corpSctr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the corpSctr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCorpSctr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CorporateSectorCriteria5 }
     * 
     * 
     * @return
     *     The value of the corpSctr property.
     */
    public List<CorporateSectorCriteria5> getCorpSctr() {
        if (corpSctr == null) {
            corpSctr = new ArrayList<>();
        }
        return this.corpSctr;
    }

}
