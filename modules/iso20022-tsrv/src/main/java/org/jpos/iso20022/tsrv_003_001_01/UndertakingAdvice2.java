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

package org.jpos.iso20022.tsrv_003_001_01;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UndertakingAdvice2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="UndertakingAdvice2">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="ApplcntRefNb" type="{urn:iso:std:iso:20022:tech:xsd:tsrv.003.001.01}Max35Text"/>
 *         <element name="Oblgr" type="{urn:iso:std:iso:20022:tech:xsd:tsrv.003.001.01}PartyIdentification43" minOccurs="0"/>
 *         <element name="UdrtkgIssncMsg" type="{urn:iso:std:iso:20022:tech:xsd:tsrv.003.001.01}UndertakingIssuanceMessage"/>
 *         <element name="OrgnlIssdMdm" type="{urn:iso:std:iso:20022:tech:xsd:tsrv.003.001.01}PresentationMedium1Code" minOccurs="0"/>
 *         <element name="NclsdFile" type="{urn:iso:std:iso:20022:tech:xsd:tsrv.003.001.01}Document9" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="AddtlInf" type="{urn:iso:std:iso:20022:tech:xsd:tsrv.003.001.01}Max2000Text" maxOccurs="5" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UndertakingAdvice2", propOrder = {
    "applcntRefNb",
    "oblgr",
    "udrtkgIssncMsg",
    "orgnlIssdMdm",
    "nclsdFile",
    "addtlInf"
})
public class UndertakingAdvice2 {

    @XmlElement(name = "ApplcntRefNb", required = true)
    protected String applcntRefNb;
    @XmlElement(name = "Oblgr")
    protected PartyIdentification43 oblgr;
    @XmlElement(name = "UdrtkgIssncMsg", required = true)
    protected UndertakingIssuanceMessage udrtkgIssncMsg;
    @XmlElement(name = "OrgnlIssdMdm")
    @XmlSchemaType(name = "string")
    protected PresentationMedium1Code orgnlIssdMdm;
    @XmlElement(name = "NclsdFile")
    protected List<Document9> nclsdFile;
    @XmlElement(name = "AddtlInf")
    protected List<String> addtlInf;

    /**
     * Gets the value of the applcntRefNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplcntRefNb() {
        return applcntRefNb;
    }

    /**
     * Sets the value of the applcntRefNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApplcntRefNb(String value) {
        this.applcntRefNb = value;
    }

    /**
     * Gets the value of the oblgr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification43 }
     *     
     */
    public PartyIdentification43 getOblgr() {
        return oblgr;
    }

    /**
     * Sets the value of the oblgr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification43 }
     *     
     */
    public void setOblgr(PartyIdentification43 value) {
        this.oblgr = value;
    }

    /**
     * Gets the value of the udrtkgIssncMsg property.
     * 
     * @return
     *     possible object is
     *     {@link UndertakingIssuanceMessage }
     *     
     */
    public UndertakingIssuanceMessage getUdrtkgIssncMsg() {
        return udrtkgIssncMsg;
    }

    /**
     * Sets the value of the udrtkgIssncMsg property.
     * 
     * @param value
     *     allowed object is
     *     {@link UndertakingIssuanceMessage }
     *     
     */
    public void setUdrtkgIssncMsg(UndertakingIssuanceMessage value) {
        this.udrtkgIssncMsg = value;
    }

    /**
     * Gets the value of the orgnlIssdMdm property.
     * 
     * @return
     *     possible object is
     *     {@link PresentationMedium1Code }
     *     
     */
    public PresentationMedium1Code getOrgnlIssdMdm() {
        return orgnlIssdMdm;
    }

    /**
     * Sets the value of the orgnlIssdMdm property.
     * 
     * @param value
     *     allowed object is
     *     {@link PresentationMedium1Code }
     *     
     */
    public void setOrgnlIssdMdm(PresentationMedium1Code value) {
        this.orgnlIssdMdm = value;
    }

    /**
     * Gets the value of the nclsdFile property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the nclsdFile property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNclsdFile().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Document9 }
     * 
     * 
     * @return
     *     The value of the nclsdFile property.
     */
    public List<Document9> getNclsdFile() {
        if (nclsdFile == null) {
            nclsdFile = new ArrayList<>();
        }
        return this.nclsdFile;
    }

    /**
     * Gets the value of the addtlInf property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the addtlInf property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddtlInf().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     * @return
     *     The value of the addtlInf property.
     */
    public List<String> getAddtlInf() {
        if (addtlInf == null) {
            addtlInf = new ArrayList<>();
        }
        return this.addtlInf;
    }

}
