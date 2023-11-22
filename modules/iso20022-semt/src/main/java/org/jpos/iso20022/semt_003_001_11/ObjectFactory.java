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

package org.jpos.iso20022.semt_003_001_11;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.jpos.iso20022.semt_003_001_11 package. 
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

    private static final QName _Document_QNAME = new QName("urn:iso:std:iso:20022:tech:xsd:semt.003.001.11", "Document");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.jpos.iso20022.semt_003_001_11
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
     * Create an instance of {@link Account29 }
     * 
     * @return
     *     the new instance of {@link Account29 }
     */
    public Account29 createAccount29() {
        return new Account29();
    }

    /**
     * Create an instance of {@link AccountIdentification26 }
     * 
     * @return
     *     the new instance of {@link AccountIdentification26 }
     */
    public AccountIdentification26 createAccountIdentification26() {
        return new AccountIdentification26();
    }

    /**
     * Create an instance of {@link ActiveOrHistoricCurrencyAnd13DecimalAmount }
     * 
     * @return
     *     the new instance of {@link ActiveOrHistoricCurrencyAnd13DecimalAmount }
     */
    public ActiveOrHistoricCurrencyAnd13DecimalAmount createActiveOrHistoricCurrencyAnd13DecimalAmount() {
        return new ActiveOrHistoricCurrencyAnd13DecimalAmount();
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
     * Create an instance of {@link AdditionalBalanceInformation22 }
     * 
     * @return
     *     the new instance of {@link AdditionalBalanceInformation22 }
     */
    public AdditionalBalanceInformation22 createAdditionalBalanceInformation22() {
        return new AdditionalBalanceInformation22();
    }

    /**
     * Create an instance of {@link AggregateBalanceInformation40 }
     * 
     * @return
     *     the new instance of {@link AggregateBalanceInformation40 }
     */
    public AggregateBalanceInformation40 createAggregateBalanceInformation40() {
        return new AggregateBalanceInformation40();
    }

    /**
     * Create an instance of {@link AggregateBalancePerSafekeepingPlace37 }
     * 
     * @return
     *     the new instance of {@link AggregateBalancePerSafekeepingPlace37 }
     */
    public AggregateBalancePerSafekeepingPlace37 createAggregateBalancePerSafekeepingPlace37() {
        return new AggregateBalancePerSafekeepingPlace37();
    }

    /**
     * Create an instance of {@link AmountAndDirection6 }
     * 
     * @return
     *     the new instance of {@link AmountAndDirection6 }
     */
    public AmountAndDirection6 createAmountAndDirection6() {
        return new AmountAndDirection6();
    }

    /**
     * Create an instance of {@link Balance16 }
     * 
     * @return
     *     the new instance of {@link Balance16 }
     */
    public Balance16 createBalance16() {
        return new Balance16();
    }

    /**
     * Create an instance of {@link Balance17 }
     * 
     * @return
     *     the new instance of {@link Balance17 }
     */
    public Balance17 createBalance17() {
        return new Balance17();
    }

    /**
     * Create an instance of {@link BalanceAmounts1 }
     * 
     * @return
     *     the new instance of {@link BalanceAmounts1 }
     */
    public BalanceAmounts1 createBalanceAmounts1() {
        return new BalanceAmounts1();
    }

    /**
     * Create an instance of {@link BalanceAmounts2 }
     * 
     * @return
     *     the new instance of {@link BalanceAmounts2 }
     */
    public BalanceAmounts2 createBalanceAmounts2() {
        return new BalanceAmounts2();
    }

    /**
     * Create an instance of {@link BalanceQuantity13Choice }
     * 
     * @return
     *     the new instance of {@link BalanceQuantity13Choice }
     */
    public BalanceQuantity13Choice createBalanceQuantity13Choice() {
        return new BalanceQuantity13Choice();
    }

    /**
     * Create an instance of {@link BlockChainAddressWallet1 }
     * 
     * @return
     *     the new instance of {@link BlockChainAddressWallet1 }
     */
    public BlockChainAddressWallet1 createBlockChainAddressWallet1() {
        return new BlockChainAddressWallet1();
    }

    /**
     * Create an instance of {@link BlockChainAddressWallet2 }
     * 
     * @return
     *     the new instance of {@link BlockChainAddressWallet2 }
     */
    public BlockChainAddressWallet2 createBlockChainAddressWallet2() {
        return new BlockChainAddressWallet2();
    }

    /**
     * Create an instance of {@link ClassificationType32Choice }
     * 
     * @return
     *     the new instance of {@link ClassificationType32Choice }
     */
    public ClassificationType32Choice createClassificationType32Choice() {
        return new ClassificationType32Choice();
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
     * Create an instance of {@link DerivativeBasicAttributes1 }
     * 
     * @return
     *     the new instance of {@link DerivativeBasicAttributes1 }
     */
    public DerivativeBasicAttributes1 createDerivativeBasicAttributes1() {
        return new DerivativeBasicAttributes1();
    }

    /**
     * Create an instance of {@link ExposureType22Choice }
     * 
     * @return
     *     the new instance of {@link ExposureType22Choice }
     */
    public ExposureType22Choice createExposureType22Choice() {
        return new ExposureType22Choice();
    }

    /**
     * Create an instance of {@link FinancialInstrument21 }
     * 
     * @return
     *     the new instance of {@link FinancialInstrument21 }
     */
    public FinancialInstrument21 createFinancialInstrument21() {
        return new FinancialInstrument21();
    }

    /**
     * Create an instance of {@link FinancialInstrumentAttributes111 }
     * 
     * @return
     *     the new instance of {@link FinancialInstrumentAttributes111 }
     */
    public FinancialInstrumentAttributes111 createFinancialInstrumentAttributes111() {
        return new FinancialInstrumentAttributes111();
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
     * Create an instance of {@link ForeignExchangeTerms34 }
     * 
     * @return
     *     the new instance of {@link ForeignExchangeTerms34 }
     */
    public ForeignExchangeTerms34 createForeignExchangeTerms34() {
        return new ForeignExchangeTerms34();
    }

    /**
     * Create an instance of {@link FormOfSecurity6Choice }
     * 
     * @return
     *     the new instance of {@link FormOfSecurity6Choice }
     */
    public FormOfSecurity6Choice createFormOfSecurity6Choice() {
        return new FormOfSecurity6Choice();
    }

    /**
     * Create an instance of {@link Frequency23Choice }
     * 
     * @return
     *     the new instance of {@link Frequency23Choice }
     */
    public Frequency23Choice createFrequency23Choice() {
        return new Frequency23Choice();
    }

    /**
     * Create an instance of {@link Frequency25Choice }
     * 
     * @return
     *     the new instance of {@link Frequency25Choice }
     */
    public Frequency25Choice createFrequency25Choice() {
        return new Frequency25Choice();
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
     * Create an instance of {@link GenericIdentification37 }
     * 
     * @return
     *     the new instance of {@link GenericIdentification37 }
     */
    public GenericIdentification37 createGenericIdentification37() {
        return new GenericIdentification37();
    }

    /**
     * Create an instance of {@link GenericIdentification56 }
     * 
     * @return
     *     the new instance of {@link GenericIdentification56 }
     */
    public GenericIdentification56 createGenericIdentification56() {
        return new GenericIdentification56();
    }

    /**
     * Create an instance of {@link GenericIdentification78 }
     * 
     * @return
     *     the new instance of {@link GenericIdentification78 }
     */
    public GenericIdentification78 createGenericIdentification78() {
        return new GenericIdentification78();
    }

    /**
     * Create an instance of {@link GenericIdentification80 }
     * 
     * @return
     *     the new instance of {@link GenericIdentification80 }
     */
    public GenericIdentification80 createGenericIdentification80() {
        return new GenericIdentification80();
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
     * Create an instance of {@link InterestComputationMethodFormat4Choice }
     * 
     * @return
     *     the new instance of {@link InterestComputationMethodFormat4Choice }
     */
    public InterestComputationMethodFormat4Choice createInterestComputationMethodFormat4Choice() {
        return new InterestComputationMethodFormat4Choice();
    }

    /**
     * Create an instance of {@link Intermediary44 }
     * 
     * @return
     *     the new instance of {@link Intermediary44 }
     */
    public Intermediary44 createIntermediary44() {
        return new Intermediary44();
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
     * Create an instance of {@link MarketIdentification3Choice }
     * 
     * @return
     *     the new instance of {@link MarketIdentification3Choice }
     */
    public MarketIdentification3Choice createMarketIdentification3Choice() {
        return new MarketIdentification3Choice();
    }

    /**
     * Create an instance of {@link MarketIdentification89 }
     * 
     * @return
     *     the new instance of {@link MarketIdentification89 }
     */
    public MarketIdentification89 createMarketIdentification89() {
        return new MarketIdentification89();
    }

    /**
     * Create an instance of {@link MarketType15Choice }
     * 
     * @return
     *     the new instance of {@link MarketType15Choice }
     */
    public MarketType15Choice createMarketType15Choice() {
        return new MarketType15Choice();
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
     * Create an instance of {@link Number22Choice }
     * 
     * @return
     *     the new instance of {@link Number22Choice }
     */
    public Number22Choice createNumber22Choice() {
        return new Number22Choice();
    }

    /**
     * Create an instance of {@link Number3Choice }
     * 
     * @return
     *     the new instance of {@link Number3Choice }
     */
    public Number3Choice createNumber3Choice() {
        return new Number3Choice();
    }

    /**
     * Create an instance of {@link OptionStyle8Choice }
     * 
     * @return
     *     the new instance of {@link OptionStyle8Choice }
     */
    public OptionStyle8Choice createOptionStyle8Choice() {
        return new OptionStyle8Choice();
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
     * Create an instance of {@link OriginalAndCurrentQuantities1 }
     * 
     * @return
     *     the new instance of {@link OriginalAndCurrentQuantities1 }
     */
    public OriginalAndCurrentQuantities1 createOriginalAndCurrentQuantities1() {
        return new OriginalAndCurrentQuantities1();
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
     * Create an instance of {@link PartyIdentification127Choice }
     * 
     * @return
     *     the new instance of {@link PartyIdentification127Choice }
     */
    public PartyIdentification127Choice createPartyIdentification127Choice() {
        return new PartyIdentification127Choice();
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
     * Create an instance of {@link PartyIdentification144 }
     * 
     * @return
     *     the new instance of {@link PartyIdentification144 }
     */
    public PartyIdentification144 createPartyIdentification144() {
        return new PartyIdentification144();
    }

    /**
     * Create an instance of {@link Pledgee3 }
     * 
     * @return
     *     the new instance of {@link Pledgee3 }
     */
    public Pledgee3 createPledgee3() {
        return new Pledgee3();
    }

    /**
     * Create an instance of {@link PledgeeFormat5Choice }
     * 
     * @return
     *     the new instance of {@link PledgeeFormat5Choice }
     */
    public PledgeeFormat5Choice createPledgeeFormat5Choice() {
        return new PledgeeFormat5Choice();
    }

    /**
     * Create an instance of {@link PledgeeTypeAndAnyBICIdentifier2 }
     * 
     * @return
     *     the new instance of {@link PledgeeTypeAndAnyBICIdentifier2 }
     */
    public PledgeeTypeAndAnyBICIdentifier2 createPledgeeTypeAndAnyBICIdentifier2() {
        return new PledgeeTypeAndAnyBICIdentifier2();
    }

    /**
     * Create an instance of {@link PledgeeTypeAndText1 }
     * 
     * @return
     *     the new instance of {@link PledgeeTypeAndText1 }
     */
    public PledgeeTypeAndText1 createPledgeeTypeAndText1() {
        return new PledgeeTypeAndText1();
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
     * Create an instance of {@link Price7 }
     * 
     * @return
     *     the new instance of {@link Price7 }
     */
    public Price7 createPrice7() {
        return new Price7();
    }

    /**
     * Create an instance of {@link PriceInformation20 }
     * 
     * @return
     *     the new instance of {@link PriceInformation20 }
     */
    public PriceInformation20 createPriceInformation20() {
        return new PriceInformation20();
    }

    /**
     * Create an instance of {@link PriceRateOrAmount3Choice }
     * 
     * @return
     *     the new instance of {@link PriceRateOrAmount3Choice }
     */
    public PriceRateOrAmount3Choice createPriceRateOrAmount3Choice() {
        return new PriceRateOrAmount3Choice();
    }

    /**
     * Create an instance of {@link PriceRateOrAmountOrUnknown2Choice }
     * 
     * @return
     *     the new instance of {@link PriceRateOrAmountOrUnknown2Choice }
     */
    public PriceRateOrAmountOrUnknown2Choice createPriceRateOrAmountOrUnknown2Choice() {
        return new PriceRateOrAmountOrUnknown2Choice();
    }

    /**
     * Create an instance of {@link PriceType4Choice }
     * 
     * @return
     *     the new instance of {@link PriceType4Choice }
     */
    public PriceType4Choice createPriceType4Choice() {
        return new PriceType4Choice();
    }

    /**
     * Create an instance of {@link PurposeCode7Choice }
     * 
     * @return
     *     the new instance of {@link PurposeCode7Choice }
     */
    public PurposeCode7Choice createPurposeCode7Choice() {
        return new PurposeCode7Choice();
    }

    /**
     * Create an instance of {@link Quantity51Choice }
     * 
     * @return
     *     the new instance of {@link Quantity51Choice }
     */
    public Quantity51Choice createQuantity51Choice() {
        return new Quantity51Choice();
    }

    /**
     * Create an instance of {@link QuantityAndAvailability3 }
     * 
     * @return
     *     the new instance of {@link QuantityAndAvailability3 }
     */
    public QuantityAndAvailability3 createQuantityAndAvailability3() {
        return new QuantityAndAvailability3();
    }

    /**
     * Create an instance of {@link QuantityBreakdown58 }
     * 
     * @return
     *     the new instance of {@link QuantityBreakdown58 }
     */
    public QuantityBreakdown58 createQuantityBreakdown58() {
        return new QuantityBreakdown58();
    }

    /**
     * Create an instance of {@link Role6Choice }
     * 
     * @return
     *     the new instance of {@link Role6Choice }
     */
    public Role6Choice createRole6Choice() {
        return new Role6Choice();
    }

    /**
     * Create an instance of {@link SafeKeepingPlace3 }
     * 
     * @return
     *     the new instance of {@link SafeKeepingPlace3 }
     */
    public SafeKeepingPlace3 createSafeKeepingPlace3() {
        return new SafeKeepingPlace3();
    }

    /**
     * Create an instance of {@link SafekeepingPlaceFormat29Choice }
     * 
     * @return
     *     the new instance of {@link SafekeepingPlaceFormat29Choice }
     */
    public SafekeepingPlaceFormat29Choice createSafekeepingPlaceFormat29Choice() {
        return new SafekeepingPlaceFormat29Choice();
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
     * Create an instance of {@link SafekeepingPlaceTypeAndText8 }
     * 
     * @return
     *     the new instance of {@link SafekeepingPlaceTypeAndText8 }
     */
    public SafekeepingPlaceTypeAndText8 createSafekeepingPlaceTypeAndText8() {
        return new SafekeepingPlaceTypeAndText8();
    }

    /**
     * Create an instance of {@link SecuritiesAccount25 }
     * 
     * @return
     *     the new instance of {@link SecuritiesAccount25 }
     */
    public SecuritiesAccount25 createSecuritiesAccount25() {
        return new SecuritiesAccount25();
    }

    /**
     * Create an instance of {@link SecuritiesAccount26 }
     * 
     * @return
     *     the new instance of {@link SecuritiesAccount26 }
     */
    public SecuritiesAccount26 createSecuritiesAccount26() {
        return new SecuritiesAccount26();
    }

    /**
     * Create an instance of {@link SecuritiesBalanceAccountingReportV11 }
     * 
     * @return
     *     the new instance of {@link SecuritiesBalanceAccountingReportV11 }
     */
    public SecuritiesBalanceAccountingReportV11 createSecuritiesBalanceAccountingReportV11() {
        return new SecuritiesBalanceAccountingReportV11();
    }

    /**
     * Create an instance of {@link SecuritiesPaymentStatus5Choice }
     * 
     * @return
     *     the new instance of {@link SecuritiesPaymentStatus5Choice }
     */
    public SecuritiesPaymentStatus5Choice createSecuritiesPaymentStatus5Choice() {
        return new SecuritiesPaymentStatus5Choice();
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
     * Create an instance of {@link SimpleIdentificationInformation4 }
     * 
     * @return
     *     the new instance of {@link SimpleIdentificationInformation4 }
     */
    public SimpleIdentificationInformation4 createSimpleIdentificationInformation4() {
        return new SimpleIdentificationInformation4();
    }

    /**
     * Create an instance of {@link Statement74 }
     * 
     * @return
     *     the new instance of {@link Statement74 }
     */
    public Statement74 createStatement74() {
        return new Statement74();
    }

    /**
     * Create an instance of {@link StatementBasis7Choice }
     * 
     * @return
     *     the new instance of {@link StatementBasis7Choice }
     */
    public StatementBasis7Choice createStatementBasis7Choice() {
        return new StatementBasis7Choice();
    }

    /**
     * Create an instance of {@link SubAccountIdentification65 }
     * 
     * @return
     *     the new instance of {@link SubAccountIdentification65 }
     */
    public SubAccountIdentification65 createSubAccountIdentification65() {
        return new SubAccountIdentification65();
    }

    /**
     * Create an instance of {@link SubBalanceInformation22 }
     * 
     * @return
     *     the new instance of {@link SubBalanceInformation22 }
     */
    public SubBalanceInformation22 createSubBalanceInformation22() {
        return new SubBalanceInformation22();
    }

    /**
     * Create an instance of {@link SubBalanceQuantity8Choice }
     * 
     * @return
     *     the new instance of {@link SubBalanceQuantity8Choice }
     */
    public SubBalanceQuantity8Choice createSubBalanceQuantity8Choice() {
        return new SubBalanceQuantity8Choice();
    }

    /**
     * Create an instance of {@link SubBalanceType11Choice }
     * 
     * @return
     *     the new instance of {@link SubBalanceType11Choice }
     */
    public SubBalanceType11Choice createSubBalanceType11Choice() {
        return new SubBalanceType11Choice();
    }

    /**
     * Create an instance of {@link SubBalanceType12Choice }
     * 
     * @return
     *     the new instance of {@link SubBalanceType12Choice }
     */
    public SubBalanceType12Choice createSubBalanceType12Choice() {
        return new SubBalanceType12Choice();
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
     * Create an instance of {@link TotalValueInPageAndStatement2 }
     * 
     * @return
     *     the new instance of {@link TotalValueInPageAndStatement2 }
     */
    public TotalValueInPageAndStatement2 createTotalValueInPageAndStatement2() {
        return new TotalValueInPageAndStatement2();
    }

    /**
     * Create an instance of {@link TypeOfPrice28Choice }
     * 
     * @return
     *     the new instance of {@link TypeOfPrice28Choice }
     */
    public TypeOfPrice28Choice createTypeOfPrice28Choice() {
        return new TypeOfPrice28Choice();
    }

    /**
     * Create an instance of {@link TypeOfPrice29Choice }
     * 
     * @return
     *     the new instance of {@link TypeOfPrice29Choice }
     */
    public TypeOfPrice29Choice createTypeOfPrice29Choice() {
        return new TypeOfPrice29Choice();
    }

    /**
     * Create an instance of {@link UpdateType15Choice }
     * 
     * @return
     *     the new instance of {@link UpdateType15Choice }
     */
    public UpdateType15Choice createUpdateType15Choice() {
        return new UpdateType15Choice();
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
     * Create an instance of {@link JAXBElement }{@code <}{@link Document }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Document }{@code >}
     */
    @XmlElementDecl(namespace = "urn:iso:std:iso:20022:tech:xsd:semt.003.001.11", name = "Document")
    public JAXBElement<Document> createDocument(Document value) {
        return new JAXBElement<>(_Document_QNAME, Document.class, null, value);
    }

}
