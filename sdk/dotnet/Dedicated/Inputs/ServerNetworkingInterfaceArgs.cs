// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Ovh.Dedicated.Inputs
{

    public sealed class ServerNetworkingInterfaceArgs : global::Pulumi.ResourceArgs
    {
        [Input("macs", required: true)]
        private InputList<string>? _macs;

        /// <summary>
        /// Interface Mac address
        /// </summary>
        public InputList<string> Macs
        {
            get => _macs ?? (_macs = new InputList<string>());
            set => _macs = value;
        }

        /// <summary>
        /// Interface type
        /// </summary>
        [Input("type", required: true)]
        public Input<string> Type { get; set; } = null!;

        public ServerNetworkingInterfaceArgs()
        {
        }
        public static new ServerNetworkingInterfaceArgs Empty => new ServerNetworkingInterfaceArgs();
    }
}
