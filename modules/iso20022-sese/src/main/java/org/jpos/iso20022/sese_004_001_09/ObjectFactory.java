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

package org.jpos.iso20022.sese_004_001_09;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.jpos.iso20022.sese_004_001_09 package. 
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

    private static final QName _Document_QNAME = new QName("urn:iso:std:iso:20022:tech:xsd:sese.004.001.09", "Document");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.jpos.iso20022.sese_004_001_09
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
     * Create an instance of {@link AdditionalReference10 }
     * 
     * @return
     *     the new instance of {@link AdditionalReference10 }
     */
    public AdditionalReference10 createAdditionalReference10() {
        return new AdditionalReference10();
    }

    /**
     * Create an instance of {@link AdditionalReference11 }
     * 
     * @return
     *     the new instance of {@link AdditionalReference11 }
     */
    public AdditionalReference11 createAdditionalReference11() {
        return new AdditionalReference11();
    }

    /**
     * Create an instance of {@link CopyInformation5 }
     * 
     * @return
     *     the new instance of {@link CopyInformation5 }
     */
    public CopyInformation5 createCopyInformation5() {
        return new CopyInformation5();
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
     * Create an instance of {@link MarketPracticeVersion1 }
     * 
     * @return
     *     the new instance of {@link MarketPracticeVersion1 }
     */
    public MarketPracticeVersion1 createMarketPracticeVersion1() {
        return new MarketPracticeVersion1();
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
     * Create an instance of {@link NameAndAddress5 }
     * 
     * @return
     *     the new instance of {@link NameAndAddress5 }
     */
    public NameAndAddress5 createNameAndAddress5() {
        return new NameAndAddress5();
    }

    /**
     * Create an instance of {@link PartyIdentification125Choice }
     * 
     * @return
     *     the new instance of {@link PartyIdentification125Choice }
     */
    public PartyIdentification125Choice createPartyIdentification125Choice() {
        return new PartyIdentification125Choice();
    }

    /**
     * Create an instance of {@link PartyIdentification139 }
     * 
     * @return
     *     the new instance of {@link PartyIdentification139 }
     */
    public PartyIdentification139 createPartyIdentification139() {
        return new PartyIdentification139();
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
     * Create an instance of {@link ReversalOfTransferOutConfirmationV09 }
     * 
     * @return
     *     the new instance of {@link ReversalOfTransferOutConfirmationV09 }
     */
    public ReversalOfTransferOutConfirmationV09 createReversalOfTransferOutConfirmationV09() {
        return new ReversalOfTransferOutConfirmationV09();
    }

    /**
     * Create an instance of {@link TransferReference16 }
     * 
     * @return
     *     the new instance of {@link TransferReference16 }
     */
    public TransferReference16 createTransferReference16() {
        return new TransferReference16();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Document }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Document }{@code >}
     */
    @XmlElementDecl(namespace = "urn:iso:std:iso:20022:tech:xsd:sese.004.001.09", name = "Document")
    public JAXBElement<Document> createDocument(Document value) {
        return new JAXBElement<>(_Document_QNAME, Document.class, null, value);
    }

}
