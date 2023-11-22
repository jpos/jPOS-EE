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

package org.jpos.iso20022.secl_004_001_03;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.jpos.iso20022.secl_004_001_03 package. 
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

    private static final QName _Document_QNAME = new QName("urn:iso:std:iso:20022:tech:xsd:secl.004.001.03", "Document");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.jpos.iso20022.secl_004_001_03
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
     * Create an instance of {@link AlternatePartyIdentification4 }
     * 
     * @return
     *     the new instance of {@link AlternatePartyIdentification4 }
     */
    public AlternatePartyIdentification4 createAlternatePartyIdentification4() {
        return new AlternatePartyIdentification4();
    }

    /**
     * Create an instance of {@link AlternatePartyIdentification5 }
     * 
     * @return
     *     the new instance of {@link AlternatePartyIdentification5 }
     */
    public AlternatePartyIdentification5 createAlternatePartyIdentification5() {
        return new AlternatePartyIdentification5();
    }

    /**
     * Create an instance of {@link AmountAndDirection21 }
     * 
     * @return
     *     the new instance of {@link AmountAndDirection21 }
     */
    public AmountAndDirection21 createAmountAndDirection21() {
        return new AmountAndDirection21();
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
     * Create an instance of {@link DateCode3Choice }
     * 
     * @return
     *     the new instance of {@link DateCode3Choice }
     */
    public DateCode3Choice createDateCode3Choice() {
        return new DateCode3Choice();
    }

    /**
     * Create an instance of {@link DateFormat15Choice }
     * 
     * @return
     *     the new instance of {@link DateFormat15Choice }
     */
    public DateFormat15Choice createDateFormat15Choice() {
        return new DateFormat15Choice();
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
     * Create an instance of {@link GenericIdentification20 }
     * 
     * @return
     *     the new instance of {@link GenericIdentification20 }
     */
    public GenericIdentification20 createGenericIdentification20() {
        return new GenericIdentification20();
    }

    /**
     * Create an instance of {@link GenericIdentification29 }
     * 
     * @return
     *     the new instance of {@link GenericIdentification29 }
     */
    public GenericIdentification29 createGenericIdentification29() {
        return new GenericIdentification29();
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
     * Create an instance of {@link GenericIdentification40 }
     * 
     * @return
     *     the new instance of {@link GenericIdentification40 }
     */
    public GenericIdentification40 createGenericIdentification40() {
        return new GenericIdentification40();
    }

    /**
     * Create an instance of {@link GenericIdentification58 }
     * 
     * @return
     *     the new instance of {@link GenericIdentification58 }
     */
    public GenericIdentification58 createGenericIdentification58() {
        return new GenericIdentification58();
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
     * Create an instance of {@link IdentificationType40Choice }
     * 
     * @return
     *     the new instance of {@link IdentificationType40Choice }
     */
    public IdentificationType40Choice createIdentificationType40Choice() {
        return new IdentificationType40Choice();
    }

    /**
     * Create an instance of {@link IdentificationType6Choice }
     * 
     * @return
     *     the new instance of {@link IdentificationType6Choice }
     */
    public IdentificationType6Choice createIdentificationType6Choice() {
        return new IdentificationType6Choice();
    }

    /**
     * Create an instance of {@link MarketIdentification1Choice }
     * 
     * @return
     *     the new instance of {@link MarketIdentification1Choice }
     */
    public MarketIdentification1Choice createMarketIdentification1Choice() {
        return new MarketIdentification1Choice();
    }

    /**
     * Create an instance of {@link MarketIdentification20 }
     * 
     * @return
     *     the new instance of {@link MarketIdentification20 }
     */
    public MarketIdentification20 createMarketIdentification20() {
        return new MarketIdentification20();
    }

    /**
     * Create an instance of {@link MarketIdentification84 }
     * 
     * @return
     *     the new instance of {@link MarketIdentification84 }
     */
    public MarketIdentification84 createMarketIdentification84() {
        return new MarketIdentification84();
    }

    /**
     * Create an instance of {@link MarketIdentification85 }
     * 
     * @return
     *     the new instance of {@link MarketIdentification85 }
     */
    public MarketIdentification85 createMarketIdentification85() {
        return new MarketIdentification85();
    }

    /**
     * Create an instance of {@link MarketType8Choice }
     * 
     * @return
     *     the new instance of {@link MarketType8Choice }
     */
    public MarketType8Choice createMarketType8Choice() {
        return new MarketType8Choice();
    }

    /**
     * Create an instance of {@link MarketType9Choice }
     * 
     * @return
     *     the new instance of {@link MarketType9Choice }
     */
    public MarketType9Choice createMarketType9Choice() {
        return new MarketType9Choice();
    }

    /**
     * Create an instance of {@link NameAndAddress13 }
     * 
     * @return
     *     the new instance of {@link NameAndAddress13 }
     */
    public NameAndAddress13 createNameAndAddress13() {
        return new NameAndAddress13();
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
     * Create an instance of {@link NameAndAddress6 }
     * 
     * @return
     *     the new instance of {@link NameAndAddress6 }
     */
    public NameAndAddress6 createNameAndAddress6() {
        return new NameAndAddress6();
    }

    /**
     * Create an instance of {@link NetPosition3 }
     * 
     * @return
     *     the new instance of {@link NetPosition3 }
     */
    public NetPosition3 createNetPosition3() {
        return new NetPosition3();
    }

    /**
     * Create an instance of {@link NetPositionV03 }
     * 
     * @return
     *     the new instance of {@link NetPositionV03 }
     */
    public NetPositionV03 createNetPositionV03() {
        return new NetPositionV03();
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
     * Create an instance of {@link Pagination }
     * 
     * @return
     *     the new instance of {@link Pagination }
     */
    public Pagination createPagination() {
        return new Pagination();
    }

    /**
     * Create an instance of {@link PartyIdentification33Choice }
     * 
     * @return
     *     the new instance of {@link PartyIdentification33Choice }
     */
    public PartyIdentification33Choice createPartyIdentification33Choice() {
        return new PartyIdentification33Choice();
    }

    /**
     * Create an instance of {@link PartyIdentification34Choice }
     * 
     * @return
     *     the new instance of {@link PartyIdentification34Choice }
     */
    public PartyIdentification34Choice createPartyIdentification34Choice() {
        return new PartyIdentification34Choice();
    }

    /**
     * Create an instance of {@link PartyIdentification35Choice }
     * 
     * @return
     *     the new instance of {@link PartyIdentification35Choice }
     */
    public PartyIdentification35Choice createPartyIdentification35Choice() {
        return new PartyIdentification35Choice();
    }

    /**
     * Create an instance of {@link PartyIdentification83Choice }
     * 
     * @return
     *     the new instance of {@link PartyIdentification83Choice }
     */
    public PartyIdentification83Choice createPartyIdentification83Choice() {
        return new PartyIdentification83Choice();
    }

    /**
     * Create an instance of {@link PartyIdentificationAndAccount100 }
     * 
     * @return
     *     the new instance of {@link PartyIdentificationAndAccount100 }
     */
    public PartyIdentificationAndAccount100 createPartyIdentificationAndAccount100() {
        return new PartyIdentificationAndAccount100();
    }

    /**
     * Create an instance of {@link PartyIdentificationAndAccount31 }
     * 
     * @return
     *     the new instance of {@link PartyIdentificationAndAccount31 }
     */
    public PartyIdentificationAndAccount31 createPartyIdentificationAndAccount31() {
        return new PartyIdentificationAndAccount31();
    }

    /**
     * Create an instance of {@link PartyTextInformation1 }
     * 
     * @return
     *     the new instance of {@link PartyTextInformation1 }
     */
    public PartyTextInformation1 createPartyTextInformation1() {
        return new PartyTextInformation1();
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
     * Create an instance of {@link PostalAddress2 }
     * 
     * @return
     *     the new instance of {@link PostalAddress2 }
     */
    public PostalAddress2 createPostalAddress2() {
        return new PostalAddress2();
    }

    /**
     * Create an instance of {@link PostalAddress8 }
     * 
     * @return
     *     the new instance of {@link PostalAddress8 }
     */
    public PostalAddress8 createPostalAddress8() {
        return new PostalAddress8();
    }

    /**
     * Create an instance of {@link Price4 }
     * 
     * @return
     *     the new instance of {@link Price4 }
     */
    public Price4 createPrice4() {
        return new Price4();
    }

    /**
     * Create an instance of {@link PriceRateOrAmountChoice }
     * 
     * @return
     *     the new instance of {@link PriceRateOrAmountChoice }
     */
    public PriceRateOrAmountChoice createPriceRateOrAmountChoice() {
        return new PriceRateOrAmountChoice();
    }

    /**
     * Create an instance of {@link ReportParameters1 }
     * 
     * @return
     *     the new instance of {@link ReportParameters1 }
     */
    public ReportParameters1 createReportParameters1() {
        return new ReportParameters1();
    }

    /**
     * Create an instance of {@link SafekeepingPlaceFormat7Choice }
     * 
     * @return
     *     the new instance of {@link SafekeepingPlaceFormat7Choice }
     */
    public SafekeepingPlaceFormat7Choice createSafekeepingPlaceFormat7Choice() {
        return new SafekeepingPlaceFormat7Choice();
    }

    /**
     * Create an instance of {@link SafekeepingPlaceTypeAndAnyBICIdentifier1 }
     * 
     * @return
     *     the new instance of {@link SafekeepingPlaceTypeAndAnyBICIdentifier1 }
     */
    public SafekeepingPlaceTypeAndAnyBICIdentifier1 createSafekeepingPlaceTypeAndAnyBICIdentifier1() {
        return new SafekeepingPlaceTypeAndAnyBICIdentifier1();
    }

    /**
     * Create an instance of {@link SafekeepingPlaceTypeAndText1 }
     * 
     * @return
     *     the new instance of {@link SafekeepingPlaceTypeAndText1 }
     */
    public SafekeepingPlaceTypeAndText1 createSafekeepingPlaceTypeAndText1() {
        return new SafekeepingPlaceTypeAndText1();
    }

    /**
     * Create an instance of {@link SecuritiesAccount18 }
     * 
     * @return
     *     the new instance of {@link SecuritiesAccount18 }
     */
    public SecuritiesAccount18 createSecuritiesAccount18() {
        return new SecuritiesAccount18();
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
     * Create an instance of {@link SecurityIdentification14 }
     * 
     * @return
     *     the new instance of {@link SecurityIdentification14 }
     */
    public SecurityIdentification14 createSecurityIdentification14() {
        return new SecurityIdentification14();
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
     * Create an instance of {@link TradeLeg10 }
     * 
     * @return
     *     the new instance of {@link TradeLeg10 }
     */
    public TradeLeg10 createTradeLeg10() {
        return new TradeLeg10();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Document }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Document }{@code >}
     */
    @XmlElementDecl(namespace = "urn:iso:std:iso:20022:tech:xsd:secl.004.001.03", name = "Document")
    public JAXBElement<Document> createDocument(Document value) {
        return new JAXBElement<>(_Document_QNAME, Document.class, null, value);
    }

}
