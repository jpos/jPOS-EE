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

package org.jpos.iso20022.auth_086_001_02;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.jpos.iso20022.auth_086_001_02 package. 
 * <p>An ObjectFactory allows you to programmatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private static final QName _Document_QNAME = new QName("urn:iso:std:iso:20022:tech:xsd:auth.086.001.02", "Document");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.jpos.iso20022.auth_086_001_02
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Document }
     * 
     * @return
     *     the new instance of {@link Document }
     */
    public Document createDocument() {
        return new Document();
    }

    /**
     * Create an instance of {@link ActiveOrHistoricCurrencyAndAmount }
     * 
     * @return
     *     the new instance of {@link ActiveOrHistoricCurrencyAndAmount }
     */
    public ActiveOrHistoricCurrencyAndAmount createActiveOrHistoricCurrencyAndAmount() {
        return new ActiveOrHistoricCurrencyAndAmount();
    }

    /**
     * Create an instance of {@link AmountAndDirection53 }
     * 
     * @return
     *     the new instance of {@link AmountAndDirection53 }
     */
    public AmountAndDirection53 createAmountAndDirection53() {
        return new AmountAndDirection53();
    }

    /**
     * Create an instance of {@link CashReuseData1 }
     * 
     * @return
     *     the new instance of {@link CashReuseData1 }
     */
    public CashReuseData1 createCashReuseData1() {
        return new CashReuseData1();
    }

    /**
     * Create an instance of {@link CollateralType19 }
     * 
     * @return
     *     the new instance of {@link CollateralType19 }
     */
    public CollateralType19 createCollateralType19() {
        return new CollateralType19();
    }

    /**
     * Create an instance of {@link ContractModification3 }
     * 
     * @return
     *     the new instance of {@link ContractModification3 }
     */
    public ContractModification3 createContractModification3() {
        return new ContractModification3();
    }

    /**
     * Create an instance of {@link CounterpartyData87 }
     * 
     * @return
     *     the new instance of {@link CounterpartyData87 }
     */
    public CounterpartyData87 createCounterpartyData87() {
        return new CounterpartyData87();
    }

    /**
     * Create an instance of {@link FundingSource3 }
     * 
     * @return
     *     the new instance of {@link FundingSource3 }
     */
    public FundingSource3 createFundingSource3() {
        return new FundingSource3();
    }

    /**
     * Create an instance of {@link GenericIdentification175 }
     * 
     * @return
     *     the new instance of {@link GenericIdentification175 }
     */
    public GenericIdentification175 createGenericIdentification175() {
        return new GenericIdentification175();
    }

    /**
     * Create an instance of {@link OrganisationIdentification15Choice }
     * 
     * @return
     *     the new instance of {@link OrganisationIdentification15Choice }
     */
    public OrganisationIdentification15Choice createOrganisationIdentification15Choice() {
        return new OrganisationIdentification15Choice();
    }

    /**
     * Create an instance of {@link OrganisationIdentification38 }
     * 
     * @return
     *     the new instance of {@link OrganisationIdentification38 }
     */
    public OrganisationIdentification38 createOrganisationIdentification38() {
        return new OrganisationIdentification38();
    }

    /**
     * Create an instance of {@link ReconciliationFlag2 }
     * 
     * @return
     *     the new instance of {@link ReconciliationFlag2 }
     */
    public ReconciliationFlag2 createReconciliationFlag2() {
        return new ReconciliationFlag2();
    }

    /**
     * Create an instance of {@link ReinvestedCashTypeAndAmount1 }
     * 
     * @return
     *     the new instance of {@link ReinvestedCashTypeAndAmount1 }
     */
    public ReinvestedCashTypeAndAmount1 createReinvestedCashTypeAndAmount1() {
        return new ReinvestedCashTypeAndAmount1();
    }

    /**
     * Create an instance of {@link ReuseDataReportCorrection15 }
     * 
     * @return
     *     the new instance of {@link ReuseDataReportCorrection15 }
     */
    public ReuseDataReportCorrection15 createReuseDataReportCorrection15() {
        return new ReuseDataReportCorrection15();
    }

    /**
     * Create an instance of {@link ReuseValue1Choice }
     * 
     * @return
     *     the new instance of {@link ReuseValue1Choice }
     */
    public ReuseValue1Choice createReuseValue1Choice() {
        return new ReuseValue1Choice();
    }

    /**
     * Create an instance of {@link SecuritiesFinancingReportingReusedCollateralDataTransactionStateReportV02 }
     * 
     * @return
     *     the new instance of {@link SecuritiesFinancingReportingReusedCollateralDataTransactionStateReportV02 }
     */
    public SecuritiesFinancingReportingReusedCollateralDataTransactionStateReportV02 createSecuritiesFinancingReportingReusedCollateralDataTransactionStateReportV02() {
        return new SecuritiesFinancingReportingReusedCollateralDataTransactionStateReportV02();
    }

    /**
     * Create an instance of {@link SecurityReuseData1 }
     * 
     * @return
     *     the new instance of {@link SecurityReuseData1 }
     */
    public SecurityReuseData1 createSecurityReuseData1() {
        return new SecurityReuseData1();
    }

    /**
     * Create an instance of {@link SupplementaryData1 }
     * 
     * @return
     *     the new instance of {@link SupplementaryData1 }
     */
    public SupplementaryData1 createSupplementaryData1() {
        return new SupplementaryData1();
    }

    /**
     * Create an instance of {@link SupplementaryDataEnvelope1 }
     * 
     * @return
     *     the new instance of {@link SupplementaryDataEnvelope1 }
     */
    public SupplementaryDataEnvelope1 createSupplementaryDataEnvelope1() {
        return new SupplementaryDataEnvelope1();
    }

    /**
     * Create an instance of {@link TradeData37Choice }
     * 
     * @return
     *     the new instance of {@link TradeData37Choice }
     */
    public TradeData37Choice createTradeData37Choice() {
        return new TradeData37Choice();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Document }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Document }{@code >}
     */
    @XmlElementDecl(namespace = "urn:iso:std:iso:20022:tech:xsd:auth.086.001.02", name = "Document")
    public JAXBElement<Document> createDocument(Document value) {
        return new JAXBElement<>(_Document_QNAME, Document.class, null, value);
    }

}
