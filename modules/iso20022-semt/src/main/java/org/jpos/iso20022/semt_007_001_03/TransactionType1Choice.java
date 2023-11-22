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

package org.jpos.iso20022.semt_007_001_03;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TransactionType1Choice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="TransactionType1Choice">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <choice>
 *           <element name="TxTp" type="{urn:swift:xsd:semt.007.001.03}TransactionType2Choice"/>
 *           <element name="CorpActnTp" type="{urn:swift:xsd:semt.007.001.03}CorporateAction1Choice"/>
 *         </choice>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransactionType1Choice", propOrder = {
    "txTp",
    "corpActnTp"
})
public class TransactionType1Choice {

    @XmlElement(name = "TxTp")
    protected TransactionType2Choice txTp;
    @XmlElement(name = "CorpActnTp")
    protected CorporateAction1Choice corpActnTp;

    /**
     * Gets the value of the txTp property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionType2Choice }
     *     
     */
    public TransactionType2Choice getTxTp() {
        return txTp;
    }

    /**
     * Sets the value of the txTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionType2Choice }
     *     
     */
    public void setTxTp(TransactionType2Choice value) {
        this.txTp = value;
    }

    /**
     * Gets the value of the corpActnTp property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateAction1Choice }
     *     
     */
    public CorporateAction1Choice getCorpActnTp() {
        return corpActnTp;
    }

    /**
     * Sets the value of the corpActnTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateAction1Choice }
     *     
     */
    public void setCorpActnTp(CorporateAction1Choice value) {
        this.corpActnTp = value;
    }

}
