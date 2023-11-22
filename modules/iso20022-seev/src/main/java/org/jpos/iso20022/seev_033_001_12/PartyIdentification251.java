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

package org.jpos.iso20022.seev_033_001_12;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PartyIdentification251 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="PartyIdentification251">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="OwnrId" type="{urn:iso:std:iso:20022:tech:xsd:seev.033.001.12}PartyIdentification229Choice"/>
 *         <element name="LEIId" type="{urn:iso:std:iso:20022:tech:xsd:seev.033.001.12}LEIIdentifier" minOccurs="0"/>
 *         <element name="AltrnId" type="{urn:iso:std:iso:20022:tech:xsd:seev.033.001.12}AlternatePartyIdentification7" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="DmclCtry" type="{urn:iso:std:iso:20022:tech:xsd:seev.033.001.12}CountryCode" minOccurs="0"/>
 *         <element name="NonDmclCtry" type="{urn:iso:std:iso:20022:tech:xsd:seev.033.001.12}CountryCode" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="OwndSctiesQty" type="{urn:iso:std:iso:20022:tech:xsd:seev.033.001.12}FinancialInstrumentQuantity33Choice"/>
 *         <element name="CertfctnTp" type="{urn:iso:std:iso:20022:tech:xsd:seev.033.001.12}BeneficiaryCertificationType10Choice" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="WhldgTaxRate" type="{urn:iso:std:iso:20022:tech:xsd:seev.033.001.12}RateAndAmountFormat37Choice" minOccurs="0"/>
 *         <element name="CertfctnBrkdwn" type="{urn:iso:std:iso:20022:tech:xsd:seev.033.001.12}Max350Text" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PartyIdentification251", propOrder = {
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
public class PartyIdentification251 {

    @XmlElement(name = "OwnrId", required = true)
    protected PartyIdentification229Choice ownrId;
    @XmlElement(name = "LEIId")
    protected String leiId;
    @XmlElement(name = "AltrnId")
    protected List<AlternatePartyIdentification7> altrnId;
    @XmlElement(name = "DmclCtry")
    protected String dmclCtry;
    @XmlElement(name = "NonDmclCtry")
    protected List<String> nonDmclCtry;
    @XmlElement(name = "OwndSctiesQty", required = true)
    protected FinancialInstrumentQuantity33Choice owndSctiesQty;
    @XmlElement(name = "CertfctnTp")
    protected List<BeneficiaryCertificationType10Choice> certfctnTp;
    @XmlElement(name = "WhldgTaxRate")
    protected RateAndAmountFormat37Choice whldgTaxRate;
    @XmlElement(name = "CertfctnBrkdwn")
    protected List<String> certfctnBrkdwn;

    /**
     * Gets the value of the ownrId property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification229Choice }
     *     
     */
    public PartyIdentification229Choice getOwnrId() {
        return ownrId;
    }

    /**
     * Sets the value of the ownrId property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification229Choice }
     *     
     */
    public void setOwnrId(PartyIdentification229Choice value) {
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
     * {@link AlternatePartyIdentification7 }
     * 
     * 
     * @return
     *     The value of the altrnId property.
     */
    public List<AlternatePartyIdentification7> getAltrnId() {
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
     *     {@link FinancialInstrumentQuantity33Choice }
     *     
     */
    public FinancialInstrumentQuantity33Choice getOwndSctiesQty() {
        return owndSctiesQty;
    }

    /**
     * Sets the value of the owndSctiesQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentQuantity33Choice }
     *     
     */
    public void setOwndSctiesQty(FinancialInstrumentQuantity33Choice value) {
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
     * {@link BeneficiaryCertificationType10Choice }
     * 
     * 
     * @return
     *     The value of the certfctnTp property.
     */
    public List<BeneficiaryCertificationType10Choice> getCertfctnTp() {
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
     *     {@link RateAndAmountFormat37Choice }
     *     
     */
    public RateAndAmountFormat37Choice getWhldgTaxRate() {
        return whldgTaxRate;
    }

    /**
     * Sets the value of the whldgTaxRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateAndAmountFormat37Choice }
     *     
     */
    public void setWhldgTaxRate(RateAndAmountFormat37Choice value) {
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
