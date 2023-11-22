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

package org.jpos.iso20022.secl_005_001_02;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MarginReport2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="MarginReport2">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="MrgnPdct" type="{urn:iso:std:iso:20022:tech:xsd:secl.005.001.02}MarginProductType1Choice" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="MrgnAcct" type="{urn:iso:std:iso:20022:tech:xsd:secl.005.001.02}SecuritiesAccount18"/>
 *         <element name="CollsdMrgnAcctInd" type="{urn:iso:std:iso:20022:tech:xsd:secl.005.001.02}YesNoIndicator" minOccurs="0"/>
 *         <element name="NonClrMmb" type="{urn:iso:std:iso:20022:tech:xsd:secl.005.001.02}PartyIdentificationAndAccount31" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="MrgnClctnSummry" type="{urn:iso:std:iso:20022:tech:xsd:secl.005.001.02}MarginCalculation1" minOccurs="0"/>
 *         <element name="MrgnClctn" type="{urn:iso:std:iso:20022:tech:xsd:secl.005.001.02}MarginCalculation2" maxOccurs="unbounded"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MarginReport2", propOrder = {
    "mrgnPdct",
    "mrgnAcct",
    "collsdMrgnAcctInd",
    "nonClrMmb",
    "mrgnClctnSummry",
    "mrgnClctn"
})
public class MarginReport2 {

    @XmlElement(name = "MrgnPdct")
    protected List<MarginProductType1Choice> mrgnPdct;
    @XmlElement(name = "MrgnAcct", required = true)
    protected SecuritiesAccount18 mrgnAcct;
    @XmlElement(name = "CollsdMrgnAcctInd")
    protected Boolean collsdMrgnAcctInd;
    @XmlElement(name = "NonClrMmb")
    protected List<PartyIdentificationAndAccount31> nonClrMmb;
    @XmlElement(name = "MrgnClctnSummry")
    protected MarginCalculation1 mrgnClctnSummry;
    @XmlElement(name = "MrgnClctn", required = true)
    protected List<MarginCalculation2> mrgnClctn;

    /**
     * Gets the value of the mrgnPdct property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the mrgnPdct property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMrgnPdct().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MarginProductType1Choice }
     * 
     * 
     * @return
     *     The value of the mrgnPdct property.
     */
    public List<MarginProductType1Choice> getMrgnPdct() {
        if (mrgnPdct == null) {
            mrgnPdct = new ArrayList<>();
        }
        return this.mrgnPdct;
    }

    /**
     * Gets the value of the mrgnAcct property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesAccount18 }
     *     
     */
    public SecuritiesAccount18 getMrgnAcct() {
        return mrgnAcct;
    }

    /**
     * Sets the value of the mrgnAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesAccount18 }
     *     
     */
    public void setMrgnAcct(SecuritiesAccount18 value) {
        this.mrgnAcct = value;
    }

    /**
     * Gets the value of the collsdMrgnAcctInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCollsdMrgnAcctInd() {
        return collsdMrgnAcctInd;
    }

    /**
     * Sets the value of the collsdMrgnAcctInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCollsdMrgnAcctInd(Boolean value) {
        this.collsdMrgnAcctInd = value;
    }

    /**
     * Gets the value of the nonClrMmb property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the nonClrMmb property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNonClrMmb().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PartyIdentificationAndAccount31 }
     * 
     * 
     * @return
     *     The value of the nonClrMmb property.
     */
    public List<PartyIdentificationAndAccount31> getNonClrMmb() {
        if (nonClrMmb == null) {
            nonClrMmb = new ArrayList<>();
        }
        return this.nonClrMmb;
    }

    /**
     * Gets the value of the mrgnClctnSummry property.
     * 
     * @return
     *     possible object is
     *     {@link MarginCalculation1 }
     *     
     */
    public MarginCalculation1 getMrgnClctnSummry() {
        return mrgnClctnSummry;
    }

    /**
     * Sets the value of the mrgnClctnSummry property.
     * 
     * @param value
     *     allowed object is
     *     {@link MarginCalculation1 }
     *     
     */
    public void setMrgnClctnSummry(MarginCalculation1 value) {
        this.mrgnClctnSummry = value;
    }

    /**
     * Gets the value of the mrgnClctn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the mrgnClctn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMrgnClctn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MarginCalculation2 }
     * 
     * 
     * @return
     *     The value of the mrgnClctn property.
     */
    public List<MarginCalculation2> getMrgnClctn() {
        if (mrgnClctn == null) {
            mrgnClctn = new ArrayList<>();
        }
        return this.mrgnClctn;
    }

}
