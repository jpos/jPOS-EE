package org.jpos.logging.logback;

import static org.fest.assertions.Assertions.assertThat;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import org.jboss.logging.MDC;
import org.jpos.iso.ISOException;
import org.jpos.iso.ISOMsg;
import org.jpos.util.LogEvent;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.stubbing.Answer;

import ch.qos.logback.classic.Level;
import ch.qos.logback.classic.LoggerContext;
import ch.qos.logback.classic.encoder.PatternLayoutEncoder;
import ch.qos.logback.classic.spi.LoggingEvent;
import ch.qos.logback.core.Context;

/**
 * @author dgrandemange
 *
 */
public class LogbackAppenderTest {

	private LogbackAppender apd;
	private List<Object> payload;
	private LogEvent ev;
	private LoggingEvent logbackEvent;
	private PatternLayoutEncoder encoder;
	
	@Before
	public void setup() {
		apd = new LogbackAppender();
		encoder = new PatternLayoutEncoder();				
		Context context = new LoggerContext();
		encoder.setContext(context);				
		apd.setEncoder(encoder);
		
		encoder.setPattern("%msg");
		encoder.start();
		
		payload = new ArrayList<Object>();

		ev = Mockito.mock(LogEvent.class);
		logbackEvent = new LoggingEvent();
		logbackEvent.setLevel(Level.INFO);
		logbackEvent.setTimeStamp(Calendar.getInstance().getTimeInMillis());
		logbackEvent.setLoggerName(LogbackAppenderTest.class.getName());
		
		Answer<Void> answer = new Answer<Void>() {
			public Void answer(InvocationOnMock invocation) throws Throwable {
				Object[] arguments = invocation.getArguments();
				Object addedMsg = arguments[0];
				payload.add(addedMsg);
				return null;
			}
		};

		Mockito.doAnswer(answer).when(ev).addMessage(Mockito.any(Object.class));
	}

	@Test
	public void testPopulateLogEvent__NoArguments() {
		logbackEvent.setMessage("part{} part{} part{}");
		logbackEvent.setArgumentArray(null);
		// Force message formatting as it may be already set when received by the appender
		logbackEvent.getFormattedMessage();

		apd.populateJPosLogEvent(logbackEvent, ev);

		assertThat(payload).containsExactly(
				"part{} part{} part{}");
	}	
	
	@Test
	public void testPopulateLogEvent__NoLoggeable__Case() {
		logbackEvent.setMessage("part{} part{} part{}");
		logbackEvent.setArgumentArray(new Object[] { "_fmted1", "_fmted2",
				"_fmted3" });
		// Force message formatting as it may be already set when received by the appender
		logbackEvent.getFormattedMessage();

		apd.populateJPosLogEvent(logbackEvent, ev);

		assertThat(payload).containsExactly(
				"part_fmted1 part_fmted2 part_fmted3");
	}

	@Test
	public void testPopulateLogEvent__OneLoggeableOnly__Case() {
		ISOMsg isomsg1 = new ISOMsg(100);
		logbackEvent.setMessage("{}");
		logbackEvent.setArgumentArray(new Object[] { isomsg1 });
		// Force message formatting as it may be already set when received by the appender
		logbackEvent.getFormattedMessage();

		apd.populateJPosLogEvent(logbackEvent, ev);

		assertThat(payload).containsExactly(isomsg1);
	}

	@Test
	public void testPopulateLogEvent__SeveralLoggeables__Case() {
		ISOMsg isomsg1 = new ISOMsg(100);
		ISOMsg isomsg2 = new ISOMsg(110);
		logbackEvent.setMessage("{}{}");
		logbackEvent.setArgumentArray(new Object[] { isomsg1, isomsg2 });
		// Force message formatting as it may be already set when received by the appender
		logbackEvent.getFormattedMessage();

		apd.populateJPosLogEvent(logbackEvent, ev);

		assertThat(payload).containsExactly(isomsg1, isomsg2);
	}

	@Test
	public void testPopulateLogEvent__Mixing_NonLoggeables_And_Loggeables__Case1() {
		ISOMsg isomsg1 = new ISOMsg(100);
		ISOException ex = new ISOException();
		logbackEvent.setMessage("part{}{}part{}{}part{}");
		logbackEvent.setArgumentArray(new Object[] { "_fmted1", isomsg1,
				"_fmted2", ex, "_fmted3" });
		// Force message formatting as it may be already set when received by the appender
		logbackEvent.getFormattedMessage();

		apd.populateJPosLogEvent(logbackEvent, ev);

		assertThat(payload).containsExactly("part_fmted1", isomsg1,
				"part_fmted2", ex, "part_fmted3");
	}

	@Test
	public void testPopulateLogEvent__Mixing_NonLoggeables_And_Loggeables__Case2() {
		ISOMsg isomsg1 = new ISOMsg(100);
		ISOException ex = new ISOException();
		logbackEvent.setMessage("part{}{}part{}{}");
		logbackEvent.setArgumentArray(new Object[] { "_fmted1", isomsg1,
				"_fmted2", ex });
		// Force message formatting as it may be already set when received by the appender
		logbackEvent.getFormattedMessage();

		apd.populateJPosLogEvent(logbackEvent, ev);

		assertThat(payload).containsExactly("part_fmted1", isomsg1,
				"part_fmted2", ex);
	}

	@Test
	public void testPopulateLogEvent__Mixing_NonLoggeables_And_Loggeables__Case3() {
		ISOMsg isomsg1 = new ISOMsg(100);
		ISOException ex = new ISOException();
		logbackEvent.setMessage("{}part{}{}part{}");
		logbackEvent.setArgumentArray(new Object[] { isomsg1, "_fmted2", ex,
				"_fmted3" });
		// Force message formatting as it may be already set when received by the appender
		logbackEvent.getFormattedMessage();

		apd.populateJPosLogEvent(logbackEvent, ev);

		assertThat(payload).containsExactly(isomsg1, "part_fmted2", ex,
				"part_fmted3");
	}

	@Test
	public void testPopulateLogEvent__Mixing_NonLoggeables_And_Loggeables__MissingArgs_Case1() {
		ISOMsg isomsg1 = new ISOMsg(100);
		logbackEvent.setMessage("part{}{}part{}{}part{}");
		logbackEvent.setArgumentArray(new Object[] { "_fmted1", isomsg1,
				"_fmted2"});

		apd.populateJPosLogEvent(logbackEvent, ev);

		assertThat(payload).containsExactly("part_fmted1", isomsg1,
				"part_fmted2{}part{}");
	}

	@Test
	public void testPopulateLogEvent__Mixing_NonLoggeables_And_Loggeables__TooMuchArgs_Case1() {
		ISOMsg isomsg1 = new ISOMsg(100);
		logbackEvent.setMessage("part{}{}part{}");
		logbackEvent.setArgumentArray(new Object[] { "_fmted1", isomsg1,
				"_fmted2"});
		// Force message formatting as it may be already set when received by the appender
		logbackEvent.getFormattedMessage();

		apd.populateJPosLogEvent(logbackEvent, ev);

		assertThat(payload).containsExactly("part_fmted1", isomsg1,
				"part_fmted2");
	}	
	
	@Test
	public void testPopulateLogEvent__Mixing_NonLoggeables_And_Loggeables_Using_Complex_Encoder_Pattern__Case() {
		ISOMsg isomsg1 = new ISOMsg(100);
		ISOException ex = new ISOException();
		logbackEvent.setMessage("{}part{}{}part{}");
		logbackEvent.setArgumentArray(new Object[] { isomsg1, "_fmted2", ex,
				"_fmted3" });
		// Force message formatting as it may be already set when received by the appender
		logbackEvent.getFormattedMessage();

		encoder.setPattern("%-5level [%thread] %logger{0}: %msg");
		encoder.start();
		
		apd.populateJPosLogEvent(logbackEvent, ev);

		assertThat(payload).containsExactly("INFO  [main] LogbackAppenderTest: ", isomsg1, "part_fmted2", ex,
				"part_fmted3");
	}			

	@Test
	public void testPopulateLogEvent__Mixing_NonLoggeables_And_Loggeables_Using_Complex_Encoder_Pattern_Along_MDC_Vars__Case() {
		MDC.put("jpos.transaction.id", "1234567");
		MDC.put("myapp.transaction.id", "987654");
		
		ISOMsg isomsg1 = new ISOMsg(100);
		ISOException ex = new ISOException();
		logbackEvent.setMessage("{}part{}{}part{}");
		logbackEvent.setArgumentArray(new Object[] { isomsg1, "_fmted2", ex,
				"_fmted3" });
		// Force message formatting as it may be already set when received by the appender
		logbackEvent.getFormattedMessage();

		encoder.setPattern("%X{jpos.transaction.id}-%X{myapp.transaction.id} [%thread] %logger{0}: %msg");
		encoder.start();
		
		apd.populateJPosLogEvent(logbackEvent, ev);

		assertThat(payload).containsExactly("1234567-987654 [main] LogbackAppenderTest: ", isomsg1, "part_fmted2", ex,
				"part_fmted3");
	}	

	@Test
	public void testPopulateLogEvent__Mixing_NonLoggeables_And_Loggeables_Using_MDC_Vars_Wrapped_In_XML_Element__Case() {
		MDC.put("jpos.transaction.id", "1234567");
		MDC.put("myapp.transaction.id", "987654");
		
		ISOMsg isomsg1 = new ISOMsg(100);
		ISOException ex = new ISOException();
		logbackEvent.setMessage("{}part{}{}part{}");
		logbackEvent.setArgumentArray(new Object[] { isomsg1, "_fmted2", ex,
				"_fmted3" });
		// Force message formatting as it may be already set when received by the appender
		logbackEvent.getFormattedMessage();

		encoder.setPattern("<MDC jposTransactionId='%X{jpos.transaction.id}' myAppTransactionId='%X{myapp.transaction.id}'/> %msg");
		encoder.start();
		
		apd.populateJPosLogEvent(logbackEvent, ev);

		assertThat(payload).containsExactly("<MDC jposTransactionId='1234567' myAppTransactionId='987654'/> ", isomsg1, "part_fmted2", ex,
				"part_fmted3");
	}	

	@Test
	public void testPopulateLogEvent__Mixing_NonLoggeables_And_Loggeables_Using_MDC_Vars_Wrapped_In_XML_Element__Case2() {
		MDC.put("jpos.transaction.id", "1234567");
		MDC.put("myapp.transaction.id", "987654");
		
		ISOMsg isomsg1 = new ISOMsg(100);
		ISOException ex = new ISOException();
		logbackEvent.setMessage("{}part{}{}part{}");
		logbackEvent.setArgumentArray(new Object[] { isomsg1, "_fmted2", ex,
				"_fmted3" });
		// Force message formatting as it may be already set when received by the appender
		logbackEvent.getFormattedMessage();

		encoder.setPattern("<MDC jposTransactionId='%X{jpos.transaction.id}' myAppTransactionId='%X{myapp.transaction.id}'>%msg</MDC>");
		encoder.start();
		
		apd.populateJPosLogEvent(logbackEvent, ev);

		assertThat(payload).containsExactly("<MDC jposTransactionId='1234567' myAppTransactionId='987654'>", isomsg1, "part_fmted2", ex,
				"part_fmted3</MDC>");
	}		

}
