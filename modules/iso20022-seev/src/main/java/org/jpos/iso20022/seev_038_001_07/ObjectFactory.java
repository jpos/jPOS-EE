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

package org.jpos.iso20022.seev_038_001_07;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.jpos.iso20022.seev_038_001_07 package. 
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

    private static final QName _Document_QNAME = new QName("urn:iso:std:iso:20022:tech:xsd:seev.038.001.07", "Document");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.jpos.iso20022.seev_038_001_07
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
     * Create an instance of {@link AccountIdentification48Choice }
     * 
     * @return
     *     the new instance of {@link AccountIdentification48Choice }
     */
    public AccountIdentification48Choice createAccountIdentification48Choice() {
        return new AccountIdentification48Choice();
    }

    /**
     * Create an instance of {@link AccountIdentification59 }
     * 
     * @return
     *     the new instance of {@link AccountIdentification59 }
     */
    public AccountIdentification59 createAccountIdentification59() {
        return new AccountIdentification59();
    }

    /**
     * Create an instance of {@link BalanceFormat11Choice }
     * 
     * @return
     *     the new instance of {@link BalanceFormat11Choice }
     */
    public BalanceFormat11Choice createBalanceFormat11Choice() {
        return new BalanceFormat11Choice();
    }

    /**
     * Create an instance of {@link CorporateActionGeneralInformation92 }
     * 
     * @return
     *     the new instance of {@link CorporateActionGeneralInformation92 }
     */
    public CorporateActionGeneralInformation92 createCorporateActionGeneralInformation92() {
        return new CorporateActionGeneralInformation92();
    }

    /**
     * Create an instance of {@link CorporateActionNarrative3Choice }
     * 
     * @return
     *     the new instance of {@link CorporateActionNarrative3Choice }
     */
    public CorporateActionNarrative3Choice createCorporateActionNarrative3Choice() {
        return new CorporateActionNarrative3Choice();
    }

    /**
     * Create an instance of {@link CorporateActionNarrativeV07 }
     * 
     * @return
     *     the new instance of {@link CorporateActionNarrativeV07 }
     */
    public CorporateActionNarrativeV07 createCorporateActionNarrativeV07() {
        return new CorporateActionNarrativeV07();
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
     * Create an instance of {@link OtherIdentification1 }
     * 
     * @return
     *     the new instance of {@link OtherIdentification1 }
     */
    public OtherIdentification1 createOtherIdentification1() {
        return new OtherIdentification1();
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
     * Create an instance of {@link ProprietaryQuantity8 }
     * 
     * @return
     *     the new instance of {@link ProprietaryQuantity8 }
     */
    public ProprietaryQuantity8 createProprietaryQuantity8() {
        return new ProprietaryQuantity8();
    }

    /**
     * Create an instance of {@link Quantity48Choice }
     * 
     * @return
     *     the new instance of {@link Quantity48Choice }
     */
    public Quantity48Choice createQuantity48Choice() {
        return new Quantity48Choice();
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
     * Create an instance of {@link SecurityIdentification19 }
     * 
     * @return
     *     the new instance of {@link SecurityIdentification19 }
     */
    public SecurityIdentification19 createSecurityIdentification19() {
        return new SecurityIdentification19();
    }

    /**
     * Create an instance of {@link SignedQuantityFormat10 }
     * 
     * @return
     *     the new instance of {@link SignedQuantityFormat10 }
     */
    public SignedQuantityFormat10 createSignedQuantityFormat10() {
        return new SignedQuantityFormat10();
    }

    /**
     * Create an instance of {@link SignedQuantityFormat11 }
     * 
     * @return
     *     the new instance of {@link SignedQuantityFormat11 }
     */
    public SignedQuantityFormat11 createSignedQuantityFormat11() {
        return new SignedQuantityFormat11();
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
     * Create an instance of {@link UpdatedAdditionalInformation8 }
     * 
     * @return
     *     the new instance of {@link UpdatedAdditionalInformation8 }
     */
    public UpdatedAdditionalInformation8 createUpdatedAdditionalInformation8() {
        return new UpdatedAdditionalInformation8();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Document }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Document }{@code >}
     */
    @XmlElementDecl(namespace = "urn:iso:std:iso:20022:tech:xsd:seev.038.001.07", name = "Document")
    public JAXBElement<Document> createDocument(Document value) {
        return new JAXBElement<>(_Document_QNAME, Document.class, null, value);
    }

}
