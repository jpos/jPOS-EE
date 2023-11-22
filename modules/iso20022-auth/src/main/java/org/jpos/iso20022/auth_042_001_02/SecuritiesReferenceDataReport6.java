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

package org.jpos.iso20022.auth_042_001_02;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SecuritiesReferenceDataReport6 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="SecuritiesReferenceDataReport6">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="TechRcrdId" type="{urn:iso:std:iso:20022:tech:xsd:auth.042.001.02}Max35Text" minOccurs="0"/>
 *         <element name="FinInstrmGnlAttrbts" type="{urn:iso:std:iso:20022:tech:xsd:auth.042.001.02}SecurityInstrumentDescription9"/>
 *         <element name="Issr" type="{urn:iso:std:iso:20022:tech:xsd:auth.042.001.02}LEIIdentifier"/>
 *         <element name="TradgVnRltdAttrbts" type="{urn:iso:std:iso:20022:tech:xsd:auth.042.001.02}TradingVenueAttributes1" maxOccurs="unbounded"/>
 *         <element name="DebtInstrmAttrbts" type="{urn:iso:std:iso:20022:tech:xsd:auth.042.001.02}DebtInstrument2" minOccurs="0"/>
 *         <element name="DerivInstrmAttrbts" type="{urn:iso:std:iso:20022:tech:xsd:auth.042.001.02}DerivativeInstrument5" minOccurs="0"/>
 *         <element name="TechAttrbts" type="{urn:iso:std:iso:20022:tech:xsd:auth.042.001.02}RecordTechnicalData4" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecuritiesReferenceDataReport6", propOrder = {
    "techRcrdId",
    "finInstrmGnlAttrbts",
    "issr",
    "tradgVnRltdAttrbts",
    "debtInstrmAttrbts",
    "derivInstrmAttrbts",
    "techAttrbts"
})
public class SecuritiesReferenceDataReport6 {

    @XmlElement(name = "TechRcrdId")
    protected String techRcrdId;
    @XmlElement(name = "FinInstrmGnlAttrbts", required = true)
    protected SecurityInstrumentDescription9 finInstrmGnlAttrbts;
    @XmlElement(name = "Issr", required = true)
    protected String issr;
    @XmlElement(name = "TradgVnRltdAttrbts", required = true)
    protected List<TradingVenueAttributes1> tradgVnRltdAttrbts;
    @XmlElement(name = "DebtInstrmAttrbts")
    protected DebtInstrument2 debtInstrmAttrbts;
    @XmlElement(name = "DerivInstrmAttrbts")
    protected DerivativeInstrument5 derivInstrmAttrbts;
    @XmlElement(name = "TechAttrbts")
    protected RecordTechnicalData4 techAttrbts;

    /**
     * Gets the value of the techRcrdId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTechRcrdId() {
        return techRcrdId;
    }

    /**
     * Sets the value of the techRcrdId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTechRcrdId(String value) {
        this.techRcrdId = value;
    }

    /**
     * Gets the value of the finInstrmGnlAttrbts property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityInstrumentDescription9 }
     *     
     */
    public SecurityInstrumentDescription9 getFinInstrmGnlAttrbts() {
        return finInstrmGnlAttrbts;
    }

    /**
     * Sets the value of the finInstrmGnlAttrbts property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityInstrumentDescription9 }
     *     
     */
    public void setFinInstrmGnlAttrbts(SecurityInstrumentDescription9 value) {
        this.finInstrmGnlAttrbts = value;
    }

    /**
     * Gets the value of the issr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIssr() {
        return issr;
    }

    /**
     * Sets the value of the issr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIssr(String value) {
        this.issr = value;
    }

    /**
     * Gets the value of the tradgVnRltdAttrbts property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the tradgVnRltdAttrbts property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTradgVnRltdAttrbts().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TradingVenueAttributes1 }
     * 
     * 
     * @return
     *     The value of the tradgVnRltdAttrbts property.
     */
    public List<TradingVenueAttributes1> getTradgVnRltdAttrbts() {
        if (tradgVnRltdAttrbts == null) {
            tradgVnRltdAttrbts = new ArrayList<>();
        }
        return this.tradgVnRltdAttrbts;
    }

    /**
     * Gets the value of the debtInstrmAttrbts property.
     * 
     * @return
     *     possible object is
     *     {@link DebtInstrument2 }
     *     
     */
    public DebtInstrument2 getDebtInstrmAttrbts() {
        return debtInstrmAttrbts;
    }

    /**
     * Sets the value of the debtInstrmAttrbts property.
     * 
     * @param value
     *     allowed object is
     *     {@link DebtInstrument2 }
     *     
     */
    public void setDebtInstrmAttrbts(DebtInstrument2 value) {
        this.debtInstrmAttrbts = value;
    }

    /**
     * Gets the value of the derivInstrmAttrbts property.
     * 
     * @return
     *     possible object is
     *     {@link DerivativeInstrument5 }
     *     
     */
    public DerivativeInstrument5 getDerivInstrmAttrbts() {
        return derivInstrmAttrbts;
    }

    /**
     * Sets the value of the derivInstrmAttrbts property.
     * 
     * @param value
     *     allowed object is
     *     {@link DerivativeInstrument5 }
     *     
     */
    public void setDerivInstrmAttrbts(DerivativeInstrument5 value) {
        this.derivInstrmAttrbts = value;
    }

    /**
     * Gets the value of the techAttrbts property.
     * 
     * @return
     *     possible object is
     *     {@link RecordTechnicalData4 }
     *     
     */
    public RecordTechnicalData4 getTechAttrbts() {
        return techAttrbts;
    }

    /**
     * Sets the value of the techAttrbts property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordTechnicalData4 }
     *     
     */
    public void setTechAttrbts(RecordTechnicalData4 value) {
        this.techAttrbts = value;
    }

}
