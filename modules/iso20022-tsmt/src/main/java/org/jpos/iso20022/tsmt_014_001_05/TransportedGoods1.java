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

package org.jpos.iso20022.tsmt_014_001_05;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TransportedGoods1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="TransportedGoods1">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="PurchsOrdrRef" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.014.001.05}DocumentIdentification7"/>
 *         <element name="GoodsDesc" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.014.001.05}Max70Text" minOccurs="0"/>
 *         <element name="BuyrDfndInf" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.014.001.05}UserDefinedInformation1" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="SellrDfndInf" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.014.001.05}UserDefinedInformation1" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransportedGoods1", propOrder = {
    "purchsOrdrRef",
    "goodsDesc",
    "buyrDfndInf",
    "sellrDfndInf"
})
public class TransportedGoods1 {

    @XmlElement(name = "PurchsOrdrRef", required = true)
    protected DocumentIdentification7 purchsOrdrRef;
    @XmlElement(name = "GoodsDesc")
    protected String goodsDesc;
    @XmlElement(name = "BuyrDfndInf")
    protected List<UserDefinedInformation1> buyrDfndInf;
    @XmlElement(name = "SellrDfndInf")
    protected List<UserDefinedInformation1> sellrDfndInf;

    /**
     * Gets the value of the purchsOrdrRef property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentIdentification7 }
     *     
     */
    public DocumentIdentification7 getPurchsOrdrRef() {
        return purchsOrdrRef;
    }

    /**
     * Sets the value of the purchsOrdrRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentIdentification7 }
     *     
     */
    public void setPurchsOrdrRef(DocumentIdentification7 value) {
        this.purchsOrdrRef = value;
    }

    /**
     * Gets the value of the goodsDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGoodsDesc() {
        return goodsDesc;
    }

    /**
     * Sets the value of the goodsDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGoodsDesc(String value) {
        this.goodsDesc = value;
    }

    /**
     * Gets the value of the buyrDfndInf property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the buyrDfndInf property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBuyrDfndInf().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UserDefinedInformation1 }
     * 
     * 
     * @return
     *     The value of the buyrDfndInf property.
     */
    public List<UserDefinedInformation1> getBuyrDfndInf() {
        if (buyrDfndInf == null) {
            buyrDfndInf = new ArrayList<>();
        }
        return this.buyrDfndInf;
    }

    /**
     * Gets the value of the sellrDfndInf property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the sellrDfndInf property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSellrDfndInf().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UserDefinedInformation1 }
     * 
     * 
     * @return
     *     The value of the sellrDfndInf property.
     */
    public List<UserDefinedInformation1> getSellrDfndInf() {
        if (sellrDfndInf == null) {
            sellrDfndInf = new ArrayList<>();
        }
        return this.sellrDfndInf;
    }

}
