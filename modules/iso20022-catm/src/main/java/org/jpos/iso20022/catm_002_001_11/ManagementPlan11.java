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

package org.jpos.iso20022.catm_002_001_11;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ManagementPlan11 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ManagementPlan11">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="POIId" type="{urn:iso:std:iso:20022:tech:xsd:catm.002.001.11}GenericIdentification176" minOccurs="0"/>
 *         <element name="TermnlMgrId" type="{urn:iso:std:iso:20022:tech:xsd:catm.002.001.11}GenericIdentification176"/>
 *         <element name="DataSet" type="{urn:iso:std:iso:20022:tech:xsd:catm.002.001.11}TerminalManagementDataSet32"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ManagementPlan11", propOrder = {
    "poiId",
    "termnlMgrId",
    "dataSet"
})
public class ManagementPlan11 {

    @XmlElement(name = "POIId")
    protected GenericIdentification176 poiId;
    @XmlElement(name = "TermnlMgrId", required = true)
    protected GenericIdentification176 termnlMgrId;
    @XmlElement(name = "DataSet", required = true)
    protected TerminalManagementDataSet32 dataSet;

    /**
     * Gets the value of the poiId property.
     * 
     * @return
     *     possible object is
     *     {@link GenericIdentification176 }
     *     
     */
    public GenericIdentification176 getPOIId() {
        return poiId;
    }

    /**
     * Sets the value of the poiId property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericIdentification176 }
     *     
     */
    public void setPOIId(GenericIdentification176 value) {
        this.poiId = value;
    }

    /**
     * Gets the value of the termnlMgrId property.
     * 
     * @return
     *     possible object is
     *     {@link GenericIdentification176 }
     *     
     */
    public GenericIdentification176 getTermnlMgrId() {
        return termnlMgrId;
    }

    /**
     * Sets the value of the termnlMgrId property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericIdentification176 }
     *     
     */
    public void setTermnlMgrId(GenericIdentification176 value) {
        this.termnlMgrId = value;
    }

    /**
     * Gets the value of the dataSet property.
     * 
     * @return
     *     possible object is
     *     {@link TerminalManagementDataSet32 }
     *     
     */
    public TerminalManagementDataSet32 getDataSet() {
        return dataSet;
    }

    /**
     * Sets the value of the dataSet property.
     * 
     * @param value
     *     allowed object is
     *     {@link TerminalManagementDataSet32 }
     *     
     */
    public void setDataSet(TerminalManagementDataSet32 value) {
        this.dataSet = value;
    }

}
