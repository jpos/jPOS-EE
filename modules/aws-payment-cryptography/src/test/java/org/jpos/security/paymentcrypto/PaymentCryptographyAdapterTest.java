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

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.containsStringIgnoringCase;
import static org.hamcrest.CoreMatchers.nullValue;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyLong;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;

import org.jpos.iso.ISOUtil;
import org.jpos.security.EncryptedPIN;
import org.jpos.security.Exportability;
import org.jpos.security.SMAdapter;
import org.jpos.security.SMException;
import org.jpos.security.SecureARNKey;
import org.jpos.security.SecureDESKey;
import org.jpos.security.SecureKey;
import org.jpos.security.SecureKeyBlock;
import org.jpos.security.SecureKeyBlockBuilder;
import org.jpos.security.SecureKeySpec;
import org.jpos.util.SimpleLogListener;
import org.junit.jupiter.api.Test;

import software.amazon.awssdk.regions.Region;
import software.amazon.awssdk.services.paymentcryptography.PaymentCryptographyAsyncClient;
import software.amazon.awssdk.services.paymentcryptography.model.ImportKeyRequest;
import software.amazon.awssdk.services.paymentcryptography.model.ImportKeyResponse;
import software.amazon.awssdk.services.paymentcryptography.model.Key;
import software.amazon.awssdk.services.paymentcryptographydata.PaymentCryptographyDataAsyncClient;
import software.amazon.awssdk.services.paymentcryptographydata.model.PinBlockFormatForPinData;
import software.amazon.awssdk.services.paymentcryptographydata.model.TranslatePinDataRequest;
import software.amazon.awssdk.services.paymentcryptographydata.model.TranslatePinDataResponse;
import software.amazon.awssdk.services.paymentcryptographydata.model.TranslationIsoFormats;

public class PaymentCryptographyAdapterTest {
    private static final String MADEUP_ARN_KEY = "arn:aws:kms:us-west-2:111122223333:key/11111111-12ab-aaaa-56ef-1234567890ab"; // made up ARN, this is not a real credential

    @Test
    public void test_getPINBlockFormatForTranslation() throws SMException {

        PaymentCryptographyAdapter adapter = new PaymentCryptographyAdapter();
        TranslationIsoFormats format = adapter.getPINBlockFormatForTranslation(SMAdapter.FORMAT01, "4000000000000000");

        assertThat(format, is(notNullValue()));
        assertThat(format.isoFormat0(), is(notNullValue()));
        assertThat(format.isoFormat0().primaryAccountNumber(), is("4000000000000000"));

        assertThrows(NullPointerException.class, () -> {
            adapter.getPINBlockFormatForTranslation(SMAdapter.FORMAT01, null);
        });

        assertThrows(SMException.class, () -> {
            adapter.getPINBlockFormatForTranslation(SMAdapter.FORMAT02, "4000000000000000");
        });
    }

    @Test
    public void test_getPINBlockFormat() throws SMException {

        PaymentCryptographyAdapter adapter = new PaymentCryptographyAdapter();

        Throwable t = assertThrows(SMException.class, () -> {
            adapter.getPINBlockFormat(SMAdapter.FORMAT00);
        });

        assertThat(t.getMessage(), containsStringIgnoringCase("unsupported"));

        String format = adapter.getPINBlockFormat(SMAdapter.FORMAT01);
        assertThat(format, is(PinBlockFormatForPinData.ISO_FORMAT_0.name()));

        format = adapter.getPINBlockFormat(SMAdapter.FORMAT03);
        assertThat(format, is(PinBlockFormatForPinData.ISO_FORMAT_3.name()));
    }

    @Test
    public void test_importKeyImpl_invalid_key_type() {
        PaymentCryptographyAdapter adapter = new PaymentCryptographyAdapter();
        assertThrows(SMException.class, () -> {
            adapter.importKey(new SecureARNKey(), new SecureDESKey(), new SecureKeySpec(), false);
        });
    }

    @Test
    public void test_getAWSRegion() {
        PaymentCryptographyAdapter adapter = new PaymentCryptographyAdapter();
        adapter.setRegion("us-east-1");
        assertThat(adapter.getAWSRegion(), is(Region.US_EAST_1));
        adapter.setRegion("us-east-2");
        assertThat(adapter.getAWSRegion(), is(Region.US_EAST_2));
        adapter.setRegion("us-west-1");
        assertThat(adapter.getAWSRegion(), is(Region.US_WEST_1));
        adapter.setRegion("us-west-2");
        assertThat(adapter.getAWSRegion(), is(Region.US_WEST_2));
        adapter.setRegion("unknown");
        assertThat(adapter.getAWSRegion(), is(nullValue()));
    }

    @Test
    public void test_protectKeyblock() {
        SecureKeyBlock kb = SecureKeyBlockBuilder.newBuilder().build("B0128B1TX00N0300KS18FFFF00A0200001E00000KC0C000169E3KP0C00ECAD626F9F1A826814AA066D86C8C18BD0E14033E1EBEC75BEDF586E6E325F3AA8C0E5");

        String protectedKb = PaymentCryptographyAdapter.protectKeyblock(kb);
        
        System.out.println(SecureKeyBlockBuilder.newBuilder().toKeyBlock(kb));
        System.out.println(protectedKb);

        assertThat(SecureKeyBlockBuilder.newBuilder().toKeyBlock(kb), not(equalTo(protectedKb)));
    }

    @Test
    public void test_protectPinblock() {
        EncryptedPIN pin = new EncryptedPIN("1234567890123456", SMAdapter.FORMAT01, "40000000000000001");
        String protectedPin = PaymentCryptographyAdapter.protectPinblock(pin); 
        System.out.println(protectedPin);
        assertThat(protectedPin, is("12**************"));
    }

    @Test
    public void test_importKeyImpl() throws InterruptedException, ExecutionException, TimeoutException, SMException {

        PaymentCryptographyAsyncClient mockClient = mock(PaymentCryptographyAsyncClient.class);

        @SuppressWarnings("unchecked")
        CompletableFuture<ImportKeyResponse> future = mock(CompletableFuture.class); 

        ImportKeyResponse importedKey = ImportKeyResponse
                .builder().key(Key.builder()
                        .keyArn(MADEUP_ARN_KEY)
                        .keyCheckValue("112244")
                        .build())
                .build();

        when(mockClient.importKey(any(ImportKeyRequest.class))).thenReturn(future);
        when(future.get(anyLong(), any())).thenReturn(importedKey);

        PaymentCryptographyAdapter adapter = new PaymentCryptographyAdapter() {
            @Override
            protected PaymentCryptographyAsyncClient getClient() {
                return mockClient;
            }
        };

        org.jpos.util.Logger logger = new org.jpos.util.Logger();
        logger.addListener(new SimpleLogListener());

        adapter.setLogger(logger, "apc-adapter");

        SecureARNKey kek = new SecureARNKey(MADEUP_ARN_KEY);

        SecureKeyBlock encryptedKey = SecureKeyBlockBuilder.newBuilder().build("B0128B1TX00N0300KS18FFFF00A0200001E00000KC0C000169E3KP0C00ECAD626F9F1A826814AA066D86C8C18BD0E14033E1EBEC75BEDF586E6E325F3AA8C0E5");

        SecureKeySpec spec = new SecureKeySpec();
        spec.setExportability(Exportability.NONE);
        spec.setKeyType(SMAdapter.TYPE_ZPK);

        SecureKey resKey = adapter.importKey(kek, encryptedKey, spec, false);

        assertThat(((SecureARNKey)resKey).getARN(), is(importedKey.key().keyArn()));

        assertThat(ISOUtil.hexString((resKey).getKeyCheckValue()),
                is(importedKey.key().keyCheckValue()));
    }

    @Test
    public void test_translatePINImpl() throws InterruptedException, ExecutionException, TimeoutException, SMException {

        String translatedPin = "2222222222222222";
        PaymentCryptographyDataAsyncClient mockClient = mock(PaymentCryptographyDataAsyncClient.class);

        @SuppressWarnings("unchecked")
        CompletableFuture<TranslatePinDataResponse> future = mock(CompletableFuture.class); 

        TranslatePinDataResponse translatePinResponse = TranslatePinDataResponse.builder()
                .pinBlock(translatedPin)
                .build();

        when(mockClient.translatePinData(any(TranslatePinDataRequest.class))).thenReturn(future);
        when(future.get(anyLong(), any())).thenReturn(translatePinResponse);

        PaymentCryptographyAdapter adapter = new PaymentCryptographyAdapter() {
            @Override
            protected PaymentCryptographyDataAsyncClient getDataClient() {
                return mockClient;
            }
        };

        org.jpos.util.Logger logger = new org.jpos.util.Logger();
        logger.addListener(new SimpleLogListener());
        adapter.setLogger(logger, "apc-adapter");

        EncryptedPIN incomingPin = new EncryptedPIN("1234567890123456", SMAdapter.FORMAT01, "40000000000000001");

        SecureARNKey incomingKey = new SecureARNKey(
                "arn:aws:kms:us-west-2:AAAAAAAAAAAA:key/11111111-12ab-aaaa-56ef-1234567890ab");

        SecureARNKey outgoingKey = new SecureARNKey(
                "arn:aws:kms:us-west-2:BBBBBBBBBBBB:key/99999999-12ab-aaaa-56ef-1234567890ab");

        EncryptedPIN encPIN = adapter.translatePIN(incomingPin, incomingKey, outgoingKey, SMAdapter.FORMAT01);

        assertThat(ISOUtil.hexString(encPIN.getPINBlock()), is(translatedPin));
    }
}
