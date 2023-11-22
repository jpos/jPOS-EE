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

package org.jpos.iso20022.auth_012_001_02;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.jpos.iso20022.auth_012_001_02 package. 
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

    private static final QName _Document_QNAME = new QName("urn:iso:std:iso:20022:tech:xsd:auth.012.001.02", "Document");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.jpos.iso20022.auth_012_001_02
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
     * Create an instance of {@link Collateral18 }
     * 
     * @return
     *     the new instance of {@link Collateral18 }
     */
    public Collateral18 createCollateral18() {
        return new Collateral18();
    }

    /**
     * Create an instance of {@link CollateralValuation6 }
     * 
     * @return
     *     the new instance of {@link CollateralValuation6 }
     */
    public CollateralValuation6 createCollateralValuation6() {
        return new CollateralValuation6();
    }

    /**
     * Create an instance of {@link CollateralValuation7 }
     * 
     * @return
     *     the new instance of {@link CollateralValuation7 }
     */
    public CollateralValuation7 createCollateralValuation7() {
        return new CollateralValuation7();
    }

    /**
     * Create an instance of {@link CounterpartyIdentification3Choice }
     * 
     * @return
     *     the new instance of {@link CounterpartyIdentification3Choice }
     */
    public CounterpartyIdentification3Choice createCounterpartyIdentification3Choice() {
        return new CounterpartyIdentification3Choice();
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
     * Create an instance of {@link DateTimePeriod1 }
     * 
     * @return
     *     the new instance of {@link DateTimePeriod1 }
     */
    public DateTimePeriod1 createDateTimePeriod1() {
        return new DateTimePeriod1();
    }

    /**
     * Create an instance of {@link FloatingRateNote2 }
     * 
     * @return
     *     the new instance of {@link FloatingRateNote2 }
     */
    public FloatingRateNote2 createFloatingRateNote2() {
        return new FloatingRateNote2();
    }

    /**
     * Create an instance of {@link MoneyMarketReportHeader1 }
     * 
     * @return
     *     the new instance of {@link MoneyMarketReportHeader1 }
     */
    public MoneyMarketReportHeader1 createMoneyMarketReportHeader1() {
        return new MoneyMarketReportHeader1();
    }

    /**
     * Create an instance of {@link MoneyMarketSecuredMarketStatisticalReportV02 }
     * 
     * @return
     *     the new instance of {@link MoneyMarketSecuredMarketStatisticalReportV02 }
     */
    public MoneyMarketSecuredMarketStatisticalReportV02 createMoneyMarketSecuredMarketStatisticalReportV02() {
        return new MoneyMarketSecuredMarketStatisticalReportV02();
    }

    /**
     * Create an instance of {@link NameAndLocation1 }
     * 
     * @return
     *     the new instance of {@link NameAndLocation1 }
     */
    public NameAndLocation1 createNameAndLocation1() {
        return new NameAndLocation1();
    }

    /**
     * Create an instance of {@link SectorAndLocation1 }
     * 
     * @return
     *     the new instance of {@link SectorAndLocation1 }
     */
    public SectorAndLocation1 createSectorAndLocation1() {
        return new SectorAndLocation1();
    }

    /**
     * Create an instance of {@link SecuredCollateral2Choice }
     * 
     * @return
     *     the new instance of {@link SecuredCollateral2Choice }
     */
    public SecuredCollateral2Choice createSecuredCollateral2Choice() {
        return new SecuredCollateral2Choice();
    }

    /**
     * Create an instance of {@link SecuredMarketReport4Choice }
     * 
     * @return
     *     the new instance of {@link SecuredMarketReport4Choice }
     */
    public SecuredMarketReport4Choice createSecuredMarketReport4Choice() {
        return new SecuredMarketReport4Choice();
    }

    /**
     * Create an instance of {@link SecuredMarketTransaction4 }
     * 
     * @return
     *     the new instance of {@link SecuredMarketTransaction4 }
     */
    public SecuredMarketTransaction4 createSecuredMarketTransaction4() {
        return new SecuredMarketTransaction4();
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
    @XmlElementDecl(namespace = "urn:iso:std:iso:20022:tech:xsd:auth.012.001.02", name = "Document")
    public JAXBElement<Document> createDocument(Document value) {
        return new JAXBElement<>(_Document_QNAME, Document.class, null, value);
    }

}
