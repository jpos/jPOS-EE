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

package org.jpos.iso20022.colr_021_001_01;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SecuritiesMovement7 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="SecuritiesMovement7">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="SctiesMvmntTp" type="{urn:iso:std:iso:20022:tech:xsd:colr.021.001.01}CollateralEntryType1Code"/>
 *         <element name="FinInstrmId" type="{urn:iso:std:iso:20022:tech:xsd:colr.021.001.01}SecurityIdentification19"/>
 *         <element name="Qty" type="{urn:iso:std:iso:20022:tech:xsd:colr.021.001.01}FinancialInstrumentQuantity33Choice"/>
 *         <element name="CollMvmnt" type="{urn:iso:std:iso:20022:tech:xsd:colr.021.001.01}YesNoIndicator"/>
 *         <element name="ClntSctiesMvmntId" type="{urn:iso:std:iso:20022:tech:xsd:colr.021.001.01}Max35Text" minOccurs="0"/>
 *         <element name="TrptyAgtSvcPrvdrSctiesMvmntId" type="{urn:iso:std:iso:20022:tech:xsd:colr.021.001.01}Max35Text" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecuritiesMovement7", propOrder = {
    "sctiesMvmntTp",
    "finInstrmId",
    "qty",
    "collMvmnt",
    "clntSctiesMvmntId",
    "trptyAgtSvcPrvdrSctiesMvmntId"
})
public class SecuritiesMovement7 {

    @XmlElement(name = "SctiesMvmntTp", required = true)
    @XmlSchemaType(name = "string")
    protected CollateralEntryType1Code sctiesMvmntTp;
    @XmlElement(name = "FinInstrmId", required = true)
    protected SecurityIdentification19 finInstrmId;
    @XmlElement(name = "Qty", required = true)
    protected FinancialInstrumentQuantity33Choice qty;
    @XmlElement(name = "CollMvmnt")
    protected boolean collMvmnt;
    @XmlElement(name = "ClntSctiesMvmntId")
    protected String clntSctiesMvmntId;
    @XmlElement(name = "TrptyAgtSvcPrvdrSctiesMvmntId")
    protected String trptyAgtSvcPrvdrSctiesMvmntId;

    /**
     * Gets the value of the sctiesMvmntTp property.
     * 
     * @return
     *     possible object is
     *     {@link CollateralEntryType1Code }
     *     
     */
    public CollateralEntryType1Code getSctiesMvmntTp() {
        return sctiesMvmntTp;
    }

    /**
     * Sets the value of the sctiesMvmntTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link CollateralEntryType1Code }
     *     
     */
    public void setSctiesMvmntTp(CollateralEntryType1Code value) {
        this.sctiesMvmntTp = value;
    }

    /**
     * Gets the value of the finInstrmId property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityIdentification19 }
     *     
     */
    public SecurityIdentification19 getFinInstrmId() {
        return finInstrmId;
    }

    /**
     * Sets the value of the finInstrmId property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityIdentification19 }
     *     
     */
    public void setFinInstrmId(SecurityIdentification19 value) {
        this.finInstrmId = value;
    }

    /**
     * Gets the value of the qty property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentQuantity33Choice }
     *     
     */
    public FinancialInstrumentQuantity33Choice getQty() {
        return qty;
    }

    /**
     * Sets the value of the qty property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentQuantity33Choice }
     *     
     */
    public void setQty(FinancialInstrumentQuantity33Choice value) {
        this.qty = value;
    }

    /**
     * Gets the value of the collMvmnt property.
     * 
     */
    public boolean isCollMvmnt() {
        return collMvmnt;
    }

    /**
     * Sets the value of the collMvmnt property.
     * 
     */
    public void setCollMvmnt(boolean value) {
        this.collMvmnt = value;
    }

    /**
     * Gets the value of the clntSctiesMvmntId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClntSctiesMvmntId() {
        return clntSctiesMvmntId;
    }

    /**
     * Sets the value of the clntSctiesMvmntId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClntSctiesMvmntId(String value) {
        this.clntSctiesMvmntId = value;
    }

    /**
     * Gets the value of the trptyAgtSvcPrvdrSctiesMvmntId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrptyAgtSvcPrvdrSctiesMvmntId() {
        return trptyAgtSvcPrvdrSctiesMvmntId;
    }

    /**
     * Sets the value of the trptyAgtSvcPrvdrSctiesMvmntId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrptyAgtSvcPrvdrSctiesMvmntId(String value) {
        this.trptyAgtSvcPrvdrSctiesMvmntId = value;
    }

}
