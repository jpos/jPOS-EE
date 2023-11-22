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

package org.jpos.iso20022.catm_001_001_12;

import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StatusReportContent12 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="StatusReportContent12">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="POICpblties" type="{urn:iso:std:iso:20022:tech:xsd:catm.001.001.12}PointOfInteractionCapabilities9" minOccurs="0"/>
 *         <element name="POICmpnt" type="{urn:iso:std:iso:20022:tech:xsd:catm.001.001.12}PointOfInteractionComponent14" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="POIGrpId" type="{urn:iso:std:iso:20022:tech:xsd:catm.001.001.12}Max35Text" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="AttndncCntxt" type="{urn:iso:std:iso:20022:tech:xsd:catm.001.001.12}AttendanceContext1Code" minOccurs="0"/>
 *         <element name="POIDtTm" type="{urn:iso:std:iso:20022:tech:xsd:catm.001.001.12}ISODateTime"/>
 *         <element name="DataSetReqrd" type="{urn:iso:std:iso:20022:tech:xsd:catm.001.001.12}DataSetRequest4" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="Evt" type="{urn:iso:std:iso:20022:tech:xsd:catm.001.001.12}TMSEvent10" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="Errs" type="{urn:iso:std:iso:20022:tech:xsd:catm.001.001.12}Max140Text" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StatusReportContent12", propOrder = {
    "poiCpblties",
    "poiCmpnt",
    "poiGrpId",
    "attndncCntxt",
    "poiDtTm",
    "dataSetReqrd",
    "evt",
    "errs"
})
public class StatusReportContent12 {

    @XmlElement(name = "POICpblties")
    protected PointOfInteractionCapabilities9 poiCpblties;
    @XmlElement(name = "POICmpnt")
    protected List<PointOfInteractionComponent14> poiCmpnt;
    @XmlElement(name = "POIGrpId")
    protected List<String> poiGrpId;
    @XmlElement(name = "AttndncCntxt")
    @XmlSchemaType(name = "string")
    protected AttendanceContext1Code attndncCntxt;
    @XmlElement(name = "POIDtTm", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar poiDtTm;
    @XmlElement(name = "DataSetReqrd")
    protected List<DataSetRequest4> dataSetReqrd;
    @XmlElement(name = "Evt")
    protected List<TMSEvent10> evt;
    @XmlElement(name = "Errs")
    protected List<String> errs;

    /**
     * Gets the value of the poiCpblties property.
     * 
     * @return
     *     possible object is
     *     {@link PointOfInteractionCapabilities9 }
     *     
     */
    public PointOfInteractionCapabilities9 getPOICpblties() {
        return poiCpblties;
    }

    /**
     * Sets the value of the poiCpblties property.
     * 
     * @param value
     *     allowed object is
     *     {@link PointOfInteractionCapabilities9 }
     *     
     */
    public void setPOICpblties(PointOfInteractionCapabilities9 value) {
        this.poiCpblties = value;
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
     * {@link PointOfInteractionComponent14 }
     * 
     * 
     * @return
     *     The value of the poiCmpnt property.
     */
    public List<PointOfInteractionComponent14> getPOICmpnt() {
        if (poiCmpnt == null) {
            poiCmpnt = new ArrayList<>();
        }
        return this.poiCmpnt;
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
     * Gets the value of the attndncCntxt property.
     * 
     * @return
     *     possible object is
     *     {@link AttendanceContext1Code }
     *     
     */
    public AttendanceContext1Code getAttndncCntxt() {
        return attndncCntxt;
    }

    /**
     * Sets the value of the attndncCntxt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AttendanceContext1Code }
     *     
     */
    public void setAttndncCntxt(AttendanceContext1Code value) {
        this.attndncCntxt = value;
    }

    /**
     * Gets the value of the poiDtTm property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPOIDtTm() {
        return poiDtTm;
    }

    /**
     * Sets the value of the poiDtTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPOIDtTm(XMLGregorianCalendar value) {
        this.poiDtTm = value;
    }

    /**
     * Gets the value of the dataSetReqrd property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the dataSetReqrd property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDataSetReqrd().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DataSetRequest4 }
     * 
     * 
     * @return
     *     The value of the dataSetReqrd property.
     */
    public List<DataSetRequest4> getDataSetReqrd() {
        if (dataSetReqrd == null) {
            dataSetReqrd = new ArrayList<>();
        }
        return this.dataSetReqrd;
    }

    /**
     * Gets the value of the evt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the evt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEvt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TMSEvent10 }
     * 
     * 
     * @return
     *     The value of the evt property.
     */
    public List<TMSEvent10> getEvt() {
        if (evt == null) {
            evt = new ArrayList<>();
        }
        return this.evt;
    }

    /**
     * Gets the value of the errs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the errs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getErrs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     * @return
     *     The value of the errs property.
     */
    public List<String> getErrs() {
        if (errs == null) {
            errs = new ArrayList<>();
        }
        return this.errs;
    }

}
