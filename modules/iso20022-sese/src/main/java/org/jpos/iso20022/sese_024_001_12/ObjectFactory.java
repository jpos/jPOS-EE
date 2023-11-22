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

package org.jpos.iso20022.sese_024_001_12;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.jpos.iso20022.sese_024_001_12 package. 
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

    private static final QName _Document_QNAME = new QName("urn:iso:std:iso:20022:tech:xsd:sese.024.001.12", "Document");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.jpos.iso20022.sese_024_001_12
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
     * Create an instance of {@link AcknowledgedAcceptedStatus21Choice }
     * 
     * @return
     *     the new instance of {@link AcknowledgedAcceptedStatus21Choice }
     */
    public AcknowledgedAcceptedStatus21Choice createAcknowledgedAcceptedStatus21Choice() {
        return new AcknowledgedAcceptedStatus21Choice();
    }

    /**
     * Create an instance of {@link AcknowledgementReason12Choice }
     * 
     * @return
     *     the new instance of {@link AcknowledgementReason12Choice }
     */
    public AcknowledgementReason12Choice createAcknowledgementReason12Choice() {
        return new AcknowledgementReason12Choice();
    }

    /**
     * Create an instance of {@link AcknowledgementReason9 }
     * 
     * @return
     *     the new instance of {@link AcknowledgementReason9 }
     */
    public AcknowledgementReason9 createAcknowledgementReason9() {
        return new AcknowledgementReason9();
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
     * Create an instance of {@link AmountAndDirection51 }
     * 
     * @return
     *     the new instance of {@link AmountAndDirection51 }
     */
    public AmountAndDirection51 createAmountAndDirection51() {
        return new AmountAndDirection51();
    }

    /**
     * Create an instance of {@link BeneficialOwnership4Choice }
     * 
     * @return
     *     the new instance of {@link BeneficialOwnership4Choice }
     */
    public BeneficialOwnership4Choice createBeneficialOwnership4Choice() {
        return new BeneficialOwnership4Choice();
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
     * Create an instance of {@link BlockTrade4Choice }
     * 
     * @return
     *     the new instance of {@link BlockTrade4Choice }
     */
    public BlockTrade4Choice createBlockTrade4Choice() {
        return new BlockTrade4Choice();
    }

    /**
     * Create an instance of {@link CancellationReason22 }
     * 
     * @return
     *     the new instance of {@link CancellationReason22 }
     */
    public CancellationReason22 createCancellationReason22() {
        return new CancellationReason22();
    }

    /**
     * Create an instance of {@link CancellationReason36Choice }
     * 
     * @return
     *     the new instance of {@link CancellationReason36Choice }
     */
    public CancellationReason36Choice createCancellationReason36Choice() {
        return new CancellationReason36Choice();
    }

    /**
     * Create an instance of {@link CancellationStatus24Choice }
     * 
     * @return
     *     the new instance of {@link CancellationStatus24Choice }
     */
    public CancellationStatus24Choice createCancellationStatus24Choice() {
        return new CancellationStatus24Choice();
    }

    /**
     * Create an instance of {@link CashSettlementSystem4Choice }
     * 
     * @return
     *     the new instance of {@link CashSettlementSystem4Choice }
     */
    public CashSettlementSystem4Choice createCashSettlementSystem4Choice() {
        return new CashSettlementSystem4Choice();
    }

    /**
     * Create an instance of {@link CentralCounterPartyEligibility4Choice }
     * 
     * @return
     *     the new instance of {@link CentralCounterPartyEligibility4Choice }
     */
    public CentralCounterPartyEligibility4Choice createCentralCounterPartyEligibility4Choice() {
        return new CentralCounterPartyEligibility4Choice();
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
     * Create an instance of {@link ExposureType22Choice }
     * 
     * @return
     *     the new instance of {@link ExposureType22Choice }
     */
    public ExposureType22Choice createExposureType22Choice() {
        return new ExposureType22Choice();
    }

    /**
     * Create an instance of {@link FailingReason11 }
     * 
     * @return
     *     the new instance of {@link FailingReason11 }
     */
    public FailingReason11 createFailingReason11() {
        return new FailingReason11();
    }

    /**
     * Create an instance of {@link FailingReason16Choice }
     * 
     * @return
     *     the new instance of {@link FailingReason16Choice }
     */
    public FailingReason16Choice createFailingReason16Choice() {
        return new FailingReason16Choice();
    }

    /**
     * Create an instance of {@link FailingStatus13Choice }
     * 
     * @return
     *     the new instance of {@link FailingStatus13Choice }
     */
    public FailingStatus13Choice createFailingStatus13Choice() {
        return new FailingStatus13Choice();
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
     * Create an instance of {@link GenericIdentification78 }
     * 
     * @return
     *     the new instance of {@link GenericIdentification78 }
     */
    public GenericIdentification78 createGenericIdentification78() {
        return new GenericIdentification78();
    }

    /**
     * Create an instance of {@link HoldIndicator6 }
     * 
     * @return
     *     the new instance of {@link HoldIndicator6 }
     */
    public HoldIndicator6 createHoldIndicator6() {
        return new HoldIndicator6();
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
     * Create an instance of {@link LetterOfGuarantee4Choice }
     * 
     * @return
     *     the new instance of {@link LetterOfGuarantee4Choice }
     */
    public LetterOfGuarantee4Choice createLetterOfGuarantee4Choice() {
        return new LetterOfGuarantee4Choice();
    }

    /**
     * Create an instance of {@link Linkages41 }
     * 
     * @return
     *     the new instance of {@link Linkages41 }
     */
    public Linkages41 createLinkages41() {
        return new Linkages41();
    }

    /**
     * Create an instance of {@link MarketClientSide6Choice }
     * 
     * @return
     *     the new instance of {@link MarketClientSide6Choice }
     */
    public MarketClientSide6Choice createMarketClientSide6Choice() {
        return new MarketClientSide6Choice();
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
     * Create an instance of {@link MatchingStatus24Choice }
     * 
     * @return
     *     the new instance of {@link MatchingStatus24Choice }
     */
    public MatchingStatus24Choice createMatchingStatus24Choice() {
        return new MatchingStatus24Choice();
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
     * Create an instance of {@link NettingEligibility4Choice }
     * 
     * @return
     *     the new instance of {@link NettingEligibility4Choice }
     */
    public NettingEligibility4Choice createNettingEligibility4Choice() {
        return new NettingEligibility4Choice();
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
     * Create an instance of {@link PartyIdentification120Choice }
     * 
     * @return
     *     the new instance of {@link PartyIdentification120Choice }
     */
    public PartyIdentification120Choice createPartyIdentification120Choice() {
        return new PartyIdentification120Choice();
    }

    /**
     * Create an instance of {@link PartyIdentification122Choice }
     * 
     * @return
     *     the new instance of {@link PartyIdentification122Choice }
     */
    public PartyIdentification122Choice createPartyIdentification122Choice() {
        return new PartyIdentification122Choice();
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
     * Create an instance of {@link PartyIdentification144 }
     * 
     * @return
     *     the new instance of {@link PartyIdentification144 }
     */
    public PartyIdentification144 createPartyIdentification144() {
        return new PartyIdentification144();
    }

    /**
     * Create an instance of {@link PartyIdentification148 }
     * 
     * @return
     *     the new instance of {@link PartyIdentification148 }
     */
    public PartyIdentification148 createPartyIdentification148() {
        return new PartyIdentification148();
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
     * Create an instance of {@link PartyIdentificationAndAccount195 }
     * 
     * @return
     *     the new instance of {@link PartyIdentificationAndAccount195 }
     */
    public PartyIdentificationAndAccount195 createPartyIdentificationAndAccount195() {
        return new PartyIdentificationAndAccount195();
    }

    /**
     * Create an instance of {@link PendingProcessingReason15 }
     * 
     * @return
     *     the new instance of {@link PendingProcessingReason15 }
     */
    public PendingProcessingReason15 createPendingProcessingReason15() {
        return new PendingProcessingReason15();
    }

    /**
     * Create an instance of {@link PendingProcessingReason17Choice }
     * 
     * @return
     *     the new instance of {@link PendingProcessingReason17Choice }
     */
    public PendingProcessingReason17Choice createPendingProcessingReason17Choice() {
        return new PendingProcessingReason17Choice();
    }

    /**
     * Create an instance of {@link PendingProcessingStatus18Choice }
     * 
     * @return
     *     the new instance of {@link PendingProcessingStatus18Choice }
     */
    public PendingProcessingStatus18Choice createPendingProcessingStatus18Choice() {
        return new PendingProcessingStatus18Choice();
    }

    /**
     * Create an instance of {@link PendingReason16 }
     * 
     * @return
     *     the new instance of {@link PendingReason16 }
     */
    public PendingReason16 createPendingReason16() {
        return new PendingReason16();
    }

    /**
     * Create an instance of {@link PendingReason28Choice }
     * 
     * @return
     *     the new instance of {@link PendingReason28Choice }
     */
    public PendingReason28Choice createPendingReason28Choice() {
        return new PendingReason28Choice();
    }

    /**
     * Create an instance of {@link PendingReason30 }
     * 
     * @return
     *     the new instance of {@link PendingReason30 }
     */
    public PendingReason30 createPendingReason30() {
        return new PendingReason30();
    }

    /**
     * Create an instance of {@link PendingReason63Choice }
     * 
     * @return
     *     the new instance of {@link PendingReason63Choice }
     */
    public PendingReason63Choice createPendingReason63Choice() {
        return new PendingReason63Choice();
    }

    /**
     * Create an instance of {@link PendingStatus38Choice }
     * 
     * @return
     *     the new instance of {@link PendingStatus38Choice }
     */
    public PendingStatus38Choice createPendingStatus38Choice() {
        return new PendingStatus38Choice();
    }

    /**
     * Create an instance of {@link PendingStatus67Choice }
     * 
     * @return
     *     the new instance of {@link PendingStatus67Choice }
     */
    public PendingStatus67Choice createPendingStatus67Choice() {
        return new PendingStatus67Choice();
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
     * Create an instance of {@link ProcessingPosition9Choice }
     * 
     * @return
     *     the new instance of {@link ProcessingPosition9Choice }
     */
    public ProcessingPosition9Choice createProcessingPosition9Choice() {
        return new ProcessingPosition9Choice();
    }

    /**
     * Create an instance of {@link ProcessingStatus88Choice }
     * 
     * @return
     *     the new instance of {@link ProcessingStatus88Choice }
     */
    public ProcessingStatus88Choice createProcessingStatus88Choice() {
        return new ProcessingStatus88Choice();
    }

    /**
     * Create an instance of {@link ProprietaryReason4 }
     * 
     * @return
     *     the new instance of {@link ProprietaryReason4 }
     */
    public ProprietaryReason4 createProprietaryReason4() {
        return new ProprietaryReason4();
    }

    /**
     * Create an instance of {@link ProprietaryStatusAndReason6 }
     * 
     * @return
     *     the new instance of {@link ProprietaryStatusAndReason6 }
     */
    public ProprietaryStatusAndReason6 createProprietaryStatusAndReason6() {
        return new ProprietaryStatusAndReason6();
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
     * Create an instance of {@link Registration10Choice }
     * 
     * @return
     *     the new instance of {@link Registration10Choice }
     */
    public Registration10Choice createRegistration10Choice() {
        return new Registration10Choice();
    }

    /**
     * Create an instance of {@link Registration9Choice }
     * 
     * @return
     *     the new instance of {@link Registration9Choice }
     */
    public Registration9Choice createRegistration9Choice() {
        return new Registration9Choice();
    }

    /**
     * Create an instance of {@link RegistrationReason5 }
     * 
     * @return
     *     the new instance of {@link RegistrationReason5 }
     */
    public RegistrationReason5 createRegistrationReason5() {
        return new RegistrationReason5();
    }

    /**
     * Create an instance of {@link RejectionReason44Choice }
     * 
     * @return
     *     the new instance of {@link RejectionReason44Choice }
     */
    public RejectionReason44Choice createRejectionReason44Choice() {
        return new RejectionReason44Choice();
    }

    /**
     * Create an instance of {@link RejectionReason59 }
     * 
     * @return
     *     the new instance of {@link RejectionReason59 }
     */
    public RejectionReason59 createRejectionReason59() {
        return new RejectionReason59();
    }

    /**
     * Create an instance of {@link RejectionStatus39Choice }
     * 
     * @return
     *     the new instance of {@link RejectionStatus39Choice }
     */
    public RejectionStatus39Choice createRejectionStatus39Choice() {
        return new RejectionStatus39Choice();
    }

    /**
     * Create an instance of {@link RepairReason10Choice }
     * 
     * @return
     *     the new instance of {@link RepairReason10Choice }
     */
    public RepairReason10Choice createRepairReason10Choice() {
        return new RepairReason10Choice();
    }

    /**
     * Create an instance of {@link RepairReason8 }
     * 
     * @return
     *     the new instance of {@link RepairReason8 }
     */
    public RepairReason8 createRepairReason8() {
        return new RepairReason8();
    }

    /**
     * Create an instance of {@link RepairStatus12Choice }
     * 
     * @return
     *     the new instance of {@link RepairStatus12Choice }
     */
    public RepairStatus12Choice createRepairStatus12Choice() {
        return new RepairStatus12Choice();
    }

    /**
     * Create an instance of {@link RepurchaseType22Choice }
     * 
     * @return
     *     the new instance of {@link RepurchaseType22Choice }
     */
    public RepurchaseType22Choice createRepurchaseType22Choice() {
        return new RepurchaseType22Choice();
    }

    /**
     * Create an instance of {@link Restriction5Choice }
     * 
     * @return
     *     the new instance of {@link Restriction5Choice }
     */
    public Restriction5Choice createRestriction5Choice() {
        return new Restriction5Choice();
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
     * Create an instance of {@link SecuritiesAccount19 }
     * 
     * @return
     *     the new instance of {@link SecuritiesAccount19 }
     */
    public SecuritiesAccount19 createSecuritiesAccount19() {
        return new SecuritiesAccount19();
    }

    /**
     * Create an instance of {@link SecuritiesRTGS4Choice }
     * 
     * @return
     *     the new instance of {@link SecuritiesRTGS4Choice }
     */
    public SecuritiesRTGS4Choice createSecuritiesRTGS4Choice() {
        return new SecuritiesRTGS4Choice();
    }

    /**
     * Create an instance of {@link SecuritiesSettlementTransactionStatusAdviceV12 }
     * 
     * @return
     *     the new instance of {@link SecuritiesSettlementTransactionStatusAdviceV12 }
     */
    public SecuritiesSettlementTransactionStatusAdviceV12 createSecuritiesSettlementTransactionStatusAdviceV12() {
        return new SecuritiesSettlementTransactionStatusAdviceV12();
    }

    /**
     * Create an instance of {@link SecuritiesTransactionType44Choice }
     * 
     * @return
     *     the new instance of {@link SecuritiesTransactionType44Choice }
     */
    public SecuritiesTransactionType44Choice createSecuritiesTransactionType44Choice() {
        return new SecuritiesTransactionType44Choice();
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
     * Create an instance of {@link SettlementDate19Choice }
     * 
     * @return
     *     the new instance of {@link SettlementDate19Choice }
     */
    public SettlementDate19Choice createSettlementDate19Choice() {
        return new SettlementDate19Choice();
    }

    /**
     * Create an instance of {@link SettlementDateCode8Choice }
     * 
     * @return
     *     the new instance of {@link SettlementDateCode8Choice }
     */
    public SettlementDateCode8Choice createSettlementDateCode8Choice() {
        return new SettlementDateCode8Choice();
    }

    /**
     * Create an instance of {@link SettlementDetails202 }
     * 
     * @return
     *     the new instance of {@link SettlementDetails202 }
     */
    public SettlementDetails202 createSettlementDetails202() {
        return new SettlementDetails202();
    }

    /**
     * Create an instance of {@link SettlementParties97 }
     * 
     * @return
     *     the new instance of {@link SettlementParties97 }
     */
    public SettlementParties97 createSettlementParties97() {
        return new SettlementParties97();
    }

    /**
     * Create an instance of {@link SettlementStatus30Choice }
     * 
     * @return
     *     the new instance of {@link SettlementStatus30Choice }
     */
    public SettlementStatus30Choice createSettlementStatus30Choice() {
        return new SettlementStatus30Choice();
    }

    /**
     * Create an instance of {@link SettlementSystemMethod4Choice }
     * 
     * @return
     *     the new instance of {@link SettlementSystemMethod4Choice }
     */
    public SettlementSystemMethod4Choice createSettlementSystemMethod4Choice() {
        return new SettlementSystemMethod4Choice();
    }

    /**
     * Create an instance of {@link SettlementTransactionCondition34Choice }
     * 
     * @return
     *     the new instance of {@link SettlementTransactionCondition34Choice }
     */
    public SettlementTransactionCondition34Choice createSettlementTransactionCondition34Choice() {
        return new SettlementTransactionCondition34Choice();
    }

    /**
     * Create an instance of {@link SettlingCapacity7Choice }
     * 
     * @return
     *     the new instance of {@link SettlingCapacity7Choice }
     */
    public SettlingCapacity7Choice createSettlingCapacity7Choice() {
        return new SettlingCapacity7Choice();
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
     * Create an instance of {@link TaxCapacityParty4Choice }
     * 
     * @return
     *     the new instance of {@link TaxCapacityParty4Choice }
     */
    public TaxCapacityParty4Choice createTaxCapacityParty4Choice() {
        return new TaxCapacityParty4Choice();
    }

    /**
     * Create an instance of {@link TradeDate8Choice }
     * 
     * @return
     *     the new instance of {@link TradeDate8Choice }
     */
    public TradeDate8Choice createTradeDate8Choice() {
        return new TradeDate8Choice();
    }

    /**
     * Create an instance of {@link TradeDateCode3Choice }
     * 
     * @return
     *     the new instance of {@link TradeDateCode3Choice }
     */
    public TradeDateCode3Choice createTradeDateCode3Choice() {
        return new TradeDateCode3Choice();
    }

    /**
     * Create an instance of {@link TransactionDetails148 }
     * 
     * @return
     *     the new instance of {@link TransactionDetails148 }
     */
    public TransactionDetails148 createTransactionDetails148() {
        return new TransactionDetails148();
    }

    /**
     * Create an instance of {@link TransactionIdentifications47 }
     * 
     * @return
     *     the new instance of {@link TransactionIdentifications47 }
     */
    public TransactionIdentifications47 createTransactionIdentifications47() {
        return new TransactionIdentifications47();
    }

    /**
     * Create an instance of {@link UnmatchedReason15 }
     * 
     * @return
     *     the new instance of {@link UnmatchedReason15 }
     */
    public UnmatchedReason15 createUnmatchedReason15() {
        return new UnmatchedReason15();
    }

    /**
     * Create an instance of {@link UnmatchedReason21Choice }
     * 
     * @return
     *     the new instance of {@link UnmatchedReason21Choice }
     */
    public UnmatchedReason21Choice createUnmatchedReason21Choice() {
        return new UnmatchedReason21Choice();
    }

    /**
     * Create an instance of {@link UnmatchedStatus16Choice }
     * 
     * @return
     *     the new instance of {@link UnmatchedStatus16Choice }
     */
    public UnmatchedStatus16Choice createUnmatchedStatus16Choice() {
        return new UnmatchedStatus16Choice();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Document }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Document }{@code >}
     */
    @XmlElementDecl(namespace = "urn:iso:std:iso:20022:tech:xsd:sese.024.001.12", name = "Document")
    public JAXBElement<Document> createDocument(Document value) {
        return new JAXBElement<>(_Document_QNAME, Document.class, null, value);
    }

}
