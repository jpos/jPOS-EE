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

package org.jpos.iso20022.catm_005_001_09;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ServiceProviderParameters3 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ServiceProviderParameters3">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="ActnTp" type="{urn:iso:std:iso:20022:tech:xsd:catm.005.001.09}TerminalManagementAction3Code"/>
 *         <element name="SvcPrvdrId" type="{urn:iso:std:iso:20022:tech:xsd:catm.005.001.09}GenericIdentification176" maxOccurs="unbounded"/>
 *         <element name="Vrsn" type="{urn:iso:std:iso:20022:tech:xsd:catm.005.001.09}Max256Text"/>
 *         <element name="ApplId" type="{urn:iso:std:iso:20022:tech:xsd:catm.005.001.09}Max35Text" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="Hst" type="{urn:iso:std:iso:20022:tech:xsd:catm.005.001.09}AcquirerHostConfiguration9" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="NonFinActnSpprtd" type="{urn:iso:std:iso:20022:tech:xsd:catm.005.001.09}NonFinancialRequestType2Code" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceProviderParameters3", propOrder = {
    "actnTp",
    "svcPrvdrId",
    "vrsn",
    "applId",
    "hst",
    "nonFinActnSpprtd"
})
public class ServiceProviderParameters3 {

    @XmlElement(name = "ActnTp", required = true)
    @XmlSchemaType(name = "string")
    protected TerminalManagementAction3Code actnTp;
    @XmlElement(name = "SvcPrvdrId", required = true)
    protected List<GenericIdentification176> svcPrvdrId;
    @XmlElement(name = "Vrsn", required = true)
    protected String vrsn;
    @XmlElement(name = "ApplId")
    protected List<String> applId;
    @XmlElement(name = "Hst")
    protected List<AcquirerHostConfiguration9> hst;
    @XmlElement(name = "NonFinActnSpprtd")
    @XmlSchemaType(name = "string")
    protected List<NonFinancialRequestType2Code> nonFinActnSpprtd;

    /**
     * Gets the value of the actnTp property.
     * 
     * @return
     *     possible object is
     *     {@link TerminalManagementAction3Code }
     *     
     */
    public TerminalManagementAction3Code getActnTp() {
        return actnTp;
    }

    /**
     * Sets the value of the actnTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link TerminalManagementAction3Code }
     *     
     */
    public void setActnTp(TerminalManagementAction3Code value) {
        this.actnTp = value;
    }

    /**
     * Gets the value of the svcPrvdrId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the svcPrvdrId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSvcPrvdrId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GenericIdentification176 }
     * 
     * 
     * @return
     *     The value of the svcPrvdrId property.
     */
    public List<GenericIdentification176> getSvcPrvdrId() {
        if (svcPrvdrId == null) {
            svcPrvdrId = new ArrayList<>();
        }
        return this.svcPrvdrId;
    }

    /**
     * Gets the value of the vrsn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVrsn() {
        return vrsn;
    }

    /**
     * Sets the value of the vrsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVrsn(String value) {
        this.vrsn = value;
    }

    /**
     * Gets the value of the applId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the applId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getApplId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     * @return
     *     The value of the applId property.
     */
    public List<String> getApplId() {
        if (applId == null) {
            applId = new ArrayList<>();
        }
        return this.applId;
    }

    /**
     * Gets the value of the hst property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the hst property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHst().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AcquirerHostConfiguration9 }
     * 
     * 
     * @return
     *     The value of the hst property.
     */
    public List<AcquirerHostConfiguration9> getHst() {
        if (hst == null) {
            hst = new ArrayList<>();
        }
        return this.hst;
    }

    /**
     * Gets the value of the nonFinActnSpprtd property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the nonFinActnSpprtd property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNonFinActnSpprtd().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NonFinancialRequestType2Code }
     * 
     * 
     * @return
     *     The value of the nonFinActnSpprtd property.
     */
    public List<NonFinancialRequestType2Code> getNonFinActnSpprtd() {
        if (nonFinActnSpprtd == null) {
            nonFinActnSpprtd = new ArrayList<>();
        }
        return this.nonFinActnSpprtd;
    }

}
