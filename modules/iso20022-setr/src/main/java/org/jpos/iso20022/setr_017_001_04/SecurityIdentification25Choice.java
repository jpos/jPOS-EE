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

package org.jpos.iso20022.setr_017_001_04;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SecurityIdentification25Choice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="SecurityIdentification25Choice">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="ISIN" type="{urn:iso:std:iso:20022:tech:xsd:setr.017.001.04}ISINOct2015Identifier"/>
 *         <element name="SEDOL" type="{urn:iso:std:iso:20022:tech:xsd:setr.017.001.04}SEDOLIdentifier"/>
 *         <element name="CUSIP" type="{urn:iso:std:iso:20022:tech:xsd:setr.017.001.04}CUSIPIdentifier"/>
 *         <element name="RIC" type="{urn:iso:std:iso:20022:tech:xsd:setr.017.001.04}RICIdentifier"/>
 *         <element name="TckrSymb" type="{urn:iso:std:iso:20022:tech:xsd:setr.017.001.04}TickerIdentifier"/>
 *         <element name="Blmbrg" type="{urn:iso:std:iso:20022:tech:xsd:setr.017.001.04}Bloomberg2Identifier"/>
 *         <element name="CTA" type="{urn:iso:std:iso:20022:tech:xsd:setr.017.001.04}ConsolidatedTapeAssociationIdentifier"/>
 *         <element name="QUICK" type="{urn:iso:std:iso:20022:tech:xsd:setr.017.001.04}QUICKIdentifier"/>
 *         <element name="Wrtppr" type="{urn:iso:std:iso:20022:tech:xsd:setr.017.001.04}WertpapierIdentifier"/>
 *         <element name="Dtch" type="{urn:iso:std:iso:20022:tech:xsd:setr.017.001.04}DutchIdentifier"/>
 *         <element name="Vlrn" type="{urn:iso:std:iso:20022:tech:xsd:setr.017.001.04}ValorenIdentifier"/>
 *         <element name="SCVM" type="{urn:iso:std:iso:20022:tech:xsd:setr.017.001.04}SicovamIdentifier"/>
 *         <element name="Belgn" type="{urn:iso:std:iso:20022:tech:xsd:setr.017.001.04}BelgianIdentifier"/>
 *         <element name="Cmon" type="{urn:iso:std:iso:20022:tech:xsd:setr.017.001.04}EuroclearClearstreamIdentifier"/>
 *         <element name="OthrPrtryId" type="{urn:iso:std:iso:20022:tech:xsd:setr.017.001.04}AlternateSecurityIdentification7"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecurityIdentification25Choice", propOrder = {
    "isin",
    "sedol",
    "cusip",
    "ric",
    "tckrSymb",
    "blmbrg",
    "cta",
    "quick",
    "wrtppr",
    "dtch",
    "vlrn",
    "scvm",
    "belgn",
    "cmon",
    "othrPrtryId"
})
public class SecurityIdentification25Choice {

    @XmlElement(name = "ISIN")
    protected String isin;
    @XmlElement(name = "SEDOL")
    protected String sedol;
    @XmlElement(name = "CUSIP")
    protected String cusip;
    @XmlElement(name = "RIC")
    protected String ric;
    @XmlElement(name = "TckrSymb")
    protected String tckrSymb;
    @XmlElement(name = "Blmbrg")
    protected String blmbrg;
    @XmlElement(name = "CTA")
    protected String cta;
    @XmlElement(name = "QUICK")
    protected String quick;
    @XmlElement(name = "Wrtppr")
    protected String wrtppr;
    @XmlElement(name = "Dtch")
    protected String dtch;
    @XmlElement(name = "Vlrn")
    protected String vlrn;
    @XmlElement(name = "SCVM")
    protected String scvm;
    @XmlElement(name = "Belgn")
    protected String belgn;
    @XmlElement(name = "Cmon")
    protected String cmon;
    @XmlElement(name = "OthrPrtryId")
    protected AlternateSecurityIdentification7 othrPrtryId;

    /**
     * Gets the value of the isin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getISIN() {
        return isin;
    }

    /**
     * Sets the value of the isin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setISIN(String value) {
        this.isin = value;
    }

    /**
     * Gets the value of the sedol property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSEDOL() {
        return sedol;
    }

    /**
     * Sets the value of the sedol property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSEDOL(String value) {
        this.sedol = value;
    }

    /**
     * Gets the value of the cusip property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCUSIP() {
        return cusip;
    }

    /**
     * Sets the value of the cusip property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCUSIP(String value) {
        this.cusip = value;
    }

    /**
     * Gets the value of the ric property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRIC() {
        return ric;
    }

    /**
     * Sets the value of the ric property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRIC(String value) {
        this.ric = value;
    }

    /**
     * Gets the value of the tckrSymb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTckrSymb() {
        return tckrSymb;
    }

    /**
     * Sets the value of the tckrSymb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTckrSymb(String value) {
        this.tckrSymb = value;
    }

    /**
     * Gets the value of the blmbrg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBlmbrg() {
        return blmbrg;
    }

    /**
     * Sets the value of the blmbrg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBlmbrg(String value) {
        this.blmbrg = value;
    }

    /**
     * Gets the value of the cta property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCTA() {
        return cta;
    }

    /**
     * Sets the value of the cta property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCTA(String value) {
        this.cta = value;
    }

    /**
     * Gets the value of the quick property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQUICK() {
        return quick;
    }

    /**
     * Sets the value of the quick property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQUICK(String value) {
        this.quick = value;
    }

    /**
     * Gets the value of the wrtppr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWrtppr() {
        return wrtppr;
    }

    /**
     * Sets the value of the wrtppr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWrtppr(String value) {
        this.wrtppr = value;
    }

    /**
     * Gets the value of the dtch property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDtch() {
        return dtch;
    }

    /**
     * Sets the value of the dtch property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDtch(String value) {
        this.dtch = value;
    }

    /**
     * Gets the value of the vlrn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVlrn() {
        return vlrn;
    }

    /**
     * Sets the value of the vlrn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVlrn(String value) {
        this.vlrn = value;
    }

    /**
     * Gets the value of the scvm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSCVM() {
        return scvm;
    }

    /**
     * Sets the value of the scvm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSCVM(String value) {
        this.scvm = value;
    }

    /**
     * Gets the value of the belgn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBelgn() {
        return belgn;
    }

    /**
     * Sets the value of the belgn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBelgn(String value) {
        this.belgn = value;
    }

    /**
     * Gets the value of the cmon property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCmon() {
        return cmon;
    }

    /**
     * Sets the value of the cmon property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCmon(String value) {
        this.cmon = value;
    }

    /**
     * Gets the value of the othrPrtryId property.
     * 
     * @return
     *     possible object is
     *     {@link AlternateSecurityIdentification7 }
     *     
     */
    public AlternateSecurityIdentification7 getOthrPrtryId() {
        return othrPrtryId;
    }

    /**
     * Sets the value of the othrPrtryId property.
     * 
     * @param value
     *     allowed object is
     *     {@link AlternateSecurityIdentification7 }
     *     
     */
    public void setOthrPrtryId(AlternateSecurityIdentification7 value) {
        this.othrPrtryId = value;
    }

}
