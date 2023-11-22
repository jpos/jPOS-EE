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

package org.jpos.iso20022.colr_020_001_01;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.jpos.iso20022.colr_020_001_01 package. 
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

    private static final QName _Document_QNAME = new QName("urn:iso:std:iso:20022:tech:xsd:colr.020.001.01", "Document");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.jpos.iso20022.colr_020_001_01
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
     * Create an instance of {@link AlternatePartyIdentification7 }
     * 
     * @return
     *     the new instance of {@link AlternatePartyIdentification7 }
     */
    public AlternatePartyIdentification7 createAlternatePartyIdentification7() {
        return new AlternatePartyIdentification7();
    }

    /**
     * Create an instance of {@link AmountAndDirection44 }
     * 
     * @return
     *     the new instance of {@link AmountAndDirection44 }
     */
    public AmountAndDirection44 createAmountAndDirection44() {
        return new AmountAndDirection44();
    }

    /**
     * Create an instance of {@link AmountAndDirection49 }
     * 
     * @return
     *     the new instance of {@link AmountAndDirection49 }
     */
    public AmountAndDirection49 createAmountAndDirection49() {
        return new AmountAndDirection49();
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
     * Create an instance of {@link CancellationReason29 }
     * 
     * @return
     *     the new instance of {@link CancellationReason29 }
     */
    public CancellationReason29 createCancellationReason29() {
        return new CancellationReason29();
    }

    /**
     * Create an instance of {@link CancellationReason38Choice }
     * 
     * @return
     *     the new instance of {@link CancellationReason38Choice }
     */
    public CancellationReason38Choice createCancellationReason38Choice() {
        return new CancellationReason38Choice();
    }

    /**
     * Create an instance of {@link CancellationStatus29Choice }
     * 
     * @return
     *     the new instance of {@link CancellationStatus29Choice }
     */
    public CancellationStatus29Choice createCancellationStatus29Choice() {
        return new CancellationStatus29Choice();
    }

    /**
     * Create an instance of {@link CancellationStatus30Choice }
     * 
     * @return
     *     the new instance of {@link CancellationStatus30Choice }
     */
    public CancellationStatus30Choice createCancellationStatus30Choice() {
        return new CancellationStatus30Choice();
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
     * Create an instance of {@link CashMovement7 }
     * 
     * @return
     *     the new instance of {@link CashMovement7 }
     */
    public CashMovement7 createCashMovement7() {
        return new CashMovement7();
    }

    /**
     * Create an instance of {@link ClosingDate4Choice }
     * 
     * @return
     *     the new instance of {@link ClosingDate4Choice }
     */
    public ClosingDate4Choice createClosingDate4Choice() {
        return new ClosingDate4Choice();
    }

    /**
     * Create an instance of {@link CollateralAmount14 }
     * 
     * @return
     *     the new instance of {@link CollateralAmount14 }
     */
    public CollateralAmount14 createCollateralAmount14() {
        return new CollateralAmount14();
    }

    /**
     * Create an instance of {@link CollateralDate2 }
     * 
     * @return
     *     the new instance of {@link CollateralDate2 }
     */
    public CollateralDate2 createCollateralDate2() {
        return new CollateralDate2();
    }

    /**
     * Create an instance of {@link CollateralParameters12 }
     * 
     * @return
     *     the new instance of {@link CollateralParameters12 }
     */
    public CollateralParameters12 createCollateralParameters12() {
        return new CollateralParameters12();
    }

    /**
     * Create an instance of {@link CollateralParties8 }
     * 
     * @return
     *     the new instance of {@link CollateralParties8 }
     */
    public CollateralParties8 createCollateralParties8() {
        return new CollateralParties8();
    }

    /**
     * Create an instance of {@link CollateralTransactionType1Choice }
     * 
     * @return
     *     the new instance of {@link CollateralTransactionType1Choice }
     */
    public CollateralTransactionType1Choice createCollateralTransactionType1Choice() {
        return new CollateralTransactionType1Choice();
    }

    /**
     * Create an instance of {@link Date3Choice }
     * 
     * @return
     *     the new instance of {@link Date3Choice }
     */
    public Date3Choice createDate3Choice() {
        return new Date3Choice();
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
     * Create an instance of {@link DealTransactionDetails7 }
     * 
     * @return
     *     the new instance of {@link DealTransactionDetails7 }
     */
    public DealTransactionDetails7 createDealTransactionDetails7() {
        return new DealTransactionDetails7();
    }

    /**
     * Create an instance of {@link ExposureType23Choice }
     * 
     * @return
     *     the new instance of {@link ExposureType23Choice }
     */
    public ExposureType23Choice createExposureType23Choice() {
        return new ExposureType23Choice();
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
     * Create an instance of {@link ForeignExchangeTerms23 }
     * 
     * @return
     *     the new instance of {@link ForeignExchangeTerms23 }
     */
    public ForeignExchangeTerms23 createForeignExchangeTerms23() {
        return new ForeignExchangeTerms23();
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
     * Create an instance of {@link MatchingStatus33Choice }
     * 
     * @return
     *     the new instance of {@link MatchingStatus33Choice }
     */
    public MatchingStatus33Choice createMatchingStatus33Choice() {
        return new MatchingStatus33Choice();
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
     * Create an instance of {@link Pagination1 }
     * 
     * @return
     *     the new instance of {@link Pagination1 }
     */
    public Pagination1 createPagination1() {
        return new Pagination1();
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
     * Create an instance of {@link PartyIdentificationAndAccount193 }
     * 
     * @return
     *     the new instance of {@link PartyIdentificationAndAccount193 }
     */
    public PartyIdentificationAndAccount193 createPartyIdentificationAndAccount193() {
        return new PartyIdentificationAndAccount193();
    }

    /**
     * Create an instance of {@link PartyIdentificationAndAccount202 }
     * 
     * @return
     *     the new instance of {@link PartyIdentificationAndAccount202 }
     */
    public PartyIdentificationAndAccount202 createPartyIdentificationAndAccount202() {
        return new PartyIdentificationAndAccount202();
    }

    /**
     * Create an instance of {@link PartyIdentificationAndAccount203 }
     * 
     * @return
     *     the new instance of {@link PartyIdentificationAndAccount203 }
     */
    public PartyIdentificationAndAccount203 createPartyIdentificationAndAccount203() {
        return new PartyIdentificationAndAccount203();
    }

    /**
     * Create an instance of {@link PendingReason27 }
     * 
     * @return
     *     the new instance of {@link PendingReason27 }
     */
    public PendingReason27 createPendingReason27() {
        return new PendingReason27();
    }

    /**
     * Create an instance of {@link PendingReason52Choice }
     * 
     * @return
     *     the new instance of {@link PendingReason52Choice }
     */
    public PendingReason52Choice createPendingReason52Choice() {
        return new PendingReason52Choice();
    }

    /**
     * Create an instance of {@link PendingStatus56Choice }
     * 
     * @return
     *     the new instance of {@link PendingStatus56Choice }
     */
    public PendingStatus56Choice createPendingStatus56Choice() {
        return new PendingStatus56Choice();
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
     * Create an instance of {@link ProcessingStatus82Choice }
     * 
     * @return
     *     the new instance of {@link ProcessingStatus82Choice }
     */
    public ProcessingStatus82Choice createProcessingStatus82Choice() {
        return new ProcessingStatus82Choice();
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
     * Create an instance of {@link Quantity51Choice }
     * 
     * @return
     *     the new instance of {@link Quantity51Choice }
     */
    public Quantity51Choice createQuantity51Choice() {
        return new Quantity51Choice();
    }

    /**
     * Create an instance of {@link RejectionReason39Choice }
     * 
     * @return
     *     the new instance of {@link RejectionReason39Choice }
     */
    public RejectionReason39Choice createRejectionReason39Choice() {
        return new RejectionReason39Choice();
    }

    /**
     * Create an instance of {@link RejectionReason40Choice }
     * 
     * @return
     *     the new instance of {@link RejectionReason40Choice }
     */
    public RejectionReason40Choice createRejectionReason40Choice() {
        return new RejectionReason40Choice();
    }

    /**
     * Create an instance of {@link RejectionReason54 }
     * 
     * @return
     *     the new instance of {@link RejectionReason54 }
     */
    public RejectionReason54 createRejectionReason54() {
        return new RejectionReason54();
    }

    /**
     * Create an instance of {@link RejectionReason55 }
     * 
     * @return
     *     the new instance of {@link RejectionReason55 }
     */
    public RejectionReason55 createRejectionReason55() {
        return new RejectionReason55();
    }

    /**
     * Create an instance of {@link RejectionStatus33Choice }
     * 
     * @return
     *     the new instance of {@link RejectionStatus33Choice }
     */
    public RejectionStatus33Choice createRejectionStatus33Choice() {
        return new RejectionStatus33Choice();
    }

    /**
     * Create an instance of {@link RejectionStatus34Choice }
     * 
     * @return
     *     the new instance of {@link RejectionStatus34Choice }
     */
    public RejectionStatus34Choice createRejectionStatus34Choice() {
        return new RejectionStatus34Choice();
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
     * Create an instance of {@link SecuritiesMovement8 }
     * 
     * @return
     *     the new instance of {@link SecuritiesMovement8 }
     */
    public SecuritiesMovement8 createSecuritiesMovement8() {
        return new SecuritiesMovement8();
    }

    /**
     * Create an instance of {@link SecuritiesMovementStatus1Choice }
     * 
     * @return
     *     the new instance of {@link SecuritiesMovementStatus1Choice }
     */
    public SecuritiesMovementStatus1Choice createSecuritiesMovementStatus1Choice() {
        return new SecuritiesMovementStatus1Choice();
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
     * Create an instance of {@link TradingPartyCapacity5Choice }
     * 
     * @return
     *     the new instance of {@link TradingPartyCapacity5Choice }
     */
    public TradingPartyCapacity5Choice createTradingPartyCapacity5Choice() {
        return new TradingPartyCapacity5Choice();
    }

    /**
     * Create an instance of {@link TransactionIdentifications46 }
     * 
     * @return
     *     the new instance of {@link TransactionIdentifications46 }
     */
    public TransactionIdentifications46 createTransactionIdentifications46() {
        return new TransactionIdentifications46();
    }

    /**
     * Create an instance of {@link TripartyCollateralTransactionInstructionProcessingStatusAdviceV01 }
     * 
     * @return
     *     the new instance of {@link TripartyCollateralTransactionInstructionProcessingStatusAdviceV01 }
     */
    public TripartyCollateralTransactionInstructionProcessingStatusAdviceV01 createTripartyCollateralTransactionInstructionProcessingStatusAdviceV01() {
        return new TripartyCollateralTransactionInstructionProcessingStatusAdviceV01();
    }

    /**
     * Create an instance of {@link UnmatchedReason21 }
     * 
     * @return
     *     the new instance of {@link UnmatchedReason21 }
     */
    public UnmatchedReason21 createUnmatchedReason21() {
        return new UnmatchedReason21();
    }

    /**
     * Create an instance of {@link UnmatchedReason30Choice }
     * 
     * @return
     *     the new instance of {@link UnmatchedReason30Choice }
     */
    public UnmatchedReason30Choice createUnmatchedReason30Choice() {
        return new UnmatchedReason30Choice();
    }

    /**
     * Create an instance of {@link UnmatchedStatus22Choice }
     * 
     * @return
     *     the new instance of {@link UnmatchedStatus22Choice }
     */
    public UnmatchedStatus22Choice createUnmatchedStatus22Choice() {
        return new UnmatchedStatus22Choice();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Document }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Document }{@code >}
     */
    @XmlElementDecl(namespace = "urn:iso:std:iso:20022:tech:xsd:colr.020.001.01", name = "Document")
    public JAXBElement<Document> createDocument(Document value) {
        return new JAXBElement<>(_Document_QNAME, Document.class, null, value);
    }

}
