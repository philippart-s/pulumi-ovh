// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Ovh.Me
{
    /// <summary>
    /// Use this resource to create a custom installation template available for dedicated servers.
    /// 
    /// ## Example Usage
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Ovh = Pulumi.Ovh;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var mytemplate = new Ovh.Me.InstallationTemplate("mytemplate", new()
    ///     {
    ///         BaseTemplateName = "centos7_64",
    ///         DefaultLanguage = "en",
    ///         TemplateName = "mytemplate",
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// Custom installation template available for dedicated servers can be imported using the `base_template_name`, `template_name` of the cluster, separated by "/" E.g.,
    /// 
    ///  bash
    /// 
    /// ```sh
    /// $ pulumi import ovh:Me/installationTemplate:InstallationTemplate mytemplate base_template_name/template_name
    /// ```
    /// </summary>
    [OvhResourceType("ovh:Me/installationTemplate:InstallationTemplate")]
    public partial class InstallationTemplate : global::Pulumi.CustomResource
    {
        /// <summary>
        /// List of all language available for this template.
        /// </summary>
        [Output("availableLanguages")]
        public Output<ImmutableArray<string>> AvailableLanguages { get; private set; } = null!;

        /// <summary>
        /// The name of an existing installation template, choose one among the list given by `ovh.getInstallationTemplates` datasource.
        /// </summary>
        [Output("baseTemplateName")]
        public Output<string> BaseTemplateName { get; private set; } = null!;

        /// <summary>
        /// This distribution is new and, although tested and functional, may still display odd behaviour.
        /// </summary>
        [Output("beta")]
        public Output<bool> Beta { get; private set; } = null!;

        /// <summary>
        /// This template bit format (32 or 64).
        /// </summary>
        [Output("bitFormat")]
        public Output<int> BitFormat { get; private set; } = null!;

        /// <summary>
        /// Category of this template (informative only). (basic, customer, hosting, other, readyToUse, virtualisation).
        /// </summary>
        [Output("category")]
        public Output<string> Category { get; private set; } = null!;

        [Output("customization")]
        public Output<Outputs.InstallationTemplateCustomization?> Customization { get; private set; } = null!;

        /// <summary>
        /// The default language of this template.
        /// </summary>
        [Output("defaultLanguage")]
        public Output<string> DefaultLanguage { get; private set; } = null!;

        /// <summary>
        /// is this distribution deprecated.
        /// </summary>
        [Output("deprecated")]
        public Output<bool> Deprecated { get; private set; } = null!;

        /// <summary>
        /// information about this template.
        /// </summary>
        [Output("description")]
        public Output<string> Description { get; private set; } = null!;

        /// <summary>
        /// the distribution this template is based on.
        /// </summary>
        [Output("distribution")]
        public Output<string> Distribution { get; private set; } = null!;

        /// <summary>
        /// this template family type (bsd,linux,solaris,windows).
        /// </summary>
        [Output("family")]
        public Output<string> Family { get; private set; } = null!;

        /// <summary>
        /// Filesystems available (btrfs,ext3,ext4,ntfs,reiserfs,swap,ufs,xfs,zfs).
        /// </summary>
        [Output("filesystems")]
        public Output<ImmutableArray<string>> Filesystems { get; private set; } = null!;

        /// <summary>
        /// This distribution supports hardware raid configuration through the OVHcloud API.
        /// </summary>
        [Output("hardRaidConfiguration")]
        public Output<bool> HardRaidConfiguration { get; private set; } = null!;

        /// <summary>
        /// Date of last modification of the base image.
        /// </summary>
        [Output("lastModification")]
        public Output<string> LastModification { get; private set; } = null!;

        /// <summary>
        /// This distribution supports Logical Volumes (Linux LVM)
        /// </summary>
        [Output("lvmReady")]
        public Output<bool> LvmReady { get; private set; } = null!;

        /// <summary>
        /// Remove default partition schemes at creation.
        /// </summary>
        [Output("removeDefaultPartitionSchemes")]
        public Output<bool> RemoveDefaultPartitionSchemes { get; private set; } = null!;

        /// <summary>
        /// This distribution supports installation using the distribution's native kernel instead of the recommended OVHcloud kernel.
        /// </summary>
        [Output("supportsDistributionKernel")]
        public Output<bool> SupportsDistributionKernel { get; private set; } = null!;

        /// <summary>
        /// This distribution supports RTM software.
        /// </summary>
        [Output("supportsRtm")]
        public Output<bool> SupportsRtm { get; private set; } = null!;

        /// <summary>
        /// This distribution supports the microsoft SQL server.
        /// </summary>
        [Output("supportsSqlServer")]
        public Output<bool> SupportsSqlServer { get; private set; } = null!;

        /// <summary>
        /// This template name.
        /// </summary>
        [Output("templateName")]
        public Output<string> TemplateName { get; private set; } = null!;


        /// <summary>
        /// Create a InstallationTemplate resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public InstallationTemplate(string name, InstallationTemplateArgs args, CustomResourceOptions? options = null)
            : base("ovh:Me/installationTemplate:InstallationTemplate", name, args ?? new InstallationTemplateArgs(), MakeResourceOptions(options, ""))
        {
        }

        private InstallationTemplate(string name, Input<string> id, InstallationTemplateState? state = null, CustomResourceOptions? options = null)
            : base("ovh:Me/installationTemplate:InstallationTemplate", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
                PluginDownloadURL = "github://api.github.com/ovh/pulumi-ovh",
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing InstallationTemplate resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static InstallationTemplate Get(string name, Input<string> id, InstallationTemplateState? state = null, CustomResourceOptions? options = null)
        {
            return new InstallationTemplate(name, id, state, options);
        }
    }

    public sealed class InstallationTemplateArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The name of an existing installation template, choose one among the list given by `ovh.getInstallationTemplates` datasource.
        /// </summary>
        [Input("baseTemplateName", required: true)]
        public Input<string> BaseTemplateName { get; set; } = null!;

        [Input("customization")]
        public Input<Inputs.InstallationTemplateCustomizationArgs>? Customization { get; set; }

        /// <summary>
        /// The default language of this template.
        /// </summary>
        [Input("defaultLanguage", required: true)]
        public Input<string> DefaultLanguage { get; set; } = null!;

        /// <summary>
        /// Remove default partition schemes at creation.
        /// </summary>
        [Input("removeDefaultPartitionSchemes")]
        public Input<bool>? RemoveDefaultPartitionSchemes { get; set; }

        /// <summary>
        /// This template name.
        /// </summary>
        [Input("templateName", required: true)]
        public Input<string> TemplateName { get; set; } = null!;

        public InstallationTemplateArgs()
        {
        }
        public static new InstallationTemplateArgs Empty => new InstallationTemplateArgs();
    }

    public sealed class InstallationTemplateState : global::Pulumi.ResourceArgs
    {
        [Input("availableLanguages")]
        private InputList<string>? _availableLanguages;

        /// <summary>
        /// List of all language available for this template.
        /// </summary>
        public InputList<string> AvailableLanguages
        {
            get => _availableLanguages ?? (_availableLanguages = new InputList<string>());
            set => _availableLanguages = value;
        }

        /// <summary>
        /// The name of an existing installation template, choose one among the list given by `ovh.getInstallationTemplates` datasource.
        /// </summary>
        [Input("baseTemplateName")]
        public Input<string>? BaseTemplateName { get; set; }

        /// <summary>
        /// This distribution is new and, although tested and functional, may still display odd behaviour.
        /// </summary>
        [Input("beta")]
        public Input<bool>? Beta { get; set; }

        /// <summary>
        /// This template bit format (32 or 64).
        /// </summary>
        [Input("bitFormat")]
        public Input<int>? BitFormat { get; set; }

        /// <summary>
        /// Category of this template (informative only). (basic, customer, hosting, other, readyToUse, virtualisation).
        /// </summary>
        [Input("category")]
        public Input<string>? Category { get; set; }

        [Input("customization")]
        public Input<Inputs.InstallationTemplateCustomizationGetArgs>? Customization { get; set; }

        /// <summary>
        /// The default language of this template.
        /// </summary>
        [Input("defaultLanguage")]
        public Input<string>? DefaultLanguage { get; set; }

        /// <summary>
        /// is this distribution deprecated.
        /// </summary>
        [Input("deprecated")]
        public Input<bool>? Deprecated { get; set; }

        /// <summary>
        /// information about this template.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// the distribution this template is based on.
        /// </summary>
        [Input("distribution")]
        public Input<string>? Distribution { get; set; }

        /// <summary>
        /// this template family type (bsd,linux,solaris,windows).
        /// </summary>
        [Input("family")]
        public Input<string>? Family { get; set; }

        [Input("filesystems")]
        private InputList<string>? _filesystems;

        /// <summary>
        /// Filesystems available (btrfs,ext3,ext4,ntfs,reiserfs,swap,ufs,xfs,zfs).
        /// </summary>
        public InputList<string> Filesystems
        {
            get => _filesystems ?? (_filesystems = new InputList<string>());
            set => _filesystems = value;
        }

        /// <summary>
        /// This distribution supports hardware raid configuration through the OVHcloud API.
        /// </summary>
        [Input("hardRaidConfiguration")]
        public Input<bool>? HardRaidConfiguration { get; set; }

        /// <summary>
        /// Date of last modification of the base image.
        /// </summary>
        [Input("lastModification")]
        public Input<string>? LastModification { get; set; }

        /// <summary>
        /// This distribution supports Logical Volumes (Linux LVM)
        /// </summary>
        [Input("lvmReady")]
        public Input<bool>? LvmReady { get; set; }

        /// <summary>
        /// Remove default partition schemes at creation.
        /// </summary>
        [Input("removeDefaultPartitionSchemes")]
        public Input<bool>? RemoveDefaultPartitionSchemes { get; set; }

        /// <summary>
        /// This distribution supports installation using the distribution's native kernel instead of the recommended OVHcloud kernel.
        /// </summary>
        [Input("supportsDistributionKernel")]
        public Input<bool>? SupportsDistributionKernel { get; set; }

        /// <summary>
        /// This distribution supports RTM software.
        /// </summary>
        [Input("supportsRtm")]
        public Input<bool>? SupportsRtm { get; set; }

        /// <summary>
        /// This distribution supports the microsoft SQL server.
        /// </summary>
        [Input("supportsSqlServer")]
        public Input<bool>? SupportsSqlServer { get; set; }

        /// <summary>
        /// This template name.
        /// </summary>
        [Input("templateName")]
        public Input<string>? TemplateName { get; set; }

        public InstallationTemplateState()
        {
        }
        public static new InstallationTemplateState Empty => new InstallationTemplateState();
    }
}
