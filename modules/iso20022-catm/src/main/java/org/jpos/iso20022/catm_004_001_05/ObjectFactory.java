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

package org.jpos.iso20022.catm_004_001_05;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.jpos.iso20022.catm_004_001_05 package. 
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

    private static final QName _Document_QNAME = new QName("urn:iso:std:iso:20022:tech:xsd:catm.004.001.05", "Document");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.jpos.iso20022.catm_004_001_05
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
     * Create an instance of {@link AcceptorRejection3 }
     * 
     * @return
     *     the new instance of {@link AcceptorRejection3 }
     */
    public AcceptorRejection3 createAcceptorRejection3() {
        return new AcceptorRejection3();
    }

    /**
     * Create an instance of {@link GenericIdentification176 }
     * 
     * @return
     *     the new instance of {@link GenericIdentification176 }
     */
    public GenericIdentification176 createGenericIdentification176() {
        return new GenericIdentification176();
    }

    /**
     * Create an instance of {@link GenericIdentification177 }
     * 
     * @return
     *     the new instance of {@link GenericIdentification177 }
     */
    public GenericIdentification177 createGenericIdentification177() {
        return new GenericIdentification177();
    }

    /**
     * Create an instance of {@link Geolocation1 }
     * 
     * @return
     *     the new instance of {@link Geolocation1 }
     */
    public Geolocation1 createGeolocation1() {
        return new Geolocation1();
    }

    /**
     * Create an instance of {@link GeolocationGeographicCoordinates1 }
     * 
     * @return
     *     the new instance of {@link GeolocationGeographicCoordinates1 }
     */
    public GeolocationGeographicCoordinates1 createGeolocationGeographicCoordinates1() {
        return new GeolocationGeographicCoordinates1();
    }

    /**
     * Create an instance of {@link GeolocationUTMCoordinates1 }
     * 
     * @return
     *     the new instance of {@link GeolocationUTMCoordinates1 }
     */
    public GeolocationUTMCoordinates1 createGeolocationUTMCoordinates1() {
        return new GeolocationUTMCoordinates1();
    }

    /**
     * Create an instance of {@link NetworkParameters7 }
     * 
     * @return
     *     the new instance of {@link NetworkParameters7 }
     */
    public NetworkParameters7 createNetworkParameters7() {
        return new NetworkParameters7();
    }

    /**
     * Create an instance of {@link NetworkParameters9 }
     * 
     * @return
     *     the new instance of {@link NetworkParameters9 }
     */
    public NetworkParameters9 createNetworkParameters9() {
        return new NetworkParameters9();
    }

    /**
     * Create an instance of {@link TMSHeader1 }
     * 
     * @return
     *     the new instance of {@link TMSHeader1 }
     */
    public TMSHeader1 createTMSHeader1() {
        return new TMSHeader1();
    }

    /**
     * Create an instance of {@link TerminalManagementRejectionV05 }
     * 
     * @return
     *     the new instance of {@link TerminalManagementRejectionV05 }
     */
    public TerminalManagementRejectionV05 createTerminalManagementRejectionV05() {
        return new TerminalManagementRejectionV05();
    }

    /**
     * Create an instance of {@link Traceability8 }
     * 
     * @return
     *     the new instance of {@link Traceability8 }
     */
    public Traceability8 createTraceability8() {
        return new Traceability8();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Document }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Document }{@code >}
     */
    @XmlElementDecl(namespace = "urn:iso:std:iso:20022:tech:xsd:catm.004.001.05", name = "Document")
    public JAXBElement<Document> createDocument(Document value) {
        return new JAXBElement<>(_Document_QNAME, Document.class, null, value);
    }

}
