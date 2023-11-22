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

package org.jpos.iso20022.seev_033_002_12;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PartyIdentification252 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="PartyIdentification252">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="OwnrId" type="{urn:iso:std:iso:20022:tech:xsd:seev.033.002.12}PartyIdentification234Choice"/>
 *         <element name="LEIId" type="{urn:iso:std:iso:20022:tech:xsd:seev.033.002.12}LEIIdentifier" minOccurs="0"/>
 *         <element name="AltrnId" type="{urn:iso:std:iso:20022:tech:xsd:seev.033.002.12}AlternatePartyIdentification9" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="DmclCtry" type="{urn:iso:std:iso:20022:tech:xsd:seev.033.002.12}CountryCode" minOccurs="0"/>
 *         <element name="NonDmclCtry" type="{urn:iso:std:iso:20022:tech:xsd:seev.033.002.12}CountryCode" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="OwndSctiesQty" type="{urn:iso:std:iso:20022:tech:xsd:seev.033.002.12}FinancialInstrumentQuantity36Choice"/>
 *         <element name="CertfctnTp" type="{urn:iso:std:iso:20022:tech:xsd:seev.033.002.12}BeneficiaryCertificationType11Choice" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="WhldgTaxRate" type="{urn:iso:std:iso:20022:tech:xsd:seev.033.002.12}RateAndAmountFormat46Choice" minOccurs="0"/>
 *         <element name="CertfctnBrkdwn" type="{urn:iso:std:iso:20022:tech:xsd:seev.033.002.12}RestrictedFINXMax350Text" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PartyIdentification252", propOrder = {
    "ownrId",
    "leiId",
    "altrnId",
    "dmclCtry",
    "nonDmclCtry",
    "owndSctiesQty",
    "certfctnTp",
    "whldgTaxRate",
    "certfctnBrkdwn"
})
public class PartyIdentification252 {

    @XmlElement(name = "OwnrId", required = true)
    protected PartyIdentification234Choice ownrId;
    @XmlElement(name = "LEIId")
    protected String leiId;
    @XmlElement(name = "AltrnId")
    protected List<AlternatePartyIdentification9> altrnId;
    @XmlElement(name = "DmclCtry")
    protected String dmclCtry;
    @XmlElement(name = "NonDmclCtry")
    protected List<String> nonDmclCtry;
    @XmlElement(name = "OwndSctiesQty", required = true)
    protected FinancialInstrumentQuantity36Choice owndSctiesQty;
    @XmlElement(name = "CertfctnTp")
    protected List<BeneficiaryCertificationType11Choice> certfctnTp;
    @XmlElement(name = "WhldgTaxRate")
    protected RateAndAmountFormat46Choice whldgTaxRate;
    @XmlElement(name = "CertfctnBrkdwn")
    protected List<String> certfctnBrkdwn;

    /**
     * Gets the value of the ownrId property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification234Choice }
     *     
     */
    public PartyIdentification234Choice getOwnrId() {
        return ownrId;
    }

    /**
     * Sets the value of the ownrId property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification234Choice }
     *     
     */
    public void setOwnrId(PartyIdentification234Choice value) {
        this.ownrId = value;
    }

    /**
     * Gets the value of the leiId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLEIId() {
        return leiId;
    }

    /**
     * Sets the value of the leiId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLEIId(String value) {
        this.leiId = value;
    }

    /**
     * Gets the value of the altrnId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the altrnId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAltrnId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AlternatePartyIdentification9 }
     * 
     * 
     * @return
     *     The value of the altrnId property.
     */
    public List<AlternatePartyIdentification9> getAltrnId() {
        if (altrnId == null) {
            altrnId = new ArrayList<>();
        }
        return this.altrnId;
    }

    /**
     * Gets the value of the dmclCtry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDmclCtry() {
        return dmclCtry;
    }

    /**
     * Sets the value of the dmclCtry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDmclCtry(String value) {
        this.dmclCtry = value;
    }

    /**
     * Gets the value of the nonDmclCtry property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the nonDmclCtry property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNonDmclCtry().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     * @return
     *     The value of the nonDmclCtry property.
     */
    public List<String> getNonDmclCtry() {
        if (nonDmclCtry == null) {
            nonDmclCtry = new ArrayList<>();
        }
        return this.nonDmclCtry;
    }

    /**
     * Gets the value of the owndSctiesQty property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentQuantity36Choice }
     *     
     */
    public FinancialInstrumentQuantity36Choice getOwndSctiesQty() {
        return owndSctiesQty;
    }

    /**
     * Sets the value of the owndSctiesQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentQuantity36Choice }
     *     
     */
    public void setOwndSctiesQty(FinancialInstrumentQuantity36Choice value) {
        this.owndSctiesQty = value;
    }

    /**
     * Gets the value of the certfctnTp property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the certfctnTp property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCertfctnTp().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BeneficiaryCertificationType11Choice }
     * 
     * 
     * @return
     *     The value of the certfctnTp property.
     */
    public List<BeneficiaryCertificationType11Choice> getCertfctnTp() {
        if (certfctnTp == null) {
            certfctnTp = new ArrayList<>();
        }
        return this.certfctnTp;
    }

    /**
     * Gets the value of the whldgTaxRate property.
     * 
     * @return
     *     possible object is
     *     {@link RateAndAmountFormat46Choice }
     *     
     */
    public RateAndAmountFormat46Choice getWhldgTaxRate() {
        return whldgTaxRate;
    }

    /**
     * Sets the value of the whldgTaxRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateAndAmountFormat46Choice }
     *     
     */
    public void setWhldgTaxRate(RateAndAmountFormat46Choice value) {
        this.whldgTaxRate = value;
    }

    /**
     * Gets the value of the certfctnBrkdwn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the certfctnBrkdwn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCertfctnBrkdwn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     * @return
     *     The value of the certfctnBrkdwn property.
     */
    public List<String> getCertfctnBrkdwn() {
        if (certfctnBrkdwn == null) {
            certfctnBrkdwn = new ArrayList<>();
        }
        return this.certfctnBrkdwn;
    }

}
