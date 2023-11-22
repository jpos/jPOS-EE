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

package org.jpos.iso20022.camt_015_001_04;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ModifyMemberV04 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ModifyMemberV04">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="MsgHdr" type="{urn:iso:std:iso:20022:tech:xsd:camt.015.001.04}MessageHeader1"/>
 *         <element name="MmbId" type="{urn:iso:std:iso:20022:tech:xsd:camt.015.001.04}MemberIdentification3Choice"/>
 *         <element name="NewMmbValSet" type="{urn:iso:std:iso:20022:tech:xsd:camt.015.001.04}Member6"/>
 *         <element name="SplmtryData" type="{urn:iso:std:iso:20022:tech:xsd:camt.015.001.04}SupplementaryData1" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ModifyMemberV04", propOrder = {
    "msgHdr",
    "mmbId",
    "newMmbValSet",
    "splmtryData"
})
public class ModifyMemberV04 {

    @XmlElement(name = "MsgHdr", required = true)
    protected MessageHeader1 msgHdr;
    @XmlElement(name = "MmbId", required = true)
    protected MemberIdentification3Choice mmbId;
    @XmlElement(name = "NewMmbValSet", required = true)
    protected Member6 newMmbValSet;
    @XmlElement(name = "SplmtryData")
    protected List<SupplementaryData1> splmtryData;

    /**
     * Gets the value of the msgHdr property.
     * 
     * @return
     *     possible object is
     *     {@link MessageHeader1 }
     *     
     */
    public MessageHeader1 getMsgHdr() {
        return msgHdr;
    }

    /**
     * Sets the value of the msgHdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageHeader1 }
     *     
     */
    public void setMsgHdr(MessageHeader1 value) {
        this.msgHdr = value;
    }

    /**
     * Gets the value of the mmbId property.
     * 
     * @return
     *     possible object is
     *     {@link MemberIdentification3Choice }
     *     
     */
    public MemberIdentification3Choice getMmbId() {
        return mmbId;
    }

    /**
     * Sets the value of the mmbId property.
     * 
     * @param value
     *     allowed object is
     *     {@link MemberIdentification3Choice }
     *     
     */
    public void setMmbId(MemberIdentification3Choice value) {
        this.mmbId = value;
    }

    /**
     * Gets the value of the newMmbValSet property.
     * 
     * @return
     *     possible object is
     *     {@link Member6 }
     *     
     */
    public Member6 getNewMmbValSet() {
        return newMmbValSet;
    }

    /**
     * Sets the value of the newMmbValSet property.
     * 
     * @param value
     *     allowed object is
     *     {@link Member6 }
     *     
     */
    public void setNewMmbValSet(Member6 value) {
        this.newMmbValSet = value;
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
