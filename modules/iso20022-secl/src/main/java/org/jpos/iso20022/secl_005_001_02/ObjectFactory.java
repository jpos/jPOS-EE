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

package org.jpos.iso20022.secl_005_001_02;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.jpos.iso20022.secl_005_001_02 package. 
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

    private static final QName _Document_QNAME = new QName("urn:iso:std:iso:20022:tech:xsd:secl.005.001.02", "Document");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.jpos.iso20022.secl_005_001_02
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
     * Create an instance of {@link ActiveCurrencyAndAmount }
     * 
     * @return
     *     the new instance of {@link ActiveCurrencyAndAmount }
     */
    public ActiveCurrencyAndAmount createActiveCurrencyAndAmount() {
        return new ActiveCurrencyAndAmount();
    }

    /**
     * Create an instance of {@link ActiveOrHistoricCurrencyAndAmount }
     * 
     * @return
     *     the new instance of {@link ActiveOrHistoricCurrencyAndAmount }
     */
    public ActiveOrHistoricCurrencyAndAmount createActiveOrHistoricCurrencyAndAmount() {
        return new ActiveOrHistoricCurrencyAndAmount();
    }

    /**
     * Create an instance of {@link AlternatePartyIdentification4 }
     * 
     * @return
     *     the new instance of {@link AlternatePartyIdentification4 }
     */
    public AlternatePartyIdentification4 createAlternatePartyIdentification4() {
        return new AlternatePartyIdentification4();
    }

    /**
     * Create an instance of {@link Amount2 }
     * 
     * @return
     *     the new instance of {@link Amount2 }
     */
    public Amount2 createAmount2() {
        return new Amount2();
    }

    /**
     * Create an instance of {@link AmountAndDirection20 }
     * 
     * @return
     *     the new instance of {@link AmountAndDirection20 }
     */
    public AmountAndDirection20 createAmountAndDirection20() {
        return new AmountAndDirection20();
    }

    /**
     * Create an instance of {@link Collateral6 }
     * 
     * @return
     *     the new instance of {@link Collateral6 }
     */
    public Collateral6 createCollateral6() {
        return new Collateral6();
    }

    /**
     * Create an instance of {@link DateAndDateTimeChoice }
     * 
     * @return
     *     the new instance of {@link DateAndDateTimeChoice }
     */
    public DateAndDateTimeChoice createDateAndDateTimeChoice() {
        return new DateAndDateTimeChoice();
    }

    /**
     * Create an instance of {@link GenericIdentification29 }
     * 
     * @return
     *     the new instance of {@link GenericIdentification29 }
     */
    public GenericIdentification29 createGenericIdentification29() {
        return new GenericIdentification29();
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
     * Create an instance of {@link IdentificationSource3Choice }
     * 
     * @return
     *     the new instance of {@link IdentificationSource3Choice }
     */
    public IdentificationSource3Choice createIdentificationSource3Choice() {
        return new IdentificationSource3Choice();
    }

    /**
     * Create an instance of {@link IdentificationType6Choice }
     * 
     * @return
     *     the new instance of {@link IdentificationType6Choice }
     */
    public IdentificationType6Choice createIdentificationType6Choice() {
        return new IdentificationType6Choice();
    }

    /**
     * Create an instance of {@link Margin3 }
     * 
     * @return
     *     the new instance of {@link Margin3 }
     */
    public Margin3 createMargin3() {
        return new Margin3();
    }

    /**
     * Create an instance of {@link Margin4 }
     * 
     * @return
     *     the new instance of {@link Margin4 }
     */
    public Margin4 createMargin4() {
        return new Margin4();
    }

    /**
     * Create an instance of {@link MarginCalculation1 }
     * 
     * @return
     *     the new instance of {@link MarginCalculation1 }
     */
    public MarginCalculation1 createMarginCalculation1() {
        return new MarginCalculation1();
    }

    /**
     * Create an instance of {@link MarginCalculation2 }
     * 
     * @return
     *     the new instance of {@link MarginCalculation2 }
     */
    public MarginCalculation2 createMarginCalculation2() {
        return new MarginCalculation2();
    }

    /**
     * Create an instance of {@link MarginProductType1Choice }
     * 
     * @return
     *     the new instance of {@link MarginProductType1Choice }
     */
    public MarginProductType1Choice createMarginProductType1Choice() {
        return new MarginProductType1Choice();
    }

    /**
     * Create an instance of {@link MarginReport2 }
     * 
     * @return
     *     the new instance of {@link MarginReport2 }
     */
    public MarginReport2 createMarginReport2() {
        return new MarginReport2();
    }

    /**
     * Create an instance of {@link MarginReportV02 }
     * 
     * @return
     *     the new instance of {@link MarginReportV02 }
     */
    public MarginReportV02 createMarginReportV02() {
        return new MarginReportV02();
    }

    /**
     * Create an instance of {@link MarginResult1Choice }
     * 
     * @return
     *     the new instance of {@link MarginResult1Choice }
     */
    public MarginResult1Choice createMarginResult1Choice() {
        return new MarginResult1Choice();
    }

    /**
     * Create an instance of {@link MarginType1Choice }
     * 
     * @return
     *     the new instance of {@link MarginType1Choice }
     */
    public MarginType1Choice createMarginType1Choice() {
        return new MarginType1Choice();
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
     * Create an instance of {@link OtherIdentification1 }
     * 
     * @return
     *     the new instance of {@link OtherIdentification1 }
     */
    public OtherIdentification1 createOtherIdentification1() {
        return new OtherIdentification1();
    }

    /**
     * Create an instance of {@link Pagination }
     * 
     * @return
     *     the new instance of {@link Pagination }
     */
    public Pagination createPagination() {
        return new Pagination();
    }

    /**
     * Create an instance of {@link PartyIdentification33Choice }
     * 
     * @return
     *     the new instance of {@link PartyIdentification33Choice }
     */
    public PartyIdentification33Choice createPartyIdentification33Choice() {
        return new PartyIdentification33Choice();
    }

    /**
     * Create an instance of {@link PartyIdentification35Choice }
     * 
     * @return
     *     the new instance of {@link PartyIdentification35Choice }
     */
    public PartyIdentification35Choice createPartyIdentification35Choice() {
        return new PartyIdentification35Choice();
    }

    /**
     * Create an instance of {@link PartyIdentificationAndAccount31 }
     * 
     * @return
     *     the new instance of {@link PartyIdentificationAndAccount31 }
     */
    public PartyIdentificationAndAccount31 createPartyIdentificationAndAccount31() {
        return new PartyIdentificationAndAccount31();
    }

    /**
     * Create an instance of {@link PartyTextInformation1 }
     * 
     * @return
     *     the new instance of {@link PartyTextInformation1 }
     */
    public PartyTextInformation1 createPartyTextInformation1() {
        return new PartyTextInformation1();
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
     * Create an instance of {@link ReportParameters3 }
     * 
     * @return
     *     the new instance of {@link ReportParameters3 }
     */
    public ReportParameters3 createReportParameters3() {
        return new ReportParameters3();
    }

    /**
     * Create an instance of {@link SecuritiesAccount18 }
     * 
     * @return
     *     the new instance of {@link SecuritiesAccount18 }
     */
    public SecuritiesAccount18 createSecuritiesAccount18() {
        return new SecuritiesAccount18();
    }

    /**
     * Create an instance of {@link SecurityIdentification14 }
     * 
     * @return
     *     the new instance of {@link SecurityIdentification14 }
     */
    public SecurityIdentification14 createSecurityIdentification14() {
        return new SecurityIdentification14();
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
     * Create an instance of {@link TotalVariationMargin1 }
     * 
     * @return
     *     the new instance of {@link TotalVariationMargin1 }
     */
    public TotalVariationMargin1 createTotalVariationMargin1() {
        return new TotalVariationMargin1();
    }

    /**
     * Create an instance of {@link VariationMargin3 }
     * 
     * @return
     *     the new instance of {@link VariationMargin3 }
     */
    public VariationMargin3 createVariationMargin3() {
        return new VariationMargin3();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Document }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Document }{@code >}
     */
    @XmlElementDecl(namespace = "urn:iso:std:iso:20022:tech:xsd:secl.005.001.02", name = "Document")
    public JAXBElement<Document> createDocument(Document value) {
        return new JAXBElement<>(_Document_QNAME, Document.class, null, value);
    }

}
