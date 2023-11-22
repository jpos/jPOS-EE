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

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.jpos.iso20022.auth_105_001_01 package. 
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

    private static final QName _Document_QNAME = new QName("urn:iso:std:iso:20022:tech:xsd:auth.105.001.01", "Document");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.jpos.iso20022.auth_105_001_01
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
     * Create an instance of {@link ActiveOrHistoricCurrencyAnd20DecimalAmount }
     * 
     * @return
     *     the new instance of {@link ActiveOrHistoricCurrencyAnd20DecimalAmount }
     */
    public ActiveOrHistoricCurrencyAnd20DecimalAmount createActiveOrHistoricCurrencyAnd20DecimalAmount() {
        return new ActiveOrHistoricCurrencyAnd20DecimalAmount();
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
     * Create an instance of {@link AmountAndDirection107 }
     * 
     * @return
     *     the new instance of {@link AmountAndDirection107 }
     */
    public AmountAndDirection107 createAmountAndDirection107() {
        return new AmountAndDirection107();
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
     * Create an instance of {@link CollateralData33 }
     * 
     * @return
     *     the new instance of {@link CollateralData33 }
     */
    public CollateralData33 createCollateralData33() {
        return new CollateralData33();
    }

    /**
     * Create an instance of {@link ContractTerm6Choice }
     * 
     * @return
     *     the new instance of {@link ContractTerm6Choice }
     */
    public ContractTerm6Choice createContractTerm6Choice() {
        return new ContractTerm6Choice();
    }

    /**
     * Create an instance of {@link CounterpartyData86 }
     * 
     * @return
     *     the new instance of {@link CounterpartyData86 }
     */
    public CounterpartyData86 createCounterpartyData86() {
        return new CounterpartyData86();
    }

    /**
     * Create an instance of {@link CounterpartyIdentification10 }
     * 
     * @return
     *     the new instance of {@link CounterpartyIdentification10 }
     */
    public CounterpartyIdentification10 createCounterpartyIdentification10() {
        return new CounterpartyIdentification10();
    }

    /**
     * Create an instance of {@link ExposureMetrics4 }
     * 
     * @return
     *     the new instance of {@link ExposureMetrics4 }
     */
    public ExposureMetrics4 createExposureMetrics4() {
        return new ExposureMetrics4();
    }

    /**
     * Create an instance of {@link ExposureMetrics5 }
     * 
     * @return
     *     the new instance of {@link ExposureMetrics5 }
     */
    public ExposureMetrics5 createExposureMetrics5() {
        return new ExposureMetrics5();
    }

    /**
     * Create an instance of {@link ExposureMetrics6 }
     * 
     * @return
     *     the new instance of {@link ExposureMetrics6 }
     */
    public ExposureMetrics6 createExposureMetrics6() {
        return new ExposureMetrics6();
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
     * Create an instance of {@link IssuerJurisdiction1Choice }
     * 
     * @return
     *     the new instance of {@link IssuerJurisdiction1Choice }
     */
    public IssuerJurisdiction1Choice createIssuerJurisdiction1Choice() {
        return new IssuerJurisdiction1Choice();
    }

    /**
     * Create an instance of {@link LoanData134 }
     * 
     * @return
     *     the new instance of {@link LoanData134 }
     */
    public LoanData134 createLoanData134() {
        return new LoanData134();
    }

    /**
     * Create an instance of {@link MaturityTerm2 }
     * 
     * @return
     *     the new instance of {@link MaturityTerm2 }
     */
    public MaturityTerm2 createMaturityTerm2() {
        return new MaturityTerm2();
    }

    /**
     * Create an instance of {@link NamedPosition3 }
     * 
     * @return
     *     the new instance of {@link NamedPosition3 }
     */
    public NamedPosition3 createNamedPosition3() {
        return new NamedPosition3();
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
     * Create an instance of {@link PositionSet16 }
     * 
     * @return
     *     the new instance of {@link PositionSet16 }
     */
    public PositionSet16 createPositionSet16() {
        return new PositionSet16();
    }

    /**
     * Create an instance of {@link PositionSet17 }
     * 
     * @return
     *     the new instance of {@link PositionSet17 }
     */
    public PositionSet17 createPositionSet17() {
        return new PositionSet17();
    }

    /**
     * Create an instance of {@link PositionSet18 }
     * 
     * @return
     *     the new instance of {@link PositionSet18 }
     */
    public PositionSet18 createPositionSet18() {
        return new PositionSet18();
    }

    /**
     * Create an instance of {@link PositionSet19 }
     * 
     * @return
     *     the new instance of {@link PositionSet19 }
     */
    public PositionSet19 createPositionSet19() {
        return new PositionSet19();
    }

    /**
     * Create an instance of {@link PositionSet20 }
     * 
     * @return
     *     the new instance of {@link PositionSet20 }
     */
    public PositionSet20 createPositionSet20() {
        return new PositionSet20();
    }

    /**
     * Create an instance of {@link PositionSetDimensions12 }
     * 
     * @return
     *     the new instance of {@link PositionSetDimensions12 }
     */
    public PositionSetDimensions12 createPositionSetDimensions12() {
        return new PositionSetDimensions12();
    }

    /**
     * Create an instance of {@link PositionSetDimensions14 }
     * 
     * @return
     *     the new instance of {@link PositionSetDimensions14 }
     */
    public PositionSetDimensions14 createPositionSetDimensions14() {
        return new PositionSetDimensions14();
    }

    /**
     * Create an instance of {@link PositionSetDimensions15 }
     * 
     * @return
     *     the new instance of {@link PositionSetDimensions15 }
     */
    public PositionSetDimensions15 createPositionSetDimensions15() {
        return new PositionSetDimensions15();
    }

    /**
     * Create an instance of {@link PositionSetMetrics10 }
     * 
     * @return
     *     the new instance of {@link PositionSetMetrics10 }
     */
    public PositionSetMetrics10 createPositionSetMetrics10() {
        return new PositionSetMetrics10();
    }

    /**
     * Create an instance of {@link PositionSetMetrics11 }
     * 
     * @return
     *     the new instance of {@link PositionSetMetrics11 }
     */
    public PositionSetMetrics11 createPositionSetMetrics11() {
        return new PositionSetMetrics11();
    }

    /**
     * Create an instance of {@link PositionSetMetrics12 }
     * 
     * @return
     *     the new instance of {@link PositionSetMetrics12 }
     */
    public PositionSetMetrics12 createPositionSetMetrics12() {
        return new PositionSetMetrics12();
    }

    /**
     * Create an instance of {@link PositionSetMetrics13 }
     * 
     * @return
     *     the new instance of {@link PositionSetMetrics13 }
     */
    public PositionSetMetrics13 createPositionSetMetrics13() {
        return new PositionSetMetrics13();
    }

    /**
     * Create an instance of {@link PositionSetMetrics7 }
     * 
     * @return
     *     the new instance of {@link PositionSetMetrics7 }
     */
    public PositionSetMetrics7 createPositionSetMetrics7() {
        return new PositionSetMetrics7();
    }

    /**
     * Create an instance of {@link PositionSetReport3Choice }
     * 
     * @return
     *     the new instance of {@link PositionSetReport3Choice }
     */
    public PositionSetReport3Choice createPositionSetReport3Choice() {
        return new PositionSetReport3Choice();
    }

    /**
     * Create an instance of {@link PostedMarginOrCollateral4 }
     * 
     * @return
     *     the new instance of {@link PostedMarginOrCollateral4 }
     */
    public PostedMarginOrCollateral4 createPostedMarginOrCollateral4() {
        return new PostedMarginOrCollateral4();
    }

    /**
     * Create an instance of {@link PriceMetrics3 }
     * 
     * @return
     *     the new instance of {@link PriceMetrics3 }
     */
    public PriceMetrics3 createPriceMetrics3() {
        return new PriceMetrics3();
    }

    /**
     * Create an instance of {@link PrincipalAmount3 }
     * 
     * @return
     *     the new instance of {@link PrincipalAmount3 }
     */
    public PrincipalAmount3 createPrincipalAmount3() {
        return new PrincipalAmount3();
    }

    /**
     * Create an instance of {@link QuantityNominalValue2Choice }
     * 
     * @return
     *     the new instance of {@link QuantityNominalValue2Choice }
     */
    public QuantityNominalValue2Choice createQuantityNominalValue2Choice() {
        return new QuantityNominalValue2Choice();
    }

    /**
     * Create an instance of {@link Rates1Choice }
     * 
     * @return
     *     the new instance of {@link Rates1Choice }
     */
    public Rates1Choice createRates1Choice() {
        return new Rates1Choice();
    }

    /**
     * Create an instance of {@link Rates3 }
     * 
     * @return
     *     the new instance of {@link Rates3 }
     */
    public Rates3 createRates3() {
        return new Rates3();
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
     * Create an instance of {@link ReinvestedCashTypeAndAmount2 }
     * 
     * @return
     *     the new instance of {@link ReinvestedCashTypeAndAmount2 }
     */
    public ReinvestedCashTypeAndAmount2 createReinvestedCashTypeAndAmount2() {
        return new ReinvestedCashTypeAndAmount2();
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
     * Create an instance of {@link SecuritiesFinancingReportingPositionSetReportV01 }
     * 
     * @return
     *     the new instance of {@link SecuritiesFinancingReportingPositionSetReportV01 }
     */
    public SecuritiesFinancingReportingPositionSetReportV01 createSecuritiesFinancingReportingPositionSetReportV01() {
        return new SecuritiesFinancingReportingPositionSetReportV01();
    }

    /**
     * Create an instance of {@link SecuritiesLendingType3Choice }
     * 
     * @return
     *     the new instance of {@link SecuritiesLendingType3Choice }
     */
    public SecuritiesLendingType3Choice createSecuritiesLendingType3Choice() {
        return new SecuritiesLendingType3Choice();
    }

    /**
     * Create an instance of {@link SecuritiesTransactionPrice18Choice }
     * 
     * @return
     *     the new instance of {@link SecuritiesTransactionPrice18Choice }
     */
    public SecuritiesTransactionPrice18Choice createSecuritiesTransactionPrice18Choice() {
        return new SecuritiesTransactionPrice18Choice();
    }

    /**
     * Create an instance of {@link SecuritiesTransactionPrice19Choice }
     * 
     * @return
     *     the new instance of {@link SecuritiesTransactionPrice19Choice }
     */
    public SecuritiesTransactionPrice19Choice createSecuritiesTransactionPrice19Choice() {
        return new SecuritiesTransactionPrice19Choice();
    }

    /**
     * Create an instance of {@link SecuritiesTransactionPrice5 }
     * 
     * @return
     *     the new instance of {@link SecuritiesTransactionPrice5 }
     */
    public SecuritiesTransactionPrice5 createSecuritiesTransactionPrice5() {
        return new SecuritiesTransactionPrice5();
    }

    /**
     * Create an instance of {@link Security49 }
     * 
     * @return
     *     the new instance of {@link Security49 }
     */
    public Security49 createSecurity49() {
        return new Security49();
    }

    /**
     * Create an instance of {@link SecurityIssuer4 }
     * 
     * @return
     *     the new instance of {@link SecurityIssuer4 }
     */
    public SecurityIssuer4 createSecurityIssuer4() {
        return new SecurityIssuer4();
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
     * Create an instance of {@link TimeToMaturity2Choice }
     * 
     * @return
     *     the new instance of {@link TimeToMaturity2Choice }
     */
    public TimeToMaturity2Choice createTimeToMaturity2Choice() {
        return new TimeToMaturity2Choice();
    }

    /**
     * Create an instance of {@link TimeToMaturityPeriod2 }
     * 
     * @return
     *     the new instance of {@link TimeToMaturityPeriod2 }
     */
    public TimeToMaturityPeriod2 createTimeToMaturityPeriod2() {
        return new TimeToMaturityPeriod2();
    }

    /**
     * Create an instance of {@link TradingVenueType1Choice }
     * 
     * @return
     *     the new instance of {@link TradingVenueType1Choice }
     */
    public TradingVenueType1Choice createTradingVenueType1Choice() {
        return new TradingVenueType1Choice();
    }

    /**
     * Create an instance of {@link VolumeMetrics4 }
     * 
     * @return
     *     the new instance of {@link VolumeMetrics4 }
     */
    public VolumeMetrics4 createVolumeMetrics4() {
        return new VolumeMetrics4();
    }

    /**
     * Create an instance of {@link VolumeMetrics5 }
     * 
     * @return
     *     the new instance of {@link VolumeMetrics5 }
     */
    public VolumeMetrics5 createVolumeMetrics5() {
        return new VolumeMetrics5();
    }

    /**
     * Create an instance of {@link VolumeMetrics6 }
     * 
     * @return
     *     the new instance of {@link VolumeMetrics6 }
     */
    public VolumeMetrics6 createVolumeMetrics6() {
        return new VolumeMetrics6();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Document }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Document }{@code >}
     */
    @XmlElementDecl(namespace = "urn:iso:std:iso:20022:tech:xsd:auth.105.001.01", name = "Document")
    public JAXBElement<Document> createDocument(Document value) {
        return new JAXBElement<>(_Document_QNAME, Document.class, null, value);
    }

}
