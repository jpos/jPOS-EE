/*
 * jPOS Project [http://jpos.org]
 * Copyright (C) 2000-2019 jPOS Software SRL
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

package org.jpos.groovy;


import java.net.URL;
import java.util.HashMap;

import groovy.lang.GroovyCodeSource;
import groovy.lang.GroovyShell;

/**
 * Helper methods to initialize and setup the Groovy environment
 *
 * @author <a href="mailto:barspi@transactility.com">Barzilai Spinak</a>
 */
public class GroovySetup
{
  // keep track of scripts that should be run only once
  // the key will be a normalized string of the script's URL
  // and the value will be what the script returned (which may be null)
  private static final HashMap<String,Object> initOnceScripts= new HashMap<>();


  public static Object runScriptOnce(URL url)
  {
    String urlExt= url.toExternalForm();              // used as key into the map
    synchronized (initOnceScripts)
    {
      if (!initOnceScripts.containsKey(urlExt))
      {
        GroovyShell sh= new GroovyShell();
        Object retVal= sh.evaluate(new GroovyCodeSource(url));
        // everything ok, without exceptions
        initOnceScripts.put(urlExt, retVal);          // retVal could be null but HashMap admits it
        return retVal;
      }
      else
      {
        return initOnceScripts.get(urlExt);           // return cached retVal
      }
    } // synch
  }
}
