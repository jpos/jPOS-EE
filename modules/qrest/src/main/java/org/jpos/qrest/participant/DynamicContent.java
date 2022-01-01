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

package org.jpos.qrest.participant;

import freemarker.cache.FileTemplateLoader;
import freemarker.template.Template;
import freemarker.template.TemplateException;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import org.jpos.core.Configuration;
import org.jpos.core.ConfigurationException;
import org.jpos.transaction.Context;

import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import java.io.StringWriter;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

import static freemarker.template.Configuration.DEFAULT_INCOMPATIBLE_IMPROVEMENTS;
import static org.jpos.qrest.Constants.RENDER_CONTEXT;

public class DynamicContent extends StaticContent {
    private freemarker.template.Configuration fcfg;
    private Map<String,String> pageContext = new LinkedHashMap<>();

    @Override
    public int prepare(long id, Serializable context) {
        Context ctx = (Context) context;
        Map<String,Object> rctx = getRenderContext(ctx);
        rctx.put ("id", id);
        rctx.putAll(pageContext);
        return super.prepare(id, context);
    }

    @Override
    public void setConfiguration(Configuration cfg) throws ConfigurationException {
        super.setConfiguration(cfg);
        fcfg = new freemarker.template.Configuration(DEFAULT_INCOMPATIBLE_IMPROVEMENTS);
        try {
            fcfg.setDirectoryForTemplateLoading(documentRoot);
            fcfg.setTemplateLoader(new FileTemplateLoader(documentRoot));
        } catch (IOException e) {
            throw new ConfigurationException (e);
        }
        cfg.keySet()
          .stream()
          .filter (s -> s.startsWith("page.ctx"))
          .forEach(s -> pageContext.put(s.substring(9), cfg.get(s)));
    }

    @Override
    protected ByteBuf toByteBuf (Context ctx, File f) throws IOException {
        Template template = fcfg.getTemplate(f.getName());
        StringWriter sw=new StringWriter();
        try {
            template.process(getRenderContext(ctx),sw);
            return Unpooled.wrappedBuffer(sw.toString().getBytes());
        } catch (TemplateException e) {
            throw new IOException (e);
        }
    }

    private Map<String,Object> getRenderContext (Context ctx) {
        Map<String,Object> rctx = ctx.get(RENDER_CONTEXT);
        if (rctx == null) {
            rctx = new HashMap<>();
            ctx.put (RENDER_CONTEXT, rctx);
        }
        return rctx;
    }
}
