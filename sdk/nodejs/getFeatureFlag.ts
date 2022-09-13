// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import { input as inputs, output as outputs } from "./types";
import * as utilities from "./utilities";

/**
 * Provides a LaunchDarkly feature flag data source.
 *
 * This data source allows you to retrieve feature flag information from your LaunchDarkly organization.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as launchdarkly from "@pulumi/launchdarkly";
 *
 * const example = pulumi.output(launchdarkly.getFeatureFlag({
 *     key: "example-flag",
 *     projectKey: "example-project",
 * }));
 * ```
 */
export function getFeatureFlag(args: GetFeatureFlagArgs, opts?: pulumi.InvokeOptions): Promise<GetFeatureFlagResult> {
    if (!opts) {
        opts = {}
    }

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
    return pulumi.runtime.invoke("launchdarkly:index/getFeatureFlag:getFeatureFlag", {
        "archived": args.archived,
        "customProperties": args.customProperties,
        "defaults": args.defaults,
        "description": args.description,
        "includeInSnippet": args.includeInSnippet,
        "key": args.key,
        "maintainerId": args.maintainerId,
        "projectKey": args.projectKey,
        "tags": args.tags,
        "temporary": args.temporary,
        "variations": args.variations,
    }, opts);
}

/**
 * A collection of arguments for invoking getFeatureFlag.
 */
export interface GetFeatureFlagArgs {
    archived?: boolean;
    /**
     * List of nested blocks describing the feature flag's [custom properties](https://docs.launchdarkly.com/docs/custom-properties). To learn more, read Nested Custom Properties.
     */
    customProperties?: inputs.GetFeatureFlagCustomProperty[];
    /**
     * A map describing the index of the variation served when the flag is on for new environments. To learn more, read Nested Defaults Blocks.
     */
    defaults?: inputs.GetFeatureFlagDefaults;
    /**
     * The variation's description.
     */
    description?: string;
    includeInSnippet?: boolean;
    /**
     * The unique feature flag key that references the flag in your application code.
     */
    key: string;
    /**
     * The feature flag maintainer's 24 character alphanumeric team member ID.
     */
    maintainerId?: string;
    /**
     * The feature flag's project key.
     */
    projectKey: string;
    /**
     * Set of feature flag tags.
     */
    tags?: string[];
    /**
     * Whether the flag is a temporary flag.
     */
    temporary?: boolean;
    /**
     * List of nested blocks describing the variations associated with the feature flag. To learn more, read Nested Variations Blocks.
     */
    variations?: inputs.GetFeatureFlagVariation[];
}

/**
 * A collection of values returned by getFeatureFlag.
 */
export interface GetFeatureFlagResult {
    readonly archived?: boolean;
    /**
     * A map describing whether this flag has been made available to the client-side JavaScript SDK. To learn more, read Nested Client-Side Availability Block.
     */
    readonly clientSideAvailabilities: outputs.GetFeatureFlagClientSideAvailability[];
    /**
     * List of nested blocks describing the feature flag's [custom properties](https://docs.launchdarkly.com/docs/custom-properties). To learn more, read Nested Custom Properties.
     */
    readonly customProperties?: outputs.GetFeatureFlagCustomProperty[];
    /**
     * A map describing the index of the variation served when the flag is on for new environments. To learn more, read Nested Defaults Blocks.
     */
    readonly defaults: outputs.GetFeatureFlagDefaults;
    /**
     * The variation's description.
     */
    readonly description?: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly includeInSnippet?: boolean;
    /**
     * The unique custom property key.
     */
    readonly key: string;
    /**
     * The feature flag maintainer's 24 character alphanumeric team member ID.
     */
    readonly maintainerId: string;
    /**
     * The name of the custom property.
     */
    readonly name: string;
    readonly projectKey: string;
    /**
     * Set of feature flag tags.
     */
    readonly tags?: string[];
    /**
     * Whether the flag is a temporary flag.
     */
    readonly temporary?: boolean;
    /**
     * The feature flag's variation type: `boolean`, `string`, `number` or `json`.
     */
    readonly variationType: string;
    /**
     * List of nested blocks describing the variations associated with the feature flag. To learn more, read Nested Variations Blocks.
     */
    readonly variations: outputs.GetFeatureFlagVariation[];
}

export function getFeatureFlagOutput(args: GetFeatureFlagOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetFeatureFlagResult> {
    return pulumi.output(args).apply(a => getFeatureFlag(a, opts))
}

/**
 * A collection of arguments for invoking getFeatureFlag.
 */
export interface GetFeatureFlagOutputArgs {
    archived?: pulumi.Input<boolean>;
    /**
     * List of nested blocks describing the feature flag's [custom properties](https://docs.launchdarkly.com/docs/custom-properties). To learn more, read Nested Custom Properties.
     */
    customProperties?: pulumi.Input<pulumi.Input<inputs.GetFeatureFlagCustomPropertyArgs>[]>;
    /**
     * A map describing the index of the variation served when the flag is on for new environments. To learn more, read Nested Defaults Blocks.
     */
    defaults?: pulumi.Input<inputs.GetFeatureFlagDefaultsArgs>;
    /**
     * The variation's description.
     */
    description?: pulumi.Input<string>;
    includeInSnippet?: pulumi.Input<boolean>;
    /**
     * The unique feature flag key that references the flag in your application code.
     */
    key: pulumi.Input<string>;
    /**
     * The feature flag maintainer's 24 character alphanumeric team member ID.
     */
    maintainerId?: pulumi.Input<string>;
    /**
     * The feature flag's project key.
     */
    projectKey: pulumi.Input<string>;
    /**
     * Set of feature flag tags.
     */
    tags?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Whether the flag is a temporary flag.
     */
    temporary?: pulumi.Input<boolean>;
    /**
     * List of nested blocks describing the variations associated with the feature flag. To learn more, read Nested Variations Blocks.
     */
    variations?: pulumi.Input<pulumi.Input<inputs.GetFeatureFlagVariationArgs>[]>;
}
