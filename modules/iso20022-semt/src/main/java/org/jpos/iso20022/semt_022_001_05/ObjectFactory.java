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

package org.jpos.iso20022.semt_022_001_05;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.jpos.iso20022.semt_022_001_05 package. 
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

    private static final QName _Document_QNAME = new QName("urn:iso:std:iso:20022:tech:xsd:semt.022.001.05", "Document");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.jpos.iso20022.semt_022_001_05
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
     * Create an instance of {@link AcknowledgedAcceptedStatus21Choice }
     * 
     * @return
     *     the new instance of {@link AcknowledgedAcceptedStatus21Choice }
     */
    public AcknowledgedAcceptedStatus21Choice createAcknowledgedAcceptedStatus21Choice() {
        return new AcknowledgedAcceptedStatus21Choice();
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
     * Create an instance of {@link AcknowledgedAcceptedStatus24Choice }
     * 
     * @return
     *     the new instance of {@link AcknowledgedAcceptedStatus24Choice }
     */
    public AcknowledgedAcceptedStatus24Choice createAcknowledgedAcceptedStatus24Choice() {
        return new AcknowledgedAcceptedStatus24Choice();
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
     * Create an instance of {@link AcknowledgementReason12 }
     * 
     * @return
     *     the new instance of {@link AcknowledgementReason12 }
     */
    public AcknowledgementReason12 createAcknowledgementReason12() {
        return new AcknowledgementReason12();
    }

    /**
     * Create an instance of {@link AcknowledgementReason12Choice }
     * 
     * @return
     *     the new instance of {@link AcknowledgementReason12Choice }
     */
    public AcknowledgementReason12Choice createAcknowledgementReason12Choice() {
        return new AcknowledgementReason12Choice();
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
     * Create an instance of {@link AcknowledgementReason15Choice }
     * 
     * @return
     *     the new instance of {@link AcknowledgementReason15Choice }
     */
    public AcknowledgementReason15Choice createAcknowledgementReason15Choice() {
        return new AcknowledgementReason15Choice();
    }

    /**
     * Create an instance of {@link AcknowledgementReason9 }
     * 
     * @return
     *     the new instance of {@link AcknowledgementReason9 }
     */
    public AcknowledgementReason9 createAcknowledgementReason9() {
        return new AcknowledgementReason9();
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
     * Create an instance of {@link CancellationReason10 }
     * 
     * @return
     *     the new instance of {@link CancellationReason10 }
     */
    public CancellationReason10 createCancellationReason10() {
        return new CancellationReason10();
    }

    /**
     * Create an instance of {@link CancellationReason21Choice }
     * 
     * @return
     *     the new instance of {@link CancellationReason21Choice }
     */
    public CancellationReason21Choice createCancellationReason21Choice() {
        return new CancellationReason21Choice();
    }

    /**
     * Create an instance of {@link CancellationReason22 }
     * 
     * @return
     *     the new instance of {@link CancellationReason22 }
     */
    public CancellationReason22 createCancellationReason22() {
        return new CancellationReason22();
    }

    /**
     * Create an instance of {@link CancellationReason36Choice }
     * 
     * @return
     *     the new instance of {@link CancellationReason36Choice }
     */
    public CancellationReason36Choice createCancellationReason36Choice() {
        return new CancellationReason36Choice();
    }

    /**
     * Create an instance of {@link CancellationStatus15Choice }
     * 
     * @return
     *     the new instance of {@link CancellationStatus15Choice }
     */
    public CancellationStatus15Choice createCancellationStatus15Choice() {
        return new CancellationStatus15Choice();
    }

    /**
     * Create an instance of {@link CancellationStatus24Choice }
     * 
     * @return
     *     the new instance of {@link CancellationStatus24Choice }
     */
    public CancellationStatus24Choice createCancellationStatus24Choice() {
        return new CancellationStatus24Choice();
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
     * Create an instance of {@link DeniedReason11 }
     * 
     * @return
     *     the new instance of {@link DeniedReason11 }
     */
    public DeniedReason11 createDeniedReason11() {
        return new DeniedReason11();
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
     * Create an instance of {@link DeniedReason16Choice }
     * 
     * @return
     *     the new instance of {@link DeniedReason16Choice }
     */
    public DeniedReason16Choice createDeniedReason16Choice() {
        return new DeniedReason16Choice();
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
     * Create an instance of {@link DeniedStatus16Choice }
     * 
     * @return
     *     the new instance of {@link DeniedStatus16Choice }
     */
    public DeniedStatus16Choice createDeniedStatus16Choice() {
        return new DeniedStatus16Choice();
    }

    /**
     * Create an instance of {@link FailingReason8 }
     * 
     * @return
     *     the new instance of {@link FailingReason8 }
     */
    public FailingReason8 createFailingReason8() {
        return new FailingReason8();
    }

    /**
     * Create an instance of {@link FailingReason8Choice }
     * 
     * @return
     *     the new instance of {@link FailingReason8Choice }
     */
    public FailingReason8Choice createFailingReason8Choice() {
        return new FailingReason8Choice();
    }

    /**
     * Create an instance of {@link FailingStatus10Choice }
     * 
     * @return
     *     the new instance of {@link FailingStatus10Choice }
     */
    public FailingStatus10Choice createFailingStatus10Choice() {
        return new FailingStatus10Choice();
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
     * Create an instance of {@link GenericOrganisationIdentification1 }
     * 
     * @return
     *     the new instance of {@link GenericOrganisationIdentification1 }
     */
    public GenericOrganisationIdentification1 createGenericOrganisationIdentification1() {
        return new GenericOrganisationIdentification1();
    }

    /**
     * Create an instance of {@link MatchingStatus25Choice }
     * 
     * @return
     *     the new instance of {@link MatchingStatus25Choice }
     */
    public MatchingStatus25Choice createMatchingStatus25Choice() {
        return new MatchingStatus25Choice();
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
     * Create an instance of {@link OrganisationIdentification31 }
     * 
     * @return
     *     the new instance of {@link OrganisationIdentification31 }
     */
    public OrganisationIdentification31 createOrganisationIdentification31() {
        return new OrganisationIdentification31();
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
     * Create an instance of {@link Pagination1 }
     * 
     * @return
     *     the new instance of {@link Pagination1 }
     */
    public Pagination1 createPagination1() {
        return new Pagination1();
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
     * Create an instance of {@link PartyIdentification144 }
     * 
     * @return
     *     the new instance of {@link PartyIdentification144 }
     */
    public PartyIdentification144 createPartyIdentification144() {
        return new PartyIdentification144();
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
     * Create an instance of {@link PendingProcessingReason10Choice }
     * 
     * @return
     *     the new instance of {@link PendingProcessingReason10Choice }
     */
    public PendingProcessingReason10Choice createPendingProcessingReason10Choice() {
        return new PendingProcessingReason10Choice();
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
     * Create an instance of {@link PendingProcessingReason8 }
     * 
     * @return
     *     the new instance of {@link PendingProcessingReason8 }
     */
    public PendingProcessingReason8 createPendingProcessingReason8() {
        return new PendingProcessingReason8();
    }

    /**
     * Create an instance of {@link PendingProcessingStatus11Choice }
     * 
     * @return
     *     the new instance of {@link PendingProcessingStatus11Choice }
     */
    public PendingProcessingStatus11Choice createPendingProcessingStatus11Choice() {
        return new PendingProcessingStatus11Choice();
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
     * Create an instance of {@link PendingReason15 }
     * 
     * @return
     *     the new instance of {@link PendingReason15 }
     */
    public PendingReason15 createPendingReason15() {
        return new PendingReason15();
    }

    /**
     * Create an instance of {@link PendingReason16 }
     * 
     * @return
     *     the new instance of {@link PendingReason16 }
     */
    public PendingReason16 createPendingReason16() {
        return new PendingReason16();
    }

    /**
     * Create an instance of {@link PendingReason17 }
     * 
     * @return
     *     the new instance of {@link PendingReason17 }
     */
    public PendingReason17 createPendingReason17() {
        return new PendingReason17();
    }

    /**
     * Create an instance of {@link PendingReason27Choice }
     * 
     * @return
     *     the new instance of {@link PendingReason27Choice }
     */
    public PendingReason27Choice createPendingReason27Choice() {
        return new PendingReason27Choice();
    }

    /**
     * Create an instance of {@link PendingReason28Choice }
     * 
     * @return
     *     the new instance of {@link PendingReason28Choice }
     */
    public PendingReason28Choice createPendingReason28Choice() {
        return new PendingReason28Choice();
    }

    /**
     * Create an instance of {@link PendingReason30Choice }
     * 
     * @return
     *     the new instance of {@link PendingReason30Choice }
     */
    public PendingReason30Choice createPendingReason30Choice() {
        return new PendingReason30Choice();
    }

    /**
     * Create an instance of {@link PendingStatus37Choice }
     * 
     * @return
     *     the new instance of {@link PendingStatus37Choice }
     */
    public PendingStatus37Choice createPendingStatus37Choice() {
        return new PendingStatus37Choice();
    }

    /**
     * Create an instance of {@link PendingStatus38Choice }
     * 
     * @return
     *     the new instance of {@link PendingStatus38Choice }
     */
    public PendingStatus38Choice createPendingStatus38Choice() {
        return new PendingStatus38Choice();
    }

    /**
     * Create an instance of {@link PendingStatus39Choice }
     * 
     * @return
     *     the new instance of {@link PendingStatus39Choice }
     */
    public PendingStatus39Choice createPendingStatus39Choice() {
        return new PendingStatus39Choice();
    }

    /**
     * Create an instance of {@link ProcessingStatus86Choice }
     * 
     * @return
     *     the new instance of {@link ProcessingStatus86Choice }
     */
    public ProcessingStatus86Choice createProcessingStatus86Choice() {
        return new ProcessingStatus86Choice();
    }

    /**
     * Create an instance of {@link ProcessingStatus87Choice }
     * 
     * @return
     *     the new instance of {@link ProcessingStatus87Choice }
     */
    public ProcessingStatus87Choice createProcessingStatus87Choice() {
        return new ProcessingStatus87Choice();
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
     * Create an instance of {@link RejectionAndRepairReason37Choice }
     * 
     * @return
     *     the new instance of {@link RejectionAndRepairReason37Choice }
     */
    public RejectionAndRepairReason37Choice createRejectionAndRepairReason37Choice() {
        return new RejectionAndRepairReason37Choice();
    }

    /**
     * Create an instance of {@link RejectionAndRepairReason38Choice }
     * 
     * @return
     *     the new instance of {@link RejectionAndRepairReason38Choice }
     */
    public RejectionAndRepairReason38Choice createRejectionAndRepairReason38Choice() {
        return new RejectionAndRepairReason38Choice();
    }

    /**
     * Create an instance of {@link RejectionOrRepairReason37 }
     * 
     * @return
     *     the new instance of {@link RejectionOrRepairReason37 }
     */
    public RejectionOrRepairReason37 createRejectionOrRepairReason37() {
        return new RejectionOrRepairReason37();
    }

    /**
     * Create an instance of {@link RejectionOrRepairReason38 }
     * 
     * @return
     *     the new instance of {@link RejectionOrRepairReason38 }
     */
    public RejectionOrRepairReason38 createRejectionOrRepairReason38() {
        return new RejectionOrRepairReason38();
    }

    /**
     * Create an instance of {@link RejectionOrRepairStatus42Choice }
     * 
     * @return
     *     the new instance of {@link RejectionOrRepairStatus42Choice }
     */
    public RejectionOrRepairStatus42Choice createRejectionOrRepairStatus42Choice() {
        return new RejectionOrRepairStatus42Choice();
    }

    /**
     * Create an instance of {@link RejectionOrRepairStatus43Choice }
     * 
     * @return
     *     the new instance of {@link RejectionOrRepairStatus43Choice }
     */
    public RejectionOrRepairStatus43Choice createRejectionOrRepairStatus43Choice() {
        return new RejectionOrRepairStatus43Choice();
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
     * Create an instance of {@link RejectionReason43Choice }
     * 
     * @return
     *     the new instance of {@link RejectionReason43Choice }
     */
    public RejectionReason43Choice createRejectionReason43Choice() {
        return new RejectionReason43Choice();
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
     * Create an instance of {@link RejectionReason58 }
     * 
     * @return
     *     the new instance of {@link RejectionReason58 }
     */
    public RejectionReason58 createRejectionReason58() {
        return new RejectionReason58();
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
     * Create an instance of {@link RejectionStatus38Choice }
     * 
     * @return
     *     the new instance of {@link RejectionStatus38Choice }
     */
    public RejectionStatus38Choice createRejectionStatus38Choice() {
        return new RejectionStatus38Choice();
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
     * Create an instance of {@link RepairReason8 }
     * 
     * @return
     *     the new instance of {@link RepairReason8 }
     */
    public RepairReason8 createRepairReason8() {
        return new RepairReason8();
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
     * Create an instance of {@link RepairStatus12Choice }
     * 
     * @return
     *     the new instance of {@link RepairStatus12Choice }
     */
    public RepairStatus12Choice createRepairStatus12Choice() {
        return new RepairStatus12Choice();
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
     * Create an instance of {@link SecuritiesAccount22 }
     * 
     * @return
     *     the new instance of {@link SecuritiesAccount22 }
     */
    public SecuritiesAccount22 createSecuritiesAccount22() {
        return new SecuritiesAccount22();
    }

    /**
     * Create an instance of {@link SecuritiesSettlementTransactionAuditTrailReportV05 }
     * 
     * @return
     *     the new instance of {@link SecuritiesSettlementTransactionAuditTrailReportV05 }
     */
    public SecuritiesSettlementTransactionAuditTrailReportV05 createSecuritiesSettlementTransactionAuditTrailReportV05() {
        return new SecuritiesSettlementTransactionAuditTrailReportV05();
    }

    /**
     * Create an instance of {@link SettlementStatus17Choice }
     * 
     * @return
     *     the new instance of {@link SettlementStatus17Choice }
     */
    public SettlementStatus17Choice createSettlementStatus17Choice() {
        return new SettlementStatus17Choice();
    }

    /**
     * Create an instance of {@link StatusTrail10 }
     * 
     * @return
     *     the new instance of {@link StatusTrail10 }
     */
    public StatusTrail10 createStatusTrail10() {
        return new StatusTrail10();
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
     * Create an instance of {@link TransactionIdentifications29 }
     * 
     * @return
     *     the new instance of {@link TransactionIdentifications29 }
     */
    public TransactionIdentifications29 createTransactionIdentifications29() {
        return new TransactionIdentifications29();
    }

    /**
     * Create an instance of {@link UnmatchedReason16 }
     * 
     * @return
     *     the new instance of {@link UnmatchedReason16 }
     */
    public UnmatchedReason16 createUnmatchedReason16() {
        return new UnmatchedReason16();
    }

    /**
     * Create an instance of {@link UnmatchedReason23Choice }
     * 
     * @return
     *     the new instance of {@link UnmatchedReason23Choice }
     */
    public UnmatchedReason23Choice createUnmatchedReason23Choice() {
        return new UnmatchedReason23Choice();
    }

    /**
     * Create an instance of {@link UnmatchedStatus17Choice }
     * 
     * @return
     *     the new instance of {@link UnmatchedStatus17Choice }
     */
    public UnmatchedStatus17Choice createUnmatchedStatus17Choice() {
        return new UnmatchedStatus17Choice();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Document }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Document }{@code >}
     */
    @XmlElementDecl(namespace = "urn:iso:std:iso:20022:tech:xsd:semt.022.001.05", name = "Document")
    public JAXBElement<Document> createDocument(Document value) {
        return new JAXBElement<>(_Document_QNAME, Document.class, null, value);
    }

}
