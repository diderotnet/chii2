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

package org.fourthline.cling.model.message.gena;

import org.fourthline.cling.model.meta.RemoteService;
import org.fourthline.cling.model.state.StateVariableValue;
import org.fourthline.cling.model.message.StreamRequestMessage;
import org.fourthline.cling.model.message.header.UpnpHeader;
import org.fourthline.cling.model.message.header.SubscriptionIdHeader;
import org.fourthline.cling.model.message.header.NTEventHeader;
import org.fourthline.cling.model.message.header.NTSHeader;
import org.fourthline.cling.model.message.header.EventSequenceHeader;
import org.fourthline.cling.model.types.NotificationSubtype;
import org.fourthline.cling.model.types.UnsignedIntegerFourBytes;

import java.util.List;
import java.util.ArrayList;

/**
 * @author Christian Bauer
 */
public class IncomingEventRequestMessage extends StreamRequestMessage {

    final private List<StateVariableValue> stateVariableValues = new ArrayList<StateVariableValue>();
    final private RemoteService service;

    public IncomingEventRequestMessage(StreamRequestMessage source, RemoteService service) {
        super(source);
        this.service = service;
    }

    public RemoteService getService() {
        return service;
    }

    public List<StateVariableValue> getStateVariableValues() {
        return stateVariableValues;
    }

    public String getSubscriptionId() {
        SubscriptionIdHeader header =
                getHeaders().getFirstHeader(UpnpHeader.Type.SID,SubscriptionIdHeader.class);
        return header != null ? header.getValue() : null;
    }

    public UnsignedIntegerFourBytes getSequence() {
        EventSequenceHeader header = getHeaders().getFirstHeader(UpnpHeader.Type.SEQ, EventSequenceHeader.class);
        return header != null ? header.getValue() : null;
    }

    /**
     * @return <code>true</code> if this message as an NT and NTS header.
     */
    public boolean hasNotificationHeaders() {
        UpnpHeader ntHeader = getHeaders().getFirstHeader(UpnpHeader.Type.NT);
        UpnpHeader ntsHeader = getHeaders().getFirstHeader(UpnpHeader.Type.NTS);
        return ntHeader != null && ntHeader.getValue() != null
                && ntsHeader != null && ntsHeader.getValue() != null;
    }

    /**
     * @return <code>true</code> if this message has an NT header, and NTS header
     *         with value {@link org.fourthline.cling.model.types.NotificationSubtype#PROPCHANGE}.
     */
    public boolean hasValidNotificationHeaders() {
        NTEventHeader ntHeader = getHeaders().getFirstHeader(UpnpHeader.Type.NT, NTEventHeader.class);
        NTSHeader ntsHeader = getHeaders().getFirstHeader(UpnpHeader.Type.NTS, NTSHeader.class);
        return ntHeader != null && ntHeader.getValue() != null
                && ntsHeader != null && ntsHeader.getValue().equals(NotificationSubtype.PROPCHANGE);

    }

    @Override
    public String toString() {
        return super.toString() + " SEQUENCE: " + getSequence().getValue();
    }
}
