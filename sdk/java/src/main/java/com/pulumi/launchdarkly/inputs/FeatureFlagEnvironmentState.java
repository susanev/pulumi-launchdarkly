// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.launchdarkly.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.launchdarkly.inputs.FeatureFlagEnvironmentFallthroughArgs;
import com.pulumi.launchdarkly.inputs.FeatureFlagEnvironmentPrerequisiteArgs;
import com.pulumi.launchdarkly.inputs.FeatureFlagEnvironmentRuleArgs;
import com.pulumi.launchdarkly.inputs.FeatureFlagEnvironmentTargetArgs;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class FeatureFlagEnvironmentState extends com.pulumi.resources.ResourceArgs {

    public static final FeatureFlagEnvironmentState Empty = new FeatureFlagEnvironmentState();

    /**
     * The environment key.
     * 
     */
    @Import(name="envKey")
    private @Nullable Output<String> envKey;

    /**
     * @return The environment key.
     * 
     */
    public Optional<Output<String>> envKey() {
        return Optional.ofNullable(this.envKey);
    }

    /**
     * - (Required) Nested block describing the default variation to serve if no `prerequisites`, `target`, or `rules` apply.To learn more, read Nested Fallthrough Block.
     * 
     */
    @Import(name="fallthrough")
    private @Nullable Output<FeatureFlagEnvironmentFallthroughArgs> fallthrough;

    /**
     * @return - (Required) Nested block describing the default variation to serve if no `prerequisites`, `target`, or `rules` apply.To learn more, read Nested Fallthrough Block.
     * 
     */
    public Optional<Output<FeatureFlagEnvironmentFallthroughArgs>> fallthrough() {
        return Optional.ofNullable(this.fallthrough);
    }

    /**
     * The feature flag&#39;s unique `id` in the format `project_key/flag_key`.
     * 
     */
    @Import(name="flagId")
    private @Nullable Output<String> flagId;

    /**
     * @return The feature flag&#39;s unique `id` in the format `project_key/flag_key`.
     * 
     */
    public Optional<Output<String>> flagId() {
        return Optional.ofNullable(this.flagId);
    }

    /**
     * The index of the variation to serve if targeting is disabled.
     * 
     */
    @Import(name="offVariation")
    private @Nullable Output<Integer> offVariation;

    /**
     * @return The index of the variation to serve if targeting is disabled.
     * 
     */
    public Optional<Output<Integer>> offVariation() {
        return Optional.ofNullable(this.offVariation);
    }

    /**
     * - (Optional) Whether targeting is enabled. Defaults to `false` if not set.
     * 
     */
    @Import(name="on")
    private @Nullable Output<Boolean> on;

    /**
     * @return - (Optional) Whether targeting is enabled. Defaults to `false` if not set.
     * 
     */
    public Optional<Output<Boolean>> on() {
        return Optional.ofNullable(this.on);
    }

    /**
     * List of nested blocks describing prerequisite feature flags rules. To learn more, read Nested Prequisites Blocks.
     * 
     */
    @Import(name="prerequisites")
    private @Nullable Output<List<FeatureFlagEnvironmentPrerequisiteArgs>> prerequisites;

    /**
     * @return List of nested blocks describing prerequisite feature flags rules. To learn more, read Nested Prequisites Blocks.
     * 
     */
    public Optional<Output<List<FeatureFlagEnvironmentPrerequisiteArgs>>> prerequisites() {
        return Optional.ofNullable(this.prerequisites);
    }

    /**
     * List of logical targeting rules. To learn more, read Nested Rules Blocks.
     * 
     */
    @Import(name="rules")
    private @Nullable Output<List<FeatureFlagEnvironmentRuleArgs>> rules;

    /**
     * @return List of logical targeting rules. To learn more, read Nested Rules Blocks.
     * 
     */
    public Optional<Output<List<FeatureFlagEnvironmentRuleArgs>>> rules() {
        return Optional.ofNullable(this.rules);
    }

    /**
     * - (Optional) Set of nested blocks describing the individual user targets for each variation. To learn more, read Nested Target Blocks.
     * 
     */
    @Import(name="targets")
    private @Nullable Output<List<FeatureFlagEnvironmentTargetArgs>> targets;

    /**
     * @return - (Optional) Set of nested blocks describing the individual user targets for each variation. To learn more, read Nested Target Blocks.
     * 
     */
    public Optional<Output<List<FeatureFlagEnvironmentTargetArgs>>> targets() {
        return Optional.ofNullable(this.targets);
    }

    /**
     * Whether to send event data back to LaunchDarkly. Defaults to `false` if not set.
     * 
     */
    @Import(name="trackEvents")
    private @Nullable Output<Boolean> trackEvents;

    /**
     * @return Whether to send event data back to LaunchDarkly. Defaults to `false` if not set.
     * 
     */
    public Optional<Output<Boolean>> trackEvents() {
        return Optional.ofNullable(this.trackEvents);
    }

    private FeatureFlagEnvironmentState() {}

    private FeatureFlagEnvironmentState(FeatureFlagEnvironmentState $) {
        this.envKey = $.envKey;
        this.fallthrough = $.fallthrough;
        this.flagId = $.flagId;
        this.offVariation = $.offVariation;
        this.on = $.on;
        this.prerequisites = $.prerequisites;
        this.rules = $.rules;
        this.targets = $.targets;
        this.trackEvents = $.trackEvents;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FeatureFlagEnvironmentState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FeatureFlagEnvironmentState $;

        public Builder() {
            $ = new FeatureFlagEnvironmentState();
        }

        public Builder(FeatureFlagEnvironmentState defaults) {
            $ = new FeatureFlagEnvironmentState(Objects.requireNonNull(defaults));
        }

        /**
         * @param envKey The environment key.
         * 
         * @return builder
         * 
         */
        public Builder envKey(@Nullable Output<String> envKey) {
            $.envKey = envKey;
            return this;
        }

        /**
         * @param envKey The environment key.
         * 
         * @return builder
         * 
         */
        public Builder envKey(String envKey) {
            return envKey(Output.of(envKey));
        }

        /**
         * @param fallthrough - (Required) Nested block describing the default variation to serve if no `prerequisites`, `target`, or `rules` apply.To learn more, read Nested Fallthrough Block.
         * 
         * @return builder
         * 
         */
        public Builder fallthrough(@Nullable Output<FeatureFlagEnvironmentFallthroughArgs> fallthrough) {
            $.fallthrough = fallthrough;
            return this;
        }

        /**
         * @param fallthrough - (Required) Nested block describing the default variation to serve if no `prerequisites`, `target`, or `rules` apply.To learn more, read Nested Fallthrough Block.
         * 
         * @return builder
         * 
         */
        public Builder fallthrough(FeatureFlagEnvironmentFallthroughArgs fallthrough) {
            return fallthrough(Output.of(fallthrough));
        }

        /**
         * @param flagId The feature flag&#39;s unique `id` in the format `project_key/flag_key`.
         * 
         * @return builder
         * 
         */
        public Builder flagId(@Nullable Output<String> flagId) {
            $.flagId = flagId;
            return this;
        }

        /**
         * @param flagId The feature flag&#39;s unique `id` in the format `project_key/flag_key`.
         * 
         * @return builder
         * 
         */
        public Builder flagId(String flagId) {
            return flagId(Output.of(flagId));
        }

        /**
         * @param offVariation The index of the variation to serve if targeting is disabled.
         * 
         * @return builder
         * 
         */
        public Builder offVariation(@Nullable Output<Integer> offVariation) {
            $.offVariation = offVariation;
            return this;
        }

        /**
         * @param offVariation The index of the variation to serve if targeting is disabled.
         * 
         * @return builder
         * 
         */
        public Builder offVariation(Integer offVariation) {
            return offVariation(Output.of(offVariation));
        }

        /**
         * @param on - (Optional) Whether targeting is enabled. Defaults to `false` if not set.
         * 
         * @return builder
         * 
         */
        public Builder on(@Nullable Output<Boolean> on) {
            $.on = on;
            return this;
        }

        /**
         * @param on - (Optional) Whether targeting is enabled. Defaults to `false` if not set.
         * 
         * @return builder
         * 
         */
        public Builder on(Boolean on) {
            return on(Output.of(on));
        }

        /**
         * @param prerequisites List of nested blocks describing prerequisite feature flags rules. To learn more, read Nested Prequisites Blocks.
         * 
         * @return builder
         * 
         */
        public Builder prerequisites(@Nullable Output<List<FeatureFlagEnvironmentPrerequisiteArgs>> prerequisites) {
            $.prerequisites = prerequisites;
            return this;
        }

        /**
         * @param prerequisites List of nested blocks describing prerequisite feature flags rules. To learn more, read Nested Prequisites Blocks.
         * 
         * @return builder
         * 
         */
        public Builder prerequisites(List<FeatureFlagEnvironmentPrerequisiteArgs> prerequisites) {
            return prerequisites(Output.of(prerequisites));
        }

        /**
         * @param prerequisites List of nested blocks describing prerequisite feature flags rules. To learn more, read Nested Prequisites Blocks.
         * 
         * @return builder
         * 
         */
        public Builder prerequisites(FeatureFlagEnvironmentPrerequisiteArgs... prerequisites) {
            return prerequisites(List.of(prerequisites));
        }

        /**
         * @param rules List of logical targeting rules. To learn more, read Nested Rules Blocks.
         * 
         * @return builder
         * 
         */
        public Builder rules(@Nullable Output<List<FeatureFlagEnvironmentRuleArgs>> rules) {
            $.rules = rules;
            return this;
        }

        /**
         * @param rules List of logical targeting rules. To learn more, read Nested Rules Blocks.
         * 
         * @return builder
         * 
         */
        public Builder rules(List<FeatureFlagEnvironmentRuleArgs> rules) {
            return rules(Output.of(rules));
        }

        /**
         * @param rules List of logical targeting rules. To learn more, read Nested Rules Blocks.
         * 
         * @return builder
         * 
         */
        public Builder rules(FeatureFlagEnvironmentRuleArgs... rules) {
            return rules(List.of(rules));
        }

        /**
         * @param targets - (Optional) Set of nested blocks describing the individual user targets for each variation. To learn more, read Nested Target Blocks.
         * 
         * @return builder
         * 
         */
        public Builder targets(@Nullable Output<List<FeatureFlagEnvironmentTargetArgs>> targets) {
            $.targets = targets;
            return this;
        }

        /**
         * @param targets - (Optional) Set of nested blocks describing the individual user targets for each variation. To learn more, read Nested Target Blocks.
         * 
         * @return builder
         * 
         */
        public Builder targets(List<FeatureFlagEnvironmentTargetArgs> targets) {
            return targets(Output.of(targets));
        }

        /**
         * @param targets - (Optional) Set of nested blocks describing the individual user targets for each variation. To learn more, read Nested Target Blocks.
         * 
         * @return builder
         * 
         */
        public Builder targets(FeatureFlagEnvironmentTargetArgs... targets) {
            return targets(List.of(targets));
        }

        /**
         * @param trackEvents Whether to send event data back to LaunchDarkly. Defaults to `false` if not set.
         * 
         * @return builder
         * 
         */
        public Builder trackEvents(@Nullable Output<Boolean> trackEvents) {
            $.trackEvents = trackEvents;
            return this;
        }

        /**
         * @param trackEvents Whether to send event data back to LaunchDarkly. Defaults to `false` if not set.
         * 
         * @return builder
         * 
         */
        public Builder trackEvents(Boolean trackEvents) {
            return trackEvents(Output.of(trackEvents));
        }

        public FeatureFlagEnvironmentState build() {
            return $;
        }
    }

}
