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

package org.jpos.iso20022.camt_062_001_03;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.jpos.iso20022.camt_062_001_03 package. 
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

    private static final QName _Document_QNAME = new QName("urn:iso:std:iso:20022:tech:xsd:camt.062.001.03", "Document");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.jpos.iso20022.camt_062_001_03
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
     * Create an instance of {@link AgreedRate2 }
     * 
     * @return
     *     the new instance of {@link AgreedRate2 }
     */
    public AgreedRate2 createAgreedRate2() {
        return new AgreedRate2();
    }

    /**
     * Create an instance of {@link BalanceStatus2 }
     * 
     * @return
     *     the new instance of {@link BalanceStatus2 }
     */
    public BalanceStatus2 createBalanceStatus2() {
        return new BalanceStatus2();
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
     * Create an instance of {@link CurrencyFactors1 }
     * 
     * @return
     *     the new instance of {@link CurrencyFactors1 }
     */
    public CurrencyFactors1 createCurrencyFactors1() {
        return new CurrencyFactors1();
    }

    /**
     * Create an instance of {@link NameAndAddress8 }
     * 
     * @return
     *     the new instance of {@link NameAndAddress8 }
     */
    public NameAndAddress8 createNameAndAddress8() {
        return new NameAndAddress8();
    }

    /**
     * Create an instance of {@link PartyIdentification44 }
     * 
     * @return
     *     the new instance of {@link PartyIdentification44 }
     */
    public PartyIdentification44 createPartyIdentification44() {
        return new PartyIdentification44();
    }

    /**
     * Create an instance of {@link PartyIdentification59 }
     * 
     * @return
     *     the new instance of {@link PartyIdentification59 }
     */
    public PartyIdentification59 createPartyIdentification59() {
        return new PartyIdentification59();
    }

    /**
     * Create an instance of {@link PartyIdentification73Choice }
     * 
     * @return
     *     the new instance of {@link PartyIdentification73Choice }
     */
    public PartyIdentification73Choice createPartyIdentification73Choice() {
        return new PartyIdentification73Choice();
    }

    /**
     * Create an instance of {@link PayInFactors1 }
     * 
     * @return
     *     the new instance of {@link PayInFactors1 }
     */
    public PayInFactors1 createPayInFactors1() {
        return new PayInFactors1();
    }

    /**
     * Create an instance of {@link PayInScheduleItems1 }
     * 
     * @return
     *     the new instance of {@link PayInScheduleItems1 }
     */
    public PayInScheduleItems1 createPayInScheduleItems1() {
        return new PayInScheduleItems1();
    }

    /**
     * Create an instance of {@link PayInScheduleV03 }
     * 
     * @return
     *     the new instance of {@link PayInScheduleV03 }
     */
    public PayInScheduleV03 createPayInScheduleV03() {
        return new PayInScheduleV03();
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
     * Create an instance of {@link ReportData4 }
     * 
     * @return
     *     the new instance of {@link ReportData4 }
     */
    public ReportData4 createReportData4() {
        return new ReportData4();
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
     * Create an instance of {@link JAXBElement }{@code <}{@link Document }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Document }{@code >}
     */
    @XmlElementDecl(namespace = "urn:iso:std:iso:20022:tech:xsd:camt.062.001.03", name = "Document")
    public JAXBElement<Document> createDocument(Document value) {
        return new JAXBElement<>(_Document_QNAME, Document.class, null, value);
    }

}
