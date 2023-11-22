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

package org.jpos.iso20022.auth_033_001_02;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CreditDefaultSwapIndex3 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="CreditDefaultSwapIndex3">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="UndrlygIndxId" type="{urn:iso:std:iso:20022:tech:xsd:auth.033.001.02}ISINOct2015Identifier" minOccurs="0"/>
 *         <element name="UndrlygIndxNm" type="{urn:iso:std:iso:20022:tech:xsd:auth.033.001.02}Max25Text" minOccurs="0"/>
 *         <element name="Srs" type="{urn:iso:std:iso:20022:tech:xsd:auth.033.001.02}Number" minOccurs="0"/>
 *         <element name="Vrsn" type="{urn:iso:std:iso:20022:tech:xsd:auth.033.001.02}Number" minOccurs="0"/>
 *         <element name="RollMnth" type="{urn:iso:std:iso:20022:tech:xsd:auth.033.001.02}RestrictedMonthExact2Number" maxOccurs="12" minOccurs="0"/>
 *         <element name="NxtRollDt" type="{urn:iso:std:iso:20022:tech:xsd:auth.033.001.02}ISODate" minOccurs="0"/>
 *         <element name="NtnlCcy" type="{urn:iso:std:iso:20022:tech:xsd:auth.033.001.02}ActiveOrHistoricCurrencyCode"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreditDefaultSwapIndex3", propOrder = {
    "undrlygIndxId",
    "undrlygIndxNm",
    "srs",
    "vrsn",
    "rollMnth",
    "nxtRollDt",
    "ntnlCcy"
})
public class CreditDefaultSwapIndex3 {

    @XmlElement(name = "UndrlygIndxId")
    protected String undrlygIndxId;
    @XmlElement(name = "UndrlygIndxNm")
    protected String undrlygIndxNm;
    @XmlElement(name = "Srs")
    protected BigDecimal srs;
    @XmlElement(name = "Vrsn")
    protected BigDecimal vrsn;
    @XmlElement(name = "RollMnth")
    protected List<BigDecimal> rollMnth;
    @XmlElement(name = "NxtRollDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar nxtRollDt;
    @XmlElement(name = "NtnlCcy", required = true)
    protected String ntnlCcy;

    /**
     * Gets the value of the undrlygIndxId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUndrlygIndxId() {
        return undrlygIndxId;
    }

    /**
     * Sets the value of the undrlygIndxId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUndrlygIndxId(String value) {
        this.undrlygIndxId = value;
    }

    /**
     * Gets the value of the undrlygIndxNm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUndrlygIndxNm() {
        return undrlygIndxNm;
    }

    /**
     * Sets the value of the undrlygIndxNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUndrlygIndxNm(String value) {
        this.undrlygIndxNm = value;
    }

    /**
     * Gets the value of the srs property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSrs() {
        return srs;
    }

    /**
     * Sets the value of the srs property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSrs(BigDecimal value) {
        this.srs = value;
    }

    /**
     * Gets the value of the vrsn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getVrsn() {
        return vrsn;
    }

    /**
     * Sets the value of the vrsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setVrsn(BigDecimal value) {
        this.vrsn = value;
    }

    /**
     * Gets the value of the rollMnth property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the rollMnth property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRollMnth().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BigDecimal }
     * 
     * 
     * @return
     *     The value of the rollMnth property.
     */
    public List<BigDecimal> getRollMnth() {
        if (rollMnth == null) {
            rollMnth = new ArrayList<>();
        }
        return this.rollMnth;
    }

    /**
     * Gets the value of the nxtRollDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getNxtRollDt() {
        return nxtRollDt;
    }

    /**
     * Sets the value of the nxtRollDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setNxtRollDt(XMLGregorianCalendar value) {
        this.nxtRollDt = value;
    }

    /**
     * Gets the value of the ntnlCcy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNtnlCcy() {
        return ntnlCcy;
    }

    /**
     * Sets the value of the ntnlCcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNtnlCcy(String value) {
        this.ntnlCcy = value;
    }

}
