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

package org.jpos.http;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.jpos.core.ConfigurationException;
import org.jpos.iso.ISOServer;
import org.jpos.q2.iso.QServer;
import org.jpos.util.NameRegistrar;
import org.jpos.util.NameRegistrar.NotFoundException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FilterISOMsgRegistry {
    private static final Logger logger = LoggerFactory.getLogger(FilterISOMsgRegistry.class);
    
    protected Map<String, FilterISOMsg> registry = new HashMap<String, FilterISOMsg>();
    protected Map<Integer, String> portRegistry = new HashMap<Integer, String>();
    
    protected boolean autoRegister = false;

    public static final FilterISOMsgRegistry instance = new FilterISOMsgRegistry();
    
    public boolean add(String name, boolean initialize) throws ConfigurationException, NotFoundException {
        if (registry.get(name) != null) return false;
        
        if ("*".equals(name)) {
            autoRegister = true;
            addAll(initialize);
        } else {        
            FilterISOMsg filter = new FilterISOMsg(name);
            init(filter, initialize);
            registry.put(name, filter);
        }
        
        return true;
    }
    
    @SuppressWarnings("unchecked")
    private Map<String, Object> getNameRegistryMap() throws ConfigurationException {
        // In order to support old jpos getMap and the newer getAsMap
        // we have to use reflection.
        Map<String, Object> map = null;
        Method getMap = null;
        try {
            getMap = NameRegistrar.class.getMethod("getAsMap", new Class[0]);
        } catch (Exception e) {
            try {
                getMap = NameRegistrar.class.getMethod("getMap", new Class[0]);
            } catch (NoSuchMethodException | SecurityException e1) {
            }
        }
        if (getMap != null) {
            try {
                map = (Map<String, Object>) getMap.invoke(NameRegistrar.class, new Object[0]);
            } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
                logger.warn("Error getting NameRegistrar getMap or getAsMap, posibly wrong JPOS version.", e);
                throw new ConfigurationException(e);
            }
        }
        return map;
    }
    
    private void addAll(boolean initialize) throws ConfigurationException {
        logger.debug("Adding All servers to http.");
        Map<String, Object> r = getNameRegistryMap();
        // Look for QServers to add. Note Also look for ISOServer to
        // keep compatibility with really old jpos.
        for(Map.Entry<String, Object> entry: r.entrySet()) {
            if (entry.getValue() instanceof QServer || entry.getValue() instanceof ISOServer) {
                try {
                    add(entry.getKey(), initialize);
                } catch (ConfigurationException | NotFoundException e) {
                    logger.warn("Problem registering server, ignoring", e);
                }
            }
        }

    }
    
    public List<String> getRegisteredNames() {
        return new ArrayList<String>(registry.keySet());
    }
    
    public List<Integer> getRegisteredPorts() {
        return new ArrayList<Integer>(portRegistry.keySet());
    }

    protected void init(FilterISOMsg filter, boolean initialize) throws ConfigurationException, NotFoundException {
        
        if (initialize) {
            filter.initialize();
        }
        
        if (filter.getPort() > 0) {
            portRegistry.put(filter.getPort(), filter.getName());
        }
    }
    
    public FilterISOMsg get(String name) {
        FilterISOMsg filter = registry.get(name);
        if (filter == null && name.matches("^\\d+$")) {
            Integer port = new Integer(name);
            name = portRegistry.get(port);
            if (name != null) {
                filter = registry.get(name);
            } else {
                if (autoRegister) {
                    try {
                        addAll(true);
                    } catch (ConfigurationException ignore) {
                        logger.warn("Problem with NameRegistrar posibly wrong JPOS version, ignoring.", ignore);
                    }
                }
                Map<String, FilterISOMsg> unregistered = new HashMap<String, FilterISOMsg>();
                unregistered.putAll(registry);
                unregistered.keySet().removeAll(portRegistry.values());
                for (FilterISOMsg f: unregistered.values()) {
                    try {
                        init(f, true);
                    } catch (ConfigurationException | NotFoundException e) {
                        logger.warn("Problem initializing server for http, ignoring", e);
                    }
                    if (f.getPort() == port) {
                        filter = f;
                        break;
                    }
                }
            }
        }
        
        return filter;
    }
    
}
