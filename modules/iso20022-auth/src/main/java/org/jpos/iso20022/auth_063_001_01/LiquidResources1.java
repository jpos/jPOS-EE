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

package org.jpos.iso20022.auth_063_001_01;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LiquidResources1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="LiquidResources1">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="CshDue" type="{urn:iso:std:iso:20022:tech:xsd:auth.063.001.01}LiquidResourceInformation1" maxOccurs="unbounded"/>
 *         <element name="FcltiesCmmtdLinesOfCdt" type="{urn:iso:std:iso:20022:tech:xsd:auth.063.001.01}LiquidResourceInformation1" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="FcltiesCmmtdRpAgrmts" type="{urn:iso:std:iso:20022:tech:xsd:auth.063.001.01}LiquidResourceInformation1" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="FcltiesCmmtdFxSwps" type="{urn:iso:std:iso:20022:tech:xsd:auth.063.001.01}LiquidResourceInformation1" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="FcltiesOthrCmmtd" type="{urn:iso:std:iso:20022:tech:xsd:auth.063.001.01}LiquidResourceInformation1" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="FcltiesUcmmtd" type="{urn:iso:std:iso:20022:tech:xsd:auth.063.001.01}LiquidResourceInformation1" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="FinInstrmsCCP" type="{urn:iso:std:iso:20022:tech:xsd:auth.063.001.01}LiquidResourceInformation1" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="FinInstrmsTrsrInvstmts" type="{urn:iso:std:iso:20022:tech:xsd:auth.063.001.01}LiquidResourceInformation1" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="FinInstrmsDfltrsSttlmColl" type="{urn:iso:std:iso:20022:tech:xsd:auth.063.001.01}LiquidResourceInformation1" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="FinInstrmsDfltrsNonCshColl" type="{urn:iso:std:iso:20022:tech:xsd:auth.063.001.01}LiquidResourceInformation1" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LiquidResources1", propOrder = {
    "cshDue",
    "fcltiesCmmtdLinesOfCdt",
    "fcltiesCmmtdRpAgrmts",
    "fcltiesCmmtdFxSwps",
    "fcltiesOthrCmmtd",
    "fcltiesUcmmtd",
    "finInstrmsCCP",
    "finInstrmsTrsrInvstmts",
    "finInstrmsDfltrsSttlmColl",
    "finInstrmsDfltrsNonCshColl"
})
public class LiquidResources1 {

    @XmlElement(name = "CshDue", required = true)
    protected List<LiquidResourceInformation1> cshDue;
    @XmlElement(name = "FcltiesCmmtdLinesOfCdt")
    protected List<LiquidResourceInformation1> fcltiesCmmtdLinesOfCdt;
    @XmlElement(name = "FcltiesCmmtdRpAgrmts")
    protected List<LiquidResourceInformation1> fcltiesCmmtdRpAgrmts;
    @XmlElement(name = "FcltiesCmmtdFxSwps")
    protected List<LiquidResourceInformation1> fcltiesCmmtdFxSwps;
    @XmlElement(name = "FcltiesOthrCmmtd")
    protected List<LiquidResourceInformation1> fcltiesOthrCmmtd;
    @XmlElement(name = "FcltiesUcmmtd")
    protected List<LiquidResourceInformation1> fcltiesUcmmtd;
    @XmlElement(name = "FinInstrmsCCP")
    protected List<LiquidResourceInformation1> finInstrmsCCP;
    @XmlElement(name = "FinInstrmsTrsrInvstmts")
    protected List<LiquidResourceInformation1> finInstrmsTrsrInvstmts;
    @XmlElement(name = "FinInstrmsDfltrsSttlmColl")
    protected List<LiquidResourceInformation1> finInstrmsDfltrsSttlmColl;
    @XmlElement(name = "FinInstrmsDfltrsNonCshColl")
    protected List<LiquidResourceInformation1> finInstrmsDfltrsNonCshColl;

    /**
     * Gets the value of the cshDue property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the cshDue property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCshDue().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LiquidResourceInformation1 }
     * 
     * 
     * @return
     *     The value of the cshDue property.
     */
    public List<LiquidResourceInformation1> getCshDue() {
        if (cshDue == null) {
            cshDue = new ArrayList<>();
        }
        return this.cshDue;
    }

    /**
     * Gets the value of the fcltiesCmmtdLinesOfCdt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the fcltiesCmmtdLinesOfCdt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFcltiesCmmtdLinesOfCdt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LiquidResourceInformation1 }
     * 
     * 
     * @return
     *     The value of the fcltiesCmmtdLinesOfCdt property.
     */
    public List<LiquidResourceInformation1> getFcltiesCmmtdLinesOfCdt() {
        if (fcltiesCmmtdLinesOfCdt == null) {
            fcltiesCmmtdLinesOfCdt = new ArrayList<>();
        }
        return this.fcltiesCmmtdLinesOfCdt;
    }

    /**
     * Gets the value of the fcltiesCmmtdRpAgrmts property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the fcltiesCmmtdRpAgrmts property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFcltiesCmmtdRpAgrmts().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LiquidResourceInformation1 }
     * 
     * 
     * @return
     *     The value of the fcltiesCmmtdRpAgrmts property.
     */
    public List<LiquidResourceInformation1> getFcltiesCmmtdRpAgrmts() {
        if (fcltiesCmmtdRpAgrmts == null) {
            fcltiesCmmtdRpAgrmts = new ArrayList<>();
        }
        return this.fcltiesCmmtdRpAgrmts;
    }

    /**
     * Gets the value of the fcltiesCmmtdFxSwps property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the fcltiesCmmtdFxSwps property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFcltiesCmmtdFxSwps().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LiquidResourceInformation1 }
     * 
     * 
     * @return
     *     The value of the fcltiesCmmtdFxSwps property.
     */
    public List<LiquidResourceInformation1> getFcltiesCmmtdFxSwps() {
        if (fcltiesCmmtdFxSwps == null) {
            fcltiesCmmtdFxSwps = new ArrayList<>();
        }
        return this.fcltiesCmmtdFxSwps;
    }

    /**
     * Gets the value of the fcltiesOthrCmmtd property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the fcltiesOthrCmmtd property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFcltiesOthrCmmtd().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LiquidResourceInformation1 }
     * 
     * 
     * @return
     *     The value of the fcltiesOthrCmmtd property.
     */
    public List<LiquidResourceInformation1> getFcltiesOthrCmmtd() {
        if (fcltiesOthrCmmtd == null) {
            fcltiesOthrCmmtd = new ArrayList<>();
        }
        return this.fcltiesOthrCmmtd;
    }

    /**
     * Gets the value of the fcltiesUcmmtd property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the fcltiesUcmmtd property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFcltiesUcmmtd().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LiquidResourceInformation1 }
     * 
     * 
     * @return
     *     The value of the fcltiesUcmmtd property.
     */
    public List<LiquidResourceInformation1> getFcltiesUcmmtd() {
        if (fcltiesUcmmtd == null) {
            fcltiesUcmmtd = new ArrayList<>();
        }
        return this.fcltiesUcmmtd;
    }

    /**
     * Gets the value of the finInstrmsCCP property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the finInstrmsCCP property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFinInstrmsCCP().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LiquidResourceInformation1 }
     * 
     * 
     * @return
     *     The value of the finInstrmsCCP property.
     */
    public List<LiquidResourceInformation1> getFinInstrmsCCP() {
        if (finInstrmsCCP == null) {
            finInstrmsCCP = new ArrayList<>();
        }
        return this.finInstrmsCCP;
    }

    /**
     * Gets the value of the finInstrmsTrsrInvstmts property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the finInstrmsTrsrInvstmts property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFinInstrmsTrsrInvstmts().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LiquidResourceInformation1 }
     * 
     * 
     * @return
     *     The value of the finInstrmsTrsrInvstmts property.
     */
    public List<LiquidResourceInformation1> getFinInstrmsTrsrInvstmts() {
        if (finInstrmsTrsrInvstmts == null) {
            finInstrmsTrsrInvstmts = new ArrayList<>();
        }
        return this.finInstrmsTrsrInvstmts;
    }

    /**
     * Gets the value of the finInstrmsDfltrsSttlmColl property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the finInstrmsDfltrsSttlmColl property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFinInstrmsDfltrsSttlmColl().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LiquidResourceInformation1 }
     * 
     * 
     * @return
     *     The value of the finInstrmsDfltrsSttlmColl property.
     */
    public List<LiquidResourceInformation1> getFinInstrmsDfltrsSttlmColl() {
        if (finInstrmsDfltrsSttlmColl == null) {
            finInstrmsDfltrsSttlmColl = new ArrayList<>();
        }
        return this.finInstrmsDfltrsSttlmColl;
    }

    /**
     * Gets the value of the finInstrmsDfltrsNonCshColl property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the finInstrmsDfltrsNonCshColl property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFinInstrmsDfltrsNonCshColl().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LiquidResourceInformation1 }
     * 
     * 
     * @return
     *     The value of the finInstrmsDfltrsNonCshColl property.
     */
    public List<LiquidResourceInformation1> getFinInstrmsDfltrsNonCshColl() {
        if (finInstrmsDfltrsNonCshColl == null) {
            finInstrmsDfltrsNonCshColl = new ArrayList<>();
        }
        return this.finInstrmsDfltrsNonCshColl;
    }

}
