/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.main;

import java.util.Map;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.spi.PropertyConfigurerGetter;
import org.apache.camel.util.CaseInsensitiveMap;
import org.apache.camel.main.ThreadPoolConfigurationProperties;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class ThreadPoolConfigurationPropertiesConfigurer extends org.apache.camel.support.component.PropertyConfigurerSupport implements GeneratedPropertyConfigurer, PropertyConfigurerGetter {

    private static final Map<String, Object> ALL_OPTIONS;
    static {
        Map<String, Object> map = new CaseInsensitiveMap();
        map.put("AllowCoreThreadTimeOut", java.lang.Boolean.class);
        map.put("Config", java.util.Map.class);
        map.put("KeepAliveTime", java.lang.Long.class);
        map.put("MaxPoolSize", java.lang.Integer.class);
        map.put("MaxQueueSize", java.lang.Integer.class);
        map.put("PoolSize", java.lang.Integer.class);
        map.put("RejectedPolicy", org.apache.camel.util.concurrent.ThreadPoolRejectedPolicy.class);
        map.put("TimeUnit", java.util.concurrent.TimeUnit.class);
        ALL_OPTIONS = map;
    }

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        org.apache.camel.main.ThreadPoolConfigurationProperties target = (org.apache.camel.main.ThreadPoolConfigurationProperties) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "allowcorethreadtimeout":
        case "AllowCoreThreadTimeOut": target.setAllowCoreThreadTimeOut(property(camelContext, java.lang.Boolean.class, value)); return true;
        case "config":
        case "Config": target.setConfig(property(camelContext, java.util.Map.class, value)); return true;
        case "keepalivetime":
        case "KeepAliveTime": target.setKeepAliveTime(property(camelContext, java.lang.Long.class, value)); return true;
        case "maxpoolsize":
        case "MaxPoolSize": target.setMaxPoolSize(property(camelContext, java.lang.Integer.class, value)); return true;
        case "maxqueuesize":
        case "MaxQueueSize": target.setMaxQueueSize(property(camelContext, java.lang.Integer.class, value)); return true;
        case "poolsize":
        case "PoolSize": target.setPoolSize(property(camelContext, java.lang.Integer.class, value)); return true;
        case "rejectedpolicy":
        case "RejectedPolicy": target.setRejectedPolicy(property(camelContext, org.apache.camel.util.concurrent.ThreadPoolRejectedPolicy.class, value)); return true;
        case "timeunit":
        case "TimeUnit": target.setTimeUnit(property(camelContext, java.util.concurrent.TimeUnit.class, value)); return true;
        default: return false;
        }
    }

    @Override
    public Map<String, Object> getAllOptions(Object target) {
        return ALL_OPTIONS;
    }

    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        org.apache.camel.main.ThreadPoolConfigurationProperties target = (org.apache.camel.main.ThreadPoolConfigurationProperties) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "allowcorethreadtimeout":
        case "AllowCoreThreadTimeOut": return target.getAllowCoreThreadTimeOut();
        case "config":
        case "Config": return target.getConfig();
        case "keepalivetime":
        case "KeepAliveTime": return target.getKeepAliveTime();
        case "maxpoolsize":
        case "MaxPoolSize": return target.getMaxPoolSize();
        case "maxqueuesize":
        case "MaxQueueSize": return target.getMaxQueueSize();
        case "poolsize":
        case "PoolSize": return target.getPoolSize();
        case "rejectedpolicy":
        case "RejectedPolicy": return target.getRejectedPolicy();
        case "timeunit":
        case "TimeUnit": return target.getTimeUnit();
        default: return null;
        }
    }

    @Override
    public Object getCollectionValueType(Object target, String name, boolean ignoreCase) {
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "config":
        case "Config": return org.apache.camel.main.ThreadPoolProfileConfigurationProperties.class;
        default: return null;
        }
    }
}

