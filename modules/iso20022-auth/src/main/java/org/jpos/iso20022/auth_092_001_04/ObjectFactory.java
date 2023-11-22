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

package org.jpos.iso20022.auth_092_001_04;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.jpos.iso20022.auth_092_001_04 package. 
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

    private static final QName _Document_QNAME = new QName("urn:iso:std:iso:20022:tech:xsd:auth.092.001.04", "Document");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.jpos.iso20022.auth_092_001_04
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
     * Create an instance of {@link AgreementType2Choice }
     * 
     * @return
     *     the new instance of {@link AgreementType2Choice }
     */
    public AgreementType2Choice createAgreementType2Choice() {
        return new AgreementType2Choice();
    }

    /**
     * Create an instance of {@link CollateralPortfolioCode5Choice }
     * 
     * @return
     *     the new instance of {@link CollateralPortfolioCode5Choice }
     */
    public CollateralPortfolioCode5Choice createCollateralPortfolioCode5Choice() {
        return new CollateralPortfolioCode5Choice();
    }

    /**
     * Create an instance of {@link CounterpartyData92 }
     * 
     * @return
     *     the new instance of {@link CounterpartyData92 }
     */
    public CounterpartyData92 createCounterpartyData92() {
        return new CounterpartyData92();
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
     * Create an instance of {@link DerivativesTradeRejectionStatisticalReportV04 }
     * 
     * @return
     *     the new instance of {@link DerivativesTradeRejectionStatisticalReportV04 }
     */
    public DerivativesTradeRejectionStatisticalReportV04 createDerivativesTradeRejectionStatisticalReportV04() {
        return new DerivativesTradeRejectionStatisticalReportV04();
    }

    /**
     * Create an instance of {@link DetailedReportStatistics7 }
     * 
     * @return
     *     the new instance of {@link DetailedReportStatistics7 }
     */
    public DetailedReportStatistics7 createDetailedReportStatistics7() {
        return new DetailedReportStatistics7();
    }

    /**
     * Create an instance of {@link DetailedStatisticsPerCounterparty19 }
     * 
     * @return
     *     the new instance of {@link DetailedStatisticsPerCounterparty19 }
     */
    public DetailedStatisticsPerCounterparty19 createDetailedStatisticsPerCounterparty19() {
        return new DetailedStatisticsPerCounterparty19();
    }

    /**
     * Create an instance of {@link DetailedTransactionStatistics30 }
     * 
     * @return
     *     the new instance of {@link DetailedTransactionStatistics30 }
     */
    public DetailedTransactionStatistics30 createDetailedTransactionStatistics30() {
        return new DetailedTransactionStatistics30();
    }

    /**
     * Create an instance of {@link DetailedTransactionStatistics7Choice }
     * 
     * @return
     *     the new instance of {@link DetailedTransactionStatistics7Choice }
     */
    public DetailedTransactionStatistics7Choice createDetailedTransactionStatistics7Choice() {
        return new DetailedTransactionStatistics7Choice();
    }

    /**
     * Create an instance of {@link GenericIdentification175 }
     * 
     * @return
     *     the new instance of {@link GenericIdentification175 }
     */
    public GenericIdentification175 createGenericIdentification175() {
        return new GenericIdentification175();
    }

    /**
     * Create an instance of {@link GenericValidationRuleIdentification1 }
     * 
     * @return
     *     the new instance of {@link GenericValidationRuleIdentification1 }
     */
    public GenericValidationRuleIdentification1 createGenericValidationRuleIdentification1() {
        return new GenericValidationRuleIdentification1();
    }

    /**
     * Create an instance of {@link LegalPersonIdentification1 }
     * 
     * @return
     *     the new instance of {@link LegalPersonIdentification1 }
     */
    public LegalPersonIdentification1 createLegalPersonIdentification1() {
        return new LegalPersonIdentification1();
    }

    /**
     * Create an instance of {@link MarginPortfolio3 }
     * 
     * @return
     *     the new instance of {@link MarginPortfolio3 }
     */
    public MarginPortfolio3 createMarginPortfolio3() {
        return new MarginPortfolio3();
    }

    /**
     * Create an instance of {@link MasterAgreement8 }
     * 
     * @return
     *     the new instance of {@link MasterAgreement8 }
     */
    public MasterAgreement8 createMasterAgreement8() {
        return new MasterAgreement8();
    }

    /**
     * Create an instance of {@link NaturalPersonIdentification2 }
     * 
     * @return
     *     the new instance of {@link NaturalPersonIdentification2 }
     */
    public NaturalPersonIdentification2 createNaturalPersonIdentification2() {
        return new NaturalPersonIdentification2();
    }

    /**
     * Create an instance of {@link NaturalPersonIdentification3 }
     * 
     * @return
     *     the new instance of {@link NaturalPersonIdentification3 }
     */
    public NaturalPersonIdentification3 createNaturalPersonIdentification3() {
        return new NaturalPersonIdentification3();
    }

    /**
     * Create an instance of {@link NumberOfTransactionsPerValidationRule6 }
     * 
     * @return
     *     the new instance of {@link NumberOfTransactionsPerValidationRule6 }
     */
    public NumberOfTransactionsPerValidationRule6 createNumberOfTransactionsPerValidationRule6() {
        return new NumberOfTransactionsPerValidationRule6();
    }

    /**
     * Create an instance of {@link OrganisationIdentification15Choice }
     * 
     * @return
     *     the new instance of {@link OrganisationIdentification15Choice }
     */
    public OrganisationIdentification15Choice createOrganisationIdentification15Choice() {
        return new OrganisationIdentification15Choice();
    }

    /**
     * Create an instance of {@link OrganisationIdentification38 }
     * 
     * @return
     *     the new instance of {@link OrganisationIdentification38 }
     */
    public OrganisationIdentification38 createOrganisationIdentification38() {
        return new OrganisationIdentification38();
    }

    /**
     * Create an instance of {@link PartyIdentification248Choice }
     * 
     * @return
     *     the new instance of {@link PartyIdentification248Choice }
     */
    public PartyIdentification248Choice createPartyIdentification248Choice() {
        return new PartyIdentification248Choice();
    }

    /**
     * Create an instance of {@link PortfolioCode3Choice }
     * 
     * @return
     *     the new instance of {@link PortfolioCode3Choice }
     */
    public PortfolioCode3Choice createPortfolioCode3Choice() {
        return new PortfolioCode3Choice();
    }

    /**
     * Create an instance of {@link PortfolioCode5Choice }
     * 
     * @return
     *     the new instance of {@link PortfolioCode5Choice }
     */
    public PortfolioCode5Choice createPortfolioCode5Choice() {
        return new PortfolioCode5Choice();
    }

    /**
     * Create an instance of {@link PortfolioIdentification3 }
     * 
     * @return
     *     the new instance of {@link PortfolioIdentification3 }
     */
    public PortfolioIdentification3 createPortfolioIdentification3() {
        return new PortfolioIdentification3();
    }

    /**
     * Create an instance of {@link RejectionReason70 }
     * 
     * @return
     *     the new instance of {@link RejectionReason70 }
     */
    public RejectionReason70 createRejectionReason70() {
        return new RejectionReason70();
    }

    /**
     * Create an instance of {@link RejectionReason71 }
     * 
     * @return
     *     the new instance of {@link RejectionReason71 }
     */
    public RejectionReason71 createRejectionReason71() {
        return new RejectionReason71();
    }

    /**
     * Create an instance of {@link RejectionStatistics9 }
     * 
     * @return
     *     the new instance of {@link RejectionStatistics9 }
     */
    public RejectionStatistics9 createRejectionStatistics9() {
        return new RejectionStatistics9();
    }

    /**
     * Create an instance of {@link StatisticsPerCounterparty18Choice }
     * 
     * @return
     *     the new instance of {@link StatisticsPerCounterparty18Choice }
     */
    public StatisticsPerCounterparty18Choice createStatisticsPerCounterparty18Choice() {
        return new StatisticsPerCounterparty18Choice();
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
     * Create an instance of {@link TradeTransactionIdentification24 }
     * 
     * @return
     *     the new instance of {@link TradeTransactionIdentification24 }
     */
    public TradeTransactionIdentification24 createTradeTransactionIdentification24() {
        return new TradeTransactionIdentification24();
    }

    /**
     * Create an instance of {@link UniqueTransactionIdentifier2Choice }
     * 
     * @return
     *     the new instance of {@link UniqueTransactionIdentifier2Choice }
     */
    public UniqueTransactionIdentifier2Choice createUniqueTransactionIdentifier2Choice() {
        return new UniqueTransactionIdentifier2Choice();
    }

    /**
     * Create an instance of {@link ValidationRuleSchemeName1Choice }
     * 
     * @return
     *     the new instance of {@link ValidationRuleSchemeName1Choice }
     */
    public ValidationRuleSchemeName1Choice createValidationRuleSchemeName1Choice() {
        return new ValidationRuleSchemeName1Choice();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Document }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Document }{@code >}
     */
    @XmlElementDecl(namespace = "urn:iso:std:iso:20022:tech:xsd:auth.092.001.04", name = "Document")
    public JAXBElement<Document> createDocument(Document value) {
        return new JAXBElement<>(_Document_QNAME, Document.class, null, value);
    }

}
