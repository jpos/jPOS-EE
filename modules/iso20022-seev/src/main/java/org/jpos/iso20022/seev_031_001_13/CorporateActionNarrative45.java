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

package org.jpos.iso20022.seev_031_001_13;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CorporateActionNarrative45 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="CorporateActionNarrative45">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="AddtlTxt" type="{urn:iso:std:iso:20022:tech:xsd:seev.031.001.13}UpdatedAdditionalInformation12" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="NrrtvVrsn" type="{urn:iso:std:iso:20022:tech:xsd:seev.031.001.13}UpdatedAdditionalInformation12" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="InfConds" type="{urn:iso:std:iso:20022:tech:xsd:seev.031.001.13}UpdatedAdditionalInformation11" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="InfToCmplyWth" type="{urn:iso:std:iso:20022:tech:xsd:seev.031.001.13}UpdatedAdditionalInformation11" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="SctyRstrctn" type="{urn:iso:std:iso:20022:tech:xsd:seev.031.001.13}UpdatedAdditionalInformation11" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="TaxtnConds" type="{urn:iso:std:iso:20022:tech:xsd:seev.031.001.13}UpdatedAdditionalInformation11" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="Dsclmr" type="{urn:iso:std:iso:20022:tech:xsd:seev.031.001.13}UpdatedAdditionalInformation11" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="CertfctnBrkdwn" type="{urn:iso:std:iso:20022:tech:xsd:seev.031.001.13}UpdatedAdditionalInformation11" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CorporateActionNarrative45", propOrder = {
    "addtlTxt",
    "nrrtvVrsn",
    "infConds",
    "infToCmplyWth",
    "sctyRstrctn",
    "taxtnConds",
    "dsclmr",
    "certfctnBrkdwn"
})
public class CorporateActionNarrative45 {

    @XmlElement(name = "AddtlTxt")
    protected List<UpdatedAdditionalInformation12> addtlTxt;
    @XmlElement(name = "NrrtvVrsn")
    protected List<UpdatedAdditionalInformation12> nrrtvVrsn;
    @XmlElement(name = "InfConds")
    protected List<UpdatedAdditionalInformation11> infConds;
    @XmlElement(name = "InfToCmplyWth")
    protected List<UpdatedAdditionalInformation11> infToCmplyWth;
    @XmlElement(name = "SctyRstrctn")
    protected List<UpdatedAdditionalInformation11> sctyRstrctn;
    @XmlElement(name = "TaxtnConds")
    protected List<UpdatedAdditionalInformation11> taxtnConds;
    @XmlElement(name = "Dsclmr")
    protected List<UpdatedAdditionalInformation11> dsclmr;
    @XmlElement(name = "CertfctnBrkdwn")
    protected List<UpdatedAdditionalInformation11> certfctnBrkdwn;

    /**
     * Gets the value of the addtlTxt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the addtlTxt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddtlTxt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UpdatedAdditionalInformation12 }
     * 
     * 
     * @return
     *     The value of the addtlTxt property.
     */
    public List<UpdatedAdditionalInformation12> getAddtlTxt() {
        if (addtlTxt == null) {
            addtlTxt = new ArrayList<>();
        }
        return this.addtlTxt;
    }

    /**
     * Gets the value of the nrrtvVrsn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the nrrtvVrsn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNrrtvVrsn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UpdatedAdditionalInformation12 }
     * 
     * 
     * @return
     *     The value of the nrrtvVrsn property.
     */
    public List<UpdatedAdditionalInformation12> getNrrtvVrsn() {
        if (nrrtvVrsn == null) {
            nrrtvVrsn = new ArrayList<>();
        }
        return this.nrrtvVrsn;
    }

    /**
     * Gets the value of the infConds property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the infConds property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInfConds().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UpdatedAdditionalInformation11 }
     * 
     * 
     * @return
     *     The value of the infConds property.
     */
    public List<UpdatedAdditionalInformation11> getInfConds() {
        if (infConds == null) {
            infConds = new ArrayList<>();
        }
        return this.infConds;
    }

    /**
     * Gets the value of the infToCmplyWth property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the infToCmplyWth property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInfToCmplyWth().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UpdatedAdditionalInformation11 }
     * 
     * 
     * @return
     *     The value of the infToCmplyWth property.
     */
    public List<UpdatedAdditionalInformation11> getInfToCmplyWth() {
        if (infToCmplyWth == null) {
            infToCmplyWth = new ArrayList<>();
        }
        return this.infToCmplyWth;
    }

    /**
     * Gets the value of the sctyRstrctn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the sctyRstrctn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSctyRstrctn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UpdatedAdditionalInformation11 }
     * 
     * 
     * @return
     *     The value of the sctyRstrctn property.
     */
    public List<UpdatedAdditionalInformation11> getSctyRstrctn() {
        if (sctyRstrctn == null) {
            sctyRstrctn = new ArrayList<>();
        }
        return this.sctyRstrctn;
    }

    /**
     * Gets the value of the taxtnConds property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the taxtnConds property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTaxtnConds().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UpdatedAdditionalInformation11 }
     * 
     * 
     * @return
     *     The value of the taxtnConds property.
     */
    public List<UpdatedAdditionalInformation11> getTaxtnConds() {
        if (taxtnConds == null) {
            taxtnConds = new ArrayList<>();
        }
        return this.taxtnConds;
    }

    /**
     * Gets the value of the dsclmr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the dsclmr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDsclmr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UpdatedAdditionalInformation11 }
     * 
     * 
     * @return
     *     The value of the dsclmr property.
     */
    public List<UpdatedAdditionalInformation11> getDsclmr() {
        if (dsclmr == null) {
            dsclmr = new ArrayList<>();
        }
        return this.dsclmr;
    }

    /**
     * Gets the value of the certfctnBrkdwn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the certfctnBrkdwn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCertfctnBrkdwn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UpdatedAdditionalInformation11 }
     * 
     * 
     * @return
     *     The value of the certfctnBrkdwn property.
     */
    public List<UpdatedAdditionalInformation11> getCertfctnBrkdwn() {
        if (certfctnBrkdwn == null) {
            certfctnBrkdwn = new ArrayList<>();
        }
        return this.certfctnBrkdwn;
    }

}
