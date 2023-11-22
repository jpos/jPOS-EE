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

package org.jpos.iso20022.acmt_002_001_08;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AccountStatus2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="AccountStatus2">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Nbld" type="{urn:iso:std:iso:20022:tech:xsd:acmt.002.001.08}EnabledStatusReason1Choice" minOccurs="0"/>
 *         <element name="Dsbld" type="{urn:iso:std:iso:20022:tech:xsd:acmt.002.001.08}DisabledStatusReason1Choice" minOccurs="0"/>
 *         <element name="Pdg" type="{urn:iso:std:iso:20022:tech:xsd:acmt.002.001.08}PendingStatusReason1Choice" minOccurs="0"/>
 *         <element name="PdgOpng" type="{urn:iso:std:iso:20022:tech:xsd:acmt.002.001.08}PendingOpeningStatusReason1Choice" minOccurs="0"/>
 *         <element name="Profrm" type="{urn:iso:std:iso:20022:tech:xsd:acmt.002.001.08}ProformaStatusReason1Choice" minOccurs="0"/>
 *         <element name="Clsd" type="{urn:iso:std:iso:20022:tech:xsd:acmt.002.001.08}ClosedStatusReason1Choice" minOccurs="0"/>
 *         <element name="ClsrPdg" type="{urn:iso:std:iso:20022:tech:xsd:acmt.002.001.08}ClosurePendingStatusReason1Choice" minOccurs="0"/>
 *         <element name="Othr" type="{urn:iso:std:iso:20022:tech:xsd:acmt.002.001.08}OtherAccountStatus1" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccountStatus2", propOrder = {
    "nbld",
    "dsbld",
    "pdg",
    "pdgOpng",
    "profrm",
    "clsd",
    "clsrPdg",
    "othr"
})
public class AccountStatus2 {

    @XmlElement(name = "Nbld")
    protected EnabledStatusReason1Choice nbld;
    @XmlElement(name = "Dsbld")
    protected DisabledStatusReason1Choice dsbld;
    @XmlElement(name = "Pdg")
    protected PendingStatusReason1Choice pdg;
    @XmlElement(name = "PdgOpng")
    protected PendingOpeningStatusReason1Choice pdgOpng;
    @XmlElement(name = "Profrm")
    protected ProformaStatusReason1Choice profrm;
    @XmlElement(name = "Clsd")
    protected ClosedStatusReason1Choice clsd;
    @XmlElement(name = "ClsrPdg")
    protected ClosurePendingStatusReason1Choice clsrPdg;
    @XmlElement(name = "Othr")
    protected List<OtherAccountStatus1> othr;

    /**
     * Gets the value of the nbld property.
     * 
     * @return
     *     possible object is
     *     {@link EnabledStatusReason1Choice }
     *     
     */
    public EnabledStatusReason1Choice getNbld() {
        return nbld;
    }

    /**
     * Sets the value of the nbld property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnabledStatusReason1Choice }
     *     
     */
    public void setNbld(EnabledStatusReason1Choice value) {
        this.nbld = value;
    }

    /**
     * Gets the value of the dsbld property.
     * 
     * @return
     *     possible object is
     *     {@link DisabledStatusReason1Choice }
     *     
     */
    public DisabledStatusReason1Choice getDsbld() {
        return dsbld;
    }

    /**
     * Sets the value of the dsbld property.
     * 
     * @param value
     *     allowed object is
     *     {@link DisabledStatusReason1Choice }
     *     
     */
    public void setDsbld(DisabledStatusReason1Choice value) {
        this.dsbld = value;
    }

    /**
     * Gets the value of the pdg property.
     * 
     * @return
     *     possible object is
     *     {@link PendingStatusReason1Choice }
     *     
     */
    public PendingStatusReason1Choice getPdg() {
        return pdg;
    }

    /**
     * Sets the value of the pdg property.
     * 
     * @param value
     *     allowed object is
     *     {@link PendingStatusReason1Choice }
     *     
     */
    public void setPdg(PendingStatusReason1Choice value) {
        this.pdg = value;
    }

    /**
     * Gets the value of the pdgOpng property.
     * 
     * @return
     *     possible object is
     *     {@link PendingOpeningStatusReason1Choice }
     *     
     */
    public PendingOpeningStatusReason1Choice getPdgOpng() {
        return pdgOpng;
    }

    /**
     * Sets the value of the pdgOpng property.
     * 
     * @param value
     *     allowed object is
     *     {@link PendingOpeningStatusReason1Choice }
     *     
     */
    public void setPdgOpng(PendingOpeningStatusReason1Choice value) {
        this.pdgOpng = value;
    }

    /**
     * Gets the value of the profrm property.
     * 
     * @return
     *     possible object is
     *     {@link ProformaStatusReason1Choice }
     *     
     */
    public ProformaStatusReason1Choice getProfrm() {
        return profrm;
    }

    /**
     * Sets the value of the profrm property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProformaStatusReason1Choice }
     *     
     */
    public void setProfrm(ProformaStatusReason1Choice value) {
        this.profrm = value;
    }

    /**
     * Gets the value of the clsd property.
     * 
     * @return
     *     possible object is
     *     {@link ClosedStatusReason1Choice }
     *     
     */
    public ClosedStatusReason1Choice getClsd() {
        return clsd;
    }

    /**
     * Sets the value of the clsd property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClosedStatusReason1Choice }
     *     
     */
    public void setClsd(ClosedStatusReason1Choice value) {
        this.clsd = value;
    }

    /**
     * Gets the value of the clsrPdg property.
     * 
     * @return
     *     possible object is
     *     {@link ClosurePendingStatusReason1Choice }
     *     
     */
    public ClosurePendingStatusReason1Choice getClsrPdg() {
        return clsrPdg;
    }

    /**
     * Sets the value of the clsrPdg property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClosurePendingStatusReason1Choice }
     *     
     */
    public void setClsrPdg(ClosurePendingStatusReason1Choice value) {
        this.clsrPdg = value;
    }

    /**
     * Gets the value of the othr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the othr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOthr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OtherAccountStatus1 }
     * 
     * 
     * @return
     *     The value of the othr property.
     */
    public List<OtherAccountStatus1> getOthr() {
        if (othr == null) {
            othr = new ArrayList<>();
        }
        return this.othr;
    }

}
