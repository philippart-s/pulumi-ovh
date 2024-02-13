// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.ovh.ovh.Me.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class IdentityGroupState extends com.pulumi.resources.ResourceArgs {

    public static final IdentityGroupState Empty = new IdentityGroupState();

    /**
     * URN of the user group, used when writing IAM policies
     * 
     */
    @Import(name="GroupURN")
    private @Nullable Output<String> GroupURN;

    /**
     * @return URN of the user group, used when writing IAM policies
     * 
     */
    public Optional<Output<String>> GroupURN() {
        return Optional.ofNullable(this.GroupURN);
    }

    /**
     * Creation date of this group.
     * 
     */
    @Import(name="creation")
    private @Nullable Output<String> creation;

    /**
     * @return Creation date of this group.
     * 
     */
    public Optional<Output<String>> creation() {
        return Optional.ofNullable(this.creation);
    }

    /**
     * Is the group a default and immutable one.
     * 
     */
    @Import(name="defaultGroup")
    private @Nullable Output<Boolean> defaultGroup;

    /**
     * @return Is the group a default and immutable one.
     * 
     */
    public Optional<Output<Boolean>> defaultGroup() {
        return Optional.ofNullable(this.defaultGroup);
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
     * Date of the last update of this group.
     * 
     */
    @Import(name="lastUpdate")
    private @Nullable Output<String> lastUpdate;

    /**
     * @return Date of the last update of this group.
     * 
     */
    public Optional<Output<String>> lastUpdate() {
        return Optional.ofNullable(this.lastUpdate);
    }

    /**
     * Group name.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Group name.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Role associated with the group. Valid roles are ADMIN, REGULAR, UNPRIVILEGED, and NONE.
     * 
     */
    @Import(name="role")
    private @Nullable Output<String> role;

    /**
     * @return Role associated with the group. Valid roles are ADMIN, REGULAR, UNPRIVILEGED, and NONE.
     * 
     */
    public Optional<Output<String>> role() {
        return Optional.ofNullable(this.role);
    }

    private IdentityGroupState() {}

    private IdentityGroupState(IdentityGroupState $) {
        this.GroupURN = $.GroupURN;
        this.creation = $.creation;
        this.defaultGroup = $.defaultGroup;
        this.description = $.description;
        this.lastUpdate = $.lastUpdate;
        this.name = $.name;
        this.role = $.role;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(IdentityGroupState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private IdentityGroupState $;

        public Builder() {
            $ = new IdentityGroupState();
        }

        public Builder(IdentityGroupState defaults) {
            $ = new IdentityGroupState(Objects.requireNonNull(defaults));
        }

        /**
         * @param GroupURN URN of the user group, used when writing IAM policies
         * 
         * @return builder
         * 
         */
        public Builder GroupURN(@Nullable Output<String> GroupURN) {
            $.GroupURN = GroupURN;
            return this;
        }

        /**
         * @param GroupURN URN of the user group, used when writing IAM policies
         * 
         * @return builder
         * 
         */
        public Builder GroupURN(String GroupURN) {
            return GroupURN(Output.of(GroupURN));
        }

        /**
         * @param creation Creation date of this group.
         * 
         * @return builder
         * 
         */
        public Builder creation(@Nullable Output<String> creation) {
            $.creation = creation;
            return this;
        }

        /**
         * @param creation Creation date of this group.
         * 
         * @return builder
         * 
         */
        public Builder creation(String creation) {
            return creation(Output.of(creation));
        }

        /**
         * @param defaultGroup Is the group a default and immutable one.
         * 
         * @return builder
         * 
         */
        public Builder defaultGroup(@Nullable Output<Boolean> defaultGroup) {
            $.defaultGroup = defaultGroup;
            return this;
        }

        /**
         * @param defaultGroup Is the group a default and immutable one.
         * 
         * @return builder
         * 
         */
        public Builder defaultGroup(Boolean defaultGroup) {
            return defaultGroup(Output.of(defaultGroup));
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
         * @param lastUpdate Date of the last update of this group.
         * 
         * @return builder
         * 
         */
        public Builder lastUpdate(@Nullable Output<String> lastUpdate) {
            $.lastUpdate = lastUpdate;
            return this;
        }

        /**
         * @param lastUpdate Date of the last update of this group.
         * 
         * @return builder
         * 
         */
        public Builder lastUpdate(String lastUpdate) {
            return lastUpdate(Output.of(lastUpdate));
        }

        /**
         * @param name Group name.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Group name.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param role Role associated with the group. Valid roles are ADMIN, REGULAR, UNPRIVILEGED, and NONE.
         * 
         * @return builder
         * 
         */
        public Builder role(@Nullable Output<String> role) {
            $.role = role;
            return this;
        }

        /**
         * @param role Role associated with the group. Valid roles are ADMIN, REGULAR, UNPRIVILEGED, and NONE.
         * 
         * @return builder
         * 
         */
        public Builder role(String role) {
            return role(Output.of(role));
        }

        public IdentityGroupState build() {
            return $;
        }
    }

}
