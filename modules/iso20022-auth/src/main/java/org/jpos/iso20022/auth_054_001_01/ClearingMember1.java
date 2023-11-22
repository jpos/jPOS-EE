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

package org.jpos.iso20022.auth_054_001_01;

import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ClearingMember1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ClearingMember1">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Id" type="{urn:iso:std:iso:20022:tech:xsd:auth.054.001.01}PartyIdentification118Choice"/>
 *         <element name="CdtQlty" type="{urn:iso:std:iso:20022:tech:xsd:auth.054.001.01}CreditQuality1Code"/>
 *         <element name="UltmtPrntId" type="{urn:iso:std:iso:20022:tech:xsd:auth.054.001.01}PartyIdentification118Choice" minOccurs="0"/>
 *         <element name="FutrsComssnMrchntInd" type="{urn:iso:std:iso:20022:tech:xsd:auth.054.001.01}TrueFalseIndicator"/>
 *         <element name="MmbshVldFr" type="{urn:iso:std:iso:20022:tech:xsd:auth.054.001.01}ISODate"/>
 *         <element name="MmbshVldTo" type="{urn:iso:std:iso:20022:tech:xsd:auth.054.001.01}ISODate" minOccurs="0"/>
 *         <element name="SpnsrgClrMmbId" type="{urn:iso:std:iso:20022:tech:xsd:auth.054.001.01}PartyIdentification118Choice" minOccurs="0"/>
 *         <element name="ClrAcctOwnr" type="{urn:iso:std:iso:20022:tech:xsd:auth.054.001.01}ClearingAccount1" maxOccurs="unbounded"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClearingMember1", propOrder = {
    "id",
    "cdtQlty",
    "ultmtPrntId",
    "futrsComssnMrchntInd",
    "mmbshVldFr",
    "mmbshVldTo",
    "spnsrgClrMmbId",
    "clrAcctOwnr"
})
public class ClearingMember1 {

    @XmlElement(name = "Id", required = true)
    protected PartyIdentification118Choice id;
    @XmlElement(name = "CdtQlty", required = true)
    @XmlSchemaType(name = "string")
    protected CreditQuality1Code cdtQlty;
    @XmlElement(name = "UltmtPrntId")
    protected PartyIdentification118Choice ultmtPrntId;
    @XmlElement(name = "FutrsComssnMrchntInd")
    protected boolean futrsComssnMrchntInd;
    @XmlElement(name = "MmbshVldFr", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar mmbshVldFr;
    @XmlElement(name = "MmbshVldTo")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar mmbshVldTo;
    @XmlElement(name = "SpnsrgClrMmbId")
    protected PartyIdentification118Choice spnsrgClrMmbId;
    @XmlElement(name = "ClrAcctOwnr", required = true)
    protected List<ClearingAccount1> clrAcctOwnr;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification118Choice }
     *     
     */
    public PartyIdentification118Choice getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification118Choice }
     *     
     */
    public void setId(PartyIdentification118Choice value) {
        this.id = value;
    }

    /**
     * Gets the value of the cdtQlty property.
     * 
     * @return
     *     possible object is
     *     {@link CreditQuality1Code }
     *     
     */
    public CreditQuality1Code getCdtQlty() {
        return cdtQlty;
    }

    /**
     * Sets the value of the cdtQlty property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditQuality1Code }
     *     
     */
    public void setCdtQlty(CreditQuality1Code value) {
        this.cdtQlty = value;
    }

    /**
     * Gets the value of the ultmtPrntId property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification118Choice }
     *     
     */
    public PartyIdentification118Choice getUltmtPrntId() {
        return ultmtPrntId;
    }

    /**
     * Sets the value of the ultmtPrntId property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification118Choice }
     *     
     */
    public void setUltmtPrntId(PartyIdentification118Choice value) {
        this.ultmtPrntId = value;
    }

    /**
     * Gets the value of the futrsComssnMrchntInd property.
     * 
     */
    public boolean isFutrsComssnMrchntInd() {
        return futrsComssnMrchntInd;
    }

    /**
     * Sets the value of the futrsComssnMrchntInd property.
     * 
     */
    public void setFutrsComssnMrchntInd(boolean value) {
        this.futrsComssnMrchntInd = value;
    }

    /**
     * Gets the value of the mmbshVldFr property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMmbshVldFr() {
        return mmbshVldFr;
    }

    /**
     * Sets the value of the mmbshVldFr property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMmbshVldFr(XMLGregorianCalendar value) {
        this.mmbshVldFr = value;
    }

    /**
     * Gets the value of the mmbshVldTo property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMmbshVldTo() {
        return mmbshVldTo;
    }

    /**
     * Sets the value of the mmbshVldTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMmbshVldTo(XMLGregorianCalendar value) {
        this.mmbshVldTo = value;
    }

    /**
     * Gets the value of the spnsrgClrMmbId property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification118Choice }
     *     
     */
    public PartyIdentification118Choice getSpnsrgClrMmbId() {
        return spnsrgClrMmbId;
    }

    /**
     * Sets the value of the spnsrgClrMmbId property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification118Choice }
     *     
     */
    public void setSpnsrgClrMmbId(PartyIdentification118Choice value) {
        this.spnsrgClrMmbId = value;
    }

    /**
     * Gets the value of the clrAcctOwnr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the clrAcctOwnr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getClrAcctOwnr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ClearingAccount1 }
     * 
     * 
     * @return
     *     The value of the clrAcctOwnr property.
     */
    public List<ClearingAccount1> getClrAcctOwnr() {
        if (clrAcctOwnr == null) {
            clrAcctOwnr = new ArrayList<>();
        }
        return this.clrAcctOwnr;
    }

}
