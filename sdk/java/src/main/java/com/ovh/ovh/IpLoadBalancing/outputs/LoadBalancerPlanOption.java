// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.ovh.ovh.IpLoadBalancing.outputs;

import com.ovh.ovh.IpLoadBalancing.outputs.LoadBalancerPlanOptionConfiguration;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class LoadBalancerPlanOption {
    /**
     * @return Catalog name
     * 
     */
    private @Nullable String catalogName;
    /**
     * @return Representation of a configuration item for personalizing product
     * 
     */
    private @Nullable List<LoadBalancerPlanOptionConfiguration> configurations;
    /**
     * @return duration
     * 
     */
    private String duration;
    /**
     * @return Plan code
     * 
     */
    private String planCode;
    /**
     * @return Pricing model identifier
     * 
     */
    private String pricingMode;

    private LoadBalancerPlanOption() {}
    /**
     * @return Catalog name
     * 
     */
    public Optional<String> catalogName() {
        return Optional.ofNullable(this.catalogName);
    }
    /**
     * @return Representation of a configuration item for personalizing product
     * 
     */
    public List<LoadBalancerPlanOptionConfiguration> configurations() {
        return this.configurations == null ? List.of() : this.configurations;
    }
    /**
     * @return duration
     * 
     */
    public String duration() {
        return this.duration;
    }
    /**
     * @return Plan code
     * 
     */
    public String planCode() {
        return this.planCode;
    }
    /**
     * @return Pricing model identifier
     * 
     */
    public String pricingMode() {
        return this.pricingMode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LoadBalancerPlanOption defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String catalogName;
        private @Nullable List<LoadBalancerPlanOptionConfiguration> configurations;
        private String duration;
        private String planCode;
        private String pricingMode;
        public Builder() {}
        public Builder(LoadBalancerPlanOption defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.catalogName = defaults.catalogName;
    	      this.configurations = defaults.configurations;
    	      this.duration = defaults.duration;
    	      this.planCode = defaults.planCode;
    	      this.pricingMode = defaults.pricingMode;
        }

        @CustomType.Setter
        public Builder catalogName(@Nullable String catalogName) {
            this.catalogName = catalogName;
            return this;
        }
        @CustomType.Setter
        public Builder configurations(@Nullable List<LoadBalancerPlanOptionConfiguration> configurations) {
            this.configurations = configurations;
            return this;
        }
        public Builder configurations(LoadBalancerPlanOptionConfiguration... configurations) {
            return configurations(List.of(configurations));
        }
        @CustomType.Setter
        public Builder duration(String duration) {
            this.duration = Objects.requireNonNull(duration);
            return this;
        }
        @CustomType.Setter
        public Builder planCode(String planCode) {
            this.planCode = Objects.requireNonNull(planCode);
            return this;
        }
        @CustomType.Setter
        public Builder pricingMode(String pricingMode) {
            this.pricingMode = Objects.requireNonNull(pricingMode);
            return this;
        }
        public LoadBalancerPlanOption build() {
            final var o = new LoadBalancerPlanOption();
            o.catalogName = catalogName;
            o.configurations = configurations;
            o.duration = duration;
            o.planCode = planCode;
            o.pricingMode = pricingMode;
            return o;
        }
    }
}
