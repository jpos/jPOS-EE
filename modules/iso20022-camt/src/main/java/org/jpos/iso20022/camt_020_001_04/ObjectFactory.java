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

package org.jpos.iso20022.camt_020_001_04;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.jpos.iso20022.camt_020_001_04 package. 
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

    private static final QName _Document_QNAME = new QName("urn:iso:std:iso:20022:tech:xsd:camt.020.001.04", "Document");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.jpos.iso20022.camt_020_001_04
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
     * Create an instance of {@link BusinessInformationCriteria1 }
     * 
     * @return
     *     the new instance of {@link BusinessInformationCriteria1 }
     */
    public BusinessInformationCriteria1 createBusinessInformationCriteria1() {
        return new BusinessInformationCriteria1();
    }

    /**
     * Create an instance of {@link BusinessInformationQueryDefinition3 }
     * 
     * @return
     *     the new instance of {@link BusinessInformationQueryDefinition3 }
     */
    public BusinessInformationQueryDefinition3 createBusinessInformationQueryDefinition3() {
        return new BusinessInformationQueryDefinition3();
    }

    /**
     * Create an instance of {@link CharacterSearch1Choice }
     * 
     * @return
     *     the new instance of {@link CharacterSearch1Choice }
     */
    public CharacterSearch1Choice createCharacterSearch1Choice() {
        return new CharacterSearch1Choice();
    }

    /**
     * Create an instance of {@link GeneralBusinessInformationCriteriaDefinition1Choice }
     * 
     * @return
     *     the new instance of {@link GeneralBusinessInformationCriteriaDefinition1Choice }
     */
    public GeneralBusinessInformationCriteriaDefinition1Choice createGeneralBusinessInformationCriteriaDefinition1Choice() {
        return new GeneralBusinessInformationCriteriaDefinition1Choice();
    }

    /**
     * Create an instance of {@link GeneralBusinessInformationReturnCriteria1 }
     * 
     * @return
     *     the new instance of {@link GeneralBusinessInformationReturnCriteria1 }
     */
    public GeneralBusinessInformationReturnCriteria1 createGeneralBusinessInformationReturnCriteria1() {
        return new GeneralBusinessInformationReturnCriteria1();
    }

    /**
     * Create an instance of {@link GeneralBusinessInformationSearchCriteria1 }
     * 
     * @return
     *     the new instance of {@link GeneralBusinessInformationSearchCriteria1 }
     */
    public GeneralBusinessInformationSearchCriteria1 createGeneralBusinessInformationSearchCriteria1() {
        return new GeneralBusinessInformationSearchCriteria1();
    }

    /**
     * Create an instance of {@link GetGeneralBusinessInformationV04 }
     * 
     * @return
     *     the new instance of {@link GetGeneralBusinessInformationV04 }
     */
    public GetGeneralBusinessInformationV04 createGetGeneralBusinessInformationV04() {
        return new GetGeneralBusinessInformationV04();
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
     * Create an instance of {@link MessageHeader1 }
     * 
     * @return
     *     the new instance of {@link MessageHeader1 }
     */
    public MessageHeader1 createMessageHeader1() {
        return new MessageHeader1();
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
    @XmlElementDecl(namespace = "urn:iso:std:iso:20022:tech:xsd:camt.020.001.04", name = "Document")
    public JAXBElement<Document> createDocument(Document value) {
        return new JAXBElement<>(_Document_QNAME, Document.class, null, value);
    }

}
