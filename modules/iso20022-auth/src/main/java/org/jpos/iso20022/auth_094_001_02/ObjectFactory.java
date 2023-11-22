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

package org.jpos.iso20022.auth_094_001_02;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.jpos.iso20022.auth_094_001_02 package. 
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

    private static final QName _Document_QNAME = new QName("urn:iso:std:iso:20022:tech:xsd:auth.094.001.02", "Document");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.jpos.iso20022.auth_094_001_02
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
     * Create an instance of {@link CorporateSectorCriteria5 }
     * 
     * @return
     *     the new instance of {@link CorporateSectorCriteria5 }
     */
    public CorporateSectorCriteria5 createCorporateSectorCriteria5() {
        return new CorporateSectorCriteria5();
    }

    /**
     * Create an instance of {@link DateOrBlankQuery2Choice }
     * 
     * @return
     *     the new instance of {@link DateOrBlankQuery2Choice }
     */
    public DateOrBlankQuery2Choice createDateOrBlankQuery2Choice() {
        return new DateOrBlankQuery2Choice();
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
     * Create an instance of {@link DateTimePeriod1 }
     * 
     * @return
     *     the new instance of {@link DateTimePeriod1 }
     */
    public DateTimePeriod1 createDateTimePeriod1() {
        return new DateTimePeriod1();
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
     * Create an instance of {@link NameAndAddress5 }
     * 
     * @return
     *     the new instance of {@link NameAndAddress5 }
     */
    public NameAndAddress5 createNameAndAddress5() {
        return new NameAndAddress5();
    }

    /**
     * Create an instance of {@link PartyIdentification121Choice }
     * 
     * @return
     *     the new instance of {@link PartyIdentification121Choice }
     */
    public PartyIdentification121Choice createPartyIdentification121Choice() {
        return new PartyIdentification121Choice();
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
     * Create an instance of {@link SecuritiesFinancingReportingTransactionQueryV02 }
     * 
     * @return
     *     the new instance of {@link SecuritiesFinancingReportingTransactionQueryV02 }
     */
    public SecuritiesFinancingReportingTransactionQueryV02 createSecuritiesFinancingReportingTransactionQueryV02() {
        return new SecuritiesFinancingReportingTransactionQueryV02();
    }

    /**
     * Create an instance of {@link SecuritiesTradeVenueCriteria1Choice }
     * 
     * @return
     *     the new instance of {@link SecuritiesTradeVenueCriteria1Choice }
     */
    public SecuritiesTradeVenueCriteria1Choice createSecuritiesTradeVenueCriteria1Choice() {
        return new SecuritiesTradeVenueCriteria1Choice();
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
     * Create an instance of {@link TradeAdditionalQueryCriteria7 }
     * 
     * @return
     *     the new instance of {@link TradeAdditionalQueryCriteria7 }
     */
    public TradeAdditionalQueryCriteria7 createTradeAdditionalQueryCriteria7() {
        return new TradeAdditionalQueryCriteria7();
    }

    /**
     * Create an instance of {@link TradeDateTimeQueryCriteria2 }
     * 
     * @return
     *     the new instance of {@link TradeDateTimeQueryCriteria2 }
     */
    public TradeDateTimeQueryCriteria2 createTradeDateTimeQueryCriteria2() {
        return new TradeDateTimeQueryCriteria2();
    }

    /**
     * Create an instance of {@link TradePartyIdentificationQuery8 }
     * 
     * @return
     *     the new instance of {@link TradePartyIdentificationQuery8 }
     */
    public TradePartyIdentificationQuery8 createTradePartyIdentificationQuery8() {
        return new TradePartyIdentificationQuery8();
    }

    /**
     * Create an instance of {@link TradePartyIdentificationQuery9 }
     * 
     * @return
     *     the new instance of {@link TradePartyIdentificationQuery9 }
     */
    public TradePartyIdentificationQuery9 createTradePartyIdentificationQuery9() {
        return new TradePartyIdentificationQuery9();
    }

    /**
     * Create an instance of {@link TradePartyQueryCriteria5 }
     * 
     * @return
     *     the new instance of {@link TradePartyQueryCriteria5 }
     */
    public TradePartyQueryCriteria5 createTradePartyQueryCriteria5() {
        return new TradePartyQueryCriteria5();
    }

    /**
     * Create an instance of {@link TradeQueryCriteria10 }
     * 
     * @return
     *     the new instance of {@link TradeQueryCriteria10 }
     */
    public TradeQueryCriteria10 createTradeQueryCriteria10() {
        return new TradeQueryCriteria10();
    }

    /**
     * Create an instance of {@link TradeQueryExecutionFrequency3 }
     * 
     * @return
     *     the new instance of {@link TradeQueryExecutionFrequency3 }
     */
    public TradeQueryExecutionFrequency3 createTradeQueryExecutionFrequency3() {
        return new TradeQueryExecutionFrequency3();
    }

    /**
     * Create an instance of {@link TradeRecurrentQuery5 }
     * 
     * @return
     *     the new instance of {@link TradeRecurrentQuery5 }
     */
    public TradeRecurrentQuery5 createTradeRecurrentQuery5() {
        return new TradeRecurrentQuery5();
    }

    /**
     * Create an instance of {@link TradeReportQuery13Choice }
     * 
     * @return
     *     the new instance of {@link TradeReportQuery13Choice }
     */
    public TradeReportQuery13Choice createTradeReportQuery13Choice() {
        return new TradeReportQuery13Choice();
    }

    /**
     * Create an instance of {@link TradeTypeQueryCriteria2 }
     * 
     * @return
     *     the new instance of {@link TradeTypeQueryCriteria2 }
     */
    public TradeTypeQueryCriteria2 createTradeTypeQueryCriteria2() {
        return new TradeTypeQueryCriteria2();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Document }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Document }{@code >}
     */
    @XmlElementDecl(namespace = "urn:iso:std:iso:20022:tech:xsd:auth.094.001.02", name = "Document")
    public JAXBElement<Document> createDocument(Document value) {
        return new JAXBElement<>(_Document_QNAME, Document.class, null, value);
    }

}
