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

package org.jpos.iso20022.tsmt_014_001_05;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.jpos.iso20022.tsmt_014_001_05 package. 
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

    private static final QName _Document_QNAME = new QName("urn:iso:std:iso:20022:tech:xsd:tsmt.014.001.05", "Document");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.jpos.iso20022.tsmt_014_001_05
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
     * Create an instance of {@link Adjustment6 }
     * 
     * @return
     *     the new instance of {@link Adjustment6 }
     */
    public Adjustment6 createAdjustment6() {
        return new Adjustment6();
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
     * Create an instance of {@link CertificateDataSet2 }
     * 
     * @return
     *     the new instance of {@link CertificateDataSet2 }
     */
    public CertificateDataSet2 createCertificateDataSet2() {
        return new CertificateDataSet2();
    }

    /**
     * Create an instance of {@link CertifiedCharacteristics2Choice }
     * 
     * @return
     *     the new instance of {@link CertifiedCharacteristics2Choice }
     */
    public CertifiedCharacteristics2Choice createCertifiedCharacteristics2Choice() {
        return new CertifiedCharacteristics2Choice();
    }

    /**
     * Create an instance of {@link Charge25 }
     * 
     * @return
     *     the new instance of {@link Charge25 }
     */
    public Charge25 createCharge25() {
        return new Charge25();
    }

    /**
     * Create an instance of {@link ChargesDetails4 }
     * 
     * @return
     *     the new instance of {@link ChargesDetails4 }
     */
    public ChargesDetails4 createChargesDetails4() {
        return new ChargesDetails4();
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
     * Create an instance of {@link CommercialDataSet5 }
     * 
     * @return
     *     the new instance of {@link CommercialDataSet5 }
     */
    public CommercialDataSet5 createCommercialDataSet5() {
        return new CommercialDataSet5();
    }

    /**
     * Create an instance of {@link Consignment3 }
     * 
     * @return
     *     the new instance of {@link Consignment3 }
     */
    public Consignment3 createConsignment3() {
        return new Consignment3();
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
     * Create an instance of {@link DataSetSubmissionReferences3 }
     * 
     * @return
     *     the new instance of {@link DataSetSubmissionReferences3 }
     */
    public DataSetSubmissionReferences3 createDataSetSubmissionReferences3() {
        return new DataSetSubmissionReferences3();
    }

    /**
     * Create an instance of {@link DataSetSubmissionV05 }
     * 
     * @return
     *     the new instance of {@link DataSetSubmissionV05 }
     */
    public DataSetSubmissionV05 createDataSetSubmissionV05() {
        return new DataSetSubmissionV05();
    }

    /**
     * Create an instance of {@link DatePeriodDetails }
     * 
     * @return
     *     the new instance of {@link DatePeriodDetails }
     */
    public DatePeriodDetails createDatePeriodDetails() {
        return new DatePeriodDetails();
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
     * Create an instance of {@link InstructionType3 }
     * 
     * @return
     *     the new instance of {@link InstructionType3 }
     */
    public InstructionType3 createInstructionType3() {
        return new InstructionType3();
    }

    /**
     * Create an instance of {@link InsuranceDataSet1 }
     * 
     * @return
     *     the new instance of {@link InsuranceDataSet1 }
     */
    public InsuranceDataSet1 createInsuranceDataSet1() {
        return new InsuranceDataSet1();
    }

    /**
     * Create an instance of {@link InvoiceIdentification1 }
     * 
     * @return
     *     the new instance of {@link InvoiceIdentification1 }
     */
    public InvoiceIdentification1 createInvoiceIdentification1() {
        return new InvoiceIdentification1();
    }

    /**
     * Create an instance of {@link LineItem15 }
     * 
     * @return
     *     the new instance of {@link LineItem15 }
     */
    public LineItem15 createLineItem15() {
        return new LineItem15();
    }

    /**
     * Create an instance of {@link LineItemAndPOIdentification1 }
     * 
     * @return
     *     the new instance of {@link LineItemAndPOIdentification1 }
     */
    public LineItemAndPOIdentification1 createLineItemAndPOIdentification1() {
        return new LineItemAndPOIdentification1();
    }

    /**
     * Create an instance of {@link LineItemDetails14 }
     * 
     * @return
     *     the new instance of {@link LineItemDetails14 }
     */
    public LineItemDetails14 createLineItemDetails14() {
        return new LineItemDetails14();
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
     * Create an instance of {@link OtherCertificateDataSet2 }
     * 
     * @return
     *     the new instance of {@link OtherCertificateDataSet2 }
     */
    public OtherCertificateDataSet2 createOtherCertificateDataSet2() {
        return new OtherCertificateDataSet2();
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
     * Create an instance of {@link PartyIdentification29Choice }
     * 
     * @return
     *     the new instance of {@link PartyIdentification29Choice }
     */
    public PartyIdentification29Choice createPartyIdentification29Choice() {
        return new PartyIdentification29Choice();
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
     * Create an instance of {@link PaymentPeriod3 }
     * 
     * @return
     *     the new instance of {@link PaymentPeriod3 }
     */
    public PaymentPeriod3 createPaymentPeriod3() {
        return new PaymentPeriod3();
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
     * Create an instance of {@link Quantity10 }
     * 
     * @return
     *     the new instance of {@link Quantity10 }
     */
    public Quantity10 createQuantity10() {
        return new Quantity10();
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
     * Create an instance of {@link SettlementTerms3 }
     * 
     * @return
     *     the new instance of {@link SettlementTerms3 }
     */
    public SettlementTerms3 createSettlementTerms3() {
        return new SettlementTerms3();
    }

    /**
     * Create an instance of {@link ShipmentDate1Choice }
     * 
     * @return
     *     the new instance of {@link ShipmentDate1Choice }
     */
    public ShipmentDate1Choice createShipmentDate1Choice() {
        return new ShipmentDate1Choice();
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
     * Create an instance of {@link SingleTransport3 }
     * 
     * @return
     *     the new instance of {@link SingleTransport3 }
     */
    public SingleTransport3 createSingleTransport3() {
        return new SingleTransport3();
    }

    /**
     * Create an instance of {@link SingleTransport8 }
     * 
     * @return
     *     the new instance of {@link SingleTransport8 }
     */
    public SingleTransport8 createSingleTransport8() {
        return new SingleTransport8();
    }

    /**
     * Create an instance of {@link Tax22 }
     * 
     * @return
     *     the new instance of {@link Tax22 }
     */
    public Tax22 createTax22() {
        return new Tax22();
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
     * Create an instance of {@link TransportByAir2 }
     * 
     * @return
     *     the new instance of {@link TransportByAir2 }
     */
    public TransportByAir2 createTransportByAir2() {
        return new TransportByAir2();
    }

    /**
     * Create an instance of {@link TransportByAir4 }
     * 
     * @return
     *     the new instance of {@link TransportByAir4 }
     */
    public TransportByAir4 createTransportByAir4() {
        return new TransportByAir4();
    }

    /**
     * Create an instance of {@link TransportByRail2 }
     * 
     * @return
     *     the new instance of {@link TransportByRail2 }
     */
    public TransportByRail2 createTransportByRail2() {
        return new TransportByRail2();
    }

    /**
     * Create an instance of {@link TransportByRail4 }
     * 
     * @return
     *     the new instance of {@link TransportByRail4 }
     */
    public TransportByRail4 createTransportByRail4() {
        return new TransportByRail4();
    }

    /**
     * Create an instance of {@link TransportByRoad2 }
     * 
     * @return
     *     the new instance of {@link TransportByRoad2 }
     */
    public TransportByRoad2 createTransportByRoad2() {
        return new TransportByRoad2();
    }

    /**
     * Create an instance of {@link TransportByRoad4 }
     * 
     * @return
     *     the new instance of {@link TransportByRoad4 }
     */
    public TransportByRoad4 createTransportByRoad4() {
        return new TransportByRoad4();
    }

    /**
     * Create an instance of {@link TransportBySea4 }
     * 
     * @return
     *     the new instance of {@link TransportBySea4 }
     */
    public TransportBySea4 createTransportBySea4() {
        return new TransportBySea4();
    }

    /**
     * Create an instance of {@link TransportBySea5 }
     * 
     * @return
     *     the new instance of {@link TransportBySea5 }
     */
    public TransportBySea5 createTransportBySea5() {
        return new TransportBySea5();
    }

    /**
     * Create an instance of {@link TransportDataSet5 }
     * 
     * @return
     *     the new instance of {@link TransportDataSet5 }
     */
    public TransportDataSet5 createTransportDataSet5() {
        return new TransportDataSet5();
    }

    /**
     * Create an instance of {@link TransportDetails4 }
     * 
     * @return
     *     the new instance of {@link TransportDetails4 }
     */
    public TransportDetails4 createTransportDetails4() {
        return new TransportDetails4();
    }

    /**
     * Create an instance of {@link TransportMeans6 }
     * 
     * @return
     *     the new instance of {@link TransportMeans6 }
     */
    public TransportMeans6 createTransportMeans6() {
        return new TransportMeans6();
    }

    /**
     * Create an instance of {@link TransportedGoods1 }
     * 
     * @return
     *     the new instance of {@link TransportedGoods1 }
     */
    public TransportedGoods1 createTransportedGoods1() {
        return new TransportedGoods1();
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
    @XmlElementDecl(namespace = "urn:iso:std:iso:20022:tech:xsd:tsmt.014.001.05", name = "Document")
    public JAXBElement<Document> createDocument(Document value) {
        return new JAXBElement<>(_Document_QNAME, Document.class, null, value);
    }

}
