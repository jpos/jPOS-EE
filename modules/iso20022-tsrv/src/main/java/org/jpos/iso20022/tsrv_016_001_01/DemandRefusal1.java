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

package org.jpos.iso20022.tsrv_016_001_01;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DemandRefusal1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="DemandRefusal1">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="UdrtkgId" type="{urn:iso:std:iso:20022:tech:xsd:tsrv.016.001.01}Undertaking9"/>
 *         <element name="AdvsgPtyRefNb" type="{urn:iso:std:iso:20022:tech:xsd:tsrv.016.001.01}Max35Text" minOccurs="0"/>
 *         <element name="ScndAdvsgPtyRefNb" type="{urn:iso:std:iso:20022:tech:xsd:tsrv.016.001.01}Max35Text" minOccurs="0"/>
 *         <element name="CnfrmrRefNb" type="{urn:iso:std:iso:20022:tech:xsd:tsrv.016.001.01}Max35Text" minOccurs="0"/>
 *         <element name="DmndDtls" type="{urn:iso:std:iso:20022:tech:xsd:tsrv.016.001.01}Demand2"/>
 *         <element name="Sts" type="{urn:iso:std:iso:20022:tech:xsd:tsrv.016.001.01}Refused7Text"/>
 *         <element name="Dscrpncy" type="{urn:iso:std:iso:20022:tech:xsd:tsrv.016.001.01}Discrepancy1" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="DspstnOfDocs" type="{urn:iso:std:iso:20022:tech:xsd:tsrv.016.001.01}Max2000Text" maxOccurs="5" minOccurs="0"/>
 *         <element name="AddtlInf" type="{urn:iso:std:iso:20022:tech:xsd:tsrv.016.001.01}Max2000Text" maxOccurs="5" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DemandRefusal1", propOrder = {
    "udrtkgId",
    "advsgPtyRefNb",
    "scndAdvsgPtyRefNb",
    "cnfrmrRefNb",
    "dmndDtls",
    "sts",
    "dscrpncy",
    "dspstnOfDocs",
    "addtlInf"
})
public class DemandRefusal1 {

    @XmlElement(name = "UdrtkgId", required = true)
    protected Undertaking9 udrtkgId;
    @XmlElement(name = "AdvsgPtyRefNb")
    protected String advsgPtyRefNb;
    @XmlElement(name = "ScndAdvsgPtyRefNb")
    protected String scndAdvsgPtyRefNb;
    @XmlElement(name = "CnfrmrRefNb")
    protected String cnfrmrRefNb;
    @XmlElement(name = "DmndDtls", required = true)
    protected Demand2 dmndDtls;
    @XmlElement(name = "Sts", required = true)
    protected String sts;
    @XmlElement(name = "Dscrpncy")
    protected List<Discrepancy1> dscrpncy;
    @XmlElement(name = "DspstnOfDocs")
    protected List<String> dspstnOfDocs;
    @XmlElement(name = "AddtlInf")
    protected List<String> addtlInf;

    /**
     * Gets the value of the udrtkgId property.
     * 
     * @return
     *     possible object is
     *     {@link Undertaking9 }
     *     
     */
    public Undertaking9 getUdrtkgId() {
        return udrtkgId;
    }

    /**
     * Sets the value of the udrtkgId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Undertaking9 }
     *     
     */
    public void setUdrtkgId(Undertaking9 value) {
        this.udrtkgId = value;
    }

    /**
     * Gets the value of the advsgPtyRefNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdvsgPtyRefNb() {
        return advsgPtyRefNb;
    }

    /**
     * Sets the value of the advsgPtyRefNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdvsgPtyRefNb(String value) {
        this.advsgPtyRefNb = value;
    }

    /**
     * Gets the value of the scndAdvsgPtyRefNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScndAdvsgPtyRefNb() {
        return scndAdvsgPtyRefNb;
    }

    /**
     * Sets the value of the scndAdvsgPtyRefNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScndAdvsgPtyRefNb(String value) {
        this.scndAdvsgPtyRefNb = value;
    }

    /**
     * Gets the value of the cnfrmrRefNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCnfrmrRefNb() {
        return cnfrmrRefNb;
    }

    /**
     * Sets the value of the cnfrmrRefNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCnfrmrRefNb(String value) {
        this.cnfrmrRefNb = value;
    }

    /**
     * Gets the value of the dmndDtls property.
     * 
     * @return
     *     possible object is
     *     {@link Demand2 }
     *     
     */
    public Demand2 getDmndDtls() {
        return dmndDtls;
    }

    /**
     * Sets the value of the dmndDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link Demand2 }
     *     
     */
    public void setDmndDtls(Demand2 value) {
        this.dmndDtls = value;
    }

    /**
     * Gets the value of the sts property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSts() {
        return sts;
    }

    /**
     * Sets the value of the sts property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSts(String value) {
        this.sts = value;
    }

    /**
     * Gets the value of the dscrpncy property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the dscrpncy property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDscrpncy().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Discrepancy1 }
     * 
     * 
     * @return
     *     The value of the dscrpncy property.
     */
    public List<Discrepancy1> getDscrpncy() {
        if (dscrpncy == null) {
            dscrpncy = new ArrayList<>();
        }
        return this.dscrpncy;
    }

    /**
     * Gets the value of the dspstnOfDocs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the dspstnOfDocs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDspstnOfDocs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     * @return
     *     The value of the dspstnOfDocs property.
     */
    public List<String> getDspstnOfDocs() {
        if (dspstnOfDocs == null) {
            dspstnOfDocs = new ArrayList<>();
        }
        return this.dspstnOfDocs;
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
