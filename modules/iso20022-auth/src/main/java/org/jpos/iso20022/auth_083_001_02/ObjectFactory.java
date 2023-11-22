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

package org.jpos.iso20022.auth_083_001_02;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.jpos.iso20022.auth_083_001_02 package. 
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

    private static final QName _Document_QNAME = new QName("urn:iso:std:iso:20022:tech:xsd:auth.083.001.02", "Document");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.jpos.iso20022.auth_083_001_02
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
     * Create an instance of {@link GenericIdentification175 }
     * 
     * @return
     *     the new instance of {@link GenericIdentification175 }
     */
    public GenericIdentification175 createGenericIdentification175() {
        return new GenericIdentification175();
    }

    /**
     * Create an instance of {@link MasterAgreement7 }
     * 
     * @return
     *     the new instance of {@link MasterAgreement7 }
     */
    public MasterAgreement7 createMasterAgreement7() {
        return new MasterAgreement7();
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
     * Create an instance of {@link PartyIdentification236Choice }
     * 
     * @return
     *     the new instance of {@link PartyIdentification236Choice }
     */
    public PartyIdentification236Choice createPartyIdentification236Choice() {
        return new PartyIdentification236Choice();
    }

    /**
     * Create an instance of {@link SecuritiesFinancingReportingMissingCollateralRequestV02 }
     * 
     * @return
     *     the new instance of {@link SecuritiesFinancingReportingMissingCollateralRequestV02 }
     */
    public SecuritiesFinancingReportingMissingCollateralRequestV02 createSecuritiesFinancingReportingMissingCollateralRequestV02() {
        return new SecuritiesFinancingReportingMissingCollateralRequestV02();
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
     * Create an instance of {@link TradeTransactionIdentification18 }
     * 
     * @return
     *     the new instance of {@link TradeTransactionIdentification18 }
     */
    public TradeTransactionIdentification18 createTradeTransactionIdentification18() {
        return new TradeTransactionIdentification18();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Document }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Document }{@code >}
     */
    @XmlElementDecl(namespace = "urn:iso:std:iso:20022:tech:xsd:auth.083.001.02", name = "Document")
    public JAXBElement<Document> createDocument(Document value) {
        return new JAXBElement<>(_Document_QNAME, Document.class, null, value);
    }

}
