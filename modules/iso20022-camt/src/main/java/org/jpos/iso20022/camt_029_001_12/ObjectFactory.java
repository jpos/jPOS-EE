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

package org.jpos.iso20022.camt_029_001_12;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.jpos.iso20022.camt_029_001_12 package. 
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

    private static final QName _Document_QNAME = new QName("urn:iso:std:iso:20022:tech:xsd:camt.029.001.12", "Document");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.jpos.iso20022.camt_029_001_12
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
     * Create an instance of {@link AccountIdentification4Choice }
     * 
     * @return
     *     the new instance of {@link AccountIdentification4Choice }
     */
    public AccountIdentification4Choice createAccountIdentification4Choice() {
        return new AccountIdentification4Choice();
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
     * Create an instance of {@link AddressType3Choice }
     * 
     * @return
     *     the new instance of {@link AddressType3Choice }
     */
    public AddressType3Choice createAddressType3Choice() {
        return new AddressType3Choice();
    }

    /**
     * Create an instance of {@link AmendmentInformationDetails14 }
     * 
     * @return
     *     the new instance of {@link AmendmentInformationDetails14 }
     */
    public AmendmentInformationDetails14 createAmendmentInformationDetails14() {
        return new AmendmentInformationDetails14();
    }

    /**
     * Create an instance of {@link AmountType4Choice }
     * 
     * @return
     *     the new instance of {@link AmountType4Choice }
     */
    public AmountType4Choice createAmountType4Choice() {
        return new AmountType4Choice();
    }

    /**
     * Create an instance of {@link BranchAndFinancialInstitutionIdentification6 }
     * 
     * @return
     *     the new instance of {@link BranchAndFinancialInstitutionIdentification6 }
     */
    public BranchAndFinancialInstitutionIdentification6 createBranchAndFinancialInstitutionIdentification6() {
        return new BranchAndFinancialInstitutionIdentification6();
    }

    /**
     * Create an instance of {@link BranchData3 }
     * 
     * @return
     *     the new instance of {@link BranchData3 }
     */
    public BranchData3 createBranchData3() {
        return new BranchData3();
    }

    /**
     * Create an instance of {@link CancellationStatusReason3Choice }
     * 
     * @return
     *     the new instance of {@link CancellationStatusReason3Choice }
     */
    public CancellationStatusReason3Choice createCancellationStatusReason3Choice() {
        return new CancellationStatusReason3Choice();
    }

    /**
     * Create an instance of {@link CancellationStatusReason4 }
     * 
     * @return
     *     the new instance of {@link CancellationStatusReason4 }
     */
    public CancellationStatusReason4 createCancellationStatusReason4() {
        return new CancellationStatusReason4();
    }

    /**
     * Create an instance of {@link Case5 }
     * 
     * @return
     *     the new instance of {@link Case5 }
     */
    public Case5 createCase5() {
        return new Case5();
    }

    /**
     * Create an instance of {@link CaseAssignment5 }
     * 
     * @return
     *     the new instance of {@link CaseAssignment5 }
     */
    public CaseAssignment5 createCaseAssignment5() {
        return new CaseAssignment5();
    }

    /**
     * Create an instance of {@link CashAccount40 }
     * 
     * @return
     *     the new instance of {@link CashAccount40 }
     */
    public CashAccount40 createCashAccount40() {
        return new CashAccount40();
    }

    /**
     * Create an instance of {@link CashAccountType2Choice }
     * 
     * @return
     *     the new instance of {@link CashAccountType2Choice }
     */
    public CashAccountType2Choice createCashAccountType2Choice() {
        return new CashAccountType2Choice();
    }

    /**
     * Create an instance of {@link CategoryPurpose1Choice }
     * 
     * @return
     *     the new instance of {@link CategoryPurpose1Choice }
     */
    public CategoryPurpose1Choice createCategoryPurpose1Choice() {
        return new CategoryPurpose1Choice();
    }

    /**
     * Create an instance of {@link ChargeType3Choice }
     * 
     * @return
     *     the new instance of {@link ChargeType3Choice }
     */
    public ChargeType3Choice createChargeType3Choice() {
        return new ChargeType3Choice();
    }

    /**
     * Create an instance of {@link Charges13 }
     * 
     * @return
     *     the new instance of {@link Charges13 }
     */
    public Charges13 createCharges13() {
        return new Charges13();
    }

    /**
     * Create an instance of {@link Charges6 }
     * 
     * @return
     *     the new instance of {@link Charges6 }
     */
    public Charges6 createCharges6() {
        return new Charges6();
    }

    /**
     * Create an instance of {@link ChargesRecord3 }
     * 
     * @return
     *     the new instance of {@link ChargesRecord3 }
     */
    public ChargesRecord3 createChargesRecord3() {
        return new ChargesRecord3();
    }

    /**
     * Create an instance of {@link ClaimNonReceipt2 }
     * 
     * @return
     *     the new instance of {@link ClaimNonReceipt2 }
     */
    public ClaimNonReceipt2 createClaimNonReceipt2() {
        return new ClaimNonReceipt2();
    }

    /**
     * Create an instance of {@link ClaimNonReceipt2Choice }
     * 
     * @return
     *     the new instance of {@link ClaimNonReceipt2Choice }
     */
    public ClaimNonReceipt2Choice createClaimNonReceipt2Choice() {
        return new ClaimNonReceipt2Choice();
    }

    /**
     * Create an instance of {@link ClaimNonReceiptRejectReason1Choice }
     * 
     * @return
     *     the new instance of {@link ClaimNonReceiptRejectReason1Choice }
     */
    public ClaimNonReceiptRejectReason1Choice createClaimNonReceiptRejectReason1Choice() {
        return new ClaimNonReceiptRejectReason1Choice();
    }

    /**
     * Create an instance of {@link ClearingSystemIdentification2Choice }
     * 
     * @return
     *     the new instance of {@link ClearingSystemIdentification2Choice }
     */
    public ClearingSystemIdentification2Choice createClearingSystemIdentification2Choice() {
        return new ClearingSystemIdentification2Choice();
    }

    /**
     * Create an instance of {@link ClearingSystemIdentification3Choice }
     * 
     * @return
     *     the new instance of {@link ClearingSystemIdentification3Choice }
     */
    public ClearingSystemIdentification3Choice createClearingSystemIdentification3Choice() {
        return new ClearingSystemIdentification3Choice();
    }

    /**
     * Create an instance of {@link ClearingSystemMemberIdentification2 }
     * 
     * @return
     *     the new instance of {@link ClearingSystemMemberIdentification2 }
     */
    public ClearingSystemMemberIdentification2 createClearingSystemMemberIdentification2() {
        return new ClearingSystemMemberIdentification2();
    }

    /**
     * Create an instance of {@link Compensation4 }
     * 
     * @return
     *     the new instance of {@link Compensation4 }
     */
    public Compensation4 createCompensation4() {
        return new Compensation4();
    }

    /**
     * Create an instance of {@link CompensationReason1Choice }
     * 
     * @return
     *     the new instance of {@link CompensationReason1Choice }
     */
    public CompensationReason1Choice createCompensationReason1Choice() {
        return new CompensationReason1Choice();
    }

    /**
     * Create an instance of {@link Contact4 }
     * 
     * @return
     *     the new instance of {@link Contact4 }
     */
    public Contact4 createContact4() {
        return new Contact4();
    }

    /**
     * Create an instance of {@link CorrectiveGroupInformation1 }
     * 
     * @return
     *     the new instance of {@link CorrectiveGroupInformation1 }
     */
    public CorrectiveGroupInformation1 createCorrectiveGroupInformation1() {
        return new CorrectiveGroupInformation1();
    }

    /**
     * Create an instance of {@link CorrectiveInterbankTransaction3 }
     * 
     * @return
     *     the new instance of {@link CorrectiveInterbankTransaction3 }
     */
    public CorrectiveInterbankTransaction3 createCorrectiveInterbankTransaction3() {
        return new CorrectiveInterbankTransaction3();
    }

    /**
     * Create an instance of {@link CorrectivePaymentInitiation5 }
     * 
     * @return
     *     the new instance of {@link CorrectivePaymentInitiation5 }
     */
    public CorrectivePaymentInitiation5 createCorrectivePaymentInitiation5() {
        return new CorrectivePaymentInitiation5();
    }

    /**
     * Create an instance of {@link CorrectiveTransaction5Choice }
     * 
     * @return
     *     the new instance of {@link CorrectiveTransaction5Choice }
     */
    public CorrectiveTransaction5Choice createCorrectiveTransaction5Choice() {
        return new CorrectiveTransaction5Choice();
    }

    /**
     * Create an instance of {@link CreditTransferMandateData1 }
     * 
     * @return
     *     the new instance of {@link CreditTransferMandateData1 }
     */
    public CreditTransferMandateData1 createCreditTransferMandateData1() {
        return new CreditTransferMandateData1();
    }

    /**
     * Create an instance of {@link CreditorReferenceInformation2 }
     * 
     * @return
     *     the new instance of {@link CreditorReferenceInformation2 }
     */
    public CreditorReferenceInformation2 createCreditorReferenceInformation2() {
        return new CreditorReferenceInformation2();
    }

    /**
     * Create an instance of {@link CreditorReferenceType1Choice }
     * 
     * @return
     *     the new instance of {@link CreditorReferenceType1Choice }
     */
    public CreditorReferenceType1Choice createCreditorReferenceType1Choice() {
        return new CreditorReferenceType1Choice();
    }

    /**
     * Create an instance of {@link CreditorReferenceType2 }
     * 
     * @return
     *     the new instance of {@link CreditorReferenceType2 }
     */
    public CreditorReferenceType2 createCreditorReferenceType2() {
        return new CreditorReferenceType2();
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
     * Create an instance of {@link DateAndPlaceOfBirth1 }
     * 
     * @return
     *     the new instance of {@link DateAndPlaceOfBirth1 }
     */
    public DateAndPlaceOfBirth1 createDateAndPlaceOfBirth1() {
        return new DateAndPlaceOfBirth1();
    }

    /**
     * Create an instance of {@link DatePeriod2 }
     * 
     * @return
     *     the new instance of {@link DatePeriod2 }
     */
    public DatePeriod2 createDatePeriod2() {
        return new DatePeriod2();
    }

    /**
     * Create an instance of {@link DiscountAmountAndType1 }
     * 
     * @return
     *     the new instance of {@link DiscountAmountAndType1 }
     */
    public DiscountAmountAndType1 createDiscountAmountAndType1() {
        return new DiscountAmountAndType1();
    }

    /**
     * Create an instance of {@link DiscountAmountType1Choice }
     * 
     * @return
     *     the new instance of {@link DiscountAmountType1Choice }
     */
    public DiscountAmountType1Choice createDiscountAmountType1Choice() {
        return new DiscountAmountType1Choice();
    }

    /**
     * Create an instance of {@link DocumentAdjustment1 }
     * 
     * @return
     *     the new instance of {@link DocumentAdjustment1 }
     */
    public DocumentAdjustment1 createDocumentAdjustment1() {
        return new DocumentAdjustment1();
    }

    /**
     * Create an instance of {@link DocumentLineIdentification1 }
     * 
     * @return
     *     the new instance of {@link DocumentLineIdentification1 }
     */
    public DocumentLineIdentification1 createDocumentLineIdentification1() {
        return new DocumentLineIdentification1();
    }

    /**
     * Create an instance of {@link DocumentLineInformation1 }
     * 
     * @return
     *     the new instance of {@link DocumentLineInformation1 }
     */
    public DocumentLineInformation1 createDocumentLineInformation1() {
        return new DocumentLineInformation1();
    }

    /**
     * Create an instance of {@link DocumentLineType1 }
     * 
     * @return
     *     the new instance of {@link DocumentLineType1 }
     */
    public DocumentLineType1 createDocumentLineType1() {
        return new DocumentLineType1();
    }

    /**
     * Create an instance of {@link DocumentLineType1Choice }
     * 
     * @return
     *     the new instance of {@link DocumentLineType1Choice }
     */
    public DocumentLineType1Choice createDocumentLineType1Choice() {
        return new DocumentLineType1Choice();
    }

    /**
     * Create an instance of {@link EquivalentAmount2 }
     * 
     * @return
     *     the new instance of {@link EquivalentAmount2 }
     */
    public EquivalentAmount2 createEquivalentAmount2() {
        return new EquivalentAmount2();
    }

    /**
     * Create an instance of {@link FinancialIdentificationSchemeName1Choice }
     * 
     * @return
     *     the new instance of {@link FinancialIdentificationSchemeName1Choice }
     */
    public FinancialIdentificationSchemeName1Choice createFinancialIdentificationSchemeName1Choice() {
        return new FinancialIdentificationSchemeName1Choice();
    }

    /**
     * Create an instance of {@link FinancialInstitutionIdentification18 }
     * 
     * @return
     *     the new instance of {@link FinancialInstitutionIdentification18 }
     */
    public FinancialInstitutionIdentification18 createFinancialInstitutionIdentification18() {
        return new FinancialInstitutionIdentification18();
    }

    /**
     * Create an instance of {@link Frequency36Choice }
     * 
     * @return
     *     the new instance of {@link Frequency36Choice }
     */
    public Frequency36Choice createFrequency36Choice() {
        return new Frequency36Choice();
    }

    /**
     * Create an instance of {@link FrequencyAndMoment1 }
     * 
     * @return
     *     the new instance of {@link FrequencyAndMoment1 }
     */
    public FrequencyAndMoment1 createFrequencyAndMoment1() {
        return new FrequencyAndMoment1();
    }

    /**
     * Create an instance of {@link FrequencyPeriod1 }
     * 
     * @return
     *     the new instance of {@link FrequencyPeriod1 }
     */
    public FrequencyPeriod1 createFrequencyPeriod1() {
        return new FrequencyPeriod1();
    }

    /**
     * Create an instance of {@link Garnishment3 }
     * 
     * @return
     *     the new instance of {@link Garnishment3 }
     */
    public Garnishment3 createGarnishment3() {
        return new Garnishment3();
    }

    /**
     * Create an instance of {@link GarnishmentType1 }
     * 
     * @return
     *     the new instance of {@link GarnishmentType1 }
     */
    public GarnishmentType1 createGarnishmentType1() {
        return new GarnishmentType1();
    }

    /**
     * Create an instance of {@link GarnishmentType1Choice }
     * 
     * @return
     *     the new instance of {@link GarnishmentType1Choice }
     */
    public GarnishmentType1Choice createGarnishmentType1Choice() {
        return new GarnishmentType1Choice();
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
     * Create an instance of {@link GenericFinancialIdentification1 }
     * 
     * @return
     *     the new instance of {@link GenericFinancialIdentification1 }
     */
    public GenericFinancialIdentification1 createGenericFinancialIdentification1() {
        return new GenericFinancialIdentification1();
    }

    /**
     * Create an instance of {@link GenericIdentification3 }
     * 
     * @return
     *     the new instance of {@link GenericIdentification3 }
     */
    public GenericIdentification3 createGenericIdentification3() {
        return new GenericIdentification3();
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
     * Create an instance of {@link GenericOrganisationIdentification1 }
     * 
     * @return
     *     the new instance of {@link GenericOrganisationIdentification1 }
     */
    public GenericOrganisationIdentification1 createGenericOrganisationIdentification1() {
        return new GenericOrganisationIdentification1();
    }

    /**
     * Create an instance of {@link GenericPersonIdentification1 }
     * 
     * @return
     *     the new instance of {@link GenericPersonIdentification1 }
     */
    public GenericPersonIdentification1 createGenericPersonIdentification1() {
        return new GenericPersonIdentification1();
    }

    /**
     * Create an instance of {@link InvestigationStatus5Choice }
     * 
     * @return
     *     the new instance of {@link InvestigationStatus5Choice }
     */
    public InvestigationStatus5Choice createInvestigationStatus5Choice() {
        return new InvestigationStatus5Choice();
    }

    /**
     * Create an instance of {@link LocalInstrument2Choice }
     * 
     * @return
     *     the new instance of {@link LocalInstrument2Choice }
     */
    public LocalInstrument2Choice createLocalInstrument2Choice() {
        return new LocalInstrument2Choice();
    }

    /**
     * Create an instance of {@link MandateClassification1Choice }
     * 
     * @return
     *     the new instance of {@link MandateClassification1Choice }
     */
    public MandateClassification1Choice createMandateClassification1Choice() {
        return new MandateClassification1Choice();
    }

    /**
     * Create an instance of {@link MandateRelatedData2Choice }
     * 
     * @return
     *     the new instance of {@link MandateRelatedData2Choice }
     */
    public MandateRelatedData2Choice createMandateRelatedData2Choice() {
        return new MandateRelatedData2Choice();
    }

    /**
     * Create an instance of {@link MandateRelatedInformation15 }
     * 
     * @return
     *     the new instance of {@link MandateRelatedInformation15 }
     */
    public MandateRelatedInformation15 createMandateRelatedInformation15() {
        return new MandateRelatedInformation15();
    }

    /**
     * Create an instance of {@link MandateSetupReason1Choice }
     * 
     * @return
     *     the new instance of {@link MandateSetupReason1Choice }
     */
    public MandateSetupReason1Choice createMandateSetupReason1Choice() {
        return new MandateSetupReason1Choice();
    }

    /**
     * Create an instance of {@link MandateTypeInformation2 }
     * 
     * @return
     *     the new instance of {@link MandateTypeInformation2 }
     */
    public MandateTypeInformation2 createMandateTypeInformation2() {
        return new MandateTypeInformation2();
    }

    /**
     * Create an instance of {@link ModificationStatusReason1Choice }
     * 
     * @return
     *     the new instance of {@link ModificationStatusReason1Choice }
     */
    public ModificationStatusReason1Choice createModificationStatusReason1Choice() {
        return new ModificationStatusReason1Choice();
    }

    /**
     * Create an instance of {@link ModificationStatusReason2 }
     * 
     * @return
     *     the new instance of {@link ModificationStatusReason2 }
     */
    public ModificationStatusReason2 createModificationStatusReason2() {
        return new ModificationStatusReason2();
    }

    /**
     * Create an instance of {@link NumberOfCancellationsPerStatus1 }
     * 
     * @return
     *     the new instance of {@link NumberOfCancellationsPerStatus1 }
     */
    public NumberOfCancellationsPerStatus1 createNumberOfCancellationsPerStatus1() {
        return new NumberOfCancellationsPerStatus1();
    }

    /**
     * Create an instance of {@link NumberOfTransactionsPerStatus1 }
     * 
     * @return
     *     the new instance of {@link NumberOfTransactionsPerStatus1 }
     */
    public NumberOfTransactionsPerStatus1 createNumberOfTransactionsPerStatus1() {
        return new NumberOfTransactionsPerStatus1();
    }

    /**
     * Create an instance of {@link OrganisationIdentification29 }
     * 
     * @return
     *     the new instance of {@link OrganisationIdentification29 }
     */
    public OrganisationIdentification29 createOrganisationIdentification29() {
        return new OrganisationIdentification29();
    }

    /**
     * Create an instance of {@link OrganisationIdentificationSchemeName1Choice }
     * 
     * @return
     *     the new instance of {@link OrganisationIdentificationSchemeName1Choice }
     */
    public OrganisationIdentificationSchemeName1Choice createOrganisationIdentificationSchemeName1Choice() {
        return new OrganisationIdentificationSchemeName1Choice();
    }

    /**
     * Create an instance of {@link OriginalGroupHeader14 }
     * 
     * @return
     *     the new instance of {@link OriginalGroupHeader14 }
     */
    public OriginalGroupHeader14 createOriginalGroupHeader14() {
        return new OriginalGroupHeader14();
    }

    /**
     * Create an instance of {@link OriginalGroupInformation29 }
     * 
     * @return
     *     the new instance of {@link OriginalGroupInformation29 }
     */
    public OriginalGroupInformation29 createOriginalGroupInformation29() {
        return new OriginalGroupInformation29();
    }

    /**
     * Create an instance of {@link OriginalPaymentInstruction43 }
     * 
     * @return
     *     the new instance of {@link OriginalPaymentInstruction43 }
     */
    public OriginalPaymentInstruction43 createOriginalPaymentInstruction43() {
        return new OriginalPaymentInstruction43();
    }

    /**
     * Create an instance of {@link OriginalTransactionReference35 }
     * 
     * @return
     *     the new instance of {@link OriginalTransactionReference35 }
     */
    public OriginalTransactionReference35 createOriginalTransactionReference35() {
        return new OriginalTransactionReference35();
    }

    /**
     * Create an instance of {@link OtherContact1 }
     * 
     * @return
     *     the new instance of {@link OtherContact1 }
     */
    public OtherContact1 createOtherContact1() {
        return new OtherContact1();
    }

    /**
     * Create an instance of {@link Party38Choice }
     * 
     * @return
     *     the new instance of {@link Party38Choice }
     */
    public Party38Choice createParty38Choice() {
        return new Party38Choice();
    }

    /**
     * Create an instance of {@link Party40Choice }
     * 
     * @return
     *     the new instance of {@link Party40Choice }
     */
    public Party40Choice createParty40Choice() {
        return new Party40Choice();
    }

    /**
     * Create an instance of {@link PartyIdentification135 }
     * 
     * @return
     *     the new instance of {@link PartyIdentification135 }
     */
    public PartyIdentification135 createPartyIdentification135() {
        return new PartyIdentification135();
    }

    /**
     * Create an instance of {@link PaymentTransaction139 }
     * 
     * @return
     *     the new instance of {@link PaymentTransaction139 }
     */
    public PaymentTransaction139 createPaymentTransaction139() {
        return new PaymentTransaction139();
    }

    /**
     * Create an instance of {@link PaymentTransaction147 }
     * 
     * @return
     *     the new instance of {@link PaymentTransaction147 }
     */
    public PaymentTransaction147 createPaymentTransaction147() {
        return new PaymentTransaction147();
    }

    /**
     * Create an instance of {@link PaymentTransaction148 }
     * 
     * @return
     *     the new instance of {@link PaymentTransaction148 }
     */
    public PaymentTransaction148 createPaymentTransaction148() {
        return new PaymentTransaction148();
    }

    /**
     * Create an instance of {@link PaymentTypeInformation27 }
     * 
     * @return
     *     the new instance of {@link PaymentTypeInformation27 }
     */
    public PaymentTypeInformation27 createPaymentTypeInformation27() {
        return new PaymentTypeInformation27();
    }

    /**
     * Create an instance of {@link PersonIdentification13 }
     * 
     * @return
     *     the new instance of {@link PersonIdentification13 }
     */
    public PersonIdentification13 createPersonIdentification13() {
        return new PersonIdentification13();
    }

    /**
     * Create an instance of {@link PersonIdentificationSchemeName1Choice }
     * 
     * @return
     *     the new instance of {@link PersonIdentificationSchemeName1Choice }
     */
    public PersonIdentificationSchemeName1Choice createPersonIdentificationSchemeName1Choice() {
        return new PersonIdentificationSchemeName1Choice();
    }

    /**
     * Create an instance of {@link PostalAddress24 }
     * 
     * @return
     *     the new instance of {@link PostalAddress24 }
     */
    public PostalAddress24 createPostalAddress24() {
        return new PostalAddress24();
    }

    /**
     * Create an instance of {@link ProxyAccountIdentification1 }
     * 
     * @return
     *     the new instance of {@link ProxyAccountIdentification1 }
     */
    public ProxyAccountIdentification1 createProxyAccountIdentification1() {
        return new ProxyAccountIdentification1();
    }

    /**
     * Create an instance of {@link ProxyAccountType1Choice }
     * 
     * @return
     *     the new instance of {@link ProxyAccountType1Choice }
     */
    public ProxyAccountType1Choice createProxyAccountType1Choice() {
        return new ProxyAccountType1Choice();
    }

    /**
     * Create an instance of {@link Purpose2Choice }
     * 
     * @return
     *     the new instance of {@link Purpose2Choice }
     */
    public Purpose2Choice createPurpose2Choice() {
        return new Purpose2Choice();
    }

    /**
     * Create an instance of {@link ReferredDocumentInformation7 }
     * 
     * @return
     *     the new instance of {@link ReferredDocumentInformation7 }
     */
    public ReferredDocumentInformation7 createReferredDocumentInformation7() {
        return new ReferredDocumentInformation7();
    }

    /**
     * Create an instance of {@link ReferredDocumentType3Choice }
     * 
     * @return
     *     the new instance of {@link ReferredDocumentType3Choice }
     */
    public ReferredDocumentType3Choice createReferredDocumentType3Choice() {
        return new ReferredDocumentType3Choice();
    }

    /**
     * Create an instance of {@link ReferredDocumentType4 }
     * 
     * @return
     *     the new instance of {@link ReferredDocumentType4 }
     */
    public ReferredDocumentType4 createReferredDocumentType4() {
        return new ReferredDocumentType4();
    }

    /**
     * Create an instance of {@link RemittanceAmount2 }
     * 
     * @return
     *     the new instance of {@link RemittanceAmount2 }
     */
    public RemittanceAmount2 createRemittanceAmount2() {
        return new RemittanceAmount2();
    }

    /**
     * Create an instance of {@link RemittanceAmount3 }
     * 
     * @return
     *     the new instance of {@link RemittanceAmount3 }
     */
    public RemittanceAmount3 createRemittanceAmount3() {
        return new RemittanceAmount3();
    }

    /**
     * Create an instance of {@link RemittanceInformation21 }
     * 
     * @return
     *     the new instance of {@link RemittanceInformation21 }
     */
    public RemittanceInformation21 createRemittanceInformation21() {
        return new RemittanceInformation21();
    }

    /**
     * Create an instance of {@link ResolutionData4 }
     * 
     * @return
     *     the new instance of {@link ResolutionData4 }
     */
    public ResolutionData4 createResolutionData4() {
        return new ResolutionData4();
    }

    /**
     * Create an instance of {@link ResolutionOfInvestigationV12 }
     * 
     * @return
     *     the new instance of {@link ResolutionOfInvestigationV12 }
     */
    public ResolutionOfInvestigationV12 createResolutionOfInvestigationV12() {
        return new ResolutionOfInvestigationV12();
    }

    /**
     * Create an instance of {@link ServiceLevel8Choice }
     * 
     * @return
     *     the new instance of {@link ServiceLevel8Choice }
     */
    public ServiceLevel8Choice createServiceLevel8Choice() {
        return new ServiceLevel8Choice();
    }

    /**
     * Create an instance of {@link SettlementInstruction11 }
     * 
     * @return
     *     the new instance of {@link SettlementInstruction11 }
     */
    public SettlementInstruction11 createSettlementInstruction11() {
        return new SettlementInstruction11();
    }

    /**
     * Create an instance of {@link StatementResolutionEntry4 }
     * 
     * @return
     *     the new instance of {@link StatementResolutionEntry4 }
     */
    public StatementResolutionEntry4 createStatementResolutionEntry4() {
        return new StatementResolutionEntry4();
    }

    /**
     * Create an instance of {@link StructuredRemittanceInformation17 }
     * 
     * @return
     *     the new instance of {@link StructuredRemittanceInformation17 }
     */
    public StructuredRemittanceInformation17 createStructuredRemittanceInformation17() {
        return new StructuredRemittanceInformation17();
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
     * Create an instance of {@link TaxAmount3 }
     * 
     * @return
     *     the new instance of {@link TaxAmount3 }
     */
    public TaxAmount3 createTaxAmount3() {
        return new TaxAmount3();
    }

    /**
     * Create an instance of {@link TaxAmountAndType1 }
     * 
     * @return
     *     the new instance of {@link TaxAmountAndType1 }
     */
    public TaxAmountAndType1 createTaxAmountAndType1() {
        return new TaxAmountAndType1();
    }

    /**
     * Create an instance of {@link TaxAmountType1Choice }
     * 
     * @return
     *     the new instance of {@link TaxAmountType1Choice }
     */
    public TaxAmountType1Choice createTaxAmountType1Choice() {
        return new TaxAmountType1Choice();
    }

    /**
     * Create an instance of {@link TaxAuthorisation1 }
     * 
     * @return
     *     the new instance of {@link TaxAuthorisation1 }
     */
    public TaxAuthorisation1 createTaxAuthorisation1() {
        return new TaxAuthorisation1();
    }

    /**
     * Create an instance of {@link TaxCharges2 }
     * 
     * @return
     *     the new instance of {@link TaxCharges2 }
     */
    public TaxCharges2 createTaxCharges2() {
        return new TaxCharges2();
    }

    /**
     * Create an instance of {@link TaxData1 }
     * 
     * @return
     *     the new instance of {@link TaxData1 }
     */
    public TaxData1 createTaxData1() {
        return new TaxData1();
    }

    /**
     * Create an instance of {@link TaxParty1 }
     * 
     * @return
     *     the new instance of {@link TaxParty1 }
     */
    public TaxParty1 createTaxParty1() {
        return new TaxParty1();
    }

    /**
     * Create an instance of {@link TaxParty2 }
     * 
     * @return
     *     the new instance of {@link TaxParty2 }
     */
    public TaxParty2 createTaxParty2() {
        return new TaxParty2();
    }

    /**
     * Create an instance of {@link TaxPeriod3 }
     * 
     * @return
     *     the new instance of {@link TaxPeriod3 }
     */
    public TaxPeriod3 createTaxPeriod3() {
        return new TaxPeriod3();
    }

    /**
     * Create an instance of {@link TaxRecord3 }
     * 
     * @return
     *     the new instance of {@link TaxRecord3 }
     */
    public TaxRecord3 createTaxRecord3() {
        return new TaxRecord3();
    }

    /**
     * Create an instance of {@link TaxRecordDetails3 }
     * 
     * @return
     *     the new instance of {@link TaxRecordDetails3 }
     */
    public TaxRecordDetails3 createTaxRecordDetails3() {
        return new TaxRecordDetails3();
    }

    /**
     * Create an instance of {@link UnderlyingTransaction31 }
     * 
     * @return
     *     the new instance of {@link UnderlyingTransaction31 }
     */
    public UnderlyingTransaction31 createUnderlyingTransaction31() {
        return new UnderlyingTransaction31();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Document }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Document }{@code >}
     */
    @XmlElementDecl(namespace = "urn:iso:std:iso:20022:tech:xsd:camt.029.001.12", name = "Document")
    public JAXBElement<Document> createDocument(Document value) {
        return new JAXBElement<>(_Document_QNAME, Document.class, null, value);
    }

}
