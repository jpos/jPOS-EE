/*
 * jPOS Project [http://jpos.org]
 * Copyright (C) 2000-2020 jPOS Software SRL
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

package org.jpos.groovy

import groovy.transform.CompileStatic
import groovy.transform.Field

import org.jpos.transaction.Context
import org.jpos.util.Caller


// ### Groovy initialization to spice up Context object

def ctxmc= Context.metaClass

ctxmc.getProperty= { String name ->
    return delegate.get(name)
}

ctxmc.setProperty= { String name, Object val ->
    delegate.put(name, val)
}


ctxmc.getAt= { Object key ->
    return delegate.get(key)
}

ctxmc.putAt= { Object key, Object val ->
    delegate.put(key, val)
}


// ### Groovy alternatives for org.jpos.util.Caller#info() methods


// We want to ignore stack elements belonging to these classes
// This list and the shouldExclude method are inspired by org.codehaus.groovy.runtime.StackTraceUtils.isApplicationClass()
@Field static final List filter= [
                "groovy.lang.", "org.codehaus.groovy.", "org.apache.groovy.", "gjdk.groovy.",
                "sun.reflect.", "java.lang.reflect.",           // in older JDKs such as JDK 8
                "jdk.internal.reflect.",                        // in newer JDKs such as JDK 11
                "org.jpos.groovy.JPOSGroovyDefaults." ]
@CompileStatic
private static boolean shouldExclude(String className)
{
  for (String f in filter)
  {
    if (className.startsWith(f))
        return true
  }
  return false
}


/* Based on org.jpos.util.Caller.info(int) */
@CompileStatic
private static String info(int pos)
{
    StackTraceElement [] stels= Thread.currentThread().getStackTrace()
    StackTraceElement st= stels[stels.length - 1]       // avoid jumping out of the stack

    // Find the useful stack position,  when ignoring internal groovy and java reflection stuff
    int wantedPos= pos + 3
    pos= 0
    for (StackTraceElement el : stels)
    {
        if (!shouldExclude(el.getClassName()))
        {
            if (pos++ == wantedPos)
            {
                st= el  // found it!
                break
            }
        }
    }

    String clazz = st.getClassName()
    StringBuilder sb = new StringBuilder(Caller.shortClassName(clazz))
    return sb.append(".").append(st.getMethodName())
            .append(':')
            .append(Integer.toString(st.getLineNumber()))
            .toString()
}


def callermc= Caller.metaClass

callermc.static.info = { int p -> info(p) }
callermc.static.info = {       -> info(0) }

