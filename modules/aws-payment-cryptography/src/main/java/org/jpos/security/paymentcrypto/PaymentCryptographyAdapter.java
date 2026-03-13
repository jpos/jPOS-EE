/*
 * jPOS Project [http://jpos.org]
 * Copyright (C) 2000-2026 jPOS Software SRL
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

package org.jpos.security.paymentcrypto;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

import org.jpos.core.Configuration;
import org.jpos.core.ConfigurationException;
import org.jpos.iso.ISODate;
import org.jpos.iso.ISOUtil;
import org.jpos.security.ARPCMethod;
import org.jpos.security.Algorithm;
import org.jpos.security.BaseSMAdapter;
import org.jpos.security.EncryptedPIN;
import org.jpos.security.MKDMethod;
import org.jpos.security.ModeOfUse;
import org.jpos.security.SKDMethod;
import org.jpos.security.SMAdapter;
import org.jpos.security.SMException;
import org.jpos.security.SecureARNKey;
import org.jpos.security.SecureDESKey;
import org.jpos.security.SecureKey;
import org.jpos.security.SecureKeyBlock;
import org.jpos.security.SecureKeyBlockBuilder;
import org.jpos.security.SecureKeySpec;
import org.jpos.util.LogEvent;
import org.jpos.util.Loggeable;
import org.jpos.util.Logger;
import org.jpos.util.SimpleMsg;

import software.amazon.awssdk.auth.credentials.AwsBasicCredentials;
import software.amazon.awssdk.auth.credentials.StaticCredentialsProvider;
import software.amazon.awssdk.regions.Region;
import software.amazon.awssdk.services.paymentcryptography.PaymentCryptographyAsyncClient;
import software.amazon.awssdk.services.paymentcryptography.PaymentCryptographyAsyncClientBuilder;
import software.amazon.awssdk.services.paymentcryptography.model.*;
import software.amazon.awssdk.services.paymentcryptographydata.PaymentCryptographyDataAsyncClient;
import software.amazon.awssdk.services.paymentcryptographydata.PaymentCryptographyDataAsyncClientBuilder;
import software.amazon.awssdk.services.paymentcryptographydata.model.*;
// Explicit import to resolve ambiguity: KeyCheckValueAlgorithm exists in both model packages since 2.42.x
import software.amazon.awssdk.services.paymentcryptography.model.KeyCheckValueAlgorithm;

/**
 * AWS Payment Cryptography adapter for jPOS Security Module.
 * <p>
 * This class provides an implementation of {@link BaseSMAdapter} that interfaces with
 * AWS Payment Cryptography service for cryptographic operations including:
 * <ul>
 *   <li>Key management (import, generate)</li>
 *   <li>PIN translation and verification</li>
 *   <li>CVV/CVD calculation and verification</li>
 *   <li>PVV calculation and verification</li>
 *   <li>ARQC verification and ARPC generation</li>
 * </ul>
 * <p>
 * The adapter uses AWS SDK for Java 2.x to communicate with AWS Payment Cryptography
 * and AWS Payment Cryptography Data services.
 *
 * @author jPOS.org
 * @version 1.0
 * @see BaseSMAdapter
 * @see SecureKey
 * @since 3.0
 */
public class PaymentCryptographyAdapter extends BaseSMAdapter<SecureKey> {

    /** Default timeout for AWS API calls in milliseconds. */
    protected final int DEFAULT_TIMEOUT_MS = 10000;

    /** Default key algorithm for generated keys. */
    protected final KeyAlgorithm DEFAULT_KEY_ALGORITHM = KeyAlgorithm.TDES_3_KEY;

    /** AWS Payment Cryptography Data async client. */
    protected PaymentCryptographyDataAsyncClient dataClient;

    /** AWS Payment Cryptography async client. */
    protected PaymentCryptographyAsyncClient client;

    private int timeout;
    private String accessKeyId;
    private String secretAccessKey;
    private String region;
    private KeyAlgorithm keyAlgorithm;

    /**
     * Gets the AWS access key ID.
     *
     * @return AWS access key ID
     */
    public String getAccessKeyId() {
        return accessKeyId;
    }

    /**
     * Sets the AWS access key ID.
     *
     * @param accessKeyId AWS access key ID
     */
    public void setAccessKeyId(String accessKeyId) {
        this.accessKeyId = accessKeyId;
    }

    /**
     * Gets the AWS secret access key.
     *
     * @return AWS secret access key
     */
    public String getSecretAccessKey() {
        return secretAccessKey;
    }

    /**
     * Sets the AWS secret access key.
     *
     * @param secretAccessKey AWS secret access key
     */
    public void setSecretAccessKey(String secretAccessKey) {
        this.secretAccessKey = secretAccessKey;
    }

    /**
     * Gets the AWS region.
     *
     * @return AWS region name
     */
    public String getRegion() {
        return region;
    }

    /**
     * Sets the AWS region.
     *
     * @param region AWS region name
     */
    public void setRegion(String region) {
        this.region = region;
    }

    /**
     * Gets the timeout for AWS API calls.
     *
     * @return timeout in milliseconds
     */
    public int getTimeout() {
        return timeout;
    }

    /**
     * Sets the timeout for AWS API calls.
     *
     * @param timeout timeout in milliseconds
     */
    public void setTimeout(int timeout) {
        this.timeout = timeout;
    }

    /**
     * Gets the key algorithm used for key generation.
     *
     * @return key algorithm
     */
    public KeyAlgorithm getKeyAlgorithm() {
        return keyAlgorithm;
    }

    /**
     * Sets the key algorithm used for key generation.
     *
     * @param keyAlgorithm key algorithm
     */
    public void setKeyAlgorithm(KeyAlgorithm keyAlgorithm) {
        this.keyAlgorithm = keyAlgorithm;
    }

    /**
     * Gets or creates the AWS Payment Cryptography Data async client.
     * <p>
     * The client is lazily initialized using the configured credentials and region.
     *
     * @return PaymentCryptographyDataAsyncClient instance
     */
    protected PaymentCryptographyDataAsyncClient getDataClient() {

        if (dataClient == null) {

            AwsBasicCredentials credentials = AwsBasicCredentials.builder()
              .accessKeyId(getAccessKeyId())
              .secretAccessKey(getSecretAccessKey())
              .build();

            PaymentCryptographyDataAsyncClientBuilder builder = PaymentCryptographyDataAsyncClient.builder();
            builder.region(getAWSRegion())
              .credentialsProvider(StaticCredentialsProvider.create(credentials));

            dataClient = builder.build();
        }

        return dataClient;
    }

    /**
     * Gets or creates the AWS Payment Cryptography async client.
     * <p>
     * The client is lazily initialized using the configured credentials and region.
     *
     * @return PaymentCryptographyAsyncClient instance
     */
    protected PaymentCryptographyAsyncClient getClient() {

        if (client == null) {

            AwsBasicCredentials credentials = AwsBasicCredentials.builder()
              .accessKeyId(getAccessKeyId())
              .secretAccessKey(getSecretAccessKey())
              .build();

            PaymentCryptographyAsyncClientBuilder builder = PaymentCryptographyAsyncClient.builder();
            builder.region(getAWSRegion())
              .credentialsProvider(StaticCredentialsProvider.create(credentials));

            client = builder.build();
        }

        return client;
    }

    /**
     * Configures the adapter from jPOS configuration.
     * <p>
     * Required configuration properties:
     * <ul>
     *   <li>accessKeyId - AWS access key ID</li>
     *   <li>secretAccessKey - AWS secret access key</li>
     *   <li>region - AWS region</li>
     * </ul>
     * Optional configuration properties:
     * <ul>
     *   <li>timeout - API call timeout in milliseconds (default: 10000)</li>
     *   <li>keyAlgorithm - Key algorithm (tdes-2, tdes-3, aes-128, aes-192, aes-256, default: tdes-3)</li>
     * </ul>
     *
     * @param cfg jPOS configuration object
     * @throws ConfigurationException if required properties are missing or invalid
     */
    @Override
    public void setConfiguration(Configuration cfg) throws ConfigurationException {

        super.setConfiguration(cfg);

        try {

            setTimeout(cfg.getInt("timeout", DEFAULT_TIMEOUT_MS));
            setAccessKeyId(cfg.get("accessKeyId"));
            setSecretAccessKey(cfg.get("secretAccessKey"));
            setRegion(cfg.get("region"));

            if (getAccessKeyId() == null)
                throw new ConfigurationException("Access Key Id not set.");

            if (getSecretAccessKey() == null)
                throw new ConfigurationException("Secret Access Key not set.");

            setKeyAlgorithm(
              Optional.ofNullable(translateKeyAlgorithm(cfg.get("keyAlgorithm", null)))
                .orElse(DEFAULT_KEY_ALGORITHM));
        }
        catch (Exception e) {
            throw new ConfigurationException(e);
        }
    }

    /**
     * Imports a key encrypted under a key encryption key (KEK).
     * <p>
     * The key must be provided as a {@link SecureKeyBlock} and the KEK as a
     * {@link SecureARNKey}. The method imports the key into AWS Payment Cryptography
     * service and returns an ARN reference to the imported key.
     *
     * @param kek the key encryption key used to encrypt the working key
     * @param key the working key to import (must be a SecureKeyBlock)
     * @param keySpec key specification (not used in this implementation)
     * @param checkParity whether to check key parity (not used in this implementation)
     * @return imported key as a SecureARNKey
     * @throws SMException if import fails or unsupported key types are provided
     */
    @Override
    protected SecureKey importKeyImpl(SecureKey kek, SecureKey key, SecureKeySpec keySpec, boolean checkParity)
      throws SMException {

        LogEvent evt = new LogEvent(this, "apc-operation");
        List<Loggeable> params = new ArrayList<>();

        try {

            if (!(key instanceof SecureKeyBlock))
                throw new SMException(String.format("Working key type not supported by this implementation ('%s').",
                  key.getClass().getName()));

            if (!(kek instanceof SecureARNKey))
                throw new SMException(String.format("Key encryption key type not supported by this implementation ('%s').",
                  kek.getClass().getName()));

            SecureARNKey arn = (SecureARNKey) Objects.requireNonNull(kek, "Key encryption key not set.");
            String wkHex = SecureKeyBlockBuilder.newBuilder().toKeyBlock((SecureKeyBlock) key);

            params.add(new SimpleMsg("parameter", "Key encryption key", arn));
            params.add(new SimpleMsg("parameter", "Encrypted key", protectKeyblock((SecureKeyBlock) key)));

            evt.addMessage(new SimpleMsg("command", "Import key", params));

            ImportKeyMaterial material =  ImportKeyMaterial.builder()
              .tr31KeyBlock(ImportTr31KeyBlock.builder()
                .wrappedKeyBlock(wkHex)
                .wrappingKeyIdentifier(arn.getARN())
                .build())
              .build();

            ImportKeyRequest req = ImportKeyRequest.builder()
              .keyMaterial(material)
              .build();

            CompletableFuture<ImportKeyResponse> future = getClient().importKey(req);
            ImportKeyResponse res = future.get(getTimeout(), TimeUnit.MILLISECONDS);

            SecureARNKey workingKeyARN = new SecureARNKey(res.key().keyArn());
            workingKeyARN.setKeyCheckValue(ISOUtil.hex2byte(res.key().keyCheckValue()));

            evt.addMessage(new SimpleMsg("result", "Imported key", workingKeyARN));

            return workingKeyARN;
        }
        catch (Exception e) {
            evt.addMessage(e);
            throw new SMException(e);
        }
        finally {
            Logger.log(evt);
        }
    }

    /**
     * Imports a key encrypted under a key encryption key (KEK).
     * <p>
     * Legacy method for importing DES keys. The key is provided as a byte array
     * and the KEK must be a {@link SecureARNKey}.
     *
     * @param keyLength key length (not used)
     * @param keyType key type (not used)
     * @param encryptedKey encrypted key bytes
     * @param kek key encryption key (must be SecureARNKey)
     * @param checkParity whether to check key parity (not used)
     * @return imported key as SecureARNKey
     * @throws SMException if import fails or unsupported key types are provided
     */
    @Override
    protected SecureDESKey importKeyImpl(short keyLength, String keyType, byte[] encryptedKey, SecureDESKey kek,
                                         boolean checkParity) throws SMException {

        try {

            if (!(kek instanceof SecureARNKey))
                throw new SMException(
                  String.format("Key encryption key type not supported by this implementation ('%s').",
                    kek.getClass().getName()));

            SecureARNKey arn = (SecureARNKey) Objects.requireNonNull(kek, "Key encryption key not set.");
            String wkHex = new String(encryptedKey);

            ImportKeyMaterial material = ImportKeyMaterial.builder()
              .tr31KeyBlock(ImportTr31KeyBlock.builder()
                .wrappedKeyBlock(wkHex)
                .wrappingKeyIdentifier(arn.getARN())
                .build())
              .build();

            ImportKeyRequest req = ImportKeyRequest.builder()
              .keyMaterial(material)
              .build();

            CompletableFuture<ImportKeyResponse> future = getClient().importKey(req);
            ImportKeyResponse res = future.get(getTimeout(), TimeUnit.MILLISECONDS);

            SecureARNKey key = new SecureARNKey(res.key().keyArn());
            key.setKeyCheckValue(ISOUtil.hex2byte(res.key().keyCheckValue()));

            return key;
        }
        catch (Exception e) {
            throw new SMException(e);
        }
    }

    /**
     * Translates a PIN from encryption under one key to encryption under another key.
     * <p>
     * Both keys must be {@link SecureARNKey} instances. The PIN block format
     * can be changed during translation.
     *
     * @param pinUnderKd1 PIN encrypted under the first key
     * @param kd1 first (incoming) key
     * @param kd2 second (outgoing) key
     * @param destinationPINBlockFormat target PIN block format
     * @return PIN encrypted under the second key
     * @throws SMException if translation fails or unsupported formats are provided
     */
    @Override
    protected EncryptedPIN translatePINImpl(EncryptedPIN pinUnderKd1, SecureKey kd1, SecureKey kd2,
                                            byte destinationPINBlockFormat) throws SMException {

        LogEvent evt = new LogEvent(this, "apc-operation");
        List<Loggeable> params = new ArrayList<>();

        try {

            SecureARNKey arn1 = (SecureARNKey) Objects.requireNonNull(kd1, "Incoming key not set.");
            SecureARNKey arn2 = (SecureARNKey) Objects.requireNonNull(kd2, "Outgoing key not set.");

            params.add(new SimpleMsg("parameter", "Incoming PIN block", protectPinblock(pinUnderKd1)));
            params.add(new SimpleMsg("parameter", "Incoming data key", arn1));
            params.add(new SimpleMsg("parameter", "Outgoing data key", arn2));
            params.add(new SimpleMsg("parameter", "Destination PIN block format", destinationPINBlockFormat));

            evt.addMessage(new SimpleMsg("command", "Translate PIN", params));

            TranslatePinDataRequest request = TranslatePinDataRequest.builder()
              .incomingKeyIdentifier(arn1.getARN())
              .outgoingKeyIdentifier(arn2.getARN())
              .incomingTranslationAttributes(getPINBlockFormatForTranslation(pinUnderKd1.getPINBlockFormat(),
                pinUnderKd1.getAccountNumber()))
              .outgoingTranslationAttributes(getPINBlockFormatForTranslation(destinationPINBlockFormat,
                pinUnderKd1.getAccountNumber()))
              .encryptedPinBlock(ISOUtil.byte2hex(pinUnderKd1.getPINBlock()))
              .build();

            Future<TranslatePinDataResponse> future = getDataClient().translatePinData(request);
            TranslatePinDataResponse res = future.get(getTimeout(), TimeUnit.MILLISECONDS);

            EncryptedPIN pinblk = new EncryptedPIN();
            pinblk.setAccountNumber(pinUnderKd1.getAccountNumber());
            pinblk.setPINBlock(ISOUtil.hex2byte(res.pinBlock()));
            pinblk.setPINBlockFormat(destinationPINBlockFormat);

            evt.addMessage(new SimpleMsg("result", "PIN under outgoing key", protectPinblock(pinblk)));

            return pinblk;
        }
        catch (Exception e) {
            evt.addMessage(e);
            throw new SMException(e);
        }
        finally {
            Logger.log(evt);
        }
    }

    /**
     * Generates a new key with the specified key specification.
     *
     * @param keySpec key specification including usage, algorithm, and mode of use
     * @return generated key as SecureARNKey
     * @throws SMException if key generation fails
     */
    @Override
    protected SecureKey generateKeyImpl(SecureKeySpec keySpec) throws SMException {

        try {

            KeyAttributes attr = KeyAttributes.builder()
              .keyUsage(getKeyUsage(keySpec.getKeyUsage()))
              .keyAlgorithm(getKeyAlgorithm())
              .keyModesOfUse(getKeyModeOfUse(keySpec.getModeOfUse()))
              .keyClass(KeyClass.SYMMETRIC_KEY)
              .build();

            CreateKeyRequest req = CreateKeyRequest.builder()
              .enabled(true)
              .exportable(true)
              .keyAttributes(attr)
              .keyCheckValueAlgorithm(keySpec.getAlgorithm().equals(Algorithm.AES) ? KeyCheckValueAlgorithm.CMAC
                : KeyCheckValueAlgorithm.ANSI_X9_24)
              .build();

            CompletableFuture<CreateKeyResponse> future = getClient().createKey(req);
            CreateKeyResponse res = future.get(getTimeout(), TimeUnit.MILLISECONDS);

            SecureARNKey key = new SecureARNKey(res.key().keyArn());
            key.setKeyType(keySpec.getKeyType());
            key.setKeyCheckValue(ISOUtil.hex2byte(res.key().keyCheckValue()));

            return key;
        }
        catch (Exception e) {
            throw new SMException(e);
        }
    }

    /**
     * Generates a new key with the specified key length and type.
     * <p>
     * Legacy method for generating DES keys.
     *
     * @param keyLength key length (not used)
     * @param keyType key type
     * @return generated key as SecureARNKey
     * @throws SMException if key generation fails
     */
    @Override
    protected SecureDESKey generateKeyImpl(short keyLength, String keyType) throws SMException {

        try {

            KeyAttributes attr = KeyAttributes.builder()
              .keyUsage(getKeyUsage(keyType))
              .keyAlgorithm(getKeyAlgorithm())
              .keyModesOfUse(getKeyModeOfUse(keyType))
              .keyClass(KeyClass.SYMMETRIC_KEY)
              .build();

            CreateKeyRequest req = CreateKeyRequest.builder()
              .enabled(true)
              .exportable(true)
              .keyAttributes(attr)
              .keyCheckValueAlgorithm(
                isAES(attr) ? KeyCheckValueAlgorithm.CMAC : KeyCheckValueAlgorithm.ANSI_X9_24)
              .build();

            CompletableFuture<CreateKeyResponse> future = getClient().createKey(req);
            CreateKeyResponse res = future.get(getTimeout(), TimeUnit.MILLISECONDS);

            SecureARNKey key = new SecureARNKey(res.key().keyArn());
            key.setKeyType(keyType);
            key.setKeyCheckValue(ISOUtil.hex2byte(res.key().keyCheckValue()));

            return key;
        }
        catch (Exception e) {
            throw new SMException(e);
        }
    }

    /**
     * Verifies a CVV (Card Verification Value).
     * <p>
     * Supports CVV1 and CVV2 verification. For CVV2, service code should be "000".
     *
     * @param accountNo primary account number
     * @param cvkA CVK-A key (must be SecureARNKey)
     * @param cvkB CVK-B key (not used in this implementation)
     * @param cvv CVV value to verify
     * @param expDate expiration date (YYMM format)
     * @param serviceCode service code
     * @return true if CVV is valid, false otherwise
     * @throws SMException if verification fails due to technical error
     */
    @Override
    protected boolean verifyCVVImpl(String accountNo, SecureKey cvkA, SecureKey cvkB, String cvv, String expDate,
                                    String serviceCode) throws SMException {

        try {

            SecureARNKey cvk = (SecureARNKey) Objects.requireNonNull(cvkA, "CVK not set.");
            CardVerificationAttributes.Builder attrBuilder = CardVerificationAttributes.builder();

            if ("000".equals(serviceCode)) {
                // CVV2.
                CardVerificationValue2 cvv2Attr = CardVerificationValue2.builder()
                  .cardExpiryDate(expDate)
                  .build();
                attrBuilder.cardVerificationValue2(cvv2Attr);
            }
            else {
                // CVV (or CVV3).
                CardVerificationValue1 cvv1Attr = CardVerificationValue1.builder()
                  .cardExpiryDate(expDate)
                  .serviceCode(serviceCode)
                  .build();
                attrBuilder.cardVerificationValue1(cvv1Attr);
            }

            VerifyCardValidationDataRequest req = VerifyCardValidationDataRequest.builder()
              .keyIdentifier(cvk.getARN())
              .primaryAccountNumber(accountNo)
              .validationData(cvv)
              .verificationAttributes(attrBuilder.build())
              .build();

            CompletableFuture<VerifyCardValidationDataResponse> future = getDataClient().verifyCardValidationData(req);
            future.get(getTimeout(), TimeUnit.MILLISECONDS);

            return true;
        }
        catch (CompletionException | ExecutionException e) {
            if (e.getCause() instanceof VerificationFailedException)
                return false;
            else
                throw new SMException(e);
        }
        catch (Exception e) {
            throw new SMException(e);
        }
    }

    /**
     * Calculates a CVD (Card Verification Data).
     *
     * @param accountNo primary account number
     * @param cvkA CVK-A key (must be SecureARNKey)
     * @param cvkB CVK-B key (not used in this implementation)
     * @param expDate expiration date (YYMM format)
     * @param serviceCode service code
     * @return calculated CVD value
     * @throws SMException if calculation fails
     */
    @Override
    protected String calculateCVDImpl(String accountNo, SecureKey cvkA, SecureKey cvkB,
                                      String expDate, String serviceCode) throws SMException {

        try {

            SecureARNKey cvk = (SecureARNKey) Objects.requireNonNull(cvkA, "CVK not set.");

            CardGenerationAttributes attr = CardGenerationAttributes.builder()
              .cardVerificationValue1(CardVerificationValue1.builder()
                .serviceCode(serviceCode)
                .cardExpiryDate(expDate)
                .build())
              .build();

            GenerateCardValidationDataRequest req = GenerateCardValidationDataRequest.builder()
              .keyIdentifier(cvk.getARN())
              .primaryAccountNumber(accountNo)
              .validationDataLength(3)
              .generationAttributes(attr)
              .build();

            CompletableFuture<GenerateCardValidationDataResponse> future = getDataClient()
              .generateCardValidationData(req);
            GenerateCardValidationDataResponse rsp = future.get(getTimeout(), TimeUnit.MILLISECONDS);

            return rsp.validationData();
        }
        catch (Exception e) {
            throw new SMException(e);
        }
    }

    /**
     * Calculates a CVV (Card Verification Value).
     *
     * @param accountNo primary account number
     * @param cvkA CVK-A key (must be SecureARNKey)
     * @param cvkB CVK-B key (not used in this implementation)
     * @param expDate expiration date
     * @param serviceCode service code
     * @return calculated CVV value
     * @throws SMException if calculation fails
     */
    @Override
    protected String calculateCVVImpl(String accountNo, SecureKey cvkA, SecureKey cvkB, Date expDate,
                                      String serviceCode) throws SMException {

        try {

            SecureARNKey cvk = (SecureARNKey) Objects.requireNonNull(cvkA, "CVK not set.");

            CardGenerationAttributes attr = CardGenerationAttributes.builder()
              .cardVerificationValue1(CardVerificationValue1.builder()
                .serviceCode(serviceCode)
                .cardExpiryDate(ISODate.getExpirationDate(expDate))
                .build())
              .build();

            GenerateCardValidationDataRequest req = GenerateCardValidationDataRequest.builder()
              .keyIdentifier(cvk.getARN())
              .primaryAccountNumber(accountNo)
              .validationDataLength(3)
              .generationAttributes(attr)
              .build();

            CompletableFuture<GenerateCardValidationDataResponse> future = getDataClient()
              .generateCardValidationData(req);
            GenerateCardValidationDataResponse rsp = future.get(getTimeout(), TimeUnit.MILLISECONDS);

            return rsp.validationData();
        }
        catch (Exception e) {
            throw new SMException(e);
        }
    }

    /**
     * Verifies a PVV (PIN Verification Value).
     *
     * @param pinUnderKd PIN encrypted under data key
     * @param kd data key (PEK, must be SecureARNKey)
     * @param pvkA PVK-A key (must be SecureARNKey)
     * @param pvkB PVK-B key (not used in this implementation)
     * @param pvki PIN verification key index (1-6)
     * @param pvv PVV value to verify
     * @return true if PVV is valid, false otherwise
     * @throws SMException if verification fails due to technical error
     */
    @Override
    protected boolean verifyPVVImpl(EncryptedPIN pinUnderKd, SecureKey kd, SecureKey pvkA, SecureKey pvkB, int pvki,
                                    String pvv) throws SMException {

        try {

            SecureARNKey pvk = (SecureARNKey) Objects.requireNonNull(pvkA, "PVK not set.");
            SecureARNKey pek = (SecureARNKey) Objects.requireNonNull(kd, "PEK not set.");

            PinVerificationAttributes attr = PinVerificationAttributes.builder()
              .visaPin(VisaPinVerification.builder()
                .pinVerificationKeyIndex(pvki)
                .verificationValue(pvv)
                .build())
              .build();

            VerifyPinDataRequest req = VerifyPinDataRequest.builder()
              .encryptedPinBlock(ISOUtil.hexString(pinUnderKd.getPINBlock()))
              .encryptionKeyIdentifier(pek.getARN())
              .primaryAccountNumber(pinUnderKd.getAccountNumber())
              .pinDataLength(4)
              .pinBlockFormat(getPINBlockFormat(pinUnderKd.getPINBlockFormat()))
              .verificationAttributes(attr)
              .verificationKeyIdentifier(pvk.getARN())
              .build();

            CompletableFuture<VerifyPinDataResponse> future = getDataClient().verifyPinData(req);
            future.get(getTimeout(), TimeUnit.MILLISECONDS);

            return true;
        }
        catch (CompletionException | ExecutionException e) {
            if (e.getCause() instanceof VerificationFailedException)
                return false;
            else
                throw new SMException(e);
        }
        catch (Exception e) {
            throw new SMException(e);
        }
    }

    /**
     * Calculates a PVV (PIN Verification Value).
     *
     * @param pinUnderKd PIN encrypted under data key
     * @param kd data key (PEK, must be SecureARNKey)
     * @param pvkA PVK-A key (must be SecureARNKey)
     * @param pvkB PVK-B key (not used in this implementation)
     * @param pvki PIN verification key index (1-6)
     * @param excludes list of PVVs to exclude (not used in this implementation)
     * @return calculated PVV value
     * @throws SMException if calculation fails
     */
    @Override
    protected String calculatePVVImpl(EncryptedPIN pinUnderKd, SecureKey kd, SecureKey pvkA, SecureKey pvkB,
                                      int pvki, List<String> excludes) throws SMException {

        try {

            SecureARNKey pvk = (SecureARNKey) Objects.requireNonNull(pvkA, "PVK not set.");
            SecureARNKey pek = (SecureARNKey) Objects.requireNonNull(kd, "PEK not set.");

            PinGenerationAttributes attr = PinGenerationAttributes.builder()
              .visaPinVerificationValue(VisaPinVerificationValue.builder()
                .encryptedPinBlock(ISOUtil.hexString(pinUnderKd.getPINBlock()))
                .pinVerificationKeyIndex(pvki)
                .build())
              .build();

            GeneratePinDataRequest req = GeneratePinDataRequest.builder()
              .encryptionKeyIdentifier(pek.getARN())
              .primaryAccountNumber(pinUnderKd.getAccountNumber())
              .pinDataLength(4)
              .pinBlockFormat(getPINBlockFormat(pinUnderKd.getPINBlockFormat()))
              .generationAttributes(attr)
              .generationKeyIdentifier(pvk.getARN())
              .build();

            CompletableFuture<GeneratePinDataResponse> future = getDataClient().generatePinData(req);
            GeneratePinDataResponse rsp = future.get(getTimeout(), TimeUnit.MILLISECONDS);

            return rsp.pinData().verificationValue();
        }
        catch (Exception e) {
            throw new SMException(e);
        }
    }

    /**
     * Verifies an ARQC (Authorization Request Cryptogram) and generates an ARPC (Authorization Response Cryptogram).
     *
     * @param mkdm master key derivation method
     * @param skdm session key derivation method
     * @param imkac issuer master key for application cryptograms (must be SecureARNKey)
     * @param accountNo primary account number
     * @param acctSeqNo PAN sequence number
     * @param arqc authorization request cryptogram
     * @param atc application transaction counter
     * @param upn unpredictable number
     * @param transData transaction data
     * @param arpcMethod ARPC generation method (only METHOD_1 supported)
     * @param arc authorization response code
     * @param propAuthData proprietary authentication data (not used)
     * @return generated ARPC
     * @throws SMException if verification fails or unsupported methods are specified
     */
    @Override
    protected byte[] verifyARQCGenerateARPCImpl(MKDMethod mkdm, SKDMethod skdm, SecureKey imkac, String accountNo,
                                                String acctSeqNo, byte[] arqc, byte[] atc, byte[] upn, byte[] transData, ARPCMethod arpcMethod, byte[] arc,
                                                byte[] propAuthData) throws SMException {

        try {

            SecureARNKey imkacArn = (SecureARNKey) Objects.requireNonNull(imkac, "IMK-AC not set.");

            CryptogramAuthResponse.Builder authRspBuilder = CryptogramAuthResponse.builder();

            switch (arpcMethod) {
                case METHOD_1:
                    authRspBuilder.arpcMethod1(CryptogramVerificationArpcMethod1.builder()
                      .authResponseCode(ISOUtil.hexString(arc))
                      .build());
                    break;
                default:
                    throw new SMException(String.format("Unsupported ARPC method ('%s').", arpcMethod.name()));
            }

            VerifyAuthRequestCryptogramRequest.Builder reqBuilder = VerifyAuthRequestCryptogramRequest.builder()
              .transactionData(ISOUtil.hexString(transData))
              .keyIdentifier(imkacArn.getARN())
              .authResponseAttributes(authRspBuilder.build())
              .authRequestCryptogram(ISOUtil.hexString(arqc));

            prepareMasterKeyDerivation(mkdm, reqBuilder);
            prepareSessionKeyDerivation(skdm, accountNo, acctSeqNo, atc, upn, reqBuilder);

            CompletableFuture<VerifyAuthRequestCryptogramResponse> future = getDataClient()
              .verifyAuthRequestCryptogram(reqBuilder.build());

            VerifyAuthRequestCryptogramResponse rsp = future.get(getTimeout(), TimeUnit.MILLISECONDS);

            return ISOUtil.hex2byte(rsp.authResponseValue());
        }
        catch (CompletionException | ExecutionException e) {
            if (e.getCause() instanceof VerificationFailedException)
                throw new SMException("ARQC verification did not pass.");
            else
                throw new SMException(e);
        }
        catch (Exception e) {
            throw new SMException(e);
        }
    }

    /**
     * Configures the master key derivation method in the ARQC verification request.
     *
     * @param mkdm master key derivation method
     * @param reqBuilder ARQC verification request builder
     * @throws SMException if unsupported method is specified
     */
    protected void prepareMasterKeyDerivation(MKDMethod mkdm, VerifyAuthRequestCryptogramRequest.Builder reqBuilder)
      throws SMException {

        switch (mkdm) {
            case OPTION_A:
                reqBuilder.majorKeyDerivationMode(MajorKeyDerivationMode.EMV_OPTION_A);
                break;
            case OPTION_B:
                reqBuilder.majorKeyDerivationMode(MajorKeyDerivationMode.EMV_OPTION_B);
                break;
            default:
                throw new SMException(String.format("Unsupported master key derivation method ('%s').", mkdm.name()));
        }
    }

    /**
     * Configures the session key derivation method in the ARQC verification request.
     *
     * @param skdm session key derivation method
     * @param accountNo primary account number
     * @param acctSeqNo PAN sequence number
     * @param atc application transaction counter
     * @param upn unpredictable number
     * @param reqBuilder ARQC verification request builder
     * @throws SMException if unsupported method is specified
     */
    protected void prepareSessionKeyDerivation(SKDMethod skdm, String accountNo, String acctSeqNo, byte[] atc,
                                               byte[] upn, VerifyAuthRequestCryptogramRequest.Builder reqBuilder) throws SMException {

        switch (skdm) {
            case EMV_CSKD:
                reqBuilder.sessionKeyDerivationAttributes(SessionKeyDerivation.builder()
                  .emvCommon(SessionKeyEmvCommon.builder()
                    .applicationTransactionCounter(ISOUtil.hexString(atc))
                    .panSequenceNumber(acctSeqNo)
                    .primaryAccountNumber(accountNo)
                    .build())
                  .build());
                break;
            case EMV2000_SKM:
                reqBuilder.sessionKeyDerivationAttributes(SessionKeyDerivation.builder()
                  .emv2000(SessionKeyEmv2000.builder()
                    .applicationTransactionCounter(ISOUtil.hexString(atc))
                    .panSequenceNumber(acctSeqNo)
                    .primaryAccountNumber(accountNo)
                    .build())
                  .build());
                break;
            case VSDC:
                reqBuilder.sessionKeyDerivationAttributes(SessionKeyDerivation.builder()
                  .visa(SessionKeyVisa.builder()
                    .panSequenceNumber(acctSeqNo)
                    .primaryAccountNumber(accountNo)
                    .build())
                  .build());
                break;
            case MCHIP:
                reqBuilder.sessionKeyDerivationAttributes(SessionKeyDerivation.builder()
                  .mastercard(SessionKeyMastercard.builder()
                    .applicationTransactionCounter(ISOUtil.hexString(atc))
                    .unpredictableNumber(ISOUtil.hexString(upn))
                    .panSequenceNumber(acctSeqNo)
                    .primaryAccountNumber(accountNo)
                    .build())
                  .build());
                break;
            case AEPIS_V40:
                reqBuilder.sessionKeyDerivationAttributes(SessionKeyDerivation.builder()
                  .amex(SessionKeyAmex.builder()
                    .panSequenceNumber(acctSeqNo)
                    .primaryAccountNumber(accountNo)
                    .build())
                  .build());
                break;
            default:
                throw new SMException(String.format("Unsupported session key derivation method ('%s').", skdm.name()));
        }
    }

    /**
     * Checks if a key algorithm is AES-based.
     *
     * @param attr key attributes
     * @return true if algorithm is AES-128, AES-192, or AES-256
     */
    protected boolean isAES(KeyAttributes attr) {
        return KeyAlgorithm.AES_128.equals(attr.keyAlgorithm()) ||
          KeyAlgorithm.AES_192.equals(attr.keyAlgorithm()) ||
          KeyAlgorithm.AES_256.equals(attr.keyAlgorithm());
    }

    /**
     * Converts jPOS PIN block format to AWS translation format.
     *
     * @param format jPOS PIN block format (FORMAT01 or FORMAT03)
     * @param pan primary account number
     * @return AWS translation ISO format
     * @throws SMException if unsupported format is specified
     */
    protected TranslationIsoFormats getPINBlockFormatForTranslation(byte format, String pan) throws SMException {

        Objects.requireNonNull(pan, "Primary account number not set.");

        switch (format) {
            case SMAdapter.FORMAT01:
                return TranslationIsoFormats
                  .fromIsoFormat0(TranslationPinDataIsoFormat034.builder()
                    .primaryAccountNumber(pan)
                    .build());
            case SMAdapter.FORMAT03:
                return TranslationIsoFormats
                  .fromIsoFormat3(TranslationPinDataIsoFormat034.builder()
                    .primaryAccountNumber(pan)
                    .build());
            default:
                throw new SMException(String.format("Unsupported PIN block format '%d'.", format));
        }
    }

    /**
     * Converts jPOS PIN block format to AWS PIN block format string.
     *
     * @param format jPOS PIN block format (FORMAT01 or FORMAT03)
     * @return AWS PIN block format name
     * @throws SMException if unsupported format is specified
     */
    protected String getPINBlockFormat(byte format) throws SMException {

        switch (format) {
            case SMAdapter.FORMAT01:
                return PinBlockFormatForPinData.ISO_FORMAT_0.name();
            case SMAdapter.FORMAT03:
                return PinBlockFormatForPinData.ISO_FORMAT_3.name();
            default:
                throw new SMException(String.format("Unsupported PIN block format '%d'.", format));
        }
    }

    /**
     * Translates key algorithm string to AWS KeyAlgorithm enum.
     *
     * @param ka algorithm string (tdes-2, tdes-3, aes-128, aes-192, aes-256)
     * @return corresponding KeyAlgorithm
     * @throws SMException if unknown algorithm string is provided
     */
    protected static KeyAlgorithm translateKeyAlgorithm(String ka) throws SMException {
        if (ka == null)
            return null;
        switch(ka) {
            case "tdes-2":
                return KeyAlgorithm.TDES_2_KEY;
            case "tdes-3":
                return KeyAlgorithm.TDES_3_KEY;
            case "aes-128":
                return KeyAlgorithm.AES_128;
            case "aes-192":
                return KeyAlgorithm.AES_192;
            case "aes-256":
                return KeyAlgorithm.AES_256;
            default:
                throw new SMException(String.format("Unknown key algorithm '%s'.", ka));
        }
    }

    /**
     * Converts jPOS ModeOfUse to AWS KeyModesOfUse.
     *
     * @param use jPOS mode of use
     * @return AWS key modes of use
     */
    protected static KeyModesOfUse getKeyModeOfUse(ModeOfUse use) {

        KeyModesOfUse.Builder builder = KeyModesOfUse.builder();

        switch(use) {
            case GENVER:
                builder.generate(true).verify(true);
                break;
            case DECONLY:
                builder.decrypt(true);
                break;
            case ENCDEC:
                builder.encrypt(true).decrypt(true);
                break;
            case GENSIGN:
                builder.generate(true).sign(true);
                break;
            case SIGNVER:
                builder.sign(true).verify(true);
                break;
            case VERONLY:
                builder.verify(true);
                break;
            default:
                builder.noRestrictions(true);
        }

        return builder.build();
    }

    /**
     * Converts jPOS key type to AWS KeyModesOfUse.
     *
     * @param keyType jPOS key type
     * @return AWS key modes of use
     */
    protected static KeyModesOfUse getKeyModeOfUse(String keyType) {

        KeyModesOfUse.Builder builder = KeyModesOfUse.builder();

        switch(keyType) {
            case SMAdapter.TYPE_BDK:
                builder.deriveKey(true);
                break;
            case SMAdapter.TYPE_CVK:
                builder.generate(true).verify(true);
                break;
            case SMAdapter.TYPE_DEK:
                builder.encrypt(true).decrypt(true);
                break;
            case SMAdapter.TYPE_PVK:
                builder.generate(true).verify(true);
                break;
            case SMAdapter.TYPE_TPK:
                builder.encrypt(true).decrypt(true);
                break;
            case SMAdapter.TYPE_ZPK:
                builder.encrypt(true).decrypt(true).wrap(false).unwrap(false);
                break;
            case SMAdapter.TYPE_TMK:
                builder.encrypt(true).decrypt(true).wrap(true).unwrap(true);
                break;
            case SMAdapter.TYPE_ZMK:
                builder.encrypt(true).decrypt(true).wrap(true).unwrap(true);
            default:
                builder.noRestrictions(true);
        }

        return builder.build();
    }

    /**
     * Converts jPOS KeyUsage to AWS KeyUsage.
     *
     * @param keyUsage jPOS key usage
     * @return AWS key usage
     */
    private KeyUsage getKeyUsage(org.jpos.security.KeyUsage keyUsage) {
        if (org.jpos.security.KeyUsage.BDK.equals(keyUsage))
            return KeyUsage.TR31_B0_BASE_DERIVATION_KEY;
        else if (org.jpos.security.KeyUsage.CVK.equals(keyUsage))
            return KeyUsage.TR31_C0_CARD_VERIFICATION_KEY;
        else if (org.jpos.security.KeyUsage.ENC.equals(keyUsage))
            return KeyUsage.TR31_D0_SYMMETRIC_DATA_ENCRYPTION_KEY;
        else if (org.jpos.security.KeyUsage.PINVER.equals(keyUsage))
            return KeyUsage.TR31_V2_VISA_PIN_VERIFICATION_KEY;
        else
            return KeyUsage.UNKNOWN_TO_SDK_VERSION;
    }

    /**
     * Converts jPOS key type to AWS KeyUsage.
     *
     * @param keyType jPOS key type
     * @return AWS key usage
     */
    protected static KeyUsage getKeyUsage(String keyType) {

        switch(keyType) {
            case SMAdapter.TYPE_BDK:
                return KeyUsage.TR31_B0_BASE_DERIVATION_KEY;
            case SMAdapter.TYPE_CVK:
                return KeyUsage.TR31_C0_CARD_VERIFICATION_KEY;
            case SMAdapter.TYPE_DEK:
                return KeyUsage.TR31_D0_SYMMETRIC_DATA_ENCRYPTION_KEY;
            case SMAdapter.TYPE_PVK:
                return KeyUsage.TR31_V2_VISA_PIN_VERIFICATION_KEY;
            case SMAdapter.TYPE_TPK:
                return KeyUsage.TR31_P0_PIN_ENCRYPTION_KEY;
            case SMAdapter.TYPE_ZPK:
                return KeyUsage.TR31_P0_PIN_ENCRYPTION_KEY;
            case SMAdapter.TYPE_TMK:
                return KeyUsage.TR31_K0_KEY_ENCRYPTION_KEY;
            case SMAdapter.TYPE_ZMK:
                return KeyUsage.TR31_K0_KEY_ENCRYPTION_KEY;
            case SMAdapter.TYPE_MK_AC:
                return KeyUsage.TR31_E0_EMV_MKEY_APP_CRYPTOGRAMS;
            case SMAdapter.TYPE_MK_SMI:
                return KeyUsage.TR31_E2_EMV_MKEY_INTEGRITY;
            case SMAdapter.TYPE_MK_SMC:
                return KeyUsage.TR31_E1_EMV_MKEY_CONFIDENTIALITY;
            default:
                return KeyUsage.UNKNOWN_TO_SDK_VERSION;
        }
    }

    /**
     * Converts region string to AWS Region enum.
     *
     * @return AWS Region for the configured region string, or null if not recognized
     */
    protected Region getAWSRegion() {
        switch (getRegion()) {
            case "us-east-1":
                return Region.US_EAST_1;
            case "us-east-2":
                return Region.US_EAST_2;
            case "us-west-1":
                return Region.US_WEST_1;
            case "us-west-2":
                return Region.US_WEST_2;
            default:
                return null;
        }
    }

    /**
     * Creates a masked representation of a key block for logging.
     * <p>
     * The key value itself is masked with asterisks, but header and MAC are visible.
     *
     * @param key key block to protect
     * @return masked string representation
     */
    protected static String protectKeyblock(SecureKeyBlock key) {

        if (key == null)
            return "";

        String mask = "*************************";

        try {

            StringBuilder sb = new StringBuilder();

            sb.append(key.getKeyBlockVersion());
            sb.append(String.format("%04d", key.getKeyBlockLength()));
            sb.append(key.getKeyUsage().getCode());
            sb.append(key.getAlgorithm().getCode());
            sb.append(key.getModeOfUse().getCode());
            sb.append(key.getKeyVersion());
            sb.append(key.getExportability().getCode());

            return sb.toString() + mask + ISOUtil.hexString(key.getKeyBlockMAC());
        }
        catch (Exception e) {
            return mask;
        }
    }

    /**
     * Creates a masked representation of a PIN block for logging.
     * <p>
     * Only the first 2 characters (format) are visible, the rest are masked.
     *
     * @param pinUnderKd1 PIN block to protect
     * @return masked string representation
     */
    protected static String protectPinblock(EncryptedPIN pinUnderKd1) {
        if (pinUnderKd1 == null)
            return "";
        String pb = ISOUtil.hexString(pinUnderKd1.getPINBlock());
        return pb.substring(0, 2) + "*".repeat(pb.length() - 2);
    }
}