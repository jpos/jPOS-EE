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

package org.jpos.iso20022.reda_015_001_01;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.jpos.iso20022.reda_015_001_01 package. 
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

    private static final QName _Document_QNAME = new QName("urn:iso:std:iso:20022:tech:xsd:reda.015.001.01", "Document");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.jpos.iso20022.reda_015_001_01
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
     * Create an instance of {@link DateAndDateTimeSearch4Choice }
     * 
     * @return
     *     the new instance of {@link DateAndDateTimeSearch4Choice }
     */
    public DateAndDateTimeSearch4Choice createDateAndDateTimeSearch4Choice() {
        return new DateAndDateTimeSearch4Choice();
    }

    /**
     * Create an instance of {@link DatePeriod2 }
     * 
     * @return
     *     the new instance of {@link DatePeriod2 }
     */
    public DatePeriod2 createDatePeriod2() {
        return new DatePeriod2();
    }

    /**
     * Create an instance of {@link DatePeriodSearch1Choice }
     * 
     * @return
     *     the new instance of {@link DatePeriodSearch1Choice }
     */
    public DatePeriodSearch1Choice createDatePeriodSearch1Choice() {
        return new DatePeriodSearch1Choice();
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
     * Create an instance of {@link DateTimeSearch2Choice }
     * 
     * @return
     *     the new instance of {@link DateTimeSearch2Choice }
     */
    public DateTimeSearch2Choice createDateTimeSearch2Choice() {
        return new DateTimeSearch2Choice();
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
     * Create an instance of {@link GenericIdentification36 }
     * 
     * @return
     *     the new instance of {@link GenericIdentification36 }
     */
    public GenericIdentification36 createGenericIdentification36() {
        return new GenericIdentification36();
    }

    /**
     * Create an instance of {@link MessageHeader2 }
     * 
     * @return
     *     the new instance of {@link MessageHeader2 }
     */
    public MessageHeader2 createMessageHeader2() {
        return new MessageHeader2();
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
     * Create an instance of {@link PartyDataReturnCriteria2 }
     * 
     * @return
     *     the new instance of {@link PartyDataReturnCriteria2 }
     */
    public PartyDataReturnCriteria2 createPartyDataReturnCriteria2() {
        return new PartyDataReturnCriteria2();
    }

    /**
     * Create an instance of {@link PartyDataSearchCriteria2 }
     * 
     * @return
     *     the new instance of {@link PartyDataSearchCriteria2 }
     */
    public PartyDataSearchCriteria2 createPartyDataSearchCriteria2() {
        return new PartyDataSearchCriteria2();
    }

    /**
     * Create an instance of {@link PartyIdentification120Choice }
     * 
     * @return
     *     the new instance of {@link PartyIdentification120Choice }
     */
    public PartyIdentification120Choice createPartyIdentification120Choice() {
        return new PartyIdentification120Choice();
    }

    /**
     * Create an instance of {@link PartyIdentification136 }
     * 
     * @return
     *     the new instance of {@link PartyIdentification136 }
     */
    public PartyIdentification136 createPartyIdentification136() {
        return new PartyIdentification136();
    }

    /**
     * Create an instance of {@link PartyLockStatus1 }
     * 
     * @return
     *     the new instance of {@link PartyLockStatus1 }
     */
    public PartyLockStatus1 createPartyLockStatus1() {
        return new PartyLockStatus1();
    }

    /**
     * Create an instance of {@link PartyQueryV01 }
     * 
     * @return
     *     the new instance of {@link PartyQueryV01 }
     */
    public PartyQueryV01 createPartyQueryV01() {
        return new PartyQueryV01();
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
     * Create an instance of {@link RequestType2Choice }
     * 
     * @return
     *     the new instance of {@link RequestType2Choice }
     */
    public RequestType2Choice createRequestType2Choice() {
        return new RequestType2Choice();
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
     * Create an instance of {@link SystemPartyType1Choice }
     * 
     * @return
     *     the new instance of {@link SystemPartyType1Choice }
     */
    public SystemPartyType1Choice createSystemPartyType1Choice() {
        return new SystemPartyType1Choice();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Document }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Document }{@code >}
     */
    @XmlElementDecl(namespace = "urn:iso:std:iso:20022:tech:xsd:reda.015.001.01", name = "Document")
    public JAXBElement<Document> createDocument(Document value) {
        return new JAXBElement<>(_Document_QNAME, Document.class, null, value);
    }

}
