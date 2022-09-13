// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.launchdarkly;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.launchdarkly.inputs.ProjectEnvironmentArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ProjectArgs extends com.pulumi.resources.ResourceArgs {

    public static final ProjectArgs Empty = new ProjectArgs();

    /**
     * List of nested `environments` blocks describing LaunchDarkly environments that belong to the project
     * 
     */
    @Import(name="environments", required=true)
    private Output<List<ProjectEnvironmentArgs>> environments;

    /**
     * @return List of nested `environments` blocks describing LaunchDarkly environments that belong to the project
     * 
     */
    public Output<List<ProjectEnvironmentArgs>> environments() {
        return this.environments;
    }

    /**
     * Whether feature flags created under the project should be available to client-side SDKs by default
     * 
     */
    @Import(name="includeInSnippet")
    private @Nullable Output<Boolean> includeInSnippet;

    /**
     * @return Whether feature flags created under the project should be available to client-side SDKs by default
     * 
     */
    public Optional<Output<Boolean>> includeInSnippet() {
        return Optional.ofNullable(this.includeInSnippet);
    }

    /**
     * The project&#39;s unique key.
     * 
     */
    @Import(name="key", required=true)
    private Output<String> key;

    /**
     * @return The project&#39;s unique key.
     * 
     */
    public Output<String> key() {
        return this.key;
    }

    /**
     * The project&#39;s name.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The project&#39;s name.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The project&#39;s set of tags.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<List<String>> tags;

    /**
     * @return The project&#39;s set of tags.
     * 
     */
    public Optional<Output<List<String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private ProjectArgs() {}

    private ProjectArgs(ProjectArgs $) {
        this.environments = $.environments;
        this.includeInSnippet = $.includeInSnippet;
        this.key = $.key;
        this.name = $.name;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ProjectArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ProjectArgs $;

        public Builder() {
            $ = new ProjectArgs();
        }

        public Builder(ProjectArgs defaults) {
            $ = new ProjectArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param environments List of nested `environments` blocks describing LaunchDarkly environments that belong to the project
         * 
         * @return builder
         * 
         */
        public Builder environments(Output<List<ProjectEnvironmentArgs>> environments) {
            $.environments = environments;
            return this;
        }

        /**
         * @param environments List of nested `environments` blocks describing LaunchDarkly environments that belong to the project
         * 
         * @return builder
         * 
         */
        public Builder environments(List<ProjectEnvironmentArgs> environments) {
            return environments(Output.of(environments));
        }

        /**
         * @param environments List of nested `environments` blocks describing LaunchDarkly environments that belong to the project
         * 
         * @return builder
         * 
         */
        public Builder environments(ProjectEnvironmentArgs... environments) {
            return environments(List.of(environments));
        }

        /**
         * @param includeInSnippet Whether feature flags created under the project should be available to client-side SDKs by default
         * 
         * @return builder
         * 
         */
        public Builder includeInSnippet(@Nullable Output<Boolean> includeInSnippet) {
            $.includeInSnippet = includeInSnippet;
            return this;
        }

        /**
         * @param includeInSnippet Whether feature flags created under the project should be available to client-side SDKs by default
         * 
         * @return builder
         * 
         */
        public Builder includeInSnippet(Boolean includeInSnippet) {
            return includeInSnippet(Output.of(includeInSnippet));
        }

        /**
         * @param key The project&#39;s unique key.
         * 
         * @return builder
         * 
         */
        public Builder key(Output<String> key) {
            $.key = key;
            return this;
        }

        /**
         * @param key The project&#39;s unique key.
         * 
         * @return builder
         * 
         */
        public Builder key(String key) {
            return key(Output.of(key));
        }

        /**
         * @param name The project&#39;s name.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The project&#39;s name.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param tags The project&#39;s set of tags.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<List<String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags The project&#39;s set of tags.
         * 
         * @return builder
         * 
         */
        public Builder tags(List<String> tags) {
            return tags(Output.of(tags));
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

        public ProjectArgs build() {
            $.environments = Objects.requireNonNull($.environments, "expected parameter 'environments' to be non-null");
            $.key = Objects.requireNonNull($.key, "expected parameter 'key' to be non-null");
            return $;
        }
    }

}
