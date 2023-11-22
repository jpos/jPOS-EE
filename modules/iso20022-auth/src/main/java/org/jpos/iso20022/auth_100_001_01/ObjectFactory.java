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

package org.jpos.iso20022.auth_100_001_01;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.jpos.iso20022.auth_100_001_01 package. 
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

    private static final QName _Document_QNAME = new QName("urn:iso:std:iso:20022:tech:xsd:auth.100.001.01", "Document");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.jpos.iso20022.auth_100_001_01
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
     * Create an instance of {@link IdentificationSource3Choice }
     * 
     * @return
     *     the new instance of {@link IdentificationSource3Choice }
     */
    public IdentificationSource3Choice createIdentificationSource3Choice() {
        return new IdentificationSource3Choice();
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
     * Create an instance of {@link SecuritiesSettlementSystemIdentification2 }
     * 
     * @return
     *     the new instance of {@link SecuritiesSettlementSystemIdentification2 }
     */
    public SecuritiesSettlementSystemIdentification2 createSecuritiesSettlementSystemIdentification2() {
        return new SecuritiesSettlementSystemIdentification2();
    }

    /**
     * Create an instance of {@link SecurityIdentification19 }
     * 
     * @return
     *     the new instance of {@link SecurityIdentification19 }
     */
    public SecurityIdentification19 createSecurityIdentification19() {
        return new SecurityIdentification19();
    }

    /**
     * Create an instance of {@link SettlementDailyFailureReason1Choice }
     * 
     * @return
     *     the new instance of {@link SettlementDailyFailureReason1Choice }
     */
    public SettlementDailyFailureReason1Choice createSettlementDailyFailureReason1Choice() {
        return new SettlementDailyFailureReason1Choice();
    }

    /**
     * Create an instance of {@link SettlementDailyFailureReason3 }
     * 
     * @return
     *     the new instance of {@link SettlementDailyFailureReason3 }
     */
    public SettlementDailyFailureReason3 createSettlementDailyFailureReason3() {
        return new SettlementDailyFailureReason3();
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
     * Create an instance of {@link SettlementFailsCurrency2 }
     * 
     * @return
     *     the new instance of {@link SettlementFailsCurrency2 }
     */
    public SettlementFailsCurrency2 createSettlementFailsCurrency2() {
        return new SettlementFailsCurrency2();
    }

    /**
     * Create an instance of {@link SettlementFailsDailyCSD1Choice }
     * 
     * @return
     *     the new instance of {@link SettlementFailsDailyCSD1Choice }
     */
    public SettlementFailsDailyCSD1Choice createSettlementFailsDailyCSD1Choice() {
        return new SettlementFailsDailyCSD1Choice();
    }

    /**
     * Create an instance of {@link SettlementFailsDailyCSD3 }
     * 
     * @return
     *     the new instance of {@link SettlementFailsDailyCSD3 }
     */
    public SettlementFailsDailyCSD3 createSettlementFailsDailyCSD3() {
        return new SettlementFailsDailyCSD3();
    }

    /**
     * Create an instance of {@link SettlementFailsDailyData3 }
     * 
     * @return
     *     the new instance of {@link SettlementFailsDailyData3 }
     */
    public SettlementFailsDailyData3 createSettlementFailsDailyData3() {
        return new SettlementFailsDailyData3();
    }

    /**
     * Create an instance of {@link SettlementFailsDailyInstructionType1Choice }
     * 
     * @return
     *     the new instance of {@link SettlementFailsDailyInstructionType1Choice }
     */
    public SettlementFailsDailyInstructionType1Choice createSettlementFailsDailyInstructionType1Choice() {
        return new SettlementFailsDailyInstructionType1Choice();
    }

    /**
     * Create an instance of {@link SettlementFailsDailyInstructionType3 }
     * 
     * @return
     *     the new instance of {@link SettlementFailsDailyInstructionType3 }
     */
    public SettlementFailsDailyInstructionType3 createSettlementFailsDailyInstructionType3() {
        return new SettlementFailsDailyInstructionType3();
    }

    /**
     * Create an instance of {@link SettlementFailsDailyInstrument3 }
     * 
     * @return
     *     the new instance of {@link SettlementFailsDailyInstrument3 }
     */
    public SettlementFailsDailyInstrument3 createSettlementFailsDailyInstrument3() {
        return new SettlementFailsDailyInstrument3();
    }

    /**
     * Create an instance of {@link SettlementFailsDailyTransactionType1Choice }
     * 
     * @return
     *     the new instance of {@link SettlementFailsDailyTransactionType1Choice }
     */
    public SettlementFailsDailyTransactionType1Choice createSettlementFailsDailyTransactionType1Choice() {
        return new SettlementFailsDailyTransactionType1Choice();
    }

    /**
     * Create an instance of {@link SettlementFailsDailyTransactionType3 }
     * 
     * @return
     *     the new instance of {@link SettlementFailsDailyTransactionType3 }
     */
    public SettlementFailsDailyTransactionType3 createSettlementFailsDailyTransactionType3() {
        return new SettlementFailsDailyTransactionType3();
    }

    /**
     * Create an instance of {@link SettlementFailsData3 }
     * 
     * @return
     *     the new instance of {@link SettlementFailsData3 }
     */
    public SettlementFailsData3 createSettlementFailsData3() {
        return new SettlementFailsData3();
    }

    /**
     * Create an instance of {@link SettlementFailsInstrument2 }
     * 
     * @return
     *     the new instance of {@link SettlementFailsInstrument2 }
     */
    public SettlementFailsInstrument2 createSettlementFailsInstrument2() {
        return new SettlementFailsInstrument2();
    }

    /**
     * Create an instance of {@link SettlementFailsMonthlyReportV01 }
     * 
     * @return
     *     the new instance of {@link SettlementFailsMonthlyReportV01 }
     */
    public SettlementFailsMonthlyReportV01 createSettlementFailsMonthlyReportV01() {
        return new SettlementFailsMonthlyReportV01();
    }

    /**
     * Create an instance of {@link SettlementFailsParticipant1 }
     * 
     * @return
     *     the new instance of {@link SettlementFailsParticipant1 }
     */
    public SettlementFailsParticipant1 createSettlementFailsParticipant1() {
        return new SettlementFailsParticipant1();
    }

    /**
     * Create an instance of {@link SettlementFailsParticipantRange1 }
     * 
     * @return
     *     the new instance of {@link SettlementFailsParticipantRange1 }
     */
    public SettlementFailsParticipantRange1 createSettlementFailsParticipantRange1() {
        return new SettlementFailsParticipantRange1();
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
     * Create an instance of {@link SettlementFailsSecurities1 }
     * 
     * @return
     *     the new instance of {@link SettlementFailsSecurities1 }
     */
    public SettlementFailsSecurities1 createSettlementFailsSecurities1() {
        return new SettlementFailsSecurities1();
    }

    /**
     * Create an instance of {@link SettlementFailsSecuritiesRange1 }
     * 
     * @return
     *     the new instance of {@link SettlementFailsSecuritiesRange1 }
     */
    public SettlementFailsSecuritiesRange1 createSettlementFailsSecuritiesRange1() {
        return new SettlementFailsSecuritiesRange1();
    }

    /**
     * Create an instance of {@link SettlementFailsTransactionType2 }
     * 
     * @return
     *     the new instance of {@link SettlementFailsTransactionType2 }
     */
    public SettlementFailsTransactionType2 createSettlementFailsTransactionType2() {
        return new SettlementFailsTransactionType2();
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
     * Create an instance of {@link SettlementTotalData1Choice }
     * 
     * @return
     *     the new instance of {@link SettlementTotalData1Choice }
     */
    public SettlementTotalData1Choice createSettlementTotalData1Choice() {
        return new SettlementTotalData1Choice();
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
    @XmlElementDecl(namespace = "urn:iso:std:iso:20022:tech:xsd:auth.100.001.01", name = "Document")
    public JAXBElement<Document> createDocument(Document value) {
        return new JAXBElement<>(_Document_QNAME, Document.class, null, value);
    }

}
