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

package org.jpos.iso20022.colr_007_001_06;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Collateral55 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="Collateral55">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="MrgnCallReqId" type="{urn:iso:std:iso:20022:tech:xsd:colr.007.001.06}Max35Text"/>
 *         <element name="MrgnCallRspnId" type="{urn:iso:std:iso:20022:tech:xsd:colr.007.001.06}Max35Text" minOccurs="0"/>
 *         <element name="StdSttlmInstrs" type="{urn:iso:std:iso:20022:tech:xsd:colr.007.001.06}Max140Text" minOccurs="0"/>
 *         <element name="CollPrpslRspnId" type="{urn:iso:std:iso:20022:tech:xsd:colr.007.001.06}Max35Text" minOccurs="0"/>
 *         <element name="SctiesColl" type="{urn:iso:std:iso:20022:tech:xsd:colr.007.001.06}SecuritiesCollateral10" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="CshColl" type="{urn:iso:std:iso:20022:tech:xsd:colr.007.001.06}CashCollateral3" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="OthrColl" type="{urn:iso:std:iso:20022:tech:xsd:colr.007.001.06}OtherCollateral9" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Collateral55", propOrder = {
    "mrgnCallReqId",
    "mrgnCallRspnId",
    "stdSttlmInstrs",
    "collPrpslRspnId",
    "sctiesColl",
    "cshColl",
    "othrColl"
})
public class Collateral55 {

    @XmlElement(name = "MrgnCallReqId", required = true)
    protected String mrgnCallReqId;
    @XmlElement(name = "MrgnCallRspnId")
    protected String mrgnCallRspnId;
    @XmlElement(name = "StdSttlmInstrs")
    protected String stdSttlmInstrs;
    @XmlElement(name = "CollPrpslRspnId")
    protected String collPrpslRspnId;
    @XmlElement(name = "SctiesColl")
    protected List<SecuritiesCollateral10> sctiesColl;
    @XmlElement(name = "CshColl")
    protected List<CashCollateral3> cshColl;
    @XmlElement(name = "OthrColl")
    protected List<OtherCollateral9> othrColl;

    /**
     * Gets the value of the mrgnCallReqId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMrgnCallReqId() {
        return mrgnCallReqId;
    }

    /**
     * Sets the value of the mrgnCallReqId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMrgnCallReqId(String value) {
        this.mrgnCallReqId = value;
    }

    /**
     * Gets the value of the mrgnCallRspnId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMrgnCallRspnId() {
        return mrgnCallRspnId;
    }

    /**
     * Sets the value of the mrgnCallRspnId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMrgnCallRspnId(String value) {
        this.mrgnCallRspnId = value;
    }

    /**
     * Gets the value of the stdSttlmInstrs property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStdSttlmInstrs() {
        return stdSttlmInstrs;
    }

    /**
     * Sets the value of the stdSttlmInstrs property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStdSttlmInstrs(String value) {
        this.stdSttlmInstrs = value;
    }

    /**
     * Gets the value of the collPrpslRspnId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCollPrpslRspnId() {
        return collPrpslRspnId;
    }

    /**
     * Sets the value of the collPrpslRspnId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCollPrpslRspnId(String value) {
        this.collPrpslRspnId = value;
    }

    /**
     * Gets the value of the sctiesColl property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the sctiesColl property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSctiesColl().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SecuritiesCollateral10 }
     * 
     * 
     * @return
     *     The value of the sctiesColl property.
     */
    public List<SecuritiesCollateral10> getSctiesColl() {
        if (sctiesColl == null) {
            sctiesColl = new ArrayList<>();
        }
        return this.sctiesColl;
    }

    /**
     * Gets the value of the cshColl property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the cshColl property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCshColl().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CashCollateral3 }
     * 
     * 
     * @return
     *     The value of the cshColl property.
     */
    public List<CashCollateral3> getCshColl() {
        if (cshColl == null) {
            cshColl = new ArrayList<>();
        }
        return this.cshColl;
    }

    /**
     * Gets the value of the othrColl property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the othrColl property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOthrColl().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OtherCollateral9 }
     * 
     * 
     * @return
     *     The value of the othrColl property.
     */
    public List<OtherCollateral9> getOthrColl() {
        if (othrColl == null) {
            othrColl = new ArrayList<>();
        }
        return this.othrColl;
    }

}
