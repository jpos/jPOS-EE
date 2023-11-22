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

package org.jpos.iso20022.semt_020_002_07;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.jpos.iso20022.semt_020_002_07 package. 
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

    private static final QName _Document_QNAME = new QName("urn:iso:std:iso:20022:tech:xsd:semt.020.002.07", "Document");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.jpos.iso20022.semt_020_002_07
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
     * Create an instance of {@link BlockChainAddressWallet7 }
     * 
     * @return
     *     the new instance of {@link BlockChainAddressWallet7 }
     */
    public BlockChainAddressWallet7 createBlockChainAddressWallet7() {
        return new BlockChainAddressWallet7();
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
     * Create an instance of {@link GenericIdentification84 }
     * 
     * @return
     *     the new instance of {@link GenericIdentification84 }
     */
    public GenericIdentification84 createGenericIdentification84() {
        return new GenericIdentification84();
    }

    /**
     * Create an instance of {@link PartyIdentification136Choice }
     * 
     * @return
     *     the new instance of {@link PartyIdentification136Choice }
     */
    public PartyIdentification136Choice createPartyIdentification136Choice() {
        return new PartyIdentification136Choice();
    }

    /**
     * Create an instance of {@link PartyIdentification156 }
     * 
     * @return
     *     the new instance of {@link PartyIdentification156 }
     */
    public PartyIdentification156 createPartyIdentification156() {
        return new PartyIdentification156();
    }

    /**
     * Create an instance of {@link References79Choice }
     * 
     * @return
     *     the new instance of {@link References79Choice }
     */
    public References79Choice createReferences79Choice() {
        return new References79Choice();
    }

    /**
     * Create an instance of {@link SecuritiesAccount30 }
     * 
     * @return
     *     the new instance of {@link SecuritiesAccount30 }
     */
    public SecuritiesAccount30 createSecuritiesAccount30() {
        return new SecuritiesAccount30();
    }

    /**
     * Create an instance of {@link SecuritiesMessageCancellationAdvice002V07 }
     * 
     * @return
     *     the new instance of {@link SecuritiesMessageCancellationAdvice002V07 }
     */
    public SecuritiesMessageCancellationAdvice002V07 createSecuritiesMessageCancellationAdvice002V07() {
        return new SecuritiesMessageCancellationAdvice002V07();
    }

    /**
     * Create an instance of {@link SettlementTypeAndIdentification22 }
     * 
     * @return
     *     the new instance of {@link SettlementTypeAndIdentification22 }
     */
    public SettlementTypeAndIdentification22 createSettlementTypeAndIdentification22() {
        return new SettlementTypeAndIdentification22();
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
    @XmlElementDecl(namespace = "urn:iso:std:iso:20022:tech:xsd:semt.020.002.07", name = "Document")
    public JAXBElement<Document> createDocument(Document value) {
        return new JAXBElement<>(_Document_QNAME, Document.class, null, value);
    }

}
