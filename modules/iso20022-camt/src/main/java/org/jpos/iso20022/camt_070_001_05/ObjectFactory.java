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

package org.jpos.iso20022.camt_070_001_05;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.jpos.iso20022.camt_070_001_05 package. 
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

    private static final QName _Document_QNAME = new QName("urn:iso:std:iso:20022:tech:xsd:camt.070.001.05", "Document");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.jpos.iso20022.camt_070_001_05
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
     * Create an instance of {@link DatePeriod3 }
     * 
     * @return
     *     the new instance of {@link DatePeriod3 }
     */
    public DatePeriod3 createDatePeriod3() {
        return new DatePeriod3();
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
     * Create an instance of {@link EventType1Choice }
     * 
     * @return
     *     the new instance of {@link EventType1Choice }
     */
    public EventType1Choice createEventType1Choice() {
        return new EventType1Choice();
    }

    /**
     * Create an instance of {@link ExecutionType1Choice }
     * 
     * @return
     *     the new instance of {@link ExecutionType1Choice }
     */
    public ExecutionType1Choice createExecutionType1Choice() {
        return new ExecutionType1Choice();
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
     * Create an instance of {@link MessageHeader6 }
     * 
     * @return
     *     the new instance of {@link MessageHeader6 }
     */
    public MessageHeader6 createMessageHeader6() {
        return new MessageHeader6();
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
     * Create an instance of {@link RequestType3Choice }
     * 
     * @return
     *     the new instance of {@link RequestType3Choice }
     */
    public RequestType3Choice createRequestType3Choice() {
        return new RequestType3Choice();
    }

    /**
     * Create an instance of {@link ReturnStandingOrderV05 }
     * 
     * @return
     *     the new instance of {@link ReturnStandingOrderV05 }
     */
    public ReturnStandingOrderV05 createReturnStandingOrderV05() {
        return new ReturnStandingOrderV05();
    }

    /**
     * Create an instance of {@link StandingOrder9 }
     * 
     * @return
     *     the new instance of {@link StandingOrder9 }
     */
    public StandingOrder9 createStandingOrder9() {
        return new StandingOrder9();
    }

    /**
     * Create an instance of {@link StandingOrderIdentification6 }
     * 
     * @return
     *     the new instance of {@link StandingOrderIdentification6 }
     */
    public StandingOrderIdentification6 createStandingOrderIdentification6() {
        return new StandingOrderIdentification6();
    }

    /**
     * Create an instance of {@link StandingOrderOrError7Choice }
     * 
     * @return
     *     the new instance of {@link StandingOrderOrError7Choice }
     */
    public StandingOrderOrError7Choice createStandingOrderOrError7Choice() {
        return new StandingOrderOrError7Choice();
    }

    /**
     * Create an instance of {@link StandingOrderOrError8Choice }
     * 
     * @return
     *     the new instance of {@link StandingOrderOrError8Choice }
     */
    public StandingOrderOrError8Choice createStandingOrderOrError8Choice() {
        return new StandingOrderOrError8Choice();
    }

    /**
     * Create an instance of {@link StandingOrderReport2 }
     * 
     * @return
     *     the new instance of {@link StandingOrderReport2 }
     */
    public StandingOrderReport2 createStandingOrderReport2() {
        return new StandingOrderReport2();
    }

    /**
     * Create an instance of {@link StandingOrderTotalAmount1 }
     * 
     * @return
     *     the new instance of {@link StandingOrderTotalAmount1 }
     */
    public StandingOrderTotalAmount1 createStandingOrderTotalAmount1() {
        return new StandingOrderTotalAmount1();
    }

    /**
     * Create an instance of {@link StandingOrderType1Choice }
     * 
     * @return
     *     the new instance of {@link StandingOrderType1Choice }
     */
    public StandingOrderType1Choice createStandingOrderType1Choice() {
        return new StandingOrderType1Choice();
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
     * Create an instance of {@link TotalAmountAndCurrency1 }
     * 
     * @return
     *     the new instance of {@link TotalAmountAndCurrency1 }
     */
    public TotalAmountAndCurrency1 createTotalAmountAndCurrency1() {
        return new TotalAmountAndCurrency1();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Document }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Document }{@code >}
     */
    @XmlElementDecl(namespace = "urn:iso:std:iso:20022:tech:xsd:camt.070.001.05", name = "Document")
    public JAXBElement<Document> createDocument(Document value) {
        return new JAXBElement<>(_Document_QNAME, Document.class, null, value);
    }

}
