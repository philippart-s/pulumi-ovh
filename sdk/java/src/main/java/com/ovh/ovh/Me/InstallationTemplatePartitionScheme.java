// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.ovh.ovh.Me;

import com.ovh.ovh.Me.InstallationTemplatePartitionSchemeArgs;
import com.ovh.ovh.Me.inputs.InstallationTemplatePartitionSchemeState;
import com.ovh.ovh.Utilities;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Use this resource to create partition scheme for a custom installation template available for dedicated servers.
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.ovh.Me.InstallationTemplate;
 * import com.pulumi.ovh.Me.InstallationTemplateArgs;
 * import com.pulumi.ovh.Me.InstallationTemplatePartitionScheme;
 * import com.pulumi.ovh.Me.InstallationTemplatePartitionSchemeArgs;
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
 *         var mytemplate = new InstallationTemplate(&#34;mytemplate&#34;, InstallationTemplateArgs.builder()        
 *             .baseTemplateName(&#34;centos7_64&#34;)
 *             .templateName(&#34;mytemplate&#34;)
 *             .defaultLanguage(&#34;fr&#34;)
 *             .build());
 * 
 *         var scheme = new InstallationTemplatePartitionScheme(&#34;scheme&#34;, InstallationTemplatePartitionSchemeArgs.builder()        
 *             .templateName(mytemplate.templateName())
 *             .priority(1)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * The resource can be imported using the `template_name`, `name` of the cluster, separated by &#34;/&#34; E.g., bash
 * 
 * ```sh
 *  $ pulumi import ovh:Me/installationTemplatePartitionScheme:InstallationTemplatePartitionScheme scheme template_name/name
 * ```
 * 
 */
@ResourceType(type="ovh:Me/installationTemplatePartitionScheme:InstallationTemplatePartitionScheme")
public class InstallationTemplatePartitionScheme extends com.pulumi.resources.CustomResource {
    /**
     * (Required) This partition scheme name.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return (Required) This partition scheme name.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * on a reinstall, if a partitioning scheme is not specified, the one with the higher priority will be used by default, among all the compatible partitioning schemes (given the underlying hardware specifications).
     * 
     */
    @Export(name="priority", refs={Integer.class}, tree="[0]")
    private Output<Integer> priority;

    /**
     * @return on a reinstall, if a partitioning scheme is not specified, the one with the higher priority will be used by default, among all the compatible partitioning schemes (given the underlying hardware specifications).
     * 
     */
    public Output<Integer> priority() {
        return this.priority;
    }
    /**
     * The template name of the partition scheme.
     * 
     */
    @Export(name="templateName", refs={String.class}, tree="[0]")
    private Output<String> templateName;

    /**
     * @return The template name of the partition scheme.
     * 
     */
    public Output<String> templateName() {
        return this.templateName;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public InstallationTemplatePartitionScheme(String name) {
        this(name, InstallationTemplatePartitionSchemeArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public InstallationTemplatePartitionScheme(String name, InstallationTemplatePartitionSchemeArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public InstallationTemplatePartitionScheme(String name, InstallationTemplatePartitionSchemeArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("ovh:Me/installationTemplatePartitionScheme:InstallationTemplatePartitionScheme", name, args == null ? InstallationTemplatePartitionSchemeArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private InstallationTemplatePartitionScheme(String name, Output<String> id, @Nullable InstallationTemplatePartitionSchemeState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("ovh:Me/installationTemplatePartitionScheme:InstallationTemplatePartitionScheme", name, state, makeResourceOptions(options, id));
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
    public static InstallationTemplatePartitionScheme get(String name, Output<String> id, @Nullable InstallationTemplatePartitionSchemeState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new InstallationTemplatePartitionScheme(name, id, state, options);
    }
}
