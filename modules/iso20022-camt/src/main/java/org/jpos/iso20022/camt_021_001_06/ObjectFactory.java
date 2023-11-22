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

package org.jpos.iso20022.camt_021_001_06;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.jpos.iso20022.camt_021_001_06 package. 
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

    private static final QName _Document_QNAME = new QName("urn:iso:std:iso:20022:tech:xsd:camt.021.001.06", "Document");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.jpos.iso20022.camt_021_001_06
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
     * Create an instance of {@link ErrorHandling3Choice }
     * 
     * @return
     *     the new instance of {@link ErrorHandling3Choice }
     */
    public ErrorHandling3Choice createErrorHandling3Choice() {
        return new ErrorHandling3Choice();
    }

    /**
     * Create an instance of {@link ErrorHandling5 }
     * 
     * @return
     *     the new instance of {@link ErrorHandling5 }
     */
    public ErrorHandling5 createErrorHandling5() {
        return new ErrorHandling5();
    }

    /**
     * Create an instance of {@link GeneralBusinessInformation1 }
     * 
     * @return
     *     the new instance of {@link GeneralBusinessInformation1 }
     */
    public GeneralBusinessInformation1 createGeneralBusinessInformation1() {
        return new GeneralBusinessInformation1();
    }

    /**
     * Create an instance of {@link GeneralBusinessOrError7Choice }
     * 
     * @return
     *     the new instance of {@link GeneralBusinessOrError7Choice }
     */
    public GeneralBusinessOrError7Choice createGeneralBusinessOrError7Choice() {
        return new GeneralBusinessOrError7Choice();
    }

    /**
     * Create an instance of {@link GeneralBusinessOrError8Choice }
     * 
     * @return
     *     the new instance of {@link GeneralBusinessOrError8Choice }
     */
    public GeneralBusinessOrError8Choice createGeneralBusinessOrError8Choice() {
        return new GeneralBusinessOrError8Choice();
    }

    /**
     * Create an instance of {@link GeneralBusinessReport6 }
     * 
     * @return
     *     the new instance of {@link GeneralBusinessReport6 }
     */
    public GeneralBusinessReport6 createGeneralBusinessReport6() {
        return new GeneralBusinessReport6();
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
     * Create an instance of {@link InformationQualifierType1 }
     * 
     * @return
     *     the new instance of {@link InformationQualifierType1 }
     */
    public InformationQualifierType1 createInformationQualifierType1() {
        return new InformationQualifierType1();
    }

    /**
     * Create an instance of {@link MessageHeader7 }
     * 
     * @return
     *     the new instance of {@link MessageHeader7 }
     */
    public MessageHeader7 createMessageHeader7() {
        return new MessageHeader7();
    }

    /**
     * Create an instance of {@link OriginalBusinessQuery1 }
     * 
     * @return
     *     the new instance of {@link OriginalBusinessQuery1 }
     */
    public OriginalBusinessQuery1 createOriginalBusinessQuery1() {
        return new OriginalBusinessQuery1();
    }

    /**
     * Create an instance of {@link RequestType4Choice }
     * 
     * @return
     *     the new instance of {@link RequestType4Choice }
     */
    public RequestType4Choice createRequestType4Choice() {
        return new RequestType4Choice();
    }

    /**
     * Create an instance of {@link ReturnGeneralBusinessInformationV06 }
     * 
     * @return
     *     the new instance of {@link ReturnGeneralBusinessInformationV06 }
     */
    public ReturnGeneralBusinessInformationV06 createReturnGeneralBusinessInformationV06() {
        return new ReturnGeneralBusinessInformationV06();
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
    @XmlElementDecl(namespace = "urn:iso:std:iso:20022:tech:xsd:camt.021.001.06", name = "Document")
    public JAXBElement<Document> createDocument(Document value) {
        return new JAXBElement<>(_Document_QNAME, Document.class, null, value);
    }

}
