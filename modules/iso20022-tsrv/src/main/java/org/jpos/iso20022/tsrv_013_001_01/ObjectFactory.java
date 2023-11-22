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

package org.jpos.iso20022.tsrv_013_001_01;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.jpos.iso20022.tsrv_013_001_01 package. 
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

    private static final QName _Document_QNAME = new QName("urn:iso:std:iso:20022:tech:xsd:tsrv.013.001.01", "Document");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.jpos.iso20022.tsrv_013_001_01
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
     * Create an instance of {@link CashAccount27 }
     * 
     * @return
     *     the new instance of {@link CashAccount27 }
     */
    public CashAccount27 createCashAccount27() {
        return new CashAccount27();
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
     * Create an instance of {@link DateAndPlaceOfBirth }
     * 
     * @return
     *     the new instance of {@link DateAndPlaceOfBirth }
     */
    public DateAndPlaceOfBirth createDateAndPlaceOfBirth() {
        return new DateAndPlaceOfBirth();
    }

    /**
     * Create an instance of {@link Demand1 }
     * 
     * @return
     *     the new instance of {@link Demand1 }
     */
    public Demand1 createDemand1() {
        return new Demand1();
    }

    /**
     * Create an instance of {@link DemandDocumentation1 }
     * 
     * @return
     *     the new instance of {@link DemandDocumentation1 }
     */
    public DemandDocumentation1 createDemandDocumentation1() {
        return new DemandDocumentation1();
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
     * Create an instance of {@link OrganisationIdentification6 }
     * 
     * @return
     *     the new instance of {@link OrganisationIdentification6 }
     */
    public OrganisationIdentification6 createOrganisationIdentification6() {
        return new OrganisationIdentification6();
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
     * Create an instance of {@link Party8Choice }
     * 
     * @return
     *     the new instance of {@link Party8Choice }
     */
    public Party8Choice createParty8Choice() {
        return new Party8Choice();
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
     * Create an instance of {@link PartyIdentification41 }
     * 
     * @return
     *     the new instance of {@link PartyIdentification41 }
     */
    public PartyIdentification41 createPartyIdentification41() {
        return new PartyIdentification41();
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
     * Create an instance of {@link Presentation2 }
     * 
     * @return
     *     the new instance of {@link Presentation2 }
     */
    public Presentation2 createPresentation2() {
        return new Presentation2();
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
     * Create an instance of {@link Undertaking6 }
     * 
     * @return
     *     the new instance of {@link Undertaking6 }
     */
    public Undertaking6 createUndertaking6() {
        return new Undertaking6();
    }

    /**
     * Create an instance of {@link UndertakingAmount3 }
     * 
     * @return
     *     the new instance of {@link UndertakingAmount3 }
     */
    public UndertakingAmount3 createUndertakingAmount3() {
        return new UndertakingAmount3();
    }

    /**
     * Create an instance of {@link UndertakingDemandV01 }
     * 
     * @return
     *     the new instance of {@link UndertakingDemandV01 }
     */
    public UndertakingDemandV01 createUndertakingDemandV01() {
        return new UndertakingDemandV01();
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
     * Create an instance of {@link JAXBElement }{@code <}{@link Document }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Document }{@code >}
     */
    @XmlElementDecl(namespace = "urn:iso:std:iso:20022:tech:xsd:tsrv.013.001.01", name = "Document")
    public JAXBElement<Document> createDocument(Document value) {
        return new JAXBElement<>(_Document_QNAME, Document.class, null, value);
    }

}
