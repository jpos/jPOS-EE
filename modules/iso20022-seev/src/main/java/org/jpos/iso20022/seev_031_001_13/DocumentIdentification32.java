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

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DocumentIdentification32 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="DocumentIdentification32">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Id" type="{urn:iso:std:iso:20022:tech:xsd:seev.031.001.13}DocumentIdentification3Choice"/>
 *         <element name="DocNb" type="{urn:iso:std:iso:20022:tech:xsd:seev.031.001.13}DocumentNumber5Choice" minOccurs="0"/>
 *         <element name="LkgTp" type="{urn:iso:std:iso:20022:tech:xsd:seev.031.001.13}ProcessingPosition7Choice" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DocumentIdentification32", propOrder = {
    "id",
    "docNb",
    "lkgTp"
})
public class DocumentIdentification32 {

    @XmlElement(name = "Id", required = true)
    protected DocumentIdentification3Choice id;
    @XmlElement(name = "DocNb")
    protected DocumentNumber5Choice docNb;
    @XmlElement(name = "LkgTp")
    protected ProcessingPosition7Choice lkgTp;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentIdentification3Choice }
     *     
     */
    public DocumentIdentification3Choice getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentIdentification3Choice }
     *     
     */
    public void setId(DocumentIdentification3Choice value) {
        this.id = value;
    }

    /**
     * Gets the value of the docNb property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentNumber5Choice }
     *     
     */
    public DocumentNumber5Choice getDocNb() {
        return docNb;
    }

    /**
     * Sets the value of the docNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentNumber5Choice }
     *     
     */
    public void setDocNb(DocumentNumber5Choice value) {
        this.docNb = value;
    }

    /**
     * Gets the value of the lkgTp property.
     * 
     * @return
     *     possible object is
     *     {@link ProcessingPosition7Choice }
     *     
     */
    public ProcessingPosition7Choice getLkgTp() {
        return lkgTp;
    }

    /**
     * Sets the value of the lkgTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProcessingPosition7Choice }
     *     
     */
    public void setLkgTp(ProcessingPosition7Choice value) {
        this.lkgTp = value;
    }

}
