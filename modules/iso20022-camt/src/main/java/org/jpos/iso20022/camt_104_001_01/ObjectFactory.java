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

package org.jpos.iso20022.camt_104_001_01;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.jpos.iso20022.camt_104_001_01 package. 
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

    private static final QName _Document_QNAME = new QName("urn:iso:std:iso:20022:tech:xsd:camt.104.001.01", "Document");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.jpos.iso20022.camt_104_001_01
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
     * Create an instance of {@link ClearingSystemIdentification2Choice }
     * 
     * @return
     *     the new instance of {@link ClearingSystemIdentification2Choice }
     */
    public ClearingSystemIdentification2Choice createClearingSystemIdentification2Choice() {
        return new ClearingSystemIdentification2Choice();
    }

    /**
     * Create an instance of {@link ClearingSystemMemberIdentification2 }
     * 
     * @return
     *     the new instance of {@link ClearingSystemMemberIdentification2 }
     */
    public ClearingSystemMemberIdentification2 createClearingSystemMemberIdentification2() {
        return new ClearingSystemMemberIdentification2();
    }

    /**
     * Create an instance of {@link CommunicationAddress8 }
     * 
     * @return
     *     the new instance of {@link CommunicationAddress8 }
     */
    public CommunicationAddress8 createCommunicationAddress8() {
        return new CommunicationAddress8();
    }

    /**
     * Create an instance of {@link ContactIdentificationAndAddress1 }
     * 
     * @return
     *     the new instance of {@link ContactIdentificationAndAddress1 }
     */
    public ContactIdentificationAndAddress1 createContactIdentificationAndAddress1() {
        return new ContactIdentificationAndAddress1();
    }

    /**
     * Create an instance of {@link CreateMemberV01 }
     * 
     * @return
     *     the new instance of {@link CreateMemberV01 }
     */
    public CreateMemberV01 createCreateMemberV01() {
        return new CreateMemberV01();
    }

    /**
     * Create an instance of {@link FinancialIdentificationSchemeName1Choice }
     * 
     * @return
     *     the new instance of {@link FinancialIdentificationSchemeName1Choice }
     */
    public FinancialIdentificationSchemeName1Choice createFinancialIdentificationSchemeName1Choice() {
        return new FinancialIdentificationSchemeName1Choice();
    }

    /**
     * Create an instance of {@link GenericFinancialIdentification1 }
     * 
     * @return
     *     the new instance of {@link GenericFinancialIdentification1 }
     */
    public GenericFinancialIdentification1 createGenericFinancialIdentification1() {
        return new GenericFinancialIdentification1();
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
     * Create an instance of {@link Member6 }
     * 
     * @return
     *     the new instance of {@link Member6 }
     */
    public Member6 createMember6() {
        return new Member6();
    }

    /**
     * Create an instance of {@link MemberIdentification3Choice }
     * 
     * @return
     *     the new instance of {@link MemberIdentification3Choice }
     */
    public MemberIdentification3Choice createMemberIdentification3Choice() {
        return new MemberIdentification3Choice();
    }

    /**
     * Create an instance of {@link MessageHeader1 }
     * 
     * @return
     *     the new instance of {@link MessageHeader1 }
     */
    public MessageHeader1 createMessageHeader1() {
        return new MessageHeader1();
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
    @XmlElementDecl(namespace = "urn:iso:std:iso:20022:tech:xsd:camt.104.001.01", name = "Document")
    public JAXBElement<Document> createDocument(Document value) {
        return new JAXBElement<>(_Document_QNAME, Document.class, null, value);
    }

}
