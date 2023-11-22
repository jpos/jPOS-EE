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

package org.jpos.iso20022.auth_107_001_01;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ExerciseDate1Choice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ExerciseDate1Choice">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="FrstExrcDt" type="{urn:iso:std:iso:20022:tech:xsd:auth.107.001.01}ISODate"/>
 *         <element name="PdgDtAplbl" type="{urn:iso:std:iso:20022:tech:xsd:auth.107.001.01}PriceStatus2Code"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExerciseDate1Choice", propOrder = {
    "frstExrcDt",
    "pdgDtAplbl"
})
public class ExerciseDate1Choice {

    @XmlElement(name = "FrstExrcDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar frstExrcDt;
    @XmlElement(name = "PdgDtAplbl")
    @XmlSchemaType(name = "string")
    protected PriceStatus2Code pdgDtAplbl;

    /**
     * Gets the value of the frstExrcDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFrstExrcDt() {
        return frstExrcDt;
    }

    /**
     * Sets the value of the frstExrcDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFrstExrcDt(XMLGregorianCalendar value) {
        this.frstExrcDt = value;
    }

    /**
     * Gets the value of the pdgDtAplbl property.
     * 
     * @return
     *     possible object is
     *     {@link PriceStatus2Code }
     *     
     */
    public PriceStatus2Code getPdgDtAplbl() {
        return pdgDtAplbl;
    }

    /**
     * Sets the value of the pdgDtAplbl property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceStatus2Code }
     *     
     */
    public void setPdgDtAplbl(PriceStatus2Code value) {
        this.pdgDtAplbl = value;
    }

}
