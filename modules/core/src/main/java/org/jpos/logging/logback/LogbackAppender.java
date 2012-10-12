/*
 * jPOS Project [http://jpos.org]
 * Copyright (C) 2000-2012 Alejandro P. Revilla
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

package org.jpos.logging.logback;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.jpos.util.Log;
import org.jpos.util.LogEvent;
import org.jpos.util.Loggeable;
import org.jpos.util.Logger;

import ch.qos.logback.classic.encoder.PatternLayoutEncoder;
import ch.qos.logback.classic.spi.ILoggingEvent;
import ch.qos.logback.classic.spi.IThrowableProxy;
import ch.qos.logback.classic.spi.LoggingEventVO;
import ch.qos.logback.classic.spi.ThrowableProxyUtil;
import ch.qos.logback.core.AppenderBase;
import ch.qos.logback.core.LogbackException;
import ch.qos.logback.core.encoder.Encoder;

/**
 * Logback Appender. <br>
 * 
 * Updated by dgrandemange 18/07/2012
 * <ul>
 * <li>preventing any jpos Loggeable args from being formated by logback : this
 * operation is now delegated to the underlying jPos logger, which handles this
 * in a better way</li>
 * <li>logback Encoder support added</li>
 * </ul>
 * 
 * @author Victor Salaman
 */
public class LogbackAppender extends AppenderBase<ILoggingEvent> {

	protected static final String DEFAULT_ENCODER_PATTERN = "%msg%n";

	protected static final String LOGGEABLE_FLAG = "@LOGGEABLE_TOKEN@";

	private static final Pattern LOGGEABLE_REGEXPPATTERN = Pattern
			.compile("@LOGGEABLE_TOKEN@");

	private Logger logger;

	private Encoder<ILoggingEvent> encoder;

	@Override
	public void start() {
		this.logger = Logger.getLogger(getName());

		if (this.encoder == null) {
			initDefaultEncoder();
		}

		super.start();
	}

	@Override
	protected void append(final ILoggingEvent event) {
		if (!isStarted()) {
			return;
		}

		// Build
		final Log source = new Log(logger, getName() + "/"
				+ event.getLoggerName());

		final LogEvent jposLogEvent = new LogEvent(source,
				event.getLevel().levelStr.toLowerCase());

		// Populate jPos log event from logback event
		populateJPosLogEvent(event, jposLogEvent);

		// Handle exceptions
		IThrowableProxy tp = event.getThrowableProxy();
		if (tp != null) {
			jposLogEvent.addMessage(ThrowableProxyUtil.asString(tp));
		}

		// Do the actual logging
		Logger.log(jposLogEvent);
	}

	protected void initDefaultEncoder() {
		PatternLayoutEncoder pl = new PatternLayoutEncoder();
		pl.setContext(context);
		pl.setPattern(DEFAULT_ENCODER_PATTERN);
		pl.start();
		this.encoder = pl;
	}

	/**
	 * Populate the jPos log event from the incoming Logback event <br>
	 * 
	 * Special care is made to the logback event parameters to preserve any jpos
	 * Loggeable objects from being formated by Logback. <br>
	 * Doing so, we delegate the handling of any Loggeable instances to the
	 * underlying jPos logger which knows very well how to deal with such
	 * loggeables, especially how to properly format them by calling their
	 * Loggeable.dump(...) method.<br>
	 * 
	 * @param event
	 *            Incoming logback event
	 * @param ev
	 *            The jPos log event to populate messages with
	 */
	protected void populateJPosLogEvent(ILoggingEvent originalEvent, LogEvent ev) {
		// We must work with a copy of the original logback event, as once the
		// formatted message is computed on an event, it is not refreshable
		ILoggingEvent event = LoggingEventVO.build(originalEvent);

		List<Loggeable> lstLoggeable = null;
		Object[] evArgArray = event.getArgumentArray();
		if (null != evArgArray) {
			for (int i = 0; i < evArgArray.length; i++) {
				Object argument = evArgArray[i];
				if (argument instanceof Loggeable) {
					if (null == lstLoggeable) {
						lstLoggeable = new ArrayList<Loggeable>();
					}
					lstLoggeable.add((Loggeable) argument);
					evArgArray[i] = LOGGEABLE_FLAG;
				}
			}
		}

		String formattedMessage = getEncoded(event);

		if (null == lstLoggeable) {
			ev.addMessage(formattedMessage);
		} else {
			int previousMatchEndPos = 0;
			int idx = 0;

			Matcher match = LOGGEABLE_REGEXPPATTERN.matcher(formattedMessage);

			while (match.find()) {
				int beginIndex = previousMatchEndPos;
				int endIndex = match.start();

				if (endIndex > 0) {
					String nonLoggeablePart = formattedMessage.substring(
							beginIndex, endIndex);
					if (nonLoggeablePart.length() > 0) {
						ev.addMessage(nonLoggeablePart);
					}
				}

				ev.addMessage(lstLoggeable.get(idx));

				previousMatchEndPos = match.end();
				idx++;
			}

			if (previousMatchEndPos < formattedMessage.length()) {
				ev.addMessage(formattedMessage.substring(previousMatchEndPos));
			}
		}
	}

	/**
	 * @param event
	 *            Incoming logback event
	 * @return Encoded event using the current instance encoder
	 */
	protected String getEncoded(ILoggingEvent event) {
		ByteArrayOutputStream bos = null;
		try {
			bos = new ByteArrayOutputStream();
			encoder.init(bos);
			this.encoder.doEncode(event);
			return new String(bos.toByteArray());
		} catch (IOException e) {
			throw new LogbackException(e.getMessage(), e);
		} finally {
			if (null != bos) {
				try {
					bos.close();
				} catch (IOException e) {
					throw new LogbackException(e.getMessage(), e);
				}
			}
		}
	}

	public Encoder<ILoggingEvent> getEncoder() {
		return encoder;
	}

	public void setEncoder(Encoder<ILoggingEvent> encoder) {
		this.encoder = encoder;
	}
}
