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

package org.jpos.iso20022.sese_027_001_07;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.jpos.iso20022.sese_027_001_07 package. 
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

    private static final QName _Document_QNAME = new QName("urn:iso:std:iso:20022:tech:xsd:sese.027.001.07", "Document");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.jpos.iso20022.sese_027_001_07
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
     * Create an instance of {@link AcknowledgedAcceptedStatus24Choice }
     * 
     * @return
     *     the new instance of {@link AcknowledgedAcceptedStatus24Choice }
     */
    public AcknowledgedAcceptedStatus24Choice createAcknowledgedAcceptedStatus24Choice() {
        return new AcknowledgedAcceptedStatus24Choice();
    }

    /**
     * Create an instance of {@link AcknowledgementReason12 }
     * 
     * @return
     *     the new instance of {@link AcknowledgementReason12 }
     */
    public AcknowledgementReason12 createAcknowledgementReason12() {
        return new AcknowledgementReason12();
    }

    /**
     * Create an instance of {@link AcknowledgementReason15Choice }
     * 
     * @return
     *     the new instance of {@link AcknowledgementReason15Choice }
     */
    public AcknowledgementReason15Choice createAcknowledgementReason15Choice() {
        return new AcknowledgementReason15Choice();
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
     * Create an instance of {@link AmountAndDirection51 }
     * 
     * @return
     *     the new instance of {@link AmountAndDirection51 }
     */
    public AmountAndDirection51 createAmountAndDirection51() {
        return new AmountAndDirection51();
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
     * Create an instance of {@link CancellationReason10 }
     * 
     * @return
     *     the new instance of {@link CancellationReason10 }
     */
    public CancellationReason10 createCancellationReason10() {
        return new CancellationReason10();
    }

    /**
     * Create an instance of {@link CancellationReason21Choice }
     * 
     * @return
     *     the new instance of {@link CancellationReason21Choice }
     */
    public CancellationReason21Choice createCancellationReason21Choice() {
        return new CancellationReason21Choice();
    }

    /**
     * Create an instance of {@link CancellationStatus15Choice }
     * 
     * @return
     *     the new instance of {@link CancellationStatus15Choice }
     */
    public CancellationStatus15Choice createCancellationStatus15Choice() {
        return new CancellationStatus15Choice();
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
     * Create an instance of {@link DeniedReason10 }
     * 
     * @return
     *     the new instance of {@link DeniedReason10 }
     */
    public DeniedReason10 createDeniedReason10() {
        return new DeniedReason10();
    }

    /**
     * Create an instance of {@link DeniedReason15Choice }
     * 
     * @return
     *     the new instance of {@link DeniedReason15Choice }
     */
    public DeniedReason15Choice createDeniedReason15Choice() {
        return new DeniedReason15Choice();
    }

    /**
     * Create an instance of {@link DeniedStatus15Choice }
     * 
     * @return
     *     the new instance of {@link DeniedStatus15Choice }
     */
    public DeniedStatus15Choice createDeniedStatus15Choice() {
        return new DeniedStatus15Choice();
    }

    /**
     * Create an instance of {@link DocumentNumber5Choice }
     * 
     * @return
     *     the new instance of {@link DocumentNumber5Choice }
     */
    public DocumentNumber5Choice createDocumentNumber5Choice() {
        return new DocumentNumber5Choice();
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
     * Create an instance of {@link GenericDocumentIdentification4 }
     * 
     * @return
     *     the new instance of {@link GenericDocumentIdentification4 }
     */
    public GenericDocumentIdentification4 createGenericDocumentIdentification4() {
        return new GenericDocumentIdentification4();
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
     * Create an instance of {@link PartyIdentification134Choice }
     * 
     * @return
     *     the new instance of {@link PartyIdentification134Choice }
     */
    public PartyIdentification134Choice createPartyIdentification134Choice() {
        return new PartyIdentification134Choice();
    }

    /**
     * Create an instance of {@link PartyIdentification144 }
     * 
     * @return
     *     the new instance of {@link PartyIdentification144 }
     */
    public PartyIdentification144 createPartyIdentification144() {
        return new PartyIdentification144();
    }

    /**
     * Create an instance of {@link PartyIdentification148 }
     * 
     * @return
     *     the new instance of {@link PartyIdentification148 }
     */
    public PartyIdentification148 createPartyIdentification148() {
        return new PartyIdentification148();
    }

    /**
     * Create an instance of {@link PartyIdentification149 }
     * 
     * @return
     *     the new instance of {@link PartyIdentification149 }
     */
    public PartyIdentification149 createPartyIdentification149() {
        return new PartyIdentification149();
    }

    /**
     * Create an instance of {@link PartyIdentificationAndAccount195 }
     * 
     * @return
     *     the new instance of {@link PartyIdentificationAndAccount195 }
     */
    public PartyIdentificationAndAccount195 createPartyIdentificationAndAccount195() {
        return new PartyIdentificationAndAccount195();
    }

    /**
     * Create an instance of {@link PendingReason17 }
     * 
     * @return
     *     the new instance of {@link PendingReason17 }
     */
    public PendingReason17 createPendingReason17() {
        return new PendingReason17();
    }

    /**
     * Create an instance of {@link PendingReason30Choice }
     * 
     * @return
     *     the new instance of {@link PendingReason30Choice }
     */
    public PendingReason30Choice createPendingReason30Choice() {
        return new PendingReason30Choice();
    }

    /**
     * Create an instance of {@link PendingStatus39Choice }
     * 
     * @return
     *     the new instance of {@link PendingStatus39Choice }
     */
    public PendingStatus39Choice createPendingStatus39Choice() {
        return new PendingStatus39Choice();
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
     * Create an instance of {@link ProcessingStatus84Choice }
     * 
     * @return
     *     the new instance of {@link ProcessingStatus84Choice }
     */
    public ProcessingStatus84Choice createProcessingStatus84Choice() {
        return new ProcessingStatus84Choice();
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
     * Create an instance of {@link References44Choice }
     * 
     * @return
     *     the new instance of {@link References44Choice }
     */
    public References44Choice createReferences44Choice() {
        return new References44Choice();
    }

    /**
     * Create an instance of {@link RejectionAndRepairReason37Choice }
     * 
     * @return
     *     the new instance of {@link RejectionAndRepairReason37Choice }
     */
    public RejectionAndRepairReason37Choice createRejectionAndRepairReason37Choice() {
        return new RejectionAndRepairReason37Choice();
    }

    /**
     * Create an instance of {@link RejectionAndRepairReason38Choice }
     * 
     * @return
     *     the new instance of {@link RejectionAndRepairReason38Choice }
     */
    public RejectionAndRepairReason38Choice createRejectionAndRepairReason38Choice() {
        return new RejectionAndRepairReason38Choice();
    }

    /**
     * Create an instance of {@link RejectionOrRepairReason37 }
     * 
     * @return
     *     the new instance of {@link RejectionOrRepairReason37 }
     */
    public RejectionOrRepairReason37 createRejectionOrRepairReason37() {
        return new RejectionOrRepairReason37();
    }

    /**
     * Create an instance of {@link RejectionOrRepairReason38 }
     * 
     * @return
     *     the new instance of {@link RejectionOrRepairReason38 }
     */
    public RejectionOrRepairReason38 createRejectionOrRepairReason38() {
        return new RejectionOrRepairReason38();
    }

    /**
     * Create an instance of {@link RejectionOrRepairStatus42Choice }
     * 
     * @return
     *     the new instance of {@link RejectionOrRepairStatus42Choice }
     */
    public RejectionOrRepairStatus42Choice createRejectionOrRepairStatus42Choice() {
        return new RejectionOrRepairStatus42Choice();
    }

    /**
     * Create an instance of {@link RejectionOrRepairStatus43Choice }
     * 
     * @return
     *     the new instance of {@link RejectionOrRepairStatus43Choice }
     */
    public RejectionOrRepairStatus43Choice createRejectionOrRepairStatus43Choice() {
        return new RejectionOrRepairStatus43Choice();
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
     * Create an instance of {@link SecuritiesTransactionCancellationRequestStatusAdviceV07 }
     * 
     * @return
     *     the new instance of {@link SecuritiesTransactionCancellationRequestStatusAdviceV07 }
     */
    public SecuritiesTransactionCancellationRequestStatusAdviceV07 createSecuritiesTransactionCancellationRequestStatusAdviceV07() {
        return new SecuritiesTransactionCancellationRequestStatusAdviceV07();
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
     * Create an instance of {@link SettlementDate19Choice }
     * 
     * @return
     *     the new instance of {@link SettlementDate19Choice }
     */
    public SettlementDate19Choice createSettlementDate19Choice() {
        return new SettlementDate19Choice();
    }

    /**
     * Create an instance of {@link SettlementDateCode8Choice }
     * 
     * @return
     *     the new instance of {@link SettlementDateCode8Choice }
     */
    public SettlementDateCode8Choice createSettlementDateCode8Choice() {
        return new SettlementDateCode8Choice();
    }

    /**
     * Create an instance of {@link SettlementParties97 }
     * 
     * @return
     *     the new instance of {@link SettlementParties97 }
     */
    public SettlementParties97 createSettlementParties97() {
        return new SettlementParties97();
    }

    /**
     * Create an instance of {@link SettlementTypeAndIdentification18 }
     * 
     * @return
     *     the new instance of {@link SettlementTypeAndIdentification18 }
     */
    public SettlementTypeAndIdentification18 createSettlementTypeAndIdentification18() {
        return new SettlementTypeAndIdentification18();
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
     * Create an instance of {@link TradeDate8Choice }
     * 
     * @return
     *     the new instance of {@link TradeDate8Choice }
     */
    public TradeDate8Choice createTradeDate8Choice() {
        return new TradeDate8Choice();
    }

    /**
     * Create an instance of {@link TradeDateCode3Choice }
     * 
     * @return
     *     the new instance of {@link TradeDateCode3Choice }
     */
    public TradeDateCode3Choice createTradeDateCode3Choice() {
        return new TradeDateCode3Choice();
    }

    /**
     * Create an instance of {@link TransactionDetails152 }
     * 
     * @return
     *     the new instance of {@link TransactionDetails152 }
     */
    public TransactionDetails152 createTransactionDetails152() {
        return new TransactionDetails152();
    }

    /**
     * Create an instance of {@link TransactionIdentifications48 }
     * 
     * @return
     *     the new instance of {@link TransactionIdentifications48 }
     */
    public TransactionIdentifications48 createTransactionIdentifications48() {
        return new TransactionIdentifications48();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Document }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Document }{@code >}
     */
    @XmlElementDecl(namespace = "urn:iso:std:iso:20022:tech:xsd:sese.027.001.07", name = "Document")
    public JAXBElement<Document> createDocument(Document value) {
        return new JAXBElement<>(_Document_QNAME, Document.class, null, value);
    }

}
