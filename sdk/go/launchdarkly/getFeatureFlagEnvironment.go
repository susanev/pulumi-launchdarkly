// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package launchdarkly

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides a LaunchDarkly environment-specific feature flag data source.
//
// This data source allows you to retrieve environment-specific feature flag information from your LaunchDarkly organization.
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
//			_, err := launchdarkly.LookupFeatureFlagEnvironment(ctx, &GetFeatureFlagEnvironmentArgs{
//				EnvKey: "example-env",
//				FlagId: "example-project/example-flag",
//			}, nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
func LookupFeatureFlagEnvironment(ctx *pulumi.Context, args *LookupFeatureFlagEnvironmentArgs, opts ...pulumi.InvokeOption) (*LookupFeatureFlagEnvironmentResult, error) {
	opts = pkgInvokeDefaultOpts(opts)
	var rv LookupFeatureFlagEnvironmentResult
	err := ctx.Invoke("launchdarkly:index/getFeatureFlagEnvironment:getFeatureFlagEnvironment", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getFeatureFlagEnvironment.
type LookupFeatureFlagEnvironmentArgs struct {
	// The environment key.
	EnvKey      string                                `pulumi:"envKey"`
	Fallthrough *GetFeatureFlagEnvironmentFallthrough `pulumi:"fallthrough"`
	// The feature flag's unique `id` in the format `project_key/flag_key`.
	FlagId string `pulumi:"flagId"`
	// The index of the variation served when targeting is disabled.
	OffVariation *int `pulumi:"offVariation"`
	// Whether targeting is enabled.
	On *bool `pulumi:"on"`
	// List of nested blocks describing prerequisite feature flags rules. To learn more, read Nested Prequisites Blocks.
	Prerequisites []GetFeatureFlagEnvironmentPrerequisite `pulumi:"prerequisites"`
	// List of logical targeting rules. To learn more, read Nested Rules Blocks.
	Rules   []GetFeatureFlagEnvironmentRule   `pulumi:"rules"`
	Targets []GetFeatureFlagEnvironmentTarget `pulumi:"targets"`
	// Whether event data will be sent back to LaunchDarkly.
	TrackEvents *bool `pulumi:"trackEvents"`
}

// A collection of values returned by getFeatureFlagEnvironment.
type LookupFeatureFlagEnvironmentResult struct {
	EnvKey      string                                `pulumi:"envKey"`
	Fallthrough *GetFeatureFlagEnvironmentFallthrough `pulumi:"fallthrough"`
	FlagId      string                                `pulumi:"flagId"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// The index of the variation served when targeting is disabled.
	OffVariation *int `pulumi:"offVariation"`
	// Whether targeting is enabled.
	On *bool `pulumi:"on"`
	// List of nested blocks describing prerequisite feature flags rules. To learn more, read Nested Prequisites Blocks.
	Prerequisites []GetFeatureFlagEnvironmentPrerequisite `pulumi:"prerequisites"`
	// List of logical targeting rules. To learn more, read Nested Rules Blocks.
	Rules   []GetFeatureFlagEnvironmentRule   `pulumi:"rules"`
	Targets []GetFeatureFlagEnvironmentTarget `pulumi:"targets"`
	// Whether event data will be sent back to LaunchDarkly.
	TrackEvents *bool `pulumi:"trackEvents"`
}

func LookupFeatureFlagEnvironmentOutput(ctx *pulumi.Context, args LookupFeatureFlagEnvironmentOutputArgs, opts ...pulumi.InvokeOption) LookupFeatureFlagEnvironmentResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupFeatureFlagEnvironmentResult, error) {
			args := v.(LookupFeatureFlagEnvironmentArgs)
			r, err := LookupFeatureFlagEnvironment(ctx, &args, opts...)
			var s LookupFeatureFlagEnvironmentResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(LookupFeatureFlagEnvironmentResultOutput)
}

// A collection of arguments for invoking getFeatureFlagEnvironment.
type LookupFeatureFlagEnvironmentOutputArgs struct {
	// The environment key.
	EnvKey      pulumi.StringInput                           `pulumi:"envKey"`
	Fallthrough GetFeatureFlagEnvironmentFallthroughPtrInput `pulumi:"fallthrough"`
	// The feature flag's unique `id` in the format `project_key/flag_key`.
	FlagId pulumi.StringInput `pulumi:"flagId"`
	// The index of the variation served when targeting is disabled.
	OffVariation pulumi.IntPtrInput `pulumi:"offVariation"`
	// Whether targeting is enabled.
	On pulumi.BoolPtrInput `pulumi:"on"`
	// List of nested blocks describing prerequisite feature flags rules. To learn more, read Nested Prequisites Blocks.
	Prerequisites GetFeatureFlagEnvironmentPrerequisiteArrayInput `pulumi:"prerequisites"`
	// List of logical targeting rules. To learn more, read Nested Rules Blocks.
	Rules   GetFeatureFlagEnvironmentRuleArrayInput   `pulumi:"rules"`
	Targets GetFeatureFlagEnvironmentTargetArrayInput `pulumi:"targets"`
	// Whether event data will be sent back to LaunchDarkly.
	TrackEvents pulumi.BoolPtrInput `pulumi:"trackEvents"`
}

func (LookupFeatureFlagEnvironmentOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupFeatureFlagEnvironmentArgs)(nil)).Elem()
}

// A collection of values returned by getFeatureFlagEnvironment.
type LookupFeatureFlagEnvironmentResultOutput struct{ *pulumi.OutputState }

func (LookupFeatureFlagEnvironmentResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupFeatureFlagEnvironmentResult)(nil)).Elem()
}

func (o LookupFeatureFlagEnvironmentResultOutput) ToLookupFeatureFlagEnvironmentResultOutput() LookupFeatureFlagEnvironmentResultOutput {
	return o
}

func (o LookupFeatureFlagEnvironmentResultOutput) ToLookupFeatureFlagEnvironmentResultOutputWithContext(ctx context.Context) LookupFeatureFlagEnvironmentResultOutput {
	return o
}

func (o LookupFeatureFlagEnvironmentResultOutput) EnvKey() pulumi.StringOutput {
	return o.ApplyT(func(v LookupFeatureFlagEnvironmentResult) string { return v.EnvKey }).(pulumi.StringOutput)
}

func (o LookupFeatureFlagEnvironmentResultOutput) Fallthrough() GetFeatureFlagEnvironmentFallthroughPtrOutput {
	return o.ApplyT(func(v LookupFeatureFlagEnvironmentResult) *GetFeatureFlagEnvironmentFallthrough { return v.Fallthrough }).(GetFeatureFlagEnvironmentFallthroughPtrOutput)
}

func (o LookupFeatureFlagEnvironmentResultOutput) FlagId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupFeatureFlagEnvironmentResult) string { return v.FlagId }).(pulumi.StringOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o LookupFeatureFlagEnvironmentResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupFeatureFlagEnvironmentResult) string { return v.Id }).(pulumi.StringOutput)
}

// The index of the variation served when targeting is disabled.
func (o LookupFeatureFlagEnvironmentResultOutput) OffVariation() pulumi.IntPtrOutput {
	return o.ApplyT(func(v LookupFeatureFlagEnvironmentResult) *int { return v.OffVariation }).(pulumi.IntPtrOutput)
}

// Whether targeting is enabled.
func (o LookupFeatureFlagEnvironmentResultOutput) On() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v LookupFeatureFlagEnvironmentResult) *bool { return v.On }).(pulumi.BoolPtrOutput)
}

// List of nested blocks describing prerequisite feature flags rules. To learn more, read Nested Prequisites Blocks.
func (o LookupFeatureFlagEnvironmentResultOutput) Prerequisites() GetFeatureFlagEnvironmentPrerequisiteArrayOutput {
	return o.ApplyT(func(v LookupFeatureFlagEnvironmentResult) []GetFeatureFlagEnvironmentPrerequisite {
		return v.Prerequisites
	}).(GetFeatureFlagEnvironmentPrerequisiteArrayOutput)
}

// List of logical targeting rules. To learn more, read Nested Rules Blocks.
func (o LookupFeatureFlagEnvironmentResultOutput) Rules() GetFeatureFlagEnvironmentRuleArrayOutput {
	return o.ApplyT(func(v LookupFeatureFlagEnvironmentResult) []GetFeatureFlagEnvironmentRule { return v.Rules }).(GetFeatureFlagEnvironmentRuleArrayOutput)
}

func (o LookupFeatureFlagEnvironmentResultOutput) Targets() GetFeatureFlagEnvironmentTargetArrayOutput {
	return o.ApplyT(func(v LookupFeatureFlagEnvironmentResult) []GetFeatureFlagEnvironmentTarget { return v.Targets }).(GetFeatureFlagEnvironmentTargetArrayOutput)
}

// Whether event data will be sent back to LaunchDarkly.
func (o LookupFeatureFlagEnvironmentResultOutput) TrackEvents() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v LookupFeatureFlagEnvironmentResult) *bool { return v.TrackEvents }).(pulumi.BoolPtrOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupFeatureFlagEnvironmentResultOutput{})
}
