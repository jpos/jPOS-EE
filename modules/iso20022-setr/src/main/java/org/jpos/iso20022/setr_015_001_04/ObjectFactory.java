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

package org.jpos.iso20022.setr_015_001_04;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.jpos.iso20022.setr_015_001_04 package. 
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

    private static final QName _Document_QNAME = new QName("urn:iso:std:iso:20022:tech:xsd:setr.015.001.04", "Document");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.jpos.iso20022.setr_015_001_04
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
     * Create an instance of {@link Account22 }
     * 
     * @return
     *     the new instance of {@link Account22 }
     */
    public Account22 createAccount22() {
        return new Account22();
    }

    /**
     * Create an instance of {@link AccountIdentification4Choice }
     * 
     * @return
     *     the new instance of {@link AccountIdentification4Choice }
     */
    public AccountIdentification4Choice createAccountIdentification4Choice() {
        return new AccountIdentification4Choice();
    }

    /**
     * Create an instance of {@link AccountIdentificationAndName5 }
     * 
     * @return
     *     the new instance of {@link AccountIdentificationAndName5 }
     */
    public AccountIdentificationAndName5 createAccountIdentificationAndName5() {
        return new AccountIdentificationAndName5();
    }

    /**
     * Create an instance of {@link AccountSchemeName1Choice }
     * 
     * @return
     *     the new instance of {@link AccountSchemeName1Choice }
     */
    public AccountSchemeName1Choice createAccountSchemeName1Choice() {
        return new AccountSchemeName1Choice();
    }

    /**
     * Create an instance of {@link ActiveCurrencyAnd13DecimalAmount }
     * 
     * @return
     *     the new instance of {@link ActiveCurrencyAnd13DecimalAmount }
     */
    public ActiveCurrencyAnd13DecimalAmount createActiveCurrencyAnd13DecimalAmount() {
        return new ActiveCurrencyAnd13DecimalAmount();
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
     * Create an instance of {@link AdditionalAmount1Choice }
     * 
     * @return
     *     the new instance of {@link AdditionalAmount1Choice }
     */
    public AdditionalAmount1Choice createAdditionalAmount1Choice() {
        return new AdditionalAmount1Choice();
    }

    /**
     * Create an instance of {@link AdditionalReference8 }
     * 
     * @return
     *     the new instance of {@link AdditionalReference8 }
     */
    public AdditionalReference8 createAdditionalReference8() {
        return new AdditionalReference8();
    }

    /**
     * Create an instance of {@link AdditionalReference9 }
     * 
     * @return
     *     the new instance of {@link AdditionalReference9 }
     */
    public AdditionalReference9 createAdditionalReference9() {
        return new AdditionalReference9();
    }

    /**
     * Create an instance of {@link AlternateSecurityIdentification7 }
     * 
     * @return
     *     the new instance of {@link AlternateSecurityIdentification7 }
     */
    public AlternateSecurityIdentification7 createAlternateSecurityIdentification7() {
        return new AlternateSecurityIdentification7();
    }

    /**
     * Create an instance of {@link BranchData }
     * 
     * @return
     *     the new instance of {@link BranchData }
     */
    public BranchData createBranchData() {
        return new BranchData();
    }

    /**
     * Create an instance of {@link CancellationRight1Choice }
     * 
     * @return
     *     the new instance of {@link CancellationRight1Choice }
     */
    public CancellationRight1Choice createCancellationRight1Choice() {
        return new CancellationRight1Choice();
    }

    /**
     * Create an instance of {@link CashInOrOut7Choice }
     * 
     * @return
     *     the new instance of {@link CashInOrOut7Choice }
     */
    public CashInOrOut7Choice createCashInOrOut7Choice() {
        return new CashInOrOut7Choice();
    }

    /**
     * Create an instance of {@link ChargeBasis2Choice }
     * 
     * @return
     *     the new instance of {@link ChargeBasis2Choice }
     */
    public ChargeBasis2Choice createChargeBasis2Choice() {
        return new ChargeBasis2Choice();
    }

    /**
     * Create an instance of {@link ChargeOrCommissionDiscount1 }
     * 
     * @return
     *     the new instance of {@link ChargeOrCommissionDiscount1 }
     */
    public ChargeOrCommissionDiscount1 createChargeOrCommissionDiscount1() {
        return new ChargeOrCommissionDiscount1();
    }

    /**
     * Create an instance of {@link ChargeType5Choice }
     * 
     * @return
     *     the new instance of {@link ChargeType5Choice }
     */
    public ChargeType5Choice createChargeType5Choice() {
        return new ChargeType5Choice();
    }

    /**
     * Create an instance of {@link Cheque9 }
     * 
     * @return
     *     the new instance of {@link Cheque9 }
     */
    public Cheque9 createCheque9() {
        return new Cheque9();
    }

    /**
     * Create an instance of {@link ClearingSystemMemberIdentificationChoice }
     * 
     * @return
     *     the new instance of {@link ClearingSystemMemberIdentificationChoice }
     */
    public ClearingSystemMemberIdentificationChoice createClearingSystemMemberIdentificationChoice() {
        return new ClearingSystemMemberIdentificationChoice();
    }

    /**
     * Create an instance of {@link CopyInformation4 }
     * 
     * @return
     *     the new instance of {@link CopyInformation4 }
     */
    public CopyInformation4 createCopyInformation4() {
        return new CopyInformation4();
    }

    /**
     * Create an instance of {@link CreditTransfer8 }
     * 
     * @return
     *     the new instance of {@link CreditTransfer8 }
     */
    public CreditTransfer8 createCreditTransfer8() {
        return new CreditTransfer8();
    }

    /**
     * Create an instance of {@link CustomerConductClassification1Choice }
     * 
     * @return
     *     the new instance of {@link CustomerConductClassification1Choice }
     */
    public CustomerConductClassification1Choice createCustomerConductClassification1Choice() {
        return new CustomerConductClassification1Choice();
    }

    /**
     * Create an instance of {@link DateAndDateTimeChoice }
     * 
     * @return
     *     the new instance of {@link DateAndDateTimeChoice }
     */
    public DateAndDateTimeChoice createDateAndDateTimeChoice() {
        return new DateAndDateTimeChoice();
    }

    /**
     * Create an instance of {@link DateFormat42Choice }
     * 
     * @return
     *     the new instance of {@link DateFormat42Choice }
     */
    public DateFormat42Choice createDateFormat42Choice() {
        return new DateFormat42Choice();
    }

    /**
     * Create an instance of {@link DeliveringPartiesAndAccount16 }
     * 
     * @return
     *     the new instance of {@link DeliveringPartiesAndAccount16 }
     */
    public DeliveringPartiesAndAccount16 createDeliveringPartiesAndAccount16() {
        return new DeliveringPartiesAndAccount16();
    }

    /**
     * Create an instance of {@link DeliveryParameters3 }
     * 
     * @return
     *     the new instance of {@link DeliveryParameters3 }
     */
    public DeliveryParameters3 createDeliveryParameters3() {
        return new DeliveryParameters3();
    }

    /**
     * Create an instance of {@link DirectDebitMandate6 }
     * 
     * @return
     *     the new instance of {@link DirectDebitMandate6 }
     */
    public DirectDebitMandate6 createDirectDebitMandate6() {
        return new DirectDebitMandate6();
    }

    /**
     * Create an instance of {@link EUCapitalGain3Choice }
     * 
     * @return
     *     the new instance of {@link EUCapitalGain3Choice }
     */
    public EUCapitalGain3Choice createEUCapitalGain3Choice() {
        return new EUCapitalGain3Choice();
    }

    /**
     * Create an instance of {@link EUDividendStatusType2Choice }
     * 
     * @return
     *     the new instance of {@link EUDividendStatusType2Choice }
     */
    public EUDividendStatusType2Choice createEUDividendStatusType2Choice() {
        return new EUDividendStatusType2Choice();
    }

    /**
     * Create an instance of {@link Equalisation1 }
     * 
     * @return
     *     the new instance of {@link Equalisation1 }
     */
    public Equalisation1 createEqualisation1() {
        return new Equalisation1();
    }

    /**
     * Create an instance of {@link ExemptionReason1Choice }
     * 
     * @return
     *     the new instance of {@link ExemptionReason1Choice }
     */
    public ExemptionReason1Choice createExemptionReason1Choice() {
        return new ExemptionReason1Choice();
    }

    /**
     * Create an instance of {@link Extension1 }
     * 
     * @return
     *     the new instance of {@link Extension1 }
     */
    public Extension1 createExtension1() {
        return new Extension1();
    }

    /**
     * Create an instance of {@link Fee2 }
     * 
     * @return
     *     the new instance of {@link Fee2 }
     */
    public Fee2 createFee2() {
        return new Fee2();
    }

    /**
     * Create an instance of {@link FinancialInstitutionIdentification10 }
     * 
     * @return
     *     the new instance of {@link FinancialInstitutionIdentification10 }
     */
    public FinancialInstitutionIdentification10 createFinancialInstitutionIdentification10() {
        return new FinancialInstitutionIdentification10();
    }

    /**
     * Create an instance of {@link FinancialInstitutionIdentification8Choice }
     * 
     * @return
     *     the new instance of {@link FinancialInstitutionIdentification8Choice }
     */
    public FinancialInstitutionIdentification8Choice createFinancialInstitutionIdentification8Choice() {
        return new FinancialInstitutionIdentification8Choice();
    }

    /**
     * Create an instance of {@link FinancialInstrument57 }
     * 
     * @return
     *     the new instance of {@link FinancialInstrument57 }
     */
    public FinancialInstrument57 createFinancialInstrument57() {
        return new FinancialInstrument57();
    }

    /**
     * Create an instance of {@link ForeignExchangeTerms33 }
     * 
     * @return
     *     the new instance of {@link ForeignExchangeTerms33 }
     */
    public ForeignExchangeTerms33 createForeignExchangeTerms33() {
        return new ForeignExchangeTerms33();
    }

    /**
     * Create an instance of {@link FundSettlementParameters11 }
     * 
     * @return
     *     the new instance of {@link FundSettlementParameters11 }
     */
    public FundSettlementParameters11 createFundSettlementParameters11() {
        return new FundSettlementParameters11();
    }

    /**
     * Create an instance of {@link FundSettlementParameters12 }
     * 
     * @return
     *     the new instance of {@link FundSettlementParameters12 }
     */
    public FundSettlementParameters12 createFundSettlementParameters12() {
        return new FundSettlementParameters12();
    }

    /**
     * Create an instance of {@link GenericAccountIdentification1 }
     * 
     * @return
     *     the new instance of {@link GenericAccountIdentification1 }
     */
    public GenericAccountIdentification1 createGenericAccountIdentification1() {
        return new GenericAccountIdentification1();
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
     * Create an instance of {@link GenericIdentification47 }
     * 
     * @return
     *     the new instance of {@link GenericIdentification47 }
     */
    public GenericIdentification47 createGenericIdentification47() {
        return new GenericIdentification47();
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
     * Create an instance of {@link HoldBackInformation2 }
     * 
     * @return
     *     the new instance of {@link HoldBackInformation2 }
     */
    public HoldBackInformation2 createHoldBackInformation2() {
        return new HoldBackInformation2();
    }

    /**
     * Create an instance of {@link IdentificationSource1Choice }
     * 
     * @return
     *     the new instance of {@link IdentificationSource1Choice }
     */
    public IdentificationSource1Choice createIdentificationSource1Choice() {
        return new IdentificationSource1Choice();
    }

    /**
     * Create an instance of {@link InformativeTax1 }
     * 
     * @return
     *     the new instance of {@link InformativeTax1 }
     */
    public InformativeTax1 createInformativeTax1() {
        return new InformativeTax1();
    }

    /**
     * Create an instance of {@link Intermediary39 }
     * 
     * @return
     *     the new instance of {@link Intermediary39 }
     */
    public Intermediary39 createIntermediary39() {
        return new Intermediary39();
    }

    /**
     * Create an instance of {@link InvestmentAccount58 }
     * 
     * @return
     *     the new instance of {@link InvestmentAccount58 }
     */
    public InvestmentAccount58 createInvestmentAccount58() {
        return new InvestmentAccount58();
    }

    /**
     * Create an instance of {@link InvestmentAccount60 }
     * 
     * @return
     *     the new instance of {@link InvestmentAccount60 }
     */
    public InvestmentAccount60 createInvestmentAccount60() {
        return new InvestmentAccount60();
    }

    /**
     * Create an instance of {@link InvestmentAccountType1Choice }
     * 
     * @return
     *     the new instance of {@link InvestmentAccountType1Choice }
     */
    public InvestmentAccountType1Choice createInvestmentAccountType1Choice() {
        return new InvestmentAccountType1Choice();
    }

    /**
     * Create an instance of {@link InvestmentFundRole2Choice }
     * 
     * @return
     *     the new instance of {@link InvestmentFundRole2Choice }
     */
    public InvestmentFundRole2Choice createInvestmentFundRole2Choice() {
        return new InvestmentFundRole2Choice();
    }

    /**
     * Create an instance of {@link MessageIdentification1 }
     * 
     * @return
     *     the new instance of {@link MessageIdentification1 }
     */
    public MessageIdentification1 createMessageIdentification1() {
        return new MessageIdentification1();
    }

    /**
     * Create an instance of {@link NameAndAddress4 }
     * 
     * @return
     *     the new instance of {@link NameAndAddress4 }
     */
    public NameAndAddress4 createNameAndAddress4() {
        return new NameAndAddress4();
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
     * Create an instance of {@link OrderWaiver1 }
     * 
     * @return
     *     the new instance of {@link OrderWaiver1 }
     */
    public OrderWaiver1 createOrderWaiver1() {
        return new OrderWaiver1();
    }

    /**
     * Create an instance of {@link OrderWaiverReason3Choice }
     * 
     * @return
     *     the new instance of {@link OrderWaiverReason3Choice }
     */
    public OrderWaiverReason3Choice createOrderWaiverReason3Choice() {
        return new OrderWaiverReason3Choice();
    }

    /**
     * Create an instance of {@link PartyIdentification113 }
     * 
     * @return
     *     the new instance of {@link PartyIdentification113 }
     */
    public PartyIdentification113 createPartyIdentification113() {
        return new PartyIdentification113();
    }

    /**
     * Create an instance of {@link PartyIdentification90Choice }
     * 
     * @return
     *     the new instance of {@link PartyIdentification90Choice }
     */
    public PartyIdentification90Choice createPartyIdentification90Choice() {
        return new PartyIdentification90Choice();
    }

    /**
     * Create an instance of {@link PartyIdentificationAndAccount147 }
     * 
     * @return
     *     the new instance of {@link PartyIdentificationAndAccount147 }
     */
    public PartyIdentificationAndAccount147 createPartyIdentificationAndAccount147() {
        return new PartyIdentificationAndAccount147();
    }

    /**
     * Create an instance of {@link PaymentCard25 }
     * 
     * @return
     *     the new instance of {@link PaymentCard25 }
     */
    public PaymentCard25 createPaymentCard25() {
        return new PaymentCard25();
    }

    /**
     * Create an instance of {@link PaymentInstrument20Choice }
     * 
     * @return
     *     the new instance of {@link PaymentInstrument20Choice }
     */
    public PaymentInstrument20Choice createPaymentInstrument20Choice() {
        return new PaymentInstrument20Choice();
    }

    /**
     * Create an instance of {@link PaymentInstrument21Choice }
     * 
     * @return
     *     the new instance of {@link PaymentInstrument21Choice }
     */
    public PaymentInstrument21Choice createPaymentInstrument21Choice() {
        return new PaymentInstrument21Choice();
    }

    /**
     * Create an instance of {@link PaymentTransaction71 }
     * 
     * @return
     *     the new instance of {@link PaymentTransaction71 }
     */
    public PaymentTransaction71 createPaymentTransaction71() {
        return new PaymentTransaction71();
    }

    /**
     * Create an instance of {@link PlaceOfTradeIdentification1Choice }
     * 
     * @return
     *     the new instance of {@link PlaceOfTradeIdentification1Choice }
     */
    public PlaceOfTradeIdentification1Choice createPlaceOfTradeIdentification1Choice() {
        return new PlaceOfTradeIdentification1Choice();
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
     * Create an instance of {@link PriceValue1 }
     * 
     * @return
     *     the new instance of {@link PriceValue1 }
     */
    public PriceValue1 createPriceValue1() {
        return new PriceValue1();
    }

    /**
     * Create an instance of {@link ProfitAndLoss2Choice }
     * 
     * @return
     *     the new instance of {@link ProfitAndLoss2Choice }
     */
    public ProfitAndLoss2Choice createProfitAndLoss2Choice() {
        return new ProfitAndLoss2Choice();
    }

    /**
     * Create an instance of {@link ReceivingPartiesAndAccount16 }
     * 
     * @return
     *     the new instance of {@link ReceivingPartiesAndAccount16 }
     */
    public ReceivingPartiesAndAccount16 createReceivingPartiesAndAccount16() {
        return new ReceivingPartiesAndAccount16();
    }

    /**
     * Create an instance of {@link SafekeepingPlaceFormat8Choice }
     * 
     * @return
     *     the new instance of {@link SafekeepingPlaceFormat8Choice }
     */
    public SafekeepingPlaceFormat8Choice createSafekeepingPlaceFormat8Choice() {
        return new SafekeepingPlaceFormat8Choice();
    }

    /**
     * Create an instance of {@link SafekeepingPlaceTypeAndAnyBICIdentifier1 }
     * 
     * @return
     *     the new instance of {@link SafekeepingPlaceTypeAndAnyBICIdentifier1 }
     */
    public SafekeepingPlaceTypeAndAnyBICIdentifier1 createSafekeepingPlaceTypeAndAnyBICIdentifier1() {
        return new SafekeepingPlaceTypeAndAnyBICIdentifier1();
    }

    /**
     * Create an instance of {@link SafekeepingPlaceTypeAndText6 }
     * 
     * @return
     *     the new instance of {@link SafekeepingPlaceTypeAndText6 }
     */
    public SafekeepingPlaceTypeAndText6 createSafekeepingPlaceTypeAndText6() {
        return new SafekeepingPlaceTypeAndText6();
    }

    /**
     * Create an instance of {@link SecurityIdentification25Choice }
     * 
     * @return
     *     the new instance of {@link SecurityIdentification25Choice }
     */
    public SecurityIdentification25Choice createSecurityIdentification25Choice() {
        return new SecurityIdentification25Choice();
    }

    /**
     * Create an instance of {@link Series1 }
     * 
     * @return
     *     the new instance of {@link Series1 }
     */
    public Series1 createSeries1() {
        return new Series1();
    }

    /**
     * Create an instance of {@link SettlementTransactionCondition30Choice }
     * 
     * @return
     *     the new instance of {@link SettlementTransactionCondition30Choice }
     */
    public SettlementTransactionCondition30Choice createSettlementTransactionCondition30Choice() {
        return new SettlementTransactionCondition30Choice();
    }

    /**
     * Create an instance of {@link SignatureType1Choice }
     * 
     * @return
     *     the new instance of {@link SignatureType1Choice }
     */
    public SignatureType1Choice createSignatureType1Choice() {
        return new SignatureType1Choice();
    }

    /**
     * Create an instance of {@link SubAccount6 }
     * 
     * @return
     *     the new instance of {@link SubAccount6 }
     */
    public SubAccount6 createSubAccount6() {
        return new SubAccount6();
    }

    /**
     * Create an instance of {@link SwitchExecution7 }
     * 
     * @return
     *     the new instance of {@link SwitchExecution7 }
     */
    public SwitchExecution7 createSwitchExecution7() {
        return new SwitchExecution7();
    }

    /**
     * Create an instance of {@link SwitchOrderConfirmationV04 }
     * 
     * @return
     *     the new instance of {@link SwitchOrderConfirmationV04 }
     */
    public SwitchOrderConfirmationV04 createSwitchOrderConfirmationV04() {
        return new SwitchOrderConfirmationV04();
    }

    /**
     * Create an instance of {@link SwitchRedemptionLegExecution4 }
     * 
     * @return
     *     the new instance of {@link SwitchRedemptionLegExecution4 }
     */
    public SwitchRedemptionLegExecution4 createSwitchRedemptionLegExecution4() {
        return new SwitchRedemptionLegExecution4();
    }

    /**
     * Create an instance of {@link SwitchSubscriptionLegExecution4 }
     * 
     * @return
     *     the new instance of {@link SwitchSubscriptionLegExecution4 }
     */
    public SwitchSubscriptionLegExecution4 createSwitchSubscriptionLegExecution4() {
        return new SwitchSubscriptionLegExecution4();
    }

    /**
     * Create an instance of {@link Tax31 }
     * 
     * @return
     *     the new instance of {@link Tax31 }
     */
    public Tax31 createTax31() {
        return new Tax31();
    }

    /**
     * Create an instance of {@link Tax32 }
     * 
     * @return
     *     the new instance of {@link Tax32 }
     */
    public Tax32 createTax32() {
        return new Tax32();
    }

    /**
     * Create an instance of {@link TaxBasis1Choice }
     * 
     * @return
     *     the new instance of {@link TaxBasis1Choice }
     */
    public TaxBasis1Choice createTaxBasis1Choice() {
        return new TaxBasis1Choice();
    }

    /**
     * Create an instance of {@link TaxCalculationInformation10 }
     * 
     * @return
     *     the new instance of {@link TaxCalculationInformation10 }
     */
    public TaxCalculationInformation10 createTaxCalculationInformation10() {
        return new TaxCalculationInformation10();
    }

    /**
     * Create an instance of {@link TaxType3Choice }
     * 
     * @return
     *     the new instance of {@link TaxType3Choice }
     */
    public TaxType3Choice createTaxType3Choice() {
        return new TaxType3Choice();
    }

    /**
     * Create an instance of {@link TaxableIncomePerShareCalculated2Choice }
     * 
     * @return
     *     the new instance of {@link TaxableIncomePerShareCalculated2Choice }
     */
    public TaxableIncomePerShareCalculated2Choice createTaxableIncomePerShareCalculated2Choice() {
        return new TaxableIncomePerShareCalculated2Choice();
    }

    /**
     * Create an instance of {@link TotalFeesAndTaxes40 }
     * 
     * @return
     *     the new instance of {@link TotalFeesAndTaxes40 }
     */
    public TotalFeesAndTaxes40 createTotalFeesAndTaxes40() {
        return new TotalFeesAndTaxes40();
    }

    /**
     * Create an instance of {@link TradeTransactionCondition8Choice }
     * 
     * @return
     *     the new instance of {@link TradeTransactionCondition8Choice }
     */
    public TradeTransactionCondition8Choice createTradeTransactionCondition8Choice() {
        return new TradeTransactionCondition8Choice();
    }

    /**
     * Create an instance of {@link TransactionChannelType1Choice }
     * 
     * @return
     *     the new instance of {@link TransactionChannelType1Choice }
     */
    public TransactionChannelType1Choice createTransactionChannelType1Choice() {
        return new TransactionChannelType1Choice();
    }

    /**
     * Create an instance of {@link TypeOfPrice46Choice }
     * 
     * @return
     *     the new instance of {@link TypeOfPrice46Choice }
     */
    public TypeOfPrice46Choice createTypeOfPrice46Choice() {
        return new TypeOfPrice46Choice();
    }

    /**
     * Create an instance of {@link UnitPrice22 }
     * 
     * @return
     *     the new instance of {@link UnitPrice22 }
     */
    public UnitPrice22 createUnitPrice22() {
        return new UnitPrice22();
    }

    /**
     * Create an instance of {@link WaivingInstruction2Choice }
     * 
     * @return
     *     the new instance of {@link WaivingInstruction2Choice }
     */
    public WaivingInstruction2Choice createWaivingInstruction2Choice() {
        return new WaivingInstruction2Choice();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Document }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Document }{@code >}
     */
    @XmlElementDecl(namespace = "urn:iso:std:iso:20022:tech:xsd:setr.015.001.04", name = "Document")
    public JAXBElement<Document> createDocument(Document value) {
        return new JAXBElement<>(_Document_QNAME, Document.class, null, value);
    }

}
