// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Use this data source to retrieve am IAM policy.
 *
 * ## Example Usage
 */
export function getPolicy(args: GetPolicyArgs, opts?: pulumi.InvokeOptions): Promise<GetPolicyResult> {

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("ovh:Iam/getPolicy:getPolicy", {
        "allows": args.allows,
        "description": args.description,
        "excepts": args.excepts,
        "id": args.id,
    }, opts);
}

/**
 * A collection of arguments for invoking getPolicy.
 */
export interface GetPolicyArgs {
    /**
     * List of actions allowed by the policy.
     */
    allows?: string[];
    /**
     * Group description.
     */
    description?: string;
    /**
     * List of actions.
     */
    excepts?: string[];
    /**
     * UUID of the policy.
     */
    id: string;
}

/**
 * A collection of values returned by getPolicy.
 */
export interface GetPolicyResult {
    /**
     * List of actions allowed by the policy.
     */
    readonly allows?: string[];
    /**
     * Creation date of this group.
     */
    readonly createdAt: string;
    /**
     * Group description.
     */
    readonly description?: string;
    /**
     * List of actions.
     */
    readonly excepts?: string[];
    readonly id: string;
    /**
     * List of identities affected by the policy.
     */
    readonly identities: string[];
    /**
     * Name of the policy.
     */
    readonly name: string;
    /**
     * Owner of the policy.
     */
    readonly owner: string;
    /**
     * Indicates that the policy is a default one.
     */
    readonly readOnly: boolean;
    /**
     * List of resources affected by the policy.
     */
    readonly resources: string[];
    /**
     * Date of the last update of this group.
     */
    readonly updatedAt: string;
}
/**
 * Use this data source to retrieve am IAM policy.
 *
 * ## Example Usage
 */
export function getPolicyOutput(args: GetPolicyOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetPolicyResult> {
    return pulumi.output(args).apply((a: any) => getPolicy(a, opts))
}

/**
 * A collection of arguments for invoking getPolicy.
 */
export interface GetPolicyOutputArgs {
    /**
     * List of actions allowed by the policy.
     */
    allows?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Group description.
     */
    description?: pulumi.Input<string>;
    /**
     * List of actions.
     */
    excepts?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * UUID of the policy.
     */
    id: pulumi.Input<string>;
}
