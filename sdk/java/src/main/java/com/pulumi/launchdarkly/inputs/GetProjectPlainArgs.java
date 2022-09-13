// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.launchdarkly.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetProjectPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetProjectPlainArgs Empty = new GetProjectPlainArgs();

    /**
     * The project&#39;s unique key.
     * 
     */
    @Import(name="key", required=true)
    private String key;

    /**
     * @return The project&#39;s unique key.
     * 
     */
    public String key() {
        return this.key;
    }

    /**
     * The project&#39;s set of tags.
     * 
     */
    @Import(name="tags")
    private @Nullable List<String> tags;

    /**
     * @return The project&#39;s set of tags.
     * 
     */
    public Optional<List<String>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private GetProjectPlainArgs() {}

    private GetProjectPlainArgs(GetProjectPlainArgs $) {
        this.key = $.key;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetProjectPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetProjectPlainArgs $;

        public Builder() {
            $ = new GetProjectPlainArgs();
        }

        public Builder(GetProjectPlainArgs defaults) {
            $ = new GetProjectPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param key The project&#39;s unique key.
         * 
         * @return builder
         * 
         */
        public Builder key(String key) {
            $.key = key;
            return this;
        }

        /**
         * @param tags The project&#39;s set of tags.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable List<String> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags The project&#39;s set of tags.
         * 
         * @return builder
         * 
         */
        public Builder tags(String... tags) {
            return tags(List.of(tags));
        }

        public GetProjectPlainArgs build() {
            $.key = Objects.requireNonNull($.key, "expected parameter 'key' to be non-null");
            return $;
        }
    }

}
