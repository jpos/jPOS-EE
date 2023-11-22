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

package org.jpos.iso20022.seev_009_001_01;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AgentCANotificationAdviceV01 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="AgentCANotificationAdviceV01">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Id" type="{urn:iso:std:iso:20022:tech:xsd:seev.009.001.01}DocumentIdentification8"/>
 *         <element name="NtfctnTpAndLkg" type="{urn:iso:std:iso:20022:tech:xsd:seev.009.001.01}LinkedCorporateAction1"/>
 *         <element name="NtfctnGnlInf" type="{urn:iso:std:iso:20022:tech:xsd:seev.009.001.01}CorporateActionNotification1"/>
 *         <element name="CorpActnGnlInf" type="{urn:iso:std:iso:20022:tech:xsd:seev.009.001.01}CorporateActionInformation2"/>
 *         <element name="CorpActnDtls" type="{urn:iso:std:iso:20022:tech:xsd:seev.009.001.01}CorporateAction2"/>
 *         <element name="CorpActnOptnDtls" type="{urn:iso:std:iso:20022:tech:xsd:seev.009.001.01}CorporateActionOption1" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="CtctDtls" type="{urn:iso:std:iso:20022:tech:xsd:seev.009.001.01}ContactPerson1" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="AddtlInf" type="{urn:iso:std:iso:20022:tech:xsd:seev.009.001.01}CorporateActionNarrative2" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AgentCANotificationAdviceV01", propOrder = {
    "id",
    "ntfctnTpAndLkg",
    "ntfctnGnlInf",
    "corpActnGnlInf",
    "corpActnDtls",
    "corpActnOptnDtls",
    "ctctDtls",
    "addtlInf"
})
public class AgentCANotificationAdviceV01 {

    @XmlElement(name = "Id", required = true)
    protected DocumentIdentification8 id;
    @XmlElement(name = "NtfctnTpAndLkg", required = true)
    protected LinkedCorporateAction1 ntfctnTpAndLkg;
    @XmlElement(name = "NtfctnGnlInf", required = true)
    protected CorporateActionNotification1 ntfctnGnlInf;
    @XmlElement(name = "CorpActnGnlInf", required = true)
    protected CorporateActionInformation2 corpActnGnlInf;
    @XmlElement(name = "CorpActnDtls", required = true)
    protected CorporateAction2 corpActnDtls;
    @XmlElement(name = "CorpActnOptnDtls")
    protected List<CorporateActionOption1> corpActnOptnDtls;
    @XmlElement(name = "CtctDtls")
    protected List<ContactPerson1> ctctDtls;
    @XmlElement(name = "AddtlInf")
    protected CorporateActionNarrative2 addtlInf;

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
     * Gets the value of the ntfctnTpAndLkg property.
     * 
     * @return
     *     possible object is
     *     {@link LinkedCorporateAction1 }
     *     
     */
    public LinkedCorporateAction1 getNtfctnTpAndLkg() {
        return ntfctnTpAndLkg;
    }

    /**
     * Sets the value of the ntfctnTpAndLkg property.
     * 
     * @param value
     *     allowed object is
     *     {@link LinkedCorporateAction1 }
     *     
     */
    public void setNtfctnTpAndLkg(LinkedCorporateAction1 value) {
        this.ntfctnTpAndLkg = value;
    }

    /**
     * Gets the value of the ntfctnGnlInf property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionNotification1 }
     *     
     */
    public CorporateActionNotification1 getNtfctnGnlInf() {
        return ntfctnGnlInf;
    }

    /**
     * Sets the value of the ntfctnGnlInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionNotification1 }
     *     
     */
    public void setNtfctnGnlInf(CorporateActionNotification1 value) {
        this.ntfctnGnlInf = value;
    }

    /**
     * Gets the value of the corpActnGnlInf property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionInformation2 }
     *     
     */
    public CorporateActionInformation2 getCorpActnGnlInf() {
        return corpActnGnlInf;
    }

    /**
     * Sets the value of the corpActnGnlInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionInformation2 }
     *     
     */
    public void setCorpActnGnlInf(CorporateActionInformation2 value) {
        this.corpActnGnlInf = value;
    }

    /**
     * Gets the value of the corpActnDtls property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateAction2 }
     *     
     */
    public CorporateAction2 getCorpActnDtls() {
        return corpActnDtls;
    }

    /**
     * Sets the value of the corpActnDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateAction2 }
     *     
     */
    public void setCorpActnDtls(CorporateAction2 value) {
        this.corpActnDtls = value;
    }

    /**
     * Gets the value of the corpActnOptnDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the corpActnOptnDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCorpActnOptnDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CorporateActionOption1 }
     * 
     * 
     * @return
     *     The value of the corpActnOptnDtls property.
     */
    public List<CorporateActionOption1> getCorpActnOptnDtls() {
        if (corpActnOptnDtls == null) {
            corpActnOptnDtls = new ArrayList<>();
        }
        return this.corpActnOptnDtls;
    }

    /**
     * Gets the value of the ctctDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the ctctDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCtctDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ContactPerson1 }
     * 
     * 
     * @return
     *     The value of the ctctDtls property.
     */
    public List<ContactPerson1> getCtctDtls() {
        if (ctctDtls == null) {
            ctctDtls = new ArrayList<>();
        }
        return this.ctctDtls;
    }

    /**
     * Gets the value of the addtlInf property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionNarrative2 }
     *     
     */
    public CorporateActionNarrative2 getAddtlInf() {
        return addtlInf;
    }

    /**
     * Sets the value of the addtlInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionNarrative2 }
     *     
     */
    public void setAddtlInf(CorporateActionNarrative2 value) {
        this.addtlInf = value;
    }

}
