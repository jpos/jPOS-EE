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

package org.jpos.iso20022.auth_034_001_01;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.jpos.iso20022.auth_034_001_01 package. 
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

    private static final QName _Document_QNAME = new QName("urn:iso:std:iso:20022:tech:xsd:auth.034.001.01", "Document");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.jpos.iso20022.auth_034_001_01
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
     * Create an instance of {@link AdditionalInformation1 }
     * 
     * @return
     *     the new instance of {@link AdditionalInformation1 }
     */
    public AdditionalInformation1 createAdditionalInformation1() {
        return new AdditionalInformation1();
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
     * Create an instance of {@link ContactDetails2 }
     * 
     * @return
     *     the new instance of {@link ContactDetails2 }
     */
    public ContactDetails2 createContactDetails2() {
        return new ContactDetails2();
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
     * Create an instance of {@link CurrencyAndAmount }
     * 
     * @return
     *     the new instance of {@link CurrencyAndAmount }
     */
    public CurrencyAndAmount createCurrencyAndAmount() {
        return new CurrencyAndAmount();
    }

    /**
     * Create an instance of {@link CurrencyReference3 }
     * 
     * @return
     *     the new instance of {@link CurrencyReference3 }
     */
    public CurrencyReference3 createCurrencyReference3() {
        return new CurrencyReference3();
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
     * Create an instance of {@link DocumentGeneralInformation2 }
     * 
     * @return
     *     the new instance of {@link DocumentGeneralInformation2 }
     */
    public DocumentGeneralInformation2 createDocumentGeneralInformation2() {
        return new DocumentGeneralInformation2();
    }

    /**
     * Create an instance of {@link EarlyPayment1 }
     * 
     * @return
     *     the new instance of {@link EarlyPayment1 }
     */
    public EarlyPayment1 createEarlyPayment1() {
        return new EarlyPayment1();
    }

    /**
     * Create an instance of {@link EarlyPaymentsVAT1 }
     * 
     * @return
     *     the new instance of {@link EarlyPaymentsVAT1 }
     */
    public EarlyPaymentsVAT1 createEarlyPaymentsVAT1() {
        return new EarlyPaymentsVAT1();
    }

    /**
     * Create an instance of {@link ExchangeRateInformation1 }
     * 
     * @return
     *     the new instance of {@link ExchangeRateInformation1 }
     */
    public ExchangeRateInformation1 createExchangeRateInformation1() {
        return new ExchangeRateInformation1();
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
     * Create an instance of {@link GroupHeader69 }
     * 
     * @return
     *     the new instance of {@link GroupHeader69 }
     */
    public GroupHeader69 createGroupHeader69() {
        return new GroupHeader69();
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
     * Create an instance of {@link InvoiceTaxReportV01 }
     * 
     * @return
     *     the new instance of {@link InvoiceTaxReportV01 }
     */
    public InvoiceTaxReportV01 createInvoiceTaxReportV01() {
        return new InvoiceTaxReportV01();
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
     * Create an instance of {@link MessageIdentification1 }
     * 
     * @return
     *     the new instance of {@link MessageIdentification1 }
     */
    public MessageIdentification1 createMessageIdentification1() {
        return new MessageIdentification1();
    }

    /**
     * Create an instance of {@link OrganisationIdentification28 }
     * 
     * @return
     *     the new instance of {@link OrganisationIdentification28 }
     */
    public OrganisationIdentification28 createOrganisationIdentification28() {
        return new OrganisationIdentification28();
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
     * Create an instance of {@link PartyIdentification116 }
     * 
     * @return
     *     the new instance of {@link PartyIdentification116 }
     */
    public PartyIdentification116 createPartyIdentification116() {
        return new PartyIdentification116();
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
     * Create an instance of {@link PartyIdentification72 }
     * 
     * @return
     *     the new instance of {@link PartyIdentification72 }
     */
    public PartyIdentification72 createPartyIdentification72() {
        return new PartyIdentification72();
    }

    /**
     * Create an instance of {@link Period2 }
     * 
     * @return
     *     the new instance of {@link Period2 }
     */
    public Period2 createPeriod2() {
        return new Period2();
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
     * Create an instance of {@link SettlementSubTotalCalculatedTax2 }
     * 
     * @return
     *     the new instance of {@link SettlementSubTotalCalculatedTax2 }
     */
    public SettlementSubTotalCalculatedTax2 createSettlementSubTotalCalculatedTax2() {
        return new SettlementSubTotalCalculatedTax2();
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
     * Create an instance of {@link TaxOrganisationIdentification1 }
     * 
     * @return
     *     the new instance of {@link TaxOrganisationIdentification1 }
     */
    public TaxOrganisationIdentification1 createTaxOrganisationIdentification1() {
        return new TaxOrganisationIdentification1();
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
     * Create an instance of {@link TaxReport1 }
     * 
     * @return
     *     the new instance of {@link TaxReport1 }
     */
    public TaxReport1 createTaxReport1() {
        return new TaxReport1();
    }

    /**
     * Create an instance of {@link TaxReportHeader1 }
     * 
     * @return
     *     the new instance of {@link TaxReportHeader1 }
     */
    public TaxReportHeader1 createTaxReportHeader1() {
        return new TaxReportHeader1();
    }

    /**
     * Create an instance of {@link TradeSettlement2 }
     * 
     * @return
     *     the new instance of {@link TradeSettlement2 }
     */
    public TradeSettlement2 createTradeSettlement2() {
        return new TradeSettlement2();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Document }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Document }{@code >}
     */
    @XmlElementDecl(namespace = "urn:iso:std:iso:20022:tech:xsd:auth.034.001.01", name = "Document")
    public JAXBElement<Document> createDocument(Document value) {
        return new JAXBElement<>(_Document_QNAME, Document.class, null, value);
    }

}
