
/*
 * Camel EndpointConfiguration generated by camel-api-component-maven-plugin
 */
package org.apache.camel.component.braintree;

import org.apache.camel.spi.Configurer;
import org.apache.camel.spi.ApiMethod;
import org.apache.camel.spi.ApiParam;
import org.apache.camel.spi.ApiParams;
import org.apache.camel.spi.UriParam;
import org.apache.camel.spi.UriParams;

/**
 * Camel endpoint configuration for {@link com.braintreegateway.ClientTokenGateway}.
 */
@ApiParams(apiName = "clientToken", description = "Generates client tokens, which are used to authenticate requests made directly on behalf of merchants This class does not need to be instantiated directly",
           apiMethods = {@ApiMethod(methodName = "generate"), @ApiMethod(methodName = "generate")})
@UriParams
@Configurer
public final class ClientTokenGatewayEndpointConfiguration extends BraintreeConfiguration {
    @UriParam
    @ApiParam(apiMethods = "generate")
    private com.braintreegateway.ClientTokenRequest request;

    public com.braintreegateway.ClientTokenRequest getRequest() {
        return request;
    }

    public void setRequest(com.braintreegateway.ClientTokenRequest request) {
        this.request = request;
    }
}
