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
    CURRENCY_PATTERN("^[\\d]{3}$"),
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
    CHAR_CURRENCY_PATTERN("^.{3}$"),
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
    TXNRESULT("TXNRESULT"),
    URI_INFO("URI_INFO"),
    JPOS_CMF_VERSION(CMFConstants.CMF_VERSION.value()),
    TIMESTAMP("TIMESTAMP");


    private String value;

    RestConstants(String value) {
        this.value = value;
    }
    public String value() {
        return value;
    }
}
