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

package org.jpos.iso20022.auth_052_001_02;

import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CounterpartyData88 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="CounterpartyData88">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="RptgDtTm" type="{urn:iso:std:iso:20022:tech:xsd:auth.052.001.02}ISODateTime"/>
 *         <element name="RptSubmitgNtty" type="{urn:iso:std:iso:20022:tech:xsd:auth.052.001.02}OrganisationIdentification15Choice"/>
 *         <element name="CtrPty" type="{urn:iso:std:iso:20022:tech:xsd:auth.052.001.02}CounterpartyData89" maxOccurs="2"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CounterpartyData88", propOrder = {
    "rptgDtTm",
    "rptSubmitgNtty",
    "ctrPty"
})
public class CounterpartyData88 {

    @XmlElement(name = "RptgDtTm", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar rptgDtTm;
    @XmlElement(name = "RptSubmitgNtty", required = true)
    protected OrganisationIdentification15Choice rptSubmitgNtty;
    @XmlElement(name = "CtrPty", required = true)
    protected List<CounterpartyData89> ctrPty;

    /**
     * Gets the value of the rptgDtTm property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRptgDtTm() {
        return rptgDtTm;
    }

    /**
     * Sets the value of the rptgDtTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRptgDtTm(XMLGregorianCalendar value) {
        this.rptgDtTm = value;
    }

    /**
     * Gets the value of the rptSubmitgNtty property.
     * 
     * @return
     *     possible object is
     *     {@link OrganisationIdentification15Choice }
     *     
     */
    public OrganisationIdentification15Choice getRptSubmitgNtty() {
        return rptSubmitgNtty;
    }

    /**
     * Sets the value of the rptSubmitgNtty property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganisationIdentification15Choice }
     *     
     */
    public void setRptSubmitgNtty(OrganisationIdentification15Choice value) {
        this.rptSubmitgNtty = value;
    }

    /**
     * Gets the value of the ctrPty property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the ctrPty property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCtrPty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CounterpartyData89 }
     * 
     * 
     * @return
     *     The value of the ctrPty property.
     */
    public List<CounterpartyData89> getCtrPty() {
        if (ctrPty == null) {
            ctrPty = new ArrayList<>();
        }
        return this.ctrPty;
    }

}
