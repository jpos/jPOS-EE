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

package org.jpos.iso20022.seev_012_001_01;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.jpos.iso20022.seev_012_001_01 package. 
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

    private static final QName _Document_QNAME = new QName("urn:iso:std:iso:20022:tech:xsd:seev.012.001.01", "Document");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.jpos.iso20022.seev_012_001_01
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
     * Create an instance of {@link AccountIdentification2Choice }
     * 
     * @return
     *     the new instance of {@link AccountIdentification2Choice }
     */
    public AccountIdentification2Choice createAccountIdentification2Choice() {
        return new AccountIdentification2Choice();
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
     * Create an instance of {@link AgentCAElectionAdviceV01 }
     * 
     * @return
     *     the new instance of {@link AgentCAElectionAdviceV01 }
     */
    public AgentCAElectionAdviceV01 createAgentCAElectionAdviceV01() {
        return new AgentCAElectionAdviceV01();
    }

    /**
     * Create an instance of {@link AlternateSecurityIdentification3 }
     * 
     * @return
     *     the new instance of {@link AlternateSecurityIdentification3 }
     */
    public AlternateSecurityIdentification3 createAlternateSecurityIdentification3() {
        return new AlternateSecurityIdentification3();
    }

    /**
     * Create an instance of {@link BeneficialOwner1 }
     * 
     * @return
     *     the new instance of {@link BeneficialOwner1 }
     */
    public BeneficialOwner1 createBeneficialOwner1() {
        return new BeneficialOwner1();
    }

    /**
     * Create an instance of {@link BeneficiaryCertificationType1FormatChoice }
     * 
     * @return
     *     the new instance of {@link BeneficiaryCertificationType1FormatChoice }
     */
    public BeneficiaryCertificationType1FormatChoice createBeneficiaryCertificationType1FormatChoice() {
        return new BeneficiaryCertificationType1FormatChoice();
    }

    /**
     * Create an instance of {@link CashAccount19 }
     * 
     * @return
     *     the new instance of {@link CashAccount19 }
     */
    public CashAccount19 createCashAccount19() {
        return new CashAccount19();
    }

    /**
     * Create an instance of {@link CashAccountIdentification1Choice }
     * 
     * @return
     *     the new instance of {@link CashAccountIdentification1Choice }
     */
    public CashAccountIdentification1Choice createCashAccountIdentification1Choice() {
        return new CashAccountIdentification1Choice();
    }

    /**
     * Create an instance of {@link ContactIdentification4 }
     * 
     * @return
     *     the new instance of {@link ContactIdentification4 }
     */
    public ContactIdentification4 createContactIdentification4() {
        return new ContactIdentification4();
    }

    /**
     * Create an instance of {@link ContactPerson1 }
     * 
     * @return
     *     the new instance of {@link ContactPerson1 }
     */
    public ContactPerson1 createContactPerson1() {
        return new ContactPerson1();
    }

    /**
     * Create an instance of {@link CorporateActionAdditionalInformation1 }
     * 
     * @return
     *     the new instance of {@link CorporateActionAdditionalInformation1 }
     */
    public CorporateActionAdditionalInformation1 createCorporateActionAdditionalInformation1() {
        return new CorporateActionAdditionalInformation1();
    }

    /**
     * Create an instance of {@link CorporateActionCashMovements2 }
     * 
     * @return
     *     the new instance of {@link CorporateActionCashMovements2 }
     */
    public CorporateActionCashMovements2 createCorporateActionCashMovements2() {
        return new CorporateActionCashMovements2();
    }

    /**
     * Create an instance of {@link CorporateActionElection3 }
     * 
     * @return
     *     the new instance of {@link CorporateActionElection3 }
     */
    public CorporateActionElection3 createCorporateActionElection3() {
        return new CorporateActionElection3();
    }

    /**
     * Create an instance of {@link CorporateActionEventProcessingType1FormatChoice }
     * 
     * @return
     *     the new instance of {@link CorporateActionEventProcessingType1FormatChoice }
     */
    public CorporateActionEventProcessingType1FormatChoice createCorporateActionEventProcessingType1FormatChoice() {
        return new CorporateActionEventProcessingType1FormatChoice();
    }

    /**
     * Create an instance of {@link CorporateActionEventType2FormatChoice }
     * 
     * @return
     *     the new instance of {@link CorporateActionEventType2FormatChoice }
     */
    public CorporateActionEventType2FormatChoice createCorporateActionEventType2FormatChoice() {
        return new CorporateActionEventType2FormatChoice();
    }

    /**
     * Create an instance of {@link CorporateActionInformation1 }
     * 
     * @return
     *     the new instance of {@link CorporateActionInformation1 }
     */
    public CorporateActionInformation1 createCorporateActionInformation1() {
        return new CorporateActionInformation1();
    }

    /**
     * Create an instance of {@link CorporateActionMandatoryVoluntary1FormatChoice }
     * 
     * @return
     *     the new instance of {@link CorporateActionMandatoryVoluntary1FormatChoice }
     */
    public CorporateActionMandatoryVoluntary1FormatChoice createCorporateActionMandatoryVoluntary1FormatChoice() {
        return new CorporateActionMandatoryVoluntary1FormatChoice();
    }

    /**
     * Create an instance of {@link CorporateActionOption1FormatChoice }
     * 
     * @return
     *     the new instance of {@link CorporateActionOption1FormatChoice }
     */
    public CorporateActionOption1FormatChoice createCorporateActionOption1FormatChoice() {
        return new CorporateActionOption1FormatChoice();
    }

    /**
     * Create an instance of {@link CorporateActionSecuritiesMovement2 }
     * 
     * @return
     *     the new instance of {@link CorporateActionSecuritiesMovement2 }
     */
    public CorporateActionSecuritiesMovement2 createCorporateActionSecuritiesMovement2() {
        return new CorporateActionSecuritiesMovement2();
    }

    /**
     * Create an instance of {@link DateAndDateTimeChoice }
     * 
     * @return
     *     the new instance of {@link DateAndDateTimeChoice }
     */
    public DateAndDateTimeChoice createDateAndDateTimeChoice() {
        return new DateAndDateTimeChoice();
    }

    /**
     * Create an instance of {@link DocumentIdentification8 }
     * 
     * @return
     *     the new instance of {@link DocumentIdentification8 }
     */
    public DocumentIdentification8 createDocumentIdentification8() {
        return new DocumentIdentification8();
    }

    /**
     * Create an instance of {@link ElectionAdviceFunction1 }
     * 
     * @return
     *     the new instance of {@link ElectionAdviceFunction1 }
     */
    public ElectionAdviceFunction1 createElectionAdviceFunction1() {
        return new ElectionAdviceFunction1();
    }

    /**
     * Create an instance of {@link FinancialInstrumentDescription3 }
     * 
     * @return
     *     the new instance of {@link FinancialInstrumentDescription3 }
     */
    public FinancialInstrumentDescription3 createFinancialInstrumentDescription3() {
        return new FinancialInstrumentDescription3();
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
     * Create an instance of {@link GenericIdentification13 }
     * 
     * @return
     *     the new instance of {@link GenericIdentification13 }
     */
    public GenericIdentification13 createGenericIdentification13() {
        return new GenericIdentification13();
    }

    /**
     * Create an instance of {@link GenericIdentification16 }
     * 
     * @return
     *     the new instance of {@link GenericIdentification16 }
     */
    public GenericIdentification16 createGenericIdentification16() {
        return new GenericIdentification16();
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
     * Create an instance of {@link PartyIdentification2Choice }
     * 
     * @return
     *     the new instance of {@link PartyIdentification2Choice }
     */
    public PartyIdentification2Choice createPartyIdentification2Choice() {
        return new PartyIdentification2Choice();
    }

    /**
     * Create an instance of {@link PersonIdentificationType3Choice }
     * 
     * @return
     *     the new instance of {@link PersonIdentificationType3Choice }
     */
    public PersonIdentificationType3Choice createPersonIdentificationType3Choice() {
        return new PersonIdentificationType3Choice();
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
     * Create an instance of {@link ProceedsDelivery1 }
     * 
     * @return
     *     the new instance of {@link ProceedsDelivery1 }
     */
    public ProceedsDelivery1 createProceedsDelivery1() {
        return new ProceedsDelivery1();
    }

    /**
     * Create an instance of {@link SecuritiesAccount7 }
     * 
     * @return
     *     the new instance of {@link SecuritiesAccount7 }
     */
    public SecuritiesAccount7 createSecuritiesAccount7() {
        return new SecuritiesAccount7();
    }

    /**
     * Create an instance of {@link SecuritiesAccount9 }
     * 
     * @return
     *     the new instance of {@link SecuritiesAccount9 }
     */
    public SecuritiesAccount9 createSecuritiesAccount9() {
        return new SecuritiesAccount9();
    }

    /**
     * Create an instance of {@link SecuritiesBalanceType10FormatChoice }
     * 
     * @return
     *     the new instance of {@link SecuritiesBalanceType10FormatChoice }
     */
    public SecuritiesBalanceType10FormatChoice createSecuritiesBalanceType10FormatChoice() {
        return new SecuritiesBalanceType10FormatChoice();
    }

    /**
     * Create an instance of {@link SecurityIdentification7 }
     * 
     * @return
     *     the new instance of {@link SecurityIdentification7 }
     */
    public SecurityIdentification7 createSecurityIdentification7() {
        return new SecurityIdentification7();
    }

    /**
     * Create an instance of {@link SimpleIdentificationInformation }
     * 
     * @return
     *     the new instance of {@link SimpleIdentificationInformation }
     */
    public SimpleIdentificationInformation createSimpleIdentificationInformation() {
        return new SimpleIdentificationInformation();
    }

    /**
     * Create an instance of {@link UnitOrFaceAmount1Choice }
     * 
     * @return
     *     the new instance of {@link UnitOrFaceAmount1Choice }
     */
    public UnitOrFaceAmount1Choice createUnitOrFaceAmount1Choice() {
        return new UnitOrFaceAmount1Choice();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Document }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Document }{@code >}
     */
    @XmlElementDecl(namespace = "urn:iso:std:iso:20022:tech:xsd:seev.012.001.01", name = "Document")
    public JAXBElement<Document> createDocument(Document value) {
        return new JAXBElement<>(_Document_QNAME, Document.class, null, value);
    }

}
