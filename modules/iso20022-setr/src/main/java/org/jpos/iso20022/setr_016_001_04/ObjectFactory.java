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

package org.jpos.iso20022.setr_016_001_04;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.jpos.iso20022.setr_016_001_04 package. 
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

    private static final QName _Document_QNAME = new QName("urn:iso:std:iso:20022:tech:xsd:setr.016.001.04", "Document");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.jpos.iso20022.setr_016_001_04
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
     * Create an instance of {@link AdditionalAmount1Choice }
     * 
     * @return
     *     the new instance of {@link AdditionalAmount1Choice }
     */
    public AdditionalAmount1Choice createAdditionalAmount1Choice() {
        return new AdditionalAmount1Choice();
    }

    /**
     * Create an instance of {@link AdditionalReference8 }
     * 
     * @return
     *     the new instance of {@link AdditionalReference8 }
     */
    public AdditionalReference8 createAdditionalReference8() {
        return new AdditionalReference8();
    }

    /**
     * Create an instance of {@link AlternateSecurityIdentification7 }
     * 
     * @return
     *     the new instance of {@link AlternateSecurityIdentification7 }
     */
    public AlternateSecurityIdentification7 createAlternateSecurityIdentification7() {
        return new AlternateSecurityIdentification7();
    }

    /**
     * Create an instance of {@link CancelledReason12Choice }
     * 
     * @return
     *     the new instance of {@link CancelledReason12Choice }
     */
    public CancelledReason12Choice createCancelledReason12Choice() {
        return new CancelledReason12Choice();
    }

    /**
     * Create an instance of {@link CancelledStatusReason16 }
     * 
     * @return
     *     the new instance of {@link CancelledStatusReason16 }
     */
    public CancelledStatusReason16 createCancelledStatusReason16() {
        return new CancelledStatusReason16();
    }

    /**
     * Create an instance of {@link ChargeType5Choice }
     * 
     * @return
     *     the new instance of {@link ChargeType5Choice }
     */
    public ChargeType5Choice createChargeType5Choice() {
        return new ChargeType5Choice();
    }

    /**
     * Create an instance of {@link ConditionallyAcceptedStatus3Choice }
     * 
     * @return
     *     the new instance of {@link ConditionallyAcceptedStatus3Choice }
     */
    public ConditionallyAcceptedStatus3Choice createConditionallyAcceptedStatus3Choice() {
        return new ConditionallyAcceptedStatus3Choice();
    }

    /**
     * Create an instance of {@link ConditionallyAcceptedStatusReason3 }
     * 
     * @return
     *     the new instance of {@link ConditionallyAcceptedStatusReason3 }
     */
    public ConditionallyAcceptedStatusReason3 createConditionallyAcceptedStatusReason3() {
        return new ConditionallyAcceptedStatusReason3();
    }

    /**
     * Create an instance of {@link ConditionallyAcceptedStatusReason3Choice }
     * 
     * @return
     *     the new instance of {@link ConditionallyAcceptedStatusReason3Choice }
     */
    public ConditionallyAcceptedStatusReason3Choice createConditionallyAcceptedStatusReason3Choice() {
        return new ConditionallyAcceptedStatusReason3Choice();
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
     * Create an instance of {@link DateFormat42Choice }
     * 
     * @return
     *     the new instance of {@link DateFormat42Choice }
     */
    public DateFormat42Choice createDateFormat42Choice() {
        return new DateFormat42Choice();
    }

    /**
     * Create an instance of {@link ExpectedExecutionDetails2 }
     * 
     * @return
     *     the new instance of {@link ExpectedExecutionDetails2 }
     */
    public ExpectedExecutionDetails2 createExpectedExecutionDetails2() {
        return new ExpectedExecutionDetails2();
    }

    /**
     * Create an instance of {@link ExpectedExecutionDetails4 }
     * 
     * @return
     *     the new instance of {@link ExpectedExecutionDetails4 }
     */
    public ExpectedExecutionDetails4 createExpectedExecutionDetails4() {
        return new ExpectedExecutionDetails4();
    }

    /**
     * Create an instance of {@link Extension1 }
     * 
     * @return
     *     the new instance of {@link Extension1 }
     */
    public Extension1 createExtension1() {
        return new Extension1();
    }

    /**
     * Create an instance of {@link Fee3 }
     * 
     * @return
     *     the new instance of {@link Fee3 }
     */
    public Fee3 createFee3() {
        return new Fee3();
    }

    /**
     * Create an instance of {@link FinancialInstrument57 }
     * 
     * @return
     *     the new instance of {@link FinancialInstrument57 }
     */
    public FinancialInstrument57 createFinancialInstrument57() {
        return new FinancialInstrument57();
    }

    /**
     * Create an instance of {@link FundOrderData5 }
     * 
     * @return
     *     the new instance of {@link FundOrderData5 }
     */
    public FundOrderData5 createFundOrderData5() {
        return new FundOrderData5();
    }

    /**
     * Create an instance of {@link FundOrderData6 }
     * 
     * @return
     *     the new instance of {@link FundOrderData6 }
     */
    public FundOrderData6 createFundOrderData6() {
        return new FundOrderData6();
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
     * Create an instance of {@link GenericIdentification47 }
     * 
     * @return
     *     the new instance of {@link GenericIdentification47 }
     */
    public GenericIdentification47 createGenericIdentification47() {
        return new GenericIdentification47();
    }

    /**
     * Create an instance of {@link HoldBackInformation3 }
     * 
     * @return
     *     the new instance of {@link HoldBackInformation3 }
     */
    public HoldBackInformation3 createHoldBackInformation3() {
        return new HoldBackInformation3();
    }

    /**
     * Create an instance of {@link IdentificationSource1Choice }
     * 
     * @return
     *     the new instance of {@link IdentificationSource1Choice }
     */
    public IdentificationSource1Choice createIdentificationSource1Choice() {
        return new IdentificationSource1Choice();
    }

    /**
     * Create an instance of {@link InRepairStatusReason4 }
     * 
     * @return
     *     the new instance of {@link InRepairStatusReason4 }
     */
    public InRepairStatusReason4 createInRepairStatusReason4() {
        return new InRepairStatusReason4();
    }

    /**
     * Create an instance of {@link InRepairStatusReason4Choice }
     * 
     * @return
     *     the new instance of {@link InRepairStatusReason4Choice }
     */
    public InRepairStatusReason4Choice createInRepairStatusReason4Choice() {
        return new InRepairStatusReason4Choice();
    }

    /**
     * Create an instance of {@link InRepairStatusReason5Choice }
     * 
     * @return
     *     the new instance of {@link InRepairStatusReason5Choice }
     */
    public InRepairStatusReason5Choice createInRepairStatusReason5Choice() {
        return new InRepairStatusReason5Choice();
    }

    /**
     * Create an instance of {@link IndividualOrderStatusAndReason7 }
     * 
     * @return
     *     the new instance of {@link IndividualOrderStatusAndReason7 }
     */
    public IndividualOrderStatusAndReason7 createIndividualOrderStatusAndReason7() {
        return new IndividualOrderStatusAndReason7();
    }

    /**
     * Create an instance of {@link InvestmentAccount58 }
     * 
     * @return
     *     the new instance of {@link InvestmentAccount58 }
     */
    public InvestmentAccount58 createInvestmentAccount58() {
        return new InvestmentAccount58();
    }

    /**
     * Create an instance of {@link LegIdentification1Choice }
     * 
     * @return
     *     the new instance of {@link LegIdentification1Choice }
     */
    public LegIdentification1Choice createLegIdentification1Choice() {
        return new LegIdentification1Choice();
    }

    /**
     * Create an instance of {@link MessageIdentification1 }
     * 
     * @return
     *     the new instance of {@link MessageIdentification1 }
     */
    public MessageIdentification1 createMessageIdentification1() {
        return new MessageIdentification1();
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
     * Create an instance of {@link OrderInstructionStatusReportV04 }
     * 
     * @return
     *     the new instance of {@link OrderInstructionStatusReportV04 }
     */
    public OrderInstructionStatusReportV04 createOrderInstructionStatusReportV04() {
        return new OrderInstructionStatusReportV04();
    }

    /**
     * Create an instance of {@link OrderStatus3Choice }
     * 
     * @return
     *     the new instance of {@link OrderStatus3Choice }
     */
    public OrderStatus3Choice createOrderStatus3Choice() {
        return new OrderStatus3Choice();
    }

    /**
     * Create an instance of {@link OrderStatus4Choice }
     * 
     * @return
     *     the new instance of {@link OrderStatus4Choice }
     */
    public OrderStatus4Choice createOrderStatus4Choice() {
        return new OrderStatus4Choice();
    }

    /**
     * Create an instance of {@link OrderStatus5Choice }
     * 
     * @return
     *     the new instance of {@link OrderStatus5Choice }
     */
    public OrderStatus5Choice createOrderStatus5Choice() {
        return new OrderStatus5Choice();
    }

    /**
     * Create an instance of {@link OrderStatusAndReason10 }
     * 
     * @return
     *     the new instance of {@link OrderStatusAndReason10 }
     */
    public OrderStatusAndReason10 createOrderStatusAndReason10() {
        return new OrderStatusAndReason10();
    }

    /**
     * Create an instance of {@link PartiallySettled21Choice }
     * 
     * @return
     *     the new instance of {@link PartiallySettled21Choice }
     */
    public PartiallySettled21Choice createPartiallySettled21Choice() {
        return new PartiallySettled21Choice();
    }

    /**
     * Create an instance of {@link PartiallySettledStatus10 }
     * 
     * @return
     *     the new instance of {@link PartiallySettledStatus10 }
     */
    public PartiallySettledStatus10 createPartiallySettledStatus10() {
        return new PartiallySettledStatus10();
    }

    /**
     * Create an instance of {@link PartyIdentification113 }
     * 
     * @return
     *     the new instance of {@link PartyIdentification113 }
     */
    public PartyIdentification113 createPartyIdentification113() {
        return new PartyIdentification113();
    }

    /**
     * Create an instance of {@link PartyIdentification90Choice }
     * 
     * @return
     *     the new instance of {@link PartyIdentification90Choice }
     */
    public PartyIdentification90Choice createPartyIdentification90Choice() {
        return new PartyIdentification90Choice();
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
     * Create an instance of {@link References61Choice }
     * 
     * @return
     *     the new instance of {@link References61Choice }
     */
    public References61Choice createReferences61Choice() {
        return new References61Choice();
    }

    /**
     * Create an instance of {@link RejectedReason20Choice }
     * 
     * @return
     *     the new instance of {@link RejectedReason20Choice }
     */
    public RejectedReason20Choice createRejectedReason20Choice() {
        return new RejectedReason20Choice();
    }

    /**
     * Create an instance of {@link RejectedStatus9 }
     * 
     * @return
     *     the new instance of {@link RejectedStatus9 }
     */
    public RejectedStatus9 createRejectedStatus9() {
        return new RejectedStatus9();
    }

    /**
     * Create an instance of {@link SecurityIdentification25Choice }
     * 
     * @return
     *     the new instance of {@link SecurityIdentification25Choice }
     */
    public SecurityIdentification25Choice createSecurityIdentification25Choice() {
        return new SecurityIdentification25Choice();
    }

    /**
     * Create an instance of {@link Series1 }
     * 
     * @return
     *     the new instance of {@link Series1 }
     */
    public Series1 createSeries1() {
        return new Series1();
    }

    /**
     * Create an instance of {@link Status24Choice }
     * 
     * @return
     *     the new instance of {@link Status24Choice }
     */
    public Status24Choice createStatus24Choice() {
        return new Status24Choice();
    }

    /**
     * Create an instance of {@link SubAccount6 }
     * 
     * @return
     *     the new instance of {@link SubAccount6 }
     */
    public SubAccount6 createSubAccount6() {
        return new SubAccount6();
    }

    /**
     * Create an instance of {@link SuspendedStatusReason4 }
     * 
     * @return
     *     the new instance of {@link SuspendedStatusReason4 }
     */
    public SuspendedStatusReason4 createSuspendedStatusReason4() {
        return new SuspendedStatusReason4();
    }

    /**
     * Create an instance of {@link SuspendedStatusReason4Choice }
     * 
     * @return
     *     the new instance of {@link SuspendedStatusReason4Choice }
     */
    public SuspendedStatusReason4Choice createSuspendedStatusReason4Choice() {
        return new SuspendedStatusReason4Choice();
    }

    /**
     * Create an instance of {@link SuspendedStatusReason5Choice }
     * 
     * @return
     *     the new instance of {@link SuspendedStatusReason5Choice }
     */
    public SuspendedStatusReason5Choice createSuspendedStatusReason5Choice() {
        return new SuspendedStatusReason5Choice();
    }

    /**
     * Create an instance of {@link SwitchLegReferences2 }
     * 
     * @return
     *     the new instance of {@link SwitchLegReferences2 }
     */
    public SwitchLegReferences2 createSwitchLegReferences2() {
        return new SwitchLegReferences2();
    }

    /**
     * Create an instance of {@link SwitchOrderStatusAndReason2 }
     * 
     * @return
     *     the new instance of {@link SwitchOrderStatusAndReason2 }
     */
    public SwitchOrderStatusAndReason2 createSwitchOrderStatusAndReason2() {
        return new SwitchOrderStatusAndReason2();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Document }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Document }{@code >}
     */
    @XmlElementDecl(namespace = "urn:iso:std:iso:20022:tech:xsd:setr.016.001.04", name = "Document")
    public JAXBElement<Document> createDocument(Document value) {
        return new JAXBElement<>(_Document_QNAME, Document.class, null, value);
    }

}
