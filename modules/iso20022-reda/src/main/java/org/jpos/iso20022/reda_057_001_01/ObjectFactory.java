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

package org.jpos.iso20022.reda_057_001_01;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.jpos.iso20022.reda_057_001_01 package. 
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

    private static final QName _Document_QNAME = new QName("urn:iso:std:iso:20022:tech:xsd:reda.057.001.01", "Document");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.jpos.iso20022.reda_057_001_01
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
     * Create an instance of {@link AccountIdentification26 }
     * 
     * @return
     *     the new instance of {@link AccountIdentification26 }
     */
    public AccountIdentification26 createAccountIdentification26() {
        return new AccountIdentification26();
    }

    /**
     * Create an instance of {@link ClassificationType1Choice }
     * 
     * @return
     *     the new instance of {@link ClassificationType1Choice }
     */
    public ClassificationType1Choice createClassificationType1Choice() {
        return new ClassificationType1Choice();
    }

    /**
     * Create an instance of {@link EffectiveDate1 }
     * 
     * @return
     *     the new instance of {@link EffectiveDate1 }
     */
    public EffectiveDate1 createEffectiveDate1() {
        return new EffectiveDate1();
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
     * Create an instance of {@link MarketIdentification87 }
     * 
     * @return
     *     the new instance of {@link MarketIdentification87 }
     */
    public MarketIdentification87 createMarketIdentification87() {
        return new MarketIdentification87();
    }

    /**
     * Create an instance of {@link MarketIdentificationOrCashPurpose1Choice }
     * 
     * @return
     *     the new instance of {@link MarketIdentificationOrCashPurpose1Choice }
     */
    public MarketIdentificationOrCashPurpose1Choice createMarketIdentificationOrCashPurpose1Choice() {
        return new MarketIdentificationOrCashPurpose1Choice();
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
     * Create an instance of {@link PartyIdentification63 }
     * 
     * @return
     *     the new instance of {@link PartyIdentification63 }
     */
    public PartyIdentification63 createPartyIdentification63() {
        return new PartyIdentification63();
    }

    /**
     * Create an instance of {@link PartyIdentification75Choice }
     * 
     * @return
     *     the new instance of {@link PartyIdentification75Choice }
     */
    public PartyIdentification75Choice createPartyIdentification75Choice() {
        return new PartyIdentification75Choice();
    }

    /**
     * Create an instance of {@link PartyOrCurrency1Choice }
     * 
     * @return
     *     the new instance of {@link PartyOrCurrency1Choice }
     */
    public PartyOrCurrency1Choice createPartyOrCurrency1Choice() {
        return new PartyOrCurrency1Choice();
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
     * Create an instance of {@link Purpose3Choice }
     * 
     * @return
     *     the new instance of {@link Purpose3Choice }
     */
    public Purpose3Choice createPurpose3Choice() {
        return new Purpose3Choice();
    }

    /**
     * Create an instance of {@link SimpleIdentificationInformation4 }
     * 
     * @return
     *     the new instance of {@link SimpleIdentificationInformation4 }
     */
    public SimpleIdentificationInformation4 createSimpleIdentificationInformation4() {
        return new SimpleIdentificationInformation4();
    }

    /**
     * Create an instance of {@link StandingSettlementInstructionDeletionV01 }
     * 
     * @return
     *     the new instance of {@link StandingSettlementInstructionDeletionV01 }
     */
    public StandingSettlementInstructionDeletionV01 createStandingSettlementInstructionDeletionV01() {
        return new StandingSettlementInstructionDeletionV01();
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
    @XmlElementDecl(namespace = "urn:iso:std:iso:20022:tech:xsd:reda.057.001.01", name = "Document")
    public JAXBElement<Document> createDocument(Document value) {
        return new JAXBElement<>(_Document_QNAME, Document.class, null, value);
    }

}
