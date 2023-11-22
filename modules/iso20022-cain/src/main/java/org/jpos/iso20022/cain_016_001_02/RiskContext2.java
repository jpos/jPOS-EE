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

package org.jpos.iso20022.cain_016_001_02;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RiskContext2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="RiskContext2">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="RskInptData" type="{urn:iso:std:iso:20022:tech:xsd:cain.016.001.02}RiskInputData1" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="RskAssmnt" type="{urn:iso:std:iso:20022:tech:xsd:cain.016.001.02}RiskAssessment2" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RiskContext2", propOrder = {
    "rskInptData",
    "rskAssmnt"
})
public class RiskContext2 {

    @XmlElement(name = "RskInptData")
    protected List<RiskInputData1> rskInptData;
    @XmlElement(name = "RskAssmnt")
    protected List<RiskAssessment2> rskAssmnt;

    /**
     * Gets the value of the rskInptData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the rskInptData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRskInptData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RiskInputData1 }
     * 
     * 
     * @return
     *     The value of the rskInptData property.
     */
    public List<RiskInputData1> getRskInptData() {
        if (rskInptData == null) {
            rskInptData = new ArrayList<>();
        }
        return this.rskInptData;
    }

    /**
     * Gets the value of the rskAssmnt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the rskAssmnt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRskAssmnt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RiskAssessment2 }
     * 
     * 
     * @return
     *     The value of the rskAssmnt property.
     */
    public List<RiskAssessment2> getRskAssmnt() {
        if (rskAssmnt == null) {
            rskAssmnt = new ArrayList<>();
        }
        return this.rskAssmnt;
    }

}
