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

package org.jpos.iso20022.colr_010_001_05;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.jpos.iso20022.colr_010_001_05 package. 
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

    private static final QName _Document_QNAME = new QName("urn:iso:std:iso:20022:tech:xsd:colr.010.001.05", "Document");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.jpos.iso20022.colr_010_001_05
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
     * Create an instance of {@link ActiveCurrencyAndAmount }
     * 
     * @return
     *     the new instance of {@link ActiveCurrencyAndAmount }
     */
    public ActiveCurrencyAndAmount createActiveCurrencyAndAmount() {
        return new ActiveCurrencyAndAmount();
    }

    /**
     * Create an instance of {@link ActiveOrHistoricCurrencyAnd13DecimalAmount }
     * 
     * @return
     *     the new instance of {@link ActiveOrHistoricCurrencyAnd13DecimalAmount }
     */
    public ActiveOrHistoricCurrencyAnd13DecimalAmount createActiveOrHistoricCurrencyAnd13DecimalAmount() {
        return new ActiveOrHistoricCurrencyAnd13DecimalAmount();
    }

    /**
     * Create an instance of {@link Agreement4 }
     * 
     * @return
     *     the new instance of {@link Agreement4 }
     */
    public Agreement4 createAgreement4() {
        return new Agreement4();
    }

    /**
     * Create an instance of {@link AgreementFramework1Choice }
     * 
     * @return
     *     the new instance of {@link AgreementFramework1Choice }
     */
    public AgreementFramework1Choice createAgreementFramework1Choice() {
        return new AgreementFramework1Choice();
    }

    /**
     * Create an instance of {@link AlternatePartyIdentification8 }
     * 
     * @return
     *     the new instance of {@link AlternatePartyIdentification8 }
     */
    public AlternatePartyIdentification8 createAlternatePartyIdentification8() {
        return new AlternatePartyIdentification8();
    }

    /**
     * Create an instance of {@link BlockChainAddressWallet3 }
     * 
     * @return
     *     the new instance of {@link BlockChainAddressWallet3 }
     */
    public BlockChainAddressWallet3 createBlockChainAddressWallet3() {
        return new BlockChainAddressWallet3();
    }

    /**
     * Create an instance of {@link BlockChainAddressWallet5 }
     * 
     * @return
     *     the new instance of {@link BlockChainAddressWallet5 }
     */
    public BlockChainAddressWallet5 createBlockChainAddressWallet5() {
        return new BlockChainAddressWallet5();
    }

    /**
     * Create an instance of {@link CashCollateral3 }
     * 
     * @return
     *     the new instance of {@link CashCollateral3 }
     */
    public CashCollateral3 createCashCollateral3() {
        return new CashCollateral3();
    }

    /**
     * Create an instance of {@link CashCollateral5 }
     * 
     * @return
     *     the new instance of {@link CashCollateral5 }
     */
    public CashCollateral5 createCashCollateral5() {
        return new CashCollateral5();
    }

    /**
     * Create an instance of {@link CollateralAccount3 }
     * 
     * @return
     *     the new instance of {@link CollateralAccount3 }
     */
    public CollateralAccount3 createCollateralAccount3() {
        return new CollateralAccount3();
    }

    /**
     * Create an instance of {@link CollateralAccountIdentificationType3Choice }
     * 
     * @return
     *     the new instance of {@link CollateralAccountIdentificationType3Choice }
     */
    public CollateralAccountIdentificationType3Choice createCollateralAccountIdentificationType3Choice() {
        return new CollateralAccountIdentificationType3Choice();
    }

    /**
     * Create an instance of {@link CollateralOwnership4 }
     * 
     * @return
     *     the new instance of {@link CollateralOwnership4 }
     */
    public CollateralOwnership4 createCollateralOwnership4() {
        return new CollateralOwnership4();
    }

    /**
     * Create an instance of {@link CollateralSubstitution7 }
     * 
     * @return
     *     the new instance of {@link CollateralSubstitution7 }
     */
    public CollateralSubstitution7 createCollateralSubstitution7() {
        return new CollateralSubstitution7();
    }

    /**
     * Create an instance of {@link CollateralSubstitution8 }
     * 
     * @return
     *     the new instance of {@link CollateralSubstitution8 }
     */
    public CollateralSubstitution8 createCollateralSubstitution8() {
        return new CollateralSubstitution8();
    }

    /**
     * Create an instance of {@link CollateralSubstitutionRequestV05 }
     * 
     * @return
     *     the new instance of {@link CollateralSubstitutionRequestV05 }
     */
    public CollateralSubstitutionRequestV05 createCollateralSubstitutionRequestV05() {
        return new CollateralSubstitutionRequestV05();
    }

    /**
     * Create an instance of {@link ContactIdentification2 }
     * 
     * @return
     *     the new instance of {@link ContactIdentification2 }
     */
    public ContactIdentification2 createContactIdentification2() {
        return new ContactIdentification2();
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
     * Create an instance of {@link DateCode9Choice }
     * 
     * @return
     *     the new instance of {@link DateCode9Choice }
     */
    public DateCode9Choice createDateCode9Choice() {
        return new DateCode9Choice();
    }

    /**
     * Create an instance of {@link DateFormat14Choice }
     * 
     * @return
     *     the new instance of {@link DateFormat14Choice }
     */
    public DateFormat14Choice createDateFormat14Choice() {
        return new DateFormat14Choice();
    }

    /**
     * Create an instance of {@link DeliveringPartiesAndAccount19 }
     * 
     * @return
     *     the new instance of {@link DeliveringPartiesAndAccount19 }
     */
    public DeliveringPartiesAndAccount19 createDeliveringPartiesAndAccount19() {
        return new DeliveringPartiesAndAccount19();
    }

    /**
     * Create an instance of {@link FinancialInstrumentQuantity33Choice }
     * 
     * @return
     *     the new instance of {@link FinancialInstrumentQuantity33Choice }
     */
    public FinancialInstrumentQuantity33Choice createFinancialInstrumentQuantity33Choice() {
        return new FinancialInstrumentQuantity33Choice();
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
     * Create an instance of {@link IdentificationType43Choice }
     * 
     * @return
     *     the new instance of {@link IdentificationType43Choice }
     */
    public IdentificationType43Choice createIdentificationType43Choice() {
        return new IdentificationType43Choice();
    }

    /**
     * Create an instance of {@link NameAndAddress13 }
     * 
     * @return
     *     the new instance of {@link NameAndAddress13 }
     */
    public NameAndAddress13 createNameAndAddress13() {
        return new NameAndAddress13();
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
     * Create an instance of {@link NameAndAddress6 }
     * 
     * @return
     *     the new instance of {@link NameAndAddress6 }
     */
    public NameAndAddress6 createNameAndAddress6() {
        return new NameAndAddress6();
    }

    /**
     * Create an instance of {@link Obligation9 }
     * 
     * @return
     *     the new instance of {@link Obligation9 }
     */
    public Obligation9 createObligation9() {
        return new Obligation9();
    }

    /**
     * Create an instance of {@link OtherCollateral11 }
     * 
     * @return
     *     the new instance of {@link OtherCollateral11 }
     */
    public OtherCollateral11 createOtherCollateral11() {
        return new OtherCollateral11();
    }

    /**
     * Create an instance of {@link OtherCollateral9 }
     * 
     * @return
     *     the new instance of {@link OtherCollateral9 }
     */
    public OtherCollateral9 createOtherCollateral9() {
        return new OtherCollateral9();
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
     * Create an instance of {@link OtherTypeOfCollateral3 }
     * 
     * @return
     *     the new instance of {@link OtherTypeOfCollateral3 }
     */
    public OtherTypeOfCollateral3 createOtherTypeOfCollateral3() {
        return new OtherTypeOfCollateral3();
    }

    /**
     * Create an instance of {@link PartyIdentification178Choice }
     * 
     * @return
     *     the new instance of {@link PartyIdentification178Choice }
     */
    public PartyIdentification178Choice createPartyIdentification178Choice() {
        return new PartyIdentification178Choice();
    }

    /**
     * Create an instance of {@link PartyIdentification239Choice }
     * 
     * @return
     *     the new instance of {@link PartyIdentification239Choice }
     */
    public PartyIdentification239Choice createPartyIdentification239Choice() {
        return new PartyIdentification239Choice();
    }

    /**
     * Create an instance of {@link PartyIdentification240Choice }
     * 
     * @return
     *     the new instance of {@link PartyIdentification240Choice }
     */
    public PartyIdentification240Choice createPartyIdentification240Choice() {
        return new PartyIdentification240Choice();
    }

    /**
     * Create an instance of {@link PartyIdentificationAndAccount200 }
     * 
     * @return
     *     the new instance of {@link PartyIdentificationAndAccount200 }
     */
    public PartyIdentificationAndAccount200 createPartyIdentificationAndAccount200() {
        return new PartyIdentificationAndAccount200();
    }

    /**
     * Create an instance of {@link PartyIdentificationAndAccount201 }
     * 
     * @return
     *     the new instance of {@link PartyIdentificationAndAccount201 }
     */
    public PartyIdentificationAndAccount201 createPartyIdentificationAndAccount201() {
        return new PartyIdentificationAndAccount201();
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
     * Create an instance of {@link PostalAddress1 }
     * 
     * @return
     *     the new instance of {@link PostalAddress1 }
     */
    public PostalAddress1 createPostalAddress1() {
        return new PostalAddress1();
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
     * Create an instance of {@link PostalAddress8 }
     * 
     * @return
     *     the new instance of {@link PostalAddress8 }
     */
    public PostalAddress8 createPostalAddress8() {
        return new PostalAddress8();
    }

    /**
     * Create an instance of {@link Price7 }
     * 
     * @return
     *     the new instance of {@link Price7 }
     */
    public Price7 createPrice7() {
        return new Price7();
    }

    /**
     * Create an instance of {@link PriceRateOrAmount3Choice }
     * 
     * @return
     *     the new instance of {@link PriceRateOrAmount3Choice }
     */
    public PriceRateOrAmount3Choice createPriceRateOrAmount3Choice() {
        return new PriceRateOrAmount3Choice();
    }

    /**
     * Create an instance of {@link ReceivingPartiesAndAccount19 }
     * 
     * @return
     *     the new instance of {@link ReceivingPartiesAndAccount19 }
     */
    public ReceivingPartiesAndAccount19 createReceivingPartiesAndAccount19() {
        return new ReceivingPartiesAndAccount19();
    }

    /**
     * Create an instance of {@link Reference17 }
     * 
     * @return
     *     the new instance of {@link Reference17 }
     */
    public Reference17 createReference17() {
        return new Reference17();
    }

    /**
     * Create an instance of {@link SafekeepingPlaceFormat29Choice }
     * 
     * @return
     *     the new instance of {@link SafekeepingPlaceFormat29Choice }
     */
    public SafekeepingPlaceFormat29Choice createSafekeepingPlaceFormat29Choice() {
        return new SafekeepingPlaceFormat29Choice();
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
     * Create an instance of {@link SafekeepingPlaceTypeAndText8 }
     * 
     * @return
     *     the new instance of {@link SafekeepingPlaceTypeAndText8 }
     */
    public SafekeepingPlaceTypeAndText8 createSafekeepingPlaceTypeAndText8() {
        return new SafekeepingPlaceTypeAndText8();
    }

    /**
     * Create an instance of {@link SecuritiesAccount19 }
     * 
     * @return
     *     the new instance of {@link SecuritiesAccount19 }
     */
    public SecuritiesAccount19 createSecuritiesAccount19() {
        return new SecuritiesAccount19();
    }

    /**
     * Create an instance of {@link SecuritiesCollateral11 }
     * 
     * @return
     *     the new instance of {@link SecuritiesCollateral11 }
     */
    public SecuritiesCollateral11 createSecuritiesCollateral11() {
        return new SecuritiesCollateral11();
    }

    /**
     * Create an instance of {@link SecuritiesCollateral12 }
     * 
     * @return
     *     the new instance of {@link SecuritiesCollateral12 }
     */
    public SecuritiesCollateral12 createSecuritiesCollateral12() {
        return new SecuritiesCollateral12();
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
     * Create an instance of {@link SettlementDetails206 }
     * 
     * @return
     *     the new instance of {@link SettlementDetails206 }
     */
    public SettlementDetails206 createSettlementDetails206() {
        return new SettlementDetails206();
    }

    /**
     * Create an instance of {@link SettlementParties36Choice }
     * 
     * @return
     *     the new instance of {@link SettlementParties36Choice }
     */
    public SettlementParties36Choice createSettlementParties36Choice() {
        return new SettlementParties36Choice();
    }

    /**
     * Create an instance of {@link SubAccount5 }
     * 
     * @return
     *     the new instance of {@link SubAccount5 }
     */
    public SubAccount5 createSubAccount5() {
        return new SubAccount5();
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
     * Create an instance of {@link YieldedOrValueType1Choice }
     * 
     * @return
     *     the new instance of {@link YieldedOrValueType1Choice }
     */
    public YieldedOrValueType1Choice createYieldedOrValueType1Choice() {
        return new YieldedOrValueType1Choice();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Document }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Document }{@code >}
     */
    @XmlElementDecl(namespace = "urn:iso:std:iso:20022:tech:xsd:colr.010.001.05", name = "Document")
    public JAXBElement<Document> createDocument(Document value) {
        return new JAXBElement<>(_Document_QNAME, Document.class, null, value);
    }

}
