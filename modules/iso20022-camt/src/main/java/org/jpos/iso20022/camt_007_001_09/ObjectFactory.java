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

package org.jpos.iso20022.camt_007_001_09;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.jpos.iso20022.camt_007_001_09 package. 
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

    private static final QName _Document_QNAME = new QName("urn:iso:std:iso:20022:tech:xsd:camt.007.001.09", "Document");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.jpos.iso20022.camt_007_001_09
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
     * Create an instance of {@link BranchAndFinancialInstitutionIdentification6 }
     * 
     * @return
     *     the new instance of {@link BranchAndFinancialInstitutionIdentification6 }
     */
    public BranchAndFinancialInstitutionIdentification6 createBranchAndFinancialInstitutionIdentification6() {
        return new BranchAndFinancialInstitutionIdentification6();
    }

    /**
     * Create an instance of {@link BranchData3 }
     * 
     * @return
     *     the new instance of {@link BranchData3 }
     */
    public BranchData3 createBranchData3() {
        return new BranchData3();
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
     * Create an instance of {@link DateTimePeriod1 }
     * 
     * @return
     *     the new instance of {@link DateTimePeriod1 }
     */
    public DateTimePeriod1 createDateTimePeriod1() {
        return new DateTimePeriod1();
    }

    /**
     * Create an instance of {@link DateTimePeriod1Choice }
     * 
     * @return
     *     the new instance of {@link DateTimePeriod1Choice }
     */
    public DateTimePeriod1Choice createDateTimePeriod1Choice() {
        return new DateTimePeriod1Choice();
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
     * Create an instance of {@link FinancialInstitutionIdentification18 }
     * 
     * @return
     *     the new instance of {@link FinancialInstitutionIdentification18 }
     */
    public FinancialInstitutionIdentification18 createFinancialInstitutionIdentification18() {
        return new FinancialInstitutionIdentification18();
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
     * Create an instance of {@link GenericIdentification30 }
     * 
     * @return
     *     the new instance of {@link GenericIdentification30 }
     */
    public GenericIdentification30 createGenericIdentification30() {
        return new GenericIdentification30();
    }

    /**
     * Create an instance of {@link LongPaymentIdentification3 }
     * 
     * @return
     *     the new instance of {@link LongPaymentIdentification3 }
     */
    public LongPaymentIdentification3 createLongPaymentIdentification3() {
        return new LongPaymentIdentification3();
    }

    /**
     * Create an instance of {@link MessageHeader1 }
     * 
     * @return
     *     the new instance of {@link MessageHeader1 }
     */
    public MessageHeader1 createMessageHeader1() {
        return new MessageHeader1();
    }

    /**
     * Create an instance of {@link ModifyTransactionV09 }
     * 
     * @return
     *     the new instance of {@link ModifyTransactionV09 }
     */
    public ModifyTransactionV09 createModifyTransactionV09() {
        return new ModifyTransactionV09();
    }

    /**
     * Create an instance of {@link PaymentIdentification7Choice }
     * 
     * @return
     *     the new instance of {@link PaymentIdentification7Choice }
     */
    public PaymentIdentification7Choice createPaymentIdentification7Choice() {
        return new PaymentIdentification7Choice();
    }

    /**
     * Create an instance of {@link PaymentInstruction33 }
     * 
     * @return
     *     the new instance of {@link PaymentInstruction33 }
     */
    public PaymentInstruction33 createPaymentInstruction33() {
        return new PaymentInstruction33();
    }

    /**
     * Create an instance of {@link PaymentOrigin1Choice }
     * 
     * @return
     *     the new instance of {@link PaymentOrigin1Choice }
     */
    public PaymentOrigin1Choice createPaymentOrigin1Choice() {
        return new PaymentOrigin1Choice();
    }

    /**
     * Create an instance of {@link PaymentType4Choice }
     * 
     * @return
     *     the new instance of {@link PaymentType4Choice }
     */
    public PaymentType4Choice createPaymentType4Choice() {
        return new PaymentType4Choice();
    }

    /**
     * Create an instance of {@link PostalAddress24 }
     * 
     * @return
     *     the new instance of {@link PostalAddress24 }
     */
    public PostalAddress24 createPostalAddress24() {
        return new PostalAddress24();
    }

    /**
     * Create an instance of {@link Priority1Choice }
     * 
     * @return
     *     the new instance of {@link Priority1Choice }
     */
    public Priority1Choice createPriority1Choice() {
        return new Priority1Choice();
    }

    /**
     * Create an instance of {@link QueueTransactionIdentification1 }
     * 
     * @return
     *     the new instance of {@link QueueTransactionIdentification1 }
     */
    public QueueTransactionIdentification1 createQueueTransactionIdentification1() {
        return new QueueTransactionIdentification1();
    }

    /**
     * Create an instance of {@link ShortPaymentIdentification3 }
     * 
     * @return
     *     the new instance of {@link ShortPaymentIdentification3 }
     */
    public ShortPaymentIdentification3 createShortPaymentIdentification3() {
        return new ShortPaymentIdentification3();
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
     * Create an instance of {@link TransactionModification6 }
     * 
     * @return
     *     the new instance of {@link TransactionModification6 }
     */
    public TransactionModification6 createTransactionModification6() {
        return new TransactionModification6();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Document }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Document }{@code >}
     */
    @XmlElementDecl(namespace = "urn:iso:std:iso:20022:tech:xsd:camt.007.001.09", name = "Document")
    public JAXBElement<Document> createDocument(Document value) {
        return new JAXBElement<>(_Document_QNAME, Document.class, null, value);
    }

}
