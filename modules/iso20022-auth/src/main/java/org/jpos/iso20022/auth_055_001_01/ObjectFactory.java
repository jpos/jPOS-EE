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

package org.jpos.iso20022.auth_055_001_01;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.jpos.iso20022.auth_055_001_01 package. 
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

    private static final QName _Document_QNAME = new QName("urn:iso:std:iso:20022:tech:xsd:auth.055.001.01", "Document");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.jpos.iso20022.auth_055_001_01
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
     * Create an instance of {@link ActiveCurrencyAndAmount }
     * 
     * @return
     *     the new instance of {@link ActiveCurrencyAndAmount }
     */
    public ActiveCurrencyAndAmount createActiveCurrencyAndAmount() {
        return new ActiveCurrencyAndAmount();
    }

    /**
     * Create an instance of {@link Amount3 }
     * 
     * @return
     *     the new instance of {@link Amount3 }
     */
    public Amount3 createAmount3() {
        return new Amount3();
    }

    /**
     * Create an instance of {@link AmountAndDirection102 }
     * 
     * @return
     *     the new instance of {@link AmountAndDirection102 }
     */
    public AmountAndDirection102 createAmountAndDirection102() {
        return new AmountAndDirection102();
    }

    /**
     * Create an instance of {@link CCPMemberRequirementsReportV01 }
     * 
     * @return
     *     the new instance of {@link CCPMemberRequirementsReportV01 }
     */
    public CCPMemberRequirementsReportV01 createCCPMemberRequirementsReportV01() {
        return new CCPMemberRequirementsReportV01();
    }

    /**
     * Create an instance of {@link DefaultFundRequirement1 }
     * 
     * @return
     *     the new instance of {@link DefaultFundRequirement1 }
     */
    public DefaultFundRequirement1 createDefaultFundRequirement1() {
        return new DefaultFundRequirement1();
    }

    /**
     * Create an instance of {@link EndOfDayRequirement2 }
     * 
     * @return
     *     the new instance of {@link EndOfDayRequirement2 }
     */
    public EndOfDayRequirement2 createEndOfDayRequirement2() {
        return new EndOfDayRequirement2();
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
     * Create an instance of {@link GenericIdentification36 }
     * 
     * @return
     *     the new instance of {@link GenericIdentification36 }
     */
    public GenericIdentification36 createGenericIdentification36() {
        return new GenericIdentification36();
    }

    /**
     * Create an instance of {@link InitialMarginExposure1 }
     * 
     * @return
     *     the new instance of {@link InitialMarginExposure1 }
     */
    public InitialMarginExposure1 createInitialMarginExposure1() {
        return new InitialMarginExposure1();
    }

    /**
     * Create an instance of {@link InitialMarginRequirement1 }
     * 
     * @return
     *     the new instance of {@link InitialMarginRequirement1 }
     */
    public InitialMarginRequirement1 createInitialMarginRequirement1() {
        return new InitialMarginRequirement1();
    }

    /**
     * Create an instance of {@link IntraDayMarginCall1 }
     * 
     * @return
     *     the new instance of {@link IntraDayMarginCall1 }
     */
    public IntraDayMarginCall1 createIntraDayMarginCall1() {
        return new IntraDayMarginCall1();
    }

    /**
     * Create an instance of {@link IntraDayRequirement1 }
     * 
     * @return
     *     the new instance of {@link IntraDayRequirement1 }
     */
    public IntraDayRequirement1 createIntraDayRequirement1() {
        return new IntraDayRequirement1();
    }

    /**
     * Create an instance of {@link MarginType2Choice }
     * 
     * @return
     *     the new instance of {@link MarginType2Choice }
     */
    public MarginType2Choice createMarginType2Choice() {
        return new MarginType2Choice();
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
    @XmlElementDecl(namespace = "urn:iso:std:iso:20022:tech:xsd:auth.055.001.01", name = "Document")
    public JAXBElement<Document> createDocument(Document value) {
        return new JAXBElement<>(_Document_QNAME, Document.class, null, value);
    }

}
