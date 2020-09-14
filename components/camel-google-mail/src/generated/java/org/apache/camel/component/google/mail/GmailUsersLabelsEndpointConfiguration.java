
/*
 * Camel EndpointConfiguration generated by camel-api-component-maven-plugin
 */
package org.apache.camel.component.google.mail;

import org.apache.camel.spi.Configurer;
import org.apache.camel.spi.ApiMethod;
import org.apache.camel.spi.ApiParam;
import org.apache.camel.spi.ApiParams;
import org.apache.camel.spi.UriParam;
import org.apache.camel.spi.UriParams;

/**
 * Camel endpoint configuration for {@link com.google.api.services.gmail.Gmail$Users$Labels}.
 */
@ApiParams(apiName = "labels", description = "The labels collection of methods",
           apiMethods = {@ApiMethod(methodName = "create", description="Creates a new label"), @ApiMethod(methodName = "delete", description="Immediately and permanently deletes the specified label and removes it from any messages and threads that it is applied to"), @ApiMethod(methodName = "get", description="Gets the specified label"), @ApiMethod(methodName = "list", description="Lists all labels in the user's mailbox"), @ApiMethod(methodName = "patch", description="Updates the specified label"), @ApiMethod(methodName = "update", description="Updates the specified label")})
@UriParams
@Configurer
public final class GmailUsersLabelsEndpointConfiguration extends GoogleMailConfiguration {
    @UriParam
    @ApiParam(apiMethods = "create,patch,update", description = "The com.google.api.services.gmail.model.Label")
    private com.google.api.services.gmail.model.Label content;
    @UriParam
    @ApiParam(apiMethods = "delete,get,patch,update", description = "The ID of the label to delete")
    private String id;
    @UriParam
    @ApiParam(apiMethods = "create,delete,get,list,patch,update", description = "The user's email address. The special value me can be used to indicate the authenticated user. default: me")
    private String userId;

    public com.google.api.services.gmail.model.Label getContent() {
        return content;
    }

    public void setContent(com.google.api.services.gmail.model.Label content) {
        this.content = content;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}
