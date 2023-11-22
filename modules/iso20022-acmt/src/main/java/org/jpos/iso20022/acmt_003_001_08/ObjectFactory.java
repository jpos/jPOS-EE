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

package org.jpos.iso20022.acmt_003_001_08;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.jpos.iso20022.acmt_003_001_08 package. 
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

    private static final QName _Document_QNAME = new QName("urn:iso:std:iso:20022:tech:xsd:acmt.003.001.08", "Document");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.jpos.iso20022.acmt_003_001_08
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
     * Create an instance of {@link Account23 }
     * 
     * @return
     *     the new instance of {@link Account23 }
     */
    public Account23 createAccount23() {
        return new Account23();
    }

    /**
     * Create an instance of {@link Account32 }
     * 
     * @return
     *     the new instance of {@link Account32 }
     */
    public Account32 createAccount32() {
        return new Account32();
    }

    /**
     * Create an instance of {@link AccountDesignation1Choice }
     * 
     * @return
     *     the new instance of {@link AccountDesignation1Choice }
     */
    public AccountDesignation1Choice createAccountDesignation1Choice() {
        return new AccountDesignation1Choice();
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
     * Create an instance of {@link AccountModificationInstructionV08 }
     * 
     * @return
     *     the new instance of {@link AccountModificationInstructionV08 }
     */
    public AccountModificationInstructionV08 createAccountModificationInstructionV08() {
        return new AccountModificationInstructionV08();
    }

    /**
     * Create an instance of {@link AccountOwner3Choice }
     * 
     * @return
     *     the new instance of {@link AccountOwner3Choice }
     */
    public AccountOwner3Choice createAccountOwner3Choice() {
        return new AccountOwner3Choice();
    }

    /**
     * Create an instance of {@link AccountParties13Choice }
     * 
     * @return
     *     the new instance of {@link AccountParties13Choice }
     */
    public AccountParties13Choice createAccountParties13Choice() {
        return new AccountParties13Choice();
    }

    /**
     * Create an instance of {@link AccountParties18 }
     * 
     * @return
     *     the new instance of {@link AccountParties18 }
     */
    public AccountParties18 createAccountParties18() {
        return new AccountParties18();
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
     * Create an instance of {@link AccountSelection3Choice }
     * 
     * @return
     *     the new instance of {@link AccountSelection3Choice }
     */
    public AccountSelection3Choice createAccountSelection3Choice() {
        return new AccountSelection3Choice();
    }

    /**
     * Create an instance of {@link AccountStatusUpdateInstruction1 }
     * 
     * @return
     *     the new instance of {@link AccountStatusUpdateInstruction1 }
     */
    public AccountStatusUpdateInstruction1 createAccountStatusUpdateInstruction1() {
        return new AccountStatusUpdateInstruction1();
    }

    /**
     * Create an instance of {@link AccountStatusUpdateInstruction1Choice }
     * 
     * @return
     *     the new instance of {@link AccountStatusUpdateInstruction1Choice }
     */
    public AccountStatusUpdateInstruction1Choice createAccountStatusUpdateInstruction1Choice() {
        return new AccountStatusUpdateInstruction1Choice();
    }

    /**
     * Create an instance of {@link AccountStatusUpdateInstructionReason1 }
     * 
     * @return
     *     the new instance of {@link AccountStatusUpdateInstructionReason1 }
     */
    public AccountStatusUpdateInstructionReason1 createAccountStatusUpdateInstructionReason1() {
        return new AccountStatusUpdateInstructionReason1();
    }

    /**
     * Create an instance of {@link AccountStatusUpdateInstructionReason1Choice }
     * 
     * @return
     *     the new instance of {@link AccountStatusUpdateInstructionReason1Choice }
     */
    public AccountStatusUpdateInstructionReason1Choice createAccountStatusUpdateInstructionReason1Choice() {
        return new AccountStatusUpdateInstructionReason1Choice();
    }

    /**
     * Create an instance of {@link AccountStatusUpdateInstructionReason2Choice }
     * 
     * @return
     *     the new instance of {@link AccountStatusUpdateInstructionReason2Choice }
     */
    public AccountStatusUpdateInstructionReason2Choice createAccountStatusUpdateInstructionReason2Choice() {
        return new AccountStatusUpdateInstructionReason2Choice();
    }

    /**
     * Create an instance of {@link AccountType2Choice }
     * 
     * @return
     *     the new instance of {@link AccountType2Choice }
     */
    public AccountType2Choice createAccountType2Choice() {
        return new AccountType2Choice();
    }

    /**
     * Create an instance of {@link AccountUsageType2Choice }
     * 
     * @return
     *     the new instance of {@link AccountUsageType2Choice }
     */
    public AccountUsageType2Choice createAccountUsageType2Choice() {
        return new AccountUsageType2Choice();
    }

    /**
     * Create an instance of {@link AccountingStatus1Choice }
     * 
     * @return
     *     the new instance of {@link AccountingStatus1Choice }
     */
    public AccountingStatus1Choice createAccountingStatus1Choice() {
        return new AccountingStatus1Choice();
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
     * Create an instance of {@link AdditionalReference13 }
     * 
     * @return
     *     the new instance of {@link AdditionalReference13 }
     */
    public AdditionalReference13 createAdditionalReference13() {
        return new AdditionalReference13();
    }

    /**
     * Create an instance of {@link AdditiononalInformation13 }
     * 
     * @return
     *     the new instance of {@link AdditiononalInformation13 }
     */
    public AdditiononalInformation13 createAdditiononalInformation13() {
        return new AdditiononalInformation13();
    }

    /**
     * Create an instance of {@link AddressType1Choice }
     * 
     * @return
     *     the new instance of {@link AddressType1Choice }
     */
    public AddressType1Choice createAddressType1Choice() {
        return new AddressType1Choice();
    }

    /**
     * Create an instance of {@link AddressType2Choice }
     * 
     * @return
     *     the new instance of {@link AddressType2Choice }
     */
    public AddressType2Choice createAddressType2Choice() {
        return new AddressType2Choice();
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
     * Create an instance of {@link BlockedHoldingDetails2 }
     * 
     * @return
     *     the new instance of {@link BlockedHoldingDetails2 }
     */
    public BlockedHoldingDetails2 createBlockedHoldingDetails2() {
        return new BlockedHoldingDetails2();
    }

    /**
     * Create an instance of {@link BlockedReason2Choice }
     * 
     * @return
     *     the new instance of {@link BlockedReason2Choice }
     */
    public BlockedReason2Choice createBlockedReason2Choice() {
        return new BlockedReason2Choice();
    }

    /**
     * Create an instance of {@link BlockedStatusReason2 }
     * 
     * @return
     *     the new instance of {@link BlockedStatusReason2 }
     */
    public BlockedStatusReason2 createBlockedStatusReason2() {
        return new BlockedStatusReason2();
    }

    /**
     * Create an instance of {@link BlockedStatusReason2Choice }
     * 
     * @return
     *     the new instance of {@link BlockedStatusReason2Choice }
     */
    public BlockedStatusReason2Choice createBlockedStatusReason2Choice() {
        return new BlockedStatusReason2Choice();
    }

    /**
     * Create an instance of {@link BranchData4 }
     * 
     * @return
     *     the new instance of {@link BranchData4 }
     */
    public BranchData4 createBranchData4() {
        return new BranchData4();
    }

    /**
     * Create an instance of {@link CRSForm1Choice }
     * 
     * @return
     *     the new instance of {@link CRSForm1Choice }
     */
    public CRSForm1Choice createCRSForm1Choice() {
        return new CRSForm1Choice();
    }

    /**
     * Create an instance of {@link CRSSource1Choice }
     * 
     * @return
     *     the new instance of {@link CRSSource1Choice }
     */
    public CRSSource1Choice createCRSSource1Choice() {
        return new CRSSource1Choice();
    }

    /**
     * Create an instance of {@link CRSStatus3Choice }
     * 
     * @return
     *     the new instance of {@link CRSStatus3Choice }
     */
    public CRSStatus3Choice createCRSStatus3Choice() {
        return new CRSStatus3Choice();
    }

    /**
     * Create an instance of {@link CRSStatus4 }
     * 
     * @return
     *     the new instance of {@link CRSStatus4 }
     */
    public CRSStatus4 createCRSStatus4() {
        return new CRSStatus4();
    }

    /**
     * Create an instance of {@link CashAccount204 }
     * 
     * @return
     *     the new instance of {@link CashAccount204 }
     */
    public CashAccount204 createCashAccount204() {
        return new CashAccount204();
    }

    /**
     * Create an instance of {@link CashAccountType3Choice }
     * 
     * @return
     *     the new instance of {@link CashAccountType3Choice }
     */
    public CashAccountType3Choice createCashAccountType3Choice() {
        return new CashAccountType3Choice();
    }

    /**
     * Create an instance of {@link CashSettlement4 }
     * 
     * @return
     *     the new instance of {@link CashSettlement4 }
     */
    public CashSettlement4 createCashSettlement4() {
        return new CashSettlement4();
    }

    /**
     * Create an instance of {@link CertificationType1Choice }
     * 
     * @return
     *     the new instance of {@link CertificationType1Choice }
     */
    public CertificationType1Choice createCertificationType1Choice() {
        return new CertificationType1Choice();
    }

    /**
     * Create an instance of {@link Cheque4 }
     * 
     * @return
     *     the new instance of {@link Cheque4 }
     */
    public Cheque4 createCheque4() {
        return new Cheque4();
    }

    /**
     * Create an instance of {@link CitizenshipInformation2 }
     * 
     * @return
     *     the new instance of {@link CitizenshipInformation2 }
     */
    public CitizenshipInformation2 createCitizenshipInformation2() {
        return new CitizenshipInformation2();
    }

    /**
     * Create an instance of {@link CivilStatus1Choice }
     * 
     * @return
     *     the new instance of {@link CivilStatus1Choice }
     */
    public CivilStatus1Choice createCivilStatus1Choice() {
        return new CivilStatus1Choice();
    }

    /**
     * Create an instance of {@link ClearingSystemMemberIdentification4Choice }
     * 
     * @return
     *     the new instance of {@link ClearingSystemMemberIdentification4Choice }
     */
    public ClearingSystemMemberIdentification4Choice createClearingSystemMemberIdentification4Choice() {
        return new ClearingSystemMemberIdentification4Choice();
    }

    /**
     * Create an instance of {@link CommunicationAddress6 }
     * 
     * @return
     *     the new instance of {@link CommunicationAddress6 }
     */
    public CommunicationAddress6 createCommunicationAddress6() {
        return new CommunicationAddress6();
    }

    /**
     * Create an instance of {@link CommunicationMethod3Choice }
     * 
     * @return
     *     the new instance of {@link CommunicationMethod3Choice }
     */
    public CommunicationMethod3Choice createCommunicationMethod3Choice() {
        return new CommunicationMethod3Choice();
    }

    /**
     * Create an instance of {@link CompanyLink1Choice }
     * 
     * @return
     *     the new instance of {@link CompanyLink1Choice }
     */
    public CompanyLink1Choice createCompanyLink1Choice() {
        return new CompanyLink1Choice();
    }

    /**
     * Create an instance of {@link ConsolidationType1Choice }
     * 
     * @return
     *     the new instance of {@link ConsolidationType1Choice }
     */
    public ConsolidationType1Choice createConsolidationType1Choice() {
        return new ConsolidationType1Choice();
    }

    /**
     * Create an instance of {@link CountryAndResidentialStatusType2 }
     * 
     * @return
     *     the new instance of {@link CountryAndResidentialStatusType2 }
     */
    public CountryAndResidentialStatusType2 createCountryAndResidentialStatusType2() {
        return new CountryAndResidentialStatusType2();
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
     * Create an instance of {@link DataBaseCheck1 }
     * 
     * @return
     *     the new instance of {@link DataBaseCheck1 }
     */
    public DataBaseCheck1 createDataBaseCheck1() {
        return new DataBaseCheck1();
    }

    /**
     * Create an instance of {@link DateAndAmount1 }
     * 
     * @return
     *     the new instance of {@link DateAndAmount1 }
     */
    public DateAndAmount1 createDateAndAmount1() {
        return new DateAndAmount1();
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
     * Create an instance of {@link DateTimePeriod2 }
     * 
     * @return
     *     the new instance of {@link DateTimePeriod2 }
     */
    public DateTimePeriod2 createDateTimePeriod2() {
        return new DateTimePeriod2();
    }

    /**
     * Create an instance of {@link DeMinimus1Choice }
     * 
     * @return
     *     the new instance of {@link DeMinimus1Choice }
     */
    public DeMinimus1Choice createDeMinimus1Choice() {
        return new DeMinimus1Choice();
    }

    /**
     * Create an instance of {@link DeMinimusApplicable1 }
     * 
     * @return
     *     the new instance of {@link DeMinimusApplicable1 }
     */
    public DeMinimusApplicable1 createDeMinimusApplicable1() {
        return new DeMinimusApplicable1();
    }

    /**
     * Create an instance of {@link DeMinimusNotApplicable1 }
     * 
     * @return
     *     the new instance of {@link DeMinimusNotApplicable1 }
     */
    public DeMinimusNotApplicable1 createDeMinimusNotApplicable1() {
        return new DeMinimusNotApplicable1();
    }

    /**
     * Create an instance of {@link DirectDebitMandate7 }
     * 
     * @return
     *     the new instance of {@link DirectDebitMandate7 }
     */
    public DirectDebitMandate7 createDirectDebitMandate7() {
        return new DirectDebitMandate7();
    }

    /**
     * Create an instance of {@link DocumentToSend4 }
     * 
     * @return
     *     the new instance of {@link DocumentToSend4 }
     */
    public DocumentToSend4 createDocumentToSend4() {
        return new DocumentToSend4();
    }

    /**
     * Create an instance of {@link ExtendedParty15 }
     * 
     * @return
     *     the new instance of {@link ExtendedParty15 }
     */
    public ExtendedParty15 createExtendedParty15() {
        return new ExtendedParty15();
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
     * Create an instance of {@link FATCAForm1Choice }
     * 
     * @return
     *     the new instance of {@link FATCAForm1Choice }
     */
    public FATCAForm1Choice createFATCAForm1Choice() {
        return new FATCAForm1Choice();
    }

    /**
     * Create an instance of {@link FATCASource1Choice }
     * 
     * @return
     *     the new instance of {@link FATCASource1Choice }
     */
    public FATCASource1Choice createFATCASource1Choice() {
        return new FATCASource1Choice();
    }

    /**
     * Create an instance of {@link FATCAStatus2 }
     * 
     * @return
     *     the new instance of {@link FATCAStatus2 }
     */
    public FATCAStatus2 createFATCAStatus2() {
        return new FATCAStatus2();
    }

    /**
     * Create an instance of {@link FATCAStatus2Choice }
     * 
     * @return
     *     the new instance of {@link FATCAStatus2Choice }
     */
    public FATCAStatus2Choice createFATCAStatus2Choice() {
        return new FATCAStatus2Choice();
    }

    /**
     * Create an instance of {@link FinancialInstitutionIdentification11Choice }
     * 
     * @return
     *     the new instance of {@link FinancialInstitutionIdentification11Choice }
     */
    public FinancialInstitutionIdentification11Choice createFinancialInstitutionIdentification11Choice() {
        return new FinancialInstitutionIdentification11Choice();
    }

    /**
     * Create an instance of {@link FinancialInstrument55 }
     * 
     * @return
     *     the new instance of {@link FinancialInstrument55 }
     */
    public FinancialInstrument55 createFinancialInstrument55() {
        return new FinancialInstrument55();
    }

    /**
     * Create an instance of {@link FinancialInstrument87 }
     * 
     * @return
     *     the new instance of {@link FinancialInstrument87 }
     */
    public FinancialInstrument87 createFinancialInstrument87() {
        return new FinancialInstrument87();
    }

    /**
     * Create an instance of {@link FiscalYear1Choice }
     * 
     * @return
     *     the new instance of {@link FiscalYear1Choice }
     */
    public FiscalYear1Choice createFiscalYear1Choice() {
        return new FiscalYear1Choice();
    }

    /**
     * Create an instance of {@link Frequency20Choice }
     * 
     * @return
     *     the new instance of {@link Frequency20Choice }
     */
    public Frequency20Choice createFrequency20Choice() {
        return new Frequency20Choice();
    }

    /**
     * Create an instance of {@link GDPRData1 }
     * 
     * @return
     *     the new instance of {@link GDPRData1 }
     */
    public GDPRData1 createGDPRData1() {
        return new GDPRData1();
    }

    /**
     * Create an instance of {@link GDPRDataConsent1Choice }
     * 
     * @return
     *     the new instance of {@link GDPRDataConsent1Choice }
     */
    public GDPRDataConsent1Choice createGDPRDataConsent1Choice() {
        return new GDPRDataConsent1Choice();
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
     * Create an instance of {@link GenericIdentification36 }
     * 
     * @return
     *     the new instance of {@link GenericIdentification36 }
     */
    public GenericIdentification36 createGenericIdentification36() {
        return new GenericIdentification36();
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
     * Create an instance of {@link GenericIdentification81 }
     * 
     * @return
     *     the new instance of {@link GenericIdentification81 }
     */
    public GenericIdentification81 createGenericIdentification81() {
        return new GenericIdentification81();
    }

    /**
     * Create an instance of {@link GenericIdentification82 }
     * 
     * @return
     *     the new instance of {@link GenericIdentification82 }
     */
    public GenericIdentification82 createGenericIdentification82() {
        return new GenericIdentification82();
    }

    /**
     * Create an instance of {@link HighFrequencyTradingProfile1 }
     * 
     * @return
     *     the new instance of {@link HighFrequencyTradingProfile1 }
     */
    public HighFrequencyTradingProfile1 createHighFrequencyTradingProfile1() {
        return new HighFrequencyTradingProfile1();
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
     * Create an instance of {@link IndividualPerson29 }
     * 
     * @return
     *     the new instance of {@link IndividualPerson29 }
     */
    public IndividualPerson29 createIndividualPerson29() {
        return new IndividualPerson29();
    }

    /**
     * Create an instance of {@link IndividualPerson35 }
     * 
     * @return
     *     the new instance of {@link IndividualPerson35 }
     */
    public IndividualPerson35 createIndividualPerson35() {
        return new IndividualPerson35();
    }

    /**
     * Create an instance of {@link IndividualPerson38 }
     * 
     * @return
     *     the new instance of {@link IndividualPerson38 }
     */
    public IndividualPerson38 createIndividualPerson38() {
        return new IndividualPerson38();
    }

    /**
     * Create an instance of {@link IndividualPersonIdentification3Choice }
     * 
     * @return
     *     the new instance of {@link IndividualPersonIdentification3Choice }
     */
    public IndividualPersonIdentification3Choice createIndividualPersonIdentification3Choice() {
        return new IndividualPersonIdentification3Choice();
    }

    /**
     * Create an instance of {@link InformationDistribution1Choice }
     * 
     * @return
     *     the new instance of {@link InformationDistribution1Choice }
     */
    public InformationDistribution1Choice createInformationDistribution1Choice() {
        return new InformationDistribution1Choice();
    }

    /**
     * Create an instance of {@link InitialAmount1Choice }
     * 
     * @return
     *     the new instance of {@link InitialAmount1Choice }
     */
    public InitialAmount1Choice createInitialAmount1Choice() {
        return new InitialAmount1Choice();
    }

    /**
     * Create an instance of {@link InsuranceType2Choice }
     * 
     * @return
     *     the new instance of {@link InsuranceType2Choice }
     */
    public InsuranceType2Choice createInsuranceType2Choice() {
        return new InsuranceType2Choice();
    }

    /**
     * Create an instance of {@link Intermediary46 }
     * 
     * @return
     *     the new instance of {@link Intermediary46 }
     */
    public Intermediary46 createIntermediary46() {
        return new Intermediary46();
    }

    /**
     * Create an instance of {@link Intermediary47 }
     * 
     * @return
     *     the new instance of {@link Intermediary47 }
     */
    public Intermediary47 createIntermediary47() {
        return new Intermediary47();
    }

    /**
     * Create an instance of {@link InvestmentAccount75 }
     * 
     * @return
     *     the new instance of {@link InvestmentAccount75 }
     */
    public InvestmentAccount75 createInvestmentAccount75() {
        return new InvestmentAccount75();
    }

    /**
     * Create an instance of {@link InvestmentAccount76 }
     * 
     * @return
     *     the new instance of {@link InvestmentAccount76 }
     */
    public InvestmentAccount76 createInvestmentAccount76() {
        return new InvestmentAccount76();
    }

    /**
     * Create an instance of {@link InvestmentAccountCategory1Choice }
     * 
     * @return
     *     the new instance of {@link InvestmentAccountCategory1Choice }
     */
    public InvestmentAccountCategory1Choice createInvestmentAccountCategory1Choice() {
        return new InvestmentAccountCategory1Choice();
    }

    /**
     * Create an instance of {@link InvestmentAccountModification4 }
     * 
     * @return
     *     the new instance of {@link InvestmentAccountModification4 }
     */
    public InvestmentAccountModification4 createInvestmentAccountModification4() {
        return new InvestmentAccountModification4();
    }

    /**
     * Create an instance of {@link InvestmentAccountOwnershipInformation17 }
     * 
     * @return
     *     the new instance of {@link InvestmentAccountOwnershipInformation17 }
     */
    public InvestmentAccountOwnershipInformation17 createInvestmentAccountOwnershipInformation17() {
        return new InvestmentAccountOwnershipInformation17();
    }

    /**
     * Create an instance of {@link InvestmentPlan16 }
     * 
     * @return
     *     the new instance of {@link InvestmentPlan16 }
     */
    public InvestmentPlan16 createInvestmentPlan16() {
        return new InvestmentPlan16();
    }

    /**
     * Create an instance of {@link InvestorProfile2 }
     * 
     * @return
     *     the new instance of {@link InvestorProfile2 }
     */
    public InvestorProfile2 createInvestorProfile2() {
        return new InvestorProfile2();
    }

    /**
     * Create an instance of {@link InvestorProfileStatus1Choice }
     * 
     * @return
     *     the new instance of {@link InvestorProfileStatus1Choice }
     */
    public InvestorProfileStatus1Choice createInvestorProfileStatus1Choice() {
        return new InvestorProfileStatus1Choice();
    }

    /**
     * Create an instance of {@link KYCCheckType1Choice }
     * 
     * @return
     *     the new instance of {@link KYCCheckType1Choice }
     */
    public KYCCheckType1Choice createKYCCheckType1Choice() {
        return new KYCCheckType1Choice();
    }

    /**
     * Create an instance of {@link LetterIntent1 }
     * 
     * @return
     *     the new instance of {@link LetterIntent1 }
     */
    public LetterIntent1 createLetterIntent1() {
        return new LetterIntent1();
    }

    /**
     * Create an instance of {@link LevelOfControl1Choice }
     * 
     * @return
     *     the new instance of {@link LevelOfControl1Choice }
     */
    public LevelOfControl1Choice createLevelOfControl1Choice() {
        return new LevelOfControl1Choice();
    }

    /**
     * Create an instance of {@link Liability1Choice }
     * 
     * @return
     *     the new instance of {@link Liability1Choice }
     */
    public Liability1Choice createLiability1Choice() {
        return new Liability1Choice();
    }

    /**
     * Create an instance of {@link MailType1Choice }
     * 
     * @return
     *     the new instance of {@link MailType1Choice }
     */
    public MailType1Choice createMailType1Choice() {
        return new MailType1Choice();
    }

    /**
     * Create an instance of {@link MarketMakerProfile2 }
     * 
     * @return
     *     the new instance of {@link MarketMakerProfile2 }
     */
    public MarketMakerProfile2 createMarketMakerProfile2() {
        return new MarketMakerProfile2();
    }

    /**
     * Create an instance of {@link MarketPracticeVersion1 }
     * 
     * @return
     *     the new instance of {@link MarketPracticeVersion1 }
     */
    public MarketPracticeVersion1 createMarketPracticeVersion1() {
        return new MarketPracticeVersion1();
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
     * Create an instance of {@link MiFIDClassification1 }
     * 
     * @return
     *     the new instance of {@link MiFIDClassification1 }
     */
    public MiFIDClassification1 createMiFIDClassification1() {
        return new MiFIDClassification1();
    }

    /**
     * Create an instance of {@link ModificationScope21 }
     * 
     * @return
     *     the new instance of {@link ModificationScope21 }
     */
    public ModificationScope21 createModificationScope21() {
        return new ModificationScope21();
    }

    /**
     * Create an instance of {@link ModificationScope27 }
     * 
     * @return
     *     the new instance of {@link ModificationScope27 }
     */
    public ModificationScope27 createModificationScope27() {
        return new ModificationScope27();
    }

    /**
     * Create an instance of {@link ModificationScope34 }
     * 
     * @return
     *     the new instance of {@link ModificationScope34 }
     */
    public ModificationScope34 createModificationScope34() {
        return new ModificationScope34();
    }

    /**
     * Create an instance of {@link ModificationScope39 }
     * 
     * @return
     *     the new instance of {@link ModificationScope39 }
     */
    public ModificationScope39 createModificationScope39() {
        return new ModificationScope39();
    }

    /**
     * Create an instance of {@link ModificationScope40 }
     * 
     * @return
     *     the new instance of {@link ModificationScope40 }
     */
    public ModificationScope40 createModificationScope40() {
        return new ModificationScope40();
    }

    /**
     * Create an instance of {@link ModificationScope41 }
     * 
     * @return
     *     the new instance of {@link ModificationScope41 }
     */
    public ModificationScope41 createModificationScope41() {
        return new ModificationScope41();
    }

    /**
     * Create an instance of {@link ModificationScope42 }
     * 
     * @return
     *     the new instance of {@link ModificationScope42 }
     */
    public ModificationScope42 createModificationScope42() {
        return new ModificationScope42();
    }

    /**
     * Create an instance of {@link ModificationScope43 }
     * 
     * @return
     *     the new instance of {@link ModificationScope43 }
     */
    public ModificationScope43 createModificationScope43() {
        return new ModificationScope43();
    }

    /**
     * Create an instance of {@link ModificationScope44 }
     * 
     * @return
     *     the new instance of {@link ModificationScope44 }
     */
    public ModificationScope44 createModificationScope44() {
        return new ModificationScope44();
    }

    /**
     * Create an instance of {@link ModificationScope45 }
     * 
     * @return
     *     the new instance of {@link ModificationScope45 }
     */
    public ModificationScope45 createModificationScope45() {
        return new ModificationScope45();
    }

    /**
     * Create an instance of {@link ModificationScope46 }
     * 
     * @return
     *     the new instance of {@link ModificationScope46 }
     */
    public ModificationScope46 createModificationScope46() {
        return new ModificationScope46();
    }

    /**
     * Create an instance of {@link MoneyLaunderingCheck1Choice }
     * 
     * @return
     *     the new instance of {@link MoneyLaunderingCheck1Choice }
     */
    public MoneyLaunderingCheck1Choice createMoneyLaunderingCheck1Choice() {
        return new MoneyLaunderingCheck1Choice();
    }

    /**
     * Create an instance of {@link NameAndAddress15 }
     * 
     * @return
     *     the new instance of {@link NameAndAddress15 }
     */
    public NameAndAddress15 createNameAndAddress15() {
        return new NameAndAddress15();
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
     * Create an instance of {@link NamePrefix1Choice }
     * 
     * @return
     *     the new instance of {@link NamePrefix1Choice }
     */
    public NamePrefix1Choice createNamePrefix1Choice() {
        return new NamePrefix1Choice();
    }

    /**
     * Create an instance of {@link NewIssueAllocation2 }
     * 
     * @return
     *     the new instance of {@link NewIssueAllocation2 }
     */
    public NewIssueAllocation2 createNewIssueAllocation2() {
        return new NewIssueAllocation2();
    }

    /**
     * Create an instance of {@link Notification2 }
     * 
     * @return
     *     the new instance of {@link Notification2 }
     */
    public Notification2 createNotification2() {
        return new Notification2();
    }

    /**
     * Create an instance of {@link Organisation23 }
     * 
     * @return
     *     the new instance of {@link Organisation23 }
     */
    public Organisation23 createOrganisation23() {
        return new Organisation23();
    }

    /**
     * Create an instance of {@link Organisation40 }
     * 
     * @return
     *     the new instance of {@link Organisation40 }
     */
    public Organisation40 createOrganisation40() {
        return new Organisation40();
    }

    /**
     * Create an instance of {@link OrganisationType1Choice }
     * 
     * @return
     *     the new instance of {@link OrganisationType1Choice }
     */
    public OrganisationType1Choice createOrganisationType1Choice() {
        return new OrganisationType1Choice();
    }

    /**
     * Create an instance of {@link OtherIdentification3Choice }
     * 
     * @return
     *     the new instance of {@link OtherIdentification3Choice }
     */
    public OtherIdentification3Choice createOtherIdentification3Choice() {
        return new OtherIdentification3Choice();
    }

    /**
     * Create an instance of {@link OwnershipBeneficiaryRate1 }
     * 
     * @return
     *     the new instance of {@link OwnershipBeneficiaryRate1 }
     */
    public OwnershipBeneficiaryRate1 createOwnershipBeneficiaryRate1() {
        return new OwnershipBeneficiaryRate1();
    }

    /**
     * Create an instance of {@link OwnershipType2Choice }
     * 
     * @return
     *     the new instance of {@link OwnershipType2Choice }
     */
    public OwnershipType2Choice createOwnershipType2Choice() {
        return new OwnershipType2Choice();
    }

    /**
     * Create an instance of {@link Party48Choice }
     * 
     * @return
     *     the new instance of {@link Party48Choice }
     */
    public Party48Choice createParty48Choice() {
        return new Party48Choice();
    }

    /**
     * Create an instance of {@link PartyIdentification125Choice }
     * 
     * @return
     *     the new instance of {@link PartyIdentification125Choice }
     */
    public PartyIdentification125Choice createPartyIdentification125Choice() {
        return new PartyIdentification125Choice();
    }

    /**
     * Create an instance of {@link PartyIdentification177Choice }
     * 
     * @return
     *     the new instance of {@link PartyIdentification177Choice }
     */
    public PartyIdentification177Choice createPartyIdentification177Choice() {
        return new PartyIdentification177Choice();
    }

    /**
     * Create an instance of {@link PartyIdentification182Choice }
     * 
     * @return
     *     the new instance of {@link PartyIdentification182Choice }
     */
    public PartyIdentification182Choice createPartyIdentification182Choice() {
        return new PartyIdentification182Choice();
    }

    /**
     * Create an instance of {@link PartyIdentification220 }
     * 
     * @return
     *     the new instance of {@link PartyIdentification220 }
     */
    public PartyIdentification220 createPartyIdentification220() {
        return new PartyIdentification220();
    }

    /**
     * Create an instance of {@link PartyProfileInformation5 }
     * 
     * @return
     *     the new instance of {@link PartyProfileInformation5 }
     */
    public PartyProfileInformation5 createPartyProfileInformation5() {
        return new PartyProfileInformation5();
    }

    /**
     * Create an instance of {@link PartyRole2Choice }
     * 
     * @return
     *     the new instance of {@link PartyRole2Choice }
     */
    public PartyRole2Choice createPartyRole2Choice() {
        return new PartyRole2Choice();
    }

    /**
     * Create an instance of {@link PartyRole4Choice }
     * 
     * @return
     *     the new instance of {@link PartyRole4Choice }
     */
    public PartyRole4Choice createPartyRole4Choice() {
        return new PartyRole4Choice();
    }

    /**
     * Create an instance of {@link PartyRole5Choice }
     * 
     * @return
     *     the new instance of {@link PartyRole5Choice }
     */
    public PartyRole5Choice createPartyRole5Choice() {
        return new PartyRole5Choice();
    }

    /**
     * Create an instance of {@link PaymentCard29 }
     * 
     * @return
     *     the new instance of {@link PaymentCard29 }
     */
    public PaymentCard29 createPaymentCard29() {
        return new PaymentCard29();
    }

    /**
     * Create an instance of {@link PaymentInstrument17 }
     * 
     * @return
     *     the new instance of {@link PaymentInstrument17 }
     */
    public PaymentInstrument17 createPaymentInstrument17() {
        return new PaymentInstrument17();
    }

    /**
     * Create an instance of {@link PaymentInstrument19Choice }
     * 
     * @return
     *     the new instance of {@link PaymentInstrument19Choice }
     */
    public PaymentInstrument19Choice createPaymentInstrument19Choice() {
        return new PaymentInstrument19Choice();
    }

    /**
     * Create an instance of {@link PaymentInstrument24Choice }
     * 
     * @return
     *     the new instance of {@link PaymentInstrument24Choice }
     */
    public PaymentInstrument24Choice createPaymentInstrument24Choice() {
        return new PaymentInstrument24Choice();
    }

    /**
     * Create an instance of {@link PersonalInformation1 }
     * 
     * @return
     *     the new instance of {@link PersonalInformation1 }
     */
    public PersonalInformation1 createPersonalInformation1() {
        return new PersonalInformation1();
    }

    /**
     * Create an instance of {@link PlanStatus2Choice }
     * 
     * @return
     *     the new instance of {@link PlanStatus2Choice }
     */
    public PlanStatus2Choice createPlanStatus2Choice() {
        return new PlanStatus2Choice();
    }

    /**
     * Create an instance of {@link PoliticalExposureType2Choice }
     * 
     * @return
     *     the new instance of {@link PoliticalExposureType2Choice }
     */
    public PoliticalExposureType2Choice createPoliticalExposureType2Choice() {
        return new PoliticalExposureType2Choice();
    }

    /**
     * Create an instance of {@link PoliticallyExposedPerson1 }
     * 
     * @return
     *     the new instance of {@link PoliticallyExposedPerson1 }
     */
    public PoliticallyExposedPerson1 createPoliticallyExposedPerson1() {
        return new PoliticallyExposedPerson1();
    }

    /**
     * Create an instance of {@link PoliticallyExposedPersonStatus1Choice }
     * 
     * @return
     *     the new instance of {@link PoliticallyExposedPersonStatus1Choice }
     */
    public PoliticallyExposedPersonStatus1Choice createPoliticallyExposedPersonStatus1Choice() {
        return new PoliticallyExposedPersonStatus1Choice();
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
     * Create an instance of {@link PostalAddress21 }
     * 
     * @return
     *     the new instance of {@link PostalAddress21 }
     */
    public PostalAddress21 createPostalAddress21() {
        return new PostalAddress21();
    }

    /**
     * Create an instance of {@link ProfileType1Choice }
     * 
     * @return
     *     the new instance of {@link ProfileType1Choice }
     */
    public ProfileType1Choice createProfileType1Choice() {
        return new ProfileType1Choice();
    }

    /**
     * Create an instance of {@link ReferredAgent3 }
     * 
     * @return
     *     the new instance of {@link ReferredAgent3 }
     */
    public ReferredAgent3 createReferredAgent3() {
        return new ReferredAgent3();
    }

    /**
     * Create an instance of {@link RegisteredShareholderName1Choice }
     * 
     * @return
     *     the new instance of {@link RegisteredShareholderName1Choice }
     */
    public RegisteredShareholderName1Choice createRegisteredShareholderName1Choice() {
        return new RegisteredShareholderName1Choice();
    }

    /**
     * Create an instance of {@link RegulatoryInformation1 }
     * 
     * @return
     *     the new instance of {@link RegulatoryInformation1 }
     */
    public RegulatoryInformation1 createRegulatoryInformation1() {
        return new RegulatoryInformation1();
    }

    /**
     * Create an instance of {@link Reinvestment4 }
     * 
     * @return
     *     the new instance of {@link Reinvestment4 }
     */
    public Reinvestment4 createReinvestment4() {
        return new Reinvestment4();
    }

    /**
     * Create an instance of {@link Repartition6 }
     * 
     * @return
     *     the new instance of {@link Repartition6 }
     */
    public Repartition6 createRepartition6() {
        return new Repartition6();
    }

    /**
     * Create an instance of {@link RestrictionStatus1Choice }
     * 
     * @return
     *     the new instance of {@link RestrictionStatus1Choice }
     */
    public RestrictionStatus1Choice createRestrictionStatus1Choice() {
        return new RestrictionStatus1Choice();
    }

    /**
     * Create an instance of {@link RiskLevel2Choice }
     * 
     * @return
     *     the new instance of {@link RiskLevel2Choice }
     */
    public RiskLevel2Choice createRiskLevel2Choice() {
        return new RiskLevel2Choice();
    }

    /**
     * Create an instance of {@link RoundingParameters1 }
     * 
     * @return
     *     the new instance of {@link RoundingParameters1 }
     */
    public RoundingParameters1 createRoundingParameters1() {
        return new RoundingParameters1();
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
     * Create an instance of {@link SettlementFrequency1Choice }
     * 
     * @return
     *     the new instance of {@link SettlementFrequency1Choice }
     */
    public SettlementFrequency1Choice createSettlementFrequency1Choice() {
        return new SettlementFrequency1Choice();
    }

    /**
     * Create an instance of {@link SettlementInstructionReason1Choice }
     * 
     * @return
     *     the new instance of {@link SettlementInstructionReason1Choice }
     */
    public SettlementInstructionReason1Choice createSettlementInstructionReason1Choice() {
        return new SettlementInstructionReason1Choice();
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
     * Create an instance of {@link StatementFrequencyReason2Choice }
     * 
     * @return
     *     the new instance of {@link StatementFrequencyReason2Choice }
     */
    public StatementFrequencyReason2Choice createStatementFrequencyReason2Choice() {
        return new StatementFrequencyReason2Choice();
    }

    /**
     * Create an instance of {@link TaxExemptionReason2Choice }
     * 
     * @return
     *     the new instance of {@link TaxExemptionReason2Choice }
     */
    public TaxExemptionReason2Choice createTaxExemptionReason2Choice() {
        return new TaxExemptionReason2Choice();
    }

    /**
     * Create an instance of {@link TaxReporting3 }
     * 
     * @return
     *     the new instance of {@link TaxReporting3 }
     */
    public TaxReporting3 createTaxReporting3() {
        return new TaxReporting3();
    }

    /**
     * Create an instance of {@link ThirdPartyRights2 }
     * 
     * @return
     *     the new instance of {@link ThirdPartyRights2 }
     */
    public ThirdPartyRights2 createThirdPartyRights2() {
        return new ThirdPartyRights2();
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
     * Create an instance of {@link TransactionType5Choice }
     * 
     * @return
     *     the new instance of {@link TransactionType5Choice }
     */
    public TransactionType5Choice createTransactionType5Choice() {
        return new TransactionType5Choice();
    }

    /**
     * Create an instance of {@link TreasuryProfile1 }
     * 
     * @return
     *     the new instance of {@link TreasuryProfile1 }
     */
    public TreasuryProfile1 createTreasuryProfile1() {
        return new TreasuryProfile1();
    }

    /**
     * Create an instance of {@link UnitsOrAmount1Choice }
     * 
     * @return
     *     the new instance of {@link UnitsOrAmount1Choice }
     */
    public UnitsOrAmount1Choice createUnitsOrAmount1Choice() {
        return new UnitsOrAmount1Choice();
    }

    /**
     * Create an instance of {@link UnitsOrAmountOrPercentage1Choice }
     * 
     * @return
     *     the new instance of {@link UnitsOrAmountOrPercentage1Choice }
     */
    public UnitsOrAmountOrPercentage1Choice createUnitsOrAmountOrPercentage1Choice() {
        return new UnitsOrAmountOrPercentage1Choice();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Document }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Document }{@code >}
     */
    @XmlElementDecl(namespace = "urn:iso:std:iso:20022:tech:xsd:acmt.003.001.08", name = "Document")
    public JAXBElement<Document> createDocument(Document value) {
        return new JAXBElement<>(_Document_QNAME, Document.class, null, value);
    }

}
