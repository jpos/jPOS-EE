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

package org.jpos.iso20022.camt_019_001_07;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.jpos.iso20022.camt_019_001_07 package. 
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

    private static final QName _Document_QNAME = new QName("urn:iso:std:iso:20022:tech:xsd:camt.019.001.07", "Document");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.jpos.iso20022.camt_019_001_07
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
     * Create an instance of {@link BusinessDay8 }
     * 
     * @return
     *     the new instance of {@link BusinessDay8 }
     */
    public BusinessDay8 createBusinessDay8() {
        return new BusinessDay8();
    }

    /**
     * Create an instance of {@link BusinessDay9 }
     * 
     * @return
     *     the new instance of {@link BusinessDay9 }
     */
    public BusinessDay9 createBusinessDay9() {
        return new BusinessDay9();
    }

    /**
     * Create an instance of {@link BusinessDayReportOrError10Choice }
     * 
     * @return
     *     the new instance of {@link BusinessDayReportOrError10Choice }
     */
    public BusinessDayReportOrError10Choice createBusinessDayReportOrError10Choice() {
        return new BusinessDayReportOrError10Choice();
    }

    /**
     * Create an instance of {@link BusinessDayReportOrError9Choice }
     * 
     * @return
     *     the new instance of {@link BusinessDayReportOrError9Choice }
     */
    public BusinessDayReportOrError9Choice createBusinessDayReportOrError9Choice() {
        return new BusinessDayReportOrError9Choice();
    }

    /**
     * Create an instance of {@link ClosureReason2Choice }
     * 
     * @return
     *     the new instance of {@link ClosureReason2Choice }
     */
    public ClosureReason2Choice createClosureReason2Choice() {
        return new ClosureReason2Choice();
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
     * Create an instance of {@link DateTimePeriod1Choice }
     * 
     * @return
     *     the new instance of {@link DateTimePeriod1Choice }
     */
    public DateTimePeriod1Choice createDateTimePeriod1Choice() {
        return new DateTimePeriod1Choice();
    }

    /**
     * Create an instance of {@link ErrorHandling3Choice }
     * 
     * @return
     *     the new instance of {@link ErrorHandling3Choice }
     */
    public ErrorHandling3Choice createErrorHandling3Choice() {
        return new ErrorHandling3Choice();
    }

    /**
     * Create an instance of {@link ErrorHandling5 }
     * 
     * @return
     *     the new instance of {@link ErrorHandling5 }
     */
    public ErrorHandling5 createErrorHandling5() {
        return new ErrorHandling5();
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
     * Create an instance of {@link MessageHeader7 }
     * 
     * @return
     *     the new instance of {@link MessageHeader7 }
     */
    public MessageHeader7 createMessageHeader7() {
        return new MessageHeader7();
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
     * Create an instance of {@link ReturnBusinessDayInformationV07 }
     * 
     * @return
     *     the new instance of {@link ReturnBusinessDayInformationV07 }
     */
    public ReturnBusinessDayInformationV07 createReturnBusinessDayInformationV07() {
        return new ReturnBusinessDayInformationV07();
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
     * Create an instance of {@link SystemAvailabilityAndEvents3 }
     * 
     * @return
     *     the new instance of {@link SystemAvailabilityAndEvents3 }
     */
    public SystemAvailabilityAndEvents3 createSystemAvailabilityAndEvents3() {
        return new SystemAvailabilityAndEvents3();
    }

    /**
     * Create an instance of {@link SystemClosure2 }
     * 
     * @return
     *     the new instance of {@link SystemClosure2 }
     */
    public SystemClosure2 createSystemClosure2() {
        return new SystemClosure2();
    }

    /**
     * Create an instance of {@link SystemEvent3 }
     * 
     * @return
     *     the new instance of {@link SystemEvent3 }
     */
    public SystemEvent3 createSystemEvent3() {
        return new SystemEvent3();
    }

    /**
     * Create an instance of {@link SystemEventType4Choice }
     * 
     * @return
     *     the new instance of {@link SystemEventType4Choice }
     */
    public SystemEventType4Choice createSystemEventType4Choice() {
        return new SystemEventType4Choice();
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
     * Create an instance of {@link SystemStatus2Choice }
     * 
     * @return
     *     the new instance of {@link SystemStatus2Choice }
     */
    public SystemStatus2Choice createSystemStatus2Choice() {
        return new SystemStatus2Choice();
    }

    /**
     * Create an instance of {@link SystemStatus3 }
     * 
     * @return
     *     the new instance of {@link SystemStatus3 }
     */
    public SystemStatus3 createSystemStatus3() {
        return new SystemStatus3();
    }

    /**
     * Create an instance of {@link TimePeriod1 }
     * 
     * @return
     *     the new instance of {@link TimePeriod1 }
     */
    public TimePeriod1 createTimePeriod1() {
        return new TimePeriod1();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Document }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Document }{@code >}
     */
    @XmlElementDecl(namespace = "urn:iso:std:iso:20022:tech:xsd:camt.019.001.07", name = "Document")
    public JAXBElement<Document> createDocument(Document value) {
        return new JAXBElement<>(_Document_QNAME, Document.class, null, value);
    }

}
