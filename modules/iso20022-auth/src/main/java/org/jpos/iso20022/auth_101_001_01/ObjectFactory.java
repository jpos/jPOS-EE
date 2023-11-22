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

package org.jpos.iso20022.auth_101_001_01;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.jpos.iso20022.auth_101_001_01 package. 
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

    private static final QName _Document_QNAME = new QName("urn:iso:std:iso:20022:tech:xsd:auth.101.001.01", "Document");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.jpos.iso20022.auth_101_001_01
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
     * Create an instance of {@link Contact9 }
     * 
     * @return
     *     the new instance of {@link Contact9 }
     */
    public Contact9 createContact9() {
        return new Contact9();
    }

    /**
     * Create an instance of {@link DatePeriod2 }
     * 
     * @return
     *     the new instance of {@link DatePeriod2 }
     */
    public DatePeriod2 createDatePeriod2() {
        return new DatePeriod2();
    }

    /**
     * Create an instance of {@link SecuritiesSettlementSystemIdentification2 }
     * 
     * @return
     *     the new instance of {@link SecuritiesSettlementSystemIdentification2 }
     */
    public SecuritiesSettlementSystemIdentification2 createSecuritiesSettlementSystemIdentification2() {
        return new SecuritiesSettlementSystemIdentification2();
    }

    /**
     * Create an instance of {@link SettlementDataRate1Choice }
     * 
     * @return
     *     the new instance of {@link SettlementDataRate1Choice }
     */
    public SettlementDataRate1Choice createSettlementDataRate1Choice() {
        return new SettlementDataRate1Choice();
    }

    /**
     * Create an instance of {@link SettlementDataRate2 }
     * 
     * @return
     *     the new instance of {@link SettlementDataRate2 }
     */
    public SettlementDataRate2 createSettlementDataRate2() {
        return new SettlementDataRate2();
    }

    /**
     * Create an instance of {@link SettlementDataVolume2 }
     * 
     * @return
     *     the new instance of {@link SettlementDataVolume2 }
     */
    public SettlementDataVolume2 createSettlementDataVolume2() {
        return new SettlementDataVolume2();
    }

    /**
     * Create an instance of {@link SettlementFailsAnnualReportV01 }
     * 
     * @return
     *     the new instance of {@link SettlementFailsAnnualReportV01 }
     */
    public SettlementFailsAnnualReportV01 createSettlementFailsAnnualReportV01() {
        return new SettlementFailsAnnualReportV01();
    }

    /**
     * Create an instance of {@link SettlementFailsData4 }
     * 
     * @return
     *     the new instance of {@link SettlementFailsData4 }
     */
    public SettlementFailsData4 createSettlementFailsData4() {
        return new SettlementFailsData4();
    }

    /**
     * Create an instance of {@link SettlementFailsDerogation1 }
     * 
     * @return
     *     the new instance of {@link SettlementFailsDerogation1 }
     */
    public SettlementFailsDerogation1 createSettlementFailsDerogation1() {
        return new SettlementFailsDerogation1();
    }

    /**
     * Create an instance of {@link SettlementFailsJustification1 }
     * 
     * @return
     *     the new instance of {@link SettlementFailsJustification1 }
     */
    public SettlementFailsJustification1 createSettlementFailsJustification1() {
        return new SettlementFailsJustification1();
    }

    /**
     * Create an instance of {@link SettlementFailsReportHeader2 }
     * 
     * @return
     *     the new instance of {@link SettlementFailsReportHeader2 }
     */
    public SettlementFailsReportHeader2 createSettlementFailsReportHeader2() {
        return new SettlementFailsReportHeader2();
    }

    /**
     * Create an instance of {@link SettlementFailureReason2 }
     * 
     * @return
     *     the new instance of {@link SettlementFailureReason2 }
     */
    public SettlementFailureReason2 createSettlementFailureReason2() {
        return new SettlementFailureReason2();
    }

    /**
     * Create an instance of {@link SettlementFailureReason3 }
     * 
     * @return
     *     the new instance of {@link SettlementFailureReason3 }
     */
    public SettlementFailureReason3 createSettlementFailureReason3() {
        return new SettlementFailureReason3();
    }

    /**
     * Create an instance of {@link SettlementTotalData1 }
     * 
     * @return
     *     the new instance of {@link SettlementTotalData1 }
     */
    public SettlementTotalData1 createSettlementTotalData1() {
        return new SettlementTotalData1();
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
    @XmlElementDecl(namespace = "urn:iso:std:iso:20022:tech:xsd:auth.101.001.01", name = "Document")
    public JAXBElement<Document> createDocument(Document value) {
        return new JAXBElement<>(_Document_QNAME, Document.class, null, value);
    }

}
