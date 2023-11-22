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

package org.jpos.iso20022.acmt_022_001_03;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IdentificationModificationAdviceV03 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="IdentificationModificationAdviceV03">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Assgnmt" type="{urn:iso:std:iso:20022:tech:xsd:acmt.022.001.03}IdentificationAssignment3"/>
 *         <element name="OrgnlTxRef" type="{urn:iso:std:iso:20022:tech:xsd:acmt.022.001.03}OriginalTransactionReference30" minOccurs="0"/>
 *         <element name="Mod" type="{urn:iso:std:iso:20022:tech:xsd:acmt.022.001.03}IdentificationModification4" maxOccurs="unbounded"/>
 *         <element name="SplmtryData" type="{urn:iso:std:iso:20022:tech:xsd:acmt.022.001.03}SupplementaryData1" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IdentificationModificationAdviceV03", propOrder = {
    "assgnmt",
    "orgnlTxRef",
    "mod",
    "splmtryData"
})
public class IdentificationModificationAdviceV03 {

    @XmlElement(name = "Assgnmt", required = true)
    protected IdentificationAssignment3 assgnmt;
    @XmlElement(name = "OrgnlTxRef")
    protected OriginalTransactionReference30 orgnlTxRef;
    @XmlElement(name = "Mod", required = true)
    protected List<IdentificationModification4> mod;
    @XmlElement(name = "SplmtryData")
    protected List<SupplementaryData1> splmtryData;

    /**
     * Gets the value of the assgnmt property.
     * 
     * @return
     *     possible object is
     *     {@link IdentificationAssignment3 }
     *     
     */
    public IdentificationAssignment3 getAssgnmt() {
        return assgnmt;
    }

    /**
     * Sets the value of the assgnmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentificationAssignment3 }
     *     
     */
    public void setAssgnmt(IdentificationAssignment3 value) {
        this.assgnmt = value;
    }

    /**
     * Gets the value of the orgnlTxRef property.
     * 
     * @return
     *     possible object is
     *     {@link OriginalTransactionReference30 }
     *     
     */
    public OriginalTransactionReference30 getOrgnlTxRef() {
        return orgnlTxRef;
    }

    /**
     * Sets the value of the orgnlTxRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link OriginalTransactionReference30 }
     *     
     */
    public void setOrgnlTxRef(OriginalTransactionReference30 value) {
        this.orgnlTxRef = value;
    }

    /**
     * Gets the value of the mod property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the mod property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMod().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IdentificationModification4 }
     * 
     * 
     * @return
     *     The value of the mod property.
     */
    public List<IdentificationModification4> getMod() {
        if (mod == null) {
            mod = new ArrayList<>();
        }
        return this.mod;
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
