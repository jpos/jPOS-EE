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

package org.jpos.iso20022.caaa_008_001_11;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EnvelopedData10 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="EnvelopedData10">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Vrsn" type="{urn:iso:std:iso:20022:tech:xsd:caaa.008.001.11}Number" minOccurs="0"/>
 *         <element name="OrgtrInf" type="{urn:iso:std:iso:20022:tech:xsd:caaa.008.001.11}OriginatorInformation1" minOccurs="0"/>
 *         <element name="Rcpt" type="{urn:iso:std:iso:20022:tech:xsd:caaa.008.001.11}Recipient14Choice" maxOccurs="unbounded"/>
 *         <element name="NcrptdCntt" type="{urn:iso:std:iso:20022:tech:xsd:caaa.008.001.11}EncryptedContent6" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EnvelopedData10", propOrder = {
    "vrsn",
    "orgtrInf",
    "rcpt",
    "ncrptdCntt"
})
public class EnvelopedData10 {

    @XmlElement(name = "Vrsn")
    protected BigDecimal vrsn;
    @XmlElement(name = "OrgtrInf")
    protected OriginatorInformation1 orgtrInf;
    @XmlElement(name = "Rcpt", required = true)
    protected List<Recipient14Choice> rcpt;
    @XmlElement(name = "NcrptdCntt")
    protected EncryptedContent6 ncrptdCntt;

    /**
     * Gets the value of the vrsn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getVrsn() {
        return vrsn;
    }

    /**
     * Sets the value of the vrsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setVrsn(BigDecimal value) {
        this.vrsn = value;
    }

    /**
     * Gets the value of the orgtrInf property.
     * 
     * @return
     *     possible object is
     *     {@link OriginatorInformation1 }
     *     
     */
    public OriginatorInformation1 getOrgtrInf() {
        return orgtrInf;
    }

    /**
     * Sets the value of the orgtrInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link OriginatorInformation1 }
     *     
     */
    public void setOrgtrInf(OriginatorInformation1 value) {
        this.orgtrInf = value;
    }

    /**
     * Gets the value of the rcpt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the rcpt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRcpt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Recipient14Choice }
     * 
     * 
     * @return
     *     The value of the rcpt property.
     */
    public List<Recipient14Choice> getRcpt() {
        if (rcpt == null) {
            rcpt = new ArrayList<>();
        }
        return this.rcpt;
    }

    /**
     * Gets the value of the ncrptdCntt property.
     * 
     * @return
     *     possible object is
     *     {@link EncryptedContent6 }
     *     
     */
    public EncryptedContent6 getNcrptdCntt() {
        return ncrptdCntt;
    }

    /**
     * Sets the value of the ncrptdCntt property.
     * 
     * @param value
     *     allowed object is
     *     {@link EncryptedContent6 }
     *     
     */
    public void setNcrptdCntt(EncryptedContent6 value) {
        this.ncrptdCntt = value;
    }

}
