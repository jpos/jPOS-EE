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

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InvestmentFundTransactionsByFund3 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="InvestmentFundTransactionsByFund3">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Id" type="{urn:swift:xsd:semt.007.001.03}SecurityIdentification3Choice"/>
 *         <element name="Nm" type="{urn:swift:xsd:semt.007.001.03}Max350Text" minOccurs="0"/>
 *         <element name="SplmtryId" type="{urn:swift:xsd:semt.007.001.03}Max35Text" minOccurs="0"/>
 *         <element name="SctiesForm" type="{urn:swift:xsd:semt.007.001.03}FormOfSecurity1Code" minOccurs="0"/>
 *         <element name="ClssTp" type="{urn:swift:xsd:semt.007.001.03}Max35Text" minOccurs="0"/>
 *         <element name="DstrbtnPlcy" type="{urn:swift:xsd:semt.007.001.03}DistributionPolicy1Code" minOccurs="0"/>
 *         <element name="TxDtls" type="{urn:swift:xsd:semt.007.001.03}InvestmentFundTransaction4" maxOccurs="unbounded"/>
 *         <element name="BalByPg" type="{urn:swift:xsd:semt.007.001.03}PaginationBalance2" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InvestmentFundTransactionsByFund3", propOrder = {
    "id",
    "nm",
    "splmtryId",
    "sctiesForm",
    "clssTp",
    "dstrbtnPlcy",
    "txDtls",
    "balByPg"
})
public class InvestmentFundTransactionsByFund3 {

    @XmlElement(name = "Id", required = true)
    protected SecurityIdentification3Choice id;
    @XmlElement(name = "Nm")
    protected String nm;
    @XmlElement(name = "SplmtryId")
    protected String splmtryId;
    @XmlElement(name = "SctiesForm")
    @XmlSchemaType(name = "string")
    protected FormOfSecurity1Code sctiesForm;
    @XmlElement(name = "ClssTp")
    protected String clssTp;
    @XmlElement(name = "DstrbtnPlcy")
    @XmlSchemaType(name = "string")
    protected DistributionPolicy1Code dstrbtnPlcy;
    @XmlElement(name = "TxDtls", required = true)
    protected List<InvestmentFundTransaction4> txDtls;
    @XmlElement(name = "BalByPg")
    protected PaginationBalance2 balByPg;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityIdentification3Choice }
     *     
     */
    public SecurityIdentification3Choice getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityIdentification3Choice }
     *     
     */
    public void setId(SecurityIdentification3Choice value) {
        this.id = value;
    }

    /**
     * Gets the value of the nm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNm() {
        return nm;
    }

    /**
     * Sets the value of the nm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNm(String value) {
        this.nm = value;
    }

    /**
     * Gets the value of the splmtryId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSplmtryId() {
        return splmtryId;
    }

    /**
     * Sets the value of the splmtryId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSplmtryId(String value) {
        this.splmtryId = value;
    }

    /**
     * Gets the value of the sctiesForm property.
     * 
     * @return
     *     possible object is
     *     {@link FormOfSecurity1Code }
     *     
     */
    public FormOfSecurity1Code getSctiesForm() {
        return sctiesForm;
    }

    /**
     * Sets the value of the sctiesForm property.
     * 
     * @param value
     *     allowed object is
     *     {@link FormOfSecurity1Code }
     *     
     */
    public void setSctiesForm(FormOfSecurity1Code value) {
        this.sctiesForm = value;
    }

    /**
     * Gets the value of the clssTp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClssTp() {
        return clssTp;
    }

    /**
     * Sets the value of the clssTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClssTp(String value) {
        this.clssTp = value;
    }

    /**
     * Gets the value of the dstrbtnPlcy property.
     * 
     * @return
     *     possible object is
     *     {@link DistributionPolicy1Code }
     *     
     */
    public DistributionPolicy1Code getDstrbtnPlcy() {
        return dstrbtnPlcy;
    }

    /**
     * Sets the value of the dstrbtnPlcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link DistributionPolicy1Code }
     *     
     */
    public void setDstrbtnPlcy(DistributionPolicy1Code value) {
        this.dstrbtnPlcy = value;
    }

    /**
     * Gets the value of the txDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the txDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTxDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InvestmentFundTransaction4 }
     * 
     * 
     * @return
     *     The value of the txDtls property.
     */
    public List<InvestmentFundTransaction4> getTxDtls() {
        if (txDtls == null) {
            txDtls = new ArrayList<>();
        }
        return this.txDtls;
    }

    /**
     * Gets the value of the balByPg property.
     * 
     * @return
     *     possible object is
     *     {@link PaginationBalance2 }
     *     
     */
    public PaginationBalance2 getBalByPg() {
        return balByPg;
    }

    /**
     * Sets the value of the balByPg property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaginationBalance2 }
     *     
     */
    public void setBalByPg(PaginationBalance2 value) {
        this.balByPg = value;
    }

}
