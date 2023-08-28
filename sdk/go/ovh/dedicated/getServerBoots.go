// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package dedicated

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
	"github.com/scraly/pulumi-ovh/sdk/go/ovh/internal"
)

// Use this data source to get the list of compatible netboots for a dedicated server associated with your OVHcloud Account.
//
// ## Example Usage
func GetServerBoots(ctx *pulumi.Context, args *GetServerBootsArgs, opts ...pulumi.InvokeOption) (*GetServerBootsResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetServerBootsResult
	err := ctx.Invoke("ovh:Dedicated/getServerBoots:getServerBoots", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getServerBoots.
type GetServerBootsArgs struct {
	// Filter the value of bootType property (harddisk, rescue, ipxeCustomerScript, internal, network)
	BootType *string `pulumi:"bootType"`
	Kernel   *string `pulumi:"kernel"`
	// The internal name of your dedicated server.
	ServiceName string `pulumi:"serviceName"`
}

// A collection of values returned by getServerBoots.
type GetServerBootsResult struct {
	BootType *string `pulumi:"bootType"`
	// The provider-assigned unique ID for this managed resource.
	Id     string  `pulumi:"id"`
	Kernel *string `pulumi:"kernel"`
	// The list of dedicated server netboots.
	Results     []int  `pulumi:"results"`
	ServiceName string `pulumi:"serviceName"`
}

func GetServerBootsOutput(ctx *pulumi.Context, args GetServerBootsOutputArgs, opts ...pulumi.InvokeOption) GetServerBootsResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetServerBootsResult, error) {
			args := v.(GetServerBootsArgs)
			r, err := GetServerBoots(ctx, &args, opts...)
			var s GetServerBootsResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(GetServerBootsResultOutput)
}

// A collection of arguments for invoking getServerBoots.
type GetServerBootsOutputArgs struct {
	// Filter the value of bootType property (harddisk, rescue, ipxeCustomerScript, internal, network)
	BootType pulumi.StringPtrInput `pulumi:"bootType"`
	Kernel   pulumi.StringPtrInput `pulumi:"kernel"`
	// The internal name of your dedicated server.
	ServiceName pulumi.StringInput `pulumi:"serviceName"`
}

func (GetServerBootsOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetServerBootsArgs)(nil)).Elem()
}

// A collection of values returned by getServerBoots.
type GetServerBootsResultOutput struct{ *pulumi.OutputState }

func (GetServerBootsResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetServerBootsResult)(nil)).Elem()
}

func (o GetServerBootsResultOutput) ToGetServerBootsResultOutput() GetServerBootsResultOutput {
	return o
}

func (o GetServerBootsResultOutput) ToGetServerBootsResultOutputWithContext(ctx context.Context) GetServerBootsResultOutput {
	return o
}

func (o GetServerBootsResultOutput) BootType() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetServerBootsResult) *string { return v.BootType }).(pulumi.StringPtrOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetServerBootsResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetServerBootsResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o GetServerBootsResultOutput) Kernel() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetServerBootsResult) *string { return v.Kernel }).(pulumi.StringPtrOutput)
}

// The list of dedicated server netboots.
func (o GetServerBootsResultOutput) Results() pulumi.IntArrayOutput {
	return o.ApplyT(func(v GetServerBootsResult) []int { return v.Results }).(pulumi.IntArrayOutput)
}

func (o GetServerBootsResultOutput) ServiceName() pulumi.StringOutput {
	return o.ApplyT(func(v GetServerBootsResult) string { return v.ServiceName }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(GetServerBootsResultOutput{})
}
