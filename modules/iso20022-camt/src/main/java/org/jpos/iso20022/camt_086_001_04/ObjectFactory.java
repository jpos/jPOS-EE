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

package org.jpos.iso20022.camt_086_001_04;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.jpos.iso20022.camt_086_001_04 package. 
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

    private static final QName _Document_QNAME = new QName("urn:iso:std:iso:20022:tech:xsd:camt.086.001.04", "Document");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.jpos.iso20022.camt_086_001_04
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
     * Create an instance of {@link AccountTax1 }
     * 
     * @return
     *     the new instance of {@link AccountTax1 }
     */
    public AccountTax1 createAccountTax1() {
        return new AccountTax1();
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
     * Create an instance of {@link AmountAndDirection34 }
     * 
     * @return
     *     the new instance of {@link AmountAndDirection34 }
     */
    public AmountAndDirection34 createAmountAndDirection34() {
        return new AmountAndDirection34();
    }

    /**
     * Create an instance of {@link BalanceAdjustment1 }
     * 
     * @return
     *     the new instance of {@link BalanceAdjustment1 }
     */
    public BalanceAdjustment1 createBalanceAdjustment1() {
        return new BalanceAdjustment1();
    }

    /**
     * Create an instance of {@link BankServicesBillingStatementV04 }
     * 
     * @return
     *     the new instance of {@link BankServicesBillingStatementV04 }
     */
    public BankServicesBillingStatementV04 createBankServicesBillingStatementV04() {
        return new BankServicesBillingStatementV04();
    }

    /**
     * Create an instance of {@link BankTransactionCodeStructure4 }
     * 
     * @return
     *     the new instance of {@link BankTransactionCodeStructure4 }
     */
    public BankTransactionCodeStructure4 createBankTransactionCodeStructure4() {
        return new BankTransactionCodeStructure4();
    }

    /**
     * Create an instance of {@link BankTransactionCodeStructure5 }
     * 
     * @return
     *     the new instance of {@link BankTransactionCodeStructure5 }
     */
    public BankTransactionCodeStructure5 createBankTransactionCodeStructure5() {
        return new BankTransactionCodeStructure5();
    }

    /**
     * Create an instance of {@link BankTransactionCodeStructure6 }
     * 
     * @return
     *     the new instance of {@link BankTransactionCodeStructure6 }
     */
    public BankTransactionCodeStructure6 createBankTransactionCodeStructure6() {
        return new BankTransactionCodeStructure6();
    }

    /**
     * Create an instance of {@link BillingBalance1 }
     * 
     * @return
     *     the new instance of {@link BillingBalance1 }
     */
    public BillingBalance1 createBillingBalance1() {
        return new BillingBalance1();
    }

    /**
     * Create an instance of {@link BillingBalanceType1Choice }
     * 
     * @return
     *     the new instance of {@link BillingBalanceType1Choice }
     */
    public BillingBalanceType1Choice createBillingBalanceType1Choice() {
        return new BillingBalanceType1Choice();
    }

    /**
     * Create an instance of {@link BillingCompensation1 }
     * 
     * @return
     *     the new instance of {@link BillingCompensation1 }
     */
    public BillingCompensation1 createBillingCompensation1() {
        return new BillingCompensation1();
    }

    /**
     * Create an instance of {@link BillingCompensationType1Choice }
     * 
     * @return
     *     the new instance of {@link BillingCompensationType1Choice }
     */
    public BillingCompensationType1Choice createBillingCompensationType1Choice() {
        return new BillingCompensationType1Choice();
    }

    /**
     * Create an instance of {@link BillingMethod1 }
     * 
     * @return
     *     the new instance of {@link BillingMethod1 }
     */
    public BillingMethod1 createBillingMethod1() {
        return new BillingMethod1();
    }

    /**
     * Create an instance of {@link BillingMethod1Choice }
     * 
     * @return
     *     the new instance of {@link BillingMethod1Choice }
     */
    public BillingMethod1Choice createBillingMethod1Choice() {
        return new BillingMethod1Choice();
    }

    /**
     * Create an instance of {@link BillingMethod2 }
     * 
     * @return
     *     the new instance of {@link BillingMethod2 }
     */
    public BillingMethod2 createBillingMethod2() {
        return new BillingMethod2();
    }

    /**
     * Create an instance of {@link BillingMethod3 }
     * 
     * @return
     *     the new instance of {@link BillingMethod3 }
     */
    public BillingMethod3 createBillingMethod3() {
        return new BillingMethod3();
    }

    /**
     * Create an instance of {@link BillingMethod4 }
     * 
     * @return
     *     the new instance of {@link BillingMethod4 }
     */
    public BillingMethod4 createBillingMethod4() {
        return new BillingMethod4();
    }

    /**
     * Create an instance of {@link BillingPrice1 }
     * 
     * @return
     *     the new instance of {@link BillingPrice1 }
     */
    public BillingPrice1 createBillingPrice1() {
        return new BillingPrice1();
    }

    /**
     * Create an instance of {@link BillingRate1 }
     * 
     * @return
     *     the new instance of {@link BillingRate1 }
     */
    public BillingRate1 createBillingRate1() {
        return new BillingRate1();
    }

    /**
     * Create an instance of {@link BillingRateIdentification1Choice }
     * 
     * @return
     *     the new instance of {@link BillingRateIdentification1Choice }
     */
    public BillingRateIdentification1Choice createBillingRateIdentification1Choice() {
        return new BillingRateIdentification1Choice();
    }

    /**
     * Create an instance of {@link BillingService2 }
     * 
     * @return
     *     the new instance of {@link BillingService2 }
     */
    public BillingService2 createBillingService2() {
        return new BillingService2();
    }

    /**
     * Create an instance of {@link BillingServiceAdjustment1 }
     * 
     * @return
     *     the new instance of {@link BillingServiceAdjustment1 }
     */
    public BillingServiceAdjustment1 createBillingServiceAdjustment1() {
        return new BillingServiceAdjustment1();
    }

    /**
     * Create an instance of {@link BillingServiceCommonIdentification1 }
     * 
     * @return
     *     the new instance of {@link BillingServiceCommonIdentification1 }
     */
    public BillingServiceCommonIdentification1 createBillingServiceCommonIdentification1() {
        return new BillingServiceCommonIdentification1();
    }

    /**
     * Create an instance of {@link BillingServiceIdentification2 }
     * 
     * @return
     *     the new instance of {@link BillingServiceIdentification2 }
     */
    public BillingServiceIdentification2 createBillingServiceIdentification2() {
        return new BillingServiceIdentification2();
    }

    /**
     * Create an instance of {@link BillingServiceIdentification3 }
     * 
     * @return
     *     the new instance of {@link BillingServiceIdentification3 }
     */
    public BillingServiceIdentification3 createBillingServiceIdentification3() {
        return new BillingServiceIdentification3();
    }

    /**
     * Create an instance of {@link BillingServiceParameters2 }
     * 
     * @return
     *     the new instance of {@link BillingServiceParameters2 }
     */
    public BillingServiceParameters2 createBillingServiceParameters2() {
        return new BillingServiceParameters2();
    }

    /**
     * Create an instance of {@link BillingServiceParameters3 }
     * 
     * @return
     *     the new instance of {@link BillingServiceParameters3 }
     */
    public BillingServiceParameters3 createBillingServiceParameters3() {
        return new BillingServiceParameters3();
    }

    /**
     * Create an instance of {@link BillingServicesAmount1 }
     * 
     * @return
     *     the new instance of {@link BillingServicesAmount1 }
     */
    public BillingServicesAmount1 createBillingServicesAmount1() {
        return new BillingServicesAmount1();
    }

    /**
     * Create an instance of {@link BillingServicesAmount2 }
     * 
     * @return
     *     the new instance of {@link BillingServicesAmount2 }
     */
    public BillingServicesAmount2 createBillingServicesAmount2() {
        return new BillingServicesAmount2();
    }

    /**
     * Create an instance of {@link BillingServicesAmount3 }
     * 
     * @return
     *     the new instance of {@link BillingServicesAmount3 }
     */
    public BillingServicesAmount3 createBillingServicesAmount3() {
        return new BillingServicesAmount3();
    }

    /**
     * Create an instance of {@link BillingServicesTax1 }
     * 
     * @return
     *     the new instance of {@link BillingServicesTax1 }
     */
    public BillingServicesTax1 createBillingServicesTax1() {
        return new BillingServicesTax1();
    }

    /**
     * Create an instance of {@link BillingServicesTax2 }
     * 
     * @return
     *     the new instance of {@link BillingServicesTax2 }
     */
    public BillingServicesTax2 createBillingServicesTax2() {
        return new BillingServicesTax2();
    }

    /**
     * Create an instance of {@link BillingServicesTax3 }
     * 
     * @return
     *     the new instance of {@link BillingServicesTax3 }
     */
    public BillingServicesTax3 createBillingServicesTax3() {
        return new BillingServicesTax3();
    }

    /**
     * Create an instance of {@link BillingStatement4 }
     * 
     * @return
     *     the new instance of {@link BillingStatement4 }
     */
    public BillingStatement4 createBillingStatement4() {
        return new BillingStatement4();
    }

    /**
     * Create an instance of {@link BillingSubServiceIdentification1 }
     * 
     * @return
     *     the new instance of {@link BillingSubServiceIdentification1 }
     */
    public BillingSubServiceIdentification1 createBillingSubServiceIdentification1() {
        return new BillingSubServiceIdentification1();
    }

    /**
     * Create an instance of {@link BillingSubServiceQualifier1Choice }
     * 
     * @return
     *     the new instance of {@link BillingSubServiceQualifier1Choice }
     */
    public BillingSubServiceQualifier1Choice createBillingSubServiceQualifier1Choice() {
        return new BillingSubServiceQualifier1Choice();
    }

    /**
     * Create an instance of {@link BillingTaxIdentification2 }
     * 
     * @return
     *     the new instance of {@link BillingTaxIdentification2 }
     */
    public BillingTaxIdentification2 createBillingTaxIdentification2() {
        return new BillingTaxIdentification2();
    }

    /**
     * Create an instance of {@link BillingTaxRegion2 }
     * 
     * @return
     *     the new instance of {@link BillingTaxRegion2 }
     */
    public BillingTaxRegion2 createBillingTaxRegion2() {
        return new BillingTaxRegion2();
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
     * Create an instance of {@link CashAccountCharacteristics4 }
     * 
     * @return
     *     the new instance of {@link CashAccountCharacteristics4 }
     */
    public CashAccountCharacteristics4 createCashAccountCharacteristics4() {
        return new CashAccountCharacteristics4();
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
     * Create an instance of {@link Contact4 }
     * 
     * @return
     *     the new instance of {@link Contact4 }
     */
    public Contact4 createContact4() {
        return new Contact4();
    }

    /**
     * Create an instance of {@link CurrencyExchange6 }
     * 
     * @return
     *     the new instance of {@link CurrencyExchange6 }
     */
    public CurrencyExchange6 createCurrencyExchange6() {
        return new CurrencyExchange6();
    }

    /**
     * Create an instance of {@link DatePeriod1 }
     * 
     * @return
     *     the new instance of {@link DatePeriod1 }
     */
    public DatePeriod1 createDatePeriod1() {
        return new DatePeriod1();
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
     * Create an instance of {@link FinancialInstitutionIdentification19 }
     * 
     * @return
     *     the new instance of {@link FinancialInstitutionIdentification19 }
     */
    public FinancialInstitutionIdentification19 createFinancialInstitutionIdentification19() {
        return new FinancialInstitutionIdentification19();
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
     * Create an instance of {@link GenericOrganisationIdentification1 }
     * 
     * @return
     *     the new instance of {@link GenericOrganisationIdentification1 }
     */
    public GenericOrganisationIdentification1 createGenericOrganisationIdentification1() {
        return new GenericOrganisationIdentification1();
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
     * Create an instance of {@link ParentCashAccount4 }
     * 
     * @return
     *     the new instance of {@link ParentCashAccount4 }
     */
    public ParentCashAccount4 createParentCashAccount4() {
        return new ParentCashAccount4();
    }

    /**
     * Create an instance of {@link Party43Choice }
     * 
     * @return
     *     the new instance of {@link Party43Choice }
     */
    public Party43Choice createParty43Choice() {
        return new Party43Choice();
    }

    /**
     * Create an instance of {@link PartyIdentification138 }
     * 
     * @return
     *     the new instance of {@link PartyIdentification138 }
     */
    public PartyIdentification138 createPartyIdentification138() {
        return new PartyIdentification138();
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
     * Create an instance of {@link ProprietaryBankTransactionCodeStructure1 }
     * 
     * @return
     *     the new instance of {@link ProprietaryBankTransactionCodeStructure1 }
     */
    public ProprietaryBankTransactionCodeStructure1 createProprietaryBankTransactionCodeStructure1() {
        return new ProprietaryBankTransactionCodeStructure1();
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
     * Create an instance of {@link ReportHeader6 }
     * 
     * @return
     *     the new instance of {@link ReportHeader6 }
     */
    public ReportHeader6 createReportHeader6() {
        return new ReportHeader6();
    }

    /**
     * Create an instance of {@link ResidenceLocation1Choice }
     * 
     * @return
     *     the new instance of {@link ResidenceLocation1Choice }
     */
    public ResidenceLocation1Choice createResidenceLocation1Choice() {
        return new ResidenceLocation1Choice();
    }

    /**
     * Create an instance of {@link ServiceTaxDesignation1 }
     * 
     * @return
     *     the new instance of {@link ServiceTaxDesignation1 }
     */
    public ServiceTaxDesignation1 createServiceTaxDesignation1() {
        return new ServiceTaxDesignation1();
    }

    /**
     * Create an instance of {@link StatementGroup4 }
     * 
     * @return
     *     the new instance of {@link StatementGroup4 }
     */
    public StatementGroup4 createStatementGroup4() {
        return new StatementGroup4();
    }

    /**
     * Create an instance of {@link TaxCalculation1 }
     * 
     * @return
     *     the new instance of {@link TaxCalculation1 }
     */
    public TaxCalculation1 createTaxCalculation1() {
        return new TaxCalculation1();
    }

    /**
     * Create an instance of {@link TaxReason1 }
     * 
     * @return
     *     the new instance of {@link TaxReason1 }
     */
    public TaxReason1 createTaxReason1() {
        return new TaxReason1();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Document }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Document }{@code >}
     */
    @XmlElementDecl(namespace = "urn:iso:std:iso:20022:tech:xsd:camt.086.001.04", name = "Document")
    public JAXBElement<Document> createDocument(Document value) {
        return new JAXBElement<>(_Document_QNAME, Document.class, null, value);
    }

}
