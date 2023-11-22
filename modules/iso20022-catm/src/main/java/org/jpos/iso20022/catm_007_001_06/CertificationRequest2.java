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

package org.jpos.iso20022.catm_007_001_06;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CertificationRequest2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="CertificationRequest2">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Vrsn" type="{urn:iso:std:iso:20022:tech:xsd:catm.007.001.06}Number" minOccurs="0"/>
 *         <element name="SbjtNm" type="{urn:iso:std:iso:20022:tech:xsd:catm.007.001.06}CertificateIssuer1" minOccurs="0"/>
 *         <element name="SbjtPblcKeyInf" type="{urn:iso:std:iso:20022:tech:xsd:catm.007.001.06}PublicRSAKey2"/>
 *         <element name="Attr" type="{urn:iso:std:iso:20022:tech:xsd:catm.007.001.06}RelativeDistinguishedName2" maxOccurs="unbounded"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CertificationRequest2", propOrder = {
    "vrsn",
    "sbjtNm",
    "sbjtPblcKeyInf",
    "attr"
})
public class CertificationRequest2 {

    @XmlElement(name = "Vrsn")
    protected BigDecimal vrsn;
    @XmlElement(name = "SbjtNm")
    protected CertificateIssuer1 sbjtNm;
    @XmlElement(name = "SbjtPblcKeyInf", required = true)
    protected PublicRSAKey2 sbjtPblcKeyInf;
    @XmlElement(name = "Attr", required = true)
    protected List<RelativeDistinguishedName2> attr;

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
     * Gets the value of the sbjtNm property.
     * 
     * @return
     *     possible object is
     *     {@link CertificateIssuer1 }
     *     
     */
    public CertificateIssuer1 getSbjtNm() {
        return sbjtNm;
    }

    /**
     * Sets the value of the sbjtNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link CertificateIssuer1 }
     *     
     */
    public void setSbjtNm(CertificateIssuer1 value) {
        this.sbjtNm = value;
    }

    /**
     * Gets the value of the sbjtPblcKeyInf property.
     * 
     * @return
     *     possible object is
     *     {@link PublicRSAKey2 }
     *     
     */
    public PublicRSAKey2 getSbjtPblcKeyInf() {
        return sbjtPblcKeyInf;
    }

    /**
     * Sets the value of the sbjtPblcKeyInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link PublicRSAKey2 }
     *     
     */
    public void setSbjtPblcKeyInf(PublicRSAKey2 value) {
        this.sbjtPblcKeyInf = value;
    }

    /**
     * Gets the value of the attr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the attr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAttr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RelativeDistinguishedName2 }
     * 
     * 
     * @return
     *     The value of the attr property.
     */
    public List<RelativeDistinguishedName2> getAttr() {
        if (attr == null) {
            attr = new ArrayList<>();
        }
        return this.attr;
    }

}
