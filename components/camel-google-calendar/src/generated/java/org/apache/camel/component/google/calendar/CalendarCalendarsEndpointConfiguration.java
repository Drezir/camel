
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
 * Camel endpoint configuration for {@link com.google.api.services.calendar.Calendar$Calendars}.
 */
@ApiParams(apiName = "calendars", description = "The calendars collection of methods",
           apiMethods = {@ApiMethod(methodName = "clear", description="Clears a primary calendar"), @ApiMethod(methodName = "delete", description="Deletes a secondary calendar"), @ApiMethod(methodName = "get", description="Returns metadata for a calendar"), @ApiMethod(methodName = "insert", description="Creates a secondary calendar"), @ApiMethod(methodName = "patch", description="Updates metadata for a calendar"), @ApiMethod(methodName = "update", description="Updates metadata for a calendar")})
@UriParams
@Configurer
public final class CalendarCalendarsEndpointConfiguration extends GoogleCalendarConfiguration {
    @UriParam
    @ApiParam(apiMethods = "clear,delete,get,patch,update", description = "Calendar identifier. To retrieve calendar IDs call the calendarList.list method. If you want to access the primary calendar of the currently logged in user, use the primary keyword.")
    private String calendarId;
    @UriParam
    @ApiParam(apiMethods = "insert,patch,update", description = "The com.google.api.services.calendar.model.Calendar")
    private com.google.api.services.calendar.model.Calendar content;

    public String getCalendarId() {
        return calendarId;
    }

    public void setCalendarId(String calendarId) {
        this.calendarId = calendarId;
    }

    public com.google.api.services.calendar.model.Calendar getContent() {
        return content;
    }

    public void setContent(com.google.api.services.calendar.model.Calendar content) {
        this.content = content;
    }
}
