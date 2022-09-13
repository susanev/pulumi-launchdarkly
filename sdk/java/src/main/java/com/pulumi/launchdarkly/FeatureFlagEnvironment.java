// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.launchdarkly;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.launchdarkly.FeatureFlagEnvironmentArgs;
import com.pulumi.launchdarkly.Utilities;
import com.pulumi.launchdarkly.inputs.FeatureFlagEnvironmentState;
import com.pulumi.launchdarkly.outputs.FeatureFlagEnvironmentFallthrough;
import com.pulumi.launchdarkly.outputs.FeatureFlagEnvironmentPrerequisite;
import com.pulumi.launchdarkly.outputs.FeatureFlagEnvironmentRule;
import com.pulumi.launchdarkly.outputs.FeatureFlagEnvironmentTarget;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a LaunchDarkly environment-specific feature flag resource.
 * 
 * This resource allows you to create and manage environment-specific feature flags attributes within your LaunchDarkly organization.
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.launchdarkly.FeatureFlagEnvironment;
 * import com.pulumi.launchdarkly.FeatureFlagEnvironmentArgs;
 * import com.pulumi.launchdarkly.inputs.FeatureFlagEnvironmentPrerequisiteArgs;
 * import com.pulumi.launchdarkly.inputs.FeatureFlagEnvironmentTargetArgs;
 * import com.pulumi.launchdarkly.inputs.FeatureFlagEnvironmentRuleArgs;
 * import com.pulumi.launchdarkly.inputs.FeatureFlagEnvironmentFallthroughArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var numberEnv = new FeatureFlagEnvironment(&#34;numberEnv&#34;, FeatureFlagEnvironmentArgs.builder()        
 *             .flagId(launchdarkly_feature_flag.number().id())
 *             .envKey(launchdarkly_environment.staging().key())
 *             .on(true)
 *             .prerequisites(FeatureFlagEnvironmentPrerequisiteArgs.builder()
 *                 .flagKey(launchdarkly_feature_flag.basic().key())
 *                 .variation(0)
 *                 .build())
 *             .targets(            
 *                 FeatureFlagEnvironmentTargetArgs.builder()
 *                     .values(&#34;user0&#34;)
 *                     .variation(0)
 *                     .build(),
 *                 FeatureFlagEnvironmentTargetArgs.builder()
 *                     .values(                    
 *                         &#34;user1&#34;,
 *                         &#34;user2&#34;)
 *                     .variation(1)
 *                     .build())
 *             .rules(FeatureFlagEnvironmentRuleArgs.builder()
 *                 .clauses(                
 *                     FeatureFlagEnvironmentRuleClauseArgs.builder()
 *                         .attribute(&#34;country&#34;)
 *                         .op(&#34;startsWith&#34;)
 *                         .values(                        
 *                             &#34;aus&#34;,
 *                             &#34;de&#34;,
 *                             &#34;united&#34;)
 *                         .negate(false)
 *                         .build(),
 *                     FeatureFlagEnvironmentRuleClauseArgs.builder()
 *                         .attribute(&#34;segmentMatch&#34;)
 *                         .op(&#34;segmentMatch&#34;)
 *                         .values(launchdarkly_segment.example().key())
 *                         .negate(false)
 *                         .build())
 *                 .variation(0)
 *                 .build())
 *             .fallthrough(FeatureFlagEnvironmentFallthroughArgs.builder()
 *                 .rolloutWeights(                
 *                     60000,
 *                     40000,
 *                     0)
 *                 .build())
 *             .offVariation(2)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * LaunchDarkly feature flag environments can be imported using the resource&#39;s ID in the form `project_key/env_key/flag_key`, e.g.
 * 
 * ```sh
 *  $ pulumi import launchdarkly:index/featureFlagEnvironment:FeatureFlagEnvironment example example-project/example-env/example-flag-key
 * ```
 * 
 */
@ResourceType(type="launchdarkly:index/featureFlagEnvironment:FeatureFlagEnvironment")
public class FeatureFlagEnvironment extends com.pulumi.resources.CustomResource {
    /**
     * The environment key.
     * 
     */
    @Export(name="envKey", type=String.class, parameters={})
    private Output<String> envKey;

    /**
     * @return The environment key.
     * 
     */
    public Output<String> envKey() {
        return this.envKey;
    }
    /**
     * - (Required) Nested block describing the default variation to serve if no `prerequisites`, `target`, or `rules` apply.To learn more, read Nested Fallthrough Block.
     * 
     */
    @Export(name="fallthrough", type=FeatureFlagEnvironmentFallthrough.class, parameters={})
    private Output<FeatureFlagEnvironmentFallthrough> fallthrough;

    /**
     * @return - (Required) Nested block describing the default variation to serve if no `prerequisites`, `target`, or `rules` apply.To learn more, read Nested Fallthrough Block.
     * 
     */
    public Output<FeatureFlagEnvironmentFallthrough> fallthrough() {
        return this.fallthrough;
    }
    /**
     * The feature flag&#39;s unique `id` in the format `project_key/flag_key`.
     * 
     */
    @Export(name="flagId", type=String.class, parameters={})
    private Output<String> flagId;

    /**
     * @return The feature flag&#39;s unique `id` in the format `project_key/flag_key`.
     * 
     */
    public Output<String> flagId() {
        return this.flagId;
    }
    /**
     * The index of the variation to serve if targeting is disabled.
     * 
     */
    @Export(name="offVariation", type=Integer.class, parameters={})
    private Output<Integer> offVariation;

    /**
     * @return The index of the variation to serve if targeting is disabled.
     * 
     */
    public Output<Integer> offVariation() {
        return this.offVariation;
    }
    /**
     * - (Optional) Whether targeting is enabled. Defaults to `false` if not set.
     * 
     */
    @Export(name="on", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> on;

    /**
     * @return - (Optional) Whether targeting is enabled. Defaults to `false` if not set.
     * 
     */
    public Output<Optional<Boolean>> on() {
        return Codegen.optional(this.on);
    }
    /**
     * List of nested blocks describing prerequisite feature flags rules. To learn more, read Nested Prequisites Blocks.
     * 
     */
    @Export(name="prerequisites", type=List.class, parameters={FeatureFlagEnvironmentPrerequisite.class})
    private Output</* @Nullable */ List<FeatureFlagEnvironmentPrerequisite>> prerequisites;

    /**
     * @return List of nested blocks describing prerequisite feature flags rules. To learn more, read Nested Prequisites Blocks.
     * 
     */
    public Output<Optional<List<FeatureFlagEnvironmentPrerequisite>>> prerequisites() {
        return Codegen.optional(this.prerequisites);
    }
    /**
     * List of logical targeting rules. To learn more, read Nested Rules Blocks.
     * 
     */
    @Export(name="rules", type=List.class, parameters={FeatureFlagEnvironmentRule.class})
    private Output</* @Nullable */ List<FeatureFlagEnvironmentRule>> rules;

    /**
     * @return List of logical targeting rules. To learn more, read Nested Rules Blocks.
     * 
     */
    public Output<Optional<List<FeatureFlagEnvironmentRule>>> rules() {
        return Codegen.optional(this.rules);
    }
    /**
     * - (Optional) Set of nested blocks describing the individual user targets for each variation. To learn more, read Nested Target Blocks.
     * 
     */
    @Export(name="targets", type=List.class, parameters={FeatureFlagEnvironmentTarget.class})
    private Output</* @Nullable */ List<FeatureFlagEnvironmentTarget>> targets;

    /**
     * @return - (Optional) Set of nested blocks describing the individual user targets for each variation. To learn more, read Nested Target Blocks.
     * 
     */
    public Output<Optional<List<FeatureFlagEnvironmentTarget>>> targets() {
        return Codegen.optional(this.targets);
    }
    /**
     * Whether to send event data back to LaunchDarkly. Defaults to `false` if not set.
     * 
     */
    @Export(name="trackEvents", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> trackEvents;

    /**
     * @return Whether to send event data back to LaunchDarkly. Defaults to `false` if not set.
     * 
     */
    public Output<Optional<Boolean>> trackEvents() {
        return Codegen.optional(this.trackEvents);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public FeatureFlagEnvironment(String name) {
        this(name, FeatureFlagEnvironmentArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public FeatureFlagEnvironment(String name, FeatureFlagEnvironmentArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public FeatureFlagEnvironment(String name, FeatureFlagEnvironmentArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("launchdarkly:index/featureFlagEnvironment:FeatureFlagEnvironment", name, args == null ? FeatureFlagEnvironmentArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private FeatureFlagEnvironment(String name, Output<String> id, @Nullable FeatureFlagEnvironmentState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("launchdarkly:index/featureFlagEnvironment:FeatureFlagEnvironment", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static FeatureFlagEnvironment get(String name, Output<String> id, @Nullable FeatureFlagEnvironmentState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new FeatureFlagEnvironment(name, id, state, options);
    }
}
