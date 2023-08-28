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

// Creates a user in a public cloud project.
//
// ## Example Usage
type User struct {
	pulumi.CustomResourceState

	// the date the user was created.
	CreationDate pulumi.StringOutput `pulumi:"creationDate"`
	// A description associated with the user.
	Description pulumi.StringPtrOutput `pulumi:"description"`
	// a convenient map representing an openstackRc file.
	// Note: no password nor sensitive token is set in this map.
	OpenstackRc pulumi.MapOutput `pulumi:"openstackRc"`
	// (Sensitive) the password generated for the user. The password can
	// be used with the Openstack API. This attribute is sensitive and will only be
	// retrieve once during creation.
	Password pulumi.StringOutput `pulumi:"password"`
	// The name of a role. See `roleNames`.
	RoleName pulumi.StringPtrOutput `pulumi:"roleName"`
	// A list of role names. Values can be:
	// - administrator,
	// - aiTrainingOperator
	// - authentication
	// - backupOperator
	// - computeOperator
	// - imageOperator
	// - infrastructureSupervisor
	// - networkOperator
	// - networkSecurityOperator
	// - objectstoreOperator
	// - volume_operator
	RoleNames pulumi.StringArrayOutput `pulumi:"roleNames"`
	// A list of roles associated with the user.
	Roles UserRoleArrayOutput `pulumi:"roles"`
	// The id of the public cloud project. If omitted,
	// the `OVH_CLOUD_PROJECT_SERVICE` environment variable is used.
	ServiceName pulumi.StringOutput `pulumi:"serviceName"`
	// the status of the user. should be normally set to 'ok'.
	Status pulumi.StringOutput `pulumi:"status"`
	// the username generated for the user. This username can be used with
	// the Openstack API.
	Username pulumi.StringOutput `pulumi:"username"`
}

// NewUser registers a new resource with the given unique name, arguments, and options.
func NewUser(ctx *pulumi.Context,
	name string, args *UserArgs, opts ...pulumi.ResourceOption) (*User, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.ServiceName == nil {
		return nil, errors.New("invalid value for required argument 'ServiceName'")
	}
	secrets := pulumi.AdditionalSecretOutputs([]string{
		"password",
	})
	opts = append(opts, secrets)
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource User
	err := ctx.RegisterResource("ovh:CloudProject/user:User", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetUser gets an existing User resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetUser(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *UserState, opts ...pulumi.ResourceOption) (*User, error) {
	var resource User
	err := ctx.ReadResource("ovh:CloudProject/user:User", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering User resources.
type userState struct {
	// the date the user was created.
	CreationDate *string `pulumi:"creationDate"`
	// A description associated with the user.
	Description *string `pulumi:"description"`
	// a convenient map representing an openstackRc file.
	// Note: no password nor sensitive token is set in this map.
	OpenstackRc map[string]interface{} `pulumi:"openstackRc"`
	// (Sensitive) the password generated for the user. The password can
	// be used with the Openstack API. This attribute is sensitive and will only be
	// retrieve once during creation.
	Password *string `pulumi:"password"`
	// The name of a role. See `roleNames`.
	RoleName *string `pulumi:"roleName"`
	// A list of role names. Values can be:
	// - administrator,
	// - aiTrainingOperator
	// - authentication
	// - backupOperator
	// - computeOperator
	// - imageOperator
	// - infrastructureSupervisor
	// - networkOperator
	// - networkSecurityOperator
	// - objectstoreOperator
	// - volume_operator
	RoleNames []string `pulumi:"roleNames"`
	// A list of roles associated with the user.
	Roles []UserRole `pulumi:"roles"`
	// The id of the public cloud project. If omitted,
	// the `OVH_CLOUD_PROJECT_SERVICE` environment variable is used.
	ServiceName *string `pulumi:"serviceName"`
	// the status of the user. should be normally set to 'ok'.
	Status *string `pulumi:"status"`
	// the username generated for the user. This username can be used with
	// the Openstack API.
	Username *string `pulumi:"username"`
}

type UserState struct {
	// the date the user was created.
	CreationDate pulumi.StringPtrInput
	// A description associated with the user.
	Description pulumi.StringPtrInput
	// a convenient map representing an openstackRc file.
	// Note: no password nor sensitive token is set in this map.
	OpenstackRc pulumi.MapInput
	// (Sensitive) the password generated for the user. The password can
	// be used with the Openstack API. This attribute is sensitive and will only be
	// retrieve once during creation.
	Password pulumi.StringPtrInput
	// The name of a role. See `roleNames`.
	RoleName pulumi.StringPtrInput
	// A list of role names. Values can be:
	// - administrator,
	// - aiTrainingOperator
	// - authentication
	// - backupOperator
	// - computeOperator
	// - imageOperator
	// - infrastructureSupervisor
	// - networkOperator
	// - networkSecurityOperator
	// - objectstoreOperator
	// - volume_operator
	RoleNames pulumi.StringArrayInput
	// A list of roles associated with the user.
	Roles UserRoleArrayInput
	// The id of the public cloud project. If omitted,
	// the `OVH_CLOUD_PROJECT_SERVICE` environment variable is used.
	ServiceName pulumi.StringPtrInput
	// the status of the user. should be normally set to 'ok'.
	Status pulumi.StringPtrInput
	// the username generated for the user. This username can be used with
	// the Openstack API.
	Username pulumi.StringPtrInput
}

func (UserState) ElementType() reflect.Type {
	return reflect.TypeOf((*userState)(nil)).Elem()
}

type userArgs struct {
	// A description associated with the user.
	Description *string `pulumi:"description"`
	// a convenient map representing an openstackRc file.
	// Note: no password nor sensitive token is set in this map.
	OpenstackRc map[string]interface{} `pulumi:"openstackRc"`
	// The name of a role. See `roleNames`.
	RoleName *string `pulumi:"roleName"`
	// A list of role names. Values can be:
	// - administrator,
	// - aiTrainingOperator
	// - authentication
	// - backupOperator
	// - computeOperator
	// - imageOperator
	// - infrastructureSupervisor
	// - networkOperator
	// - networkSecurityOperator
	// - objectstoreOperator
	// - volume_operator
	RoleNames []string `pulumi:"roleNames"`
	// The id of the public cloud project. If omitted,
	// the `OVH_CLOUD_PROJECT_SERVICE` environment variable is used.
	ServiceName string `pulumi:"serviceName"`
}

// The set of arguments for constructing a User resource.
type UserArgs struct {
	// A description associated with the user.
	Description pulumi.StringPtrInput
	// a convenient map representing an openstackRc file.
	// Note: no password nor sensitive token is set in this map.
	OpenstackRc pulumi.MapInput
	// The name of a role. See `roleNames`.
	RoleName pulumi.StringPtrInput
	// A list of role names. Values can be:
	// - administrator,
	// - aiTrainingOperator
	// - authentication
	// - backupOperator
	// - computeOperator
	// - imageOperator
	// - infrastructureSupervisor
	// - networkOperator
	// - networkSecurityOperator
	// - objectstoreOperator
	// - volume_operator
	RoleNames pulumi.StringArrayInput
	// The id of the public cloud project. If omitted,
	// the `OVH_CLOUD_PROJECT_SERVICE` environment variable is used.
	ServiceName pulumi.StringInput
}

func (UserArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*userArgs)(nil)).Elem()
}

type UserInput interface {
	pulumi.Input

	ToUserOutput() UserOutput
	ToUserOutputWithContext(ctx context.Context) UserOutput
}

func (*User) ElementType() reflect.Type {
	return reflect.TypeOf((**User)(nil)).Elem()
}

func (i *User) ToUserOutput() UserOutput {
	return i.ToUserOutputWithContext(context.Background())
}

func (i *User) ToUserOutputWithContext(ctx context.Context) UserOutput {
	return pulumi.ToOutputWithContext(ctx, i).(UserOutput)
}

// UserArrayInput is an input type that accepts UserArray and UserArrayOutput values.
// You can construct a concrete instance of `UserArrayInput` via:
//
//	UserArray{ UserArgs{...} }
type UserArrayInput interface {
	pulumi.Input

	ToUserArrayOutput() UserArrayOutput
	ToUserArrayOutputWithContext(context.Context) UserArrayOutput
}

type UserArray []UserInput

func (UserArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*User)(nil)).Elem()
}

func (i UserArray) ToUserArrayOutput() UserArrayOutput {
	return i.ToUserArrayOutputWithContext(context.Background())
}

func (i UserArray) ToUserArrayOutputWithContext(ctx context.Context) UserArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(UserArrayOutput)
}

// UserMapInput is an input type that accepts UserMap and UserMapOutput values.
// You can construct a concrete instance of `UserMapInput` via:
//
//	UserMap{ "key": UserArgs{...} }
type UserMapInput interface {
	pulumi.Input

	ToUserMapOutput() UserMapOutput
	ToUserMapOutputWithContext(context.Context) UserMapOutput
}

type UserMap map[string]UserInput

func (UserMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*User)(nil)).Elem()
}

func (i UserMap) ToUserMapOutput() UserMapOutput {
	return i.ToUserMapOutputWithContext(context.Background())
}

func (i UserMap) ToUserMapOutputWithContext(ctx context.Context) UserMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(UserMapOutput)
}

type UserOutput struct{ *pulumi.OutputState }

func (UserOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**User)(nil)).Elem()
}

func (o UserOutput) ToUserOutput() UserOutput {
	return o
}

func (o UserOutput) ToUserOutputWithContext(ctx context.Context) UserOutput {
	return o
}

// the date the user was created.
func (o UserOutput) CreationDate() pulumi.StringOutput {
	return o.ApplyT(func(v *User) pulumi.StringOutput { return v.CreationDate }).(pulumi.StringOutput)
}

// A description associated with the user.
func (o UserOutput) Description() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *User) pulumi.StringPtrOutput { return v.Description }).(pulumi.StringPtrOutput)
}

// a convenient map representing an openstackRc file.
// Note: no password nor sensitive token is set in this map.
func (o UserOutput) OpenstackRc() pulumi.MapOutput {
	return o.ApplyT(func(v *User) pulumi.MapOutput { return v.OpenstackRc }).(pulumi.MapOutput)
}

// (Sensitive) the password generated for the user. The password can
// be used with the Openstack API. This attribute is sensitive and will only be
// retrieve once during creation.
func (o UserOutput) Password() pulumi.StringOutput {
	return o.ApplyT(func(v *User) pulumi.StringOutput { return v.Password }).(pulumi.StringOutput)
}

// The name of a role. See `roleNames`.
func (o UserOutput) RoleName() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *User) pulumi.StringPtrOutput { return v.RoleName }).(pulumi.StringPtrOutput)
}

// A list of role names. Values can be:
// - administrator,
// - aiTrainingOperator
// - authentication
// - backupOperator
// - computeOperator
// - imageOperator
// - infrastructureSupervisor
// - networkOperator
// - networkSecurityOperator
// - objectstoreOperator
// - volume_operator
func (o UserOutput) RoleNames() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *User) pulumi.StringArrayOutput { return v.RoleNames }).(pulumi.StringArrayOutput)
}

// A list of roles associated with the user.
func (o UserOutput) Roles() UserRoleArrayOutput {
	return o.ApplyT(func(v *User) UserRoleArrayOutput { return v.Roles }).(UserRoleArrayOutput)
}

// The id of the public cloud project. If omitted,
// the `OVH_CLOUD_PROJECT_SERVICE` environment variable is used.
func (o UserOutput) ServiceName() pulumi.StringOutput {
	return o.ApplyT(func(v *User) pulumi.StringOutput { return v.ServiceName }).(pulumi.StringOutput)
}

// the status of the user. should be normally set to 'ok'.
func (o UserOutput) Status() pulumi.StringOutput {
	return o.ApplyT(func(v *User) pulumi.StringOutput { return v.Status }).(pulumi.StringOutput)
}

// the username generated for the user. This username can be used with
// the Openstack API.
func (o UserOutput) Username() pulumi.StringOutput {
	return o.ApplyT(func(v *User) pulumi.StringOutput { return v.Username }).(pulumi.StringOutput)
}

type UserArrayOutput struct{ *pulumi.OutputState }

func (UserArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*User)(nil)).Elem()
}

func (o UserArrayOutput) ToUserArrayOutput() UserArrayOutput {
	return o
}

func (o UserArrayOutput) ToUserArrayOutputWithContext(ctx context.Context) UserArrayOutput {
	return o
}

func (o UserArrayOutput) Index(i pulumi.IntInput) UserOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *User {
		return vs[0].([]*User)[vs[1].(int)]
	}).(UserOutput)
}

type UserMapOutput struct{ *pulumi.OutputState }

func (UserMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*User)(nil)).Elem()
}

func (o UserMapOutput) ToUserMapOutput() UserMapOutput {
	return o
}

func (o UserMapOutput) ToUserMapOutputWithContext(ctx context.Context) UserMapOutput {
	return o
}

func (o UserMapOutput) MapIndex(k pulumi.StringInput) UserOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *User {
		return vs[0].(map[string]*User)[vs[1].(string)]
	}).(UserOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*UserInput)(nil)).Elem(), &User{})
	pulumi.RegisterInputType(reflect.TypeOf((*UserArrayInput)(nil)).Elem(), UserArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*UserMapInput)(nil)).Elem(), UserMap{})
	pulumi.RegisterOutputType(UserOutput{})
	pulumi.RegisterOutputType(UserArrayOutput{})
	pulumi.RegisterOutputType(UserMapOutput{})
}
