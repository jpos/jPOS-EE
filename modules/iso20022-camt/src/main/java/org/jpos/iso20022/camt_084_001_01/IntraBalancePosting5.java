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

package org.jpos.iso20022.camt_084_001_01;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IntraBalancePosting5 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="IntraBalancePosting5">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="BalFr" type="{urn:iso:std:iso:20022:tech:xsd:camt.084.001.01}CashSubBalanceTypeAndQuantityBreakdown3"/>
 *         <element name="Mvmnt" type="{urn:iso:std:iso:20022:tech:xsd:camt.084.001.01}IntraBalancePosting6" maxOccurs="unbounded"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IntraBalancePosting5", propOrder = {
    "balFr",
    "mvmnt"
})
public class IntraBalancePosting5 {

    @XmlElement(name = "BalFr", required = true)
    protected CashSubBalanceTypeAndQuantityBreakdown3 balFr;
    @XmlElement(name = "Mvmnt", required = true)
    protected List<IntraBalancePosting6> mvmnt;

    /**
     * Gets the value of the balFr property.
     * 
     * @return
     *     possible object is
     *     {@link CashSubBalanceTypeAndQuantityBreakdown3 }
     *     
     */
    public CashSubBalanceTypeAndQuantityBreakdown3 getBalFr() {
        return balFr;
    }

    /**
     * Sets the value of the balFr property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashSubBalanceTypeAndQuantityBreakdown3 }
     *     
     */
    public void setBalFr(CashSubBalanceTypeAndQuantityBreakdown3 value) {
        this.balFr = value;
    }

    /**
     * Gets the value of the mvmnt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the mvmnt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMvmnt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IntraBalancePosting6 }
     * 
     * 
     * @return
     *     The value of the mvmnt property.
     */
    public List<IntraBalancePosting6> getMvmnt() {
        if (mvmnt == null) {
            mvmnt = new ArrayList<>();
        }
        return this.mvmnt;
    }

}
