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

package org.jpos.iso20022.tsrv_001_001_01;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.jpos.iso20022.tsrv_001_001_01 package. 
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

    private static final QName _Document_QNAME = new QName("urn:iso:std:iso:20022:tech:xsd:tsrv.001.001.01", "Document");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.jpos.iso20022.tsrv_001_001_01
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
     * Create an instance of {@link AmountAndTrigger1 }
     * 
     * @return
     *     the new instance of {@link AmountAndTrigger1 }
     */
    public AmountAndTrigger1 createAmountAndTrigger1() {
        return new AmountAndTrigger1();
    }

    /**
     * Create an instance of {@link AmountOrPercentage1Choice }
     * 
     * @return
     *     the new instance of {@link AmountOrPercentage1Choice }
     */
    public AmountOrPercentage1Choice createAmountOrPercentage1Choice() {
        return new AmountOrPercentage1Choice();
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
     * Create an instance of {@link AutomaticVariation1 }
     * 
     * @return
     *     the new instance of {@link AutomaticVariation1 }
     */
    public AutomaticVariation1 createAutomaticVariation1() {
        return new AutomaticVariation1();
    }

    /**
     * Create an instance of {@link Channel1Choice }
     * 
     * @return
     *     the new instance of {@link Channel1Choice }
     */
    public Channel1Choice createChannel1Choice() {
        return new Channel1Choice();
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
     * Create an instance of {@link CountrySubdivision1Choice }
     * 
     * @return
     *     the new instance of {@link CountrySubdivision1Choice }
     */
    public CountrySubdivision1Choice createCountrySubdivision1Choice() {
        return new CountrySubdivision1Choice();
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
     * Create an instance of {@link DateInformation1 }
     * 
     * @return
     *     the new instance of {@link DateInformation1 }
     */
    public DateInformation1 createDateInformation1() {
        return new DateInformation1();
    }

    /**
     * Create an instance of {@link Document10 }
     * 
     * @return
     *     the new instance of {@link Document10 }
     */
    public Document10 createDocument10() {
        return new Document10();
    }

    /**
     * Create an instance of {@link Document8 }
     * 
     * @return
     *     the new instance of {@link Document8 }
     */
    public Document8 createDocument8() {
        return new Document8();
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
     * Create an instance of {@link ExpiryTerms1 }
     * 
     * @return
     *     the new instance of {@link ExpiryTerms1 }
     */
    public ExpiryTerms1 createExpiryTerms1() {
        return new ExpiryTerms1();
    }

    /**
     * Create an instance of {@link FixedOrRecurrentDate1Choice }
     * 
     * @return
     *     the new instance of {@link FixedOrRecurrentDate1Choice }
     */
    public FixedOrRecurrentDate1Choice createFixedOrRecurrentDate1Choice() {
        return new FixedOrRecurrentDate1Choice();
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
     * Create an instance of {@link GovernanceRules1 }
     * 
     * @return
     *     the new instance of {@link GovernanceRules1 }
     */
    public GovernanceRules1 createGovernanceRules1() {
        return new GovernanceRules1();
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
     * Create an instance of {@link ModelFormIdentification1 }
     * 
     * @return
     *     the new instance of {@link ModelFormIdentification1 }
     */
    public ModelFormIdentification1 createModelFormIdentification1() {
        return new ModelFormIdentification1();
    }

    /**
     * Create an instance of {@link ModelFormIdentification1Choice }
     * 
     * @return
     *     the new instance of {@link ModelFormIdentification1Choice }
     */
    public ModelFormIdentification1Choice createModelFormIdentification1Choice() {
        return new ModelFormIdentification1Choice();
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
     * Create an instance of {@link PartyAndType1 }
     * 
     * @return
     *     the new instance of {@link PartyAndType1 }
     */
    public PartyAndType1 createPartyAndType1() {
        return new PartyAndType1();
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
     * Create an instance of {@link Percentage1 }
     * 
     * @return
     *     the new instance of {@link Percentage1 }
     */
    public Percentage1 createPercentage1() {
        return new Percentage1();
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
     * Create an instance of {@link PlaceOfPresentation1 }
     * 
     * @return
     *     the new instance of {@link PlaceOfPresentation1 }
     */
    public PlaceOfPresentation1 createPlaceOfPresentation1() {
        return new PlaceOfPresentation1();
    }

    /**
     * Create an instance of {@link PlaceOrUnderConfirmationChoice1 }
     * 
     * @return
     *     the new instance of {@link PlaceOrUnderConfirmationChoice1 }
     */
    public PlaceOrUnderConfirmationChoice1 createPlaceOrUnderConfirmationChoice1() {
        return new PlaceOrUnderConfirmationChoice1();
    }

    /**
     * Create an instance of {@link PostalAddress12 }
     * 
     * @return
     *     the new instance of {@link PostalAddress12 }
     */
    public PostalAddress12 createPostalAddress12() {
        return new PostalAddress12();
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
     * Create an instance of {@link Presentation1 }
     * 
     * @return
     *     the new instance of {@link Presentation1 }
     */
    public Presentation1 createPresentation1() {
        return new Presentation1();
    }

    /**
     * Create an instance of {@link Presentation3 }
     * 
     * @return
     *     the new instance of {@link Presentation3 }
     */
    public Presentation3 createPresentation3() {
        return new Presentation3();
    }

    /**
     * Create an instance of {@link PresentationDocumentFormat1Choice }
     * 
     * @return
     *     the new instance of {@link PresentationDocumentFormat1Choice }
     */
    public PresentationDocumentFormat1Choice createPresentationDocumentFormat1Choice() {
        return new PresentationDocumentFormat1Choice();
    }

    /**
     * Create an instance of {@link PresentationMedium1Choice }
     * 
     * @return
     *     the new instance of {@link PresentationMedium1Choice }
     */
    public PresentationMedium1Choice createPresentationMedium1Choice() {
        return new PresentationMedium1Choice();
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
     * Create an instance of {@link Trigger1 }
     * 
     * @return
     *     the new instance of {@link Trigger1 }
     */
    public Trigger1 createTrigger1() {
        return new Trigger1();
    }

    /**
     * Create an instance of {@link UnderlyingTradeTransaction1 }
     * 
     * @return
     *     the new instance of {@link UnderlyingTradeTransaction1 }
     */
    public UnderlyingTradeTransaction1 createUnderlyingTradeTransaction1() {
        return new UnderlyingTradeTransaction1();
    }

    /**
     * Create an instance of {@link UnderlyingTradeTransactionType1Choice }
     * 
     * @return
     *     the new instance of {@link UnderlyingTradeTransactionType1Choice }
     */
    public UnderlyingTradeTransactionType1Choice createUnderlyingTradeTransactionType1Choice() {
        return new UnderlyingTradeTransactionType1Choice();
    }

    /**
     * Create an instance of {@link Undertaking3 }
     * 
     * @return
     *     the new instance of {@link Undertaking3 }
     */
    public Undertaking3 createUndertaking3() {
        return new Undertaking3();
    }

    /**
     * Create an instance of {@link Undertaking4 }
     * 
     * @return
     *     the new instance of {@link Undertaking4 }
     */
    public Undertaking4 createUndertaking4() {
        return new Undertaking4();
    }

    /**
     * Create an instance of {@link UndertakingAmount1 }
     * 
     * @return
     *     the new instance of {@link UndertakingAmount1 }
     */
    public UndertakingAmount1 createUndertakingAmount1() {
        return new UndertakingAmount1();
    }

    /**
     * Create an instance of {@link UndertakingAmount4 }
     * 
     * @return
     *     the new instance of {@link UndertakingAmount4 }
     */
    public UndertakingAmount4 createUndertakingAmount4() {
        return new UndertakingAmount4();
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
     * Create an instance of {@link UndertakingDocumentType2Choice }
     * 
     * @return
     *     the new instance of {@link UndertakingDocumentType2Choice }
     */
    public UndertakingDocumentType2Choice createUndertakingDocumentType2Choice() {
        return new UndertakingDocumentType2Choice();
    }

    /**
     * Create an instance of {@link UndertakingIssuanceV01 }
     * 
     * @return
     *     the new instance of {@link UndertakingIssuanceV01 }
     */
    public UndertakingIssuanceV01 createUndertakingIssuanceV01() {
        return new UndertakingIssuanceV01();
    }

    /**
     * Create an instance of {@link UndertakingType1Choice }
     * 
     * @return
     *     the new instance of {@link UndertakingType1Choice }
     */
    public UndertakingType1Choice createUndertakingType1Choice() {
        return new UndertakingType1Choice();
    }

    /**
     * Create an instance of {@link UndertakingWording1 }
     * 
     * @return
     *     the new instance of {@link UndertakingWording1 }
     */
    public UndertakingWording1 createUndertakingWording1() {
        return new UndertakingWording1();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Document }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Document }{@code >}
     */
    @XmlElementDecl(namespace = "urn:iso:std:iso:20022:tech:xsd:tsrv.001.001.01", name = "Document")
    public JAXBElement<Document> createDocument(Document value) {
        return new JAXBElement<>(_Document_QNAME, Document.class, null, value);
    }

}
