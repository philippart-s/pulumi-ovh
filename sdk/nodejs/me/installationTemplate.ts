// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * Use this resource to create a custom installation template available for dedicated servers.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as ovh from "@ovh-devrelteam/pulumi-ovh";
 *
 * const mytemplate = new ovh.me.InstallationTemplate("mytemplate", {
 *     baseTemplateName: "centos7_64",
 *     defaultLanguage: "en",
 *     templateName: "mytemplate",
 * });
 * ```
 *
 * ## Import
 *
 * Custom installation template available for dedicated servers can be imported using the `base_template_name`, `template_name` of the cluster, separated by "/" E.g.,
 *
 *  bash
 *
 * ```sh
 * $ pulumi import ovh:Me/installationTemplate:InstallationTemplate mytemplate base_template_name/template_name
 * ```
 */
export class InstallationTemplate extends pulumi.CustomResource {
    /**
     * Get an existing InstallationTemplate resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: InstallationTemplateState, opts?: pulumi.CustomResourceOptions): InstallationTemplate {
        return new InstallationTemplate(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'ovh:Me/installationTemplate:InstallationTemplate';

    /**
     * Returns true if the given object is an instance of InstallationTemplate.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is InstallationTemplate {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === InstallationTemplate.__pulumiType;
    }

    /**
     * List of all language available for this template.
     */
    public /*out*/ readonly availableLanguages!: pulumi.Output<string[]>;
    /**
     * The name of an existing installation template, choose one among the list given by `ovh.getInstallationTemplates` datasource.
     */
    public readonly baseTemplateName!: pulumi.Output<string>;
    /**
     * This distribution is new and, although tested and functional, may still display odd behaviour.
     */
    public /*out*/ readonly beta!: pulumi.Output<boolean>;
    /**
     * This template bit format (32 or 64).
     */
    public /*out*/ readonly bitFormat!: pulumi.Output<number>;
    /**
     * Category of this template (informative only). (basic, customer, hosting, other, readyToUse, virtualisation).
     */
    public /*out*/ readonly category!: pulumi.Output<string>;
    public readonly customization!: pulumi.Output<outputs.Me.InstallationTemplateCustomization | undefined>;
    /**
     * The default language of this template.
     */
    public readonly defaultLanguage!: pulumi.Output<string>;
    /**
     * is this distribution deprecated.
     */
    public /*out*/ readonly deprecated!: pulumi.Output<boolean>;
    /**
     * information about this template.
     */
    public /*out*/ readonly description!: pulumi.Output<string>;
    /**
     * the distribution this template is based on.
     */
    public /*out*/ readonly distribution!: pulumi.Output<string>;
    /**
     * this template family type (bsd,linux,solaris,windows).
     */
    public /*out*/ readonly family!: pulumi.Output<string>;
    /**
     * Filesystems available (btrfs,ext3,ext4,ntfs,reiserfs,swap,ufs,xfs,zfs).
     */
    public /*out*/ readonly filesystems!: pulumi.Output<string[]>;
    /**
     * This distribution supports hardware raid configuration through the OVHcloud API.
     */
    public /*out*/ readonly hardRaidConfiguration!: pulumi.Output<boolean>;
    /**
     * Date of last modification of the base image.
     */
    public /*out*/ readonly lastModification!: pulumi.Output<string>;
    /**
     * This distribution supports Logical Volumes (Linux LVM)
     */
    public /*out*/ readonly lvmReady!: pulumi.Output<boolean>;
    /**
     * Remove default partition schemes at creation.
     */
    public readonly removeDefaultPartitionSchemes!: pulumi.Output<boolean>;
    /**
     * This distribution supports installation using the distribution's native kernel instead of the recommended OVHcloud kernel.
     */
    public /*out*/ readonly supportsDistributionKernel!: pulumi.Output<boolean>;
    /**
     * This distribution supports RTM software.
     */
    public /*out*/ readonly supportsRtm!: pulumi.Output<boolean>;
    /**
     * This distribution supports the microsoft SQL server.
     */
    public /*out*/ readonly supportsSqlServer!: pulumi.Output<boolean>;
    /**
     * This template name.
     */
    public readonly templateName!: pulumi.Output<string>;

    /**
     * Create a InstallationTemplate resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: InstallationTemplateArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: InstallationTemplateArgs | InstallationTemplateState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as InstallationTemplateState | undefined;
            resourceInputs["availableLanguages"] = state ? state.availableLanguages : undefined;
            resourceInputs["baseTemplateName"] = state ? state.baseTemplateName : undefined;
            resourceInputs["beta"] = state ? state.beta : undefined;
            resourceInputs["bitFormat"] = state ? state.bitFormat : undefined;
            resourceInputs["category"] = state ? state.category : undefined;
            resourceInputs["customization"] = state ? state.customization : undefined;
            resourceInputs["defaultLanguage"] = state ? state.defaultLanguage : undefined;
            resourceInputs["deprecated"] = state ? state.deprecated : undefined;
            resourceInputs["description"] = state ? state.description : undefined;
            resourceInputs["distribution"] = state ? state.distribution : undefined;
            resourceInputs["family"] = state ? state.family : undefined;
            resourceInputs["filesystems"] = state ? state.filesystems : undefined;
            resourceInputs["hardRaidConfiguration"] = state ? state.hardRaidConfiguration : undefined;
            resourceInputs["lastModification"] = state ? state.lastModification : undefined;
            resourceInputs["lvmReady"] = state ? state.lvmReady : undefined;
            resourceInputs["removeDefaultPartitionSchemes"] = state ? state.removeDefaultPartitionSchemes : undefined;
            resourceInputs["supportsDistributionKernel"] = state ? state.supportsDistributionKernel : undefined;
            resourceInputs["supportsRtm"] = state ? state.supportsRtm : undefined;
            resourceInputs["supportsSqlServer"] = state ? state.supportsSqlServer : undefined;
            resourceInputs["templateName"] = state ? state.templateName : undefined;
        } else {
            const args = argsOrState as InstallationTemplateArgs | undefined;
            if ((!args || args.baseTemplateName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'baseTemplateName'");
            }
            if ((!args || args.defaultLanguage === undefined) && !opts.urn) {
                throw new Error("Missing required property 'defaultLanguage'");
            }
            if ((!args || args.templateName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'templateName'");
            }
            resourceInputs["baseTemplateName"] = args ? args.baseTemplateName : undefined;
            resourceInputs["customization"] = args ? args.customization : undefined;
            resourceInputs["defaultLanguage"] = args ? args.defaultLanguage : undefined;
            resourceInputs["removeDefaultPartitionSchemes"] = args ? args.removeDefaultPartitionSchemes : undefined;
            resourceInputs["templateName"] = args ? args.templateName : undefined;
            resourceInputs["availableLanguages"] = undefined /*out*/;
            resourceInputs["beta"] = undefined /*out*/;
            resourceInputs["bitFormat"] = undefined /*out*/;
            resourceInputs["category"] = undefined /*out*/;
            resourceInputs["deprecated"] = undefined /*out*/;
            resourceInputs["description"] = undefined /*out*/;
            resourceInputs["distribution"] = undefined /*out*/;
            resourceInputs["family"] = undefined /*out*/;
            resourceInputs["filesystems"] = undefined /*out*/;
            resourceInputs["hardRaidConfiguration"] = undefined /*out*/;
            resourceInputs["lastModification"] = undefined /*out*/;
            resourceInputs["lvmReady"] = undefined /*out*/;
            resourceInputs["supportsDistributionKernel"] = undefined /*out*/;
            resourceInputs["supportsRtm"] = undefined /*out*/;
            resourceInputs["supportsSqlServer"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(InstallationTemplate.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering InstallationTemplate resources.
 */
export interface InstallationTemplateState {
    /**
     * List of all language available for this template.
     */
    availableLanguages?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The name of an existing installation template, choose one among the list given by `ovh.getInstallationTemplates` datasource.
     */
    baseTemplateName?: pulumi.Input<string>;
    /**
     * This distribution is new and, although tested and functional, may still display odd behaviour.
     */
    beta?: pulumi.Input<boolean>;
    /**
     * This template bit format (32 or 64).
     */
    bitFormat?: pulumi.Input<number>;
    /**
     * Category of this template (informative only). (basic, customer, hosting, other, readyToUse, virtualisation).
     */
    category?: pulumi.Input<string>;
    customization?: pulumi.Input<inputs.Me.InstallationTemplateCustomization>;
    /**
     * The default language of this template.
     */
    defaultLanguage?: pulumi.Input<string>;
    /**
     * is this distribution deprecated.
     */
    deprecated?: pulumi.Input<boolean>;
    /**
     * information about this template.
     */
    description?: pulumi.Input<string>;
    /**
     * the distribution this template is based on.
     */
    distribution?: pulumi.Input<string>;
    /**
     * this template family type (bsd,linux,solaris,windows).
     */
    family?: pulumi.Input<string>;
    /**
     * Filesystems available (btrfs,ext3,ext4,ntfs,reiserfs,swap,ufs,xfs,zfs).
     */
    filesystems?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * This distribution supports hardware raid configuration through the OVHcloud API.
     */
    hardRaidConfiguration?: pulumi.Input<boolean>;
    /**
     * Date of last modification of the base image.
     */
    lastModification?: pulumi.Input<string>;
    /**
     * This distribution supports Logical Volumes (Linux LVM)
     */
    lvmReady?: pulumi.Input<boolean>;
    /**
     * Remove default partition schemes at creation.
     */
    removeDefaultPartitionSchemes?: pulumi.Input<boolean>;
    /**
     * This distribution supports installation using the distribution's native kernel instead of the recommended OVHcloud kernel.
     */
    supportsDistributionKernel?: pulumi.Input<boolean>;
    /**
     * This distribution supports RTM software.
     */
    supportsRtm?: pulumi.Input<boolean>;
    /**
     * This distribution supports the microsoft SQL server.
     */
    supportsSqlServer?: pulumi.Input<boolean>;
    /**
     * This template name.
     */
    templateName?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a InstallationTemplate resource.
 */
export interface InstallationTemplateArgs {
    /**
     * The name of an existing installation template, choose one among the list given by `ovh.getInstallationTemplates` datasource.
     */
    baseTemplateName: pulumi.Input<string>;
    customization?: pulumi.Input<inputs.Me.InstallationTemplateCustomization>;
    /**
     * The default language of this template.
     */
    defaultLanguage: pulumi.Input<string>;
    /**
     * Remove default partition schemes at creation.
     */
    removeDefaultPartitionSchemes?: pulumi.Input<boolean>;
    /**
     * This template name.
     */
    templateName: pulumi.Input<string>;
}
