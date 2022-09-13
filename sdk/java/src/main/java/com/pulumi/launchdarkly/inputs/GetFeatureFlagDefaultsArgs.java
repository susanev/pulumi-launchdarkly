// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.launchdarkly.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;


public final class GetFeatureFlagDefaultsArgs extends com.pulumi.resources.ResourceArgs {

    public static final GetFeatureFlagDefaultsArgs Empty = new GetFeatureFlagDefaultsArgs();

    /**
     * (Required) The index of the variation the flag will default to in all new environments when off.
     * 
     */
    @Import(name="offVariation", required=true)
    private Output<Integer> offVariation;

    /**
     * @return (Required) The index of the variation the flag will default to in all new environments when off.
     * 
     */
    public Output<Integer> offVariation() {
        return this.offVariation;
    }

    /**
     * (Required) The index of the variation the flag will default to in all new environments when on.
     * 
     */
    @Import(name="onVariation", required=true)
    private Output<Integer> onVariation;

    /**
     * @return (Required) The index of the variation the flag will default to in all new environments when on.
     * 
     */
    public Output<Integer> onVariation() {
        return this.onVariation;
    }

    private GetFeatureFlagDefaultsArgs() {}

    private GetFeatureFlagDefaultsArgs(GetFeatureFlagDefaultsArgs $) {
        this.offVariation = $.offVariation;
        this.onVariation = $.onVariation;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetFeatureFlagDefaultsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetFeatureFlagDefaultsArgs $;

        public Builder() {
            $ = new GetFeatureFlagDefaultsArgs();
        }

        public Builder(GetFeatureFlagDefaultsArgs defaults) {
            $ = new GetFeatureFlagDefaultsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param offVariation (Required) The index of the variation the flag will default to in all new environments when off.
         * 
         * @return builder
         * 
         */
        public Builder offVariation(Output<Integer> offVariation) {
            $.offVariation = offVariation;
            return this;
        }

        /**
         * @param offVariation (Required) The index of the variation the flag will default to in all new environments when off.
         * 
         * @return builder
         * 
         */
        public Builder offVariation(Integer offVariation) {
            return offVariation(Output.of(offVariation));
        }

        /**
         * @param onVariation (Required) The index of the variation the flag will default to in all new environments when on.
         * 
         * @return builder
         * 
         */
        public Builder onVariation(Output<Integer> onVariation) {
            $.onVariation = onVariation;
            return this;
        }

        /**
         * @param onVariation (Required) The index of the variation the flag will default to in all new environments when on.
         * 
         * @return builder
         * 
         */
        public Builder onVariation(Integer onVariation) {
            return onVariation(Output.of(onVariation));
        }

        public GetFeatureFlagDefaultsArgs build() {
            $.offVariation = Objects.requireNonNull($.offVariation, "expected parameter 'offVariation' to be non-null");
            $.onVariation = Objects.requireNonNull($.onVariation, "expected parameter 'onVariation' to be non-null");
            return $;
        }
    }

}
