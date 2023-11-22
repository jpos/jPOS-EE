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

package org.jpos.iso20022.tsmt_019_001_05;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RequiredSubmission4 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="RequiredSubmission4">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Submitr" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.019.001.05}BICIdentification1" maxOccurs="unbounded"/>
 *         <element name="CertTp" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.019.001.05}TradeCertificateType1Code"/>
 *         <element name="MtchIssr" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.019.001.05}PartyIdentification27" minOccurs="0"/>
 *         <element name="MtchIsseDt" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.019.001.05}YesNoIndicator"/>
 *         <element name="MtchInspctnDt" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.019.001.05}YesNoIndicator"/>
 *         <element name="AuthrsdInspctrInd" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.019.001.05}YesNoIndicator"/>
 *         <element name="MtchConsgn" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.019.001.05}YesNoIndicator"/>
 *         <element name="MtchManfctr" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.019.001.05}PartyIdentification27" minOccurs="0"/>
 *         <element name="LineItmId" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.019.001.05}Max70Text" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RequiredSubmission4", propOrder = {
    "submitr",
    "certTp",
    "mtchIssr",
    "mtchIsseDt",
    "mtchInspctnDt",
    "authrsdInspctrInd",
    "mtchConsgn",
    "mtchManfctr",
    "lineItmId"
})
public class RequiredSubmission4 {

    @XmlElement(name = "Submitr", required = true)
    protected List<BICIdentification1> submitr;
    @XmlElement(name = "CertTp", required = true)
    @XmlSchemaType(name = "string")
    protected TradeCertificateType1Code certTp;
    @XmlElement(name = "MtchIssr")
    protected PartyIdentification27 mtchIssr;
    @XmlElement(name = "MtchIsseDt")
    protected boolean mtchIsseDt;
    @XmlElement(name = "MtchInspctnDt")
    protected boolean mtchInspctnDt;
    @XmlElement(name = "AuthrsdInspctrInd")
    protected boolean authrsdInspctrInd;
    @XmlElement(name = "MtchConsgn")
    protected boolean mtchConsgn;
    @XmlElement(name = "MtchManfctr")
    protected PartyIdentification27 mtchManfctr;
    @XmlElement(name = "LineItmId")
    protected List<String> lineItmId;

    /**
     * Gets the value of the submitr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the submitr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubmitr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BICIdentification1 }
     * 
     * 
     * @return
     *     The value of the submitr property.
     */
    public List<BICIdentification1> getSubmitr() {
        if (submitr == null) {
            submitr = new ArrayList<>();
        }
        return this.submitr;
    }

    /**
     * Gets the value of the certTp property.
     * 
     * @return
     *     possible object is
     *     {@link TradeCertificateType1Code }
     *     
     */
    public TradeCertificateType1Code getCertTp() {
        return certTp;
    }

    /**
     * Sets the value of the certTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeCertificateType1Code }
     *     
     */
    public void setCertTp(TradeCertificateType1Code value) {
        this.certTp = value;
    }

    /**
     * Gets the value of the mtchIssr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification27 }
     *     
     */
    public PartyIdentification27 getMtchIssr() {
        return mtchIssr;
    }

    /**
     * Sets the value of the mtchIssr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification27 }
     *     
     */
    public void setMtchIssr(PartyIdentification27 value) {
        this.mtchIssr = value;
    }

    /**
     * Gets the value of the mtchIsseDt property.
     * 
     */
    public boolean isMtchIsseDt() {
        return mtchIsseDt;
    }

    /**
     * Sets the value of the mtchIsseDt property.
     * 
     */
    public void setMtchIsseDt(boolean value) {
        this.mtchIsseDt = value;
    }

    /**
     * Gets the value of the mtchInspctnDt property.
     * 
     */
    public boolean isMtchInspctnDt() {
        return mtchInspctnDt;
    }

    /**
     * Sets the value of the mtchInspctnDt property.
     * 
     */
    public void setMtchInspctnDt(boolean value) {
        this.mtchInspctnDt = value;
    }

    /**
     * Gets the value of the authrsdInspctrInd property.
     * 
     */
    public boolean isAuthrsdInspctrInd() {
        return authrsdInspctrInd;
    }

    /**
     * Sets the value of the authrsdInspctrInd property.
     * 
     */
    public void setAuthrsdInspctrInd(boolean value) {
        this.authrsdInspctrInd = value;
    }

    /**
     * Gets the value of the mtchConsgn property.
     * 
     */
    public boolean isMtchConsgn() {
        return mtchConsgn;
    }

    /**
     * Sets the value of the mtchConsgn property.
     * 
     */
    public void setMtchConsgn(boolean value) {
        this.mtchConsgn = value;
    }

    /**
     * Gets the value of the mtchManfctr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification27 }
     *     
     */
    public PartyIdentification27 getMtchManfctr() {
        return mtchManfctr;
    }

    /**
     * Sets the value of the mtchManfctr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification27 }
     *     
     */
    public void setMtchManfctr(PartyIdentification27 value) {
        this.mtchManfctr = value;
    }

    /**
     * Gets the value of the lineItmId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the lineItmId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLineItmId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     * @return
     *     The value of the lineItmId property.
     */
    public List<String> getLineItmId() {
        if (lineItmId == null) {
            lineItmId = new ArrayList<>();
        }
        return this.lineItmId;
    }

}
