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

package org.jpos.iso20022.auth_106_001_01;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DetailedTransactionStatistics26 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="DetailedTransactionStatistics26">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="NbOfOutsdngDerivs" type="{urn:iso:std:iso:20022:tech:xsd:auth.106.001.01}Number"/>
 *         <element name="NbOfOutsdngDerivsWthNoMrgnInf" type="{urn:iso:std:iso:20022:tech:xsd:auth.106.001.01}Number"/>
 *         <element name="NbOfOutsdngDerivsWthOutdtdMrgnInf" type="{urn:iso:std:iso:20022:tech:xsd:auth.106.001.01}Number"/>
 *         <element name="Wrnngs" type="{urn:iso:std:iso:20022:tech:xsd:auth.106.001.01}MissingMarginData2" maxOccurs="unbounded"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DetailedTransactionStatistics26", propOrder = {
    "nbOfOutsdngDerivs",
    "nbOfOutsdngDerivsWthNoMrgnInf",
    "nbOfOutsdngDerivsWthOutdtdMrgnInf",
    "wrnngs"
})
public class DetailedTransactionStatistics26 {

    @XmlElement(name = "NbOfOutsdngDerivs", required = true)
    protected BigDecimal nbOfOutsdngDerivs;
    @XmlElement(name = "NbOfOutsdngDerivsWthNoMrgnInf", required = true)
    protected BigDecimal nbOfOutsdngDerivsWthNoMrgnInf;
    @XmlElement(name = "NbOfOutsdngDerivsWthOutdtdMrgnInf", required = true)
    protected BigDecimal nbOfOutsdngDerivsWthOutdtdMrgnInf;
    @XmlElement(name = "Wrnngs", required = true)
    protected List<MissingMarginData2> wrnngs;

    /**
     * Gets the value of the nbOfOutsdngDerivs property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNbOfOutsdngDerivs() {
        return nbOfOutsdngDerivs;
    }

    /**
     * Sets the value of the nbOfOutsdngDerivs property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNbOfOutsdngDerivs(BigDecimal value) {
        this.nbOfOutsdngDerivs = value;
    }

    /**
     * Gets the value of the nbOfOutsdngDerivsWthNoMrgnInf property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNbOfOutsdngDerivsWthNoMrgnInf() {
        return nbOfOutsdngDerivsWthNoMrgnInf;
    }

    /**
     * Sets the value of the nbOfOutsdngDerivsWthNoMrgnInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNbOfOutsdngDerivsWthNoMrgnInf(BigDecimal value) {
        this.nbOfOutsdngDerivsWthNoMrgnInf = value;
    }

    /**
     * Gets the value of the nbOfOutsdngDerivsWthOutdtdMrgnInf property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNbOfOutsdngDerivsWthOutdtdMrgnInf() {
        return nbOfOutsdngDerivsWthOutdtdMrgnInf;
    }

    /**
     * Sets the value of the nbOfOutsdngDerivsWthOutdtdMrgnInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNbOfOutsdngDerivsWthOutdtdMrgnInf(BigDecimal value) {
        this.nbOfOutsdngDerivsWthOutdtdMrgnInf = value;
    }

    /**
     * Gets the value of the wrnngs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the wrnngs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWrnngs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MissingMarginData2 }
     * 
     * 
     * @return
     *     The value of the wrnngs property.
     */
    public List<MissingMarginData2> getWrnngs() {
        if (wrnngs == null) {
            wrnngs = new ArrayList<>();
        }
        return this.wrnngs;
    }

}
