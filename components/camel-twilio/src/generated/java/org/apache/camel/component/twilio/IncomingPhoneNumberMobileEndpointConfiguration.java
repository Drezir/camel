
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
 * Camel endpoint configuration for {@link com.twilio.rest.api.v2010.account.incomingphonenumber.Mobile}.
 */
@ApiParams(apiName = "incoming-phone-number-mobile", description = "",
           apiMethods = {@ApiMethod(methodName = "creator", description="}"), @ApiMethod(methodName = "creator", description="}"), @ApiMethod(methodName = "reader", description="}"), @ApiMethod(methodName = "reader", description="}")})
@UriParams
@Configurer
public final class IncomingPhoneNumberMobileEndpointConfiguration extends TwilioConfiguration {
    @UriParam
    @ApiParam(apiMethods = "creator,reader", description = "The SID of the Account that will create the resource")
    private String pathAccountSid;
    @UriParam
    @ApiParam(apiMethods = "creator", description = "The phone number to purchase in E.164 format")
    private com.twilio.type.PhoneNumber phoneNumber;

    public String getPathAccountSid() {
        return pathAccountSid;
    }

    public void setPathAccountSid(String pathAccountSid) {
        this.pathAccountSid = pathAccountSid;
    }

    public com.twilio.type.PhoneNumber getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(com.twilio.type.PhoneNumber phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
