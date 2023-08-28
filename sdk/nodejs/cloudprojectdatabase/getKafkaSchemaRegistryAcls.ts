// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Use this data source to get the list of ACLs of a kafka cluster associated with a public cloud project.
 *
 * ## Example Usage
 */
export function getKafkaSchemaRegistryAcls(args: GetKafkaSchemaRegistryAclsArgs, opts?: pulumi.InvokeOptions): Promise<GetKafkaSchemaRegistryAclsResult> {

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("ovh:CloudProjectDatabase/getKafkaSchemaRegistryAcls:getKafkaSchemaRegistryAcls", {
        "clusterId": args.clusterId,
        "serviceName": args.serviceName,
    }, opts);
}

/**
 * A collection of arguments for invoking getKafkaSchemaRegistryAcls.
 */
export interface GetKafkaSchemaRegistryAclsArgs {
    /**
     * Cluster ID
     */
    clusterId: string;
    /**
     * The id of the public cloud project. If omitted,
     * the `OVH_CLOUD_PROJECT_SERVICE` environment variable is used.
     */
    serviceName: string;
}

/**
 * A collection of values returned by getKafkaSchemaRegistryAcls.
 */
export interface GetKafkaSchemaRegistryAclsResult {
    /**
     * The list of schema refistry ACLs ids of the kafka cluster associated with the project.
     */
    readonly aclIds: string[];
    /**
     * See Argument Reference above.
     */
    readonly clusterId: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * See Argument Reference above.
     */
    readonly serviceName: string;
}
/**
 * Use this data source to get the list of ACLs of a kafka cluster associated with a public cloud project.
 *
 * ## Example Usage
 */
export function getKafkaSchemaRegistryAclsOutput(args: GetKafkaSchemaRegistryAclsOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetKafkaSchemaRegistryAclsResult> {
    return pulumi.output(args).apply((a: any) => getKafkaSchemaRegistryAcls(a, opts))
}

/**
 * A collection of arguments for invoking getKafkaSchemaRegistryAcls.
 */
export interface GetKafkaSchemaRegistryAclsOutputArgs {
    /**
     * Cluster ID
     */
    clusterId: pulumi.Input<string>;
    /**
     * The id of the public cloud project. If omitted,
     * the `OVH_CLOUD_PROJECT_SERVICE` environment variable is used.
     */
    serviceName: pulumi.Input<string>;
}
