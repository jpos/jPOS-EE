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

package org.jpos.cryptoserver.participant;

import java.io.IOException;
import java.io.Serializable;
import java.util.*;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.netty.handler.codec.http.*;
import io.netty.util.CharsetUtil;
import org.jpos.core.Configurable;
import org.jpos.core.Configuration;
import org.jpos.core.ConfigurationException;
import org.jpos.crypto.CryptoService;
import org.jpos.crypto.SecureData;
import org.jpos.qrest.Mapper;
import org.jpos.qrest.Response;
import org.jpos.transaction.Context;
import org.jpos.transaction.TransactionParticipant;
import org.jpos.util.NameRegistrar;

import static org.jpos.qrest.Constants.REQUEST;
import static org.jpos.qrest.Constants.RESPONSE;

public class Encrypt implements TransactionParticipant, Configurable {
    private CryptoService cs;
    private static ObjectMapper mapper = Mapper.getMapper();
    private static Base64.Encoder encoder = Base64.getEncoder();

    @Override
    public int prepare(long id, Serializable context) {
        Context ctx = (Context) context;
        FullHttpRequest request = ctx.get(REQUEST);
        try {
            String jsonStr = request.content().toString(CharsetUtil.UTF_8);
            ctx.log (jsonStr);
            @SuppressWarnings("unchecked")
            Map<String,String> m = (Map<String,String>) mapper.readValue(jsonStr, Map.class);

            SecureData sd = cs.aesEncrypt(m.get("text").getBytes());

            Map<String, Object> r = new LinkedHashMap<>();
            r.put ("kid", sd.getId());
            r.put ("cryptogram", encoder.encodeToString(sd.getEncoded()));
            Response response = new Response(HttpResponseStatus.OK, r);
            ctx.put(RESPONSE, response);
        } catch (Exception e) {
            ctx.log(e);
            return FAIL;
        }
        return PREPARED | NO_JOIN | READONLY;
    }

    public void setConfiguration (Configuration cfg) throws ConfigurationException {
        try {
            cs = NameRegistrar.get(cfg.get("crypto-service", "crypto-service"));
        } catch (NameRegistrar.NotFoundException e) {
            throw new ConfigurationException(e.getMessage());
        }
    }
}
