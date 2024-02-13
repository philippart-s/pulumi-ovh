// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.ovh.ovh.CloudProject.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ProjectOrderDetailArgs extends com.pulumi.resources.ResourceArgs {

    public static final ProjectOrderDetailArgs Empty = new ProjectOrderDetailArgs();

    /**
     * A description associated with the user.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return A description associated with the user.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * expiration date
     * 
     */
    @Import(name="domain")
    private @Nullable Output<String> domain;

    /**
     * @return expiration date
     * 
     */
    public Optional<Output<String>> domain() {
        return Optional.ofNullable(this.domain);
    }

    /**
     * order detail id
     * 
     */
    @Import(name="orderDetailId")
    private @Nullable Output<Integer> orderDetailId;

    /**
     * @return order detail id
     * 
     */
    public Optional<Output<Integer>> orderDetailId() {
        return Optional.ofNullable(this.orderDetailId);
    }

    /**
     * quantity
     * 
     */
    @Import(name="quantity")
    private @Nullable Output<String> quantity;

    /**
     * @return quantity
     * 
     */
    public Optional<Output<String>> quantity() {
        return Optional.ofNullable(this.quantity);
    }

    private ProjectOrderDetailArgs() {}

    private ProjectOrderDetailArgs(ProjectOrderDetailArgs $) {
        this.description = $.description;
        this.domain = $.domain;
        this.orderDetailId = $.orderDetailId;
        this.quantity = $.quantity;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ProjectOrderDetailArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ProjectOrderDetailArgs $;

        public Builder() {
            $ = new ProjectOrderDetailArgs();
        }

        public Builder(ProjectOrderDetailArgs defaults) {
            $ = new ProjectOrderDetailArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param description A description associated with the user.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description A description associated with the user.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param domain expiration date
         * 
         * @return builder
         * 
         */
        public Builder domain(@Nullable Output<String> domain) {
            $.domain = domain;
            return this;
        }

        /**
         * @param domain expiration date
         * 
         * @return builder
         * 
         */
        public Builder domain(String domain) {
            return domain(Output.of(domain));
        }

        /**
         * @param orderDetailId order detail id
         * 
         * @return builder
         * 
         */
        public Builder orderDetailId(@Nullable Output<Integer> orderDetailId) {
            $.orderDetailId = orderDetailId;
            return this;
        }

        /**
         * @param orderDetailId order detail id
         * 
         * @return builder
         * 
         */
        public Builder orderDetailId(Integer orderDetailId) {
            return orderDetailId(Output.of(orderDetailId));
        }

        /**
         * @param quantity quantity
         * 
         * @return builder
         * 
         */
        public Builder quantity(@Nullable Output<String> quantity) {
            $.quantity = quantity;
            return this;
        }

        /**
         * @param quantity quantity
         * 
         * @return builder
         * 
         */
        public Builder quantity(String quantity) {
            return quantity(Output.of(quantity));
        }

        public ProjectOrderDetailArgs build() {
            return $;
        }
    }

}
