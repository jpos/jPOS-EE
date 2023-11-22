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

package org.jpos.iso20022.caad_002_001_02;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EncryptedContent5 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="EncryptedContent5">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="CnttTp" type="{urn:iso:std:iso:20022:tech:xsd:caad.002.001.02}ContentType2Code"/>
 *         <element name="CnttNcrptnAlgo" type="{urn:iso:std:iso:20022:tech:xsd:caad.002.001.02}AlgorithmIdentification25"/>
 *         <element name="NcrptdDataElmt" type="{urn:iso:std:iso:20022:tech:xsd:caad.002.001.02}EncryptedDataElement1" maxOccurs="unbounded"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EncryptedContent5", propOrder = {
    "cnttTp",
    "cnttNcrptnAlgo",
    "ncrptdDataElmt"
})
public class EncryptedContent5 {

    @XmlElement(name = "CnttTp", required = true)
    @XmlSchemaType(name = "string")
    protected ContentType2Code cnttTp;
    @XmlElement(name = "CnttNcrptnAlgo", required = true)
    protected AlgorithmIdentification25 cnttNcrptnAlgo;
    @XmlElement(name = "NcrptdDataElmt", required = true)
    protected List<EncryptedDataElement1> ncrptdDataElmt;

    /**
     * Gets the value of the cnttTp property.
     * 
     * @return
     *     possible object is
     *     {@link ContentType2Code }
     *     
     */
    public ContentType2Code getCnttTp() {
        return cnttTp;
    }

    /**
     * Sets the value of the cnttTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContentType2Code }
     *     
     */
    public void setCnttTp(ContentType2Code value) {
        this.cnttTp = value;
    }

    /**
     * Gets the value of the cnttNcrptnAlgo property.
     * 
     * @return
     *     possible object is
     *     {@link AlgorithmIdentification25 }
     *     
     */
    public AlgorithmIdentification25 getCnttNcrptnAlgo() {
        return cnttNcrptnAlgo;
    }

    /**
     * Sets the value of the cnttNcrptnAlgo property.
     * 
     * @param value
     *     allowed object is
     *     {@link AlgorithmIdentification25 }
     *     
     */
    public void setCnttNcrptnAlgo(AlgorithmIdentification25 value) {
        this.cnttNcrptnAlgo = value;
    }

    /**
     * Gets the value of the ncrptdDataElmt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the ncrptdDataElmt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNcrptdDataElmt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EncryptedDataElement1 }
     * 
     * 
     * @return
     *     The value of the ncrptdDataElmt property.
     */
    public List<EncryptedDataElement1> getNcrptdDataElmt() {
        if (ncrptdDataElmt == null) {
            ncrptdDataElmt = new ArrayList<>();
        }
        return this.ncrptdDataElmt;
    }

}
