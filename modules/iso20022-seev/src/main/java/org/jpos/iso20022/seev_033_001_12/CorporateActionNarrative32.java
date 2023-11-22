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

package org.jpos.iso20022.seev_033_001_12;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CorporateActionNarrative32 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="CorporateActionNarrative32">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="InfToCmplyWth" type="{urn:iso:std:iso:20022:tech:xsd:seev.033.001.12}Max350Text" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="DlvryDtls" type="{urn:iso:std:iso:20022:tech:xsd:seev.033.001.12}Max350Text" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="FXInstrsAddtlInf" type="{urn:iso:std:iso:20022:tech:xsd:seev.033.001.12}Max350Text" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="InstrAddtlInf" type="{urn:iso:std:iso:20022:tech:xsd:seev.033.001.12}Max350Text" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CorporateActionNarrative32", propOrder = {
    "infToCmplyWth",
    "dlvryDtls",
    "fxInstrsAddtlInf",
    "instrAddtlInf"
})
public class CorporateActionNarrative32 {

    @XmlElement(name = "InfToCmplyWth")
    protected List<String> infToCmplyWth;
    @XmlElement(name = "DlvryDtls")
    protected List<String> dlvryDtls;
    @XmlElement(name = "FXInstrsAddtlInf")
    protected List<String> fxInstrsAddtlInf;
    @XmlElement(name = "InstrAddtlInf")
    protected List<String> instrAddtlInf;

    /**
     * Gets the value of the infToCmplyWth property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the infToCmplyWth property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInfToCmplyWth().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     * @return
     *     The value of the infToCmplyWth property.
     */
    public List<String> getInfToCmplyWth() {
        if (infToCmplyWth == null) {
            infToCmplyWth = new ArrayList<>();
        }
        return this.infToCmplyWth;
    }

    /**
     * Gets the value of the dlvryDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the dlvryDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDlvryDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     * @return
     *     The value of the dlvryDtls property.
     */
    public List<String> getDlvryDtls() {
        if (dlvryDtls == null) {
            dlvryDtls = new ArrayList<>();
        }
        return this.dlvryDtls;
    }

    /**
     * Gets the value of the fxInstrsAddtlInf property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the fxInstrsAddtlInf property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFXInstrsAddtlInf().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     * @return
     *     The value of the fxInstrsAddtlInf property.
     */
    public List<String> getFXInstrsAddtlInf() {
        if (fxInstrsAddtlInf == null) {
            fxInstrsAddtlInf = new ArrayList<>();
        }
        return this.fxInstrsAddtlInf;
    }

    /**
     * Gets the value of the instrAddtlInf property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the instrAddtlInf property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInstrAddtlInf().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     * @return
     *     The value of the instrAddtlInf property.
     */
    public List<String> getInstrAddtlInf() {
        if (instrAddtlInf == null) {
            instrAddtlInf = new ArrayList<>();
        }
        return this.instrAddtlInf;
    }

}
