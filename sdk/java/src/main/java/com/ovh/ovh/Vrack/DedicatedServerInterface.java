// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.ovh.ovh.Vrack;

import com.ovh.ovh.Utilities;
import com.ovh.ovh.Vrack.DedicatedServerInterfaceArgs;
import com.ovh.ovh.Vrack.inputs.DedicatedServerInterfaceState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Attach a Dedicated Server Network Interface to a VRack.
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.ovh.OvhFunctions;
 * import com.pulumi.ovh.inputs.GetServerArgs;
 * import com.pulumi.ovh.Vrack.DedicatedServerInterface;
 * import com.pulumi.ovh.Vrack.DedicatedServerInterfaceArgs;
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
 *         final var server = OvhFunctions.getServer(GetServerArgs.builder()
 *             .serviceName(&#34;nsxxxxxxx.ip-xx-xx-xx.eu&#34;)
 *             .build());
 * 
 *         var vdsi = new DedicatedServerInterface(&#34;vdsi&#34;, DedicatedServerInterfaceArgs.builder()        
 *             .serviceName(&#34;pn-xxxxxxx&#34;)
 *             .interfaceId(server.applyValue(getServerResult -&gt; getServerResult.enabledVrackVnis()[0]))
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 */
@ResourceType(type="ovh:Vrack/dedicatedServerInterface:DedicatedServerInterface")
public class DedicatedServerInterface extends com.pulumi.resources.CustomResource {
    /**
     * The id of dedicated server network interface.
     * 
     */
    @Export(name="interfaceId", refs={String.class}, tree="[0]")
    private Output<String> interfaceId;

    /**
     * @return The id of dedicated server network interface.
     * 
     */
    public Output<String> interfaceId() {
        return this.interfaceId;
    }
    /**
     * The id of the vrack. If omitted,
     * the `OVH_VRACK_SERVICE` environment variable is used.
     * 
     */
    @Export(name="serviceName", refs={String.class}, tree="[0]")
    private Output<String> serviceName;

    /**
     * @return The id of the vrack. If omitted,
     * the `OVH_VRACK_SERVICE` environment variable is used.
     * 
     */
    public Output<String> serviceName() {
        return this.serviceName;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public DedicatedServerInterface(String name) {
        this(name, DedicatedServerInterfaceArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public DedicatedServerInterface(String name, DedicatedServerInterfaceArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public DedicatedServerInterface(String name, DedicatedServerInterfaceArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("ovh:Vrack/dedicatedServerInterface:DedicatedServerInterface", name, args == null ? DedicatedServerInterfaceArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private DedicatedServerInterface(String name, Output<String> id, @Nullable DedicatedServerInterfaceState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("ovh:Vrack/dedicatedServerInterface:DedicatedServerInterface", name, state, makeResourceOptions(options, id));
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
    public static DedicatedServerInterface get(String name, Output<String> id, @Nullable DedicatedServerInterfaceState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new DedicatedServerInterface(name, id, state, options);
    }
}
