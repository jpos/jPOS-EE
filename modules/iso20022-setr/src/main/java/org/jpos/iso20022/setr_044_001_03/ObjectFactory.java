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

package org.jpos.iso20022.setr_044_001_03;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.jpos.iso20022.setr_044_001_03 package. 
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

    private static final QName _Document_QNAME = new QName("urn:iso:std:iso:20022:tech:xsd:setr.044.001.03", "Document");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.jpos.iso20022.setr_044_001_03
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
     * Create an instance of {@link AccountIdentification55Choice }
     * 
     * @return
     *     the new instance of {@link AccountIdentification55Choice }
     */
    public AccountIdentification55Choice createAccountIdentification55Choice() {
        return new AccountIdentification55Choice();
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
     * Create an instance of {@link AffirmationReason2 }
     * 
     * @return
     *     the new instance of {@link AffirmationReason2 }
     */
    public AffirmationReason2 createAffirmationReason2() {
        return new AffirmationReason2();
    }

    /**
     * Create an instance of {@link AffirmationReason2Choice }
     * 
     * @return
     *     the new instance of {@link AffirmationReason2Choice }
     */
    public AffirmationReason2Choice createAffirmationReason2Choice() {
        return new AffirmationReason2Choice();
    }

    /**
     * Create an instance of {@link AffirmationStatus11Choice }
     * 
     * @return
     *     the new instance of {@link AffirmationStatus11Choice }
     */
    public AffirmationStatus11Choice createAffirmationStatus11Choice() {
        return new AffirmationStatus11Choice();
    }

    /**
     * Create an instance of {@link AllegementMatchingReason2 }
     * 
     * @return
     *     the new instance of {@link AllegementMatchingReason2 }
     */
    public AllegementMatchingReason2 createAllegementMatchingReason2() {
        return new AllegementMatchingReason2();
    }

    /**
     * Create an instance of {@link AllegementReason2Choice }
     * 
     * @return
     *     the new instance of {@link AllegementReason2Choice }
     */
    public AllegementReason2Choice createAllegementReason2Choice() {
        return new AllegementReason2Choice();
    }

    /**
     * Create an instance of {@link AlternatePartyIdentification8 }
     * 
     * @return
     *     the new instance of {@link AlternatePartyIdentification8 }
     */
    public AlternatePartyIdentification8 createAlternatePartyIdentification8() {
        return new AlternatePartyIdentification8();
    }

    /**
     * Create an instance of {@link AmountAndDirection29 }
     * 
     * @return
     *     the new instance of {@link AmountAndDirection29 }
     */
    public AmountAndDirection29 createAmountAndDirection29() {
        return new AmountAndDirection29();
    }

    /**
     * Create an instance of {@link AmountOrRate2Choice }
     * 
     * @return
     *     the new instance of {@link AmountOrRate2Choice }
     */
    public AmountOrRate2Choice createAmountOrRate2Choice() {
        return new AmountOrRate2Choice();
    }

    /**
     * Create an instance of {@link AwaitingAffirmationReason2 }
     * 
     * @return
     *     the new instance of {@link AwaitingAffirmationReason2 }
     */
    public AwaitingAffirmationReason2 createAwaitingAffirmationReason2() {
        return new AwaitingAffirmationReason2();
    }

    /**
     * Create an instance of {@link AwaitingAffirmationReason2Choice }
     * 
     * @return
     *     the new instance of {@link AwaitingAffirmationReason2Choice }
     */
    public AwaitingAffirmationReason2Choice createAwaitingAffirmationReason2Choice() {
        return new AwaitingAffirmationReason2Choice();
    }

    /**
     * Create an instance of {@link AwaitingCancellationReason2 }
     * 
     * @return
     *     the new instance of {@link AwaitingCancellationReason2 }
     */
    public AwaitingCancellationReason2 createAwaitingCancellationReason2() {
        return new AwaitingCancellationReason2();
    }

    /**
     * Create an instance of {@link AwaitingCancellationReason2Choice }
     * 
     * @return
     *     the new instance of {@link AwaitingCancellationReason2Choice }
     */
    public AwaitingCancellationReason2Choice createAwaitingCancellationReason2Choice() {
        return new AwaitingCancellationReason2Choice();
    }

    /**
     * Create an instance of {@link BusinessProcessType2Choice }
     * 
     * @return
     *     the new instance of {@link BusinessProcessType2Choice }
     */
    public BusinessProcessType2Choice createBusinessProcessType2Choice() {
        return new BusinessProcessType2Choice();
    }

    /**
     * Create an instance of {@link CancellationProcessingStatus10Choice }
     * 
     * @return
     *     the new instance of {@link CancellationProcessingStatus10Choice }
     */
    public CancellationProcessingStatus10Choice createCancellationProcessingStatus10Choice() {
        return new CancellationProcessingStatus10Choice();
    }

    /**
     * Create an instance of {@link CancellationReason39Choice }
     * 
     * @return
     *     the new instance of {@link CancellationReason39Choice }
     */
    public CancellationReason39Choice createCancellationReason39Choice() {
        return new CancellationReason39Choice();
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
     * Create an instance of {@link ChargeTaxBasisType2Choice }
     * 
     * @return
     *     the new instance of {@link ChargeTaxBasisType2Choice }
     */
    public ChargeTaxBasisType2Choice createChargeTaxBasisType2Choice() {
        return new ChargeTaxBasisType2Choice();
    }

    /**
     * Create an instance of {@link Commission25 }
     * 
     * @return
     *     the new instance of {@link Commission25 }
     */
    public Commission25 createCommission25() {
        return new Commission25();
    }

    /**
     * Create an instance of {@link CommissionType6Choice }
     * 
     * @return
     *     the new instance of {@link CommissionType6Choice }
     */
    public CommissionType6Choice createCommissionType6Choice() {
        return new CommissionType6Choice();
    }

    /**
     * Create an instance of {@link ConfirmationParties9 }
     * 
     * @return
     *     the new instance of {@link ConfirmationParties9 }
     */
    public ConfirmationParties9 createConfirmationParties9() {
        return new ConfirmationParties9();
    }

    /**
     * Create an instance of {@link ConfirmationPartyDetails11 }
     * 
     * @return
     *     the new instance of {@link ConfirmationPartyDetails11 }
     */
    public ConfirmationPartyDetails11 createConfirmationPartyDetails11() {
        return new ConfirmationPartyDetails11();
    }

    /**
     * Create an instance of {@link ConfirmationPartyDetails12 }
     * 
     * @return
     *     the new instance of {@link ConfirmationPartyDetails12 }
     */
    public ConfirmationPartyDetails12 createConfirmationPartyDetails12() {
        return new ConfirmationPartyDetails12();
    }

    /**
     * Create an instance of {@link ConfirmationPartyDetails14 }
     * 
     * @return
     *     the new instance of {@link ConfirmationPartyDetails14 }
     */
    public ConfirmationPartyDetails14 createConfirmationPartyDetails14() {
        return new ConfirmationPartyDetails14();
    }

    /**
     * Create an instance of {@link ConfirmationPartyDetails16 }
     * 
     * @return
     *     the new instance of {@link ConfirmationPartyDetails16 }
     */
    public ConfirmationPartyDetails16 createConfirmationPartyDetails16() {
        return new ConfirmationPartyDetails16();
    }

    /**
     * Create an instance of {@link CurrencyToBuyOrSell1Choice }
     * 
     * @return
     *     the new instance of {@link CurrencyToBuyOrSell1Choice }
     */
    public CurrencyToBuyOrSell1Choice createCurrencyToBuyOrSell1Choice() {
        return new CurrencyToBuyOrSell1Choice();
    }

    /**
     * Create an instance of {@link DateAndDateTime1Choice }
     * 
     * @return
     *     the new instance of {@link DateAndDateTime1Choice }
     */
    public DateAndDateTime1Choice createDateAndDateTime1Choice() {
        return new DateAndDateTime1Choice();
    }

    /**
     * Create an instance of {@link DateTimePeriod1 }
     * 
     * @return
     *     the new instance of {@link DateTimePeriod1 }
     */
    public DateTimePeriod1 createDateTimePeriod1() {
        return new DateTimePeriod1();
    }

    /**
     * Create an instance of {@link DateTimePeriod1Choice }
     * 
     * @return
     *     the new instance of {@link DateTimePeriod1Choice }
     */
    public DateTimePeriod1Choice createDateTimePeriod1Choice() {
        return new DateTimePeriod1Choice();
    }

    /**
     * Create an instance of {@link DocumentNumber17Choice }
     * 
     * @return
     *     the new instance of {@link DocumentNumber17Choice }
     */
    public DocumentNumber17Choice createDocumentNumber17Choice() {
        return new DocumentNumber17Choice();
    }

    /**
     * Create an instance of {@link EUCapitalGainType3Choice }
     * 
     * @return
     *     the new instance of {@link EUCapitalGainType3Choice }
     */
    public EUCapitalGainType3Choice createEUCapitalGainType3Choice() {
        return new EUCapitalGainType3Choice();
    }

    /**
     * Create an instance of {@link FinancialInstrumentQuantity1Choice }
     * 
     * @return
     *     the new instance of {@link FinancialInstrumentQuantity1Choice }
     */
    public FinancialInstrumentQuantity1Choice createFinancialInstrumentQuantity1Choice() {
        return new FinancialInstrumentQuantity1Choice();
    }

    /**
     * Create an instance of {@link ForeignExchangeTerms18 }
     * 
     * @return
     *     the new instance of {@link ForeignExchangeTerms18 }
     */
    public ForeignExchangeTerms18 createForeignExchangeTerms18() {
        return new ForeignExchangeTerms18();
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
     * Create an instance of {@link IdentificationReference11Choice }
     * 
     * @return
     *     the new instance of {@link IdentificationReference11Choice }
     */
    public IdentificationReference11Choice createIdentificationReference11Choice() {
        return new IdentificationReference11Choice();
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
     * Create an instance of {@link IdentificationType43Choice }
     * 
     * @return
     *     the new instance of {@link IdentificationType43Choice }
     */
    public IdentificationType43Choice createIdentificationType43Choice() {
        return new IdentificationType43Choice();
    }

    /**
     * Create an instance of {@link InstructionProcessingReason3Choice }
     * 
     * @return
     *     the new instance of {@link InstructionProcessingReason3Choice }
     */
    public InstructionProcessingReason3Choice createInstructionProcessingReason3Choice() {
        return new InstructionProcessingReason3Choice();
    }

    /**
     * Create an instance of {@link InstructionProcessingReason4Choice }
     * 
     * @return
     *     the new instance of {@link InstructionProcessingReason4Choice }
     */
    public InstructionProcessingReason4Choice createInstructionProcessingReason4Choice() {
        return new InstructionProcessingReason4Choice();
    }

    /**
     * Create an instance of {@link InvestorCapacity4Choice }
     * 
     * @return
     *     the new instance of {@link InvestorCapacity4Choice }
     */
    public InvestorCapacity4Choice createInvestorCapacity4Choice() {
        return new InvestorCapacity4Choice();
    }

    /**
     * Create an instance of {@link Linkages72 }
     * 
     * @return
     *     the new instance of {@link Linkages72 }
     */
    public Linkages72 createLinkages72() {
        return new Linkages72();
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
     * Create an instance of {@link MarketIdentification93 }
     * 
     * @return
     *     the new instance of {@link MarketIdentification93 }
     */
    public MarketIdentification93 createMarketIdentification93() {
        return new MarketIdentification93();
    }

    /**
     * Create an instance of {@link MarketIdentification97 }
     * 
     * @return
     *     the new instance of {@link MarketIdentification97 }
     */
    public MarketIdentification97 createMarketIdentification97() {
        return new MarketIdentification97();
    }

    /**
     * Create an instance of {@link MarketType18Choice }
     * 
     * @return
     *     the new instance of {@link MarketType18Choice }
     */
    public MarketType18Choice createMarketType18Choice() {
        return new MarketType18Choice();
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
     * Create an instance of {@link MatchingReason5Choice }
     * 
     * @return
     *     the new instance of {@link MatchingReason5Choice }
     */
    public MatchingReason5Choice createMatchingReason5Choice() {
        return new MatchingReason5Choice();
    }

    /**
     * Create an instance of {@link MatchingReason6Choice }
     * 
     * @return
     *     the new instance of {@link MatchingReason6Choice }
     */
    public MatchingReason6Choice createMatchingReason6Choice() {
        return new MatchingReason6Choice();
    }

    /**
     * Create an instance of {@link MatchingStatus27Choice }
     * 
     * @return
     *     the new instance of {@link MatchingStatus27Choice }
     */
    public MatchingStatus27Choice createMatchingStatus27Choice() {
        return new MatchingStatus27Choice();
    }

    /**
     * Create an instance of {@link MatchingStatus35Choice }
     * 
     * @return
     *     the new instance of {@link MatchingStatus35Choice }
     */
    public MatchingStatus35Choice createMatchingStatus35Choice() {
        return new MatchingStatus35Choice();
    }

    /**
     * Create an instance of {@link NameAndAddress13 }
     * 
     * @return
     *     the new instance of {@link NameAndAddress13 }
     */
    public NameAndAddress13 createNameAndAddress13() {
        return new NameAndAddress13();
    }

    /**
     * Create an instance of {@link Order23 }
     * 
     * @return
     *     the new instance of {@link Order23 }
     */
    public Order23 createOrder23() {
        return new Order23();
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
     * Create an instance of {@link PartialFill4 }
     * 
     * @return
     *     the new instance of {@link PartialFill4 }
     */
    public PartialFill4 createPartialFill4() {
        return new PartialFill4();
    }

    /**
     * Create an instance of {@link PartyIdentification240Choice }
     * 
     * @return
     *     the new instance of {@link PartyIdentification240Choice }
     */
    public PartyIdentification240Choice createPartyIdentification240Choice() {
        return new PartyIdentification240Choice();
    }

    /**
     * Create an instance of {@link PartyIdentification244Choice }
     * 
     * @return
     *     the new instance of {@link PartyIdentification244Choice }
     */
    public PartyIdentification244Choice createPartyIdentification244Choice() {
        return new PartyIdentification244Choice();
    }

    /**
     * Create an instance of {@link PartyIdentification267 }
     * 
     * @return
     *     the new instance of {@link PartyIdentification267 }
     */
    public PartyIdentification267 createPartyIdentification267() {
        return new PartyIdentification267();
    }

    /**
     * Create an instance of {@link PartyIdentification268 }
     * 
     * @return
     *     the new instance of {@link PartyIdentification268 }
     */
    public PartyIdentification268 createPartyIdentification268() {
        return new PartyIdentification268();
    }

    /**
     * Create an instance of {@link PartyIdentificationAndAccount218 }
     * 
     * @return
     *     the new instance of {@link PartyIdentificationAndAccount218 }
     */
    public PartyIdentificationAndAccount218 createPartyIdentificationAndAccount218() {
        return new PartyIdentificationAndAccount218();
    }

    /**
     * Create an instance of {@link PartyIdentificationAndAccount220 }
     * 
     * @return
     *     the new instance of {@link PartyIdentificationAndAccount220 }
     */
    public PartyIdentificationAndAccount220 createPartyIdentificationAndAccount220() {
        return new PartyIdentificationAndAccount220();
    }

    /**
     * Create an instance of {@link PartyTextInformation1 }
     * 
     * @return
     *     the new instance of {@link PartyTextInformation1 }
     */
    public PartyTextInformation1 createPartyTextInformation1() {
        return new PartyTextInformation1();
    }

    /**
     * Create an instance of {@link PartyTextInformation5 }
     * 
     * @return
     *     the new instance of {@link PartyTextInformation5 }
     */
    public PartyTextInformation5 createPartyTextInformation5() {
        return new PartyTextInformation5();
    }

    /**
     * Create an instance of {@link PendingProcessing2Choice }
     * 
     * @return
     *     the new instance of {@link PendingProcessing2Choice }
     */
    public PendingProcessing2Choice createPendingProcessing2Choice() {
        return new PendingProcessing2Choice();
    }

    /**
     * Create an instance of {@link PostalAddress8 }
     * 
     * @return
     *     the new instance of {@link PostalAddress8 }
     */
    public PostalAddress8 createPostalAddress8() {
        return new PostalAddress8();
    }

    /**
     * Create an instance of {@link Price14 }
     * 
     * @return
     *     the new instance of {@link Price14 }
     */
    public Price14 createPrice14() {
        return new Price14();
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
     * Create an instance of {@link ProcessingStatus98Choice }
     * 
     * @return
     *     the new instance of {@link ProcessingStatus98Choice }
     */
    public ProcessingStatus98Choice createProcessingStatus98Choice() {
        return new ProcessingStatus98Choice();
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
     * Create an instance of {@link PurposeCode9Choice }
     * 
     * @return
     *     the new instance of {@link PurposeCode9Choice }
     */
    public PurposeCode9Choice createPurposeCode9Choice() {
        return new PurposeCode9Choice();
    }

    /**
     * Create an instance of {@link Quantity6Choice }
     * 
     * @return
     *     the new instance of {@link Quantity6Choice }
     */
    public Quantity6Choice createQuantity6Choice() {
        return new Quantity6Choice();
    }

    /**
     * Create an instance of {@link QuantityBreakdown76 }
     * 
     * @return
     *     the new instance of {@link QuantityBreakdown76 }
     */
    public QuantityBreakdown76 createQuantityBreakdown76() {
        return new QuantityBreakdown76();
    }

    /**
     * Create an instance of {@link QuantityOrAmount2Choice }
     * 
     * @return
     *     the new instance of {@link QuantityOrAmount2Choice }
     */
    public QuantityOrAmount2Choice createQuantityOrAmount2Choice() {
        return new QuantityOrAmount2Choice();
    }

    /**
     * Create an instance of {@link RegistrationParameters3 }
     * 
     * @return
     *     the new instance of {@link RegistrationParameters3 }
     */
    public RegistrationParameters3 createRegistrationParameters3() {
        return new RegistrationParameters3();
    }

    /**
     * Create an instance of {@link RejectionReason52Choice }
     * 
     * @return
     *     the new instance of {@link RejectionReason52Choice }
     */
    public RejectionReason52Choice createRejectionReason52Choice() {
        return new RejectionReason52Choice();
    }

    /**
     * Create an instance of {@link RejectionReason67 }
     * 
     * @return
     *     the new instance of {@link RejectionReason67 }
     */
    public RejectionReason67 createRejectionReason67() {
        return new RejectionReason67();
    }

    /**
     * Create an instance of {@link RepairReason14 }
     * 
     * @return
     *     the new instance of {@link RepairReason14 }
     */
    public RepairReason14 createRepairReason14() {
        return new RepairReason14();
    }

    /**
     * Create an instance of {@link RepairReason19Choice }
     * 
     * @return
     *     the new instance of {@link RepairReason19Choice }
     */
    public RepairReason19Choice createRepairReason19Choice() {
        return new RepairReason19Choice();
    }

    /**
     * Create an instance of {@link ReplacementProcessingStatus10Choice }
     * 
     * @return
     *     the new instance of {@link ReplacementProcessingStatus10Choice }
     */
    public ReplacementProcessingStatus10Choice createReplacementProcessingStatus10Choice() {
        return new ReplacementProcessingStatus10Choice();
    }

    /**
     * Create an instance of {@link Reporting6Choice }
     * 
     * @return
     *     the new instance of {@link Reporting6Choice }
     */
    public Reporting6Choice createReporting6Choice() {
        return new Reporting6Choice();
    }

    /**
     * Create an instance of {@link SecuritiesAccount35 }
     * 
     * @return
     *     the new instance of {@link SecuritiesAccount35 }
     */
    public SecuritiesAccount35 createSecuritiesAccount35() {
        return new SecuritiesAccount35();
    }

    /**
     * Create an instance of {@link SecuritiesCertificate3 }
     * 
     * @return
     *     the new instance of {@link SecuritiesCertificate3 }
     */
    public SecuritiesCertificate3 createSecuritiesCertificate3() {
        return new SecuritiesCertificate3();
    }

    /**
     * Create an instance of {@link SecuritiesTradeConfirmationStatusAdviceV03 }
     * 
     * @return
     *     the new instance of {@link SecuritiesTradeConfirmationStatusAdviceV03 }
     */
    public SecuritiesTradeConfirmationStatusAdviceV03 createSecuritiesTradeConfirmationStatusAdviceV03() {
        return new SecuritiesTradeConfirmationStatusAdviceV03();
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
     * Create an instance of {@link SettlementDate16Choice }
     * 
     * @return
     *     the new instance of {@link SettlementDate16Choice }
     */
    public SettlementDate16Choice createSettlementDate16Choice() {
        return new SettlementDate16Choice();
    }

    /**
     * Create an instance of {@link SettlementDateCode12Choice }
     * 
     * @return
     *     the new instance of {@link SettlementDateCode12Choice }
     */
    public SettlementDateCode12Choice createSettlementDateCode12Choice() {
        return new SettlementDateCode12Choice();
    }

    /**
     * Create an instance of {@link SettlementParties121 }
     * 
     * @return
     *     the new instance of {@link SettlementParties121 }
     */
    public SettlementParties121 createSettlementParties121() {
        return new SettlementParties121();
    }

    /**
     * Create an instance of {@link SimpleIdentificationInformation2 }
     * 
     * @return
     *     the new instance of {@link SimpleIdentificationInformation2 }
     */
    public SimpleIdentificationInformation2 createSimpleIdentificationInformation2() {
        return new SimpleIdentificationInformation2();
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
     * Create an instance of {@link TradeDate7Choice }
     * 
     * @return
     *     the new instance of {@link TradeDate7Choice }
     */
    public TradeDate7Choice createTradeDate7Choice() {
        return new TradeDate7Choice();
    }

    /**
     * Create an instance of {@link TradeTransactionCondition9Choice }
     * 
     * @return
     *     the new instance of {@link TradeTransactionCondition9Choice }
     */
    public TradeTransactionCondition9Choice createTradeTransactionCondition9Choice() {
        return new TradeTransactionCondition9Choice();
    }

    /**
     * Create an instance of {@link TradeType4Choice }
     * 
     * @return
     *     the new instance of {@link TradeType4Choice }
     */
    public TradeType4Choice createTradeType4Choice() {
        return new TradeType4Choice();
    }

    /**
     * Create an instance of {@link TradingDateCode2Choice }
     * 
     * @return
     *     the new instance of {@link TradingDateCode2Choice }
     */
    public TradingDateCode2Choice createTradingDateCode2Choice() {
        return new TradingDateCode2Choice();
    }

    /**
     * Create an instance of {@link TradingPartyCapacity3Choice }
     * 
     * @return
     *     the new instance of {@link TradingPartyCapacity3Choice }
     */
    public TradingPartyCapacity3Choice createTradingPartyCapacity3Choice() {
        return new TradingPartyCapacity3Choice();
    }

    /**
     * Create an instance of {@link TradingPartyCapacity4Choice }
     * 
     * @return
     *     the new instance of {@link TradingPartyCapacity4Choice }
     */
    public TradingPartyCapacity4Choice createTradingPartyCapacity4Choice() {
        return new TradingPartyCapacity4Choice();
    }

    /**
     * Create an instance of {@link TransactiontIdentification4 }
     * 
     * @return
     *     the new instance of {@link TransactiontIdentification4 }
     */
    public TransactiontIdentification4 createTransactiontIdentification4() {
        return new TransactiontIdentification4();
    }

    /**
     * Create an instance of {@link TypeOfPrice47Choice }
     * 
     * @return
     *     the new instance of {@link TypeOfPrice47Choice }
     */
    public TypeOfPrice47Choice createTypeOfPrice47Choice() {
        return new TypeOfPrice47Choice();
    }

    /**
     * Create an instance of {@link UnaffirmedReason3Choice }
     * 
     * @return
     *     the new instance of {@link UnaffirmedReason3Choice }
     */
    public UnaffirmedReason3Choice createUnaffirmedReason3Choice() {
        return new UnaffirmedReason3Choice();
    }

    /**
     * Create an instance of {@link UnmatchedReason23 }
     * 
     * @return
     *     the new instance of {@link UnmatchedReason23 }
     */
    public UnmatchedReason23 createUnmatchedReason23() {
        return new UnmatchedReason23();
    }

    /**
     * Create an instance of {@link UnmatchedReason32Choice }
     * 
     * @return
     *     the new instance of {@link UnmatchedReason32Choice }
     */
    public UnmatchedReason32Choice createUnmatchedReason32Choice() {
        return new UnmatchedReason32Choice();
    }

    /**
     * Create an instance of {@link YieldCalculation7 }
     * 
     * @return
     *     the new instance of {@link YieldCalculation7 }
     */
    public YieldCalculation7 createYieldCalculation7() {
        return new YieldCalculation7();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Document }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Document }{@code >}
     */
    @XmlElementDecl(namespace = "urn:iso:std:iso:20022:tech:xsd:setr.044.001.03", name = "Document")
    public JAXBElement<Document> createDocument(Document value) {
        return new JAXBElement<>(_Document_QNAME, Document.class, null, value);
    }

}
