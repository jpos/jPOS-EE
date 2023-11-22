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

package org.jpos.iso20022.auth_108_001_01;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.jpos.iso20022.auth_108_001_01 package. 
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

    private static final QName _Document_QNAME = new QName("urn:iso:std:iso:20022:tech:xsd:auth.108.001.01", "Document");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.jpos.iso20022.auth_108_001_01
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
     * Create an instance of {@link ActiveOrHistoricCurrencyAnd20DecimalAmount }
     * 
     * @return
     *     the new instance of {@link ActiveOrHistoricCurrencyAnd20DecimalAmount }
     */
    public ActiveOrHistoricCurrencyAnd20DecimalAmount createActiveOrHistoricCurrencyAnd20DecimalAmount() {
        return new ActiveOrHistoricCurrencyAnd20DecimalAmount();
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
     * Create an instance of {@link Counterparty45 }
     * 
     * @return
     *     the new instance of {@link Counterparty45 }
     */
    public Counterparty45 createCounterparty45() {
        return new Counterparty45();
    }

    /**
     * Create an instance of {@link Counterparty46 }
     * 
     * @return
     *     the new instance of {@link Counterparty46 }
     */
    public Counterparty46 createCounterparty46() {
        return new Counterparty46();
    }

    /**
     * Create an instance of {@link CounterpartyTradeNature15Choice }
     * 
     * @return
     *     the new instance of {@link CounterpartyTradeNature15Choice }
     */
    public CounterpartyTradeNature15Choice createCounterpartyTradeNature15Choice() {
        return new CounterpartyTradeNature15Choice();
    }

    /**
     * Create an instance of {@link DerivativesTradeMarginDataReportV01 }
     * 
     * @return
     *     the new instance of {@link DerivativesTradeMarginDataReportV01 }
     */
    public DerivativesTradeMarginDataReportV01 createDerivativesTradeMarginDataReportV01() {
        return new DerivativesTradeMarginDataReportV01();
    }

    /**
     * Create an instance of {@link Direction2 }
     * 
     * @return
     *     the new instance of {@link Direction2 }
     */
    public Direction2 createDirection2() {
        return new Direction2();
    }

    /**
     * Create an instance of {@link Direction4Choice }
     * 
     * @return
     *     the new instance of {@link Direction4Choice }
     */
    public Direction4Choice createDirection4Choice() {
        return new Direction4Choice();
    }

    /**
     * Create an instance of {@link FinancialInstitutionSector1 }
     * 
     * @return
     *     the new instance of {@link FinancialInstitutionSector1 }
     */
    public FinancialInstitutionSector1 createFinancialInstitutionSector1() {
        return new FinancialInstitutionSector1();
    }

    /**
     * Create an instance of {@link FinancialPartyClassification2Choice }
     * 
     * @return
     *     the new instance of {@link FinancialPartyClassification2Choice }
     */
    public FinancialPartyClassification2Choice createFinancialPartyClassification2Choice() {
        return new FinancialPartyClassification2Choice();
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
     * Create an instance of {@link LegalPersonIdentification1 }
     * 
     * @return
     *     the new instance of {@link LegalPersonIdentification1 }
     */
    public LegalPersonIdentification1 createLegalPersonIdentification1() {
        return new LegalPersonIdentification1();
    }

    /**
     * Create an instance of {@link MarginCollateralReport4 }
     * 
     * @return
     *     the new instance of {@link MarginCollateralReport4 }
     */
    public MarginCollateralReport4 createMarginCollateralReport4() {
        return new MarginCollateralReport4();
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
     * Create an instance of {@link MarginReportData7 }
     * 
     * @return
     *     the new instance of {@link MarginReportData7 }
     */
    public MarginReportData7 createMarginReportData7() {
        return new MarginReportData7();
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
     * Create an instance of {@link NonFinancialInstitutionSector10 }
     * 
     * @return
     *     the new instance of {@link NonFinancialInstitutionSector10 }
     */
    public NonFinancialInstitutionSector10 createNonFinancialInstitutionSector10() {
        return new NonFinancialInstitutionSector10();
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
     * Create an instance of {@link Pagination1 }
     * 
     * @return
     *     the new instance of {@link Pagination1 }
     */
    public Pagination1 createPagination1() {
        return new Pagination1();
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
     * Create an instance of {@link PostedMarginOrCollateral6 }
     * 
     * @return
     *     the new instance of {@link PostedMarginOrCollateral6 }
     */
    public PostedMarginOrCollateral6 createPostedMarginOrCollateral6() {
        return new PostedMarginOrCollateral6();
    }

    /**
     * Create an instance of {@link ReceivedMarginOrCollateral6 }
     * 
     * @return
     *     the new instance of {@link ReceivedMarginOrCollateral6 }
     */
    public ReceivedMarginOrCollateral6 createReceivedMarginOrCollateral6() {
        return new ReceivedMarginOrCollateral6();
    }

    /**
     * Create an instance of {@link ReportingExemption1 }
     * 
     * @return
     *     the new instance of {@link ReportingExemption1 }
     */
    public ReportingExemption1 createReportingExemption1() {
        return new ReportingExemption1();
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
     * Create an instance of {@link TechnicalAttributes6 }
     * 
     * @return
     *     the new instance of {@link TechnicalAttributes6 }
     */
    public TechnicalAttributes6 createTechnicalAttributes6() {
        return new TechnicalAttributes6();
    }

    /**
     * Create an instance of {@link TradeCounterpartyRelationship1Choice }
     * 
     * @return
     *     the new instance of {@link TradeCounterpartyRelationship1Choice }
     */
    public TradeCounterpartyRelationship1Choice createTradeCounterpartyRelationship1Choice() {
        return new TradeCounterpartyRelationship1Choice();
    }

    /**
     * Create an instance of {@link TradeCounterpartyRelationshipRecord1 }
     * 
     * @return
     *     the new instance of {@link TradeCounterpartyRelationshipRecord1 }
     */
    public TradeCounterpartyRelationshipRecord1 createTradeCounterpartyRelationshipRecord1() {
        return new TradeCounterpartyRelationshipRecord1();
    }

    /**
     * Create an instance of {@link TradeCounterpartyReport20 }
     * 
     * @return
     *     the new instance of {@link TradeCounterpartyReport20 }
     */
    public TradeCounterpartyReport20 createTradeCounterpartyReport20() {
        return new TradeCounterpartyReport20();
    }

    /**
     * Create an instance of {@link TradeData55Choice }
     * 
     * @return
     *     the new instance of {@link TradeData55Choice }
     */
    public TradeData55Choice createTradeData55Choice() {
        return new TradeData55Choice();
    }

    /**
     * Create an instance of {@link TradeReport31Choice }
     * 
     * @return
     *     the new instance of {@link TradeReport31Choice }
     */
    public TradeReport31Choice createTradeReport31Choice() {
        return new TradeReport31Choice();
    }

    /**
     * Create an instance of {@link TradeReportHeader4 }
     * 
     * @return
     *     the new instance of {@link TradeReportHeader4 }
     */
    public TradeReportHeader4 createTradeReportHeader4() {
        return new TradeReportHeader4();
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
     * Create an instance of {@link JAXBElement }{@code <}{@link Document }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Document }{@code >}
     */
    @XmlElementDecl(namespace = "urn:iso:std:iso:20022:tech:xsd:auth.108.001.01", name = "Document")
    public JAXBElement<Document> createDocument(Document value) {
        return new JAXBElement<>(_Document_QNAME, Document.class, null, value);
    }

}
