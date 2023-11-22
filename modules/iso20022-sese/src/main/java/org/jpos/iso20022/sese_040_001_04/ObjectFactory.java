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

package org.jpos.iso20022.sese_040_001_04;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.jpos.iso20022.sese_040_001_04 package. 
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

    private static final QName _Document_QNAME = new QName("urn:iso:std:iso:20022:tech:xsd:sese.040.001.04", "Document");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.jpos.iso20022.sese_040_001_04
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
     * Create an instance of {@link ConsentOrRejectionReason4Choice }
     * 
     * @return
     *     the new instance of {@link ConsentOrRejectionReason4Choice }
     */
    public ConsentOrRejectionReason4Choice createConsentOrRejectionReason4Choice() {
        return new ConsentOrRejectionReason4Choice();
    }

    /**
     * Create an instance of {@link ConsentReason4 }
     * 
     * @return
     *     the new instance of {@link ConsentReason4 }
     */
    public ConsentReason4 createConsentReason4() {
        return new ConsentReason4();
    }

    /**
     * Create an instance of {@link ConsentStatus4Choice }
     * 
     * @return
     *     the new instance of {@link ConsentStatus4Choice }
     */
    public ConsentStatus4Choice createConsentStatus4Choice() {
        return new ConsentStatus4Choice();
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
     * Create an instance of {@link NameAndAddress5 }
     * 
     * @return
     *     the new instance of {@link NameAndAddress5 }
     */
    public NameAndAddress5 createNameAndAddress5() {
        return new NameAndAddress5();
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
     * Create an instance of {@link PartyIdentification134Choice }
     * 
     * @return
     *     the new instance of {@link PartyIdentification134Choice }
     */
    public PartyIdentification134Choice createPartyIdentification134Choice() {
        return new PartyIdentification134Choice();
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
     * Create an instance of {@link PendingStatus20Choice }
     * 
     * @return
     *     the new instance of {@link PendingStatus20Choice }
     */
    public PendingStatus20Choice createPendingStatus20Choice() {
        return new PendingStatus20Choice();
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
     * Create an instance of {@link Quantity51Choice }
     * 
     * @return
     *     the new instance of {@link Quantity51Choice }
     */
    public Quantity51Choice createQuantity51Choice() {
        return new Quantity51Choice();
    }

    /**
     * Create an instance of {@link RejectionReason29 }
     * 
     * @return
     *     the new instance of {@link RejectionReason29 }
     */
    public RejectionReason29 createRejectionReason29() {
        return new RejectionReason29();
    }

    /**
     * Create an instance of {@link RejectionStatus20Choice }
     * 
     * @return
     *     the new instance of {@link RejectionStatus20Choice }
     */
    public RejectionStatus20Choice createRejectionStatus20Choice() {
        return new RejectionStatus20Choice();
    }

    /**
     * Create an instance of {@link ResponseStatus6Choice }
     * 
     * @return
     *     the new instance of {@link ResponseStatus6Choice }
     */
    public ResponseStatus6Choice createResponseStatus6Choice() {
        return new ResponseStatus6Choice();
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
     * Create an instance of {@link SecuritiesSettlementTransactionCounterpartyResponseV04 }
     * 
     * @return
     *     the new instance of {@link SecuritiesSettlementTransactionCounterpartyResponseV04 }
     */
    public SecuritiesSettlementTransactionCounterpartyResponseV04 createSecuritiesSettlementTransactionCounterpartyResponseV04() {
        return new SecuritiesSettlementTransactionCounterpartyResponseV04();
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
     * Create an instance of {@link TransactionDetails149 }
     * 
     * @return
     *     the new instance of {@link TransactionDetails149 }
     */
    public TransactionDetails149 createTransactionDetails149() {
        return new TransactionDetails149();
    }

    /**
     * Create an instance of {@link TransactionIdentification6 }
     * 
     * @return
     *     the new instance of {@link TransactionIdentification6 }
     */
    public TransactionIdentification6 createTransactionIdentification6() {
        return new TransactionIdentification6();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Document }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Document }{@code >}
     */
    @XmlElementDecl(namespace = "urn:iso:std:iso:20022:tech:xsd:sese.040.001.04", name = "Document")
    public JAXBElement<Document> createDocument(Document value) {
        return new JAXBElement<>(_Document_QNAME, Document.class, null, value);
    }

}
