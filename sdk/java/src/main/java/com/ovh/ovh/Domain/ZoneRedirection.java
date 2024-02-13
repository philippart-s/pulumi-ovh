// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.ovh.ovh.Domain;

import com.ovh.ovh.Domain.ZoneRedirectionArgs;
import com.ovh.ovh.Domain.inputs.ZoneRedirectionState;
import com.ovh.ovh.Utilities;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a OVHcloud domain zone redirection.
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.ovh.Domain.ZoneRedirection;
 * import com.pulumi.ovh.Domain.ZoneRedirectionArgs;
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
 *         var test = new ZoneRedirection(&#34;test&#34;, ZoneRedirectionArgs.builder()        
 *             .subdomain(&#34;test&#34;)
 *             .target(&#34;http://www.ovh&#34;)
 *             .type(&#34;visiblePermanent&#34;)
 *             .zone(&#34;testdemo.ovh&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 */
@ResourceType(type="ovh:Domain/zoneRedirection:ZoneRedirection")
public class ZoneRedirection extends com.pulumi.resources.CustomResource {
    /**
     * A description of this redirection
     * 
     */
    @Export(name="description", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> description;

    /**
     * @return A description of this redirection
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * Keywords to describe this redirection
     * 
     */
    @Export(name="keywords", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> keywords;

    /**
     * @return Keywords to describe this redirection
     * 
     */
    public Output<Optional<String>> keywords() {
        return Codegen.optional(this.keywords);
    }
    /**
     * The name of the redirection
     * 
     */
    @Export(name="subdomain", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> subdomain;

    /**
     * @return The name of the redirection
     * 
     */
    public Output<Optional<String>> subdomain() {
        return Codegen.optional(this.subdomain);
    }
    /**
     * The value of the redirection
     * 
     */
    @Export(name="target", refs={String.class}, tree="[0]")
    private Output<String> target;

    /**
     * @return The value of the redirection
     * 
     */
    public Output<String> target() {
        return this.target;
    }
    /**
     * Title of this redirection
     * 
     */
    @Export(name="title", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> title;

    /**
     * @return Title of this redirection
     * 
     */
    public Output<Optional<String>> title() {
        return Codegen.optional(this.title);
    }
    /**
     * The type of the redirection, with values:
     * 
     */
    @Export(name="type", refs={String.class}, tree="[0]")
    private Output<String> type;

    /**
     * @return The type of the redirection, with values:
     * 
     */
    public Output<String> type() {
        return this.type;
    }
    /**
     * The domain to add the redirection to
     * 
     */
    @Export(name="zone", refs={String.class}, tree="[0]")
    private Output<String> zone;

    /**
     * @return The domain to add the redirection to
     * 
     */
    public Output<String> zone() {
        return this.zone;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ZoneRedirection(String name) {
        this(name, ZoneRedirectionArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ZoneRedirection(String name, ZoneRedirectionArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ZoneRedirection(String name, ZoneRedirectionArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("ovh:Domain/zoneRedirection:ZoneRedirection", name, args == null ? ZoneRedirectionArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ZoneRedirection(String name, Output<String> id, @Nullable ZoneRedirectionState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("ovh:Domain/zoneRedirection:ZoneRedirection", name, state, makeResourceOptions(options, id));
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
    public static ZoneRedirection get(String name, Output<String> id, @Nullable ZoneRedirectionState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ZoneRedirection(name, id, state, options);
    }
}
