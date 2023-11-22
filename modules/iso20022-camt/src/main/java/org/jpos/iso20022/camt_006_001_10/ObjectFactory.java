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

package org.jpos.iso20022.camt_006_001_10;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.jpos.iso20022.camt_006_001_10 package. 
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

    private static final QName _Document_QNAME = new QName("urn:iso:std:iso:20022:tech:xsd:camt.006.001.10", "Document");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.jpos.iso20022.camt_006_001_10
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
     * Create an instance of {@link Amount2Choice }
     * 
     * @return
     *     the new instance of {@link Amount2Choice }
     */
    public Amount2Choice createAmount2Choice() {
        return new Amount2Choice();
    }

    /**
     * Create an instance of {@link Amount3Choice }
     * 
     * @return
     *     the new instance of {@link Amount3Choice }
     */
    public Amount3Choice createAmount3Choice() {
        return new Amount3Choice();
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
     * Create an instance of {@link CashAccount41 }
     * 
     * @return
     *     the new instance of {@link CashAccount41 }
     */
    public CashAccount41 createCashAccount41() {
        return new CashAccount41();
    }

    /**
     * Create an instance of {@link CashAccountAndEntry4 }
     * 
     * @return
     *     the new instance of {@link CashAccountAndEntry4 }
     */
    public CashAccountAndEntry4 createCashAccountAndEntry4() {
        return new CashAccountAndEntry4();
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
     * Create an instance of {@link CashEntry2 }
     * 
     * @return
     *     the new instance of {@link CashEntry2 }
     */
    public CashEntry2 createCashEntry2() {
        return new CashEntry2();
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
     * Create an instance of {@link Contact4 }
     * 
     * @return
     *     the new instance of {@link Contact4 }
     */
    public Contact4 createContact4() {
        return new Contact4();
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
     * Create an instance of {@link DateTimePeriod1 }
     * 
     * @return
     *     the new instance of {@link DateTimePeriod1 }
     */
    public DateTimePeriod1 createDateTimePeriod1() {
        return new DateTimePeriod1();
    }

    /**
     * Create an instance of {@link DateTimePeriod1Choice }
     * 
     * @return
     *     the new instance of {@link DateTimePeriod1Choice }
     */
    public DateTimePeriod1Choice createDateTimePeriod1Choice() {
        return new DateTimePeriod1Choice();
    }

    /**
     * Create an instance of {@link ErrorHandling3Choice }
     * 
     * @return
     *     the new instance of {@link ErrorHandling3Choice }
     */
    public ErrorHandling3Choice createErrorHandling3Choice() {
        return new ErrorHandling3Choice();
    }

    /**
     * Create an instance of {@link ErrorHandling5 }
     * 
     * @return
     *     the new instance of {@link ErrorHandling5 }
     */
    public ErrorHandling5 createErrorHandling5() {
        return new ErrorHandling5();
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
     * Create an instance of {@link LongPaymentIdentification3 }
     * 
     * @return
     *     the new instance of {@link LongPaymentIdentification3 }
     */
    public LongPaymentIdentification3 createLongPaymentIdentification3() {
        return new LongPaymentIdentification3();
    }

    /**
     * Create an instance of {@link MarketInfrastructureIdentification1Choice }
     * 
     * @return
     *     the new instance of {@link MarketInfrastructureIdentification1Choice }
     */
    public MarketInfrastructureIdentification1Choice createMarketInfrastructureIdentification1Choice() {
        return new MarketInfrastructureIdentification1Choice();
    }

    /**
     * Create an instance of {@link MessageHeader8 }
     * 
     * @return
     *     the new instance of {@link MessageHeader8 }
     */
    public MessageHeader8 createMessageHeader8() {
        return new MessageHeader8();
    }

    /**
     * Create an instance of {@link NumberAndSumOfTransactions2 }
     * 
     * @return
     *     the new instance of {@link NumberAndSumOfTransactions2 }
     */
    public NumberAndSumOfTransactions2 createNumberAndSumOfTransactions2() {
        return new NumberAndSumOfTransactions2();
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
     * Create an instance of {@link OriginalBusinessQuery1 }
     * 
     * @return
     *     the new instance of {@link OriginalBusinessQuery1 }
     */
    public OriginalBusinessQuery1 createOriginalBusinessQuery1() {
        return new OriginalBusinessQuery1();
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
     * Create an instance of {@link Pagination1 }
     * 
     * @return
     *     the new instance of {@link Pagination1 }
     */
    public Pagination1 createPagination1() {
        return new Pagination1();
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
     * Create an instance of {@link PaymentCommon5 }
     * 
     * @return
     *     the new instance of {@link PaymentCommon5 }
     */
    public PaymentCommon5 createPaymentCommon5() {
        return new PaymentCommon5();
    }

    /**
     * Create an instance of {@link PaymentIdentification7Choice }
     * 
     * @return
     *     the new instance of {@link PaymentIdentification7Choice }
     */
    public PaymentIdentification7Choice createPaymentIdentification7Choice() {
        return new PaymentIdentification7Choice();
    }

    /**
     * Create an instance of {@link PaymentInstruction32 }
     * 
     * @return
     *     the new instance of {@link PaymentInstruction32 }
     */
    public PaymentInstruction32 createPaymentInstruction32() {
        return new PaymentInstruction32();
    }

    /**
     * Create an instance of {@link PaymentOrigin1Choice }
     * 
     * @return
     *     the new instance of {@link PaymentOrigin1Choice }
     */
    public PaymentOrigin1Choice createPaymentOrigin1Choice() {
        return new PaymentOrigin1Choice();
    }

    /**
     * Create an instance of {@link PaymentStatus6 }
     * 
     * @return
     *     the new instance of {@link PaymentStatus6 }
     */
    public PaymentStatus6 createPaymentStatus6() {
        return new PaymentStatus6();
    }

    /**
     * Create an instance of {@link PaymentStatusCode6Choice }
     * 
     * @return
     *     the new instance of {@link PaymentStatusCode6Choice }
     */
    public PaymentStatusCode6Choice createPaymentStatusCode6Choice() {
        return new PaymentStatusCode6Choice();
    }

    /**
     * Create an instance of {@link PaymentStatusReason1Choice }
     * 
     * @return
     *     the new instance of {@link PaymentStatusReason1Choice }
     */
    public PaymentStatusReason1Choice createPaymentStatusReason1Choice() {
        return new PaymentStatusReason1Choice();
    }

    /**
     * Create an instance of {@link PaymentTransactionParty3 }
     * 
     * @return
     *     the new instance of {@link PaymentTransactionParty3 }
     */
    public PaymentTransactionParty3 createPaymentTransactionParty3() {
        return new PaymentTransactionParty3();
    }

    /**
     * Create an instance of {@link PaymentType4Choice }
     * 
     * @return
     *     the new instance of {@link PaymentType4Choice }
     */
    public PaymentType4Choice createPaymentType4Choice() {
        return new PaymentType4Choice();
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
     * Create an instance of {@link Priority1Choice }
     * 
     * @return
     *     the new instance of {@link Priority1Choice }
     */
    public Priority1Choice createPriority1Choice() {
        return new Priority1Choice();
    }

    /**
     * Create an instance of {@link ProprietaryStatusJustification2 }
     * 
     * @return
     *     the new instance of {@link ProprietaryStatusJustification2 }
     */
    public ProprietaryStatusJustification2 createProprietaryStatusJustification2() {
        return new ProprietaryStatusJustification2();
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
     * Create an instance of {@link QueueTransactionIdentification1 }
     * 
     * @return
     *     the new instance of {@link QueueTransactionIdentification1 }
     */
    public QueueTransactionIdentification1 createQueueTransactionIdentification1() {
        return new QueueTransactionIdentification1();
    }

    /**
     * Create an instance of {@link RequestType4Choice }
     * 
     * @return
     *     the new instance of {@link RequestType4Choice }
     */
    public RequestType4Choice createRequestType4Choice() {
        return new RequestType4Choice();
    }

    /**
     * Create an instance of {@link ReturnTransactionV10 }
     * 
     * @return
     *     the new instance of {@link ReturnTransactionV10 }
     */
    public ReturnTransactionV10 createReturnTransactionV10() {
        return new ReturnTransactionV10();
    }

    /**
     * Create an instance of {@link SecuritiesTransactionReferences1 }
     * 
     * @return
     *     the new instance of {@link SecuritiesTransactionReferences1 }
     */
    public SecuritiesTransactionReferences1 createSecuritiesTransactionReferences1() {
        return new SecuritiesTransactionReferences1();
    }

    /**
     * Create an instance of {@link ShortPaymentIdentification3 }
     * 
     * @return
     *     the new instance of {@link ShortPaymentIdentification3 }
     */
    public ShortPaymentIdentification3 createShortPaymentIdentification3() {
        return new ShortPaymentIdentification3();
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
     * Create an instance of {@link System2 }
     * 
     * @return
     *     the new instance of {@link System2 }
     */
    public System2 createSystem2() {
        return new System2();
    }

    /**
     * Create an instance of {@link Transaction74 }
     * 
     * @return
     *     the new instance of {@link Transaction74 }
     */
    public Transaction74 createTransaction74() {
        return new Transaction74();
    }

    /**
     * Create an instance of {@link TransactionOrError5Choice }
     * 
     * @return
     *     the new instance of {@link TransactionOrError5Choice }
     */
    public TransactionOrError5Choice createTransactionOrError5Choice() {
        return new TransactionOrError5Choice();
    }

    /**
     * Create an instance of {@link TransactionReport7 }
     * 
     * @return
     *     the new instance of {@link TransactionReport7 }
     */
    public TransactionReport7 createTransactionReport7() {
        return new TransactionReport7();
    }

    /**
     * Create an instance of {@link TransactionReportOrError6Choice }
     * 
     * @return
     *     the new instance of {@link TransactionReportOrError6Choice }
     */
    public TransactionReportOrError6Choice createTransactionReportOrError6Choice() {
        return new TransactionReportOrError6Choice();
    }

    /**
     * Create an instance of {@link Transactions10 }
     * 
     * @return
     *     the new instance of {@link Transactions10 }
     */
    public Transactions10 createTransactions10() {
        return new Transactions10();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Document }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Document }{@code >}
     */
    @XmlElementDecl(namespace = "urn:iso:std:iso:20022:tech:xsd:camt.006.001.10", name = "Document")
    public JAXBElement<Document> createDocument(Document value) {
        return new JAXBElement<>(_Document_QNAME, Document.class, null, value);
    }

}
