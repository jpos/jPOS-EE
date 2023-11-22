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
 * <p>Java class for MarginCalculation2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="MarginCalculation2">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="FinInstrmId" type="{urn:iso:std:iso:20022:tech:xsd:secl.005.001.02}SecurityIdentification14" minOccurs="0"/>
 *         <element name="XpsrAmt" type="{urn:iso:std:iso:20022:tech:xsd:secl.005.001.02}Amount2" minOccurs="0"/>
 *         <element name="TtlMrgnAmt" type="{urn:iso:std:iso:20022:tech:xsd:secl.005.001.02}AmountAndDirection20"/>
 *         <element name="CollOnDpst" type="{urn:iso:std:iso:20022:tech:xsd:secl.005.001.02}Collateral6" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="MinRqrmntDpst" type="{urn:iso:std:iso:20022:tech:xsd:secl.005.001.02}ActiveCurrencyAndAmount" minOccurs="0"/>
 *         <element name="MrgnRslt" type="{urn:iso:std:iso:20022:tech:xsd:secl.005.001.02}MarginResult1Choice" minOccurs="0"/>
 *         <element name="MrgnTpAmt" type="{urn:iso:std:iso:20022:tech:xsd:secl.005.001.02}Margin3" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MarginCalculation2", propOrder = {
    "finInstrmId",
    "xpsrAmt",
    "ttlMrgnAmt",
    "collOnDpst",
    "minRqrmntDpst",
    "mrgnRslt",
    "mrgnTpAmt"
})
public class MarginCalculation2 {

    @XmlElement(name = "FinInstrmId")
    protected SecurityIdentification14 finInstrmId;
    @XmlElement(name = "XpsrAmt")
    protected Amount2 xpsrAmt;
    @XmlElement(name = "TtlMrgnAmt", required = true)
    protected AmountAndDirection20 ttlMrgnAmt;
    @XmlElement(name = "CollOnDpst")
    protected List<Collateral6> collOnDpst;
    @XmlElement(name = "MinRqrmntDpst")
    protected ActiveCurrencyAndAmount minRqrmntDpst;
    @XmlElement(name = "MrgnRslt")
    protected MarginResult1Choice mrgnRslt;
    @XmlElement(name = "MrgnTpAmt")
    protected Margin3 mrgnTpAmt;

    /**
     * Gets the value of the finInstrmId property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityIdentification14 }
     *     
     */
    public SecurityIdentification14 getFinInstrmId() {
        return finInstrmId;
    }

    /**
     * Sets the value of the finInstrmId property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityIdentification14 }
     *     
     */
    public void setFinInstrmId(SecurityIdentification14 value) {
        this.finInstrmId = value;
    }

    /**
     * Gets the value of the xpsrAmt property.
     * 
     * @return
     *     possible object is
     *     {@link Amount2 }
     *     
     */
    public Amount2 getXpsrAmt() {
        return xpsrAmt;
    }

    /**
     * Sets the value of the xpsrAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Amount2 }
     *     
     */
    public void setXpsrAmt(Amount2 value) {
        this.xpsrAmt = value;
    }

    /**
     * Gets the value of the ttlMrgnAmt property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection20 }
     *     
     */
    public AmountAndDirection20 getTtlMrgnAmt() {
        return ttlMrgnAmt;
    }

    /**
     * Sets the value of the ttlMrgnAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection20 }
     *     
     */
    public void setTtlMrgnAmt(AmountAndDirection20 value) {
        this.ttlMrgnAmt = value;
    }

    /**
     * Gets the value of the collOnDpst property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the collOnDpst property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCollOnDpst().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Collateral6 }
     * 
     * 
     * @return
     *     The value of the collOnDpst property.
     */
    public List<Collateral6> getCollOnDpst() {
        if (collOnDpst == null) {
            collOnDpst = new ArrayList<>();
        }
        return this.collOnDpst;
    }

    /**
     * Gets the value of the minRqrmntDpst property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getMinRqrmntDpst() {
        return minRqrmntDpst;
    }

    /**
     * Sets the value of the minRqrmntDpst property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public void setMinRqrmntDpst(ActiveCurrencyAndAmount value) {
        this.minRqrmntDpst = value;
    }

    /**
     * Gets the value of the mrgnRslt property.
     * 
     * @return
     *     possible object is
     *     {@link MarginResult1Choice }
     *     
     */
    public MarginResult1Choice getMrgnRslt() {
        return mrgnRslt;
    }

    /**
     * Sets the value of the mrgnRslt property.
     * 
     * @param value
     *     allowed object is
     *     {@link MarginResult1Choice }
     *     
     */
    public void setMrgnRslt(MarginResult1Choice value) {
        this.mrgnRslt = value;
    }

    /**
     * Gets the value of the mrgnTpAmt property.
     * 
     * @return
     *     possible object is
     *     {@link Margin3 }
     *     
     */
    public Margin3 getMrgnTpAmt() {
        return mrgnTpAmt;
    }

    /**
     * Sets the value of the mrgnTpAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Margin3 }
     *     
     */
    public void setMrgnTpAmt(Margin3 value) {
        this.mrgnTpAmt = value;
    }

}
