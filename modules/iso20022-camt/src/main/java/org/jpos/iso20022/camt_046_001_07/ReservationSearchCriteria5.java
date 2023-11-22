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

package org.jpos.iso20022.camt_046_001_07;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReservationSearchCriteria5 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ReservationSearchCriteria5">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="DtTm" type="{urn:iso:std:iso:20022:tech:xsd:camt.046.001.07}DateTimeSearch2Choice" minOccurs="0"/>
 *         <element name="SysId" type="{urn:iso:std:iso:20022:tech:xsd:camt.046.001.07}SystemIdentification2Choice" minOccurs="0"/>
 *         <element name="DfltRsvatnTp" type="{urn:iso:std:iso:20022:tech:xsd:camt.046.001.07}ReservationType2Choice" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="CurRsvatnTp" type="{urn:iso:std:iso:20022:tech:xsd:camt.046.001.07}ReservationType2Choice" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="AcctOwnr" type="{urn:iso:std:iso:20022:tech:xsd:camt.046.001.07}BranchAndFinancialInstitutionIdentification6" minOccurs="0"/>
 *         <element name="AcctId" type="{urn:iso:std:iso:20022:tech:xsd:camt.046.001.07}AccountIdentification4Choice" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReservationSearchCriteria5", propOrder = {
    "dtTm",
    "sysId",
    "dfltRsvatnTp",
    "curRsvatnTp",
    "acctOwnr",
    "acctId"
})
public class ReservationSearchCriteria5 {

    @XmlElement(name = "DtTm")
    protected DateTimeSearch2Choice dtTm;
    @XmlElement(name = "SysId")
    protected SystemIdentification2Choice sysId;
    @XmlElement(name = "DfltRsvatnTp")
    protected List<ReservationType2Choice> dfltRsvatnTp;
    @XmlElement(name = "CurRsvatnTp")
    protected List<ReservationType2Choice> curRsvatnTp;
    @XmlElement(name = "AcctOwnr")
    protected BranchAndFinancialInstitutionIdentification6 acctOwnr;
    @XmlElement(name = "AcctId")
    protected AccountIdentification4Choice acctId;

    /**
     * Gets the value of the dtTm property.
     * 
     * @return
     *     possible object is
     *     {@link DateTimeSearch2Choice }
     *     
     */
    public DateTimeSearch2Choice getDtTm() {
        return dtTm;
    }

    /**
     * Sets the value of the dtTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimeSearch2Choice }
     *     
     */
    public void setDtTm(DateTimeSearch2Choice value) {
        this.dtTm = value;
    }

    /**
     * Gets the value of the sysId property.
     * 
     * @return
     *     possible object is
     *     {@link SystemIdentification2Choice }
     *     
     */
    public SystemIdentification2Choice getSysId() {
        return sysId;
    }

    /**
     * Sets the value of the sysId property.
     * 
     * @param value
     *     allowed object is
     *     {@link SystemIdentification2Choice }
     *     
     */
    public void setSysId(SystemIdentification2Choice value) {
        this.sysId = value;
    }

    /**
     * Gets the value of the dfltRsvatnTp property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the dfltRsvatnTp property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDfltRsvatnTp().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReservationType2Choice }
     * 
     * 
     * @return
     *     The value of the dfltRsvatnTp property.
     */
    public List<ReservationType2Choice> getDfltRsvatnTp() {
        if (dfltRsvatnTp == null) {
            dfltRsvatnTp = new ArrayList<>();
        }
        return this.dfltRsvatnTp;
    }

    /**
     * Gets the value of the curRsvatnTp property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the curRsvatnTp property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCurRsvatnTp().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReservationType2Choice }
     * 
     * 
     * @return
     *     The value of the curRsvatnTp property.
     */
    public List<ReservationType2Choice> getCurRsvatnTp() {
        if (curRsvatnTp == null) {
            curRsvatnTp = new ArrayList<>();
        }
        return this.curRsvatnTp;
    }

    /**
     * Gets the value of the acctOwnr property.
     * 
     * @return
     *     possible object is
     *     {@link BranchAndFinancialInstitutionIdentification6 }
     *     
     */
    public BranchAndFinancialInstitutionIdentification6 getAcctOwnr() {
        return acctOwnr;
    }

    /**
     * Sets the value of the acctOwnr property.
     * 
     * @param value
     *     allowed object is
     *     {@link BranchAndFinancialInstitutionIdentification6 }
     *     
     */
    public void setAcctOwnr(BranchAndFinancialInstitutionIdentification6 value) {
        this.acctOwnr = value;
    }

    /**
     * Gets the value of the acctId property.
     * 
     * @return
     *     possible object is
     *     {@link AccountIdentification4Choice }
     *     
     */
    public AccountIdentification4Choice getAcctId() {
        return acctId;
    }

    /**
     * Sets the value of the acctId property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountIdentification4Choice }
     *     
     */
    public void setAcctId(AccountIdentification4Choice value) {
        this.acctId = value;
    }

}
