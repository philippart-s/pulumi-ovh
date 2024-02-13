// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.ovh.ovh.Vrack;

import com.ovh.ovh.Utilities;
import com.ovh.ovh.Vrack.outputs.GetVracksResult;
import com.pulumi.core.Output;
import com.pulumi.core.TypeShape;
import com.pulumi.deployment.Deployment;
import com.pulumi.deployment.InvokeOptions;
import com.pulumi.resources.InvokeArgs;
import java.util.concurrent.CompletableFuture;

public final class VrackFunctions {
    /**
     * Use this data source to get the list of Vrack IDs available for your OVHcloud account.
     * 
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.ovh.Vrack.VrackFunctions;
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
     *         final var vracks = VrackFunctions.getVracks();
     * 
     *     }
     * }
     * ```
     * 
     */
    public static Output<GetVracksResult> getVracks() {
        return getVracks(InvokeArgs.Empty, InvokeOptions.Empty);
    }
    /**
     * Use this data source to get the list of Vrack IDs available for your OVHcloud account.
     * 
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.ovh.Vrack.VrackFunctions;
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
     *         final var vracks = VrackFunctions.getVracks();
     * 
     *     }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetVracksResult> getVracksPlain() {
        return getVracksPlain(InvokeArgs.Empty, InvokeOptions.Empty);
    }
    /**
     * Use this data source to get the list of Vrack IDs available for your OVHcloud account.
     * 
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.ovh.Vrack.VrackFunctions;
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
     *         final var vracks = VrackFunctions.getVracks();
     * 
     *     }
     * }
     * ```
     * 
     */
    public static Output<GetVracksResult> getVracks(InvokeArgs args) {
        return getVracks(args, InvokeOptions.Empty);
    }
    /**
     * Use this data source to get the list of Vrack IDs available for your OVHcloud account.
     * 
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.ovh.Vrack.VrackFunctions;
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
     *         final var vracks = VrackFunctions.getVracks();
     * 
     *     }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetVracksResult> getVracksPlain(InvokeArgs args) {
        return getVracksPlain(args, InvokeOptions.Empty);
    }
    /**
     * Use this data source to get the list of Vrack IDs available for your OVHcloud account.
     * 
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.ovh.Vrack.VrackFunctions;
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
     *         final var vracks = VrackFunctions.getVracks();
     * 
     *     }
     * }
     * ```
     * 
     */
    public static Output<GetVracksResult> getVracks(InvokeArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("ovh:Vrack/getVracks:getVracks", TypeShape.of(GetVracksResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Use this data source to get the list of Vrack IDs available for your OVHcloud account.
     * 
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.ovh.Vrack.VrackFunctions;
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
     *         final var vracks = VrackFunctions.getVracks();
     * 
     *     }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetVracksResult> getVracksPlain(InvokeArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("ovh:Vrack/getVracks:getVracks", TypeShape.of(GetVracksResult.class), args, Utilities.withVersion(options));
    }
}
