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

package org.jpos.iso20022.cain_021_001_02;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Terminal5 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="Terminal5">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="TermnlId" type="{urn:iso:std:iso:20022:tech:xsd:cain.021.001.02}TerminalIdentification3" minOccurs="0"/>
 *         <element name="Tp" type="{urn:iso:std:iso:20022:tech:xsd:cain.021.001.02}TerminalType1Code" minOccurs="0"/>
 *         <element name="OthrTp" type="{urn:iso:std:iso:20022:tech:xsd:cain.021.001.02}Max35Text" minOccurs="0"/>
 *         <element name="Cpblties" type="{urn:iso:std:iso:20022:tech:xsd:cain.021.001.02}Capabilities2" minOccurs="0"/>
 *         <element name="TermnlIntgtn" type="{urn:iso:std:iso:20022:tech:xsd:cain.021.001.02}TerminalIntegrationCategory1Code" minOccurs="0"/>
 *         <element name="GeogcLctn" type="{urn:iso:std:iso:20022:tech:xsd:cain.021.001.02}GeographicPointInDecimalDegrees" minOccurs="0"/>
 *         <element name="OutdrInd" type="{urn:iso:std:iso:20022:tech:xsd:cain.021.001.02}TrueFalseIndicator" minOccurs="0"/>
 *         <element name="OffPrmissInd" type="{urn:iso:std:iso:20022:tech:xsd:cain.021.001.02}TrueFalseIndicator" minOccurs="0"/>
 *         <element name="OnBrdInd" type="{urn:iso:std:iso:20022:tech:xsd:cain.021.001.02}TrueFalseIndicator" minOccurs="0"/>
 *         <element name="POICmpnt" type="{urn:iso:std:iso:20022:tech:xsd:cain.021.001.02}PointOfInteractionComponent13" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Terminal5", propOrder = {
    "termnlId",
    "tp",
    "othrTp",
    "cpblties",
    "termnlIntgtn",
    "geogcLctn",
    "outdrInd",
    "offPrmissInd",
    "onBrdInd",
    "poiCmpnt"
})
public class Terminal5 {

    @XmlElement(name = "TermnlId")
    protected TerminalIdentification3 termnlId;
    @XmlElement(name = "Tp")
    @XmlSchemaType(name = "string")
    protected TerminalType1Code tp;
    @XmlElement(name = "OthrTp")
    protected String othrTp;
    @XmlElement(name = "Cpblties")
    protected Capabilities2 cpblties;
    @XmlElement(name = "TermnlIntgtn")
    @XmlSchemaType(name = "string")
    protected TerminalIntegrationCategory1Code termnlIntgtn;
    @XmlElement(name = "GeogcLctn")
    protected String geogcLctn;
    @XmlElement(name = "OutdrInd")
    protected Boolean outdrInd;
    @XmlElement(name = "OffPrmissInd")
    protected Boolean offPrmissInd;
    @XmlElement(name = "OnBrdInd")
    protected Boolean onBrdInd;
    @XmlElement(name = "POICmpnt")
    protected List<PointOfInteractionComponent13> poiCmpnt;

    /**
     * Gets the value of the termnlId property.
     * 
     * @return
     *     possible object is
     *     {@link TerminalIdentification3 }
     *     
     */
    public TerminalIdentification3 getTermnlId() {
        return termnlId;
    }

    /**
     * Sets the value of the termnlId property.
     * 
     * @param value
     *     allowed object is
     *     {@link TerminalIdentification3 }
     *     
     */
    public void setTermnlId(TerminalIdentification3 value) {
        this.termnlId = value;
    }

    /**
     * Gets the value of the tp property.
     * 
     * @return
     *     possible object is
     *     {@link TerminalType1Code }
     *     
     */
    public TerminalType1Code getTp() {
        return tp;
    }

    /**
     * Sets the value of the tp property.
     * 
     * @param value
     *     allowed object is
     *     {@link TerminalType1Code }
     *     
     */
    public void setTp(TerminalType1Code value) {
        this.tp = value;
    }

    /**
     * Gets the value of the othrTp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOthrTp() {
        return othrTp;
    }

    /**
     * Sets the value of the othrTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOthrTp(String value) {
        this.othrTp = value;
    }

    /**
     * Gets the value of the cpblties property.
     * 
     * @return
     *     possible object is
     *     {@link Capabilities2 }
     *     
     */
    public Capabilities2 getCpblties() {
        return cpblties;
    }

    /**
     * Sets the value of the cpblties property.
     * 
     * @param value
     *     allowed object is
     *     {@link Capabilities2 }
     *     
     */
    public void setCpblties(Capabilities2 value) {
        this.cpblties = value;
    }

    /**
     * Gets the value of the termnlIntgtn property.
     * 
     * @return
     *     possible object is
     *     {@link TerminalIntegrationCategory1Code }
     *     
     */
    public TerminalIntegrationCategory1Code getTermnlIntgtn() {
        return termnlIntgtn;
    }

    /**
     * Sets the value of the termnlIntgtn property.
     * 
     * @param value
     *     allowed object is
     *     {@link TerminalIntegrationCategory1Code }
     *     
     */
    public void setTermnlIntgtn(TerminalIntegrationCategory1Code value) {
        this.termnlIntgtn = value;
    }

    /**
     * Gets the value of the geogcLctn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGeogcLctn() {
        return geogcLctn;
    }

    /**
     * Sets the value of the geogcLctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGeogcLctn(String value) {
        this.geogcLctn = value;
    }

    /**
     * Gets the value of the outdrInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOutdrInd() {
        return outdrInd;
    }

    /**
     * Sets the value of the outdrInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOutdrInd(Boolean value) {
        this.outdrInd = value;
    }

    /**
     * Gets the value of the offPrmissInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOffPrmissInd() {
        return offPrmissInd;
    }

    /**
     * Sets the value of the offPrmissInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOffPrmissInd(Boolean value) {
        this.offPrmissInd = value;
    }

    /**
     * Gets the value of the onBrdInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOnBrdInd() {
        return onBrdInd;
    }

    /**
     * Sets the value of the onBrdInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOnBrdInd(Boolean value) {
        this.onBrdInd = value;
    }

    /**
     * Gets the value of the poiCmpnt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the poiCmpnt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPOICmpnt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PointOfInteractionComponent13 }
     * 
     * 
     * @return
     *     The value of the poiCmpnt property.
     */
    public List<PointOfInteractionComponent13> getPOICmpnt() {
        if (poiCmpnt == null) {
            poiCmpnt = new ArrayList<>();
        }
        return this.poiCmpnt;
    }

}
