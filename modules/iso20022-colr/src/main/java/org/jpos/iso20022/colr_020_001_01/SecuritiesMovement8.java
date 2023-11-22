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

package org.jpos.iso20022.colr_020_001_01;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SecuritiesMovement8 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="SecuritiesMovement8">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="SctiesMvmntTp" type="{urn:iso:std:iso:20022:tech:xsd:colr.020.001.01}ReceiveDelivery1Code"/>
 *         <element name="FinInstrmId" type="{urn:iso:std:iso:20022:tech:xsd:colr.020.001.01}SecurityIdentification19"/>
 *         <element name="SctiesQty" type="{urn:iso:std:iso:20022:tech:xsd:colr.020.001.01}Quantity51Choice"/>
 *         <element name="MvmntSts" type="{urn:iso:std:iso:20022:tech:xsd:colr.020.001.01}SecuritiesMovementStatus1Choice" minOccurs="0"/>
 *         <element name="CollMvmnt" type="{urn:iso:std:iso:20022:tech:xsd:colr.020.001.01}YesNoIndicator"/>
 *         <element name="SctiesMvmntsApprvd" type="{urn:iso:std:iso:20022:tech:xsd:colr.020.001.01}YesNoIndicator" minOccurs="0"/>
 *         <element name="PosTp" type="{urn:iso:std:iso:20022:tech:xsd:colr.020.001.01}YesNoIndicator" minOccurs="0"/>
 *         <element name="SfkpgAcct" type="{urn:iso:std:iso:20022:tech:xsd:colr.020.001.01}SecuritiesAccount19" minOccurs="0"/>
 *         <element name="BlckChainAdrOrWllt" type="{urn:iso:std:iso:20022:tech:xsd:colr.020.001.01}BlockChainAddressWallet3" minOccurs="0"/>
 *         <element name="ClntSctiesMvmntId" type="{urn:iso:std:iso:20022:tech:xsd:colr.020.001.01}Max35Text" minOccurs="0"/>
 *         <element name="TrptyAgtSvcPrvdrSctiesMvmntId" type="{urn:iso:std:iso:20022:tech:xsd:colr.020.001.01}Max35Text" minOccurs="0"/>
 *         <element name="MrgndVal" type="{urn:iso:std:iso:20022:tech:xsd:colr.020.001.01}AmountAndDirection44" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecuritiesMovement8", propOrder = {
    "sctiesMvmntTp",
    "finInstrmId",
    "sctiesQty",
    "mvmntSts",
    "collMvmnt",
    "sctiesMvmntsApprvd",
    "posTp",
    "sfkpgAcct",
    "blckChainAdrOrWllt",
    "clntSctiesMvmntId",
    "trptyAgtSvcPrvdrSctiesMvmntId",
    "mrgndVal"
})
public class SecuritiesMovement8 {

    @XmlElement(name = "SctiesMvmntTp", required = true)
    @XmlSchemaType(name = "string")
    protected ReceiveDelivery1Code sctiesMvmntTp;
    @XmlElement(name = "FinInstrmId", required = true)
    protected SecurityIdentification19 finInstrmId;
    @XmlElement(name = "SctiesQty", required = true)
    protected Quantity51Choice sctiesQty;
    @XmlElement(name = "MvmntSts")
    protected SecuritiesMovementStatus1Choice mvmntSts;
    @XmlElement(name = "CollMvmnt")
    protected boolean collMvmnt;
    @XmlElement(name = "SctiesMvmntsApprvd")
    protected Boolean sctiesMvmntsApprvd;
    @XmlElement(name = "PosTp")
    protected Boolean posTp;
    @XmlElement(name = "SfkpgAcct")
    protected SecuritiesAccount19 sfkpgAcct;
    @XmlElement(name = "BlckChainAdrOrWllt")
    protected BlockChainAddressWallet3 blckChainAdrOrWllt;
    @XmlElement(name = "ClntSctiesMvmntId")
    protected String clntSctiesMvmntId;
    @XmlElement(name = "TrptyAgtSvcPrvdrSctiesMvmntId")
    protected String trptyAgtSvcPrvdrSctiesMvmntId;
    @XmlElement(name = "MrgndVal")
    protected AmountAndDirection44 mrgndVal;

    /**
     * Gets the value of the sctiesMvmntTp property.
     * 
     * @return
     *     possible object is
     *     {@link ReceiveDelivery1Code }
     *     
     */
    public ReceiveDelivery1Code getSctiesMvmntTp() {
        return sctiesMvmntTp;
    }

    /**
     * Sets the value of the sctiesMvmntTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReceiveDelivery1Code }
     *     
     */
    public void setSctiesMvmntTp(ReceiveDelivery1Code value) {
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
     * Gets the value of the sctiesQty property.
     * 
     * @return
     *     possible object is
     *     {@link Quantity51Choice }
     *     
     */
    public Quantity51Choice getSctiesQty() {
        return sctiesQty;
    }

    /**
     * Sets the value of the sctiesQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link Quantity51Choice }
     *     
     */
    public void setSctiesQty(Quantity51Choice value) {
        this.sctiesQty = value;
    }

    /**
     * Gets the value of the mvmntSts property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesMovementStatus1Choice }
     *     
     */
    public SecuritiesMovementStatus1Choice getMvmntSts() {
        return mvmntSts;
    }

    /**
     * Sets the value of the mvmntSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesMovementStatus1Choice }
     *     
     */
    public void setMvmntSts(SecuritiesMovementStatus1Choice value) {
        this.mvmntSts = value;
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
     * Gets the value of the sctiesMvmntsApprvd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSctiesMvmntsApprvd() {
        return sctiesMvmntsApprvd;
    }

    /**
     * Sets the value of the sctiesMvmntsApprvd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSctiesMvmntsApprvd(Boolean value) {
        this.sctiesMvmntsApprvd = value;
    }

    /**
     * Gets the value of the posTp property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPosTp() {
        return posTp;
    }

    /**
     * Sets the value of the posTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPosTp(Boolean value) {
        this.posTp = value;
    }

    /**
     * Gets the value of the sfkpgAcct property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesAccount19 }
     *     
     */
    public SecuritiesAccount19 getSfkpgAcct() {
        return sfkpgAcct;
    }

    /**
     * Sets the value of the sfkpgAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesAccount19 }
     *     
     */
    public void setSfkpgAcct(SecuritiesAccount19 value) {
        this.sfkpgAcct = value;
    }

    /**
     * Gets the value of the blckChainAdrOrWllt property.
     * 
     * @return
     *     possible object is
     *     {@link BlockChainAddressWallet3 }
     *     
     */
    public BlockChainAddressWallet3 getBlckChainAdrOrWllt() {
        return blckChainAdrOrWllt;
    }

    /**
     * Sets the value of the blckChainAdrOrWllt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BlockChainAddressWallet3 }
     *     
     */
    public void setBlckChainAdrOrWllt(BlockChainAddressWallet3 value) {
        this.blckChainAdrOrWllt = value;
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

    /**
     * Gets the value of the mrgndVal property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection44 }
     *     
     */
    public AmountAndDirection44 getMrgndVal() {
        return mrgndVal;
    }

    /**
     * Sets the value of the mrgndVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection44 }
     *     
     */
    public void setMrgndVal(AmountAndDirection44 value) {
        this.mrgndVal = value;
    }

}
