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

package org.jpos.iso20022.seev_029_001_01;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AgentCADeactivationCancellationRequestV01 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="AgentCADeactivationCancellationRequestV01">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Id" type="{urn:iso:std:iso:20022:tech:xsd:seev.029.001.01}DocumentIdentification8"/>
 *         <element name="AgtCADeactvtnInstrId" type="{urn:iso:std:iso:20022:tech:xsd:seev.029.001.01}DocumentIdentification8"/>
 *         <element name="CorpActnGnlInf" type="{urn:iso:std:iso:20022:tech:xsd:seev.029.001.01}CorporateActionInformation1"/>
 *         <element name="DeactvtnInstrDtls" type="{urn:iso:std:iso:20022:tech:xsd:seev.029.001.01}CorporateActionDeactivationInstruction1" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AgentCADeactivationCancellationRequestV01", propOrder = {
    "id",
    "agtCADeactvtnInstrId",
    "corpActnGnlInf",
    "deactvtnInstrDtls"
})
public class AgentCADeactivationCancellationRequestV01 {

    @XmlElement(name = "Id", required = true)
    protected DocumentIdentification8 id;
    @XmlElement(name = "AgtCADeactvtnInstrId", required = true)
    protected DocumentIdentification8 agtCADeactvtnInstrId;
    @XmlElement(name = "CorpActnGnlInf", required = true)
    protected CorporateActionInformation1 corpActnGnlInf;
    @XmlElement(name = "DeactvtnInstrDtls")
    protected CorporateActionDeactivationInstruction1 deactvtnInstrDtls;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentIdentification8 }
     *     
     */
    public DocumentIdentification8 getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentIdentification8 }
     *     
     */
    public void setId(DocumentIdentification8 value) {
        this.id = value;
    }

    /**
     * Gets the value of the agtCADeactvtnInstrId property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentIdentification8 }
     *     
     */
    public DocumentIdentification8 getAgtCADeactvtnInstrId() {
        return agtCADeactvtnInstrId;
    }

    /**
     * Sets the value of the agtCADeactvtnInstrId property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentIdentification8 }
     *     
     */
    public void setAgtCADeactvtnInstrId(DocumentIdentification8 value) {
        this.agtCADeactvtnInstrId = value;
    }

    /**
     * Gets the value of the corpActnGnlInf property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionInformation1 }
     *     
     */
    public CorporateActionInformation1 getCorpActnGnlInf() {
        return corpActnGnlInf;
    }

    /**
     * Sets the value of the corpActnGnlInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionInformation1 }
     *     
     */
    public void setCorpActnGnlInf(CorporateActionInformation1 value) {
        this.corpActnGnlInf = value;
    }

    /**
     * Gets the value of the deactvtnInstrDtls property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionDeactivationInstruction1 }
     *     
     */
    public CorporateActionDeactivationInstruction1 getDeactvtnInstrDtls() {
        return deactvtnInstrDtls;
    }

    /**
     * Sets the value of the deactvtnInstrDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionDeactivationInstruction1 }
     *     
     */
    public void setDeactvtnInstrDtls(CorporateActionDeactivationInstruction1 value) {
        this.deactvtnInstrDtls = value;
    }

}
