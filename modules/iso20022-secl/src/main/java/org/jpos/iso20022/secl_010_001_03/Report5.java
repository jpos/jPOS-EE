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

package org.jpos.iso20022.secl_010_001_03;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Report5 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="Report5">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="NonClrMmb" type="{urn:iso:std:iso:20022:tech:xsd:secl.010.001.03}PartyIdentificationAndAccount31" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="SttlmOblgtnDtls" type="{urn:iso:std:iso:20022:tech:xsd:secl.010.001.03}SettlementObligation8" maxOccurs="unbounded"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Report5", propOrder = {
    "nonClrMmb",
    "sttlmOblgtnDtls"
})
public class Report5 {

    @XmlElement(name = "NonClrMmb")
    protected List<PartyIdentificationAndAccount31> nonClrMmb;
    @XmlElement(name = "SttlmOblgtnDtls", required = true)
    protected List<SettlementObligation8> sttlmOblgtnDtls;

    /**
     * Gets the value of the nonClrMmb property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the nonClrMmb property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNonClrMmb().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PartyIdentificationAndAccount31 }
     * 
     * 
     * @return
     *     The value of the nonClrMmb property.
     */
    public List<PartyIdentificationAndAccount31> getNonClrMmb() {
        if (nonClrMmb == null) {
            nonClrMmb = new ArrayList<>();
        }
        return this.nonClrMmb;
    }

    /**
     * Gets the value of the sttlmOblgtnDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the sttlmOblgtnDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSttlmOblgtnDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SettlementObligation8 }
     * 
     * 
     * @return
     *     The value of the sttlmOblgtnDtls property.
     */
    public List<SettlementObligation8> getSttlmOblgtnDtls() {
        if (sttlmOblgtnDtls == null) {
            sttlmOblgtnDtls = new ArrayList<>();
        }
        return this.sttlmOblgtnDtls;
    }

}
