// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.launchdarkly.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.launchdarkly.outputs.GetEnvironmentApprovalSetting;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetEnvironmentResult {
    /**
     * @return The environment&#39;s SDK key.
     * 
     */
    private String apiKey;
    private List<GetEnvironmentApprovalSetting> approvalSettings;
    /**
     * @return The environment&#39;s client-side ID.
     * 
     */
    private String clientSideId;
    /**
     * @return The color swatch as an RGB hex value with no leading `#`. For example: `000000`.
     * 
     */
    private String color;
    /**
     * @return A value of `true` indicates that this environment requires confirmation for flag and segment changes.
     * 
     */
    private @Nullable Boolean confirmChanges;
    /**
     * @return A value of `true` enables data export for every flag created in this environment. To learn more, read [Data Export](https://docs.launchdarkly.com/home/data-export).
     * 
     */
    private @Nullable Boolean defaultTrackEvents;
    /**
     * @return The TTL for the environment. This will be a numeric value between 0 and 60 in minutes. The TTL setting only applies to environments using the PHP SDK. To learn more, read [TTL settings](https://docs.launchdarkly.com/home/organize/environments#ttl-settings).
     * 
     */
    private @Nullable Integer defaultTtl;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    private String key;
    /**
     * @return The environment&#39;s mobile key.
     * 
     */
    private String mobileKey;
    /**
     * @return The name of the environment.
     * 
     */
    private String name;
    private String projectKey;
    /**
     * @return A value of `true` indicates that this environment requires comments for flag and segment changes.
     * 
     */
    private @Nullable Boolean requireComments;
    /**
     * @return A value of true `true` ensures a user of the client-side SDK cannot impersonate another user.
     * 
     */
    private @Nullable Boolean secureMode;
    /**
     * @return Set of tags associated with the environment.
     * 
     */
    private @Nullable List<String> tags;

    private GetEnvironmentResult() {}
    /**
     * @return The environment&#39;s SDK key.
     * 
     */
    public String apiKey() {
        return this.apiKey;
    }
    public List<GetEnvironmentApprovalSetting> approvalSettings() {
        return this.approvalSettings;
    }
    /**
     * @return The environment&#39;s client-side ID.
     * 
     */
    public String clientSideId() {
        return this.clientSideId;
    }
    /**
     * @return The color swatch as an RGB hex value with no leading `#`. For example: `000000`.
     * 
     */
    public String color() {
        return this.color;
    }
    /**
     * @return A value of `true` indicates that this environment requires confirmation for flag and segment changes.
     * 
     */
    public Optional<Boolean> confirmChanges() {
        return Optional.ofNullable(this.confirmChanges);
    }
    /**
     * @return A value of `true` enables data export for every flag created in this environment. To learn more, read [Data Export](https://docs.launchdarkly.com/home/data-export).
     * 
     */
    public Optional<Boolean> defaultTrackEvents() {
        return Optional.ofNullable(this.defaultTrackEvents);
    }
    /**
     * @return The TTL for the environment. This will be a numeric value between 0 and 60 in minutes. The TTL setting only applies to environments using the PHP SDK. To learn more, read [TTL settings](https://docs.launchdarkly.com/home/organize/environments#ttl-settings).
     * 
     */
    public Optional<Integer> defaultTtl() {
        return Optional.ofNullable(this.defaultTtl);
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    public String key() {
        return this.key;
    }
    /**
     * @return The environment&#39;s mobile key.
     * 
     */
    public String mobileKey() {
        return this.mobileKey;
    }
    /**
     * @return The name of the environment.
     * 
     */
    public String name() {
        return this.name;
    }
    public String projectKey() {
        return this.projectKey;
    }
    /**
     * @return A value of `true` indicates that this environment requires comments for flag and segment changes.
     * 
     */
    public Optional<Boolean> requireComments() {
        return Optional.ofNullable(this.requireComments);
    }
    /**
     * @return A value of true `true` ensures a user of the client-side SDK cannot impersonate another user.
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

    public static Builder builder(GetEnvironmentResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String apiKey;
        private List<GetEnvironmentApprovalSetting> approvalSettings;
        private String clientSideId;
        private String color;
        private @Nullable Boolean confirmChanges;
        private @Nullable Boolean defaultTrackEvents;
        private @Nullable Integer defaultTtl;
        private String id;
        private String key;
        private String mobileKey;
        private String name;
        private String projectKey;
        private @Nullable Boolean requireComments;
        private @Nullable Boolean secureMode;
        private @Nullable List<String> tags;
        public Builder() {}
        public Builder(GetEnvironmentResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apiKey = defaults.apiKey;
    	      this.approvalSettings = defaults.approvalSettings;
    	      this.clientSideId = defaults.clientSideId;
    	      this.color = defaults.color;
    	      this.confirmChanges = defaults.confirmChanges;
    	      this.defaultTrackEvents = defaults.defaultTrackEvents;
    	      this.defaultTtl = defaults.defaultTtl;
    	      this.id = defaults.id;
    	      this.key = defaults.key;
    	      this.mobileKey = defaults.mobileKey;
    	      this.name = defaults.name;
    	      this.projectKey = defaults.projectKey;
    	      this.requireComments = defaults.requireComments;
    	      this.secureMode = defaults.secureMode;
    	      this.tags = defaults.tags;
        }

        @CustomType.Setter
        public Builder apiKey(String apiKey) {
            this.apiKey = Objects.requireNonNull(apiKey);
            return this;
        }
        @CustomType.Setter
        public Builder approvalSettings(List<GetEnvironmentApprovalSetting> approvalSettings) {
            this.approvalSettings = Objects.requireNonNull(approvalSettings);
            return this;
        }
        public Builder approvalSettings(GetEnvironmentApprovalSetting... approvalSettings) {
            return approvalSettings(List.of(approvalSettings));
        }
        @CustomType.Setter
        public Builder clientSideId(String clientSideId) {
            this.clientSideId = Objects.requireNonNull(clientSideId);
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
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder key(String key) {
            this.key = Objects.requireNonNull(key);
            return this;
        }
        @CustomType.Setter
        public Builder mobileKey(String mobileKey) {
            this.mobileKey = Objects.requireNonNull(mobileKey);
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        @CustomType.Setter
        public Builder projectKey(String projectKey) {
            this.projectKey = Objects.requireNonNull(projectKey);
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
        public GetEnvironmentResult build() {
            final var o = new GetEnvironmentResult();
            o.apiKey = apiKey;
            o.approvalSettings = approvalSettings;
            o.clientSideId = clientSideId;
            o.color = color;
            o.confirmChanges = confirmChanges;
            o.defaultTrackEvents = defaultTrackEvents;
            o.defaultTtl = defaultTtl;
            o.id = id;
            o.key = key;
            o.mobileKey = mobileKey;
            o.name = name;
            o.projectKey = projectKey;
            o.requireComments = requireComments;
            o.secureMode = secureMode;
            o.tags = tags;
            return o;
        }
    }
}
