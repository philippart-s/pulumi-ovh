// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.ovh.ovh.Me.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetInstallationTemplatePartitionSchemePartition {
    /**
     * @return Partition filesystem.
     * 
     */
    private String filesystem;
    /**
     * @return partition mount point.
     * 
     */
    private String mountpoint;
    /**
     * @return step or order. specifies the creation order of the partition on the disk
     * 
     */
    private Integer order;
    /**
     * @return raid partition type.
     * 
     */
    private String raid;
    /**
     * @return size of partition in MB, 0 =&gt; rest of the space.
     * 
     */
    private Integer size;
    /**
     * @return partition type.
     * 
     */
    private String type;
    /**
     * @return The volume name needed for proxmox distribution
     * 
     */
    private String volumeName;

    private GetInstallationTemplatePartitionSchemePartition() {}
    /**
     * @return Partition filesystem.
     * 
     */
    public String filesystem() {
        return this.filesystem;
    }
    /**
     * @return partition mount point.
     * 
     */
    public String mountpoint() {
        return this.mountpoint;
    }
    /**
     * @return step or order. specifies the creation order of the partition on the disk
     * 
     */
    public Integer order() {
        return this.order;
    }
    /**
     * @return raid partition type.
     * 
     */
    public String raid() {
        return this.raid;
    }
    /**
     * @return size of partition in MB, 0 =&gt; rest of the space.
     * 
     */
    public Integer size() {
        return this.size;
    }
    /**
     * @return partition type.
     * 
     */
    public String type() {
        return this.type;
    }
    /**
     * @return The volume name needed for proxmox distribution
     * 
     */
    public String volumeName() {
        return this.volumeName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetInstallationTemplatePartitionSchemePartition defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String filesystem;
        private String mountpoint;
        private Integer order;
        private String raid;
        private Integer size;
        private String type;
        private String volumeName;
        public Builder() {}
        public Builder(GetInstallationTemplatePartitionSchemePartition defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.filesystem = defaults.filesystem;
    	      this.mountpoint = defaults.mountpoint;
    	      this.order = defaults.order;
    	      this.raid = defaults.raid;
    	      this.size = defaults.size;
    	      this.type = defaults.type;
    	      this.volumeName = defaults.volumeName;
        }

        @CustomType.Setter
        public Builder filesystem(String filesystem) {
            this.filesystem = Objects.requireNonNull(filesystem);
            return this;
        }
        @CustomType.Setter
        public Builder mountpoint(String mountpoint) {
            this.mountpoint = Objects.requireNonNull(mountpoint);
            return this;
        }
        @CustomType.Setter
        public Builder order(Integer order) {
            this.order = Objects.requireNonNull(order);
            return this;
        }
        @CustomType.Setter
        public Builder raid(String raid) {
            this.raid = Objects.requireNonNull(raid);
            return this;
        }
        @CustomType.Setter
        public Builder size(Integer size) {
            this.size = Objects.requireNonNull(size);
            return this;
        }
        @CustomType.Setter
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        @CustomType.Setter
        public Builder volumeName(String volumeName) {
            this.volumeName = Objects.requireNonNull(volumeName);
            return this;
        }
        public GetInstallationTemplatePartitionSchemePartition build() {
            final var o = new GetInstallationTemplatePartitionSchemePartition();
            o.filesystem = filesystem;
            o.mountpoint = mountpoint;
            o.order = order;
            o.raid = raid;
            o.size = size;
            o.type = type;
            o.volumeName = volumeName;
            return o;
        }
    }
}
