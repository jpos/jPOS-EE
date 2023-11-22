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

package org.jpos.iso20022.reda_004_001_06;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DistributionStrategy1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="DistributionStrategy1">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="ExctnOnly" type="{urn:iso:std:iso:20022:tech:xsd:reda.004.001.06}DistributionStrategy1Choice" minOccurs="0"/>
 *         <element name="ExctnWthApprprtnssTstOrNonAdvsdSvcs" type="{urn:iso:std:iso:20022:tech:xsd:reda.004.001.06}DistributionStrategy1Choice" minOccurs="0"/>
 *         <element name="InvstmtAdvc" type="{urn:iso:std:iso:20022:tech:xsd:reda.004.001.06}DistributionStrategy1Choice" minOccurs="0"/>
 *         <element name="PrtflMgmt" type="{urn:iso:std:iso:20022:tech:xsd:reda.004.001.06}DistributionStrategy1Choice" minOccurs="0"/>
 *         <element name="Othr" type="{urn:iso:std:iso:20022:tech:xsd:reda.004.001.06}OtherDistributionStrategy1" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DistributionStrategy1", propOrder = {
    "exctnOnly",
    "exctnWthApprprtnssTstOrNonAdvsdSvcs",
    "invstmtAdvc",
    "prtflMgmt",
    "othr"
})
public class DistributionStrategy1 {

    @XmlElement(name = "ExctnOnly")
    protected DistributionStrategy1Choice exctnOnly;
    @XmlElement(name = "ExctnWthApprprtnssTstOrNonAdvsdSvcs")
    protected DistributionStrategy1Choice exctnWthApprprtnssTstOrNonAdvsdSvcs;
    @XmlElement(name = "InvstmtAdvc")
    protected DistributionStrategy1Choice invstmtAdvc;
    @XmlElement(name = "PrtflMgmt")
    protected DistributionStrategy1Choice prtflMgmt;
    @XmlElement(name = "Othr")
    protected OtherDistributionStrategy1 othr;

    /**
     * Gets the value of the exctnOnly property.
     * 
     * @return
     *     possible object is
     *     {@link DistributionStrategy1Choice }
     *     
     */
    public DistributionStrategy1Choice getExctnOnly() {
        return exctnOnly;
    }

    /**
     * Sets the value of the exctnOnly property.
     * 
     * @param value
     *     allowed object is
     *     {@link DistributionStrategy1Choice }
     *     
     */
    public void setExctnOnly(DistributionStrategy1Choice value) {
        this.exctnOnly = value;
    }

    /**
     * Gets the value of the exctnWthApprprtnssTstOrNonAdvsdSvcs property.
     * 
     * @return
     *     possible object is
     *     {@link DistributionStrategy1Choice }
     *     
     */
    public DistributionStrategy1Choice getExctnWthApprprtnssTstOrNonAdvsdSvcs() {
        return exctnWthApprprtnssTstOrNonAdvsdSvcs;
    }

    /**
     * Sets the value of the exctnWthApprprtnssTstOrNonAdvsdSvcs property.
     * 
     * @param value
     *     allowed object is
     *     {@link DistributionStrategy1Choice }
     *     
     */
    public void setExctnWthApprprtnssTstOrNonAdvsdSvcs(DistributionStrategy1Choice value) {
        this.exctnWthApprprtnssTstOrNonAdvsdSvcs = value;
    }

    /**
     * Gets the value of the invstmtAdvc property.
     * 
     * @return
     *     possible object is
     *     {@link DistributionStrategy1Choice }
     *     
     */
    public DistributionStrategy1Choice getInvstmtAdvc() {
        return invstmtAdvc;
    }

    /**
     * Sets the value of the invstmtAdvc property.
     * 
     * @param value
     *     allowed object is
     *     {@link DistributionStrategy1Choice }
     *     
     */
    public void setInvstmtAdvc(DistributionStrategy1Choice value) {
        this.invstmtAdvc = value;
    }

    /**
     * Gets the value of the prtflMgmt property.
     * 
     * @return
     *     possible object is
     *     {@link DistributionStrategy1Choice }
     *     
     */
    public DistributionStrategy1Choice getPrtflMgmt() {
        return prtflMgmt;
    }

    /**
     * Sets the value of the prtflMgmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DistributionStrategy1Choice }
     *     
     */
    public void setPrtflMgmt(DistributionStrategy1Choice value) {
        this.prtflMgmt = value;
    }

    /**
     * Gets the value of the othr property.
     * 
     * @return
     *     possible object is
     *     {@link OtherDistributionStrategy1 }
     *     
     */
    public OtherDistributionStrategy1 getOthr() {
        return othr;
    }

    /**
     * Sets the value of the othr property.
     * 
     * @param value
     *     allowed object is
     *     {@link OtherDistributionStrategy1 }
     *     
     */
    public void setOthr(OtherDistributionStrategy1 value) {
        this.othr = value;
    }

}
