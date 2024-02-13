// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.ovh.ovh.Iam.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetPolicyArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetPolicyArgs Empty = new GetPolicyArgs();

    /**
     * List of actions allowed by the policy.
     * 
     */
    @Import(name="allows")
    private @Nullable Output<List<String>> allows;

    /**
     * @return List of actions allowed by the policy.
     * 
     */
    public Optional<Output<List<String>>> allows() {
        return Optional.ofNullable(this.allows);
    }

    /**
     * List of actions that will be denied no matter what policy exists.
     * 
     */
    @Import(name="denies")
    private @Nullable Output<List<String>> denies;

    /**
     * @return List of actions that will be denied no matter what policy exists.
     * 
     */
    public Optional<Output<List<String>>> denies() {
        return Optional.ofNullable(this.denies);
    }

    /**
     * Group description.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return Group description.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * List of actions that will be subtracted from the `allow` list.
     * 
     */
    @Import(name="excepts")
    private @Nullable Output<List<String>> excepts;

    /**
     * @return List of actions that will be subtracted from the `allow` list.
     * 
     */
    public Optional<Output<List<String>>> excepts() {
        return Optional.ofNullable(this.excepts);
    }

    /**
     * UUID of the policy.
     * 
     */
    @Import(name="id", required=true)
    private Output<String> id;

    /**
     * @return UUID of the policy.
     * 
     */
    public Output<String> id() {
        return this.id;
    }

    private GetPolicyArgs() {}

    private GetPolicyArgs(GetPolicyArgs $) {
        this.allows = $.allows;
        this.denies = $.denies;
        this.description = $.description;
        this.excepts = $.excepts;
        this.id = $.id;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetPolicyArgs $;

        public Builder() {
            $ = new GetPolicyArgs();
        }

        public Builder(GetPolicyArgs defaults) {
            $ = new GetPolicyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param allows List of actions allowed by the policy.
         * 
         * @return builder
         * 
         */
        public Builder allows(@Nullable Output<List<String>> allows) {
            $.allows = allows;
            return this;
        }

        /**
         * @param allows List of actions allowed by the policy.
         * 
         * @return builder
         * 
         */
        public Builder allows(List<String> allows) {
            return allows(Output.of(allows));
        }

        /**
         * @param allows List of actions allowed by the policy.
         * 
         * @return builder
         * 
         */
        public Builder allows(String... allows) {
            return allows(List.of(allows));
        }

        /**
         * @param denies List of actions that will be denied no matter what policy exists.
         * 
         * @return builder
         * 
         */
        public Builder denies(@Nullable Output<List<String>> denies) {
            $.denies = denies;
            return this;
        }

        /**
         * @param denies List of actions that will be denied no matter what policy exists.
         * 
         * @return builder
         * 
         */
        public Builder denies(List<String> denies) {
            return denies(Output.of(denies));
        }

        /**
         * @param denies List of actions that will be denied no matter what policy exists.
         * 
         * @return builder
         * 
         */
        public Builder denies(String... denies) {
            return denies(List.of(denies));
        }

        /**
         * @param description Group description.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description Group description.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param excepts List of actions that will be subtracted from the `allow` list.
         * 
         * @return builder
         * 
         */
        public Builder excepts(@Nullable Output<List<String>> excepts) {
            $.excepts = excepts;
            return this;
        }

        /**
         * @param excepts List of actions that will be subtracted from the `allow` list.
         * 
         * @return builder
         * 
         */
        public Builder excepts(List<String> excepts) {
            return excepts(Output.of(excepts));
        }

        /**
         * @param excepts List of actions that will be subtracted from the `allow` list.
         * 
         * @return builder
         * 
         */
        public Builder excepts(String... excepts) {
            return excepts(List.of(excepts));
        }

        /**
         * @param id UUID of the policy.
         * 
         * @return builder
         * 
         */
        public Builder id(Output<String> id) {
            $.id = id;
            return this;
        }

        /**
         * @param id UUID of the policy.
         * 
         * @return builder
         * 
         */
        public Builder id(String id) {
            return id(Output.of(id));
        }

        public GetPolicyArgs build() {
            $.id = Objects.requireNonNull($.id, "expected parameter 'id' to be non-null");
            return $;
        }
    }

}
