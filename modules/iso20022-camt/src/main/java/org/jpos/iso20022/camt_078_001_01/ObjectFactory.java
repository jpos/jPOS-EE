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

package org.jpos.iso20022.camt_078_001_01;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.jpos.iso20022.camt_078_001_01 package. 
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

    private static final QName _Document_QNAME = new QName("urn:iso:std:iso:20022:tech:xsd:camt.078.001.01", "Document");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.jpos.iso20022.camt_078_001_01
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
     * Create an instance of {@link AccountIdentificationSearchCriteria2Choice }
     * 
     * @return
     *     the new instance of {@link AccountIdentificationSearchCriteria2Choice }
     */
    public AccountIdentificationSearchCriteria2Choice createAccountIdentificationSearchCriteria2Choice() {
        return new AccountIdentificationSearchCriteria2Choice();
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
     * Create an instance of {@link AmountRangeBoundary1 }
     * 
     * @return
     *     the new instance of {@link AmountRangeBoundary1 }
     */
    public AmountRangeBoundary1 createAmountRangeBoundary1() {
        return new AmountRangeBoundary1();
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
     * Create an instance of {@link DateAndDateTimeSearch5Choice }
     * 
     * @return
     *     the new instance of {@link DateAndDateTimeSearch5Choice }
     */
    public DateAndDateTimeSearch5Choice createDateAndDateTimeSearch5Choice() {
        return new DateAndDateTimeSearch5Choice();
    }

    /**
     * Create an instance of {@link DatePeriod2 }
     * 
     * @return
     *     the new instance of {@link DatePeriod2 }
     */
    public DatePeriod2 createDatePeriod2() {
        return new DatePeriod2();
    }

    /**
     * Create an instance of {@link DatePeriodSearch1Choice }
     * 
     * @return
     *     the new instance of {@link DatePeriodSearch1Choice }
     */
    public DatePeriodSearch1Choice createDatePeriodSearch1Choice() {
        return new DatePeriodSearch1Choice();
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
     * Create an instance of {@link DateTimeSearch2Choice }
     * 
     * @return
     *     the new instance of {@link DateTimeSearch2Choice }
     */
    public DateTimeSearch2Choice createDateTimeSearch2Choice() {
        return new DateTimeSearch2Choice();
    }

    /**
     * Create an instance of {@link DocumentIdentification51 }
     * 
     * @return
     *     the new instance of {@link DocumentIdentification51 }
     */
    public DocumentIdentification51 createDocumentIdentification51() {
        return new DocumentIdentification51();
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
     * Create an instance of {@link FromToAmountRange1 }
     * 
     * @return
     *     the new instance of {@link FromToAmountRange1 }
     */
    public FromToAmountRange1 createFromToAmountRange1() {
        return new FromToAmountRange1();
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
     * Create an instance of {@link ImpliedCurrencyAmountRange1Choice }
     * 
     * @return
     *     the new instance of {@link ImpliedCurrencyAmountRange1Choice }
     */
    public ImpliedCurrencyAmountRange1Choice createImpliedCurrencyAmountRange1Choice() {
        return new ImpliedCurrencyAmountRange1Choice();
    }

    /**
     * Create an instance of {@link IntraBalanceMovementQueryV01 }
     * 
     * @return
     *     the new instance of {@link IntraBalanceMovementQueryV01 }
     */
    public IntraBalanceMovementQueryV01 createIntraBalanceMovementQueryV01() {
        return new IntraBalanceMovementQueryV01();
    }

    /**
     * Create an instance of {@link IntraBalanceQueryCriteria9 }
     * 
     * @return
     *     the new instance of {@link IntraBalanceQueryCriteria9 }
     */
    public IntraBalanceQueryCriteria9 createIntraBalanceQueryCriteria9() {
        return new IntraBalanceQueryCriteria9();
    }

    /**
     * Create an instance of {@link IntraBalanceQueryDefinition9 }
     * 
     * @return
     *     the new instance of {@link IntraBalanceQueryDefinition9 }
     */
    public IntraBalanceQueryDefinition9 createIntraBalanceQueryDefinition9() {
        return new IntraBalanceQueryDefinition9();
    }

    /**
     * Create an instance of {@link IntraBalanceQueryStatus3 }
     * 
     * @return
     *     the new instance of {@link IntraBalanceQueryStatus3 }
     */
    public IntraBalanceQueryStatus3 createIntraBalanceQueryStatus3() {
        return new IntraBalanceQueryStatus3();
    }

    /**
     * Create an instance of {@link IntraBalanceStatusType2 }
     * 
     * @return
     *     the new instance of {@link IntraBalanceStatusType2 }
     */
    public IntraBalanceStatusType2 createIntraBalanceStatusType2() {
        return new IntraBalanceStatusType2();
    }

    /**
     * Create an instance of {@link IntraBalanceType3 }
     * 
     * @return
     *     the new instance of {@link IntraBalanceType3 }
     */
    public IntraBalanceType3 createIntraBalanceType3() {
        return new IntraBalanceType3();
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
     * Create an instance of {@link PartyIdentification120Choice }
     * 
     * @return
     *     the new instance of {@link PartyIdentification120Choice }
     */
    public PartyIdentification120Choice createPartyIdentification120Choice() {
        return new PartyIdentification120Choice();
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
     * Create an instance of {@link ProcessingStatus68Choice }
     * 
     * @return
     *     the new instance of {@link ProcessingStatus68Choice }
     */
    public ProcessingStatus68Choice createProcessingStatus68Choice() {
        return new ProcessingStatus68Choice();
    }

    /**
     * Create an instance of {@link ProprietaryReason4 }
     * 
     * @return
     *     the new instance of {@link ProprietaryReason4 }
     */
    public ProprietaryReason4 createProprietaryReason4() {
        return new ProprietaryReason4();
    }

    /**
     * Create an instance of {@link References36Choice }
     * 
     * @return
     *     the new instance of {@link References36Choice }
     */
    public References36Choice createReferences36Choice() {
        return new References36Choice();
    }

    /**
     * Create an instance of {@link SettlementStatus26Choice }
     * 
     * @return
     *     the new instance of {@link SettlementStatus26Choice }
     */
    public SettlementStatus26Choice createSettlementStatus26Choice() {
        return new SettlementStatus26Choice();
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
     * Create an instance of {@link JAXBElement }{@code <}{@link Document }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Document }{@code >}
     */
    @XmlElementDecl(namespace = "urn:iso:std:iso:20022:tech:xsd:camt.078.001.01", name = "Document")
    public JAXBElement<Document> createDocument(Document value) {
        return new JAXBElement<>(_Document_QNAME, Document.class, null, value);
    }

}
