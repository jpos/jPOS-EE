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

package org.jpos.iso20022.tsmt_014_001_05;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DataSetSubmissionV05 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="DataSetSubmissionV05">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="SubmissnId" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.014.001.05}MessageIdentification1"/>
 *         <element name="RltdTxRefs" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.014.001.05}DataSetSubmissionReferences3" maxOccurs="unbounded"/>
 *         <element name="CmonSubmissnRef" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.014.001.05}SimpleIdentificationInformation"/>
 *         <element name="Instr" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.014.001.05}InstructionType3"/>
 *         <element name="BuyrBk" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.014.001.05}BICIdentification1"/>
 *         <element name="SellrBk" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.014.001.05}BICIdentification1"/>
 *         <element name="ComrclDataSet" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.014.001.05}CommercialDataSet5" minOccurs="0"/>
 *         <element name="TrnsprtDataSet" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.014.001.05}TransportDataSet5" minOccurs="0"/>
 *         <element name="InsrncDataSet" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.014.001.05}InsuranceDataSet1" minOccurs="0"/>
 *         <element name="CertDataSet" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.014.001.05}CertificateDataSet2" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="OthrCertDataSet" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.014.001.05}OtherCertificateDataSet2" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DataSetSubmissionV05", propOrder = {
    "submissnId",
    "rltdTxRefs",
    "cmonSubmissnRef",
    "instr",
    "buyrBk",
    "sellrBk",
    "comrclDataSet",
    "trnsprtDataSet",
    "insrncDataSet",
    "certDataSet",
    "othrCertDataSet"
})
public class DataSetSubmissionV05 {

    @XmlElement(name = "SubmissnId", required = true)
    protected MessageIdentification1 submissnId;
    @XmlElement(name = "RltdTxRefs", required = true)
    protected List<DataSetSubmissionReferences3> rltdTxRefs;
    @XmlElement(name = "CmonSubmissnRef", required = true)
    protected SimpleIdentificationInformation cmonSubmissnRef;
    @XmlElement(name = "Instr", required = true)
    protected InstructionType3 instr;
    @XmlElement(name = "BuyrBk", required = true)
    protected BICIdentification1 buyrBk;
    @XmlElement(name = "SellrBk", required = true)
    protected BICIdentification1 sellrBk;
    @XmlElement(name = "ComrclDataSet")
    protected CommercialDataSet5 comrclDataSet;
    @XmlElement(name = "TrnsprtDataSet")
    protected TransportDataSet5 trnsprtDataSet;
    @XmlElement(name = "InsrncDataSet")
    protected InsuranceDataSet1 insrncDataSet;
    @XmlElement(name = "CertDataSet")
    protected List<CertificateDataSet2> certDataSet;
    @XmlElement(name = "OthrCertDataSet")
    protected List<OtherCertificateDataSet2> othrCertDataSet;

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
     * Gets the value of the rltdTxRefs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the rltdTxRefs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRltdTxRefs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DataSetSubmissionReferences3 }
     * 
     * 
     * @return
     *     The value of the rltdTxRefs property.
     */
    public List<DataSetSubmissionReferences3> getRltdTxRefs() {
        if (rltdTxRefs == null) {
            rltdTxRefs = new ArrayList<>();
        }
        return this.rltdTxRefs;
    }

    /**
     * Gets the value of the cmonSubmissnRef property.
     * 
     * @return
     *     possible object is
     *     {@link SimpleIdentificationInformation }
     *     
     */
    public SimpleIdentificationInformation getCmonSubmissnRef() {
        return cmonSubmissnRef;
    }

    /**
     * Sets the value of the cmonSubmissnRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link SimpleIdentificationInformation }
     *     
     */
    public void setCmonSubmissnRef(SimpleIdentificationInformation value) {
        this.cmonSubmissnRef = value;
    }

    /**
     * Gets the value of the instr property.
     * 
     * @return
     *     possible object is
     *     {@link InstructionType3 }
     *     
     */
    public InstructionType3 getInstr() {
        return instr;
    }

    /**
     * Sets the value of the instr property.
     * 
     * @param value
     *     allowed object is
     *     {@link InstructionType3 }
     *     
     */
    public void setInstr(InstructionType3 value) {
        this.instr = value;
    }

    /**
     * Gets the value of the buyrBk property.
     * 
     * @return
     *     possible object is
     *     {@link BICIdentification1 }
     *     
     */
    public BICIdentification1 getBuyrBk() {
        return buyrBk;
    }

    /**
     * Sets the value of the buyrBk property.
     * 
     * @param value
     *     allowed object is
     *     {@link BICIdentification1 }
     *     
     */
    public void setBuyrBk(BICIdentification1 value) {
        this.buyrBk = value;
    }

    /**
     * Gets the value of the sellrBk property.
     * 
     * @return
     *     possible object is
     *     {@link BICIdentification1 }
     *     
     */
    public BICIdentification1 getSellrBk() {
        return sellrBk;
    }

    /**
     * Sets the value of the sellrBk property.
     * 
     * @param value
     *     allowed object is
     *     {@link BICIdentification1 }
     *     
     */
    public void setSellrBk(BICIdentification1 value) {
        this.sellrBk = value;
    }

    /**
     * Gets the value of the comrclDataSet property.
     * 
     * @return
     *     possible object is
     *     {@link CommercialDataSet5 }
     *     
     */
    public CommercialDataSet5 getComrclDataSet() {
        return comrclDataSet;
    }

    /**
     * Sets the value of the comrclDataSet property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommercialDataSet5 }
     *     
     */
    public void setComrclDataSet(CommercialDataSet5 value) {
        this.comrclDataSet = value;
    }

    /**
     * Gets the value of the trnsprtDataSet property.
     * 
     * @return
     *     possible object is
     *     {@link TransportDataSet5 }
     *     
     */
    public TransportDataSet5 getTrnsprtDataSet() {
        return trnsprtDataSet;
    }

    /**
     * Sets the value of the trnsprtDataSet property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransportDataSet5 }
     *     
     */
    public void setTrnsprtDataSet(TransportDataSet5 value) {
        this.trnsprtDataSet = value;
    }

    /**
     * Gets the value of the insrncDataSet property.
     * 
     * @return
     *     possible object is
     *     {@link InsuranceDataSet1 }
     *     
     */
    public InsuranceDataSet1 getInsrncDataSet() {
        return insrncDataSet;
    }

    /**
     * Sets the value of the insrncDataSet property.
     * 
     * @param value
     *     allowed object is
     *     {@link InsuranceDataSet1 }
     *     
     */
    public void setInsrncDataSet(InsuranceDataSet1 value) {
        this.insrncDataSet = value;
    }

    /**
     * Gets the value of the certDataSet property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the certDataSet property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCertDataSet().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CertificateDataSet2 }
     * 
     * 
     * @return
     *     The value of the certDataSet property.
     */
    public List<CertificateDataSet2> getCertDataSet() {
        if (certDataSet == null) {
            certDataSet = new ArrayList<>();
        }
        return this.certDataSet;
    }

    /**
     * Gets the value of the othrCertDataSet property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the othrCertDataSet property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOthrCertDataSet().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OtherCertificateDataSet2 }
     * 
     * 
     * @return
     *     The value of the othrCertDataSet property.
     */
    public List<OtherCertificateDataSet2> getOthrCertDataSet() {
        if (othrCertDataSet == null) {
            othrCertDataSet = new ArrayList<>();
        }
        return this.othrCertDataSet;
    }

}
