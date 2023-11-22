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

package org.jpos.iso20022.camt_041_001_04;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.jpos.iso20022.camt_041_001_04 package. 
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

    private static final QName _Document_QNAME = new QName("urn:swift:xsd:camt.041.001.04", "Document");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.jpos.iso20022.camt_041_001_04
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
     * Create an instance of {@link CashInForecast6 }
     * 
     * @return
     *     the new instance of {@link CashInForecast6 }
     */
    public CashInForecast6 createCashInForecast6() {
        return new CashInForecast6();
    }

    /**
     * Create an instance of {@link CashInOutForecast7 }
     * 
     * @return
     *     the new instance of {@link CashInOutForecast7 }
     */
    public CashInOutForecast7 createCashInOutForecast7() {
        return new CashInOutForecast7();
    }

    /**
     * Create an instance of {@link CashOutForecast6 }
     * 
     * @return
     *     the new instance of {@link CashOutForecast6 }
     */
    public CashOutForecast6 createCashOutForecast6() {
        return new CashOutForecast6();
    }

    /**
     * Create an instance of {@link CurrencyDesignation1 }
     * 
     * @return
     *     the new instance of {@link CurrencyDesignation1 }
     */
    public CurrencyDesignation1 createCurrencyDesignation1() {
        return new CurrencyDesignation1();
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
     * Create an instance of {@link Extension1 }
     * 
     * @return
     *     the new instance of {@link Extension1 }
     */
    public Extension1 createExtension1() {
        return new Extension1();
    }

    /**
     * Create an instance of {@link FinancialInstrument9 }
     * 
     * @return
     *     the new instance of {@link FinancialInstrument9 }
     */
    public FinancialInstrument9 createFinancialInstrument9() {
        return new FinancialInstrument9();
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
     * Create an instance of {@link ForeignExchangeTerms19 }
     * 
     * @return
     *     the new instance of {@link ForeignExchangeTerms19 }
     */
    public ForeignExchangeTerms19 createForeignExchangeTerms19() {
        return new ForeignExchangeTerms19();
    }

    /**
     * Create an instance of {@link Fund2 }
     * 
     * @return
     *     the new instance of {@link Fund2 }
     */
    public Fund2 createFund2() {
        return new Fund2();
    }

    /**
     * Create an instance of {@link FundBalance1 }
     * 
     * @return
     *     the new instance of {@link FundBalance1 }
     */
    public FundBalance1 createFundBalance1() {
        return new FundBalance1();
    }

    /**
     * Create an instance of {@link FundCashForecast7 }
     * 
     * @return
     *     the new instance of {@link FundCashForecast7 }
     */
    public FundCashForecast7 createFundCashForecast7() {
        return new FundCashForecast7();
    }

    /**
     * Create an instance of {@link FundConfirmedCashForecastReportV04 }
     * 
     * @return
     *     the new instance of {@link FundConfirmedCashForecastReportV04 }
     */
    public FundConfirmedCashForecastReportV04 createFundConfirmedCashForecastReportV04() {
        return new FundConfirmedCashForecastReportV04();
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
     * Create an instance of {@link GenericIdentification47 }
     * 
     * @return
     *     the new instance of {@link GenericIdentification47 }
     */
    public GenericIdentification47 createGenericIdentification47() {
        return new GenericIdentification47();
    }

    /**
     * Create an instance of {@link IdentificationSource5Choice }
     * 
     * @return
     *     the new instance of {@link IdentificationSource5Choice }
     */
    public IdentificationSource5Choice createIdentificationSource5Choice() {
        return new IdentificationSource5Choice();
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
     * Create an instance of {@link NetCashForecast3 }
     * 
     * @return
     *     the new instance of {@link NetCashForecast3 }
     */
    public NetCashForecast3 createNetCashForecast3() {
        return new NetCashForecast3();
    }

    /**
     * Create an instance of {@link NetCashForecast4 }
     * 
     * @return
     *     the new instance of {@link NetCashForecast4 }
     */
    public NetCashForecast4 createNetCashForecast4() {
        return new NetCashForecast4();
    }

    /**
     * Create an instance of {@link NetCashForecast5 }
     * 
     * @return
     *     the new instance of {@link NetCashForecast5 }
     */
    public NetCashForecast5 createNetCashForecast5() {
        return new NetCashForecast5();
    }

    /**
     * Create an instance of {@link OtherIdentification4 }
     * 
     * @return
     *     the new instance of {@link OtherIdentification4 }
     */
    public OtherIdentification4 createOtherIdentification4() {
        return new OtherIdentification4();
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
     * Create an instance of {@link PostalAddress1 }
     * 
     * @return
     *     the new instance of {@link PostalAddress1 }
     */
    public PostalAddress1 createPostalAddress1() {
        return new PostalAddress1();
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
     * Create an instance of {@link SecurityIdentification3Choice }
     * 
     * @return
     *     the new instance of {@link SecurityIdentification3Choice }
     */
    public SecurityIdentification3Choice createSecurityIdentification3Choice() {
        return new SecurityIdentification3Choice();
    }

    /**
     * Create an instance of {@link UnitPrice19 }
     * 
     * @return
     *     the new instance of {@link UnitPrice19 }
     */
    public UnitPrice19 createUnitPrice19() {
        return new UnitPrice19();
    }

    /**
     * Create an instance of {@link UnitPriceType2Choice }
     * 
     * @return
     *     the new instance of {@link UnitPriceType2Choice }
     */
    public UnitPriceType2Choice createUnitPriceType2Choice() {
        return new UnitPriceType2Choice();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Document }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Document }{@code >}
     */
    @XmlElementDecl(namespace = "urn:swift:xsd:camt.041.001.04", name = "Document")
    public JAXBElement<Document> createDocument(Document value) {
        return new JAXBElement<>(_Document_QNAME, Document.class, null, value);
    }

}
