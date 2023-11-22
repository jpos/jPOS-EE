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

package org.jpos.iso20022.auth_072_001_01;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SettlementInternaliserFinancialInstrument1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="SettlementInternaliserFinancialInstrument1">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Eqty" type="{urn:iso:std:iso:20022:tech:xsd:auth.072.001.01}InternalisationData1"/>
 *         <element name="SvrgnDebt" type="{urn:iso:std:iso:20022:tech:xsd:auth.072.001.01}InternalisationData1"/>
 *         <element name="Bd" type="{urn:iso:std:iso:20022:tech:xsd:auth.072.001.01}InternalisationData1"/>
 *         <element name="OthrTrfblScties" type="{urn:iso:std:iso:20022:tech:xsd:auth.072.001.01}InternalisationData1"/>
 *         <element name="XchgTradgFnds" type="{urn:iso:std:iso:20022:tech:xsd:auth.072.001.01}InternalisationData1"/>
 *         <element name="CllctvInvstmtUdrtkgs" type="{urn:iso:std:iso:20022:tech:xsd:auth.072.001.01}InternalisationData1"/>
 *         <element name="MnyMktInstrm" type="{urn:iso:std:iso:20022:tech:xsd:auth.072.001.01}InternalisationData1"/>
 *         <element name="EmssnAllwnc" type="{urn:iso:std:iso:20022:tech:xsd:auth.072.001.01}InternalisationData1"/>
 *         <element name="OthrFinInstrms" type="{urn:iso:std:iso:20022:tech:xsd:auth.072.001.01}InternalisationData1"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SettlementInternaliserFinancialInstrument1", propOrder = {
    "eqty",
    "svrgnDebt",
    "bd",
    "othrTrfblScties",
    "xchgTradgFnds",
    "cllctvInvstmtUdrtkgs",
    "mnyMktInstrm",
    "emssnAllwnc",
    "othrFinInstrms"
})
public class SettlementInternaliserFinancialInstrument1 {

    @XmlElement(name = "Eqty", required = true)
    protected InternalisationData1 eqty;
    @XmlElement(name = "SvrgnDebt", required = true)
    protected InternalisationData1 svrgnDebt;
    @XmlElement(name = "Bd", required = true)
    protected InternalisationData1 bd;
    @XmlElement(name = "OthrTrfblScties", required = true)
    protected InternalisationData1 othrTrfblScties;
    @XmlElement(name = "XchgTradgFnds", required = true)
    protected InternalisationData1 xchgTradgFnds;
    @XmlElement(name = "CllctvInvstmtUdrtkgs", required = true)
    protected InternalisationData1 cllctvInvstmtUdrtkgs;
    @XmlElement(name = "MnyMktInstrm", required = true)
    protected InternalisationData1 mnyMktInstrm;
    @XmlElement(name = "EmssnAllwnc", required = true)
    protected InternalisationData1 emssnAllwnc;
    @XmlElement(name = "OthrFinInstrms", required = true)
    protected InternalisationData1 othrFinInstrms;

    /**
     * Gets the value of the eqty property.
     * 
     * @return
     *     possible object is
     *     {@link InternalisationData1 }
     *     
     */
    public InternalisationData1 getEqty() {
        return eqty;
    }

    /**
     * Sets the value of the eqty property.
     * 
     * @param value
     *     allowed object is
     *     {@link InternalisationData1 }
     *     
     */
    public void setEqty(InternalisationData1 value) {
        this.eqty = value;
    }

    /**
     * Gets the value of the svrgnDebt property.
     * 
     * @return
     *     possible object is
     *     {@link InternalisationData1 }
     *     
     */
    public InternalisationData1 getSvrgnDebt() {
        return svrgnDebt;
    }

    /**
     * Sets the value of the svrgnDebt property.
     * 
     * @param value
     *     allowed object is
     *     {@link InternalisationData1 }
     *     
     */
    public void setSvrgnDebt(InternalisationData1 value) {
        this.svrgnDebt = value;
    }

    /**
     * Gets the value of the bd property.
     * 
     * @return
     *     possible object is
     *     {@link InternalisationData1 }
     *     
     */
    public InternalisationData1 getBd() {
        return bd;
    }

    /**
     * Sets the value of the bd property.
     * 
     * @param value
     *     allowed object is
     *     {@link InternalisationData1 }
     *     
     */
    public void setBd(InternalisationData1 value) {
        this.bd = value;
    }

    /**
     * Gets the value of the othrTrfblScties property.
     * 
     * @return
     *     possible object is
     *     {@link InternalisationData1 }
     *     
     */
    public InternalisationData1 getOthrTrfblScties() {
        return othrTrfblScties;
    }

    /**
     * Sets the value of the othrTrfblScties property.
     * 
     * @param value
     *     allowed object is
     *     {@link InternalisationData1 }
     *     
     */
    public void setOthrTrfblScties(InternalisationData1 value) {
        this.othrTrfblScties = value;
    }

    /**
     * Gets the value of the xchgTradgFnds property.
     * 
     * @return
     *     possible object is
     *     {@link InternalisationData1 }
     *     
     */
    public InternalisationData1 getXchgTradgFnds() {
        return xchgTradgFnds;
    }

    /**
     * Sets the value of the xchgTradgFnds property.
     * 
     * @param value
     *     allowed object is
     *     {@link InternalisationData1 }
     *     
     */
    public void setXchgTradgFnds(InternalisationData1 value) {
        this.xchgTradgFnds = value;
    }

    /**
     * Gets the value of the cllctvInvstmtUdrtkgs property.
     * 
     * @return
     *     possible object is
     *     {@link InternalisationData1 }
     *     
     */
    public InternalisationData1 getCllctvInvstmtUdrtkgs() {
        return cllctvInvstmtUdrtkgs;
    }

    /**
     * Sets the value of the cllctvInvstmtUdrtkgs property.
     * 
     * @param value
     *     allowed object is
     *     {@link InternalisationData1 }
     *     
     */
    public void setCllctvInvstmtUdrtkgs(InternalisationData1 value) {
        this.cllctvInvstmtUdrtkgs = value;
    }

    /**
     * Gets the value of the mnyMktInstrm property.
     * 
     * @return
     *     possible object is
     *     {@link InternalisationData1 }
     *     
     */
    public InternalisationData1 getMnyMktInstrm() {
        return mnyMktInstrm;
    }

    /**
     * Sets the value of the mnyMktInstrm property.
     * 
     * @param value
     *     allowed object is
     *     {@link InternalisationData1 }
     *     
     */
    public void setMnyMktInstrm(InternalisationData1 value) {
        this.mnyMktInstrm = value;
    }

    /**
     * Gets the value of the emssnAllwnc property.
     * 
     * @return
     *     possible object is
     *     {@link InternalisationData1 }
     *     
     */
    public InternalisationData1 getEmssnAllwnc() {
        return emssnAllwnc;
    }

    /**
     * Sets the value of the emssnAllwnc property.
     * 
     * @param value
     *     allowed object is
     *     {@link InternalisationData1 }
     *     
     */
    public void setEmssnAllwnc(InternalisationData1 value) {
        this.emssnAllwnc = value;
    }

    /**
     * Gets the value of the othrFinInstrms property.
     * 
     * @return
     *     possible object is
     *     {@link InternalisationData1 }
     *     
     */
    public InternalisationData1 getOthrFinInstrms() {
        return othrFinInstrms;
    }

    /**
     * Sets the value of the othrFinInstrms property.
     * 
     * @param value
     *     allowed object is
     *     {@link InternalisationData1 }
     *     
     */
    public void setOthrFinInstrms(InternalisationData1 value) {
        this.othrFinInstrms = value;
    }

}
