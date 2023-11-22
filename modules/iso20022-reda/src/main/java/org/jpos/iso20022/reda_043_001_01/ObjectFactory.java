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

package org.jpos.iso20022.reda_043_001_01;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.jpos.iso20022.reda_043_001_01 package. 
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

    private static final QName _Document_QNAME = new QName("urn:iso:std:iso:20022:tech:xsd:reda.043.001.01", "Document");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.jpos.iso20022.reda_043_001_01
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
     * Create an instance of {@link AddressType3Choice }
     * 
     * @return
     *     the new instance of {@link AddressType3Choice }
     */
    public AddressType3Choice createAddressType3Choice() {
        return new AddressType3Choice();
    }

    /**
     * Create an instance of {@link CodeOrProprietary1Choice }
     * 
     * @return
     *     the new instance of {@link CodeOrProprietary1Choice }
     */
    public CodeOrProprietary1Choice createCodeOrProprietary1Choice() {
        return new CodeOrProprietary1Choice();
    }

    /**
     * Create an instance of {@link Contact5 }
     * 
     * @return
     *     the new instance of {@link Contact5 }
     */
    public Contact5 createContact5() {
        return new Contact5();
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
     * Create an instance of {@link DatePeriod3Choice }
     * 
     * @return
     *     the new instance of {@link DatePeriod3Choice }
     */
    public DatePeriod3Choice createDatePeriod3Choice() {
        return new DatePeriod3Choice();
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
     * Create an instance of {@link GenericIdentification13 }
     * 
     * @return
     *     the new instance of {@link GenericIdentification13 }
     */
    public GenericIdentification13 createGenericIdentification13() {
        return new GenericIdentification13();
    }

    /**
     * Create an instance of {@link GenericIdentification30 }
     * 
     * @return
     *     the new instance of {@link GenericIdentification30 }
     */
    public GenericIdentification30 createGenericIdentification30() {
        return new GenericIdentification30();
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
     * Create an instance of {@link MarketSpecificAttribute1 }
     * 
     * @return
     *     the new instance of {@link MarketSpecificAttribute1 }
     */
    public MarketSpecificAttribute1 createMarketSpecificAttribute1() {
        return new MarketSpecificAttribute1();
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
     * Create an instance of {@link NameAndAddress5 }
     * 
     * @return
     *     the new instance of {@link NameAndAddress5 }
     */
    public NameAndAddress5 createNameAndAddress5() {
        return new NameAndAddress5();
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
     * Create an instance of {@link OtherContact1 }
     * 
     * @return
     *     the new instance of {@link OtherContact1 }
     */
    public OtherContact1 createOtherContact1() {
        return new OtherContact1();
    }

    /**
     * Create an instance of {@link PartyAuditTrail1 }
     * 
     * @return
     *     the new instance of {@link PartyAuditTrail1 }
     */
    public PartyAuditTrail1 createPartyAuditTrail1() {
        return new PartyAuditTrail1();
    }

    /**
     * Create an instance of {@link PartyAuditTrailOrError1Choice }
     * 
     * @return
     *     the new instance of {@link PartyAuditTrailOrError1Choice }
     */
    public PartyAuditTrailOrError1Choice createPartyAuditTrailOrError1Choice() {
        return new PartyAuditTrailOrError1Choice();
    }

    /**
     * Create an instance of {@link PartyAuditTrailOrError2Choice }
     * 
     * @return
     *     the new instance of {@link PartyAuditTrailOrError2Choice }
     */
    public PartyAuditTrailOrError2Choice createPartyAuditTrailOrError2Choice() {
        return new PartyAuditTrailOrError2Choice();
    }

    /**
     * Create an instance of {@link PartyAuditTrailReport3 }
     * 
     * @return
     *     the new instance of {@link PartyAuditTrailReport3 }
     */
    public PartyAuditTrailReport3 createPartyAuditTrailReport3() {
        return new PartyAuditTrailReport3();
    }

    /**
     * Create an instance of {@link PartyAuditTrailReportV01 }
     * 
     * @return
     *     the new instance of {@link PartyAuditTrailReportV01 }
     */
    public PartyAuditTrailReportV01 createPartyAuditTrailReportV01() {
        return new PartyAuditTrailReportV01();
    }

    /**
     * Create an instance of {@link PartyIdentification120Choice }
     * 
     * @return
     *     the new instance of {@link PartyIdentification120Choice }
     */
    public PartyIdentification120Choice createPartyIdentification120Choice() {
        return new PartyIdentification120Choice();
    }

    /**
     * Create an instance of {@link PartyIdentification136 }
     * 
     * @return
     *     the new instance of {@link PartyIdentification136 }
     */
    public PartyIdentification136 createPartyIdentification136() {
        return new PartyIdentification136();
    }

    /**
     * Create an instance of {@link PartyLockStatus1 }
     * 
     * @return
     *     the new instance of {@link PartyLockStatus1 }
     */
    public PartyLockStatus1 createPartyLockStatus1() {
        return new PartyLockStatus1();
    }

    /**
     * Create an instance of {@link PartyName4 }
     * 
     * @return
     *     the new instance of {@link PartyName4 }
     */
    public PartyName4 createPartyName4() {
        return new PartyName4();
    }

    /**
     * Create an instance of {@link PostalAddress1 }
     * 
     * @return
     *     the new instance of {@link PostalAddress1 }
     */
    public PostalAddress1 createPostalAddress1() {
        return new PostalAddress1();
    }

    /**
     * Create an instance of {@link PostalAddress25 }
     * 
     * @return
     *     the new instance of {@link PostalAddress25 }
     */
    public PostalAddress25 createPostalAddress25() {
        return new PostalAddress25();
    }

    /**
     * Create an instance of {@link Restriction1 }
     * 
     * @return
     *     the new instance of {@link Restriction1 }
     */
    public Restriction1 createRestriction1() {
        return new Restriction1();
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
     * Create an instance of {@link SystemPartyIdentification8 }
     * 
     * @return
     *     the new instance of {@link SystemPartyIdentification8 }
     */
    public SystemPartyIdentification8 createSystemPartyIdentification8() {
        return new SystemPartyIdentification8();
    }

    /**
     * Create an instance of {@link SystemPartyType1Choice }
     * 
     * @return
     *     the new instance of {@link SystemPartyType1Choice }
     */
    public SystemPartyType1Choice createSystemPartyType1Choice() {
        return new SystemPartyType1Choice();
    }

    /**
     * Create an instance of {@link TechnicalIdentification2Choice }
     * 
     * @return
     *     the new instance of {@link TechnicalIdentification2Choice }
     */
    public TechnicalIdentification2Choice createTechnicalIdentification2Choice() {
        return new TechnicalIdentification2Choice();
    }

    /**
     * Create an instance of {@link UpdateLogAddress1 }
     * 
     * @return
     *     the new instance of {@link UpdateLogAddress1 }
     */
    public UpdateLogAddress1 createUpdateLogAddress1() {
        return new UpdateLogAddress1();
    }

    /**
     * Create an instance of {@link UpdateLogContact1 }
     * 
     * @return
     *     the new instance of {@link UpdateLogContact1 }
     */
    public UpdateLogContact1 createUpdateLogContact1() {
        return new UpdateLogContact1();
    }

    /**
     * Create an instance of {@link UpdateLogDate1 }
     * 
     * @return
     *     the new instance of {@link UpdateLogDate1 }
     */
    public UpdateLogDate1 createUpdateLogDate1() {
        return new UpdateLogDate1();
    }

    /**
     * Create an instance of {@link UpdateLogMarketSpecificAttribute1 }
     * 
     * @return
     *     the new instance of {@link UpdateLogMarketSpecificAttribute1 }
     */
    public UpdateLogMarketSpecificAttribute1 createUpdateLogMarketSpecificAttribute1() {
        return new UpdateLogMarketSpecificAttribute1();
    }

    /**
     * Create an instance of {@link UpdateLogPartyLockStatus1 }
     * 
     * @return
     *     the new instance of {@link UpdateLogPartyLockStatus1 }
     */
    public UpdateLogPartyLockStatus1 createUpdateLogPartyLockStatus1() {
        return new UpdateLogPartyLockStatus1();
    }

    /**
     * Create an instance of {@link UpdateLogPartyName1 }
     * 
     * @return
     *     the new instance of {@link UpdateLogPartyName1 }
     */
    public UpdateLogPartyName1 createUpdateLogPartyName1() {
        return new UpdateLogPartyName1();
    }

    /**
     * Create an instance of {@link UpdateLogPartyRecord1Choice }
     * 
     * @return
     *     the new instance of {@link UpdateLogPartyRecord1Choice }
     */
    public UpdateLogPartyRecord1Choice createUpdateLogPartyRecord1Choice() {
        return new UpdateLogPartyRecord1Choice();
    }

    /**
     * Create an instance of {@link UpdateLogProprietary1 }
     * 
     * @return
     *     the new instance of {@link UpdateLogProprietary1 }
     */
    public UpdateLogProprietary1 createUpdateLogProprietary1() {
        return new UpdateLogProprietary1();
    }

    /**
     * Create an instance of {@link UpdateLogResidenceType1 }
     * 
     * @return
     *     the new instance of {@link UpdateLogResidenceType1 }
     */
    public UpdateLogResidenceType1 createUpdateLogResidenceType1() {
        return new UpdateLogResidenceType1();
    }

    /**
     * Create an instance of {@link UpdateLogRestriction1 }
     * 
     * @return
     *     the new instance of {@link UpdateLogRestriction1 }
     */
    public UpdateLogRestriction1 createUpdateLogRestriction1() {
        return new UpdateLogRestriction1();
    }

    /**
     * Create an instance of {@link UpdateLogSystemPartyType1 }
     * 
     * @return
     *     the new instance of {@link UpdateLogSystemPartyType1 }
     */
    public UpdateLogSystemPartyType1 createUpdateLogSystemPartyType1() {
        return new UpdateLogSystemPartyType1();
    }

    /**
     * Create an instance of {@link UpdateLogTechnicalAddress1 }
     * 
     * @return
     *     the new instance of {@link UpdateLogTechnicalAddress1 }
     */
    public UpdateLogTechnicalAddress1 createUpdateLogTechnicalAddress1() {
        return new UpdateLogTechnicalAddress1();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Document }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Document }{@code >}
     */
    @XmlElementDecl(namespace = "urn:iso:std:iso:20022:tech:xsd:reda.043.001.01", name = "Document")
    public JAXBElement<Document> createDocument(Document value) {
        return new JAXBElement<>(_Document_QNAME, Document.class, null, value);
    }

}
