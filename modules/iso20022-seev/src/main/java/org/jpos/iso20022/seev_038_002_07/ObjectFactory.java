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

package org.jpos.iso20022.seev_038_002_07;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.jpos.iso20022.seev_038_002_07 package. 
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

    private static final QName _Document_QNAME = new QName("urn:iso:std:iso:20022:tech:xsd:seev.038.002.07", "Document");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.jpos.iso20022.seev_038_002_07
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
     * Create an instance of {@link AccountIdentification10 }
     * 
     * @return
     *     the new instance of {@link AccountIdentification10 }
     */
    public AccountIdentification10 createAccountIdentification10() {
        return new AccountIdentification10();
    }

    /**
     * Create an instance of {@link AccountIdentification53Choice }
     * 
     * @return
     *     the new instance of {@link AccountIdentification53Choice }
     */
    public AccountIdentification53Choice createAccountIdentification53Choice() {
        return new AccountIdentification53Choice();
    }

    /**
     * Create an instance of {@link AccountIdentification65 }
     * 
     * @return
     *     the new instance of {@link AccountIdentification65 }
     */
    public AccountIdentification65 createAccountIdentification65() {
        return new AccountIdentification65();
    }

    /**
     * Create an instance of {@link BalanceFormat14Choice }
     * 
     * @return
     *     the new instance of {@link BalanceFormat14Choice }
     */
    public BalanceFormat14Choice createBalanceFormat14Choice() {
        return new BalanceFormat14Choice();
    }

    /**
     * Create an instance of {@link CorporateActionGeneralInformation102 }
     * 
     * @return
     *     the new instance of {@link CorporateActionGeneralInformation102 }
     */
    public CorporateActionGeneralInformation102 createCorporateActionGeneralInformation102() {
        return new CorporateActionGeneralInformation102();
    }

    /**
     * Create an instance of {@link CorporateActionNarrative002V07 }
     * 
     * @return
     *     the new instance of {@link CorporateActionNarrative002V07 }
     */
    public CorporateActionNarrative002V07 createCorporateActionNarrative002V07() {
        return new CorporateActionNarrative002V07();
    }

    /**
     * Create an instance of {@link CorporateActionNarrative4Choice }
     * 
     * @return
     *     the new instance of {@link CorporateActionNarrative4Choice }
     */
    public CorporateActionNarrative4Choice createCorporateActionNarrative4Choice() {
        return new CorporateActionNarrative4Choice();
    }

    /**
     * Create an instance of {@link FinancialInstrumentQuantity36Choice }
     * 
     * @return
     *     the new instance of {@link FinancialInstrumentQuantity36Choice }
     */
    public FinancialInstrumentQuantity36Choice createFinancialInstrumentQuantity36Choice() {
        return new FinancialInstrumentQuantity36Choice();
    }

    /**
     * Create an instance of {@link GenericIdentification47 }
     * 
     * @return
     *     the new instance of {@link GenericIdentification47 }
     */
    public GenericIdentification47 createGenericIdentification47() {
        return new GenericIdentification47();
    }

    /**
     * Create an instance of {@link GenericIdentification84 }
     * 
     * @return
     *     the new instance of {@link GenericIdentification84 }
     */
    public GenericIdentification84 createGenericIdentification84() {
        return new GenericIdentification84();
    }

    /**
     * Create an instance of {@link GenericIdentification85 }
     * 
     * @return
     *     the new instance of {@link GenericIdentification85 }
     */
    public GenericIdentification85 createGenericIdentification85() {
        return new GenericIdentification85();
    }

    /**
     * Create an instance of {@link IdentificationSource4Choice }
     * 
     * @return
     *     the new instance of {@link IdentificationSource4Choice }
     */
    public IdentificationSource4Choice createIdentificationSource4Choice() {
        return new IdentificationSource4Choice();
    }

    /**
     * Create an instance of {@link OtherIdentification2 }
     * 
     * @return
     *     the new instance of {@link OtherIdentification2 }
     */
    public OtherIdentification2 createOtherIdentification2() {
        return new OtherIdentification2();
    }

    /**
     * Create an instance of {@link PartyIdentification136Choice }
     * 
     * @return
     *     the new instance of {@link PartyIdentification136Choice }
     */
    public PartyIdentification136Choice createPartyIdentification136Choice() {
        return new PartyIdentification136Choice();
    }

    /**
     * Create an instance of {@link ProprietaryQuantity9 }
     * 
     * @return
     *     the new instance of {@link ProprietaryQuantity9 }
     */
    public ProprietaryQuantity9 createProprietaryQuantity9() {
        return new ProprietaryQuantity9();
    }

    /**
     * Create an instance of {@link Quantity53Choice }
     * 
     * @return
     *     the new instance of {@link Quantity53Choice }
     */
    public Quantity53Choice createQuantity53Choice() {
        return new Quantity53Choice();
    }

    /**
     * Create an instance of {@link SafekeepingPlaceFormat32Choice }
     * 
     * @return
     *     the new instance of {@link SafekeepingPlaceFormat32Choice }
     */
    public SafekeepingPlaceFormat32Choice createSafekeepingPlaceFormat32Choice() {
        return new SafekeepingPlaceFormat32Choice();
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
     * Create an instance of {@link SafekeepingPlaceTypeAndText9 }
     * 
     * @return
     *     the new instance of {@link SafekeepingPlaceTypeAndText9 }
     */
    public SafekeepingPlaceTypeAndText9 createSafekeepingPlaceTypeAndText9() {
        return new SafekeepingPlaceTypeAndText9();
    }

    /**
     * Create an instance of {@link SecurityIdentification20 }
     * 
     * @return
     *     the new instance of {@link SecurityIdentification20 }
     */
    public SecurityIdentification20 createSecurityIdentification20() {
        return new SecurityIdentification20();
    }

    /**
     * Create an instance of {@link SignedQuantityFormat12 }
     * 
     * @return
     *     the new instance of {@link SignedQuantityFormat12 }
     */
    public SignedQuantityFormat12 createSignedQuantityFormat12() {
        return new SignedQuantityFormat12();
    }

    /**
     * Create an instance of {@link SignedQuantityFormat13 }
     * 
     * @return
     *     the new instance of {@link SignedQuantityFormat13 }
     */
    public SignedQuantityFormat13 createSignedQuantityFormat13() {
        return new SignedQuantityFormat13();
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
     * Create an instance of {@link UpdatedAdditionalInformation10 }
     * 
     * @return
     *     the new instance of {@link UpdatedAdditionalInformation10 }
     */
    public UpdatedAdditionalInformation10 createUpdatedAdditionalInformation10() {
        return new UpdatedAdditionalInformation10();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Document }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Document }{@code >}
     */
    @XmlElementDecl(namespace = "urn:iso:std:iso:20022:tech:xsd:seev.038.002.07", name = "Document")
    public JAXBElement<Document> createDocument(Document value) {
        return new JAXBElement<>(_Document_QNAME, Document.class, null, value);
    }

}
