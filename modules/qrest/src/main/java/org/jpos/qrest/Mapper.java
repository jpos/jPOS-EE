package org.jpos.qrest;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import java.text.SimpleDateFormat;

public class Mapper {
    private static ObjectMapper mapper =
      new ObjectMapper()
        .enable(DeserializationFeature.USE_BIG_DECIMAL_FOR_FLOATS)
        .enable(SerializationFeature.INDENT_OUTPUT)
        .setDateFormat(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"))
        .configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false)
        .configure(DeserializationFeature.FAIL_ON_INVALID_SUBTYPE,false);

    public static ObjectMapper getMapper() {
        return mapper;
    }
}

