// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.launchdarkly;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.launchdarkly.inputs.SegmentRuleArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SegmentArgs extends com.pulumi.resources.ResourceArgs {

    public static final SegmentArgs Empty = new SegmentArgs();

    /**
     * The description of the segment&#39;s purpose.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return The description of the segment&#39;s purpose.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * The segment&#39;s environment key.
     * 
     */
    @Import(name="envKey", required=true)
    private Output<String> envKey;

    /**
     * @return The segment&#39;s environment key.
     * 
     */
    public Output<String> envKey() {
        return this.envKey;
    }

    /**
     * List of user keys excluded from the segment.
     * 
     */
    @Import(name="excludeds")
    private @Nullable Output<List<String>> excludeds;

    /**
     * @return List of user keys excluded from the segment.
     * 
     */
    public Optional<Output<List<String>>> excludeds() {
        return Optional.ofNullable(this.excludeds);
    }

    /**
     * List of user keys included in the segment.
     * 
     */
    @Import(name="includeds")
    private @Nullable Output<List<String>> includeds;

    /**
     * @return List of user keys included in the segment.
     * 
     */
    public Optional<Output<List<String>>> includeds() {
        return Optional.ofNullable(this.includeds);
    }

    /**
     * The unique key that references the segment.
     * 
     */
    @Import(name="key", required=true)
    private Output<String> key;

    /**
     * @return The unique key that references the segment.
     * 
     */
    public Output<String> key() {
        return this.key;
    }

    /**
     * The human-friendly name for the segment.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The human-friendly name for the segment.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The segment&#39;s project key.
     * 
     */
    @Import(name="projectKey", required=true)
    private Output<String> projectKey;

    /**
     * @return The segment&#39;s project key.
     * 
     */
    public Output<String> projectKey() {
        return this.projectKey;
    }

    /**
     * List of nested custom rule blocks to apply to the segment. To learn more, read Nested Rules Blocks.
     * 
     */
    @Import(name="rules")
    private @Nullable Output<List<SegmentRuleArgs>> rules;

    /**
     * @return List of nested custom rule blocks to apply to the segment. To learn more, read Nested Rules Blocks.
     * 
     */
    public Optional<Output<List<SegmentRuleArgs>>> rules() {
        return Optional.ofNullable(this.rules);
    }

    /**
     * Set of tags for the segment.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<List<String>> tags;

    /**
     * @return Set of tags for the segment.
     * 
     */
    public Optional<Output<List<String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private SegmentArgs() {}

    private SegmentArgs(SegmentArgs $) {
        this.description = $.description;
        this.envKey = $.envKey;
        this.excludeds = $.excludeds;
        this.includeds = $.includeds;
        this.key = $.key;
        this.name = $.name;
        this.projectKey = $.projectKey;
        this.rules = $.rules;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SegmentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SegmentArgs $;

        public Builder() {
            $ = new SegmentArgs();
        }

        public Builder(SegmentArgs defaults) {
            $ = new SegmentArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param description The description of the segment&#39;s purpose.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description The description of the segment&#39;s purpose.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param envKey The segment&#39;s environment key.
         * 
         * @return builder
         * 
         */
        public Builder envKey(Output<String> envKey) {
            $.envKey = envKey;
            return this;
        }

        /**
         * @param envKey The segment&#39;s environment key.
         * 
         * @return builder
         * 
         */
        public Builder envKey(String envKey) {
            return envKey(Output.of(envKey));
        }

        /**
         * @param excludeds List of user keys excluded from the segment.
         * 
         * @return builder
         * 
         */
        public Builder excludeds(@Nullable Output<List<String>> excludeds) {
            $.excludeds = excludeds;
            return this;
        }

        /**
         * @param excludeds List of user keys excluded from the segment.
         * 
         * @return builder
         * 
         */
        public Builder excludeds(List<String> excludeds) {
            return excludeds(Output.of(excludeds));
        }

        /**
         * @param excludeds List of user keys excluded from the segment.
         * 
         * @return builder
         * 
         */
        public Builder excludeds(String... excludeds) {
            return excludeds(List.of(excludeds));
        }

        /**
         * @param includeds List of user keys included in the segment.
         * 
         * @return builder
         * 
         */
        public Builder includeds(@Nullable Output<List<String>> includeds) {
            $.includeds = includeds;
            return this;
        }

        /**
         * @param includeds List of user keys included in the segment.
         * 
         * @return builder
         * 
         */
        public Builder includeds(List<String> includeds) {
            return includeds(Output.of(includeds));
        }

        /**
         * @param includeds List of user keys included in the segment.
         * 
         * @return builder
         * 
         */
        public Builder includeds(String... includeds) {
            return includeds(List.of(includeds));
        }

        /**
         * @param key The unique key that references the segment.
         * 
         * @return builder
         * 
         */
        public Builder key(Output<String> key) {
            $.key = key;
            return this;
        }

        /**
         * @param key The unique key that references the segment.
         * 
         * @return builder
         * 
         */
        public Builder key(String key) {
            return key(Output.of(key));
        }

        /**
         * @param name The human-friendly name for the segment.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The human-friendly name for the segment.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param projectKey The segment&#39;s project key.
         * 
         * @return builder
         * 
         */
        public Builder projectKey(Output<String> projectKey) {
            $.projectKey = projectKey;
            return this;
        }

        /**
         * @param projectKey The segment&#39;s project key.
         * 
         * @return builder
         * 
         */
        public Builder projectKey(String projectKey) {
            return projectKey(Output.of(projectKey));
        }

        /**
         * @param rules List of nested custom rule blocks to apply to the segment. To learn more, read Nested Rules Blocks.
         * 
         * @return builder
         * 
         */
        public Builder rules(@Nullable Output<List<SegmentRuleArgs>> rules) {
            $.rules = rules;
            return this;
        }

        /**
         * @param rules List of nested custom rule blocks to apply to the segment. To learn more, read Nested Rules Blocks.
         * 
         * @return builder
         * 
         */
        public Builder rules(List<SegmentRuleArgs> rules) {
            return rules(Output.of(rules));
        }

        /**
         * @param rules List of nested custom rule blocks to apply to the segment. To learn more, read Nested Rules Blocks.
         * 
         * @return builder
         * 
         */
        public Builder rules(SegmentRuleArgs... rules) {
            return rules(List.of(rules));
        }

        /**
         * @param tags Set of tags for the segment.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<List<String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags Set of tags for the segment.
         * 
         * @return builder
         * 
         */
        public Builder tags(List<String> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param tags Set of tags for the segment.
         * 
         * @return builder
         * 
         */
        public Builder tags(String... tags) {
            return tags(List.of(tags));
        }

        public SegmentArgs build() {
            $.envKey = Objects.requireNonNull($.envKey, "expected parameter 'envKey' to be non-null");
            $.key = Objects.requireNonNull($.key, "expected parameter 'key' to be non-null");
            $.projectKey = Objects.requireNonNull($.projectKey, "expected parameter 'projectKey' to be non-null");
            return $;
        }
    }

}
