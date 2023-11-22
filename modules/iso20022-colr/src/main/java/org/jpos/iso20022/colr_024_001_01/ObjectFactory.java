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

package org.jpos.iso20022.colr_024_001_01;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.jpos.iso20022.colr_024_001_01 package. 
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

    private static final QName _Document_QNAME = new QName("urn:iso:std:iso:20022:tech:xsd:colr.024.001.01", "Document");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.jpos.iso20022.colr_024_001_01
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
     * Create an instance of {@link DateAndDateTime2Choice }
     * 
     * @return
     *     the new instance of {@link DateAndDateTime2Choice }
     */
    public DateAndDateTime2Choice createDateAndDateTime2Choice() {
        return new DateAndDateTime2Choice();
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
     * Create an instance of {@link ForeignExchangeTerms23 }
     * 
     * @return
     *     the new instance of {@link ForeignExchangeTerms23 }
     */
    public ForeignExchangeTerms23 createForeignExchangeTerms23() {
        return new ForeignExchangeTerms23();
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
     * Create an instance of {@link IdentificationType42Choice }
     * 
     * @return
     *     the new instance of {@link IdentificationType42Choice }
     */
    public IdentificationType42Choice createIdentificationType42Choice() {
        return new IdentificationType42Choice();
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
     * Create an instance of {@link PostalAddress1 }
     * 
     * @return
     *     the new instance of {@link PostalAddress1 }
     */
    public PostalAddress1 createPostalAddress1() {
        return new PostalAddress1();
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
     * Create an instance of {@link TransactionIdentifications44 }
     * 
     * @return
     *     the new instance of {@link TransactionIdentifications44 }
     */
    public TransactionIdentifications44 createTransactionIdentifications44() {
        return new TransactionIdentifications44();
    }

    /**
     * Create an instance of {@link TripartyCollateralAllegementNotificationCancellationAdviceV01 }
     * 
     * @return
     *     the new instance of {@link TripartyCollateralAllegementNotificationCancellationAdviceV01 }
     */
    public TripartyCollateralAllegementNotificationCancellationAdviceV01 createTripartyCollateralAllegementNotificationCancellationAdviceV01() {
        return new TripartyCollateralAllegementNotificationCancellationAdviceV01();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Document }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Document }{@code >}
     */
    @XmlElementDecl(namespace = "urn:iso:std:iso:20022:tech:xsd:colr.024.001.01", name = "Document")
    public JAXBElement<Document> createDocument(Document value) {
        return new JAXBElement<>(_Document_QNAME, Document.class, null, value);
    }

}
