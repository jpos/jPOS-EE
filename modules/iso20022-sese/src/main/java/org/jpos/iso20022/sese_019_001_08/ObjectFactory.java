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

package org.jpos.iso20022.sese_019_001_08;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.jpos.iso20022.sese_019_001_08 package. 
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

    private static final QName _Document_QNAME = new QName("urn:iso:std:iso:20022:tech:xsd:sese.019.001.08", "Document");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.jpos.iso20022.sese_019_001_08
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
     * Create an instance of {@link Account28 }
     * 
     * @return
     *     the new instance of {@link Account28 }
     */
    public Account28 createAccount28() {
        return new Account28();
    }

    /**
     * Create an instance of {@link AccountHoldingInformationRequestV08 }
     * 
     * @return
     *     the new instance of {@link AccountHoldingInformationRequestV08 }
     */
    public AccountHoldingInformationRequestV08 createAccountHoldingInformationRequestV08() {
        return new AccountHoldingInformationRequestV08();
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
     * Create an instance of {@link ActiveOrHistoricCurrencyAndAmount }
     * 
     * @return
     *     the new instance of {@link ActiveOrHistoricCurrencyAndAmount }
     */
    public ActiveOrHistoricCurrencyAndAmount createActiveOrHistoricCurrencyAndAmount() {
        return new ActiveOrHistoricCurrencyAndAmount();
    }

    /**
     * Create an instance of {@link AdditionalInformation15 }
     * 
     * @return
     *     the new instance of {@link AdditionalInformation15 }
     */
    public AdditionalInformation15 createAdditionalInformation15() {
        return new AdditionalInformation15();
    }

    /**
     * Create an instance of {@link AdditionalReference10 }
     * 
     * @return
     *     the new instance of {@link AdditionalReference10 }
     */
    public AdditionalReference10 createAdditionalReference10() {
        return new AdditionalReference10();
    }

    /**
     * Create an instance of {@link AdditionalReference11 }
     * 
     * @return
     *     the new instance of {@link AdditionalReference11 }
     */
    public AdditionalReference11 createAdditionalReference11() {
        return new AdditionalReference11();
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
     * Create an instance of {@link AlternateSecurityIdentification7 }
     * 
     * @return
     *     the new instance of {@link AlternateSecurityIdentification7 }
     */
    public AlternateSecurityIdentification7 createAlternateSecurityIdentification7() {
        return new AlternateSecurityIdentification7();
    }

    /**
     * Create an instance of {@link CashAsset2 }
     * 
     * @return
     *     the new instance of {@link CashAsset2 }
     */
    public CashAsset2 createCashAsset2() {
        return new CashAsset2();
    }

    /**
     * Create an instance of {@link CashAssetType1Choice }
     * 
     * @return
     *     the new instance of {@link CashAssetType1Choice }
     */
    public CashAssetType1Choice createCashAssetType1Choice() {
        return new CashAssetType1Choice();
    }

    /**
     * Create an instance of {@link ClassificationType32Choice }
     * 
     * @return
     *     the new instance of {@link ClassificationType32Choice }
     */
    public ClassificationType32Choice createClassificationType32Choice() {
        return new ClassificationType32Choice();
    }

    /**
     * Create an instance of {@link ClearingSystemMemberIdentification2Choice }
     * 
     * @return
     *     the new instance of {@link ClearingSystemMemberIdentification2Choice }
     */
    public ClearingSystemMemberIdentification2Choice createClearingSystemMemberIdentification2Choice() {
        return new ClearingSystemMemberIdentification2Choice();
    }

    /**
     * Create an instance of {@link DateAndAmount2 }
     * 
     * @return
     *     the new instance of {@link DateAndAmount2 }
     */
    public DateAndAmount2 createDateAndAmount2() {
        return new DateAndAmount2();
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
     * Create an instance of {@link Extension1 }
     * 
     * @return
     *     the new instance of {@link Extension1 }
     */
    public Extension1 createExtension1() {
        return new Extension1();
    }

    /**
     * Create an instance of {@link FinancialInstrument101 }
     * 
     * @return
     *     the new instance of {@link FinancialInstrument101 }
     */
    public FinancialInstrument101 createFinancialInstrument101() {
        return new FinancialInstrument101();
    }

    /**
     * Create an instance of {@link FinancialInstrument61Choice }
     * 
     * @return
     *     the new instance of {@link FinancialInstrument61Choice }
     */
    public FinancialInstrument61Choice createFinancialInstrument61Choice() {
        return new FinancialInstrument61Choice();
    }

    /**
     * Create an instance of {@link FinancialInstrumentIdentification2 }
     * 
     * @return
     *     the new instance of {@link FinancialInstrumentIdentification2 }
     */
    public FinancialInstrumentIdentification2 createFinancialInstrumentIdentification2() {
        return new FinancialInstrumentIdentification2();
    }

    /**
     * Create an instance of {@link FundPortfolio9Choice }
     * 
     * @return
     *     the new instance of {@link FundPortfolio9Choice }
     */
    public FundPortfolio9Choice createFundPortfolio9Choice() {
        return new FundPortfolio9Choice();
    }

    /**
     * Create an instance of {@link FundSettlementParameters18 }
     * 
     * @return
     *     the new instance of {@link FundSettlementParameters18 }
     */
    public FundSettlementParameters18 createFundSettlementParameters18() {
        return new FundSettlementParameters18();
    }

    /**
     * Create an instance of {@link GeneralInvestment2 }
     * 
     * @return
     *     the new instance of {@link GeneralInvestment2 }
     */
    public GeneralInvestment2 createGeneralInvestment2() {
        return new GeneralInvestment2();
    }

    /**
     * Create an instance of {@link GeneralInvestmentAccountType2Choice }
     * 
     * @return
     *     the new instance of {@link GeneralInvestmentAccountType2Choice }
     */
    public GeneralInvestmentAccountType2Choice createGeneralInvestmentAccountType2Choice() {
        return new GeneralInvestmentAccountType2Choice();
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
     * Create an instance of {@link IdentificationSource1Choice }
     * 
     * @return
     *     the new instance of {@link IdentificationSource1Choice }
     */
    public IdentificationSource1Choice createIdentificationSource1Choice() {
        return new IdentificationSource1Choice();
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
     * Create an instance of {@link IndividualPerson8 }
     * 
     * @return
     *     the new instance of {@link IndividualPerson8 }
     */
    public IndividualPerson8 createIndividualPerson8() {
        return new IndividualPerson8();
    }

    /**
     * Create an instance of {@link InvestmentAccount69 }
     * 
     * @return
     *     the new instance of {@link InvestmentAccount69 }
     */
    public InvestmentAccount69 createInvestmentAccount69() {
        return new InvestmentAccount69();
    }

    /**
     * Create an instance of {@link MarketPracticeVersion1 }
     * 
     * @return
     *     the new instance of {@link MarketPracticeVersion1 }
     */
    public MarketPracticeVersion1 createMarketPracticeVersion1() {
        return new MarketPracticeVersion1();
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
     * Create an instance of {@link Organisation36 }
     * 
     * @return
     *     the new instance of {@link Organisation36 }
     */
    public Organisation36 createOrganisation36() {
        return new Organisation36();
    }

    /**
     * Create an instance of {@link OtherAsset2 }
     * 
     * @return
     *     the new instance of {@link OtherAsset2 }
     */
    public OtherAsset2 createOtherAsset2() {
        return new OtherAsset2();
    }

    /**
     * Create an instance of {@link OtherAsset2Choice }
     * 
     * @return
     *     the new instance of {@link OtherAsset2Choice }
     */
    public OtherAsset2Choice createOtherAsset2Choice() {
        return new OtherAsset2Choice();
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
     * Create an instance of {@link PartyIdentification123Choice }
     * 
     * @return
     *     the new instance of {@link PartyIdentification123Choice }
     */
    public PartyIdentification123Choice createPartyIdentification123Choice() {
        return new PartyIdentification123Choice();
    }

    /**
     * Create an instance of {@link PartyIdentification125Choice }
     * 
     * @return
     *     the new instance of {@link PartyIdentification125Choice }
     */
    public PartyIdentification125Choice createPartyIdentification125Choice() {
        return new PartyIdentification125Choice();
    }

    /**
     * Create an instance of {@link PartyIdentification126Choice }
     * 
     * @return
     *     the new instance of {@link PartyIdentification126Choice }
     */
    public PartyIdentification126Choice createPartyIdentification126Choice() {
        return new PartyIdentification126Choice();
    }

    /**
     * Create an instance of {@link PartyIdentification132 }
     * 
     * @return
     *     the new instance of {@link PartyIdentification132 }
     */
    public PartyIdentification132 createPartyIdentification132() {
        return new PartyIdentification132();
    }

    /**
     * Create an instance of {@link PartyIdentification139 }
     * 
     * @return
     *     the new instance of {@link PartyIdentification139 }
     */
    public PartyIdentification139 createPartyIdentification139() {
        return new PartyIdentification139();
    }

    /**
     * Create an instance of {@link PartyIdentification140 }
     * 
     * @return
     *     the new instance of {@link PartyIdentification140 }
     */
    public PartyIdentification140 createPartyIdentification140() {
        return new PartyIdentification140();
    }

    /**
     * Create an instance of {@link PartyIdentification141 }
     * 
     * @return
     *     the new instance of {@link PartyIdentification141 }
     */
    public PartyIdentification141 createPartyIdentification141() {
        return new PartyIdentification141();
    }

    /**
     * Create an instance of {@link PartyIdentificationAndAccount194 }
     * 
     * @return
     *     the new instance of {@link PartyIdentificationAndAccount194 }
     */
    public PartyIdentificationAndAccount194 createPartyIdentificationAndAccount194() {
        return new PartyIdentificationAndAccount194();
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
     * Create an instance of {@link PartyTextInformation6 }
     * 
     * @return
     *     the new instance of {@link PartyTextInformation6 }
     */
    public PartyTextInformation6 createPartyTextInformation6() {
        return new PartyTextInformation6();
    }

    /**
     * Create an instance of {@link Pension6 }
     * 
     * @return
     *     the new instance of {@link Pension6 }
     */
    public Pension6 createPension6() {
        return new Pension6();
    }

    /**
     * Create an instance of {@link PensionPolicy1 }
     * 
     * @return
     *     the new instance of {@link PensionPolicy1 }
     */
    public PensionPolicy1 createPensionPolicy1() {
        return new PensionPolicy1();
    }

    /**
     * Create an instance of {@link PensionSchemeType3Choice }
     * 
     * @return
     *     the new instance of {@link PensionSchemeType3Choice }
     */
    public PensionSchemeType3Choice createPensionSchemeType3Choice() {
        return new PensionSchemeType3Choice();
    }

    /**
     * Create an instance of {@link PensionTransferScope1Choice }
     * 
     * @return
     *     the new instance of {@link PensionTransferScope1Choice }
     */
    public PensionTransferScope1Choice createPensionTransferScope1Choice() {
        return new PensionTransferScope1Choice();
    }

    /**
     * Create an instance of {@link PortfolioTransfer12 }
     * 
     * @return
     *     the new instance of {@link PortfolioTransfer12 }
     */
    public PortfolioTransfer12 createPortfolioTransfer12() {
        return new PortfolioTransfer12();
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
     * Create an instance of {@link PreviousYear2Choice }
     * 
     * @return
     *     the new instance of {@link PreviousYear2Choice }
     */
    public PreviousYear2Choice createPreviousYear2Choice() {
        return new PreviousYear2Choice();
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
     * Create an instance of {@link SecuritiesAccount19 }
     * 
     * @return
     *     the new instance of {@link SecuritiesAccount19 }
     */
    public SecuritiesAccount19 createSecuritiesAccount19() {
        return new SecuritiesAccount19();
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
     * Create an instance of {@link SettlementParties94 }
     * 
     * @return
     *     the new instance of {@link SettlementParties94 }
     */
    public SettlementParties94 createSettlementParties94() {
        return new SettlementParties94();
    }

    /**
     * Create an instance of {@link SettlementTransactionCondition30Choice }
     * 
     * @return
     *     the new instance of {@link SettlementTransactionCondition30Choice }
     */
    public SettlementTransactionCondition30Choice createSettlementTransactionCondition30Choice() {
        return new SettlementTransactionCondition30Choice();
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
     * Create an instance of {@link TaxEfficientProduct4 }
     * 
     * @return
     *     the new instance of {@link TaxEfficientProduct4 }
     */
    public TaxEfficientProduct4 createTaxEfficientProduct4() {
        return new TaxEfficientProduct4();
    }

    /**
     * Create an instance of {@link TaxEfficientProductType2Choice }
     * 
     * @return
     *     the new instance of {@link TaxEfficientProductType2Choice }
     */
    public TaxEfficientProductType2Choice createTaxEfficientProductType2Choice() {
        return new TaxEfficientProductType2Choice();
    }

    /**
     * Create an instance of {@link TaxReference1 }
     * 
     * @return
     *     the new instance of {@link TaxReference1 }
     */
    public TaxReference1 createTaxReference1() {
        return new TaxReference1();
    }

    /**
     * Create an instance of {@link TaxReferenceParty1Choice }
     * 
     * @return
     *     the new instance of {@link TaxReferenceParty1Choice }
     */
    public TaxReferenceParty1Choice createTaxReferenceParty1Choice() {
        return new TaxReferenceParty1Choice();
    }

    /**
     * Create an instance of {@link TaxReferenceType1Choice }
     * 
     * @return
     *     the new instance of {@link TaxReferenceType1Choice }
     */
    public TaxReferenceType1Choice createTaxReferenceType1Choice() {
        return new TaxReferenceType1Choice();
    }

    /**
     * Create an instance of {@link TradeTransactionCondition8Choice }
     * 
     * @return
     *     the new instance of {@link TradeTransactionCondition8Choice }
     */
    public TradeTransactionCondition8Choice createTradeTransactionCondition8Choice() {
        return new TradeTransactionCondition8Choice();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Document }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Document }{@code >}
     */
    @XmlElementDecl(namespace = "urn:iso:std:iso:20022:tech:xsd:sese.019.001.08", name = "Document")
    public JAXBElement<Document> createDocument(Document value) {
        return new JAXBElement<>(_Document_QNAME, Document.class, null, value);
    }

}
