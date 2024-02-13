// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.ovh.ovh.CloudProject;

import com.ovh.ovh.CloudProject.S3PolicyArgs;
import com.ovh.ovh.CloudProject.inputs.S3PolicyState;
import com.ovh.ovh.Utilities;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Set the S3 Policy of a public cloud project user.
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.ovh.CloudProject.User;
 * import com.pulumi.ovh.CloudProject.UserArgs;
 * import com.pulumi.ovh.CloudProject.S3Credential;
 * import com.pulumi.ovh.CloudProject.S3CredentialArgs;
 * import com.pulumi.ovh.CloudProject.S3Policy;
 * import com.pulumi.ovh.CloudProject.S3PolicyArgs;
 * import static com.pulumi.codegen.internal.Serialization.*;
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
 *         var user = new User(&#34;user&#34;, UserArgs.builder()        
 *             .serviceName(&#34;XXX&#34;)
 *             .description(&#34;my user&#34;)
 *             .roleNames(&#34;objectstore_operator&#34;)
 *             .build());
 * 
 *         var myS3Credentials = new S3Credential(&#34;myS3Credentials&#34;, S3CredentialArgs.builder()        
 *             .serviceName(user.serviceName())
 *             .userId(user.id())
 *             .build());
 * 
 *         var policy = new S3Policy(&#34;policy&#34;, S3PolicyArgs.builder()        
 *             .serviceName(user.serviceName())
 *             .userId(user.id())
 *             .policy(serializeJson(
 *                 jsonObject(
 *                     jsonProperty(&#34;Statement&#34;, jsonArray(jsonObject(
 *                         jsonProperty(&#34;Sid&#34;, &#34;RWContainer&#34;),
 *                         jsonProperty(&#34;Effect&#34;, &#34;Allow&#34;),
 *                         jsonProperty(&#34;Action&#34;, jsonArray(
 *                             &#34;s3:GetObject&#34;, 
 *                             &#34;s3:PutObject&#34;, 
 *                             &#34;s3:DeleteObject&#34;, 
 *                             &#34;s3:ListBucket&#34;, 
 *                             &#34;s3:ListMultipartUploadParts&#34;, 
 *                             &#34;s3:ListBucketMultipartUploads&#34;, 
 *                             &#34;s3:AbortMultipartUpload&#34;, 
 *                             &#34;s3:GetBucketLocation&#34;
 *                         )),
 *                         jsonProperty(&#34;Resource&#34;, jsonArray(
 *                             &#34;arn:aws:s3:::hp-bucket&#34;, 
 *                             &#34;arn:aws:s3:::hp-bucket/*&#34;
 *                         ))
 *                     )))
 *                 )))
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * OVHcloud User S3 Policy can be imported using the `service_name`, `user_id` of the policy, separated by &#34;/&#34; E.g., bash
 * 
 * ```sh
 *  $ pulumi import ovh:CloudProject/s3Policy:S3Policy policy service_name/user_id
 * ```
 * 
 */
@ResourceType(type="ovh:CloudProject/s3Policy:S3Policy")
public class S3Policy extends com.pulumi.resources.CustomResource {
    /**
     * The policy document. This is a JSON formatted string. See examples of policies on [public documentation](https://docs.ovh.com/gb/en/storage/s3/identity-and-access-management/).
     * 
     */
    @Export(name="policy", refs={String.class}, tree="[0]")
    private Output<String> policy;

    /**
     * @return The policy document. This is a JSON formatted string. See examples of policies on [public documentation](https://docs.ovh.com/gb/en/storage/s3/identity-and-access-management/).
     * 
     */
    public Output<String> policy() {
        return this.policy;
    }
    /**
     * The ID of the public cloud project. If omitted,
     * the `OVH_CLOUD_PROJECT_SERVICE` environment variable is used.
     * 
     */
    @Export(name="serviceName", refs={String.class}, tree="[0]")
    private Output<String> serviceName;

    /**
     * @return The ID of the public cloud project. If omitted,
     * the `OVH_CLOUD_PROJECT_SERVICE` environment variable is used.
     * 
     */
    public Output<String> serviceName() {
        return this.serviceName;
    }
    /**
     * The ID of a public cloud project&#39;s user.
     * 
     */
    @Export(name="userId", refs={String.class}, tree="[0]")
    private Output<String> userId;

    /**
     * @return The ID of a public cloud project&#39;s user.
     * 
     */
    public Output<String> userId() {
        return this.userId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public S3Policy(String name) {
        this(name, S3PolicyArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public S3Policy(String name, S3PolicyArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public S3Policy(String name, S3PolicyArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("ovh:CloudProject/s3Policy:S3Policy", name, args == null ? S3PolicyArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private S3Policy(String name, Output<String> id, @Nullable S3PolicyState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("ovh:CloudProject/s3Policy:S3Policy", name, state, makeResourceOptions(options, id));
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
    public static S3Policy get(String name, Output<String> id, @Nullable S3PolicyState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new S3Policy(name, id, state, options);
    }
}
