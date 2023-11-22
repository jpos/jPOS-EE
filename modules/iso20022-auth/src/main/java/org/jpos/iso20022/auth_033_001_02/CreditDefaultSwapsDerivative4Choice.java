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

package org.jpos.iso20022.auth_033_001_02;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CreditDefaultSwapsDerivative4Choice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="CreditDefaultSwapsDerivative4Choice">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="SnglNmCdtDfltSwp" type="{urn:iso:std:iso:20022:tech:xsd:auth.033.001.02}CreditDefaultSwapSingleName2"/>
 *         <element name="CdtDfltSwpIndx" type="{urn:iso:std:iso:20022:tech:xsd:auth.033.001.02}CreditDefaultSwapIndex3"/>
 *         <element name="SnglNmCdtDfltSwpDeriv" type="{urn:iso:std:iso:20022:tech:xsd:auth.033.001.02}CreditDefaultSwapDerivative6"/>
 *         <element name="CdtDfltSwpIndxDeriv" type="{urn:iso:std:iso:20022:tech:xsd:auth.033.001.02}CreditDefaultSwapDerivative5"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreditDefaultSwapsDerivative4Choice", propOrder = {
    "snglNmCdtDfltSwp",
    "cdtDfltSwpIndx",
    "snglNmCdtDfltSwpDeriv",
    "cdtDfltSwpIndxDeriv"
})
public class CreditDefaultSwapsDerivative4Choice {

    @XmlElement(name = "SnglNmCdtDfltSwp")
    protected CreditDefaultSwapSingleName2 snglNmCdtDfltSwp;
    @XmlElement(name = "CdtDfltSwpIndx")
    protected CreditDefaultSwapIndex3 cdtDfltSwpIndx;
    @XmlElement(name = "SnglNmCdtDfltSwpDeriv")
    protected CreditDefaultSwapDerivative6 snglNmCdtDfltSwpDeriv;
    @XmlElement(name = "CdtDfltSwpIndxDeriv")
    protected CreditDefaultSwapDerivative5 cdtDfltSwpIndxDeriv;

    /**
     * Gets the value of the snglNmCdtDfltSwp property.
     * 
     * @return
     *     possible object is
     *     {@link CreditDefaultSwapSingleName2 }
     *     
     */
    public CreditDefaultSwapSingleName2 getSnglNmCdtDfltSwp() {
        return snglNmCdtDfltSwp;
    }

    /**
     * Sets the value of the snglNmCdtDfltSwp property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditDefaultSwapSingleName2 }
     *     
     */
    public void setSnglNmCdtDfltSwp(CreditDefaultSwapSingleName2 value) {
        this.snglNmCdtDfltSwp = value;
    }

    /**
     * Gets the value of the cdtDfltSwpIndx property.
     * 
     * @return
     *     possible object is
     *     {@link CreditDefaultSwapIndex3 }
     *     
     */
    public CreditDefaultSwapIndex3 getCdtDfltSwpIndx() {
        return cdtDfltSwpIndx;
    }

    /**
     * Sets the value of the cdtDfltSwpIndx property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditDefaultSwapIndex3 }
     *     
     */
    public void setCdtDfltSwpIndx(CreditDefaultSwapIndex3 value) {
        this.cdtDfltSwpIndx = value;
    }

    /**
     * Gets the value of the snglNmCdtDfltSwpDeriv property.
     * 
     * @return
     *     possible object is
     *     {@link CreditDefaultSwapDerivative6 }
     *     
     */
    public CreditDefaultSwapDerivative6 getSnglNmCdtDfltSwpDeriv() {
        return snglNmCdtDfltSwpDeriv;
    }

    /**
     * Sets the value of the snglNmCdtDfltSwpDeriv property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditDefaultSwapDerivative6 }
     *     
     */
    public void setSnglNmCdtDfltSwpDeriv(CreditDefaultSwapDerivative6 value) {
        this.snglNmCdtDfltSwpDeriv = value;
    }

    /**
     * Gets the value of the cdtDfltSwpIndxDeriv property.
     * 
     * @return
     *     possible object is
     *     {@link CreditDefaultSwapDerivative5 }
     *     
     */
    public CreditDefaultSwapDerivative5 getCdtDfltSwpIndxDeriv() {
        return cdtDfltSwpIndxDeriv;
    }

    /**
     * Sets the value of the cdtDfltSwpIndxDeriv property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditDefaultSwapDerivative5 }
     *     
     */
    public void setCdtDfltSwpIndxDeriv(CreditDefaultSwapDerivative5 value) {
        this.cdtDfltSwpIndxDeriv = value;
    }

}
