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

package org.jpos.iso20022.sese_031_002_09;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.jpos.iso20022.sese_031_002_09 package. 
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

    private static final QName _Document_QNAME = new QName("urn:iso:std:iso:20022:tech:xsd:sese.031.002.09", "Document");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.jpos.iso20022.sese_031_002_09
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
     * Create an instance of {@link AcknowledgedAcceptedStatus25Choice }
     * 
     * @return
     *     the new instance of {@link AcknowledgedAcceptedStatus25Choice }
     */
    public AcknowledgedAcceptedStatus25Choice createAcknowledgedAcceptedStatus25Choice() {
        return new AcknowledgedAcceptedStatus25Choice();
    }

    /**
     * Create an instance of {@link AcknowledgementReason13 }
     * 
     * @return
     *     the new instance of {@link AcknowledgementReason13 }
     */
    public AcknowledgementReason13 createAcknowledgementReason13() {
        return new AcknowledgementReason13();
    }

    /**
     * Create an instance of {@link AcknowledgementReason16Choice }
     * 
     * @return
     *     the new instance of {@link AcknowledgementReason16Choice }
     */
    public AcknowledgementReason16Choice createAcknowledgementReason16Choice() {
        return new AcknowledgementReason16Choice();
    }

    /**
     * Create an instance of {@link AutomaticBorrowing11Choice }
     * 
     * @return
     *     the new instance of {@link AutomaticBorrowing11Choice }
     */
    public AutomaticBorrowing11Choice createAutomaticBorrowing11Choice() {
        return new AutomaticBorrowing11Choice();
    }

    /**
     * Create an instance of {@link BlockChainAddressWallet7 }
     * 
     * @return
     *     the new instance of {@link BlockChainAddressWallet7 }
     */
    public BlockChainAddressWallet7 createBlockChainAddressWallet7() {
        return new BlockChainAddressWallet7();
    }

    /**
     * Create an instance of {@link DeniedReason17 }
     * 
     * @return
     *     the new instance of {@link DeniedReason17 }
     */
    public DeniedReason17 createDeniedReason17() {
        return new DeniedReason17();
    }

    /**
     * Create an instance of {@link DeniedReason24Choice }
     * 
     * @return
     *     the new instance of {@link DeniedReason24Choice }
     */
    public DeniedReason24Choice createDeniedReason24Choice() {
        return new DeniedReason24Choice();
    }

    /**
     * Create an instance of {@link DeniedStatus19Choice }
     * 
     * @return
     *     the new instance of {@link DeniedStatus19Choice }
     */
    public DeniedStatus19Choice createDeniedStatus19Choice() {
        return new DeniedStatus19Choice();
    }

    /**
     * Create an instance of {@link DocumentNumber16Choice }
     * 
     * @return
     *     the new instance of {@link DocumentNumber16Choice }
     */
    public DocumentNumber16Choice createDocumentNumber16Choice() {
        return new DocumentNumber16Choice();
    }

    /**
     * Create an instance of {@link GenericIdentification163 }
     * 
     * @return
     *     the new instance of {@link GenericIdentification163 }
     */
    public GenericIdentification163 createGenericIdentification163() {
        return new GenericIdentification163();
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
     * Create an instance of {@link HoldIndicator7 }
     * 
     * @return
     *     the new instance of {@link HoldIndicator7 }
     */
    public HoldIndicator7 createHoldIndicator7() {
        return new HoldIndicator7();
    }

    /**
     * Create an instance of {@link LinkageType4Choice }
     * 
     * @return
     *     the new instance of {@link LinkageType4Choice }
     */
    public LinkageType4Choice createLinkageType4Choice() {
        return new LinkageType4Choice();
    }

    /**
     * Create an instance of {@link Linkages66 }
     * 
     * @return
     *     the new instance of {@link Linkages66 }
     */
    public Linkages66 createLinkages66() {
        return new Linkages66();
    }

    /**
     * Create an instance of {@link MatchingDenied4Choice }
     * 
     * @return
     *     the new instance of {@link MatchingDenied4Choice }
     */
    public MatchingDenied4Choice createMatchingDenied4Choice() {
        return new MatchingDenied4Choice();
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
     * Create an instance of {@link PartyIdentification156 }
     * 
     * @return
     *     the new instance of {@link PartyIdentification156 }
     */
    public PartyIdentification156 createPartyIdentification156() {
        return new PartyIdentification156();
    }

    /**
     * Create an instance of {@link PendingReason20 }
     * 
     * @return
     *     the new instance of {@link PendingReason20 }
     */
    public PendingReason20 createPendingReason20() {
        return new PendingReason20();
    }

    /**
     * Create an instance of {@link PendingReason37Choice }
     * 
     * @return
     *     the new instance of {@link PendingReason37Choice }
     */
    public PendingReason37Choice createPendingReason37Choice() {
        return new PendingReason37Choice();
    }

    /**
     * Create an instance of {@link PendingStatus46Choice }
     * 
     * @return
     *     the new instance of {@link PendingStatus46Choice }
     */
    public PendingStatus46Choice createPendingStatus46Choice() {
        return new PendingStatus46Choice();
    }

    /**
     * Create an instance of {@link PriorityNumeric5Choice }
     * 
     * @return
     *     the new instance of {@link PriorityNumeric5Choice }
     */
    public PriorityNumeric5Choice createPriorityNumeric5Choice() {
        return new PriorityNumeric5Choice();
    }

    /**
     * Create an instance of {@link ProcessingPosition18Choice }
     * 
     * @return
     *     the new instance of {@link ProcessingPosition18Choice }
     */
    public ProcessingPosition18Choice createProcessingPosition18Choice() {
        return new ProcessingPosition18Choice();
    }

    /**
     * Create an instance of {@link ProcessingStatus91Choice }
     * 
     * @return
     *     the new instance of {@link ProcessingStatus91Choice }
     */
    public ProcessingStatus91Choice createProcessingStatus91Choice() {
        return new ProcessingStatus91Choice();
    }

    /**
     * Create an instance of {@link ProprietaryReason5 }
     * 
     * @return
     *     the new instance of {@link ProprietaryReason5 }
     */
    public ProprietaryReason5 createProprietaryReason5() {
        return new ProprietaryReason5();
    }

    /**
     * Create an instance of {@link ProprietaryStatusAndReason7 }
     * 
     * @return
     *     the new instance of {@link ProprietaryStatusAndReason7 }
     */
    public ProprietaryStatusAndReason7 createProprietaryStatusAndReason7() {
        return new ProprietaryStatusAndReason7();
    }

    /**
     * Create an instance of {@link References28 }
     * 
     * @return
     *     the new instance of {@link References28 }
     */
    public References28 createReferences28() {
        return new References28();
    }

    /**
     * Create an instance of {@link References76Choice }
     * 
     * @return
     *     the new instance of {@link References76Choice }
     */
    public References76Choice createReferences76Choice() {
        return new References76Choice();
    }

    /**
     * Create an instance of {@link Registration12Choice }
     * 
     * @return
     *     the new instance of {@link Registration12Choice }
     */
    public Registration12Choice createRegistration12Choice() {
        return new Registration12Choice();
    }

    /**
     * Create an instance of {@link RegistrationReason6 }
     * 
     * @return
     *     the new instance of {@link RegistrationReason6 }
     */
    public RegistrationReason6 createRegistrationReason6() {
        return new RegistrationReason6();
    }

    /**
     * Create an instance of {@link RejectionAndRepairReason41Choice }
     * 
     * @return
     *     the new instance of {@link RejectionAndRepairReason41Choice }
     */
    public RejectionAndRepairReason41Choice createRejectionAndRepairReason41Choice() {
        return new RejectionAndRepairReason41Choice();
    }

    /**
     * Create an instance of {@link RejectionOrRepairReason41 }
     * 
     * @return
     *     the new instance of {@link RejectionOrRepairReason41 }
     */
    public RejectionOrRepairReason41 createRejectionOrRepairReason41() {
        return new RejectionOrRepairReason41();
    }

    /**
     * Create an instance of {@link RejectionOrRepairStatus46Choice }
     * 
     * @return
     *     the new instance of {@link RejectionOrRepairStatus46Choice }
     */
    public RejectionOrRepairStatus46Choice createRejectionOrRepairStatus46Choice() {
        return new RejectionOrRepairStatus46Choice();
    }

    /**
     * Create an instance of {@link RequestDetails29 }
     * 
     * @return
     *     the new instance of {@link RequestDetails29 }
     */
    public RequestDetails29 createRequestDetails29() {
        return new RequestDetails29();
    }

    /**
     * Create an instance of {@link RestrictionIdentification2 }
     * 
     * @return
     *     the new instance of {@link RestrictionIdentification2 }
     */
    public RestrictionIdentification2 createRestrictionIdentification2() {
        return new RestrictionIdentification2();
    }

    /**
     * Create an instance of {@link SecuritiesAccount30 }
     * 
     * @return
     *     the new instance of {@link SecuritiesAccount30 }
     */
    public SecuritiesAccount30 createSecuritiesAccount30() {
        return new SecuritiesAccount30();
    }

    /**
     * Create an instance of {@link SecuritiesRTGS5Choice }
     * 
     * @return
     *     the new instance of {@link SecuritiesRTGS5Choice }
     */
    public SecuritiesRTGS5Choice createSecuritiesRTGS5Choice() {
        return new SecuritiesRTGS5Choice();
    }

    /**
     * Create an instance of {@link SecuritiesSettlementConditionModificationStatusAdvice002V09 }
     * 
     * @return
     *     the new instance of {@link SecuritiesSettlementConditionModificationStatusAdvice002V09 }
     */
    public SecuritiesSettlementConditionModificationStatusAdvice002V09 createSecuritiesSettlementConditionModificationStatusAdvice002V09() {
        return new SecuritiesSettlementConditionModificationStatusAdvice002V09();
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
     * Create an instance of {@link UnilateralSplit4Choice }
     * 
     * @return
     *     the new instance of {@link UnilateralSplit4Choice }
     */
    public UnilateralSplit4Choice createUnilateralSplit4Choice() {
        return new UnilateralSplit4Choice();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Document }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Document }{@code >}
     */
    @XmlElementDecl(namespace = "urn:iso:std:iso:20022:tech:xsd:sese.031.002.09", name = "Document")
    public JAXBElement<Document> createDocument(Document value) {
        return new JAXBElement<>(_Document_QNAME, Document.class, null, value);
    }

}
