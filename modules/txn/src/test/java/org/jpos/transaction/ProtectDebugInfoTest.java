package org.jpos.transaction;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.jpos.core.ConfigurationException;
import org.jpos.core.SimpleConfiguration;
import org.jpos.tlv.TLVList;
import org.junit.jupiter.api.Test;

public final class ProtectDebugInfoTest {

    @Test
    void test_wipe_tag() throws ConfigurationException {

        TLVList tlv = new TLVList();
        tlv.append(0x54, "AABBCCDDEEFF");
        tlv.append(0x55, "BBDDFFEEDDAA");

        SimpleConfiguration cfg = new SimpleConfiguration();
        cfg.put("protect-entry", "TEST_ENTRY");
        cfg.put("wipe-TLVList", "0x54");

        ProtectDebugInfo participant = new ProtectDebugInfo();
        participant.setConfiguration(cfg);

        Context ctx = new Context();
        ctx.put("TEST_ENTRY", tlv);

        participant.commit(0, ctx);

        ctx.dump(System.out, " ");
        assertNotEquals("AABBCCDDEEFF", tlv.getString(0x54));
        assertEquals("BBDDFFEEDDAA", tlv.getString(0x55));
    }
}