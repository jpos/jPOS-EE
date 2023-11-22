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

package org.jpos.iso20022.camt_058_001_08;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NotificationToReceiveCancellationAdviceV08 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="NotificationToReceiveCancellationAdviceV08">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="GrpHdr" type="{urn:iso:std:iso:20022:tech:xsd:camt.058.001.08}GroupHeader77"/>
 *         <element name="OrgnlNtfctn" type="{urn:iso:std:iso:20022:tech:xsd:camt.058.001.08}OriginalNotification14"/>
 *         <element name="SplmtryData" type="{urn:iso:std:iso:20022:tech:xsd:camt.058.001.08}SupplementaryData1" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="CxlRsn" type="{urn:iso:std:iso:20022:tech:xsd:camt.058.001.08}NotificationCancellationReason1" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NotificationToReceiveCancellationAdviceV08", propOrder = {
    "grpHdr",
    "orgnlNtfctn",
    "splmtryData",
    "cxlRsn"
})
public class NotificationToReceiveCancellationAdviceV08 {

    @XmlElement(name = "GrpHdr", required = true)
    protected GroupHeader77 grpHdr;
    @XmlElement(name = "OrgnlNtfctn", required = true)
    protected OriginalNotification14 orgnlNtfctn;
    @XmlElement(name = "SplmtryData")
    protected List<SupplementaryData1> splmtryData;
    @XmlElement(name = "CxlRsn")
    protected NotificationCancellationReason1 cxlRsn;

    /**
     * Gets the value of the grpHdr property.
     * 
     * @return
     *     possible object is
     *     {@link GroupHeader77 }
     *     
     */
    public GroupHeader77 getGrpHdr() {
        return grpHdr;
    }

    /**
     * Sets the value of the grpHdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link GroupHeader77 }
     *     
     */
    public void setGrpHdr(GroupHeader77 value) {
        this.grpHdr = value;
    }

    /**
     * Gets the value of the orgnlNtfctn property.
     * 
     * @return
     *     possible object is
     *     {@link OriginalNotification14 }
     *     
     */
    public OriginalNotification14 getOrgnlNtfctn() {
        return orgnlNtfctn;
    }

    /**
     * Sets the value of the orgnlNtfctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link OriginalNotification14 }
     *     
     */
    public void setOrgnlNtfctn(OriginalNotification14 value) {
        this.orgnlNtfctn = value;
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

    /**
     * Gets the value of the cxlRsn property.
     * 
     * @return
     *     possible object is
     *     {@link NotificationCancellationReason1 }
     *     
     */
    public NotificationCancellationReason1 getCxlRsn() {
        return cxlRsn;
    }

    /**
     * Sets the value of the cxlRsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link NotificationCancellationReason1 }
     *     
     */
    public void setCxlRsn(NotificationCancellationReason1 value) {
        this.cxlRsn = value;
    }

}
