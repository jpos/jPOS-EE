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

package org.jpos.iso20022.auth_002_001_01;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InformationRequestResponseV01 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="InformationRequestResponseV01">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="RspnId" type="{urn:iso:std:iso:20022:tech:xsd:auth.002.001.01}Max35Text"/>
 *         <element name="InvstgtnId" type="{urn:iso:std:iso:20022:tech:xsd:auth.002.001.01}Max35Text"/>
 *         <element name="RspnSts" type="{urn:iso:std:iso:20022:tech:xsd:auth.002.001.01}StatusResponse1Code"/>
 *         <element name="SchCrit" type="{urn:iso:std:iso:20022:tech:xsd:auth.002.001.01}SearchCriteria1Choice"/>
 *         <element name="RtrInd" type="{urn:iso:std:iso:20022:tech:xsd:auth.002.001.01}ReturnIndicator1" maxOccurs="unbounded"/>
 *         <element name="SplmtryData" type="{urn:iso:std:iso:20022:tech:xsd:auth.002.001.01}SupplementaryData1" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InformationRequestResponseV01", propOrder = {
    "rspnId",
    "invstgtnId",
    "rspnSts",
    "schCrit",
    "rtrInd",
    "splmtryData"
})
public class InformationRequestResponseV01 {

    @XmlElement(name = "RspnId", required = true)
    protected String rspnId;
    @XmlElement(name = "InvstgtnId", required = true)
    protected String invstgtnId;
    @XmlElement(name = "RspnSts", required = true)
    @XmlSchemaType(name = "string")
    protected StatusResponse1Code rspnSts;
    @XmlElement(name = "SchCrit", required = true)
    protected SearchCriteria1Choice schCrit;
    @XmlElement(name = "RtrInd", required = true)
    protected List<ReturnIndicator1> rtrInd;
    @XmlElement(name = "SplmtryData")
    protected List<SupplementaryData1> splmtryData;

    /**
     * Gets the value of the rspnId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRspnId() {
        return rspnId;
    }

    /**
     * Sets the value of the rspnId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRspnId(String value) {
        this.rspnId = value;
    }

    /**
     * Gets the value of the invstgtnId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInvstgtnId() {
        return invstgtnId;
    }

    /**
     * Sets the value of the invstgtnId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInvstgtnId(String value) {
        this.invstgtnId = value;
    }

    /**
     * Gets the value of the rspnSts property.
     * 
     * @return
     *     possible object is
     *     {@link StatusResponse1Code }
     *     
     */
    public StatusResponse1Code getRspnSts() {
        return rspnSts;
    }

    /**
     * Sets the value of the rspnSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatusResponse1Code }
     *     
     */
    public void setRspnSts(StatusResponse1Code value) {
        this.rspnSts = value;
    }

    /**
     * Gets the value of the schCrit property.
     * 
     * @return
     *     possible object is
     *     {@link SearchCriteria1Choice }
     *     
     */
    public SearchCriteria1Choice getSchCrit() {
        return schCrit;
    }

    /**
     * Sets the value of the schCrit property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchCriteria1Choice }
     *     
     */
    public void setSchCrit(SearchCriteria1Choice value) {
        this.schCrit = value;
    }

    /**
     * Gets the value of the rtrInd property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the rtrInd property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRtrInd().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReturnIndicator1 }
     * 
     * 
     * @return
     *     The value of the rtrInd property.
     */
    public List<ReturnIndicator1> getRtrInd() {
        if (rtrInd == null) {
            rtrInd = new ArrayList<>();
        }
        return this.rtrInd;
    }

    /**
     * Gets the value of the splmtryData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the splmtryData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSplmtryData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SupplementaryData1 }
     * 
     * 
     * @return
     *     The value of the splmtryData property.
     */
    public List<SupplementaryData1> getSplmtryData() {
        if (splmtryData == null) {
            splmtryData = new ArrayList<>();
        }
        return this.splmtryData;
    }

}
