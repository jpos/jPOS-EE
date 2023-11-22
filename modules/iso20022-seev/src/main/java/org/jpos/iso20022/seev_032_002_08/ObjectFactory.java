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

package org.jpos.iso20022.seev_032_002_08;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.jpos.iso20022.seev_032_002_08 package. 
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

    private static final QName _Document_QNAME = new QName("urn:iso:std:iso:20022:tech:xsd:seev.032.002.08", "Document");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.jpos.iso20022.seev_032_002_08
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
     * Create an instance of {@link CorporateActionEventProcessingStatusAdvice002V08 }
     * 
     * @return
     *     the new instance of {@link CorporateActionEventProcessingStatusAdvice002V08 }
     */
    public CorporateActionEventProcessingStatusAdvice002V08 createCorporateActionEventProcessingStatusAdvice002V08() {
        return new CorporateActionEventProcessingStatusAdvice002V08();
    }

    /**
     * Create an instance of {@link CorporateActionEventType103Choice }
     * 
     * @return
     *     the new instance of {@link CorporateActionEventType103Choice }
     */
    public CorporateActionEventType103Choice createCorporateActionEventType103Choice() {
        return new CorporateActionEventType103Choice();
    }

    /**
     * Create an instance of {@link CorporateActionGeneralInformation158 }
     * 
     * @return
     *     the new instance of {@link CorporateActionGeneralInformation158 }
     */
    public CorporateActionGeneralInformation158 createCorporateActionGeneralInformation158() {
        return new CorporateActionGeneralInformation158();
    }

    /**
     * Create an instance of {@link CorporateActionNarrative19 }
     * 
     * @return
     *     the new instance of {@link CorporateActionNarrative19 }
     */
    public CorporateActionNarrative19 createCorporateActionNarrative19() {
        return new CorporateActionNarrative19();
    }

    /**
     * Create an instance of {@link DocumentIdentification17 }
     * 
     * @return
     *     the new instance of {@link DocumentIdentification17 }
     */
    public DocumentIdentification17 createDocumentIdentification17() {
        return new DocumentIdentification17();
    }

    /**
     * Create an instance of {@link DocumentIdentification34 }
     * 
     * @return
     *     the new instance of {@link DocumentIdentification34 }
     */
    public DocumentIdentification34 createDocumentIdentification34() {
        return new DocumentIdentification34();
    }

    /**
     * Create an instance of {@link DocumentIdentification4Choice }
     * 
     * @return
     *     the new instance of {@link DocumentIdentification4Choice }
     */
    public DocumentIdentification4Choice createDocumentIdentification4Choice() {
        return new DocumentIdentification4Choice();
    }

    /**
     * Create an instance of {@link DocumentNumber6Choice }
     * 
     * @return
     *     the new instance of {@link DocumentNumber6Choice }
     */
    public DocumentNumber6Choice createDocumentNumber6Choice() {
        return new DocumentNumber6Choice();
    }

    /**
     * Create an instance of {@link EventProcessingStatus6Choice }
     * 
     * @return
     *     the new instance of {@link EventProcessingStatus6Choice }
     */
    public EventProcessingStatus6Choice createEventProcessingStatus6Choice() {
        return new EventProcessingStatus6Choice();
    }

    /**
     * Create an instance of {@link GenericIdentification47 }
     * 
     * @return
     *     the new instance of {@link GenericIdentification47 }
     */
    public GenericIdentification47 createGenericIdentification47() {
        return new GenericIdentification47();
    }

    /**
     * Create an instance of {@link GenericIdentification86 }
     * 
     * @return
     *     the new instance of {@link GenericIdentification86 }
     */
    public GenericIdentification86 createGenericIdentification86() {
        return new GenericIdentification86();
    }

    /**
     * Create an instance of {@link NoSpecifiedReason1 }
     * 
     * @return
     *     the new instance of {@link NoSpecifiedReason1 }
     */
    public NoSpecifiedReason1 createNoSpecifiedReason1() {
        return new NoSpecifiedReason1();
    }

    /**
     * Create an instance of {@link PendingReason55Choice }
     * 
     * @return
     *     the new instance of {@link PendingReason55Choice }
     */
    public PendingReason55Choice createPendingReason55Choice() {
        return new PendingReason55Choice();
    }

    /**
     * Create an instance of {@link PendingStatus59Choice }
     * 
     * @return
     *     the new instance of {@link PendingStatus59Choice }
     */
    public PendingStatus59Choice createPendingStatus59Choice() {
        return new PendingStatus59Choice();
    }

    /**
     * Create an instance of {@link PendingStatusReason19 }
     * 
     * @return
     *     the new instance of {@link PendingStatusReason19 }
     */
    public PendingStatusReason19 createPendingStatusReason19() {
        return new PendingStatusReason19();
    }

    /**
     * Create an instance of {@link ProprietaryReason5 }
     * 
     * @return
     *     the new instance of {@link ProprietaryReason5 }
     */
    public ProprietaryReason5 createProprietaryReason5() {
        return new ProprietaryReason5();
    }

    /**
     * Create an instance of {@link ProprietaryStatusAndReason7 }
     * 
     * @return
     *     the new instance of {@link ProprietaryStatusAndReason7 }
     */
    public ProprietaryStatusAndReason7 createProprietaryStatusAndReason7() {
        return new ProprietaryStatusAndReason7();
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
    @XmlElementDecl(namespace = "urn:iso:std:iso:20022:tech:xsd:seev.032.002.08", name = "Document")
    public JAXBElement<Document> createDocument(Document value) {
        return new JAXBElement<>(_Document_QNAME, Document.class, null, value);
    }

}
