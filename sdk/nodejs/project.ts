// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import { input as inputs, output as outputs } from "./types";
import * as utilities from "./utilities";

/**
 * Provides a LaunchDarkly project resource.
 *
 * This resource allows you to create and manage projects within your LaunchDarkly organization.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as launchdarkly from "@pulumi/launchdarkly";
 *
 * const example = new launchdarkly.Project("example", {
 *     environments: [
 *         {
 *             approvalSettings: [{
 *                 canApplyDeclinedChanges: false,
 *                 canReviewOwnRequest: false,
 *                 minNumApprovals: 3,
 *                 requiredApprovalTags: ["approvals_required"],
 *             }],
 *             color: "EEEEEE",
 *             key: "production",
 *             name: "Production",
 *             tags: ["terraform"],
 *         },
 *         {
 *             color: "000000",
 *             key: "staging",
 *             name: "Staging",
 *             tags: ["terraform"],
 *         },
 *     ],
 *     key: "example-project",
 *     tags: ["terraform"],
 * });
 * ```
 *
 * ## Import
 *
 * LaunchDarkly projects can be imported using the project's key, e.g.
 *
 * ```sh
 *  $ pulumi import launchdarkly:index/project:Project example example-project
 * ```
 *
 *  **IMPORTANT:** Please note that, regardless of how many `environments` blocks you include on your import, _all_ of the project's environments will be saved to the Terraform state and will update with subsequent applies. This means that any environments not included in your import configuration will be torn down with any subsequent apply. If you wish to manage project properties with Terraform but not nested environments consider using Terraform's [ignore changes](https://www.terraform.io/docs/language/meta-arguments/lifecycle.html#ignore_changes) lifecycle meta-argument; see below for example. resource "launchdarkly_project" "example" { 		lifecycle { 			ignore_changes = [environments] 		} 		name = "testProject" 		key = "%s" 		# environments not included on this configuration will not be affected by subsequent applies 	} Managing environment resources with Terraform should always be done on the project unless the project is not also managed with Terraform.
 */
export class Project extends pulumi.CustomResource {
    /**
     * Get an existing Project resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: ProjectState, opts?: pulumi.CustomResourceOptions): Project {
        return new Project(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'launchdarkly:index/project:Project';

    /**
     * Returns true if the given object is an instance of Project.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Project {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Project.__pulumiType;
    }

    /**
     * List of nested `environments` blocks describing LaunchDarkly environments that belong to the project
     */
    public readonly environments!: pulumi.Output<outputs.ProjectEnvironment[]>;
    /**
     * Whether feature flags created under the project should be available to client-side SDKs by default
     */
    public readonly includeInSnippet!: pulumi.Output<boolean | undefined>;
    /**
     * The project's unique key.
     */
    public readonly key!: pulumi.Output<string>;
    /**
     * The project's name.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * The project's set of tags.
     */
    public readonly tags!: pulumi.Output<string[] | undefined>;

    /**
     * Create a Project resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: ProjectArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: ProjectArgs | ProjectState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as ProjectState | undefined;
            resourceInputs["environments"] = state ? state.environments : undefined;
            resourceInputs["includeInSnippet"] = state ? state.includeInSnippet : undefined;
            resourceInputs["key"] = state ? state.key : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["tags"] = state ? state.tags : undefined;
        } else {
            const args = argsOrState as ProjectArgs | undefined;
            if ((!args || args.environments === undefined) && !opts.urn) {
                throw new Error("Missing required property 'environments'");
            }
            if ((!args || args.key === undefined) && !opts.urn) {
                throw new Error("Missing required property 'key'");
            }
            resourceInputs["environments"] = args ? args.environments : undefined;
            resourceInputs["includeInSnippet"] = args ? args.includeInSnippet : undefined;
            resourceInputs["key"] = args ? args.key : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["tags"] = args ? args.tags : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(Project.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Project resources.
 */
export interface ProjectState {
    /**
     * List of nested `environments` blocks describing LaunchDarkly environments that belong to the project
     */
    environments?: pulumi.Input<pulumi.Input<inputs.ProjectEnvironment>[]>;
    /**
     * Whether feature flags created under the project should be available to client-side SDKs by default
     */
    includeInSnippet?: pulumi.Input<boolean>;
    /**
     * The project's unique key.
     */
    key?: pulumi.Input<string>;
    /**
     * The project's name.
     */
    name?: pulumi.Input<string>;
    /**
     * The project's set of tags.
     */
    tags?: pulumi.Input<pulumi.Input<string>[]>;
}

/**
 * The set of arguments for constructing a Project resource.
 */
export interface ProjectArgs {
    /**
     * List of nested `environments` blocks describing LaunchDarkly environments that belong to the project
     */
    environments: pulumi.Input<pulumi.Input<inputs.ProjectEnvironment>[]>;
    /**
     * Whether feature flags created under the project should be available to client-side SDKs by default
     */
    includeInSnippet?: pulumi.Input<boolean>;
    /**
     * The project's unique key.
     */
    key: pulumi.Input<string>;
    /**
     * The project's name.
     */
    name?: pulumi.Input<string>;
    /**
     * The project's set of tags.
     */
    tags?: pulumi.Input<pulumi.Input<string>[]>;
}
