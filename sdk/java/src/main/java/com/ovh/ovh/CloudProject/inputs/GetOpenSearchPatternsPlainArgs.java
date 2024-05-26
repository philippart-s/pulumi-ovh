// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.ovh.ovh.CloudProject.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class GetOpenSearchPatternsPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetOpenSearchPatternsPlainArgs Empty = new GetOpenSearchPatternsPlainArgs();

    /**
     * Cluster ID
     * 
     */
    @Import(name="clusterId", required=true)
    private String clusterId;

    /**
     * @return Cluster ID
     * 
     */
    public String clusterId() {
        return this.clusterId;
    }

    /**
     * The id of the public cloud project. If omitted,
     * the `OVH_CLOUD_PROJECT_SERVICE` environment variable is used.
     * 
     */
    @Import(name="serviceName", required=true)
    private String serviceName;

    /**
     * @return The id of the public cloud project. If omitted,
     * the `OVH_CLOUD_PROJECT_SERVICE` environment variable is used.
     * 
     */
    public String serviceName() {
        return this.serviceName;
    }

    private GetOpenSearchPatternsPlainArgs() {}

    private GetOpenSearchPatternsPlainArgs(GetOpenSearchPatternsPlainArgs $) {
        this.clusterId = $.clusterId;
        this.serviceName = $.serviceName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetOpenSearchPatternsPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetOpenSearchPatternsPlainArgs $;

        public Builder() {
            $ = new GetOpenSearchPatternsPlainArgs();
        }

        public Builder(GetOpenSearchPatternsPlainArgs defaults) {
            $ = new GetOpenSearchPatternsPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param clusterId Cluster ID
         * 
         * @return builder
         * 
         */
        public Builder clusterId(String clusterId) {
            $.clusterId = clusterId;
            return this;
        }

        /**
         * @param serviceName The id of the public cloud project. If omitted,
         * the `OVH_CLOUD_PROJECT_SERVICE` environment variable is used.
         * 
         * @return builder
         * 
         */
        public Builder serviceName(String serviceName) {
            $.serviceName = serviceName;
            return this;
        }

        public GetOpenSearchPatternsPlainArgs build() {
            if ($.clusterId == null) {
                throw new MissingRequiredPropertyException("GetOpenSearchPatternsPlainArgs", "clusterId");
            }
            if ($.serviceName == null) {
                throw new MissingRequiredPropertyException("GetOpenSearchPatternsPlainArgs", "serviceName");
            }
            return $;
        }
    }

}