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

package org.jpos.iso20022.auth_013_001_02;

import java.math.BigDecimal;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OptionDateOrPeriod1Choice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="OptionDateOrPeriod1Choice">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="EarlstExrcDt" type="{urn:iso:std:iso:20022:tech:xsd:auth.013.001.02}ISODate"/>
 *         <element name="NtcePrd" type="{urn:iso:std:iso:20022:tech:xsd:auth.013.001.02}Number"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OptionDateOrPeriod1Choice", propOrder = {
    "earlstExrcDt",
    "ntcePrd"
})
public class OptionDateOrPeriod1Choice {

    @XmlElement(name = "EarlstExrcDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar earlstExrcDt;
    @XmlElement(name = "NtcePrd")
    protected BigDecimal ntcePrd;

    /**
     * Gets the value of the earlstExrcDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEarlstExrcDt() {
        return earlstExrcDt;
    }

    /**
     * Sets the value of the earlstExrcDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEarlstExrcDt(XMLGregorianCalendar value) {
        this.earlstExrcDt = value;
    }

    /**
     * Gets the value of the ntcePrd property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNtcePrd() {
        return ntcePrd;
    }

    /**
     * Sets the value of the ntcePrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNtcePrd(BigDecimal value) {
        this.ntcePrd = value;
    }

}
