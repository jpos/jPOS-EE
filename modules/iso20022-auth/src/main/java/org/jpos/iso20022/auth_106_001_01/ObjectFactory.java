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

package org.jpos.iso20022.auth_106_001_01;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.jpos.iso20022.auth_106_001_01 package. 
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

    private static final QName _Document_QNAME = new QName("urn:iso:std:iso:20022:tech:xsd:auth.106.001.01", "Document");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.jpos.iso20022.auth_106_001_01
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
     * Create an instance of {@link AbnormalValuesData4 }
     * 
     * @return
     *     the new instance of {@link AbnormalValuesData4 }
     */
    public AbnormalValuesData4 createAbnormalValuesData4() {
        return new AbnormalValuesData4();
    }

    /**
     * Create an instance of {@link AbnormalValuesTransactionData2 }
     * 
     * @return
     *     the new instance of {@link AbnormalValuesTransactionData2 }
     */
    public AbnormalValuesTransactionData2 createAbnormalValuesTransactionData2() {
        return new AbnormalValuesTransactionData2();
    }

    /**
     * Create an instance of {@link ActiveOrHistoricCurrencyAnd19DecimalAmount }
     * 
     * @return
     *     the new instance of {@link ActiveOrHistoricCurrencyAnd19DecimalAmount }
     */
    public ActiveOrHistoricCurrencyAnd19DecimalAmount createActiveOrHistoricCurrencyAnd19DecimalAmount() {
        return new ActiveOrHistoricCurrencyAnd19DecimalAmount();
    }

    /**
     * Create an instance of {@link AgreementType2Choice }
     * 
     * @return
     *     the new instance of {@link AgreementType2Choice }
     */
    public AgreementType2Choice createAgreementType2Choice() {
        return new AgreementType2Choice();
    }

    /**
     * Create an instance of {@link AmountAndDirection106 }
     * 
     * @return
     *     the new instance of {@link AmountAndDirection106 }
     */
    public AmountAndDirection106 createAmountAndDirection106() {
        return new AmountAndDirection106();
    }

    /**
     * Create an instance of {@link CollateralPortfolioCode5Choice }
     * 
     * @return
     *     the new instance of {@link CollateralPortfolioCode5Choice }
     */
    public CollateralPortfolioCode5Choice createCollateralPortfolioCode5Choice() {
        return new CollateralPortfolioCode5Choice();
    }

    /**
     * Create an instance of {@link CounterpartyData92 }
     * 
     * @return
     *     the new instance of {@link CounterpartyData92 }
     */
    public CounterpartyData92 createCounterpartyData92() {
        return new CounterpartyData92();
    }

    /**
     * Create an instance of {@link DateAndDateTime2Choice }
     * 
     * @return
     *     the new instance of {@link DateAndDateTime2Choice }
     */
    public DateAndDateTime2Choice createDateAndDateTime2Choice() {
        return new DateAndDateTime2Choice();
    }

    /**
     * Create an instance of {@link DerivativesTradeWarningsReportV01 }
     * 
     * @return
     *     the new instance of {@link DerivativesTradeWarningsReportV01 }
     */
    public DerivativesTradeWarningsReportV01 createDerivativesTradeWarningsReportV01() {
        return new DerivativesTradeWarningsReportV01();
    }

    /**
     * Create an instance of {@link DetailedAbnormalValuesStatistics4Choice }
     * 
     * @return
     *     the new instance of {@link DetailedAbnormalValuesStatistics4Choice }
     */
    public DetailedAbnormalValuesStatistics4Choice createDetailedAbnormalValuesStatistics4Choice() {
        return new DetailedAbnormalValuesStatistics4Choice();
    }

    /**
     * Create an instance of {@link DetailedMissingMarginInformationStatistics4Choice }
     * 
     * @return
     *     the new instance of {@link DetailedMissingMarginInformationStatistics4Choice }
     */
    public DetailedMissingMarginInformationStatistics4Choice createDetailedMissingMarginInformationStatistics4Choice() {
        return new DetailedMissingMarginInformationStatistics4Choice();
    }

    /**
     * Create an instance of {@link DetailedMissingValuationsStatistics4Choice }
     * 
     * @return
     *     the new instance of {@link DetailedMissingValuationsStatistics4Choice }
     */
    public DetailedMissingValuationsStatistics4Choice createDetailedMissingValuationsStatistics4Choice() {
        return new DetailedMissingValuationsStatistics4Choice();
    }

    /**
     * Create an instance of {@link DetailedStatisticsPerCounterparty17 }
     * 
     * @return
     *     the new instance of {@link DetailedStatisticsPerCounterparty17 }
     */
    public DetailedStatisticsPerCounterparty17 createDetailedStatisticsPerCounterparty17() {
        return new DetailedStatisticsPerCounterparty17();
    }

    /**
     * Create an instance of {@link DetailedTransactionStatistics26 }
     * 
     * @return
     *     the new instance of {@link DetailedTransactionStatistics26 }
     */
    public DetailedTransactionStatistics26 createDetailedTransactionStatistics26() {
        return new DetailedTransactionStatistics26();
    }

    /**
     * Create an instance of {@link DetailedTransactionStatistics27 }
     * 
     * @return
     *     the new instance of {@link DetailedTransactionStatistics27 }
     */
    public DetailedTransactionStatistics27 createDetailedTransactionStatistics27() {
        return new DetailedTransactionStatistics27();
    }

    /**
     * Create an instance of {@link DetailedTransactionStatistics28 }
     * 
     * @return
     *     the new instance of {@link DetailedTransactionStatistics28 }
     */
    public DetailedTransactionStatistics28 createDetailedTransactionStatistics28() {
        return new DetailedTransactionStatistics28();
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
     * Create an instance of {@link LegalPersonIdentification1 }
     * 
     * @return
     *     the new instance of {@link LegalPersonIdentification1 }
     */
    public LegalPersonIdentification1 createLegalPersonIdentification1() {
        return new LegalPersonIdentification1();
    }

    /**
     * Create an instance of {@link MarginPortfolio3 }
     * 
     * @return
     *     the new instance of {@link MarginPortfolio3 }
     */
    public MarginPortfolio3 createMarginPortfolio3() {
        return new MarginPortfolio3();
    }

    /**
     * Create an instance of {@link MasterAgreement8 }
     * 
     * @return
     *     the new instance of {@link MasterAgreement8 }
     */
    public MasterAgreement8 createMasterAgreement8() {
        return new MasterAgreement8();
    }

    /**
     * Create an instance of {@link MissingMarginData2 }
     * 
     * @return
     *     the new instance of {@link MissingMarginData2 }
     */
    public MissingMarginData2 createMissingMarginData2() {
        return new MissingMarginData2();
    }

    /**
     * Create an instance of {@link MissingMarginTransactionData2 }
     * 
     * @return
     *     the new instance of {@link MissingMarginTransactionData2 }
     */
    public MissingMarginTransactionData2 createMissingMarginTransactionData2() {
        return new MissingMarginTransactionData2();
    }

    /**
     * Create an instance of {@link MissingValuationsData2 }
     * 
     * @return
     *     the new instance of {@link MissingValuationsData2 }
     */
    public MissingValuationsData2 createMissingValuationsData2() {
        return new MissingValuationsData2();
    }

    /**
     * Create an instance of {@link MissingValuationsTransactionData2 }
     * 
     * @return
     *     the new instance of {@link MissingValuationsTransactionData2 }
     */
    public MissingValuationsTransactionData2 createMissingValuationsTransactionData2() {
        return new MissingValuationsTransactionData2();
    }

    /**
     * Create an instance of {@link NaturalPersonIdentification2 }
     * 
     * @return
     *     the new instance of {@link NaturalPersonIdentification2 }
     */
    public NaturalPersonIdentification2 createNaturalPersonIdentification2() {
        return new NaturalPersonIdentification2();
    }

    /**
     * Create an instance of {@link NaturalPersonIdentification3 }
     * 
     * @return
     *     the new instance of {@link NaturalPersonIdentification3 }
     */
    public NaturalPersonIdentification3 createNaturalPersonIdentification3() {
        return new NaturalPersonIdentification3();
    }

    /**
     * Create an instance of {@link NotionalAmount5 }
     * 
     * @return
     *     the new instance of {@link NotionalAmount5 }
     */
    public NotionalAmount5 createNotionalAmount5() {
        return new NotionalAmount5();
    }

    /**
     * Create an instance of {@link NotionalAmount6 }
     * 
     * @return
     *     the new instance of {@link NotionalAmount6 }
     */
    public NotionalAmount6 createNotionalAmount6() {
        return new NotionalAmount6();
    }

    /**
     * Create an instance of {@link NotionalAmountLegs5 }
     * 
     * @return
     *     the new instance of {@link NotionalAmountLegs5 }
     */
    public NotionalAmountLegs5 createNotionalAmountLegs5() {
        return new NotionalAmountLegs5();
    }

    /**
     * Create an instance of {@link NotionalQuantity9 }
     * 
     * @return
     *     the new instance of {@link NotionalQuantity9 }
     */
    public NotionalQuantity9 createNotionalQuantity9() {
        return new NotionalQuantity9();
    }

    /**
     * Create an instance of {@link NotionalQuantityLegs5 }
     * 
     * @return
     *     the new instance of {@link NotionalQuantityLegs5 }
     */
    public NotionalQuantityLegs5 createNotionalQuantityLegs5() {
        return new NotionalQuantityLegs5();
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
     * Create an instance of {@link PartyIdentification248Choice }
     * 
     * @return
     *     the new instance of {@link PartyIdentification248Choice }
     */
    public PartyIdentification248Choice createPartyIdentification248Choice() {
        return new PartyIdentification248Choice();
    }

    /**
     * Create an instance of {@link PortfolioCode3Choice }
     * 
     * @return
     *     the new instance of {@link PortfolioCode3Choice }
     */
    public PortfolioCode3Choice createPortfolioCode3Choice() {
        return new PortfolioCode3Choice();
    }

    /**
     * Create an instance of {@link PortfolioCode5Choice }
     * 
     * @return
     *     the new instance of {@link PortfolioCode5Choice }
     */
    public PortfolioCode5Choice createPortfolioCode5Choice() {
        return new PortfolioCode5Choice();
    }

    /**
     * Create an instance of {@link PortfolioIdentification3 }
     * 
     * @return
     *     the new instance of {@link PortfolioIdentification3 }
     */
    public PortfolioIdentification3 createPortfolioIdentification3() {
        return new PortfolioIdentification3();
    }

    /**
     * Create an instance of {@link QuantityOrTerm1Choice }
     * 
     * @return
     *     the new instance of {@link QuantityOrTerm1Choice }
     */
    public QuantityOrTerm1Choice createQuantityOrTerm1Choice() {
        return new QuantityOrTerm1Choice();
    }

    /**
     * Create an instance of {@link QuantityTerm1 }
     * 
     * @return
     *     the new instance of {@link QuantityTerm1 }
     */
    public QuantityTerm1 createQuantityTerm1() {
        return new QuantityTerm1();
    }

    /**
     * Create an instance of {@link Schedule10 }
     * 
     * @return
     *     the new instance of {@link Schedule10 }
     */
    public Schedule10 createSchedule10() {
        return new Schedule10();
    }

    /**
     * Create an instance of {@link Schedule11 }
     * 
     * @return
     *     the new instance of {@link Schedule11 }
     */
    public Schedule11 createSchedule11() {
        return new Schedule11();
    }

    /**
     * Create an instance of {@link StatisticsPerCounterparty16Choice }
     * 
     * @return
     *     the new instance of {@link StatisticsPerCounterparty16Choice }
     */
    public StatisticsPerCounterparty16Choice createStatisticsPerCounterparty16Choice() {
        return new StatisticsPerCounterparty16Choice();
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
     * Create an instance of {@link TradeTransactionIdentification24 }
     * 
     * @return
     *     the new instance of {@link TradeTransactionIdentification24 }
     */
    public TradeTransactionIdentification24 createTradeTransactionIdentification24() {
        return new TradeTransactionIdentification24();
    }

    /**
     * Create an instance of {@link UniqueTransactionIdentifier2Choice }
     * 
     * @return
     *     the new instance of {@link UniqueTransactionIdentifier2Choice }
     */
    public UniqueTransactionIdentifier2Choice createUniqueTransactionIdentifier2Choice() {
        return new UniqueTransactionIdentifier2Choice();
    }

    /**
     * Create an instance of {@link UnitOfMeasure8Choice }
     * 
     * @return
     *     the new instance of {@link UnitOfMeasure8Choice }
     */
    public UnitOfMeasure8Choice createUnitOfMeasure8Choice() {
        return new UnitOfMeasure8Choice();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Document }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Document }{@code >}
     */
    @XmlElementDecl(namespace = "urn:iso:std:iso:20022:tech:xsd:auth.106.001.01", name = "Document")
    public JAXBElement<Document> createDocument(Document value) {
        return new JAXBElement<>(_Document_QNAME, Document.class, null, value);
    }

}
