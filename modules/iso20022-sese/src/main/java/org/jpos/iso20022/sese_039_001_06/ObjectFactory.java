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

package org.jpos.iso20022.sese_039_001_06;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.jpos.iso20022.sese_039_001_06 package. 
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

    private static final QName _Document_QNAME = new QName("urn:iso:std:iso:20022:tech:xsd:sese.039.001.06", "Document");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.jpos.iso20022.sese_039_001_06
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
     * Create an instance of {@link AcknowledgedAcceptedStatus23Choice }
     * 
     * @return
     *     the new instance of {@link AcknowledgedAcceptedStatus23Choice }
     */
    public AcknowledgedAcceptedStatus23Choice createAcknowledgedAcceptedStatus23Choice() {
        return new AcknowledgedAcceptedStatus23Choice();
    }

    /**
     * Create an instance of {@link AcknowledgementReason11 }
     * 
     * @return
     *     the new instance of {@link AcknowledgementReason11 }
     */
    public AcknowledgementReason11 createAcknowledgementReason11() {
        return new AcknowledgementReason11();
    }

    /**
     * Create an instance of {@link AcknowledgementReason14Choice }
     * 
     * @return
     *     the new instance of {@link AcknowledgementReason14Choice }
     */
    public AcknowledgementReason14Choice createAcknowledgementReason14Choice() {
        return new AcknowledgementReason14Choice();
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
     * Create an instance of {@link FinancialInstrumentQuantity33Choice }
     * 
     * @return
     *     the new instance of {@link FinancialInstrumentQuantity33Choice }
     */
    public FinancialInstrumentQuantity33Choice createFinancialInstrumentQuantity33Choice() {
        return new FinancialInstrumentQuantity33Choice();
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
     * Create an instance of {@link ModificationProcessingStatus10Choice }
     * 
     * @return
     *     the new instance of {@link ModificationProcessingStatus10Choice }
     */
    public ModificationProcessingStatus10Choice createModificationProcessingStatus10Choice() {
        return new ModificationProcessingStatus10Choice();
    }

    /**
     * Create an instance of {@link ModificationReason4 }
     * 
     * @return
     *     the new instance of {@link ModificationReason4 }
     */
    public ModificationReason4 createModificationReason4() {
        return new ModificationReason4();
    }

    /**
     * Create an instance of {@link ModificationReason4Choice }
     * 
     * @return
     *     the new instance of {@link ModificationReason4Choice }
     */
    public ModificationReason4Choice createModificationReason4Choice() {
        return new ModificationReason4Choice();
    }

    /**
     * Create an instance of {@link ModificationStatus4Choice }
     * 
     * @return
     *     the new instance of {@link ModificationStatus4Choice }
     */
    public ModificationStatus4Choice createModificationStatus4Choice() {
        return new ModificationStatus4Choice();
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
     * Create an instance of {@link PendingProcessingReason10 }
     * 
     * @return
     *     the new instance of {@link PendingProcessingReason10 }
     */
    public PendingProcessingReason10 createPendingProcessingReason10() {
        return new PendingProcessingReason10();
    }

    /**
     * Create an instance of {@link PendingProcessingReason12Choice }
     * 
     * @return
     *     the new instance of {@link PendingProcessingReason12Choice }
     */
    public PendingProcessingReason12Choice createPendingProcessingReason12Choice() {
        return new PendingProcessingReason12Choice();
    }

    /**
     * Create an instance of {@link PendingProcessingStatus13Choice }
     * 
     * @return
     *     the new instance of {@link PendingProcessingStatus13Choice }
     */
    public PendingProcessingStatus13Choice createPendingProcessingStatus13Choice() {
        return new PendingProcessingStatus13Choice();
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
     * Create an instance of {@link RejectionReason42Choice }
     * 
     * @return
     *     the new instance of {@link RejectionReason42Choice }
     */
    public RejectionReason42Choice createRejectionReason42Choice() {
        return new RejectionReason42Choice();
    }

    /**
     * Create an instance of {@link RejectionReason57 }
     * 
     * @return
     *     the new instance of {@link RejectionReason57 }
     */
    public RejectionReason57 createRejectionReason57() {
        return new RejectionReason57();
    }

    /**
     * Create an instance of {@link RejectionStatus37Choice }
     * 
     * @return
     *     the new instance of {@link RejectionStatus37Choice }
     */
    public RejectionStatus37Choice createRejectionStatus37Choice() {
        return new RejectionStatus37Choice();
    }

    /**
     * Create an instance of {@link RepairReason10Choice }
     * 
     * @return
     *     the new instance of {@link RepairReason10Choice }
     */
    public RepairReason10Choice createRepairReason10Choice() {
        return new RepairReason10Choice();
    }

    /**
     * Create an instance of {@link RepairReason9 }
     * 
     * @return
     *     the new instance of {@link RepairReason9 }
     */
    public RepairReason9 createRepairReason9() {
        return new RepairReason9();
    }

    /**
     * Create an instance of {@link RepairStatus13Choice }
     * 
     * @return
     *     the new instance of {@link RepairStatus13Choice }
     */
    public RepairStatus13Choice createRepairStatus13Choice() {
        return new RepairStatus13Choice();
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
     * Create an instance of {@link SecuritiesSettlementTransactionModificationRequestStatusAdviceV06 }
     * 
     * @return
     *     the new instance of {@link SecuritiesSettlementTransactionModificationRequestStatusAdviceV06 }
     */
    public SecuritiesSettlementTransactionModificationRequestStatusAdviceV06 createSecuritiesSettlementTransactionModificationRequestStatusAdviceV06() {
        return new SecuritiesSettlementTransactionModificationRequestStatusAdviceV06();
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
     * Create an instance of {@link TransactionDetails155 }
     * 
     * @return
     *     the new instance of {@link TransactionDetails155 }
     */
    public TransactionDetails155 createTransactionDetails155() {
        return new TransactionDetails155();
    }

    /**
     * Create an instance of {@link TransactionIdentifications33 }
     * 
     * @return
     *     the new instance of {@link TransactionIdentifications33 }
     */
    public TransactionIdentifications33 createTransactionIdentifications33() {
        return new TransactionIdentifications33();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Document }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Document }{@code >}
     */
    @XmlElementDecl(namespace = "urn:iso:std:iso:20022:tech:xsd:sese.039.001.06", name = "Document")
    public JAXBElement<Document> createDocument(Document value) {
        return new JAXBElement<>(_Document_QNAME, Document.class, null, value);
    }

}
