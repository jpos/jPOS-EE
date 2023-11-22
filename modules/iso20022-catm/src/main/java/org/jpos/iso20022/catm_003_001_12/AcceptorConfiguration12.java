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

package org.jpos.iso20022.catm_003_001_12;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AcceptorConfiguration12 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="AcceptorConfiguration12">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="TermnlMgrId" type="{urn:iso:std:iso:20022:tech:xsd:catm.003.001.12}GenericIdentification176"/>
 *         <element name="POIGrpId" type="{urn:iso:std:iso:20022:tech:xsd:catm.003.001.12}Max35Text" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="DataSet" type="{urn:iso:std:iso:20022:tech:xsd:catm.003.001.12}AcceptorConfigurationDataSet4" maxOccurs="unbounded"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AcceptorConfiguration12", propOrder = {
    "termnlMgrId",
    "poiGrpId",
    "dataSet"
})
public class AcceptorConfiguration12 {

    @XmlElement(name = "TermnlMgrId", required = true)
    protected GenericIdentification176 termnlMgrId;
    @XmlElement(name = "POIGrpId")
    protected List<String> poiGrpId;
    @XmlElement(name = "DataSet", required = true)
    protected List<AcceptorConfigurationDataSet4> dataSet;

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
     * Gets the value of the poiGrpId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the poiGrpId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPOIGrpId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     * @return
     *     The value of the poiGrpId property.
     */
    public List<String> getPOIGrpId() {
        if (poiGrpId == null) {
            poiGrpId = new ArrayList<>();
        }
        return this.poiGrpId;
    }

    /**
     * Gets the value of the dataSet property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the dataSet property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDataSet().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AcceptorConfigurationDataSet4 }
     * 
     * 
     * @return
     *     The value of the dataSet property.
     */
    public List<AcceptorConfigurationDataSet4> getDataSet() {
        if (dataSet == null) {
            dataSet = new ArrayList<>();
        }
        return this.dataSet;
    }

}
