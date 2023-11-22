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

package org.jpos.iso20022.reda_065_001_02;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.jpos.iso20022.reda_065_001_02 package. 
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

    private static final QName _Document_QNAME = new QName("urn:iso:std:iso:20022:tech:xsd:reda.065.001.02", "Document");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.jpos.iso20022.reda_065_001_02
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
     * Create an instance of {@link CalendarData1 }
     * 
     * @return
     *     the new instance of {@link CalendarData1 }
     */
    public CalendarData1 createCalendarData1() {
        return new CalendarData1();
    }

    /**
     * Create an instance of {@link CalendarOrBusinessError1Choice }
     * 
     * @return
     *     the new instance of {@link CalendarOrBusinessError1Choice }
     */
    public CalendarOrBusinessError1Choice createCalendarOrBusinessError1Choice() {
        return new CalendarOrBusinessError1Choice();
    }

    /**
     * Create an instance of {@link CalendarReport1 }
     * 
     * @return
     *     the new instance of {@link CalendarReport1 }
     */
    public CalendarReport1 createCalendarReport1() {
        return new CalendarReport1();
    }

    /**
     * Create an instance of {@link CalendarReportOrError1Choice }
     * 
     * @return
     *     the new instance of {@link CalendarReportOrError1Choice }
     */
    public CalendarReportOrError1Choice createCalendarReportOrError1Choice() {
        return new CalendarReportOrError1Choice();
    }

    /**
     * Create an instance of {@link CalendarReportV02 }
     * 
     * @return
     *     the new instance of {@link CalendarReportV02 }
     */
    public CalendarReportV02 createCalendarReportV02() {
        return new CalendarReportV02();
    }

    /**
     * Create an instance of {@link ErrorHandling2Choice }
     * 
     * @return
     *     the new instance of {@link ErrorHandling2Choice }
     */
    public ErrorHandling2Choice createErrorHandling2Choice() {
        return new ErrorHandling2Choice();
    }

    /**
     * Create an instance of {@link ErrorHandling4 }
     * 
     * @return
     *     the new instance of {@link ErrorHandling4 }
     */
    public ErrorHandling4 createErrorHandling4() {
        return new ErrorHandling4();
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
     * Create an instance of {@link MarketInfrastructureIdentification1Choice }
     * 
     * @return
     *     the new instance of {@link MarketInfrastructureIdentification1Choice }
     */
    public MarketInfrastructureIdentification1Choice createMarketInfrastructureIdentification1Choice() {
        return new MarketInfrastructureIdentification1Choice();
    }

    /**
     * Create an instance of {@link MessageHeader11 }
     * 
     * @return
     *     the new instance of {@link MessageHeader11 }
     */
    public MessageHeader11 createMessageHeader11() {
        return new MessageHeader11();
    }

    /**
     * Create an instance of {@link OriginalBusinessQuery1 }
     * 
     * @return
     *     the new instance of {@link OriginalBusinessQuery1 }
     */
    public OriginalBusinessQuery1 createOriginalBusinessQuery1() {
        return new OriginalBusinessQuery1();
    }

    /**
     * Create an instance of {@link RequestType4Choice }
     * 
     * @return
     *     the new instance of {@link RequestType4Choice }
     */
    public RequestType4Choice createRequestType4Choice() {
        return new RequestType4Choice();
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
     * Create an instance of {@link SystemAndCurrency1 }
     * 
     * @return
     *     the new instance of {@link SystemAndCurrency1 }
     */
    public SystemAndCurrency1 createSystemAndCurrency1() {
        return new SystemAndCurrency1();
    }

    /**
     * Create an instance of {@link SystemIdentification2Choice }
     * 
     * @return
     *     the new instance of {@link SystemIdentification2Choice }
     */
    public SystemIdentification2Choice createSystemIdentification2Choice() {
        return new SystemIdentification2Choice();
    }

    /**
     * Create an instance of {@link SystemStatus3Choice }
     * 
     * @return
     *     the new instance of {@link SystemStatus3Choice }
     */
    public SystemStatus3Choice createSystemStatus3Choice() {
        return new SystemStatus3Choice();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Document }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Document }{@code >}
     */
    @XmlElementDecl(namespace = "urn:iso:std:iso:20022:tech:xsd:reda.065.001.02", name = "Document")
    public JAXBElement<Document> createDocument(Document value) {
        return new JAXBElement<>(_Document_QNAME, Document.class, null, value);
    }

}
