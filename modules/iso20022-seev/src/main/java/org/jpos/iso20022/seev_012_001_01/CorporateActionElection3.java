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

package org.jpos.iso20022.seev_012_001_01;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CorporateActionElection3 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="CorporateActionElection3">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="AcctDtls" type="{urn:iso:std:iso:20022:tech:xsd:seev.012.001.01}SecuritiesAccount7" minOccurs="0"/>
 *         <element name="OptnTp" type="{urn:iso:std:iso:20022:tech:xsd:seev.012.001.01}CorporateActionOption1FormatChoice" minOccurs="0"/>
 *         <element name="OptnNb" type="{urn:iso:std:iso:20022:tech:xsd:seev.012.001.01}Exact3NumericText" minOccurs="0"/>
 *         <element name="InstdUndrlygSctiesQty" type="{urn:iso:std:iso:20022:tech:xsd:seev.012.001.01}UnitOrFaceAmount1Choice" minOccurs="0"/>
 *         <element name="InstdSctiesQtyToRcv" type="{urn:iso:std:iso:20022:tech:xsd:seev.012.001.01}UnitOrFaceAmount1Choice" minOccurs="0"/>
 *         <element name="PropsdRate" type="{urn:iso:std:iso:20022:tech:xsd:seev.012.001.01}PercentageRate" minOccurs="0"/>
 *         <element name="CshMvmntDtls" type="{urn:iso:std:iso:20022:tech:xsd:seev.012.001.01}CorporateActionCashMovements2" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="SctiesMvmntDtls" type="{urn:iso:std:iso:20022:tech:xsd:seev.012.001.01}CorporateActionSecuritiesMovement2" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CorporateActionElection3", propOrder = {
    "acctDtls",
    "optnTp",
    "optnNb",
    "instdUndrlygSctiesQty",
    "instdSctiesQtyToRcv",
    "propsdRate",
    "cshMvmntDtls",
    "sctiesMvmntDtls"
})
public class CorporateActionElection3 {

    @XmlElement(name = "AcctDtls")
    protected SecuritiesAccount7 acctDtls;
    @XmlElement(name = "OptnTp")
    protected CorporateActionOption1FormatChoice optnTp;
    @XmlElement(name = "OptnNb")
    protected String optnNb;
    @XmlElement(name = "InstdUndrlygSctiesQty")
    protected UnitOrFaceAmount1Choice instdUndrlygSctiesQty;
    @XmlElement(name = "InstdSctiesQtyToRcv")
    protected UnitOrFaceAmount1Choice instdSctiesQtyToRcv;
    @XmlElement(name = "PropsdRate")
    protected BigDecimal propsdRate;
    @XmlElement(name = "CshMvmntDtls")
    protected List<CorporateActionCashMovements2> cshMvmntDtls;
    @XmlElement(name = "SctiesMvmntDtls")
    protected List<CorporateActionSecuritiesMovement2> sctiesMvmntDtls;

    /**
     * Gets the value of the acctDtls property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesAccount7 }
     *     
     */
    public SecuritiesAccount7 getAcctDtls() {
        return acctDtls;
    }

    /**
     * Sets the value of the acctDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesAccount7 }
     *     
     */
    public void setAcctDtls(SecuritiesAccount7 value) {
        this.acctDtls = value;
    }

    /**
     * Gets the value of the optnTp property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionOption1FormatChoice }
     *     
     */
    public CorporateActionOption1FormatChoice getOptnTp() {
        return optnTp;
    }

    /**
     * Sets the value of the optnTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionOption1FormatChoice }
     *     
     */
    public void setOptnTp(CorporateActionOption1FormatChoice value) {
        this.optnTp = value;
    }

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
     * Gets the value of the instdUndrlygSctiesQty property.
     * 
     * @return
     *     possible object is
     *     {@link UnitOrFaceAmount1Choice }
     *     
     */
    public UnitOrFaceAmount1Choice getInstdUndrlygSctiesQty() {
        return instdUndrlygSctiesQty;
    }

    /**
     * Sets the value of the instdUndrlygSctiesQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnitOrFaceAmount1Choice }
     *     
     */
    public void setInstdUndrlygSctiesQty(UnitOrFaceAmount1Choice value) {
        this.instdUndrlygSctiesQty = value;
    }

    /**
     * Gets the value of the instdSctiesQtyToRcv property.
     * 
     * @return
     *     possible object is
     *     {@link UnitOrFaceAmount1Choice }
     *     
     */
    public UnitOrFaceAmount1Choice getInstdSctiesQtyToRcv() {
        return instdSctiesQtyToRcv;
    }

    /**
     * Sets the value of the instdSctiesQtyToRcv property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnitOrFaceAmount1Choice }
     *     
     */
    public void setInstdSctiesQtyToRcv(UnitOrFaceAmount1Choice value) {
        this.instdSctiesQtyToRcv = value;
    }

    /**
     * Gets the value of the propsdRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPropsdRate() {
        return propsdRate;
    }

    /**
     * Sets the value of the propsdRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPropsdRate(BigDecimal value) {
        this.propsdRate = value;
    }

    /**
     * Gets the value of the cshMvmntDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the cshMvmntDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCshMvmntDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CorporateActionCashMovements2 }
     * 
     * 
     * @return
     *     The value of the cshMvmntDtls property.
     */
    public List<CorporateActionCashMovements2> getCshMvmntDtls() {
        if (cshMvmntDtls == null) {
            cshMvmntDtls = new ArrayList<>();
        }
        return this.cshMvmntDtls;
    }

    /**
     * Gets the value of the sctiesMvmntDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the sctiesMvmntDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSctiesMvmntDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CorporateActionSecuritiesMovement2 }
     * 
     * 
     * @return
     *     The value of the sctiesMvmntDtls property.
     */
    public List<CorporateActionSecuritiesMovement2> getSctiesMvmntDtls() {
        if (sctiesMvmntDtls == null) {
            sctiesMvmntDtls = new ArrayList<>();
        }
        return this.sctiesMvmntDtls;
    }

}
