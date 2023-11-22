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

package org.jpos.iso20022.seev_020_001_01;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProceedsMovement1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ProceedsMovement1">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="CshPrcdsMvmntDtls" type="{urn:iso:std:iso:20022:tech:xsd:seev.020.001.01}CashProceeds1" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="SctiesPrcdsMvmntDtls" type="{urn:iso:std:iso:20022:tech:xsd:seev.020.001.01}SecuritiesProceeds1" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="TaxDtls" type="{urn:iso:std:iso:20022:tech:xsd:seev.020.001.01}TaxVoucher1" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProceedsMovement1", propOrder = {
    "cshPrcdsMvmntDtls",
    "sctiesPrcdsMvmntDtls",
    "taxDtls"
})
public class ProceedsMovement1 {

    @XmlElement(name = "CshPrcdsMvmntDtls")
    protected List<CashProceeds1> cshPrcdsMvmntDtls;
    @XmlElement(name = "SctiesPrcdsMvmntDtls")
    protected List<SecuritiesProceeds1> sctiesPrcdsMvmntDtls;
    @XmlElement(name = "TaxDtls")
    protected TaxVoucher1 taxDtls;

    /**
     * Gets the value of the cshPrcdsMvmntDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the cshPrcdsMvmntDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCshPrcdsMvmntDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CashProceeds1 }
     * 
     * 
     * @return
     *     The value of the cshPrcdsMvmntDtls property.
     */
    public List<CashProceeds1> getCshPrcdsMvmntDtls() {
        if (cshPrcdsMvmntDtls == null) {
            cshPrcdsMvmntDtls = new ArrayList<>();
        }
        return this.cshPrcdsMvmntDtls;
    }

    /**
     * Gets the value of the sctiesPrcdsMvmntDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the sctiesPrcdsMvmntDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSctiesPrcdsMvmntDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SecuritiesProceeds1 }
     * 
     * 
     * @return
     *     The value of the sctiesPrcdsMvmntDtls property.
     */
    public List<SecuritiesProceeds1> getSctiesPrcdsMvmntDtls() {
        if (sctiesPrcdsMvmntDtls == null) {
            sctiesPrcdsMvmntDtls = new ArrayList<>();
        }
        return this.sctiesPrcdsMvmntDtls;
    }

    /**
     * Gets the value of the taxDtls property.
     * 
     * @return
     *     possible object is
     *     {@link TaxVoucher1 }
     *     
     */
    public TaxVoucher1 getTaxDtls() {
        return taxDtls;
    }

    /**
     * Sets the value of the taxDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxVoucher1 }
     *     
     */
    public void setTaxDtls(TaxVoucher1 value) {
        this.taxDtls = value;
    }

}
