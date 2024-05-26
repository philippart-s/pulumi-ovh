// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.ovh.ovh.Dedicated;

import com.ovh.ovh.Dedicated.inputs.GetCephArgs;
import com.ovh.ovh.Dedicated.inputs.GetCephPlainArgs;
import com.ovh.ovh.Dedicated.inputs.GetNasHAArgs;
import com.ovh.ovh.Dedicated.inputs.GetNasHAPlainArgs;
import com.ovh.ovh.Dedicated.inputs.GetServerBootsArgs;
import com.ovh.ovh.Dedicated.inputs.GetServerBootsPlainArgs;
import com.ovh.ovh.Dedicated.outputs.GetCephResult;
import com.ovh.ovh.Dedicated.outputs.GetNasHAResult;
import com.ovh.ovh.Dedicated.outputs.GetServerBootsResult;
import com.ovh.ovh.Utilities;
import com.pulumi.core.Output;
import com.pulumi.core.TypeShape;
import com.pulumi.deployment.Deployment;
import com.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;

public final class DedicatedFunctions {
    /**
     * Use this data source to retrieve information about a dedicated CEPH.
     * 
     * ## Example Usage
     * <pre>
     * {@code
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.ovh.Dedicated.DedicatedFunctions;
     * import com.pulumi.ovh.Dedicated.inputs.GetCephArgs;
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
     *         final var my-ceph = DedicatedFunctions.getCeph(GetCephArgs.builder()
     *             .serviceName("XXXXXX")
     *             .build());
     * 
     *     }
     * }
     * }
     * </pre>
     * 
     */
    public static Output<GetCephResult> getCeph(GetCephArgs args) {
        return getCeph(args, InvokeOptions.Empty);
    }
    /**
     * Use this data source to retrieve information about a dedicated CEPH.
     * 
     * ## Example Usage
     * <pre>
     * {@code
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.ovh.Dedicated.DedicatedFunctions;
     * import com.pulumi.ovh.Dedicated.inputs.GetCephArgs;
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
     *         final var my-ceph = DedicatedFunctions.getCeph(GetCephArgs.builder()
     *             .serviceName("XXXXXX")
     *             .build());
     * 
     *     }
     * }
     * }
     * </pre>
     * 
     */
    public static CompletableFuture<GetCephResult> getCephPlain(GetCephPlainArgs args) {
        return getCephPlain(args, InvokeOptions.Empty);
    }
    /**
     * Use this data source to retrieve information about a dedicated CEPH.
     * 
     * ## Example Usage
     * <pre>
     * {@code
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.ovh.Dedicated.DedicatedFunctions;
     * import com.pulumi.ovh.Dedicated.inputs.GetCephArgs;
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
     *         final var my-ceph = DedicatedFunctions.getCeph(GetCephArgs.builder()
     *             .serviceName("XXXXXX")
     *             .build());
     * 
     *     }
     * }
     * }
     * </pre>
     * 
     */
    public static Output<GetCephResult> getCeph(GetCephArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("ovh:Dedicated/getCeph:getCeph", TypeShape.of(GetCephResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Use this data source to retrieve information about a dedicated CEPH.
     * 
     * ## Example Usage
     * <pre>
     * {@code
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.ovh.Dedicated.DedicatedFunctions;
     * import com.pulumi.ovh.Dedicated.inputs.GetCephArgs;
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
     *         final var my-ceph = DedicatedFunctions.getCeph(GetCephArgs.builder()
     *             .serviceName("XXXXXX")
     *             .build());
     * 
     *     }
     * }
     * }
     * </pre>
     * 
     */
    public static CompletableFuture<GetCephResult> getCephPlain(GetCephPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("ovh:Dedicated/getCeph:getCeph", TypeShape.of(GetCephResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Use this data source to retrieve information about a dedicated HA-NAS.
     * 
     * ## Example Usage
     * <pre>
     * {@code
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.ovh.Dedicated.DedicatedFunctions;
     * import com.pulumi.ovh.Dedicated.inputs.GetNasHAArgs;
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
     *         final var my-nas-ha = DedicatedFunctions.getNasHA(GetNasHAArgs.builder()
     *             .serviceName("zpool-12345")
     *             .build());
     * 
     *     }
     * }
     * }
     * </pre>
     * 
     */
    public static Output<GetNasHAResult> getNasHA(GetNasHAArgs args) {
        return getNasHA(args, InvokeOptions.Empty);
    }
    /**
     * Use this data source to retrieve information about a dedicated HA-NAS.
     * 
     * ## Example Usage
     * <pre>
     * {@code
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.ovh.Dedicated.DedicatedFunctions;
     * import com.pulumi.ovh.Dedicated.inputs.GetNasHAArgs;
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
     *         final var my-nas-ha = DedicatedFunctions.getNasHA(GetNasHAArgs.builder()
     *             .serviceName("zpool-12345")
     *             .build());
     * 
     *     }
     * }
     * }
     * </pre>
     * 
     */
    public static CompletableFuture<GetNasHAResult> getNasHAPlain(GetNasHAPlainArgs args) {
        return getNasHAPlain(args, InvokeOptions.Empty);
    }
    /**
     * Use this data source to retrieve information about a dedicated HA-NAS.
     * 
     * ## Example Usage
     * <pre>
     * {@code
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.ovh.Dedicated.DedicatedFunctions;
     * import com.pulumi.ovh.Dedicated.inputs.GetNasHAArgs;
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
     *         final var my-nas-ha = DedicatedFunctions.getNasHA(GetNasHAArgs.builder()
     *             .serviceName("zpool-12345")
     *             .build());
     * 
     *     }
     * }
     * }
     * </pre>
     * 
     */
    public static Output<GetNasHAResult> getNasHA(GetNasHAArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("ovh:Dedicated/getNasHA:getNasHA", TypeShape.of(GetNasHAResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Use this data source to retrieve information about a dedicated HA-NAS.
     * 
     * ## Example Usage
     * <pre>
     * {@code
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.ovh.Dedicated.DedicatedFunctions;
     * import com.pulumi.ovh.Dedicated.inputs.GetNasHAArgs;
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
     *         final var my-nas-ha = DedicatedFunctions.getNasHA(GetNasHAArgs.builder()
     *             .serviceName("zpool-12345")
     *             .build());
     * 
     *     }
     * }
     * }
     * </pre>
     * 
     */
    public static CompletableFuture<GetNasHAResult> getNasHAPlain(GetNasHAPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("ovh:Dedicated/getNasHA:getNasHA", TypeShape.of(GetNasHAResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Use this data source to get the list of compatible netboots for a dedicated server associated with your OVHcloud Account.
     * 
     * ## Example Usage
     * <pre>
     * {@code
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.ovh.Dedicated.DedicatedFunctions;
     * import com.pulumi.ovh.Dedicated.inputs.GetServerBootsArgs;
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
     *         final var netboots = DedicatedFunctions.getServerBoots(GetServerBootsArgs.builder()
     *             .bootType("harddisk")
     *             .serviceName("myserver")
     *             .build());
     * 
     *     }
     * }
     * }
     * </pre>
     * 
     */
    public static Output<GetServerBootsResult> getServerBoots(GetServerBootsArgs args) {
        return getServerBoots(args, InvokeOptions.Empty);
    }
    /**
     * Use this data source to get the list of compatible netboots for a dedicated server associated with your OVHcloud Account.
     * 
     * ## Example Usage
     * <pre>
     * {@code
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.ovh.Dedicated.DedicatedFunctions;
     * import com.pulumi.ovh.Dedicated.inputs.GetServerBootsArgs;
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
     *         final var netboots = DedicatedFunctions.getServerBoots(GetServerBootsArgs.builder()
     *             .bootType("harddisk")
     *             .serviceName("myserver")
     *             .build());
     * 
     *     }
     * }
     * }
     * </pre>
     * 
     */
    public static CompletableFuture<GetServerBootsResult> getServerBootsPlain(GetServerBootsPlainArgs args) {
        return getServerBootsPlain(args, InvokeOptions.Empty);
    }
    /**
     * Use this data source to get the list of compatible netboots for a dedicated server associated with your OVHcloud Account.
     * 
     * ## Example Usage
     * <pre>
     * {@code
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.ovh.Dedicated.DedicatedFunctions;
     * import com.pulumi.ovh.Dedicated.inputs.GetServerBootsArgs;
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
     *         final var netboots = DedicatedFunctions.getServerBoots(GetServerBootsArgs.builder()
     *             .bootType("harddisk")
     *             .serviceName("myserver")
     *             .build());
     * 
     *     }
     * }
     * }
     * </pre>
     * 
     */
    public static Output<GetServerBootsResult> getServerBoots(GetServerBootsArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("ovh:Dedicated/getServerBoots:getServerBoots", TypeShape.of(GetServerBootsResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Use this data source to get the list of compatible netboots for a dedicated server associated with your OVHcloud Account.
     * 
     * ## Example Usage
     * <pre>
     * {@code
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.ovh.Dedicated.DedicatedFunctions;
     * import com.pulumi.ovh.Dedicated.inputs.GetServerBootsArgs;
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
     *         final var netboots = DedicatedFunctions.getServerBoots(GetServerBootsArgs.builder()
     *             .bootType("harddisk")
     *             .serviceName("myserver")
     *             .build());
     * 
     *     }
     * }
     * }
     * </pre>
     * 
     */
    public static CompletableFuture<GetServerBootsResult> getServerBootsPlain(GetServerBootsPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("ovh:Dedicated/getServerBoots:getServerBoots", TypeShape.of(GetServerBootsResult.class), args, Utilities.withVersion(options));
    }
}