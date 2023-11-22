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
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AcceptorConfigurationContent12 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="AcceptorConfigurationContent12">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="RplcCfgtn" type="{urn:iso:std:iso:20022:tech:xsd:catm.005.001.09}TrueFalseIndicator" minOccurs="0"/>
 *         <element name="TMSPrtcolParams" type="{urn:iso:std:iso:20022:tech:xsd:catm.005.001.09}TMSProtocolParameters7" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="AcqrrPrtcolParams" type="{urn:iso:std:iso:20022:tech:xsd:catm.005.001.09}AcquirerProtocolParameters16" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="SvcPrvdrParams" type="{urn:iso:std:iso:20022:tech:xsd:catm.005.001.09}ServiceProviderParameters3" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="MrchntParams" type="{urn:iso:std:iso:20022:tech:xsd:catm.005.001.09}MerchantConfigurationParameters6" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="TermnlParams" type="{urn:iso:std:iso:20022:tech:xsd:catm.005.001.09}PaymentTerminalParameters8" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="ApplParams" type="{urn:iso:std:iso:20022:tech:xsd:catm.005.001.09}ApplicationParameters12" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="HstComParams" type="{urn:iso:std:iso:20022:tech:xsd:catm.005.001.09}HostCommunicationParameter6" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="SctyParams" type="{urn:iso:std:iso:20022:tech:xsd:catm.005.001.09}SecurityParameters15" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="SaleToPOIParams" type="{urn:iso:std:iso:20022:tech:xsd:catm.005.001.09}SaleToPOIProtocolParameter3" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="TermnlPackg" type="{urn:iso:std:iso:20022:tech:xsd:catm.005.001.09}TerminalPackageType4" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AcceptorConfigurationContent12", propOrder = {
    "rplcCfgtn",
    "tmsPrtcolParams",
    "acqrrPrtcolParams",
    "svcPrvdrParams",
    "mrchntParams",
    "termnlParams",
    "applParams",
    "hstComParams",
    "sctyParams",
    "saleToPOIParams",
    "termnlPackg"
})
public class AcceptorConfigurationContent12 {

    @XmlElement(name = "RplcCfgtn")
    protected Boolean rplcCfgtn;
    @XmlElement(name = "TMSPrtcolParams")
    protected List<TMSProtocolParameters7> tmsPrtcolParams;
    @XmlElement(name = "AcqrrPrtcolParams")
    protected List<AcquirerProtocolParameters16> acqrrPrtcolParams;
    @XmlElement(name = "SvcPrvdrParams")
    protected List<ServiceProviderParameters3> svcPrvdrParams;
    @XmlElement(name = "MrchntParams")
    protected List<MerchantConfigurationParameters6> mrchntParams;
    @XmlElement(name = "TermnlParams")
    protected List<PaymentTerminalParameters8> termnlParams;
    @XmlElement(name = "ApplParams")
    protected List<ApplicationParameters12> applParams;
    @XmlElement(name = "HstComParams")
    protected List<HostCommunicationParameter6> hstComParams;
    @XmlElement(name = "SctyParams")
    protected List<SecurityParameters15> sctyParams;
    @XmlElement(name = "SaleToPOIParams")
    protected List<SaleToPOIProtocolParameter3> saleToPOIParams;
    @XmlElement(name = "TermnlPackg")
    protected List<TerminalPackageType4> termnlPackg;

    /**
     * Gets the value of the rplcCfgtn property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRplcCfgtn() {
        return rplcCfgtn;
    }

    /**
     * Sets the value of the rplcCfgtn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRplcCfgtn(Boolean value) {
        this.rplcCfgtn = value;
    }

    /**
     * Gets the value of the tmsPrtcolParams property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the tmsPrtcolParams property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTMSPrtcolParams().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TMSProtocolParameters7 }
     * 
     * 
     * @return
     *     The value of the tmsPrtcolParams property.
     */
    public List<TMSProtocolParameters7> getTMSPrtcolParams() {
        if (tmsPrtcolParams == null) {
            tmsPrtcolParams = new ArrayList<>();
        }
        return this.tmsPrtcolParams;
    }

    /**
     * Gets the value of the acqrrPrtcolParams property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the acqrrPrtcolParams property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAcqrrPrtcolParams().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AcquirerProtocolParameters16 }
     * 
     * 
     * @return
     *     The value of the acqrrPrtcolParams property.
     */
    public List<AcquirerProtocolParameters16> getAcqrrPrtcolParams() {
        if (acqrrPrtcolParams == null) {
            acqrrPrtcolParams = new ArrayList<>();
        }
        return this.acqrrPrtcolParams;
    }

    /**
     * Gets the value of the svcPrvdrParams property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the svcPrvdrParams property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSvcPrvdrParams().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ServiceProviderParameters3 }
     * 
     * 
     * @return
     *     The value of the svcPrvdrParams property.
     */
    public List<ServiceProviderParameters3> getSvcPrvdrParams() {
        if (svcPrvdrParams == null) {
            svcPrvdrParams = new ArrayList<>();
        }
        return this.svcPrvdrParams;
    }

    /**
     * Gets the value of the mrchntParams property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the mrchntParams property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMrchntParams().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MerchantConfigurationParameters6 }
     * 
     * 
     * @return
     *     The value of the mrchntParams property.
     */
    public List<MerchantConfigurationParameters6> getMrchntParams() {
        if (mrchntParams == null) {
            mrchntParams = new ArrayList<>();
        }
        return this.mrchntParams;
    }

    /**
     * Gets the value of the termnlParams property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the termnlParams property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTermnlParams().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PaymentTerminalParameters8 }
     * 
     * 
     * @return
     *     The value of the termnlParams property.
     */
    public List<PaymentTerminalParameters8> getTermnlParams() {
        if (termnlParams == null) {
            termnlParams = new ArrayList<>();
        }
        return this.termnlParams;
    }

    /**
     * Gets the value of the applParams property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the applParams property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getApplParams().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ApplicationParameters12 }
     * 
     * 
     * @return
     *     The value of the applParams property.
     */
    public List<ApplicationParameters12> getApplParams() {
        if (applParams == null) {
            applParams = new ArrayList<>();
        }
        return this.applParams;
    }

    /**
     * Gets the value of the hstComParams property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the hstComParams property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHstComParams().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HostCommunicationParameter6 }
     * 
     * 
     * @return
     *     The value of the hstComParams property.
     */
    public List<HostCommunicationParameter6> getHstComParams() {
        if (hstComParams == null) {
            hstComParams = new ArrayList<>();
        }
        return this.hstComParams;
    }

    /**
     * Gets the value of the sctyParams property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the sctyParams property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSctyParams().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SecurityParameters15 }
     * 
     * 
     * @return
     *     The value of the sctyParams property.
     */
    public List<SecurityParameters15> getSctyParams() {
        if (sctyParams == null) {
            sctyParams = new ArrayList<>();
        }
        return this.sctyParams;
    }

    /**
     * Gets the value of the saleToPOIParams property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the saleToPOIParams property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSaleToPOIParams().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SaleToPOIProtocolParameter3 }
     * 
     * 
     * @return
     *     The value of the saleToPOIParams property.
     */
    public List<SaleToPOIProtocolParameter3> getSaleToPOIParams() {
        if (saleToPOIParams == null) {
            saleToPOIParams = new ArrayList<>();
        }
        return this.saleToPOIParams;
    }

    /**
     * Gets the value of the termnlPackg property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the termnlPackg property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTermnlPackg().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TerminalPackageType4 }
     * 
     * 
     * @return
     *     The value of the termnlPackg property.
     */
    public List<TerminalPackageType4> getTermnlPackg() {
        if (termnlPackg == null) {
            termnlPackg = new ArrayList<>();
        }
        return this.termnlPackg;
    }

}
