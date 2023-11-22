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

package org.jpos.iso20022.acmt_003_001_08;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InvestmentAccount76 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="InvestmentAccount76">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Nm" type="{urn:iso:std:iso:20022:tech:xsd:acmt.003.001.08}Max35Text" minOccurs="0"/>
 *         <element name="Dsgnt" type="{urn:iso:std:iso:20022:tech:xsd:acmt.003.001.08}Max35Text" minOccurs="0"/>
 *         <element name="FndTp" type="{urn:iso:std:iso:20022:tech:xsd:acmt.003.001.08}Max35Text" minOccurs="0"/>
 *         <element name="FndFmlyNm" type="{urn:iso:std:iso:20022:tech:xsd:acmt.003.001.08}Max350Text" minOccurs="0"/>
 *         <element name="SctyDtls" type="{urn:iso:std:iso:20022:tech:xsd:acmt.003.001.08}FinancialInstrument55" minOccurs="0"/>
 *         <element name="AcctOwnr" type="{urn:iso:std:iso:20022:tech:xsd:acmt.003.001.08}AccountOwner3Choice" minOccurs="0"/>
 *         <element name="Intrmy" type="{urn:iso:std:iso:20022:tech:xsd:acmt.003.001.08}Intermediary47" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="AcctSvcr" type="{urn:iso:std:iso:20022:tech:xsd:acmt.003.001.08}PartyIdentification125Choice" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InvestmentAccount76", propOrder = {
    "nm",
    "dsgnt",
    "fndTp",
    "fndFmlyNm",
    "sctyDtls",
    "acctOwnr",
    "intrmy",
    "acctSvcr"
})
public class InvestmentAccount76 {

    @XmlElement(name = "Nm")
    protected String nm;
    @XmlElement(name = "Dsgnt")
    protected String dsgnt;
    @XmlElement(name = "FndTp")
    protected String fndTp;
    @XmlElement(name = "FndFmlyNm")
    protected String fndFmlyNm;
    @XmlElement(name = "SctyDtls")
    protected FinancialInstrument55 sctyDtls;
    @XmlElement(name = "AcctOwnr")
    protected AccountOwner3Choice acctOwnr;
    @XmlElement(name = "Intrmy")
    protected List<Intermediary47> intrmy;
    @XmlElement(name = "AcctSvcr")
    protected PartyIdentification125Choice acctSvcr;

    /**
     * Gets the value of the nm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNm() {
        return nm;
    }

    /**
     * Sets the value of the nm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNm(String value) {
        this.nm = value;
    }

    /**
     * Gets the value of the dsgnt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDsgnt() {
        return dsgnt;
    }

    /**
     * Sets the value of the dsgnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDsgnt(String value) {
        this.dsgnt = value;
    }

    /**
     * Gets the value of the fndTp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFndTp() {
        return fndTp;
    }

    /**
     * Sets the value of the fndTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFndTp(String value) {
        this.fndTp = value;
    }

    /**
     * Gets the value of the fndFmlyNm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFndFmlyNm() {
        return fndFmlyNm;
    }

    /**
     * Sets the value of the fndFmlyNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFndFmlyNm(String value) {
        this.fndFmlyNm = value;
    }

    /**
     * Gets the value of the sctyDtls property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrument55 }
     *     
     */
    public FinancialInstrument55 getSctyDtls() {
        return sctyDtls;
    }

    /**
     * Sets the value of the sctyDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrument55 }
     *     
     */
    public void setSctyDtls(FinancialInstrument55 value) {
        this.sctyDtls = value;
    }

    /**
     * Gets the value of the acctOwnr property.
     * 
     * @return
     *     possible object is
     *     {@link AccountOwner3Choice }
     *     
     */
    public AccountOwner3Choice getAcctOwnr() {
        return acctOwnr;
    }

    /**
     * Sets the value of the acctOwnr property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountOwner3Choice }
     *     
     */
    public void setAcctOwnr(AccountOwner3Choice value) {
        this.acctOwnr = value;
    }

    /**
     * Gets the value of the intrmy property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the intrmy property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIntrmy().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Intermediary47 }
     * 
     * 
     * @return
     *     The value of the intrmy property.
     */
    public List<Intermediary47> getIntrmy() {
        if (intrmy == null) {
            intrmy = new ArrayList<>();
        }
        return this.intrmy;
    }

    /**
     * Gets the value of the acctSvcr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification125Choice }
     *     
     */
    public PartyIdentification125Choice getAcctSvcr() {
        return acctSvcr;
    }

    /**
     * Sets the value of the acctSvcr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification125Choice }
     *     
     */
    public void setAcctSvcr(PartyIdentification125Choice value) {
        this.acctSvcr = value;
    }

}
