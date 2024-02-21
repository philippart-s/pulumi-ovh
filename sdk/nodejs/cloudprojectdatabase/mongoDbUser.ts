// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * ## Import
 *
 * OVHcloud Managed MongoDB clusters users can be imported using the `service_name`, `cluster_id` and `id` of the user, separated by "/" E.g.,
 *
 *  bash
 *
 * ```sh
 * $ pulumi import ovh:CloudProjectDatabase/mongoDbUser:MongoDbUser my_user service_name/cluster_id/id
 * ```
 */
export class MongoDbUser extends pulumi.CustomResource {
    /**
     * Get an existing MongoDbUser resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: MongoDbUserState, opts?: pulumi.CustomResourceOptions): MongoDbUser {
        return new MongoDbUser(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'ovh:CloudProjectDatabase/mongoDbUser:MongoDbUser';

    /**
     * Returns true if the given object is an instance of MongoDbUser.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is MongoDbUser {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === MongoDbUser.__pulumiType;
    }

    /**
     * Cluster ID.
     */
    public readonly clusterId!: pulumi.Output<string>;
    /**
     * Date of the creation of the user.
     */
    public /*out*/ readonly createdAt!: pulumi.Output<string>;
    /**
     * Name of the user.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * (Sensitive) Password of the user.
     */
    public /*out*/ readonly password!: pulumi.Output<string>;
    /**
     * Arbitrary string to change to trigger a password update
     */
    public readonly passwordReset!: pulumi.Output<string | undefined>;
    /**
     * Roles the user belongs to. Since version 0.37.0, the authentication database must be indicated for all roles
     * Available roles:
     * * `backup@admin`
     * * `clusterAdmin@admin`
     * * `clusterManager@admin`
     * * `clusterMonitor@admin`
     * * `dbAdmin@(defined db)`
     * * `dbAdminAnyDatabase@admin`
     * * `dbOwner@(defined db)`
     * * `enableSharding@(defined db)`
     * * `hostManager@admin`
     * * `read@(defined db)`
     * * `readAnyDatabase@admin`
     * * `readWrite@(defined db)`
     * * `readWriteAnyDatabase@admin`
     * * `restore@admin`
     * * `root@admin`
     * * `userAdmin@(defined db)`
     * * `userAdminAnyDatabase@admin`
     */
    public readonly roles!: pulumi.Output<string[] | undefined>;
    /**
     * The id of the public cloud project. If omitted,
     * the `OVH_CLOUD_PROJECT_SERVICE` environment variable is used.
     */
    public readonly serviceName!: pulumi.Output<string>;
    /**
     * Current status of the user.
     */
    public /*out*/ readonly status!: pulumi.Output<string>;

    /**
     * Create a MongoDbUser resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: MongoDbUserArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: MongoDbUserArgs | MongoDbUserState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as MongoDbUserState | undefined;
            resourceInputs["clusterId"] = state ? state.clusterId : undefined;
            resourceInputs["createdAt"] = state ? state.createdAt : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["password"] = state ? state.password : undefined;
            resourceInputs["passwordReset"] = state ? state.passwordReset : undefined;
            resourceInputs["roles"] = state ? state.roles : undefined;
            resourceInputs["serviceName"] = state ? state.serviceName : undefined;
            resourceInputs["status"] = state ? state.status : undefined;
        } else {
            const args = argsOrState as MongoDbUserArgs | undefined;
            if ((!args || args.clusterId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'clusterId'");
            }
            if ((!args || args.serviceName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'serviceName'");
            }
            resourceInputs["clusterId"] = args ? args.clusterId : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["passwordReset"] = args ? args.passwordReset : undefined;
            resourceInputs["roles"] = args ? args.roles : undefined;
            resourceInputs["serviceName"] = args ? args.serviceName : undefined;
            resourceInputs["createdAt"] = undefined /*out*/;
            resourceInputs["password"] = undefined /*out*/;
            resourceInputs["status"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        const secretOpts = { additionalSecretOutputs: ["password"] };
        opts = pulumi.mergeOptions(opts, secretOpts);
        super(MongoDbUser.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering MongoDbUser resources.
 */
export interface MongoDbUserState {
    /**
     * Cluster ID.
     */
    clusterId?: pulumi.Input<string>;
    /**
     * Date of the creation of the user.
     */
    createdAt?: pulumi.Input<string>;
    /**
     * Name of the user.
     */
    name?: pulumi.Input<string>;
    /**
     * (Sensitive) Password of the user.
     */
    password?: pulumi.Input<string>;
    /**
     * Arbitrary string to change to trigger a password update
     */
    passwordReset?: pulumi.Input<string>;
    /**
     * Roles the user belongs to. Since version 0.37.0, the authentication database must be indicated for all roles
     * Available roles:
     * * `backup@admin`
     * * `clusterAdmin@admin`
     * * `clusterManager@admin`
     * * `clusterMonitor@admin`
     * * `dbAdmin@(defined db)`
     * * `dbAdminAnyDatabase@admin`
     * * `dbOwner@(defined db)`
     * * `enableSharding@(defined db)`
     * * `hostManager@admin`
     * * `read@(defined db)`
     * * `readAnyDatabase@admin`
     * * `readWrite@(defined db)`
     * * `readWriteAnyDatabase@admin`
     * * `restore@admin`
     * * `root@admin`
     * * `userAdmin@(defined db)`
     * * `userAdminAnyDatabase@admin`
     */
    roles?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The id of the public cloud project. If omitted,
     * the `OVH_CLOUD_PROJECT_SERVICE` environment variable is used.
     */
    serviceName?: pulumi.Input<string>;
    /**
     * Current status of the user.
     */
    status?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a MongoDbUser resource.
 */
export interface MongoDbUserArgs {
    /**
     * Cluster ID.
     */
    clusterId: pulumi.Input<string>;
    /**
     * Name of the user.
     */
    name?: pulumi.Input<string>;
    /**
     * Arbitrary string to change to trigger a password update
     */
    passwordReset?: pulumi.Input<string>;
    /**
     * Roles the user belongs to. Since version 0.37.0, the authentication database must be indicated for all roles
     * Available roles:
     * * `backup@admin`
     * * `clusterAdmin@admin`
     * * `clusterManager@admin`
     * * `clusterMonitor@admin`
     * * `dbAdmin@(defined db)`
     * * `dbAdminAnyDatabase@admin`
     * * `dbOwner@(defined db)`
     * * `enableSharding@(defined db)`
     * * `hostManager@admin`
     * * `read@(defined db)`
     * * `readAnyDatabase@admin`
     * * `readWrite@(defined db)`
     * * `readWriteAnyDatabase@admin`
     * * `restore@admin`
     * * `root@admin`
     * * `userAdmin@(defined db)`
     * * `userAdminAnyDatabase@admin`
     */
    roles?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The id of the public cloud project. If omitted,
     * the `OVH_CLOUD_PROJECT_SERVICE` environment variable is used.
     */
    serviceName: pulumi.Input<string>;
}
