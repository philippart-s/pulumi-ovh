// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.ovh.ovh.Vrack.inputs;

import com.ovh.ovh.Vrack.inputs.VrackPlanConfigurationArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class VrackPlanArgs extends com.pulumi.resources.ResourceArgs {

    public static final VrackPlanArgs Empty = new VrackPlanArgs();

    /**
     * Catalog name
     * 
     */
    @Import(name="catalogName")
    private @Nullable Output<String> catalogName;

    /**
     * @return Catalog name
     * 
     */
    public Optional<Output<String>> catalogName() {
        return Optional.ofNullable(this.catalogName);
    }

    /**
     * Representation of a configuration item for personalizing product
     * 
     */
    @Import(name="configurations")
    private @Nullable Output<List<VrackPlanConfigurationArgs>> configurations;

    /**
     * @return Representation of a configuration item for personalizing product
     * 
     */
    public Optional<Output<List<VrackPlanConfigurationArgs>>> configurations() {
        return Optional.ofNullable(this.configurations);
    }

    /**
     * duration
     * 
     */
    @Import(name="duration", required=true)
    private Output<String> duration;

    /**
     * @return duration
     * 
     */
    public Output<String> duration() {
        return this.duration;
    }

    /**
     * Plan code
     * 
     */
    @Import(name="planCode", required=true)
    private Output<String> planCode;

    /**
     * @return Plan code
     * 
     */
    public Output<String> planCode() {
        return this.planCode;
    }

    /**
     * Pricing model identifier
     * 
     */
    @Import(name="pricingMode", required=true)
    private Output<String> pricingMode;

    /**
     * @return Pricing model identifier
     * 
     */
    public Output<String> pricingMode() {
        return this.pricingMode;
    }

    private VrackPlanArgs() {}

    private VrackPlanArgs(VrackPlanArgs $) {
        this.catalogName = $.catalogName;
        this.configurations = $.configurations;
        this.duration = $.duration;
        this.planCode = $.planCode;
        this.pricingMode = $.pricingMode;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(VrackPlanArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private VrackPlanArgs $;

        public Builder() {
            $ = new VrackPlanArgs();
        }

        public Builder(VrackPlanArgs defaults) {
            $ = new VrackPlanArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param catalogName Catalog name
         * 
         * @return builder
         * 
         */
        public Builder catalogName(@Nullable Output<String> catalogName) {
            $.catalogName = catalogName;
            return this;
        }

        /**
         * @param catalogName Catalog name
         * 
         * @return builder
         * 
         */
        public Builder catalogName(String catalogName) {
            return catalogName(Output.of(catalogName));
        }

        /**
         * @param configurations Representation of a configuration item for personalizing product
         * 
         * @return builder
         * 
         */
        public Builder configurations(@Nullable Output<List<VrackPlanConfigurationArgs>> configurations) {
            $.configurations = configurations;
            return this;
        }

        /**
         * @param configurations Representation of a configuration item for personalizing product
         * 
         * @return builder
         * 
         */
        public Builder configurations(List<VrackPlanConfigurationArgs> configurations) {
            return configurations(Output.of(configurations));
        }

        /**
         * @param configurations Representation of a configuration item for personalizing product
         * 
         * @return builder
         * 
         */
        public Builder configurations(VrackPlanConfigurationArgs... configurations) {
            return configurations(List.of(configurations));
        }

        /**
         * @param duration duration
         * 
         * @return builder
         * 
         */
        public Builder duration(Output<String> duration) {
            $.duration = duration;
            return this;
        }

        /**
         * @param duration duration
         * 
         * @return builder
         * 
         */
        public Builder duration(String duration) {
            return duration(Output.of(duration));
        }

        /**
         * @param planCode Plan code
         * 
         * @return builder
         * 
         */
        public Builder planCode(Output<String> planCode) {
            $.planCode = planCode;
            return this;
        }

        /**
         * @param planCode Plan code
         * 
         * @return builder
         * 
         */
        public Builder planCode(String planCode) {
            return planCode(Output.of(planCode));
        }

        /**
         * @param pricingMode Pricing model identifier
         * 
         * @return builder
         * 
         */
        public Builder pricingMode(Output<String> pricingMode) {
            $.pricingMode = pricingMode;
            return this;
        }

        /**
         * @param pricingMode Pricing model identifier
         * 
         * @return builder
         * 
         */
        public Builder pricingMode(String pricingMode) {
            return pricingMode(Output.of(pricingMode));
        }

        public VrackPlanArgs build() {
            $.duration = Objects.requireNonNull($.duration, "expected parameter 'duration' to be non-null");
            $.planCode = Objects.requireNonNull($.planCode, "expected parameter 'planCode' to be non-null");
            $.pricingMode = Objects.requireNonNull($.pricingMode, "expected parameter 'pricingMode' to be non-null");
            return $;
        }
    }

}
