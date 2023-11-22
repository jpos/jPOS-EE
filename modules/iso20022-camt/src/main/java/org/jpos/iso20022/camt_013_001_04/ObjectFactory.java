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

package org.jpos.iso20022.camt_013_001_04;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.jpos.iso20022.camt_013_001_04 package. 
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

    private static final QName _Document_QNAME = new QName("urn:iso:std:iso:20022:tech:xsd:camt.013.001.04", "Document");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.jpos.iso20022.camt_013_001_04
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
     * Create an instance of {@link ClearingSystemIdentification2Choice }
     * 
     * @return
     *     the new instance of {@link ClearingSystemIdentification2Choice }
     */
    public ClearingSystemIdentification2Choice createClearingSystemIdentification2Choice() {
        return new ClearingSystemIdentification2Choice();
    }

    /**
     * Create an instance of {@link ClearingSystemMemberIdentification2 }
     * 
     * @return
     *     the new instance of {@link ClearingSystemMemberIdentification2 }
     */
    public ClearingSystemMemberIdentification2 createClearingSystemMemberIdentification2() {
        return new ClearingSystemMemberIdentification2();
    }

    /**
     * Create an instance of {@link FinancialIdentificationSchemeName1Choice }
     * 
     * @return
     *     the new instance of {@link FinancialIdentificationSchemeName1Choice }
     */
    public FinancialIdentificationSchemeName1Choice createFinancialIdentificationSchemeName1Choice() {
        return new FinancialIdentificationSchemeName1Choice();
    }

    /**
     * Create an instance of {@link GenericFinancialIdentification1 }
     * 
     * @return
     *     the new instance of {@link GenericFinancialIdentification1 }
     */
    public GenericFinancialIdentification1 createGenericFinancialIdentification1() {
        return new GenericFinancialIdentification1();
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
     * Create an instance of {@link GetMemberV04 }
     * 
     * @return
     *     the new instance of {@link GetMemberV04 }
     */
    public GetMemberV04 createGetMemberV04() {
        return new GetMemberV04();
    }

    /**
     * Create an instance of {@link MemberCriteria4 }
     * 
     * @return
     *     the new instance of {@link MemberCriteria4 }
     */
    public MemberCriteria4 createMemberCriteria4() {
        return new MemberCriteria4();
    }

    /**
     * Create an instance of {@link MemberCriteriaDefinition2Choice }
     * 
     * @return
     *     the new instance of {@link MemberCriteriaDefinition2Choice }
     */
    public MemberCriteriaDefinition2Choice createMemberCriteriaDefinition2Choice() {
        return new MemberCriteriaDefinition2Choice();
    }

    /**
     * Create an instance of {@link MemberIdentification3Choice }
     * 
     * @return
     *     the new instance of {@link MemberIdentification3Choice }
     */
    public MemberIdentification3Choice createMemberIdentification3Choice() {
        return new MemberIdentification3Choice();
    }

    /**
     * Create an instance of {@link MemberQueryDefinition4 }
     * 
     * @return
     *     the new instance of {@link MemberQueryDefinition4 }
     */
    public MemberQueryDefinition4 createMemberQueryDefinition4() {
        return new MemberQueryDefinition4();
    }

    /**
     * Create an instance of {@link MemberReturnCriteria1 }
     * 
     * @return
     *     the new instance of {@link MemberReturnCriteria1 }
     */
    public MemberReturnCriteria1 createMemberReturnCriteria1() {
        return new MemberReturnCriteria1();
    }

    /**
     * Create an instance of {@link MemberSearchCriteria4 }
     * 
     * @return
     *     the new instance of {@link MemberSearchCriteria4 }
     */
    public MemberSearchCriteria4 createMemberSearchCriteria4() {
        return new MemberSearchCriteria4();
    }

    /**
     * Create an instance of {@link MessageHeader9 }
     * 
     * @return
     *     the new instance of {@link MessageHeader9 }
     */
    public MessageHeader9 createMessageHeader9() {
        return new MessageHeader9();
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
     * Create an instance of {@link SystemMemberStatus1Choice }
     * 
     * @return
     *     the new instance of {@link SystemMemberStatus1Choice }
     */
    public SystemMemberStatus1Choice createSystemMemberStatus1Choice() {
        return new SystemMemberStatus1Choice();
    }

    /**
     * Create an instance of {@link SystemMemberType1Choice }
     * 
     * @return
     *     the new instance of {@link SystemMemberType1Choice }
     */
    public SystemMemberType1Choice createSystemMemberType1Choice() {
        return new SystemMemberType1Choice();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Document }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Document }{@code >}
     */
    @XmlElementDecl(namespace = "urn:iso:std:iso:20022:tech:xsd:camt.013.001.04", name = "Document")
    public JAXBElement<Document> createDocument(Document value) {
        return new JAXBElement<>(_Document_QNAME, Document.class, null, value);
    }

}
