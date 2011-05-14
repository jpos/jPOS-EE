/*
 * jPOS Project [http://jpos.org]
 * Copyright (C) 2000-2011 Alejandro P. Revilla
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

import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.Date;
import java.util.List;
import java.util.Iterator;

import org.jdom.Document;
import org.jdom.Element;
import org.jdom.DocType;
import org.jdom.Comment;
import org.jdom.JDOMException;
import org.jdom.input.SAXBuilder;
import org.jdom.output.Format;
import org.jdom.output.XMLOutputter;

import java.sql.SQLException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Hibernate;
import org.hibernate.Transaction;
import org.hibernate.SessionFactory;
import org.hibernate.HibernateException;

import org.jpos.gl.GLUser;
import org.jpos.gl.Journal;
import org.jpos.gl.RuleInfo;
import org.jpos.gl.GLPermission;
import org.jpos.gl.CompositeAccount;
import org.jpos.gl.FinalAccount;
import org.jpos.gl.Account;
import org.jpos.gl.GLEntry;
import org.jpos.gl.GLException;
import org.jpos.gl.GLSession;
import org.jpos.gl.GLTransaction;
import org.jpos.gl.Currency;

/**
 * Export to an XML document as described in 
 * <a href="http://jpos.org/minigl.dtd">minigl.dtd</a>
 *
 * @author <a href="mailto:apr@jpos.org">Alejandro Revilla</a>
 */
public class Export {
    GLSession gls;

    public Export () throws HibernateException, GLException {
        super();
        gls = new GLSession (System.getProperty ("user.name"));
    }

    public Document getDocument ()
        throws SQLException, HibernateException
    {
        Document doc = new Document ();
        doc.setDocType (new DocType ("minigl", "http://jpos.org/dtd/minigl.dtd"));
        Element root = new Element ("minigl");
        root.addContent (
            new Comment (
                "jPOS MiniGL export $"
            )
        );
        root.addContent (new Element ("create-schema"));
        addUsers (root);
        addCurrencies (root);
        addCharts (root);
        addJournals (root);
        addTransactions (root);
        doc.setRootElement (root);
        return doc;
    }

    public void export (OutputStream os) 
        throws IOException, SQLException, HibernateException
    {
        XMLOutputter out = new XMLOutputter (Format.getPrettyFormat ());
        out.output (getDocument(), os);
    }

    public void export (PrintWriter writer) 
        throws IOException, SQLException, HibernateException
    {
        XMLOutputter out = new XMLOutputter (Format.getPrettyFormat ());
        out.output (getDocument(), writer);
    }

    private void addCharts (Element parentElement) 
        throws SQLException, HibernateException
    {
        Session sess = gls.open();
        Query q = sess.createQuery (
            "from acct in class org.jpos.gl.CompositeAccount where parent is null order by code");
        Iterator iter = q.list().iterator();
        while (iter.hasNext()) {
            Account acct = (Account) iter.next ();
            parentElement.addContent (acct.toXML ());
        }
        gls.close ();
    }

    private void addTransactions (Element parentElement) 
        throws SQLException, HibernateException
    {
        Session sess = gls.open();
        Iterator iter = sess.createQuery (
            "from transacc in class org.jpos.gl.GLTransaction order by id"
        ).list().iterator();
        while (iter.hasNext()) {
            GLTransaction glt = (GLTransaction) iter.next ();
            parentElement.addContent (glt.toXML (true));
        }
        gls.close ();
    }

    private void addUsers (Element parentElement) 
        throws SQLException, HibernateException
    {
        Session sess = gls.open();
        Iterator iter = sess.createQuery (
            "from gluser in class org.jpos.gl.GLUser order by id"
        ).list().iterator();
        while (iter.hasNext()) {
            GLUser user = (GLUser) iter.next ();
            parentElement.addContent (user.toXML ());
        }
        gls.close ();
    }

    private void addCurrencies (Element parentElement) 
        throws SQLException, HibernateException
    {
        Session sess = gls.open();
        Iterator iter = sess.createQuery (
            "from currency in class org.jpos.gl.Currency order by id"
        ).list().iterator();
        while (iter.hasNext()) {
            Currency currency = (Currency) iter.next ();
            parentElement.addContent (currency.toXML ());
        }
        gls.close ();
    }
    private void addJournalRules 
        (Session sess, Journal journal, Element parentElement) 
        throws SQLException, HibernateException
    {
        Query q = sess.createQuery ("from ruleinfo in class org.jpos.gl.RuleInfo where journal=:journal order by id");
        q.setParameter ("journal", journal);
        Iterator iter = q.list().iterator();
        while (iter.hasNext()) {
            RuleInfo rule = (RuleInfo) iter.next ();
            parentElement.addContent (rule.toXML ());
        }
    }
    private void addJournals (Element root) 
        throws SQLException, HibernateException
    {
        Session sess = gls.open();
        Iterator iter = sess.createQuery (
          "from journal in class org.jpos.gl.Journal order by id"
        ).list().iterator();

        while (iter.hasNext()) {
            Journal journal = (Journal) iter.next ();
            Element journalElement = journal.toXML ();
            addJournalRules (sess, journal, journalElement);
            root.addContent (journalElement);
        }
        gls.close ();
    }

    public static void main (String[] args) {
        try {
            new Export ().export (System.out);
        } catch (Exception e) {
            e.printStackTrace();
        }
   }
}
