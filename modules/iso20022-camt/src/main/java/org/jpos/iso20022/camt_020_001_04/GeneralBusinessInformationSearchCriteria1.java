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

package org.jpos.iso20022.camt_020_001_04;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GeneralBusinessInformationSearchCriteria1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="GeneralBusinessInformationSearchCriteria1">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Ref" type="{urn:iso:std:iso:20022:tech:xsd:camt.020.001.04}Max35Text" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="Sbjt" type="{urn:iso:std:iso:20022:tech:xsd:camt.020.001.04}CharacterSearch1Choice" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="Qlfr" type="{urn:iso:std:iso:20022:tech:xsd:camt.020.001.04}InformationQualifierType1" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GeneralBusinessInformationSearchCriteria1", propOrder = {
    "ref",
    "sbjt",
    "qlfr"
})
public class GeneralBusinessInformationSearchCriteria1 {

    @XmlElement(name = "Ref")
    protected List<String> ref;
    @XmlElement(name = "Sbjt")
    protected List<CharacterSearch1Choice> sbjt;
    @XmlElement(name = "Qlfr")
    protected List<InformationQualifierType1> qlfr;

    /**
     * Gets the value of the ref property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the ref property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     * @return
     *     The value of the ref property.
     */
    public List<String> getRef() {
        if (ref == null) {
            ref = new ArrayList<>();
        }
        return this.ref;
    }

    /**
     * Gets the value of the sbjt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the sbjt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSbjt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CharacterSearch1Choice }
     * 
     * 
     * @return
     *     The value of the sbjt property.
     */
    public List<CharacterSearch1Choice> getSbjt() {
        if (sbjt == null) {
            sbjt = new ArrayList<>();
        }
        return this.sbjt;
    }

    /**
     * Gets the value of the qlfr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the qlfr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getQlfr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InformationQualifierType1 }
     * 
     * 
     * @return
     *     The value of the qlfr property.
     */
    public List<InformationQualifierType1> getQlfr() {
        if (qlfr == null) {
            qlfr = new ArrayList<>();
        }
        return this.qlfr;
    }

}
