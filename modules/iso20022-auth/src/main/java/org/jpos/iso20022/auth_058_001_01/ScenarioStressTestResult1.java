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

package org.jpos.iso20022.auth_058_001_01;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ScenarioStressTestResult1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ScenarioStressTestResult1">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Id" type="{urn:iso:std:iso:20022:tech:xsd:auth.058.001.01}GenericIdentification168"/>
 *         <element name="PrtflStrssTstRslt" type="{urn:iso:std:iso:20022:tech:xsd:auth.058.001.01}PortfolioStressTestResult1" maxOccurs="unbounded"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ScenarioStressTestResult1", propOrder = {
    "id",
    "prtflStrssTstRslt"
})
public class ScenarioStressTestResult1 {

    @XmlElement(name = "Id", required = true)
    protected GenericIdentification168 id;
    @XmlElement(name = "PrtflStrssTstRslt", required = true)
    protected List<PortfolioStressTestResult1> prtflStrssTstRslt;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link GenericIdentification168 }
     *     
     */
    public GenericIdentification168 getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericIdentification168 }
     *     
     */
    public void setId(GenericIdentification168 value) {
        this.id = value;
    }

    /**
     * Gets the value of the prtflStrssTstRslt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the prtflStrssTstRslt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPrtflStrssTstRslt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PortfolioStressTestResult1 }
     * 
     * 
     * @return
     *     The value of the prtflStrssTstRslt property.
     */
    public List<PortfolioStressTestResult1> getPrtflStrssTstRslt() {
        if (prtflStrssTstRslt == null) {
            prtflStrssTstRslt = new ArrayList<>();
        }
        return this.prtflStrssTstRslt;
    }

}
