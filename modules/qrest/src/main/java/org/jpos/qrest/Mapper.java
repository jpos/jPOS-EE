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

package org.jpos.qrest;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.module.SimpleModule;
import org.jpos.util.Tags;

import java.text.SimpleDateFormat;

public class Mapper {
    private static final ObjectMapper mapperDefault;
    private static final ObjectMapper mapperNoNulls;

    static {
        SimpleModule tags = new SimpleModule();
        tags.addSerializer(Tags.class, new TagsSerializer());

        mapperDefault = new ObjectMapper()
          .enable(DeserializationFeature.USE_BIG_DECIMAL_FOR_FLOATS)
          .enable(SerializationFeature.INDENT_OUTPUT)
          .setDateFormat(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"))
          .configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false)
          .configure(DeserializationFeature.FAIL_ON_INVALID_SUBTYPE, false)
          .registerModule(tags);

        mapperNoNulls = mapperDefault.copy()
          .setSerializationInclusion(JsonInclude.Include.NON_NULL);
    }

    public static ObjectMapper getMapper() {
        return mapperDefault;
    }
    public static ObjectMapper getMapperNoNulls() {
        return mapperNoNulls;
    }
}

