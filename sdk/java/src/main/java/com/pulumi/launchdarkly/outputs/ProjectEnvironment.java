// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.launchdarkly.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.launchdarkly.outputs.ProjectEnvironmentApprovalSetting;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ProjectEnvironment {
    private @Nullable String apiKey;
    private @Nullable List<ProjectEnvironmentApprovalSetting> approvalSettings;
    private @Nullable String clientSideId;
    /**
     * @return The color swatch as an RGB hex value with no leading `#`. For example: `000000`.
     * 
     */
    private String color;
    /**
     * @return Set to `true` if this environment requires confirmation for flag and segment changes. This field will default to `false` when not set.
     * 
     */
    private @Nullable Boolean confirmChanges;
    /**
     * @return Set to `true` to enable data export for every flag created in this environment after you configure this argument. This field will default to `false` when not set. To learn more, read [Data Export](https://docs.launchdarkly.com/home/data-export).
     * 
     */
    private @Nullable Boolean defaultTrackEvents;
    /**
     * @return The TTL for the environment. This must be between 0 and 60 minutes. The TTL setting only applies to environments using the PHP SDK. This field will default to `0` when not set. To learn more, read [TTL settings](https://docs.launchdarkly.com/home/organize/environments#ttl-settings).
     * 
     */
    private @Nullable Integer defaultTtl;
    /**
     * @return The project-unique key for the environment. A change in this field will force the destruction of the existing environment and the creation of a new one.
     * 
     */
    private String key;
    private @Nullable String mobileKey;
    /**
     * @return The name of the environment.
     * 
     */
    private String name;
    /**
     * @return Set to `true` if this environment requires comments for flag and segment changes. This field will default to `false` when not set.
     * 
     */
    private @Nullable Boolean requireComments;
    /**
     * @return Set to `true` to ensure a user of the client-side SDK cannot impersonate another user. This field will default to `false` when not set.
     * 
     */
    private @Nullable Boolean secureMode;
    /**
     * @return Set of tags associated with the environment.
     * 
     */
    private @Nullable List<String> tags;

    private ProjectEnvironment() {}
    public Optional<String> apiKey() {
        return Optional.ofNullable(this.apiKey);
    }
    public List<ProjectEnvironmentApprovalSetting> approvalSettings() {
        return this.approvalSettings == null ? List.of() : this.approvalSettings;
    }
    public Optional<String> clientSideId() {
        return Optional.ofNullable(this.clientSideId);
    }
    /**
     * @return The color swatch as an RGB hex value with no leading `#`. For example: `000000`.
     * 
     */
    public String color() {
        return this.color;
    }
    /**
     * @return Set to `true` if this environment requires confirmation for flag and segment changes. This field will default to `false` when not set.
     * 
     */
    public Optional<Boolean> confirmChanges() {
        return Optional.ofNullable(this.confirmChanges);
    }
    /**
     * @return Set to `true` to enable data export for every flag created in this environment after you configure this argument. This field will default to `false` when not set. To learn more, read [Data Export](https://docs.launchdarkly.com/home/data-export).
     * 
     */
    public Optional<Boolean> defaultTrackEvents() {
        return Optional.ofNullable(this.defaultTrackEvents);
    }
    /**
     * @return The TTL for the environment. This must be between 0 and 60 minutes. The TTL setting only applies to environments using the PHP SDK. This field will default to `0` when not set. To learn more, read [TTL settings](https://docs.launchdarkly.com/home/organize/environments#ttl-settings).
     * 
     */
    public Optional<Integer> defaultTtl() {
        return Optional.ofNullable(this.defaultTtl);
    }
    /**
     * @return The project-unique key for the environment. A change in this field will force the destruction of the existing environment and the creation of a new one.
     * 
     */
    public String key() {
        return this.key;
    }
    public Optional<String> mobileKey() {
        return Optional.ofNullable(this.mobileKey);
    }
    /**
     * @return The name of the environment.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return Set to `true` if this environment requires comments for flag and segment changes. This field will default to `false` when not set.
     * 
     */
    public Optional<Boolean> requireComments() {
        return Optional.ofNullable(this.requireComments);
    }
    /**
     * @return Set to `true` to ensure a user of the client-side SDK cannot impersonate another user. This field will default to `false` when not set.
     * 
     */
    public Optional<Boolean> secureMode() {
        return Optional.ofNullable(this.secureMode);
    }
    /**
     * @return Set of tags associated with the environment.
     * 
     */
    public List<String> tags() {
        return this.tags == null ? List.of() : this.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ProjectEnvironment defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String apiKey;
        private @Nullable List<ProjectEnvironmentApprovalSetting> approvalSettings;
        private @Nullable String clientSideId;
        private String color;
        private @Nullable Boolean confirmChanges;
        private @Nullable Boolean defaultTrackEvents;
        private @Nullable Integer defaultTtl;
        private String key;
        private @Nullable String mobileKey;
        private String name;
        private @Nullable Boolean requireComments;
        private @Nullable Boolean secureMode;
        private @Nullable List<String> tags;
        public Builder() {}
        public Builder(ProjectEnvironment defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apiKey = defaults.apiKey;
    	      this.approvalSettings = defaults.approvalSettings;
    	      this.clientSideId = defaults.clientSideId;
    	      this.color = defaults.color;
    	      this.confirmChanges = defaults.confirmChanges;
    	      this.defaultTrackEvents = defaults.defaultTrackEvents;
    	      this.defaultTtl = defaults.defaultTtl;
    	      this.key = defaults.key;
    	      this.mobileKey = defaults.mobileKey;
    	      this.name = defaults.name;
    	      this.requireComments = defaults.requireComments;
    	      this.secureMode = defaults.secureMode;
    	      this.tags = defaults.tags;
        }

        @CustomType.Setter
        public Builder apiKey(@Nullable String apiKey) {
            this.apiKey = apiKey;
            return this;
        }
        @CustomType.Setter
        public Builder approvalSettings(@Nullable List<ProjectEnvironmentApprovalSetting> approvalSettings) {
            this.approvalSettings = approvalSettings;
            return this;
        }
        public Builder approvalSettings(ProjectEnvironmentApprovalSetting... approvalSettings) {
            return approvalSettings(List.of(approvalSettings));
        }
        @CustomType.Setter
        public Builder clientSideId(@Nullable String clientSideId) {
            this.clientSideId = clientSideId;
            return this;
        }
        @CustomType.Setter
        public Builder color(String color) {
            this.color = Objects.requireNonNull(color);
            return this;
        }
        @CustomType.Setter
        public Builder confirmChanges(@Nullable Boolean confirmChanges) {
            this.confirmChanges = confirmChanges;
            return this;
        }
        @CustomType.Setter
        public Builder defaultTrackEvents(@Nullable Boolean defaultTrackEvents) {
            this.defaultTrackEvents = defaultTrackEvents;
            return this;
        }
        @CustomType.Setter
        public Builder defaultTtl(@Nullable Integer defaultTtl) {
            this.defaultTtl = defaultTtl;
            return this;
        }
        @CustomType.Setter
        public Builder key(String key) {
            this.key = Objects.requireNonNull(key);
            return this;
        }
        @CustomType.Setter
        public Builder mobileKey(@Nullable String mobileKey) {
            this.mobileKey = mobileKey;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        @CustomType.Setter
        public Builder requireComments(@Nullable Boolean requireComments) {
            this.requireComments = requireComments;
            return this;
        }
        @CustomType.Setter
        public Builder secureMode(@Nullable Boolean secureMode) {
            this.secureMode = secureMode;
            return this;
        }
        @CustomType.Setter
        public Builder tags(@Nullable List<String> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(String... tags) {
            return tags(List.of(tags));
        }
        public ProjectEnvironment build() {
            final var o = new ProjectEnvironment();
            o.apiKey = apiKey;
            o.approvalSettings = approvalSettings;
            o.clientSideId = clientSideId;
            o.color = color;
            o.confirmChanges = confirmChanges;
            o.defaultTrackEvents = defaultTrackEvents;
            o.defaultTtl = defaultTtl;
            o.key = key;
            o.mobileKey = mobileKey;
            o.name = name;
            o.requireComments = requireComments;
            o.secureMode = secureMode;
            o.tags = tags;
            return o;
        }
    }
}
