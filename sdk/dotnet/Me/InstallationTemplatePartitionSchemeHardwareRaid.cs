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
    /// Use this resource to create a hardware raid group in the partition scheme of a custom installation template available for dedicated servers.
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
    ///         TemplateName = "mytemplate",
    ///         DefaultLanguage = "fr",
    ///     });
    /// 
    ///     var scheme = new Ovh.Me.InstallationTemplatePartitionScheme("scheme", new()
    ///     {
    ///         TemplateName = mytemplate.TemplateName,
    ///         Priority = 1,
    ///     });
    /// 
    ///     var group1 = new Ovh.Me.InstallationTemplatePartitionSchemeHardwareRaid("group1", new()
    ///     {
    ///         TemplateName = scheme.TemplateName,
    ///         SchemeName = scheme.Name,
    ///         Disks = new[]
    ///         {
    ///             "[c1:d1,c1:d2,c1:d3]",
    ///             "[c1:d10,c1:d20,c1:d30]",
    ///         },
    ///         Mode = "raid50",
    ///         Step = 1,
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// The resource can be imported using the `template_name`, `scheme_name`, `name` of the cluster, separated by "/" E.g.,
    /// 
    ///  bash
    /// 
    /// ```sh
    /// $ pulumi import ovh:Me/installationTemplatePartitionSchemeHardwareRaid:InstallationTemplatePartitionSchemeHardwareRaid group1 template_name/scheme_name/name
    /// ```
    /// </summary>
    [OvhResourceType("ovh:Me/installationTemplatePartitionSchemeHardwareRaid:InstallationTemplatePartitionSchemeHardwareRaid")]
    public partial class InstallationTemplatePartitionSchemeHardwareRaid : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Disk List. Syntax is cX:dY for disks and [cX:dY,cX:dY] for groups. With X and Y resp. the controller id and the disk id.
        /// </summary>
        [Output("disks")]
        public Output<ImmutableArray<string>> Disks { get; private set; } = null!;

        /// <summary>
        /// RAID mode (raid0, raid1, raid10, raid5, raid50, raid6, raid60).
        /// </summary>
        [Output("mode")]
        public Output<string> Mode { get; private set; } = null!;

        /// <summary>
        /// Hardware RAID name.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// The partition scheme name.
        /// </summary>
        [Output("schemeName")]
        public Output<string> SchemeName { get; private set; } = null!;

        /// <summary>
        /// Specifies the creation order of the hardware RAID.
        /// </summary>
        [Output("step")]
        public Output<int> Step { get; private set; } = null!;

        /// <summary>
        /// The template name of the partition scheme.
        /// </summary>
        [Output("templateName")]
        public Output<string> TemplateName { get; private set; } = null!;


        /// <summary>
        /// Create a InstallationTemplatePartitionSchemeHardwareRaid resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public InstallationTemplatePartitionSchemeHardwareRaid(string name, InstallationTemplatePartitionSchemeHardwareRaidArgs args, CustomResourceOptions? options = null)
            : base("ovh:Me/installationTemplatePartitionSchemeHardwareRaid:InstallationTemplatePartitionSchemeHardwareRaid", name, args ?? new InstallationTemplatePartitionSchemeHardwareRaidArgs(), MakeResourceOptions(options, ""))
        {
        }

        private InstallationTemplatePartitionSchemeHardwareRaid(string name, Input<string> id, InstallationTemplatePartitionSchemeHardwareRaidState? state = null, CustomResourceOptions? options = null)
            : base("ovh:Me/installationTemplatePartitionSchemeHardwareRaid:InstallationTemplatePartitionSchemeHardwareRaid", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing InstallationTemplatePartitionSchemeHardwareRaid resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static InstallationTemplatePartitionSchemeHardwareRaid Get(string name, Input<string> id, InstallationTemplatePartitionSchemeHardwareRaidState? state = null, CustomResourceOptions? options = null)
        {
            return new InstallationTemplatePartitionSchemeHardwareRaid(name, id, state, options);
        }
    }

    public sealed class InstallationTemplatePartitionSchemeHardwareRaidArgs : global::Pulumi.ResourceArgs
    {
        [Input("disks", required: true)]
        private InputList<string>? _disks;

        /// <summary>
        /// Disk List. Syntax is cX:dY for disks and [cX:dY,cX:dY] for groups. With X and Y resp. the controller id and the disk id.
        /// </summary>
        public InputList<string> Disks
        {
            get => _disks ?? (_disks = new InputList<string>());
            set => _disks = value;
        }

        /// <summary>
        /// RAID mode (raid0, raid1, raid10, raid5, raid50, raid6, raid60).
        /// </summary>
        [Input("mode", required: true)]
        public Input<string> Mode { get; set; } = null!;

        /// <summary>
        /// Hardware RAID name.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The partition scheme name.
        /// </summary>
        [Input("schemeName", required: true)]
        public Input<string> SchemeName { get; set; } = null!;

        /// <summary>
        /// Specifies the creation order of the hardware RAID.
        /// </summary>
        [Input("step", required: true)]
        public Input<int> Step { get; set; } = null!;

        /// <summary>
        /// The template name of the partition scheme.
        /// </summary>
        [Input("templateName", required: true)]
        public Input<string> TemplateName { get; set; } = null!;

        public InstallationTemplatePartitionSchemeHardwareRaidArgs()
        {
        }
        public static new InstallationTemplatePartitionSchemeHardwareRaidArgs Empty => new InstallationTemplatePartitionSchemeHardwareRaidArgs();
    }

    public sealed class InstallationTemplatePartitionSchemeHardwareRaidState : global::Pulumi.ResourceArgs
    {
        [Input("disks")]
        private InputList<string>? _disks;

        /// <summary>
        /// Disk List. Syntax is cX:dY for disks and [cX:dY,cX:dY] for groups. With X and Y resp. the controller id and the disk id.
        /// </summary>
        public InputList<string> Disks
        {
            get => _disks ?? (_disks = new InputList<string>());
            set => _disks = value;
        }

        /// <summary>
        /// RAID mode (raid0, raid1, raid10, raid5, raid50, raid6, raid60).
        /// </summary>
        [Input("mode")]
        public Input<string>? Mode { get; set; }

        /// <summary>
        /// Hardware RAID name.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The partition scheme name.
        /// </summary>
        [Input("schemeName")]
        public Input<string>? SchemeName { get; set; }

        /// <summary>
        /// Specifies the creation order of the hardware RAID.
        /// </summary>
        [Input("step")]
        public Input<int>? Step { get; set; }

        /// <summary>
        /// The template name of the partition scheme.
        /// </summary>
        [Input("templateName")]
        public Input<string>? TemplateName { get; set; }

        public InstallationTemplatePartitionSchemeHardwareRaidState()
        {
        }
        public static new InstallationTemplatePartitionSchemeHardwareRaidState Empty => new InstallationTemplatePartitionSchemeHardwareRaidState();
    }
}
