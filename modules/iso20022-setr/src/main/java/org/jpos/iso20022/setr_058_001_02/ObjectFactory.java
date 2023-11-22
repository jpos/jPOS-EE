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

package org.jpos.iso20022.setr_058_001_02;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.jpos.iso20022.setr_058_001_02 package. 
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

    private static final QName _Document_QNAME = new QName("urn:iso:std:iso:20022:tech:xsd:setr.058.001.02", "Document");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.jpos.iso20022.setr_058_001_02
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
     * Create an instance of {@link AdditionalReference8 }
     * 
     * @return
     *     the new instance of {@link AdditionalReference8 }
     */
    public AdditionalReference8 createAdditionalReference8() {
        return new AdditionalReference8();
    }

    /**
     * Create an instance of {@link AlternateSecurityIdentification7 }
     * 
     * @return
     *     the new instance of {@link AlternateSecurityIdentification7 }
     */
    public AlternateSecurityIdentification7 createAlternateSecurityIdentification7() {
        return new AlternateSecurityIdentification7();
    }

    /**
     * Create an instance of {@link DateFormat42Choice }
     * 
     * @return
     *     the new instance of {@link DateFormat42Choice }
     */
    public DateFormat42Choice createDateFormat42Choice() {
        return new DateFormat42Choice();
    }

    /**
     * Create an instance of {@link Extension1 }
     * 
     * @return
     *     the new instance of {@link Extension1 }
     */
    public Extension1 createExtension1() {
        return new Extension1();
    }

    /**
     * Create an instance of {@link FinancialInstrument57 }
     * 
     * @return
     *     the new instance of {@link FinancialInstrument57 }
     */
    public FinancialInstrument57 createFinancialInstrument57() {
        return new FinancialInstrument57();
    }

    /**
     * Create an instance of {@link GenericIdentification1 }
     * 
     * @return
     *     the new instance of {@link GenericIdentification1 }
     */
    public GenericIdentification1 createGenericIdentification1() {
        return new GenericIdentification1();
    }

    /**
     * Create an instance of {@link IdentificationSource1Choice }
     * 
     * @return
     *     the new instance of {@link IdentificationSource1Choice }
     */
    public IdentificationSource1Choice createIdentificationSource1Choice() {
        return new IdentificationSource1Choice();
    }

    /**
     * Create an instance of {@link InvestmentAccount58 }
     * 
     * @return
     *     the new instance of {@link InvestmentAccount58 }
     */
    public InvestmentAccount58 createInvestmentAccount58() {
        return new InvestmentAccount58();
    }

    /**
     * Create an instance of {@link InvestmentFundOrder8 }
     * 
     * @return
     *     the new instance of {@link InvestmentFundOrder8 }
     */
    public InvestmentFundOrder8 createInvestmentFundOrder8() {
        return new InvestmentFundOrder8();
    }

    /**
     * Create an instance of {@link MessageAndBusinessReference10 }
     * 
     * @return
     *     the new instance of {@link MessageAndBusinessReference10 }
     */
    public MessageAndBusinessReference10 createMessageAndBusinessReference10() {
        return new MessageAndBusinessReference10();
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
     * Create an instance of {@link NameAndAddress5 }
     * 
     * @return
     *     the new instance of {@link NameAndAddress5 }
     */
    public NameAndAddress5 createNameAndAddress5() {
        return new NameAndAddress5();
    }

    /**
     * Create an instance of {@link PartyIdentification113 }
     * 
     * @return
     *     the new instance of {@link PartyIdentification113 }
     */
    public PartyIdentification113 createPartyIdentification113() {
        return new PartyIdentification113();
    }

    /**
     * Create an instance of {@link PartyIdentification90Choice }
     * 
     * @return
     *     the new instance of {@link PartyIdentification90Choice }
     */
    public PartyIdentification90Choice createPartyIdentification90Choice() {
        return new PartyIdentification90Choice();
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
     * Create an instance of {@link References62Choice }
     * 
     * @return
     *     the new instance of {@link References62Choice }
     */
    public References62Choice createReferences62Choice() {
        return new References62Choice();
    }

    /**
     * Create an instance of {@link RequestForOrderConfirmationStatusReportV02 }
     * 
     * @return
     *     the new instance of {@link RequestForOrderConfirmationStatusReportV02 }
     */
    public RequestForOrderConfirmationStatusReportV02 createRequestForOrderConfirmationStatusReportV02() {
        return new RequestForOrderConfirmationStatusReportV02();
    }

    /**
     * Create an instance of {@link SecurityIdentification25Choice }
     * 
     * @return
     *     the new instance of {@link SecurityIdentification25Choice }
     */
    public SecurityIdentification25Choice createSecurityIdentification25Choice() {
        return new SecurityIdentification25Choice();
    }

    /**
     * Create an instance of {@link Series1 }
     * 
     * @return
     *     the new instance of {@link Series1 }
     */
    public Series1 createSeries1() {
        return new Series1();
    }

    /**
     * Create an instance of {@link SubAccount6 }
     * 
     * @return
     *     the new instance of {@link SubAccount6 }
     */
    public SubAccount6 createSubAccount6() {
        return new SubAccount6();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Document }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Document }{@code >}
     */
    @XmlElementDecl(namespace = "urn:iso:std:iso:20022:tech:xsd:setr.058.001.02", name = "Document")
    public JAXBElement<Document> createDocument(Document value) {
        return new JAXBElement<>(_Document_QNAME, Document.class, null, value);
    }

}
