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

package org.jpos.iso20022.camt_066_001_01;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.jpos.iso20022.camt_066_001_01 package. 
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

    private static final QName _Document_QNAME = new QName("urn:iso:std:iso:20022:tech:xsd:camt.066.001.01", "Document");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.jpos.iso20022.camt_066_001_01
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
     * Create an instance of {@link AmountAndDirection5 }
     * 
     * @return
     *     the new instance of {@link AmountAndDirection5 }
     */
    public AmountAndDirection5 createAmountAndDirection5() {
        return new AmountAndDirection5();
    }

    /**
     * Create an instance of {@link AmountAndQuantityBreakdown1 }
     * 
     * @return
     *     the new instance of {@link AmountAndQuantityBreakdown1 }
     */
    public AmountAndQuantityBreakdown1 createAmountAndQuantityBreakdown1() {
        return new AmountAndQuantityBreakdown1();
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
     * Create an instance of {@link CashAccount38 }
     * 
     * @return
     *     the new instance of {@link CashAccount38 }
     */
    public CashAccount38 createCashAccount38() {
        return new CashAccount38();
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
     * Create an instance of {@link CashBalanceType3Choice }
     * 
     * @return
     *     the new instance of {@link CashBalanceType3Choice }
     */
    public CashBalanceType3Choice createCashBalanceType3Choice() {
        return new CashBalanceType3Choice();
    }

    /**
     * Create an instance of {@link CashSubBalanceTypeAndQuantityBreakdown3 }
     * 
     * @return
     *     the new instance of {@link CashSubBalanceTypeAndQuantityBreakdown3 }
     */
    public CashSubBalanceTypeAndQuantityBreakdown3 createCashSubBalanceTypeAndQuantityBreakdown3() {
        return new CashSubBalanceTypeAndQuantityBreakdown3();
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
     * Create an instance of {@link DateAndDateTime2Choice }
     * 
     * @return
     *     the new instance of {@link DateAndDateTime2Choice }
     */
    public DateAndDateTime2Choice createDateAndDateTime2Choice() {
        return new DateAndDateTime2Choice();
    }

    /**
     * Create an instance of {@link DocumentNumber5Choice }
     * 
     * @return
     *     the new instance of {@link DocumentNumber5Choice }
     */
    public DocumentNumber5Choice createDocumentNumber5Choice() {
        return new DocumentNumber5Choice();
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
     * Create an instance of {@link FinancialInstrumentQuantity1Choice }
     * 
     * @return
     *     the new instance of {@link FinancialInstrumentQuantity1Choice }
     */
    public FinancialInstrumentQuantity1Choice createFinancialInstrumentQuantity1Choice() {
        return new FinancialInstrumentQuantity1Choice();
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
     * Create an instance of {@link GenericIdentification36 }
     * 
     * @return
     *     the new instance of {@link GenericIdentification36 }
     */
    public GenericIdentification36 createGenericIdentification36() {
        return new GenericIdentification36();
    }

    /**
     * Create an instance of {@link GenericIdentification37 }
     * 
     * @return
     *     the new instance of {@link GenericIdentification37 }
     */
    public GenericIdentification37 createGenericIdentification37() {
        return new GenericIdentification37();
    }

    /**
     * Create an instance of {@link Identification14 }
     * 
     * @return
     *     the new instance of {@link Identification14 }
     */
    public Identification14 createIdentification14() {
        return new Identification14();
    }

    /**
     * Create an instance of {@link IntraBalance5 }
     * 
     * @return
     *     the new instance of {@link IntraBalance5 }
     */
    public IntraBalance5 createIntraBalance5() {
        return new IntraBalance5();
    }

    /**
     * Create an instance of {@link IntraBalanceMovementInstructionV01 }
     * 
     * @return
     *     the new instance of {@link IntraBalanceMovementInstructionV01 }
     */
    public IntraBalanceMovementInstructionV01 createIntraBalanceMovementInstructionV01() {
        return new IntraBalanceMovementInstructionV01();
    }

    /**
     * Create an instance of {@link Linkages57 }
     * 
     * @return
     *     the new instance of {@link Linkages57 }
     */
    public Linkages57 createLinkages57() {
        return new Linkages57();
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
     * Create an instance of {@link NumberCount1Choice }
     * 
     * @return
     *     the new instance of {@link NumberCount1Choice }
     */
    public NumberCount1Choice createNumberCount1Choice() {
        return new NumberCount1Choice();
    }

    /**
     * Create an instance of {@link PartyIdentification120Choice }
     * 
     * @return
     *     the new instance of {@link PartyIdentification120Choice }
     */
    public PartyIdentification120Choice createPartyIdentification120Choice() {
        return new PartyIdentification120Choice();
    }

    /**
     * Create an instance of {@link PartyIdentification127Choice }
     * 
     * @return
     *     the new instance of {@link PartyIdentification127Choice }
     */
    public PartyIdentification127Choice createPartyIdentification127Choice() {
        return new PartyIdentification127Choice();
    }

    /**
     * Create an instance of {@link PartyIdentification136 }
     * 
     * @return
     *     the new instance of {@link PartyIdentification136 }
     */
    public PartyIdentification136 createPartyIdentification136() {
        return new PartyIdentification136();
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
     * Create an instance of {@link PostalAddress24 }
     * 
     * @return
     *     the new instance of {@link PostalAddress24 }
     */
    public PostalAddress24 createPostalAddress24() {
        return new PostalAddress24();
    }

    /**
     * Create an instance of {@link PriorityNumeric4Choice }
     * 
     * @return
     *     the new instance of {@link PriorityNumeric4Choice }
     */
    public PriorityNumeric4Choice createPriorityNumeric4Choice() {
        return new PriorityNumeric4Choice();
    }

    /**
     * Create an instance of {@link ProcessingPosition7Choice }
     * 
     * @return
     *     the new instance of {@link ProcessingPosition7Choice }
     */
    public ProcessingPosition7Choice createProcessingPosition7Choice() {
        return new ProcessingPosition7Choice();
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
     * Create an instance of {@link References34Choice }
     * 
     * @return
     *     the new instance of {@link References34Choice }
     */
    public References34Choice createReferences34Choice() {
        return new References34Choice();
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
     * Create an instance of {@link SystemPartyIdentification8 }
     * 
     * @return
     *     the new instance of {@link SystemPartyIdentification8 }
     */
    public SystemPartyIdentification8 createSystemPartyIdentification8() {
        return new SystemPartyIdentification8();
    }

    /**
     * Create an instance of {@link TotalNumber1 }
     * 
     * @return
     *     the new instance of {@link TotalNumber1 }
     */
    public TotalNumber1 createTotalNumber1() {
        return new TotalNumber1();
    }

    /**
     * Create an instance of {@link TransactionAndDocumentIdentification6 }
     * 
     * @return
     *     the new instance of {@link TransactionAndDocumentIdentification6 }
     */
    public TransactionAndDocumentIdentification6 createTransactionAndDocumentIdentification6() {
        return new TransactionAndDocumentIdentification6();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Document }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Document }{@code >}
     */
    @XmlElementDecl(namespace = "urn:iso:std:iso:20022:tech:xsd:camt.066.001.01", name = "Document")
    public JAXBElement<Document> createDocument(Document value) {
        return new JAXBElement<>(_Document_QNAME, Document.class, null, value);
    }

}
