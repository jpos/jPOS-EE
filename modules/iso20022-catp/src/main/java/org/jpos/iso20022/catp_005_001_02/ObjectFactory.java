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

package org.jpos.iso20022.catp_005_001_02;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.jpos.iso20022.catp_005_001_02 package. 
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

    private static final QName _Document_QNAME = new QName("urn:iso:std:iso:20022:tech:xsd:catp.005.001.02", "Document");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.jpos.iso20022.catp_005_001_02
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
     * Create an instance of {@link ATMCommand7 }
     * 
     * @return
     *     the new instance of {@link ATMCommand7 }
     */
    public ATMCommand7 createATMCommand7() {
        return new ATMCommand7();
    }

    /**
     * Create an instance of {@link ATMCommandIdentification1 }
     * 
     * @return
     *     the new instance of {@link ATMCommandIdentification1 }
     */
    public ATMCommandIdentification1 createATMCommandIdentification1() {
        return new ATMCommandIdentification1();
    }

    /**
     * Create an instance of {@link ATMCommandParameters1Choice }
     * 
     * @return
     *     the new instance of {@link ATMCommandParameters1Choice }
     */
    public ATMCommandParameters1Choice createATMCommandParameters1Choice() {
        return new ATMCommandParameters1Choice();
    }

    /**
     * Create an instance of {@link ATMConfigurationParameter1 }
     * 
     * @return
     *     the new instance of {@link ATMConfigurationParameter1 }
     */
    public ATMConfigurationParameter1 createATMConfigurationParameter1() {
        return new ATMConfigurationParameter1();
    }

    /**
     * Create an instance of {@link ATMMessageFunction2 }
     * 
     * @return
     *     the new instance of {@link ATMMessageFunction2 }
     */
    public ATMMessageFunction2 createATMMessageFunction2() {
        return new ATMMessageFunction2();
    }

    /**
     * Create an instance of {@link ATMReject2 }
     * 
     * @return
     *     the new instance of {@link ATMReject2 }
     */
    public ATMReject2 createATMReject2() {
        return new ATMReject2();
    }

    /**
     * Create an instance of {@link ATMRejectV02 }
     * 
     * @return
     *     the new instance of {@link ATMRejectV02 }
     */
    public ATMRejectV02 createATMRejectV02() {
        return new ATMRejectV02();
    }

    /**
     * Create an instance of {@link GenericIdentification77 }
     * 
     * @return
     *     the new instance of {@link GenericIdentification77 }
     */
    public GenericIdentification77 createGenericIdentification77() {
        return new GenericIdentification77();
    }

    /**
     * Create an instance of {@link Header33 }
     * 
     * @return
     *     the new instance of {@link Header33 }
     */
    public Header33 createHeader33() {
        return new Header33();
    }

    /**
     * Create an instance of {@link Traceability4 }
     * 
     * @return
     *     the new instance of {@link Traceability4 }
     */
    public Traceability4 createTraceability4() {
        return new Traceability4();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Document }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Document }{@code >}
     */
    @XmlElementDecl(namespace = "urn:iso:std:iso:20022:tech:xsd:catp.005.001.02", name = "Document")
    public JAXBElement<Document> createDocument(Document value) {
        return new JAXBElement<>(_Document_QNAME, Document.class, null, value);
    }

}
