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

package org.jpos.iso20022.setr_005_001_04;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.jpos.iso20022.setr_005_001_04 package. 
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

    private static final QName _Document_QNAME = new QName("urn:iso:std:iso:20022:tech:xsd:setr.005.001.04", "Document");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.jpos.iso20022.setr_005_001_04
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
     * Create an instance of {@link AdditionalReference8 }
     * 
     * @return
     *     the new instance of {@link AdditionalReference8 }
     */
    public AdditionalReference8 createAdditionalReference8() {
        return new AdditionalReference8();
    }

    /**
     * Create an instance of {@link AdditionalReference9 }
     * 
     * @return
     *     the new instance of {@link AdditionalReference9 }
     */
    public AdditionalReference9 createAdditionalReference9() {
        return new AdditionalReference9();
    }

    /**
     * Create an instance of {@link CancellationReason32Choice }
     * 
     * @return
     *     the new instance of {@link CancellationReason32Choice }
     */
    public CancellationReason32Choice createCancellationReason32Choice() {
        return new CancellationReason32Choice();
    }

    /**
     * Create an instance of {@link CopyInformation4 }
     * 
     * @return
     *     the new instance of {@link CopyInformation4 }
     */
    public CopyInformation4 createCopyInformation4() {
        return new CopyInformation4();
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
     * Create an instance of {@link GenericIdentification30 }
     * 
     * @return
     *     the new instance of {@link GenericIdentification30 }
     */
    public GenericIdentification30 createGenericIdentification30() {
        return new GenericIdentification30();
    }

    /**
     * Create an instance of {@link InvestmentFundOrder9 }
     * 
     * @return
     *     the new instance of {@link InvestmentFundOrder9 }
     */
    public InvestmentFundOrder9 createInvestmentFundOrder9() {
        return new InvestmentFundOrder9();
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
     * Create an instance of {@link PartyIdentification113 }
     * 
     * @return
     *     the new instance of {@link PartyIdentification113 }
     */
    public PartyIdentification113 createPartyIdentification113() {
        return new PartyIdentification113();
    }

    /**
     * Create an instance of {@link PartyIdentification90Choice }
     * 
     * @return
     *     the new instance of {@link PartyIdentification90Choice }
     */
    public PartyIdentification90Choice createPartyIdentification90Choice() {
        return new PartyIdentification90Choice();
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
     * Create an instance of {@link RedemptionOrderCancellationRequestV04 }
     * 
     * @return
     *     the new instance of {@link RedemptionOrderCancellationRequestV04 }
     */
    public RedemptionOrderCancellationRequestV04 createRedemptionOrderCancellationRequestV04() {
        return new RedemptionOrderCancellationRequestV04();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Document }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Document }{@code >}
     */
    @XmlElementDecl(namespace = "urn:iso:std:iso:20022:tech:xsd:setr.005.001.04", name = "Document")
    public JAXBElement<Document> createDocument(Document value) {
        return new JAXBElement<>(_Document_QNAME, Document.class, null, value);
    }

}
