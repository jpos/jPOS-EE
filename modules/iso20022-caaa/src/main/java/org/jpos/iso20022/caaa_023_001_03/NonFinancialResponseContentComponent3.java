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

package org.jpos.iso20022.caaa_023_001_03;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NonFinancialResponseContentComponent3 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="NonFinancialResponseContentComponent3">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="NonFinReqTp" type="{urn:iso:std:iso:20022:tech:xsd:caaa.023.001.03}NonFinancialRequestType2Code"/>
 *         <element name="AcqrrSelctd" type="{urn:iso:std:iso:20022:tech:xsd:caaa.023.001.03}Acquirer10" minOccurs="0"/>
 *         <element name="RskMgmtRslt" type="{urn:iso:std:iso:20022:tech:xsd:caaa.023.001.03}NonFinancialResponseRisk1Code" minOccurs="0"/>
 *         <element name="Instlmt" type="{urn:iso:std:iso:20022:tech:xsd:caaa.023.001.03}RecurringTransaction5" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="AddtlRspn" type="{urn:iso:std:iso:20022:tech:xsd:caaa.023.001.03}ExternallyDefinedData4" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="Actn" type="{urn:iso:std:iso:20022:tech:xsd:caaa.023.001.03}Action14" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="Rspn" type="{urn:iso:std:iso:20022:tech:xsd:caaa.023.001.03}ResponseType11"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NonFinancialResponseContentComponent3", propOrder = {
    "nonFinReqTp",
    "acqrrSelctd",
    "rskMgmtRslt",
    "instlmt",
    "addtlRspn",
    "actn",
    "rspn"
})
public class NonFinancialResponseContentComponent3 {

    @XmlElement(name = "NonFinReqTp", required = true)
    @XmlSchemaType(name = "string")
    protected NonFinancialRequestType2Code nonFinReqTp;
    @XmlElement(name = "AcqrrSelctd")
    protected Acquirer10 acqrrSelctd;
    @XmlElement(name = "RskMgmtRslt")
    @XmlSchemaType(name = "string")
    protected NonFinancialResponseRisk1Code rskMgmtRslt;
    @XmlElement(name = "Instlmt")
    protected List<RecurringTransaction5> instlmt;
    @XmlElement(name = "AddtlRspn")
    protected List<ExternallyDefinedData4> addtlRspn;
    @XmlElement(name = "Actn")
    protected List<Action14> actn;
    @XmlElement(name = "Rspn", required = true)
    protected ResponseType11 rspn;

    /**
     * Gets the value of the nonFinReqTp property.
     * 
     * @return
     *     possible object is
     *     {@link NonFinancialRequestType2Code }
     *     
     */
    public NonFinancialRequestType2Code getNonFinReqTp() {
        return nonFinReqTp;
    }

    /**
     * Sets the value of the nonFinReqTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonFinancialRequestType2Code }
     *     
     */
    public void setNonFinReqTp(NonFinancialRequestType2Code value) {
        this.nonFinReqTp = value;
    }

    /**
     * Gets the value of the acqrrSelctd property.
     * 
     * @return
     *     possible object is
     *     {@link Acquirer10 }
     *     
     */
    public Acquirer10 getAcqrrSelctd() {
        return acqrrSelctd;
    }

    /**
     * Sets the value of the acqrrSelctd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Acquirer10 }
     *     
     */
    public void setAcqrrSelctd(Acquirer10 value) {
        this.acqrrSelctd = value;
    }

    /**
     * Gets the value of the rskMgmtRslt property.
     * 
     * @return
     *     possible object is
     *     {@link NonFinancialResponseRisk1Code }
     *     
     */
    public NonFinancialResponseRisk1Code getRskMgmtRslt() {
        return rskMgmtRslt;
    }

    /**
     * Sets the value of the rskMgmtRslt property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonFinancialResponseRisk1Code }
     *     
     */
    public void setRskMgmtRslt(NonFinancialResponseRisk1Code value) {
        this.rskMgmtRslt = value;
    }

    /**
     * Gets the value of the instlmt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the instlmt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInstlmt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RecurringTransaction5 }
     * 
     * 
     * @return
     *     The value of the instlmt property.
     */
    public List<RecurringTransaction5> getInstlmt() {
        if (instlmt == null) {
            instlmt = new ArrayList<>();
        }
        return this.instlmt;
    }

    /**
     * Gets the value of the addtlRspn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the addtlRspn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddtlRspn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExternallyDefinedData4 }
     * 
     * 
     * @return
     *     The value of the addtlRspn property.
     */
    public List<ExternallyDefinedData4> getAddtlRspn() {
        if (addtlRspn == null) {
            addtlRspn = new ArrayList<>();
        }
        return this.addtlRspn;
    }

    /**
     * Gets the value of the actn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the actn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getActn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Action14 }
     * 
     * 
     * @return
     *     The value of the actn property.
     */
    public List<Action14> getActn() {
        if (actn == null) {
            actn = new ArrayList<>();
        }
        return this.actn;
    }

    /**
     * Gets the value of the rspn property.
     * 
     * @return
     *     possible object is
     *     {@link ResponseType11 }
     *     
     */
    public ResponseType11 getRspn() {
        return rspn;
    }

    /**
     * Sets the value of the rspn property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseType11 }
     *     
     */
    public void setRspn(ResponseType11 value) {
        this.rspn = value;
    }

}
