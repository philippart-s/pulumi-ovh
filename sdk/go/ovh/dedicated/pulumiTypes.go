// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package dedicated

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
	"github.com/scraly/pulumi-ovh/sdk/go/ovh/internal"
)

var _ = internal.GetEnvOrDefault

type ServerInstallTaskDetails struct {
	// Template change log details.
	//
	// Deprecated: field is not used anymore
	ChangeLog *string `pulumi:"changeLog"`
	// Set up the server using the provided hostname instead of the default hostname.
	CustomHostname *string `pulumi:"customHostname"`
	// Disk group id.
	DiskGroupId *int `pulumi:"diskGroupId"`
	// set to true to install RTM.
	InstallRtm *bool `pulumi:"installRtm"`
	// set to true to install sql server (Windows template only).
	InstallSqlServer *bool `pulumi:"installSqlServer"`
	// language.
	Language *string `pulumi:"language"`
	// set to true to disable RAID.
	NoRaid *bool `pulumi:"noRaid"`
	// Indicate the URL where your postinstall customisation script is located.
	PostInstallationScriptLink *string `pulumi:"postInstallationScriptLink"`
	// Indicate the string returned by your postinstall customisation script on successful execution. Advice: your script should return a unique validation string in case of succes. A good example is 'loh1Xee7eo OK OK OK UGh8Ang1Gu'.
	PostInstallationScriptReturn *string `pulumi:"postInstallationScriptReturn"`
	// set to true to make a hardware raid reset.
	ResetHwRaid *bool `pulumi:"resetHwRaid"`
	// soft raid devices.
	SoftRaidDevices *int `pulumi:"softRaidDevices"`
	// Name of the ssh key that should be installed. Password login will be disabled.
	SshKeyName *string `pulumi:"sshKeyName"`
	// Use the distribution's native kernel instead of the recommended OVHcloud Kernel.
	UseDistribKernel *bool `pulumi:"useDistribKernel"`
	// set to true to use SPLA.
	UseSpla *bool `pulumi:"useSpla"`
}

// ServerInstallTaskDetailsInput is an input type that accepts ServerInstallTaskDetailsArgs and ServerInstallTaskDetailsOutput values.
// You can construct a concrete instance of `ServerInstallTaskDetailsInput` via:
//
//	ServerInstallTaskDetailsArgs{...}
type ServerInstallTaskDetailsInput interface {
	pulumi.Input

	ToServerInstallTaskDetailsOutput() ServerInstallTaskDetailsOutput
	ToServerInstallTaskDetailsOutputWithContext(context.Context) ServerInstallTaskDetailsOutput
}

type ServerInstallTaskDetailsArgs struct {
	// Template change log details.
	//
	// Deprecated: field is not used anymore
	ChangeLog pulumi.StringPtrInput `pulumi:"changeLog"`
	// Set up the server using the provided hostname instead of the default hostname.
	CustomHostname pulumi.StringPtrInput `pulumi:"customHostname"`
	// Disk group id.
	DiskGroupId pulumi.IntPtrInput `pulumi:"diskGroupId"`
	// set to true to install RTM.
	InstallRtm pulumi.BoolPtrInput `pulumi:"installRtm"`
	// set to true to install sql server (Windows template only).
	InstallSqlServer pulumi.BoolPtrInput `pulumi:"installSqlServer"`
	// language.
	Language pulumi.StringPtrInput `pulumi:"language"`
	// set to true to disable RAID.
	NoRaid pulumi.BoolPtrInput `pulumi:"noRaid"`
	// Indicate the URL where your postinstall customisation script is located.
	PostInstallationScriptLink pulumi.StringPtrInput `pulumi:"postInstallationScriptLink"`
	// Indicate the string returned by your postinstall customisation script on successful execution. Advice: your script should return a unique validation string in case of succes. A good example is 'loh1Xee7eo OK OK OK UGh8Ang1Gu'.
	PostInstallationScriptReturn pulumi.StringPtrInput `pulumi:"postInstallationScriptReturn"`
	// set to true to make a hardware raid reset.
	ResetHwRaid pulumi.BoolPtrInput `pulumi:"resetHwRaid"`
	// soft raid devices.
	SoftRaidDevices pulumi.IntPtrInput `pulumi:"softRaidDevices"`
	// Name of the ssh key that should be installed. Password login will be disabled.
	SshKeyName pulumi.StringPtrInput `pulumi:"sshKeyName"`
	// Use the distribution's native kernel instead of the recommended OVHcloud Kernel.
	UseDistribKernel pulumi.BoolPtrInput `pulumi:"useDistribKernel"`
	// set to true to use SPLA.
	UseSpla pulumi.BoolPtrInput `pulumi:"useSpla"`
}

func (ServerInstallTaskDetailsArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*ServerInstallTaskDetails)(nil)).Elem()
}

func (i ServerInstallTaskDetailsArgs) ToServerInstallTaskDetailsOutput() ServerInstallTaskDetailsOutput {
	return i.ToServerInstallTaskDetailsOutputWithContext(context.Background())
}

func (i ServerInstallTaskDetailsArgs) ToServerInstallTaskDetailsOutputWithContext(ctx context.Context) ServerInstallTaskDetailsOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ServerInstallTaskDetailsOutput)
}

func (i ServerInstallTaskDetailsArgs) ToServerInstallTaskDetailsPtrOutput() ServerInstallTaskDetailsPtrOutput {
	return i.ToServerInstallTaskDetailsPtrOutputWithContext(context.Background())
}

func (i ServerInstallTaskDetailsArgs) ToServerInstallTaskDetailsPtrOutputWithContext(ctx context.Context) ServerInstallTaskDetailsPtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ServerInstallTaskDetailsOutput).ToServerInstallTaskDetailsPtrOutputWithContext(ctx)
}

// ServerInstallTaskDetailsPtrInput is an input type that accepts ServerInstallTaskDetailsArgs, ServerInstallTaskDetailsPtr and ServerInstallTaskDetailsPtrOutput values.
// You can construct a concrete instance of `ServerInstallTaskDetailsPtrInput` via:
//
//	        ServerInstallTaskDetailsArgs{...}
//
//	or:
//
//	        nil
type ServerInstallTaskDetailsPtrInput interface {
	pulumi.Input

	ToServerInstallTaskDetailsPtrOutput() ServerInstallTaskDetailsPtrOutput
	ToServerInstallTaskDetailsPtrOutputWithContext(context.Context) ServerInstallTaskDetailsPtrOutput
}

type serverInstallTaskDetailsPtrType ServerInstallTaskDetailsArgs

func ServerInstallTaskDetailsPtr(v *ServerInstallTaskDetailsArgs) ServerInstallTaskDetailsPtrInput {
	return (*serverInstallTaskDetailsPtrType)(v)
}

func (*serverInstallTaskDetailsPtrType) ElementType() reflect.Type {
	return reflect.TypeOf((**ServerInstallTaskDetails)(nil)).Elem()
}

func (i *serverInstallTaskDetailsPtrType) ToServerInstallTaskDetailsPtrOutput() ServerInstallTaskDetailsPtrOutput {
	return i.ToServerInstallTaskDetailsPtrOutputWithContext(context.Background())
}

func (i *serverInstallTaskDetailsPtrType) ToServerInstallTaskDetailsPtrOutputWithContext(ctx context.Context) ServerInstallTaskDetailsPtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ServerInstallTaskDetailsPtrOutput)
}

type ServerInstallTaskDetailsOutput struct{ *pulumi.OutputState }

func (ServerInstallTaskDetailsOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*ServerInstallTaskDetails)(nil)).Elem()
}

func (o ServerInstallTaskDetailsOutput) ToServerInstallTaskDetailsOutput() ServerInstallTaskDetailsOutput {
	return o
}

func (o ServerInstallTaskDetailsOutput) ToServerInstallTaskDetailsOutputWithContext(ctx context.Context) ServerInstallTaskDetailsOutput {
	return o
}

func (o ServerInstallTaskDetailsOutput) ToServerInstallTaskDetailsPtrOutput() ServerInstallTaskDetailsPtrOutput {
	return o.ToServerInstallTaskDetailsPtrOutputWithContext(context.Background())
}

func (o ServerInstallTaskDetailsOutput) ToServerInstallTaskDetailsPtrOutputWithContext(ctx context.Context) ServerInstallTaskDetailsPtrOutput {
	return o.ApplyTWithContext(ctx, func(_ context.Context, v ServerInstallTaskDetails) *ServerInstallTaskDetails {
		return &v
	}).(ServerInstallTaskDetailsPtrOutput)
}

// Template change log details.
//
// Deprecated: field is not used anymore
func (o ServerInstallTaskDetailsOutput) ChangeLog() pulumi.StringPtrOutput {
	return o.ApplyT(func(v ServerInstallTaskDetails) *string { return v.ChangeLog }).(pulumi.StringPtrOutput)
}

// Set up the server using the provided hostname instead of the default hostname.
func (o ServerInstallTaskDetailsOutput) CustomHostname() pulumi.StringPtrOutput {
	return o.ApplyT(func(v ServerInstallTaskDetails) *string { return v.CustomHostname }).(pulumi.StringPtrOutput)
}

// Disk group id.
func (o ServerInstallTaskDetailsOutput) DiskGroupId() pulumi.IntPtrOutput {
	return o.ApplyT(func(v ServerInstallTaskDetails) *int { return v.DiskGroupId }).(pulumi.IntPtrOutput)
}

// set to true to install RTM.
func (o ServerInstallTaskDetailsOutput) InstallRtm() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v ServerInstallTaskDetails) *bool { return v.InstallRtm }).(pulumi.BoolPtrOutput)
}

// set to true to install sql server (Windows template only).
func (o ServerInstallTaskDetailsOutput) InstallSqlServer() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v ServerInstallTaskDetails) *bool { return v.InstallSqlServer }).(pulumi.BoolPtrOutput)
}

// language.
func (o ServerInstallTaskDetailsOutput) Language() pulumi.StringPtrOutput {
	return o.ApplyT(func(v ServerInstallTaskDetails) *string { return v.Language }).(pulumi.StringPtrOutput)
}

// set to true to disable RAID.
func (o ServerInstallTaskDetailsOutput) NoRaid() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v ServerInstallTaskDetails) *bool { return v.NoRaid }).(pulumi.BoolPtrOutput)
}

// Indicate the URL where your postinstall customisation script is located.
func (o ServerInstallTaskDetailsOutput) PostInstallationScriptLink() pulumi.StringPtrOutput {
	return o.ApplyT(func(v ServerInstallTaskDetails) *string { return v.PostInstallationScriptLink }).(pulumi.StringPtrOutput)
}

// Indicate the string returned by your postinstall customisation script on successful execution. Advice: your script should return a unique validation string in case of succes. A good example is 'loh1Xee7eo OK OK OK UGh8Ang1Gu'.
func (o ServerInstallTaskDetailsOutput) PostInstallationScriptReturn() pulumi.StringPtrOutput {
	return o.ApplyT(func(v ServerInstallTaskDetails) *string { return v.PostInstallationScriptReturn }).(pulumi.StringPtrOutput)
}

// set to true to make a hardware raid reset.
func (o ServerInstallTaskDetailsOutput) ResetHwRaid() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v ServerInstallTaskDetails) *bool { return v.ResetHwRaid }).(pulumi.BoolPtrOutput)
}

// soft raid devices.
func (o ServerInstallTaskDetailsOutput) SoftRaidDevices() pulumi.IntPtrOutput {
	return o.ApplyT(func(v ServerInstallTaskDetails) *int { return v.SoftRaidDevices }).(pulumi.IntPtrOutput)
}

// Name of the ssh key that should be installed. Password login will be disabled.
func (o ServerInstallTaskDetailsOutput) SshKeyName() pulumi.StringPtrOutput {
	return o.ApplyT(func(v ServerInstallTaskDetails) *string { return v.SshKeyName }).(pulumi.StringPtrOutput)
}

// Use the distribution's native kernel instead of the recommended OVHcloud Kernel.
func (o ServerInstallTaskDetailsOutput) UseDistribKernel() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v ServerInstallTaskDetails) *bool { return v.UseDistribKernel }).(pulumi.BoolPtrOutput)
}

// set to true to use SPLA.
func (o ServerInstallTaskDetailsOutput) UseSpla() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v ServerInstallTaskDetails) *bool { return v.UseSpla }).(pulumi.BoolPtrOutput)
}

type ServerInstallTaskDetailsPtrOutput struct{ *pulumi.OutputState }

func (ServerInstallTaskDetailsPtrOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**ServerInstallTaskDetails)(nil)).Elem()
}

func (o ServerInstallTaskDetailsPtrOutput) ToServerInstallTaskDetailsPtrOutput() ServerInstallTaskDetailsPtrOutput {
	return o
}

func (o ServerInstallTaskDetailsPtrOutput) ToServerInstallTaskDetailsPtrOutputWithContext(ctx context.Context) ServerInstallTaskDetailsPtrOutput {
	return o
}

func (o ServerInstallTaskDetailsPtrOutput) Elem() ServerInstallTaskDetailsOutput {
	return o.ApplyT(func(v *ServerInstallTaskDetails) ServerInstallTaskDetails {
		if v != nil {
			return *v
		}
		var ret ServerInstallTaskDetails
		return ret
	}).(ServerInstallTaskDetailsOutput)
}

// Template change log details.
//
// Deprecated: field is not used anymore
func (o ServerInstallTaskDetailsPtrOutput) ChangeLog() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *ServerInstallTaskDetails) *string {
		if v == nil {
			return nil
		}
		return v.ChangeLog
	}).(pulumi.StringPtrOutput)
}

// Set up the server using the provided hostname instead of the default hostname.
func (o ServerInstallTaskDetailsPtrOutput) CustomHostname() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *ServerInstallTaskDetails) *string {
		if v == nil {
			return nil
		}
		return v.CustomHostname
	}).(pulumi.StringPtrOutput)
}

// Disk group id.
func (o ServerInstallTaskDetailsPtrOutput) DiskGroupId() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *ServerInstallTaskDetails) *int {
		if v == nil {
			return nil
		}
		return v.DiskGroupId
	}).(pulumi.IntPtrOutput)
}

// set to true to install RTM.
func (o ServerInstallTaskDetailsPtrOutput) InstallRtm() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *ServerInstallTaskDetails) *bool {
		if v == nil {
			return nil
		}
		return v.InstallRtm
	}).(pulumi.BoolPtrOutput)
}

// set to true to install sql server (Windows template only).
func (o ServerInstallTaskDetailsPtrOutput) InstallSqlServer() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *ServerInstallTaskDetails) *bool {
		if v == nil {
			return nil
		}
		return v.InstallSqlServer
	}).(pulumi.BoolPtrOutput)
}

// language.
func (o ServerInstallTaskDetailsPtrOutput) Language() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *ServerInstallTaskDetails) *string {
		if v == nil {
			return nil
		}
		return v.Language
	}).(pulumi.StringPtrOutput)
}

// set to true to disable RAID.
func (o ServerInstallTaskDetailsPtrOutput) NoRaid() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *ServerInstallTaskDetails) *bool {
		if v == nil {
			return nil
		}
		return v.NoRaid
	}).(pulumi.BoolPtrOutput)
}

// Indicate the URL where your postinstall customisation script is located.
func (o ServerInstallTaskDetailsPtrOutput) PostInstallationScriptLink() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *ServerInstallTaskDetails) *string {
		if v == nil {
			return nil
		}
		return v.PostInstallationScriptLink
	}).(pulumi.StringPtrOutput)
}

// Indicate the string returned by your postinstall customisation script on successful execution. Advice: your script should return a unique validation string in case of succes. A good example is 'loh1Xee7eo OK OK OK UGh8Ang1Gu'.
func (o ServerInstallTaskDetailsPtrOutput) PostInstallationScriptReturn() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *ServerInstallTaskDetails) *string {
		if v == nil {
			return nil
		}
		return v.PostInstallationScriptReturn
	}).(pulumi.StringPtrOutput)
}

// set to true to make a hardware raid reset.
func (o ServerInstallTaskDetailsPtrOutput) ResetHwRaid() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *ServerInstallTaskDetails) *bool {
		if v == nil {
			return nil
		}
		return v.ResetHwRaid
	}).(pulumi.BoolPtrOutput)
}

// soft raid devices.
func (o ServerInstallTaskDetailsPtrOutput) SoftRaidDevices() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *ServerInstallTaskDetails) *int {
		if v == nil {
			return nil
		}
		return v.SoftRaidDevices
	}).(pulumi.IntPtrOutput)
}

// Name of the ssh key that should be installed. Password login will be disabled.
func (o ServerInstallTaskDetailsPtrOutput) SshKeyName() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *ServerInstallTaskDetails) *string {
		if v == nil {
			return nil
		}
		return v.SshKeyName
	}).(pulumi.StringPtrOutput)
}

// Use the distribution's native kernel instead of the recommended OVHcloud Kernel.
func (o ServerInstallTaskDetailsPtrOutput) UseDistribKernel() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *ServerInstallTaskDetails) *bool {
		if v == nil {
			return nil
		}
		return v.UseDistribKernel
	}).(pulumi.BoolPtrOutput)
}

// set to true to use SPLA.
func (o ServerInstallTaskDetailsPtrOutput) UseSpla() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *ServerInstallTaskDetails) *bool {
		if v == nil {
			return nil
		}
		return v.UseSpla
	}).(pulumi.BoolPtrOutput)
}

type ServerNetworkingInterface struct {
	// List of mac addresses to bind together.
	Macs []string `pulumi:"macs"`
	// Type of bonding to create.
	Type string `pulumi:"type"`
}

// ServerNetworkingInterfaceInput is an input type that accepts ServerNetworkingInterfaceArgs and ServerNetworkingInterfaceOutput values.
// You can construct a concrete instance of `ServerNetworkingInterfaceInput` via:
//
//	ServerNetworkingInterfaceArgs{...}
type ServerNetworkingInterfaceInput interface {
	pulumi.Input

	ToServerNetworkingInterfaceOutput() ServerNetworkingInterfaceOutput
	ToServerNetworkingInterfaceOutputWithContext(context.Context) ServerNetworkingInterfaceOutput
}

type ServerNetworkingInterfaceArgs struct {
	// List of mac addresses to bind together.
	Macs pulumi.StringArrayInput `pulumi:"macs"`
	// Type of bonding to create.
	Type pulumi.StringInput `pulumi:"type"`
}

func (ServerNetworkingInterfaceArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*ServerNetworkingInterface)(nil)).Elem()
}

func (i ServerNetworkingInterfaceArgs) ToServerNetworkingInterfaceOutput() ServerNetworkingInterfaceOutput {
	return i.ToServerNetworkingInterfaceOutputWithContext(context.Background())
}

func (i ServerNetworkingInterfaceArgs) ToServerNetworkingInterfaceOutputWithContext(ctx context.Context) ServerNetworkingInterfaceOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ServerNetworkingInterfaceOutput)
}

// ServerNetworkingInterfaceArrayInput is an input type that accepts ServerNetworkingInterfaceArray and ServerNetworkingInterfaceArrayOutput values.
// You can construct a concrete instance of `ServerNetworkingInterfaceArrayInput` via:
//
//	ServerNetworkingInterfaceArray{ ServerNetworkingInterfaceArgs{...} }
type ServerNetworkingInterfaceArrayInput interface {
	pulumi.Input

	ToServerNetworkingInterfaceArrayOutput() ServerNetworkingInterfaceArrayOutput
	ToServerNetworkingInterfaceArrayOutputWithContext(context.Context) ServerNetworkingInterfaceArrayOutput
}

type ServerNetworkingInterfaceArray []ServerNetworkingInterfaceInput

func (ServerNetworkingInterfaceArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]ServerNetworkingInterface)(nil)).Elem()
}

func (i ServerNetworkingInterfaceArray) ToServerNetworkingInterfaceArrayOutput() ServerNetworkingInterfaceArrayOutput {
	return i.ToServerNetworkingInterfaceArrayOutputWithContext(context.Background())
}

func (i ServerNetworkingInterfaceArray) ToServerNetworkingInterfaceArrayOutputWithContext(ctx context.Context) ServerNetworkingInterfaceArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ServerNetworkingInterfaceArrayOutput)
}

type ServerNetworkingInterfaceOutput struct{ *pulumi.OutputState }

func (ServerNetworkingInterfaceOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*ServerNetworkingInterface)(nil)).Elem()
}

func (o ServerNetworkingInterfaceOutput) ToServerNetworkingInterfaceOutput() ServerNetworkingInterfaceOutput {
	return o
}

func (o ServerNetworkingInterfaceOutput) ToServerNetworkingInterfaceOutputWithContext(ctx context.Context) ServerNetworkingInterfaceOutput {
	return o
}

// List of mac addresses to bind together.
func (o ServerNetworkingInterfaceOutput) Macs() pulumi.StringArrayOutput {
	return o.ApplyT(func(v ServerNetworkingInterface) []string { return v.Macs }).(pulumi.StringArrayOutput)
}

// Type of bonding to create.
func (o ServerNetworkingInterfaceOutput) Type() pulumi.StringOutput {
	return o.ApplyT(func(v ServerNetworkingInterface) string { return v.Type }).(pulumi.StringOutput)
}

type ServerNetworkingInterfaceArrayOutput struct{ *pulumi.OutputState }

func (ServerNetworkingInterfaceArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]ServerNetworkingInterface)(nil)).Elem()
}

func (o ServerNetworkingInterfaceArrayOutput) ToServerNetworkingInterfaceArrayOutput() ServerNetworkingInterfaceArrayOutput {
	return o
}

func (o ServerNetworkingInterfaceArrayOutput) ToServerNetworkingInterfaceArrayOutputWithContext(ctx context.Context) ServerNetworkingInterfaceArrayOutput {
	return o
}

func (o ServerNetworkingInterfaceArrayOutput) Index(i pulumi.IntInput) ServerNetworkingInterfaceOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) ServerNetworkingInterface {
		return vs[0].([]ServerNetworkingInterface)[vs[1].(int)]
	}).(ServerNetworkingInterfaceOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*ServerInstallTaskDetailsInput)(nil)).Elem(), ServerInstallTaskDetailsArgs{})
	pulumi.RegisterInputType(reflect.TypeOf((*ServerInstallTaskDetailsPtrInput)(nil)).Elem(), ServerInstallTaskDetailsArgs{})
	pulumi.RegisterInputType(reflect.TypeOf((*ServerNetworkingInterfaceInput)(nil)).Elem(), ServerNetworkingInterfaceArgs{})
	pulumi.RegisterInputType(reflect.TypeOf((*ServerNetworkingInterfaceArrayInput)(nil)).Elem(), ServerNetworkingInterfaceArray{})
	pulumi.RegisterOutputType(ServerInstallTaskDetailsOutput{})
	pulumi.RegisterOutputType(ServerInstallTaskDetailsPtrOutput{})
	pulumi.RegisterOutputType(ServerNetworkingInterfaceOutput{})
	pulumi.RegisterOutputType(ServerNetworkingInterfaceArrayOutput{})
}
