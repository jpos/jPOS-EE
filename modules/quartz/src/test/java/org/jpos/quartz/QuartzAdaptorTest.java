/*
 * jPOS Project [http://jpos.org]
 * Copyright (C) 2000-2026 jPOS Software SRL
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

package org.jpos.quartz;

import org.jdom2.Element;
import org.jpos.core.SimpleConfiguration;
import org.jpos.q2.Q2;
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

    @Test
    void testEnabledAndDisabledJob() throws Exception {
        // Define an enabled job
        Element enabledJob = new Element("job")
                .setAttribute("id", "EnabledJob")
                .setAttribute("class", TestJob.class.getName())
                .setAttribute("when", "* * * * * ?");

        // Define a disabled job by setting the 'enabled' attribute to false
        // This will be caught by QFactory.isEnabled(e) inside the loop
        Element disabledJob = new Element("job")
                .setAttribute("id", "DisabledJob")
                .setAttribute("class", TestJob.class.getName())
                .setAttribute("enabled", "false")
                .setAttribute("when", "* * * * * ?");

        Element config = new Element("cron")
                .addContent(enabledJob)
                .addContent(disabledJob);

        qa = new QuartzAdaptor();
        qa.setConfiguration(config);
        qa.setName("testDisabledJob");
        qa.setConfiguration(new SimpleConfiguration(new Properties()));
        qa.setServer(q2);

        // Execute initService to trigger the job scheduling logic
        qa.initService();

        assertNotNull(qa.scheduler);

        // Retrieve all scheduled jobs
        Set<JobKey> jobs = qa.scheduler.getJobKeys(GroupMatcher.anyJobGroup());

        // Verify that only 1 job was scheduled (the disabled one must be skipped)
        assertEquals(1, jobs.size(), "Only the enabled job should be scheduled");

        // Validate that the scheduled job is indeed the 'EnabledJob'
        JobKey key = jobs.iterator().next();
        assertEquals("EnabledJob", key.getName());
    }

    @AfterEach
    public void stopServices() {
        if (q2 != null) q2.stop();
        if (qa != null) qa.stop();
        System.clearProperty("cron_exp");
    }
}
