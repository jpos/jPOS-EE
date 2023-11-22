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

package org.jpos.iso20022.semt_021_002_08;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Reason20Choice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="Reason20Choice">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="RepoCallAckRsn" type="{urn:iso:std:iso:20022:tech:xsd:semt.021.002.08}AcknowledgementReason18Choice" minOccurs="0"/>
 *         <element name="CxlRsn" type="{urn:iso:std:iso:20022:tech:xsd:semt.021.002.08}CancellationReason30Choice" minOccurs="0"/>
 *         <element name="PdgCxlRsn" type="{urn:iso:std:iso:20022:tech:xsd:semt.021.002.08}PendingCancellationReasons5Choice" minOccurs="0"/>
 *         <element name="GnrtdRsn" type="{urn:iso:std:iso:20022:tech:xsd:semt.021.002.08}GeneratedReasons6Choice" minOccurs="0"/>
 *         <element name="DndRsn" type="{urn:iso:std:iso:20022:tech:xsd:semt.021.002.08}DeniedReason23Choice" minOccurs="0"/>
 *         <element name="AckdAccptdRsn" type="{urn:iso:std:iso:20022:tech:xsd:semt.021.002.08}AcknowledgementReason16Choice" minOccurs="0"/>
 *         <element name="PdgRsn" type="{urn:iso:std:iso:20022:tech:xsd:semt.021.002.08}PendingReason47Choice" minOccurs="0"/>
 *         <element name="FlngRsn" type="{urn:iso:std:iso:20022:tech:xsd:semt.021.002.08}FailingReason15Choice" minOccurs="0"/>
 *         <element name="PdgPrcgRsn" type="{urn:iso:std:iso:20022:tech:xsd:semt.021.002.08}PendingProcessingReason13Choice" minOccurs="0"/>
 *         <element name="RjctnRsn" type="{urn:iso:std:iso:20022:tech:xsd:semt.021.002.08}RejectionReason51Choice" minOccurs="0"/>
 *         <element name="RprRsn" type="{urn:iso:std:iso:20022:tech:xsd:semt.021.002.08}RepairReason18Choice" minOccurs="0"/>
 *         <element name="PdgModRsn" type="{urn:iso:std:iso:20022:tech:xsd:semt.021.002.08}PendingReason37Choice" minOccurs="0"/>
 *         <element name="UmtchdRsn" type="{urn:iso:std:iso:20022:tech:xsd:semt.021.002.08}UnmatchedReason29Choice" minOccurs="0"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Reason20Choice", propOrder = {
    "repoCallAckRsn",
    "cxlRsn",
    "pdgCxlRsn",
    "gnrtdRsn",
    "dndRsn",
    "ackdAccptdRsn",
    "pdgRsn",
    "flngRsn",
    "pdgPrcgRsn",
    "rjctnRsn",
    "rprRsn",
    "pdgModRsn",
    "umtchdRsn"
})
public class Reason20Choice {

    @XmlElement(name = "RepoCallAckRsn")
    protected AcknowledgementReason18Choice repoCallAckRsn;
    @XmlElement(name = "CxlRsn")
    protected CancellationReason30Choice cxlRsn;
    @XmlElement(name = "PdgCxlRsn")
    protected PendingCancellationReasons5Choice pdgCxlRsn;
    @XmlElement(name = "GnrtdRsn")
    protected GeneratedReasons6Choice gnrtdRsn;
    @XmlElement(name = "DndRsn")
    protected DeniedReason23Choice dndRsn;
    @XmlElement(name = "AckdAccptdRsn")
    protected AcknowledgementReason16Choice ackdAccptdRsn;
    @XmlElement(name = "PdgRsn")
    protected PendingReason47Choice pdgRsn;
    @XmlElement(name = "FlngRsn")
    protected FailingReason15Choice flngRsn;
    @XmlElement(name = "PdgPrcgRsn")
    protected PendingProcessingReason13Choice pdgPrcgRsn;
    @XmlElement(name = "RjctnRsn")
    protected RejectionReason51Choice rjctnRsn;
    @XmlElement(name = "RprRsn")
    protected RepairReason18Choice rprRsn;
    @XmlElement(name = "PdgModRsn")
    protected PendingReason37Choice pdgModRsn;
    @XmlElement(name = "UmtchdRsn")
    protected UnmatchedReason29Choice umtchdRsn;

    /**
     * Gets the value of the repoCallAckRsn property.
     * 
     * @return
     *     possible object is
     *     {@link AcknowledgementReason18Choice }
     *     
     */
    public AcknowledgementReason18Choice getRepoCallAckRsn() {
        return repoCallAckRsn;
    }

    /**
     * Sets the value of the repoCallAckRsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcknowledgementReason18Choice }
     *     
     */
    public void setRepoCallAckRsn(AcknowledgementReason18Choice value) {
        this.repoCallAckRsn = value;
    }

    /**
     * Gets the value of the cxlRsn property.
     * 
     * @return
     *     possible object is
     *     {@link CancellationReason30Choice }
     *     
     */
    public CancellationReason30Choice getCxlRsn() {
        return cxlRsn;
    }

    /**
     * Sets the value of the cxlRsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link CancellationReason30Choice }
     *     
     */
    public void setCxlRsn(CancellationReason30Choice value) {
        this.cxlRsn = value;
    }

    /**
     * Gets the value of the pdgCxlRsn property.
     * 
     * @return
     *     possible object is
     *     {@link PendingCancellationReasons5Choice }
     *     
     */
    public PendingCancellationReasons5Choice getPdgCxlRsn() {
        return pdgCxlRsn;
    }

    /**
     * Sets the value of the pdgCxlRsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link PendingCancellationReasons5Choice }
     *     
     */
    public void setPdgCxlRsn(PendingCancellationReasons5Choice value) {
        this.pdgCxlRsn = value;
    }

    /**
     * Gets the value of the gnrtdRsn property.
     * 
     * @return
     *     possible object is
     *     {@link GeneratedReasons6Choice }
     *     
     */
    public GeneratedReasons6Choice getGnrtdRsn() {
        return gnrtdRsn;
    }

    /**
     * Sets the value of the gnrtdRsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link GeneratedReasons6Choice }
     *     
     */
    public void setGnrtdRsn(GeneratedReasons6Choice value) {
        this.gnrtdRsn = value;
    }

    /**
     * Gets the value of the dndRsn property.
     * 
     * @return
     *     possible object is
     *     {@link DeniedReason23Choice }
     *     
     */
    public DeniedReason23Choice getDndRsn() {
        return dndRsn;
    }

    /**
     * Sets the value of the dndRsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeniedReason23Choice }
     *     
     */
    public void setDndRsn(DeniedReason23Choice value) {
        this.dndRsn = value;
    }

    /**
     * Gets the value of the ackdAccptdRsn property.
     * 
     * @return
     *     possible object is
     *     {@link AcknowledgementReason16Choice }
     *     
     */
    public AcknowledgementReason16Choice getAckdAccptdRsn() {
        return ackdAccptdRsn;
    }

    /**
     * Sets the value of the ackdAccptdRsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcknowledgementReason16Choice }
     *     
     */
    public void setAckdAccptdRsn(AcknowledgementReason16Choice value) {
        this.ackdAccptdRsn = value;
    }

    /**
     * Gets the value of the pdgRsn property.
     * 
     * @return
     *     possible object is
     *     {@link PendingReason47Choice }
     *     
     */
    public PendingReason47Choice getPdgRsn() {
        return pdgRsn;
    }

    /**
     * Sets the value of the pdgRsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link PendingReason47Choice }
     *     
     */
    public void setPdgRsn(PendingReason47Choice value) {
        this.pdgRsn = value;
    }

    /**
     * Gets the value of the flngRsn property.
     * 
     * @return
     *     possible object is
     *     {@link FailingReason15Choice }
     *     
     */
    public FailingReason15Choice getFlngRsn() {
        return flngRsn;
    }

    /**
     * Sets the value of the flngRsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link FailingReason15Choice }
     *     
     */
    public void setFlngRsn(FailingReason15Choice value) {
        this.flngRsn = value;
    }

    /**
     * Gets the value of the pdgPrcgRsn property.
     * 
     * @return
     *     possible object is
     *     {@link PendingProcessingReason13Choice }
     *     
     */
    public PendingProcessingReason13Choice getPdgPrcgRsn() {
        return pdgPrcgRsn;
    }

    /**
     * Sets the value of the pdgPrcgRsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link PendingProcessingReason13Choice }
     *     
     */
    public void setPdgPrcgRsn(PendingProcessingReason13Choice value) {
        this.pdgPrcgRsn = value;
    }

    /**
     * Gets the value of the rjctnRsn property.
     * 
     * @return
     *     possible object is
     *     {@link RejectionReason51Choice }
     *     
     */
    public RejectionReason51Choice getRjctnRsn() {
        return rjctnRsn;
    }

    /**
     * Sets the value of the rjctnRsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link RejectionReason51Choice }
     *     
     */
    public void setRjctnRsn(RejectionReason51Choice value) {
        this.rjctnRsn = value;
    }

    /**
     * Gets the value of the rprRsn property.
     * 
     * @return
     *     possible object is
     *     {@link RepairReason18Choice }
     *     
     */
    public RepairReason18Choice getRprRsn() {
        return rprRsn;
    }

    /**
     * Sets the value of the rprRsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link RepairReason18Choice }
     *     
     */
    public void setRprRsn(RepairReason18Choice value) {
        this.rprRsn = value;
    }

    /**
     * Gets the value of the pdgModRsn property.
     * 
     * @return
     *     possible object is
     *     {@link PendingReason37Choice }
     *     
     */
    public PendingReason37Choice getPdgModRsn() {
        return pdgModRsn;
    }

    /**
     * Sets the value of the pdgModRsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link PendingReason37Choice }
     *     
     */
    public void setPdgModRsn(PendingReason37Choice value) {
        this.pdgModRsn = value;
    }

    /**
     * Gets the value of the umtchdRsn property.
     * 
     * @return
     *     possible object is
     *     {@link UnmatchedReason29Choice }
     *     
     */
    public UnmatchedReason29Choice getUmtchdRsn() {
        return umtchdRsn;
    }

    /**
     * Sets the value of the umtchdRsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnmatchedReason29Choice }
     *     
     */
    public void setUmtchdRsn(UnmatchedReason29Choice value) {
        this.umtchdRsn = value;
    }

}
