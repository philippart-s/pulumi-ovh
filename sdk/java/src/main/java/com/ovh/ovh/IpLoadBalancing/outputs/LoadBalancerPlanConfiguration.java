// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.ovh.ovh.IpLoadBalancing.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class LoadBalancerPlanConfiguration {
    /**
     * @return Identifier of the resource
     * 
     */
    private String label;
    /**
     * @return Path to the resource in API.OVH.COM
     * 
     */
    private String value;

    private LoadBalancerPlanConfiguration() {}
    /**
     * @return Identifier of the resource
     * 
     */
    public String label() {
        return this.label;
    }
    /**
     * @return Path to the resource in API.OVH.COM
     * 
     */
    public String value() {
        return this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LoadBalancerPlanConfiguration defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String label;
        private String value;
        public Builder() {}
        public Builder(LoadBalancerPlanConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.label = defaults.label;
    	      this.value = defaults.value;
        }

        @CustomType.Setter
        public Builder label(String label) {
            this.label = Objects.requireNonNull(label);
            return this;
        }
        @CustomType.Setter
        public Builder value(String value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }
        public LoadBalancerPlanConfiguration build() {
            final var o = new LoadBalancerPlanConfiguration();
            o.label = label;
            o.value = value;
            return o;
        }
    }
}
