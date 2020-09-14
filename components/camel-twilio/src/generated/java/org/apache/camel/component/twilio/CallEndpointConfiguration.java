
/*
 * Camel EndpointConfiguration generated by camel-api-component-maven-plugin
 */
package org.apache.camel.component.twilio;

import org.apache.camel.spi.Configurer;
import org.apache.camel.spi.ApiMethod;
import org.apache.camel.spi.ApiParam;
import org.apache.camel.spi.ApiParams;
import org.apache.camel.spi.UriParam;
import org.apache.camel.spi.UriParams;

/**
 * Camel endpoint configuration for {@link com.twilio.rest.api.v2010.account.Call}.
 */
@ApiParams(apiName = "call", description = "",
           apiMethods = {@ApiMethod(methodName = "creator", description="}"), @ApiMethod(methodName = "creator", description="}"), @ApiMethod(methodName = "creator", description="}"), @ApiMethod(methodName = "creator", description="}"), @ApiMethod(methodName = "creator", description="}"), @ApiMethod(methodName = "creator", description="}"), @ApiMethod(methodName = "deleter", description="}"), @ApiMethod(methodName = "deleter", description="}"), @ApiMethod(methodName = "fetcher", description="}"), @ApiMethod(methodName = "fetcher", description="}"), @ApiMethod(methodName = "reader", description="}"), @ApiMethod(methodName = "reader", description="}"), @ApiMethod(methodName = "updater", description="}"), @ApiMethod(methodName = "updater", description="}")})
@UriParams
@Configurer
public final class CallEndpointConfiguration extends TwilioConfiguration {
    @UriParam
    @ApiParam(apiMethods = "creator", description = "The SID of the Application resource that will handle the call")
    private String applicationSid;
    @UriParam
    @ApiParam(apiMethods = "creator", description = "Twilio number from which to originate the call")
    private com.twilio.type.Endpoint from;
    @UriParam
    @ApiParam(apiMethods = "creator,deleter,fetcher,reader,updater", description = "The SID of the Account that will create the resource")
    private String pathAccountSid;
    @UriParam
    @ApiParam(apiMethods = "deleter,fetcher,updater", description = "The unique string that identifies this resource")
    private String pathSid;
    @UriParam
    @ApiParam(apiMethods = "creator", description = "Phone number, SIP address, or client identifier to call")
    private com.twilio.type.Endpoint to;
    @UriParam
    @ApiParam(apiMethods = "creator", description = "TwiML instructions for the call")
    private com.twilio.type.Twiml twiml;
    @UriParam
    @ApiParam(apiMethods = "creator", description = "The absolute URL that returns TwiML for this call")
    private java.net.URI url;

    public String getApplicationSid() {
        return applicationSid;
    }

    public void setApplicationSid(String applicationSid) {
        this.applicationSid = applicationSid;
    }

    public com.twilio.type.Endpoint getFrom() {
        return from;
    }

    public void setFrom(com.twilio.type.Endpoint from) {
        this.from = from;
    }

    public String getPathAccountSid() {
        return pathAccountSid;
    }

    public void setPathAccountSid(String pathAccountSid) {
        this.pathAccountSid = pathAccountSid;
    }

    public String getPathSid() {
        return pathSid;
    }

    public void setPathSid(String pathSid) {
        this.pathSid = pathSid;
    }

    public com.twilio.type.Endpoint getTo() {
        return to;
    }

    public void setTo(com.twilio.type.Endpoint to) {
        this.to = to;
    }

    public com.twilio.type.Twiml getTwiml() {
        return twiml;
    }

    public void setTwiml(com.twilio.type.Twiml twiml) {
        this.twiml = twiml;
    }

    public java.net.URI getUrl() {
        return url;
    }

    public void setUrl(java.net.URI url) {
        this.url = url;
    }
}
