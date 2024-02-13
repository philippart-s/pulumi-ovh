// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.ovh.ovh.Dedicated;

import com.ovh.ovh.Dedicated.ServerInstallTaskArgs;
import com.ovh.ovh.Dedicated.inputs.ServerInstallTaskState;
import com.ovh.ovh.Dedicated.outputs.ServerInstallTaskDetails;
import com.ovh.ovh.Utilities;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.Optional;
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
 * import com.pulumi.ovh.Me.SshKey;
 * import com.pulumi.ovh.Me.SshKeyArgs;
 * import com.pulumi.ovh.Me.InstallationTemplate;
 * import com.pulumi.ovh.Me.InstallationTemplateArgs;
 * import com.pulumi.ovh.Me.inputs.InstallationTemplateCustomizationArgs;
 * import com.pulumi.ovh.Dedicated.ServerInstallTask;
 * import com.pulumi.ovh.Dedicated.ServerInstallTaskArgs;
 * import com.pulumi.ovh.Dedicated.inputs.ServerInstallTaskDetailsArgs;
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
 *             .build());
 * 
 *         var key = new SshKey(&#34;key&#34;, SshKeyArgs.builder()        
 *             .keyName(&#34;mykey&#34;)
 *             .key(&#34;ssh-ed25519 AAAAC3...&#34;)
 *             .build());
 * 
 *         var debian = new InstallationTemplate(&#34;debian&#34;, InstallationTemplateArgs.builder()        
 *             .baseTemplateName(&#34;debian11_64&#34;)
 *             .templateName(&#34;mydebian11&#34;)
 *             .defaultLanguage(&#34;en&#34;)
 *             .customization(InstallationTemplateCustomizationArgs.builder()
 *                 .sshKeyName(key.keyName())
 *                 .build())
 *             .build());
 * 
 *         var serverInstall = new ServerInstallTask(&#34;serverInstall&#34;, ServerInstallTaskArgs.builder()        
 *             .serviceName(&#34;nsxxxxxxx.ip-xx-xx-xx.eu&#34;)
 *             .templateName(debian.templateName())
 *             .bootidOnDestroy(rescue.applyValue(getServerBootsResult -&gt; getServerBootsResult.results()[0]))
 *             .details(ServerInstallTaskDetailsArgs.builder()
 *                 .customHostname(&#34;mytest&#34;)
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Installation task can be imported using the `service_name` (`nsXXXX.ip...`) of the baremetal server, the `template_name` used
 * 
 * and ths `task_id`, separated by &#34;/&#34; E.g., bash
 * 
 * ```sh
 *  $ pulumi import ovh:Dedicated/serverInstallTask:ServerInstallTask ovh_dedicated_server_install_task nsXXXX.ipXXXX/template_name/12345
 * ```
 * 
 */
@ResourceType(type="ovh:Dedicated/serverInstallTask:ServerInstallTask")
public class ServerInstallTask extends com.pulumi.resources.CustomResource {
    /**
     * If set, reboot the server on the specified boot id during destroy phase.
     * 
     */
    @Export(name="bootidOnDestroy", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> bootidOnDestroy;

    /**
     * @return If set, reboot the server on the specified boot id during destroy phase.
     * 
     */
    public Output<Optional<Integer>> bootidOnDestroy() {
        return Codegen.optional(this.bootidOnDestroy);
    }
    /**
     * Details of this task. (should be `Install asked`)
     * 
     */
    @Export(name="comment", refs={String.class}, tree="[0]")
    private Output<String> comment;

    /**
     * @return Details of this task. (should be `Install asked`)
     * 
     */
    public Output<String> comment() {
        return this.comment;
    }
    /**
     * see `details` block below.
     * 
     */
    @Export(name="details", refs={ServerInstallTaskDetails.class}, tree="[0]")
    private Output</* @Nullable */ ServerInstallTaskDetails> details;

    /**
     * @return see `details` block below.
     * 
     */
    public Output<Optional<ServerInstallTaskDetails>> details() {
        return Codegen.optional(this.details);
    }
    /**
     * Completion date in RFC3339 format.
     * 
     */
    @Export(name="doneDate", refs={String.class}, tree="[0]")
    private Output<String> doneDate;

    /**
     * @return Completion date in RFC3339 format.
     * 
     */
    public Output<String> doneDate() {
        return this.doneDate;
    }
    /**
     * Function name (should be `hardInstall`).
     * 
     */
    @Export(name="function", refs={String.class}, tree="[0]")
    private Output<String> function;

    /**
     * @return Function name (should be `hardInstall`).
     * 
     */
    public Output<String> function() {
        return this.function;
    }
    /**
     * Last update in RFC3339 format.
     * 
     */
    @Export(name="lastUpdate", refs={String.class}, tree="[0]")
    private Output<String> lastUpdate;

    /**
     * @return Last update in RFC3339 format.
     * 
     */
    public Output<String> lastUpdate() {
        return this.lastUpdate;
    }
    /**
     * Partition scheme name.
     * 
     */
    @Export(name="partitionSchemeName", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> partitionSchemeName;

    /**
     * @return Partition scheme name.
     * 
     */
    public Output<Optional<String>> partitionSchemeName() {
        return Codegen.optional(this.partitionSchemeName);
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
     * Task creation date in RFC3339 format.
     * 
     */
    @Export(name="startDate", refs={String.class}, tree="[0]")
    private Output<String> startDate;

    /**
     * @return Task creation date in RFC3339 format.
     * 
     */
    public Output<String> startDate() {
        return this.startDate;
    }
    /**
     * Task status (should be `done`)
     * 
     */
    @Export(name="status", refs={String.class}, tree="[0]")
    private Output<String> status;

    /**
     * @return Task status (should be `done`)
     * 
     */
    public Output<String> status() {
        return this.status;
    }
    /**
     * Template name.
     * 
     */
    @Export(name="templateName", refs={String.class}, tree="[0]")
    private Output<String> templateName;

    /**
     * @return Template name.
     * 
     */
    public Output<String> templateName() {
        return this.templateName;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ServerInstallTask(String name) {
        this(name, ServerInstallTaskArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ServerInstallTask(String name, ServerInstallTaskArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ServerInstallTask(String name, ServerInstallTaskArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("ovh:Dedicated/serverInstallTask:ServerInstallTask", name, args == null ? ServerInstallTaskArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ServerInstallTask(String name, Output<String> id, @Nullable ServerInstallTaskState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("ovh:Dedicated/serverInstallTask:ServerInstallTask", name, state, makeResourceOptions(options, id));
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
    public static ServerInstallTask get(String name, Output<String> id, @Nullable ServerInstallTaskState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ServerInstallTask(name, id, state, options);
    }
}
