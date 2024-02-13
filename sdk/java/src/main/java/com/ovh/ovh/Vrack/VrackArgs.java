// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.ovh.ovh.Vrack;

import com.ovh.ovh.Vrack.inputs.VrackPlanArgs;
import com.ovh.ovh.Vrack.inputs.VrackPlanOptionArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class VrackArgs extends com.pulumi.resources.ResourceArgs {

    public static final VrackArgs Empty = new VrackArgs();

    /**
     * yourvrackdescription
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return yourvrackdescription
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * yourvrackname
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return yourvrackname
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * OVHcloud Subsidiary. Country of OVHcloud legal entity you&#39;ll be billed by. List of supported subsidiaries available on API at [/1.0/me.json under `models.nichandle.OvhSubsidiaryEnum`](https://eu.api.ovh.com/1.0/me.json)
     * 
     */
    @Import(name="ovhSubsidiary", required=true)
    private Output<String> ovhSubsidiary;

    /**
     * @return OVHcloud Subsidiary. Country of OVHcloud legal entity you&#39;ll be billed by. List of supported subsidiaries available on API at [/1.0/me.json under `models.nichandle.OvhSubsidiaryEnum`](https://eu.api.ovh.com/1.0/me.json)
     * 
     */
    public Output<String> ovhSubsidiary() {
        return this.ovhSubsidiary;
    }

    /**
     * Ovh payment mode
     * 
     * @deprecated
     * This field is not anymore used since the API has been deprecated in favor of /payment/mean. Now, the default payment mean is used.
     * 
     */
    @Deprecated /* This field is not anymore used since the API has been deprecated in favor of /payment/mean. Now, the default payment mean is used. */
    @Import(name="paymentMean")
    private @Nullable Output<String> paymentMean;

    /**
     * @return Ovh payment mode
     * 
     * @deprecated
     * This field is not anymore used since the API has been deprecated in favor of /payment/mean. Now, the default payment mean is used.
     * 
     */
    @Deprecated /* This field is not anymore used since the API has been deprecated in favor of /payment/mean. Now, the default payment mean is used. */
    public Optional<Output<String>> paymentMean() {
        return Optional.ofNullable(this.paymentMean);
    }

    /**
     * Product Plan to order
     * 
     */
    @Import(name="plan", required=true)
    private Output<VrackPlanArgs> plan;

    /**
     * @return Product Plan to order
     * 
     */
    public Output<VrackPlanArgs> plan() {
        return this.plan;
    }

    /**
     * Product Plan to order
     * 
     */
    @Import(name="planOptions")
    private @Nullable Output<List<VrackPlanOptionArgs>> planOptions;

    /**
     * @return Product Plan to order
     * 
     */
    public Optional<Output<List<VrackPlanOptionArgs>>> planOptions() {
        return Optional.ofNullable(this.planOptions);
    }

    private VrackArgs() {}

    private VrackArgs(VrackArgs $) {
        this.description = $.description;
        this.name = $.name;
        this.ovhSubsidiary = $.ovhSubsidiary;
        this.paymentMean = $.paymentMean;
        this.plan = $.plan;
        this.planOptions = $.planOptions;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(VrackArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private VrackArgs $;

        public Builder() {
            $ = new VrackArgs();
        }

        public Builder(VrackArgs defaults) {
            $ = new VrackArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param description yourvrackdescription
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description yourvrackdescription
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param name yourvrackname
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name yourvrackname
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param ovhSubsidiary OVHcloud Subsidiary. Country of OVHcloud legal entity you&#39;ll be billed by. List of supported subsidiaries available on API at [/1.0/me.json under `models.nichandle.OvhSubsidiaryEnum`](https://eu.api.ovh.com/1.0/me.json)
         * 
         * @return builder
         * 
         */
        public Builder ovhSubsidiary(Output<String> ovhSubsidiary) {
            $.ovhSubsidiary = ovhSubsidiary;
            return this;
        }

        /**
         * @param ovhSubsidiary OVHcloud Subsidiary. Country of OVHcloud legal entity you&#39;ll be billed by. List of supported subsidiaries available on API at [/1.0/me.json under `models.nichandle.OvhSubsidiaryEnum`](https://eu.api.ovh.com/1.0/me.json)
         * 
         * @return builder
         * 
         */
        public Builder ovhSubsidiary(String ovhSubsidiary) {
            return ovhSubsidiary(Output.of(ovhSubsidiary));
        }

        /**
         * @param paymentMean Ovh payment mode
         * 
         * @return builder
         * 
         * @deprecated
         * This field is not anymore used since the API has been deprecated in favor of /payment/mean. Now, the default payment mean is used.
         * 
         */
        @Deprecated /* This field is not anymore used since the API has been deprecated in favor of /payment/mean. Now, the default payment mean is used. */
        public Builder paymentMean(@Nullable Output<String> paymentMean) {
            $.paymentMean = paymentMean;
            return this;
        }

        /**
         * @param paymentMean Ovh payment mode
         * 
         * @return builder
         * 
         * @deprecated
         * This field is not anymore used since the API has been deprecated in favor of /payment/mean. Now, the default payment mean is used.
         * 
         */
        @Deprecated /* This field is not anymore used since the API has been deprecated in favor of /payment/mean. Now, the default payment mean is used. */
        public Builder paymentMean(String paymentMean) {
            return paymentMean(Output.of(paymentMean));
        }

        /**
         * @param plan Product Plan to order
         * 
         * @return builder
         * 
         */
        public Builder plan(Output<VrackPlanArgs> plan) {
            $.plan = plan;
            return this;
        }

        /**
         * @param plan Product Plan to order
         * 
         * @return builder
         * 
         */
        public Builder plan(VrackPlanArgs plan) {
            return plan(Output.of(plan));
        }

        /**
         * @param planOptions Product Plan to order
         * 
         * @return builder
         * 
         */
        public Builder planOptions(@Nullable Output<List<VrackPlanOptionArgs>> planOptions) {
            $.planOptions = planOptions;
            return this;
        }

        /**
         * @param planOptions Product Plan to order
         * 
         * @return builder
         * 
         */
        public Builder planOptions(List<VrackPlanOptionArgs> planOptions) {
            return planOptions(Output.of(planOptions));
        }

        /**
         * @param planOptions Product Plan to order
         * 
         * @return builder
         * 
         */
        public Builder planOptions(VrackPlanOptionArgs... planOptions) {
            return planOptions(List.of(planOptions));
        }

        public VrackArgs build() {
            $.ovhSubsidiary = Objects.requireNonNull($.ovhSubsidiary, "expected parameter 'ovhSubsidiary' to be non-null");
            $.plan = Objects.requireNonNull($.plan, "expected parameter 'plan' to be non-null");
            return $;
        }
    }

}
