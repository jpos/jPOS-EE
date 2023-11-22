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

package org.jpos.iso20022.auth_028_001_01;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.jpos.iso20022.auth_028_001_01 package. 
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

    private static final QName _Document_QNAME = new QName("urn:iso:std:iso:20022:tech:xsd:auth.028.001.01", "Document");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.jpos.iso20022.auth_028_001_01
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
     * Create an instance of {@link DateTimePeriod1 }
     * 
     * @return
     *     the new instance of {@link DateTimePeriod1 }
     */
    public DateTimePeriod1 createDateTimePeriod1() {
        return new DateTimePeriod1();
    }

    /**
     * Create an instance of {@link GenericValidationRuleIdentification1 }
     * 
     * @return
     *     the new instance of {@link GenericValidationRuleIdentification1 }
     */
    public GenericValidationRuleIdentification1 createGenericValidationRuleIdentification1() {
        return new GenericValidationRuleIdentification1();
    }

    /**
     * Create an instance of {@link MoneyMarketStatisticalReportStatusAdviceV01 }
     * 
     * @return
     *     the new instance of {@link MoneyMarketStatisticalReportStatusAdviceV01 }
     */
    public MoneyMarketStatisticalReportStatusAdviceV01 createMoneyMarketStatisticalReportStatusAdviceV01() {
        return new MoneyMarketStatisticalReportStatusAdviceV01();
    }

    /**
     * Create an instance of {@link MoneyMarketStatusReportHeader1 }
     * 
     * @return
     *     the new instance of {@link MoneyMarketStatusReportHeader1 }
     */
    public MoneyMarketStatusReportHeader1 createMoneyMarketStatusReportHeader1() {
        return new MoneyMarketStatusReportHeader1();
    }

    /**
     * Create an instance of {@link MoneyMarketTransactionStatus2 }
     * 
     * @return
     *     the new instance of {@link MoneyMarketTransactionStatus2 }
     */
    public MoneyMarketTransactionStatus2 createMoneyMarketTransactionStatus2() {
        return new MoneyMarketTransactionStatus2();
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
     * Create an instance of {@link ValidationRuleSchemeName1Choice }
     * 
     * @return
     *     the new instance of {@link ValidationRuleSchemeName1Choice }
     */
    public ValidationRuleSchemeName1Choice createValidationRuleSchemeName1Choice() {
        return new ValidationRuleSchemeName1Choice();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Document }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Document }{@code >}
     */
    @XmlElementDecl(namespace = "urn:iso:std:iso:20022:tech:xsd:auth.028.001.01", name = "Document")
    public JAXBElement<Document> createDocument(Document value) {
        return new JAXBElement<>(_Document_QNAME, Document.class, null, value);
    }

}
