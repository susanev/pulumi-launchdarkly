// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package launchdarkly

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides a LaunchDarkly project resource.
//
// This resource allows you to create and manage projects within your LaunchDarkly organization.
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
//			_, err := launchdarkly.NewProject(ctx, "example", &launchdarkly.ProjectArgs{
//				Environments: ProjectEnvironmentArray{
//					&ProjectEnvironmentArgs{
//						ApprovalSettings: ProjectEnvironmentApprovalSettingArray{
//							&ProjectEnvironmentApprovalSettingArgs{
//								CanApplyDeclinedChanges: pulumi.Bool(false),
//								CanReviewOwnRequest:     pulumi.Bool(false),
//								MinNumApprovals:         pulumi.Int(3),
//								RequiredApprovalTags: pulumi.StringArray{
//									pulumi.String("approvals_required"),
//								},
//							},
//						},
//						Color: pulumi.String("EEEEEE"),
//						Key:   pulumi.String("production"),
//						Name:  pulumi.String("Production"),
//						Tags: pulumi.StringArray{
//							pulumi.String("terraform"),
//						},
//					},
//					&ProjectEnvironmentArgs{
//						Color: pulumi.String("000000"),
//						Key:   pulumi.String("staging"),
//						Name:  pulumi.String("Staging"),
//						Tags: pulumi.StringArray{
//							pulumi.String("terraform"),
//						},
//					},
//				},
//				Key: pulumi.String("example-project"),
//				Tags: pulumi.StringArray{
//					pulumi.String("terraform"),
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
// LaunchDarkly projects can be imported using the project's key, e.g.
//
// ```sh
//
//	$ pulumi import launchdarkly:index/project:Project example example-project
//
// ```
//
//	**IMPORTANT:** Please note that, regardless of how many `environments` blocks you include on your import, _all_ of the project's environments will be saved to the Terraform state and will update with subsequent applies. This means that any environments not included in your import configuration will be torn down with any subsequent apply. If you wish to manage project properties with Terraform but not nested environments consider using Terraform's [ignore changes](https://www.terraform.io/docs/language/meta-arguments/lifecycle.html#ignore_changes) lifecycle meta-argument; see below for example. resource "launchdarkly_project" "example" { 		lifecycle { 			ignore_changes = [environments] 		} 		name = "testProject" 		key = "%s" 		# environments not included on this configuration will not be affected by subsequent applies 	} Managing environment resources with Terraform should always be done on the project unless the project is not also managed with Terraform.
type Project struct {
	pulumi.CustomResourceState

	// List of nested `environments` blocks describing LaunchDarkly environments that belong to the project
	Environments ProjectEnvironmentArrayOutput `pulumi:"environments"`
	// Whether feature flags created under the project should be available to client-side SDKs by default
	IncludeInSnippet pulumi.BoolPtrOutput `pulumi:"includeInSnippet"`
	// The project's unique key.
	Key pulumi.StringOutput `pulumi:"key"`
	// The project's name.
	Name pulumi.StringOutput `pulumi:"name"`
	// The project's set of tags.
	Tags pulumi.StringArrayOutput `pulumi:"tags"`
}

// NewProject registers a new resource with the given unique name, arguments, and options.
func NewProject(ctx *pulumi.Context,
	name string, args *ProjectArgs, opts ...pulumi.ResourceOption) (*Project, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Environments == nil {
		return nil, errors.New("invalid value for required argument 'Environments'")
	}
	if args.Key == nil {
		return nil, errors.New("invalid value for required argument 'Key'")
	}
	opts = pkgResourceDefaultOpts(opts)
	var resource Project
	err := ctx.RegisterResource("launchdarkly:index/project:Project", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetProject gets an existing Project resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetProject(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *ProjectState, opts ...pulumi.ResourceOption) (*Project, error) {
	var resource Project
	err := ctx.ReadResource("launchdarkly:index/project:Project", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Project resources.
type projectState struct {
	// List of nested `environments` blocks describing LaunchDarkly environments that belong to the project
	Environments []ProjectEnvironment `pulumi:"environments"`
	// Whether feature flags created under the project should be available to client-side SDKs by default
	IncludeInSnippet *bool `pulumi:"includeInSnippet"`
	// The project's unique key.
	Key *string `pulumi:"key"`
	// The project's name.
	Name *string `pulumi:"name"`
	// The project's set of tags.
	Tags []string `pulumi:"tags"`
}

type ProjectState struct {
	// List of nested `environments` blocks describing LaunchDarkly environments that belong to the project
	Environments ProjectEnvironmentArrayInput
	// Whether feature flags created under the project should be available to client-side SDKs by default
	IncludeInSnippet pulumi.BoolPtrInput
	// The project's unique key.
	Key pulumi.StringPtrInput
	// The project's name.
	Name pulumi.StringPtrInput
	// The project's set of tags.
	Tags pulumi.StringArrayInput
}

func (ProjectState) ElementType() reflect.Type {
	return reflect.TypeOf((*projectState)(nil)).Elem()
}

type projectArgs struct {
	// List of nested `environments` blocks describing LaunchDarkly environments that belong to the project
	Environments []ProjectEnvironment `pulumi:"environments"`
	// Whether feature flags created under the project should be available to client-side SDKs by default
	IncludeInSnippet *bool `pulumi:"includeInSnippet"`
	// The project's unique key.
	Key string `pulumi:"key"`
	// The project's name.
	Name *string `pulumi:"name"`
	// The project's set of tags.
	Tags []string `pulumi:"tags"`
}

// The set of arguments for constructing a Project resource.
type ProjectArgs struct {
	// List of nested `environments` blocks describing LaunchDarkly environments that belong to the project
	Environments ProjectEnvironmentArrayInput
	// Whether feature flags created under the project should be available to client-side SDKs by default
	IncludeInSnippet pulumi.BoolPtrInput
	// The project's unique key.
	Key pulumi.StringInput
	// The project's name.
	Name pulumi.StringPtrInput
	// The project's set of tags.
	Tags pulumi.StringArrayInput
}

func (ProjectArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*projectArgs)(nil)).Elem()
}

type ProjectInput interface {
	pulumi.Input

	ToProjectOutput() ProjectOutput
	ToProjectOutputWithContext(ctx context.Context) ProjectOutput
}

func (*Project) ElementType() reflect.Type {
	return reflect.TypeOf((**Project)(nil)).Elem()
}

func (i *Project) ToProjectOutput() ProjectOutput {
	return i.ToProjectOutputWithContext(context.Background())
}

func (i *Project) ToProjectOutputWithContext(ctx context.Context) ProjectOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ProjectOutput)
}

// ProjectArrayInput is an input type that accepts ProjectArray and ProjectArrayOutput values.
// You can construct a concrete instance of `ProjectArrayInput` via:
//
//	ProjectArray{ ProjectArgs{...} }
type ProjectArrayInput interface {
	pulumi.Input

	ToProjectArrayOutput() ProjectArrayOutput
	ToProjectArrayOutputWithContext(context.Context) ProjectArrayOutput
}

type ProjectArray []ProjectInput

func (ProjectArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Project)(nil)).Elem()
}

func (i ProjectArray) ToProjectArrayOutput() ProjectArrayOutput {
	return i.ToProjectArrayOutputWithContext(context.Background())
}

func (i ProjectArray) ToProjectArrayOutputWithContext(ctx context.Context) ProjectArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ProjectArrayOutput)
}

// ProjectMapInput is an input type that accepts ProjectMap and ProjectMapOutput values.
// You can construct a concrete instance of `ProjectMapInput` via:
//
//	ProjectMap{ "key": ProjectArgs{...} }
type ProjectMapInput interface {
	pulumi.Input

	ToProjectMapOutput() ProjectMapOutput
	ToProjectMapOutputWithContext(context.Context) ProjectMapOutput
}

type ProjectMap map[string]ProjectInput

func (ProjectMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Project)(nil)).Elem()
}

func (i ProjectMap) ToProjectMapOutput() ProjectMapOutput {
	return i.ToProjectMapOutputWithContext(context.Background())
}

func (i ProjectMap) ToProjectMapOutputWithContext(ctx context.Context) ProjectMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ProjectMapOutput)
}

type ProjectOutput struct{ *pulumi.OutputState }

func (ProjectOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Project)(nil)).Elem()
}

func (o ProjectOutput) ToProjectOutput() ProjectOutput {
	return o
}

func (o ProjectOutput) ToProjectOutputWithContext(ctx context.Context) ProjectOutput {
	return o
}

// List of nested `environments` blocks describing LaunchDarkly environments that belong to the project
func (o ProjectOutput) Environments() ProjectEnvironmentArrayOutput {
	return o.ApplyT(func(v *Project) ProjectEnvironmentArrayOutput { return v.Environments }).(ProjectEnvironmentArrayOutput)
}

// Whether feature flags created under the project should be available to client-side SDKs by default
func (o ProjectOutput) IncludeInSnippet() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *Project) pulumi.BoolPtrOutput { return v.IncludeInSnippet }).(pulumi.BoolPtrOutput)
}

// The project's unique key.
func (o ProjectOutput) Key() pulumi.StringOutput {
	return o.ApplyT(func(v *Project) pulumi.StringOutput { return v.Key }).(pulumi.StringOutput)
}

// The project's name.
func (o ProjectOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *Project) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// The project's set of tags.
func (o ProjectOutput) Tags() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *Project) pulumi.StringArrayOutput { return v.Tags }).(pulumi.StringArrayOutput)
}

type ProjectArrayOutput struct{ *pulumi.OutputState }

func (ProjectArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Project)(nil)).Elem()
}

func (o ProjectArrayOutput) ToProjectArrayOutput() ProjectArrayOutput {
	return o
}

func (o ProjectArrayOutput) ToProjectArrayOutputWithContext(ctx context.Context) ProjectArrayOutput {
	return o
}

func (o ProjectArrayOutput) Index(i pulumi.IntInput) ProjectOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *Project {
		return vs[0].([]*Project)[vs[1].(int)]
	}).(ProjectOutput)
}

type ProjectMapOutput struct{ *pulumi.OutputState }

func (ProjectMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Project)(nil)).Elem()
}

func (o ProjectMapOutput) ToProjectMapOutput() ProjectMapOutput {
	return o
}

func (o ProjectMapOutput) ToProjectMapOutputWithContext(ctx context.Context) ProjectMapOutput {
	return o
}

func (o ProjectMapOutput) MapIndex(k pulumi.StringInput) ProjectOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *Project {
		return vs[0].(map[string]*Project)[vs[1].(string)]
	}).(ProjectOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*ProjectInput)(nil)).Elem(), &Project{})
	pulumi.RegisterInputType(reflect.TypeOf((*ProjectArrayInput)(nil)).Elem(), ProjectArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*ProjectMapInput)(nil)).Elem(), ProjectMap{})
	pulumi.RegisterOutputType(ProjectOutput{})
	pulumi.RegisterOutputType(ProjectArrayOutput{})
	pulumi.RegisterOutputType(ProjectMapOutput{})
}
