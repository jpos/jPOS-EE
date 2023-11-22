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

package org.jpos.iso20022.pacs_029_001_01;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.jpos.iso20022.pacs_029_001_01 package. 
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

    private static final QName _Document_QNAME = new QName("urn:iso:std:iso:20022:tech:xsd:pacs.029.001.01", "Document");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.jpos.iso20022.pacs_029_001_01
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
     * Create an instance of {@link AddressType3Choice }
     * 
     * @return
     *     the new instance of {@link AddressType3Choice }
     */
    public AddressType3Choice createAddressType3Choice() {
        return new AddressType3Choice();
    }

    /**
     * Create an instance of {@link AmountAndDirection5 }
     * 
     * @return
     *     the new instance of {@link AmountAndDirection5 }
     */
    public AmountAndDirection5 createAmountAndDirection5() {
        return new AmountAndDirection5();
    }

    /**
     * Create an instance of {@link CashAccount40 }
     * 
     * @return
     *     the new instance of {@link CashAccount40 }
     */
    public CashAccount40 createCashAccount40() {
        return new CashAccount40();
    }

    /**
     * Create an instance of {@link CashAccountType2Choice }
     * 
     * @return
     *     the new instance of {@link CashAccountType2Choice }
     */
    public CashAccountType2Choice createCashAccountType2Choice() {
        return new CashAccountType2Choice();
    }

    /**
     * Create an instance of {@link ClearingSystemIdentification3Choice }
     * 
     * @return
     *     the new instance of {@link ClearingSystemIdentification3Choice }
     */
    public ClearingSystemIdentification3Choice createClearingSystemIdentification3Choice() {
        return new ClearingSystemIdentification3Choice();
    }

    /**
     * Create an instance of {@link Contact4 }
     * 
     * @return
     *     the new instance of {@link Contact4 }
     */
    public Contact4 createContact4() {
        return new Contact4();
    }

    /**
     * Create an instance of {@link DateAndPlaceOfBirth1 }
     * 
     * @return
     *     the new instance of {@link DateAndPlaceOfBirth1 }
     */
    public DateAndPlaceOfBirth1 createDateAndPlaceOfBirth1() {
        return new DateAndPlaceOfBirth1();
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
     * Create an instance of {@link GenericOrganisationIdentification1 }
     * 
     * @return
     *     the new instance of {@link GenericOrganisationIdentification1 }
     */
    public GenericOrganisationIdentification1 createGenericOrganisationIdentification1() {
        return new GenericOrganisationIdentification1();
    }

    /**
     * Create an instance of {@link GenericPersonIdentification1 }
     * 
     * @return
     *     the new instance of {@link GenericPersonIdentification1 }
     */
    public GenericPersonIdentification1 createGenericPersonIdentification1() {
        return new GenericPersonIdentification1();
    }

    /**
     * Create an instance of {@link GroupHeader104 }
     * 
     * @return
     *     the new instance of {@link GroupHeader104 }
     */
    public GroupHeader104 createGroupHeader104() {
        return new GroupHeader104();
    }

    /**
     * Create an instance of {@link MovementRecord1 }
     * 
     * @return
     *     the new instance of {@link MovementRecord1 }
     */
    public MovementRecord1 createMovementRecord1() {
        return new MovementRecord1();
    }

    /**
     * Create an instance of {@link MultilateralSettlementRequest2 }
     * 
     * @return
     *     the new instance of {@link MultilateralSettlementRequest2 }
     */
    public MultilateralSettlementRequest2 createMultilateralSettlementRequest2() {
        return new MultilateralSettlementRequest2();
    }

    /**
     * Create an instance of {@link MultilateralSettlementRequestV01 }
     * 
     * @return
     *     the new instance of {@link MultilateralSettlementRequestV01 }
     */
    public MultilateralSettlementRequestV01 createMultilateralSettlementRequestV01() {
        return new MultilateralSettlementRequestV01();
    }

    /**
     * Create an instance of {@link OrganisationIdentification29 }
     * 
     * @return
     *     the new instance of {@link OrganisationIdentification29 }
     */
    public OrganisationIdentification29 createOrganisationIdentification29() {
        return new OrganisationIdentification29();
    }

    /**
     * Create an instance of {@link OrganisationIdentificationSchemeName1Choice }
     * 
     * @return
     *     the new instance of {@link OrganisationIdentificationSchemeName1Choice }
     */
    public OrganisationIdentificationSchemeName1Choice createOrganisationIdentificationSchemeName1Choice() {
        return new OrganisationIdentificationSchemeName1Choice();
    }

    /**
     * Create an instance of {@link OtherContact1 }
     * 
     * @return
     *     the new instance of {@link OtherContact1 }
     */
    public OtherContact1 createOtherContact1() {
        return new OtherContact1();
    }

    /**
     * Create an instance of {@link Party38Choice }
     * 
     * @return
     *     the new instance of {@link Party38Choice }
     */
    public Party38Choice createParty38Choice() {
        return new Party38Choice();
    }

    /**
     * Create an instance of {@link PartyIdentification135 }
     * 
     * @return
     *     the new instance of {@link PartyIdentification135 }
     */
    public PartyIdentification135 createPartyIdentification135() {
        return new PartyIdentification135();
    }

    /**
     * Create an instance of {@link PersonIdentification13 }
     * 
     * @return
     *     the new instance of {@link PersonIdentification13 }
     */
    public PersonIdentification13 createPersonIdentification13() {
        return new PersonIdentification13();
    }

    /**
     * Create an instance of {@link PersonIdentificationSchemeName1Choice }
     * 
     * @return
     *     the new instance of {@link PersonIdentificationSchemeName1Choice }
     */
    public PersonIdentificationSchemeName1Choice createPersonIdentificationSchemeName1Choice() {
        return new PersonIdentificationSchemeName1Choice();
    }

    /**
     * Create an instance of {@link PostalAddress24 }
     * 
     * @return
     *     the new instance of {@link PostalAddress24 }
     */
    public PostalAddress24 createPostalAddress24() {
        return new PostalAddress24();
    }

    /**
     * Create an instance of {@link ProxyAccountIdentification1 }
     * 
     * @return
     *     the new instance of {@link ProxyAccountIdentification1 }
     */
    public ProxyAccountIdentification1 createProxyAccountIdentification1() {
        return new ProxyAccountIdentification1();
    }

    /**
     * Create an instance of {@link ProxyAccountType1Choice }
     * 
     * @return
     *     the new instance of {@link ProxyAccountType1Choice }
     */
    public ProxyAccountType1Choice createProxyAccountType1Choice() {
        return new ProxyAccountType1Choice();
    }

    /**
     * Create an instance of {@link SettlementInstruction14 }
     * 
     * @return
     *     the new instance of {@link SettlementInstruction14 }
     */
    public SettlementInstruction14 createSettlementInstruction14() {
        return new SettlementInstruction14();
    }

    /**
     * Create an instance of {@link SettlementTimeRequest2 }
     * 
     * @return
     *     the new instance of {@link SettlementTimeRequest2 }
     */
    public SettlementTimeRequest2 createSettlementTimeRequest2() {
        return new SettlementTimeRequest2();
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
    @XmlElementDecl(namespace = "urn:iso:std:iso:20022:tech:xsd:pacs.029.001.01", name = "Document")
    public JAXBElement<Document> createDocument(Document value) {
        return new JAXBElement<>(_Document_QNAME, Document.class, null, value);
    }

}
