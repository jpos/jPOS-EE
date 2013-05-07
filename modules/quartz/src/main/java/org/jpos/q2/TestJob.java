package org.jpos.q2;

public class TestJob extends QuartzJobSupport {
    public void run() {
        getLog().info(cfg.get ("message"));
    }
}

