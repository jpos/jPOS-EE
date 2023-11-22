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

package org.jpos.iso20022.seev_036_002_14;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CorporateAction75 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="CorporateAction75">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="DtDtls" type="{urn:iso:std:iso:20022:tech:xsd:seev.036.002.14}CorporateActionDate89" minOccurs="0"/>
 *         <element name="EvtStag" type="{urn:iso:std:iso:20022:tech:xsd:seev.036.002.14}CorporateActionEventStageFormat15Choice" minOccurs="0"/>
 *         <element name="AddtlBizPrcInd" type="{urn:iso:std:iso:20022:tech:xsd:seev.036.002.14}AdditionalBusinessProcessFormat20Choice" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="IntrmdtSctiesDstrbtnTp" type="{urn:iso:std:iso:20022:tech:xsd:seev.036.002.14}IntermediateSecuritiesDistributionTypeFormat18Choice" minOccurs="0"/>
 *         <element name="LtryTp" type="{urn:iso:std:iso:20022:tech:xsd:seev.036.002.14}LotteryTypeFormat5Choice" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CorporateAction75", propOrder = {
    "dtDtls",
    "evtStag",
    "addtlBizPrcInd",
    "intrmdtSctiesDstrbtnTp",
    "ltryTp"
})
public class CorporateAction75 {

    @XmlElement(name = "DtDtls")
    protected CorporateActionDate89 dtDtls;
    @XmlElement(name = "EvtStag")
    protected CorporateActionEventStageFormat15Choice evtStag;
    @XmlElement(name = "AddtlBizPrcInd")
    protected List<AdditionalBusinessProcessFormat20Choice> addtlBizPrcInd;
    @XmlElement(name = "IntrmdtSctiesDstrbtnTp")
    protected IntermediateSecuritiesDistributionTypeFormat18Choice intrmdtSctiesDstrbtnTp;
    @XmlElement(name = "LtryTp")
    protected LotteryTypeFormat5Choice ltryTp;

    /**
     * Gets the value of the dtDtls property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionDate89 }
     *     
     */
    public CorporateActionDate89 getDtDtls() {
        return dtDtls;
    }

    /**
     * Sets the value of the dtDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionDate89 }
     *     
     */
    public void setDtDtls(CorporateActionDate89 value) {
        this.dtDtls = value;
    }

    /**
     * Gets the value of the evtStag property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionEventStageFormat15Choice }
     *     
     */
    public CorporateActionEventStageFormat15Choice getEvtStag() {
        return evtStag;
    }

    /**
     * Sets the value of the evtStag property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionEventStageFormat15Choice }
     *     
     */
    public void setEvtStag(CorporateActionEventStageFormat15Choice value) {
        this.evtStag = value;
    }

    /**
     * Gets the value of the addtlBizPrcInd property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the addtlBizPrcInd property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddtlBizPrcInd().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdditionalBusinessProcessFormat20Choice }
     * 
     * 
     * @return
     *     The value of the addtlBizPrcInd property.
     */
    public List<AdditionalBusinessProcessFormat20Choice> getAddtlBizPrcInd() {
        if (addtlBizPrcInd == null) {
            addtlBizPrcInd = new ArrayList<>();
        }
        return this.addtlBizPrcInd;
    }

    /**
     * Gets the value of the intrmdtSctiesDstrbtnTp property.
     * 
     * @return
     *     possible object is
     *     {@link IntermediateSecuritiesDistributionTypeFormat18Choice }
     *     
     */
    public IntermediateSecuritiesDistributionTypeFormat18Choice getIntrmdtSctiesDstrbtnTp() {
        return intrmdtSctiesDstrbtnTp;
    }

    /**
     * Sets the value of the intrmdtSctiesDstrbtnTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntermediateSecuritiesDistributionTypeFormat18Choice }
     *     
     */
    public void setIntrmdtSctiesDstrbtnTp(IntermediateSecuritiesDistributionTypeFormat18Choice value) {
        this.intrmdtSctiesDstrbtnTp = value;
    }

    /**
     * Gets the value of the ltryTp property.
     * 
     * @return
     *     possible object is
     *     {@link LotteryTypeFormat5Choice }
     *     
     */
    public LotteryTypeFormat5Choice getLtryTp() {
        return ltryTp;
    }

    /**
     * Sets the value of the ltryTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link LotteryTypeFormat5Choice }
     *     
     */
    public void setLtryTp(LotteryTypeFormat5Choice value) {
        this.ltryTp = value;
    }

}
