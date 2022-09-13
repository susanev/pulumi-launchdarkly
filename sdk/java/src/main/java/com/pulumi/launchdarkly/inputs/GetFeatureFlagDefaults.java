// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.launchdarkly.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;


public final class GetFeatureFlagDefaults extends com.pulumi.resources.InvokeArgs {

    public static final GetFeatureFlagDefaults Empty = new GetFeatureFlagDefaults();

    /**
     * (Required) The index of the variation the flag will default to in all new environments when off.
     * 
     */
    @Import(name="offVariation", required=true)
    private Integer offVariation;

    /**
     * @return (Required) The index of the variation the flag will default to in all new environments when off.
     * 
     */
    public Integer offVariation() {
        return this.offVariation;
    }

    /**
     * (Required) The index of the variation the flag will default to in all new environments when on.
     * 
     */
    @Import(name="onVariation", required=true)
    private Integer onVariation;

    /**
     * @return (Required) The index of the variation the flag will default to in all new environments when on.
     * 
     */
    public Integer onVariation() {
        return this.onVariation;
    }

    private GetFeatureFlagDefaults() {}

    private GetFeatureFlagDefaults(GetFeatureFlagDefaults $) {
        this.offVariation = $.offVariation;
        this.onVariation = $.onVariation;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetFeatureFlagDefaults defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetFeatureFlagDefaults $;

        public Builder() {
            $ = new GetFeatureFlagDefaults();
        }

        public Builder(GetFeatureFlagDefaults defaults) {
            $ = new GetFeatureFlagDefaults(Objects.requireNonNull(defaults));
        }

        /**
         * @param offVariation (Required) The index of the variation the flag will default to in all new environments when off.
         * 
         * @return builder
         * 
         */
        public Builder offVariation(Integer offVariation) {
            $.offVariation = offVariation;
            return this;
        }

        /**
         * @param onVariation (Required) The index of the variation the flag will default to in all new environments when on.
         * 
         * @return builder
         * 
         */
        public Builder onVariation(Integer onVariation) {
            $.onVariation = onVariation;
            return this;
        }

        public GetFeatureFlagDefaults build() {
            $.offVariation = Objects.requireNonNull($.offVariation, "expected parameter 'offVariation' to be non-null");
            $.onVariation = Objects.requireNonNull($.onVariation, "expected parameter 'onVariation' to be non-null");
            return $;
        }
    }

}
