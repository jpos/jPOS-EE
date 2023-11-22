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

package org.jpos.iso20022.tsmt_009_001_05;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.jpos.iso20022.tsmt_009_001_05 package. 
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

    private static final QName _Document_QNAME = new QName("urn:iso:std:iso:20022:tech:xsd:tsmt.009.001.05", "Document");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.jpos.iso20022.tsmt_009_001_05
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
     * Create an instance of {@link Adjustment7 }
     * 
     * @return
     *     the new instance of {@link Adjustment7 }
     */
    public Adjustment7 createAdjustment7() {
        return new Adjustment7();
    }

    /**
     * Create an instance of {@link AdjustmentType1Choice }
     * 
     * @return
     *     the new instance of {@link AdjustmentType1Choice }
     */
    public AdjustmentType1Choice createAdjustmentType1Choice() {
        return new AdjustmentType1Choice();
    }

    /**
     * Create an instance of {@link AirportDescription1 }
     * 
     * @return
     *     the new instance of {@link AirportDescription1 }
     */
    public AirportDescription1 createAirportDescription1() {
        return new AirportDescription1();
    }

    /**
     * Create an instance of {@link AirportName1Choice }
     * 
     * @return
     *     the new instance of {@link AirportName1Choice }
     */
    public AirportName1Choice createAirportName1Choice() {
        return new AirportName1Choice();
    }

    /**
     * Create an instance of {@link AmountOrPercentage2Choice }
     * 
     * @return
     *     the new instance of {@link AmountOrPercentage2Choice }
     */
    public AmountOrPercentage2Choice createAmountOrPercentage2Choice() {
        return new AmountOrPercentage2Choice();
    }

    /**
     * Create an instance of {@link BICIdentification1 }
     * 
     * @return
     *     the new instance of {@link BICIdentification1 }
     */
    public BICIdentification1 createBICIdentification1() {
        return new BICIdentification1();
    }

    /**
     * Create an instance of {@link BPOApplicableRules1Choice }
     * 
     * @return
     *     the new instance of {@link BPOApplicableRules1Choice }
     */
    public BPOApplicableRules1Choice createBPOApplicableRules1Choice() {
        return new BPOApplicableRules1Choice();
    }

    /**
     * Create an instance of {@link Baseline5 }
     * 
     * @return
     *     the new instance of {@link Baseline5 }
     */
    public Baseline5 createBaseline5() {
        return new Baseline5();
    }

    /**
     * Create an instance of {@link BaselineAmendmentRequestV05 }
     * 
     * @return
     *     the new instance of {@link BaselineAmendmentRequestV05 }
     */
    public BaselineAmendmentRequestV05 createBaselineAmendmentRequestV05() {
        return new BaselineAmendmentRequestV05();
    }

    /**
     * Create an instance of {@link CashAccount24 }
     * 
     * @return
     *     the new instance of {@link CashAccount24 }
     */
    public CashAccount24 createCashAccount24() {
        return new CashAccount24();
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
     * Create an instance of {@link Charge24 }
     * 
     * @return
     *     the new instance of {@link Charge24 }
     */
    public Charge24 createCharge24() {
        return new Charge24();
    }

    /**
     * Create an instance of {@link Charges5 }
     * 
     * @return
     *     the new instance of {@link Charges5 }
     */
    public Charges5 createCharges5() {
        return new Charges5();
    }

    /**
     * Create an instance of {@link ChargesDetails3 }
     * 
     * @return
     *     the new instance of {@link ChargesDetails3 }
     */
    public ChargesDetails3 createChargesDetails3() {
        return new ChargesDetails3();
    }

    /**
     * Create an instance of {@link ChargesType1Choice }
     * 
     * @return
     *     the new instance of {@link ChargesType1Choice }
     */
    public ChargesType1Choice createChargesType1Choice() {
        return new ChargesType1Choice();
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
     * Create an instance of {@link ContactIdentification3 }
     * 
     * @return
     *     the new instance of {@link ContactIdentification3 }
     */
    public ContactIdentification3 createContactIdentification3() {
        return new ContactIdentification3();
    }

    /**
     * Create an instance of {@link CountrySubdivision1Choice }
     * 
     * @return
     *     the new instance of {@link CountrySubdivision1Choice }
     */
    public CountrySubdivision1Choice createCountrySubdivision1Choice() {
        return new CountrySubdivision1Choice();
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
     * Create an instance of {@link DocumentIdentification1 }
     * 
     * @return
     *     the new instance of {@link DocumentIdentification1 }
     */
    public DocumentIdentification1 createDocumentIdentification1() {
        return new DocumentIdentification1();
    }

    /**
     * Create an instance of {@link DocumentIdentification7 }
     * 
     * @return
     *     the new instance of {@link DocumentIdentification7 }
     */
    public DocumentIdentification7 createDocumentIdentification7() {
        return new DocumentIdentification7();
    }

    /**
     * Create an instance of {@link FinancialInstitutionIdentification4Choice }
     * 
     * @return
     *     the new instance of {@link FinancialInstitutionIdentification4Choice }
     */
    public FinancialInstitutionIdentification4Choice createFinancialInstitutionIdentification4Choice() {
        return new FinancialInstitutionIdentification4Choice();
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
     * Create an instance of {@link GenericIdentification1 }
     * 
     * @return
     *     the new instance of {@link GenericIdentification1 }
     */
    public GenericIdentification1 createGenericIdentification1() {
        return new GenericIdentification1();
    }

    /**
     * Create an instance of {@link GenericIdentification13 }
     * 
     * @return
     *     the new instance of {@link GenericIdentification13 }
     */
    public GenericIdentification13 createGenericIdentification13() {
        return new GenericIdentification13();
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
     * Create an instance of {@link Incoterms4 }
     * 
     * @return
     *     the new instance of {@link Incoterms4 }
     */
    public Incoterms4 createIncoterms4() {
        return new Incoterms4();
    }

    /**
     * Create an instance of {@link Incoterms4Choice }
     * 
     * @return
     *     the new instance of {@link Incoterms4Choice }
     */
    public Incoterms4Choice createIncoterms4Choice() {
        return new Incoterms4Choice();
    }

    /**
     * Create an instance of {@link LineItem13 }
     * 
     * @return
     *     the new instance of {@link LineItem13 }
     */
    public LineItem13 createLineItem13() {
        return new LineItem13();
    }

    /**
     * Create an instance of {@link LineItemDetails13 }
     * 
     * @return
     *     the new instance of {@link LineItemDetails13 }
     */
    public LineItemDetails13 createLineItemDetails13() {
        return new LineItemDetails13();
    }

    /**
     * Create an instance of {@link Location2 }
     * 
     * @return
     *     the new instance of {@link Location2 }
     */
    public Location2 createLocation2() {
        return new Location2();
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
     * Create an instance of {@link MultimodalTransport3 }
     * 
     * @return
     *     the new instance of {@link MultimodalTransport3 }
     */
    public MultimodalTransport3 createMultimodalTransport3() {
        return new MultimodalTransport3();
    }

    /**
     * Create an instance of {@link NameAndAddress6 }
     * 
     * @return
     *     the new instance of {@link NameAndAddress6 }
     */
    public NameAndAddress6 createNameAndAddress6() {
        return new NameAndAddress6();
    }

    /**
     * Create an instance of {@link PartyIdentification26 }
     * 
     * @return
     *     the new instance of {@link PartyIdentification26 }
     */
    public PartyIdentification26 createPartyIdentification26() {
        return new PartyIdentification26();
    }

    /**
     * Create an instance of {@link PartyIdentification27 }
     * 
     * @return
     *     the new instance of {@link PartyIdentification27 }
     */
    public PartyIdentification27 createPartyIdentification27() {
        return new PartyIdentification27();
    }

    /**
     * Create an instance of {@link PaymentCodeOrOther1Choice }
     * 
     * @return
     *     the new instance of {@link PaymentCodeOrOther1Choice }
     */
    public PaymentCodeOrOther1Choice createPaymentCodeOrOther1Choice() {
        return new PaymentCodeOrOther1Choice();
    }

    /**
     * Create an instance of {@link PaymentCodeOrOther2Choice }
     * 
     * @return
     *     the new instance of {@link PaymentCodeOrOther2Choice }
     */
    public PaymentCodeOrOther2Choice createPaymentCodeOrOther2Choice() {
        return new PaymentCodeOrOther2Choice();
    }

    /**
     * Create an instance of {@link PaymentObligation2 }
     * 
     * @return
     *     the new instance of {@link PaymentObligation2 }
     */
    public PaymentObligation2 createPaymentObligation2() {
        return new PaymentObligation2();
    }

    /**
     * Create an instance of {@link PaymentPeriod3 }
     * 
     * @return
     *     the new instance of {@link PaymentPeriod3 }
     */
    public PaymentPeriod3 createPaymentPeriod3() {
        return new PaymentPeriod3();
    }

    /**
     * Create an instance of {@link PaymentPeriod4 }
     * 
     * @return
     *     the new instance of {@link PaymentPeriod4 }
     */
    public PaymentPeriod4 createPaymentPeriod4() {
        return new PaymentPeriod4();
    }

    /**
     * Create an instance of {@link PaymentTerms4 }
     * 
     * @return
     *     the new instance of {@link PaymentTerms4 }
     */
    public PaymentTerms4 createPaymentTerms4() {
        return new PaymentTerms4();
    }

    /**
     * Create an instance of {@link PaymentTerms5 }
     * 
     * @return
     *     the new instance of {@link PaymentTerms5 }
     */
    public PaymentTerms5 createPaymentTerms5() {
        return new PaymentTerms5();
    }

    /**
     * Create an instance of {@link PercentageTolerance1 }
     * 
     * @return
     *     the new instance of {@link PercentageTolerance1 }
     */
    public PercentageTolerance1 createPercentageTolerance1() {
        return new PercentageTolerance1();
    }

    /**
     * Create an instance of {@link PostalAddress2 }
     * 
     * @return
     *     the new instance of {@link PostalAddress2 }
     */
    public PostalAddress2 createPostalAddress2() {
        return new PostalAddress2();
    }

    /**
     * Create an instance of {@link PostalAddress5 }
     * 
     * @return
     *     the new instance of {@link PostalAddress5 }
     */
    public PostalAddress5 createPostalAddress5() {
        return new PostalAddress5();
    }

    /**
     * Create an instance of {@link ProductCategory1 }
     * 
     * @return
     *     the new instance of {@link ProductCategory1 }
     */
    public ProductCategory1 createProductCategory1() {
        return new ProductCategory1();
    }

    /**
     * Create an instance of {@link ProductCategory1Choice }
     * 
     * @return
     *     the new instance of {@link ProductCategory1Choice }
     */
    public ProductCategory1Choice createProductCategory1Choice() {
        return new ProductCategory1Choice();
    }

    /**
     * Create an instance of {@link ProductCharacteristics1 }
     * 
     * @return
     *     the new instance of {@link ProductCharacteristics1 }
     */
    public ProductCharacteristics1 createProductCharacteristics1() {
        return new ProductCharacteristics1();
    }

    /**
     * Create an instance of {@link ProductCharacteristics1Choice }
     * 
     * @return
     *     the new instance of {@link ProductCharacteristics1Choice }
     */
    public ProductCharacteristics1Choice createProductCharacteristics1Choice() {
        return new ProductCharacteristics1Choice();
    }

    /**
     * Create an instance of {@link ProductIdentifier2 }
     * 
     * @return
     *     the new instance of {@link ProductIdentifier2 }
     */
    public ProductIdentifier2 createProductIdentifier2() {
        return new ProductIdentifier2();
    }

    /**
     * Create an instance of {@link ProductIdentifier2Choice }
     * 
     * @return
     *     the new instance of {@link ProductIdentifier2Choice }
     */
    public ProductIdentifier2Choice createProductIdentifier2Choice() {
        return new ProductIdentifier2Choice();
    }

    /**
     * Create an instance of {@link Quantity9 }
     * 
     * @return
     *     the new instance of {@link Quantity9 }
     */
    public Quantity9 createQuantity9() {
        return new Quantity9();
    }

    /**
     * Create an instance of {@link RequiredSubmission2 }
     * 
     * @return
     *     the new instance of {@link RequiredSubmission2 }
     */
    public RequiredSubmission2 createRequiredSubmission2() {
        return new RequiredSubmission2();
    }

    /**
     * Create an instance of {@link RequiredSubmission3 }
     * 
     * @return
     *     the new instance of {@link RequiredSubmission3 }
     */
    public RequiredSubmission3 createRequiredSubmission3() {
        return new RequiredSubmission3();
    }

    /**
     * Create an instance of {@link RequiredSubmission4 }
     * 
     * @return
     *     the new instance of {@link RequiredSubmission4 }
     */
    public RequiredSubmission4 createRequiredSubmission4() {
        return new RequiredSubmission4();
    }

    /**
     * Create an instance of {@link RequiredSubmission6 }
     * 
     * @return
     *     the new instance of {@link RequiredSubmission6 }
     */
    public RequiredSubmission6 createRequiredSubmission6() {
        return new RequiredSubmission6();
    }

    /**
     * Create an instance of {@link SettlementTerms3 }
     * 
     * @return
     *     the new instance of {@link SettlementTerms3 }
     */
    public SettlementTerms3 createSettlementTerms3() {
        return new SettlementTerms3();
    }

    /**
     * Create an instance of {@link ShipmentDateRange1 }
     * 
     * @return
     *     the new instance of {@link ShipmentDateRange1 }
     */
    public ShipmentDateRange1 createShipmentDateRange1() {
        return new ShipmentDateRange1();
    }

    /**
     * Create an instance of {@link ShipmentDateRange2 }
     * 
     * @return
     *     the new instance of {@link ShipmentDateRange2 }
     */
    public ShipmentDateRange2 createShipmentDateRange2() {
        return new ShipmentDateRange2();
    }

    /**
     * Create an instance of {@link ShipmentSchedule2Choice }
     * 
     * @return
     *     the new instance of {@link ShipmentSchedule2Choice }
     */
    public ShipmentSchedule2Choice createShipmentSchedule2Choice() {
        return new ShipmentSchedule2Choice();
    }

    /**
     * Create an instance of {@link SimpleIdentificationInformation }
     * 
     * @return
     *     the new instance of {@link SimpleIdentificationInformation }
     */
    public SimpleIdentificationInformation createSimpleIdentificationInformation() {
        return new SimpleIdentificationInformation();
    }

    /**
     * Create an instance of {@link SingleTransport7 }
     * 
     * @return
     *     the new instance of {@link SingleTransport7 }
     */
    public SingleTransport7 createSingleTransport7() {
        return new SingleTransport7();
    }

    /**
     * Create an instance of {@link Tax23 }
     * 
     * @return
     *     the new instance of {@link Tax23 }
     */
    public Tax23 createTax23() {
        return new Tax23();
    }

    /**
     * Create an instance of {@link TaxType2Choice }
     * 
     * @return
     *     the new instance of {@link TaxType2Choice }
     */
    public TaxType2Choice createTaxType2Choice() {
        return new TaxType2Choice();
    }

    /**
     * Create an instance of {@link TransportByAir5 }
     * 
     * @return
     *     the new instance of {@link TransportByAir5 }
     */
    public TransportByAir5 createTransportByAir5() {
        return new TransportByAir5();
    }

    /**
     * Create an instance of {@link TransportByRail5 }
     * 
     * @return
     *     the new instance of {@link TransportByRail5 }
     */
    public TransportByRail5 createTransportByRail5() {
        return new TransportByRail5();
    }

    /**
     * Create an instance of {@link TransportByRoad5 }
     * 
     * @return
     *     the new instance of {@link TransportByRoad5 }
     */
    public TransportByRoad5 createTransportByRoad5() {
        return new TransportByRoad5();
    }

    /**
     * Create an instance of {@link TransportBySea6 }
     * 
     * @return
     *     the new instance of {@link TransportBySea6 }
     */
    public TransportBySea6 createTransportBySea6() {
        return new TransportBySea6();
    }

    /**
     * Create an instance of {@link TransportMeans5 }
     * 
     * @return
     *     the new instance of {@link TransportMeans5 }
     */
    public TransportMeans5 createTransportMeans5() {
        return new TransportMeans5();
    }

    /**
     * Create an instance of {@link UnitOfMeasure3Choice }
     * 
     * @return
     *     the new instance of {@link UnitOfMeasure3Choice }
     */
    public UnitOfMeasure3Choice createUnitOfMeasure3Choice() {
        return new UnitOfMeasure3Choice();
    }

    /**
     * Create an instance of {@link UnitPrice18 }
     * 
     * @return
     *     the new instance of {@link UnitPrice18 }
     */
    public UnitPrice18 createUnitPrice18() {
        return new UnitPrice18();
    }

    /**
     * Create an instance of {@link UserDefinedInformation1 }
     * 
     * @return
     *     the new instance of {@link UserDefinedInformation1 }
     */
    public UserDefinedInformation1 createUserDefinedInformation1() {
        return new UserDefinedInformation1();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Document }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Document }{@code >}
     */
    @XmlElementDecl(namespace = "urn:iso:std:iso:20022:tech:xsd:tsmt.009.001.05", name = "Document")
    public JAXBElement<Document> createDocument(Document value) {
        return new JAXBElement<>(_Document_QNAME, Document.class, null, value);
    }

}
