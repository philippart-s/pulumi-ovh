// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.ovh.ovh.CloudProject;

import com.ovh.ovh.CloudProject.KubeNodePoolArgs;
import com.ovh.ovh.CloudProject.inputs.KubeNodePoolState;
import com.ovh.ovh.CloudProject.outputs.KubeNodePoolTemplate;
import com.ovh.ovh.Utilities;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Creates a nodepool in a OVHcloud Managed Kubernetes Service cluster.
 * 
 * ## Example Usage
 * 
 * Create a simple node pool in your Kubernetes cluster:
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.ovh.CloudProject.KubeNodePool;
 * import com.pulumi.ovh.CloudProject.KubeNodePoolArgs;
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
 *         var nodePool = new KubeNodePool(&#34;nodePool&#34;, KubeNodePoolArgs.builder()        
 *             .desiredNodes(3)
 *             .flavorName(&#34;b2-7&#34;)
 *             .kubeId(&#34;xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx&#34;)
 *             .maxNodes(3)
 *             .minNodes(3)
 *             .serviceName(&#34;xxxxxxxxxxxxxxxxxxxxxxxxxxxxxx&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * Create an advanced node pool in your Kubernetes cluster:
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.ovh.CloudProject.KubeNodePool;
 * import com.pulumi.ovh.CloudProject.KubeNodePoolArgs;
 * import com.pulumi.ovh.CloudProject.inputs.KubeNodePoolTemplateArgs;
 * import com.pulumi.ovh.CloudProject.inputs.KubeNodePoolTemplateMetadataArgs;
 * import com.pulumi.ovh.CloudProject.inputs.KubeNodePoolTemplateSpecArgs;
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
 *         var pool = new KubeNodePool(&#34;pool&#34;, KubeNodePoolArgs.builder()        
 *             .desiredNodes(3)
 *             .flavorName(&#34;b2-7&#34;)
 *             .kubeId(&#34;xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx&#34;)
 *             .maxNodes(3)
 *             .minNodes(3)
 *             .serviceName(&#34;xxxxxxxxxxxxxxxxxxxxxxxxxxxxxx&#34;)
 *             .template(KubeNodePoolTemplateArgs.builder()
 *                 .metadata(KubeNodePoolTemplateMetadataArgs.builder()
 *                     .annotations(Map.ofEntries(
 *                         Map.entry(&#34;k1&#34;, &#34;v1&#34;),
 *                         Map.entry(&#34;k2&#34;, &#34;v2&#34;)
 *                     ))
 *                     .finalizers(                    
 *                         &#34;ovhcloud.com/v1beta1&#34;,
 *                         &#34;ovhcloud.com/v1&#34;)
 *                     .labels(Map.ofEntries(
 *                         Map.entry(&#34;k3&#34;, &#34;v3&#34;),
 *                         Map.entry(&#34;k4&#34;, &#34;v4&#34;)
 *                     ))
 *                     .build())
 *                 .spec(KubeNodePoolTemplateSpecArgs.builder()
 *                     .taints(Map.ofEntries(
 *                         Map.entry(&#34;effect&#34;, &#34;PreferNoSchedule&#34;),
 *                         Map.entry(&#34;key&#34;, &#34;k&#34;),
 *                         Map.entry(&#34;value&#34;, &#34;v&#34;)
 *                     ))
 *                     .unschedulable(false)
 *                     .build())
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * OVHcloud Managed Kubernetes Service cluster node pool can be imported using the `service_name`, the `id` of the cluster, and the `id` of the nodepool separated by &#34;/&#34; E.g., bash
 * 
 * ```sh
 *  $ pulumi import ovh:CloudProject/kubeNodePool:KubeNodePool pool service_name/kube_id/poolid
 * ```
 * 
 */
@ResourceType(type="ovh:CloudProject/kubeNodePool:KubeNodePool")
public class KubeNodePool extends com.pulumi.resources.CustomResource {
    /**
     * should the pool use the anti-affinity feature. Default to `false`. **Changing this value recreates the resource.**
     * 
     */
    @Export(name="antiAffinity", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> antiAffinity;

    /**
     * @return should the pool use the anti-affinity feature. Default to `false`. **Changing this value recreates the resource.**
     * 
     */
    public Output<Boolean> antiAffinity() {
        return this.antiAffinity;
    }
    /**
     * Enable auto-scaling for the pool. Default to `false`.
     * * ` template  ` - (Optional) Managed Kubernetes nodepool template, which is a complex object constituted by two main nested objects:
     * 
     */
    @Export(name="autoscale", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> autoscale;

    /**
     * @return Enable auto-scaling for the pool. Default to `false`.
     * * ` template  ` - (Optional) Managed Kubernetes nodepool template, which is a complex object constituted by two main nested objects:
     * 
     */
    public Output<Boolean> autoscale() {
        return this.autoscale;
    }
    /**
     * Number of nodes which are actually ready in the pool
     * 
     */
    @Export(name="availableNodes", refs={Integer.class}, tree="[0]")
    private Output<Integer> availableNodes;

    /**
     * @return Number of nodes which are actually ready in the pool
     * 
     */
    public Output<Integer> availableNodes() {
        return this.availableNodes;
    }
    /**
     * Creation date
     * 
     */
    @Export(name="createdAt", refs={String.class}, tree="[0]")
    private Output<String> createdAt;

    /**
     * @return Creation date
     * 
     */
    public Output<String> createdAt() {
        return this.createdAt;
    }
    /**
     * Number of nodes present in the pool
     * 
     */
    @Export(name="currentNodes", refs={Integer.class}, tree="[0]")
    private Output<Integer> currentNodes;

    /**
     * @return Number of nodes present in the pool
     * 
     */
    public Output<Integer> currentNodes() {
        return this.currentNodes;
    }
    /**
     * number of nodes to start.
     * 
     */
    @Export(name="desiredNodes", refs={Integer.class}, tree="[0]")
    private Output<Integer> desiredNodes;

    /**
     * @return number of nodes to start.
     * 
     */
    public Output<Integer> desiredNodes() {
        return this.desiredNodes;
    }
    /**
     * Flavor name
     * 
     */
    @Export(name="flavor", refs={String.class}, tree="[0]")
    private Output<String> flavor;

    /**
     * @return Flavor name
     * 
     */
    public Output<String> flavor() {
        return this.flavor;
    }
    /**
     * a valid OVHcloud public cloud flavor ID in which the nodes will be started. Ex: &#34;b2-7&#34;. You can find the list of flavor IDs: https://www.ovhcloud.com/fr/public-cloud/prices/.
     * **Changing this value recreates the resource.**
     * 
     */
    @Export(name="flavorName", refs={String.class}, tree="[0]")
    private Output<String> flavorName;

    /**
     * @return a valid OVHcloud public cloud flavor ID in which the nodes will be started. Ex: &#34;b2-7&#34;. You can find the list of flavor IDs: https://www.ovhcloud.com/fr/public-cloud/prices/.
     * **Changing this value recreates the resource.**
     * 
     */
    public Output<String> flavorName() {
        return this.flavorName;
    }
    /**
     * The id of the managed kubernetes cluster. **Changing this value recreates the resource.**
     * 
     */
    @Export(name="kubeId", refs={String.class}, tree="[0]")
    private Output<String> kubeId;

    /**
     * @return The id of the managed kubernetes cluster. **Changing this value recreates the resource.**
     * 
     */
    public Output<String> kubeId() {
        return this.kubeId;
    }
    /**
     * maximum number of nodes allowed in the pool. Setting `desired_nodes` over this value will raise an error.
     * 
     */
    @Export(name="maxNodes", refs={Integer.class}, tree="[0]")
    private Output<Integer> maxNodes;

    /**
     * @return maximum number of nodes allowed in the pool. Setting `desired_nodes` over this value will raise an error.
     * 
     */
    public Output<Integer> maxNodes() {
        return this.maxNodes;
    }
    /**
     * minimum number of nodes allowed in the pool. Setting `desired_nodes` under this value will raise an error.
     * 
     */
    @Export(name="minNodes", refs={Integer.class}, tree="[0]")
    private Output<Integer> minNodes;

    /**
     * @return minimum number of nodes allowed in the pool. Setting `desired_nodes` under this value will raise an error.
     * 
     */
    public Output<Integer> minNodes() {
        return this.minNodes;
    }
    /**
     * should the nodes be billed on a monthly basis. Default to `false`. **Changing this value recreates the resource.**
     * 
     */
    @Export(name="monthlyBilled", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> monthlyBilled;

    /**
     * @return should the nodes be billed on a monthly basis. Default to `false`. **Changing this value recreates the resource.**
     * 
     */
    public Output<Boolean> monthlyBilled() {
        return this.monthlyBilled;
    }
    /**
     * The name of the nodepool. Warning: `_` char is not allowed! **Changing this value recreates the resource.**
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return The name of the nodepool. Warning: `_` char is not allowed! **Changing this value recreates the resource.**
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Project id
     * 
     */
    @Export(name="projectId", refs={String.class}, tree="[0]")
    private Output<String> projectId;

    /**
     * @return Project id
     * 
     */
    public Output<String> projectId() {
        return this.projectId;
    }
    /**
     * The id of the public cloud project. If omitted, the `OVH_CLOUD_PROJECT_SERVICE` environment variable is used. **Changing this value recreates the resource.**
     * 
     */
    @Export(name="serviceName", refs={String.class}, tree="[0]")
    private Output<String> serviceName;

    /**
     * @return The id of the public cloud project. If omitted, the `OVH_CLOUD_PROJECT_SERVICE` environment variable is used. **Changing this value recreates the resource.**
     * 
     */
    public Output<String> serviceName() {
        return this.serviceName;
    }
    /**
     * Status describing the state between number of nodes wanted and available ones
     * 
     */
    @Export(name="sizeStatus", refs={String.class}, tree="[0]")
    private Output<String> sizeStatus;

    /**
     * @return Status describing the state between number of nodes wanted and available ones
     * 
     */
    public Output<String> sizeStatus() {
        return this.sizeStatus;
    }
    /**
     * Current status
     * 
     */
    @Export(name="status", refs={String.class}, tree="[0]")
    private Output<String> status;

    /**
     * @return Current status
     * 
     */
    public Output<String> status() {
        return this.status;
    }
    /**
     * Node pool template
     * 
     */
    @Export(name="template", refs={KubeNodePoolTemplate.class}, tree="[0]")
    private Output</* @Nullable */ KubeNodePoolTemplate> template;

    /**
     * @return Node pool template
     * 
     */
    public Output<Optional<KubeNodePoolTemplate>> template() {
        return Codegen.optional(this.template);
    }
    /**
     * Number of nodes with the latest version installed in the pool
     * 
     */
    @Export(name="upToDateNodes", refs={Integer.class}, tree="[0]")
    private Output<Integer> upToDateNodes;

    /**
     * @return Number of nodes with the latest version installed in the pool
     * 
     */
    public Output<Integer> upToDateNodes() {
        return this.upToDateNodes;
    }
    /**
     * Last update date
     * 
     */
    @Export(name="updatedAt", refs={String.class}, tree="[0]")
    private Output<String> updatedAt;

    /**
     * @return Last update date
     * 
     */
    public Output<String> updatedAt() {
        return this.updatedAt;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public KubeNodePool(String name) {
        this(name, KubeNodePoolArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public KubeNodePool(String name, KubeNodePoolArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public KubeNodePool(String name, KubeNodePoolArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("ovh:CloudProject/kubeNodePool:KubeNodePool", name, args == null ? KubeNodePoolArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private KubeNodePool(String name, Output<String> id, @Nullable KubeNodePoolState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("ovh:CloudProject/kubeNodePool:KubeNodePool", name, state, makeResourceOptions(options, id));
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
    public static KubeNodePool get(String name, Output<String> id, @Nullable KubeNodePoolState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new KubeNodePool(name, id, state, options);
    }
}
