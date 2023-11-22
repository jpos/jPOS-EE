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

package org.jpos.iso20022.auth_090_001_02;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PositionSetCollateralTotal2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="PositionSetCollateralTotal2">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="NbOfRpts" type="{urn:iso:std:iso:20022:tech:xsd:auth.090.001.02}Max20PositiveNumber" minOccurs="0"/>
 *         <element name="PstdMrgnOrColl" type="{urn:iso:std:iso:20022:tech:xsd:auth.090.001.02}PostedMarginOrCollateral6" minOccurs="0"/>
 *         <element name="RcvdMrgnOrColl" type="{urn:iso:std:iso:20022:tech:xsd:auth.090.001.02}ReceivedMarginOrCollateral6" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PositionSetCollateralTotal2", propOrder = {
    "nbOfRpts",
    "pstdMrgnOrColl",
    "rcvdMrgnOrColl"
})
public class PositionSetCollateralTotal2 {

    @XmlElement(name = "NbOfRpts")
    protected BigDecimal nbOfRpts;
    @XmlElement(name = "PstdMrgnOrColl")
    protected PostedMarginOrCollateral6 pstdMrgnOrColl;
    @XmlElement(name = "RcvdMrgnOrColl")
    protected ReceivedMarginOrCollateral6 rcvdMrgnOrColl;

    /**
     * Gets the value of the nbOfRpts property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNbOfRpts() {
        return nbOfRpts;
    }

    /**
     * Sets the value of the nbOfRpts property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNbOfRpts(BigDecimal value) {
        this.nbOfRpts = value;
    }

    /**
     * Gets the value of the pstdMrgnOrColl property.
     * 
     * @return
     *     possible object is
     *     {@link PostedMarginOrCollateral6 }
     *     
     */
    public PostedMarginOrCollateral6 getPstdMrgnOrColl() {
        return pstdMrgnOrColl;
    }

    /**
     * Sets the value of the pstdMrgnOrColl property.
     * 
     * @param value
     *     allowed object is
     *     {@link PostedMarginOrCollateral6 }
     *     
     */
    public void setPstdMrgnOrColl(PostedMarginOrCollateral6 value) {
        this.pstdMrgnOrColl = value;
    }

    /**
     * Gets the value of the rcvdMrgnOrColl property.
     * 
     * @return
     *     possible object is
     *     {@link ReceivedMarginOrCollateral6 }
     *     
     */
    public ReceivedMarginOrCollateral6 getRcvdMrgnOrColl() {
        return rcvdMrgnOrColl;
    }

    /**
     * Sets the value of the rcvdMrgnOrColl property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReceivedMarginOrCollateral6 }
     *     
     */
    public void setRcvdMrgnOrColl(ReceivedMarginOrCollateral6 value) {
        this.rcvdMrgnOrColl = value;
    }

}
