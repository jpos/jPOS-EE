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

package org.jpos.iso20022.reda_023_001_01;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.jpos.iso20022.reda_023_001_01 package. 
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

    private static final QName _Document_QNAME = new QName("urn:iso:std:iso:20022:tech:xsd:reda.023.001.01", "Document");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.jpos.iso20022.reda_023_001_01
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
     * Create an instance of {@link GenericIdentification30 }
     * 
     * @return
     *     the new instance of {@link GenericIdentification30 }
     */
    public GenericIdentification30 createGenericIdentification30() {
        return new GenericIdentification30();
    }

    /**
     * Create an instance of {@link MarketSpecificAttribute1 }
     * 
     * @return
     *     the new instance of {@link MarketSpecificAttribute1 }
     */
    public MarketSpecificAttribute1 createMarketSpecificAttribute1() {
        return new MarketSpecificAttribute1();
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
     * Create an instance of {@link SecuritiesAccount19 }
     * 
     * @return
     *     the new instance of {@link SecuritiesAccount19 }
     */
    public SecuritiesAccount19 createSecuritiesAccount19() {
        return new SecuritiesAccount19();
    }

    /**
     * Create an instance of {@link SecuritiesAccountModification2 }
     * 
     * @return
     *     the new instance of {@link SecuritiesAccountModification2 }
     */
    public SecuritiesAccountModification2 createSecuritiesAccountModification2() {
        return new SecuritiesAccountModification2();
    }

    /**
     * Create an instance of {@link SecuritiesAccountModification2Choice }
     * 
     * @return
     *     the new instance of {@link SecuritiesAccountModification2Choice }
     */
    public SecuritiesAccountModification2Choice createSecuritiesAccountModification2Choice() {
        return new SecuritiesAccountModification2Choice();
    }

    /**
     * Create an instance of {@link SecuritiesAccountModificationRequestV01 }
     * 
     * @return
     *     the new instance of {@link SecuritiesAccountModificationRequestV01 }
     */
    public SecuritiesAccountModificationRequestV01 createSecuritiesAccountModificationRequestV01() {
        return new SecuritiesAccountModificationRequestV01();
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
     * Create an instance of {@link SystemRestriction1 }
     * 
     * @return
     *     the new instance of {@link SystemRestriction1 }
     */
    public SystemRestriction1 createSystemRestriction1() {
        return new SystemRestriction1();
    }

    /**
     * Create an instance of {@link SystemSecuritiesAccount5 }
     * 
     * @return
     *     the new instance of {@link SystemSecuritiesAccount5 }
     */
    public SystemSecuritiesAccount5 createSystemSecuritiesAccount5() {
        return new SystemSecuritiesAccount5();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Document }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Document }{@code >}
     */
    @XmlElementDecl(namespace = "urn:iso:std:iso:20022:tech:xsd:reda.023.001.01", name = "Document")
    public JAXBElement<Document> createDocument(Document value) {
        return new JAXBElement<>(_Document_QNAME, Document.class, null, value);
    }

}
