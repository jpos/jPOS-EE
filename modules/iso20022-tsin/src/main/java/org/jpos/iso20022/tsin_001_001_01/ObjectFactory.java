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

package org.jpos.iso20022.tsin_001_001_01;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.jpos.iso20022.tsin_001_001_01 package. 
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

    private static final QName _Document_QNAME = new QName("urn:iso:std:iso:20022:tech:xsd:tsin.001.001.01", "Document");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.jpos.iso20022.tsin_001_001_01
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
     * Create an instance of {@link ActiveCurrencyAndAmount }
     * 
     * @return
     *     the new instance of {@link ActiveCurrencyAndAmount }
     */
    public ActiveCurrencyAndAmount createActiveCurrencyAndAmount() {
        return new ActiveCurrencyAndAmount();
    }

    /**
     * Create an instance of {@link AdditionalInformation1 }
     * 
     * @return
     *     the new instance of {@link AdditionalInformation1 }
     */
    public AdditionalInformation1 createAdditionalInformation1() {
        return new AdditionalInformation1();
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
     * Create an instance of {@link AgreementClauses1 }
     * 
     * @return
     *     the new instance of {@link AgreementClauses1 }
     */
    public AgreementClauses1 createAgreementClauses1() {
        return new AgreementClauses1();
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
     * Create an instance of {@link ClearingSystemMemberIdentification2Choice }
     * 
     * @return
     *     the new instance of {@link ClearingSystemMemberIdentification2Choice }
     */
    public ClearingSystemMemberIdentification2Choice createClearingSystemMemberIdentification2Choice() {
        return new ClearingSystemMemberIdentification2Choice();
    }

    /**
     * Create an instance of {@link ContactIdentification1 }
     * 
     * @return
     *     the new instance of {@link ContactIdentification1 }
     */
    public ContactIdentification1 createContactIdentification1() {
        return new ContactIdentification1();
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
     * Create an instance of {@link DocumentGeneralInformation1 }
     * 
     * @return
     *     the new instance of {@link DocumentGeneralInformation1 }
     */
    public DocumentGeneralInformation1 createDocumentGeneralInformation1() {
        return new DocumentGeneralInformation1();
    }

    /**
     * Create an instance of {@link FinancialInstitutionIdentification6 }
     * 
     * @return
     *     the new instance of {@link FinancialInstitutionIdentification6 }
     */
    public FinancialInstitutionIdentification6 createFinancialInstitutionIdentification6() {
        return new FinancialInstitutionIdentification6();
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
     * Create an instance of {@link InformationType1Choice }
     * 
     * @return
     *     the new instance of {@link InformationType1Choice }
     */
    public InformationType1Choice createInformationType1Choice() {
        return new InformationType1Choice();
    }

    /**
     * Create an instance of {@link Instalment1 }
     * 
     * @return
     *     the new instance of {@link Instalment1 }
     */
    public Instalment1 createInstalment1() {
        return new Instalment1();
    }

    /**
     * Create an instance of {@link InvoiceFinancingRequestV01 }
     * 
     * @return
     *     the new instance of {@link InvoiceFinancingRequestV01 }
     */
    public InvoiceFinancingRequestV01 createInvoiceFinancingRequestV01() {
        return new InvoiceFinancingRequestV01();
    }

    /**
     * Create an instance of {@link InvoiceRequestInformation1 }
     * 
     * @return
     *     the new instance of {@link InvoiceRequestInformation1 }
     */
    public InvoiceRequestInformation1 createInvoiceRequestInformation1() {
        return new InvoiceRequestInformation1();
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
     * Create an instance of {@link OrganisationIdentification2 }
     * 
     * @return
     *     the new instance of {@link OrganisationIdentification2 }
     */
    public OrganisationIdentification2 createOrganisationIdentification2() {
        return new OrganisationIdentification2();
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
     * Create an instance of {@link PartyAndAccountIdentificationAndContactInformation1 }
     * 
     * @return
     *     the new instance of {@link PartyAndAccountIdentificationAndContactInformation1 }
     */
    public PartyAndAccountIdentificationAndContactInformation1 createPartyAndAccountIdentificationAndContactInformation1() {
        return new PartyAndAccountIdentificationAndContactInformation1();
    }

    /**
     * Create an instance of {@link PartyIdentification25 }
     * 
     * @return
     *     the new instance of {@link PartyIdentification25 }
     */
    public PartyIdentification25 createPartyIdentification25() {
        return new PartyIdentification25();
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
     * Create an instance of {@link PartyIdentificationAndAccount6 }
     * 
     * @return
     *     the new instance of {@link PartyIdentificationAndAccount6 }
     */
    public PartyIdentificationAndAccount6 createPartyIdentificationAndAccount6() {
        return new PartyIdentificationAndAccount6();
    }

    /**
     * Create an instance of {@link PartyIdentificationAndContactInformation1 }
     * 
     * @return
     *     the new instance of {@link PartyIdentificationAndContactInformation1 }
     */
    public PartyIdentificationAndContactInformation1 createPartyIdentificationAndContactInformation1() {
        return new PartyIdentificationAndContactInformation1();
    }

    /**
     * Create an instance of {@link PaymentInformation15 }
     * 
     * @return
     *     the new instance of {@link PaymentInformation15 }
     */
    public PaymentInformation15 createPaymentInformation15() {
        return new PaymentInformation15();
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
     * Create an instance of {@link PostalAddress1 }
     * 
     * @return
     *     the new instance of {@link PostalAddress1 }
     */
    public PostalAddress1 createPostalAddress1() {
        return new PostalAddress1();
    }

    /**
     * Create an instance of {@link ReferredDocumentInformation2 }
     * 
     * @return
     *     the new instance of {@link ReferredDocumentInformation2 }
     */
    public ReferredDocumentInformation2 createReferredDocumentInformation2() {
        return new ReferredDocumentInformation2();
    }

    /**
     * Create an instance of {@link ReferredDocumentType1 }
     * 
     * @return
     *     the new instance of {@link ReferredDocumentType1 }
     */
    public ReferredDocumentType1 createReferredDocumentType1() {
        return new ReferredDocumentType1();
    }

    /**
     * Create an instance of {@link RequestGroupInformation1 }
     * 
     * @return
     *     the new instance of {@link RequestGroupInformation1 }
     */
    public RequestGroupInformation1 createRequestGroupInformation1() {
        return new RequestGroupInformation1();
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
     * Create an instance of {@link JAXBElement }{@code <}{@link Document }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Document }{@code >}
     */
    @XmlElementDecl(namespace = "urn:iso:std:iso:20022:tech:xsd:tsin.001.001.01", name = "Document")
    public JAXBElement<Document> createDocument(Document value) {
        return new JAXBElement<>(_Document_QNAME, Document.class, null, value);
    }

}
