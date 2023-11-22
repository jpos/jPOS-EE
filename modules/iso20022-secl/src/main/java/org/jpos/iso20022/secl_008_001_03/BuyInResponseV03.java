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

package org.jpos.iso20022.secl_008_001_03;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BuyInResponseV03 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="BuyInResponseV03">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="TxId" type="{urn:iso:std:iso:20022:tech:xsd:secl.008.001.03}Max35Text" minOccurs="0"/>
 *         <element name="BuyInRspnDtls" type="{urn:iso:std:iso:20022:tech:xsd:secl.008.001.03}BuyIn3"/>
 *         <element name="OrgnlSttlmOblgtnDtls" type="{urn:iso:std:iso:20022:tech:xsd:secl.008.001.03}SettlementObligation7" minOccurs="0"/>
 *         <element name="SplmtryData" type="{urn:iso:std:iso:20022:tech:xsd:secl.008.001.03}SupplementaryData1" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BuyInResponseV03", propOrder = {
    "txId",
    "buyInRspnDtls",
    "orgnlSttlmOblgtnDtls",
    "splmtryData"
})
public class BuyInResponseV03 {

    @XmlElement(name = "TxId")
    protected String txId;
    @XmlElement(name = "BuyInRspnDtls", required = true)
    protected BuyIn3 buyInRspnDtls;
    @XmlElement(name = "OrgnlSttlmOblgtnDtls")
    protected SettlementObligation7 orgnlSttlmOblgtnDtls;
    @XmlElement(name = "SplmtryData")
    protected List<SupplementaryData1> splmtryData;

    /**
     * Gets the value of the txId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTxId() {
        return txId;
    }

    /**
     * Sets the value of the txId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTxId(String value) {
        this.txId = value;
    }

    /**
     * Gets the value of the buyInRspnDtls property.
     * 
     * @return
     *     possible object is
     *     {@link BuyIn3 }
     *     
     */
    public BuyIn3 getBuyInRspnDtls() {
        return buyInRspnDtls;
    }

    /**
     * Sets the value of the buyInRspnDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link BuyIn3 }
     *     
     */
    public void setBuyInRspnDtls(BuyIn3 value) {
        this.buyInRspnDtls = value;
    }

    /**
     * Gets the value of the orgnlSttlmOblgtnDtls property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementObligation7 }
     *     
     */
    public SettlementObligation7 getOrgnlSttlmOblgtnDtls() {
        return orgnlSttlmOblgtnDtls;
    }

    /**
     * Sets the value of the orgnlSttlmOblgtnDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementObligation7 }
     *     
     */
    public void setOrgnlSttlmOblgtnDtls(SettlementObligation7 value) {
        this.orgnlSttlmOblgtnDtls = value;
    }

    /**
     * Gets the value of the splmtryData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the splmtryData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSplmtryData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SupplementaryData1 }
     * 
     * 
     * @return
     *     The value of the splmtryData property.
     */
    public List<SupplementaryData1> getSplmtryData() {
        if (splmtryData == null) {
            splmtryData = new ArrayList<>();
        }
        return this.splmtryData;
    }

}
