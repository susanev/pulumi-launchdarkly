// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.launchdarkly;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ProviderArgs extends com.pulumi.resources.ResourceArgs {

    public static final ProviderArgs Empty = new ProviderArgs();

    /**
     * The LaunchDarkly API key
     * 
     */
    @Import(name="accessToken")
    private @Nullable Output<String> accessToken;

    /**
     * @return The LaunchDarkly API key
     * 
     */
    public Optional<Output<String>> accessToken() {
        return Optional.ofNullable(this.accessToken);
    }

    /**
     * The LaunchDarkly host address, e.g. https://app.launchdarkly.com
     * 
     */
    @Import(name="apiHost")
    private @Nullable Output<String> apiHost;

    /**
     * @return The LaunchDarkly host address, e.g. https://app.launchdarkly.com
     * 
     */
    public Optional<Output<String>> apiHost() {
        return Optional.ofNullable(this.apiHost);
    }

    /**
     * The LaunchDarkly OAuth token
     * 
     */
    @Import(name="oauthToken")
    private @Nullable Output<String> oauthToken;

    /**
     * @return The LaunchDarkly OAuth token
     * 
     */
    public Optional<Output<String>> oauthToken() {
        return Optional.ofNullable(this.oauthToken);
    }

    private ProviderArgs() {}

    private ProviderArgs(ProviderArgs $) {
        this.accessToken = $.accessToken;
        this.apiHost = $.apiHost;
        this.oauthToken = $.oauthToken;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ProviderArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ProviderArgs $;

        public Builder() {
            $ = new ProviderArgs();
        }

        public Builder(ProviderArgs defaults) {
            $ = new ProviderArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param accessToken The LaunchDarkly API key
         * 
         * @return builder
         * 
         */
        public Builder accessToken(@Nullable Output<String> accessToken) {
            $.accessToken = accessToken;
            return this;
        }

        /**
         * @param accessToken The LaunchDarkly API key
         * 
         * @return builder
         * 
         */
        public Builder accessToken(String accessToken) {
            return accessToken(Output.of(accessToken));
        }

        /**
         * @param apiHost The LaunchDarkly host address, e.g. https://app.launchdarkly.com
         * 
         * @return builder
         * 
         */
        public Builder apiHost(@Nullable Output<String> apiHost) {
            $.apiHost = apiHost;
            return this;
        }

        /**
         * @param apiHost The LaunchDarkly host address, e.g. https://app.launchdarkly.com
         * 
         * @return builder
         * 
         */
        public Builder apiHost(String apiHost) {
            return apiHost(Output.of(apiHost));
        }

        /**
         * @param oauthToken The LaunchDarkly OAuth token
         * 
         * @return builder
         * 
         */
        public Builder oauthToken(@Nullable Output<String> oauthToken) {
            $.oauthToken = oauthToken;
            return this;
        }

        /**
         * @param oauthToken The LaunchDarkly OAuth token
         * 
         * @return builder
         * 
         */
        public Builder oauthToken(String oauthToken) {
            return oauthToken(Output.of(oauthToken));
        }

        public ProviderArgs build() {
            return $;
        }
    }

}
