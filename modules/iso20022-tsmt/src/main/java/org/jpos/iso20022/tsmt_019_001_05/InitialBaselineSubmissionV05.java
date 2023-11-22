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

package org.jpos.iso20022.tsmt_019_001_05;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InitialBaselineSubmissionV05 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="InitialBaselineSubmissionV05">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="SubmissnId" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.019.001.05}MessageIdentification1"/>
 *         <element name="SubmitrTxRef" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.019.001.05}SimpleIdentificationInformation"/>
 *         <element name="Instr" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.019.001.05}InstructionType1"/>
 *         <element name="Baseln" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.019.001.05}Baseline5"/>
 *         <element name="BuyrCtctPrsn" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.019.001.05}ContactIdentification1" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="SellrCtctPrsn" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.019.001.05}ContactIdentification1" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="BkCtctPrsn" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.019.001.05}BankContactPerson1Choice"/>
 *         <element name="OthrBkCtctPrsn" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.019.001.05}ContactIdentification3" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InitialBaselineSubmissionV05", propOrder = {
    "submissnId",
    "submitrTxRef",
    "instr",
    "baseln",
    "buyrCtctPrsn",
    "sellrCtctPrsn",
    "bkCtctPrsn",
    "othrBkCtctPrsn"
})
public class InitialBaselineSubmissionV05 {

    @XmlElement(name = "SubmissnId", required = true)
    protected MessageIdentification1 submissnId;
    @XmlElement(name = "SubmitrTxRef", required = true)
    protected SimpleIdentificationInformation submitrTxRef;
    @XmlElement(name = "Instr", required = true)
    protected InstructionType1 instr;
    @XmlElement(name = "Baseln", required = true)
    protected Baseline5 baseln;
    @XmlElement(name = "BuyrCtctPrsn")
    protected List<ContactIdentification1> buyrCtctPrsn;
    @XmlElement(name = "SellrCtctPrsn")
    protected List<ContactIdentification1> sellrCtctPrsn;
    @XmlElement(name = "BkCtctPrsn", required = true)
    protected BankContactPerson1Choice bkCtctPrsn;
    @XmlElement(name = "OthrBkCtctPrsn")
    protected List<ContactIdentification3> othrBkCtctPrsn;

    /**
     * Gets the value of the submissnId property.
     * 
     * @return
     *     possible object is
     *     {@link MessageIdentification1 }
     *     
     */
    public MessageIdentification1 getSubmissnId() {
        return submissnId;
    }

    /**
     * Sets the value of the submissnId property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageIdentification1 }
     *     
     */
    public void setSubmissnId(MessageIdentification1 value) {
        this.submissnId = value;
    }

    /**
     * Gets the value of the submitrTxRef property.
     * 
     * @return
     *     possible object is
     *     {@link SimpleIdentificationInformation }
     *     
     */
    public SimpleIdentificationInformation getSubmitrTxRef() {
        return submitrTxRef;
    }

    /**
     * Sets the value of the submitrTxRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link SimpleIdentificationInformation }
     *     
     */
    public void setSubmitrTxRef(SimpleIdentificationInformation value) {
        this.submitrTxRef = value;
    }

    /**
     * Gets the value of the instr property.
     * 
     * @return
     *     possible object is
     *     {@link InstructionType1 }
     *     
     */
    public InstructionType1 getInstr() {
        return instr;
    }

    /**
     * Sets the value of the instr property.
     * 
     * @param value
     *     allowed object is
     *     {@link InstructionType1 }
     *     
     */
    public void setInstr(InstructionType1 value) {
        this.instr = value;
    }

    /**
     * Gets the value of the baseln property.
     * 
     * @return
     *     possible object is
     *     {@link Baseline5 }
     *     
     */
    public Baseline5 getBaseln() {
        return baseln;
    }

    /**
     * Sets the value of the baseln property.
     * 
     * @param value
     *     allowed object is
     *     {@link Baseline5 }
     *     
     */
    public void setBaseln(Baseline5 value) {
        this.baseln = value;
    }

    /**
     * Gets the value of the buyrCtctPrsn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the buyrCtctPrsn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBuyrCtctPrsn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ContactIdentification1 }
     * 
     * 
     * @return
     *     The value of the buyrCtctPrsn property.
     */
    public List<ContactIdentification1> getBuyrCtctPrsn() {
        if (buyrCtctPrsn == null) {
            buyrCtctPrsn = new ArrayList<>();
        }
        return this.buyrCtctPrsn;
    }

    /**
     * Gets the value of the sellrCtctPrsn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the sellrCtctPrsn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSellrCtctPrsn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ContactIdentification1 }
     * 
     * 
     * @return
     *     The value of the sellrCtctPrsn property.
     */
    public List<ContactIdentification1> getSellrCtctPrsn() {
        if (sellrCtctPrsn == null) {
            sellrCtctPrsn = new ArrayList<>();
        }
        return this.sellrCtctPrsn;
    }

    /**
     * Gets the value of the bkCtctPrsn property.
     * 
     * @return
     *     possible object is
     *     {@link BankContactPerson1Choice }
     *     
     */
    public BankContactPerson1Choice getBkCtctPrsn() {
        return bkCtctPrsn;
    }

    /**
     * Sets the value of the bkCtctPrsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BankContactPerson1Choice }
     *     
     */
    public void setBkCtctPrsn(BankContactPerson1Choice value) {
        this.bkCtctPrsn = value;
    }

    /**
     * Gets the value of the othrBkCtctPrsn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the othrBkCtctPrsn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOthrBkCtctPrsn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ContactIdentification3 }
     * 
     * 
     * @return
     *     The value of the othrBkCtctPrsn property.
     */
    public List<ContactIdentification3> getOthrBkCtctPrsn() {
        if (othrBkCtctPrsn == null) {
            othrBkCtctPrsn = new ArrayList<>();
        }
        return this.othrBkCtctPrsn;
    }

}
