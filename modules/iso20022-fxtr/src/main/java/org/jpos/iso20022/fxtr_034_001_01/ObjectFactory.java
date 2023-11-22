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

package org.jpos.iso20022.fxtr_034_001_01;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.jpos.iso20022.fxtr_034_001_01 package. 
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

    private static final QName _Document_QNAME = new QName("urn:iso:std:iso:20022:tech:xsd:fxtr.034.001.01", "Document");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.jpos.iso20022.fxtr_034_001_01
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
     * Create an instance of {@link ActiveCurrencyAndAmount }
     * 
     * @return
     *     the new instance of {@link ActiveCurrencyAndAmount }
     */
    public ActiveCurrencyAndAmount createActiveCurrencyAndAmount() {
        return new ActiveCurrencyAndAmount();
    }

    /**
     * Create an instance of {@link AgreedRate3 }
     * 
     * @return
     *     the new instance of {@link AgreedRate3 }
     */
    public AgreedRate3 createAgreedRate3() {
        return new AgreedRate3();
    }

    /**
     * Create an instance of {@link AlternateIdentification1 }
     * 
     * @return
     *     the new instance of {@link AlternateIdentification1 }
     */
    public AlternateIdentification1 createAlternateIdentification1() {
        return new AlternateIdentification1();
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
     * Create an instance of {@link DateAndDateTimeChoice }
     * 
     * @return
     *     the new instance of {@link DateAndDateTimeChoice }
     */
    public DateAndDateTimeChoice createDateAndDateTimeChoice() {
        return new DateAndDateTimeChoice();
    }

    /**
     * Create an instance of {@link DateFormat18Choice }
     * 
     * @return
     *     the new instance of {@link DateFormat18Choice }
     */
    public DateFormat18Choice createDateFormat18Choice() {
        return new DateFormat18Choice();
    }

    /**
     * Create an instance of {@link ForeignExchangeTradeConfirmationRequestV01 }
     * 
     * @return
     *     the new instance of {@link ForeignExchangeTradeConfirmationRequestV01 }
     */
    public ForeignExchangeTradeConfirmationRequestV01 createForeignExchangeTradeConfirmationRequestV01() {
        return new ForeignExchangeTradeConfirmationRequestV01();
    }

    /**
     * Create an instance of {@link GenericIdentification32 }
     * 
     * @return
     *     the new instance of {@link GenericIdentification32 }
     */
    public GenericIdentification32 createGenericIdentification32() {
        return new GenericIdentification32();
    }

    /**
     * Create an instance of {@link Header23 }
     * 
     * @return
     *     the new instance of {@link Header23 }
     */
    public Header23 createHeader23() {
        return new Header23();
    }

    /**
     * Create an instance of {@link IdentificationSource1Choice }
     * 
     * @return
     *     the new instance of {@link IdentificationSource1Choice }
     */
    public IdentificationSource1Choice createIdentificationSource1Choice() {
        return new IdentificationSource1Choice();
    }

    /**
     * Create an instance of {@link InstrumentLeg6 }
     * 
     * @return
     *     the new instance of {@link InstrumentLeg6 }
     */
    public InstrumentLeg6 createInstrumentLeg6() {
        return new InstrumentLeg6();
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
     * Create an instance of {@link Period4 }
     * 
     * @return
     *     the new instance of {@link Period4 }
     */
    public Period4 createPeriod4() {
        return new Period4();
    }

    /**
     * Create an instance of {@link SecurityIdentification18 }
     * 
     * @return
     *     the new instance of {@link SecurityIdentification18 }
     */
    public SecurityIdentification18 createSecurityIdentification18() {
        return new SecurityIdentification18();
    }

    /**
     * Create an instance of {@link SecurityIdentification22Choice }
     * 
     * @return
     *     the new instance of {@link SecurityIdentification22Choice }
     */
    public SecurityIdentification22Choice createSecurityIdentification22Choice() {
        return new SecurityIdentification22Choice();
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
     * Create an instance of {@link Trade2 }
     * 
     * @return
     *     the new instance of {@link Trade2 }
     */
    public Trade2 createTrade2() {
        return new Trade2();
    }

    /**
     * Create an instance of {@link Trade3 }
     * 
     * @return
     *     the new instance of {@link Trade3 }
     */
    public Trade3 createTrade3() {
        return new Trade3();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Document }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Document }{@code >}
     */
    @XmlElementDecl(namespace = "urn:iso:std:iso:20022:tech:xsd:fxtr.034.001.01", name = "Document")
    public JAXBElement<Document> createDocument(Document value) {
        return new JAXBElement<>(_Document_QNAME, Document.class, null, value);
    }

}
