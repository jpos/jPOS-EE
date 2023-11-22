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

package org.jpos.iso20022.colr_019_001_01;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.jpos.iso20022.colr_019_001_01 package. 
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

    private static final QName _Document_QNAME = new QName("urn:iso:std:iso:20022:tech:xsd:colr.019.001.01", "Document");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.jpos.iso20022.colr_019_001_01
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
     * Create an instance of {@link ActiveCurrencyAndAmount }
     * 
     * @return
     *     the new instance of {@link ActiveCurrencyAndAmount }
     */
    public ActiveCurrencyAndAmount createActiveCurrencyAndAmount() {
        return new ActiveCurrencyAndAmount();
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
     * Create an instance of {@link AdditionalInformation24 }
     * 
     * @return
     *     the new instance of {@link AdditionalInformation24 }
     */
    public AdditionalInformation24 createAdditionalInformation24() {
        return new AdditionalInformation24();
    }

    /**
     * Create an instance of {@link AlternatePartyIdentification7 }
     * 
     * @return
     *     the new instance of {@link AlternatePartyIdentification7 }
     */
    public AlternatePartyIdentification7 createAlternatePartyIdentification7() {
        return new AlternatePartyIdentification7();
    }

    /**
     * Create an instance of {@link AmountAndDirection49 }
     * 
     * @return
     *     the new instance of {@link AmountAndDirection49 }
     */
    public AmountAndDirection49 createAmountAndDirection49() {
        return new AmountAndDirection49();
    }

    /**
     * Create an instance of {@link BasketIdentificationAndEligibilitySetProfile1 }
     * 
     * @return
     *     the new instance of {@link BasketIdentificationAndEligibilitySetProfile1 }
     */
    public BasketIdentificationAndEligibilitySetProfile1 createBasketIdentificationAndEligibilitySetProfile1() {
        return new BasketIdentificationAndEligibilitySetProfile1();
    }

    /**
     * Create an instance of {@link BenchmarkCurveName13Choice }
     * 
     * @return
     *     the new instance of {@link BenchmarkCurveName13Choice }
     */
    public BenchmarkCurveName13Choice createBenchmarkCurveName13Choice() {
        return new BenchmarkCurveName13Choice();
    }

    /**
     * Create an instance of {@link BlockChainAddressWallet3 }
     * 
     * @return
     *     the new instance of {@link BlockChainAddressWallet3 }
     */
    public BlockChainAddressWallet3 createBlockChainAddressWallet3() {
        return new BlockChainAddressWallet3();
    }

    /**
     * Create an instance of {@link CashAccountIdentification5Choice }
     * 
     * @return
     *     the new instance of {@link CashAccountIdentification5Choice }
     */
    public CashAccountIdentification5Choice createCashAccountIdentification5Choice() {
        return new CashAccountIdentification5Choice();
    }

    /**
     * Create an instance of {@link CashMovement8 }
     * 
     * @return
     *     the new instance of {@link CashMovement8 }
     */
    public CashMovement8 createCashMovement8() {
        return new CashMovement8();
    }

    /**
     * Create an instance of {@link ClosingDate4Choice }
     * 
     * @return
     *     the new instance of {@link ClosingDate4Choice }
     */
    public ClosingDate4Choice createClosingDate4Choice() {
        return new ClosingDate4Choice();
    }

    /**
     * Create an instance of {@link CollateralAmount18 }
     * 
     * @return
     *     the new instance of {@link CollateralAmount18 }
     */
    public CollateralAmount18 createCollateralAmount18() {
        return new CollateralAmount18();
    }

    /**
     * Create an instance of {@link CollateralDate2 }
     * 
     * @return
     *     the new instance of {@link CollateralDate2 }
     */
    public CollateralDate2 createCollateralDate2() {
        return new CollateralDate2();
    }

    /**
     * Create an instance of {@link CollateralParameters10 }
     * 
     * @return
     *     the new instance of {@link CollateralParameters10 }
     */
    public CollateralParameters10 createCollateralParameters10() {
        return new CollateralParameters10();
    }

    /**
     * Create an instance of {@link CollateralParties10 }
     * 
     * @return
     *     the new instance of {@link CollateralParties10 }
     */
    public CollateralParties10 createCollateralParties10() {
        return new CollateralParties10();
    }

    /**
     * Create an instance of {@link CollateralTransactionAmountBreakdown2 }
     * 
     * @return
     *     the new instance of {@link CollateralTransactionAmountBreakdown2 }
     */
    public CollateralTransactionAmountBreakdown2 createCollateralTransactionAmountBreakdown2() {
        return new CollateralTransactionAmountBreakdown2();
    }

    /**
     * Create an instance of {@link CollateralTransactionType1Choice }
     * 
     * @return
     *     the new instance of {@link CollateralTransactionType1Choice }
     */
    public CollateralTransactionType1Choice createCollateralTransactionType1Choice() {
        return new CollateralTransactionType1Choice();
    }

    /**
     * Create an instance of {@link CrystallisationDay1 }
     * 
     * @return
     *     the new instance of {@link CrystallisationDay1 }
     */
    public CrystallisationDay1 createCrystallisationDay1() {
        return new CrystallisationDay1();
    }

    /**
     * Create an instance of {@link Date3Choice }
     * 
     * @return
     *     the new instance of {@link Date3Choice }
     */
    public Date3Choice createDate3Choice() {
        return new Date3Choice();
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
     * Create an instance of {@link DealTransactionDetails5 }
     * 
     * @return
     *     the new instance of {@link DealTransactionDetails5 }
     */
    public DealTransactionDetails5 createDealTransactionDetails5() {
        return new DealTransactionDetails5();
    }

    /**
     * Create an instance of {@link DocumentNumber5Choice }
     * 
     * @return
     *     the new instance of {@link DocumentNumber5Choice }
     */
    public DocumentNumber5Choice createDocumentNumber5Choice() {
        return new DocumentNumber5Choice();
    }

    /**
     * Create an instance of {@link ExposureType23Choice }
     * 
     * @return
     *     the new instance of {@link ExposureType23Choice }
     */
    public ExposureType23Choice createExposureType23Choice() {
        return new ExposureType23Choice();
    }

    /**
     * Create an instance of {@link FinancialInstrumentQuantity33Choice }
     * 
     * @return
     *     the new instance of {@link FinancialInstrumentQuantity33Choice }
     */
    public FinancialInstrumentQuantity33Choice createFinancialInstrumentQuantity33Choice() {
        return new FinancialInstrumentQuantity33Choice();
    }

    /**
     * Create an instance of {@link ForeignExchangeTerms23 }
     * 
     * @return
     *     the new instance of {@link ForeignExchangeTerms23 }
     */
    public ForeignExchangeTerms23 createForeignExchangeTerms23() {
        return new ForeignExchangeTerms23();
    }

    /**
     * Create an instance of {@link Frequency38Choice }
     * 
     * @return
     *     the new instance of {@link Frequency38Choice }
     */
    public Frequency38Choice createFrequency38Choice() {
        return new Frequency38Choice();
    }

    /**
     * Create an instance of {@link FrequencyRateFixing1Choice }
     * 
     * @return
     *     the new instance of {@link FrequencyRateFixing1Choice }
     */
    public FrequencyRateFixing1Choice createFrequencyRateFixing1Choice() {
        return new FrequencyRateFixing1Choice();
    }

    /**
     * Create an instance of {@link GenericIdentification1 }
     * 
     * @return
     *     the new instance of {@link GenericIdentification1 }
     */
    public GenericIdentification1 createGenericIdentification1() {
        return new GenericIdentification1();
    }

    /**
     * Create an instance of {@link GenericIdentification178 }
     * 
     * @return
     *     the new instance of {@link GenericIdentification178 }
     */
    public GenericIdentification178 createGenericIdentification178() {
        return new GenericIdentification178();
    }

    /**
     * Create an instance of {@link GenericIdentification30 }
     * 
     * @return
     *     the new instance of {@link GenericIdentification30 }
     */
    public GenericIdentification30 createGenericIdentification30() {
        return new GenericIdentification30();
    }

    /**
     * Create an instance of {@link GenericIdentification36 }
     * 
     * @return
     *     the new instance of {@link GenericIdentification36 }
     */
    public GenericIdentification36 createGenericIdentification36() {
        return new GenericIdentification36();
    }

    /**
     * Create an instance of {@link IdentificationSource3Choice }
     * 
     * @return
     *     the new instance of {@link IdentificationSource3Choice }
     */
    public IdentificationSource3Choice createIdentificationSource3Choice() {
        return new IdentificationSource3Choice();
    }

    /**
     * Create an instance of {@link IdentificationType42Choice }
     * 
     * @return
     *     the new instance of {@link IdentificationType42Choice }
     */
    public IdentificationType42Choice createIdentificationType42Choice() {
        return new IdentificationType42Choice();
    }

    /**
     * Create an instance of {@link InterestComputationMethodFormat4Choice }
     * 
     * @return
     *     the new instance of {@link InterestComputationMethodFormat4Choice }
     */
    public InterestComputationMethodFormat4Choice createInterestComputationMethodFormat4Choice() {
        return new InterestComputationMethodFormat4Choice();
    }

    /**
     * Create an instance of {@link Linkages58 }
     * 
     * @return
     *     the new instance of {@link Linkages58 }
     */
    public Linkages58 createLinkages58() {
        return new Linkages58();
    }

    /**
     * Create an instance of {@link MarketIdentification1Choice }
     * 
     * @return
     *     the new instance of {@link MarketIdentification1Choice }
     */
    public MarketIdentification1Choice createMarketIdentification1Choice() {
        return new MarketIdentification1Choice();
    }

    /**
     * Create an instance of {@link MarketIdentification84 }
     * 
     * @return
     *     the new instance of {@link MarketIdentification84 }
     */
    public MarketIdentification84 createMarketIdentification84() {
        return new MarketIdentification84();
    }

    /**
     * Create an instance of {@link MarketType8Choice }
     * 
     * @return
     *     the new instance of {@link MarketType8Choice }
     */
    public MarketType8Choice createMarketType8Choice() {
        return new MarketType8Choice();
    }

    /**
     * Create an instance of {@link NameAndAddress5 }
     * 
     * @return
     *     the new instance of {@link NameAndAddress5 }
     */
    public NameAndAddress5 createNameAndAddress5() {
        return new NameAndAddress5();
    }

    /**
     * Create an instance of {@link OptionType6Choice }
     * 
     * @return
     *     the new instance of {@link OptionType6Choice }
     */
    public OptionType6Choice createOptionType6Choice() {
        return new OptionType6Choice();
    }

    /**
     * Create an instance of {@link OtherIdentification1 }
     * 
     * @return
     *     the new instance of {@link OtherIdentification1 }
     */
    public OtherIdentification1 createOtherIdentification1() {
        return new OtherIdentification1();
    }

    /**
     * Create an instance of {@link OtherParties38 }
     * 
     * @return
     *     the new instance of {@link OtherParties38 }
     */
    public OtherParties38 createOtherParties38() {
        return new OtherParties38();
    }

    /**
     * Create an instance of {@link Pagination1 }
     * 
     * @return
     *     the new instance of {@link Pagination1 }
     */
    public Pagination1 createPagination1() {
        return new Pagination1();
    }

    /**
     * Create an instance of {@link PartyIdentification120Choice }
     * 
     * @return
     *     the new instance of {@link PartyIdentification120Choice }
     */
    public PartyIdentification120Choice createPartyIdentification120Choice() {
        return new PartyIdentification120Choice();
    }

    /**
     * Create an instance of {@link PartyIdentification134Choice }
     * 
     * @return
     *     the new instance of {@link PartyIdentification134Choice }
     */
    public PartyIdentification134Choice createPartyIdentification134Choice() {
        return new PartyIdentification134Choice();
    }

    /**
     * Create an instance of {@link PartyIdentification136 }
     * 
     * @return
     *     the new instance of {@link PartyIdentification136 }
     */
    public PartyIdentification136 createPartyIdentification136() {
        return new PartyIdentification136();
    }

    /**
     * Create an instance of {@link PartyIdentification149 }
     * 
     * @return
     *     the new instance of {@link PartyIdentification149 }
     */
    public PartyIdentification149 createPartyIdentification149() {
        return new PartyIdentification149();
    }

    /**
     * Create an instance of {@link PartyIdentificationAndAccount202 }
     * 
     * @return
     *     the new instance of {@link PartyIdentificationAndAccount202 }
     */
    public PartyIdentificationAndAccount202 createPartyIdentificationAndAccount202() {
        return new PartyIdentificationAndAccount202();
    }

    /**
     * Create an instance of {@link PartyIdentificationAndAccount203 }
     * 
     * @return
     *     the new instance of {@link PartyIdentificationAndAccount203 }
     */
    public PartyIdentificationAndAccount203 createPartyIdentificationAndAccount203() {
        return new PartyIdentificationAndAccount203();
    }

    /**
     * Create an instance of {@link Period2 }
     * 
     * @return
     *     the new instance of {@link Period2 }
     */
    public Period2 createPeriod2() {
        return new Period2();
    }

    /**
     * Create an instance of {@link Period4Choice }
     * 
     * @return
     *     the new instance of {@link Period4Choice }
     */
    public Period4Choice createPeriod4Choice() {
        return new Period4Choice();
    }

    /**
     * Create an instance of {@link PlaceOfTradeIdentification1 }
     * 
     * @return
     *     the new instance of {@link PlaceOfTradeIdentification1 }
     */
    public PlaceOfTradeIdentification1 createPlaceOfTradeIdentification1() {
        return new PlaceOfTradeIdentification1();
    }

    /**
     * Create an instance of {@link PostalAddress1 }
     * 
     * @return
     *     the new instance of {@link PostalAddress1 }
     */
    public PostalAddress1 createPostalAddress1() {
        return new PostalAddress1();
    }

    /**
     * Create an instance of {@link RateOrName4Choice }
     * 
     * @return
     *     the new instance of {@link RateOrName4Choice }
     */
    public RateOrName4Choice createRateOrName4Choice() {
        return new RateOrName4Choice();
    }

    /**
     * Create an instance of {@link RateOrType1Choice }
     * 
     * @return
     *     the new instance of {@link RateOrType1Choice }
     */
    public RateOrType1Choice createRateOrType1Choice() {
        return new RateOrType1Choice();
    }

    /**
     * Create an instance of {@link RateTypeAndLookback2 }
     * 
     * @return
     *     the new instance of {@link RateTypeAndLookback2 }
     */
    public RateTypeAndLookback2 createRateTypeAndLookback2() {
        return new RateTypeAndLookback2();
    }

    /**
     * Create an instance of {@link References70Choice }
     * 
     * @return
     *     the new instance of {@link References70Choice }
     */
    public References70Choice createReferences70Choice() {
        return new References70Choice();
    }

    /**
     * Create an instance of {@link ResponseStatus9Choice }
     * 
     * @return
     *     the new instance of {@link ResponseStatus9Choice }
     */
    public ResponseStatus9Choice createResponseStatus9Choice() {
        return new ResponseStatus9Choice();
    }

    /**
     * Create an instance of {@link SecuritiesAccount19 }
     * 
     * @return
     *     the new instance of {@link SecuritiesAccount19 }
     */
    public SecuritiesAccount19 createSecuritiesAccount19() {
        return new SecuritiesAccount19();
    }

    /**
     * Create an instance of {@link SecuritiesMovement9 }
     * 
     * @return
     *     the new instance of {@link SecuritiesMovement9 }
     */
    public SecuritiesMovement9 createSecuritiesMovement9() {
        return new SecuritiesMovement9();
    }

    /**
     * Create an instance of {@link SecurityIdentification19 }
     * 
     * @return
     *     the new instance of {@link SecurityIdentification19 }
     */
    public SecurityIdentification19 createSecurityIdentification19() {
        return new SecurityIdentification19();
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
     * Create an instance of {@link TradingPartyCapacity5Choice }
     * 
     * @return
     *     the new instance of {@link TradingPartyCapacity5Choice }
     */
    public TradingPartyCapacity5Choice createTradingPartyCapacity5Choice() {
        return new TradingPartyCapacity5Choice();
    }

    /**
     * Create an instance of {@link TransactionIdentifications45 }
     * 
     * @return
     *     the new instance of {@link TransactionIdentifications45 }
     */
    public TransactionIdentifications45 createTransactionIdentifications45() {
        return new TransactionIdentifications45();
    }

    /**
     * Create an instance of {@link TripartyCollateralTransactionInstructionV01 }
     * 
     * @return
     *     the new instance of {@link TripartyCollateralTransactionInstructionV01 }
     */
    public TripartyCollateralTransactionInstructionV01 createTripartyCollateralTransactionInstructionV01() {
        return new TripartyCollateralTransactionInstructionV01();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Document }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Document }{@code >}
     */
    @XmlElementDecl(namespace = "urn:iso:std:iso:20022:tech:xsd:colr.019.001.01", name = "Document")
    public JAXBElement<Document> createDocument(Document value) {
        return new JAXBElement<>(_Document_QNAME, Document.class, null, value);
    }

}
