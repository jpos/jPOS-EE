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

package org.jpos.iso20022.seev_017_001_01;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GlobalDistributionRequest1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="GlobalDistributionRequest1">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="PradvcInd" type="{urn:iso:std:iso:20022:tech:xsd:seev.017.001.01}YesNoIndicator"/>
 *         <element name="OptnNb" type="{urn:iso:std:iso:20022:tech:xsd:seev.017.001.01}Exact3NumericText"/>
 *         <element name="OptnTp" type="{urn:iso:std:iso:20022:tech:xsd:seev.017.001.01}CorporateActionOption1FormatChoice"/>
 *         <element name="RcrdDt" type="{urn:iso:std:iso:20022:tech:xsd:seev.017.001.01}DateFormat4Choice"/>
 *         <element name="PmtDt" type="{urn:iso:std:iso:20022:tech:xsd:seev.017.001.01}DateFormat4Choice"/>
 *         <element name="SctiesMvmnt" type="{urn:iso:std:iso:20022:tech:xsd:seev.017.001.01}SecurityMovement1" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="CshMvmnt" type="{urn:iso:std:iso:20022:tech:xsd:seev.017.001.01}CashMovement1" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GlobalDistributionRequest1", propOrder = {
    "pradvcInd",
    "optnNb",
    "optnTp",
    "rcrdDt",
    "pmtDt",
    "sctiesMvmnt",
    "cshMvmnt"
})
public class GlobalDistributionRequest1 {

    @XmlElement(name = "PradvcInd")
    protected boolean pradvcInd;
    @XmlElement(name = "OptnNb", required = true)
    protected String optnNb;
    @XmlElement(name = "OptnTp", required = true)
    protected CorporateActionOption1FormatChoice optnTp;
    @XmlElement(name = "RcrdDt", required = true)
    protected DateFormat4Choice rcrdDt;
    @XmlElement(name = "PmtDt", required = true)
    protected DateFormat4Choice pmtDt;
    @XmlElement(name = "SctiesMvmnt")
    protected List<SecurityMovement1> sctiesMvmnt;
    @XmlElement(name = "CshMvmnt")
    protected List<CashMovement1> cshMvmnt;

    /**
     * Gets the value of the pradvcInd property.
     * 
     */
    public boolean isPradvcInd() {
        return pradvcInd;
    }

    /**
     * Sets the value of the pradvcInd property.
     * 
     */
    public void setPradvcInd(boolean value) {
        this.pradvcInd = value;
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
     * Gets the value of the rcrdDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat4Choice }
     *     
     */
    public DateFormat4Choice getRcrdDt() {
        return rcrdDt;
    }

    /**
     * Sets the value of the rcrdDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat4Choice }
     *     
     */
    public void setRcrdDt(DateFormat4Choice value) {
        this.rcrdDt = value;
    }

    /**
     * Gets the value of the pmtDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat4Choice }
     *     
     */
    public DateFormat4Choice getPmtDt() {
        return pmtDt;
    }

    /**
     * Sets the value of the pmtDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat4Choice }
     *     
     */
    public void setPmtDt(DateFormat4Choice value) {
        this.pmtDt = value;
    }

    /**
     * Gets the value of the sctiesMvmnt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the sctiesMvmnt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSctiesMvmnt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SecurityMovement1 }
     * 
     * 
     * @return
     *     The value of the sctiesMvmnt property.
     */
    public List<SecurityMovement1> getSctiesMvmnt() {
        if (sctiesMvmnt == null) {
            sctiesMvmnt = new ArrayList<>();
        }
        return this.sctiesMvmnt;
    }

    /**
     * Gets the value of the cshMvmnt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the cshMvmnt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCshMvmnt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CashMovement1 }
     * 
     * 
     * @return
     *     The value of the cshMvmnt property.
     */
    public List<CashMovement1> getCshMvmnt() {
        if (cshMvmnt == null) {
            cshMvmnt = new ArrayList<>();
        }
        return this.cshMvmnt;
    }

}
