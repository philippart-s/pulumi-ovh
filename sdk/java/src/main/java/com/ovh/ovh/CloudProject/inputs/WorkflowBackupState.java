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


public final class WorkflowBackupState extends com.pulumi.resources.ResourceArgs {

    public static final WorkflowBackupState Empty = new WorkflowBackupState();

    /**
     * The name of the backup files that are created. If empty, the `name` attribute is used.
     * 
     */
    @Import(name="backupName")
    private @Nullable Output<String> backupName;

    /**
     * @return The name of the backup files that are created. If empty, the `name` attribute is used.
     * 
     */
    public Optional<Output<String>> backupName() {
        return Optional.ofNullable(this.backupName);
    }

    @Import(name="createdAt")
    private @Nullable Output<String> createdAt;

    public Optional<Output<String>> createdAt() {
        return Optional.ofNullable(this.createdAt);
    }

    /**
     * The cron periodicity at which the backup workflow is scheduled
     * 
     */
    @Import(name="cron")
    private @Nullable Output<String> cron;

    /**
     * @return The cron periodicity at which the backup workflow is scheduled
     * 
     */
    public Optional<Output<String>> cron() {
        return Optional.ofNullable(this.cron);
    }

    @Import(name="instanceId")
    private @Nullable Output<String> instanceId;

    public Optional<Output<String>> instanceId() {
        return Optional.ofNullable(this.instanceId);
    }

    /**
     * The number of times the worflow is run. Default value is `0` which means that the workflow will be scheduled continously until its deletion
     * 
     */
    @Import(name="maxExecutionCount")
    private @Nullable Output<Integer> maxExecutionCount;

    /**
     * @return The number of times the worflow is run. Default value is `0` which means that the workflow will be scheduled continously until its deletion
     * 
     */
    public Optional<Output<Integer>> maxExecutionCount() {
        return Optional.ofNullable(this.maxExecutionCount);
    }

    /**
     * The worflow name that is used in the UI
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The worflow name that is used in the UI
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The name of the openstack region.
     * 
     */
    @Import(name="regionName")
    private @Nullable Output<String> regionName;

    /**
     * @return The name of the openstack region.
     * 
     */
    public Optional<Output<String>> regionName() {
        return Optional.ofNullable(this.regionName);
    }

    /**
     * The number of backup that are retained.
     * 
     */
    @Import(name="rotation")
    private @Nullable Output<Integer> rotation;

    /**
     * @return The number of backup that are retained.
     * 
     */
    public Optional<Output<Integer>> rotation() {
        return Optional.ofNullable(this.rotation);
    }

    /**
     * The id of the public cloud project. If omitted, the `OVH_CLOUD_PROJECT_SERVICE` environment variable is used.
     * 
     */
    @Import(name="serviceName")
    private @Nullable Output<String> serviceName;

    /**
     * @return The id of the public cloud project. If omitted, the `OVH_CLOUD_PROJECT_SERVICE` environment variable is used.
     * 
     */
    public Optional<Output<String>> serviceName() {
        return Optional.ofNullable(this.serviceName);
    }

    private WorkflowBackupState() {}

    private WorkflowBackupState(WorkflowBackupState $) {
        this.backupName = $.backupName;
        this.createdAt = $.createdAt;
        this.cron = $.cron;
        this.instanceId = $.instanceId;
        this.maxExecutionCount = $.maxExecutionCount;
        this.name = $.name;
        this.regionName = $.regionName;
        this.rotation = $.rotation;
        this.serviceName = $.serviceName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WorkflowBackupState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WorkflowBackupState $;

        public Builder() {
            $ = new WorkflowBackupState();
        }

        public Builder(WorkflowBackupState defaults) {
            $ = new WorkflowBackupState(Objects.requireNonNull(defaults));
        }

        /**
         * @param backupName The name of the backup files that are created. If empty, the `name` attribute is used.
         * 
         * @return builder
         * 
         */
        public Builder backupName(@Nullable Output<String> backupName) {
            $.backupName = backupName;
            return this;
        }

        /**
         * @param backupName The name of the backup files that are created. If empty, the `name` attribute is used.
         * 
         * @return builder
         * 
         */
        public Builder backupName(String backupName) {
            return backupName(Output.of(backupName));
        }

        public Builder createdAt(@Nullable Output<String> createdAt) {
            $.createdAt = createdAt;
            return this;
        }

        public Builder createdAt(String createdAt) {
            return createdAt(Output.of(createdAt));
        }

        /**
         * @param cron The cron periodicity at which the backup workflow is scheduled
         * 
         * @return builder
         * 
         */
        public Builder cron(@Nullable Output<String> cron) {
            $.cron = cron;
            return this;
        }

        /**
         * @param cron The cron periodicity at which the backup workflow is scheduled
         * 
         * @return builder
         * 
         */
        public Builder cron(String cron) {
            return cron(Output.of(cron));
        }

        public Builder instanceId(@Nullable Output<String> instanceId) {
            $.instanceId = instanceId;
            return this;
        }

        public Builder instanceId(String instanceId) {
            return instanceId(Output.of(instanceId));
        }

        /**
         * @param maxExecutionCount The number of times the worflow is run. Default value is `0` which means that the workflow will be scheduled continously until its deletion
         * 
         * @return builder
         * 
         */
        public Builder maxExecutionCount(@Nullable Output<Integer> maxExecutionCount) {
            $.maxExecutionCount = maxExecutionCount;
            return this;
        }

        /**
         * @param maxExecutionCount The number of times the worflow is run. Default value is `0` which means that the workflow will be scheduled continously until its deletion
         * 
         * @return builder
         * 
         */
        public Builder maxExecutionCount(Integer maxExecutionCount) {
            return maxExecutionCount(Output.of(maxExecutionCount));
        }

        /**
         * @param name The worflow name that is used in the UI
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The worflow name that is used in the UI
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param regionName The name of the openstack region.
         * 
         * @return builder
         * 
         */
        public Builder regionName(@Nullable Output<String> regionName) {
            $.regionName = regionName;
            return this;
        }

        /**
         * @param regionName The name of the openstack region.
         * 
         * @return builder
         * 
         */
        public Builder regionName(String regionName) {
            return regionName(Output.of(regionName));
        }

        /**
         * @param rotation The number of backup that are retained.
         * 
         * @return builder
         * 
         */
        public Builder rotation(@Nullable Output<Integer> rotation) {
            $.rotation = rotation;
            return this;
        }

        /**
         * @param rotation The number of backup that are retained.
         * 
         * @return builder
         * 
         */
        public Builder rotation(Integer rotation) {
            return rotation(Output.of(rotation));
        }

        /**
         * @param serviceName The id of the public cloud project. If omitted, the `OVH_CLOUD_PROJECT_SERVICE` environment variable is used.
         * 
         * @return builder
         * 
         */
        public Builder serviceName(@Nullable Output<String> serviceName) {
            $.serviceName = serviceName;
            return this;
        }

        /**
         * @param serviceName The id of the public cloud project. If omitted, the `OVH_CLOUD_PROJECT_SERVICE` environment variable is used.
         * 
         * @return builder
         * 
         */
        public Builder serviceName(String serviceName) {
            return serviceName(Output.of(serviceName));
        }

        public WorkflowBackupState build() {
            return $;
        }
    }

}
