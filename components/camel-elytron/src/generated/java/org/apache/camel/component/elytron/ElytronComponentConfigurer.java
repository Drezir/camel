/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.elytron;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.support.component.PropertyConfigurerSupport;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class ElytronComponentConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer {

    @Override
    public boolean configure(CamelContext camelContext, Object target, String name, Object value, boolean ignoreCase) {
        if (ignoreCase) {
            return doConfigureIgnoreCase(camelContext, target, name, value);
        } else {
            return doConfigure(camelContext, target, name, value);
        }
    }

    private static boolean doConfigure(CamelContext camelContext, Object target, String name, Object value) {
        switch (name) {
        case "securityDomainBuilder": ((ElytronComponent) target).setSecurityDomainBuilder(property(camelContext, org.wildfly.security.auth.server.SecurityDomain.Builder.class, value)); return true;
        case "mechanismName": ((ElytronComponent) target).setMechanismName(property(camelContext, java.lang.String.class, value)); return true;
        case "elytronProvider": ((ElytronComponent) target).setElytronProvider(property(camelContext, org.wildfly.security.WildFlyElytronBaseProvider.class, value)); return true;
        case "undertowHttpBinding": ((ElytronComponent) target).setUndertowHttpBinding(property(camelContext, org.apache.camel.component.undertow.UndertowHttpBinding.class, value)); return true;
        case "sslContextParameters": ((ElytronComponent) target).setSslContextParameters(property(camelContext, org.apache.camel.support.jsse.SSLContextParameters.class, value)); return true;
        case "useGlobalSslContextParameters": ((ElytronComponent) target).setUseGlobalSslContextParameters(property(camelContext, boolean.class, value)); return true;
        case "hostOptions": ((ElytronComponent) target).setHostOptions(property(camelContext, org.apache.camel.component.undertow.UndertowHostOptions.class, value)); return true;
        case "muteException": ((ElytronComponent) target).setMuteException(property(camelContext, boolean.class, value)); return true;
        case "basicPropertyBinding": ((ElytronComponent) target).setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "lazyStartProducer": ((ElytronComponent) target).setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "bridgeErrorHandler": ((ElytronComponent) target).setBridgeErrorHandler(property(camelContext, boolean.class, value)); return true;
            default: return false;
        }
    }

    private static boolean doConfigureIgnoreCase(CamelContext camelContext, Object target, String name, Object value) {
        switch (name.toLowerCase()) {
        case "securitydomainbuilder": ((ElytronComponent) target).setSecurityDomainBuilder(property(camelContext, org.wildfly.security.auth.server.SecurityDomain.Builder.class, value)); return true;
        case "mechanismname": ((ElytronComponent) target).setMechanismName(property(camelContext, java.lang.String.class, value)); return true;
        case "elytronprovider": ((ElytronComponent) target).setElytronProvider(property(camelContext, org.wildfly.security.WildFlyElytronBaseProvider.class, value)); return true;
        case "undertowhttpbinding": ((ElytronComponent) target).setUndertowHttpBinding(property(camelContext, org.apache.camel.component.undertow.UndertowHttpBinding.class, value)); return true;
        case "sslcontextparameters": ((ElytronComponent) target).setSslContextParameters(property(camelContext, org.apache.camel.support.jsse.SSLContextParameters.class, value)); return true;
        case "useglobalsslcontextparameters": ((ElytronComponent) target).setUseGlobalSslContextParameters(property(camelContext, boolean.class, value)); return true;
        case "hostoptions": ((ElytronComponent) target).setHostOptions(property(camelContext, org.apache.camel.component.undertow.UndertowHostOptions.class, value)); return true;
        case "muteexception": ((ElytronComponent) target).setMuteException(property(camelContext, boolean.class, value)); return true;
        case "basicpropertybinding": ((ElytronComponent) target).setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "lazystartproducer": ((ElytronComponent) target).setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "bridgeerrorhandler": ((ElytronComponent) target).setBridgeErrorHandler(property(camelContext, boolean.class, value)); return true;
            default: return false;
        }
    }

}
