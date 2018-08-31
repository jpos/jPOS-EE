package org.jpos.qi.minigl;

public enum MiniGLConstants
{
    // Some values from SysConfig pertaining to miniGL
    DEFAULT_GL_JOURNAL("GL_JOURNAL"),
    DEFAULT_GL_CHART("GL_CHART"),
    DEFAULT_GL_ISSUERS_ACCT("ISSUERS_ACCT");


    private final String name;

    MiniGLConstants() {
        this.name = name();
    }

    MiniGLConstants(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
