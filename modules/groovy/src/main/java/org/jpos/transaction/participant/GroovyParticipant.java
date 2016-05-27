/*
 * jPOS Project [http://jpos.org]
 * Copyright (C) 2000-2016 Alejandro P. Revilla
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

package org.jpos.transaction.participant;

import groovy.lang.Binding;
import groovy.lang.GroovyShell;
import org.jdom2.Element;
import org.jpos.core.Configurable;
import org.jpos.core.Configuration;
import org.jpos.core.ConfigurationException;
import org.jpos.core.XmlConfigurable;
import org.jpos.transaction.AbortParticipant;
import org.jpos.transaction.Context;
import org.jpos.transaction.TransactionManager;
import org.jpos.transaction.TransactionParticipant;
import org.jpos.util.Log;
import java.io.File;
import java.io.IOException;
import java.io.Serializable;

/**
 * A TransactionParticipant whose prepare, commit and abort methods can be
 * specified using Groovy scripts. <BR>
 * To indicate what code to execute for any of the TM life-cycle methods just add
 * an element named 'prepare', 'commit' or 'abort' and optionally 'prepare-for-abort'
 * contained in that of the participant. <BR>
 *
 * The 'prepare' and 'prepare-for-abort' methods are expected to return an Integer object
 * with the TM standard result values (PREPARE, ABORT and its modifiers).
 *
 * The Groovy script code can be placed as part of the element's content or in an
 * external file pointed by the 'src' attribute.
 *
 * Usage:
 *
 * <pre>
 *     Add a transaction participant like this:
 *     &lt;participant class="org.jpos.transaction.participant.GroovyParticipant" logger="Q2" realm="groovy-test"&gt;
 *       &lt;prepare src="deploy/prepare.groovy" /&gt;
 *       &lt;commit src="deploy/commit.groovy" /&gt;
 *       &lt;abort src="deploy/abort.groovy" /&gt;
 *     &lt;/participant&gt;
 * </pre>
 */

@SuppressWarnings("unused")
public class GroovyParticipant extends Log
    implements TransactionParticipant, AbortParticipant, XmlConfigurable, Configurable
{
    private Object prepare;
    private Object prepareForAbort;
    private Object commit;
    private Object abort;
    private TransactionManager tm;
    private Configuration cfg;
    private final String groovyShellKey  = ".groovy-" + Integer.toString(hashCode());

    public int prepare (long id, Serializable ctx) {
        try {
            return (int) eval(getShell(id, ctx), prepare);
        } catch (Exception e) {
            error(e);
        }
        return ABORTED;
    }
    public int prepareForAbort (long id, Serializable ctx) {
        if (prepareForAbort == null) {
            return PREPARED | NO_JOIN | READONLY; // nothing to do
        }
        try {
            return (int) eval(getShell(id, ctx), prepareForAbort);
        } catch (Exception e) {
            error(e);
        }
        return ABORTED;
    }
    public void commit(long id, Serializable ctx) {
        if (commit != null) {
            try {
                eval(getShell(id, ctx), commit);
            } catch (Exception e) {
                error(e);
            }
        }
    }
    public void abort(long id, Serializable ctx) {
        if (commit != null) {
            try {
                eval(getShell(id, ctx), abort);
            } catch (Exception e) {
                error(e);
            }
        }
    }

    public void setTransactionManager (TransactionManager tm) {
        this.tm = tm;
    }

    @Override
    public void setConfiguration(Configuration cfg) throws ConfigurationException {
        this.cfg = cfg;
    }
    @Override
    public void setConfiguration(Element e) throws ConfigurationException {
        prepare = getScript(e.getChild("prepare"));
        prepareForAbort = getScript(e.getChild("prepare-for-abort"));
        commit = getScript(e.getChild("commit"));
        abort = getScript(e.getChild("abort"));
    }

    private Object getScript (Element e) throws ConfigurationException {
        if (e != null) {
            String src = e.getAttributeValue("src");
            if (src != null) {
                File f = new File(src);
                if (f.canRead())
                    throw new ConfigurationException ("Can't ready '" + src + "'");
                return f;
            }
            return e.getText();
        }
        return null;
    }

    private Object eval (GroovyShell shell, Object script) throws IOException {
        if (script instanceof File)
            return shell.evaluate((File)script);
        else if (script instanceof String)
            return shell.evaluate((String)script);
        return null;
    }

    private GroovyShell getShell (long id, Serializable context) {
        GroovyShell shell;
        if (context instanceof Context) {
            Context ctx = (Context) context;
            shell = (GroovyShell) ctx.get(groovyShellKey);
            if (shell == null) {
                shell = new GroovyShell(newBinding(id, ctx));
                ctx.put (groovyShellKey, shell);
            }
        } else {
            shell = new GroovyShell(newBinding(id, context));
        }
        return shell;
    }

    private Binding newBinding (long id, Serializable ctx) {
        Binding binding = new Binding();
        binding.setVariable("id", id);
        binding.setVariable("ctx", ctx);
        binding.setVariable("log", this);
        binding.setVariable("tm", tm);
        binding.setVariable("cfg", cfg);
        return binding;
    }
}
