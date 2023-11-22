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

package org.jpos.iso20022.colr_005_001_06;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CollateralManagementCancellationRequestV06 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="CollateralManagementCancellationRequestV06">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Ref" type="{urn:iso:std:iso:20022:tech:xsd:colr.005.001.06}Reference3Choice"/>
 *         <element name="Oblgtn" type="{urn:iso:std:iso:20022:tech:xsd:colr.005.001.06}Obligation8"/>
 *         <element name="CxlRsn" type="{urn:iso:std:iso:20022:tech:xsd:colr.005.001.06}CollateralCancellationReason1"/>
 *         <element name="SplmtryData" type="{urn:iso:std:iso:20022:tech:xsd:colr.005.001.06}SupplementaryData1" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CollateralManagementCancellationRequestV06", propOrder = {
    "ref",
    "oblgtn",
    "cxlRsn",
    "splmtryData"
})
public class CollateralManagementCancellationRequestV06 {

    @XmlElement(name = "Ref", required = true)
    protected Reference3Choice ref;
    @XmlElement(name = "Oblgtn", required = true)
    protected Obligation8 oblgtn;
    @XmlElement(name = "CxlRsn", required = true)
    protected CollateralCancellationReason1 cxlRsn;
    @XmlElement(name = "SplmtryData")
    protected List<SupplementaryData1> splmtryData;

    /**
     * Gets the value of the ref property.
     * 
     * @return
     *     possible object is
     *     {@link Reference3Choice }
     *     
     */
    public Reference3Choice getRef() {
        return ref;
    }

    /**
     * Sets the value of the ref property.
     * 
     * @param value
     *     allowed object is
     *     {@link Reference3Choice }
     *     
     */
    public void setRef(Reference3Choice value) {
        this.ref = value;
    }

    /**
     * Gets the value of the oblgtn property.
     * 
     * @return
     *     possible object is
     *     {@link Obligation8 }
     *     
     */
    public Obligation8 getOblgtn() {
        return oblgtn;
    }

    /**
     * Sets the value of the oblgtn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Obligation8 }
     *     
     */
    public void setOblgtn(Obligation8 value) {
        this.oblgtn = value;
    }

    /**
     * Gets the value of the cxlRsn property.
     * 
     * @return
     *     possible object is
     *     {@link CollateralCancellationReason1 }
     *     
     */
    public CollateralCancellationReason1 getCxlRsn() {
        return cxlRsn;
    }

    /**
     * Sets the value of the cxlRsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link CollateralCancellationReason1 }
     *     
     */
    public void setCxlRsn(CollateralCancellationReason1 value) {
        this.cxlRsn = value;
    }

    /**
     * Gets the value of the splmtryData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the splmtryData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSplmtryData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SupplementaryData1 }
     * 
     * 
     * @return
     *     The value of the splmtryData property.
     */
    public List<SupplementaryData1> getSplmtryData() {
        if (splmtryData == null) {
            splmtryData = new ArrayList<>();
        }
        return this.splmtryData;
    }

}
