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

package org.jpos.iso20022.camt_018_001_05;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.jpos.iso20022.camt_018_001_05 package. 
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

    private static final QName _Document_QNAME = new QName("urn:iso:std:iso:20022:tech:xsd:camt.018.001.05", "Document");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.jpos.iso20022.camt_018_001_05
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
     * Create an instance of {@link BusinessDayCriteria2 }
     * 
     * @return
     *     the new instance of {@link BusinessDayCriteria2 }
     */
    public BusinessDayCriteria2 createBusinessDayCriteria2() {
        return new BusinessDayCriteria2();
    }

    /**
     * Create an instance of {@link BusinessDayCriteria3Choice }
     * 
     * @return
     *     the new instance of {@link BusinessDayCriteria3Choice }
     */
    public BusinessDayCriteria3Choice createBusinessDayCriteria3Choice() {
        return new BusinessDayCriteria3Choice();
    }

    /**
     * Create an instance of {@link BusinessDayQuery2 }
     * 
     * @return
     *     the new instance of {@link BusinessDayQuery2 }
     */
    public BusinessDayQuery2 createBusinessDayQuery2() {
        return new BusinessDayQuery2();
    }

    /**
     * Create an instance of {@link BusinessDayReturnCriteria2 }
     * 
     * @return
     *     the new instance of {@link BusinessDayReturnCriteria2 }
     */
    public BusinessDayReturnCriteria2 createBusinessDayReturnCriteria2() {
        return new BusinessDayReturnCriteria2();
    }

    /**
     * Create an instance of {@link BusinessDaySearchCriteria2 }
     * 
     * @return
     *     the new instance of {@link BusinessDaySearchCriteria2 }
     */
    public BusinessDaySearchCriteria2 createBusinessDaySearchCriteria2() {
        return new BusinessDaySearchCriteria2();
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
     * Create an instance of {@link GenericIdentification1 }
     * 
     * @return
     *     the new instance of {@link GenericIdentification1 }
     */
    public GenericIdentification1 createGenericIdentification1() {
        return new GenericIdentification1();
    }

    /**
     * Create an instance of {@link GetBusinessDayInformationV05 }
     * 
     * @return
     *     the new instance of {@link GetBusinessDayInformationV05 }
     */
    public GetBusinessDayInformationV05 createGetBusinessDayInformationV05() {
        return new GetBusinessDayInformationV05();
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
     * Create an instance of {@link MessageHeader9 }
     * 
     * @return
     *     the new instance of {@link MessageHeader9 }
     */
    public MessageHeader9 createMessageHeader9() {
        return new MessageHeader9();
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
     * Create an instance of {@link SystemEventType2Choice }
     * 
     * @return
     *     the new instance of {@link SystemEventType2Choice }
     */
    public SystemEventType2Choice createSystemEventType2Choice() {
        return new SystemEventType2Choice();
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
     * Create an instance of {@link JAXBElement }{@code <}{@link Document }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Document }{@code >}
     */
    @XmlElementDecl(namespace = "urn:iso:std:iso:20022:tech:xsd:camt.018.001.05", name = "Document")
    public JAXBElement<Document> createDocument(Document value) {
        return new JAXBElement<>(_Document_QNAME, Document.class, null, value);
    }

}
