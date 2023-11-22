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

package org.jpos.iso20022.camt_009_001_07;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.jpos.iso20022.camt_009_001_07 package. 
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

    private static final QName _Document_QNAME = new QName("urn:iso:std:iso:20022:tech:xsd:camt.009.001.07", "Document");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.jpos.iso20022.camt_009_001_07
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
     * Create an instance of {@link ActiveAmountRange3Choice }
     * 
     * @return
     *     the new instance of {@link ActiveAmountRange3Choice }
     */
    public ActiveAmountRange3Choice createActiveAmountRange3Choice() {
        return new ActiveAmountRange3Choice();
    }

    /**
     * Create an instance of {@link ActiveCurrencyAndAmountRange3 }
     * 
     * @return
     *     the new instance of {@link ActiveCurrencyAndAmountRange3 }
     */
    public ActiveCurrencyAndAmountRange3 createActiveCurrencyAndAmountRange3() {
        return new ActiveCurrencyAndAmountRange3();
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
     * Create an instance of {@link DateAndPeriod2Choice }
     * 
     * @return
     *     the new instance of {@link DateAndPeriod2Choice }
     */
    public DateAndPeriod2Choice createDateAndPeriod2Choice() {
        return new DateAndPeriod2Choice();
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
     * Create an instance of {@link FromToAmountRange1 }
     * 
     * @return
     *     the new instance of {@link FromToAmountRange1 }
     */
    public FromToAmountRange1 createFromToAmountRange1() {
        return new FromToAmountRange1();
    }

    /**
     * Create an instance of {@link FromToPercentageRange1 }
     * 
     * @return
     *     the new instance of {@link FromToPercentageRange1 }
     */
    public FromToPercentageRange1 createFromToPercentageRange1() {
        return new FromToPercentageRange1();
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
     * Create an instance of {@link GetLimitV07 }
     * 
     * @return
     *     the new instance of {@link GetLimitV07 }
     */
    public GetLimitV07 createGetLimitV07() {
        return new GetLimitV07();
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
     * Create an instance of {@link ImpliedCurrencyAndAmountRange1 }
     * 
     * @return
     *     the new instance of {@link ImpliedCurrencyAndAmountRange1 }
     */
    public ImpliedCurrencyAndAmountRange1 createImpliedCurrencyAndAmountRange1() {
        return new ImpliedCurrencyAndAmountRange1();
    }

    /**
     * Create an instance of {@link LimitCriteria6 }
     * 
     * @return
     *     the new instance of {@link LimitCriteria6 }
     */
    public LimitCriteria6 createLimitCriteria6() {
        return new LimitCriteria6();
    }

    /**
     * Create an instance of {@link LimitCriteria6Choice }
     * 
     * @return
     *     the new instance of {@link LimitCriteria6Choice }
     */
    public LimitCriteria6Choice createLimitCriteria6Choice() {
        return new LimitCriteria6Choice();
    }

    /**
     * Create an instance of {@link LimitQuery4 }
     * 
     * @return
     *     the new instance of {@link LimitQuery4 }
     */
    public LimitQuery4 createLimitQuery4() {
        return new LimitQuery4();
    }

    /**
     * Create an instance of {@link LimitReturnCriteria2 }
     * 
     * @return
     *     the new instance of {@link LimitReturnCriteria2 }
     */
    public LimitReturnCriteria2 createLimitReturnCriteria2() {
        return new LimitReturnCriteria2();
    }

    /**
     * Create an instance of {@link LimitSearchCriteria6 }
     * 
     * @return
     *     the new instance of {@link LimitSearchCriteria6 }
     */
    public LimitSearchCriteria6 createLimitSearchCriteria6() {
        return new LimitSearchCriteria6();
    }

    /**
     * Create an instance of {@link LimitType1Choice }
     * 
     * @return
     *     the new instance of {@link LimitType1Choice }
     */
    public LimitType1Choice createLimitType1Choice() {
        return new LimitType1Choice();
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
     * Create an instance of {@link MessageHeader9 }
     * 
     * @return
     *     the new instance of {@link MessageHeader9 }
     */
    public MessageHeader9 createMessageHeader9() {
        return new MessageHeader9();
    }

    /**
     * Create an instance of {@link PercentageRange1Choice }
     * 
     * @return
     *     the new instance of {@link PercentageRange1Choice }
     */
    public PercentageRange1Choice createPercentageRange1Choice() {
        return new PercentageRange1Choice();
    }

    /**
     * Create an instance of {@link PercentageRangeBoundary1 }
     * 
     * @return
     *     the new instance of {@link PercentageRangeBoundary1 }
     */
    public PercentageRangeBoundary1 createPercentageRangeBoundary1() {
        return new PercentageRangeBoundary1();
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
     * Create an instance of {@link PostalAddress24 }
     * 
     * @return
     *     the new instance of {@link PostalAddress24 }
     */
    public PostalAddress24 createPostalAddress24() {
        return new PostalAddress24();
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
     * Create an instance of {@link SystemIdentification2Choice }
     * 
     * @return
     *     the new instance of {@link SystemIdentification2Choice }
     */
    public SystemIdentification2Choice createSystemIdentification2Choice() {
        return new SystemIdentification2Choice();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Document }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Document }{@code >}
     */
    @XmlElementDecl(namespace = "urn:iso:std:iso:20022:tech:xsd:camt.009.001.07", name = "Document")
    public JAXBElement<Document> createDocument(Document value) {
        return new JAXBElement<>(_Document_QNAME, Document.class, null, value);
    }

}
