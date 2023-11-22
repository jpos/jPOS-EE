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

package org.jpos.iso20022.cain_018_001_02;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FundingService2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="FundingService2">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="FndgSvc" type="{urn:iso:std:iso:20022:tech:xsd:cain.018.001.02}TransferService2" minOccurs="0"/>
 *         <element name="FndgSrc" type="{urn:iso:std:iso:20022:tech:xsd:cain.018.001.02}FundingSource2" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="ClmInf" type="{urn:iso:std:iso:20022:tech:xsd:cain.018.001.02}ClaimInformation1" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FundingService2", propOrder = {
    "fndgSvc",
    "fndgSrc",
    "clmInf"
})
public class FundingService2 {

    @XmlElement(name = "FndgSvc")
    protected TransferService2 fndgSvc;
    @XmlElement(name = "FndgSrc")
    protected List<FundingSource2> fndgSrc;
    @XmlElement(name = "ClmInf")
    protected ClaimInformation1 clmInf;

    /**
     * Gets the value of the fndgSvc property.
     * 
     * @return
     *     possible object is
     *     {@link TransferService2 }
     *     
     */
    public TransferService2 getFndgSvc() {
        return fndgSvc;
    }

    /**
     * Sets the value of the fndgSvc property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransferService2 }
     *     
     */
    public void setFndgSvc(TransferService2 value) {
        this.fndgSvc = value;
    }

    /**
     * Gets the value of the fndgSrc property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the fndgSrc property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFndgSrc().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FundingSource2 }
     * 
     * 
     * @return
     *     The value of the fndgSrc property.
     */
    public List<FundingSource2> getFndgSrc() {
        if (fndgSrc == null) {
            fndgSrc = new ArrayList<>();
        }
        return this.fndgSrc;
    }

    /**
     * Gets the value of the clmInf property.
     * 
     * @return
     *     possible object is
     *     {@link ClaimInformation1 }
     *     
     */
    public ClaimInformation1 getClmInf() {
        return clmInf;
    }

    /**
     * Sets the value of the clmInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClaimInformation1 }
     *     
     */
    public void setClmInf(ClaimInformation1 value) {
        this.clmInf = value;
    }

}
