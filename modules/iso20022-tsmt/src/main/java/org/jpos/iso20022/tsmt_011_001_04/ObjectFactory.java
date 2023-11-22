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

package org.jpos.iso20022.tsmt_011_001_04;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.jpos.iso20022.tsmt_011_001_04 package. 
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

    private static final QName _Document_QNAME = new QName("urn:iso:std:iso:20022:tech:xsd:tsmt.011.001.04", "Document");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.jpos.iso20022.tsmt_011_001_04
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
     * Create an instance of {@link BICIdentification1 }
     * 
     * @return
     *     the new instance of {@link BICIdentification1 }
     */
    public BICIdentification1 createBICIdentification1() {
        return new BICIdentification1();
    }

    /**
     * Create an instance of {@link BaselineReportV04 }
     * 
     * @return
     *     the new instance of {@link BaselineReportV04 }
     */
    public BaselineReportV04 createBaselineReportV04() {
        return new BaselineReportV04();
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
     * Create an instance of {@link DocumentIdentification5 }
     * 
     * @return
     *     the new instance of {@link DocumentIdentification5 }
     */
    public DocumentIdentification5 createDocumentIdentification5() {
        return new DocumentIdentification5();
    }

    /**
     * Create an instance of {@link DocumentIdentification6 }
     * 
     * @return
     *     the new instance of {@link DocumentIdentification6 }
     */
    public DocumentIdentification6 createDocumentIdentification6() {
        return new DocumentIdentification6();
    }

    /**
     * Create an instance of {@link GenericIdentification4 }
     * 
     * @return
     *     the new instance of {@link GenericIdentification4 }
     */
    public GenericIdentification4 createGenericIdentification4() {
        return new GenericIdentification4();
    }

    /**
     * Create an instance of {@link LineItem14 }
     * 
     * @return
     *     the new instance of {@link LineItem14 }
     */
    public LineItem14 createLineItem14() {
        return new LineItem14();
    }

    /**
     * Create an instance of {@link LineItemDetails12 }
     * 
     * @return
     *     the new instance of {@link LineItemDetails12 }
     */
    public LineItemDetails12 createLineItemDetails12() {
        return new LineItemDetails12();
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
     * Create an instance of {@link PartyIdentification26 }
     * 
     * @return
     *     the new instance of {@link PartyIdentification26 }
     */
    public PartyIdentification26 createPartyIdentification26() {
        return new PartyIdentification26();
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
     * Create an instance of {@link PercentageTolerance1 }
     * 
     * @return
     *     the new instance of {@link PercentageTolerance1 }
     */
    public PercentageTolerance1 createPercentageTolerance1() {
        return new PercentageTolerance1();
    }

    /**
     * Create an instance of {@link PostalAddress5 }
     * 
     * @return
     *     the new instance of {@link PostalAddress5 }
     */
    public PostalAddress5 createPostalAddress5() {
        return new PostalAddress5();
    }

    /**
     * Create an instance of {@link ProductCategory1 }
     * 
     * @return
     *     the new instance of {@link ProductCategory1 }
     */
    public ProductCategory1 createProductCategory1() {
        return new ProductCategory1();
    }

    /**
     * Create an instance of {@link ProductCategory1Choice }
     * 
     * @return
     *     the new instance of {@link ProductCategory1Choice }
     */
    public ProductCategory1Choice createProductCategory1Choice() {
        return new ProductCategory1Choice();
    }

    /**
     * Create an instance of {@link ProductCharacteristics1 }
     * 
     * @return
     *     the new instance of {@link ProductCharacteristics1 }
     */
    public ProductCharacteristics1 createProductCharacteristics1() {
        return new ProductCharacteristics1();
    }

    /**
     * Create an instance of {@link ProductCharacteristics1Choice }
     * 
     * @return
     *     the new instance of {@link ProductCharacteristics1Choice }
     */
    public ProductCharacteristics1Choice createProductCharacteristics1Choice() {
        return new ProductCharacteristics1Choice();
    }

    /**
     * Create an instance of {@link ProductIdentifier2 }
     * 
     * @return
     *     the new instance of {@link ProductIdentifier2 }
     */
    public ProductIdentifier2 createProductIdentifier2() {
        return new ProductIdentifier2();
    }

    /**
     * Create an instance of {@link ProductIdentifier2Choice }
     * 
     * @return
     *     the new instance of {@link ProductIdentifier2Choice }
     */
    public ProductIdentifier2Choice createProductIdentifier2Choice() {
        return new ProductIdentifier2Choice();
    }

    /**
     * Create an instance of {@link Quantity9 }
     * 
     * @return
     *     the new instance of {@link Quantity9 }
     */
    public Quantity9 createQuantity9() {
        return new Quantity9();
    }

    /**
     * Create an instance of {@link ReportType2 }
     * 
     * @return
     *     the new instance of {@link ReportType2 }
     */
    public ReportType2 createReportType2() {
        return new ReportType2();
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
     * Create an instance of {@link UnitOfMeasure3Choice }
     * 
     * @return
     *     the new instance of {@link UnitOfMeasure3Choice }
     */
    public UnitOfMeasure3Choice createUnitOfMeasure3Choice() {
        return new UnitOfMeasure3Choice();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Document }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Document }{@code >}
     */
    @XmlElementDecl(namespace = "urn:iso:std:iso:20022:tech:xsd:tsmt.011.001.04", name = "Document")
    public JAXBElement<Document> createDocument(Document value) {
        return new JAXBElement<>(_Document_QNAME, Document.class, null, value);
    }

}
