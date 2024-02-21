// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package cloudproject

import (
	"context"
	"reflect"

	"errors"
	"github.com/ovh/pulumi-ovh/sdk/go/ovh/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// ## Import
//
// Cloud project can be imported using the `order_id` that can be retrieved in the [order page](https://www.ovh.com/manager/#/dedicated/billing/orders/orders) at the creation time of the Public Cloud project.
//
//	bash
//
// ```sh
// $ pulumi import ovh:CloudProject/project:Project my_cloud_project order_id
// ```
type Project struct {
	pulumi.CustomResourceState

	// The URN of the cloud project
	ProjectURN pulumi.StringOutput `pulumi:"ProjectURN"`
	Access     pulumi.StringOutput `pulumi:"access"`
	// A description associated with the user.
	Description pulumi.StringOutput `pulumi:"description"`
	// Details about the order that was used to create the public cloud project
	Orders ProjectOrderArrayOutput `pulumi:"orders"`
	// OVHcloud Subsidiary. Country of OVHcloud legal entity you'll be billed by. List of supported subsidiaries available on API at [/1.0/me.json under `models.nichandle.OvhSubsidiaryEnum`](https://eu.api.ovh.com/1.0/me.json)
	OvhSubsidiary pulumi.StringOutput `pulumi:"ovhSubsidiary"`
	// Ovh payment mode
	//
	// Deprecated: This field is not anymore used since the API has been deprecated in favor of /payment/mean. Now, the default payment mean is used.
	PaymentMean pulumi.StringPtrOutput `pulumi:"paymentMean"`
	// Product Plan to order
	Plan ProjectPlanOutput `pulumi:"plan"`
	// Product Plan to order
	PlanOptions ProjectPlanOptionArrayOutput `pulumi:"planOptions"`
	// openstack project id
	ProjectId pulumi.StringOutput `pulumi:"projectId"`
	// openstack project name
	ProjectName pulumi.StringOutput `pulumi:"projectName"`
	// project status
	Status pulumi.StringOutput `pulumi:"status"`
}

// NewProject registers a new resource with the given unique name, arguments, and options.
func NewProject(ctx *pulumi.Context,
	name string, args *ProjectArgs, opts ...pulumi.ResourceOption) (*Project, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.OvhSubsidiary == nil {
		return nil, errors.New("invalid value for required argument 'OvhSubsidiary'")
	}
	if args.Plan == nil {
		return nil, errors.New("invalid value for required argument 'Plan'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource Project
	err := ctx.RegisterResource("ovh:CloudProject/project:Project", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetProject gets an existing Project resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetProject(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *ProjectState, opts ...pulumi.ResourceOption) (*Project, error) {
	var resource Project
	err := ctx.ReadResource("ovh:CloudProject/project:Project", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Project resources.
type projectState struct {
	// The URN of the cloud project
	ProjectURN *string `pulumi:"ProjectURN"`
	Access     *string `pulumi:"access"`
	// A description associated with the user.
	Description *string `pulumi:"description"`
	// Details about the order that was used to create the public cloud project
	Orders []ProjectOrder `pulumi:"orders"`
	// OVHcloud Subsidiary. Country of OVHcloud legal entity you'll be billed by. List of supported subsidiaries available on API at [/1.0/me.json under `models.nichandle.OvhSubsidiaryEnum`](https://eu.api.ovh.com/1.0/me.json)
	OvhSubsidiary *string `pulumi:"ovhSubsidiary"`
	// Ovh payment mode
	//
	// Deprecated: This field is not anymore used since the API has been deprecated in favor of /payment/mean. Now, the default payment mean is used.
	PaymentMean *string `pulumi:"paymentMean"`
	// Product Plan to order
	Plan *ProjectPlan `pulumi:"plan"`
	// Product Plan to order
	PlanOptions []ProjectPlanOption `pulumi:"planOptions"`
	// openstack project id
	ProjectId *string `pulumi:"projectId"`
	// openstack project name
	ProjectName *string `pulumi:"projectName"`
	// project status
	Status *string `pulumi:"status"`
}

type ProjectState struct {
	// The URN of the cloud project
	ProjectURN pulumi.StringPtrInput
	Access     pulumi.StringPtrInput
	// A description associated with the user.
	Description pulumi.StringPtrInput
	// Details about the order that was used to create the public cloud project
	Orders ProjectOrderArrayInput
	// OVHcloud Subsidiary. Country of OVHcloud legal entity you'll be billed by. List of supported subsidiaries available on API at [/1.0/me.json under `models.nichandle.OvhSubsidiaryEnum`](https://eu.api.ovh.com/1.0/me.json)
	OvhSubsidiary pulumi.StringPtrInput
	// Ovh payment mode
	//
	// Deprecated: This field is not anymore used since the API has been deprecated in favor of /payment/mean. Now, the default payment mean is used.
	PaymentMean pulumi.StringPtrInput
	// Product Plan to order
	Plan ProjectPlanPtrInput
	// Product Plan to order
	PlanOptions ProjectPlanOptionArrayInput
	// openstack project id
	ProjectId pulumi.StringPtrInput
	// openstack project name
	ProjectName pulumi.StringPtrInput
	// project status
	Status pulumi.StringPtrInput
}

func (ProjectState) ElementType() reflect.Type {
	return reflect.TypeOf((*projectState)(nil)).Elem()
}

type projectArgs struct {
	// A description associated with the user.
	Description *string `pulumi:"description"`
	// OVHcloud Subsidiary. Country of OVHcloud legal entity you'll be billed by. List of supported subsidiaries available on API at [/1.0/me.json under `models.nichandle.OvhSubsidiaryEnum`](https://eu.api.ovh.com/1.0/me.json)
	OvhSubsidiary string `pulumi:"ovhSubsidiary"`
	// Ovh payment mode
	//
	// Deprecated: This field is not anymore used since the API has been deprecated in favor of /payment/mean. Now, the default payment mean is used.
	PaymentMean *string `pulumi:"paymentMean"`
	// Product Plan to order
	Plan ProjectPlan `pulumi:"plan"`
	// Product Plan to order
	PlanOptions []ProjectPlanOption `pulumi:"planOptions"`
}

// The set of arguments for constructing a Project resource.
type ProjectArgs struct {
	// A description associated with the user.
	Description pulumi.StringPtrInput
	// OVHcloud Subsidiary. Country of OVHcloud legal entity you'll be billed by. List of supported subsidiaries available on API at [/1.0/me.json under `models.nichandle.OvhSubsidiaryEnum`](https://eu.api.ovh.com/1.0/me.json)
	OvhSubsidiary pulumi.StringInput
	// Ovh payment mode
	//
	// Deprecated: This field is not anymore used since the API has been deprecated in favor of /payment/mean. Now, the default payment mean is used.
	PaymentMean pulumi.StringPtrInput
	// Product Plan to order
	Plan ProjectPlanInput
	// Product Plan to order
	PlanOptions ProjectPlanOptionArrayInput
}

func (ProjectArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*projectArgs)(nil)).Elem()
}

type ProjectInput interface {
	pulumi.Input

	ToProjectOutput() ProjectOutput
	ToProjectOutputWithContext(ctx context.Context) ProjectOutput
}

func (*Project) ElementType() reflect.Type {
	return reflect.TypeOf((**Project)(nil)).Elem()
}

func (i *Project) ToProjectOutput() ProjectOutput {
	return i.ToProjectOutputWithContext(context.Background())
}

func (i *Project) ToProjectOutputWithContext(ctx context.Context) ProjectOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ProjectOutput)
}

// ProjectArrayInput is an input type that accepts ProjectArray and ProjectArrayOutput values.
// You can construct a concrete instance of `ProjectArrayInput` via:
//
//	ProjectArray{ ProjectArgs{...} }
type ProjectArrayInput interface {
	pulumi.Input

	ToProjectArrayOutput() ProjectArrayOutput
	ToProjectArrayOutputWithContext(context.Context) ProjectArrayOutput
}

type ProjectArray []ProjectInput

func (ProjectArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Project)(nil)).Elem()
}

func (i ProjectArray) ToProjectArrayOutput() ProjectArrayOutput {
	return i.ToProjectArrayOutputWithContext(context.Background())
}

func (i ProjectArray) ToProjectArrayOutputWithContext(ctx context.Context) ProjectArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ProjectArrayOutput)
}

// ProjectMapInput is an input type that accepts ProjectMap and ProjectMapOutput values.
// You can construct a concrete instance of `ProjectMapInput` via:
//
//	ProjectMap{ "key": ProjectArgs{...} }
type ProjectMapInput interface {
	pulumi.Input

	ToProjectMapOutput() ProjectMapOutput
	ToProjectMapOutputWithContext(context.Context) ProjectMapOutput
}

type ProjectMap map[string]ProjectInput

func (ProjectMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Project)(nil)).Elem()
}

func (i ProjectMap) ToProjectMapOutput() ProjectMapOutput {
	return i.ToProjectMapOutputWithContext(context.Background())
}

func (i ProjectMap) ToProjectMapOutputWithContext(ctx context.Context) ProjectMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ProjectMapOutput)
}

type ProjectOutput struct{ *pulumi.OutputState }

func (ProjectOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Project)(nil)).Elem()
}

func (o ProjectOutput) ToProjectOutput() ProjectOutput {
	return o
}

func (o ProjectOutput) ToProjectOutputWithContext(ctx context.Context) ProjectOutput {
	return o
}

// The URN of the cloud project
func (o ProjectOutput) ProjectURN() pulumi.StringOutput {
	return o.ApplyT(func(v *Project) pulumi.StringOutput { return v.ProjectURN }).(pulumi.StringOutput)
}

func (o ProjectOutput) Access() pulumi.StringOutput {
	return o.ApplyT(func(v *Project) pulumi.StringOutput { return v.Access }).(pulumi.StringOutput)
}

// A description associated with the user.
func (o ProjectOutput) Description() pulumi.StringOutput {
	return o.ApplyT(func(v *Project) pulumi.StringOutput { return v.Description }).(pulumi.StringOutput)
}

// Details about the order that was used to create the public cloud project
func (o ProjectOutput) Orders() ProjectOrderArrayOutput {
	return o.ApplyT(func(v *Project) ProjectOrderArrayOutput { return v.Orders }).(ProjectOrderArrayOutput)
}

// OVHcloud Subsidiary. Country of OVHcloud legal entity you'll be billed by. List of supported subsidiaries available on API at [/1.0/me.json under `models.nichandle.OvhSubsidiaryEnum`](https://eu.api.ovh.com/1.0/me.json)
func (o ProjectOutput) OvhSubsidiary() pulumi.StringOutput {
	return o.ApplyT(func(v *Project) pulumi.StringOutput { return v.OvhSubsidiary }).(pulumi.StringOutput)
}

// Ovh payment mode
//
// Deprecated: This field is not anymore used since the API has been deprecated in favor of /payment/mean. Now, the default payment mean is used.
func (o ProjectOutput) PaymentMean() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Project) pulumi.StringPtrOutput { return v.PaymentMean }).(pulumi.StringPtrOutput)
}

// Product Plan to order
func (o ProjectOutput) Plan() ProjectPlanOutput {
	return o.ApplyT(func(v *Project) ProjectPlanOutput { return v.Plan }).(ProjectPlanOutput)
}

// Product Plan to order
func (o ProjectOutput) PlanOptions() ProjectPlanOptionArrayOutput {
	return o.ApplyT(func(v *Project) ProjectPlanOptionArrayOutput { return v.PlanOptions }).(ProjectPlanOptionArrayOutput)
}

// openstack project id
func (o ProjectOutput) ProjectId() pulumi.StringOutput {
	return o.ApplyT(func(v *Project) pulumi.StringOutput { return v.ProjectId }).(pulumi.StringOutput)
}

// openstack project name
func (o ProjectOutput) ProjectName() pulumi.StringOutput {
	return o.ApplyT(func(v *Project) pulumi.StringOutput { return v.ProjectName }).(pulumi.StringOutput)
}

// project status
func (o ProjectOutput) Status() pulumi.StringOutput {
	return o.ApplyT(func(v *Project) pulumi.StringOutput { return v.Status }).(pulumi.StringOutput)
}

type ProjectArrayOutput struct{ *pulumi.OutputState }

func (ProjectArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Project)(nil)).Elem()
}

func (o ProjectArrayOutput) ToProjectArrayOutput() ProjectArrayOutput {
	return o
}

func (o ProjectArrayOutput) ToProjectArrayOutputWithContext(ctx context.Context) ProjectArrayOutput {
	return o
}

func (o ProjectArrayOutput) Index(i pulumi.IntInput) ProjectOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *Project {
		return vs[0].([]*Project)[vs[1].(int)]
	}).(ProjectOutput)
}

type ProjectMapOutput struct{ *pulumi.OutputState }

func (ProjectMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Project)(nil)).Elem()
}

func (o ProjectMapOutput) ToProjectMapOutput() ProjectMapOutput {
	return o
}

func (o ProjectMapOutput) ToProjectMapOutputWithContext(ctx context.Context) ProjectMapOutput {
	return o
}

func (o ProjectMapOutput) MapIndex(k pulumi.StringInput) ProjectOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *Project {
		return vs[0].(map[string]*Project)[vs[1].(string)]
	}).(ProjectOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*ProjectInput)(nil)).Elem(), &Project{})
	pulumi.RegisterInputType(reflect.TypeOf((*ProjectArrayInput)(nil)).Elem(), ProjectArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*ProjectMapInput)(nil)).Elem(), ProjectMap{})
	pulumi.RegisterOutputType(ProjectOutput{})
	pulumi.RegisterOutputType(ProjectArrayOutput{})
	pulumi.RegisterOutputType(ProjectMapOutput{})
}
