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

package org.jpos.iso20022.auth_072_001_01;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.jpos.iso20022.auth_072_001_01 package. 
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

    private static final QName _Document_QNAME = new QName("urn:iso:std:iso:20022:tech:xsd:auth.072.001.01", "Document");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.jpos.iso20022.auth_072_001_01
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
     * Create an instance of {@link ContactDetails4 }
     * 
     * @return
     *     the new instance of {@link ContactDetails4 }
     */
    public ContactDetails4 createContactDetails4() {
        return new ContactDetails4();
    }

    /**
     * Create an instance of {@link InternalisationData1 }
     * 
     * @return
     *     the new instance of {@link InternalisationData1 }
     */
    public InternalisationData1 createInternalisationData1() {
        return new InternalisationData1();
    }

    /**
     * Create an instance of {@link InternalisationData2 }
     * 
     * @return
     *     the new instance of {@link InternalisationData2 }
     */
    public InternalisationData2 createInternalisationData2() {
        return new InternalisationData2();
    }

    /**
     * Create an instance of {@link InternalisationDataRate1 }
     * 
     * @return
     *     the new instance of {@link InternalisationDataRate1 }
     */
    public InternalisationDataRate1 createInternalisationDataRate1() {
        return new InternalisationDataRate1();
    }

    /**
     * Create an instance of {@link InternalisationDataVolume1 }
     * 
     * @return
     *     the new instance of {@link InternalisationDataVolume1 }
     */
    public InternalisationDataVolume1 createInternalisationDataVolume1() {
        return new InternalisationDataVolume1();
    }

    /**
     * Create an instance of {@link IssuerCSDIdentification1 }
     * 
     * @return
     *     the new instance of {@link IssuerCSDIdentification1 }
     */
    public IssuerCSDIdentification1 createIssuerCSDIdentification1() {
        return new IssuerCSDIdentification1();
    }

    /**
     * Create an instance of {@link IssuerCSDReport1 }
     * 
     * @return
     *     the new instance of {@link IssuerCSDReport1 }
     */
    public IssuerCSDReport1 createIssuerCSDReport1() {
        return new IssuerCSDReport1();
    }

    /**
     * Create an instance of {@link SettlementInternaliser1 }
     * 
     * @return
     *     the new instance of {@link SettlementInternaliser1 }
     */
    public SettlementInternaliser1 createSettlementInternaliser1() {
        return new SettlementInternaliser1();
    }

    /**
     * Create an instance of {@link SettlementInternaliserClientType1 }
     * 
     * @return
     *     the new instance of {@link SettlementInternaliserClientType1 }
     */
    public SettlementInternaliserClientType1 createSettlementInternaliserClientType1() {
        return new SettlementInternaliserClientType1();
    }

    /**
     * Create an instance of {@link SettlementInternaliserFinancialInstrument1 }
     * 
     * @return
     *     the new instance of {@link SettlementInternaliserFinancialInstrument1 }
     */
    public SettlementInternaliserFinancialInstrument1 createSettlementInternaliserFinancialInstrument1() {
        return new SettlementInternaliserFinancialInstrument1();
    }

    /**
     * Create an instance of {@link SettlementInternaliserIdentification1 }
     * 
     * @return
     *     the new instance of {@link SettlementInternaliserIdentification1 }
     */
    public SettlementInternaliserIdentification1 createSettlementInternaliserIdentification1() {
        return new SettlementInternaliserIdentification1();
    }

    /**
     * Create an instance of {@link SettlementInternaliserReportHeader1 }
     * 
     * @return
     *     the new instance of {@link SettlementInternaliserReportHeader1 }
     */
    public SettlementInternaliserReportHeader1 createSettlementInternaliserReportHeader1() {
        return new SettlementInternaliserReportHeader1();
    }

    /**
     * Create an instance of {@link SettlementInternaliserReportV01 }
     * 
     * @return
     *     the new instance of {@link SettlementInternaliserReportV01 }
     */
    public SettlementInternaliserReportV01 createSettlementInternaliserReportV01() {
        return new SettlementInternaliserReportV01();
    }

    /**
     * Create an instance of {@link SettlementInternaliserTransactionType1 }
     * 
     * @return
     *     the new instance of {@link SettlementInternaliserTransactionType1 }
     */
    public SettlementInternaliserTransactionType1 createSettlementInternaliserTransactionType1() {
        return new SettlementInternaliserTransactionType1();
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
    @XmlElementDecl(namespace = "urn:iso:std:iso:20022:tech:xsd:auth.072.001.01", name = "Document")
    public JAXBElement<Document> createDocument(Document value) {
        return new JAXBElement<>(_Document_QNAME, Document.class, null, value);
    }

}
