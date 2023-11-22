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

package org.jpos.iso20022.auth_054_001_01;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.jpos.iso20022.auth_054_001_01 package. 
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

    private static final QName _Document_QNAME = new QName("urn:iso:std:iso:20022:tech:xsd:auth.054.001.01", "Document");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.jpos.iso20022.auth_054_001_01
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
     * Create an instance of {@link CCPClearingMemberReportV01 }
     * 
     * @return
     *     the new instance of {@link CCPClearingMemberReportV01 }
     */
    public CCPClearingMemberReportV01 createCCPClearingMemberReportV01() {
        return new CCPClearingMemberReportV01();
    }

    /**
     * Create an instance of {@link ClearingAccount1 }
     * 
     * @return
     *     the new instance of {@link ClearingAccount1 }
     */
    public ClearingAccount1 createClearingAccount1() {
        return new ClearingAccount1();
    }

    /**
     * Create an instance of {@link ClearingMember1 }
     * 
     * @return
     *     the new instance of {@link ClearingMember1 }
     */
    public ClearingMember1 createClearingMember1() {
        return new ClearingMember1();
    }

    /**
     * Create an instance of {@link CollateralAccount5 }
     * 
     * @return
     *     the new instance of {@link CollateralAccount5 }
     */
    public CollateralAccount5 createCollateralAccount5() {
        return new CollateralAccount5();
    }

    /**
     * Create an instance of {@link GenericIdentification168 }
     * 
     * @return
     *     the new instance of {@link GenericIdentification168 }
     */
    public GenericIdentification168 createGenericIdentification168() {
        return new GenericIdentification168();
    }

    /**
     * Create an instance of {@link MarginAccount1 }
     * 
     * @return
     *     the new instance of {@link MarginAccount1 }
     */
    public MarginAccount1 createMarginAccount1() {
        return new MarginAccount1();
    }

    /**
     * Create an instance of {@link PartyIdentification118Choice }
     * 
     * @return
     *     the new instance of {@link PartyIdentification118Choice }
     */
    public PartyIdentification118Choice createPartyIdentification118Choice() {
        return new PartyIdentification118Choice();
    }

    /**
     * Create an instance of {@link PositionAccount1 }
     * 
     * @return
     *     the new instance of {@link PositionAccount1 }
     */
    public PositionAccount1 createPositionAccount1() {
        return new PositionAccount1();
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
    @XmlElementDecl(namespace = "urn:iso:std:iso:20022:tech:xsd:auth.054.001.01", name = "Document")
    public JAXBElement<Document> createDocument(Document value) {
        return new JAXBElement<>(_Document_QNAME, Document.class, null, value);
    }

}
