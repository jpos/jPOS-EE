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

package org.jpos.iso20022.setr_013_001_04;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SwitchOrderV04 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="SwitchOrderV04">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="MsgId" type="{urn:iso:std:iso:20022:tech:xsd:setr.013.001.04}MessageIdentification1"/>
 *         <element name="PoolRef" type="{urn:iso:std:iso:20022:tech:xsd:setr.013.001.04}AdditionalReference9" minOccurs="0"/>
 *         <element name="PrvsRef" type="{urn:iso:std:iso:20022:tech:xsd:setr.013.001.04}AdditionalReference8" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="MsgPgntn" type="{urn:iso:std:iso:20022:tech:xsd:setr.013.001.04}Pagination" minOccurs="0"/>
 *         <element name="SwtchOrdrDtls" type="{urn:iso:std:iso:20022:tech:xsd:setr.013.001.04}SwitchOrder7" maxOccurs="unbounded"/>
 *         <element name="CpyDtls" type="{urn:iso:std:iso:20022:tech:xsd:setr.013.001.04}CopyInformation4" minOccurs="0"/>
 *         <element name="Xtnsn" type="{urn:iso:std:iso:20022:tech:xsd:setr.013.001.04}Extension1" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SwitchOrderV04", propOrder = {
    "msgId",
    "poolRef",
    "prvsRef",
    "msgPgntn",
    "swtchOrdrDtls",
    "cpyDtls",
    "xtnsn"
})
public class SwitchOrderV04 {

    @XmlElement(name = "MsgId", required = true)
    protected MessageIdentification1 msgId;
    @XmlElement(name = "PoolRef")
    protected AdditionalReference9 poolRef;
    @XmlElement(name = "PrvsRef")
    protected List<AdditionalReference8> prvsRef;
    @XmlElement(name = "MsgPgntn")
    protected Pagination msgPgntn;
    @XmlElement(name = "SwtchOrdrDtls", required = true)
    protected List<SwitchOrder7> swtchOrdrDtls;
    @XmlElement(name = "CpyDtls")
    protected CopyInformation4 cpyDtls;
    @XmlElement(name = "Xtnsn")
    protected List<Extension1> xtnsn;

    /**
     * Gets the value of the msgId property.
     * 
     * @return
     *     possible object is
     *     {@link MessageIdentification1 }
     *     
     */
    public MessageIdentification1 getMsgId() {
        return msgId;
    }

    /**
     * Sets the value of the msgId property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageIdentification1 }
     *     
     */
    public void setMsgId(MessageIdentification1 value) {
        this.msgId = value;
    }

    /**
     * Gets the value of the poolRef property.
     * 
     * @return
     *     possible object is
     *     {@link AdditionalReference9 }
     *     
     */
    public AdditionalReference9 getPoolRef() {
        return poolRef;
    }

    /**
     * Sets the value of the poolRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdditionalReference9 }
     *     
     */
    public void setPoolRef(AdditionalReference9 value) {
        this.poolRef = value;
    }

    /**
     * Gets the value of the prvsRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the prvsRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPrvsRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdditionalReference8 }
     * 
     * 
     * @return
     *     The value of the prvsRef property.
     */
    public List<AdditionalReference8> getPrvsRef() {
        if (prvsRef == null) {
            prvsRef = new ArrayList<>();
        }
        return this.prvsRef;
    }

    /**
     * Gets the value of the msgPgntn property.
     * 
     * @return
     *     possible object is
     *     {@link Pagination }
     *     
     */
    public Pagination getMsgPgntn() {
        return msgPgntn;
    }

    /**
     * Sets the value of the msgPgntn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Pagination }
     *     
     */
    public void setMsgPgntn(Pagination value) {
        this.msgPgntn = value;
    }

    /**
     * Gets the value of the swtchOrdrDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the swtchOrdrDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSwtchOrdrDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SwitchOrder7 }
     * 
     * 
     * @return
     *     The value of the swtchOrdrDtls property.
     */
    public List<SwitchOrder7> getSwtchOrdrDtls() {
        if (swtchOrdrDtls == null) {
            swtchOrdrDtls = new ArrayList<>();
        }
        return this.swtchOrdrDtls;
    }

    /**
     * Gets the value of the cpyDtls property.
     * 
     * @return
     *     possible object is
     *     {@link CopyInformation4 }
     *     
     */
    public CopyInformation4 getCpyDtls() {
        return cpyDtls;
    }

    /**
     * Sets the value of the cpyDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link CopyInformation4 }
     *     
     */
    public void setCpyDtls(CopyInformation4 value) {
        this.cpyDtls = value;
    }

    /**
     * Gets the value of the xtnsn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the xtnsn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getXtnsn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Extension1 }
     * 
     * 
     * @return
     *     The value of the xtnsn property.
     */
    public List<Extension1> getXtnsn() {
        if (xtnsn == null) {
            xtnsn = new ArrayList<>();
        }
        return this.xtnsn;
    }

}
