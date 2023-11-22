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

package org.jpos.iso20022.caaa_022_001_02;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.jpos.iso20022.caaa_022_001_02 package. 
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

    private static final QName _Document_QNAME = new QName("urn:iso:std:iso:20022:tech:xsd:caaa.022.001.02", "Document");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.jpos.iso20022.caaa_022_001_02
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
     * Create an instance of {@link AcceptorNonFinancialRequestV02 }
     * 
     * @return
     *     the new instance of {@link AcceptorNonFinancialRequestV02 }
     */
    public AcceptorNonFinancialRequestV02 createAcceptorNonFinancialRequestV02() {
        return new AcceptorNonFinancialRequestV02();
    }

    /**
     * Create an instance of {@link AccountIdentification54Choice }
     * 
     * @return
     *     the new instance of {@link AccountIdentification54Choice }
     */
    public AccountIdentification54Choice createAccountIdentification54Choice() {
        return new AccountIdentification54Choice();
    }

    /**
     * Create an instance of {@link Acquirer10 }
     * 
     * @return
     *     the new instance of {@link Acquirer10 }
     */
    public Acquirer10 createAcquirer10() {
        return new Acquirer10();
    }

    /**
     * Create an instance of {@link ActionMessage9 }
     * 
     * @return
     *     the new instance of {@link ActionMessage9 }
     */
    public ActionMessage9 createActionMessage9() {
        return new ActionMessage9();
    }

    /**
     * Create an instance of {@link AddressVerification1 }
     * 
     * @return
     *     the new instance of {@link AddressVerification1 }
     */
    public AddressVerification1 createAddressVerification1() {
        return new AddressVerification1();
    }

    /**
     * Create an instance of {@link AggregationTransaction3 }
     * 
     * @return
     *     the new instance of {@link AggregationTransaction3 }
     */
    public AggregationTransaction3 createAggregationTransaction3() {
        return new AggregationTransaction3();
    }

    /**
     * Create an instance of {@link AlgorithmIdentification12 }
     * 
     * @return
     *     the new instance of {@link AlgorithmIdentification12 }
     */
    public AlgorithmIdentification12 createAlgorithmIdentification12() {
        return new AlgorithmIdentification12();
    }

    /**
     * Create an instance of {@link AlgorithmIdentification18 }
     * 
     * @return
     *     the new instance of {@link AlgorithmIdentification18 }
     */
    public AlgorithmIdentification18 createAlgorithmIdentification18() {
        return new AlgorithmIdentification18();
    }

    /**
     * Create an instance of {@link AlgorithmIdentification19 }
     * 
     * @return
     *     the new instance of {@link AlgorithmIdentification19 }
     */
    public AlgorithmIdentification19 createAlgorithmIdentification19() {
        return new AlgorithmIdentification19();
    }

    /**
     * Create an instance of {@link AlgorithmIdentification21 }
     * 
     * @return
     *     the new instance of {@link AlgorithmIdentification21 }
     */
    public AlgorithmIdentification21 createAlgorithmIdentification21() {
        return new AlgorithmIdentification21();
    }

    /**
     * Create an instance of {@link AlgorithmIdentification22 }
     * 
     * @return
     *     the new instance of {@link AlgorithmIdentification22 }
     */
    public AlgorithmIdentification22 createAlgorithmIdentification22() {
        return new AlgorithmIdentification22();
    }

    /**
     * Create an instance of {@link AlgorithmIdentification29 }
     * 
     * @return
     *     the new instance of {@link AlgorithmIdentification29 }
     */
    public AlgorithmIdentification29 createAlgorithmIdentification29() {
        return new AlgorithmIdentification29();
    }

    /**
     * Create an instance of {@link AlgorithmIdentification30 }
     * 
     * @return
     *     the new instance of {@link AlgorithmIdentification30 }
     */
    public AlgorithmIdentification30 createAlgorithmIdentification30() {
        return new AlgorithmIdentification30();
    }

    /**
     * Create an instance of {@link Amount5 }
     * 
     * @return
     *     the new instance of {@link Amount5 }
     */
    public Amount5 createAmount5() {
        return new Amount5();
    }

    /**
     * Create an instance of {@link AuthenticatedData8 }
     * 
     * @return
     *     the new instance of {@link AuthenticatedData8 }
     */
    public AuthenticatedData8 createAuthenticatedData8() {
        return new AuthenticatedData8();
    }

    /**
     * Create an instance of {@link CardAccount16 }
     * 
     * @return
     *     the new instance of {@link CardAccount16 }
     */
    public CardAccount16 createCardAccount16() {
        return new CardAccount16();
    }

    /**
     * Create an instance of {@link CardDirectDebit2 }
     * 
     * @return
     *     the new instance of {@link CardDirectDebit2 }
     */
    public CardDirectDebit2 createCardDirectDebit2() {
        return new CardDirectDebit2();
    }

    /**
     * Create an instance of {@link CardPaymentContext29 }
     * 
     * @return
     *     the new instance of {@link CardPaymentContext29 }
     */
    public CardPaymentContext29 createCardPaymentContext29() {
        return new CardPaymentContext29();
    }

    /**
     * Create an instance of {@link CardPaymentEnvironment78 }
     * 
     * @return
     *     the new instance of {@link CardPaymentEnvironment78 }
     */
    public CardPaymentEnvironment78 createCardPaymentEnvironment78() {
        return new CardPaymentEnvironment78();
    }

    /**
     * Create an instance of {@link CardPaymentTransaction119 }
     * 
     * @return
     *     the new instance of {@link CardPaymentTransaction119 }
     */
    public CardPaymentTransaction119 createCardPaymentTransaction119() {
        return new CardPaymentTransaction119();
    }

    /**
     * Create an instance of {@link CardPaymentTransaction122 }
     * 
     * @return
     *     the new instance of {@link CardPaymentTransaction122 }
     */
    public CardPaymentTransaction122 createCardPaymentTransaction122() {
        return new CardPaymentTransaction122();
    }

    /**
     * Create an instance of {@link CardPaymentTransactionDetails51 }
     * 
     * @return
     *     the new instance of {@link CardPaymentTransactionDetails51 }
     */
    public CardPaymentTransactionDetails51 createCardPaymentTransactionDetails51() {
        return new CardPaymentTransactionDetails51();
    }

    /**
     * Create an instance of {@link CardPaymentTransactionResult4 }
     * 
     * @return
     *     the new instance of {@link CardPaymentTransactionResult4 }
     */
    public CardPaymentTransactionResult4 createCardPaymentTransactionResult4() {
        return new CardPaymentTransactionResult4();
    }

    /**
     * Create an instance of {@link Cardholder18 }
     * 
     * @return
     *     the new instance of {@link Cardholder18 }
     */
    public Cardholder18 createCardholder18() {
        return new Cardholder18();
    }

    /**
     * Create an instance of {@link CardholderAuthentication15 }
     * 
     * @return
     *     the new instance of {@link CardholderAuthentication15 }
     */
    public CardholderAuthentication15 createCardholderAuthentication15() {
        return new CardholderAuthentication15();
    }

    /**
     * Create an instance of {@link CashAccountIdentification7Choice }
     * 
     * @return
     *     the new instance of {@link CashAccountIdentification7Choice }
     */
    public CashAccountIdentification7Choice createCashAccountIdentification7Choice() {
        return new CashAccountIdentification7Choice();
    }

    /**
     * Create an instance of {@link CertificateIssuer1 }
     * 
     * @return
     *     the new instance of {@link CertificateIssuer1 }
     */
    public CertificateIssuer1 createCertificateIssuer1() {
        return new CertificateIssuer1();
    }

    /**
     * Create an instance of {@link Check1 }
     * 
     * @return
     *     the new instance of {@link Check1 }
     */
    public Check1 createCheck1() {
        return new Check1();
    }

    /**
     * Create an instance of {@link Commission18 }
     * 
     * @return
     *     the new instance of {@link Commission18 }
     */
    public Commission18 createCommission18() {
        return new Commission18();
    }

    /**
     * Create an instance of {@link Commission19 }
     * 
     * @return
     *     the new instance of {@link Commission19 }
     */
    public Commission19 createCommission19() {
        return new Commission19();
    }

    /**
     * Create an instance of {@link CommunicationAddress9 }
     * 
     * @return
     *     the new instance of {@link CommunicationAddress9 }
     */
    public CommunicationAddress9 createCommunicationAddress9() {
        return new CommunicationAddress9();
    }

    /**
     * Create an instance of {@link CommunicationCharacteristics5 }
     * 
     * @return
     *     the new instance of {@link CommunicationCharacteristics5 }
     */
    public CommunicationCharacteristics5 createCommunicationCharacteristics5() {
        return new CommunicationCharacteristics5();
    }

    /**
     * Create an instance of {@link ContentInformationType29 }
     * 
     * @return
     *     the new instance of {@link ContentInformationType29 }
     */
    public ContentInformationType29 createContentInformationType29() {
        return new ContentInformationType29();
    }

    /**
     * Create an instance of {@link ContentInformationType30 }
     * 
     * @return
     *     the new instance of {@link ContentInformationType30 }
     */
    public ContentInformationType30 createContentInformationType30() {
        return new ContentInformationType30();
    }

    /**
     * Create an instance of {@link ContentInformationType31 }
     * 
     * @return
     *     the new instance of {@link ContentInformationType31 }
     */
    public ContentInformationType31 createContentInformationType31() {
        return new ContentInformationType31();
    }

    /**
     * Create an instance of {@link ContentInformationType32 }
     * 
     * @return
     *     the new instance of {@link ContentInformationType32 }
     */
    public ContentInformationType32 createContentInformationType32() {
        return new ContentInformationType32();
    }

    /**
     * Create an instance of {@link Creditor4 }
     * 
     * @return
     *     the new instance of {@link Creditor4 }
     */
    public Creditor4 createCreditor4() {
        return new Creditor4();
    }

    /**
     * Create an instance of {@link CryptographicKey16 }
     * 
     * @return
     *     the new instance of {@link CryptographicKey16 }
     */
    public CryptographicKey16 createCryptographicKey16() {
        return new CryptographicKey16();
    }

    /**
     * Create an instance of {@link CurrencyAndAmount }
     * 
     * @return
     *     the new instance of {@link CurrencyAndAmount }
     */
    public CurrencyAndAmount createCurrencyAndAmount() {
        return new CurrencyAndAmount();
    }

    /**
     * Create an instance of {@link CurrencyConversion23 }
     * 
     * @return
     *     the new instance of {@link CurrencyConversion23 }
     */
    public CurrencyConversion23 createCurrencyConversion23() {
        return new CurrencyConversion23();
    }

    /**
     * Create an instance of {@link CurrencyConversion24 }
     * 
     * @return
     *     the new instance of {@link CurrencyConversion24 }
     */
    public CurrencyConversion24 createCurrencyConversion24() {
        return new CurrencyConversion24();
    }

    /**
     * Create an instance of {@link CurrencyDetails2 }
     * 
     * @return
     *     the new instance of {@link CurrencyDetails2 }
     */
    public CurrencyDetails2 createCurrencyDetails2() {
        return new CurrencyDetails2();
    }

    /**
     * Create an instance of {@link CurrencyDetails3 }
     * 
     * @return
     *     the new instance of {@link CurrencyDetails3 }
     */
    public CurrencyDetails3 createCurrencyDetails3() {
        return new CurrencyDetails3();
    }

    /**
     * Create an instance of {@link CustomerDevice3 }
     * 
     * @return
     *     the new instance of {@link CustomerDevice3 }
     */
    public CustomerDevice3 createCustomerDevice3() {
        return new CustomerDevice3();
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
     * Create an instance of {@link Debtor4 }
     * 
     * @return
     *     the new instance of {@link Debtor4 }
     */
    public Debtor4 createDebtor4() {
        return new Debtor4();
    }

    /**
     * Create an instance of {@link DetailedAmount15 }
     * 
     * @return
     *     the new instance of {@link DetailedAmount15 }
     */
    public DetailedAmount15 createDetailedAmount15() {
        return new DetailedAmount15();
    }

    /**
     * Create an instance of {@link DetailedAmount21 }
     * 
     * @return
     *     the new instance of {@link DetailedAmount21 }
     */
    public DetailedAmount21 createDetailedAmount21() {
        return new DetailedAmount21();
    }

    /**
     * Create an instance of {@link DetailedAmount4 }
     * 
     * @return
     *     the new instance of {@link DetailedAmount4 }
     */
    public DetailedAmount4 createDetailedAmount4() {
        return new DetailedAmount4();
    }

    /**
     * Create an instance of {@link DigestedData5 }
     * 
     * @return
     *     the new instance of {@link DigestedData5 }
     */
    public DigestedData5 createDigestedData5() {
        return new DigestedData5();
    }

    /**
     * Create an instance of {@link DisplayCapabilities4 }
     * 
     * @return
     *     the new instance of {@link DisplayCapabilities4 }
     */
    public DisplayCapabilities4 createDisplayCapabilities4() {
        return new DisplayCapabilities4();
    }

    /**
     * Create an instance of {@link EncapsulatedContent3 }
     * 
     * @return
     *     the new instance of {@link EncapsulatedContent3 }
     */
    public EncapsulatedContent3 createEncapsulatedContent3() {
        return new EncapsulatedContent3();
    }

    /**
     * Create an instance of {@link EncryptedContent6 }
     * 
     * @return
     *     the new instance of {@link EncryptedContent6 }
     */
    public EncryptedContent6 createEncryptedContent6() {
        return new EncryptedContent6();
    }

    /**
     * Create an instance of {@link EnvelopedData9 }
     * 
     * @return
     *     the new instance of {@link EnvelopedData9 }
     */
    public EnvelopedData9 createEnvelopedData9() {
        return new EnvelopedData9();
    }

    /**
     * Create an instance of {@link ExternallyDefinedData3 }
     * 
     * @return
     *     the new instance of {@link ExternallyDefinedData3 }
     */
    public ExternallyDefinedData3 createExternallyDefinedData3() {
        return new ExternallyDefinedData3();
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
     * Create an instance of {@link GenericIdentification176 }
     * 
     * @return
     *     the new instance of {@link GenericIdentification176 }
     */
    public GenericIdentification176 createGenericIdentification176() {
        return new GenericIdentification176();
    }

    /**
     * Create an instance of {@link GenericIdentification177 }
     * 
     * @return
     *     the new instance of {@link GenericIdentification177 }
     */
    public GenericIdentification177 createGenericIdentification177() {
        return new GenericIdentification177();
    }

    /**
     * Create an instance of {@link GenericIdentification32 }
     * 
     * @return
     *     the new instance of {@link GenericIdentification32 }
     */
    public GenericIdentification32 createGenericIdentification32() {
        return new GenericIdentification32();
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
     * Create an instance of {@link GenericIdentification4 }
     * 
     * @return
     *     the new instance of {@link GenericIdentification4 }
     */
    public GenericIdentification4 createGenericIdentification4() {
        return new GenericIdentification4();
    }

    /**
     * Create an instance of {@link GenericIdentification48 }
     * 
     * @return
     *     the new instance of {@link GenericIdentification48 }
     */
    public GenericIdentification48 createGenericIdentification48() {
        return new GenericIdentification48();
    }

    /**
     * Create an instance of {@link GenericIdentification90 }
     * 
     * @return
     *     the new instance of {@link GenericIdentification90 }
     */
    public GenericIdentification90 createGenericIdentification90() {
        return new GenericIdentification90();
    }

    /**
     * Create an instance of {@link GenericInformation1 }
     * 
     * @return
     *     the new instance of {@link GenericInformation1 }
     */
    public GenericInformation1 createGenericInformation1() {
        return new GenericInformation1();
    }

    /**
     * Create an instance of {@link Geolocation1 }
     * 
     * @return
     *     the new instance of {@link Geolocation1 }
     */
    public Geolocation1 createGeolocation1() {
        return new Geolocation1();
    }

    /**
     * Create an instance of {@link GeolocationGeographicCoordinates1 }
     * 
     * @return
     *     the new instance of {@link GeolocationGeographicCoordinates1 }
     */
    public GeolocationGeographicCoordinates1 createGeolocationGeographicCoordinates1() {
        return new GeolocationGeographicCoordinates1();
    }

    /**
     * Create an instance of {@link GeolocationUTMCoordinates1 }
     * 
     * @return
     *     the new instance of {@link GeolocationUTMCoordinates1 }
     */
    public GeolocationUTMCoordinates1 createGeolocationUTMCoordinates1() {
        return new GeolocationUTMCoordinates1();
    }

    /**
     * Create an instance of {@link GracePeriod1 }
     * 
     * @return
     *     the new instance of {@link GracePeriod1 }
     */
    public GracePeriod1 createGracePeriod1() {
        return new GracePeriod1();
    }

    /**
     * Create an instance of {@link Header59 }
     * 
     * @return
     *     the new instance of {@link Header59 }
     */
    public Header59 createHeader59() {
        return new Header59();
    }

    /**
     * Create an instance of {@link InstalmentAmountDetails1 }
     * 
     * @return
     *     the new instance of {@link InstalmentAmountDetails1 }
     */
    public InstalmentAmountDetails1 createInstalmentAmountDetails1() {
        return new InstalmentAmountDetails1();
    }

    /**
     * Create an instance of {@link InterestRateDetails1 }
     * 
     * @return
     *     the new instance of {@link InterestRateDetails1 }
     */
    public InterestRateDetails1 createInterestRateDetails1() {
        return new InterestRateDetails1();
    }

    /**
     * Create an instance of {@link IssuerAndSerialNumber2 }
     * 
     * @return
     *     the new instance of {@link IssuerAndSerialNumber2 }
     */
    public IssuerAndSerialNumber2 createIssuerAndSerialNumber2() {
        return new IssuerAndSerialNumber2();
    }

    /**
     * Create an instance of {@link KEK8 }
     * 
     * @return
     *     the new instance of {@link KEK8 }
     */
    public KEK8 createKEK8() {
        return new KEK8();
    }

    /**
     * Create an instance of {@link KEKIdentifier7 }
     * 
     * @return
     *     the new instance of {@link KEKIdentifier7 }
     */
    public KEKIdentifier7 createKEKIdentifier7() {
        return new KEKIdentifier7();
    }

    /**
     * Create an instance of {@link KeyTransport8 }
     * 
     * @return
     *     the new instance of {@link KeyTransport8 }
     */
    public KeyTransport8 createKeyTransport8() {
        return new KeyTransport8();
    }

    /**
     * Create an instance of {@link LoyaltyAccount3 }
     * 
     * @return
     *     the new instance of {@link LoyaltyAccount3 }
     */
    public LoyaltyAccount3 createLoyaltyAccount3() {
        return new LoyaltyAccount3();
    }

    /**
     * Create an instance of {@link MandateRelatedInformation13 }
     * 
     * @return
     *     the new instance of {@link MandateRelatedInformation13 }
     */
    public MandateRelatedInformation13 createMandateRelatedInformation13() {
        return new MandateRelatedInformation13();
    }

    /**
     * Create an instance of {@link MemoryCharacteristics1 }
     * 
     * @return
     *     the new instance of {@link MemoryCharacteristics1 }
     */
    public MemoryCharacteristics1 createMemoryCharacteristics1() {
        return new MemoryCharacteristics1();
    }

    /**
     * Create an instance of {@link MerchantToken2 }
     * 
     * @return
     *     the new instance of {@link MerchantToken2 }
     */
    public MerchantToken2 createMerchantToken2() {
        return new MerchantToken2();
    }

    /**
     * Create an instance of {@link MobileData4 }
     * 
     * @return
     *     the new instance of {@link MobileData4 }
     */
    public MobileData4 createMobileData4() {
        return new MobileData4();
    }

    /**
     * Create an instance of {@link NameAndAddress3 }
     * 
     * @return
     *     the new instance of {@link NameAndAddress3 }
     */
    public NameAndAddress3 createNameAndAddress3() {
        return new NameAndAddress3();
    }

    /**
     * Create an instance of {@link NameAndAddress6 }
     * 
     * @return
     *     the new instance of {@link NameAndAddress6 }
     */
    public NameAndAddress6 createNameAndAddress6() {
        return new NameAndAddress6();
    }

    /**
     * Create an instance of {@link NetworkParameters7 }
     * 
     * @return
     *     the new instance of {@link NetworkParameters7 }
     */
    public NetworkParameters7 createNetworkParameters7() {
        return new NetworkParameters7();
    }

    /**
     * Create an instance of {@link NetworkParameters9 }
     * 
     * @return
     *     the new instance of {@link NetworkParameters9 }
     */
    public NetworkParameters9 createNetworkParameters9() {
        return new NetworkParameters9();
    }

    /**
     * Create an instance of {@link NonFinancialRequestComponent2 }
     * 
     * @return
     *     the new instance of {@link NonFinancialRequestComponent2 }
     */
    public NonFinancialRequestComponent2 createNonFinancialRequestComponent2() {
        return new NonFinancialRequestComponent2();
    }

    /**
     * Create an instance of {@link NonFinancialRequestContentComponent2 }
     * 
     * @return
     *     the new instance of {@link NonFinancialRequestContentComponent2 }
     */
    public NonFinancialRequestContentComponent2 createNonFinancialRequestContentComponent2() {
        return new NonFinancialRequestContentComponent2();
    }

    /**
     * Create an instance of {@link OnLinePIN9 }
     * 
     * @return
     *     the new instance of {@link OnLinePIN9 }
     */
    public OnLinePIN9 createOnLinePIN9() {
        return new OnLinePIN9();
    }

    /**
     * Create an instance of {@link Organisation26 }
     * 
     * @return
     *     the new instance of {@link Organisation26 }
     */
    public Organisation26 createOrganisation26() {
        return new Organisation26();
    }

    /**
     * Create an instance of {@link Organisation41 }
     * 
     * @return
     *     the new instance of {@link Organisation41 }
     */
    public Organisation41 createOrganisation41() {
        return new Organisation41();
    }

    /**
     * Create an instance of {@link OriginalAmountDetails1 }
     * 
     * @return
     *     the new instance of {@link OriginalAmountDetails1 }
     */
    public OriginalAmountDetails1 createOriginalAmountDetails1() {
        return new OriginalAmountDetails1();
    }

    /**
     * Create an instance of {@link OriginatorInformation1 }
     * 
     * @return
     *     the new instance of {@link OriginatorInformation1 }
     */
    public OriginatorInformation1 createOriginatorInformation1() {
        return new OriginatorInformation1();
    }

    /**
     * Create an instance of {@link OutputBarcode1 }
     * 
     * @return
     *     the new instance of {@link OutputBarcode1 }
     */
    public OutputBarcode1 createOutputBarcode1() {
        return new OutputBarcode1();
    }

    /**
     * Create an instance of {@link PackageType3 }
     * 
     * @return
     *     the new instance of {@link PackageType3 }
     */
    public PackageType3 createPackageType3() {
        return new PackageType3();
    }

    /**
     * Create an instance of {@link Parameter10 }
     * 
     * @return
     *     the new instance of {@link Parameter10 }
     */
    public Parameter10 createParameter10() {
        return new Parameter10();
    }

    /**
     * Create an instance of {@link Parameter12 }
     * 
     * @return
     *     the new instance of {@link Parameter12 }
     */
    public Parameter12 createParameter12() {
        return new Parameter12();
    }

    /**
     * Create an instance of {@link Parameter15 }
     * 
     * @return
     *     the new instance of {@link Parameter15 }
     */
    public Parameter15 createParameter15() {
        return new Parameter15();
    }

    /**
     * Create an instance of {@link Parameter5 }
     * 
     * @return
     *     the new instance of {@link Parameter5 }
     */
    public Parameter5 createParameter5() {
        return new Parameter5();
    }

    /**
     * Create an instance of {@link Parameter7 }
     * 
     * @return
     *     the new instance of {@link Parameter7 }
     */
    public Parameter7 createParameter7() {
        return new Parameter7();
    }

    /**
     * Create an instance of {@link Parameter9 }
     * 
     * @return
     *     the new instance of {@link Parameter9 }
     */
    public Parameter9 createParameter9() {
        return new Parameter9();
    }

    /**
     * Create an instance of {@link PartyIdentification177Choice }
     * 
     * @return
     *     the new instance of {@link PartyIdentification177Choice }
     */
    public PartyIdentification177Choice createPartyIdentification177Choice() {
        return new PartyIdentification177Choice();
    }

    /**
     * Create an instance of {@link PartyIdentification178Choice }
     * 
     * @return
     *     the new instance of {@link PartyIdentification178Choice }
     */
    public PartyIdentification178Choice createPartyIdentification178Choice() {
        return new PartyIdentification178Choice();
    }

    /**
     * Create an instance of {@link PaymentCard32 }
     * 
     * @return
     *     the new instance of {@link PaymentCard32 }
     */
    public PaymentCard32 createPaymentCard32() {
        return new PaymentCard32();
    }

    /**
     * Create an instance of {@link PaymentContext28 }
     * 
     * @return
     *     the new instance of {@link PaymentContext28 }
     */
    public PaymentContext28 createPaymentContext28() {
        return new PaymentContext28();
    }

    /**
     * Create an instance of {@link PaymentTokenIdentifiers1 }
     * 
     * @return
     *     the new instance of {@link PaymentTokenIdentifiers1 }
     */
    public PaymentTokenIdentifiers1 createPaymentTokenIdentifiers1() {
        return new PaymentTokenIdentifiers1();
    }

    /**
     * Create an instance of {@link PersonIdentification15 }
     * 
     * @return
     *     the new instance of {@link PersonIdentification15 }
     */
    public PersonIdentification15 createPersonIdentification15() {
        return new PersonIdentification15();
    }

    /**
     * Create an instance of {@link PhysicalInterfaceParameter1 }
     * 
     * @return
     *     the new instance of {@link PhysicalInterfaceParameter1 }
     */
    public PhysicalInterfaceParameter1 createPhysicalInterfaceParameter1() {
        return new PhysicalInterfaceParameter1();
    }

    /**
     * Create an instance of {@link PlainCardData15 }
     * 
     * @return
     *     the new instance of {@link PlainCardData15 }
     */
    public PlainCardData15 createPlainCardData15() {
        return new PlainCardData15();
    }

    /**
     * Create an instance of {@link PlainCardData17 }
     * 
     * @return
     *     the new instance of {@link PlainCardData17 }
     */
    public PlainCardData17 createPlainCardData17() {
        return new PlainCardData17();
    }

    /**
     * Create an instance of {@link PointOfInteraction12 }
     * 
     * @return
     *     the new instance of {@link PointOfInteraction12 }
     */
    public PointOfInteraction12 createPointOfInteraction12() {
        return new PointOfInteraction12();
    }

    /**
     * Create an instance of {@link PointOfInteractionCapabilities9 }
     * 
     * @return
     *     the new instance of {@link PointOfInteractionCapabilities9 }
     */
    public PointOfInteractionCapabilities9 createPointOfInteractionCapabilities9() {
        return new PointOfInteractionCapabilities9();
    }

    /**
     * Create an instance of {@link PointOfInteractionComponent12 }
     * 
     * @return
     *     the new instance of {@link PointOfInteractionComponent12 }
     */
    public PointOfInteractionComponent12 createPointOfInteractionComponent12() {
        return new PointOfInteractionComponent12();
    }

    /**
     * Create an instance of {@link PointOfInteractionComponentAssessment1 }
     * 
     * @return
     *     the new instance of {@link PointOfInteractionComponentAssessment1 }
     */
    public PointOfInteractionComponentAssessment1 createPointOfInteractionComponentAssessment1() {
        return new PointOfInteractionComponentAssessment1();
    }

    /**
     * Create an instance of {@link PointOfInteractionComponentCharacteristics8 }
     * 
     * @return
     *     the new instance of {@link PointOfInteractionComponentCharacteristics8 }
     */
    public PointOfInteractionComponentCharacteristics8 createPointOfInteractionComponentCharacteristics8() {
        return new PointOfInteractionComponentCharacteristics8();
    }

    /**
     * Create an instance of {@link PointOfInteractionComponentIdentification2 }
     * 
     * @return
     *     the new instance of {@link PointOfInteractionComponentIdentification2 }
     */
    public PointOfInteractionComponentIdentification2 createPointOfInteractionComponentIdentification2() {
        return new PointOfInteractionComponentIdentification2();
    }

    /**
     * Create an instance of {@link PointOfInteractionComponentStatus3 }
     * 
     * @return
     *     the new instance of {@link PointOfInteractionComponentStatus3 }
     */
    public PointOfInteractionComponentStatus3 createPointOfInteractionComponentStatus3() {
        return new PointOfInteractionComponentStatus3();
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
     * Create an instance of {@link PostalAddress2 }
     * 
     * @return
     *     the new instance of {@link PostalAddress2 }
     */
    public PostalAddress2 createPostalAddress2() {
        return new PostalAddress2();
    }

    /**
     * Create an instance of {@link PostalAddress22 }
     * 
     * @return
     *     the new instance of {@link PostalAddress22 }
     */
    public PostalAddress22 createPostalAddress22() {
        return new PostalAddress22();
    }

    /**
     * Create an instance of {@link Product6 }
     * 
     * @return
     *     the new instance of {@link Product6 }
     */
    public Product6 createProduct6() {
        return new Product6();
    }

    /**
     * Create an instance of {@link Recipient11Choice }
     * 
     * @return
     *     the new instance of {@link Recipient11Choice }
     */
    public Recipient11Choice createRecipient11Choice() {
        return new Recipient11Choice();
    }

    /**
     * Create an instance of {@link Recipient12Choice }
     * 
     * @return
     *     the new instance of {@link Recipient12Choice }
     */
    public Recipient12Choice createRecipient12Choice() {
        return new Recipient12Choice();
    }

    /**
     * Create an instance of {@link RecurringTransaction4 }
     * 
     * @return
     *     the new instance of {@link RecurringTransaction4 }
     */
    public RecurringTransaction4 createRecurringTransaction4() {
        return new RecurringTransaction4();
    }

    /**
     * Create an instance of {@link RelativeDistinguishedName1 }
     * 
     * @return
     *     the new instance of {@link RelativeDistinguishedName1 }
     */
    public RelativeDistinguishedName1 createRelativeDistinguishedName1() {
        return new RelativeDistinguishedName1();
    }

    /**
     * Create an instance of {@link ResponseType10 }
     * 
     * @return
     *     the new instance of {@link ResponseType10 }
     */
    public ResponseType10 createResponseType10() {
        return new ResponseType10();
    }

    /**
     * Create an instance of {@link RetailerSaleEnvironment2 }
     * 
     * @return
     *     the new instance of {@link RetailerSaleEnvironment2 }
     */
    public RetailerSaleEnvironment2 createRetailerSaleEnvironment2() {
        return new RetailerSaleEnvironment2();
    }

    /**
     * Create an instance of {@link SaleContext4 }
     * 
     * @return
     *     the new instance of {@link SaleContext4 }
     */
    public SaleContext4 createSaleContext4() {
        return new SaleContext4();
    }

    /**
     * Create an instance of {@link SensitiveMobileData1 }
     * 
     * @return
     *     the new instance of {@link SensitiveMobileData1 }
     */
    public SensitiveMobileData1 createSensitiveMobileData1() {
        return new SensitiveMobileData1();
    }

    /**
     * Create an instance of {@link SignedData7 }
     * 
     * @return
     *     the new instance of {@link SignedData7 }
     */
    public SignedData7 createSignedData7() {
        return new SignedData7();
    }

    /**
     * Create an instance of {@link Signer6 }
     * 
     * @return
     *     the new instance of {@link Signer6 }
     */
    public Signer6 createSigner6() {
        return new Signer6();
    }

    /**
     * Create an instance of {@link SimpleIdentificationInformation4 }
     * 
     * @return
     *     the new instance of {@link SimpleIdentificationInformation4 }
     */
    public SimpleIdentificationInformation4 createSimpleIdentificationInformation4() {
        return new SimpleIdentificationInformation4();
    }

    /**
     * Create an instance of {@link StoredValueAccount2 }
     * 
     * @return
     *     the new instance of {@link StoredValueAccount2 }
     */
    public StoredValueAccount2 createStoredValueAccount2() {
        return new StoredValueAccount2();
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
     * Create an instance of {@link Token1 }
     * 
     * @return
     *     the new instance of {@link Token1 }
     */
    public Token1 createToken1() {
        return new Token1();
    }

    /**
     * Create an instance of {@link Traceability8 }
     * 
     * @return
     *     the new instance of {@link Traceability8 }
     */
    public Traceability8 createTraceability8() {
        return new Traceability8();
    }

    /**
     * Create an instance of {@link TrackData2 }
     * 
     * @return
     *     the new instance of {@link TrackData2 }
     */
    public TrackData2 createTrackData2() {
        return new TrackData2();
    }

    /**
     * Create an instance of {@link TransactionIdentifier1 }
     * 
     * @return
     *     the new instance of {@link TransactionIdentifier1 }
     */
    public TransactionIdentifier1 createTransactionIdentifier1() {
        return new TransactionIdentifier1();
    }

    /**
     * Create an instance of {@link TransactionVerificationResult4 }
     * 
     * @return
     *     the new instance of {@link TransactionVerificationResult4 }
     */
    public TransactionVerificationResult4 createTransactionVerificationResult4() {
        return new TransactionVerificationResult4();
    }

    /**
     * Create an instance of {@link Vehicle1 }
     * 
     * @return
     *     the new instance of {@link Vehicle1 }
     */
    public Vehicle1 createVehicle1() {
        return new Vehicle1();
    }

    /**
     * Create an instance of {@link Vehicle2 }
     * 
     * @return
     *     the new instance of {@link Vehicle2 }
     */
    public Vehicle2 createVehicle2() {
        return new Vehicle2();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Document }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Document }{@code >}
     */
    @XmlElementDecl(namespace = "urn:iso:std:iso:20022:tech:xsd:caaa.022.001.02", name = "Document")
    public JAXBElement<Document> createDocument(Document value) {
        return new JAXBElement<>(_Document_QNAME, Document.class, null, value);
    }

}
