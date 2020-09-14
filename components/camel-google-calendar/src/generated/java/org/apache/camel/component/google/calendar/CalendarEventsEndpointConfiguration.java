
/*
 * Camel EndpointConfiguration generated by camel-api-component-maven-plugin
 */
package org.apache.camel.component.google.calendar;

import org.apache.camel.spi.Configurer;
import org.apache.camel.spi.ApiMethod;
import org.apache.camel.spi.ApiParam;
import org.apache.camel.spi.ApiParams;
import org.apache.camel.spi.UriParam;
import org.apache.camel.spi.UriParams;

/**
 * Camel endpoint configuration for {@link com.google.api.services.calendar.Calendar$Events}.
 */
@ApiParams(apiName = "events", description = "The events collection of methods",
           apiMethods = {@ApiMethod(methodName = "calendarImport", description="Imports an event"), @ApiMethod(methodName = "delete", description="Deletes an event"), @ApiMethod(methodName = "get", description="Returns an event"), @ApiMethod(methodName = "insert", description="Creates an event"), @ApiMethod(methodName = "instances", description="Returns instances of the specified recurring event"), @ApiMethod(methodName = "list", description="Returns events on the specified calendar"), @ApiMethod(methodName = "move", description="Moves an event to another calendar, i"), @ApiMethod(methodName = "patch", description="Updates an event"), @ApiMethod(methodName = "quickAdd", description="Creates an event based on a simple text string"), @ApiMethod(methodName = "update", description="Updates an event"), @ApiMethod(methodName = "watch", description="Watch for changes to Events resources")})
@UriParams
@Configurer
public final class CalendarEventsEndpointConfiguration extends GoogleCalendarConfiguration {
    @UriParam
    @ApiParam(apiMethods = "calendarImport,delete,get,insert,instances,list,move,patch,quickAdd,update,watch", description = "Calendar identifier. To retrieve calendar IDs call the calendarList.list method. If you want to access the primary calendar of the currently logged in user, use the primary keyword.")
    private String calendarId;
    @UriParam
    @ApiParam(apiMethods = "calendarImport,insert,patch,update", description = "The com.google.api.services.calendar.model.Event")
    private com.google.api.services.calendar.model.Event content;
    @UriParam
    @ApiParam(apiMethods = "watch", description = "The com.google.api.services.calendar.model.Channel")
    private com.google.api.services.calendar.model.Channel contentChannel;
    @UriParam
    @ApiParam(apiMethods = "move", description = "Calendar identifier of the target calendar where the event is to be moved to")
    private String destination;
    @UriParam
    @ApiParam(apiMethods = "delete,get,instances,move,patch,update", description = "Event identifier")
    private String eventId;
    @UriParam
    @ApiParam(apiMethods = "quickAdd", description = "The text describing the event to be created")
    private String text;

    public String getCalendarId() {
        return calendarId;
    }

    public void setCalendarId(String calendarId) {
        this.calendarId = calendarId;
    }

    public com.google.api.services.calendar.model.Event getContent() {
        return content;
    }

    public void setContent(com.google.api.services.calendar.model.Event content) {
        this.content = content;
    }

    public com.google.api.services.calendar.model.Channel getContentChannel() {
        return contentChannel;
    }

    public void setContentChannel(com.google.api.services.calendar.model.Channel contentChannel) {
        this.contentChannel = contentChannel;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getEventId() {
        return eventId;
    }

    public void setEventId(String eventId) {
        this.eventId = eventId;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
