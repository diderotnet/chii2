/*
 * Copyright (C) 2011 4th Line GmbH, Switzerland
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation, either version 2 of
 * the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package org.fourthline.cling.model.message;

import org.seamless.http.Headers;
import org.fourthline.cling.model.message.header.UpnpHeader;

import java.io.ByteArrayInputStream;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Provides UPnP header API in addition to plain multi-map HTTP header access.
 *
 * @author Christian Bauer
 */
public class UpnpHeaders extends Headers {

    private static final Logger log = Logger.getLogger(UpnpHeaders.class.getName());

    protected Map<UpnpHeader.Type, List<UpnpHeader>> parsedHeaders;

    public UpnpHeaders() {
    }

    public UpnpHeaders(Map<String, List<String>> headers) {
        super(headers);
    }

    public UpnpHeaders(ByteArrayInputStream inputStream) {
        super(inputStream);
    }

    protected void parseHeaders() {
        // This runs as late as possible and only when necessary (getter called and map is dirty)
        parsedHeaders = new LinkedHashMap<UpnpHeader.Type, List<UpnpHeader>>();
        log.log(Level.FINE, "Parsing all HTTP headers for known UPnP headers: {0}", size());
        for (Entry<String, List<String>> entry : entrySet()) {

            if (entry.getKey() == null) continue; // Oh yes, the JDK has 'null' HTTP headers

            UpnpHeader.Type type = UpnpHeader.Type.getByHttpName(entry.getKey());
            if (type == null) {
                log.log(Level.FINE, "Ignoring non-UPNP HTTP header: {0}", entry.getKey());
                continue;
            }

            for (String value : entry.getValue()) {
                UpnpHeader upnpHeader = UpnpHeader.newInstance(type, value);
                if (upnpHeader == null || upnpHeader.getValue() == null) {
                    log.log(Level.FINE, "Ignoring known but non-parsable header (value violates the UDA specification?) '{0}': {1}", new Object[]{type.getHttpName(), value});
                } else {
                    addParsedValue(type, upnpHeader);
                }
            }
        }
    }

    protected void addParsedValue(UpnpHeader.Type type, UpnpHeader value) {
        log.log(Level.FINE, "Adding parsed header: {0}", value);
        List<UpnpHeader> list = parsedHeaders.get(type);
        if (list == null) {
            list = new LinkedList<UpnpHeader>();
            parsedHeaders.put(type, list);
        }
        list.add(value);
    }

    @Override
    public List<String> put(String key, List<String> values) {
        parsedHeaders = null;
        return super.put(key, values);
    }

    @Override
    public void add(String key, String value) {
        parsedHeaders = null;
        super.add(key, value);
    }

    @Override
    public List<String> remove(Object key) {
        parsedHeaders = null;
        return super.remove(key);
    }

    @Override
    public void clear() {
        parsedHeaders = null;
        super.clear();
    }

    public boolean containsKey(UpnpHeader.Type type) {
        if (parsedHeaders == null) parseHeaders();
        return parsedHeaders.containsKey(type);
    }

    public List<UpnpHeader> get(UpnpHeader.Type type) {
        if (parsedHeaders == null) parseHeaders();
        return parsedHeaders.get(type);
    }

    public void add(UpnpHeader.Type type, UpnpHeader value) {
        super.add(type.getHttpName(), value.getString());
        if (parsedHeaders != null)
            addParsedValue(type, value);
    }

    public void remove(UpnpHeader.Type type) {
        super.remove(type.getHttpName());
        if (parsedHeaders != null)
            parsedHeaders.remove(type);
    }

    public UpnpHeader[] getAsArray(UpnpHeader.Type type) {
        if (parsedHeaders == null) parseHeaders();
        return parsedHeaders.get(type) != null
                ? parsedHeaders.get(type).toArray(new UpnpHeader[parsedHeaders.get(type).size()])
                : new UpnpHeader[0];
    }

    public UpnpHeader getFirstHeader(UpnpHeader.Type type) {
        return getAsArray(type).length > 0
                ? getAsArray(type)[0]
                : null;
    }

    public <H extends UpnpHeader> H getFirstHeader(UpnpHeader.Type type, Class<H> subtype) {
        UpnpHeader[] headers = getAsArray(type);
        if (headers.length == 0) return null;

        for (UpnpHeader header : headers) {
            if (subtype.isAssignableFrom(header.getClass())) {
                return (H) header;
            }
        }
        return null;
    }

    public void log() {
        if (log.isLoggable(Level.FINE)) {
            log.fine("############################ RAW HEADERS ###########################");
            for (Entry<String, List<String>> entry : entrySet()) {
                log.log(Level.FINE, "=== NAME : {0}", entry.getKey());
                for (String v : entry.getValue()) {
                    log.log(Level.FINE, "VALUE: {0}", v);
                }
            }
            if (parsedHeaders != null && parsedHeaders.size() > 0) {
                log.fine("########################## PARSED HEADERS ##########################");
                for (Map.Entry<UpnpHeader.Type, List<UpnpHeader>> entry : parsedHeaders.entrySet()) {
                    log.log(Level.FINE, "=== TYPE: {0}", entry.getKey());
                    for (UpnpHeader upnpHeader : entry.getValue()) {
                        log.log(Level.FINE, "HEADER: {0}", upnpHeader);
                    }
                }
            }
            log.fine("####################################################################");
        }
    }

}
