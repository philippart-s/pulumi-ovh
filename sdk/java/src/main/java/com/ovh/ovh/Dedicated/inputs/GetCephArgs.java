// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.ovh.ovh.Dedicated.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetCephArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetCephArgs Empty = new GetCephArgs();

    /**
     * CEPH cluster version
     * 
     */
    @Import(name="cephVersion")
    private @Nullable Output<String> cephVersion;

    /**
     * @return CEPH cluster version
     * 
     */
    public Optional<Output<String>> cephVersion() {
        return Optional.ofNullable(this.cephVersion);
    }

    /**
     * The service name of the dedicated CEPH cluster.
     * 
     */
    @Import(name="serviceName", required=true)
    private Output<String> serviceName;

    /**
     * @return The service name of the dedicated CEPH cluster.
     * 
     */
    public Output<String> serviceName() {
        return this.serviceName;
    }

    /**
     * the status of the service
     * 
     */
    @Import(name="status")
    private @Nullable Output<String> status;

    /**
     * @return the status of the service
     * 
     */
    public Optional<Output<String>> status() {
        return Optional.ofNullable(this.status);
    }

    private GetCephArgs() {}

    private GetCephArgs(GetCephArgs $) {
        this.cephVersion = $.cephVersion;
        this.serviceName = $.serviceName;
        this.status = $.status;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetCephArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetCephArgs $;

        public Builder() {
            $ = new GetCephArgs();
        }

        public Builder(GetCephArgs defaults) {
            $ = new GetCephArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param cephVersion CEPH cluster version
         * 
         * @return builder
         * 
         */
        public Builder cephVersion(@Nullable Output<String> cephVersion) {
            $.cephVersion = cephVersion;
            return this;
        }

        /**
         * @param cephVersion CEPH cluster version
         * 
         * @return builder
         * 
         */
        public Builder cephVersion(String cephVersion) {
            return cephVersion(Output.of(cephVersion));
        }

        /**
         * @param serviceName The service name of the dedicated CEPH cluster.
         * 
         * @return builder
         * 
         */
        public Builder serviceName(Output<String> serviceName) {
            $.serviceName = serviceName;
            return this;
        }

        /**
         * @param serviceName The service name of the dedicated CEPH cluster.
         * 
         * @return builder
         * 
         */
        public Builder serviceName(String serviceName) {
            return serviceName(Output.of(serviceName));
        }

        /**
         * @param status the status of the service
         * 
         * @return builder
         * 
         */
        public Builder status(@Nullable Output<String> status) {
            $.status = status;
            return this;
        }

        /**
         * @param status the status of the service
         * 
         * @return builder
         * 
         */
        public Builder status(String status) {
            return status(Output.of(status));
        }

        public GetCephArgs build() {
            $.serviceName = Objects.requireNonNull($.serviceName, "expected parameter 'serviceName' to be non-null");
            return $;
        }
    }

}
