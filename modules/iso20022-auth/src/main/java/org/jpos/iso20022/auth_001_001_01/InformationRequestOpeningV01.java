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

package org.jpos.iso20022.auth_001_001_01;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InformationRequestOpeningV01 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="InformationRequestOpeningV01">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="InvstgtnId" type="{urn:iso:std:iso:20022:tech:xsd:auth.001.001.01}Max35Text"/>
 *         <element name="LglMndtBsis" type="{urn:iso:std:iso:20022:tech:xsd:auth.001.001.01}LegalMandate1"/>
 *         <element name="CnfdtltySts" type="{urn:iso:std:iso:20022:tech:xsd:auth.001.001.01}YesNoIndicator"/>
 *         <element name="DueDt" type="{urn:iso:std:iso:20022:tech:xsd:auth.001.001.01}DueDate1" minOccurs="0"/>
 *         <element name="InvstgtnPrd" type="{urn:iso:std:iso:20022:tech:xsd:auth.001.001.01}DateOrDateTimePeriodChoice"/>
 *         <element name="SchCrit" type="{urn:iso:std:iso:20022:tech:xsd:auth.001.001.01}SearchCriteria1Choice"/>
 *         <element name="SplmtryData" type="{urn:iso:std:iso:20022:tech:xsd:auth.001.001.01}SupplementaryData1" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InformationRequestOpeningV01", propOrder = {
    "invstgtnId",
    "lglMndtBsis",
    "cnfdtltySts",
    "dueDt",
    "invstgtnPrd",
    "schCrit",
    "splmtryData"
})
public class InformationRequestOpeningV01 {

    @XmlElement(name = "InvstgtnId", required = true)
    protected String invstgtnId;
    @XmlElement(name = "LglMndtBsis", required = true)
    protected LegalMandate1 lglMndtBsis;
    @XmlElement(name = "CnfdtltySts")
    protected boolean cnfdtltySts;
    @XmlElement(name = "DueDt")
    protected DueDate1 dueDt;
    @XmlElement(name = "InvstgtnPrd", required = true)
    protected DateOrDateTimePeriodChoice invstgtnPrd;
    @XmlElement(name = "SchCrit", required = true)
    protected SearchCriteria1Choice schCrit;
    @XmlElement(name = "SplmtryData")
    protected List<SupplementaryData1> splmtryData;

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
     * Gets the value of the lglMndtBsis property.
     * 
     * @return
     *     possible object is
     *     {@link LegalMandate1 }
     *     
     */
    public LegalMandate1 getLglMndtBsis() {
        return lglMndtBsis;
    }

    /**
     * Sets the value of the lglMndtBsis property.
     * 
     * @param value
     *     allowed object is
     *     {@link LegalMandate1 }
     *     
     */
    public void setLglMndtBsis(LegalMandate1 value) {
        this.lglMndtBsis = value;
    }

    /**
     * Gets the value of the cnfdtltySts property.
     * 
     */
    public boolean isCnfdtltySts() {
        return cnfdtltySts;
    }

    /**
     * Sets the value of the cnfdtltySts property.
     * 
     */
    public void setCnfdtltySts(boolean value) {
        this.cnfdtltySts = value;
    }

    /**
     * Gets the value of the dueDt property.
     * 
     * @return
     *     possible object is
     *     {@link DueDate1 }
     *     
     */
    public DueDate1 getDueDt() {
        return dueDt;
    }

    /**
     * Sets the value of the dueDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DueDate1 }
     *     
     */
    public void setDueDt(DueDate1 value) {
        this.dueDt = value;
    }

    /**
     * Gets the value of the invstgtnPrd property.
     * 
     * @return
     *     possible object is
     *     {@link DateOrDateTimePeriodChoice }
     *     
     */
    public DateOrDateTimePeriodChoice getInvstgtnPrd() {
        return invstgtnPrd;
    }

    /**
     * Sets the value of the invstgtnPrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateOrDateTimePeriodChoice }
     *     
     */
    public void setInvstgtnPrd(DateOrDateTimePeriodChoice value) {
        this.invstgtnPrd = value;
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
