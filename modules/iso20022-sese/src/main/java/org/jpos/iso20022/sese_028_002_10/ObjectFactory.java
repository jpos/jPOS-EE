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

package org.jpos.iso20022.sese_028_002_10;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.jpos.iso20022.sese_028_002_10 package. 
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

    private static final QName _Document_QNAME = new QName("urn:iso:std:iso:20022:tech:xsd:sese.028.002.10", "Document");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.jpos.iso20022.sese_028_002_10
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
     * Create an instance of {@link AlternatePartyIdentification9 }
     * 
     * @return
     *     the new instance of {@link AlternatePartyIdentification9 }
     */
    public AlternatePartyIdentification9 createAlternatePartyIdentification9() {
        return new AlternatePartyIdentification9();
    }

    /**
     * Create an instance of {@link AmountAndDirection59 }
     * 
     * @return
     *     the new instance of {@link AmountAndDirection59 }
     */
    public AmountAndDirection59 createAmountAndDirection59() {
        return new AmountAndDirection59();
    }

    /**
     * Create an instance of {@link AmountAndDirection72 }
     * 
     * @return
     *     the new instance of {@link AmountAndDirection72 }
     */
    public AmountAndDirection72 createAmountAndDirection72() {
        return new AmountAndDirection72();
    }

    /**
     * Create an instance of {@link AmountAndDirection92 }
     * 
     * @return
     *     the new instance of {@link AmountAndDirection92 }
     */
    public AmountAndDirection92 createAmountAndDirection92() {
        return new AmountAndDirection92();
    }

    /**
     * Create an instance of {@link BeneficialOwnership5Choice }
     * 
     * @return
     *     the new instance of {@link BeneficialOwnership5Choice }
     */
    public BeneficialOwnership5Choice createBeneficialOwnership5Choice() {
        return new BeneficialOwnership5Choice();
    }

    /**
     * Create an instance of {@link BlockChainAddressWallet7 }
     * 
     * @return
     *     the new instance of {@link BlockChainAddressWallet7 }
     */
    public BlockChainAddressWallet7 createBlockChainAddressWallet7() {
        return new BlockChainAddressWallet7();
    }

    /**
     * Create an instance of {@link CashAccountIdentification6Choice }
     * 
     * @return
     *     the new instance of {@link CashAccountIdentification6Choice }
     */
    public CashAccountIdentification6Choice createCashAccountIdentification6Choice() {
        return new CashAccountIdentification6Choice();
    }

    /**
     * Create an instance of {@link CashParties40 }
     * 
     * @return
     *     the new instance of {@link CashParties40 }
     */
    public CashParties40 createCashParties40() {
        return new CashParties40();
    }

    /**
     * Create an instance of {@link CashSettlementSystem5Choice }
     * 
     * @return
     *     the new instance of {@link CashSettlementSystem5Choice }
     */
    public CashSettlementSystem5Choice createCashSettlementSystem5Choice() {
        return new CashSettlementSystem5Choice();
    }

    /**
     * Create an instance of {@link ClassificationType33Choice }
     * 
     * @return
     *     the new instance of {@link ClassificationType33Choice }
     */
    public ClassificationType33Choice createClassificationType33Choice() {
        return new ClassificationType33Choice();
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
     * Create an instance of {@link DateCode32Choice }
     * 
     * @return
     *     the new instance of {@link DateCode32Choice }
     */
    public DateCode32Choice createDateCode32Choice() {
        return new DateCode32Choice();
    }

    /**
     * Create an instance of {@link FinancialInstrumentAttributes122 }
     * 
     * @return
     *     the new instance of {@link FinancialInstrumentAttributes122 }
     */
    public FinancialInstrumentAttributes122 createFinancialInstrumentAttributes122() {
        return new FinancialInstrumentAttributes122();
    }

    /**
     * Create an instance of {@link FinancialInstrumentQuantity36Choice }
     * 
     * @return
     *     the new instance of {@link FinancialInstrumentQuantity36Choice }
     */
    public FinancialInstrumentQuantity36Choice createFinancialInstrumentQuantity36Choice() {
        return new FinancialInstrumentQuantity36Choice();
    }

    /**
     * Create an instance of {@link ForeignExchangeTerms27 }
     * 
     * @return
     *     the new instance of {@link ForeignExchangeTerms27 }
     */
    public ForeignExchangeTerms27 createForeignExchangeTerms27() {
        return new ForeignExchangeTerms27();
    }

    /**
     * Create an instance of {@link FormOfSecurity7Choice }
     * 
     * @return
     *     the new instance of {@link FormOfSecurity7Choice }
     */
    public FormOfSecurity7Choice createFormOfSecurity7Choice() {
        return new FormOfSecurity7Choice();
    }

    /**
     * Create an instance of {@link Frequency27Choice }
     * 
     * @return
     *     the new instance of {@link Frequency27Choice }
     */
    public Frequency27Choice createFrequency27Choice() {
        return new Frequency27Choice();
    }

    /**
     * Create an instance of {@link GenericIdentification18 }
     * 
     * @return
     *     the new instance of {@link GenericIdentification18 }
     */
    public GenericIdentification18 createGenericIdentification18() {
        return new GenericIdentification18();
    }

    /**
     * Create an instance of {@link GenericIdentification39 }
     * 
     * @return
     *     the new instance of {@link GenericIdentification39 }
     */
    public GenericIdentification39 createGenericIdentification39() {
        return new GenericIdentification39();
    }

    /**
     * Create an instance of {@link GenericIdentification47 }
     * 
     * @return
     *     the new instance of {@link GenericIdentification47 }
     */
    public GenericIdentification47 createGenericIdentification47() {
        return new GenericIdentification47();
    }

    /**
     * Create an instance of {@link GenericIdentification84 }
     * 
     * @return
     *     the new instance of {@link GenericIdentification84 }
     */
    public GenericIdentification84 createGenericIdentification84() {
        return new GenericIdentification84();
    }

    /**
     * Create an instance of {@link GenericIdentification85 }
     * 
     * @return
     *     the new instance of {@link GenericIdentification85 }
     */
    public GenericIdentification85 createGenericIdentification85() {
        return new GenericIdentification85();
    }

    /**
     * Create an instance of {@link GenericIdentification86 }
     * 
     * @return
     *     the new instance of {@link GenericIdentification86 }
     */
    public GenericIdentification86 createGenericIdentification86() {
        return new GenericIdentification86();
    }

    /**
     * Create an instance of {@link IdentificationSource4Choice }
     * 
     * @return
     *     the new instance of {@link IdentificationSource4Choice }
     */
    public IdentificationSource4Choice createIdentificationSource4Choice() {
        return new IdentificationSource4Choice();
    }

    /**
     * Create an instance of {@link IdentificationType44Choice }
     * 
     * @return
     *     the new instance of {@link IdentificationType44Choice }
     */
    public IdentificationType44Choice createIdentificationType44Choice() {
        return new IdentificationType44Choice();
    }

    /**
     * Create an instance of {@link InterestComputationMethodFormat5Choice }
     * 
     * @return
     *     the new instance of {@link InterestComputationMethodFormat5Choice }
     */
    public InterestComputationMethodFormat5Choice createInterestComputationMethodFormat5Choice() {
        return new InterestComputationMethodFormat5Choice();
    }

    /**
     * Create an instance of {@link LegalFramework4Choice }
     * 
     * @return
     *     the new instance of {@link LegalFramework4Choice }
     */
    public LegalFramework4Choice createLegalFramework4Choice() {
        return new LegalFramework4Choice();
    }

    /**
     * Create an instance of {@link MarketClientSide7Choice }
     * 
     * @return
     *     the new instance of {@link MarketClientSide7Choice }
     */
    public MarketClientSide7Choice createMarketClientSide7Choice() {
        return new MarketClientSide7Choice();
    }

    /**
     * Create an instance of {@link MarketIdentification2Choice }
     * 
     * @return
     *     the new instance of {@link MarketIdentification2Choice }
     */
    public MarketIdentification2Choice createMarketIdentification2Choice() {
        return new MarketIdentification2Choice();
    }

    /**
     * Create an instance of {@link MarketIdentification4Choice }
     * 
     * @return
     *     the new instance of {@link MarketIdentification4Choice }
     */
    public MarketIdentification4Choice createMarketIdentification4Choice() {
        return new MarketIdentification4Choice();
    }

    /**
     * Create an instance of {@link MarketIdentification90 }
     * 
     * @return
     *     the new instance of {@link MarketIdentification90 }
     */
    public MarketIdentification90 createMarketIdentification90() {
        return new MarketIdentification90();
    }

    /**
     * Create an instance of {@link MarketType16Choice }
     * 
     * @return
     *     the new instance of {@link MarketType16Choice }
     */
    public MarketType16Choice createMarketType16Choice() {
        return new MarketType16Choice();
    }

    /**
     * Create an instance of {@link NameAndAddress12 }
     * 
     * @return
     *     the new instance of {@link NameAndAddress12 }
     */
    public NameAndAddress12 createNameAndAddress12() {
        return new NameAndAddress12();
    }

    /**
     * Create an instance of {@link Number23Choice }
     * 
     * @return
     *     the new instance of {@link Number23Choice }
     */
    public Number23Choice createNumber23Choice() {
        return new Number23Choice();
    }

    /**
     * Create an instance of {@link OptionStyle9Choice }
     * 
     * @return
     *     the new instance of {@link OptionStyle9Choice }
     */
    public OptionStyle9Choice createOptionStyle9Choice() {
        return new OptionStyle9Choice();
    }

    /**
     * Create an instance of {@link OptionType7Choice }
     * 
     * @return
     *     the new instance of {@link OptionType7Choice }
     */
    public OptionType7Choice createOptionType7Choice() {
        return new OptionType7Choice();
    }

    /**
     * Create an instance of {@link OtherAmounts36 }
     * 
     * @return
     *     the new instance of {@link OtherAmounts36 }
     */
    public OtherAmounts36 createOtherAmounts36() {
        return new OtherAmounts36();
    }

    /**
     * Create an instance of {@link OtherIdentification2 }
     * 
     * @return
     *     the new instance of {@link OtherIdentification2 }
     */
    public OtherIdentification2 createOtherIdentification2() {
        return new OtherIdentification2();
    }

    /**
     * Create an instance of {@link OtherParties37 }
     * 
     * @return
     *     the new instance of {@link OtherParties37 }
     */
    public OtherParties37 createOtherParties37() {
        return new OtherParties37();
    }

    /**
     * Create an instance of {@link PartyIdentification136Choice }
     * 
     * @return
     *     the new instance of {@link PartyIdentification136Choice }
     */
    public PartyIdentification136Choice createPartyIdentification136Choice() {
        return new PartyIdentification136Choice();
    }

    /**
     * Create an instance of {@link PartyIdentification137Choice }
     * 
     * @return
     *     the new instance of {@link PartyIdentification137Choice }
     */
    public PartyIdentification137Choice createPartyIdentification137Choice() {
        return new PartyIdentification137Choice();
    }

    /**
     * Create an instance of {@link PartyIdentification145Choice }
     * 
     * @return
     *     the new instance of {@link PartyIdentification145Choice }
     */
    public PartyIdentification145Choice createPartyIdentification145Choice() {
        return new PartyIdentification145Choice();
    }

    /**
     * Create an instance of {@link PartyIdentification147Choice }
     * 
     * @return
     *     the new instance of {@link PartyIdentification147Choice }
     */
    public PartyIdentification147Choice createPartyIdentification147Choice() {
        return new PartyIdentification147Choice();
    }

    /**
     * Create an instance of {@link PartyIdentification156 }
     * 
     * @return
     *     the new instance of {@link PartyIdentification156 }
     */
    public PartyIdentification156 createPartyIdentification156() {
        return new PartyIdentification156();
    }

    /**
     * Create an instance of {@link PartyIdentification157 }
     * 
     * @return
     *     the new instance of {@link PartyIdentification157 }
     */
    public PartyIdentification157 createPartyIdentification157() {
        return new PartyIdentification157();
    }

    /**
     * Create an instance of {@link PartyIdentification162 }
     * 
     * @return
     *     the new instance of {@link PartyIdentification162 }
     */
    public PartyIdentification162 createPartyIdentification162() {
        return new PartyIdentification162();
    }

    /**
     * Create an instance of {@link PartyIdentification170 }
     * 
     * @return
     *     the new instance of {@link PartyIdentification170 }
     */
    public PartyIdentification170 createPartyIdentification170() {
        return new PartyIdentification170();
    }

    /**
     * Create an instance of {@link PartyIdentification176Choice }
     * 
     * @return
     *     the new instance of {@link PartyIdentification176Choice }
     */
    public PartyIdentification176Choice createPartyIdentification176Choice() {
        return new PartyIdentification176Choice();
    }

    /**
     * Create an instance of {@link PartyIdentificationAndAccount177 }
     * 
     * @return
     *     the new instance of {@link PartyIdentificationAndAccount177 }
     */
    public PartyIdentificationAndAccount177 createPartyIdentificationAndAccount177() {
        return new PartyIdentificationAndAccount177();
    }

    /**
     * Create an instance of {@link PartyIdentificationAndAccount178 }
     * 
     * @return
     *     the new instance of {@link PartyIdentificationAndAccount178 }
     */
    public PartyIdentificationAndAccount178 createPartyIdentificationAndAccount178() {
        return new PartyIdentificationAndAccount178();
    }

    /**
     * Create an instance of {@link PartyIdentificationAndAccount206 }
     * 
     * @return
     *     the new instance of {@link PartyIdentificationAndAccount206 }
     */
    public PartyIdentificationAndAccount206 createPartyIdentificationAndAccount206() {
        return new PartyIdentificationAndAccount206();
    }

    /**
     * Create an instance of {@link PartyTextInformation3 }
     * 
     * @return
     *     the new instance of {@link PartyTextInformation3 }
     */
    public PartyTextInformation3 createPartyTextInformation3() {
        return new PartyTextInformation3();
    }

    /**
     * Create an instance of {@link PartyTextInformation4 }
     * 
     * @return
     *     the new instance of {@link PartyTextInformation4 }
     */
    public PartyTextInformation4 createPartyTextInformation4() {
        return new PartyTextInformation4();
    }

    /**
     * Create an instance of {@link PlaceOfClearingIdentification2 }
     * 
     * @return
     *     the new instance of {@link PlaceOfClearingIdentification2 }
     */
    public PlaceOfClearingIdentification2 createPlaceOfClearingIdentification2() {
        return new PlaceOfClearingIdentification2();
    }

    /**
     * Create an instance of {@link PlaceOfTradeIdentification2 }
     * 
     * @return
     *     the new instance of {@link PlaceOfTradeIdentification2 }
     */
    public PlaceOfTradeIdentification2 createPlaceOfTradeIdentification2() {
        return new PlaceOfTradeIdentification2();
    }

    /**
     * Create an instance of {@link Price11 }
     * 
     * @return
     *     the new instance of {@link Price11 }
     */
    public Price11 createPrice11() {
        return new Price11();
    }

    /**
     * Create an instance of {@link Price3 }
     * 
     * @return
     *     the new instance of {@link Price3 }
     */
    public Price3 createPrice3() {
        return new Price3();
    }

    /**
     * Create an instance of {@link PriceRateOrAmount1Choice }
     * 
     * @return
     *     the new instance of {@link PriceRateOrAmount1Choice }
     */
    public PriceRateOrAmount1Choice createPriceRateOrAmount1Choice() {
        return new PriceRateOrAmount1Choice();
    }

    /**
     * Create an instance of {@link PriceType5Choice }
     * 
     * @return
     *     the new instance of {@link PriceType5Choice }
     */
    public PriceType5Choice createPriceType5Choice() {
        return new PriceType5Choice();
    }

    /**
     * Create an instance of {@link QuantityAndAccount106 }
     * 
     * @return
     *     the new instance of {@link QuantityAndAccount106 }
     */
    public QuantityAndAccount106 createQuantityAndAccount106() {
        return new QuantityAndAccount106();
    }

    /**
     * Create an instance of {@link QuantityBreakdown69 }
     * 
     * @return
     *     the new instance of {@link QuantityBreakdown69 }
     */
    public QuantityBreakdown69 createQuantityBreakdown69() {
        return new QuantityBreakdown69();
    }

    /**
     * Create an instance of {@link Rate2 }
     * 
     * @return
     *     the new instance of {@link Rate2 }
     */
    public Rate2 createRate2() {
        return new Rate2();
    }

    /**
     * Create an instance of {@link RateName2 }
     * 
     * @return
     *     the new instance of {@link RateName2 }
     */
    public RateName2 createRateName2() {
        return new RateName2();
    }

    /**
     * Create an instance of {@link RateType67Choice }
     * 
     * @return
     *     the new instance of {@link RateType67Choice }
     */
    public RateType67Choice createRateType67Choice() {
        return new RateType67Choice();
    }

    /**
     * Create an instance of {@link Registration11Choice }
     * 
     * @return
     *     the new instance of {@link Registration11Choice }
     */
    public Registration11Choice createRegistration11Choice() {
        return new Registration11Choice();
    }

    /**
     * Create an instance of {@link RepurchaseType17Choice }
     * 
     * @return
     *     the new instance of {@link RepurchaseType17Choice }
     */
    public RepurchaseType17Choice createRepurchaseType17Choice() {
        return new RepurchaseType17Choice();
    }

    /**
     * Create an instance of {@link RestrictedFINActiveCurrencyAndAmount }
     * 
     * @return
     *     the new instance of {@link RestrictedFINActiveCurrencyAndAmount }
     */
    public RestrictedFINActiveCurrencyAndAmount createRestrictedFINActiveCurrencyAndAmount() {
        return new RestrictedFINActiveCurrencyAndAmount();
    }

    /**
     * Create an instance of {@link RestrictedFINActiveOrHistoricCurrencyAnd13DecimalAmount }
     * 
     * @return
     *     the new instance of {@link RestrictedFINActiveOrHistoricCurrencyAnd13DecimalAmount }
     */
    public RestrictedFINActiveOrHistoricCurrencyAnd13DecimalAmount createRestrictedFINActiveOrHistoricCurrencyAnd13DecimalAmount() {
        return new RestrictedFINActiveOrHistoricCurrencyAnd13DecimalAmount();
    }

    /**
     * Create an instance of {@link RestrictedFINActiveOrHistoricCurrencyAndAmount }
     * 
     * @return
     *     the new instance of {@link RestrictedFINActiveOrHistoricCurrencyAndAmount }
     */
    public RestrictedFINActiveOrHistoricCurrencyAndAmount createRestrictedFINActiveOrHistoricCurrencyAndAmount() {
        return new RestrictedFINActiveOrHistoricCurrencyAndAmount();
    }

    /**
     * Create an instance of {@link SafeKeepingPlace4 }
     * 
     * @return
     *     the new instance of {@link SafeKeepingPlace4 }
     */
    public SafeKeepingPlace4 createSafeKeepingPlace4() {
        return new SafeKeepingPlace4();
    }

    /**
     * Create an instance of {@link SafekeepingPlaceFormat39Choice }
     * 
     * @return
     *     the new instance of {@link SafekeepingPlaceFormat39Choice }
     */
    public SafekeepingPlaceFormat39Choice createSafekeepingPlaceFormat39Choice() {
        return new SafekeepingPlaceFormat39Choice();
    }

    /**
     * Create an instance of {@link SafekeepingPlaceTypeAndIdentification1 }
     * 
     * @return
     *     the new instance of {@link SafekeepingPlaceTypeAndIdentification1 }
     */
    public SafekeepingPlaceTypeAndIdentification1 createSafekeepingPlaceTypeAndIdentification1() {
        return new SafekeepingPlaceTypeAndIdentification1();
    }

    /**
     * Create an instance of {@link SafekeepingPlaceTypeAndText15 }
     * 
     * @return
     *     the new instance of {@link SafekeepingPlaceTypeAndText15 }
     */
    public SafekeepingPlaceTypeAndText15 createSafekeepingPlaceTypeAndText15() {
        return new SafekeepingPlaceTypeAndText15();
    }

    /**
     * Create an instance of {@link SecuritiesAccount30 }
     * 
     * @return
     *     the new instance of {@link SecuritiesAccount30 }
     */
    public SecuritiesAccount30 createSecuritiesAccount30() {
        return new SecuritiesAccount30();
    }

    /**
     * Create an instance of {@link SecuritiesFinancingTransactionDetails50 }
     * 
     * @return
     *     the new instance of {@link SecuritiesFinancingTransactionDetails50 }
     */
    public SecuritiesFinancingTransactionDetails50 createSecuritiesFinancingTransactionDetails50() {
        return new SecuritiesFinancingTransactionDetails50();
    }

    /**
     * Create an instance of {@link SecuritiesPaymentStatus6Choice }
     * 
     * @return
     *     the new instance of {@link SecuritiesPaymentStatus6Choice }
     */
    public SecuritiesPaymentStatus6Choice createSecuritiesPaymentStatus6Choice() {
        return new SecuritiesPaymentStatus6Choice();
    }

    /**
     * Create an instance of {@link SecuritiesRTGS5Choice }
     * 
     * @return
     *     the new instance of {@link SecuritiesRTGS5Choice }
     */
    public SecuritiesRTGS5Choice createSecuritiesRTGS5Choice() {
        return new SecuritiesRTGS5Choice();
    }

    /**
     * Create an instance of {@link SecuritiesSettlementTransactionAllegementNotification002V10 }
     * 
     * @return
     *     the new instance of {@link SecuritiesSettlementTransactionAllegementNotification002V10 }
     */
    public SecuritiesSettlementTransactionAllegementNotification002V10 createSecuritiesSettlementTransactionAllegementNotification002V10() {
        return new SecuritiesSettlementTransactionAllegementNotification002V10();
    }

    /**
     * Create an instance of {@link SecuritiesTradeDetails126 }
     * 
     * @return
     *     the new instance of {@link SecuritiesTradeDetails126 }
     */
    public SecuritiesTradeDetails126 createSecuritiesTradeDetails126() {
        return new SecuritiesTradeDetails126();
    }

    /**
     * Create an instance of {@link SecuritiesTransactionType49Choice }
     * 
     * @return
     *     the new instance of {@link SecuritiesTransactionType49Choice }
     */
    public SecuritiesTransactionType49Choice createSecuritiesTransactionType49Choice() {
        return new SecuritiesTransactionType49Choice();
    }

    /**
     * Create an instance of {@link SecurityIdentification20 }
     * 
     * @return
     *     the new instance of {@link SecurityIdentification20 }
     */
    public SecurityIdentification20 createSecurityIdentification20() {
        return new SecurityIdentification20();
    }

    /**
     * Create an instance of {@link SettlementDate20Choice }
     * 
     * @return
     *     the new instance of {@link SettlementDate20Choice }
     */
    public SettlementDate20Choice createSettlementDate20Choice() {
        return new SettlementDate20Choice();
    }

    /**
     * Create an instance of {@link SettlementDateCode9Choice }
     * 
     * @return
     *     the new instance of {@link SettlementDateCode9Choice }
     */
    public SettlementDateCode9Choice createSettlementDateCode9Choice() {
        return new SettlementDateCode9Choice();
    }

    /**
     * Create an instance of {@link SettlementDetails191 }
     * 
     * @return
     *     the new instance of {@link SettlementDetails191 }
     */
    public SettlementDetails191 createSettlementDetails191() {
        return new SettlementDetails191();
    }

    /**
     * Create an instance of {@link SettlementParties105 }
     * 
     * @return
     *     the new instance of {@link SettlementParties105 }
     */
    public SettlementParties105 createSettlementParties105() {
        return new SettlementParties105();
    }

    /**
     * Create an instance of {@link SettlementTransactionCondition36Choice }
     * 
     * @return
     *     the new instance of {@link SettlementTransactionCondition36Choice }
     */
    public SettlementTransactionCondition36Choice createSettlementTransactionCondition36Choice() {
        return new SettlementTransactionCondition36Choice();
    }

    /**
     * Create an instance of {@link SettlementTypeAndAdditionalParameters15 }
     * 
     * @return
     *     the new instance of {@link SettlementTypeAndAdditionalParameters15 }
     */
    public SettlementTypeAndAdditionalParameters15 createSettlementTypeAndAdditionalParameters15() {
        return new SettlementTypeAndAdditionalParameters15();
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
     * Create an instance of {@link TerminationDate7Choice }
     * 
     * @return
     *     the new instance of {@link TerminationDate7Choice }
     */
    public TerminationDate7Choice createTerminationDate7Choice() {
        return new TerminationDate7Choice();
    }

    /**
     * Create an instance of {@link TradeDate9Choice }
     * 
     * @return
     *     the new instance of {@link TradeDate9Choice }
     */
    public TradeDate9Choice createTradeDate9Choice() {
        return new TradeDate9Choice();
    }

    /**
     * Create an instance of {@link TradeDateCode4Choice }
     * 
     * @return
     *     the new instance of {@link TradeDateCode4Choice }
     */
    public TradeDateCode4Choice createTradeDateCode4Choice() {
        return new TradeDateCode4Choice();
    }

    /**
     * Create an instance of {@link TradeTransactionCondition6Choice }
     * 
     * @return
     *     the new instance of {@link TradeTransactionCondition6Choice }
     */
    public TradeTransactionCondition6Choice createTradeTransactionCondition6Choice() {
        return new TradeTransactionCondition6Choice();
    }

    /**
     * Create an instance of {@link TypeOfPrice32Choice }
     * 
     * @return
     *     the new instance of {@link TypeOfPrice32Choice }
     */
    public TypeOfPrice32Choice createTypeOfPrice32Choice() {
        return new TypeOfPrice32Choice();
    }

    /**
     * Create an instance of {@link YieldedOrValueType1Choice }
     * 
     * @return
     *     the new instance of {@link YieldedOrValueType1Choice }
     */
    public YieldedOrValueType1Choice createYieldedOrValueType1Choice() {
        return new YieldedOrValueType1Choice();
    }

    /**
     * Create an instance of {@link YieldedOrValueType2Choice }
     * 
     * @return
     *     the new instance of {@link YieldedOrValueType2Choice }
     */
    public YieldedOrValueType2Choice createYieldedOrValueType2Choice() {
        return new YieldedOrValueType2Choice();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Document }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Document }{@code >}
     */
    @XmlElementDecl(namespace = "urn:iso:std:iso:20022:tech:xsd:sese.028.002.10", name = "Document")
    public JAXBElement<Document> createDocument(Document value) {
        return new JAXBElement<>(_Document_QNAME, Document.class, null, value);
    }

}
