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

package org.jpos.iso20022.seev_024_001_01;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AgentCAInformationStatusAdviceV01 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="AgentCAInformationStatusAdviceV01">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Id" type="{urn:iso:std:iso:20022:tech:xsd:seev.024.001.01}DocumentIdentification8"/>
 *         <element name="AgtCAInfAdvcId" type="{urn:iso:std:iso:20022:tech:xsd:seev.024.001.01}DocumentIdentification8"/>
 *         <element name="CorpActnAddtlInf" type="{urn:iso:std:iso:20022:tech:xsd:seev.024.001.01}CorporateActionAdditionalInformation1" minOccurs="0"/>
 *         <element name="InfStsDtls" type="{urn:iso:std:iso:20022:tech:xsd:seev.024.001.01}CorporateActionInformationStatus1Choice"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AgentCAInformationStatusAdviceV01", propOrder = {
    "id",
    "agtCAInfAdvcId",
    "corpActnAddtlInf",
    "infStsDtls"
})
public class AgentCAInformationStatusAdviceV01 {

    @XmlElement(name = "Id", required = true)
    protected DocumentIdentification8 id;
    @XmlElement(name = "AgtCAInfAdvcId", required = true)
    protected DocumentIdentification8 agtCAInfAdvcId;
    @XmlElement(name = "CorpActnAddtlInf")
    protected CorporateActionAdditionalInformation1 corpActnAddtlInf;
    @XmlElement(name = "InfStsDtls", required = true)
    protected CorporateActionInformationStatus1Choice infStsDtls;

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
     * Gets the value of the agtCAInfAdvcId property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentIdentification8 }
     *     
     */
    public DocumentIdentification8 getAgtCAInfAdvcId() {
        return agtCAInfAdvcId;
    }

    /**
     * Sets the value of the agtCAInfAdvcId property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentIdentification8 }
     *     
     */
    public void setAgtCAInfAdvcId(DocumentIdentification8 value) {
        this.agtCAInfAdvcId = value;
    }

    /**
     * Gets the value of the corpActnAddtlInf property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionAdditionalInformation1 }
     *     
     */
    public CorporateActionAdditionalInformation1 getCorpActnAddtlInf() {
        return corpActnAddtlInf;
    }

    /**
     * Sets the value of the corpActnAddtlInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionAdditionalInformation1 }
     *     
     */
    public void setCorpActnAddtlInf(CorporateActionAdditionalInformation1 value) {
        this.corpActnAddtlInf = value;
    }

    /**
     * Gets the value of the infStsDtls property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionInformationStatus1Choice }
     *     
     */
    public CorporateActionInformationStatus1Choice getInfStsDtls() {
        return infStsDtls;
    }

    /**
     * Sets the value of the infStsDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionInformationStatus1Choice }
     *     
     */
    public void setInfStsDtls(CorporateActionInformationStatus1Choice value) {
        this.infStsDtls = value;
    }

}
