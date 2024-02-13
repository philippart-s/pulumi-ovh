// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.ovh.ovh.CloudProject.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetCapabilitiesContainerFilterArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetCapabilitiesContainerFilterArgs Empty = new GetCapabilitiesContainerFilterArgs();

    /**
     * The plan name. It can be &#39;SMALL&#39;, &#39;MEDIUM&#39; or &#39;LARGE&#39;.
     * 
     */
    @Import(name="planName", required=true)
    private Output<String> planName;

    /**
     * @return The plan name. It can be &#39;SMALL&#39;, &#39;MEDIUM&#39; or &#39;LARGE&#39;.
     * 
     */
    public Output<String> planName() {
        return this.planName;
    }

    /**
     * The region name
     * 
     */
    @Import(name="region", required=true)
    private Output<String> region;

    /**
     * @return The region name
     * 
     */
    public Output<String> region() {
        return this.region;
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

    private GetCapabilitiesContainerFilterArgs() {}

    private GetCapabilitiesContainerFilterArgs(GetCapabilitiesContainerFilterArgs $) {
        this.planName = $.planName;
        this.region = $.region;
        this.serviceName = $.serviceName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetCapabilitiesContainerFilterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetCapabilitiesContainerFilterArgs $;

        public Builder() {
            $ = new GetCapabilitiesContainerFilterArgs();
        }

        public Builder(GetCapabilitiesContainerFilterArgs defaults) {
            $ = new GetCapabilitiesContainerFilterArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param planName The plan name. It can be &#39;SMALL&#39;, &#39;MEDIUM&#39; or &#39;LARGE&#39;.
         * 
         * @return builder
         * 
         */
        public Builder planName(Output<String> planName) {
            $.planName = planName;
            return this;
        }

        /**
         * @param planName The plan name. It can be &#39;SMALL&#39;, &#39;MEDIUM&#39; or &#39;LARGE&#39;.
         * 
         * @return builder
         * 
         */
        public Builder planName(String planName) {
            return planName(Output.of(planName));
        }

        /**
         * @param region The region name
         * 
         * @return builder
         * 
         */
        public Builder region(Output<String> region) {
            $.region = region;
            return this;
        }

        /**
         * @param region The region name
         * 
         * @return builder
         * 
         */
        public Builder region(String region) {
            return region(Output.of(region));
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

        public GetCapabilitiesContainerFilterArgs build() {
            $.planName = Objects.requireNonNull($.planName, "expected parameter 'planName' to be non-null");
            $.region = Objects.requireNonNull($.region, "expected parameter 'region' to be non-null");
            $.serviceName = Objects.requireNonNull($.serviceName, "expected parameter 'serviceName' to be non-null");
            return $;
        }
    }

}
