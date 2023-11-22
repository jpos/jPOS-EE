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

package org.jpos.iso20022.auth_105_001_01;

import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NamedPosition3 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="NamedPosition3">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="RefDt" type="{urn:iso:std:iso:20022:tech:xsd:auth.105.001.01}ISODate"/>
 *         <element name="GnlInf" type="{urn:iso:std:iso:20022:tech:xsd:auth.105.001.01}PositionSet16" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="Ln" type="{urn:iso:std:iso:20022:tech:xsd:auth.105.001.01}PositionSet17" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="Coll" type="{urn:iso:std:iso:20022:tech:xsd:auth.105.001.01}PositionSet18" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="Mrgn" type="{urn:iso:std:iso:20022:tech:xsd:auth.105.001.01}PositionSet20" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="Reuse" type="{urn:iso:std:iso:20022:tech:xsd:auth.105.001.01}PositionSet19" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NamedPosition3", propOrder = {
    "refDt",
    "gnlInf",
    "ln",
    "coll",
    "mrgn",
    "reuse"
})
public class NamedPosition3 {

    @XmlElement(name = "RefDt", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar refDt;
    @XmlElement(name = "GnlInf")
    protected List<PositionSet16> gnlInf;
    @XmlElement(name = "Ln")
    protected List<PositionSet17> ln;
    @XmlElement(name = "Coll")
    protected List<PositionSet18> coll;
    @XmlElement(name = "Mrgn")
    protected List<PositionSet20> mrgn;
    @XmlElement(name = "Reuse")
    protected List<PositionSet19> reuse;

    /**
     * Gets the value of the refDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRefDt() {
        return refDt;
    }

    /**
     * Sets the value of the refDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRefDt(XMLGregorianCalendar value) {
        this.refDt = value;
    }

    /**
     * Gets the value of the gnlInf property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the gnlInf property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGnlInf().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PositionSet16 }
     * 
     * 
     * @return
     *     The value of the gnlInf property.
     */
    public List<PositionSet16> getGnlInf() {
        if (gnlInf == null) {
            gnlInf = new ArrayList<>();
        }
        return this.gnlInf;
    }

    /**
     * Gets the value of the ln property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the ln property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PositionSet17 }
     * 
     * 
     * @return
     *     The value of the ln property.
     */
    public List<PositionSet17> getLn() {
        if (ln == null) {
            ln = new ArrayList<>();
        }
        return this.ln;
    }

    /**
     * Gets the value of the coll property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the coll property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getColl().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PositionSet18 }
     * 
     * 
     * @return
     *     The value of the coll property.
     */
    public List<PositionSet18> getColl() {
        if (coll == null) {
            coll = new ArrayList<>();
        }
        return this.coll;
    }

    /**
     * Gets the value of the mrgn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the mrgn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMrgn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PositionSet20 }
     * 
     * 
     * @return
     *     The value of the mrgn property.
     */
    public List<PositionSet20> getMrgn() {
        if (mrgn == null) {
            mrgn = new ArrayList<>();
        }
        return this.mrgn;
    }

    /**
     * Gets the value of the reuse property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the reuse property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReuse().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PositionSet19 }
     * 
     * 
     * @return
     *     The value of the reuse property.
     */
    public List<PositionSet19> getReuse() {
        if (reuse == null) {
            reuse = new ArrayList<>();
        }
        return this.reuse;
    }

}
