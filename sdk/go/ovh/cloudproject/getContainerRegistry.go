// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package cloudproject

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
	"github.com/scraly/pulumi-ovh/sdk/go/ovh/internal"
)

// Use this data source to get information about a container registry associated with a public cloud project.
//
// ## Example Usage
func LookupContainerRegistry(ctx *pulumi.Context, args *LookupContainerRegistryArgs, opts ...pulumi.InvokeOption) (*LookupContainerRegistryResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupContainerRegistryResult
	err := ctx.Invoke("ovh:CloudProject/getContainerRegistry:getContainerRegistry", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getContainerRegistry.
type LookupContainerRegistryArgs struct {
	// Registry ID
	RegistryId string `pulumi:"registryId"`
	// The id of the public cloud project. If omitted,
	// the `OVH_CLOUD_PROJECT_SERVICE` environment variable is used.
	ServiceName string `pulumi:"serviceName"`
}

// A collection of values returned by getContainerRegistry.
type LookupContainerRegistryResult struct {
	// Registry creation date
	CreatedAt string `pulumi:"createdAt"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// Registry name
	Name string `pulumi:"name"`
	// Project ID of your registry
	ProjectId string `pulumi:"projectId"`
	// Region of the registry
	Region      string `pulumi:"region"`
	RegistryId  string `pulumi:"registryId"`
	ServiceName string `pulumi:"serviceName"`
	// Current size of the registry (bytes)
	Size int `pulumi:"size"`
	// Registry status
	Status string `pulumi:"status"`
	// Registry last update date
	UpdatedAt string `pulumi:"updatedAt"`
	// Access url of the registry
	Url string `pulumi:"url"`
	// Version of your registry
	Version string `pulumi:"version"`
}

func LookupContainerRegistryOutput(ctx *pulumi.Context, args LookupContainerRegistryOutputArgs, opts ...pulumi.InvokeOption) LookupContainerRegistryResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupContainerRegistryResult, error) {
			args := v.(LookupContainerRegistryArgs)
			r, err := LookupContainerRegistry(ctx, &args, opts...)
			var s LookupContainerRegistryResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(LookupContainerRegistryResultOutput)
}

// A collection of arguments for invoking getContainerRegistry.
type LookupContainerRegistryOutputArgs struct {
	// Registry ID
	RegistryId pulumi.StringInput `pulumi:"registryId"`
	// The id of the public cloud project. If omitted,
	// the `OVH_CLOUD_PROJECT_SERVICE` environment variable is used.
	ServiceName pulumi.StringInput `pulumi:"serviceName"`
}

func (LookupContainerRegistryOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupContainerRegistryArgs)(nil)).Elem()
}

// A collection of values returned by getContainerRegistry.
type LookupContainerRegistryResultOutput struct{ *pulumi.OutputState }

func (LookupContainerRegistryResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupContainerRegistryResult)(nil)).Elem()
}

func (o LookupContainerRegistryResultOutput) ToLookupContainerRegistryResultOutput() LookupContainerRegistryResultOutput {
	return o
}

func (o LookupContainerRegistryResultOutput) ToLookupContainerRegistryResultOutputWithContext(ctx context.Context) LookupContainerRegistryResultOutput {
	return o
}

// Registry creation date
func (o LookupContainerRegistryResultOutput) CreatedAt() pulumi.StringOutput {
	return o.ApplyT(func(v LookupContainerRegistryResult) string { return v.CreatedAt }).(pulumi.StringOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o LookupContainerRegistryResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupContainerRegistryResult) string { return v.Id }).(pulumi.StringOutput)
}

// Registry name
func (o LookupContainerRegistryResultOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v LookupContainerRegistryResult) string { return v.Name }).(pulumi.StringOutput)
}

// Project ID of your registry
func (o LookupContainerRegistryResultOutput) ProjectId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupContainerRegistryResult) string { return v.ProjectId }).(pulumi.StringOutput)
}

// Region of the registry
func (o LookupContainerRegistryResultOutput) Region() pulumi.StringOutput {
	return o.ApplyT(func(v LookupContainerRegistryResult) string { return v.Region }).(pulumi.StringOutput)
}

func (o LookupContainerRegistryResultOutput) RegistryId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupContainerRegistryResult) string { return v.RegistryId }).(pulumi.StringOutput)
}

func (o LookupContainerRegistryResultOutput) ServiceName() pulumi.StringOutput {
	return o.ApplyT(func(v LookupContainerRegistryResult) string { return v.ServiceName }).(pulumi.StringOutput)
}

// Current size of the registry (bytes)
func (o LookupContainerRegistryResultOutput) Size() pulumi.IntOutput {
	return o.ApplyT(func(v LookupContainerRegistryResult) int { return v.Size }).(pulumi.IntOutput)
}

// Registry status
func (o LookupContainerRegistryResultOutput) Status() pulumi.StringOutput {
	return o.ApplyT(func(v LookupContainerRegistryResult) string { return v.Status }).(pulumi.StringOutput)
}

// Registry last update date
func (o LookupContainerRegistryResultOutput) UpdatedAt() pulumi.StringOutput {
	return o.ApplyT(func(v LookupContainerRegistryResult) string { return v.UpdatedAt }).(pulumi.StringOutput)
}

// Access url of the registry
func (o LookupContainerRegistryResultOutput) Url() pulumi.StringOutput {
	return o.ApplyT(func(v LookupContainerRegistryResult) string { return v.Url }).(pulumi.StringOutput)
}

// Version of your registry
func (o LookupContainerRegistryResultOutput) Version() pulumi.StringOutput {
	return o.ApplyT(func(v LookupContainerRegistryResult) string { return v.Version }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupContainerRegistryResultOutput{})
}
