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

package org.jpos.util;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Date;
import java.util.Iterator;
import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

import org.jpos.core.Configurable;
import org.jpos.core.Configuration;
import org.jpos.core.ConfigurationException;
import org.jpos.iso.ISOUtil;

/**
 * Send e-mail with selected LogEvents to operator account.
 * <b>Configuration properties</b>
 * <pre>
 *    jpos.operator.from=jpos
 *    jpos.operator.to=operator@foo.bar
 *    jpos.operator.subject.prefix=[jPOS]
 *    jpos.operator.tags="Operator ISORequest SystemMonitor"
 *    jpos.operator.delay=10000
 *    jpos.mail.smtp.host=localhost
 *    jpos.mail.smtp.auth=true //If true, then smtp server need authentication.
 *    jpos.mail.smtp.user=no-reply@some.com
 *    jpos.mail.smtp.password=somepassword
 *    jpos.mail.smtp.debug=false //Debugs smtp connection
 *    jpos.mail.smtp.attachments=false //If true, sends each event as an attachment, otherwise put them into body 
 *    jpos.mail.smtp.tls=false //If true, activate TLS 
 * </pre>
 *
 * @author apr@cs.com.uy
 * @version $Id: OperatorLogListener.java 2130 2005-04-11 15:58:24Z apr $
 * 
 */
public class OperatorLogListener 
    implements LogListener, Configurable, Runnable
{
    Configuration cfg;
    BlockingQueue queue;
    boolean logExceptions;

    public OperatorLogListener () {
        super();
        queue = new BlockingQueue();
    }
    public OperatorLogListener (Configuration cfg) {
        super();
        this.cfg = cfg;
        queue = new BlockingQueue();
        new Thread(this).start();
    }
    public void setConfiguration (Configuration cfg) 
        throws ConfigurationException
    {
        this.cfg = cfg;
        assertProperty ("jpos.operator.to");
        assertProperty ("jpos.operator.subject.prefix");
        assertProperty ("jpos.operator.tags");
        assertProperty ("jpos.operator.delay");
        assertProperty ("jpos.mail.smtp.host");

        logExceptions = cfg.get ("jpos.operator.tags").
            indexOf ("exception") >= 0;

        new Thread(this).start();
    }
    
    public void run() {
        Thread.currentThread().setName ("OperatorLogListener");
        int delay = cfg.getInt ("jpos.operator.delay");
        try {
            ISOUtil.sleep (2500);   // initial delay
            for (;;) {
                try {
                    LogEvent ev[] = new LogEvent[1];
                    if (queue.pending() > 0) {
                        ev = new LogEvent [queue.pending()];
                        for (int i=0; i < ev.length; i++)
                            ev[i] = (LogEvent) queue.dequeue();
                    } else 
                        ev[0] = (LogEvent) queue.dequeue();
                    sendMail (ev);
                    if (delay > 0)
                        Thread.sleep (delay);
                } catch (InterruptedException e) { }
            }
        } catch (BlockingQueue.Closed e) { }
    }
    private void sendMail (LogEvent[] ev) {
        String from         = cfg.get    ("jpos.operator.from", "jpos-logger");
        String[] to         = cfg.getAll ("jpos.operator.to");
        String[] cc         = cfg.getAll ("jpos.operator.cc");
        String[] bcc        = cfg.getAll ("jpos.operator.bcc");
        String subject      = cfg.get    ("jpos.operator.subject.prefix");
        String user         = cfg.get    ("jpos.mail.smtp.user", "");
        String passw        = cfg.get    ("jpos.mail.smtp.password","");
        boolean debug       = cfg.getBoolean("jpos.mail.smtp.debug",false);
        boolean attachments = cfg.getBoolean("jpos.mail.smtp.attachments",true);
        boolean auth        = cfg.getBoolean("jpos.mail.smtp.auth", true);

        if (ev.length > 1) 
            subject = subject + ev.length + " events";
        else
            subject = subject + ev[0].getRealm() + " - " +ev[0].getTag();

        // create some properties and get the default Session
        Properties props = System.getProperties();
        props.put("mail.smtp.host", cfg.get ("jpos.mail.smtp.host", "localhost"));
        props.setProperty("mail.smtp.starttls.enable", cfg.get("jpos.mail.smtp.tls", "false"));
        props.setProperty("mail.smtp.port",cfg.get ("jpos.mail.smtp.port","25"));
        props.setProperty("mail.smtp.user", from);
        props.setProperty("mail.smtp.auth", Boolean.toString(auth));
        
        Session session = Session.getDefaultInstance(props, null);
        session.setDebug(debug);
        
        try {
            // create a message
            MimeMessage msg = new MimeMessage(session);
            msg.setFrom (new InternetAddress(from));

            InternetAddress[] address = new InternetAddress[to.length];
            for (int i=0; i<to.length; i++) 
                address[i] = new InternetAddress (to[i]);
            msg.setRecipients (Message.RecipientType.TO, getAddress (to));
            msg.setRecipients (Message.RecipientType.CC, getAddress (cc));
            msg.setRecipients (Message.RecipientType.BCC, getAddress (bcc));
            msg.setSubject(subject);
            Multipart mp = new MimeMultipart();

            for(int i=0; i<ev.length; i++) {
                ByteArrayOutputStream buf = new ByteArrayOutputStream();
                PrintStream p = new PrintStream (buf);
                ev[i].dump (p, "");
                p.close();
        
                // create and fill the first message part
                MimeBodyPart mbp = new MimeBodyPart();
                mbp.setText(buf.toString());
                if (attachments)
                    mbp.setFileName (ev[i].getTag() + "_" + i + ".txt");
                mp.addBodyPart(mbp);
            }
            msg.setContent(mp);
            msg.setSentDate(new Date());
            if (auth) {
                Transport t = session.getTransport("smtp");
                t.connect(user, passw);
                t.sendMessage(msg, msg.getAllRecipients());
                t.close();
            } else {
                Transport.send(msg);
            }
        } catch (MessagingException mex) {
            mex.printStackTrace();
            Exception ex = null;
            if ((ex = mex.getNextException()) != null) {
                ex.printStackTrace();
            }
        }
    }
    private boolean checkOperatorTag(LogEvent ev) {
        String tags = cfg.get ("jpos.operator.tags");

        return (tags.indexOf (ev.getTag()) >= 0) || (logExceptions && hasException (ev));
    }
    private boolean hasException (LogEvent evt) {
        Iterator iter = evt.getPayLoad().iterator();
        while (iter.hasNext()) {
            if (iter.next() instanceof Throwable)
                return true;
        }
        return false;
    }
    private InternetAddress[] getAddress (String[] s) throws AddressException {
        InternetAddress[] address = new InternetAddress[s.length];
        for (int i=0; i<s.length; i++) 
            address[i] = new InternetAddress (s[i]);
        return address;
    }
    public synchronized LogEvent log (LogEvent ev) {
        if (checkOperatorTag(ev))
            queue.enqueue (ev);
        return ev;
    }
    private void assertProperty (String propName) throws ConfigurationException
    {
        if (cfg.get (propName) == null)
            throw new ConfigurationException 
                (propName + " property not present");
    }
}
