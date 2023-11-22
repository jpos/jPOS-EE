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

package org.jpos.iso20022.reda_034_001_01;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.jpos.iso20022.reda_034_001_01 package. 
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

    private static final QName _Document_QNAME = new QName("urn:iso:std:iso:20022:tech:xsd:reda.034.001.01", "Document");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.jpos.iso20022.reda_034_001_01
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
     * Create an instance of {@link AuditTrail1 }
     * 
     * @return
     *     the new instance of {@link AuditTrail1 }
     */
    public AuditTrail1 createAuditTrail1() {
        return new AuditTrail1();
    }

    /**
     * Create an instance of {@link AuditTrailOrBusinessError6Choice }
     * 
     * @return
     *     the new instance of {@link AuditTrailOrBusinessError6Choice }
     */
    public AuditTrailOrBusinessError6Choice createAuditTrailOrBusinessError6Choice() {
        return new AuditTrailOrBusinessError6Choice();
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
     * Create an instance of {@link DatePeriodSearch1Choice }
     * 
     * @return
     *     the new instance of {@link DatePeriodSearch1Choice }
     */
    public DatePeriodSearch1Choice createDatePeriodSearch1Choice() {
        return new DatePeriodSearch1Choice();
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
     * Create an instance of {@link IdentificationSource3Choice }
     * 
     * @return
     *     the new instance of {@link IdentificationSource3Choice }
     */
    public IdentificationSource3Choice createIdentificationSource3Choice() {
        return new IdentificationSource3Choice();
    }

    /**
     * Create an instance of {@link MessageHeader12 }
     * 
     * @return
     *     the new instance of {@link MessageHeader12 }
     */
    public MessageHeader12 createMessageHeader12() {
        return new MessageHeader12();
    }

    /**
     * Create an instance of {@link OriginalBusinessInstruction1 }
     * 
     * @return
     *     the new instance of {@link OriginalBusinessInstruction1 }
     */
    public OriginalBusinessInstruction1 createOriginalBusinessInstruction1() {
        return new OriginalBusinessInstruction1();
    }

    /**
     * Create an instance of {@link OtherIdentification1 }
     * 
     * @return
     *     the new instance of {@link OtherIdentification1 }
     */
    public OtherIdentification1 createOtherIdentification1() {
        return new OtherIdentification1();
    }

    /**
     * Create an instance of {@link SecuritiesAuditTrailOrOperationalError4Choice }
     * 
     * @return
     *     the new instance of {@link SecuritiesAuditTrailOrOperationalError4Choice }
     */
    public SecuritiesAuditTrailOrOperationalError4Choice createSecuritiesAuditTrailOrOperationalError4Choice() {
        return new SecuritiesAuditTrailOrOperationalError4Choice();
    }

    /**
     * Create an instance of {@link SecuritiesAuditTrailReport4 }
     * 
     * @return
     *     the new instance of {@link SecuritiesAuditTrailReport4 }
     */
    public SecuritiesAuditTrailReport4 createSecuritiesAuditTrailReport4() {
        return new SecuritiesAuditTrailReport4();
    }

    /**
     * Create an instance of {@link SecuritiesAuditTrailReportV01 }
     * 
     * @return
     *     the new instance of {@link SecuritiesAuditTrailReportV01 }
     */
    public SecuritiesAuditTrailReportV01 createSecuritiesAuditTrailReportV01() {
        return new SecuritiesAuditTrailReportV01();
    }

    /**
     * Create an instance of {@link SecurityIdentification39 }
     * 
     * @return
     *     the new instance of {@link SecurityIdentification39 }
     */
    public SecurityIdentification39 createSecurityIdentification39() {
        return new SecurityIdentification39();
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
    @XmlElementDecl(namespace = "urn:iso:std:iso:20022:tech:xsd:reda.034.001.01", name = "Document")
    public JAXBElement<Document> createDocument(Document value) {
        return new JAXBElement<>(_Document_QNAME, Document.class, null, value);
    }

}
