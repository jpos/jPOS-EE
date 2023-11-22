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

package org.jpos.iso20022.auth_057_001_01;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.jpos.iso20022.auth_057_001_01 package. 
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

    private static final QName _Document_QNAME = new QName("urn:iso:std:iso:20022:tech:xsd:auth.057.001.01", "Document");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.jpos.iso20022.auth_057_001_01
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
     * Create an instance of {@link Absolute1 }
     * 
     * @return
     *     the new instance of {@link Absolute1 }
     */
    public Absolute1 createAbsolute1() {
        return new Absolute1();
    }

    /**
     * Create an instance of {@link CCPPortfolioStressTestingDefinitionReportV01 }
     * 
     * @return
     *     the new instance of {@link CCPPortfolioStressTestingDefinitionReportV01 }
     */
    public CCPPortfolioStressTestingDefinitionReportV01 createCCPPortfolioStressTestingDefinitionReportV01() {
        return new CCPPortfolioStressTestingDefinitionReportV01();
    }

    /**
     * Create an instance of {@link GenericIdentification165 }
     * 
     * @return
     *     the new instance of {@link GenericIdentification165 }
     */
    public GenericIdentification165 createGenericIdentification165() {
        return new GenericIdentification165();
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
     * Create an instance of {@link RiskFactor1 }
     * 
     * @return
     *     the new instance of {@link RiskFactor1 }
     */
    public RiskFactor1 createRiskFactor1() {
        return new RiskFactor1();
    }

    /**
     * Create an instance of {@link ScenarioDefinition1 }
     * 
     * @return
     *     the new instance of {@link ScenarioDefinition1 }
     */
    public ScenarioDefinition1 createScenarioDefinition1() {
        return new ScenarioDefinition1();
    }

    /**
     * Create an instance of {@link Strategy1 }
     * 
     * @return
     *     the new instance of {@link Strategy1 }
     */
    public Strategy1 createStrategy1() {
        return new Strategy1();
    }

    /**
     * Create an instance of {@link StressItem1 }
     * 
     * @return
     *     the new instance of {@link StressItem1 }
     */
    public StressItem1 createStressItem1() {
        return new StressItem1();
    }

    /**
     * Create an instance of {@link StressItem1Choice }
     * 
     * @return
     *     the new instance of {@link StressItem1Choice }
     */
    public StressItem1Choice createStressItem1Choice() {
        return new StressItem1Choice();
    }

    /**
     * Create an instance of {@link StressSize1Choice }
     * 
     * @return
     *     the new instance of {@link StressSize1Choice }
     */
    public StressSize1Choice createStressSize1Choice() {
        return new StressSize1Choice();
    }

    /**
     * Create an instance of {@link StressedProduct1 }
     * 
     * @return
     *     the new instance of {@link StressedProduct1 }
     */
    public StressedProduct1 createStressedProduct1() {
        return new StressedProduct1();
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
    @XmlElementDecl(namespace = "urn:iso:std:iso:20022:tech:xsd:auth.057.001.01", name = "Document")
    public JAXBElement<Document> createDocument(Document value) {
        return new JAXBElement<>(_Document_QNAME, Document.class, null, value);
    }

}
