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

package org.jpos.iso20022.pacs_010_001_05;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.jpos.iso20022.pacs_010_001_05 package. 
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

    private static final QName _Document_QNAME = new QName("urn:iso:std:iso:20022:tech:xsd:pacs.010.001.05", "Document");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.jpos.iso20022.pacs_010_001_05
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
     * Create an instance of {@link CreditTransferTransaction53 }
     * 
     * @return
     *     the new instance of {@link CreditTransferTransaction53 }
     */
    public CreditTransferTransaction53 createCreditTransferTransaction53() {
        return new CreditTransferTransaction53();
    }

    /**
     * Create an instance of {@link DirectDebitTransactionInformation27 }
     * 
     * @return
     *     the new instance of {@link DirectDebitTransactionInformation27 }
     */
    public DirectDebitTransactionInformation27 createDirectDebitTransactionInformation27() {
        return new DirectDebitTransactionInformation27();
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
     * Create an instance of {@link FinancialInstitutionDirectDebitV05 }
     * 
     * @return
     *     the new instance of {@link FinancialInstitutionDirectDebitV05 }
     */
    public FinancialInstitutionDirectDebitV05 createFinancialInstitutionDirectDebitV05() {
        return new FinancialInstitutionDirectDebitV05();
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
     * Create an instance of {@link GenericIdentification30 }
     * 
     * @return
     *     the new instance of {@link GenericIdentification30 }
     */
    public GenericIdentification30 createGenericIdentification30() {
        return new GenericIdentification30();
    }

    /**
     * Create an instance of {@link GroupHeader92 }
     * 
     * @return
     *     the new instance of {@link GroupHeader92 }
     */
    public GroupHeader92 createGroupHeader92() {
        return new GroupHeader92();
    }

    /**
     * Create an instance of {@link InstructionForCreditorAgent3 }
     * 
     * @return
     *     the new instance of {@link InstructionForCreditorAgent3 }
     */
    public InstructionForCreditorAgent3 createInstructionForCreditorAgent3() {
        return new InstructionForCreditorAgent3();
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
     * Create an instance of {@link PaymentIdentification13 }
     * 
     * @return
     *     the new instance of {@link PaymentIdentification13 }
     */
    public PaymentIdentification13 createPaymentIdentification13() {
        return new PaymentIdentification13();
    }

    /**
     * Create an instance of {@link PaymentTypeInformation28 }
     * 
     * @return
     *     the new instance of {@link PaymentTypeInformation28 }
     */
    public PaymentTypeInformation28 createPaymentTypeInformation28() {
        return new PaymentTypeInformation28();
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
     * Create an instance of {@link Purpose2Choice }
     * 
     * @return
     *     the new instance of {@link Purpose2Choice }
     */
    public Purpose2Choice createPurpose2Choice() {
        return new Purpose2Choice();
    }

    /**
     * Create an instance of {@link RemittanceInformation2 }
     * 
     * @return
     *     the new instance of {@link RemittanceInformation2 }
     */
    public RemittanceInformation2 createRemittanceInformation2() {
        return new RemittanceInformation2();
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
     * Create an instance of {@link SettlementDateTimeIndication1 }
     * 
     * @return
     *     the new instance of {@link SettlementDateTimeIndication1 }
     */
    public SettlementDateTimeIndication1 createSettlementDateTimeIndication1() {
        return new SettlementDateTimeIndication1();
    }

    /**
     * Create an instance of {@link SettlementTimeRequest2 }
     * 
     * @return
     *     the new instance of {@link SettlementTimeRequest2 }
     */
    public SettlementTimeRequest2 createSettlementTimeRequest2() {
        return new SettlementTimeRequest2();
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
     * Create an instance of {@link JAXBElement }{@code <}{@link Document }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Document }{@code >}
     */
    @XmlElementDecl(namespace = "urn:iso:std:iso:20022:tech:xsd:pacs.010.001.05", name = "Document")
    public JAXBElement<Document> createDocument(Document value) {
        return new JAXBElement<>(_Document_QNAME, Document.class, null, value);
    }

}
