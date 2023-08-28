// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package cloudproject

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
	"github.com/scraly/pulumi-ovh/sdk/go/ovh/internal"
)

// Manage a worflow that schedules backups of public cloud instance.
// Note that upon deletion, the workflow is deleted but any backups that have been created by this workflow are not.
//
// ## Example Usage
type WorkflowBackup struct {
	pulumi.CustomResourceState

	// The name of the backup files that are created. If empty, the `name` attribute is used.
	BackupName pulumi.StringOutput `pulumi:"backupName"`
	CreatedAt  pulumi.StringOutput `pulumi:"createdAt"`
	// The cron periodicity at which the backup workflow is scheduled
	Cron       pulumi.StringOutput `pulumi:"cron"`
	InstanceId pulumi.StringOutput `pulumi:"instanceId"`
	// The number of times the worflow is run. Default value is `0` which means that the workflow will be scheduled continously until its deletion
	MaxExecutionCount pulumi.IntPtrOutput `pulumi:"maxExecutionCount"`
	// The worflow name that is used in the UI
	Name pulumi.StringOutput `pulumi:"name"`
	// The name of the openstack region.
	RegionName pulumi.StringOutput `pulumi:"regionName"`
	// The number of backup that are retained.
	Rotation pulumi.IntOutput `pulumi:"rotation"`
	// The id of the public cloud project. If omitted, the `OVH_CLOUD_PROJECT_SERVICE` environment variable is used.
	ServiceName pulumi.StringOutput `pulumi:"serviceName"`
}

// NewWorkflowBackup registers a new resource with the given unique name, arguments, and options.
func NewWorkflowBackup(ctx *pulumi.Context,
	name string, args *WorkflowBackupArgs, opts ...pulumi.ResourceOption) (*WorkflowBackup, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Cron == nil {
		return nil, errors.New("invalid value for required argument 'Cron'")
	}
	if args.InstanceId == nil {
		return nil, errors.New("invalid value for required argument 'InstanceId'")
	}
	if args.RegionName == nil {
		return nil, errors.New("invalid value for required argument 'RegionName'")
	}
	if args.Rotation == nil {
		return nil, errors.New("invalid value for required argument 'Rotation'")
	}
	if args.ServiceName == nil {
		return nil, errors.New("invalid value for required argument 'ServiceName'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource WorkflowBackup
	err := ctx.RegisterResource("ovh:CloudProject/workflowBackup:WorkflowBackup", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetWorkflowBackup gets an existing WorkflowBackup resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetWorkflowBackup(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *WorkflowBackupState, opts ...pulumi.ResourceOption) (*WorkflowBackup, error) {
	var resource WorkflowBackup
	err := ctx.ReadResource("ovh:CloudProject/workflowBackup:WorkflowBackup", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering WorkflowBackup resources.
type workflowBackupState struct {
	// The name of the backup files that are created. If empty, the `name` attribute is used.
	BackupName *string `pulumi:"backupName"`
	CreatedAt  *string `pulumi:"createdAt"`
	// The cron periodicity at which the backup workflow is scheduled
	Cron       *string `pulumi:"cron"`
	InstanceId *string `pulumi:"instanceId"`
	// The number of times the worflow is run. Default value is `0` which means that the workflow will be scheduled continously until its deletion
	MaxExecutionCount *int `pulumi:"maxExecutionCount"`
	// The worflow name that is used in the UI
	Name *string `pulumi:"name"`
	// The name of the openstack region.
	RegionName *string `pulumi:"regionName"`
	// The number of backup that are retained.
	Rotation *int `pulumi:"rotation"`
	// The id of the public cloud project. If omitted, the `OVH_CLOUD_PROJECT_SERVICE` environment variable is used.
	ServiceName *string `pulumi:"serviceName"`
}

type WorkflowBackupState struct {
	// The name of the backup files that are created. If empty, the `name` attribute is used.
	BackupName pulumi.StringPtrInput
	CreatedAt  pulumi.StringPtrInput
	// The cron periodicity at which the backup workflow is scheduled
	Cron       pulumi.StringPtrInput
	InstanceId pulumi.StringPtrInput
	// The number of times the worflow is run. Default value is `0` which means that the workflow will be scheduled continously until its deletion
	MaxExecutionCount pulumi.IntPtrInput
	// The worflow name that is used in the UI
	Name pulumi.StringPtrInput
	// The name of the openstack region.
	RegionName pulumi.StringPtrInput
	// The number of backup that are retained.
	Rotation pulumi.IntPtrInput
	// The id of the public cloud project. If omitted, the `OVH_CLOUD_PROJECT_SERVICE` environment variable is used.
	ServiceName pulumi.StringPtrInput
}

func (WorkflowBackupState) ElementType() reflect.Type {
	return reflect.TypeOf((*workflowBackupState)(nil)).Elem()
}

type workflowBackupArgs struct {
	// The name of the backup files that are created. If empty, the `name` attribute is used.
	BackupName *string `pulumi:"backupName"`
	// The cron periodicity at which the backup workflow is scheduled
	Cron       string `pulumi:"cron"`
	InstanceId string `pulumi:"instanceId"`
	// The number of times the worflow is run. Default value is `0` which means that the workflow will be scheduled continously until its deletion
	MaxExecutionCount *int `pulumi:"maxExecutionCount"`
	// The worflow name that is used in the UI
	Name *string `pulumi:"name"`
	// The name of the openstack region.
	RegionName string `pulumi:"regionName"`
	// The number of backup that are retained.
	Rotation int `pulumi:"rotation"`
	// The id of the public cloud project. If omitted, the `OVH_CLOUD_PROJECT_SERVICE` environment variable is used.
	ServiceName string `pulumi:"serviceName"`
}

// The set of arguments for constructing a WorkflowBackup resource.
type WorkflowBackupArgs struct {
	// The name of the backup files that are created. If empty, the `name` attribute is used.
	BackupName pulumi.StringPtrInput
	// The cron periodicity at which the backup workflow is scheduled
	Cron       pulumi.StringInput
	InstanceId pulumi.StringInput
	// The number of times the worflow is run. Default value is `0` which means that the workflow will be scheduled continously until its deletion
	MaxExecutionCount pulumi.IntPtrInput
	// The worflow name that is used in the UI
	Name pulumi.StringPtrInput
	// The name of the openstack region.
	RegionName pulumi.StringInput
	// The number of backup that are retained.
	Rotation pulumi.IntInput
	// The id of the public cloud project. If omitted, the `OVH_CLOUD_PROJECT_SERVICE` environment variable is used.
	ServiceName pulumi.StringInput
}

func (WorkflowBackupArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*workflowBackupArgs)(nil)).Elem()
}

type WorkflowBackupInput interface {
	pulumi.Input

	ToWorkflowBackupOutput() WorkflowBackupOutput
	ToWorkflowBackupOutputWithContext(ctx context.Context) WorkflowBackupOutput
}

func (*WorkflowBackup) ElementType() reflect.Type {
	return reflect.TypeOf((**WorkflowBackup)(nil)).Elem()
}

func (i *WorkflowBackup) ToWorkflowBackupOutput() WorkflowBackupOutput {
	return i.ToWorkflowBackupOutputWithContext(context.Background())
}

func (i *WorkflowBackup) ToWorkflowBackupOutputWithContext(ctx context.Context) WorkflowBackupOutput {
	return pulumi.ToOutputWithContext(ctx, i).(WorkflowBackupOutput)
}

// WorkflowBackupArrayInput is an input type that accepts WorkflowBackupArray and WorkflowBackupArrayOutput values.
// You can construct a concrete instance of `WorkflowBackupArrayInput` via:
//
//	WorkflowBackupArray{ WorkflowBackupArgs{...} }
type WorkflowBackupArrayInput interface {
	pulumi.Input

	ToWorkflowBackupArrayOutput() WorkflowBackupArrayOutput
	ToWorkflowBackupArrayOutputWithContext(context.Context) WorkflowBackupArrayOutput
}

type WorkflowBackupArray []WorkflowBackupInput

func (WorkflowBackupArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*WorkflowBackup)(nil)).Elem()
}

func (i WorkflowBackupArray) ToWorkflowBackupArrayOutput() WorkflowBackupArrayOutput {
	return i.ToWorkflowBackupArrayOutputWithContext(context.Background())
}

func (i WorkflowBackupArray) ToWorkflowBackupArrayOutputWithContext(ctx context.Context) WorkflowBackupArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(WorkflowBackupArrayOutput)
}

// WorkflowBackupMapInput is an input type that accepts WorkflowBackupMap and WorkflowBackupMapOutput values.
// You can construct a concrete instance of `WorkflowBackupMapInput` via:
//
//	WorkflowBackupMap{ "key": WorkflowBackupArgs{...} }
type WorkflowBackupMapInput interface {
	pulumi.Input

	ToWorkflowBackupMapOutput() WorkflowBackupMapOutput
	ToWorkflowBackupMapOutputWithContext(context.Context) WorkflowBackupMapOutput
}

type WorkflowBackupMap map[string]WorkflowBackupInput

func (WorkflowBackupMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*WorkflowBackup)(nil)).Elem()
}

func (i WorkflowBackupMap) ToWorkflowBackupMapOutput() WorkflowBackupMapOutput {
	return i.ToWorkflowBackupMapOutputWithContext(context.Background())
}

func (i WorkflowBackupMap) ToWorkflowBackupMapOutputWithContext(ctx context.Context) WorkflowBackupMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(WorkflowBackupMapOutput)
}

type WorkflowBackupOutput struct{ *pulumi.OutputState }

func (WorkflowBackupOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**WorkflowBackup)(nil)).Elem()
}

func (o WorkflowBackupOutput) ToWorkflowBackupOutput() WorkflowBackupOutput {
	return o
}

func (o WorkflowBackupOutput) ToWorkflowBackupOutputWithContext(ctx context.Context) WorkflowBackupOutput {
	return o
}

// The name of the backup files that are created. If empty, the `name` attribute is used.
func (o WorkflowBackupOutput) BackupName() pulumi.StringOutput {
	return o.ApplyT(func(v *WorkflowBackup) pulumi.StringOutput { return v.BackupName }).(pulumi.StringOutput)
}

func (o WorkflowBackupOutput) CreatedAt() pulumi.StringOutput {
	return o.ApplyT(func(v *WorkflowBackup) pulumi.StringOutput { return v.CreatedAt }).(pulumi.StringOutput)
}

// The cron periodicity at which the backup workflow is scheduled
func (o WorkflowBackupOutput) Cron() pulumi.StringOutput {
	return o.ApplyT(func(v *WorkflowBackup) pulumi.StringOutput { return v.Cron }).(pulumi.StringOutput)
}

func (o WorkflowBackupOutput) InstanceId() pulumi.StringOutput {
	return o.ApplyT(func(v *WorkflowBackup) pulumi.StringOutput { return v.InstanceId }).(pulumi.StringOutput)
}

// The number of times the worflow is run. Default value is `0` which means that the workflow will be scheduled continously until its deletion
func (o WorkflowBackupOutput) MaxExecutionCount() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *WorkflowBackup) pulumi.IntPtrOutput { return v.MaxExecutionCount }).(pulumi.IntPtrOutput)
}

// The worflow name that is used in the UI
func (o WorkflowBackupOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *WorkflowBackup) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// The name of the openstack region.
func (o WorkflowBackupOutput) RegionName() pulumi.StringOutput {
	return o.ApplyT(func(v *WorkflowBackup) pulumi.StringOutput { return v.RegionName }).(pulumi.StringOutput)
}

// The number of backup that are retained.
func (o WorkflowBackupOutput) Rotation() pulumi.IntOutput {
	return o.ApplyT(func(v *WorkflowBackup) pulumi.IntOutput { return v.Rotation }).(pulumi.IntOutput)
}

// The id of the public cloud project. If omitted, the `OVH_CLOUD_PROJECT_SERVICE` environment variable is used.
func (o WorkflowBackupOutput) ServiceName() pulumi.StringOutput {
	return o.ApplyT(func(v *WorkflowBackup) pulumi.StringOutput { return v.ServiceName }).(pulumi.StringOutput)
}

type WorkflowBackupArrayOutput struct{ *pulumi.OutputState }

func (WorkflowBackupArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*WorkflowBackup)(nil)).Elem()
}

func (o WorkflowBackupArrayOutput) ToWorkflowBackupArrayOutput() WorkflowBackupArrayOutput {
	return o
}

func (o WorkflowBackupArrayOutput) ToWorkflowBackupArrayOutputWithContext(ctx context.Context) WorkflowBackupArrayOutput {
	return o
}

func (o WorkflowBackupArrayOutput) Index(i pulumi.IntInput) WorkflowBackupOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *WorkflowBackup {
		return vs[0].([]*WorkflowBackup)[vs[1].(int)]
	}).(WorkflowBackupOutput)
}

type WorkflowBackupMapOutput struct{ *pulumi.OutputState }

func (WorkflowBackupMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*WorkflowBackup)(nil)).Elem()
}

func (o WorkflowBackupMapOutput) ToWorkflowBackupMapOutput() WorkflowBackupMapOutput {
	return o
}

func (o WorkflowBackupMapOutput) ToWorkflowBackupMapOutputWithContext(ctx context.Context) WorkflowBackupMapOutput {
	return o
}

func (o WorkflowBackupMapOutput) MapIndex(k pulumi.StringInput) WorkflowBackupOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *WorkflowBackup {
		return vs[0].(map[string]*WorkflowBackup)[vs[1].(string)]
	}).(WorkflowBackupOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*WorkflowBackupInput)(nil)).Elem(), &WorkflowBackup{})
	pulumi.RegisterInputType(reflect.TypeOf((*WorkflowBackupArrayInput)(nil)).Elem(), WorkflowBackupArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*WorkflowBackupMapInput)(nil)).Elem(), WorkflowBackupMap{})
	pulumi.RegisterOutputType(WorkflowBackupOutput{})
	pulumi.RegisterOutputType(WorkflowBackupArrayOutput{})
	pulumi.RegisterOutputType(WorkflowBackupMapOutput{})
}
