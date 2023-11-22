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

package org.jpos.iso20022.semt_016_001_09;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.jpos.iso20022.semt_016_001_09 package. 
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

    private static final QName _Document_QNAME = new QName("urn:iso:std:iso:20022:tech:xsd:semt.016.001.09", "Document");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.jpos.iso20022.semt_016_001_09
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
     * Create an instance of {@link AmountAndDirection44 }
     * 
     * @return
     *     the new instance of {@link AmountAndDirection44 }
     */
    public AmountAndDirection44 createAmountAndDirection44() {
        return new AmountAndDirection44();
    }

    /**
     * Create an instance of {@link BlockChainAddressWallet3 }
     * 
     * @return
     *     the new instance of {@link BlockChainAddressWallet3 }
     */
    public BlockChainAddressWallet3 createBlockChainAddressWallet3() {
        return new BlockChainAddressWallet3();
    }

    /**
     * Create an instance of {@link ClassificationType32Choice }
     * 
     * @return
     *     the new instance of {@link ClassificationType32Choice }
     */
    public ClassificationType32Choice createClassificationType32Choice() {
        return new ClassificationType32Choice();
    }

    /**
     * Create an instance of {@link CorporateActionEventType88Choice }
     * 
     * @return
     *     the new instance of {@link CorporateActionEventType88Choice }
     */
    public CorporateActionEventType88Choice createCorporateActionEventType88Choice() {
        return new CorporateActionEventType88Choice();
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
     * Create an instance of {@link DateTimePeriod1 }
     * 
     * @return
     *     the new instance of {@link DateTimePeriod1 }
     */
    public DateTimePeriod1 createDateTimePeriod1() {
        return new DateTimePeriod1();
    }

    /**
     * Create an instance of {@link FinancialInstrumentAttributes112 }
     * 
     * @return
     *     the new instance of {@link FinancialInstrumentAttributes112 }
     */
    public FinancialInstrumentAttributes112 createFinancialInstrumentAttributes112() {
        return new FinancialInstrumentAttributes112();
    }

    /**
     * Create an instance of {@link FinancialInstrumentDetails40 }
     * 
     * @return
     *     the new instance of {@link FinancialInstrumentDetails40 }
     */
    public FinancialInstrumentDetails40 createFinancialInstrumentDetails40() {
        return new FinancialInstrumentDetails40();
    }

    /**
     * Create an instance of {@link FinancialInstrumentQuantity33Choice }
     * 
     * @return
     *     the new instance of {@link FinancialInstrumentQuantity33Choice }
     */
    public FinancialInstrumentQuantity33Choice createFinancialInstrumentQuantity33Choice() {
        return new FinancialInstrumentQuantity33Choice();
    }

    /**
     * Create an instance of {@link ForeignExchangeTerms23 }
     * 
     * @return
     *     the new instance of {@link ForeignExchangeTerms23 }
     */
    public ForeignExchangeTerms23 createForeignExchangeTerms23() {
        return new ForeignExchangeTerms23();
    }

    /**
     * Create an instance of {@link FormOfSecurity6Choice }
     * 
     * @return
     *     the new instance of {@link FormOfSecurity6Choice }
     */
    public FormOfSecurity6Choice createFormOfSecurity6Choice() {
        return new FormOfSecurity6Choice();
    }

    /**
     * Create an instance of {@link Frequency23Choice }
     * 
     * @return
     *     the new instance of {@link Frequency23Choice }
     */
    public Frequency23Choice createFrequency23Choice() {
        return new Frequency23Choice();
    }

    /**
     * Create an instance of {@link Frequency25Choice }
     * 
     * @return
     *     the new instance of {@link Frequency25Choice }
     */
    public Frequency25Choice createFrequency25Choice() {
        return new Frequency25Choice();
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
     * Create an instance of {@link GenericIdentification78 }
     * 
     * @return
     *     the new instance of {@link GenericIdentification78 }
     */
    public GenericIdentification78 createGenericIdentification78() {
        return new GenericIdentification78();
    }

    /**
     * Create an instance of {@link IdentificationSource3Choice }
     * 
     * @return
     *     the new instance of {@link IdentificationSource3Choice }
     */
    public IdentificationSource3Choice createIdentificationSource3Choice() {
        return new IdentificationSource3Choice();
    }

    /**
     * Create an instance of {@link InterestComputationMethodFormat4Choice }
     * 
     * @return
     *     the new instance of {@link InterestComputationMethodFormat4Choice }
     */
    public InterestComputationMethodFormat4Choice createInterestComputationMethodFormat4Choice() {
        return new InterestComputationMethodFormat4Choice();
    }

    /**
     * Create an instance of {@link IntraPositionDetails57 }
     * 
     * @return
     *     the new instance of {@link IntraPositionDetails57 }
     */
    public IntraPositionDetails57 createIntraPositionDetails57() {
        return new IntraPositionDetails57();
    }

    /**
     * Create an instance of {@link IntraPositionMovementDetails19 }
     * 
     * @return
     *     the new instance of {@link IntraPositionMovementDetails19 }
     */
    public IntraPositionMovementDetails19 createIntraPositionMovementDetails19() {
        return new IntraPositionMovementDetails19();
    }

    /**
     * Create an instance of {@link IntraPositionMovementPostingReportV09 }
     * 
     * @return
     *     the new instance of {@link IntraPositionMovementPostingReportV09 }
     */
    public IntraPositionMovementPostingReportV09 createIntraPositionMovementPostingReportV09() {
        return new IntraPositionMovementPostingReportV09();
    }

    /**
     * Create an instance of {@link MarketIdentification3Choice }
     * 
     * @return
     *     the new instance of {@link MarketIdentification3Choice }
     */
    public MarketIdentification3Choice createMarketIdentification3Choice() {
        return new MarketIdentification3Choice();
    }

    /**
     * Create an instance of {@link Number22Choice }
     * 
     * @return
     *     the new instance of {@link Number22Choice }
     */
    public Number22Choice createNumber22Choice() {
        return new Number22Choice();
    }

    /**
     * Create an instance of {@link Number3Choice }
     * 
     * @return
     *     the new instance of {@link Number3Choice }
     */
    public Number3Choice createNumber3Choice() {
        return new Number3Choice();
    }

    /**
     * Create an instance of {@link OptionStyle8Choice }
     * 
     * @return
     *     the new instance of {@link OptionStyle8Choice }
     */
    public OptionStyle8Choice createOptionStyle8Choice() {
        return new OptionStyle8Choice();
    }

    /**
     * Create an instance of {@link OptionType6Choice }
     * 
     * @return
     *     the new instance of {@link OptionType6Choice }
     */
    public OptionType6Choice createOptionType6Choice() {
        return new OptionType6Choice();
    }

    /**
     * Create an instance of {@link OtherIdentification1 }
     * 
     * @return
     *     the new instance of {@link OtherIdentification1 }
     */
    public OtherIdentification1 createOtherIdentification1() {
        return new OtherIdentification1();
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
     * Create an instance of {@link PartyIdentification127Choice }
     * 
     * @return
     *     the new instance of {@link PartyIdentification127Choice }
     */
    public PartyIdentification127Choice createPartyIdentification127Choice() {
        return new PartyIdentification127Choice();
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
     * Create an instance of {@link Period7Choice }
     * 
     * @return
     *     the new instance of {@link Period7Choice }
     */
    public Period7Choice createPeriod7Choice() {
        return new Period7Choice();
    }

    /**
     * Create an instance of {@link Price7 }
     * 
     * @return
     *     the new instance of {@link Price7 }
     */
    public Price7 createPrice7() {
        return new Price7();
    }

    /**
     * Create an instance of {@link PriceRateOrAmount3Choice }
     * 
     * @return
     *     the new instance of {@link PriceRateOrAmount3Choice }
     */
    public PriceRateOrAmount3Choice createPriceRateOrAmount3Choice() {
        return new PriceRateOrAmount3Choice();
    }

    /**
     * Create an instance of {@link PriceType4Choice }
     * 
     * @return
     *     the new instance of {@link PriceType4Choice }
     */
    public PriceType4Choice createPriceType4Choice() {
        return new PriceType4Choice();
    }

    /**
     * Create an instance of {@link QuantityBreakdown60 }
     * 
     * @return
     *     the new instance of {@link QuantityBreakdown60 }
     */
    public QuantityBreakdown60 createQuantityBreakdown60() {
        return new QuantityBreakdown60();
    }

    /**
     * Create an instance of {@link References72Choice }
     * 
     * @return
     *     the new instance of {@link References72Choice }
     */
    public References72Choice createReferences72Choice() {
        return new References72Choice();
    }

    /**
     * Create an instance of {@link SafekeepingPlaceFormat29Choice }
     * 
     * @return
     *     the new instance of {@link SafekeepingPlaceFormat29Choice }
     */
    public SafekeepingPlaceFormat29Choice createSafekeepingPlaceFormat29Choice() {
        return new SafekeepingPlaceFormat29Choice();
    }

    /**
     * Create an instance of {@link SafekeepingPlaceTypeAndIdentification1 }
     * 
     * @return
     *     the new instance of {@link SafekeepingPlaceTypeAndIdentification1 }
     */
    public SafekeepingPlaceTypeAndIdentification1 createSafekeepingPlaceTypeAndIdentification1() {
        return new SafekeepingPlaceTypeAndIdentification1();
    }

    /**
     * Create an instance of {@link SafekeepingPlaceTypeAndText8 }
     * 
     * @return
     *     the new instance of {@link SafekeepingPlaceTypeAndText8 }
     */
    public SafekeepingPlaceTypeAndText8 createSafekeepingPlaceTypeAndText8() {
        return new SafekeepingPlaceTypeAndText8();
    }

    /**
     * Create an instance of {@link SecuritiesAccount19 }
     * 
     * @return
     *     the new instance of {@link SecuritiesAccount19 }
     */
    public SecuritiesAccount19 createSecuritiesAccount19() {
        return new SecuritiesAccount19();
    }

    /**
     * Create an instance of {@link SecuritiesBalanceType6Choice }
     * 
     * @return
     *     the new instance of {@link SecuritiesBalanceType6Choice }
     */
    public SecuritiesBalanceType6Choice createSecuritiesBalanceType6Choice() {
        return new SecuritiesBalanceType6Choice();
    }

    /**
     * Create an instance of {@link SecuritiesPaymentStatus5Choice }
     * 
     * @return
     *     the new instance of {@link SecuritiesPaymentStatus5Choice }
     */
    public SecuritiesPaymentStatus5Choice createSecuritiesPaymentStatus5Choice() {
        return new SecuritiesPaymentStatus5Choice();
    }

    /**
     * Create an instance of {@link SecurityIdentification19 }
     * 
     * @return
     *     the new instance of {@link SecurityIdentification19 }
     */
    public SecurityIdentification19 createSecurityIdentification19() {
        return new SecurityIdentification19();
    }

    /**
     * Create an instance of {@link Statement80 }
     * 
     * @return
     *     the new instance of {@link Statement80 }
     */
    public Statement80 createStatement80() {
        return new Statement80();
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
     * Create an instance of {@link UpdateType15Choice }
     * 
     * @return
     *     the new instance of {@link UpdateType15Choice }
     */
    public UpdateType15Choice createUpdateType15Choice() {
        return new UpdateType15Choice();
    }

    /**
     * Create an instance of {@link YieldedOrValueType1Choice }
     * 
     * @return
     *     the new instance of {@link YieldedOrValueType1Choice }
     */
    public YieldedOrValueType1Choice createYieldedOrValueType1Choice() {
        return new YieldedOrValueType1Choice();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Document }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Document }{@code >}
     */
    @XmlElementDecl(namespace = "urn:iso:std:iso:20022:tech:xsd:semt.016.001.09", name = "Document")
    public JAXBElement<Document> createDocument(Document value) {
        return new JAXBElement<>(_Document_QNAME, Document.class, null, value);
    }

}
