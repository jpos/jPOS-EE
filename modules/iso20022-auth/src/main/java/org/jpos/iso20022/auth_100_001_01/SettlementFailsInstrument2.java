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

package org.jpos.iso20022.auth_100_001_01;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SettlementFailsInstrument2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="SettlementFailsInstrument2">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Eqty" type="{urn:iso:std:iso:20022:tech:xsd:auth.100.001.01}SettlementTotalData1Choice"/>
 *         <element name="SvrgnDebt" type="{urn:iso:std:iso:20022:tech:xsd:auth.100.001.01}SettlementTotalData1Choice"/>
 *         <element name="Bd" type="{urn:iso:std:iso:20022:tech:xsd:auth.100.001.01}SettlementTotalData1Choice"/>
 *         <element name="OthrTrfblScties" type="{urn:iso:std:iso:20022:tech:xsd:auth.100.001.01}SettlementTotalData1Choice"/>
 *         <element name="XchgTraddFnds" type="{urn:iso:std:iso:20022:tech:xsd:auth.100.001.01}SettlementTotalData1Choice"/>
 *         <element name="CllctvInvstmtUdrtkgs" type="{urn:iso:std:iso:20022:tech:xsd:auth.100.001.01}SettlementTotalData1Choice"/>
 *         <element name="MnyMktInstrm" type="{urn:iso:std:iso:20022:tech:xsd:auth.100.001.01}SettlementTotalData1Choice"/>
 *         <element name="EmssnAllwnc" type="{urn:iso:std:iso:20022:tech:xsd:auth.100.001.01}SettlementTotalData1Choice"/>
 *         <element name="Othr" type="{urn:iso:std:iso:20022:tech:xsd:auth.100.001.01}SettlementTotalData1Choice"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SettlementFailsInstrument2", propOrder = {
    "eqty",
    "svrgnDebt",
    "bd",
    "othrTrfblScties",
    "xchgTraddFnds",
    "cllctvInvstmtUdrtkgs",
    "mnyMktInstrm",
    "emssnAllwnc",
    "othr"
})
public class SettlementFailsInstrument2 {

    @XmlElement(name = "Eqty", required = true)
    protected SettlementTotalData1Choice eqty;
    @XmlElement(name = "SvrgnDebt", required = true)
    protected SettlementTotalData1Choice svrgnDebt;
    @XmlElement(name = "Bd", required = true)
    protected SettlementTotalData1Choice bd;
    @XmlElement(name = "OthrTrfblScties", required = true)
    protected SettlementTotalData1Choice othrTrfblScties;
    @XmlElement(name = "XchgTraddFnds", required = true)
    protected SettlementTotalData1Choice xchgTraddFnds;
    @XmlElement(name = "CllctvInvstmtUdrtkgs", required = true)
    protected SettlementTotalData1Choice cllctvInvstmtUdrtkgs;
    @XmlElement(name = "MnyMktInstrm", required = true)
    protected SettlementTotalData1Choice mnyMktInstrm;
    @XmlElement(name = "EmssnAllwnc", required = true)
    protected SettlementTotalData1Choice emssnAllwnc;
    @XmlElement(name = "Othr", required = true)
    protected SettlementTotalData1Choice othr;

    /**
     * Gets the value of the eqty property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementTotalData1Choice }
     *     
     */
    public SettlementTotalData1Choice getEqty() {
        return eqty;
    }

    /**
     * Sets the value of the eqty property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementTotalData1Choice }
     *     
     */
    public void setEqty(SettlementTotalData1Choice value) {
        this.eqty = value;
    }

    /**
     * Gets the value of the svrgnDebt property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementTotalData1Choice }
     *     
     */
    public SettlementTotalData1Choice getSvrgnDebt() {
        return svrgnDebt;
    }

    /**
     * Sets the value of the svrgnDebt property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementTotalData1Choice }
     *     
     */
    public void setSvrgnDebt(SettlementTotalData1Choice value) {
        this.svrgnDebt = value;
    }

    /**
     * Gets the value of the bd property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementTotalData1Choice }
     *     
     */
    public SettlementTotalData1Choice getBd() {
        return bd;
    }

    /**
     * Sets the value of the bd property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementTotalData1Choice }
     *     
     */
    public void setBd(SettlementTotalData1Choice value) {
        this.bd = value;
    }

    /**
     * Gets the value of the othrTrfblScties property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementTotalData1Choice }
     *     
     */
    public SettlementTotalData1Choice getOthrTrfblScties() {
        return othrTrfblScties;
    }

    /**
     * Sets the value of the othrTrfblScties property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementTotalData1Choice }
     *     
     */
    public void setOthrTrfblScties(SettlementTotalData1Choice value) {
        this.othrTrfblScties = value;
    }

    /**
     * Gets the value of the xchgTraddFnds property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementTotalData1Choice }
     *     
     */
    public SettlementTotalData1Choice getXchgTraddFnds() {
        return xchgTraddFnds;
    }

    /**
     * Sets the value of the xchgTraddFnds property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementTotalData1Choice }
     *     
     */
    public void setXchgTraddFnds(SettlementTotalData1Choice value) {
        this.xchgTraddFnds = value;
    }

    /**
     * Gets the value of the cllctvInvstmtUdrtkgs property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementTotalData1Choice }
     *     
     */
    public SettlementTotalData1Choice getCllctvInvstmtUdrtkgs() {
        return cllctvInvstmtUdrtkgs;
    }

    /**
     * Sets the value of the cllctvInvstmtUdrtkgs property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementTotalData1Choice }
     *     
     */
    public void setCllctvInvstmtUdrtkgs(SettlementTotalData1Choice value) {
        this.cllctvInvstmtUdrtkgs = value;
    }

    /**
     * Gets the value of the mnyMktInstrm property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementTotalData1Choice }
     *     
     */
    public SettlementTotalData1Choice getMnyMktInstrm() {
        return mnyMktInstrm;
    }

    /**
     * Sets the value of the mnyMktInstrm property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementTotalData1Choice }
     *     
     */
    public void setMnyMktInstrm(SettlementTotalData1Choice value) {
        this.mnyMktInstrm = value;
    }

    /**
     * Gets the value of the emssnAllwnc property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementTotalData1Choice }
     *     
     */
    public SettlementTotalData1Choice getEmssnAllwnc() {
        return emssnAllwnc;
    }

    /**
     * Sets the value of the emssnAllwnc property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementTotalData1Choice }
     *     
     */
    public void setEmssnAllwnc(SettlementTotalData1Choice value) {
        this.emssnAllwnc = value;
    }

    /**
     * Gets the value of the othr property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementTotalData1Choice }
     *     
     */
    public SettlementTotalData1Choice getOthr() {
        return othr;
    }

    /**
     * Sets the value of the othr property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementTotalData1Choice }
     *     
     */
    public void setOthr(SettlementTotalData1Choice value) {
        this.othr = value;
    }

}
