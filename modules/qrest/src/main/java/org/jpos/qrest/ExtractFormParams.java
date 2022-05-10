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

import io.netty.handler.codec.http.FullHttpRequest;
import io.netty.util.CharsetUtil;
import org.jpos.core.annotation.Config;
import org.jpos.transaction.Context;
import org.jpos.transaction.TransactionParticipant;
import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static org.jpos.qrest.Constants.*;

public class ExtractFormParams implements TransactionParticipant {
    private static final Pattern FORM_PARAM_PATTERN = Pattern.compile("([^&]*)=([^&]*)");
    @Config("ignore-content-type") boolean ignoreContentType;

    @Override
    public int prepare(long id, Serializable context) {
        Context ctx = (Context) context;
        FullHttpRequest request = ctx.get(REQUEST);
        String contentType = request.headers().get("Content-Type");
        if (contentType != null && contentType.contains("application/x-www-form-urlencoded")) {
            try {
                Map<String,String> params = new LinkedHashMap<>();
                ctx.put (FORMPARAMS, params);
                String body = request.content().toString(CharsetUtil.UTF_8);
                Matcher m = FORM_PARAM_PATTERN.matcher(body);
                while (m.find()) {
                    if (m.groupCount() == 2) {
                        params.put(
                          URLDecoder.decode(m.group(1), CharsetUtil.UTF_8.name()),
                          URLDecoder.decode(m.group(2), CharsetUtil.UTF_8.name())
                        );
                    }
                }
            } catch (UnsupportedEncodingException ignored) { }
        } else if (!ignoreContentType)
            return FAIL;

        return PREPARED | READONLY | NO_JOIN;
    }
}
