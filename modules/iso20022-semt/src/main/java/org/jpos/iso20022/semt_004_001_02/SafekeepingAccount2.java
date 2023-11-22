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

package org.jpos.iso20022.semt_004_001_02;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SafekeepingAccount2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="SafekeepingAccount2">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Id" type="{urn:swift:xsd:semt.004.001.02}AccountIdentificationFormatChoice"/>
 *         <element name="FngbInd" type="{urn:swift:xsd:semt.004.001.02}YesNoIndicator"/>
 *         <element name="Nm" type="{urn:swift:xsd:semt.004.001.02}Max35Text" minOccurs="0"/>
 *         <element name="Dsgnt" type="{urn:swift:xsd:semt.004.001.02}Max35Text" minOccurs="0"/>
 *         <element name="IntrmyInf" type="{urn:swift:xsd:semt.004.001.02}Intermediary11" maxOccurs="10" minOccurs="0"/>
 *         <element name="AcctOwnr" type="{urn:swift:xsd:semt.004.001.02}PartyIdentification2Choice" minOccurs="0"/>
 *         <element name="AcctSvcr" type="{urn:swift:xsd:semt.004.001.02}PartyIdentification2Choice" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SafekeepingAccount2", propOrder = {
    "id",
    "fngbInd",
    "nm",
    "dsgnt",
    "intrmyInf",
    "acctOwnr",
    "acctSvcr"
})
public class SafekeepingAccount2 {

    @XmlElement(name = "Id", required = true)
    protected AccountIdentificationFormatChoice id;
    @XmlElement(name = "FngbInd")
    protected boolean fngbInd;
    @XmlElement(name = "Nm")
    protected String nm;
    @XmlElement(name = "Dsgnt")
    protected String dsgnt;
    @XmlElement(name = "IntrmyInf")
    protected List<Intermediary11> intrmyInf;
    @XmlElement(name = "AcctOwnr")
    protected PartyIdentification2Choice acctOwnr;
    @XmlElement(name = "AcctSvcr")
    protected PartyIdentification2Choice acctSvcr;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link AccountIdentificationFormatChoice }
     *     
     */
    public AccountIdentificationFormatChoice getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountIdentificationFormatChoice }
     *     
     */
    public void setId(AccountIdentificationFormatChoice value) {
        this.id = value;
    }

    /**
     * Gets the value of the fngbInd property.
     * 
     */
    public boolean isFngbInd() {
        return fngbInd;
    }

    /**
     * Sets the value of the fngbInd property.
     * 
     */
    public void setFngbInd(boolean value) {
        this.fngbInd = value;
    }

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
     * Gets the value of the intrmyInf property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the intrmyInf property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIntrmyInf().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Intermediary11 }
     * 
     * 
     * @return
     *     The value of the intrmyInf property.
     */
    public List<Intermediary11> getIntrmyInf() {
        if (intrmyInf == null) {
            intrmyInf = new ArrayList<>();
        }
        return this.intrmyInf;
    }

    /**
     * Gets the value of the acctOwnr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification2Choice }
     *     
     */
    public PartyIdentification2Choice getAcctOwnr() {
        return acctOwnr;
    }

    /**
     * Sets the value of the acctOwnr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification2Choice }
     *     
     */
    public void setAcctOwnr(PartyIdentification2Choice value) {
        this.acctOwnr = value;
    }

    /**
     * Gets the value of the acctSvcr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification2Choice }
     *     
     */
    public PartyIdentification2Choice getAcctSvcr() {
        return acctSvcr;
    }

    /**
     * Sets the value of the acctSvcr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification2Choice }
     *     
     */
    public void setAcctSvcr(PartyIdentification2Choice value) {
        this.acctSvcr = value;
    }

}
