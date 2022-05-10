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

package org.jpos.gl.tools;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.dom4j.DocumentException;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.JDOMException;
import org.jdom2.input.SAXBuilder;
import org.jpos.core.ConfigurationException;
import org.jpos.ee.DB;
import org.jpos.gl.*;
import org.xml.sax.EntityResolver;
import org.xml.sax.InputSource;

import java.io.IOException;
import java.io.InputStream;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/**
 * Import an XML document as described in
 * <a href="http://jpos.org/minigl.dtd">minigl.dtd</a>
 *
 * @author <a href="mailto:apr@jpos.org">Alejandro Revilla</a>
 */
public class Import implements EntityResolver {
    Log log = LogFactory.getLog (Import.class);
    private static final String URL = "http://jpos.org/";
    private String configModifier;
    /**
     * This setting controls whether to check that child account codes
     * contain the parent account code as a prefix. Defaults to true
     * for optimal compatibility with getBalances native queries,
     * but may be set to false to import a legacy system that doesn't
     * use native queries.
     */
    private boolean strictAccountCodes = true;

    public Import (String configModifier) throws HibernateException, GLException, IOException, ConfigurationException
    {
        super();
        this.configModifier = configModifier;
    }
    public Import () throws HibernateException, GLException, IOException, ConfigurationException
    {
        super();
        this.configModifier = null;
    }
    /**
     * @param setting - new value for `strictAccountCodes`
     */
    public void setStrictAccountCodes(Boolean setting) {
        strictAccountCodes = setting;
    }

    public static void usage () {
        System.out.println ("Usage: org.jpos.gl.tools.Import filename");
        System.exit (0);
    }

    private void createSchema () throws HibernateException, DocumentException {
        DB db = new DB(configModifier);
        db.open();
        db.beginTransaction();
        db.createSchema(null, true);
        db.commit();
        db.close();
    }

    private void createCharts (Session sess, Iterator iter)
        throws SQLException, HibernateException, ParseException, GLException
    {
        Transaction txn = sess.beginTransaction();
        while (iter.hasNext()) {
            Element elem = (Element) iter.next ();
            CompositeAccount acct = new CompositeAccount (elem);
            sess.save (acct);
            acct.setRoot (acct);
            processChartChildren (
                sess, acct, elem.getChildren().iterator()
            );
            sess.flush ();
        }
        txn.commit();
    }
    private void createCurrencies (Session sess, Iterator iter)
        throws SQLException, HibernateException, ParseException
    {
        Transaction txn = sess.beginTransaction();
        while (iter.hasNext()) {
            Element elem = (Element) iter.next ();
            Currency currency = new Currency (elem);
            sess.save (currency);
        }
        txn.commit();
    }
    private void createUsers (Session sess, Iterator iter)
        throws SQLException, HibernateException, ParseException
    {
        Transaction txn = sess.beginTransaction();
        while (iter.hasNext()) {
            Element elem = (Element) iter.next ();
            GLUser user = new GLUser (elem);

            Iterator permIter = elem.getChildren ("grant").iterator();
            while (permIter.hasNext()) {
                Element perm = (Element) permIter.next();
                GLPermission p = new GLPermission (perm.getTextTrim());
                sess.save (p);
                user.grant (p);
            }
            sess.save (user);
        }
        txn.commit();
    }
    private void createJournals (Session sess, Iterator iter)
        throws SQLException, HibernateException, ParseException
    {
        Transaction txn = sess.beginTransaction();
        while (iter.hasNext()) {
            Element elem = (Element) iter.next ();
            Journal journal = new Journal (elem);
            journal.setChart (
                getChart (sess, elem.getChildTextTrim ("chart"))
            );
            sess.save (journal);
            journal.setPermissions (
                createPermissions (
                    sess, journal, elem.getChildren ("grant").iterator()
                )
            );
            createJournalLayers (
                sess, journal, elem.getChildren ("layer").iterator()
            );
            createJournalRules (
                sess, journal, elem.getChildren ("rule").iterator()
            );
        }
        txn.commit();
    }
    private void processChartChildren
        (Session sess, CompositeAccount parent, Iterator iter)
            throws SQLException, HibernateException, ParseException, GLException
    {
        while (iter.hasNext ()) {
            Element e = (Element) iter.next ();
            String name = e.getName();
            if ("composite-account".equals (name))
                createComposite (sess, parent, e);
            else if ("account".equals (name))
                createFinal (sess, parent, e);
        }
    }

    private void validateAccountCode(Account parent, Account child)
            throws GLException
    {
        if (!parent.isChart() && !child.getCode().startsWith(parent.getCode())) {
            throw new GLException("Child account code `"+child.getCode()+"` must start with parent account code `"+parent.getCode()+"`");
        }
    }
    private void createComposite (Session sess, CompositeAccount parent, Element elem)
        throws SQLException, HibernateException, ParseException, GLException
    {
        CompositeAccount acct = new CompositeAccount (elem, parent);
        if (strictAccountCodes)
            validateAccountCode(parent, acct);

        acct.setRoot (parent.getRoot ());
        sess.save (acct);
        acct.setParent (parent);
        parent.getChildren().add (acct);
        sess.flush ();
        processChartChildren (sess, acct, elem.getChildren().iterator());
    }

    private void createFinal (Session sess, CompositeAccount parent, Element elem)
        throws SQLException, HibernateException, ParseException, GLException
    {
        FinalAccount acct = new FinalAccount (elem, parent);
        if (strictAccountCodes)
            validateAccountCode(parent, acct);

        acct.setRoot (parent.getRoot ());
        sess.save (acct);
        acct.setParent (parent);
        parent.getChildren().add (acct);
    }

    private void createTransactions (DB db, Iterator iter)
      throws SQLException, HibernateException, ParseException, GLException {
        GLSession gls = new GLSession(db);
        while (iter.hasNext()) {
            Transaction txn = db.beginTransaction();
            Element elem = (Element) iter.next ();
            GLTransaction glt = new GLTransaction (elem);
            Journal journal = getJournal (
                db.session(), elem.getAttributeValue ("journal")
            );
            glt.setJournal (journal);
            addEntries (
                db.session(), glt,
                elem.getChildren("entry").iterator()
            );
            gls.post(journal, glt);
            txn.commit ();
            System.out.println (glt.getId() + " " + glt.getDetail());
        }
    }
    private void addEntries (
        Session sess, GLTransaction glt, Iterator iter)
        throws SQLException, HibernateException, ParseException
    {
        Account chart = glt.getJournal().getChart ();
        while (iter.hasNext()) {
            Element elem = (Element) iter.next ();
            GLEntry entry =
                "credit".equals (elem.getAttributeValue ("type")) ?
                (new GLCredit ()) :
                (new GLDebit ());

            entry.fromXML (elem);
            entry.setAccount (getFinalAccount (sess, chart, elem));
            entry.setTransaction (glt);
            glt.getEntries().add (entry);
        }
    }
    private Account getAccount (Session sess, Account chart, Element elem)
        throws SQLException, HibernateException
    {
        Query q = sess.createQuery (
            "from acct in class org.jpos.gl.Account where code = :code and acct.root = :chart");

        q.setParameter ("code", elem.getAttributeValue ("account"));
        q.setLong ("chart", chart.getId());
        List l = q.list();
        return l.size() == 1 ? ((Account) l.get (0)) : null;
    }
    private FinalAccount getFinalAccount
        (Session sess, Account chart, Element elem)
        throws SQLException, HibernateException
    {
        Query q = sess.createQuery (
            "from acct in class org.jpos.gl.FinalAccount where code = :code and acct.root = :root"
        );
        q.setParameter ("code", elem.getAttributeValue ("account"));
        q.setLong ("root", chart.getId());
        List l = q.list();
        return l.size() == 1 ? ((FinalAccount) l.get (0)) : null;
    }
    private CompositeAccount getChart (Session sess, String chartCode)
        throws SQLException, HibernateException
    {
        Query q = sess.createQuery (
            "from acct in class org.jpos.gl.CompositeAccount where code = :code and parent is null"
        );
        q.setParameter ("code", chartCode);
        List l = q.list();
        return (CompositeAccount) ((l.size() > 0) ? l.get (0) : null);
    }
    private void createJournalRules
        (Session session, Journal journal, Iterator iter)
        throws HibernateException, ParseException, SQLException
    {
        while (iter.hasNext()) {
            Element e = (Element) iter.next();
            RuleInfo ri = new RuleInfo (e);
            ri.setJournal (journal);
            ri.setAccount (getAccount (session, journal.getChart(), e));
            session.save (ri);
        }
    }
    private void createJournalLayers
        (Session session, Journal journal, Iterator iter)
        throws HibernateException, ParseException, SQLException
    {
        while (iter.hasNext()) {
            Element e = (Element) iter.next();
            Layer layer = new Layer (e);
            layer.setJournal (journal);
            session.save (layer);
        }
    }
    private GLUser getUser (Session session, String nick)
        throws HibernateException
    {
        Query q = session.createQuery ("from GLUser u where u.nick=:nick");
        q.setParameter ("nick", nick);
        List l = q.list();
        if (l.size() == 0) {
            throw new IllegalArgumentException (
                "Invalid nick '" + nick + "'"
            );
        }
        return (GLUser) l.get(0);
    }
    private Set createPermissions (Session session, Journal j, Iterator iter)
        throws HibernateException
    {
        Set permissions = new HashSet ();
        while (iter.hasNext()) {
            Element e = (Element) iter.next();
            GLUser user = getUser (session, e.getAttributeValue ("user"));
            GLPermission p = new GLPermission (e.getTextTrim());
            p.setUser (user);
            p.setJournal (j);
            permissions.add (p);
            user.getPermissions().add(p);
            session.save (p);
        }
        return permissions;
    }
    private Journal getJournal (Session sess, String name)
        throws SQLException, HibernateException
    {
        Query q = sess.createQuery (
            "from journal in class org.jpos.gl.Journal where name = :name"
        );
        q.setParameter ("name", name);
        List l = q.list();
        return (Journal) ((l.size() > 0) ? l.get (0) : null);
    }
    public InputSource resolveEntity (String publicId, String systemId) {
        if (systemId != null && systemId.startsWith (URL)) {
            log.debug ("trying to locate " + systemId + " in classpath");
            ClassLoader classLoader = this.getClass().getClassLoader();
                InputStream dtd = classLoader.getResourceAsStream (
                systemId.substring (URL.length())
            );
            if (dtd == null) {
                log.debug (systemId + "not found in classpath");
                return null;
            }
            else {
                log.debug ("found " + systemId + " in classpath");
                return new InputSource (dtd);
            }
        }
        else
            return null;
    }
    public void parse (String file)
      throws JDOMException, SQLException, HibernateException,
      ParseException, IOException, GLException, DocumentException {
        SAXBuilder builder = new SAXBuilder (true);
        builder.setEntityResolver (this);

        Document doc = builder.build (file);
        Element root = doc.getRootElement ();

        if (!"minigl".equals (root.getName ())) {
            throw new IllegalStateException (
                "Invalid root element "+root.getName ()
            );
        }

        if (root.getChild ("create-schema") != null)
            createSchema ();

        try (DB db = new DB(configModifier)) {
            Session sess = db.open();
            createUsers(sess, root.getChildren("user").iterator());
            createCurrencies(sess, root.getChildren("currency").iterator());
            createCharts(sess, root.getChildren("chart-of-accounts").iterator());
            createJournals(sess, root.getChildren("journal").iterator());
            createTransactions(db, root.getChildren("transaction").iterator());
        }
    }

    public static void main (String[] args) {
        if (args.length == 0)
            usage ();

        try {
            new Import().parse (args[0]);
        } catch (Exception e) {
            System.out.println (e.getMessage());
        }
   }
}

