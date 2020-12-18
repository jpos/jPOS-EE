package org.jpos.q2;

import org.jdom2.Element;
import org.jpos.core.SimpleConfiguration;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.quartz.CronTrigger;
import org.quartz.JobKey;
import org.quartz.Trigger;
import org.quartz.impl.matchers.GroupMatcher;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Properties;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Arturo Volpe
 * @since 12/18/20
 */
class QuartzAdaptorTest {

    Q2 q2 = null;
    QuartzAdaptor qa = null;

    @BeforeEach
    void startQ2() throws Exception {
        Path deployDir = Files.createTempDirectory("quartz_test");
        q2 = new Q2(deployDir.toString());
        q2.start();
        assertTrue(q2.ready(60_000));
    }

    @Test
    void testBasicCreation() throws Exception {

        Element job = new Element("job")
                .setAttribute("id", TestJob.class.getSimpleName())
                .setAttribute("class", TestJob.class.getName())
                .setAttribute("when", "* * * * * ?");
        Element config = new Element("bean")
                .addContent(job);


        qa = new QuartzAdaptor();
        qa.setConfiguration(config);
        qa.setName("testQuartz");
        qa.setConfiguration(new SimpleConfiguration(new Properties()));
        qa.setServer(q2);

        qa.initService();

        assertNotNull(qa.scheduler);
        Set<JobKey> jobs = qa.scheduler.getJobKeys(GroupMatcher.anyJobGroup());
        assertEquals(1, jobs.size());

        JobKey key = jobs.iterator().next();
        List<? extends Trigger> trigger = qa.scheduler.getTriggersOfJob(key);
        CronTrigger cron = (CronTrigger) trigger.get(0);
        assertEquals("* * * * * ?", cron.getCronExpression());
    }

    @Test
    void testCreationWithEnvironment() throws Exception {

        System.setProperty("cron_exp", "1 1 1 1 1 ?");

        Element job = new Element("job")
                .setAttribute("id", TestJob.class.getSimpleName())
                .setAttribute("class", TestJob.class.getName())
                .setAttribute("when", "${cron_exp}");
        Element config = new Element("bean")
                .addContent(job);


        qa = new QuartzAdaptor();
        qa.setConfiguration(config);
        qa.setName("testQuartzWithExp");
        qa.setConfiguration(new SimpleConfiguration(new Properties()));
        qa.setServer(q2);

        qa.initService();

        assertNotNull(qa.scheduler);
        Set<JobKey> jobs = qa.scheduler.getJobKeys(GroupMatcher.anyJobGroup());
        assertEquals(1, jobs.size());

        JobKey key = jobs.iterator().next();
        List<? extends Trigger> trigger = qa.scheduler.getTriggersOfJob(key);
        CronTrigger cron = (CronTrigger) trigger.get(0);
        assertEquals("1 1 1 1 1 ?", cron.getCronExpression());
    }

    @AfterEach
    public void stopServices() {
        if (q2 != null) q2.stop();
        if (qa != null) qa.stop();
        System.clearProperty("cron_exp");
    }
}
