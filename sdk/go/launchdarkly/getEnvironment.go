// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package launchdarkly

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides a LaunchDarkly environment data source.
//
// This data source allows you to retrieve environment information from your LaunchDarkly organization.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/lbrlabs/pulumi-launchdarkly/sdk/go/launchdarkly"
//	"github.com/pulumi/pulumi-launchdarkly/sdk/go/launchdarkly"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := launchdarkly.LookupEnvironment(ctx, &GetEnvironmentArgs{
//				Key:        "example-env",
//				ProjectKey: "example-project",
//			}, nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
func LookupEnvironment(ctx *pulumi.Context, args *LookupEnvironmentArgs, opts ...pulumi.InvokeOption) (*LookupEnvironmentResult, error) {
	opts = pkgInvokeDefaultOpts(opts)
	var rv LookupEnvironmentResult
	err := ctx.Invoke("launchdarkly:index/getEnvironment:getEnvironment", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getEnvironment.
type LookupEnvironmentArgs struct {
	ApprovalSettings []GetEnvironmentApprovalSetting `pulumi:"approvalSettings"`
	// A value of `true` indicates that this environment requires confirmation for flag and segment changes.
	ConfirmChanges *bool `pulumi:"confirmChanges"`
	// A value of `true` enables data export for every flag created in this environment. To learn more, read [Data Export](https://docs.launchdarkly.com/docs/data-export).
	DefaultTrackEvents *bool `pulumi:"defaultTrackEvents"`
	// The TTL for the environment. This will be a numeric value between 0 and 60 in minutes. The TTL setting only applies to environments using the PHP SDK. To learn more, read [TTL settings](https://docs.launchdarkly.com/docs/environments#section-ttl-settings).
	DefaultTtl *int `pulumi:"defaultTtl"`
	// The environment's unique key.
	Key string `pulumi:"key"`
	// The environment's project key.
	ProjectKey string `pulumi:"projectKey"`
	// A value of `true` indicates that this environment requires comments for flag and segment changes.
	RequireComments *bool `pulumi:"requireComments"`
	// A value of true `true` ensures a user of the client-side SDK cannot impersonate another user.
	SecureMode *bool `pulumi:"secureMode"`
	// Set of tags associated with the environment.
	Tags []string `pulumi:"tags"`
}

// A collection of values returned by getEnvironment.
type LookupEnvironmentResult struct {
	// The environment's SDK key.
	ApiKey           string                          `pulumi:"apiKey"`
	ApprovalSettings []GetEnvironmentApprovalSetting `pulumi:"approvalSettings"`
	// The environment's client-side ID.
	ClientSideId string `pulumi:"clientSideId"`
	// The color swatch as an RGB hex value with no leading `#`. For example: `000000`.
	Color string `pulumi:"color"`
	// A value of `true` indicates that this environment requires confirmation for flag and segment changes.
	ConfirmChanges *bool `pulumi:"confirmChanges"`
	// A value of `true` enables data export for every flag created in this environment. To learn more, read [Data Export](https://docs.launchdarkly.com/docs/data-export).
	DefaultTrackEvents *bool `pulumi:"defaultTrackEvents"`
	// The TTL for the environment. This will be a numeric value between 0 and 60 in minutes. The TTL setting only applies to environments using the PHP SDK. To learn more, read [TTL settings](https://docs.launchdarkly.com/docs/environments#section-ttl-settings).
	DefaultTtl *int `pulumi:"defaultTtl"`
	// The provider-assigned unique ID for this managed resource.
	Id  string `pulumi:"id"`
	Key string `pulumi:"key"`
	// The environment's mobile key.
	MobileKey string `pulumi:"mobileKey"`
	// The name of the environment.
	Name       string `pulumi:"name"`
	ProjectKey string `pulumi:"projectKey"`
	// A value of `true` indicates that this environment requires comments for flag and segment changes.
	RequireComments *bool `pulumi:"requireComments"`
	// A value of true `true` ensures a user of the client-side SDK cannot impersonate another user.
	SecureMode *bool `pulumi:"secureMode"`
	// Set of tags associated with the environment.
	Tags []string `pulumi:"tags"`
}

func LookupEnvironmentOutput(ctx *pulumi.Context, args LookupEnvironmentOutputArgs, opts ...pulumi.InvokeOption) LookupEnvironmentResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupEnvironmentResult, error) {
			args := v.(LookupEnvironmentArgs)
			r, err := LookupEnvironment(ctx, &args, opts...)
			var s LookupEnvironmentResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(LookupEnvironmentResultOutput)
}

// A collection of arguments for invoking getEnvironment.
type LookupEnvironmentOutputArgs struct {
	ApprovalSettings GetEnvironmentApprovalSettingArrayInput `pulumi:"approvalSettings"`
	// A value of `true` indicates that this environment requires confirmation for flag and segment changes.
	ConfirmChanges pulumi.BoolPtrInput `pulumi:"confirmChanges"`
	// A value of `true` enables data export for every flag created in this environment. To learn more, read [Data Export](https://docs.launchdarkly.com/docs/data-export).
	DefaultTrackEvents pulumi.BoolPtrInput `pulumi:"defaultTrackEvents"`
	// The TTL for the environment. This will be a numeric value between 0 and 60 in minutes. The TTL setting only applies to environments using the PHP SDK. To learn more, read [TTL settings](https://docs.launchdarkly.com/docs/environments#section-ttl-settings).
	DefaultTtl pulumi.IntPtrInput `pulumi:"defaultTtl"`
	// The environment's unique key.
	Key pulumi.StringInput `pulumi:"key"`
	// The environment's project key.
	ProjectKey pulumi.StringInput `pulumi:"projectKey"`
	// A value of `true` indicates that this environment requires comments for flag and segment changes.
	RequireComments pulumi.BoolPtrInput `pulumi:"requireComments"`
	// A value of true `true` ensures a user of the client-side SDK cannot impersonate another user.
	SecureMode pulumi.BoolPtrInput `pulumi:"secureMode"`
	// Set of tags associated with the environment.
	Tags pulumi.StringArrayInput `pulumi:"tags"`
}

func (LookupEnvironmentOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupEnvironmentArgs)(nil)).Elem()
}

// A collection of values returned by getEnvironment.
type LookupEnvironmentResultOutput struct{ *pulumi.OutputState }

func (LookupEnvironmentResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupEnvironmentResult)(nil)).Elem()
}

func (o LookupEnvironmentResultOutput) ToLookupEnvironmentResultOutput() LookupEnvironmentResultOutput {
	return o
}

func (o LookupEnvironmentResultOutput) ToLookupEnvironmentResultOutputWithContext(ctx context.Context) LookupEnvironmentResultOutput {
	return o
}

// The environment's SDK key.
func (o LookupEnvironmentResultOutput) ApiKey() pulumi.StringOutput {
	return o.ApplyT(func(v LookupEnvironmentResult) string { return v.ApiKey }).(pulumi.StringOutput)
}

func (o LookupEnvironmentResultOutput) ApprovalSettings() GetEnvironmentApprovalSettingArrayOutput {
	return o.ApplyT(func(v LookupEnvironmentResult) []GetEnvironmentApprovalSetting { return v.ApprovalSettings }).(GetEnvironmentApprovalSettingArrayOutput)
}

// The environment's client-side ID.
func (o LookupEnvironmentResultOutput) ClientSideId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupEnvironmentResult) string { return v.ClientSideId }).(pulumi.StringOutput)
}

// The color swatch as an RGB hex value with no leading `#`. For example: `000000`.
func (o LookupEnvironmentResultOutput) Color() pulumi.StringOutput {
	return o.ApplyT(func(v LookupEnvironmentResult) string { return v.Color }).(pulumi.StringOutput)
}

// A value of `true` indicates that this environment requires confirmation for flag and segment changes.
func (o LookupEnvironmentResultOutput) ConfirmChanges() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v LookupEnvironmentResult) *bool { return v.ConfirmChanges }).(pulumi.BoolPtrOutput)
}

// A value of `true` enables data export for every flag created in this environment. To learn more, read [Data Export](https://docs.launchdarkly.com/docs/data-export).
func (o LookupEnvironmentResultOutput) DefaultTrackEvents() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v LookupEnvironmentResult) *bool { return v.DefaultTrackEvents }).(pulumi.BoolPtrOutput)
}

// The TTL for the environment. This will be a numeric value between 0 and 60 in minutes. The TTL setting only applies to environments using the PHP SDK. To learn more, read [TTL settings](https://docs.launchdarkly.com/docs/environments#section-ttl-settings).
func (o LookupEnvironmentResultOutput) DefaultTtl() pulumi.IntPtrOutput {
	return o.ApplyT(func(v LookupEnvironmentResult) *int { return v.DefaultTtl }).(pulumi.IntPtrOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o LookupEnvironmentResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupEnvironmentResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o LookupEnvironmentResultOutput) Key() pulumi.StringOutput {
	return o.ApplyT(func(v LookupEnvironmentResult) string { return v.Key }).(pulumi.StringOutput)
}

// The environment's mobile key.
func (o LookupEnvironmentResultOutput) MobileKey() pulumi.StringOutput {
	return o.ApplyT(func(v LookupEnvironmentResult) string { return v.MobileKey }).(pulumi.StringOutput)
}

// The name of the environment.
func (o LookupEnvironmentResultOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v LookupEnvironmentResult) string { return v.Name }).(pulumi.StringOutput)
}

func (o LookupEnvironmentResultOutput) ProjectKey() pulumi.StringOutput {
	return o.ApplyT(func(v LookupEnvironmentResult) string { return v.ProjectKey }).(pulumi.StringOutput)
}

// A value of `true` indicates that this environment requires comments for flag and segment changes.
func (o LookupEnvironmentResultOutput) RequireComments() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v LookupEnvironmentResult) *bool { return v.RequireComments }).(pulumi.BoolPtrOutput)
}

// A value of true `true` ensures a user of the client-side SDK cannot impersonate another user.
func (o LookupEnvironmentResultOutput) SecureMode() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v LookupEnvironmentResult) *bool { return v.SecureMode }).(pulumi.BoolPtrOutput)
}

// Set of tags associated with the environment.
func (o LookupEnvironmentResultOutput) Tags() pulumi.StringArrayOutput {
	return o.ApplyT(func(v LookupEnvironmentResult) []string { return v.Tags }).(pulumi.StringArrayOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupEnvironmentResultOutput{})
}
