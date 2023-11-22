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

package org.jpos.iso20022.tsrv_013_001_01;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DemandDocumentation1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="DemandDocumentation1">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="CmpltInd" type="{urn:iso:std:iso:20022:tech:xsd:tsrv.013.001.01}YesNoIndicator"/>
 *         <element name="CmpltnInf" type="{urn:iso:std:iso:20022:tech:xsd:tsrv.013.001.01}Max2000Text" minOccurs="0"/>
 *         <element name="NclsdFile" type="{urn:iso:std:iso:20022:tech:xsd:tsrv.013.001.01}Document9" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="DmndNrrtv" type="{urn:iso:std:iso:20022:tech:xsd:tsrv.013.001.01}Max20000Text" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DemandDocumentation1", propOrder = {
    "cmpltInd",
    "cmpltnInf",
    "nclsdFile",
    "dmndNrrtv"
})
public class DemandDocumentation1 {

    @XmlElement(name = "CmpltInd")
    protected boolean cmpltInd;
    @XmlElement(name = "CmpltnInf")
    protected String cmpltnInf;
    @XmlElement(name = "NclsdFile")
    protected List<Document9> nclsdFile;
    @XmlElement(name = "DmndNrrtv")
    protected String dmndNrrtv;

    /**
     * Gets the value of the cmpltInd property.
     * 
     */
    public boolean isCmpltInd() {
        return cmpltInd;
    }

    /**
     * Sets the value of the cmpltInd property.
     * 
     */
    public void setCmpltInd(boolean value) {
        this.cmpltInd = value;
    }

    /**
     * Gets the value of the cmpltnInf property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCmpltnInf() {
        return cmpltnInf;
    }

    /**
     * Sets the value of the cmpltnInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCmpltnInf(String value) {
        this.cmpltnInf = value;
    }

    /**
     * Gets the value of the nclsdFile property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the nclsdFile property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNclsdFile().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Document9 }
     * 
     * 
     * @return
     *     The value of the nclsdFile property.
     */
    public List<Document9> getNclsdFile() {
        if (nclsdFile == null) {
            nclsdFile = new ArrayList<>();
        }
        return this.nclsdFile;
    }

    /**
     * Gets the value of the dmndNrrtv property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDmndNrrtv() {
        return dmndNrrtv;
    }

    /**
     * Sets the value of the dmndNrrtv property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDmndNrrtv(String value) {
        this.dmndNrrtv = value;
    }

}
