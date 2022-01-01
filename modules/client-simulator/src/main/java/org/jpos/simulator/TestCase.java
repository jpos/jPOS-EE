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

package org.jpos.simulator;

import org.jpos.iso.ISOMsg;
import org.jpos.iso.ISOUtil;
import org.jpos.util.Loggeable;
import java.io.PrintStream;

public class TestCase implements Loggeable {
    public static final int OK      = 0;
    public static final int FAILURE = 1;
    public static final int TIMEOUT = 2;

    String name;
    long start;
    long end;
    long timeout;
    ISOMsg request;
    ISOMsg expandedRequest;
    ISOMsg response;
    ISOMsg expectedResponse;
    String preEvaluationScript;
    String postEvaluationScript;
    int resultCode;
    boolean continueOnErrors;
    private String testcasePath;
    private long count;


    public TestCase (String name) {
        super();
        this.name = name;
        this.resultCode = -1;
        this.continueOnErrors = false;
    }
    public void setRequest (ISOMsg request) {
        this.request = request;
    }
    public void setResponse (ISOMsg response) {
        this.response = response;
    }
    public void setExpandedRequest (ISOMsg expandedRequest) {
        this.expandedRequest = expandedRequest;
    }
    public void setExpectedResponse (ISOMsg expectedResponse) {
        this.expectedResponse = expectedResponse;
    }
    public String getName () {
        return name;
    }
    public void setPreEvaluationScript (String preEvaluationScript) {
        this.preEvaluationScript = preEvaluationScript;
    }
    public String getPreEvaluationScript () {
        return preEvaluationScript;
    }
    public void setPostEvaluationScript (String postEvaluationScript) {
        this.postEvaluationScript = postEvaluationScript;
    }
    public String getPostEvaluationScript () {
        return postEvaluationScript;
    }
    public ISOMsg getRequest() {
        return request;
    }
    public ISOMsg getExpandedRequest() {
        return expandedRequest;
    }
    public ISOMsg getResponse() {
        return response;
    }
    public ISOMsg getExpectedResponse() {
        return expectedResponse;
    }
    public void setResultCode (int resultCode) {
        this.resultCode = resultCode;
    }
    public int getResultCode () {
        return resultCode;
    }
    public String getResultCodeAsString () {
        switch (resultCode) {
            case OK :
                return "OK";
            case FAILURE:
                return "FAILURE";
            case TIMEOUT:
                return "TIMEOUT";
            default:
                return Integer.toString (resultCode);
        }
    }
    public void dump (PrintStream p, String indent) {
        String inner = indent + "  ";
        p.println (indent + "<test-case name='" + name + "'>");
        p.println (inner + "<request>");
        request.dump (p, inner + "  ");
        p.println (inner + "</request>");
        if (expandedRequest != null) {
            p.println (inner + "<expanded-request>");
            expandedRequest.dump (p, inner + "  ");
            p.println (inner + "</expanded-request>");
        }
        p.println (inner + "<expected-response>");
        expectedResponse.dump (p, inner + "  ");
        p.println (inner + "</expected-response>");
        if (response != null) {
            p.println (inner + "<response>");
            response.dump (p, inner + "  ");
            p.println (inner + "</response>");
        }
        p.println (inner + "<elapsed>" + elapsed() + "</elapsed>");
        p.println (indent + "</test-case>");
    }
    public String toString() {
        StringBuffer sb = new StringBuffer(ISOUtil.strpad (name, 50));
        sb.append (" [");
        sb.append (getResultCodeAsString());
        sb.append ("] ");
        sb.append (elapsed());
        sb.append ("ms.");
        return sb.toString();
    }
    public void start() {
        start = System.currentTimeMillis();
    }
    public void end () {
        end = System.currentTimeMillis();
    }
    public long elapsed() {
        if (start != 0 && end == 0)
            end();
        return end - start;
    }
    public boolean ok() {
        return resultCode == OK;
    }
    public void setContinueOnErrors (boolean continueOnErrors) {
        this.continueOnErrors = continueOnErrors;
    }
    public boolean isContinueOnErrors () {
        return continueOnErrors;
    }
    public void setTimeout (long timeout) {
        this.timeout = timeout;
    }
    public long getTimeout () {
        return timeout;
    }
    public void setFilename(String string) {

        testcasePath  = string;
    }
    public String getFilename() {
        return testcasePath;
    }
	public void setCount(long count) {
		this.count = count;
	}
    public long getCount() {
        return count;
    }
	
}

