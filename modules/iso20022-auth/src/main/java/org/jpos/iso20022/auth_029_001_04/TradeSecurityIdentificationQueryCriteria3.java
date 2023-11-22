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
 * <p>Java class for TradeSecurityIdentificationQueryCriteria3 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="TradeSecurityIdentificationQueryCriteria3">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Oprtr" type="{urn:iso:std:iso:20022:tech:xsd:auth.029.001.04}Operation3Code"/>
 *         <element name="Id" type="{urn:iso:std:iso:20022:tech:xsd:auth.029.001.04}SecurityIdentificationQueryCriteria1" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="CtrctTp" type="{urn:iso:std:iso:20022:tech:xsd:auth.029.001.04}FinancialInstrumentContractType2Code" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="ISIN" type="{urn:iso:std:iso:20022:tech:xsd:auth.029.001.04}ISINQueryCriteria1" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="UnqPdctIdr" type="{urn:iso:std:iso:20022:tech:xsd:auth.029.001.04}UPIQueryCriteria1" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="UndrlygInstrmId" type="{urn:iso:std:iso:20022:tech:xsd:auth.029.001.04}SecurityIdentificationQuery4Choice" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TradeSecurityIdentificationQueryCriteria3", propOrder = {
    "oprtr",
    "id",
    "ctrctTp",
    "isin",
    "unqPdctIdr",
    "undrlygInstrmId"
})
public class TradeSecurityIdentificationQueryCriteria3 {

    @XmlElement(name = "Oprtr", required = true)
    @XmlSchemaType(name = "string")
    protected Operation3Code oprtr;
    @XmlElement(name = "Id")
    protected List<SecurityIdentificationQueryCriteria1> id;
    @XmlElement(name = "CtrctTp")
    @XmlSchemaType(name = "string")
    protected List<FinancialInstrumentContractType2Code> ctrctTp;
    @XmlElement(name = "ISIN")
    protected List<ISINQueryCriteria1> isin;
    @XmlElement(name = "UnqPdctIdr")
    protected List<UPIQueryCriteria1> unqPdctIdr;
    @XmlElement(name = "UndrlygInstrmId")
    protected List<SecurityIdentificationQuery4Choice> undrlygInstrmId;

    /**
     * Gets the value of the oprtr property.
     * 
     * @return
     *     possible object is
     *     {@link Operation3Code }
     *     
     */
    public Operation3Code getOprtr() {
        return oprtr;
    }

    /**
     * Sets the value of the oprtr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Operation3Code }
     *     
     */
    public void setOprtr(Operation3Code value) {
        this.oprtr = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the id property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SecurityIdentificationQueryCriteria1 }
     * 
     * 
     * @return
     *     The value of the id property.
     */
    public List<SecurityIdentificationQueryCriteria1> getId() {
        if (id == null) {
            id = new ArrayList<>();
        }
        return this.id;
    }

    /**
     * Gets the value of the ctrctTp property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the ctrctTp property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCtrctTp().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FinancialInstrumentContractType2Code }
     * 
     * 
     * @return
     *     The value of the ctrctTp property.
     */
    public List<FinancialInstrumentContractType2Code> getCtrctTp() {
        if (ctrctTp == null) {
            ctrctTp = new ArrayList<>();
        }
        return this.ctrctTp;
    }

    /**
     * Gets the value of the isin property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the isin property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getISIN().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ISINQueryCriteria1 }
     * 
     * 
     * @return
     *     The value of the isin property.
     */
    public List<ISINQueryCriteria1> getISIN() {
        if (isin == null) {
            isin = new ArrayList<>();
        }
        return this.isin;
    }

    /**
     * Gets the value of the unqPdctIdr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the unqPdctIdr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUnqPdctIdr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UPIQueryCriteria1 }
     * 
     * 
     * @return
     *     The value of the unqPdctIdr property.
     */
    public List<UPIQueryCriteria1> getUnqPdctIdr() {
        if (unqPdctIdr == null) {
            unqPdctIdr = new ArrayList<>();
        }
        return this.unqPdctIdr;
    }

    /**
     * Gets the value of the undrlygInstrmId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the undrlygInstrmId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUndrlygInstrmId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SecurityIdentificationQuery4Choice }
     * 
     * 
     * @return
     *     The value of the undrlygInstrmId property.
     */
    public List<SecurityIdentificationQuery4Choice> getUndrlygInstrmId() {
        if (undrlygInstrmId == null) {
            undrlygInstrmId = new ArrayList<>();
        }
        return this.undrlygInstrmId;
    }

}
