/*
 * jPOS Project [http://jpos.org]
 * Copyright (C) 2000-2021 jPOS Software SRL
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

package org.jpos.rest;

public enum RestConstants {
    CHART("jcard"),
    JOURNAL("jcard"),
    CUSTOMERS_ACCOUNT("21"),
    TEXT_PATTERN("^.{0,255}$"),
    TEXT50_PATTERN("^[\\w\\s.\\-\']{0,50}$"),
    PHONE_PATTERN("^[\\w\\s.\\-\']{0,16}$"),
    COUNTRY_CODE_PATTERN("^[\\w\\s.\\-\']{0,3}$"),
    NAME_PATTERN("^[^\\!\\@\\$\\%\\^\\&\\*\\(\\)\\+\\=\\|\\<\\>\\?\\{\\}\\[\\]\\~\"\\:\\;\\_]{0,40}$"),
    HONORIFIC_PATTERN("^[^\\!\\@\\$\\%\\^\\&\\*\\(\\)\\+\\=\\|\\<\\>\\?\\{\\}\\[\\]\\~\"\\:\\;\\_]{0,10}$"),
    GENDER_PATTERN("^(M|F|m|f)?$"),
    BOOLEAN_PATTERN("^(true|false)?$"),
    EMAIL_PATTERN("^([0-9a-zA-Z]([-\\.\\w]*[0-9a-zA-Z])*@([0-9a-zA-Z][-\\w]*[0-9a-zA-Z]\\.)+[a-zA-Z]{2,9})$"),
    STATE_PATTERN("^(AL|AK|AS|AZ|AR|CA|CO|CT|DE|DC|FM|FL|GA|GU|HI|ID|IL|IN|IA|KS|KY|LA|ME|MH|MD|MA|MI|MN|MS|MO|MT|NE|NV|NH|NJ|NM|NY|NC|ND|MP|OH|OK|OR|PW|PA|PR|RI|SC|SD|TN|TX|UT|VT|VI|VA|WA|WV|WI|WY)$"),
    ZIP_PATTERN("^[^\\!\\@\\$\\%\\^\\&\\*\\(\\)\\+\\=\\|\\<\\>\\?\\{\\}\\[\\]\\~\"\\:\\;\\_]{0,10}$"),
    DATES_PATTERN("^[\\d]{0,16}$"),
    CURRENCY_PATTERN("^[\\d]{3,5}$"),
    ACCT_TYPE_PATTERN("^[\\d]{2}$"),
    CUSTOMER_ID_PATTERN("^[\\d]{10}$"),
    PAN_PATTERN("^[\\d]{16}$"),
    TRACK2_PATTERN("^\\d{16}=\\d{15}$"),
    CARD_PATTERN("^[\\d]{16}$"),
    TOKEN_PATTERN("^[\\w\\s.\\-\']{6,64}$"),
    CVV2_PATTERN("^\\d{3}$"),
    ID_PATTERN("^\\d{0,10}"),
    MID_PATTERN("^\\d{0,15}"),
    TID_PATTERN("^\\d{0,16}"),
    PIN_PATTERN("^\\d{4,6}"),
    AMOUNT_PATTERN("[+-]?(?:\\d+(?:\\.\\d*)?|\\.\\d+)(?:[eE][+-]?\\d+)?"),
    HEX_PATTERN("^([0-9a-fA-F]{8,2048})$"),
    SECURE_DATA_PATTERN("^[-\\.\\w]*:([0-9a-fA-F]{8,2048})$"),
    API_USER_ID_PATTERN("^\\d{0,10}"),
    RRN_PATTERN("^\\d{1,12}"),
    STAN_PATTERN("^\\d{1,12}"),
    SHORT_DSC_PATTERN("^.{1,40}$"),
    FIC_PATTERN("^\\d{1,4}"),
    ACCOUNT_PATTERN("^\\d{1,24}"),
    SUBCODE_PATTERN("^[\\d.]{1,64}$"),
    CHAR_CURRENCY_PATTERN("^.{3,5}$"),
    RESTAPI_TXN_QUEUE("JPOS.RESTAPI.TXN"),
    RESTAPI_CREDENTIALS("RESTAPI_CREDENTIALS"),
    SUCCESS("success"),
    ERROR("error"),
    REQUEST("REQUEST"),
    SOURCE("SOURCE"), // message source
    TXNNAME("TXNNAME"),
    SS("SS"),
    TRUSTED("TRUSTED"),
    JPF_VERSION(CMFConstants.JPF_VERSION.value()),
    RESPONSE("RESPONSE"),
    TRAN_APPROVED("0000"),
    DB("DB"),
    TXNMGR("TXNMGR"),
    TXNRESULT("TXNRESULT"),
    URI_INFO("URI_INFO"),
    JPOS_CMF_VERSION(CMFConstants.CMF_VERSION.value()),
    TIMESTAMP("TIMESTAMP"),
    DUMMY_CONSUMER("c400ded2-f9cc-11e4-accc-3c15c2cf79f2"),
    DUMMY_TIMESTAMP("1212332211222"),
    DUMMY_NONCE("121b1b1b"),
    DUMMY_HASH("12b12b12"),
    WATCHDOG("WATCHDOG");


    private String value;

    RestConstants(String value) {
        this.value = value;
    }
    public String value() {
        return value;
    }
}
