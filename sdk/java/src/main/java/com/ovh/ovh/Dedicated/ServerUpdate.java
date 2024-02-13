// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.ovh.ovh.Dedicated;

import com.ovh.ovh.Dedicated.ServerUpdateArgs;
import com.ovh.ovh.Dedicated.inputs.ServerUpdateState;
import com.ovh.ovh.Utilities;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.ovh.Dedicated.DedicatedFunctions;
 * import com.pulumi.ovh.Dedicated.inputs.GetServerBootsArgs;
 * import com.pulumi.ovh.Dedicated.ServerUpdate;
 * import com.pulumi.ovh.Dedicated.ServerUpdateArgs;
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
 *         final var rescue = DedicatedFunctions.getServerBoots(GetServerBootsArgs.builder()
 *             .serviceName(&#34;nsxxxxxxx.ip-xx-xx-xx.eu&#34;)
 *             .bootType(&#34;rescue&#34;)
 *             .kernel(&#34;rescue64-pro&#34;)
 *             .build());
 * 
 *         var server = new ServerUpdate(&#34;server&#34;, ServerUpdateArgs.builder()        
 *             .serviceName(&#34;nsxxxxxxx.ip-xx-xx-xx.eu&#34;)
 *             .bootId(rescue.applyValue(getServerBootsResult -&gt; getServerBootsResult.results()[0]))
 *             .monitoring(true)
 *             .state(&#34;ok&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 */
@ResourceType(type="ovh:Dedicated/serverUpdate:ServerUpdate")
public class ServerUpdate extends com.pulumi.resources.CustomResource {
    /**
     * boot id of the server
     * 
     */
    @Export(name="bootId", refs={Integer.class}, tree="[0]")
    private Output<Integer> bootId;

    /**
     * @return boot id of the server
     * 
     */
    public Output<Integer> bootId() {
        return this.bootId;
    }
    /**
     * Icmp monitoring state
     * 
     */
    @Export(name="monitoring", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> monitoring;

    /**
     * @return Icmp monitoring state
     * 
     */
    public Output<Boolean> monitoring() {
        return this.monitoring;
    }
    /**
     * The service_name of your dedicated server.
     * 
     */
    @Export(name="serviceName", refs={String.class}, tree="[0]")
    private Output<String> serviceName;

    /**
     * @return The service_name of your dedicated server.
     * 
     */
    public Output<String> serviceName() {
        return this.serviceName;
    }
    /**
     * error, hacked, hackedBlocked, ok
     * 
     */
    @Export(name="state", refs={String.class}, tree="[0]")
    private Output<String> state;

    /**
     * @return error, hacked, hackedBlocked, ok
     * 
     */
    public Output<String> state() {
        return this.state;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ServerUpdate(String name) {
        this(name, ServerUpdateArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ServerUpdate(String name, ServerUpdateArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ServerUpdate(String name, ServerUpdateArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("ovh:Dedicated/serverUpdate:ServerUpdate", name, args == null ? ServerUpdateArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ServerUpdate(String name, Output<String> id, @Nullable ServerUpdateState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("ovh:Dedicated/serverUpdate:ServerUpdate", name, state, makeResourceOptions(options, id));
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
    public static ServerUpdate get(String name, Output<String> id, @Nullable ServerUpdateState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ServerUpdate(name, id, state, options);
    }
}
