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

package org.jpos.simulator;

import java.io.File;
import java.io.IOException;
import java.io.FileInputStream;
import java.util.*;

import org.jpos.iso.*;
import org.jpos.iso.packager.XMLPackager;
import org.jpos.util.Logger;
import org.jpos.util.LogEvent;
import org.jdom2.Element;
import org.jpos.util.NameRegistrar;
import bsh.Interpreter;
import bsh.BshClassManager;
import bsh.EvalError;
import bsh.UtilEvalError;
import org.xml.sax.SAXException;

public class TestRunner
    extends org.jpos.q2.QBeanSupport
    implements Runnable
{
    MUX mux;
    ISOPackager packager;
    Interpreter bsh;
    private static final String NL = System.getProperty("line.separator");
    public static final long TIMEOUT = 60000;
    public TestRunner () {
        super();
    }
    protected void initService() throws ISOException {
        String packagerClass = cfg.get("packager", null);
        if (packagerClass != null) {
            try {
                packager = (ISOPackager) Class.forName(packagerClass).newInstance();
            } catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
                throw new ISOException("Error instatiating packager", e);
            }
        } else {
            packager = getDefaultPackager();
        }
    }
    protected void startService() {
        for (int i=0; i<cfg.getInt("sessions", 1); i++)
            new Thread(this).start();
    }
    public void run () {
        try {
            Interpreter bsh = initBSH ();
            mux = (MUX) NameRegistrar.get ("mux." + cfg.get ("mux"));
            List suite = initSuite (getPersist().getChild ("test-suite"));
            runSuite (suite, mux, bsh);
        } catch (NameRegistrar.NotFoundException e) {
            LogEvent evt = getLog().createError ();
            evt.addMessage (e);
            evt.addMessage (NameRegistrar.getInstance());
            Logger.log (evt);
        } catch (Throwable t) {
            getLog().error (t);
        }
        if (cfg.getBoolean ("shutdown"))
            getServer().shutdown();
    }
    private void runSuite (List suite, MUX mux, Interpreter bsh)
        throws ISOException, IOException, EvalError
    {
        LogEvent evt = getLog().createLogEvent ("results");
        LogEvent evt_error = null;
        Iterator iter = suite.iterator();
        long start = System.currentTimeMillis();
        long serverTime = 0;
        for (int i=1; iter.hasNext(); i++) {
            evt_error = getLog().createLogEvent("error");
            TestCase tc = (TestCase) iter.next();
            for (long repetition = 0; repetition < tc.getCount(); repetition++) {
                getLog().trace (
                    "---------------------------[ "
                  + tc.getName()
                  + " ]---------------------------" );

                ISOMsg m = (ISOMsg) tc.getRequest().clone();
                if (tc.getPreEvaluationScript() != null) {
                    bsh.set ("testcase", tc);
                    bsh.set ("request", m);
                    bsh.eval (tc.getPreEvaluationScript());
                }
                tc.setExpandedRequest (applyRequestProps (m, bsh));
                tc.start();
                if (tc.getExpectedResponse() != null) {
                    tc.setResponse(mux.request(m, tc.getTimeout()));
                    tc.end();
                    assertResponse(tc, bsh, evt_error);
                    evt.addMessage(i + ": " + tc.toString());
                    if (evt_error.getPayLoad().size() != 0) {
                        evt_error.addMessage("filename", tc.getFilename());
                        evt.addMessage(NL + evt_error.toString("    "));
                    }
                    serverTime += tc.elapsed();
                    if (!tc.ok() && !tc.isContinueOnErrors())
                        break;
                } else {
                    // response not expected - fire and forget
                    mux.send(m);
                    tc.end();
                    tc.setResultCode(TestCase.OK);
                    evt.addMessage(i + ": " + tc.toString() + " (response ignored)");
                }
            }
            if (!tc.ok()) {
                getLog().error (tc);
                if (!tc.isContinueOnErrors())
                    break;
            }
        }
        long end = System.currentTimeMillis();

        long simulatorTime = end - start - serverTime;
        long total = end - start;

        evt.addMessage (
            "elapsed server=" + serverTime
            + "ms(" + percentage (serverTime, total) + "%)"
            + ", simulator=" + simulatorTime
            + "ms(" + percentage (simulatorTime, total) + "%)"
            + ", total=" + total + "ms, shutdown="
            + cfg.getBoolean("shutdown")
        );
        ISOUtil.sleep (100);     // let the channel do its logging first
        if (cfg.getBoolean ("shutdown"))
            evt.addMessage ("Shutting down");

        Logger.log (evt);
    }
    private List<TestCase> initSuite (Element suite)
        throws IOException, ISOException
    {
        List<TestCase> l = new ArrayList<>();
        String prefix = suite.getChildTextTrim ("path");
        Iterator iter = suite.getChildren ("test").iterator();
        while (iter.hasNext ()) {
            Element e = (Element) iter.next ();
            boolean cont = "yes".equals (e.getAttributeValue ("continue"));
            String s = e.getAttributeValue ("count");
            int count = s != null ? Integer.parseInt (s) : 1;
            String path = e.getAttributeValue ("file");
            String name = e.getAttributeValue ("name");
            if (name == null)
                name = path;

            TestCase tc = new TestCase (name);
            tc.setCount(count);
            tc.setContinueOnErrors (cont);
            tc.setRequest (getMessage (prefix + path + "_s"));
            tc.setExpectedResponse (getMessage (prefix + path + "_r"));
            tc.setPreEvaluationScript (e.getChildTextTrim ("init"));
            tc.setPostEvaluationScript (e.getChildTextTrim ("post"));
            tc.setFilename(prefix + path);

            String to  = e.getAttributeValue ("timeout");
            if (to != null)
                tc.setTimeout (Long.parseLong (to));
            else
                tc.setTimeout (cfg.getLong ("timeout", TIMEOUT));
            l.add (tc);

        }
        return l;
    }
    private ISOMsg getMessage (String filename)
        throws IOException, ISOException
    {
        File f = new File (filename);
        ISOMsg m = null;
        if (f.canRead()) {
            try (FileInputStream fis = new FileInputStream (f)) {
                byte[] b  = new byte[fis.available()];
                fis.read (b);
                m = new ISOMsg ();
                m.setPackager (packager);
                try {
                    m.unpack(b);
                } catch (ISOException e) {
                    throw new ISOException ("Error parsing '" + filename + "'", e);
                }
            }
        }
        return m;
    }
    private boolean processResponse
        (ISOMsg er, ISOMsg m, ISOMsg expected, Interpreter bsh, LogEvent evt)
        throws ISOException, EvalError
    {
        int maxField = Math.max(m.getMaxField(), expected.getMaxField());

        for (int i=0; i<=maxField; i++) {
            if (expected.hasField (i)) {
                ISOComponent c = expected.getComponent (i);
                if (c instanceof ISOField) {
                    String value = expected.getString (i);
                    if (value.charAt (0) == '!' && value.length() > 1)
                    {
                        bsh.set  ("value", m.getString (i));
                        Object ret = bsh.eval (value.substring (1));
                        if (ret instanceof Boolean) {
                            if (!(Boolean) ret) {
                                evt.addMessage("field", "[" + i+ "] Boolean eval returned false");
                                //return false;
                            }
                        } else if (ret instanceof String) {
                            if (m.hasField(i) && !ret.equals(m.getString(i))) {
                                evt.addMessage("field", "[" + i + "] Received:[" + m.getString(i) + "]" + " Expected:["
                                    + ret + "]");
                            }
                        }
                        m.unset (i);
                        expected.unset (i);
                    }
                    else if (value.startsWith("*M")) {
                        if (m.hasField (i)) {
                            expected.unset (i);
                            m.unset (i);
                        } else {
                            evt.addMessage("field","[" + i+ "] Mandatory field missing");
                            //return false;
                        }
                    }
                    else if (value.startsWith("*E")) {
                        if (m.hasField (i) && er.hasField (i)) {
                            expected.set (i, er.getString (i));
                        } else {
                            evt.addMessage("field", "[" + i+ "] Echo field missing");
                            //return false;
                        }
                    }
                    else if (value.startsWith("*A")) {
                        if (m.hasField(i)) {
                        // To make sure value is not returned for this field
                        evt.addMessage("field", "[" + i + "] Received:[" + m.getString(i) + "]"
                                + " Expected: Not to be set");
                        }
                        else {
                            m.unset(i);
                            expected.unset(i);
                        }
                    }
                    else if (m.hasField(i) && !m.getString(i).equals(value)) {
                        evt.addMessage("field", "[" + i+ "] Received:[" + m.getString(i) + "]" + " Expected:[" + value + "]");
                       // return false;
                    }
                }
                else if (c instanceof ISOMsg) {
                    ISOMsg rc = (ISOMsg) m.getComponent (i);
                    ISOMsg innerExpectedResponse = (ISOMsg) er.getComponent (i);
                    if (rc instanceof ISOMsg) {
                        processResponse (innerExpectedResponse, (ISOMsg) rc, (ISOMsg) c, bsh, evt);
                    }
                }
            } else {
                m.unset (i);
            }
        }
        if (evt.getPayLoad().size()!=0) {
            return false;
        }
        return true;
    }
    private boolean assertResponse (TestCase tc, Interpreter bsh, LogEvent evt)
        throws ISOException, EvalError
    {
        if (tc.getResponse() == null) {
            tc.setResultCode (TestCase.TIMEOUT);
            return false;
        }
        ISOMsg c = (ISOMsg) tc.getResponse().clone();
        ISOMsg expected = (ISOMsg) tc.getExpectedResponse().clone();
        ISOMsg er = (ISOMsg) tc.getExpandedRequest().clone();
        c.setHeader(tc.getResponse().getHeader());
        if (!processResponse(er, c, expected, bsh, evt)) {
            tc.setResultCode (TestCase.FAILURE);
            return false;
        }
        ISOPackager p = getDefaultPackager();
        expected.setPackager(p);
        c.setPackager(p);

        if (tc.getPostEvaluationScript() != null) {
            bsh.set ("testcase", tc);
            bsh.set ("response", tc.getResponse());
            Object ret = bsh.eval (tc.getPostEvaluationScript());
            if (ret instanceof Boolean && !(Boolean)ret) {
                tc.setResultCode (TestCase.FAILURE);
                return false;
            }
        }
        if (expected.getHeader() == null)
            c.setHeader((byte[]) null);
        if (!Arrays.equals(c.pack(), expected.pack())) {
            evt.addMessage("Pack mismatch");
            evt.addMessage("--- expected ---");
            evt.addMessage(ISOUtil.hexdump (expected.pack()));
            evt.addMessage("--- actual ---");
            evt.addMessage(ISOUtil.hexdump (c.pack()));
            tc.setResultCode (TestCase.FAILURE);
            return false;
        }
        tc.setResultCode (TestCase.OK);
        return true;
    }
    private void eval (Element e, String name, Interpreter bsh)
        throws EvalError
    {
        Element ee = e.getChild (name);
        if (ee != null)
            bsh.eval (ee.getText());
    }
    private Interpreter initBSH () throws UtilEvalError, EvalError {
        Interpreter bsh = new Interpreter ();
        BshClassManager bcm = bsh.getClassManager();
        bcm.setClassPath(getServer().getLoader().getURLs());
        bcm.setClassLoader(getServer().getLoader());
        bsh.set  ("qbean", this);
        bsh.set  ("log", getLog());
        bsh.eval (getPersist().getChildTextTrim ("init"));
        return bsh;
    }
    private ISOMsg applyRequestProps (ISOMsg m, Interpreter bsh)
        throws ISOException, EvalError
    {
        int maxField = m.getMaxField();
        for (int i=0; i<=maxField; i++) {
            if (m.hasField(i)) {
                ISOComponent c = m.getComponent (i);
                if (c instanceof ISOMsg) {
                    applyRequestProps ((ISOMsg) c, bsh);
                } else if (c instanceof ISOField) {
                    String value = (String) c.getValue();
                    if (value.length() > 0) {
                        try {
                            if (value.charAt (0) == '!') {
                                m.set (i, bsh.eval (value.substring(1)).toString());
                            }
                            else if (value.charAt (0) == '#') {
                                m.set (i, ISOUtil.hex2byte(bsh.eval (value.substring(1)).toString()));
                            }
                        } catch (NullPointerException e) {
                            m.unset (i);
                        }
                    }
                }
            }
        }
        return m;
    }
    private long percentage (long a, long b) {
        double d = (double) a / b;
        return (long) (d * 100.00);
    }


    private ISOPackager getDefaultPackager() throws ISOException {
        XMLPackager p= new XMLPackager();
        try {
            p.setXMLParserFeature("http://apache.org/xml/features/disallow-doctype-decl", false);
            p.setXMLParserFeature("http://xml.org/sax/features/external-general-entities", true);
            p.setXMLParserFeature("http://xml.org/sax/features/external-parameter-entities", true);
            return p;
        } catch (SAXException e) {
            throw new ISOException("Error creating XMLPackager", e);
        }
    }

}

