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

package org.jpos.iso20022.sese_011_001_09;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BeneficiaryDrawdown1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="BeneficiaryDrawdown1">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="BnfcryTp" type="{urn:iso:std:iso:20022:tech:xsd:sese.011.001.09}BeneficiaryType1Choice" minOccurs="0"/>
 *         <element name="DthUdrLmt" type="{urn:iso:std:iso:20022:tech:xsd:sese.011.001.09}YesNoIndicator" minOccurs="0"/>
 *         <element name="AddtlInf" type="{urn:iso:std:iso:20022:tech:xsd:sese.011.001.09}AdditionalInformation15" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BeneficiaryDrawdown1", propOrder = {
    "bnfcryTp",
    "dthUdrLmt",
    "addtlInf"
})
public class BeneficiaryDrawdown1 {

    @XmlElement(name = "BnfcryTp")
    protected BeneficiaryType1Choice bnfcryTp;
    @XmlElement(name = "DthUdrLmt")
    protected Boolean dthUdrLmt;
    @XmlElement(name = "AddtlInf")
    protected List<AdditionalInformation15> addtlInf;

    /**
     * Gets the value of the bnfcryTp property.
     * 
     * @return
     *     possible object is
     *     {@link BeneficiaryType1Choice }
     *     
     */
    public BeneficiaryType1Choice getBnfcryTp() {
        return bnfcryTp;
    }

    /**
     * Sets the value of the bnfcryTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link BeneficiaryType1Choice }
     *     
     */
    public void setBnfcryTp(BeneficiaryType1Choice value) {
        this.bnfcryTp = value;
    }

    /**
     * Gets the value of the dthUdrLmt property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDthUdrLmt() {
        return dthUdrLmt;
    }

    /**
     * Sets the value of the dthUdrLmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDthUdrLmt(Boolean value) {
        this.dthUdrLmt = value;
    }

    /**
     * Gets the value of the addtlInf property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the addtlInf property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddtlInf().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdditionalInformation15 }
     * 
     * 
     * @return
     *     The value of the addtlInf property.
     */
    public List<AdditionalInformation15> getAddtlInf() {
        if (addtlInf == null) {
            addtlInf = new ArrayList<>();
        }
        return this.addtlInf;
    }

}
