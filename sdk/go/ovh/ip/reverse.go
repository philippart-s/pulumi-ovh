// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package ip

import (
	"context"
	"reflect"

	"errors"
	"github.com/ovh/pulumi-ovh/sdk/go/ovh/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides a OVHcloud IP reverse.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/ovh/pulumi-ovh/sdk/go/ovh/Ip"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := Ip.NewReverse(ctx, "test", &Ip.ReverseArgs{
//				Ip:           pulumi.String("192.0.2.0/24"),
//				ReverseIp:    pulumi.String("192.0.2.1"),
//				ReverseValue: pulumi.String("example.com"),
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
//
// ## Import
//
// The resource can be imported using the `ip`, `ip_reverse` of the address, separated by "|" E.g.,
//
//	bash
//
// ```sh
// $ pulumi import ovh:Ip/reverse:Reverse my_reverse '2001:0db8:c0ff:ee::/64|2001:0db8:c0ff:ee::42'
// ```
type Reverse struct {
	pulumi.CustomResourceState

	// The IP to set the reverse of
	ReverseIp pulumi.StringOutput `pulumi:"ReverseIp"`
	// The value of the reverse
	ReverseValue pulumi.StringOutput `pulumi:"ReverseValue"`
	// The IP block to which the IP belongs
	Ip pulumi.StringOutput `pulumi:"ip"`
}

// NewReverse registers a new resource with the given unique name, arguments, and options.
func NewReverse(ctx *pulumi.Context,
	name string, args *ReverseArgs, opts ...pulumi.ResourceOption) (*Reverse, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.ReverseIp == nil {
		return nil, errors.New("invalid value for required argument 'ReverseIp'")
	}
	if args.ReverseValue == nil {
		return nil, errors.New("invalid value for required argument 'ReverseValue'")
	}
	if args.Ip == nil {
		return nil, errors.New("invalid value for required argument 'Ip'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource Reverse
	err := ctx.RegisterResource("ovh:Ip/reverse:Reverse", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetReverse gets an existing Reverse resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetReverse(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *ReverseState, opts ...pulumi.ResourceOption) (*Reverse, error) {
	var resource Reverse
	err := ctx.ReadResource("ovh:Ip/reverse:Reverse", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Reverse resources.
type reverseState struct {
	// The IP to set the reverse of
	ReverseIp *string `pulumi:"ReverseIp"`
	// The value of the reverse
	ReverseValue *string `pulumi:"ReverseValue"`
	// The IP block to which the IP belongs
	Ip *string `pulumi:"ip"`
}

type ReverseState struct {
	// The IP to set the reverse of
	ReverseIp pulumi.StringPtrInput
	// The value of the reverse
	ReverseValue pulumi.StringPtrInput
	// The IP block to which the IP belongs
	Ip pulumi.StringPtrInput
}

func (ReverseState) ElementType() reflect.Type {
	return reflect.TypeOf((*reverseState)(nil)).Elem()
}

type reverseArgs struct {
	// The IP to set the reverse of
	ReverseIp string `pulumi:"ReverseIp"`
	// The value of the reverse
	ReverseValue string `pulumi:"ReverseValue"`
	// The IP block to which the IP belongs
	Ip string `pulumi:"ip"`
}

// The set of arguments for constructing a Reverse resource.
type ReverseArgs struct {
	// The IP to set the reverse of
	ReverseIp pulumi.StringInput
	// The value of the reverse
	ReverseValue pulumi.StringInput
	// The IP block to which the IP belongs
	Ip pulumi.StringInput
}

func (ReverseArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*reverseArgs)(nil)).Elem()
}

type ReverseInput interface {
	pulumi.Input

	ToReverseOutput() ReverseOutput
	ToReverseOutputWithContext(ctx context.Context) ReverseOutput
}

func (*Reverse) ElementType() reflect.Type {
	return reflect.TypeOf((**Reverse)(nil)).Elem()
}

func (i *Reverse) ToReverseOutput() ReverseOutput {
	return i.ToReverseOutputWithContext(context.Background())
}

func (i *Reverse) ToReverseOutputWithContext(ctx context.Context) ReverseOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ReverseOutput)
}

// ReverseArrayInput is an input type that accepts ReverseArray and ReverseArrayOutput values.
// You can construct a concrete instance of `ReverseArrayInput` via:
//
//	ReverseArray{ ReverseArgs{...} }
type ReverseArrayInput interface {
	pulumi.Input

	ToReverseArrayOutput() ReverseArrayOutput
	ToReverseArrayOutputWithContext(context.Context) ReverseArrayOutput
}

type ReverseArray []ReverseInput

func (ReverseArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Reverse)(nil)).Elem()
}

func (i ReverseArray) ToReverseArrayOutput() ReverseArrayOutput {
	return i.ToReverseArrayOutputWithContext(context.Background())
}

func (i ReverseArray) ToReverseArrayOutputWithContext(ctx context.Context) ReverseArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ReverseArrayOutput)
}

// ReverseMapInput is an input type that accepts ReverseMap and ReverseMapOutput values.
// You can construct a concrete instance of `ReverseMapInput` via:
//
//	ReverseMap{ "key": ReverseArgs{...} }
type ReverseMapInput interface {
	pulumi.Input

	ToReverseMapOutput() ReverseMapOutput
	ToReverseMapOutputWithContext(context.Context) ReverseMapOutput
}

type ReverseMap map[string]ReverseInput

func (ReverseMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Reverse)(nil)).Elem()
}

func (i ReverseMap) ToReverseMapOutput() ReverseMapOutput {
	return i.ToReverseMapOutputWithContext(context.Background())
}

func (i ReverseMap) ToReverseMapOutputWithContext(ctx context.Context) ReverseMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ReverseMapOutput)
}

type ReverseOutput struct{ *pulumi.OutputState }

func (ReverseOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Reverse)(nil)).Elem()
}

func (o ReverseOutput) ToReverseOutput() ReverseOutput {
	return o
}

func (o ReverseOutput) ToReverseOutputWithContext(ctx context.Context) ReverseOutput {
	return o
}

// The IP to set the reverse of
func (o ReverseOutput) ReverseIp() pulumi.StringOutput {
	return o.ApplyT(func(v *Reverse) pulumi.StringOutput { return v.ReverseIp }).(pulumi.StringOutput)
}

// The value of the reverse
func (o ReverseOutput) ReverseValue() pulumi.StringOutput {
	return o.ApplyT(func(v *Reverse) pulumi.StringOutput { return v.ReverseValue }).(pulumi.StringOutput)
}

// The IP block to which the IP belongs
func (o ReverseOutput) Ip() pulumi.StringOutput {
	return o.ApplyT(func(v *Reverse) pulumi.StringOutput { return v.Ip }).(pulumi.StringOutput)
}

type ReverseArrayOutput struct{ *pulumi.OutputState }

func (ReverseArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Reverse)(nil)).Elem()
}

func (o ReverseArrayOutput) ToReverseArrayOutput() ReverseArrayOutput {
	return o
}

func (o ReverseArrayOutput) ToReverseArrayOutputWithContext(ctx context.Context) ReverseArrayOutput {
	return o
}

func (o ReverseArrayOutput) Index(i pulumi.IntInput) ReverseOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *Reverse {
		return vs[0].([]*Reverse)[vs[1].(int)]
	}).(ReverseOutput)
}

type ReverseMapOutput struct{ *pulumi.OutputState }

func (ReverseMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Reverse)(nil)).Elem()
}

func (o ReverseMapOutput) ToReverseMapOutput() ReverseMapOutput {
	return o
}

func (o ReverseMapOutput) ToReverseMapOutputWithContext(ctx context.Context) ReverseMapOutput {
	return o
}

func (o ReverseMapOutput) MapIndex(k pulumi.StringInput) ReverseOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *Reverse {
		return vs[0].(map[string]*Reverse)[vs[1].(string)]
	}).(ReverseOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*ReverseInput)(nil)).Elem(), &Reverse{})
	pulumi.RegisterInputType(reflect.TypeOf((*ReverseArrayInput)(nil)).Elem(), ReverseArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*ReverseMapInput)(nil)).Elem(), ReverseMap{})
	pulumi.RegisterOutputType(ReverseOutput{})
	pulumi.RegisterOutputType(ReverseArrayOutput{})
	pulumi.RegisterOutputType(ReverseMapOutput{})
}
