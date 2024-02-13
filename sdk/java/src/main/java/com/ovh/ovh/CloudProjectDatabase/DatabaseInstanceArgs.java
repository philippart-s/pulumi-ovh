// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.ovh.ovh.CloudProjectDatabase;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DatabaseInstanceArgs extends com.pulumi.resources.ResourceArgs {

    public static final DatabaseInstanceArgs Empty = new DatabaseInstanceArgs();

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
     * The engine of the database cluster you want to add. You can find the complete list of available engine in the [public documentation](https://docs.ovh.com/gb/en/publiccloud/databases).
     * Available engines:
     * 
     */
    @Import(name="engine", required=true)
    private Output<String> engine;

    /**
     * @return The engine of the database cluster you want to add. You can find the complete list of available engine in the [public documentation](https://docs.ovh.com/gb/en/publiccloud/databases).
     * Available engines:
     * 
     */
    public Output<String> engine() {
        return this.engine;
    }

    /**
     * Name of the database.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Name of the database.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
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

    private DatabaseInstanceArgs() {}

    private DatabaseInstanceArgs(DatabaseInstanceArgs $) {
        this.clusterId = $.clusterId;
        this.engine = $.engine;
        this.name = $.name;
        this.serviceName = $.serviceName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DatabaseInstanceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DatabaseInstanceArgs $;

        public Builder() {
            $ = new DatabaseInstanceArgs();
        }

        public Builder(DatabaseInstanceArgs defaults) {
            $ = new DatabaseInstanceArgs(Objects.requireNonNull(defaults));
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
         * @param engine The engine of the database cluster you want to add. You can find the complete list of available engine in the [public documentation](https://docs.ovh.com/gb/en/publiccloud/databases).
         * Available engines:
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
         * Available engines:
         * 
         * @return builder
         * 
         */
        public Builder engine(String engine) {
            return engine(Output.of(engine));
        }

        /**
         * @param name Name of the database.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Name of the database.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
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

        public DatabaseInstanceArgs build() {
            $.clusterId = Objects.requireNonNull($.clusterId, "expected parameter 'clusterId' to be non-null");
            $.engine = Objects.requireNonNull($.engine, "expected parameter 'engine' to be non-null");
            $.serviceName = Objects.requireNonNull($.serviceName, "expected parameter 'serviceName' to be non-null");
            return $;
        }
    }

}
