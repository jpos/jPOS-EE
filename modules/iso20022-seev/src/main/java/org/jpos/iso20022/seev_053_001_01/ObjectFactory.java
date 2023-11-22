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

package org.jpos.iso20022.seev_053_001_01;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.jpos.iso20022.seev_053_001_01 package. 
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

    private static final QName _Document_QNAME = new QName("urn:iso:std:iso:20022:tech:xsd:seev.053.001.01", "Document");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.jpos.iso20022.seev_053_001_01
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
     * Create an instance of {@link ActiveCurrencyAnd13DecimalAmount }
     * 
     * @return
     *     the new instance of {@link ActiveCurrencyAnd13DecimalAmount }
     */
    public ActiveCurrencyAnd13DecimalAmount createActiveCurrencyAnd13DecimalAmount() {
        return new ActiveCurrencyAnd13DecimalAmount();
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
     * Create an instance of {@link CancelledReason9Choice }
     * 
     * @return
     *     the new instance of {@link CancelledReason9Choice }
     */
    public CancelledReason9Choice createCancelledReason9Choice() {
        return new CancelledReason9Choice();
    }

    /**
     * Create an instance of {@link CancelledStatus11Choice }
     * 
     * @return
     *     the new instance of {@link CancelledStatus11Choice }
     */
    public CancelledStatus11Choice createCancelledStatus11Choice() {
        return new CancelledStatus11Choice();
    }

    /**
     * Create an instance of {@link CancelledStatusReason12 }
     * 
     * @return
     *     the new instance of {@link CancelledStatusReason12 }
     */
    public CancelledStatusReason12 createCancelledStatusReason12() {
        return new CancelledStatusReason12();
    }

    /**
     * Create an instance of {@link CashAccountIdentification5Choice }
     * 
     * @return
     *     the new instance of {@link CashAccountIdentification5Choice }
     */
    public CashAccountIdentification5Choice createCashAccountIdentification5Choice() {
        return new CashAccountIdentification5Choice();
    }

    /**
     * Create an instance of {@link CashOption76 }
     * 
     * @return
     *     the new instance of {@link CashOption76 }
     */
    public CashOption76 createCashOption76() {
        return new CashOption76();
    }

    /**
     * Create an instance of {@link CorporateActionEventType85Choice }
     * 
     * @return
     *     the new instance of {@link CorporateActionEventType85Choice }
     */
    public CorporateActionEventType85Choice createCorporateActionEventType85Choice() {
        return new CorporateActionEventType85Choice();
    }

    /**
     * Create an instance of {@link CorporateActionGeneralInformation157 }
     * 
     * @return
     *     the new instance of {@link CorporateActionGeneralInformation157 }
     */
    public CorporateActionGeneralInformation157 createCorporateActionGeneralInformation157() {
        return new CorporateActionGeneralInformation157();
    }

    /**
     * Create an instance of {@link CorporateActionOption185 }
     * 
     * @return
     *     the new instance of {@link CorporateActionOption185 }
     */
    public CorporateActionOption185 createCorporateActionOption185() {
        return new CorporateActionOption185();
    }

    /**
     * Create an instance of {@link CorporateActionOption30Choice }
     * 
     * @return
     *     the new instance of {@link CorporateActionOption30Choice }
     */
    public CorporateActionOption30Choice createCorporateActionOption30Choice() {
        return new CorporateActionOption30Choice();
    }

    /**
     * Create an instance of {@link DateAndDateTime2Choice }
     * 
     * @return
     *     the new instance of {@link DateAndDateTime2Choice }
     */
    public DateAndDateTime2Choice createDateAndDateTime2Choice() {
        return new DateAndDateTime2Choice();
    }

    /**
     * Create an instance of {@link DateCode19Choice }
     * 
     * @return
     *     the new instance of {@link DateCode19Choice }
     */
    public DateCode19Choice createDateCode19Choice() {
        return new DateCode19Choice();
    }

    /**
     * Create an instance of {@link DateFormat43Choice }
     * 
     * @return
     *     the new instance of {@link DateFormat43Choice }
     */
    public DateFormat43Choice createDateFormat43Choice() {
        return new DateFormat43Choice();
    }

    /**
     * Create an instance of {@link DateFormat58Choice }
     * 
     * @return
     *     the new instance of {@link DateFormat58Choice }
     */
    public DateFormat58Choice createDateFormat58Choice() {
        return new DateFormat58Choice();
    }

    /**
     * Create an instance of {@link DocumentIdentification9 }
     * 
     * @return
     *     the new instance of {@link DocumentIdentification9 }
     */
    public DocumentIdentification9 createDocumentIdentification9() {
        return new DocumentIdentification9();
    }

    /**
     * Create an instance of {@link FinancialInstrumentQuantity1Choice }
     * 
     * @return
     *     the new instance of {@link FinancialInstrumentQuantity1Choice }
     */
    public FinancialInstrumentQuantity1Choice createFinancialInstrumentQuantity1Choice() {
        return new FinancialInstrumentQuantity1Choice();
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
     * Create an instance of {@link MarketClaimCancellationRequestStatus1Choice }
     * 
     * @return
     *     the new instance of {@link MarketClaimCancellationRequestStatus1Choice }
     */
    public MarketClaimCancellationRequestStatus1Choice createMarketClaimCancellationRequestStatus1Choice() {
        return new MarketClaimCancellationRequestStatus1Choice();
    }

    /**
     * Create an instance of {@link MarketClaimCancellationRequestStatusAdviceV01 }
     * 
     * @return
     *     the new instance of {@link MarketClaimCancellationRequestStatusAdviceV01 }
     */
    public MarketClaimCancellationRequestStatusAdviceV01 createMarketClaimCancellationRequestStatusAdviceV01() {
        return new MarketClaimCancellationRequestStatusAdviceV01();
    }

    /**
     * Create an instance of {@link NoSpecifiedReason1 }
     * 
     * @return
     *     the new instance of {@link NoSpecifiedReason1 }
     */
    public NoSpecifiedReason1 createNoSpecifiedReason1() {
        return new NoSpecifiedReason1();
    }

    /**
     * Create an instance of {@link OriginalAndCurrentQuantities1 }
     * 
     * @return
     *     the new instance of {@link OriginalAndCurrentQuantities1 }
     */
    public OriginalAndCurrentQuantities1 createOriginalAndCurrentQuantities1() {
        return new OriginalAndCurrentQuantities1();
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
     * Create an instance of {@link PendingCancellationReason8Choice }
     * 
     * @return
     *     the new instance of {@link PendingCancellationReason8Choice }
     */
    public PendingCancellationReason8Choice createPendingCancellationReason8Choice() {
        return new PendingCancellationReason8Choice();
    }

    /**
     * Create an instance of {@link PendingCancellationStatus11Choice }
     * 
     * @return
     *     the new instance of {@link PendingCancellationStatus11Choice }
     */
    public PendingCancellationStatus11Choice createPendingCancellationStatus11Choice() {
        return new PendingCancellationStatus11Choice();
    }

    /**
     * Create an instance of {@link PendingCancellationStatusReason11 }
     * 
     * @return
     *     the new instance of {@link PendingCancellationStatusReason11 }
     */
    public PendingCancellationStatusReason11 createPendingCancellationStatusReason11() {
        return new PendingCancellationStatusReason11();
    }

    /**
     * Create an instance of {@link ProprietaryReason4 }
     * 
     * @return
     *     the new instance of {@link ProprietaryReason4 }
     */
    public ProprietaryReason4 createProprietaryReason4() {
        return new ProprietaryReason4();
    }

    /**
     * Create an instance of {@link ProprietaryStatusAndReason6 }
     * 
     * @return
     *     the new instance of {@link ProprietaryStatusAndReason6 }
     */
    public ProprietaryStatusAndReason6 createProprietaryStatusAndReason6() {
        return new ProprietaryStatusAndReason6();
    }

    /**
     * Create an instance of {@link Quantity6Choice }
     * 
     * @return
     *     the new instance of {@link Quantity6Choice }
     */
    public Quantity6Choice createQuantity6Choice() {
        return new Quantity6Choice();
    }

    /**
     * Create an instance of {@link RateAndAmountFormat40Choice }
     * 
     * @return
     *     the new instance of {@link RateAndAmountFormat40Choice }
     */
    public RateAndAmountFormat40Choice createRateAndAmountFormat40Choice() {
        return new RateAndAmountFormat40Choice();
    }

    /**
     * Create an instance of {@link RateType42Choice }
     * 
     * @return
     *     the new instance of {@link RateType42Choice }
     */
    public RateType42Choice createRateType42Choice() {
        return new RateType42Choice();
    }

    /**
     * Create an instance of {@link RateTypeAndPercentageRate8 }
     * 
     * @return
     *     the new instance of {@link RateTypeAndPercentageRate8 }
     */
    public RateTypeAndPercentageRate8 createRateTypeAndPercentageRate8() {
        return new RateTypeAndPercentageRate8();
    }

    /**
     * Create an instance of {@link References26 }
     * 
     * @return
     *     the new instance of {@link References26 }
     */
    public References26 createReferences26() {
        return new References26();
    }

    /**
     * Create an instance of {@link RejectedReason38Choice }
     * 
     * @return
     *     the new instance of {@link RejectedReason38Choice }
     */
    public RejectedReason38Choice createRejectedReason38Choice() {
        return new RejectedReason38Choice();
    }

    /**
     * Create an instance of {@link RejectedStatus38Choice }
     * 
     * @return
     *     the new instance of {@link RejectedStatus38Choice }
     */
    public RejectedStatus38Choice createRejectedStatus38Choice() {
        return new RejectedStatus38Choice();
    }

    /**
     * Create an instance of {@link RejectedStatusReason36 }
     * 
     * @return
     *     the new instance of {@link RejectedStatusReason36 }
     */
    public RejectedStatusReason36 createRejectedStatusReason36() {
        return new RejectedStatusReason36();
    }

    /**
     * Create an instance of {@link SecuritiesOption76 }
     * 
     * @return
     *     the new instance of {@link SecuritiesOption76 }
     */
    public SecuritiesOption76 createSecuritiesOption76() {
        return new SecuritiesOption76();
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
    @XmlElementDecl(namespace = "urn:iso:std:iso:20022:tech:xsd:seev.053.001.01", name = "Document")
    public JAXBElement<Document> createDocument(Document value) {
        return new JAXBElement<>(_Document_QNAME, Document.class, null, value);
    }

}
