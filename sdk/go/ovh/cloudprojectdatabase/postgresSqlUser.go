// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package cloudprojectdatabase

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
	"github.com/scraly/pulumi-ovh/sdk/go/ovh/internal"
)

// ## Import
//
// OVHcloud Managed PostgreSQL clusters users can be imported using the `service_name`, `cluster_id` and `id` of the user, separated by "/" E.g., bash <break><break>```sh<break> $ pulumi import ovh:CloudProjectDatabase/postgresSqlUser:PostgresSqlUser my_user service_name/cluster_id/id <break>```<break><break>
type PostgresSqlUser struct {
	pulumi.CustomResourceState

	// Cluster ID.
	ClusterId pulumi.StringOutput `pulumi:"clusterId"`
	// Date of the creation of the user.
	CreatedAt pulumi.StringOutput `pulumi:"createdAt"`
	// Name of the user. A user named "avnadmin" is map with already created admin user and reset his password instead of create a new user.
	Name pulumi.StringOutput `pulumi:"name"`
	// (Sensitive) Password of the user.
	Password pulumi.StringOutput `pulumi:"password"`
	// Arbitrary string to change to trigger a password update.
	PasswordReset pulumi.StringPtrOutput `pulumi:"passwordReset"`
	// Roles the user belongs to.
	// Available roles:
	Roles pulumi.StringArrayOutput `pulumi:"roles"`
	// The id of the public cloud project. If omitted,
	// the `OVH_CLOUD_PROJECT_SERVICE` environment variable is used.
	ServiceName pulumi.StringOutput `pulumi:"serviceName"`
	// Current status of the user.
	Status pulumi.StringOutput `pulumi:"status"`
}

// NewPostgresSqlUser registers a new resource with the given unique name, arguments, and options.
func NewPostgresSqlUser(ctx *pulumi.Context,
	name string, args *PostgresSqlUserArgs, opts ...pulumi.ResourceOption) (*PostgresSqlUser, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.ClusterId == nil {
		return nil, errors.New("invalid value for required argument 'ClusterId'")
	}
	if args.ServiceName == nil {
		return nil, errors.New("invalid value for required argument 'ServiceName'")
	}
	secrets := pulumi.AdditionalSecretOutputs([]string{
		"password",
	})
	opts = append(opts, secrets)
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource PostgresSqlUser
	err := ctx.RegisterResource("ovh:CloudProjectDatabase/postgresSqlUser:PostgresSqlUser", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetPostgresSqlUser gets an existing PostgresSqlUser resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetPostgresSqlUser(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *PostgresSqlUserState, opts ...pulumi.ResourceOption) (*PostgresSqlUser, error) {
	var resource PostgresSqlUser
	err := ctx.ReadResource("ovh:CloudProjectDatabase/postgresSqlUser:PostgresSqlUser", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering PostgresSqlUser resources.
type postgresSqlUserState struct {
	// Cluster ID.
	ClusterId *string `pulumi:"clusterId"`
	// Date of the creation of the user.
	CreatedAt *string `pulumi:"createdAt"`
	// Name of the user. A user named "avnadmin" is map with already created admin user and reset his password instead of create a new user.
	Name *string `pulumi:"name"`
	// (Sensitive) Password of the user.
	Password *string `pulumi:"password"`
	// Arbitrary string to change to trigger a password update.
	PasswordReset *string `pulumi:"passwordReset"`
	// Roles the user belongs to.
	// Available roles:
	Roles []string `pulumi:"roles"`
	// The id of the public cloud project. If omitted,
	// the `OVH_CLOUD_PROJECT_SERVICE` environment variable is used.
	ServiceName *string `pulumi:"serviceName"`
	// Current status of the user.
	Status *string `pulumi:"status"`
}

type PostgresSqlUserState struct {
	// Cluster ID.
	ClusterId pulumi.StringPtrInput
	// Date of the creation of the user.
	CreatedAt pulumi.StringPtrInput
	// Name of the user. A user named "avnadmin" is map with already created admin user and reset his password instead of create a new user.
	Name pulumi.StringPtrInput
	// (Sensitive) Password of the user.
	Password pulumi.StringPtrInput
	// Arbitrary string to change to trigger a password update.
	PasswordReset pulumi.StringPtrInput
	// Roles the user belongs to.
	// Available roles:
	Roles pulumi.StringArrayInput
	// The id of the public cloud project. If omitted,
	// the `OVH_CLOUD_PROJECT_SERVICE` environment variable is used.
	ServiceName pulumi.StringPtrInput
	// Current status of the user.
	Status pulumi.StringPtrInput
}

func (PostgresSqlUserState) ElementType() reflect.Type {
	return reflect.TypeOf((*postgresSqlUserState)(nil)).Elem()
}

type postgresSqlUserArgs struct {
	// Cluster ID.
	ClusterId string `pulumi:"clusterId"`
	// Name of the user. A user named "avnadmin" is map with already created admin user and reset his password instead of create a new user.
	Name *string `pulumi:"name"`
	// Arbitrary string to change to trigger a password update.
	PasswordReset *string `pulumi:"passwordReset"`
	// Roles the user belongs to.
	// Available roles:
	Roles []string `pulumi:"roles"`
	// The id of the public cloud project. If omitted,
	// the `OVH_CLOUD_PROJECT_SERVICE` environment variable is used.
	ServiceName string `pulumi:"serviceName"`
}

// The set of arguments for constructing a PostgresSqlUser resource.
type PostgresSqlUserArgs struct {
	// Cluster ID.
	ClusterId pulumi.StringInput
	// Name of the user. A user named "avnadmin" is map with already created admin user and reset his password instead of create a new user.
	Name pulumi.StringPtrInput
	// Arbitrary string to change to trigger a password update.
	PasswordReset pulumi.StringPtrInput
	// Roles the user belongs to.
	// Available roles:
	Roles pulumi.StringArrayInput
	// The id of the public cloud project. If omitted,
	// the `OVH_CLOUD_PROJECT_SERVICE` environment variable is used.
	ServiceName pulumi.StringInput
}

func (PostgresSqlUserArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*postgresSqlUserArgs)(nil)).Elem()
}

type PostgresSqlUserInput interface {
	pulumi.Input

	ToPostgresSqlUserOutput() PostgresSqlUserOutput
	ToPostgresSqlUserOutputWithContext(ctx context.Context) PostgresSqlUserOutput
}

func (*PostgresSqlUser) ElementType() reflect.Type {
	return reflect.TypeOf((**PostgresSqlUser)(nil)).Elem()
}

func (i *PostgresSqlUser) ToPostgresSqlUserOutput() PostgresSqlUserOutput {
	return i.ToPostgresSqlUserOutputWithContext(context.Background())
}

func (i *PostgresSqlUser) ToPostgresSqlUserOutputWithContext(ctx context.Context) PostgresSqlUserOutput {
	return pulumi.ToOutputWithContext(ctx, i).(PostgresSqlUserOutput)
}

// PostgresSqlUserArrayInput is an input type that accepts PostgresSqlUserArray and PostgresSqlUserArrayOutput values.
// You can construct a concrete instance of `PostgresSqlUserArrayInput` via:
//
//	PostgresSqlUserArray{ PostgresSqlUserArgs{...} }
type PostgresSqlUserArrayInput interface {
	pulumi.Input

	ToPostgresSqlUserArrayOutput() PostgresSqlUserArrayOutput
	ToPostgresSqlUserArrayOutputWithContext(context.Context) PostgresSqlUserArrayOutput
}

type PostgresSqlUserArray []PostgresSqlUserInput

func (PostgresSqlUserArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*PostgresSqlUser)(nil)).Elem()
}

func (i PostgresSqlUserArray) ToPostgresSqlUserArrayOutput() PostgresSqlUserArrayOutput {
	return i.ToPostgresSqlUserArrayOutputWithContext(context.Background())
}

func (i PostgresSqlUserArray) ToPostgresSqlUserArrayOutputWithContext(ctx context.Context) PostgresSqlUserArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(PostgresSqlUserArrayOutput)
}

// PostgresSqlUserMapInput is an input type that accepts PostgresSqlUserMap and PostgresSqlUserMapOutput values.
// You can construct a concrete instance of `PostgresSqlUserMapInput` via:
//
//	PostgresSqlUserMap{ "key": PostgresSqlUserArgs{...} }
type PostgresSqlUserMapInput interface {
	pulumi.Input

	ToPostgresSqlUserMapOutput() PostgresSqlUserMapOutput
	ToPostgresSqlUserMapOutputWithContext(context.Context) PostgresSqlUserMapOutput
}

type PostgresSqlUserMap map[string]PostgresSqlUserInput

func (PostgresSqlUserMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*PostgresSqlUser)(nil)).Elem()
}

func (i PostgresSqlUserMap) ToPostgresSqlUserMapOutput() PostgresSqlUserMapOutput {
	return i.ToPostgresSqlUserMapOutputWithContext(context.Background())
}

func (i PostgresSqlUserMap) ToPostgresSqlUserMapOutputWithContext(ctx context.Context) PostgresSqlUserMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(PostgresSqlUserMapOutput)
}

type PostgresSqlUserOutput struct{ *pulumi.OutputState }

func (PostgresSqlUserOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**PostgresSqlUser)(nil)).Elem()
}

func (o PostgresSqlUserOutput) ToPostgresSqlUserOutput() PostgresSqlUserOutput {
	return o
}

func (o PostgresSqlUserOutput) ToPostgresSqlUserOutputWithContext(ctx context.Context) PostgresSqlUserOutput {
	return o
}

// Cluster ID.
func (o PostgresSqlUserOutput) ClusterId() pulumi.StringOutput {
	return o.ApplyT(func(v *PostgresSqlUser) pulumi.StringOutput { return v.ClusterId }).(pulumi.StringOutput)
}

// Date of the creation of the user.
func (o PostgresSqlUserOutput) CreatedAt() pulumi.StringOutput {
	return o.ApplyT(func(v *PostgresSqlUser) pulumi.StringOutput { return v.CreatedAt }).(pulumi.StringOutput)
}

// Name of the user. A user named "avnadmin" is map with already created admin user and reset his password instead of create a new user.
func (o PostgresSqlUserOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *PostgresSqlUser) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// (Sensitive) Password of the user.
func (o PostgresSqlUserOutput) Password() pulumi.StringOutput {
	return o.ApplyT(func(v *PostgresSqlUser) pulumi.StringOutput { return v.Password }).(pulumi.StringOutput)
}

// Arbitrary string to change to trigger a password update.
func (o PostgresSqlUserOutput) PasswordReset() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *PostgresSqlUser) pulumi.StringPtrOutput { return v.PasswordReset }).(pulumi.StringPtrOutput)
}

// Roles the user belongs to.
// Available roles:
func (o PostgresSqlUserOutput) Roles() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *PostgresSqlUser) pulumi.StringArrayOutput { return v.Roles }).(pulumi.StringArrayOutput)
}

// The id of the public cloud project. If omitted,
// the `OVH_CLOUD_PROJECT_SERVICE` environment variable is used.
func (o PostgresSqlUserOutput) ServiceName() pulumi.StringOutput {
	return o.ApplyT(func(v *PostgresSqlUser) pulumi.StringOutput { return v.ServiceName }).(pulumi.StringOutput)
}

// Current status of the user.
func (o PostgresSqlUserOutput) Status() pulumi.StringOutput {
	return o.ApplyT(func(v *PostgresSqlUser) pulumi.StringOutput { return v.Status }).(pulumi.StringOutput)
}

type PostgresSqlUserArrayOutput struct{ *pulumi.OutputState }

func (PostgresSqlUserArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*PostgresSqlUser)(nil)).Elem()
}

func (o PostgresSqlUserArrayOutput) ToPostgresSqlUserArrayOutput() PostgresSqlUserArrayOutput {
	return o
}

func (o PostgresSqlUserArrayOutput) ToPostgresSqlUserArrayOutputWithContext(ctx context.Context) PostgresSqlUserArrayOutput {
	return o
}

func (o PostgresSqlUserArrayOutput) Index(i pulumi.IntInput) PostgresSqlUserOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *PostgresSqlUser {
		return vs[0].([]*PostgresSqlUser)[vs[1].(int)]
	}).(PostgresSqlUserOutput)
}

type PostgresSqlUserMapOutput struct{ *pulumi.OutputState }

func (PostgresSqlUserMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*PostgresSqlUser)(nil)).Elem()
}

func (o PostgresSqlUserMapOutput) ToPostgresSqlUserMapOutput() PostgresSqlUserMapOutput {
	return o
}

func (o PostgresSqlUserMapOutput) ToPostgresSqlUserMapOutputWithContext(ctx context.Context) PostgresSqlUserMapOutput {
	return o
}

func (o PostgresSqlUserMapOutput) MapIndex(k pulumi.StringInput) PostgresSqlUserOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *PostgresSqlUser {
		return vs[0].(map[string]*PostgresSqlUser)[vs[1].(string)]
	}).(PostgresSqlUserOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*PostgresSqlUserInput)(nil)).Elem(), &PostgresSqlUser{})
	pulumi.RegisterInputType(reflect.TypeOf((*PostgresSqlUserArrayInput)(nil)).Elem(), PostgresSqlUserArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*PostgresSqlUserMapInput)(nil)).Elem(), PostgresSqlUserMap{})
	pulumi.RegisterOutputType(PostgresSqlUserOutput{})
	pulumi.RegisterOutputType(PostgresSqlUserArrayOutput{})
	pulumi.RegisterOutputType(PostgresSqlUserMapOutput{})
}
