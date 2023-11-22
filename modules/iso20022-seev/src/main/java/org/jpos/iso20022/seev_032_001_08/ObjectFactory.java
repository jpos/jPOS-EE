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

package org.jpos.iso20022.seev_032_001_08;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.jpos.iso20022.seev_032_001_08 package. 
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

    private static final QName _Document_QNAME = new QName("urn:iso:std:iso:20022:tech:xsd:seev.032.001.08", "Document");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.jpos.iso20022.seev_032_001_08
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
     * Create an instance of {@link CorporateActionEventProcessingStatusAdviceV08 }
     * 
     * @return
     *     the new instance of {@link CorporateActionEventProcessingStatusAdviceV08 }
     */
    public CorporateActionEventProcessingStatusAdviceV08 createCorporateActionEventProcessingStatusAdviceV08() {
        return new CorporateActionEventProcessingStatusAdviceV08();
    }

    /**
     * Create an instance of {@link CorporateActionEventType102Choice }
     * 
     * @return
     *     the new instance of {@link CorporateActionEventType102Choice }
     */
    public CorporateActionEventType102Choice createCorporateActionEventType102Choice() {
        return new CorporateActionEventType102Choice();
    }

    /**
     * Create an instance of {@link CorporateActionGeneralInformation154 }
     * 
     * @return
     *     the new instance of {@link CorporateActionGeneralInformation154 }
     */
    public CorporateActionGeneralInformation154 createCorporateActionGeneralInformation154() {
        return new CorporateActionGeneralInformation154();
    }

    /**
     * Create an instance of {@link CorporateActionNarrative10 }
     * 
     * @return
     *     the new instance of {@link CorporateActionNarrative10 }
     */
    public CorporateActionNarrative10 createCorporateActionNarrative10() {
        return new CorporateActionNarrative10();
    }

    /**
     * Create an instance of {@link DocumentIdentification33 }
     * 
     * @return
     *     the new instance of {@link DocumentIdentification33 }
     */
    public DocumentIdentification33 createDocumentIdentification33() {
        return new DocumentIdentification33();
    }

    /**
     * Create an instance of {@link DocumentIdentification3Choice }
     * 
     * @return
     *     the new instance of {@link DocumentIdentification3Choice }
     */
    public DocumentIdentification3Choice createDocumentIdentification3Choice() {
        return new DocumentIdentification3Choice();
    }

    /**
     * Create an instance of {@link DocumentIdentification9 }
     * 
     * @return
     *     the new instance of {@link DocumentIdentification9 }
     */
    public DocumentIdentification9 createDocumentIdentification9() {
        return new DocumentIdentification9();
    }

    /**
     * Create an instance of {@link DocumentNumber5Choice }
     * 
     * @return
     *     the new instance of {@link DocumentNumber5Choice }
     */
    public DocumentNumber5Choice createDocumentNumber5Choice() {
        return new DocumentNumber5Choice();
    }

    /**
     * Create an instance of {@link EventProcessingStatus5Choice }
     * 
     * @return
     *     the new instance of {@link EventProcessingStatus5Choice }
     */
    public EventProcessingStatus5Choice createEventProcessingStatus5Choice() {
        return new EventProcessingStatus5Choice();
    }

    /**
     * Create an instance of {@link GenericIdentification30 }
     * 
     * @return
     *     the new instance of {@link GenericIdentification30 }
     */
    public GenericIdentification30 createGenericIdentification30() {
        return new GenericIdentification30();
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
     * Create an instance of {@link NoSpecifiedReason1 }
     * 
     * @return
     *     the new instance of {@link NoSpecifiedReason1 }
     */
    public NoSpecifiedReason1 createNoSpecifiedReason1() {
        return new NoSpecifiedReason1();
    }

    /**
     * Create an instance of {@link PendingReason54Choice }
     * 
     * @return
     *     the new instance of {@link PendingReason54Choice }
     */
    public PendingReason54Choice createPendingReason54Choice() {
        return new PendingReason54Choice();
    }

    /**
     * Create an instance of {@link PendingStatus58Choice }
     * 
     * @return
     *     the new instance of {@link PendingStatus58Choice }
     */
    public PendingStatus58Choice createPendingStatus58Choice() {
        return new PendingStatus58Choice();
    }

    /**
     * Create an instance of {@link PendingStatusReason18 }
     * 
     * @return
     *     the new instance of {@link PendingStatusReason18 }
     */
    public PendingStatusReason18 createPendingStatusReason18() {
        return new PendingStatusReason18();
    }

    /**
     * Create an instance of {@link ProprietaryReason4 }
     * 
     * @return
     *     the new instance of {@link ProprietaryReason4 }
     */
    public ProprietaryReason4 createProprietaryReason4() {
        return new ProprietaryReason4();
    }

    /**
     * Create an instance of {@link ProprietaryStatusAndReason6 }
     * 
     * @return
     *     the new instance of {@link ProprietaryStatusAndReason6 }
     */
    public ProprietaryStatusAndReason6 createProprietaryStatusAndReason6() {
        return new ProprietaryStatusAndReason6();
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
    @XmlElementDecl(namespace = "urn:iso:std:iso:20022:tech:xsd:seev.032.001.08", name = "Document")
    public JAXBElement<Document> createDocument(Document value) {
        return new JAXBElement<>(_Document_QNAME, Document.class, null, value);
    }

}
