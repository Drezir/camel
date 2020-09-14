
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
 * Camel endpoint configuration for {@link com.braintreegateway.TransactionGateway}.
 */
@ApiParams(apiName = "transaction", description = "Provides methods to interact with Transactions",
           apiMethods = {@ApiMethod(methodName = "cancelRelease", description="Cancels a pending release of a transaction with the given id from escrow"), @ApiMethod(methodName = "cloneTransaction"), @ApiMethod(methodName = "credit", description="Creates a credit Transaction"), @ApiMethod(methodName = "find", description="Finds a Transaction by id"), @ApiMethod(methodName = "holdInEscrow", description="Holds the transaction with the given id for escrow"), @ApiMethod(methodName = "refund", description="Refunds all or part of a previous sale Transaction"), @ApiMethod(methodName = "refund", description="Refunds all or part of a previous sale Transaction"), @ApiMethod(methodName = "refund", description="Refunds all or part of a previous sale Transaction"), @ApiMethod(methodName = "releaseFromEscrow", description="Submits the transaction with the given id for release"), @ApiMethod(methodName = "sale", description="Creates a sale Transaction"), @ApiMethod(methodName = "search", description="Finds all Transactions that match the query and returns a ResourceCollection"), @ApiMethod(methodName = "submitForPartialSettlement", description="Submits a partial settlement transaction for the given id"), @ApiMethod(methodName = "submitForPartialSettlement", description="Submits a partial settlement transaction for the given id"), @ApiMethod(methodName = "submitForSettlement", description="Submits the transaction with the given id to be settled along with a TransactionRequest object"), @ApiMethod(methodName = "submitForSettlement", description="Submits the transaction with the given id to be settled along with a TransactionRequest object"), @ApiMethod(methodName = "submitForSettlement", description="Submits the transaction with the given id to be settled along with a TransactionRequest object"), @ApiMethod(methodName = "updateDetails", description="Updates details for a transaction that has been submitted for settlement"), @ApiMethod(methodName = "voidTransaction", description="Voids the transaction with the given id")})
@UriParams
@Configurer
public final class TransactionGatewayEndpointConfiguration extends BraintreeConfiguration {
    @UriParam
    @ApiParam(apiMethods = "refund,submitForPartialSettlement,submitForSettlement")
    private java.math.BigDecimal amount;
    @UriParam
    @ApiParam(apiMethods = "cloneTransaction")
    private com.braintreegateway.TransactionCloneRequest cloneRequest;
    @UriParam
    @ApiParam(apiMethods = "cancelRelease,cloneTransaction,find,holdInEscrow,refund,releaseFromEscrow,submitForPartialSettlement,submitForSettlement,updateDetails,voidTransaction", description = "Of the transaction to cancel release from escrow of")
    private String id;
    @UriParam
    @ApiParam(apiMethods = "search", description = "The search query")
    private com.braintreegateway.TransactionSearchRequest query;
    @UriParam
    @ApiParam(apiMethods = "refund")
    private com.braintreegateway.TransactionRefundRequest refundRequest;
    @UriParam
    @ApiParam(apiMethods = "credit,sale,submitForPartialSettlement,submitForSettlement,updateDetails", description = "The request")
    private com.braintreegateway.TransactionRequest request;

    public java.math.BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(java.math.BigDecimal amount) {
        this.amount = amount;
    }

    public com.braintreegateway.TransactionCloneRequest getCloneRequest() {
        return cloneRequest;
    }

    public void setCloneRequest(com.braintreegateway.TransactionCloneRequest cloneRequest) {
        this.cloneRequest = cloneRequest;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public com.braintreegateway.TransactionSearchRequest getQuery() {
        return query;
    }

    public void setQuery(com.braintreegateway.TransactionSearchRequest query) {
        this.query = query;
    }

    public com.braintreegateway.TransactionRefundRequest getRefundRequest() {
        return refundRequest;
    }

    public void setRefundRequest(com.braintreegateway.TransactionRefundRequest refundRequest) {
        this.refundRequest = refundRequest;
    }

    public com.braintreegateway.TransactionRequest getRequest() {
        return request;
    }

    public void setRequest(com.braintreegateway.TransactionRequest request) {
        this.request = request;
    }
}
