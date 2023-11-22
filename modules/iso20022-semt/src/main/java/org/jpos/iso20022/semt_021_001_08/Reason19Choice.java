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

package org.jpos.iso20022.semt_021_001_08;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Reason19Choice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="Reason19Choice">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="RepoCallAckRsn" type="{urn:iso:std:iso:20022:tech:xsd:semt.021.001.08}AcknowledgementReason13Choice" minOccurs="0"/>
 *         <element name="CxlRsn" type="{urn:iso:std:iso:20022:tech:xsd:semt.021.001.08}CancellationReason20Choice" minOccurs="0"/>
 *         <element name="PdgCxlRsn" type="{urn:iso:std:iso:20022:tech:xsd:semt.021.001.08}PendingCancellationReasons4Choice" minOccurs="0"/>
 *         <element name="GnrtdRsn" type="{urn:iso:std:iso:20022:tech:xsd:semt.021.001.08}GeneratedReasons5Choice" minOccurs="0"/>
 *         <element name="DndRsn" type="{urn:iso:std:iso:20022:tech:xsd:semt.021.001.08}DeniedReason14Choice" minOccurs="0"/>
 *         <element name="AckdAccptdRsn" type="{urn:iso:std:iso:20022:tech:xsd:semt.021.001.08}AcknowledgementReason12Choice" minOccurs="0"/>
 *         <element name="PdgRsn" type="{urn:iso:std:iso:20022:tech:xsd:semt.021.001.08}PendingReason29Choice" minOccurs="0"/>
 *         <element name="FlngRsn" type="{urn:iso:std:iso:20022:tech:xsd:semt.021.001.08}FailingReason9Choice" minOccurs="0"/>
 *         <element name="PdgPrcgRsn" type="{urn:iso:std:iso:20022:tech:xsd:semt.021.001.08}PendingProcessingReason11Choice" minOccurs="0"/>
 *         <element name="RjctnRsn" type="{urn:iso:std:iso:20022:tech:xsd:semt.021.001.08}RejectionReason45Choice" minOccurs="0"/>
 *         <element name="RprRsn" type="{urn:iso:std:iso:20022:tech:xsd:semt.021.001.08}RepairReason11Choice" minOccurs="0"/>
 *         <element name="PdgModRsn" type="{urn:iso:std:iso:20022:tech:xsd:semt.021.001.08}PendingReason28Choice" minOccurs="0"/>
 *         <element name="UmtchdRsn" type="{urn:iso:std:iso:20022:tech:xsd:semt.021.001.08}UnmatchedReason22Choice" minOccurs="0"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Reason19Choice", propOrder = {
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
public class Reason19Choice {

    @XmlElement(name = "RepoCallAckRsn")
    protected AcknowledgementReason13Choice repoCallAckRsn;
    @XmlElement(name = "CxlRsn")
    protected CancellationReason20Choice cxlRsn;
    @XmlElement(name = "PdgCxlRsn")
    protected PendingCancellationReasons4Choice pdgCxlRsn;
    @XmlElement(name = "GnrtdRsn")
    protected GeneratedReasons5Choice gnrtdRsn;
    @XmlElement(name = "DndRsn")
    protected DeniedReason14Choice dndRsn;
    @XmlElement(name = "AckdAccptdRsn")
    protected AcknowledgementReason12Choice ackdAccptdRsn;
    @XmlElement(name = "PdgRsn")
    protected PendingReason29Choice pdgRsn;
    @XmlElement(name = "FlngRsn")
    protected FailingReason9Choice flngRsn;
    @XmlElement(name = "PdgPrcgRsn")
    protected PendingProcessingReason11Choice pdgPrcgRsn;
    @XmlElement(name = "RjctnRsn")
    protected RejectionReason45Choice rjctnRsn;
    @XmlElement(name = "RprRsn")
    protected RepairReason11Choice rprRsn;
    @XmlElement(name = "PdgModRsn")
    protected PendingReason28Choice pdgModRsn;
    @XmlElement(name = "UmtchdRsn")
    protected UnmatchedReason22Choice umtchdRsn;

    /**
     * Gets the value of the repoCallAckRsn property.
     * 
     * @return
     *     possible object is
     *     {@link AcknowledgementReason13Choice }
     *     
     */
    public AcknowledgementReason13Choice getRepoCallAckRsn() {
        return repoCallAckRsn;
    }

    /**
     * Sets the value of the repoCallAckRsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcknowledgementReason13Choice }
     *     
     */
    public void setRepoCallAckRsn(AcknowledgementReason13Choice value) {
        this.repoCallAckRsn = value;
    }

    /**
     * Gets the value of the cxlRsn property.
     * 
     * @return
     *     possible object is
     *     {@link CancellationReason20Choice }
     *     
     */
    public CancellationReason20Choice getCxlRsn() {
        return cxlRsn;
    }

    /**
     * Sets the value of the cxlRsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link CancellationReason20Choice }
     *     
     */
    public void setCxlRsn(CancellationReason20Choice value) {
        this.cxlRsn = value;
    }

    /**
     * Gets the value of the pdgCxlRsn property.
     * 
     * @return
     *     possible object is
     *     {@link PendingCancellationReasons4Choice }
     *     
     */
    public PendingCancellationReasons4Choice getPdgCxlRsn() {
        return pdgCxlRsn;
    }

    /**
     * Sets the value of the pdgCxlRsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link PendingCancellationReasons4Choice }
     *     
     */
    public void setPdgCxlRsn(PendingCancellationReasons4Choice value) {
        this.pdgCxlRsn = value;
    }

    /**
     * Gets the value of the gnrtdRsn property.
     * 
     * @return
     *     possible object is
     *     {@link GeneratedReasons5Choice }
     *     
     */
    public GeneratedReasons5Choice getGnrtdRsn() {
        return gnrtdRsn;
    }

    /**
     * Sets the value of the gnrtdRsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link GeneratedReasons5Choice }
     *     
     */
    public void setGnrtdRsn(GeneratedReasons5Choice value) {
        this.gnrtdRsn = value;
    }

    /**
     * Gets the value of the dndRsn property.
     * 
     * @return
     *     possible object is
     *     {@link DeniedReason14Choice }
     *     
     */
    public DeniedReason14Choice getDndRsn() {
        return dndRsn;
    }

    /**
     * Sets the value of the dndRsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeniedReason14Choice }
     *     
     */
    public void setDndRsn(DeniedReason14Choice value) {
        this.dndRsn = value;
    }

    /**
     * Gets the value of the ackdAccptdRsn property.
     * 
     * @return
     *     possible object is
     *     {@link AcknowledgementReason12Choice }
     *     
     */
    public AcknowledgementReason12Choice getAckdAccptdRsn() {
        return ackdAccptdRsn;
    }

    /**
     * Sets the value of the ackdAccptdRsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcknowledgementReason12Choice }
     *     
     */
    public void setAckdAccptdRsn(AcknowledgementReason12Choice value) {
        this.ackdAccptdRsn = value;
    }

    /**
     * Gets the value of the pdgRsn property.
     * 
     * @return
     *     possible object is
     *     {@link PendingReason29Choice }
     *     
     */
    public PendingReason29Choice getPdgRsn() {
        return pdgRsn;
    }

    /**
     * Sets the value of the pdgRsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link PendingReason29Choice }
     *     
     */
    public void setPdgRsn(PendingReason29Choice value) {
        this.pdgRsn = value;
    }

    /**
     * Gets the value of the flngRsn property.
     * 
     * @return
     *     possible object is
     *     {@link FailingReason9Choice }
     *     
     */
    public FailingReason9Choice getFlngRsn() {
        return flngRsn;
    }

    /**
     * Sets the value of the flngRsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link FailingReason9Choice }
     *     
     */
    public void setFlngRsn(FailingReason9Choice value) {
        this.flngRsn = value;
    }

    /**
     * Gets the value of the pdgPrcgRsn property.
     * 
     * @return
     *     possible object is
     *     {@link PendingProcessingReason11Choice }
     *     
     */
    public PendingProcessingReason11Choice getPdgPrcgRsn() {
        return pdgPrcgRsn;
    }

    /**
     * Sets the value of the pdgPrcgRsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link PendingProcessingReason11Choice }
     *     
     */
    public void setPdgPrcgRsn(PendingProcessingReason11Choice value) {
        this.pdgPrcgRsn = value;
    }

    /**
     * Gets the value of the rjctnRsn property.
     * 
     * @return
     *     possible object is
     *     {@link RejectionReason45Choice }
     *     
     */
    public RejectionReason45Choice getRjctnRsn() {
        return rjctnRsn;
    }

    /**
     * Sets the value of the rjctnRsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link RejectionReason45Choice }
     *     
     */
    public void setRjctnRsn(RejectionReason45Choice value) {
        this.rjctnRsn = value;
    }

    /**
     * Gets the value of the rprRsn property.
     * 
     * @return
     *     possible object is
     *     {@link RepairReason11Choice }
     *     
     */
    public RepairReason11Choice getRprRsn() {
        return rprRsn;
    }

    /**
     * Sets the value of the rprRsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link RepairReason11Choice }
     *     
     */
    public void setRprRsn(RepairReason11Choice value) {
        this.rprRsn = value;
    }

    /**
     * Gets the value of the pdgModRsn property.
     * 
     * @return
     *     possible object is
     *     {@link PendingReason28Choice }
     *     
     */
    public PendingReason28Choice getPdgModRsn() {
        return pdgModRsn;
    }

    /**
     * Sets the value of the pdgModRsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link PendingReason28Choice }
     *     
     */
    public void setPdgModRsn(PendingReason28Choice value) {
        this.pdgModRsn = value;
    }

    /**
     * Gets the value of the umtchdRsn property.
     * 
     * @return
     *     possible object is
     *     {@link UnmatchedReason22Choice }
     *     
     */
    public UnmatchedReason22Choice getUmtchdRsn() {
        return umtchdRsn;
    }

    /**
     * Sets the value of the umtchdRsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnmatchedReason22Choice }
     *     
     */
    public void setUmtchdRsn(UnmatchedReason22Choice value) {
        this.umtchdRsn = value;
    }

}
