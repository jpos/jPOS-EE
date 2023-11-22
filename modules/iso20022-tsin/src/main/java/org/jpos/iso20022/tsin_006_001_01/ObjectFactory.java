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

package org.jpos.iso20022.tsin_006_001_01;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlIDREF;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.jpos.iso20022.tsin_006_001_01 package. 
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

    private static final QName _Document_QNAME = new QName("urn:iso:std:iso:20022:tech:xsd:tsin.006.001.01", "Document");
    private static final QName _FinancingNotificationParties1AckRcvr_QNAME = new QName("urn:iso:std:iso:20022:tech:xsd:tsin.006.001.01", "AckRcvr");
    private static final QName _FinancingItemList1RltdDoc_QNAME = new QName("urn:iso:std:iso:20022:tech:xsd:tsin.006.001.01", "RltdDoc");
    private static final QName _FinancialItemParameters1RltdItm_QNAME = new QName("urn:iso:std:iso:20022:tech:xsd:tsin.006.001.01", "RltdItm");
    private static final QName _FinancialItemParameters1GovngCtrct_QNAME = new QName("urn:iso:std:iso:20022:tech:xsd:tsin.006.001.01", "GovngCtrct");
    private static final QName _FinancialItem1FinDocRef_QNAME = new QName("urn:iso:std:iso:20022:tech:xsd:tsin.006.001.01", "FinDocRef");
    private static final QName _FinancialItem1AssoctdDoc_QNAME = new QName("urn:iso:std:iso:20022:tech:xsd:tsin.006.001.01", "AssoctdDoc");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.jpos.iso20022.tsin_006_001_01
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
     * Create an instance of {@link AccountIdentification3Choice }
     * 
     * @return
     *     the new instance of {@link AccountIdentification3Choice }
     */
    public AccountIdentification3Choice createAccountIdentification3Choice() {
        return new AccountIdentification3Choice();
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
     * Create an instance of {@link Adjustment5 }
     * 
     * @return
     *     the new instance of {@link Adjustment5 }
     */
    public Adjustment5 createAdjustment5() {
        return new Adjustment5();
    }

    /**
     * Create an instance of {@link AgreedRate1 }
     * 
     * @return
     *     the new instance of {@link AgreedRate1 }
     */
    public AgreedRate1 createAgreedRate1() {
        return new AgreedRate1();
    }

    /**
     * Create an instance of {@link AlgorithmAndDigest1 }
     * 
     * @return
     *     the new instance of {@link AlgorithmAndDigest1 }
     */
    public AlgorithmAndDigest1 createAlgorithmAndDigest1() {
        return new AlgorithmAndDigest1();
    }

    /**
     * Create an instance of {@link BinaryFile1 }
     * 
     * @return
     *     the new instance of {@link BinaryFile1 }
     */
    public BinaryFile1 createBinaryFile1() {
        return new BinaryFile1();
    }

    /**
     * Create an instance of {@link BranchAndFinancialInstitutionIdentification4 }
     * 
     * @return
     *     the new instance of {@link BranchAndFinancialInstitutionIdentification4 }
     */
    public BranchAndFinancialInstitutionIdentification4 createBranchAndFinancialInstitutionIdentification4() {
        return new BranchAndFinancialInstitutionIdentification4();
    }

    /**
     * Create an instance of {@link BranchAndFinancialInstitutionIdentification5 }
     * 
     * @return
     *     the new instance of {@link BranchAndFinancialInstitutionIdentification5 }
     */
    public BranchAndFinancialInstitutionIdentification5 createBranchAndFinancialInstitutionIdentification5() {
        return new BranchAndFinancialInstitutionIdentification5();
    }

    /**
     * Create an instance of {@link BranchData2 }
     * 
     * @return
     *     the new instance of {@link BranchData2 }
     */
    public BranchData2 createBranchData2() {
        return new BranchData2();
    }

    /**
     * Create an instance of {@link BusinessApplicationHeader1 }
     * 
     * @return
     *     the new instance of {@link BusinessApplicationHeader1 }
     */
    public BusinessApplicationHeader1 createBusinessApplicationHeader1() {
        return new BusinessApplicationHeader1();
    }

    /**
     * Create an instance of {@link BusinessLetter1 }
     * 
     * @return
     *     the new instance of {@link BusinessLetter1 }
     */
    public BusinessLetter1 createBusinessLetter1() {
        return new BusinessLetter1();
    }

    /**
     * Create an instance of {@link CashAccount16 }
     * 
     * @return
     *     the new instance of {@link CashAccount16 }
     */
    public CashAccount16 createCashAccount16() {
        return new CashAccount16();
    }

    /**
     * Create an instance of {@link CashAccount7 }
     * 
     * @return
     *     the new instance of {@link CashAccount7 }
     */
    public CashAccount7 createCashAccount7() {
        return new CashAccount7();
    }

    /**
     * Create an instance of {@link CashAccountType2 }
     * 
     * @return
     *     the new instance of {@link CashAccountType2 }
     */
    public CashAccountType2 createCashAccountType2() {
        return new CashAccountType2();
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
     * Create an instance of {@link ClearingSystemIdentification2Choice }
     * 
     * @return
     *     the new instance of {@link ClearingSystemIdentification2Choice }
     */
    public ClearingSystemIdentification2Choice createClearingSystemIdentification2Choice() {
        return new ClearingSystemIdentification2Choice();
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
     * Create an instance of {@link ContactDetails2 }
     * 
     * @return
     *     the new instance of {@link ContactDetails2 }
     */
    public ContactDetails2 createContactDetails2() {
        return new ContactDetails2();
    }

    /**
     * Create an instance of {@link Contacts3 }
     * 
     * @return
     *     the new instance of {@link Contacts3 }
     */
    public Contacts3 createContacts3() {
        return new Contacts3();
    }

    /**
     * Create an instance of {@link CountrySubdivision1Choice }
     * 
     * @return
     *     the new instance of {@link CountrySubdivision1Choice }
     */
    public CountrySubdivision1Choice createCountrySubdivision1Choice() {
        return new CountrySubdivision1Choice();
    }

    /**
     * Create an instance of {@link DateAndPlaceOfBirth }
     * 
     * @return
     *     the new instance of {@link DateAndPlaceOfBirth }
     */
    public DateAndPlaceOfBirth createDateAndPlaceOfBirth() {
        return new DateAndPlaceOfBirth();
    }

    /**
     * Create an instance of {@link EncapsulatedBusinessMessage1 }
     * 
     * @return
     *     the new instance of {@link EncapsulatedBusinessMessage1 }
     */
    public EncapsulatedBusinessMessage1 createEncapsulatedBusinessMessage1() {
        return new EncapsulatedBusinessMessage1();
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
     * Create an instance of {@link FinancialInstitutionIdentification7 }
     * 
     * @return
     *     the new instance of {@link FinancialInstitutionIdentification7 }
     */
    public FinancialInstitutionIdentification7 createFinancialInstitutionIdentification7() {
        return new FinancialInstitutionIdentification7();
    }

    /**
     * Create an instance of {@link FinancialInstitutionIdentification8 }
     * 
     * @return
     *     the new instance of {@link FinancialInstitutionIdentification8 }
     */
    public FinancialInstitutionIdentification8 createFinancialInstitutionIdentification8() {
        return new FinancialInstitutionIdentification8();
    }

    /**
     * Create an instance of {@link FinancialItem1 }
     * 
     * @return
     *     the new instance of {@link FinancialItem1 }
     */
    public FinancialItem1 createFinancialItem1() {
        return new FinancialItem1();
    }

    /**
     * Create an instance of {@link FinancialItemParameters1 }
     * 
     * @return
     *     the new instance of {@link FinancialItemParameters1 }
     */
    public FinancialItemParameters1 createFinancialItemParameters1() {
        return new FinancialItemParameters1();
    }

    /**
     * Create an instance of {@link FinancingAllowedSummary1 }
     * 
     * @return
     *     the new instance of {@link FinancingAllowedSummary1 }
     */
    public FinancingAllowedSummary1 createFinancingAllowedSummary1() {
        return new FinancingAllowedSummary1();
    }

    /**
     * Create an instance of {@link FinancingDateDetails1 }
     * 
     * @return
     *     the new instance of {@link FinancingDateDetails1 }
     */
    public FinancingDateDetails1 createFinancingDateDetails1() {
        return new FinancingDateDetails1();
    }

    /**
     * Create an instance of {@link FinancingInformationAndStatus1 }
     * 
     * @return
     *     the new instance of {@link FinancingInformationAndStatus1 }
     */
    public FinancingInformationAndStatus1 createFinancingInformationAndStatus1() {
        return new FinancingInformationAndStatus1();
    }

    /**
     * Create an instance of {@link FinancingItemList1 }
     * 
     * @return
     *     the new instance of {@link FinancingItemList1 }
     */
    public FinancingItemList1 createFinancingItemList1() {
        return new FinancingItemList1();
    }

    /**
     * Create an instance of {@link FinancingNotificationParties1 }
     * 
     * @return
     *     the new instance of {@link FinancingNotificationParties1 }
     */
    public FinancingNotificationParties1 createFinancingNotificationParties1() {
        return new FinancingNotificationParties1();
    }

    /**
     * Create an instance of {@link FinancingRateOrAmountChoice }
     * 
     * @return
     *     the new instance of {@link FinancingRateOrAmountChoice }
     */
    public FinancingRateOrAmountChoice createFinancingRateOrAmountChoice() {
        return new FinancingRateOrAmountChoice();
    }

    /**
     * Create an instance of {@link FinancingResult1 }
     * 
     * @return
     *     the new instance of {@link FinancingResult1 }
     */
    public FinancingResult1 createFinancingResult1() {
        return new FinancingResult1();
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
     * Create an instance of {@link GenericIdentification1 }
     * 
     * @return
     *     the new instance of {@link GenericIdentification1 }
     */
    public GenericIdentification1 createGenericIdentification1() {
        return new GenericIdentification1();
    }

    /**
     * Create an instance of {@link GenericIdentification20 }
     * 
     * @return
     *     the new instance of {@link GenericIdentification20 }
     */
    public GenericIdentification20 createGenericIdentification20() {
        return new GenericIdentification20();
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
     * Create an instance of {@link GenericIdentification4 }
     * 
     * @return
     *     the new instance of {@link GenericIdentification4 }
     */
    public GenericIdentification4 createGenericIdentification4() {
        return new GenericIdentification4();
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
     * Create an instance of {@link GovernanceIdentification1Choice }
     * 
     * @return
     *     the new instance of {@link GovernanceIdentification1Choice }
     */
    public GovernanceIdentification1Choice createGovernanceIdentification1Choice() {
        return new GovernanceIdentification1Choice();
    }

    /**
     * Create an instance of {@link GovernanceRules2 }
     * 
     * @return
     *     the new instance of {@link GovernanceRules2 }
     */
    public GovernanceRules2 createGovernanceRules2() {
        return new GovernanceRules2();
    }

    /**
     * Create an instance of {@link Instalment2 }
     * 
     * @return
     *     the new instance of {@link Instalment2 }
     */
    public Instalment2 createInstalment2() {
        return new Instalment2();
    }

    /**
     * Create an instance of {@link InstalmentFinancingInformation1 }
     * 
     * @return
     *     the new instance of {@link InstalmentFinancingInformation1 }
     */
    public InstalmentFinancingInformation1 createInstalmentFinancingInformation1() {
        return new InstalmentFinancingInformation1();
    }

    /**
     * Create an instance of {@link InvoiceAssignmentRequestV01 }
     * 
     * @return
     *     the new instance of {@link InvoiceAssignmentRequestV01 }
     */
    public InvoiceAssignmentRequestV01 createInvoiceAssignmentRequestV01() {
        return new InvoiceAssignmentRequestV01();
    }

    /**
     * Create an instance of {@link InvoiceFinancingDetails1 }
     * 
     * @return
     *     the new instance of {@link InvoiceFinancingDetails1 }
     */
    public InvoiceFinancingDetails1 createInvoiceFinancingDetails1() {
        return new InvoiceFinancingDetails1();
    }

    /**
     * Create an instance of {@link InvoiceTotals1 }
     * 
     * @return
     *     the new instance of {@link InvoiceTotals1 }
     */
    public InvoiceTotals1 createInvoiceTotals1() {
        return new InvoiceTotals1();
    }

    /**
     * Create an instance of {@link LegalOrganisation1 }
     * 
     * @return
     *     the new instance of {@link LegalOrganisation1 }
     */
    public LegalOrganisation1 createLegalOrganisation1() {
        return new LegalOrganisation1();
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
     * Create an instance of {@link Location1 }
     * 
     * @return
     *     the new instance of {@link Location1 }
     */
    public Location1 createLocation1() {
        return new Location1();
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
     * Create an instance of {@link OrganisationIdentification2 }
     * 
     * @return
     *     the new instance of {@link OrganisationIdentification2 }
     */
    public OrganisationIdentification2 createOrganisationIdentification2() {
        return new OrganisationIdentification2();
    }

    /**
     * Create an instance of {@link OrganisationIdentification6 }
     * 
     * @return
     *     the new instance of {@link OrganisationIdentification6 }
     */
    public OrganisationIdentification6 createOrganisationIdentification6() {
        return new OrganisationIdentification6();
    }

    /**
     * Create an instance of {@link OrganisationIdentification7 }
     * 
     * @return
     *     the new instance of {@link OrganisationIdentification7 }
     */
    public OrganisationIdentification7 createOrganisationIdentification7() {
        return new OrganisationIdentification7();
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
     * Create an instance of {@link OriginalInvoiceInformation1 }
     * 
     * @return
     *     the new instance of {@link OriginalInvoiceInformation1 }
     */
    public OriginalInvoiceInformation1 createOriginalInvoiceInformation1() {
        return new OriginalInvoiceInformation1();
    }

    /**
     * Create an instance of {@link Party10Choice }
     * 
     * @return
     *     the new instance of {@link Party10Choice }
     */
    public Party10Choice createParty10Choice() {
        return new Party10Choice();
    }

    /**
     * Create an instance of {@link Party2Choice }
     * 
     * @return
     *     the new instance of {@link Party2Choice }
     */
    public Party2Choice createParty2Choice() {
        return new Party2Choice();
    }

    /**
     * Create an instance of {@link Party8Choice }
     * 
     * @return
     *     the new instance of {@link Party8Choice }
     */
    public Party8Choice createParty8Choice() {
        return new Party8Choice();
    }

    /**
     * Create an instance of {@link Party9Choice }
     * 
     * @return
     *     the new instance of {@link Party9Choice }
     */
    public Party9Choice createParty9Choice() {
        return new Party9Choice();
    }

    /**
     * Create an instance of {@link PartyIdentification2Choice }
     * 
     * @return
     *     the new instance of {@link PartyIdentification2Choice }
     */
    public PartyIdentification2Choice createPartyIdentification2Choice() {
        return new PartyIdentification2Choice();
    }

    /**
     * Create an instance of {@link PartyIdentification42 }
     * 
     * @return
     *     the new instance of {@link PartyIdentification42 }
     */
    public PartyIdentification42 createPartyIdentification42() {
        return new PartyIdentification42();
    }

    /**
     * Create an instance of {@link PartyIdentification45 }
     * 
     * @return
     *     the new instance of {@link PartyIdentification45 }
     */
    public PartyIdentification45 createPartyIdentification45() {
        return new PartyIdentification45();
    }

    /**
     * Create an instance of {@link PartyIdentification8 }
     * 
     * @return
     *     the new instance of {@link PartyIdentification8 }
     */
    public PartyIdentification8 createPartyIdentification8() {
        return new PartyIdentification8();
    }

    /**
     * Create an instance of {@link PaymentMeans1 }
     * 
     * @return
     *     the new instance of {@link PaymentMeans1 }
     */
    public PaymentMeans1 createPaymentMeans1() {
        return new PaymentMeans1();
    }

    /**
     * Create an instance of {@link PaymentTypeInformation19 }
     * 
     * @return
     *     the new instance of {@link PaymentTypeInformation19 }
     */
    public PaymentTypeInformation19 createPaymentTypeInformation19() {
        return new PaymentTypeInformation19();
    }

    /**
     * Create an instance of {@link PersonIdentification3 }
     * 
     * @return
     *     the new instance of {@link PersonIdentification3 }
     */
    public PersonIdentification3 createPersonIdentification3() {
        return new PersonIdentification3();
    }

    /**
     * Create an instance of {@link PersonIdentification5 }
     * 
     * @return
     *     the new instance of {@link PersonIdentification5 }
     */
    public PersonIdentification5 createPersonIdentification5() {
        return new PersonIdentification5();
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
     * Create an instance of {@link PostalAddress1 }
     * 
     * @return
     *     the new instance of {@link PostalAddress1 }
     */
    public PostalAddress1 createPostalAddress1() {
        return new PostalAddress1();
    }

    /**
     * Create an instance of {@link PostalAddress6 }
     * 
     * @return
     *     the new instance of {@link PostalAddress6 }
     */
    public PostalAddress6 createPostalAddress6() {
        return new PostalAddress6();
    }

    /**
     * Create an instance of {@link QualifiedDocumentInformation1 }
     * 
     * @return
     *     the new instance of {@link QualifiedDocumentInformation1 }
     */
    public QualifiedDocumentInformation1 createQualifiedDocumentInformation1() {
        return new QualifiedDocumentInformation1();
    }

    /**
     * Create an instance of {@link QualifiedPartyAndXMLSignature1 }
     * 
     * @return
     *     the new instance of {@link QualifiedPartyAndXMLSignature1 }
     */
    public QualifiedPartyAndXMLSignature1 createQualifiedPartyAndXMLSignature1() {
        return new QualifiedPartyAndXMLSignature1();
    }

    /**
     * Create an instance of {@link QualifiedPartyIdentification1 }
     * 
     * @return
     *     the new instance of {@link QualifiedPartyIdentification1 }
     */
    public QualifiedPartyIdentification1 createQualifiedPartyIdentification1() {
        return new QualifiedPartyIdentification1();
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
     * Create an instance of {@link SignatureEnvelope }
     * 
     * @return
     *     the new instance of {@link SignatureEnvelope }
     */
    public SignatureEnvelope createSignatureEnvelope() {
        return new SignatureEnvelope();
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
     * Create an instance of {@link SingleQualifiedPartyIdentification1 }
     * 
     * @return
     *     the new instance of {@link SingleQualifiedPartyIdentification1 }
     */
    public SingleQualifiedPartyIdentification1 createSingleQualifiedPartyIdentification1() {
        return new SingleQualifiedPartyIdentification1();
    }

    /**
     * Create an instance of {@link StatusReason4Choice }
     * 
     * @return
     *     the new instance of {@link StatusReason4Choice }
     */
    public StatusReason4Choice createStatusReason4Choice() {
        return new StatusReason4Choice();
    }

    /**
     * Create an instance of {@link StrictPayload }
     * 
     * @return
     *     the new instance of {@link StrictPayload }
     */
    public StrictPayload createStrictPayload() {
        return new StrictPayload();
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
     * Create an instance of {@link TaxExemptionReasonFormatChoice }
     * 
     * @return
     *     the new instance of {@link TaxExemptionReasonFormatChoice }
     */
    public TaxExemptionReasonFormatChoice createTaxExemptionReasonFormatChoice() {
        return new TaxExemptionReasonFormatChoice();
    }

    /**
     * Create an instance of {@link TaxParty3 }
     * 
     * @return
     *     the new instance of {@link TaxParty3 }
     */
    public TaxParty3 createTaxParty3() {
        return new TaxParty3();
    }

    /**
     * Create an instance of {@link TradeMarket1Choice }
     * 
     * @return
     *     the new instance of {@link TradeMarket1Choice }
     */
    public TradeMarket1Choice createTradeMarket1Choice() {
        return new TradeMarket1Choice();
    }

    /**
     * Create an instance of {@link TradeParty1 }
     * 
     * @return
     *     the new instance of {@link TradeParty1 }
     */
    public TradeParty1 createTradeParty1() {
        return new TradeParty1();
    }

    /**
     * Create an instance of {@link ValidationStatusInformation1 }
     * 
     * @return
     *     the new instance of {@link ValidationStatusInformation1 }
     */
    public ValidationStatusInformation1 createValidationStatusInformation1() {
        return new ValidationStatusInformation1();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Document }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Document }{@code >}
     */
    @XmlElementDecl(namespace = "urn:iso:std:iso:20022:tech:xsd:tsin.006.001.01", name = "Document")
    public JAXBElement<Document> createDocument(Document value) {
        return new JAXBElement<>(_Document_QNAME, Document.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Object }{@code >}
     */
    @XmlElementDecl(namespace = "urn:iso:std:iso:20022:tech:xsd:tsin.006.001.01", name = "AckRcvr", scope = FinancingNotificationParties1 .class)
    @XmlIDREF
    public JAXBElement<Object> createFinancingNotificationParties1AckRcvr(Object value) {
        return new JAXBElement<>(_FinancingNotificationParties1AckRcvr_QNAME, Object.class, FinancingNotificationParties1 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Object }{@code >}
     */
    @XmlElementDecl(namespace = "urn:iso:std:iso:20022:tech:xsd:tsin.006.001.01", name = "RltdDoc", scope = FinancingItemList1 .class)
    @XmlIDREF
    public JAXBElement<Object> createFinancingItemList1RltdDoc(Object value) {
        return new JAXBElement<>(_FinancingItemList1RltdDoc_QNAME, Object.class, FinancingItemList1 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Object }{@code >}
     */
    @XmlElementDecl(namespace = "urn:iso:std:iso:20022:tech:xsd:tsin.006.001.01", name = "RltdItm", scope = FinancialItemParameters1 .class)
    @XmlIDREF
    public JAXBElement<Object> createFinancialItemParameters1RltdItm(Object value) {
        return new JAXBElement<>(_FinancialItemParameters1RltdItm_QNAME, Object.class, FinancialItemParameters1 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Object }{@code >}
     */
    @XmlElementDecl(namespace = "urn:iso:std:iso:20022:tech:xsd:tsin.006.001.01", name = "GovngCtrct", scope = FinancialItemParameters1 .class)
    @XmlIDREF
    public JAXBElement<Object> createFinancialItemParameters1GovngCtrct(Object value) {
        return new JAXBElement<>(_FinancialItemParameters1GovngCtrct_QNAME, Object.class, FinancialItemParameters1 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Object }{@code >}
     */
    @XmlElementDecl(namespace = "urn:iso:std:iso:20022:tech:xsd:tsin.006.001.01", name = "FinDocRef", scope = FinancialItem1 .class)
    @XmlIDREF
    public JAXBElement<Object> createFinancialItem1FinDocRef(Object value) {
        return new JAXBElement<>(_FinancialItem1FinDocRef_QNAME, Object.class, FinancialItem1 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Object }{@code >}
     */
    @XmlElementDecl(namespace = "urn:iso:std:iso:20022:tech:xsd:tsin.006.001.01", name = "AssoctdDoc", scope = FinancialItem1 .class)
    @XmlIDREF
    public JAXBElement<Object> createFinancialItem1AssoctdDoc(Object value) {
        return new JAXBElement<>(_FinancialItem1AssoctdDoc_QNAME, Object.class, FinancialItem1 .class, value);
    }

}
