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

package org.jpos.iso20022.tsrv_004_001_01;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.jpos.iso20022.tsrv_004_001_01 package. 
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

    private static final QName _Document_QNAME = new QName("urn:iso:std:iso:20022:tech:xsd:tsrv.004.001.01", "Document");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.jpos.iso20022.tsrv_004_001_01
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
     * Create an instance of {@link AddressOrParty1Choice }
     * 
     * @return
     *     the new instance of {@link AddressOrParty1Choice }
     */
    public AddressOrParty1Choice createAddressOrParty1Choice() {
        return new AddressOrParty1Choice();
    }

    /**
     * Create an instance of {@link Amendment3 }
     * 
     * @return
     *     the new instance of {@link Amendment3 }
     */
    public Amendment3 createAmendment3() {
        return new Amendment3();
    }

    /**
     * Create an instance of {@link Amount1Choice }
     * 
     * @return
     *     the new instance of {@link Amount1Choice }
     */
    public Amount1Choice createAmount1Choice() {
        return new Amount1Choice();
    }

    /**
     * Create an instance of {@link AutoExtend1Choice }
     * 
     * @return
     *     the new instance of {@link AutoExtend1Choice }
     */
    public AutoExtend1Choice createAutoExtend1Choice() {
        return new AutoExtend1Choice();
    }

    /**
     * Create an instance of {@link AutoExtension1 }
     * 
     * @return
     *     the new instance of {@link AutoExtension1 }
     */
    public AutoExtension1 createAutoExtension1() {
        return new AutoExtension1();
    }

    /**
     * Create an instance of {@link Beneficiary1 }
     * 
     * @return
     *     the new instance of {@link Beneficiary1 }
     */
    public Beneficiary1 createBeneficiary1() {
        return new Beneficiary1();
    }

    /**
     * Create an instance of {@link CommunicationChannel1 }
     * 
     * @return
     *     the new instance of {@link CommunicationChannel1 }
     */
    public CommunicationChannel1 createCommunicationChannel1() {
        return new CommunicationChannel1();
    }

    /**
     * Create an instance of {@link CommunicationMethod1Choice }
     * 
     * @return
     *     the new instance of {@link CommunicationMethod1Choice }
     */
    public CommunicationMethod1Choice createCommunicationMethod1Choice() {
        return new CommunicationMethod1Choice();
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
     * Create an instance of {@link DateAndDateTimeChoice }
     * 
     * @return
     *     the new instance of {@link DateAndDateTimeChoice }
     */
    public DateAndDateTimeChoice createDateAndDateTimeChoice() {
        return new DateAndDateTimeChoice();
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
     * Create an instance of {@link Document9 }
     * 
     * @return
     *     the new instance of {@link Document9 }
     */
    public Document9 createDocument9() {
        return new Document9();
    }

    /**
     * Create an instance of {@link DocumentFormat1Choice }
     * 
     * @return
     *     the new instance of {@link DocumentFormat1Choice }
     */
    public DocumentFormat1Choice createDocumentFormat1Choice() {
        return new DocumentFormat1Choice();
    }

    /**
     * Create an instance of {@link ExpiryDetails1 }
     * 
     * @return
     *     the new instance of {@link ExpiryDetails1 }
     */
    public ExpiryDetails1 createExpiryDetails1() {
        return new ExpiryDetails1();
    }

    /**
     * Create an instance of {@link ExpiryDetails2 }
     * 
     * @return
     *     the new instance of {@link ExpiryDetails2 }
     */
    public ExpiryDetails2 createExpiryDetails2() {
        return new ExpiryDetails2();
    }

    /**
     * Create an instance of {@link ExpiryTerms1 }
     * 
     * @return
     *     the new instance of {@link ExpiryTerms1 }
     */
    public ExpiryTerms1 createExpiryTerms1() {
        return new ExpiryTerms1();
    }

    /**
     * Create an instance of {@link ExpiryTerms2 }
     * 
     * @return
     *     the new instance of {@link ExpiryTerms2 }
     */
    public ExpiryTerms2 createExpiryTerms2() {
        return new ExpiryTerms2();
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
     * Create an instance of {@link NameAndAddress10 }
     * 
     * @return
     *     the new instance of {@link NameAndAddress10 }
     */
    public NameAndAddress10 createNameAndAddress10() {
        return new NameAndAddress10();
    }

    /**
     * Create an instance of {@link Narrative1 }
     * 
     * @return
     *     the new instance of {@link Narrative1 }
     */
    public Narrative1 createNarrative1() {
        return new Narrative1();
    }

    /**
     * Create an instance of {@link NarrativeType1Choice }
     * 
     * @return
     *     the new instance of {@link NarrativeType1Choice }
     */
    public NarrativeType1Choice createNarrativeType1Choice() {
        return new NarrativeType1Choice();
    }

    /**
     * Create an instance of {@link NonExtension1 }
     * 
     * @return
     *     the new instance of {@link NonExtension1 }
     */
    public NonExtension1 createNonExtension1() {
        return new NonExtension1();
    }

    /**
     * Create an instance of {@link OrganisationIdentification8 }
     * 
     * @return
     *     the new instance of {@link OrganisationIdentification8 }
     */
    public OrganisationIdentification8 createOrganisationIdentification8() {
        return new OrganisationIdentification8();
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
     * Create an instance of {@link Party11Choice }
     * 
     * @return
     *     the new instance of {@link Party11Choice }
     */
    public Party11Choice createParty11Choice() {
        return new Party11Choice();
    }

    /**
     * Create an instance of {@link PartyAndSignature2 }
     * 
     * @return
     *     the new instance of {@link PartyAndSignature2 }
     */
    public PartyAndSignature2 createPartyAndSignature2() {
        return new PartyAndSignature2();
    }

    /**
     * Create an instance of {@link PartyIdentification43 }
     * 
     * @return
     *     the new instance of {@link PartyIdentification43 }
     */
    public PartyIdentification43 createPartyIdentification43() {
        return new PartyIdentification43();
    }

    /**
     * Create an instance of {@link PartyType1Choice }
     * 
     * @return
     *     the new instance of {@link PartyType1Choice }
     */
    public PartyType1Choice createPartyType1Choice() {
        return new PartyType1Choice();
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
     * Create an instance of {@link PostalAddress6 }
     * 
     * @return
     *     the new instance of {@link PostalAddress6 }
     */
    public PostalAddress6 createPostalAddress6() {
        return new PostalAddress6();
    }

    /**
     * Create an instance of {@link ProprietaryData3 }
     * 
     * @return
     *     the new instance of {@link ProprietaryData3 }
     */
    public ProprietaryData3 createProprietaryData3() {
        return new ProprietaryData3();
    }

    /**
     * Create an instance of {@link TerminationReason1Choice }
     * 
     * @return
     *     the new instance of {@link TerminationReason1Choice }
     */
    public TerminationReason1Choice createTerminationReason1Choice() {
        return new TerminationReason1Choice();
    }

    /**
     * Create an instance of {@link Undertaking10 }
     * 
     * @return
     *     the new instance of {@link Undertaking10 }
     */
    public Undertaking10 createUndertaking10() {
        return new Undertaking10();
    }

    /**
     * Create an instance of {@link Undertaking9 }
     * 
     * @return
     *     the new instance of {@link Undertaking9 }
     */
    public Undertaking9 createUndertaking9() {
        return new Undertaking9();
    }

    /**
     * Create an instance of {@link UndertakingAmendmentRequestV01 }
     * 
     * @return
     *     the new instance of {@link UndertakingAmendmentRequestV01 }
     */
    public UndertakingAmendmentRequestV01 createUndertakingAmendmentRequestV01() {
        return new UndertakingAmendmentRequestV01();
    }

    /**
     * Create an instance of {@link UndertakingAmount2 }
     * 
     * @return
     *     the new instance of {@link UndertakingAmount2 }
     */
    public UndertakingAmount2 createUndertakingAmount2() {
        return new UndertakingAmount2();
    }

    /**
     * Create an instance of {@link UndertakingDocumentType1Choice }
     * 
     * @return
     *     the new instance of {@link UndertakingDocumentType1Choice }
     */
    public UndertakingDocumentType1Choice createUndertakingDocumentType1Choice() {
        return new UndertakingDocumentType1Choice();
    }

    /**
     * Create an instance of {@link UndertakingTermination3 }
     * 
     * @return
     *     the new instance of {@link UndertakingTermination3 }
     */
    public UndertakingTermination3 createUndertakingTermination3() {
        return new UndertakingTermination3();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Document }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Document }{@code >}
     */
    @XmlElementDecl(namespace = "urn:iso:std:iso:20022:tech:xsd:tsrv.004.001.01", name = "Document")
    public JAXBElement<Document> createDocument(Document value) {
        return new JAXBElement<>(_Document_QNAME, Document.class, null, value);
    }

}
