// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package launchdarkly

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides a LaunchDarkly segment resource.
//
// This resource allows you to create and manage segments within your LaunchDarkly organization.
//
// ## Example Usage
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
//			_, err := launchdarkly.NewSegment(ctx, "example", &launchdarkly.SegmentArgs{
//				Key:         pulumi.String("example-segment-key"),
//				ProjectKey:  pulumi.Any(launchdarkly_project.Example.Key),
//				EnvKey:      pulumi.Any(launchdarkly_environment.Example.Key),
//				Description: pulumi.String("This segment is managed by Terraform"),
//				Tags: pulumi.StringArray{
//					pulumi.String("segment-tag-1"),
//					pulumi.String("segment-tag-2"),
//				},
//				Includeds: pulumi.StringArray{
//					pulumi.String("user1"),
//					pulumi.String("user2"),
//				},
//				Excludeds: pulumi.StringArray{
//					pulumi.String("user3"),
//					pulumi.String("user4"),
//				},
//				Rules: SegmentRuleArray{
//					&SegmentRuleArgs{
//						Clauses: SegmentRuleClauseArray{
//							&SegmentRuleClauseArgs{
//								Attribute: pulumi.String("country"),
//								Op:        pulumi.String("startsWith"),
//								Values: pulumi.StringArray{
//									pulumi.String("en"),
//									pulumi.String("de"),
//									pulumi.String("un"),
//								},
//								Negate: pulumi.Bool(false),
//							},
//						},
//					},
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
// ## Import
//
// LaunchDarkly segments can be imported using the segment's ID in the form `project_key/env_key/segment_key`, e.g.
//
// ```sh
//
//	$ pulumi import launchdarkly:index/segment:Segment example example-project/example-environment/example-segment-key
//
// ```
type Segment struct {
	pulumi.CustomResourceState

	// The segment's creation date represented as a UNIX epoch timestamp.
	CreationDate pulumi.IntOutput `pulumi:"creationDate"`
	// The description of the segment's purpose.
	Description pulumi.StringPtrOutput `pulumi:"description"`
	// The segment's environment key.
	EnvKey pulumi.StringOutput `pulumi:"envKey"`
	// List of user keys excluded from the segment.
	Excludeds pulumi.StringArrayOutput `pulumi:"excludeds"`
	// List of user keys included in the segment.
	Includeds pulumi.StringArrayOutput `pulumi:"includeds"`
	// The unique key that references the segment.
	Key pulumi.StringOutput `pulumi:"key"`
	// The human-friendly name for the segment.
	Name pulumi.StringOutput `pulumi:"name"`
	// The segment's project key.
	ProjectKey pulumi.StringOutput `pulumi:"projectKey"`
	// List of nested custom rule blocks to apply to the segment. To learn more, read Nested Rules Blocks.
	Rules SegmentRuleArrayOutput `pulumi:"rules"`
	// Set of tags for the segment.
	Tags pulumi.StringArrayOutput `pulumi:"tags"`
}

// NewSegment registers a new resource with the given unique name, arguments, and options.
func NewSegment(ctx *pulumi.Context,
	name string, args *SegmentArgs, opts ...pulumi.ResourceOption) (*Segment, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.EnvKey == nil {
		return nil, errors.New("invalid value for required argument 'EnvKey'")
	}
	if args.Key == nil {
		return nil, errors.New("invalid value for required argument 'Key'")
	}
	if args.ProjectKey == nil {
		return nil, errors.New("invalid value for required argument 'ProjectKey'")
	}
	opts = pkgResourceDefaultOpts(opts)
	var resource Segment
	err := ctx.RegisterResource("launchdarkly:index/segment:Segment", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetSegment gets an existing Segment resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetSegment(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *SegmentState, opts ...pulumi.ResourceOption) (*Segment, error) {
	var resource Segment
	err := ctx.ReadResource("launchdarkly:index/segment:Segment", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Segment resources.
type segmentState struct {
	// The segment's creation date represented as a UNIX epoch timestamp.
	CreationDate *int `pulumi:"creationDate"`
	// The description of the segment's purpose.
	Description *string `pulumi:"description"`
	// The segment's environment key.
	EnvKey *string `pulumi:"envKey"`
	// List of user keys excluded from the segment.
	Excludeds []string `pulumi:"excludeds"`
	// List of user keys included in the segment.
	Includeds []string `pulumi:"includeds"`
	// The unique key that references the segment.
	Key *string `pulumi:"key"`
	// The human-friendly name for the segment.
	Name *string `pulumi:"name"`
	// The segment's project key.
	ProjectKey *string `pulumi:"projectKey"`
	// List of nested custom rule blocks to apply to the segment. To learn more, read Nested Rules Blocks.
	Rules []SegmentRule `pulumi:"rules"`
	// Set of tags for the segment.
	Tags []string `pulumi:"tags"`
}

type SegmentState struct {
	// The segment's creation date represented as a UNIX epoch timestamp.
	CreationDate pulumi.IntPtrInput
	// The description of the segment's purpose.
	Description pulumi.StringPtrInput
	// The segment's environment key.
	EnvKey pulumi.StringPtrInput
	// List of user keys excluded from the segment.
	Excludeds pulumi.StringArrayInput
	// List of user keys included in the segment.
	Includeds pulumi.StringArrayInput
	// The unique key that references the segment.
	Key pulumi.StringPtrInput
	// The human-friendly name for the segment.
	Name pulumi.StringPtrInput
	// The segment's project key.
	ProjectKey pulumi.StringPtrInput
	// List of nested custom rule blocks to apply to the segment. To learn more, read Nested Rules Blocks.
	Rules SegmentRuleArrayInput
	// Set of tags for the segment.
	Tags pulumi.StringArrayInput
}

func (SegmentState) ElementType() reflect.Type {
	return reflect.TypeOf((*segmentState)(nil)).Elem()
}

type segmentArgs struct {
	// The description of the segment's purpose.
	Description *string `pulumi:"description"`
	// The segment's environment key.
	EnvKey string `pulumi:"envKey"`
	// List of user keys excluded from the segment.
	Excludeds []string `pulumi:"excludeds"`
	// List of user keys included in the segment.
	Includeds []string `pulumi:"includeds"`
	// The unique key that references the segment.
	Key string `pulumi:"key"`
	// The human-friendly name for the segment.
	Name *string `pulumi:"name"`
	// The segment's project key.
	ProjectKey string `pulumi:"projectKey"`
	// List of nested custom rule blocks to apply to the segment. To learn more, read Nested Rules Blocks.
	Rules []SegmentRule `pulumi:"rules"`
	// Set of tags for the segment.
	Tags []string `pulumi:"tags"`
}

// The set of arguments for constructing a Segment resource.
type SegmentArgs struct {
	// The description of the segment's purpose.
	Description pulumi.StringPtrInput
	// The segment's environment key.
	EnvKey pulumi.StringInput
	// List of user keys excluded from the segment.
	Excludeds pulumi.StringArrayInput
	// List of user keys included in the segment.
	Includeds pulumi.StringArrayInput
	// The unique key that references the segment.
	Key pulumi.StringInput
	// The human-friendly name for the segment.
	Name pulumi.StringPtrInput
	// The segment's project key.
	ProjectKey pulumi.StringInput
	// List of nested custom rule blocks to apply to the segment. To learn more, read Nested Rules Blocks.
	Rules SegmentRuleArrayInput
	// Set of tags for the segment.
	Tags pulumi.StringArrayInput
}

func (SegmentArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*segmentArgs)(nil)).Elem()
}

type SegmentInput interface {
	pulumi.Input

	ToSegmentOutput() SegmentOutput
	ToSegmentOutputWithContext(ctx context.Context) SegmentOutput
}

func (*Segment) ElementType() reflect.Type {
	return reflect.TypeOf((**Segment)(nil)).Elem()
}

func (i *Segment) ToSegmentOutput() SegmentOutput {
	return i.ToSegmentOutputWithContext(context.Background())
}

func (i *Segment) ToSegmentOutputWithContext(ctx context.Context) SegmentOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SegmentOutput)
}

// SegmentArrayInput is an input type that accepts SegmentArray and SegmentArrayOutput values.
// You can construct a concrete instance of `SegmentArrayInput` via:
//
//	SegmentArray{ SegmentArgs{...} }
type SegmentArrayInput interface {
	pulumi.Input

	ToSegmentArrayOutput() SegmentArrayOutput
	ToSegmentArrayOutputWithContext(context.Context) SegmentArrayOutput
}

type SegmentArray []SegmentInput

func (SegmentArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Segment)(nil)).Elem()
}

func (i SegmentArray) ToSegmentArrayOutput() SegmentArrayOutput {
	return i.ToSegmentArrayOutputWithContext(context.Background())
}

func (i SegmentArray) ToSegmentArrayOutputWithContext(ctx context.Context) SegmentArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SegmentArrayOutput)
}

// SegmentMapInput is an input type that accepts SegmentMap and SegmentMapOutput values.
// You can construct a concrete instance of `SegmentMapInput` via:
//
//	SegmentMap{ "key": SegmentArgs{...} }
type SegmentMapInput interface {
	pulumi.Input

	ToSegmentMapOutput() SegmentMapOutput
	ToSegmentMapOutputWithContext(context.Context) SegmentMapOutput
}

type SegmentMap map[string]SegmentInput

func (SegmentMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Segment)(nil)).Elem()
}

func (i SegmentMap) ToSegmentMapOutput() SegmentMapOutput {
	return i.ToSegmentMapOutputWithContext(context.Background())
}

func (i SegmentMap) ToSegmentMapOutputWithContext(ctx context.Context) SegmentMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SegmentMapOutput)
}

type SegmentOutput struct{ *pulumi.OutputState }

func (SegmentOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Segment)(nil)).Elem()
}

func (o SegmentOutput) ToSegmentOutput() SegmentOutput {
	return o
}

func (o SegmentOutput) ToSegmentOutputWithContext(ctx context.Context) SegmentOutput {
	return o
}

// The segment's creation date represented as a UNIX epoch timestamp.
func (o SegmentOutput) CreationDate() pulumi.IntOutput {
	return o.ApplyT(func(v *Segment) pulumi.IntOutput { return v.CreationDate }).(pulumi.IntOutput)
}

// The description of the segment's purpose.
func (o SegmentOutput) Description() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Segment) pulumi.StringPtrOutput { return v.Description }).(pulumi.StringPtrOutput)
}

// The segment's environment key.
func (o SegmentOutput) EnvKey() pulumi.StringOutput {
	return o.ApplyT(func(v *Segment) pulumi.StringOutput { return v.EnvKey }).(pulumi.StringOutput)
}

// List of user keys excluded from the segment.
func (o SegmentOutput) Excludeds() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *Segment) pulumi.StringArrayOutput { return v.Excludeds }).(pulumi.StringArrayOutput)
}

// List of user keys included in the segment.
func (o SegmentOutput) Includeds() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *Segment) pulumi.StringArrayOutput { return v.Includeds }).(pulumi.StringArrayOutput)
}

// The unique key that references the segment.
func (o SegmentOutput) Key() pulumi.StringOutput {
	return o.ApplyT(func(v *Segment) pulumi.StringOutput { return v.Key }).(pulumi.StringOutput)
}

// The human-friendly name for the segment.
func (o SegmentOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *Segment) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// The segment's project key.
func (o SegmentOutput) ProjectKey() pulumi.StringOutput {
	return o.ApplyT(func(v *Segment) pulumi.StringOutput { return v.ProjectKey }).(pulumi.StringOutput)
}

// List of nested custom rule blocks to apply to the segment. To learn more, read Nested Rules Blocks.
func (o SegmentOutput) Rules() SegmentRuleArrayOutput {
	return o.ApplyT(func(v *Segment) SegmentRuleArrayOutput { return v.Rules }).(SegmentRuleArrayOutput)
}

// Set of tags for the segment.
func (o SegmentOutput) Tags() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *Segment) pulumi.StringArrayOutput { return v.Tags }).(pulumi.StringArrayOutput)
}

type SegmentArrayOutput struct{ *pulumi.OutputState }

func (SegmentArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Segment)(nil)).Elem()
}

func (o SegmentArrayOutput) ToSegmentArrayOutput() SegmentArrayOutput {
	return o
}

func (o SegmentArrayOutput) ToSegmentArrayOutputWithContext(ctx context.Context) SegmentArrayOutput {
	return o
}

func (o SegmentArrayOutput) Index(i pulumi.IntInput) SegmentOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *Segment {
		return vs[0].([]*Segment)[vs[1].(int)]
	}).(SegmentOutput)
}

type SegmentMapOutput struct{ *pulumi.OutputState }

func (SegmentMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Segment)(nil)).Elem()
}

func (o SegmentMapOutput) ToSegmentMapOutput() SegmentMapOutput {
	return o
}

func (o SegmentMapOutput) ToSegmentMapOutputWithContext(ctx context.Context) SegmentMapOutput {
	return o
}

func (o SegmentMapOutput) MapIndex(k pulumi.StringInput) SegmentOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *Segment {
		return vs[0].(map[string]*Segment)[vs[1].(string)]
	}).(SegmentOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*SegmentInput)(nil)).Elem(), &Segment{})
	pulumi.RegisterInputType(reflect.TypeOf((*SegmentArrayInput)(nil)).Elem(), SegmentArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*SegmentMapInput)(nil)).Elem(), SegmentMap{})
	pulumi.RegisterOutputType(SegmentOutput{})
	pulumi.RegisterOutputType(SegmentArrayOutput{})
	pulumi.RegisterOutputType(SegmentMapOutput{})
}
