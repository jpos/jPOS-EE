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

package org.jpos.iso20022.tsmt_055_001_01;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlIDREF;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.jpos.iso20022.tsmt_055_001_01 package. 
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

    private static final QName _Document_QNAME = new QName("urn:iso:std:iso:20022:tech:xsd:tsmt.055.001.01", "Document");
    private static final QName _EventDescription1OthrPty_QNAME = new QName("urn:iso:std:iso:20022:tech:xsd:tsmt.055.001.01", "OthrPty");
    private static final QName _EventDescription1RltdDoc_QNAME = new QName("urn:iso:std:iso:20022:tech:xsd:tsmt.055.001.01", "RltdDoc");
    private static final QName _EventDescription1RltdLttr_QNAME = new QName("urn:iso:std:iso:20022:tech:xsd:tsmt.055.001.01", "RltdLttr");
    private static final QName _EventDescription1RltdMsg_QNAME = new QName("urn:iso:std:iso:20022:tech:xsd:tsmt.055.001.01", "RltdMsg");
    private static final QName _EventDescription1AssoctdDoc_QNAME = new QName("urn:iso:std:iso:20022:tech:xsd:tsmt.055.001.01", "AssoctdDoc");
    private static final QName _EventDescription1GovngCtrct_QNAME = new QName("urn:iso:std:iso:20022:tech:xsd:tsmt.055.001.01", "GovngCtrct");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.jpos.iso20022.tsmt_055_001_01
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
     * Create an instance of {@link EventDescription1 }
     * 
     * @return
     *     the new instance of {@link EventDescription1 }
     */
    public EventDescription1 createEventDescription1() {
        return new EventDescription1();
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
     * Create an instance of {@link FinancialInstitutionIdentification8 }
     * 
     * @return
     *     the new instance of {@link FinancialInstitutionIdentification8 }
     */
    public FinancialInstitutionIdentification8 createFinancialInstitutionIdentification8() {
        return new FinancialInstitutionIdentification8();
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
     * Create an instance of {@link LegalOrganisation1 }
     * 
     * @return
     *     the new instance of {@link LegalOrganisation1 }
     */
    public LegalOrganisation1 createLegalOrganisation1() {
        return new LegalOrganisation1();
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
     * Create an instance of {@link Party10Choice }
     * 
     * @return
     *     the new instance of {@link Party10Choice }
     */
    public Party10Choice createParty10Choice() {
        return new Party10Choice();
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
     * Create an instance of {@link PartyEventAdviceV01 }
     * 
     * @return
     *     the new instance of {@link PartyEventAdviceV01 }
     */
    public PartyEventAdviceV01 createPartyEventAdviceV01() {
        return new PartyEventAdviceV01();
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
     * Create an instance of {@link SignatureEnvelope }
     * 
     * @return
     *     the new instance of {@link SignatureEnvelope }
     */
    public SignatureEnvelope createSignatureEnvelope() {
        return new SignatureEnvelope();
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
    @XmlElementDecl(namespace = "urn:iso:std:iso:20022:tech:xsd:tsmt.055.001.01", name = "Document")
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
    @XmlElementDecl(namespace = "urn:iso:std:iso:20022:tech:xsd:tsmt.055.001.01", name = "OthrPty", scope = EventDescription1 .class)
    @XmlIDREF
    public JAXBElement<Object> createEventDescription1OthrPty(Object value) {
        return new JAXBElement<>(_EventDescription1OthrPty_QNAME, Object.class, EventDescription1 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Object }{@code >}
     */
    @XmlElementDecl(namespace = "urn:iso:std:iso:20022:tech:xsd:tsmt.055.001.01", name = "RltdDoc", scope = EventDescription1 .class)
    @XmlIDREF
    public JAXBElement<Object> createEventDescription1RltdDoc(Object value) {
        return new JAXBElement<>(_EventDescription1RltdDoc_QNAME, Object.class, EventDescription1 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Object }{@code >}
     */
    @XmlElementDecl(namespace = "urn:iso:std:iso:20022:tech:xsd:tsmt.055.001.01", name = "RltdLttr", scope = EventDescription1 .class)
    @XmlIDREF
    public JAXBElement<Object> createEventDescription1RltdLttr(Object value) {
        return new JAXBElement<>(_EventDescription1RltdLttr_QNAME, Object.class, EventDescription1 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Object }{@code >}
     */
    @XmlElementDecl(namespace = "urn:iso:std:iso:20022:tech:xsd:tsmt.055.001.01", name = "RltdMsg", scope = EventDescription1 .class)
    @XmlIDREF
    public JAXBElement<Object> createEventDescription1RltdMsg(Object value) {
        return new JAXBElement<>(_EventDescription1RltdMsg_QNAME, Object.class, EventDescription1 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Object }{@code >}
     */
    @XmlElementDecl(namespace = "urn:iso:std:iso:20022:tech:xsd:tsmt.055.001.01", name = "AssoctdDoc", scope = EventDescription1 .class)
    @XmlIDREF
    public JAXBElement<Object> createEventDescription1AssoctdDoc(Object value) {
        return new JAXBElement<>(_EventDescription1AssoctdDoc_QNAME, Object.class, EventDescription1 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Object }{@code >}
     */
    @XmlElementDecl(namespace = "urn:iso:std:iso:20022:tech:xsd:tsmt.055.001.01", name = "GovngCtrct", scope = EventDescription1 .class)
    @XmlIDREF
    public JAXBElement<Object> createEventDescription1GovngCtrct(Object value) {
        return new JAXBElement<>(_EventDescription1GovngCtrct_QNAME, Object.class, EventDescription1 .class, value);
    }

}
