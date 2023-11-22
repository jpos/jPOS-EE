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

package org.jpos.iso20022.auth_076_001_01;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.jpos.iso20022.auth_076_001_01 package. 
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

    private static final QName _Document_QNAME = new QName("urn:iso:std:iso:20022:tech:xsd:auth.076.001.01", "Document");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.jpos.iso20022.auth_076_001_01
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
     * Create an instance of {@link CommunicationAddress7 }
     * 
     * @return
     *     the new instance of {@link CommunicationAddress7 }
     */
    public CommunicationAddress7 createCommunicationAddress7() {
        return new CommunicationAddress7();
    }

    /**
     * Create an instance of {@link FinancialSupervisedPartyIdentityReportV01 }
     * 
     * @return
     *     the new instance of {@link FinancialSupervisedPartyIdentityReportV01 }
     */
    public FinancialSupervisedPartyIdentityReportV01 createFinancialSupervisedPartyIdentityReportV01() {
        return new FinancialSupervisedPartyIdentityReportV01();
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
     * Create an instance of {@link NameAndAddress5 }
     * 
     * @return
     *     the new instance of {@link NameAndAddress5 }
     */
    public NameAndAddress5 createNameAndAddress5() {
        return new NameAndAddress5();
    }

    /**
     * Create an instance of {@link PartyCancellation1 }
     * 
     * @return
     *     the new instance of {@link PartyCancellation1 }
     */
    public PartyCancellation1 createPartyCancellation1() {
        return new PartyCancellation1();
    }

    /**
     * Create an instance of {@link PartyDetail1 }
     * 
     * @return
     *     the new instance of {@link PartyDetail1 }
     */
    public PartyDetail1 createPartyDetail1() {
        return new PartyDetail1();
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
     * Create an instance of {@link PartyReport1Choice }
     * 
     * @return
     *     the new instance of {@link PartyReport1Choice }
     */
    public PartyReport1Choice createPartyReport1Choice() {
        return new PartyReport1Choice();
    }

    /**
     * Create an instance of {@link PartyUpdate1 }
     * 
     * @return
     *     the new instance of {@link PartyUpdate1 }
     */
    public PartyUpdate1 createPartyUpdate1() {
        return new PartyUpdate1();
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
     * Create an instance of {@link Period4Choice }
     * 
     * @return
     *     the new instance of {@link Period4Choice }
     */
    public Period4Choice createPeriod4Choice() {
        return new Period4Choice();
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
     * Create an instance of {@link PostalAddress6 }
     * 
     * @return
     *     the new instance of {@link PostalAddress6 }
     */
    public PostalAddress6 createPostalAddress6() {
        return new PostalAddress6();
    }

    /**
     * Create an instance of {@link StatusDetail1 }
     * 
     * @return
     *     the new instance of {@link StatusDetail1 }
     */
    public StatusDetail1 createStatusDetail1() {
        return new StatusDetail1();
    }

    /**
     * Create an instance of {@link SupervisingAuthorityIdentification1 }
     * 
     * @return
     *     the new instance of {@link SupervisingAuthorityIdentification1 }
     */
    public SupervisingAuthorityIdentification1 createSupervisingAuthorityIdentification1() {
        return new SupervisingAuthorityIdentification1();
    }

    /**
     * Create an instance of {@link SupervisingAuthorityIdentification1Choice }
     * 
     * @return
     *     the new instance of {@link SupervisingAuthorityIdentification1Choice }
     */
    public SupervisingAuthorityIdentification1Choice createSupervisingAuthorityIdentification1Choice() {
        return new SupervisingAuthorityIdentification1Choice();
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
    @XmlElementDecl(namespace = "urn:iso:std:iso:20022:tech:xsd:auth.076.001.01", name = "Document")
    public JAXBElement<Document> createDocument(Document value) {
        return new JAXBElement<>(_Document_QNAME, Document.class, null, value);
    }

}
