package org.jpos.flyway;

import org.jdom2.Element;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author Arturo Volpe
 * @since 2022-05-12
 */
class FlywayServiceTest {

    @Test
    void test_empty_config() throws Exception {

        FlywayService flywayService = new FlywayService();
        flywayService.setConfiguration(new Element("flyway"));

        assertEquals("info", flywayService.commands);
    }

    @Test
    void test_static_config() throws Exception {

        FlywayService flywayService = new FlywayService();
        flywayService.setConfiguration(new Element("flyway")
                .addContent(new Element("commands").addContent("info"))
        );

        assertEquals("info", flywayService.commands);
    }

    @Test
    void test_env_config() throws Exception {

        System.setProperty("flyway_commands", "info migrate");
        FlywayService flywayService = new FlywayService();
        flywayService.setConfiguration(new Element("flyway")
                .addContent(new Element("commands").addContent("${flyway_commands}"))
        );

        assertEquals("info migrate", flywayService.commands);
    }
}
