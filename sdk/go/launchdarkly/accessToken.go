// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package launchdarkly

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// ## Example Usage
//
// Resource must contain either a `role`, `customRole` or an `inlineRoles` (previously `policyStatements`) block. As of v1.7.0, `policyStatements` has been deprecated in favor of `inlineRoles`.
//
// # With a built-in role
//
// ```go
// package main
//
// import (
//
//	"github.com/lbrlabs/pulumi-launchdarkly/sdk/go/launchdarkly"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := launchdarkly.NewAccessToken(ctx, "readerToken", &launchdarkly.AccessTokenArgs{
//				Role: pulumi.String("reader"),
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
// # With a custom role
//
// ```go
// package main
//
// import (
//
//	"github.com/lbrlabs/pulumi-launchdarkly/sdk/go/launchdarkly"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := launchdarkly.NewAccessToken(ctx, "customRoleToken", &launchdarkly.AccessTokenArgs{
//				CustomRoles: pulumi.StringArray{
//					pulumi.String("ops"),
//				},
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
// With an inline custom role (policy statements)
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
//			_, err := launchdarkly.NewAccessToken(ctx, "tokenWithPolicyStatements", &launchdarkly.AccessTokenArgs{
//				InlineRoles: AccessTokenInlineRoleArray{
//					&AccessTokenInlineRoleArgs{
//						Actions: pulumi.StringArray{
//							pulumi.String("*"),
//						},
//						Effect: pulumi.String("deny"),
//						Resources: pulumi.StringArray{
//							pulumi.String("proj/*:env/production"),
//						},
//					},
//				},
//				ServiceToken: pulumi.Bool(true),
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
type AccessToken struct {
	pulumi.CustomResourceState

	// A list of custom role IDs to use as access limits for the access token
	CustomRoles pulumi.StringArrayOutput `pulumi:"customRoles"`
	// The default API version for this token. Defaults to the latest API version.
	DefaultApiVersion pulumi.IntOutput `pulumi:"defaultApiVersion"`
	// An expiration time for the current token secret, expressed as a Unix epoch time. Replace the computed token secret with a new value. The expired secret will no longer be able to authorize usage of the LaunchDarkly API. This field argument is **deprecated**. Please update your config to remove `expire` to maintain compatibility with future versions.
	//
	// Deprecated: 'expire' is deprecated and will be removed in the next major release of the LaunchDarly provider
	Expire pulumi.IntPtrOutput `pulumi:"expire"`
	// An array of statements represented as config blocks with 3 attributes: effect, resources, actions. May be used in place
	// of a built-in or custom role.
	InlineRoles AccessTokenInlineRoleArrayOutput `pulumi:"inlineRoles"`
	// A human-friendly name for the access token.
	Name pulumi.StringOutput `pulumi:"name"`
	// Define inline custom roles. An array of statements represented as config blocks with 3 attributes: effect, resources, actions. May be used in place of a built-in or custom role. [Policies in custom roles](https://docs.launchdarkly.com/docs/policies-in-custom-roles). May be specified more than once. This field argument is **deprecated**. Please update your config to use `inlineRole` to maintain compatibility with future versions.
	//
	// Deprecated: 'policy_statements' is deprecated in favor of 'inline_roles'. This field will be removed in the next major release of the LaunchDarkly provider
	PolicyStatements AccessTokenPolicyStatementArrayOutput `pulumi:"policyStatements"`
	// A built-in LaunchDarkly role. Can be `reader`, `writer`, or `admin`
	Role pulumi.StringPtrOutput `pulumi:"role"`
	// Whether the token will be a [service token](https://docs.launchdarkly.com/home/account-security/api-access-tokens#service-tokens)
	ServiceToken pulumi.BoolPtrOutput `pulumi:"serviceToken"`
	// The access token used to authorize usage of the LaunchDarkly API.
	Token pulumi.StringOutput `pulumi:"token"`
}

// NewAccessToken registers a new resource with the given unique name, arguments, and options.
func NewAccessToken(ctx *pulumi.Context,
	name string, args *AccessTokenArgs, opts ...pulumi.ResourceOption) (*AccessToken, error) {
	if args == nil {
		args = &AccessTokenArgs{}
	}

	opts = pkgResourceDefaultOpts(opts)
	var resource AccessToken
	err := ctx.RegisterResource("launchdarkly:index/accessToken:AccessToken", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetAccessToken gets an existing AccessToken resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetAccessToken(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *AccessTokenState, opts ...pulumi.ResourceOption) (*AccessToken, error) {
	var resource AccessToken
	err := ctx.ReadResource("launchdarkly:index/accessToken:AccessToken", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering AccessToken resources.
type accessTokenState struct {
	// A list of custom role IDs to use as access limits for the access token
	CustomRoles []string `pulumi:"customRoles"`
	// The default API version for this token. Defaults to the latest API version.
	DefaultApiVersion *int `pulumi:"defaultApiVersion"`
	// An expiration time for the current token secret, expressed as a Unix epoch time. Replace the computed token secret with a new value. The expired secret will no longer be able to authorize usage of the LaunchDarkly API. This field argument is **deprecated**. Please update your config to remove `expire` to maintain compatibility with future versions.
	//
	// Deprecated: 'expire' is deprecated and will be removed in the next major release of the LaunchDarly provider
	Expire *int `pulumi:"expire"`
	// An array of statements represented as config blocks with 3 attributes: effect, resources, actions. May be used in place
	// of a built-in or custom role.
	InlineRoles []AccessTokenInlineRole `pulumi:"inlineRoles"`
	// A human-friendly name for the access token.
	Name *string `pulumi:"name"`
	// Define inline custom roles. An array of statements represented as config blocks with 3 attributes: effect, resources, actions. May be used in place of a built-in or custom role. [Policies in custom roles](https://docs.launchdarkly.com/docs/policies-in-custom-roles). May be specified more than once. This field argument is **deprecated**. Please update your config to use `inlineRole` to maintain compatibility with future versions.
	//
	// Deprecated: 'policy_statements' is deprecated in favor of 'inline_roles'. This field will be removed in the next major release of the LaunchDarkly provider
	PolicyStatements []AccessTokenPolicyStatement `pulumi:"policyStatements"`
	// A built-in LaunchDarkly role. Can be `reader`, `writer`, or `admin`
	Role *string `pulumi:"role"`
	// Whether the token will be a [service token](https://docs.launchdarkly.com/home/account-security/api-access-tokens#service-tokens)
	ServiceToken *bool `pulumi:"serviceToken"`
	// The access token used to authorize usage of the LaunchDarkly API.
	Token *string `pulumi:"token"`
}

type AccessTokenState struct {
	// A list of custom role IDs to use as access limits for the access token
	CustomRoles pulumi.StringArrayInput
	// The default API version for this token. Defaults to the latest API version.
	DefaultApiVersion pulumi.IntPtrInput
	// An expiration time for the current token secret, expressed as a Unix epoch time. Replace the computed token secret with a new value. The expired secret will no longer be able to authorize usage of the LaunchDarkly API. This field argument is **deprecated**. Please update your config to remove `expire` to maintain compatibility with future versions.
	//
	// Deprecated: 'expire' is deprecated and will be removed in the next major release of the LaunchDarly provider
	Expire pulumi.IntPtrInput
	// An array of statements represented as config blocks with 3 attributes: effect, resources, actions. May be used in place
	// of a built-in or custom role.
	InlineRoles AccessTokenInlineRoleArrayInput
	// A human-friendly name for the access token.
	Name pulumi.StringPtrInput
	// Define inline custom roles. An array of statements represented as config blocks with 3 attributes: effect, resources, actions. May be used in place of a built-in or custom role. [Policies in custom roles](https://docs.launchdarkly.com/docs/policies-in-custom-roles). May be specified more than once. This field argument is **deprecated**. Please update your config to use `inlineRole` to maintain compatibility with future versions.
	//
	// Deprecated: 'policy_statements' is deprecated in favor of 'inline_roles'. This field will be removed in the next major release of the LaunchDarkly provider
	PolicyStatements AccessTokenPolicyStatementArrayInput
	// A built-in LaunchDarkly role. Can be `reader`, `writer`, or `admin`
	Role pulumi.StringPtrInput
	// Whether the token will be a [service token](https://docs.launchdarkly.com/home/account-security/api-access-tokens#service-tokens)
	ServiceToken pulumi.BoolPtrInput
	// The access token used to authorize usage of the LaunchDarkly API.
	Token pulumi.StringPtrInput
}

func (AccessTokenState) ElementType() reflect.Type {
	return reflect.TypeOf((*accessTokenState)(nil)).Elem()
}

type accessTokenArgs struct {
	// A list of custom role IDs to use as access limits for the access token
	CustomRoles []string `pulumi:"customRoles"`
	// The default API version for this token. Defaults to the latest API version.
	DefaultApiVersion *int `pulumi:"defaultApiVersion"`
	// An expiration time for the current token secret, expressed as a Unix epoch time. Replace the computed token secret with a new value. The expired secret will no longer be able to authorize usage of the LaunchDarkly API. This field argument is **deprecated**. Please update your config to remove `expire` to maintain compatibility with future versions.
	//
	// Deprecated: 'expire' is deprecated and will be removed in the next major release of the LaunchDarly provider
	Expire *int `pulumi:"expire"`
	// An array of statements represented as config blocks with 3 attributes: effect, resources, actions. May be used in place
	// of a built-in or custom role.
	InlineRoles []AccessTokenInlineRole `pulumi:"inlineRoles"`
	// A human-friendly name for the access token.
	Name *string `pulumi:"name"`
	// Define inline custom roles. An array of statements represented as config blocks with 3 attributes: effect, resources, actions. May be used in place of a built-in or custom role. [Policies in custom roles](https://docs.launchdarkly.com/docs/policies-in-custom-roles). May be specified more than once. This field argument is **deprecated**. Please update your config to use `inlineRole` to maintain compatibility with future versions.
	//
	// Deprecated: 'policy_statements' is deprecated in favor of 'inline_roles'. This field will be removed in the next major release of the LaunchDarkly provider
	PolicyStatements []AccessTokenPolicyStatement `pulumi:"policyStatements"`
	// A built-in LaunchDarkly role. Can be `reader`, `writer`, or `admin`
	Role *string `pulumi:"role"`
	// Whether the token will be a [service token](https://docs.launchdarkly.com/home/account-security/api-access-tokens#service-tokens)
	ServiceToken *bool `pulumi:"serviceToken"`
}

// The set of arguments for constructing a AccessToken resource.
type AccessTokenArgs struct {
	// A list of custom role IDs to use as access limits for the access token
	CustomRoles pulumi.StringArrayInput
	// The default API version for this token. Defaults to the latest API version.
	DefaultApiVersion pulumi.IntPtrInput
	// An expiration time for the current token secret, expressed as a Unix epoch time. Replace the computed token secret with a new value. The expired secret will no longer be able to authorize usage of the LaunchDarkly API. This field argument is **deprecated**. Please update your config to remove `expire` to maintain compatibility with future versions.
	//
	// Deprecated: 'expire' is deprecated and will be removed in the next major release of the LaunchDarly provider
	Expire pulumi.IntPtrInput
	// An array of statements represented as config blocks with 3 attributes: effect, resources, actions. May be used in place
	// of a built-in or custom role.
	InlineRoles AccessTokenInlineRoleArrayInput
	// A human-friendly name for the access token.
	Name pulumi.StringPtrInput
	// Define inline custom roles. An array of statements represented as config blocks with 3 attributes: effect, resources, actions. May be used in place of a built-in or custom role. [Policies in custom roles](https://docs.launchdarkly.com/docs/policies-in-custom-roles). May be specified more than once. This field argument is **deprecated**. Please update your config to use `inlineRole` to maintain compatibility with future versions.
	//
	// Deprecated: 'policy_statements' is deprecated in favor of 'inline_roles'. This field will be removed in the next major release of the LaunchDarkly provider
	PolicyStatements AccessTokenPolicyStatementArrayInput
	// A built-in LaunchDarkly role. Can be `reader`, `writer`, or `admin`
	Role pulumi.StringPtrInput
	// Whether the token will be a [service token](https://docs.launchdarkly.com/home/account-security/api-access-tokens#service-tokens)
	ServiceToken pulumi.BoolPtrInput
}

func (AccessTokenArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*accessTokenArgs)(nil)).Elem()
}

type AccessTokenInput interface {
	pulumi.Input

	ToAccessTokenOutput() AccessTokenOutput
	ToAccessTokenOutputWithContext(ctx context.Context) AccessTokenOutput
}

func (*AccessToken) ElementType() reflect.Type {
	return reflect.TypeOf((**AccessToken)(nil)).Elem()
}

func (i *AccessToken) ToAccessTokenOutput() AccessTokenOutput {
	return i.ToAccessTokenOutputWithContext(context.Background())
}

func (i *AccessToken) ToAccessTokenOutputWithContext(ctx context.Context) AccessTokenOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AccessTokenOutput)
}

// AccessTokenArrayInput is an input type that accepts AccessTokenArray and AccessTokenArrayOutput values.
// You can construct a concrete instance of `AccessTokenArrayInput` via:
//
//	AccessTokenArray{ AccessTokenArgs{...} }
type AccessTokenArrayInput interface {
	pulumi.Input

	ToAccessTokenArrayOutput() AccessTokenArrayOutput
	ToAccessTokenArrayOutputWithContext(context.Context) AccessTokenArrayOutput
}

type AccessTokenArray []AccessTokenInput

func (AccessTokenArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*AccessToken)(nil)).Elem()
}

func (i AccessTokenArray) ToAccessTokenArrayOutput() AccessTokenArrayOutput {
	return i.ToAccessTokenArrayOutputWithContext(context.Background())
}

func (i AccessTokenArray) ToAccessTokenArrayOutputWithContext(ctx context.Context) AccessTokenArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AccessTokenArrayOutput)
}

// AccessTokenMapInput is an input type that accepts AccessTokenMap and AccessTokenMapOutput values.
// You can construct a concrete instance of `AccessTokenMapInput` via:
//
//	AccessTokenMap{ "key": AccessTokenArgs{...} }
type AccessTokenMapInput interface {
	pulumi.Input

	ToAccessTokenMapOutput() AccessTokenMapOutput
	ToAccessTokenMapOutputWithContext(context.Context) AccessTokenMapOutput
}

type AccessTokenMap map[string]AccessTokenInput

func (AccessTokenMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*AccessToken)(nil)).Elem()
}

func (i AccessTokenMap) ToAccessTokenMapOutput() AccessTokenMapOutput {
	return i.ToAccessTokenMapOutputWithContext(context.Background())
}

func (i AccessTokenMap) ToAccessTokenMapOutputWithContext(ctx context.Context) AccessTokenMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AccessTokenMapOutput)
}

type AccessTokenOutput struct{ *pulumi.OutputState }

func (AccessTokenOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**AccessToken)(nil)).Elem()
}

func (o AccessTokenOutput) ToAccessTokenOutput() AccessTokenOutput {
	return o
}

func (o AccessTokenOutput) ToAccessTokenOutputWithContext(ctx context.Context) AccessTokenOutput {
	return o
}

// A list of custom role IDs to use as access limits for the access token
func (o AccessTokenOutput) CustomRoles() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *AccessToken) pulumi.StringArrayOutput { return v.CustomRoles }).(pulumi.StringArrayOutput)
}

// The default API version for this token. Defaults to the latest API version.
func (o AccessTokenOutput) DefaultApiVersion() pulumi.IntOutput {
	return o.ApplyT(func(v *AccessToken) pulumi.IntOutput { return v.DefaultApiVersion }).(pulumi.IntOutput)
}

// An expiration time for the current token secret, expressed as a Unix epoch time. Replace the computed token secret with a new value. The expired secret will no longer be able to authorize usage of the LaunchDarkly API. This field argument is **deprecated**. Please update your config to remove `expire` to maintain compatibility with future versions.
//
// Deprecated: 'expire' is deprecated and will be removed in the next major release of the LaunchDarly provider
func (o AccessTokenOutput) Expire() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *AccessToken) pulumi.IntPtrOutput { return v.Expire }).(pulumi.IntPtrOutput)
}

// An array of statements represented as config blocks with 3 attributes: effect, resources, actions. May be used in place
// of a built-in or custom role.
func (o AccessTokenOutput) InlineRoles() AccessTokenInlineRoleArrayOutput {
	return o.ApplyT(func(v *AccessToken) AccessTokenInlineRoleArrayOutput { return v.InlineRoles }).(AccessTokenInlineRoleArrayOutput)
}

// A human-friendly name for the access token.
func (o AccessTokenOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *AccessToken) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// Define inline custom roles. An array of statements represented as config blocks with 3 attributes: effect, resources, actions. May be used in place of a built-in or custom role. [Policies in custom roles](https://docs.launchdarkly.com/docs/policies-in-custom-roles). May be specified more than once. This field argument is **deprecated**. Please update your config to use `inlineRole` to maintain compatibility with future versions.
//
// Deprecated: 'policy_statements' is deprecated in favor of 'inline_roles'. This field will be removed in the next major release of the LaunchDarkly provider
func (o AccessTokenOutput) PolicyStatements() AccessTokenPolicyStatementArrayOutput {
	return o.ApplyT(func(v *AccessToken) AccessTokenPolicyStatementArrayOutput { return v.PolicyStatements }).(AccessTokenPolicyStatementArrayOutput)
}

// A built-in LaunchDarkly role. Can be `reader`, `writer`, or `admin`
func (o AccessTokenOutput) Role() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *AccessToken) pulumi.StringPtrOutput { return v.Role }).(pulumi.StringPtrOutput)
}

// Whether the token will be a [service token](https://docs.launchdarkly.com/home/account-security/api-access-tokens#service-tokens)
func (o AccessTokenOutput) ServiceToken() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *AccessToken) pulumi.BoolPtrOutput { return v.ServiceToken }).(pulumi.BoolPtrOutput)
}

// The access token used to authorize usage of the LaunchDarkly API.
func (o AccessTokenOutput) Token() pulumi.StringOutput {
	return o.ApplyT(func(v *AccessToken) pulumi.StringOutput { return v.Token }).(pulumi.StringOutput)
}

type AccessTokenArrayOutput struct{ *pulumi.OutputState }

func (AccessTokenArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*AccessToken)(nil)).Elem()
}

func (o AccessTokenArrayOutput) ToAccessTokenArrayOutput() AccessTokenArrayOutput {
	return o
}

func (o AccessTokenArrayOutput) ToAccessTokenArrayOutputWithContext(ctx context.Context) AccessTokenArrayOutput {
	return o
}

func (o AccessTokenArrayOutput) Index(i pulumi.IntInput) AccessTokenOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *AccessToken {
		return vs[0].([]*AccessToken)[vs[1].(int)]
	}).(AccessTokenOutput)
}

type AccessTokenMapOutput struct{ *pulumi.OutputState }

func (AccessTokenMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*AccessToken)(nil)).Elem()
}

func (o AccessTokenMapOutput) ToAccessTokenMapOutput() AccessTokenMapOutput {
	return o
}

func (o AccessTokenMapOutput) ToAccessTokenMapOutputWithContext(ctx context.Context) AccessTokenMapOutput {
	return o
}

func (o AccessTokenMapOutput) MapIndex(k pulumi.StringInput) AccessTokenOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *AccessToken {
		return vs[0].(map[string]*AccessToken)[vs[1].(string)]
	}).(AccessTokenOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*AccessTokenInput)(nil)).Elem(), &AccessToken{})
	pulumi.RegisterInputType(reflect.TypeOf((*AccessTokenArrayInput)(nil)).Elem(), AccessTokenArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*AccessTokenMapInput)(nil)).Elem(), AccessTokenMap{})
	pulumi.RegisterOutputType(AccessTokenOutput{})
	pulumi.RegisterOutputType(AccessTokenArrayOutput{})
	pulumi.RegisterOutputType(AccessTokenMapOutput{})
}
