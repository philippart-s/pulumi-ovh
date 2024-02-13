// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.ovh.ovh.CloudProjectDatabase;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class IntegrationArgs extends com.pulumi.resources.ResourceArgs {

    public static final IntegrationArgs Empty = new IntegrationArgs();

    /**
     * Cluster ID.
     * 
     */
    @Import(name="clusterId", required=true)
    private Output<String> clusterId;

    /**
     * @return Cluster ID.
     * 
     */
    public Output<String> clusterId() {
        return this.clusterId;
    }

    /**
     * ID of the destination service.
     * 
     */
    @Import(name="destinationServiceId", required=true)
    private Output<String> destinationServiceId;

    /**
     * @return ID of the destination service.
     * 
     */
    public Output<String> destinationServiceId() {
        return this.destinationServiceId;
    }

    /**
     * The engine of the database cluster you want to add. You can find the complete list of available engine in the [public documentation](https://docs.ovh.com/gb/en/publiccloud/databases).
     * All engines available exept `mongodb`.
     * 
     */
    @Import(name="engine", required=true)
    private Output<String> engine;

    /**
     * @return The engine of the database cluster you want to add. You can find the complete list of available engine in the [public documentation](https://docs.ovh.com/gb/en/publiccloud/databases).
     * All engines available exept `mongodb`.
     * 
     */
    public Output<String> engine() {
        return this.engine;
    }

    /**
     * Parameters for the integration.
     * 
     */
    @Import(name="parameters")
    private @Nullable Output<Map<String,String>> parameters;

    /**
     * @return Parameters for the integration.
     * 
     */
    public Optional<Output<Map<String,String>>> parameters() {
        return Optional.ofNullable(this.parameters);
    }

    /**
     * The id of the public cloud project. If omitted,
     * the `OVH_CLOUD_PROJECT_SERVICE` environment variable is used.
     * 
     */
    @Import(name="serviceName", required=true)
    private Output<String> serviceName;

    /**
     * @return The id of the public cloud project. If omitted,
     * the `OVH_CLOUD_PROJECT_SERVICE` environment variable is used.
     * 
     */
    public Output<String> serviceName() {
        return this.serviceName;
    }

    /**
     * ID of the source service.
     * 
     */
    @Import(name="sourceServiceId", required=true)
    private Output<String> sourceServiceId;

    /**
     * @return ID of the source service.
     * 
     */
    public Output<String> sourceServiceId() {
        return this.sourceServiceId;
    }

    /**
     * Type of the integration.
     * Available types:
     * 
     */
    @Import(name="type")
    private @Nullable Output<String> type;

    /**
     * @return Type of the integration.
     * Available types:
     * 
     */
    public Optional<Output<String>> type() {
        return Optional.ofNullable(this.type);
    }

    private IntegrationArgs() {}

    private IntegrationArgs(IntegrationArgs $) {
        this.clusterId = $.clusterId;
        this.destinationServiceId = $.destinationServiceId;
        this.engine = $.engine;
        this.parameters = $.parameters;
        this.serviceName = $.serviceName;
        this.sourceServiceId = $.sourceServiceId;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(IntegrationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private IntegrationArgs $;

        public Builder() {
            $ = new IntegrationArgs();
        }

        public Builder(IntegrationArgs defaults) {
            $ = new IntegrationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param clusterId Cluster ID.
         * 
         * @return builder
         * 
         */
        public Builder clusterId(Output<String> clusterId) {
            $.clusterId = clusterId;
            return this;
        }

        /**
         * @param clusterId Cluster ID.
         * 
         * @return builder
         * 
         */
        public Builder clusterId(String clusterId) {
            return clusterId(Output.of(clusterId));
        }

        /**
         * @param destinationServiceId ID of the destination service.
         * 
         * @return builder
         * 
         */
        public Builder destinationServiceId(Output<String> destinationServiceId) {
            $.destinationServiceId = destinationServiceId;
            return this;
        }

        /**
         * @param destinationServiceId ID of the destination service.
         * 
         * @return builder
         * 
         */
        public Builder destinationServiceId(String destinationServiceId) {
            return destinationServiceId(Output.of(destinationServiceId));
        }

        /**
         * @param engine The engine of the database cluster you want to add. You can find the complete list of available engine in the [public documentation](https://docs.ovh.com/gb/en/publiccloud/databases).
         * All engines available exept `mongodb`.
         * 
         * @return builder
         * 
         */
        public Builder engine(Output<String> engine) {
            $.engine = engine;
            return this;
        }

        /**
         * @param engine The engine of the database cluster you want to add. You can find the complete list of available engine in the [public documentation](https://docs.ovh.com/gb/en/publiccloud/databases).
         * All engines available exept `mongodb`.
         * 
         * @return builder
         * 
         */
        public Builder engine(String engine) {
            return engine(Output.of(engine));
        }

        /**
         * @param parameters Parameters for the integration.
         * 
         * @return builder
         * 
         */
        public Builder parameters(@Nullable Output<Map<String,String>> parameters) {
            $.parameters = parameters;
            return this;
        }

        /**
         * @param parameters Parameters for the integration.
         * 
         * @return builder
         * 
         */
        public Builder parameters(Map<String,String> parameters) {
            return parameters(Output.of(parameters));
        }

        /**
         * @param serviceName The id of the public cloud project. If omitted,
         * the `OVH_CLOUD_PROJECT_SERVICE` environment variable is used.
         * 
         * @return builder
         * 
         */
        public Builder serviceName(Output<String> serviceName) {
            $.serviceName = serviceName;
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
            return serviceName(Output.of(serviceName));
        }

        /**
         * @param sourceServiceId ID of the source service.
         * 
         * @return builder
         * 
         */
        public Builder sourceServiceId(Output<String> sourceServiceId) {
            $.sourceServiceId = sourceServiceId;
            return this;
        }

        /**
         * @param sourceServiceId ID of the source service.
         * 
         * @return builder
         * 
         */
        public Builder sourceServiceId(String sourceServiceId) {
            return sourceServiceId(Output.of(sourceServiceId));
        }

        /**
         * @param type Type of the integration.
         * Available types:
         * 
         * @return builder
         * 
         */
        public Builder type(@Nullable Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type Type of the integration.
         * Available types:
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        public IntegrationArgs build() {
            $.clusterId = Objects.requireNonNull($.clusterId, "expected parameter 'clusterId' to be non-null");
            $.destinationServiceId = Objects.requireNonNull($.destinationServiceId, "expected parameter 'destinationServiceId' to be non-null");
            $.engine = Objects.requireNonNull($.engine, "expected parameter 'engine' to be non-null");
            $.serviceName = Objects.requireNonNull($.serviceName, "expected parameter 'serviceName' to be non-null");
            $.sourceServiceId = Objects.requireNonNull($.sourceServiceId, "expected parameter 'sourceServiceId' to be non-null");
            return $;
        }
    }

}
