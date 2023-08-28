// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package ovh

import (
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
	"github.com/scraly/pulumi-ovh/sdk/go/ovh/internal"
)

// Use this data source to get the list of installation templates available for dedicated servers.
//
// ## Example Usage
func GetInstallationTemplates(ctx *pulumi.Context, opts ...pulumi.InvokeOption) (*GetInstallationTemplatesResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetInstallationTemplatesResult
	err := ctx.Invoke("ovh:index/getInstallationTemplates:getInstallationTemplates", nil, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of values returned by getInstallationTemplates.
type GetInstallationTemplatesResult struct {
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// The list of installation templates IDs available for dedicated servers.
	Results []string `pulumi:"results"`
}
