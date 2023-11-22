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

package org.jpos.iso20022.auth_057_001_01;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ScenarioDefinition1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ScenarioDefinition1">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Id" type="{urn:iso:std:iso:20022:tech:xsd:auth.057.001.01}GenericIdentification165"/>
 *         <element name="ScnroTp" type="{urn:iso:std:iso:20022:tech:xsd:auth.057.001.01}ScenarioType1Code"/>
 *         <element name="StrtgyStrssTp" type="{urn:iso:std:iso:20022:tech:xsd:auth.057.001.01}StrategyStressType1Code"/>
 *         <element name="StrssItm" type="{urn:iso:std:iso:20022:tech:xsd:auth.057.001.01}StressItem1" maxOccurs="2"/>
 *         <element name="Desc" type="{urn:iso:std:iso:20022:tech:xsd:auth.057.001.01}Max2000Text" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ScenarioDefinition1", propOrder = {
    "id",
    "scnroTp",
    "strtgyStrssTp",
    "strssItm",
    "desc"
})
public class ScenarioDefinition1 {

    @XmlElement(name = "Id", required = true)
    protected GenericIdentification165 id;
    @XmlElement(name = "ScnroTp", required = true)
    @XmlSchemaType(name = "string")
    protected ScenarioType1Code scnroTp;
    @XmlElement(name = "StrtgyStrssTp", required = true)
    @XmlSchemaType(name = "string")
    protected StrategyStressType1Code strtgyStrssTp;
    @XmlElement(name = "StrssItm", required = true)
    protected List<StressItem1> strssItm;
    @XmlElement(name = "Desc")
    protected String desc;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link GenericIdentification165 }
     *     
     */
    public GenericIdentification165 getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericIdentification165 }
     *     
     */
    public void setId(GenericIdentification165 value) {
        this.id = value;
    }

    /**
     * Gets the value of the scnroTp property.
     * 
     * @return
     *     possible object is
     *     {@link ScenarioType1Code }
     *     
     */
    public ScenarioType1Code getScnroTp() {
        return scnroTp;
    }

    /**
     * Sets the value of the scnroTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link ScenarioType1Code }
     *     
     */
    public void setScnroTp(ScenarioType1Code value) {
        this.scnroTp = value;
    }

    /**
     * Gets the value of the strtgyStrssTp property.
     * 
     * @return
     *     possible object is
     *     {@link StrategyStressType1Code }
     *     
     */
    public StrategyStressType1Code getStrtgyStrssTp() {
        return strtgyStrssTp;
    }

    /**
     * Sets the value of the strtgyStrssTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link StrategyStressType1Code }
     *     
     */
    public void setStrtgyStrssTp(StrategyStressType1Code value) {
        this.strtgyStrssTp = value;
    }

    /**
     * Gets the value of the strssItm property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the strssItm property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStrssItm().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StressItem1 }
     * 
     * 
     * @return
     *     The value of the strssItm property.
     */
    public List<StressItem1> getStrssItm() {
        if (strssItm == null) {
            strssItm = new ArrayList<>();
        }
        return this.strssItm;
    }

    /**
     * Gets the value of the desc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDesc() {
        return desc;
    }

    /**
     * Sets the value of the desc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDesc(String value) {
        this.desc = value;
    }

}
