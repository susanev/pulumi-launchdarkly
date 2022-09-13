// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.launchdarkly;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.launchdarkly.AccessTokenArgs;
import com.pulumi.launchdarkly.Utilities;
import com.pulumi.launchdarkly.inputs.AccessTokenState;
import com.pulumi.launchdarkly.outputs.AccessTokenInlineRole;
import com.pulumi.launchdarkly.outputs.AccessTokenPolicyStatement;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * ## Example Usage
 * 
 * Resource must contain either a `role`, `custom_role` or an `inline_roles` (previously `policy_statements`) block. As of v1.7.0, `policy_statements` has been deprecated in favor of `inline_roles`.
 * 
 * With a built-in role
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.launchdarkly.AccessToken;
 * import com.pulumi.launchdarkly.AccessTokenArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var readerToken = new AccessToken(&#34;readerToken&#34;, AccessTokenArgs.builder()        
 *             .role(&#34;reader&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * With a custom role
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.launchdarkly.AccessToken;
 * import com.pulumi.launchdarkly.AccessTokenArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var customRoleToken = new AccessToken(&#34;customRoleToken&#34;, AccessTokenArgs.builder()        
 *             .customRoles(&#34;ops&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * With an inline custom role (policy statements)
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.launchdarkly.AccessToken;
 * import com.pulumi.launchdarkly.AccessTokenArgs;
 * import com.pulumi.launchdarkly.inputs.AccessTokenInlineRoleArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var tokenWithPolicyStatements = new AccessToken(&#34;tokenWithPolicyStatements&#34;, AccessTokenArgs.builder()        
 *             .inlineRoles(AccessTokenInlineRoleArgs.builder()
 *                 .actions(&#34;*&#34;)
 *                 .effect(&#34;deny&#34;)
 *                 .resources(&#34;proj/*:env/production&#34;)
 *                 .build())
 *             .serviceToken(true)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 */
@ResourceType(type="launchdarkly:index/accessToken:AccessToken")
public class AccessToken extends com.pulumi.resources.CustomResource {
    /**
     * A list of custom role IDs to use as access limits for the access token
     * 
     */
    @Export(name="customRoles", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> customRoles;

    /**
     * @return A list of custom role IDs to use as access limits for the access token
     * 
     */
    public Output<Optional<List<String>>> customRoles() {
        return Codegen.optional(this.customRoles);
    }
    /**
     * The default API version for this token. Defaults to the latest API version.
     * 
     */
    @Export(name="defaultApiVersion", type=Integer.class, parameters={})
    private Output<Integer> defaultApiVersion;

    /**
     * @return The default API version for this token. Defaults to the latest API version.
     * 
     */
    public Output<Integer> defaultApiVersion() {
        return this.defaultApiVersion;
    }
    /**
     * An expiration time for the current token secret, expressed as a Unix epoch time. Replace the computed token secret with a new value. The expired secret will no longer be able to authorize usage of the LaunchDarkly API. This field argument is **deprecated**. Please update your config to remove `expire` to maintain compatibility with future versions.
     * 
     * @deprecated
     * &#39;expire&#39; is deprecated and will be removed in the next major release of the LaunchDarly provider
     * 
     */
    @Deprecated /* 'expire' is deprecated and will be removed in the next major release of the LaunchDarly provider */
    @Export(name="expire", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> expire;

    /**
     * @return An expiration time for the current token secret, expressed as a Unix epoch time. Replace the computed token secret with a new value. The expired secret will no longer be able to authorize usage of the LaunchDarkly API. This field argument is **deprecated**. Please update your config to remove `expire` to maintain compatibility with future versions.
     * 
     */
    public Output<Optional<Integer>> expire() {
        return Codegen.optional(this.expire);
    }
    /**
     * An array of statements represented as config blocks with 3 attributes: effect, resources, actions. May be used in place
     * of a built-in or custom role.
     * 
     */
    @Export(name="inlineRoles", type=List.class, parameters={AccessTokenInlineRole.class})
    private Output</* @Nullable */ List<AccessTokenInlineRole>> inlineRoles;

    /**
     * @return An array of statements represented as config blocks with 3 attributes: effect, resources, actions. May be used in place
     * of a built-in or custom role.
     * 
     */
    public Output<Optional<List<AccessTokenInlineRole>>> inlineRoles() {
        return Codegen.optional(this.inlineRoles);
    }
    /**
     * A human-friendly name for the access token.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return A human-friendly name for the access token.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Define inline custom roles. An array of statements represented as config blocks with 3 attributes: effect, resources, actions. May be used in place of a built-in or custom role. [Policies in custom roles](https://docs.launchdarkly.com/docs/policies-in-custom-roles). May be specified more than once. This field argument is **deprecated**. Please update your config to use `inline_role` to maintain compatibility with future versions.
     * 
     * @deprecated
     * &#39;policy_statements&#39; is deprecated in favor of &#39;inline_roles&#39;. This field will be removed in the next major release of the LaunchDarkly provider
     * 
     */
    @Deprecated /* 'policy_statements' is deprecated in favor of 'inline_roles'. This field will be removed in the next major release of the LaunchDarkly provider */
    @Export(name="policyStatements", type=List.class, parameters={AccessTokenPolicyStatement.class})
    private Output</* @Nullable */ List<AccessTokenPolicyStatement>> policyStatements;

    /**
     * @return Define inline custom roles. An array of statements represented as config blocks with 3 attributes: effect, resources, actions. May be used in place of a built-in or custom role. [Policies in custom roles](https://docs.launchdarkly.com/docs/policies-in-custom-roles). May be specified more than once. This field argument is **deprecated**. Please update your config to use `inline_role` to maintain compatibility with future versions.
     * 
     */
    public Output<Optional<List<AccessTokenPolicyStatement>>> policyStatements() {
        return Codegen.optional(this.policyStatements);
    }
    /**
     * A built-in LaunchDarkly role. Can be `reader`, `writer`, or `admin`
     * 
     */
    @Export(name="role", type=String.class, parameters={})
    private Output</* @Nullable */ String> role;

    /**
     * @return A built-in LaunchDarkly role. Can be `reader`, `writer`, or `admin`
     * 
     */
    public Output<Optional<String>> role() {
        return Codegen.optional(this.role);
    }
    /**
     * Whether the token will be a [service token](https://docs.launchdarkly.com/home/account-security/api-access-tokens#service-tokens)
     * 
     */
    @Export(name="serviceToken", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> serviceToken;

    /**
     * @return Whether the token will be a [service token](https://docs.launchdarkly.com/home/account-security/api-access-tokens#service-tokens)
     * 
     */
    public Output<Optional<Boolean>> serviceToken() {
        return Codegen.optional(this.serviceToken);
    }
    /**
     * The access token used to authorize usage of the LaunchDarkly API.
     * 
     */
    @Export(name="token", type=String.class, parameters={})
    private Output<String> token;

    /**
     * @return The access token used to authorize usage of the LaunchDarkly API.
     * 
     */
    public Output<String> token() {
        return this.token;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public AccessToken(String name) {
        this(name, AccessTokenArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public AccessToken(String name, @Nullable AccessTokenArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public AccessToken(String name, @Nullable AccessTokenArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("launchdarkly:index/accessToken:AccessToken", name, args == null ? AccessTokenArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private AccessToken(String name, Output<String> id, @Nullable AccessTokenState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("launchdarkly:index/accessToken:AccessToken", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static AccessToken get(String name, Output<String> id, @Nullable AccessTokenState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new AccessToken(name, id, state, options);
    }
}
