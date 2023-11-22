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

package org.jpos.iso20022.reda_061_001_02;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CutOffData2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="CutOffData2">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="PtcptId" type="{urn:iso:std:iso:20022:tech:xsd:reda.061.001.02}PartyIdentification242Choice"/>
 *         <element name="NetgCutOffDtls" type="{urn:iso:std:iso:20022:tech:xsd:reda.061.001.02}NettingCutOff2" maxOccurs="unbounded"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CutOffData2", propOrder = {
    "ptcptId",
    "netgCutOffDtls"
})
public class CutOffData2 {

    @XmlElement(name = "PtcptId", required = true)
    protected PartyIdentification242Choice ptcptId;
    @XmlElement(name = "NetgCutOffDtls", required = true)
    protected List<NettingCutOff2> netgCutOffDtls;

    /**
     * Gets the value of the ptcptId property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification242Choice }
     *     
     */
    public PartyIdentification242Choice getPtcptId() {
        return ptcptId;
    }

    /**
     * Sets the value of the ptcptId property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification242Choice }
     *     
     */
    public void setPtcptId(PartyIdentification242Choice value) {
        this.ptcptId = value;
    }

    /**
     * Gets the value of the netgCutOffDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the netgCutOffDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNetgCutOffDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NettingCutOff2 }
     * 
     * 
     * @return
     *     The value of the netgCutOffDtls property.
     */
    public List<NettingCutOff2> getNetgCutOffDtls() {
        if (netgCutOffDtls == null) {
            netgCutOffDtls = new ArrayList<>();
        }
        return this.netgCutOffDtls;
    }

}
