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
 * <p>Java class for TransferStatus5Choice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="TransferStatus5Choice">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="Sts" type="{urn:iso:std:iso:20022:tech:xsd:sese.011.001.09}TransferInstructionStatus5"/>
 *         <element name="PdgSttlm" type="{urn:iso:std:iso:20022:tech:xsd:sese.011.001.09}PendingSettlementStatus3Choice"/>
 *         <element name="Umtchd" type="{urn:iso:std:iso:20022:tech:xsd:sese.011.001.09}TransferUnmatchedStatus4Choice"/>
 *         <element name="InRpr" type="{urn:iso:std:iso:20022:tech:xsd:sese.011.001.09}InRepairStatus4Choice"/>
 *         <element name="Rjctd" type="{urn:iso:std:iso:20022:tech:xsd:sese.011.001.09}RejectionReason56" maxOccurs="10"/>
 *         <element name="FaildSttlm" type="{urn:iso:std:iso:20022:tech:xsd:sese.011.001.09}FailedSettlementStatus2Choice"/>
 *         <element name="Canc" type="{urn:iso:std:iso:20022:tech:xsd:sese.011.001.09}CancelledStatus13Choice"/>
 *         <element name="Rvsd" type="{urn:iso:std:iso:20022:tech:xsd:sese.011.001.09}ReversedStatus2Choice"/>
 *         <element name="CxlPdg" type="{urn:iso:std:iso:20022:tech:xsd:sese.011.001.09}CancellationPendingStatus7Choice"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransferStatus5Choice", propOrder = {
    "sts",
    "pdgSttlm",
    "umtchd",
    "inRpr",
    "rjctd",
    "faildSttlm",
    "canc",
    "rvsd",
    "cxlPdg"
})
public class TransferStatus5Choice {

    @XmlElement(name = "Sts")
    protected TransferInstructionStatus5 sts;
    @XmlElement(name = "PdgSttlm")
    protected PendingSettlementStatus3Choice pdgSttlm;
    @XmlElement(name = "Umtchd")
    protected TransferUnmatchedStatus4Choice umtchd;
    @XmlElement(name = "InRpr")
    protected InRepairStatus4Choice inRpr;
    @XmlElement(name = "Rjctd")
    protected List<RejectionReason56> rjctd;
    @XmlElement(name = "FaildSttlm")
    protected FailedSettlementStatus2Choice faildSttlm;
    @XmlElement(name = "Canc")
    protected CancelledStatus13Choice canc;
    @XmlElement(name = "Rvsd")
    protected ReversedStatus2Choice rvsd;
    @XmlElement(name = "CxlPdg")
    protected CancellationPendingStatus7Choice cxlPdg;

    /**
     * Gets the value of the sts property.
     * 
     * @return
     *     possible object is
     *     {@link TransferInstructionStatus5 }
     *     
     */
    public TransferInstructionStatus5 getSts() {
        return sts;
    }

    /**
     * Sets the value of the sts property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransferInstructionStatus5 }
     *     
     */
    public void setSts(TransferInstructionStatus5 value) {
        this.sts = value;
    }

    /**
     * Gets the value of the pdgSttlm property.
     * 
     * @return
     *     possible object is
     *     {@link PendingSettlementStatus3Choice }
     *     
     */
    public PendingSettlementStatus3Choice getPdgSttlm() {
        return pdgSttlm;
    }

    /**
     * Sets the value of the pdgSttlm property.
     * 
     * @param value
     *     allowed object is
     *     {@link PendingSettlementStatus3Choice }
     *     
     */
    public void setPdgSttlm(PendingSettlementStatus3Choice value) {
        this.pdgSttlm = value;
    }

    /**
     * Gets the value of the umtchd property.
     * 
     * @return
     *     possible object is
     *     {@link TransferUnmatchedStatus4Choice }
     *     
     */
    public TransferUnmatchedStatus4Choice getUmtchd() {
        return umtchd;
    }

    /**
     * Sets the value of the umtchd property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransferUnmatchedStatus4Choice }
     *     
     */
    public void setUmtchd(TransferUnmatchedStatus4Choice value) {
        this.umtchd = value;
    }

    /**
     * Gets the value of the inRpr property.
     * 
     * @return
     *     possible object is
     *     {@link InRepairStatus4Choice }
     *     
     */
    public InRepairStatus4Choice getInRpr() {
        return inRpr;
    }

    /**
     * Sets the value of the inRpr property.
     * 
     * @param value
     *     allowed object is
     *     {@link InRepairStatus4Choice }
     *     
     */
    public void setInRpr(InRepairStatus4Choice value) {
        this.inRpr = value;
    }

    /**
     * Gets the value of the rjctd property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the rjctd property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRjctd().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RejectionReason56 }
     * 
     * 
     * @return
     *     The value of the rjctd property.
     */
    public List<RejectionReason56> getRjctd() {
        if (rjctd == null) {
            rjctd = new ArrayList<>();
        }
        return this.rjctd;
    }

    /**
     * Gets the value of the faildSttlm property.
     * 
     * @return
     *     possible object is
     *     {@link FailedSettlementStatus2Choice }
     *     
     */
    public FailedSettlementStatus2Choice getFaildSttlm() {
        return faildSttlm;
    }

    /**
     * Sets the value of the faildSttlm property.
     * 
     * @param value
     *     allowed object is
     *     {@link FailedSettlementStatus2Choice }
     *     
     */
    public void setFaildSttlm(FailedSettlementStatus2Choice value) {
        this.faildSttlm = value;
    }

    /**
     * Gets the value of the canc property.
     * 
     * @return
     *     possible object is
     *     {@link CancelledStatus13Choice }
     *     
     */
    public CancelledStatus13Choice getCanc() {
        return canc;
    }

    /**
     * Sets the value of the canc property.
     * 
     * @param value
     *     allowed object is
     *     {@link CancelledStatus13Choice }
     *     
     */
    public void setCanc(CancelledStatus13Choice value) {
        this.canc = value;
    }

    /**
     * Gets the value of the rvsd property.
     * 
     * @return
     *     possible object is
     *     {@link ReversedStatus2Choice }
     *     
     */
    public ReversedStatus2Choice getRvsd() {
        return rvsd;
    }

    /**
     * Sets the value of the rvsd property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReversedStatus2Choice }
     *     
     */
    public void setRvsd(ReversedStatus2Choice value) {
        this.rvsd = value;
    }

    /**
     * Gets the value of the cxlPdg property.
     * 
     * @return
     *     possible object is
     *     {@link CancellationPendingStatus7Choice }
     *     
     */
    public CancellationPendingStatus7Choice getCxlPdg() {
        return cxlPdg;
    }

    /**
     * Sets the value of the cxlPdg property.
     * 
     * @param value
     *     allowed object is
     *     {@link CancellationPendingStatus7Choice }
     *     
     */
    public void setCxlPdg(CancellationPendingStatus7Choice value) {
        this.cxlPdg = value;
    }

}
