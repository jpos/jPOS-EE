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

package org.jpos.iso20022.seev_050_001_01;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.jpos.iso20022.seev_050_001_01 package. 
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

    private static final QName _Document_QNAME = new QName("urn:iso:std:iso:20022:tech:xsd:seev.050.001.01", "Document");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.jpos.iso20022.seev_050_001_01
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
     * Create an instance of {@link AccountIdentification46 }
     * 
     * @return
     *     the new instance of {@link AccountIdentification46 }
     */
    public AccountIdentification46 createAccountIdentification46() {
        return new AccountIdentification46();
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
     * Create an instance of {@link AlternatePartyIdentification7 }
     * 
     * @return
     *     the new instance of {@link AlternatePartyIdentification7 }
     */
    public AlternatePartyIdentification7 createAlternatePartyIdentification7() {
        return new AlternatePartyIdentification7();
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
     * Create an instance of {@link CorporateAction59 }
     * 
     * @return
     *     the new instance of {@link CorporateAction59 }
     */
    public CorporateAction59 createCorporateAction59() {
        return new CorporateAction59();
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
     * Create an instance of {@link FinancialInstrumentQuantity18Choice }
     * 
     * @return
     *     the new instance of {@link FinancialInstrumentQuantity18Choice }
     */
    public FinancialInstrumentQuantity18Choice createFinancialInstrumentQuantity18Choice() {
        return new FinancialInstrumentQuantity18Choice();
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
     * Create an instance of {@link GenericIdentification36 }
     * 
     * @return
     *     the new instance of {@link GenericIdentification36 }
     */
    public GenericIdentification36 createGenericIdentification36() {
        return new GenericIdentification36();
    }

    /**
     * Create an instance of {@link GenericIdentification78 }
     * 
     * @return
     *     the new instance of {@link GenericIdentification78 }
     */
    public GenericIdentification78 createGenericIdentification78() {
        return new GenericIdentification78();
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
     * Create an instance of {@link IdentificationType42Choice }
     * 
     * @return
     *     the new instance of {@link IdentificationType42Choice }
     */
    public IdentificationType42Choice createIdentificationType42Choice() {
        return new IdentificationType42Choice();
    }

    /**
     * Create an instance of {@link MarketClaimCreationV01 }
     * 
     * @return
     *     the new instance of {@link MarketClaimCreationV01 }
     */
    public MarketClaimCreationV01 createMarketClaimCreationV01() {
        return new MarketClaimCreationV01();
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
     * Create an instance of {@link PartyIdentification120Choice }
     * 
     * @return
     *     the new instance of {@link PartyIdentification120Choice }
     */
    public PartyIdentification120Choice createPartyIdentification120Choice() {
        return new PartyIdentification120Choice();
    }

    /**
     * Create an instance of {@link PartyIdentification122Choice }
     * 
     * @return
     *     the new instance of {@link PartyIdentification122Choice }
     */
    public PartyIdentification122Choice createPartyIdentification122Choice() {
        return new PartyIdentification122Choice();
    }

    /**
     * Create an instance of {@link PartyIdentification127Choice }
     * 
     * @return
     *     the new instance of {@link PartyIdentification127Choice }
     */
    public PartyIdentification127Choice createPartyIdentification127Choice() {
        return new PartyIdentification127Choice();
    }

    /**
     * Create an instance of {@link PartyIdentification143 }
     * 
     * @return
     *     the new instance of {@link PartyIdentification143 }
     */
    public PartyIdentification143 createPartyIdentification143() {
        return new PartyIdentification143();
    }

    /**
     * Create an instance of {@link PartyIdentificationAndAccount163 }
     * 
     * @return
     *     the new instance of {@link PartyIdentificationAndAccount163 }
     */
    public PartyIdentificationAndAccount163 createPartyIdentificationAndAccount163() {
        return new PartyIdentificationAndAccount163();
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
     * Create an instance of {@link References25 }
     * 
     * @return
     *     the new instance of {@link References25 }
     */
    public References25 createReferences25() {
        return new References25();
    }

    /**
     * Create an instance of {@link RelatedSettlementInstruction1 }
     * 
     * @return
     *     the new instance of {@link RelatedSettlementInstruction1 }
     */
    public RelatedSettlementInstruction1 createRelatedSettlementInstruction1() {
        return new RelatedSettlementInstruction1();
    }

    /**
     * Create an instance of {@link SafekeepingPlaceFormat28Choice }
     * 
     * @return
     *     the new instance of {@link SafekeepingPlaceFormat28Choice }
     */
    public SafekeepingPlaceFormat28Choice createSafekeepingPlaceFormat28Choice() {
        return new SafekeepingPlaceFormat28Choice();
    }

    /**
     * Create an instance of {@link SafekeepingPlaceTypeAndIdentification1 }
     * 
     * @return
     *     the new instance of {@link SafekeepingPlaceTypeAndIdentification1 }
     */
    public SafekeepingPlaceTypeAndIdentification1 createSafekeepingPlaceTypeAndIdentification1() {
        return new SafekeepingPlaceTypeAndIdentification1();
    }

    /**
     * Create an instance of {@link SafekeepingPlaceTypeAndText6 }
     * 
     * @return
     *     the new instance of {@link SafekeepingPlaceTypeAndText6 }
     */
    public SafekeepingPlaceTypeAndText6 createSafekeepingPlaceTypeAndText6() {
        return new SafekeepingPlaceTypeAndText6();
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
     * Create an instance of {@link SettlementParties75 }
     * 
     * @return
     *     the new instance of {@link SettlementParties75 }
     */
    public SettlementParties75 createSettlementParties75() {
        return new SettlementParties75();
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
    @XmlElementDecl(namespace = "urn:iso:std:iso:20022:tech:xsd:seev.050.001.01", name = "Document")
    public JAXBElement<Document> createDocument(Document value) {
        return new JAXBElement<>(_Document_QNAME, Document.class, null, value);
    }

}
