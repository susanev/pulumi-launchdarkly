// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.launchdarkly.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class WebhookStatement {
    /**
     * @return The list of action specifiers defining the actions to which the statement applies. Either `actions` or `not_actions` must be specified. For a list of available actions read [Actions reference](https://docs.launchdarkly.com/home/account-security/custom-roles/actions#actions-reference).
     * 
     */
    private @Nullable List<String> actions;
    /**
     * @return Either `allow` or `deny`. This argument defines whether the statement allows or denies access to the named resources and actions.
     * 
     */
    private String effect;
    /**
     * @return The list of action specifiers defining the actions to which the statement does not apply. Either `actions` or `not_actions` must be specified. For a list of available actions read [Actions reference](https://docs.launchdarkly.com/home/account-security/custom-roles/actions#actions-reference).
     * 
     */
    private @Nullable List<String> notActions;
    /**
     * @return The list of resource specifiers defining the resources to which the statement does not apply. Either `resources` or `not_resources` must be specified. For a list of available resources read [Understanding resource types and scopes](https://docs.launchdarkly.com/home/account-security/custom-roles/resources#understanding-resource-types-and-scopes).
     * 
     */
    private @Nullable List<String> notResources;
    /**
     * @return The list of resource specifiers defining the resources to which the statement applies. Either `resources` or `not_resources` must be specified. For a list of available resources read [Understanding resource types and scopes](https://docs.launchdarkly.com/home/account-security/custom-roles/resources#understanding-resource-types-and-scopes).
     * 
     */
    private @Nullable List<String> resources;

    private WebhookStatement() {}
    /**
     * @return The list of action specifiers defining the actions to which the statement applies. Either `actions` or `not_actions` must be specified. For a list of available actions read [Actions reference](https://docs.launchdarkly.com/home/account-security/custom-roles/actions#actions-reference).
     * 
     */
    public List<String> actions() {
        return this.actions == null ? List.of() : this.actions;
    }
    /**
     * @return Either `allow` or `deny`. This argument defines whether the statement allows or denies access to the named resources and actions.
     * 
     */
    public String effect() {
        return this.effect;
    }
    /**
     * @return The list of action specifiers defining the actions to which the statement does not apply. Either `actions` or `not_actions` must be specified. For a list of available actions read [Actions reference](https://docs.launchdarkly.com/home/account-security/custom-roles/actions#actions-reference).
     * 
     */
    public List<String> notActions() {
        return this.notActions == null ? List.of() : this.notActions;
    }
    /**
     * @return The list of resource specifiers defining the resources to which the statement does not apply. Either `resources` or `not_resources` must be specified. For a list of available resources read [Understanding resource types and scopes](https://docs.launchdarkly.com/home/account-security/custom-roles/resources#understanding-resource-types-and-scopes).
     * 
     */
    public List<String> notResources() {
        return this.notResources == null ? List.of() : this.notResources;
    }
    /**
     * @return The list of resource specifiers defining the resources to which the statement applies. Either `resources` or `not_resources` must be specified. For a list of available resources read [Understanding resource types and scopes](https://docs.launchdarkly.com/home/account-security/custom-roles/resources#understanding-resource-types-and-scopes).
     * 
     */
    public List<String> resources() {
        return this.resources == null ? List.of() : this.resources;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebhookStatement defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<String> actions;
        private String effect;
        private @Nullable List<String> notActions;
        private @Nullable List<String> notResources;
        private @Nullable List<String> resources;
        public Builder() {}
        public Builder(WebhookStatement defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.actions = defaults.actions;
    	      this.effect = defaults.effect;
    	      this.notActions = defaults.notActions;
    	      this.notResources = defaults.notResources;
    	      this.resources = defaults.resources;
        }

        @CustomType.Setter
        public Builder actions(@Nullable List<String> actions) {
            this.actions = actions;
            return this;
        }
        public Builder actions(String... actions) {
            return actions(List.of(actions));
        }
        @CustomType.Setter
        public Builder effect(String effect) {
            this.effect = Objects.requireNonNull(effect);
            return this;
        }
        @CustomType.Setter
        public Builder notActions(@Nullable List<String> notActions) {
            this.notActions = notActions;
            return this;
        }
        public Builder notActions(String... notActions) {
            return notActions(List.of(notActions));
        }
        @CustomType.Setter
        public Builder notResources(@Nullable List<String> notResources) {
            this.notResources = notResources;
            return this;
        }
        public Builder notResources(String... notResources) {
            return notResources(List.of(notResources));
        }
        @CustomType.Setter
        public Builder resources(@Nullable List<String> resources) {
            this.resources = resources;
            return this;
        }
        public Builder resources(String... resources) {
            return resources(List.of(resources));
        }
        public WebhookStatement build() {
            final var o = new WebhookStatement();
            o.actions = actions;
            o.effect = effect;
            o.notActions = notActions;
            o.notResources = notResources;
            o.resources = resources;
            return o;
        }
    }
}
