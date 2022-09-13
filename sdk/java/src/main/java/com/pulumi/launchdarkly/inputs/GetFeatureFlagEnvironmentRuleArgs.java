// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.launchdarkly.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.launchdarkly.inputs.GetFeatureFlagEnvironmentRuleClauseArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetFeatureFlagEnvironmentRuleArgs extends com.pulumi.resources.ResourceArgs {

    public static final GetFeatureFlagEnvironmentRuleArgs Empty = new GetFeatureFlagEnvironmentRuleArgs();

    /**
     * Group percentage rollout by a custom attribute.
     * 
     */
    @Import(name="bucketBy")
    private @Nullable Output<String> bucketBy;

    /**
     * @return Group percentage rollout by a custom attribute.
     * 
     */
    public Optional<Output<String>> bucketBy() {
        return Optional.ofNullable(this.bucketBy);
    }

    /**
     * List of nested blocks specifying the logical clauses evaluated. To learn more, read Nested Clauses Blocks.
     * 
     */
    @Import(name="clauses")
    private @Nullable Output<List<GetFeatureFlagEnvironmentRuleClauseArgs>> clauses;

    /**
     * @return List of nested blocks specifying the logical clauses evaluated. To learn more, read Nested Clauses Blocks.
     * 
     */
    public Optional<Output<List<GetFeatureFlagEnvironmentRuleClauseArgs>>> clauses() {
        return Optional.ofNullable(this.clauses);
    }

    /**
     * List of integer percentage rollout weights applied to each variation when the rule clauses evaluates to `true`.
     * 
     */
    @Import(name="rolloutWeights")
    private @Nullable Output<List<Integer>> rolloutWeights;

    /**
     * @return List of integer percentage rollout weights applied to each variation when the rule clauses evaluates to `true`.
     * 
     */
    public Optional<Output<List<Integer>>> rolloutWeights() {
        return Optional.ofNullable(this.rolloutWeights);
    }

    /**
     * The integer variation index served when the rule clauses evaluate to `true`.
     * 
     */
    @Import(name="variation")
    private @Nullable Output<Integer> variation;

    /**
     * @return The integer variation index served when the rule clauses evaluate to `true`.
     * 
     */
    public Optional<Output<Integer>> variation() {
        return Optional.ofNullable(this.variation);
    }

    private GetFeatureFlagEnvironmentRuleArgs() {}

    private GetFeatureFlagEnvironmentRuleArgs(GetFeatureFlagEnvironmentRuleArgs $) {
        this.bucketBy = $.bucketBy;
        this.clauses = $.clauses;
        this.rolloutWeights = $.rolloutWeights;
        this.variation = $.variation;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetFeatureFlagEnvironmentRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetFeatureFlagEnvironmentRuleArgs $;

        public Builder() {
            $ = new GetFeatureFlagEnvironmentRuleArgs();
        }

        public Builder(GetFeatureFlagEnvironmentRuleArgs defaults) {
            $ = new GetFeatureFlagEnvironmentRuleArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param bucketBy Group percentage rollout by a custom attribute.
         * 
         * @return builder
         * 
         */
        public Builder bucketBy(@Nullable Output<String> bucketBy) {
            $.bucketBy = bucketBy;
            return this;
        }

        /**
         * @param bucketBy Group percentage rollout by a custom attribute.
         * 
         * @return builder
         * 
         */
        public Builder bucketBy(String bucketBy) {
            return bucketBy(Output.of(bucketBy));
        }

        /**
         * @param clauses List of nested blocks specifying the logical clauses evaluated. To learn more, read Nested Clauses Blocks.
         * 
         * @return builder
         * 
         */
        public Builder clauses(@Nullable Output<List<GetFeatureFlagEnvironmentRuleClauseArgs>> clauses) {
            $.clauses = clauses;
            return this;
        }

        /**
         * @param clauses List of nested blocks specifying the logical clauses evaluated. To learn more, read Nested Clauses Blocks.
         * 
         * @return builder
         * 
         */
        public Builder clauses(List<GetFeatureFlagEnvironmentRuleClauseArgs> clauses) {
            return clauses(Output.of(clauses));
        }

        /**
         * @param clauses List of nested blocks specifying the logical clauses evaluated. To learn more, read Nested Clauses Blocks.
         * 
         * @return builder
         * 
         */
        public Builder clauses(GetFeatureFlagEnvironmentRuleClauseArgs... clauses) {
            return clauses(List.of(clauses));
        }

        /**
         * @param rolloutWeights List of integer percentage rollout weights applied to each variation when the rule clauses evaluates to `true`.
         * 
         * @return builder
         * 
         */
        public Builder rolloutWeights(@Nullable Output<List<Integer>> rolloutWeights) {
            $.rolloutWeights = rolloutWeights;
            return this;
        }

        /**
         * @param rolloutWeights List of integer percentage rollout weights applied to each variation when the rule clauses evaluates to `true`.
         * 
         * @return builder
         * 
         */
        public Builder rolloutWeights(List<Integer> rolloutWeights) {
            return rolloutWeights(Output.of(rolloutWeights));
        }

        /**
         * @param rolloutWeights List of integer percentage rollout weights applied to each variation when the rule clauses evaluates to `true`.
         * 
         * @return builder
         * 
         */
        public Builder rolloutWeights(Integer... rolloutWeights) {
            return rolloutWeights(List.of(rolloutWeights));
        }

        /**
         * @param variation The integer variation index served when the rule clauses evaluate to `true`.
         * 
         * @return builder
         * 
         */
        public Builder variation(@Nullable Output<Integer> variation) {
            $.variation = variation;
            return this;
        }

        /**
         * @param variation The integer variation index served when the rule clauses evaluate to `true`.
         * 
         * @return builder
         * 
         */
        public Builder variation(Integer variation) {
            return variation(Output.of(variation));
        }

        public GetFeatureFlagEnvironmentRuleArgs build() {
            return $;
        }
    }

}
