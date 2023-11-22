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

package org.jpos.iso20022.semt_005_001_02;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.jpos.iso20022.semt_005_001_02 package. 
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

    private static final QName _Document_QNAME = new QName("urn:swift:xsd:semt.005.001.02", "Document");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.jpos.iso20022.semt_005_001_02
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
     * Create an instance of {@link Account7 }
     * 
     * @return
     *     the new instance of {@link Account7 }
     */
    public Account7 createAccount7() {
        return new Account7();
    }

    /**
     * Create an instance of {@link AccountIdentification1 }
     * 
     * @return
     *     the new instance of {@link AccountIdentification1 }
     */
    public AccountIdentification1 createAccountIdentification1() {
        return new AccountIdentification1();
    }

    /**
     * Create an instance of {@link AccountIdentification3 }
     * 
     * @return
     *     the new instance of {@link AccountIdentification3 }
     */
    public AccountIdentification3 createAccountIdentification3() {
        return new AccountIdentification3();
    }

    /**
     * Create an instance of {@link AccountIdentificationAndPurpose }
     * 
     * @return
     *     the new instance of {@link AccountIdentificationAndPurpose }
     */
    public AccountIdentificationAndPurpose createAccountIdentificationAndPurpose() {
        return new AccountIdentificationAndPurpose();
    }

    /**
     * Create an instance of {@link AccountIdentificationFormatChoice }
     * 
     * @return
     *     the new instance of {@link AccountIdentificationFormatChoice }
     */
    public AccountIdentificationFormatChoice createAccountIdentificationFormatChoice() {
        return new AccountIdentificationFormatChoice();
    }

    /**
     * Create an instance of {@link AccountingStatementOfHoldings2 }
     * 
     * @return
     *     the new instance of {@link AccountingStatementOfHoldings2 }
     */
    public AccountingStatementOfHoldings2 createAccountingStatementOfHoldings2() {
        return new AccountingStatementOfHoldings2();
    }

    /**
     * Create an instance of {@link AccountingStatementOfHoldingsCancellationV02 }
     * 
     * @return
     *     the new instance of {@link AccountingStatementOfHoldingsCancellationV02 }
     */
    public AccountingStatementOfHoldingsCancellationV02 createAccountingStatementOfHoldingsCancellationV02() {
        return new AccountingStatementOfHoldingsCancellationV02();
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
     * Create an instance of {@link AdditionalBalanceInformation2 }
     * 
     * @return
     *     the new instance of {@link AdditionalBalanceInformation2 }
     */
    public AdditionalBalanceInformation2 createAdditionalBalanceInformation2() {
        return new AdditionalBalanceInformation2();
    }

    /**
     * Create an instance of {@link AdditionalReference2 }
     * 
     * @return
     *     the new instance of {@link AdditionalReference2 }
     */
    public AdditionalReference2 createAdditionalReference2() {
        return new AdditionalReference2();
    }

    /**
     * Create an instance of {@link AggregateBalanceInformation3 }
     * 
     * @return
     *     the new instance of {@link AggregateBalanceInformation3 }
     */
    public AggregateBalanceInformation3 createAggregateBalanceInformation3() {
        return new AggregateBalanceInformation3();
    }

    /**
     * Create an instance of {@link AggregateBalancePerSafekeepingPlace4 }
     * 
     * @return
     *     the new instance of {@link AggregateBalancePerSafekeepingPlace4 }
     */
    public AggregateBalancePerSafekeepingPlace4 createAggregateBalancePerSafekeepingPlace4() {
        return new AggregateBalancePerSafekeepingPlace4();
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
     * Create an instance of {@link BalanceQuantity1Choice }
     * 
     * @return
     *     the new instance of {@link BalanceQuantity1Choice }
     */
    public BalanceQuantity1Choice createBalanceQuantity1Choice() {
        return new BalanceQuantity1Choice();
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
     * Create an instance of {@link FinancialInstrument13 }
     * 
     * @return
     *     the new instance of {@link FinancialInstrument13 }
     */
    public FinancialInstrument13 createFinancialInstrument13() {
        return new FinancialInstrument13();
    }

    /**
     * Create an instance of {@link FinancialInstrumentQuantityChoice }
     * 
     * @return
     *     the new instance of {@link FinancialInstrumentQuantityChoice }
     */
    public FinancialInstrumentQuantityChoice createFinancialInstrumentQuantityChoice() {
        return new FinancialInstrumentQuantityChoice();
    }

    /**
     * Create an instance of {@link ForeignExchangeTerms6 }
     * 
     * @return
     *     the new instance of {@link ForeignExchangeTerms6 }
     */
    public ForeignExchangeTerms6 createForeignExchangeTerms6() {
        return new ForeignExchangeTerms6();
    }

    /**
     * Create an instance of {@link FrequencyCodeAndDSSCode1Choice }
     * 
     * @return
     *     the new instance of {@link FrequencyCodeAndDSSCode1Choice }
     */
    public FrequencyCodeAndDSSCode1Choice createFrequencyCodeAndDSSCode1Choice() {
        return new FrequencyCodeAndDSSCode1Choice();
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
     * Create an instance of {@link GenericIdentification5 }
     * 
     * @return
     *     the new instance of {@link GenericIdentification5 }
     */
    public GenericIdentification5 createGenericIdentification5() {
        return new GenericIdentification5();
    }

    /**
     * Create an instance of {@link GenericIdentification6 }
     * 
     * @return
     *     the new instance of {@link GenericIdentification6 }
     */
    public GenericIdentification6 createGenericIdentification6() {
        return new GenericIdentification6();
    }

    /**
     * Create an instance of {@link GenericIdentification7 }
     * 
     * @return
     *     the new instance of {@link GenericIdentification7 }
     */
    public GenericIdentification7 createGenericIdentification7() {
        return new GenericIdentification7();
    }

    /**
     * Create an instance of {@link Intermediary11 }
     * 
     * @return
     *     the new instance of {@link Intermediary11 }
     */
    public Intermediary11 createIntermediary11() {
        return new Intermediary11();
    }

    /**
     * Create an instance of {@link LongPostalAddress1Choice }
     * 
     * @return
     *     the new instance of {@link LongPostalAddress1Choice }
     */
    public LongPostalAddress1Choice createLongPostalAddress1Choice() {
        return new LongPostalAddress1Choice();
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
     * Create an instance of {@link NameAndAddress2 }
     * 
     * @return
     *     the new instance of {@link NameAndAddress2 }
     */
    public NameAndAddress2 createNameAndAddress2() {
        return new NameAndAddress2();
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
     * Create an instance of {@link PartyIdentification1Choice }
     * 
     * @return
     *     the new instance of {@link PartyIdentification1Choice }
     */
    public PartyIdentification1Choice createPartyIdentification1Choice() {
        return new PartyIdentification1Choice();
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
     * Create an instance of {@link PartyIdentification3 }
     * 
     * @return
     *     the new instance of {@link PartyIdentification3 }
     */
    public PartyIdentification3 createPartyIdentification3() {
        return new PartyIdentification3();
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
     * Create an instance of {@link PriceInformation2 }
     * 
     * @return
     *     the new instance of {@link PriceInformation2 }
     */
    public PriceInformation2 createPriceInformation2() {
        return new PriceInformation2();
    }

    /**
     * Create an instance of {@link PriceRateOrAmountOrUnknownChoice }
     * 
     * @return
     *     the new instance of {@link PriceRateOrAmountOrUnknownChoice }
     */
    public PriceRateOrAmountOrUnknownChoice createPriceRateOrAmountOrUnknownChoice() {
        return new PriceRateOrAmountOrUnknownChoice();
    }

    /**
     * Create an instance of {@link PriceSource }
     * 
     * @return
     *     the new instance of {@link PriceSource }
     */
    public PriceSource createPriceSource() {
        return new PriceSource();
    }

    /**
     * Create an instance of {@link PriceSourceFormatChoice }
     * 
     * @return
     *     the new instance of {@link PriceSourceFormatChoice }
     */
    public PriceSourceFormatChoice createPriceSourceFormatChoice() {
        return new PriceSourceFormatChoice();
    }

    /**
     * Create an instance of {@link QuantityAndAvailability }
     * 
     * @return
     *     the new instance of {@link QuantityAndAvailability }
     */
    public QuantityAndAvailability createQuantityAndAvailability() {
        return new QuantityAndAvailability();
    }

    /**
     * Create an instance of {@link SafekeepingAccount2 }
     * 
     * @return
     *     the new instance of {@link SafekeepingAccount2 }
     */
    public SafekeepingAccount2 createSafekeepingAccount2() {
        return new SafekeepingAccount2();
    }

    /**
     * Create an instance of {@link SafekeepingPlaceAsCodeAndPartyIdentification }
     * 
     * @return
     *     the new instance of {@link SafekeepingPlaceAsCodeAndPartyIdentification }
     */
    public SafekeepingPlaceAsCodeAndPartyIdentification createSafekeepingPlaceAsCodeAndPartyIdentification() {
        return new SafekeepingPlaceAsCodeAndPartyIdentification();
    }

    /**
     * Create an instance of {@link SafekeepingPlaceFormatChoice }
     * 
     * @return
     *     the new instance of {@link SafekeepingPlaceFormatChoice }
     */
    public SafekeepingPlaceFormatChoice createSafekeepingPlaceFormatChoice() {
        return new SafekeepingPlaceFormatChoice();
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
     * Create an instance of {@link SimpleIdentificationInformation }
     * 
     * @return
     *     the new instance of {@link SimpleIdentificationInformation }
     */
    public SimpleIdentificationInformation createSimpleIdentificationInformation() {
        return new SimpleIdentificationInformation();
    }

    /**
     * Create an instance of {@link Statement6 }
     * 
     * @return
     *     the new instance of {@link Statement6 }
     */
    public Statement6 createStatement6() {
        return new Statement6();
    }

    /**
     * Create an instance of {@link StatementBasisCodeAndDSSCodeChoice }
     * 
     * @return
     *     the new instance of {@link StatementBasisCodeAndDSSCodeChoice }
     */
    public StatementBasisCodeAndDSSCodeChoice createStatementBasisCodeAndDSSCodeChoice() {
        return new StatementBasisCodeAndDSSCodeChoice();
    }

    /**
     * Create an instance of {@link StatementUpdateTypeCodeAndDSSCodeChoice }
     * 
     * @return
     *     the new instance of {@link StatementUpdateTypeCodeAndDSSCodeChoice }
     */
    public StatementUpdateTypeCodeAndDSSCodeChoice createStatementUpdateTypeCodeAndDSSCodeChoice() {
        return new StatementUpdateTypeCodeAndDSSCodeChoice();
    }

    /**
     * Create an instance of {@link StructuredLongPostalAddress1 }
     * 
     * @return
     *     the new instance of {@link StructuredLongPostalAddress1 }
     */
    public StructuredLongPostalAddress1 createStructuredLongPostalAddress1() {
        return new StructuredLongPostalAddress1();
    }

    /**
     * Create an instance of {@link SubAccountIdentification3 }
     * 
     * @return
     *     the new instance of {@link SubAccountIdentification3 }
     */
    public SubAccountIdentification3 createSubAccountIdentification3() {
        return new SubAccountIdentification3();
    }

    /**
     * Create an instance of {@link SubBalanceInformation2 }
     * 
     * @return
     *     the new instance of {@link SubBalanceInformation2 }
     */
    public SubBalanceInformation2 createSubBalanceInformation2() {
        return new SubBalanceInformation2();
    }

    /**
     * Create an instance of {@link SubBalanceQuantity1Choice }
     * 
     * @return
     *     the new instance of {@link SubBalanceQuantity1Choice }
     */
    public SubBalanceQuantity1Choice createSubBalanceQuantity1Choice() {
        return new SubBalanceQuantity1Choice();
    }

    /**
     * Create an instance of {@link TotalValueInPageAndStatement }
     * 
     * @return
     *     the new instance of {@link TotalValueInPageAndStatement }
     */
    public TotalValueInPageAndStatement createTotalValueInPageAndStatement() {
        return new TotalValueInPageAndStatement();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Document }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Document }{@code >}
     */
    @XmlElementDecl(namespace = "urn:swift:xsd:semt.005.001.02", name = "Document")
    public JAXBElement<Document> createDocument(Document value) {
        return new JAXBElement<>(_Document_QNAME, Document.class, null, value);
    }

}
