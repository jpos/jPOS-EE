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

package org.jpos.iso20022.seev_031_002_13;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DocumentIdentification38 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="DocumentIdentification38">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Id" type="{urn:iso:std:iso:20022:tech:xsd:seev.031.002.13}DocumentIdentification4Choice"/>
 *         <element name="DocNb" type="{urn:iso:std:iso:20022:tech:xsd:seev.031.002.13}DocumentNumber6Choice" minOccurs="0"/>
 *         <element name="LkgTp" type="{urn:iso:std:iso:20022:tech:xsd:seev.031.002.13}ProcessingPosition10Choice" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DocumentIdentification38", propOrder = {
    "id",
    "docNb",
    "lkgTp"
})
public class DocumentIdentification38 {

    @XmlElement(name = "Id", required = true)
    protected DocumentIdentification4Choice id;
    @XmlElement(name = "DocNb")
    protected DocumentNumber6Choice docNb;
    @XmlElement(name = "LkgTp")
    protected ProcessingPosition10Choice lkgTp;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentIdentification4Choice }
     *     
     */
    public DocumentIdentification4Choice getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentIdentification4Choice }
     *     
     */
    public void setId(DocumentIdentification4Choice value) {
        this.id = value;
    }

    /**
     * Gets the value of the docNb property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentNumber6Choice }
     *     
     */
    public DocumentNumber6Choice getDocNb() {
        return docNb;
    }

    /**
     * Sets the value of the docNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentNumber6Choice }
     *     
     */
    public void setDocNb(DocumentNumber6Choice value) {
        this.docNb = value;
    }

    /**
     * Gets the value of the lkgTp property.
     * 
     * @return
     *     possible object is
     *     {@link ProcessingPosition10Choice }
     *     
     */
    public ProcessingPosition10Choice getLkgTp() {
        return lkgTp;
    }

    /**
     * Sets the value of the lkgTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProcessingPosition10Choice }
     *     
     */
    public void setLkgTp(ProcessingPosition10Choice value) {
        this.lkgTp = value;
    }

}
