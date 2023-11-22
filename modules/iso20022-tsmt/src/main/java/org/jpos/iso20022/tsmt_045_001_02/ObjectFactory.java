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

package org.jpos.iso20022.tsmt_045_001_02;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.jpos.iso20022.tsmt_045_001_02 package. 
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

    private static final QName _Document_QNAME = new QName("urn:iso:std:iso:20022:tech:xsd:tsmt.045.001.02", "Document");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.jpos.iso20022.tsmt_045_001_02
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
     * Create an instance of {@link AccountIdentification4Choice }
     * 
     * @return
     *     the new instance of {@link AccountIdentification4Choice }
     */
    public AccountIdentification4Choice createAccountIdentification4Choice() {
        return new AccountIdentification4Choice();
    }

    /**
     * Create an instance of {@link AccountSchemeName1Choice }
     * 
     * @return
     *     the new instance of {@link AccountSchemeName1Choice }
     */
    public AccountSchemeName1Choice createAccountSchemeName1Choice() {
        return new AccountSchemeName1Choice();
    }

    /**
     * Create an instance of {@link Adjustment6 }
     * 
     * @return
     *     the new instance of {@link Adjustment6 }
     */
    public Adjustment6 createAdjustment6() {
        return new Adjustment6();
    }

    /**
     * Create an instance of {@link AdjustmentType1Choice }
     * 
     * @return
     *     the new instance of {@link AdjustmentType1Choice }
     */
    public AdjustmentType1Choice createAdjustmentType1Choice() {
        return new AdjustmentType1Choice();
    }

    /**
     * Create an instance of {@link BICIdentification1 }
     * 
     * @return
     *     the new instance of {@link BICIdentification1 }
     */
    public BICIdentification1 createBICIdentification1() {
        return new BICIdentification1();
    }

    /**
     * Create an instance of {@link BreakDown1Choice }
     * 
     * @return
     *     the new instance of {@link BreakDown1Choice }
     */
    public BreakDown1Choice createBreakDown1Choice() {
        return new BreakDown1Choice();
    }

    /**
     * Create an instance of {@link CashAccount24 }
     * 
     * @return
     *     the new instance of {@link CashAccount24 }
     */
    public CashAccount24 createCashAccount24() {
        return new CashAccount24();
    }

    /**
     * Create an instance of {@link CashAccountType2Choice }
     * 
     * @return
     *     the new instance of {@link CashAccountType2Choice }
     */
    public CashAccountType2Choice createCashAccountType2Choice() {
        return new CashAccountType2Choice();
    }

    /**
     * Create an instance of {@link CurrencyAndAmount }
     * 
     * @return
     *     the new instance of {@link CurrencyAndAmount }
     */
    public CurrencyAndAmount createCurrencyAndAmount() {
        return new CurrencyAndAmount();
    }

    /**
     * Create an instance of {@link DocumentIdentification3 }
     * 
     * @return
     *     the new instance of {@link DocumentIdentification3 }
     */
    public DocumentIdentification3 createDocumentIdentification3() {
        return new DocumentIdentification3();
    }

    /**
     * Create an instance of {@link DocumentIdentification5 }
     * 
     * @return
     *     the new instance of {@link DocumentIdentification5 }
     */
    public DocumentIdentification5 createDocumentIdentification5() {
        return new DocumentIdentification5();
    }

    /**
     * Create an instance of {@link DocumentIdentification7 }
     * 
     * @return
     *     the new instance of {@link DocumentIdentification7 }
     */
    public DocumentIdentification7 createDocumentIdentification7() {
        return new DocumentIdentification7();
    }

    /**
     * Create an instance of {@link FinancialInstitutionIdentification4Choice }
     * 
     * @return
     *     the new instance of {@link FinancialInstitutionIdentification4Choice }
     */
    public FinancialInstitutionIdentification4Choice createFinancialInstitutionIdentification4Choice() {
        return new FinancialInstitutionIdentification4Choice();
    }

    /**
     * Create an instance of {@link ForwardIntentToPayNotificationV02 }
     * 
     * @return
     *     the new instance of {@link ForwardIntentToPayNotificationV02 }
     */
    public ForwardIntentToPayNotificationV02 createForwardIntentToPayNotificationV02() {
        return new ForwardIntentToPayNotificationV02();
    }

    /**
     * Create an instance of {@link GenericAccountIdentification1 }
     * 
     * @return
     *     the new instance of {@link GenericAccountIdentification1 }
     */
    public GenericAccountIdentification1 createGenericAccountIdentification1() {
        return new GenericAccountIdentification1();
    }

    /**
     * Create an instance of {@link IntentToPay2 }
     * 
     * @return
     *     the new instance of {@link IntentToPay2 }
     */
    public IntentToPay2 createIntentToPay2() {
        return new IntentToPay2();
    }

    /**
     * Create an instance of {@link InvoiceIdentification1 }
     * 
     * @return
     *     the new instance of {@link InvoiceIdentification1 }
     */
    public InvoiceIdentification1 createInvoiceIdentification1() {
        return new InvoiceIdentification1();
    }

    /**
     * Create an instance of {@link MessageIdentification1 }
     * 
     * @return
     *     the new instance of {@link MessageIdentification1 }
     */
    public MessageIdentification1 createMessageIdentification1() {
        return new MessageIdentification1();
    }

    /**
     * Create an instance of {@link NameAndAddress6 }
     * 
     * @return
     *     the new instance of {@link NameAndAddress6 }
     */
    public NameAndAddress6 createNameAndAddress6() {
        return new NameAndAddress6();
    }

    /**
     * Create an instance of {@link PendingActivity2 }
     * 
     * @return
     *     the new instance of {@link PendingActivity2 }
     */
    public PendingActivity2 createPendingActivity2() {
        return new PendingActivity2();
    }

    /**
     * Create an instance of {@link PostalAddress2 }
     * 
     * @return
     *     the new instance of {@link PostalAddress2 }
     */
    public PostalAddress2 createPostalAddress2() {
        return new PostalAddress2();
    }

    /**
     * Create an instance of {@link ReportLine5 }
     * 
     * @return
     *     the new instance of {@link ReportLine5 }
     */
    public ReportLine5 createReportLine5() {
        return new ReportLine5();
    }

    /**
     * Create an instance of {@link ReportLine6 }
     * 
     * @return
     *     the new instance of {@link ReportLine6 }
     */
    public ReportLine6 createReportLine6() {
        return new ReportLine6();
    }

    /**
     * Create an instance of {@link ReportLine7 }
     * 
     * @return
     *     the new instance of {@link ReportLine7 }
     */
    public ReportLine7 createReportLine7() {
        return new ReportLine7();
    }

    /**
     * Create an instance of {@link SettlementTerms3 }
     * 
     * @return
     *     the new instance of {@link SettlementTerms3 }
     */
    public SettlementTerms3 createSettlementTerms3() {
        return new SettlementTerms3();
    }

    /**
     * Create an instance of {@link SimpleIdentificationInformation }
     * 
     * @return
     *     the new instance of {@link SimpleIdentificationInformation }
     */
    public SimpleIdentificationInformation createSimpleIdentificationInformation() {
        return new SimpleIdentificationInformation();
    }

    /**
     * Create an instance of {@link TransactionStatus4 }
     * 
     * @return
     *     the new instance of {@link TransactionStatus4 }
     */
    public TransactionStatus4 createTransactionStatus4() {
        return new TransactionStatus4();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Document }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Document }{@code >}
     */
    @XmlElementDecl(namespace = "urn:iso:std:iso:20022:tech:xsd:tsmt.045.001.02", name = "Document")
    public JAXBElement<Document> createDocument(Document value) {
        return new JAXBElement<>(_Document_QNAME, Document.class, null, value);
    }

}
