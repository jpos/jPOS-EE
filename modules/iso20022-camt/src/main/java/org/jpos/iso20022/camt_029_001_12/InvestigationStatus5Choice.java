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

package org.jpos.iso20022.camt_029_001_12;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InvestigationStatus5Choice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="InvestigationStatus5Choice">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="Conf" type="{urn:iso:std:iso:20022:tech:xsd:camt.029.001.12}ExternalInvestigationExecutionConfirmation1Code"/>
 *         <element name="RjctdMod" type="{urn:iso:std:iso:20022:tech:xsd:camt.029.001.12}ModificationStatusReason1Choice" maxOccurs="unbounded"/>
 *         <element name="DplctOf" type="{urn:iso:std:iso:20022:tech:xsd:camt.029.001.12}Case5"/>
 *         <element name="AssgnmtCxlConf" type="{urn:iso:std:iso:20022:tech:xsd:camt.029.001.12}YesNoIndicator"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InvestigationStatus5Choice", propOrder = {
    "conf",
    "rjctdMod",
    "dplctOf",
    "assgnmtCxlConf"
})
public class InvestigationStatus5Choice {

    @XmlElement(name = "Conf")
    protected String conf;
    @XmlElement(name = "RjctdMod")
    protected List<ModificationStatusReason1Choice> rjctdMod;
    @XmlElement(name = "DplctOf")
    protected Case5 dplctOf;
    @XmlElement(name = "AssgnmtCxlConf")
    protected Boolean assgnmtCxlConf;

    /**
     * Gets the value of the conf property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConf() {
        return conf;
    }

    /**
     * Sets the value of the conf property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConf(String value) {
        this.conf = value;
    }

    /**
     * Gets the value of the rjctdMod property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the rjctdMod property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRjctdMod().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ModificationStatusReason1Choice }
     * 
     * 
     * @return
     *     The value of the rjctdMod property.
     */
    public List<ModificationStatusReason1Choice> getRjctdMod() {
        if (rjctdMod == null) {
            rjctdMod = new ArrayList<>();
        }
        return this.rjctdMod;
    }

    /**
     * Gets the value of the dplctOf property.
     * 
     * @return
     *     possible object is
     *     {@link Case5 }
     *     
     */
    public Case5 getDplctOf() {
        return dplctOf;
    }

    /**
     * Sets the value of the dplctOf property.
     * 
     * @param value
     *     allowed object is
     *     {@link Case5 }
     *     
     */
    public void setDplctOf(Case5 value) {
        this.dplctOf = value;
    }

    /**
     * Gets the value of the assgnmtCxlConf property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAssgnmtCxlConf() {
        return assgnmtCxlConf;
    }

    /**
     * Sets the value of the assgnmtCxlConf property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAssgnmtCxlConf(Boolean value) {
        this.assgnmtCxlConf = value;
    }

}
