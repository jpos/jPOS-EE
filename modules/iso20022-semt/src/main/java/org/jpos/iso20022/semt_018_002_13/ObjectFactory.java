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

package org.jpos.iso20022.semt_018_002_13;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.jpos.iso20022.semt_018_002_13 package. 
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

    private static final QName _Document_QNAME = new QName("urn:iso:std:iso:20022:tech:xsd:semt.018.002.13", "Document");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.jpos.iso20022.semt_018_002_13
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
     * Create an instance of {@link AcknowledgedAcceptedStatus25Choice }
     * 
     * @return
     *     the new instance of {@link AcknowledgedAcceptedStatus25Choice }
     */
    public AcknowledgedAcceptedStatus25Choice createAcknowledgedAcceptedStatus25Choice() {
        return new AcknowledgedAcceptedStatus25Choice();
    }

    /**
     * Create an instance of {@link AcknowledgementReason13 }
     * 
     * @return
     *     the new instance of {@link AcknowledgementReason13 }
     */
    public AcknowledgementReason13 createAcknowledgementReason13() {
        return new AcknowledgementReason13();
    }

    /**
     * Create an instance of {@link AcknowledgementReason16Choice }
     * 
     * @return
     *     the new instance of {@link AcknowledgementReason16Choice }
     */
    public AcknowledgementReason16Choice createAcknowledgementReason16Choice() {
        return new AcknowledgementReason16Choice();
    }

    /**
     * Create an instance of {@link AmountAndDirection67 }
     * 
     * @return
     *     the new instance of {@link AmountAndDirection67 }
     */
    public AmountAndDirection67 createAmountAndDirection67() {
        return new AmountAndDirection67();
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
     * Create an instance of {@link BlockTrade5Choice }
     * 
     * @return
     *     the new instance of {@link BlockTrade5Choice }
     */
    public BlockTrade5Choice createBlockTrade5Choice() {
        return new BlockTrade5Choice();
    }

    /**
     * Create an instance of {@link CancellationReason24 }
     * 
     * @return
     *     the new instance of {@link CancellationReason24 }
     */
    public CancellationReason24 createCancellationReason24() {
        return new CancellationReason24();
    }

    /**
     * Create an instance of {@link CancellationReason37Choice }
     * 
     * @return
     *     the new instance of {@link CancellationReason37Choice }
     */
    public CancellationReason37Choice createCancellationReason37Choice() {
        return new CancellationReason37Choice();
    }

    /**
     * Create an instance of {@link CancellationStatus25Choice }
     * 
     * @return
     *     the new instance of {@link CancellationStatus25Choice }
     */
    public CancellationStatus25Choice createCancellationStatus25Choice() {
        return new CancellationStatus25Choice();
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
     * Create an instance of {@link CentralCounterPartyEligibility5Choice }
     * 
     * @return
     *     the new instance of {@link CentralCounterPartyEligibility5Choice }
     */
    public CentralCounterPartyEligibility5Choice createCentralCounterPartyEligibility5Choice() {
        return new CentralCounterPartyEligibility5Choice();
    }

    /**
     * Create an instance of {@link CorporateActionEventType101Choice }
     * 
     * @return
     *     the new instance of {@link CorporateActionEventType101Choice }
     */
    public CorporateActionEventType101Choice createCorporateActionEventType101Choice() {
        return new CorporateActionEventType101Choice();
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
     * Create an instance of {@link FailingReason12 }
     * 
     * @return
     *     the new instance of {@link FailingReason12 }
     */
    public FailingReason12 createFailingReason12() {
        return new FailingReason12();
    }

    /**
     * Create an instance of {@link FailingReason17Choice }
     * 
     * @return
     *     the new instance of {@link FailingReason17Choice }
     */
    public FailingReason17Choice createFailingReason17Choice() {
        return new FailingReason17Choice();
    }

    /**
     * Create an instance of {@link FailingStatus14Choice }
     * 
     * @return
     *     the new instance of {@link FailingStatus14Choice }
     */
    public FailingStatus14Choice createFailingStatus14Choice() {
        return new FailingStatus14Choice();
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
     * Create an instance of {@link Frequency26Choice }
     * 
     * @return
     *     the new instance of {@link Frequency26Choice }
     */
    public Frequency26Choice createFrequency26Choice() {
        return new Frequency26Choice();
    }

    /**
     * Create an instance of {@link GeneratedReason6 }
     * 
     * @return
     *     the new instance of {@link GeneratedReason6 }
     */
    public GeneratedReason6 createGeneratedReason6() {
        return new GeneratedReason6();
    }

    /**
     * Create an instance of {@link GeneratedReasons6Choice }
     * 
     * @return
     *     the new instance of {@link GeneratedReasons6Choice }
     */
    public GeneratedReasons6Choice createGeneratedReasons6Choice() {
        return new GeneratedReasons6Choice();
    }

    /**
     * Create an instance of {@link GeneratedStatus8Choice }
     * 
     * @return
     *     the new instance of {@link GeneratedStatus8Choice }
     */
    public GeneratedStatus8Choice createGeneratedStatus8Choice() {
        return new GeneratedStatus8Choice();
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
     * Create an instance of {@link HoldIndicator7 }
     * 
     * @return
     *     the new instance of {@link HoldIndicator7 }
     */
    public HoldIndicator7 createHoldIndicator7() {
        return new HoldIndicator7();
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
     * Create an instance of {@link InstructionProcessingStatus45Choice }
     * 
     * @return
     *     the new instance of {@link InstructionProcessingStatus45Choice }
     */
    public InstructionProcessingStatus45Choice createInstructionProcessingStatus45Choice() {
        return new InstructionProcessingStatus45Choice();
    }

    /**
     * Create an instance of {@link LetterOfGuarantee5Choice }
     * 
     * @return
     *     the new instance of {@link LetterOfGuarantee5Choice }
     */
    public LetterOfGuarantee5Choice createLetterOfGuarantee5Choice() {
        return new LetterOfGuarantee5Choice();
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
     * Create an instance of {@link MatchingStatus32Choice }
     * 
     * @return
     *     the new instance of {@link MatchingStatus32Choice }
     */
    public MatchingStatus32Choice createMatchingStatus32Choice() {
        return new MatchingStatus32Choice();
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
     * Create an instance of {@link NettingEligibility5Choice }
     * 
     * @return
     *     the new instance of {@link NettingEligibility5Choice }
     */
    public NettingEligibility5Choice createNettingEligibility5Choice() {
        return new NettingEligibility5Choice();
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
     * Create an instance of {@link OriginalAndCurrentQuantities4 }
     * 
     * @return
     *     the new instance of {@link OriginalAndCurrentQuantities4 }
     */
    public OriginalAndCurrentQuantities4 createOriginalAndCurrentQuantities4() {
        return new OriginalAndCurrentQuantities4();
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
     * Create an instance of {@link Pagination1 }
     * 
     * @return
     *     the new instance of {@link Pagination1 }
     */
    public Pagination1 createPagination1() {
        return new Pagination1();
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
     * Create an instance of {@link PartyIdentification156 }
     * 
     * @return
     *     the new instance of {@link PartyIdentification156 }
     */
    public PartyIdentification156 createPartyIdentification156() {
        return new PartyIdentification156();
    }

    /**
     * Create an instance of {@link PartyIdentification191 }
     * 
     * @return
     *     the new instance of {@link PartyIdentification191 }
     */
    public PartyIdentification191 createPartyIdentification191() {
        return new PartyIdentification191();
    }

    /**
     * Create an instance of {@link PartyIdentificationAndAccount215 }
     * 
     * @return
     *     the new instance of {@link PartyIdentificationAndAccount215 }
     */
    public PartyIdentificationAndAccount215 createPartyIdentificationAndAccount215() {
        return new PartyIdentificationAndAccount215();
    }

    /**
     * Create an instance of {@link PendingProcessingReason16 }
     * 
     * @return
     *     the new instance of {@link PendingProcessingReason16 }
     */
    public PendingProcessingReason16 createPendingProcessingReason16() {
        return new PendingProcessingReason16();
    }

    /**
     * Create an instance of {@link PendingProcessingReason18Choice }
     * 
     * @return
     *     the new instance of {@link PendingProcessingReason18Choice }
     */
    public PendingProcessingReason18Choice createPendingProcessingReason18Choice() {
        return new PendingProcessingReason18Choice();
    }

    /**
     * Create an instance of {@link PendingProcessingStatus19Choice }
     * 
     * @return
     *     the new instance of {@link PendingProcessingStatus19Choice }
     */
    public PendingProcessingStatus19Choice createPendingProcessingStatus19Choice() {
        return new PendingProcessingStatus19Choice();
    }

    /**
     * Create an instance of {@link PendingReason20 }
     * 
     * @return
     *     the new instance of {@link PendingReason20 }
     */
    public PendingReason20 createPendingReason20() {
        return new PendingReason20();
    }

    /**
     * Create an instance of {@link PendingReason31 }
     * 
     * @return
     *     the new instance of {@link PendingReason31 }
     */
    public PendingReason31 createPendingReason31() {
        return new PendingReason31();
    }

    /**
     * Create an instance of {@link PendingReason37Choice }
     * 
     * @return
     *     the new instance of {@link PendingReason37Choice }
     */
    public PendingReason37Choice createPendingReason37Choice() {
        return new PendingReason37Choice();
    }

    /**
     * Create an instance of {@link PendingReason65Choice }
     * 
     * @return
     *     the new instance of {@link PendingReason65Choice }
     */
    public PendingReason65Choice createPendingReason65Choice() {
        return new PendingReason65Choice();
    }

    /**
     * Create an instance of {@link PendingStatus46Choice }
     * 
     * @return
     *     the new instance of {@link PendingStatus46Choice }
     */
    public PendingStatus46Choice createPendingStatus46Choice() {
        return new PendingStatus46Choice();
    }

    /**
     * Create an instance of {@link PendingStatus69Choice }
     * 
     * @return
     *     the new instance of {@link PendingStatus69Choice }
     */
    public PendingStatus69Choice createPendingStatus69Choice() {
        return new PendingStatus69Choice();
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
     * Create an instance of {@link ProprietaryReason5 }
     * 
     * @return
     *     the new instance of {@link ProprietaryReason5 }
     */
    public ProprietaryReason5 createProprietaryReason5() {
        return new ProprietaryReason5();
    }

    /**
     * Create an instance of {@link ProprietaryStatusAndReason7 }
     * 
     * @return
     *     the new instance of {@link ProprietaryStatusAndReason7 }
     */
    public ProprietaryStatusAndReason7 createProprietaryStatusAndReason7() {
        return new ProprietaryStatusAndReason7();
    }

    /**
     * Create an instance of {@link Quantity54Choice }
     * 
     * @return
     *     the new instance of {@link Quantity54Choice }
     */
    public Quantity54Choice createQuantity54Choice() {
        return new Quantity54Choice();
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
     * Create an instance of {@link Registration12Choice }
     * 
     * @return
     *     the new instance of {@link Registration12Choice }
     */
    public Registration12Choice createRegistration12Choice() {
        return new Registration12Choice();
    }

    /**
     * Create an instance of {@link RegistrationReason6 }
     * 
     * @return
     *     the new instance of {@link RegistrationReason6 }
     */
    public RegistrationReason6 createRegistrationReason6() {
        return new RegistrationReason6();
    }

    /**
     * Create an instance of {@link RepairReason12 }
     * 
     * @return
     *     the new instance of {@link RepairReason12 }
     */
    public RepairReason12 createRepairReason12() {
        return new RepairReason12();
    }

    /**
     * Create an instance of {@link RepairReason14Choice }
     * 
     * @return
     *     the new instance of {@link RepairReason14Choice }
     */
    public RepairReason14Choice createRepairReason14Choice() {
        return new RepairReason14Choice();
    }

    /**
     * Create an instance of {@link RepairStatus16Choice }
     * 
     * @return
     *     the new instance of {@link RepairStatus16Choice }
     */
    public RepairStatus16Choice createRepairStatus16Choice() {
        return new RepairStatus16Choice();
    }

    /**
     * Create an instance of {@link RepurchaseType24Choice }
     * 
     * @return
     *     the new instance of {@link RepurchaseType24Choice }
     */
    public RepurchaseType24Choice createRepurchaseType24Choice() {
        return new RepurchaseType24Choice();
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
     * Create an instance of {@link RestrictedFINActiveOrHistoricCurrencyAndAmount }
     * 
     * @return
     *     the new instance of {@link RestrictedFINActiveOrHistoricCurrencyAndAmount }
     */
    public RestrictedFINActiveOrHistoricCurrencyAndAmount createRestrictedFINActiveOrHistoricCurrencyAndAmount() {
        return new RestrictedFINActiveOrHistoricCurrencyAndAmount();
    }

    /**
     * Create an instance of {@link Restriction6Choice }
     * 
     * @return
     *     the new instance of {@link Restriction6Choice }
     */
    public Restriction6Choice createRestriction6Choice() {
        return new Restriction6Choice();
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
     * Create an instance of {@link SecuritiesRTGS5Choice }
     * 
     * @return
     *     the new instance of {@link SecuritiesRTGS5Choice }
     */
    public SecuritiesRTGS5Choice createSecuritiesRTGS5Choice() {
        return new SecuritiesRTGS5Choice();
    }

    /**
     * Create an instance of {@link SecuritiesTransactionPendingReport002V13 }
     * 
     * @return
     *     the new instance of {@link SecuritiesTransactionPendingReport002V13 }
     */
    public SecuritiesTransactionPendingReport002V13 createSecuritiesTransactionPendingReport002V13() {
        return new SecuritiesTransactionPendingReport002V13();
    }

    /**
     * Create an instance of {@link SecuritiesTransactionType52Choice }
     * 
     * @return
     *     the new instance of {@link SecuritiesTransactionType52Choice }
     */
    public SecuritiesTransactionType52Choice createSecuritiesTransactionType52Choice() {
        return new SecuritiesTransactionType52Choice();
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
     * Create an instance of {@link SettlementDate32Choice }
     * 
     * @return
     *     the new instance of {@link SettlementDate32Choice }
     */
    public SettlementDate32Choice createSettlementDate32Choice() {
        return new SettlementDate32Choice();
    }

    /**
     * Create an instance of {@link SettlementDateCode11Choice }
     * 
     * @return
     *     the new instance of {@link SettlementDateCode11Choice }
     */
    public SettlementDateCode11Choice createSettlementDateCode11Choice() {
        return new SettlementDateCode11Choice();
    }

    /**
     * Create an instance of {@link SettlementDetails197 }
     * 
     * @return
     *     the new instance of {@link SettlementDetails197 }
     */
    public SettlementDetails197 createSettlementDetails197() {
        return new SettlementDetails197();
    }

    /**
     * Create an instance of {@link SettlementOrCorporateActionEvent32Choice }
     * 
     * @return
     *     the new instance of {@link SettlementOrCorporateActionEvent32Choice }
     */
    public SettlementOrCorporateActionEvent32Choice createSettlementOrCorporateActionEvent32Choice() {
        return new SettlementOrCorporateActionEvent32Choice();
    }

    /**
     * Create an instance of {@link SettlementParties109 }
     * 
     * @return
     *     the new instance of {@link SettlementParties109 }
     */
    public SettlementParties109 createSettlementParties109() {
        return new SettlementParties109();
    }

    /**
     * Create an instance of {@link SettlementStatus31Choice }
     * 
     * @return
     *     the new instance of {@link SettlementStatus31Choice }
     */
    public SettlementStatus31Choice createSettlementStatus31Choice() {
        return new SettlementStatus31Choice();
    }

    /**
     * Create an instance of {@link SettlementSystemMethod5Choice }
     * 
     * @return
     *     the new instance of {@link SettlementSystemMethod5Choice }
     */
    public SettlementSystemMethod5Choice createSettlementSystemMethod5Choice() {
        return new SettlementSystemMethod5Choice();
    }

    /**
     * Create an instance of {@link SettlementTransactionCondition37Choice }
     * 
     * @return
     *     the new instance of {@link SettlementTransactionCondition37Choice }
     */
    public SettlementTransactionCondition37Choice createSettlementTransactionCondition37Choice() {
        return new SettlementTransactionCondition37Choice();
    }

    /**
     * Create an instance of {@link SettlingCapacity8Choice }
     * 
     * @return
     *     the new instance of {@link SettlingCapacity8Choice }
     */
    public SettlingCapacity8Choice createSettlingCapacity8Choice() {
        return new SettlingCapacity8Choice();
    }

    /**
     * Create an instance of {@link Statement70 }
     * 
     * @return
     *     the new instance of {@link Statement70 }
     */
    public Statement70 createStatement70() {
        return new Statement70();
    }

    /**
     * Create an instance of {@link Status39Choice }
     * 
     * @return
     *     the new instance of {@link Status39Choice }
     */
    public Status39Choice createStatus39Choice() {
        return new Status39Choice();
    }

    /**
     * Create an instance of {@link StatusAndReason45 }
     * 
     * @return
     *     the new instance of {@link StatusAndReason45 }
     */
    public StatusAndReason45 createStatusAndReason45() {
        return new StatusAndReason45();
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
     * Create an instance of {@link TaxCapacityParty5Choice }
     * 
     * @return
     *     the new instance of {@link TaxCapacityParty5Choice }
     */
    public TaxCapacityParty5Choice createTaxCapacityParty5Choice() {
        return new TaxCapacityParty5Choice();
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
     * Create an instance of {@link Transaction125 }
     * 
     * @return
     *     the new instance of {@link Transaction125 }
     */
    public Transaction125 createTransaction125() {
        return new Transaction125();
    }

    /**
     * Create an instance of {@link Transaction127 }
     * 
     * @return
     *     the new instance of {@link Transaction127 }
     */
    public Transaction127 createTransaction127() {
        return new Transaction127();
    }

    /**
     * Create an instance of {@link TransactionActivity4Choice }
     * 
     * @return
     *     the new instance of {@link TransactionActivity4Choice }
     */
    public TransactionActivity4Choice createTransactionActivity4Choice() {
        return new TransactionActivity4Choice();
    }

    /**
     * Create an instance of {@link TransactionDetails164 }
     * 
     * @return
     *     the new instance of {@link TransactionDetails164 }
     */
    public TransactionDetails164 createTransactionDetails164() {
        return new TransactionDetails164();
    }

    /**
     * Create an instance of {@link UnmatchedReason20 }
     * 
     * @return
     *     the new instance of {@link UnmatchedReason20 }
     */
    public UnmatchedReason20 createUnmatchedReason20() {
        return new UnmatchedReason20();
    }

    /**
     * Create an instance of {@link UnmatchedReason27Choice }
     * 
     * @return
     *     the new instance of {@link UnmatchedReason27Choice }
     */
    public UnmatchedReason27Choice createUnmatchedReason27Choice() {
        return new UnmatchedReason27Choice();
    }

    /**
     * Create an instance of {@link UnmatchedStatus21Choice }
     * 
     * @return
     *     the new instance of {@link UnmatchedStatus21Choice }
     */
    public UnmatchedStatus21Choice createUnmatchedStatus21Choice() {
        return new UnmatchedStatus21Choice();
    }

    /**
     * Create an instance of {@link UpdateType16Choice }
     * 
     * @return
     *     the new instance of {@link UpdateType16Choice }
     */
    public UpdateType16Choice createUpdateType16Choice() {
        return new UpdateType16Choice();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Document }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Document }{@code >}
     */
    @XmlElementDecl(namespace = "urn:iso:std:iso:20022:tech:xsd:semt.018.002.13", name = "Document")
    public JAXBElement<Document> createDocument(Document value) {
        return new JAXBElement<>(_Document_QNAME, Document.class, null, value);
    }

}
