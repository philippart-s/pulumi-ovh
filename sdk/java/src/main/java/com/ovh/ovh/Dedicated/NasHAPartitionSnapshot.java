// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.ovh.ovh.Dedicated;

import com.ovh.ovh.Dedicated.NasHAPartitionSnapshotArgs;
import com.ovh.ovh.Dedicated.inputs.NasHAPartitionSnapshotState;
import com.ovh.ovh.Utilities;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Provides a resource for managing **snapshot** to partitions on HA-NAS services
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.ovh.Dedicated.NasHAPartitionSnapshot;
 * import com.pulumi.ovh.Dedicated.NasHAPartitionSnapshotArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var my_partition = new NasHAPartitionSnapshot(&#34;my-partition&#34;, NasHAPartitionSnapshotArgs.builder()        
 *             .partitionName(&#34;my-partition&#34;)
 *             .serviceName(&#34;zpool-12345&#34;)
 *             .type(&#34;day-3&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * HA-NAS partition snapshot can be imported using the `{service_name}/{partition_name}/{type}`, e.g.
 * 
 * ```sh
 *  $ pulumi import ovh:Dedicated/nasHAPartitionSnapshot:NasHAPartitionSnapshot my-partition zpool-12345/my-partition/day-3`
 * ```
 * 
 */
@ResourceType(type="ovh:Dedicated/nasHAPartitionSnapshot:NasHAPartitionSnapshot")
public class NasHAPartitionSnapshot extends com.pulumi.resources.CustomResource {
    /**
     * name of the partition
     * 
     */
    @Export(name="partitionName", refs={String.class}, tree="[0]")
    private Output<String> partitionName;

    /**
     * @return name of the partition
     * 
     */
    public Output<String> partitionName() {
        return this.partitionName;
    }
    /**
     * The internal name of your HA-NAS (it has to be ordered via OVHcloud interface)
     * 
     */
    @Export(name="serviceName", refs={String.class}, tree="[0]")
    private Output<String> serviceName;

    /**
     * @return The internal name of your HA-NAS (it has to be ordered via OVHcloud interface)
     * 
     */
    public Output<String> serviceName() {
        return this.serviceName;
    }
    /**
     * Snapshot interval, allowed : day-1, day-2, day-3, day-7, hour-1, hour-6
     * 
     */
    @Export(name="type", refs={String.class}, tree="[0]")
    private Output<String> type;

    /**
     * @return Snapshot interval, allowed : day-1, day-2, day-3, day-7, hour-1, hour-6
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public NasHAPartitionSnapshot(String name) {
        this(name, NasHAPartitionSnapshotArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public NasHAPartitionSnapshot(String name, NasHAPartitionSnapshotArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public NasHAPartitionSnapshot(String name, NasHAPartitionSnapshotArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("ovh:Dedicated/nasHAPartitionSnapshot:NasHAPartitionSnapshot", name, args == null ? NasHAPartitionSnapshotArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private NasHAPartitionSnapshot(String name, Output<String> id, @Nullable NasHAPartitionSnapshotState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("ovh:Dedicated/nasHAPartitionSnapshot:NasHAPartitionSnapshot", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static NasHAPartitionSnapshot get(String name, Output<String> id, @Nullable NasHAPartitionSnapshotState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new NasHAPartitionSnapshot(name, id, state, options);
    }
}
