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

package org.jpos.iso20022.auth_060_001_01;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.jpos.iso20022.auth_060_001_01 package. 
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

    private static final QName _Document_QNAME = new QName("urn:iso:std:iso:20022:tech:xsd:auth.060.001.01", "Document");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.jpos.iso20022.auth_060_001_01
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
     * Create an instance of {@link AmountAndDirection102 }
     * 
     * @return
     *     the new instance of {@link AmountAndDirection102 }
     */
    public AmountAndDirection102 createAmountAndDirection102() {
        return new AmountAndDirection102();
    }

    /**
     * Create an instance of {@link AmountAndDirection86 }
     * 
     * @return
     *     the new instance of {@link AmountAndDirection86 }
     */
    public AmountAndDirection86 createAmountAndDirection86() {
        return new AmountAndDirection86();
    }

    /**
     * Create an instance of {@link CCPDailyCashFlowsReportV01 }
     * 
     * @return
     *     the new instance of {@link CCPDailyCashFlowsReportV01 }
     */
    public CCPDailyCashFlowsReportV01 createCCPDailyCashFlowsReportV01() {
        return new CCPDailyCashFlowsReportV01();
    }

    /**
     * Create an instance of {@link ConcentrationAccount1 }
     * 
     * @return
     *     the new instance of {@link ConcentrationAccount1 }
     */
    public ConcentrationAccount1 createConcentrationAccount1() {
        return new ConcentrationAccount1();
    }

    /**
     * Create an instance of {@link ConcentrationAgent1 }
     * 
     * @return
     *     the new instance of {@link ConcentrationAgent1 }
     */
    public ConcentrationAgent1 createConcentrationAgent1() {
        return new ConcentrationAgent1();
    }

    /**
     * Create an instance of {@link Flows1 }
     * 
     * @return
     *     the new instance of {@link Flows1 }
     */
    public Flows1 createFlows1() {
        return new Flows1();
    }

    /**
     * Create an instance of {@link PaymentAccount1 }
     * 
     * @return
     *     the new instance of {@link PaymentAccount1 }
     */
    public PaymentAccount1 createPaymentAccount1() {
        return new PaymentAccount1();
    }

    /**
     * Create an instance of {@link SettlementAgent1 }
     * 
     * @return
     *     the new instance of {@link SettlementAgent1 }
     */
    public SettlementAgent1 createSettlementAgent1() {
        return new SettlementAgent1();
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
    @XmlElementDecl(namespace = "urn:iso:std:iso:20022:tech:xsd:auth.060.001.01", name = "Document")
    public JAXBElement<Document> createDocument(Document value) {
        return new JAXBElement<>(_Document_QNAME, Document.class, null, value);
    }

}
