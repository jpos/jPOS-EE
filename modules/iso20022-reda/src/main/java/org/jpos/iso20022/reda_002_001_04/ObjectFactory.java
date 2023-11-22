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

package org.jpos.iso20022.reda_002_001_04;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.jpos.iso20022.reda_002_001_04 package. 
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

    private static final QName _Document_QNAME = new QName("urn:swift:xsd:reda.002.001.04", "Document");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.jpos.iso20022.reda_002_001_04
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
     * Create an instance of {@link ActiveCurrencyAnd13DecimalAmount }
     * 
     * @return
     *     the new instance of {@link ActiveCurrencyAnd13DecimalAmount }
     */
    public ActiveCurrencyAnd13DecimalAmount createActiveCurrencyAnd13DecimalAmount() {
        return new ActiveCurrencyAnd13DecimalAmount();
    }

    /**
     * Create an instance of {@link ActiveOrHistoricCurrencyAnd13DecimalAmount }
     * 
     * @return
     *     the new instance of {@link ActiveOrHistoricCurrencyAnd13DecimalAmount }
     */
    public ActiveOrHistoricCurrencyAnd13DecimalAmount createActiveOrHistoricCurrencyAnd13DecimalAmount() {
        return new ActiveOrHistoricCurrencyAnd13DecimalAmount();
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
     * Create an instance of {@link AdditionalReference3 }
     * 
     * @return
     *     the new instance of {@link AdditionalReference3 }
     */
    public AdditionalReference3 createAdditionalReference3() {
        return new AdditionalReference3();
    }

    /**
     * Create an instance of {@link AlternateSecurityIdentification1 }
     * 
     * @return
     *     the new instance of {@link AlternateSecurityIdentification1 }
     */
    public AlternateSecurityIdentification1 createAlternateSecurityIdentification1() {
        return new AlternateSecurityIdentification1();
    }

    /**
     * Create an instance of {@link Charge15 }
     * 
     * @return
     *     the new instance of {@link Charge15 }
     */
    public Charge15 createCharge15() {
        return new Charge15();
    }

    /**
     * Create an instance of {@link DateAndDateTime1Choice }
     * 
     * @return
     *     the new instance of {@link DateAndDateTime1Choice }
     */
    public DateAndDateTime1Choice createDateAndDateTime1Choice() {
        return new DateAndDateTime1Choice();
    }

    /**
     * Create an instance of {@link DateAndDateTimeChoice }
     * 
     * @return
     *     the new instance of {@link DateAndDateTimeChoice }
     */
    public DateAndDateTimeChoice createDateAndDateTimeChoice() {
        return new DateAndDateTimeChoice();
    }

    /**
     * Create an instance of {@link DateOrDateTimePeriodChoice }
     * 
     * @return
     *     the new instance of {@link DateOrDateTimePeriodChoice }
     */
    public DateOrDateTimePeriodChoice createDateOrDateTimePeriodChoice() {
        return new DateOrDateTimePeriodChoice();
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
     * Create an instance of {@link DateTimePeriodDetails }
     * 
     * @return
     *     the new instance of {@link DateTimePeriodDetails }
     */
    public DateTimePeriodDetails createDateTimePeriodDetails() {
        return new DateTimePeriodDetails();
    }

    /**
     * Create an instance of {@link Extension1 }
     * 
     * @return
     *     the new instance of {@link Extension1 }
     */
    public Extension1 createExtension1() {
        return new Extension1();
    }

    /**
     * Create an instance of {@link FinancialInstrument8 }
     * 
     * @return
     *     the new instance of {@link FinancialInstrument8 }
     */
    public FinancialInstrument8 createFinancialInstrument8() {
        return new FinancialInstrument8();
    }

    /**
     * Create an instance of {@link FinancialInstrumentQuantity1 }
     * 
     * @return
     *     the new instance of {@link FinancialInstrumentQuantity1 }
     */
    public FinancialInstrumentQuantity1 createFinancialInstrumentQuantity1() {
        return new FinancialInstrumentQuantity1();
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
     * Create an instance of {@link MessageIdentification1 }
     * 
     * @return
     *     the new instance of {@link MessageIdentification1 }
     */
    public MessageIdentification1 createMessageIdentification1() {
        return new MessageIdentification1();
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
     * Create an instance of {@link Pagination }
     * 
     * @return
     *     the new instance of {@link Pagination }
     */
    public Pagination createPagination() {
        return new Pagination();
    }

    /**
     * Create an instance of {@link PartyIdentification2Choice }
     * 
     * @return
     *     the new instance of {@link PartyIdentification2Choice }
     */
    public PartyIdentification2Choice createPartyIdentification2Choice() {
        return new PartyIdentification2Choice();
    }

    /**
     * Create an instance of {@link PerformanceFactors1 }
     * 
     * @return
     *     the new instance of {@link PerformanceFactors1 }
     */
    public PerformanceFactors1 createPerformanceFactors1() {
        return new PerformanceFactors1();
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
     * Create an instance of {@link PriceReport3 }
     * 
     * @return
     *     the new instance of {@link PriceReport3 }
     */
    public PriceReport3 createPriceReport3() {
        return new PriceReport3();
    }

    /**
     * Create an instance of {@link PriceReportCancellationV04 }
     * 
     * @return
     *     the new instance of {@link PriceReportCancellationV04 }
     */
    public PriceReportCancellationV04 createPriceReportCancellationV04() {
        return new PriceReportCancellationV04();
    }

    /**
     * Create an instance of {@link PriceType2 }
     * 
     * @return
     *     the new instance of {@link PriceType2 }
     */
    public PriceType2 createPriceType2() {
        return new PriceType2();
    }

    /**
     * Create an instance of {@link PriceValuation4 }
     * 
     * @return
     *     the new instance of {@link PriceValuation4 }
     */
    public PriceValuation4 createPriceValuation4() {
        return new PriceValuation4();
    }

    /**
     * Create an instance of {@link PriceValue1 }
     * 
     * @return
     *     the new instance of {@link PriceValue1 }
     */
    public PriceValue1 createPriceValue1() {
        return new PriceValue1();
    }

    /**
     * Create an instance of {@link PriceValue5 }
     * 
     * @return
     *     the new instance of {@link PriceValue5 }
     */
    public PriceValue5 createPriceValue5() {
        return new PriceValue5();
    }

    /**
     * Create an instance of {@link PriceValueChange1 }
     * 
     * @return
     *     the new instance of {@link PriceValueChange1 }
     */
    public PriceValueChange1 createPriceValueChange1() {
        return new PriceValueChange1();
    }

    /**
     * Create an instance of {@link SecurityIdentification3Choice }
     * 
     * @return
     *     the new instance of {@link SecurityIdentification3Choice }
     */
    public SecurityIdentification3Choice createSecurityIdentification3Choice() {
        return new SecurityIdentification3Choice();
    }

    /**
     * Create an instance of {@link StatisticsByPredefinedTimePeriods2 }
     * 
     * @return
     *     the new instance of {@link StatisticsByPredefinedTimePeriods2 }
     */
    public StatisticsByPredefinedTimePeriods2 createStatisticsByPredefinedTimePeriods2() {
        return new StatisticsByPredefinedTimePeriods2();
    }

    /**
     * Create an instance of {@link StatisticsByUserDefinedTimePeriod2 }
     * 
     * @return
     *     the new instance of {@link StatisticsByUserDefinedTimePeriod2 }
     */
    public StatisticsByUserDefinedTimePeriod2 createStatisticsByUserDefinedTimePeriod2() {
        return new StatisticsByUserDefinedTimePeriod2();
    }

    /**
     * Create an instance of {@link Tax17 }
     * 
     * @return
     *     the new instance of {@link Tax17 }
     */
    public Tax17 createTax17() {
        return new Tax17();
    }

    /**
     * Create an instance of {@link TaxCalculationInformation4 }
     * 
     * @return
     *     the new instance of {@link TaxCalculationInformation4 }
     */
    public TaxCalculationInformation4 createTaxCalculationInformation4() {
        return new TaxCalculationInformation4();
    }

    /**
     * Create an instance of {@link UnitPrice15 }
     * 
     * @return
     *     the new instance of {@link UnitPrice15 }
     */
    public UnitPrice15 createUnitPrice15() {
        return new UnitPrice15();
    }

    /**
     * Create an instance of {@link ValuationStatistics3 }
     * 
     * @return
     *     the new instance of {@link ValuationStatistics3 }
     */
    public ValuationStatistics3 createValuationStatistics3() {
        return new ValuationStatistics3();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Document }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Document }{@code >}
     */
    @XmlElementDecl(namespace = "urn:swift:xsd:reda.002.001.04", name = "Document")
    public JAXBElement<Document> createDocument(Document value) {
        return new JAXBElement<>(_Document_QNAME, Document.class, null, value);
    }

}
