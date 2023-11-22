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

package org.jpos.iso20022.pacs_029_001_01;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MultilateralSettlementRequestV01 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="MultilateralSettlementRequestV01">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="GrpHdr" type="{urn:iso:std:iso:20022:tech:xsd:pacs.029.001.01}GroupHeader104"/>
 *         <element name="SttlmReq" type="{urn:iso:std:iso:20022:tech:xsd:pacs.029.001.01}MultilateralSettlementRequest2" maxOccurs="unbounded"/>
 *         <element name="SplmtryData" type="{urn:iso:std:iso:20022:tech:xsd:pacs.029.001.01}SupplementaryData1" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MultilateralSettlementRequestV01", propOrder = {
    "grpHdr",
    "sttlmReq",
    "splmtryData"
})
public class MultilateralSettlementRequestV01 {

    @XmlElement(name = "GrpHdr", required = true)
    protected GroupHeader104 grpHdr;
    @XmlElement(name = "SttlmReq", required = true)
    protected List<MultilateralSettlementRequest2> sttlmReq;
    @XmlElement(name = "SplmtryData")
    protected SupplementaryData1 splmtryData;

    /**
     * Gets the value of the grpHdr property.
     * 
     * @return
     *     possible object is
     *     {@link GroupHeader104 }
     *     
     */
    public GroupHeader104 getGrpHdr() {
        return grpHdr;
    }

    /**
     * Sets the value of the grpHdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link GroupHeader104 }
     *     
     */
    public void setGrpHdr(GroupHeader104 value) {
        this.grpHdr = value;
    }

    /**
     * Gets the value of the sttlmReq property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the sttlmReq property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSttlmReq().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MultilateralSettlementRequest2 }
     * 
     * 
     * @return
     *     The value of the sttlmReq property.
     */
    public List<MultilateralSettlementRequest2> getSttlmReq() {
        if (sttlmReq == null) {
            sttlmReq = new ArrayList<>();
        }
        return this.sttlmReq;
    }

    /**
     * Gets the value of the splmtryData property.
     * 
     * @return
     *     possible object is
     *     {@link SupplementaryData1 }
     *     
     */
    public SupplementaryData1 getSplmtryData() {
        return splmtryData;
    }

    /**
     * Sets the value of the splmtryData property.
     * 
     * @param value
     *     allowed object is
     *     {@link SupplementaryData1 }
     *     
     */
    public void setSplmtryData(SupplementaryData1 value) {
        this.splmtryData = value;
    }

}
