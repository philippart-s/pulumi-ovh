// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package dedicated

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
	"github.com/scraly/pulumi-ovh/sdk/go/ovh/internal"
)

// Provides a resource for managing **snapshot** to partitions on HA-NAS services
//
// ## Example Usage
//
// ## Import
//
// HA-NAS partition snapshot can be imported using the `{service_name}/{partition_name}/{type}`, e.g.   <break><break>```sh<break> $ pulumi import ovh:Dedicated/nasHAPartitionSnapshot:NasHAPartitionSnapshot my-partition zpool-12345/my-partition/day-3` <break>```<break><break>
type NasHAPartitionSnapshot struct {
	pulumi.CustomResourceState

	// name of the partition
	PartitionName pulumi.StringOutput `pulumi:"partitionName"`
	// The internal name of your HA-NAS (it has to be ordered via OVHcloud interface)
	ServiceName pulumi.StringOutput `pulumi:"serviceName"`
	// Snapshot interval, allowed : day-1, day-2, day-3, day-7, hour-1, hour-6
	Type pulumi.StringOutput `pulumi:"type"`
}

// NewNasHAPartitionSnapshot registers a new resource with the given unique name, arguments, and options.
func NewNasHAPartitionSnapshot(ctx *pulumi.Context,
	name string, args *NasHAPartitionSnapshotArgs, opts ...pulumi.ResourceOption) (*NasHAPartitionSnapshot, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.PartitionName == nil {
		return nil, errors.New("invalid value for required argument 'PartitionName'")
	}
	if args.ServiceName == nil {
		return nil, errors.New("invalid value for required argument 'ServiceName'")
	}
	if args.Type == nil {
		return nil, errors.New("invalid value for required argument 'Type'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource NasHAPartitionSnapshot
	err := ctx.RegisterResource("ovh:Dedicated/nasHAPartitionSnapshot:NasHAPartitionSnapshot", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetNasHAPartitionSnapshot gets an existing NasHAPartitionSnapshot resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetNasHAPartitionSnapshot(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *NasHAPartitionSnapshotState, opts ...pulumi.ResourceOption) (*NasHAPartitionSnapshot, error) {
	var resource NasHAPartitionSnapshot
	err := ctx.ReadResource("ovh:Dedicated/nasHAPartitionSnapshot:NasHAPartitionSnapshot", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering NasHAPartitionSnapshot resources.
type nasHAPartitionSnapshotState struct {
	// name of the partition
	PartitionName *string `pulumi:"partitionName"`
	// The internal name of your HA-NAS (it has to be ordered via OVHcloud interface)
	ServiceName *string `pulumi:"serviceName"`
	// Snapshot interval, allowed : day-1, day-2, day-3, day-7, hour-1, hour-6
	Type *string `pulumi:"type"`
}

type NasHAPartitionSnapshotState struct {
	// name of the partition
	PartitionName pulumi.StringPtrInput
	// The internal name of your HA-NAS (it has to be ordered via OVHcloud interface)
	ServiceName pulumi.StringPtrInput
	// Snapshot interval, allowed : day-1, day-2, day-3, day-7, hour-1, hour-6
	Type pulumi.StringPtrInput
}

func (NasHAPartitionSnapshotState) ElementType() reflect.Type {
	return reflect.TypeOf((*nasHAPartitionSnapshotState)(nil)).Elem()
}

type nasHAPartitionSnapshotArgs struct {
	// name of the partition
	PartitionName string `pulumi:"partitionName"`
	// The internal name of your HA-NAS (it has to be ordered via OVHcloud interface)
	ServiceName string `pulumi:"serviceName"`
	// Snapshot interval, allowed : day-1, day-2, day-3, day-7, hour-1, hour-6
	Type string `pulumi:"type"`
}

// The set of arguments for constructing a NasHAPartitionSnapshot resource.
type NasHAPartitionSnapshotArgs struct {
	// name of the partition
	PartitionName pulumi.StringInput
	// The internal name of your HA-NAS (it has to be ordered via OVHcloud interface)
	ServiceName pulumi.StringInput
	// Snapshot interval, allowed : day-1, day-2, day-3, day-7, hour-1, hour-6
	Type pulumi.StringInput
}

func (NasHAPartitionSnapshotArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*nasHAPartitionSnapshotArgs)(nil)).Elem()
}

type NasHAPartitionSnapshotInput interface {
	pulumi.Input

	ToNasHAPartitionSnapshotOutput() NasHAPartitionSnapshotOutput
	ToNasHAPartitionSnapshotOutputWithContext(ctx context.Context) NasHAPartitionSnapshotOutput
}

func (*NasHAPartitionSnapshot) ElementType() reflect.Type {
	return reflect.TypeOf((**NasHAPartitionSnapshot)(nil)).Elem()
}

func (i *NasHAPartitionSnapshot) ToNasHAPartitionSnapshotOutput() NasHAPartitionSnapshotOutput {
	return i.ToNasHAPartitionSnapshotOutputWithContext(context.Background())
}

func (i *NasHAPartitionSnapshot) ToNasHAPartitionSnapshotOutputWithContext(ctx context.Context) NasHAPartitionSnapshotOutput {
	return pulumi.ToOutputWithContext(ctx, i).(NasHAPartitionSnapshotOutput)
}

// NasHAPartitionSnapshotArrayInput is an input type that accepts NasHAPartitionSnapshotArray and NasHAPartitionSnapshotArrayOutput values.
// You can construct a concrete instance of `NasHAPartitionSnapshotArrayInput` via:
//
//	NasHAPartitionSnapshotArray{ NasHAPartitionSnapshotArgs{...} }
type NasHAPartitionSnapshotArrayInput interface {
	pulumi.Input

	ToNasHAPartitionSnapshotArrayOutput() NasHAPartitionSnapshotArrayOutput
	ToNasHAPartitionSnapshotArrayOutputWithContext(context.Context) NasHAPartitionSnapshotArrayOutput
}

type NasHAPartitionSnapshotArray []NasHAPartitionSnapshotInput

func (NasHAPartitionSnapshotArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*NasHAPartitionSnapshot)(nil)).Elem()
}

func (i NasHAPartitionSnapshotArray) ToNasHAPartitionSnapshotArrayOutput() NasHAPartitionSnapshotArrayOutput {
	return i.ToNasHAPartitionSnapshotArrayOutputWithContext(context.Background())
}

func (i NasHAPartitionSnapshotArray) ToNasHAPartitionSnapshotArrayOutputWithContext(ctx context.Context) NasHAPartitionSnapshotArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(NasHAPartitionSnapshotArrayOutput)
}

// NasHAPartitionSnapshotMapInput is an input type that accepts NasHAPartitionSnapshotMap and NasHAPartitionSnapshotMapOutput values.
// You can construct a concrete instance of `NasHAPartitionSnapshotMapInput` via:
//
//	NasHAPartitionSnapshotMap{ "key": NasHAPartitionSnapshotArgs{...} }
type NasHAPartitionSnapshotMapInput interface {
	pulumi.Input

	ToNasHAPartitionSnapshotMapOutput() NasHAPartitionSnapshotMapOutput
	ToNasHAPartitionSnapshotMapOutputWithContext(context.Context) NasHAPartitionSnapshotMapOutput
}

type NasHAPartitionSnapshotMap map[string]NasHAPartitionSnapshotInput

func (NasHAPartitionSnapshotMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*NasHAPartitionSnapshot)(nil)).Elem()
}

func (i NasHAPartitionSnapshotMap) ToNasHAPartitionSnapshotMapOutput() NasHAPartitionSnapshotMapOutput {
	return i.ToNasHAPartitionSnapshotMapOutputWithContext(context.Background())
}

func (i NasHAPartitionSnapshotMap) ToNasHAPartitionSnapshotMapOutputWithContext(ctx context.Context) NasHAPartitionSnapshotMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(NasHAPartitionSnapshotMapOutput)
}

type NasHAPartitionSnapshotOutput struct{ *pulumi.OutputState }

func (NasHAPartitionSnapshotOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**NasHAPartitionSnapshot)(nil)).Elem()
}

func (o NasHAPartitionSnapshotOutput) ToNasHAPartitionSnapshotOutput() NasHAPartitionSnapshotOutput {
	return o
}

func (o NasHAPartitionSnapshotOutput) ToNasHAPartitionSnapshotOutputWithContext(ctx context.Context) NasHAPartitionSnapshotOutput {
	return o
}

// name of the partition
func (o NasHAPartitionSnapshotOutput) PartitionName() pulumi.StringOutput {
	return o.ApplyT(func(v *NasHAPartitionSnapshot) pulumi.StringOutput { return v.PartitionName }).(pulumi.StringOutput)
}

// The internal name of your HA-NAS (it has to be ordered via OVHcloud interface)
func (o NasHAPartitionSnapshotOutput) ServiceName() pulumi.StringOutput {
	return o.ApplyT(func(v *NasHAPartitionSnapshot) pulumi.StringOutput { return v.ServiceName }).(pulumi.StringOutput)
}

// Snapshot interval, allowed : day-1, day-2, day-3, day-7, hour-1, hour-6
func (o NasHAPartitionSnapshotOutput) Type() pulumi.StringOutput {
	return o.ApplyT(func(v *NasHAPartitionSnapshot) pulumi.StringOutput { return v.Type }).(pulumi.StringOutput)
}

type NasHAPartitionSnapshotArrayOutput struct{ *pulumi.OutputState }

func (NasHAPartitionSnapshotArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*NasHAPartitionSnapshot)(nil)).Elem()
}

func (o NasHAPartitionSnapshotArrayOutput) ToNasHAPartitionSnapshotArrayOutput() NasHAPartitionSnapshotArrayOutput {
	return o
}

func (o NasHAPartitionSnapshotArrayOutput) ToNasHAPartitionSnapshotArrayOutputWithContext(ctx context.Context) NasHAPartitionSnapshotArrayOutput {
	return o
}

func (o NasHAPartitionSnapshotArrayOutput) Index(i pulumi.IntInput) NasHAPartitionSnapshotOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *NasHAPartitionSnapshot {
		return vs[0].([]*NasHAPartitionSnapshot)[vs[1].(int)]
	}).(NasHAPartitionSnapshotOutput)
}

type NasHAPartitionSnapshotMapOutput struct{ *pulumi.OutputState }

func (NasHAPartitionSnapshotMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*NasHAPartitionSnapshot)(nil)).Elem()
}

func (o NasHAPartitionSnapshotMapOutput) ToNasHAPartitionSnapshotMapOutput() NasHAPartitionSnapshotMapOutput {
	return o
}

func (o NasHAPartitionSnapshotMapOutput) ToNasHAPartitionSnapshotMapOutputWithContext(ctx context.Context) NasHAPartitionSnapshotMapOutput {
	return o
}

func (o NasHAPartitionSnapshotMapOutput) MapIndex(k pulumi.StringInput) NasHAPartitionSnapshotOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *NasHAPartitionSnapshot {
		return vs[0].(map[string]*NasHAPartitionSnapshot)[vs[1].(string)]
	}).(NasHAPartitionSnapshotOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*NasHAPartitionSnapshotInput)(nil)).Elem(), &NasHAPartitionSnapshot{})
	pulumi.RegisterInputType(reflect.TypeOf((*NasHAPartitionSnapshotArrayInput)(nil)).Elem(), NasHAPartitionSnapshotArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*NasHAPartitionSnapshotMapInput)(nil)).Elem(), NasHAPartitionSnapshotMap{})
	pulumi.RegisterOutputType(NasHAPartitionSnapshotOutput{})
	pulumi.RegisterOutputType(NasHAPartitionSnapshotArrayOutput{})
	pulumi.RegisterOutputType(NasHAPartitionSnapshotMapOutput{})
}
