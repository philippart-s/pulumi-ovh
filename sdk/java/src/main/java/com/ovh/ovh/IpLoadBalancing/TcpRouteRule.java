// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.ovh.ovh.IpLoadBalancing;

import com.ovh.ovh.IpLoadBalancing.TcpRouteRuleArgs;
import com.ovh.ovh.IpLoadBalancing.inputs.TcpRouteRuleState;
import com.ovh.ovh.Utilities;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Manage rules for TCP route.
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.ovh.IpLoadBalancing.TcpRoute;
 * import com.pulumi.ovh.IpLoadBalancing.TcpRouteArgs;
 * import com.pulumi.ovh.IpLoadBalancing.inputs.TcpRouteActionArgs;
 * import com.pulumi.ovh.IpLoadBalancing.TcpRouteRule;
 * import com.pulumi.ovh.IpLoadBalancing.TcpRouteRuleArgs;
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
 *         var reject = new TcpRoute(&#34;reject&#34;, TcpRouteArgs.builder()        
 *             .serviceName(&#34;loadbalancer-xxxxxxxxxxxxxxxxxx&#34;)
 *             .weight(1)
 *             .frontendId(11111)
 *             .action(TcpRouteActionArgs.builder()
 *                 .type(&#34;reject&#34;)
 *                 .build())
 *             .build());
 * 
 *         var examplerule = new TcpRouteRule(&#34;examplerule&#34;, TcpRouteRuleArgs.builder()        
 *             .serviceName(&#34;loadbalancer-xxxxxxxxxxxxxxxxxx&#34;)
 *             .routeId(reject.id())
 *             .displayName(&#34;Match example.com host&#34;)
 *             .field(&#34;sni&#34;)
 *             .match(&#34;is&#34;)
 *             .negate(false)
 *             .pattern(&#34;example.com&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 */
@ResourceType(type="ovh:IpLoadBalancing/tcpRouteRule:TcpRouteRule")
public class TcpRouteRule extends com.pulumi.resources.CustomResource {
    /**
     * Human readable name for your rule, this field is for you
     * 
     */
    @Export(name="displayName", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> displayName;

    /**
     * @return Human readable name for your rule, this field is for you
     * 
     */
    public Output<Optional<String>> displayName() {
        return Codegen.optional(this.displayName);
    }
    /**
     * Name of the field to match like &#34;protocol&#34; or &#34;host&#34;. See &#34;/ipLoadbalancing/{serviceName}/availableRouteRules&#34; for a list of available rules
     * 
     */
    @Export(name="field", refs={String.class}, tree="[0]")
    private Output<String> field;

    /**
     * @return Name of the field to match like &#34;protocol&#34; or &#34;host&#34;. See &#34;/ipLoadbalancing/{serviceName}/availableRouteRules&#34; for a list of available rules
     * 
     */
    public Output<String> field() {
        return this.field;
    }
    /**
     * Matching operator. Not all operators are available for all fields. See &#34;/ipLoadbalancing/{serviceName}/availableRouteRules&#34;
     * 
     */
    @Export(name="match", refs={String.class}, tree="[0]")
    private Output<String> match;

    /**
     * @return Matching operator. Not all operators are available for all fields. See &#34;/ipLoadbalancing/{serviceName}/availableRouteRules&#34;
     * 
     */
    public Output<String> match() {
        return this.match;
    }
    /**
     * Invert the matching operator effect
     * 
     */
    @Export(name="negate", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> negate;

    /**
     * @return Invert the matching operator effect
     * 
     */
    public Output<Boolean> negate() {
        return this.negate;
    }
    /**
     * Value to match against this match. Interpretation if this field depends on the match and field
     * 
     */
    @Export(name="pattern", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> pattern;

    /**
     * @return Value to match against this match. Interpretation if this field depends on the match and field
     * 
     */
    public Output<Optional<String>> pattern() {
        return Codegen.optional(this.pattern);
    }
    /**
     * The route to apply this rule
     * 
     */
    @Export(name="routeId", refs={String.class}, tree="[0]")
    private Output<String> routeId;

    /**
     * @return The route to apply this rule
     * 
     */
    public Output<String> routeId() {
        return this.routeId;
    }
    /**
     * The internal name of your IP load balancing
     * 
     */
    @Export(name="serviceName", refs={String.class}, tree="[0]")
    private Output<String> serviceName;

    /**
     * @return The internal name of your IP load balancing
     * 
     */
    public Output<String> serviceName() {
        return this.serviceName;
    }
    /**
     * Name of sub-field, if applicable. This may be a Cookie or Header name for instance
     * 
     */
    @Export(name="subField", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> subField;

    /**
     * @return Name of sub-field, if applicable. This may be a Cookie or Header name for instance
     * 
     */
    public Output<Optional<String>> subField() {
        return Codegen.optional(this.subField);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public TcpRouteRule(String name) {
        this(name, TcpRouteRuleArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public TcpRouteRule(String name, TcpRouteRuleArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public TcpRouteRule(String name, TcpRouteRuleArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("ovh:IpLoadBalancing/tcpRouteRule:TcpRouteRule", name, args == null ? TcpRouteRuleArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private TcpRouteRule(String name, Output<String> id, @Nullable TcpRouteRuleState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("ovh:IpLoadBalancing/tcpRouteRule:TcpRouteRule", name, state, makeResourceOptions(options, id));
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
    public static TcpRouteRule get(String name, Output<String> id, @Nullable TcpRouteRuleState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new TcpRouteRule(name, id, state, options);
    }
}
