// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package cloud

import (
	"context"
	"reflect"

	"github.com/ovh/pulumi-ovh/sdk/go/ovh/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Get the details of your public cloud projects.
//
// ## Example Usage
//
// <!--Start PulumiCodeChooser -->
// ```go
// package main
//
// import (
//
//	"github.com/ovh/pulumi-ovh/sdk/go/ovh/Cloud"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := Cloud.GetProjects(ctx, nil, nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
// <!--End PulumiCodeChooser -->
func GetProjects(ctx *pulumi.Context, opts ...pulumi.InvokeOption) (*GetProjectsResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetProjectsResult
	err := ctx.Invoke("ovh:Cloud/getProjects:getProjects", nil, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of values returned by getProjects.
type GetProjectsResult struct {
	// The provider-assigned unique ID for this managed resource.
	Id       string               `pulumi:"id"`
	Projects []GetProjectsProject `pulumi:"projects"`
}

func GetProjectsOutput(ctx *pulumi.Context, opts ...pulumi.InvokeOption) GetProjectsResultOutput {
	return pulumi.ToOutput(0).ApplyT(func(int) (GetProjectsResult, error) {
		r, err := GetProjects(ctx, opts...)
		var s GetProjectsResult
		if r != nil {
			s = *r
		}
		return s, err
	}).(GetProjectsResultOutput)
}

// A collection of values returned by getProjects.
type GetProjectsResultOutput struct{ *pulumi.OutputState }

func (GetProjectsResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetProjectsResult)(nil)).Elem()
}

func (o GetProjectsResultOutput) ToGetProjectsResultOutput() GetProjectsResultOutput {
	return o
}

func (o GetProjectsResultOutput) ToGetProjectsResultOutputWithContext(ctx context.Context) GetProjectsResultOutput {
	return o
}

// The provider-assigned unique ID for this managed resource.
func (o GetProjectsResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetProjectsResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o GetProjectsResultOutput) Projects() GetProjectsProjectArrayOutput {
	return o.ApplyT(func(v GetProjectsResult) []GetProjectsProject { return v.Projects }).(GetProjectsProjectArrayOutput)
}

func init() {
	pulumi.RegisterOutputType(GetProjectsResultOutput{})
}