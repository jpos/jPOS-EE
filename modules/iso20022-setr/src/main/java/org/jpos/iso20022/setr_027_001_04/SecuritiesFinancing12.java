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

package org.jpos.iso20022.setr_027_001_04;

import java.math.BigDecimal;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SecuritiesFinancing12 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="SecuritiesFinancing12">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="RateChngDt" type="{urn:iso:std:iso:20022:tech:xsd:setr.027.001.04}ISODateTime" minOccurs="0"/>
 *         <element name="RateTp" type="{urn:iso:std:iso:20022:tech:xsd:setr.027.001.04}RateType35Choice" minOccurs="0"/>
 *         <element name="Rvaltn" type="{urn:iso:std:iso:20022:tech:xsd:setr.027.001.04}Revaluation3Choice" minOccurs="0"/>
 *         <element name="LglFrmwk" type="{urn:iso:std:iso:20022:tech:xsd:setr.027.001.04}LegalFramework1Code" minOccurs="0"/>
 *         <element name="IntrstCmptnMtd" type="{urn:iso:std:iso:20022:tech:xsd:setr.027.001.04}InterestComputationMethod3Choice" minOccurs="0"/>
 *         <element name="VarblRateSpprt" type="{urn:iso:std:iso:20022:tech:xsd:setr.027.001.04}RateName1" minOccurs="0"/>
 *         <element name="RpRate" type="{urn:iso:std:iso:20022:tech:xsd:setr.027.001.04}Rate2" minOccurs="0"/>
 *         <element name="StockLnMrgn" type="{urn:iso:std:iso:20022:tech:xsd:setr.027.001.04}Rate2" minOccurs="0"/>
 *         <element name="SctiesHrcut" type="{urn:iso:std:iso:20022:tech:xsd:setr.027.001.04}Rate2" minOccurs="0"/>
 *         <element name="PricgRate" type="{urn:iso:std:iso:20022:tech:xsd:setr.027.001.04}RateOrName1Choice" minOccurs="0"/>
 *         <element name="SprdRate" type="{urn:iso:std:iso:20022:tech:xsd:setr.027.001.04}SpreadRate1" minOccurs="0"/>
 *         <element name="CllblTradInd" type="{urn:iso:std:iso:20022:tech:xsd:setr.027.001.04}YesNoIndicator" minOccurs="0"/>
 *         <element name="TxCallDely" type="{urn:iso:std:iso:20022:tech:xsd:setr.027.001.04}Max3NumericText" minOccurs="0"/>
 *         <element name="AcrdIntrstAmt" type="{urn:iso:std:iso:20022:tech:xsd:setr.027.001.04}AmountAndDirection5" minOccurs="0"/>
 *         <element name="AcrdIntrstPctg" type="{urn:iso:std:iso:20022:tech:xsd:setr.027.001.04}PercentageRate" minOccurs="0"/>
 *         <element name="FrftAmt" type="{urn:iso:std:iso:20022:tech:xsd:setr.027.001.04}AmountAndDirection5" minOccurs="0"/>
 *         <element name="PrmAmt" type="{urn:iso:std:iso:20022:tech:xsd:setr.027.001.04}AmountAndDirection5" minOccurs="0"/>
 *         <element name="ClsgAmtPerPcsOfColl" type="{urn:iso:std:iso:20022:tech:xsd:setr.027.001.04}AmountAndDirection5" minOccurs="0"/>
 *         <element name="TtlNbOfCollInstrs" type="{urn:iso:std:iso:20022:tech:xsd:setr.027.001.04}Max3NumericText" minOccurs="0"/>
 *         <element name="FincgAgrmt" type="{urn:iso:std:iso:20022:tech:xsd:setr.027.001.04}Agreement5" minOccurs="0"/>
 *         <element name="LndgTxMtd" type="{urn:iso:std:iso:20022:tech:xsd:setr.027.001.04}LendingTransactionMethod2Choice" minOccurs="0"/>
 *         <element name="LndgWthColl" type="{urn:iso:std:iso:20022:tech:xsd:setr.027.001.04}YesNoIndicator" minOccurs="0"/>
 *         <element name="BrrwgRsn" type="{urn:iso:std:iso:20022:tech:xsd:setr.027.001.04}BorrowingReason2Choice" minOccurs="0"/>
 *         <element name="CollTp" type="{urn:iso:std:iso:20022:tech:xsd:setr.027.001.04}CollateralType4Choice" minOccurs="0"/>
 *         <element name="CtrctTermsModChngd" type="{urn:iso:std:iso:20022:tech:xsd:setr.027.001.04}YesNoIndicator" minOccurs="0"/>
 *         <element name="IntrstRate" type="{urn:iso:std:iso:20022:tech:xsd:setr.027.001.04}Rate2" minOccurs="0"/>
 *         <element name="BrrwgRate" type="{urn:iso:std:iso:20022:tech:xsd:setr.027.001.04}Rate2" minOccurs="0"/>
 *         <element name="StdCollRatio" type="{urn:iso:std:iso:20022:tech:xsd:setr.027.001.04}Rate2" minOccurs="0"/>
 *         <element name="DvddRatio" type="{urn:iso:std:iso:20022:tech:xsd:setr.027.001.04}Rate2" minOccurs="0"/>
 *         <element name="NbOfDaysLndgBrrwg" type="{urn:iso:std:iso:20022:tech:xsd:setr.027.001.04}Number24Choice" minOccurs="0"/>
 *         <element name="StdCollAmt" type="{urn:iso:std:iso:20022:tech:xsd:setr.027.001.04}AmountAndDirection5" minOccurs="0"/>
 *         <element name="AcrdIntrstTax" type="{urn:iso:std:iso:20022:tech:xsd:setr.027.001.04}YesNoIndicator" minOccurs="0"/>
 *         <element name="EndNbOfDaysAcrd" type="{urn:iso:std:iso:20022:tech:xsd:setr.027.001.04}Max3Number" minOccurs="0"/>
 *         <element name="EndFctr" type="{urn:iso:std:iso:20022:tech:xsd:setr.027.001.04}BaseOneRate" minOccurs="0"/>
 *         <element name="SctiesLndgTp" type="{urn:iso:std:iso:20022:tech:xsd:setr.027.001.04}SecuritiesLendingType2Choice" minOccurs="0"/>
 *         <element name="Rvsbl" type="{urn:iso:std:iso:20022:tech:xsd:setr.027.001.04}Reversible2Choice" minOccurs="0"/>
 *         <element name="MinDtForCallBck" type="{urn:iso:std:iso:20022:tech:xsd:setr.027.001.04}ISODate" minOccurs="0"/>
 *         <element name="RollOver" type="{urn:iso:std:iso:20022:tech:xsd:setr.027.001.04}YesNoIndicator" minOccurs="0"/>
 *         <element name="PrdcPmt" type="{urn:iso:std:iso:20022:tech:xsd:setr.027.001.04}YesNoIndicator" minOccurs="0"/>
 *         <element name="ExCpn" type="{urn:iso:std:iso:20022:tech:xsd:setr.027.001.04}YesNoIndicator" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecuritiesFinancing12", propOrder = {
    "rateChngDt",
    "rateTp",
    "rvaltn",
    "lglFrmwk",
    "intrstCmptnMtd",
    "varblRateSpprt",
    "rpRate",
    "stockLnMrgn",
    "sctiesHrcut",
    "pricgRate",
    "sprdRate",
    "cllblTradInd",
    "txCallDely",
    "acrdIntrstAmt",
    "acrdIntrstPctg",
    "frftAmt",
    "prmAmt",
    "clsgAmtPerPcsOfColl",
    "ttlNbOfCollInstrs",
    "fincgAgrmt",
    "lndgTxMtd",
    "lndgWthColl",
    "brrwgRsn",
    "collTp",
    "ctrctTermsModChngd",
    "intrstRate",
    "brrwgRate",
    "stdCollRatio",
    "dvddRatio",
    "nbOfDaysLndgBrrwg",
    "stdCollAmt",
    "acrdIntrstTax",
    "endNbOfDaysAcrd",
    "endFctr",
    "sctiesLndgTp",
    "rvsbl",
    "minDtForCallBck",
    "rollOver",
    "prdcPmt",
    "exCpn"
})
public class SecuritiesFinancing12 {

    @XmlElement(name = "RateChngDt")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar rateChngDt;
    @XmlElement(name = "RateTp")
    protected RateType35Choice rateTp;
    @XmlElement(name = "Rvaltn")
    protected Revaluation3Choice rvaltn;
    @XmlElement(name = "LglFrmwk")
    @XmlSchemaType(name = "string")
    protected LegalFramework1Code lglFrmwk;
    @XmlElement(name = "IntrstCmptnMtd")
    protected InterestComputationMethod3Choice intrstCmptnMtd;
    @XmlElement(name = "VarblRateSpprt")
    protected RateName1 varblRateSpprt;
    @XmlElement(name = "RpRate")
    protected Rate2 rpRate;
    @XmlElement(name = "StockLnMrgn")
    protected Rate2 stockLnMrgn;
    @XmlElement(name = "SctiesHrcut")
    protected Rate2 sctiesHrcut;
    @XmlElement(name = "PricgRate")
    protected RateOrName1Choice pricgRate;
    @XmlElement(name = "SprdRate")
    protected SpreadRate1 sprdRate;
    @XmlElement(name = "CllblTradInd")
    protected Boolean cllblTradInd;
    @XmlElement(name = "TxCallDely")
    protected String txCallDely;
    @XmlElement(name = "AcrdIntrstAmt")
    protected AmountAndDirection5 acrdIntrstAmt;
    @XmlElement(name = "AcrdIntrstPctg")
    protected BigDecimal acrdIntrstPctg;
    @XmlElement(name = "FrftAmt")
    protected AmountAndDirection5 frftAmt;
    @XmlElement(name = "PrmAmt")
    protected AmountAndDirection5 prmAmt;
    @XmlElement(name = "ClsgAmtPerPcsOfColl")
    protected AmountAndDirection5 clsgAmtPerPcsOfColl;
    @XmlElement(name = "TtlNbOfCollInstrs")
    protected String ttlNbOfCollInstrs;
    @XmlElement(name = "FincgAgrmt")
    protected Agreement5 fincgAgrmt;
    @XmlElement(name = "LndgTxMtd")
    protected LendingTransactionMethod2Choice lndgTxMtd;
    @XmlElement(name = "LndgWthColl")
    protected Boolean lndgWthColl;
    @XmlElement(name = "BrrwgRsn")
    protected BorrowingReason2Choice brrwgRsn;
    @XmlElement(name = "CollTp")
    protected CollateralType4Choice collTp;
    @XmlElement(name = "CtrctTermsModChngd")
    protected Boolean ctrctTermsModChngd;
    @XmlElement(name = "IntrstRate")
    protected Rate2 intrstRate;
    @XmlElement(name = "BrrwgRate")
    protected Rate2 brrwgRate;
    @XmlElement(name = "StdCollRatio")
    protected Rate2 stdCollRatio;
    @XmlElement(name = "DvddRatio")
    protected Rate2 dvddRatio;
    @XmlElement(name = "NbOfDaysLndgBrrwg")
    protected Number24Choice nbOfDaysLndgBrrwg;
    @XmlElement(name = "StdCollAmt")
    protected AmountAndDirection5 stdCollAmt;
    @XmlElement(name = "AcrdIntrstTax")
    protected Boolean acrdIntrstTax;
    @XmlElement(name = "EndNbOfDaysAcrd")
    protected BigDecimal endNbOfDaysAcrd;
    @XmlElement(name = "EndFctr")
    protected BigDecimal endFctr;
    @XmlElement(name = "SctiesLndgTp")
    protected SecuritiesLendingType2Choice sctiesLndgTp;
    @XmlElement(name = "Rvsbl")
    protected Reversible2Choice rvsbl;
    @XmlElement(name = "MinDtForCallBck")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar minDtForCallBck;
    @XmlElement(name = "RollOver")
    protected Boolean rollOver;
    @XmlElement(name = "PrdcPmt")
    protected Boolean prdcPmt;
    @XmlElement(name = "ExCpn")
    protected Boolean exCpn;

    /**
     * Gets the value of the rateChngDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRateChngDt() {
        return rateChngDt;
    }

    /**
     * Sets the value of the rateChngDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRateChngDt(XMLGregorianCalendar value) {
        this.rateChngDt = value;
    }

    /**
     * Gets the value of the rateTp property.
     * 
     * @return
     *     possible object is
     *     {@link RateType35Choice }
     *     
     */
    public RateType35Choice getRateTp() {
        return rateTp;
    }

    /**
     * Sets the value of the rateTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateType35Choice }
     *     
     */
    public void setRateTp(RateType35Choice value) {
        this.rateTp = value;
    }

    /**
     * Gets the value of the rvaltn property.
     * 
     * @return
     *     possible object is
     *     {@link Revaluation3Choice }
     *     
     */
    public Revaluation3Choice getRvaltn() {
        return rvaltn;
    }

    /**
     * Sets the value of the rvaltn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Revaluation3Choice }
     *     
     */
    public void setRvaltn(Revaluation3Choice value) {
        this.rvaltn = value;
    }

    /**
     * Gets the value of the lglFrmwk property.
     * 
     * @return
     *     possible object is
     *     {@link LegalFramework1Code }
     *     
     */
    public LegalFramework1Code getLglFrmwk() {
        return lglFrmwk;
    }

    /**
     * Sets the value of the lglFrmwk property.
     * 
     * @param value
     *     allowed object is
     *     {@link LegalFramework1Code }
     *     
     */
    public void setLglFrmwk(LegalFramework1Code value) {
        this.lglFrmwk = value;
    }

    /**
     * Gets the value of the intrstCmptnMtd property.
     * 
     * @return
     *     possible object is
     *     {@link InterestComputationMethod3Choice }
     *     
     */
    public InterestComputationMethod3Choice getIntrstCmptnMtd() {
        return intrstCmptnMtd;
    }

    /**
     * Sets the value of the intrstCmptnMtd property.
     * 
     * @param value
     *     allowed object is
     *     {@link InterestComputationMethod3Choice }
     *     
     */
    public void setIntrstCmptnMtd(InterestComputationMethod3Choice value) {
        this.intrstCmptnMtd = value;
    }

    /**
     * Gets the value of the varblRateSpprt property.
     * 
     * @return
     *     possible object is
     *     {@link RateName1 }
     *     
     */
    public RateName1 getVarblRateSpprt() {
        return varblRateSpprt;
    }

    /**
     * Sets the value of the varblRateSpprt property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateName1 }
     *     
     */
    public void setVarblRateSpprt(RateName1 value) {
        this.varblRateSpprt = value;
    }

    /**
     * Gets the value of the rpRate property.
     * 
     * @return
     *     possible object is
     *     {@link Rate2 }
     *     
     */
    public Rate2 getRpRate() {
        return rpRate;
    }

    /**
     * Sets the value of the rpRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Rate2 }
     *     
     */
    public void setRpRate(Rate2 value) {
        this.rpRate = value;
    }

    /**
     * Gets the value of the stockLnMrgn property.
     * 
     * @return
     *     possible object is
     *     {@link Rate2 }
     *     
     */
    public Rate2 getStockLnMrgn() {
        return stockLnMrgn;
    }

    /**
     * Sets the value of the stockLnMrgn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Rate2 }
     *     
     */
    public void setStockLnMrgn(Rate2 value) {
        this.stockLnMrgn = value;
    }

    /**
     * Gets the value of the sctiesHrcut property.
     * 
     * @return
     *     possible object is
     *     {@link Rate2 }
     *     
     */
    public Rate2 getSctiesHrcut() {
        return sctiesHrcut;
    }

    /**
     * Sets the value of the sctiesHrcut property.
     * 
     * @param value
     *     allowed object is
     *     {@link Rate2 }
     *     
     */
    public void setSctiesHrcut(Rate2 value) {
        this.sctiesHrcut = value;
    }

    /**
     * Gets the value of the pricgRate property.
     * 
     * @return
     *     possible object is
     *     {@link RateOrName1Choice }
     *     
     */
    public RateOrName1Choice getPricgRate() {
        return pricgRate;
    }

    /**
     * Sets the value of the pricgRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateOrName1Choice }
     *     
     */
    public void setPricgRate(RateOrName1Choice value) {
        this.pricgRate = value;
    }

    /**
     * Gets the value of the sprdRate property.
     * 
     * @return
     *     possible object is
     *     {@link SpreadRate1 }
     *     
     */
    public SpreadRate1 getSprdRate() {
        return sprdRate;
    }

    /**
     * Sets the value of the sprdRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpreadRate1 }
     *     
     */
    public void setSprdRate(SpreadRate1 value) {
        this.sprdRate = value;
    }

    /**
     * Gets the value of the cllblTradInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCllblTradInd() {
        return cllblTradInd;
    }

    /**
     * Sets the value of the cllblTradInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCllblTradInd(Boolean value) {
        this.cllblTradInd = value;
    }

    /**
     * Gets the value of the txCallDely property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTxCallDely() {
        return txCallDely;
    }

    /**
     * Sets the value of the txCallDely property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTxCallDely(String value) {
        this.txCallDely = value;
    }

    /**
     * Gets the value of the acrdIntrstAmt property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection5 }
     *     
     */
    public AmountAndDirection5 getAcrdIntrstAmt() {
        return acrdIntrstAmt;
    }

    /**
     * Sets the value of the acrdIntrstAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection5 }
     *     
     */
    public void setAcrdIntrstAmt(AmountAndDirection5 value) {
        this.acrdIntrstAmt = value;
    }

    /**
     * Gets the value of the acrdIntrstPctg property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAcrdIntrstPctg() {
        return acrdIntrstPctg;
    }

    /**
     * Sets the value of the acrdIntrstPctg property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAcrdIntrstPctg(BigDecimal value) {
        this.acrdIntrstPctg = value;
    }

    /**
     * Gets the value of the frftAmt property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection5 }
     *     
     */
    public AmountAndDirection5 getFrftAmt() {
        return frftAmt;
    }

    /**
     * Sets the value of the frftAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection5 }
     *     
     */
    public void setFrftAmt(AmountAndDirection5 value) {
        this.frftAmt = value;
    }

    /**
     * Gets the value of the prmAmt property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection5 }
     *     
     */
    public AmountAndDirection5 getPrmAmt() {
        return prmAmt;
    }

    /**
     * Sets the value of the prmAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection5 }
     *     
     */
    public void setPrmAmt(AmountAndDirection5 value) {
        this.prmAmt = value;
    }

    /**
     * Gets the value of the clsgAmtPerPcsOfColl property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection5 }
     *     
     */
    public AmountAndDirection5 getClsgAmtPerPcsOfColl() {
        return clsgAmtPerPcsOfColl;
    }

    /**
     * Sets the value of the clsgAmtPerPcsOfColl property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection5 }
     *     
     */
    public void setClsgAmtPerPcsOfColl(AmountAndDirection5 value) {
        this.clsgAmtPerPcsOfColl = value;
    }

    /**
     * Gets the value of the ttlNbOfCollInstrs property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTtlNbOfCollInstrs() {
        return ttlNbOfCollInstrs;
    }

    /**
     * Sets the value of the ttlNbOfCollInstrs property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTtlNbOfCollInstrs(String value) {
        this.ttlNbOfCollInstrs = value;
    }

    /**
     * Gets the value of the fincgAgrmt property.
     * 
     * @return
     *     possible object is
     *     {@link Agreement5 }
     *     
     */
    public Agreement5 getFincgAgrmt() {
        return fincgAgrmt;
    }

    /**
     * Sets the value of the fincgAgrmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Agreement5 }
     *     
     */
    public void setFincgAgrmt(Agreement5 value) {
        this.fincgAgrmt = value;
    }

    /**
     * Gets the value of the lndgTxMtd property.
     * 
     * @return
     *     possible object is
     *     {@link LendingTransactionMethod2Choice }
     *     
     */
    public LendingTransactionMethod2Choice getLndgTxMtd() {
        return lndgTxMtd;
    }

    /**
     * Sets the value of the lndgTxMtd property.
     * 
     * @param value
     *     allowed object is
     *     {@link LendingTransactionMethod2Choice }
     *     
     */
    public void setLndgTxMtd(LendingTransactionMethod2Choice value) {
        this.lndgTxMtd = value;
    }

    /**
     * Gets the value of the lndgWthColl property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLndgWthColl() {
        return lndgWthColl;
    }

    /**
     * Sets the value of the lndgWthColl property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLndgWthColl(Boolean value) {
        this.lndgWthColl = value;
    }

    /**
     * Gets the value of the brrwgRsn property.
     * 
     * @return
     *     possible object is
     *     {@link BorrowingReason2Choice }
     *     
     */
    public BorrowingReason2Choice getBrrwgRsn() {
        return brrwgRsn;
    }

    /**
     * Sets the value of the brrwgRsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BorrowingReason2Choice }
     *     
     */
    public void setBrrwgRsn(BorrowingReason2Choice value) {
        this.brrwgRsn = value;
    }

    /**
     * Gets the value of the collTp property.
     * 
     * @return
     *     possible object is
     *     {@link CollateralType4Choice }
     *     
     */
    public CollateralType4Choice getCollTp() {
        return collTp;
    }

    /**
     * Sets the value of the collTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link CollateralType4Choice }
     *     
     */
    public void setCollTp(CollateralType4Choice value) {
        this.collTp = value;
    }

    /**
     * Gets the value of the ctrctTermsModChngd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCtrctTermsModChngd() {
        return ctrctTermsModChngd;
    }

    /**
     * Sets the value of the ctrctTermsModChngd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCtrctTermsModChngd(Boolean value) {
        this.ctrctTermsModChngd = value;
    }

    /**
     * Gets the value of the intrstRate property.
     * 
     * @return
     *     possible object is
     *     {@link Rate2 }
     *     
     */
    public Rate2 getIntrstRate() {
        return intrstRate;
    }

    /**
     * Sets the value of the intrstRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Rate2 }
     *     
     */
    public void setIntrstRate(Rate2 value) {
        this.intrstRate = value;
    }

    /**
     * Gets the value of the brrwgRate property.
     * 
     * @return
     *     possible object is
     *     {@link Rate2 }
     *     
     */
    public Rate2 getBrrwgRate() {
        return brrwgRate;
    }

    /**
     * Sets the value of the brrwgRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Rate2 }
     *     
     */
    public void setBrrwgRate(Rate2 value) {
        this.brrwgRate = value;
    }

    /**
     * Gets the value of the stdCollRatio property.
     * 
     * @return
     *     possible object is
     *     {@link Rate2 }
     *     
     */
    public Rate2 getStdCollRatio() {
        return stdCollRatio;
    }

    /**
     * Sets the value of the stdCollRatio property.
     * 
     * @param value
     *     allowed object is
     *     {@link Rate2 }
     *     
     */
    public void setStdCollRatio(Rate2 value) {
        this.stdCollRatio = value;
    }

    /**
     * Gets the value of the dvddRatio property.
     * 
     * @return
     *     possible object is
     *     {@link Rate2 }
     *     
     */
    public Rate2 getDvddRatio() {
        return dvddRatio;
    }

    /**
     * Sets the value of the dvddRatio property.
     * 
     * @param value
     *     allowed object is
     *     {@link Rate2 }
     *     
     */
    public void setDvddRatio(Rate2 value) {
        this.dvddRatio = value;
    }

    /**
     * Gets the value of the nbOfDaysLndgBrrwg property.
     * 
     * @return
     *     possible object is
     *     {@link Number24Choice }
     *     
     */
    public Number24Choice getNbOfDaysLndgBrrwg() {
        return nbOfDaysLndgBrrwg;
    }

    /**
     * Sets the value of the nbOfDaysLndgBrrwg property.
     * 
     * @param value
     *     allowed object is
     *     {@link Number24Choice }
     *     
     */
    public void setNbOfDaysLndgBrrwg(Number24Choice value) {
        this.nbOfDaysLndgBrrwg = value;
    }

    /**
     * Gets the value of the stdCollAmt property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection5 }
     *     
     */
    public AmountAndDirection5 getStdCollAmt() {
        return stdCollAmt;
    }

    /**
     * Sets the value of the stdCollAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection5 }
     *     
     */
    public void setStdCollAmt(AmountAndDirection5 value) {
        this.stdCollAmt = value;
    }

    /**
     * Gets the value of the acrdIntrstTax property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAcrdIntrstTax() {
        return acrdIntrstTax;
    }

    /**
     * Sets the value of the acrdIntrstTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAcrdIntrstTax(Boolean value) {
        this.acrdIntrstTax = value;
    }

    /**
     * Gets the value of the endNbOfDaysAcrd property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getEndNbOfDaysAcrd() {
        return endNbOfDaysAcrd;
    }

    /**
     * Sets the value of the endNbOfDaysAcrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setEndNbOfDaysAcrd(BigDecimal value) {
        this.endNbOfDaysAcrd = value;
    }

    /**
     * Gets the value of the endFctr property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getEndFctr() {
        return endFctr;
    }

    /**
     * Sets the value of the endFctr property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setEndFctr(BigDecimal value) {
        this.endFctr = value;
    }

    /**
     * Gets the value of the sctiesLndgTp property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesLendingType2Choice }
     *     
     */
    public SecuritiesLendingType2Choice getSctiesLndgTp() {
        return sctiesLndgTp;
    }

    /**
     * Sets the value of the sctiesLndgTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesLendingType2Choice }
     *     
     */
    public void setSctiesLndgTp(SecuritiesLendingType2Choice value) {
        this.sctiesLndgTp = value;
    }

    /**
     * Gets the value of the rvsbl property.
     * 
     * @return
     *     possible object is
     *     {@link Reversible2Choice }
     *     
     */
    public Reversible2Choice getRvsbl() {
        return rvsbl;
    }

    /**
     * Sets the value of the rvsbl property.
     * 
     * @param value
     *     allowed object is
     *     {@link Reversible2Choice }
     *     
     */
    public void setRvsbl(Reversible2Choice value) {
        this.rvsbl = value;
    }

    /**
     * Gets the value of the minDtForCallBck property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMinDtForCallBck() {
        return minDtForCallBck;
    }

    /**
     * Sets the value of the minDtForCallBck property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMinDtForCallBck(XMLGregorianCalendar value) {
        this.minDtForCallBck = value;
    }

    /**
     * Gets the value of the rollOver property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRollOver() {
        return rollOver;
    }

    /**
     * Sets the value of the rollOver property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRollOver(Boolean value) {
        this.rollOver = value;
    }

    /**
     * Gets the value of the prdcPmt property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPrdcPmt() {
        return prdcPmt;
    }

    /**
     * Sets the value of the prdcPmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPrdcPmt(Boolean value) {
        this.prdcPmt = value;
    }

    /**
     * Gets the value of the exCpn property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isExCpn() {
        return exCpn;
    }

    /**
     * Sets the value of the exCpn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setExCpn(Boolean value) {
        this.exCpn = value;
    }

}
