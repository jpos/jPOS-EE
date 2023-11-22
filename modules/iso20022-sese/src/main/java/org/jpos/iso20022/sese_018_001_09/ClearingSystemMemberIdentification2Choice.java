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

package org.jpos.iso20022.sese_018_001_09;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ClearingSystemMemberIdentification2Choice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ClearingSystemMemberIdentification2Choice">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="USCHU" type="{urn:iso:std:iso:20022:tech:xsd:sese.018.001.09}CHIPSUniversalIdentifier"/>
 *         <element name="NZNCC" type="{urn:iso:std:iso:20022:tech:xsd:sese.018.001.09}NewZealandNCCIdentifier"/>
 *         <element name="IENSC" type="{urn:iso:std:iso:20022:tech:xsd:sese.018.001.09}IrishNSCIdentifier"/>
 *         <element name="GBSC" type="{urn:iso:std:iso:20022:tech:xsd:sese.018.001.09}UKDomesticSortCodeIdentifier"/>
 *         <element name="USCH" type="{urn:iso:std:iso:20022:tech:xsd:sese.018.001.09}CHIPSParticipantIdentifier"/>
 *         <element name="CHBC" type="{urn:iso:std:iso:20022:tech:xsd:sese.018.001.09}SwissBCIdentifier"/>
 *         <element name="USFW" type="{urn:iso:std:iso:20022:tech:xsd:sese.018.001.09}FedwireRoutingNumberIdentifier"/>
 *         <element name="PTNCC" type="{urn:iso:std:iso:20022:tech:xsd:sese.018.001.09}PortugueseNCCIdentifier"/>
 *         <element name="RUCB" type="{urn:iso:std:iso:20022:tech:xsd:sese.018.001.09}RussianCentralBankIdentificationCodeIdentifier"/>
 *         <element name="ITNCC" type="{urn:iso:std:iso:20022:tech:xsd:sese.018.001.09}ItalianDomesticIdentifier"/>
 *         <element name="ATBLZ" type="{urn:iso:std:iso:20022:tech:xsd:sese.018.001.09}AustrianBankleitzahlIdentifier"/>
 *         <element name="CACPA" type="{urn:iso:std:iso:20022:tech:xsd:sese.018.001.09}CanadianPaymentsARNIdentifier"/>
 *         <element name="CHSIC" type="{urn:iso:std:iso:20022:tech:xsd:sese.018.001.09}SwissSICIdentifier"/>
 *         <element name="DEBLZ" type="{urn:iso:std:iso:20022:tech:xsd:sese.018.001.09}GermanBankleitzahlIdentifier"/>
 *         <element name="ESNCC" type="{urn:iso:std:iso:20022:tech:xsd:sese.018.001.09}SpanishDomesticInterbankingIdentifier"/>
 *         <element name="ZANCC" type="{urn:iso:std:iso:20022:tech:xsd:sese.018.001.09}SouthAfricanNCCIdentifier"/>
 *         <element name="HKNCC" type="{urn:iso:std:iso:20022:tech:xsd:sese.018.001.09}HongKongBankIdentifier"/>
 *         <element name="AUBSBx" type="{urn:iso:std:iso:20022:tech:xsd:sese.018.001.09}ExtensiveBranchNetworkIdentifier"/>
 *         <element name="AUBSBs" type="{urn:iso:std:iso:20022:tech:xsd:sese.018.001.09}SmallNetworkIdentifier"/>
 *         <element name="INIFSC" type="{urn:iso:std:iso:20022:tech:xsd:sese.018.001.09}IndianFinancialSystemCodeIdentifier"/>
 *         <element name="GRHEBIC" type="{urn:iso:std:iso:20022:tech:xsd:sese.018.001.09}HellenicBankIdentificationCodeIdentifier"/>
 *         <element name="PLKNR" type="{urn:iso:std:iso:20022:tech:xsd:sese.018.001.09}PolishNationalClearingCodeIdentifier"/>
 *         <element name="OthrClrCdId" type="{urn:iso:std:iso:20022:tech:xsd:sese.018.001.09}Max35Text"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClearingSystemMemberIdentification2Choice", propOrder = {
    "uschu",
    "nzncc",
    "iensc",
    "gbsc",
    "usch",
    "chbc",
    "usfw",
    "ptncc",
    "rucb",
    "itncc",
    "atblz",
    "cacpa",
    "chsic",
    "deblz",
    "esncc",
    "zancc",
    "hkncc",
    "aubsBx",
    "aubsBs",
    "inifsc",
    "grhebic",
    "plknr",
    "othrClrCdId"
})
public class ClearingSystemMemberIdentification2Choice {

    @XmlElement(name = "USCHU")
    protected String uschu;
    @XmlElement(name = "NZNCC")
    protected String nzncc;
    @XmlElement(name = "IENSC")
    protected String iensc;
    @XmlElement(name = "GBSC")
    protected String gbsc;
    @XmlElement(name = "USCH")
    protected String usch;
    @XmlElement(name = "CHBC")
    protected String chbc;
    @XmlElement(name = "USFW")
    protected String usfw;
    @XmlElement(name = "PTNCC")
    protected String ptncc;
    @XmlElement(name = "RUCB")
    protected String rucb;
    @XmlElement(name = "ITNCC")
    protected String itncc;
    @XmlElement(name = "ATBLZ")
    protected String atblz;
    @XmlElement(name = "CACPA")
    protected String cacpa;
    @XmlElement(name = "CHSIC")
    protected String chsic;
    @XmlElement(name = "DEBLZ")
    protected String deblz;
    @XmlElement(name = "ESNCC")
    protected String esncc;
    @XmlElement(name = "ZANCC")
    protected String zancc;
    @XmlElement(name = "HKNCC")
    protected String hkncc;
    @XmlElement(name = "AUBSBx")
    protected String aubsBx;
    @XmlElement(name = "AUBSBs")
    protected String aubsBs;
    @XmlElement(name = "INIFSC")
    protected String inifsc;
    @XmlElement(name = "GRHEBIC")
    protected String grhebic;
    @XmlElement(name = "PLKNR")
    protected String plknr;
    @XmlElement(name = "OthrClrCdId")
    protected String othrClrCdId;

    /**
     * Gets the value of the uschu property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUSCHU() {
        return uschu;
    }

    /**
     * Sets the value of the uschu property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUSCHU(String value) {
        this.uschu = value;
    }

    /**
     * Gets the value of the nzncc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNZNCC() {
        return nzncc;
    }

    /**
     * Sets the value of the nzncc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNZNCC(String value) {
        this.nzncc = value;
    }

    /**
     * Gets the value of the iensc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIENSC() {
        return iensc;
    }

    /**
     * Sets the value of the iensc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIENSC(String value) {
        this.iensc = value;
    }

    /**
     * Gets the value of the gbsc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGBSC() {
        return gbsc;
    }

    /**
     * Sets the value of the gbsc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGBSC(String value) {
        this.gbsc = value;
    }

    /**
     * Gets the value of the usch property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUSCH() {
        return usch;
    }

    /**
     * Sets the value of the usch property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUSCH(String value) {
        this.usch = value;
    }

    /**
     * Gets the value of the chbc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCHBC() {
        return chbc;
    }

    /**
     * Sets the value of the chbc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCHBC(String value) {
        this.chbc = value;
    }

    /**
     * Gets the value of the usfw property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUSFW() {
        return usfw;
    }

    /**
     * Sets the value of the usfw property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUSFW(String value) {
        this.usfw = value;
    }

    /**
     * Gets the value of the ptncc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPTNCC() {
        return ptncc;
    }

    /**
     * Sets the value of the ptncc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPTNCC(String value) {
        this.ptncc = value;
    }

    /**
     * Gets the value of the rucb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRUCB() {
        return rucb;
    }

    /**
     * Sets the value of the rucb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRUCB(String value) {
        this.rucb = value;
    }

    /**
     * Gets the value of the itncc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getITNCC() {
        return itncc;
    }

    /**
     * Sets the value of the itncc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setITNCC(String value) {
        this.itncc = value;
    }

    /**
     * Gets the value of the atblz property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getATBLZ() {
        return atblz;
    }

    /**
     * Sets the value of the atblz property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setATBLZ(String value) {
        this.atblz = value;
    }

    /**
     * Gets the value of the cacpa property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCACPA() {
        return cacpa;
    }

    /**
     * Sets the value of the cacpa property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCACPA(String value) {
        this.cacpa = value;
    }

    /**
     * Gets the value of the chsic property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCHSIC() {
        return chsic;
    }

    /**
     * Sets the value of the chsic property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCHSIC(String value) {
        this.chsic = value;
    }

    /**
     * Gets the value of the deblz property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDEBLZ() {
        return deblz;
    }

    /**
     * Sets the value of the deblz property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDEBLZ(String value) {
        this.deblz = value;
    }

    /**
     * Gets the value of the esncc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getESNCC() {
        return esncc;
    }

    /**
     * Sets the value of the esncc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setESNCC(String value) {
        this.esncc = value;
    }

    /**
     * Gets the value of the zancc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZANCC() {
        return zancc;
    }

    /**
     * Sets the value of the zancc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZANCC(String value) {
        this.zancc = value;
    }

    /**
     * Gets the value of the hkncc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHKNCC() {
        return hkncc;
    }

    /**
     * Sets the value of the hkncc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHKNCC(String value) {
        this.hkncc = value;
    }

    /**
     * Gets the value of the aubsBx property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAUBSBx() {
        return aubsBx;
    }

    /**
     * Sets the value of the aubsBx property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAUBSBx(String value) {
        this.aubsBx = value;
    }

    /**
     * Gets the value of the aubsBs property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAUBSBs() {
        return aubsBs;
    }

    /**
     * Sets the value of the aubsBs property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAUBSBs(String value) {
        this.aubsBs = value;
    }

    /**
     * Gets the value of the inifsc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getINIFSC() {
        return inifsc;
    }

    /**
     * Sets the value of the inifsc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setINIFSC(String value) {
        this.inifsc = value;
    }

    /**
     * Gets the value of the grhebic property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGRHEBIC() {
        return grhebic;
    }

    /**
     * Sets the value of the grhebic property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGRHEBIC(String value) {
        this.grhebic = value;
    }

    /**
     * Gets the value of the plknr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPLKNR() {
        return plknr;
    }

    /**
     * Sets the value of the plknr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPLKNR(String value) {
        this.plknr = value;
    }

    /**
     * Gets the value of the othrClrCdId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOthrClrCdId() {
        return othrClrCdId;
    }

    /**
     * Sets the value of the othrClrCdId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOthrClrCdId(String value) {
        this.othrClrCdId = value;
    }

}
