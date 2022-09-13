// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;
using Pulumi;

namespace Lbrlabs.PulumiPackage.Launchdarkly
{
    /// <summary>
    /// ## Example Usage
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using Pulumi;
    /// using Launchdarkly = Lbrlabs.PulumiPackage.Launchdarkly;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var staging = new Launchdarkly.Environment("staging", new()
    ///     {
    ///         Key = "staging",
    ///         Color = "ff00ff",
    ///         Tags = new[]
    ///         {
    ///             "terraform",
    ///             "staging",
    ///         },
    ///         ProjectKey = launchdarkly_project.Example.Key,
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using Pulumi;
    /// using Launchdarkly = Lbrlabs.PulumiPackage.Launchdarkly;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var approvalsExample = new Launchdarkly.Environment("approvalsExample", new()
    ///     {
    ///         Key = "approvals-example",
    ///         Color = "ff00ff",
    ///         Tags = new[]
    ///         {
    ///             "terraform",
    ///             "staging",
    ///         },
    ///         ApprovalSettings = new[]
    ///         {
    ///             new Launchdarkly.Inputs.EnvironmentApprovalSettingArgs
    ///             {
    ///                 Required = true,
    ///                 CanReviewOwnRequest = true,
    ///                 MinNumApprovals = 2,
    ///                 CanApplyDeclinedChanges = true,
    ///             },
    ///         },
    ///         ProjectKey = launchdarkly_project.Example.Key,
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// You can import a LaunchDarkly environment using this format`project_key/environment_key`. For example
    /// 
    /// ```sh
    ///  $ pulumi import launchdarkly:index/environment:Environment staging example-project/staging
    /// ```
    /// </summary>
    [LaunchdarklyResourceType("launchdarkly:index/environment:Environment")]
    public partial class Environment : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The environment's SDK key.
        /// </summary>
        [Output("apiKey")]
        public Output<string> ApiKey { get; private set; } = null!;

        [Output("approvalSettings")]
        public Output<ImmutableArray<Outputs.EnvironmentApprovalSetting>> ApprovalSettings { get; private set; } = null!;

        /// <summary>
        /// The environment's client-side ID.
        /// </summary>
        [Output("clientSideId")]
        public Output<string> ClientSideId { get; private set; } = null!;

        /// <summary>
        /// The color swatch as an RGB hex value with no leading `#`. For example: `000000`.
        /// </summary>
        [Output("color")]
        public Output<string> Color { get; private set; } = null!;

        /// <summary>
        /// Set to `true` if this environment requires confirmation for flag and segment changes. This field will default to `false` when not set.
        /// </summary>
        [Output("confirmChanges")]
        public Output<bool?> ConfirmChanges { get; private set; } = null!;

        /// <summary>
        /// Set to `true` to enable data export for every flag created in this environment after you configure this argument. This field will default to `false` when not set. To learn more, read [Data Export](https://docs.launchdarkly.com/docs/data-export).
        /// </summary>
        [Output("defaultTrackEvents")]
        public Output<bool?> DefaultTrackEvents { get; private set; } = null!;

        /// <summary>
        /// The TTL for the environment. This must be between 0 and 60 minutes. The TTL setting only applies to environments using the PHP SDK. This field will default to `0` when not set. To learn more, read [TTL settings](https://docs.launchdarkly.com/docs/environments#section-ttl-settings).
        /// </summary>
        [Output("defaultTtl")]
        public Output<int?> DefaultTtl { get; private set; } = null!;

        /// <summary>
        /// The project-unique key for the environment.
        /// </summary>
        [Output("key")]
        public Output<string> Key { get; private set; } = null!;

        /// <summary>
        /// The environment's mobile key.
        /// </summary>
        [Output("mobileKey")]
        public Output<string> MobileKey { get; private set; } = null!;

        /// <summary>
        /// The name of the environment.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// - The environment's project key.
        /// </summary>
        [Output("projectKey")]
        public Output<string> ProjectKey { get; private set; } = null!;

        /// <summary>
        /// Set to `true` if this environment requires comments for flag and segment changes. This field will default to `false` when not set.
        /// </summary>
        [Output("requireComments")]
        public Output<bool?> RequireComments { get; private set; } = null!;

        /// <summary>
        /// Set to `true` to ensure a user of the client-side SDK cannot impersonate another user. This field will default to `false` when not set.
        /// </summary>
        [Output("secureMode")]
        public Output<bool?> SecureMode { get; private set; } = null!;

        /// <summary>
        /// Set of tags associated with the environment.
        /// </summary>
        [Output("tags")]
        public Output<ImmutableArray<string>> Tags { get; private set; } = null!;


        /// <summary>
        /// Create a Environment resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Environment(string name, EnvironmentArgs args, CustomResourceOptions? options = null)
            : base("launchdarkly:index/environment:Environment", name, args ?? new EnvironmentArgs(), MakeResourceOptions(options, ""))
        {
        }

        private Environment(string name, Input<string> id, EnvironmentState? state = null, CustomResourceOptions? options = null)
            : base("launchdarkly:index/environment:Environment", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
                PluginDownloadURL = "github://api.github.com/lbrlabs",
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing Environment resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static Environment Get(string name, Input<string> id, EnvironmentState? state = null, CustomResourceOptions? options = null)
        {
            return new Environment(name, id, state, options);
        }
    }

    public sealed class EnvironmentArgs : global::Pulumi.ResourceArgs
    {
        [Input("approvalSettings")]
        private InputList<Inputs.EnvironmentApprovalSettingArgs>? _approvalSettings;
        public InputList<Inputs.EnvironmentApprovalSettingArgs> ApprovalSettings
        {
            get => _approvalSettings ?? (_approvalSettings = new InputList<Inputs.EnvironmentApprovalSettingArgs>());
            set => _approvalSettings = value;
        }

        /// <summary>
        /// The color swatch as an RGB hex value with no leading `#`. For example: `000000`.
        /// </summary>
        [Input("color", required: true)]
        public Input<string> Color { get; set; } = null!;

        /// <summary>
        /// Set to `true` if this environment requires confirmation for flag and segment changes. This field will default to `false` when not set.
        /// </summary>
        [Input("confirmChanges")]
        public Input<bool>? ConfirmChanges { get; set; }

        /// <summary>
        /// Set to `true` to enable data export for every flag created in this environment after you configure this argument. This field will default to `false` when not set. To learn more, read [Data Export](https://docs.launchdarkly.com/docs/data-export).
        /// </summary>
        [Input("defaultTrackEvents")]
        public Input<bool>? DefaultTrackEvents { get; set; }

        /// <summary>
        /// The TTL for the environment. This must be between 0 and 60 minutes. The TTL setting only applies to environments using the PHP SDK. This field will default to `0` when not set. To learn more, read [TTL settings](https://docs.launchdarkly.com/docs/environments#section-ttl-settings).
        /// </summary>
        [Input("defaultTtl")]
        public Input<int>? DefaultTtl { get; set; }

        /// <summary>
        /// The project-unique key for the environment.
        /// </summary>
        [Input("key", required: true)]
        public Input<string> Key { get; set; } = null!;

        /// <summary>
        /// The name of the environment.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// - The environment's project key.
        /// </summary>
        [Input("projectKey", required: true)]
        public Input<string> ProjectKey { get; set; } = null!;

        /// <summary>
        /// Set to `true` if this environment requires comments for flag and segment changes. This field will default to `false` when not set.
        /// </summary>
        [Input("requireComments")]
        public Input<bool>? RequireComments { get; set; }

        /// <summary>
        /// Set to `true` to ensure a user of the client-side SDK cannot impersonate another user. This field will default to `false` when not set.
        /// </summary>
        [Input("secureMode")]
        public Input<bool>? SecureMode { get; set; }

        [Input("tags")]
        private InputList<string>? _tags;

        /// <summary>
        /// Set of tags associated with the environment.
        /// </summary>
        public InputList<string> Tags
        {
            get => _tags ?? (_tags = new InputList<string>());
            set => _tags = value;
        }

        public EnvironmentArgs()
        {
        }
        public static new EnvironmentArgs Empty => new EnvironmentArgs();
    }

    public sealed class EnvironmentState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The environment's SDK key.
        /// </summary>
        [Input("apiKey")]
        public Input<string>? ApiKey { get; set; }

        [Input("approvalSettings")]
        private InputList<Inputs.EnvironmentApprovalSettingGetArgs>? _approvalSettings;
        public InputList<Inputs.EnvironmentApprovalSettingGetArgs> ApprovalSettings
        {
            get => _approvalSettings ?? (_approvalSettings = new InputList<Inputs.EnvironmentApprovalSettingGetArgs>());
            set => _approvalSettings = value;
        }

        /// <summary>
        /// The environment's client-side ID.
        /// </summary>
        [Input("clientSideId")]
        public Input<string>? ClientSideId { get; set; }

        /// <summary>
        /// The color swatch as an RGB hex value with no leading `#`. For example: `000000`.
        /// </summary>
        [Input("color")]
        public Input<string>? Color { get; set; }

        /// <summary>
        /// Set to `true` if this environment requires confirmation for flag and segment changes. This field will default to `false` when not set.
        /// </summary>
        [Input("confirmChanges")]
        public Input<bool>? ConfirmChanges { get; set; }

        /// <summary>
        /// Set to `true` to enable data export for every flag created in this environment after you configure this argument. This field will default to `false` when not set. To learn more, read [Data Export](https://docs.launchdarkly.com/docs/data-export).
        /// </summary>
        [Input("defaultTrackEvents")]
        public Input<bool>? DefaultTrackEvents { get; set; }

        /// <summary>
        /// The TTL for the environment. This must be between 0 and 60 minutes. The TTL setting only applies to environments using the PHP SDK. This field will default to `0` when not set. To learn more, read [TTL settings](https://docs.launchdarkly.com/docs/environments#section-ttl-settings).
        /// </summary>
        [Input("defaultTtl")]
        public Input<int>? DefaultTtl { get; set; }

        /// <summary>
        /// The project-unique key for the environment.
        /// </summary>
        [Input("key")]
        public Input<string>? Key { get; set; }

        /// <summary>
        /// The environment's mobile key.
        /// </summary>
        [Input("mobileKey")]
        public Input<string>? MobileKey { get; set; }

        /// <summary>
        /// The name of the environment.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// - The environment's project key.
        /// </summary>
        [Input("projectKey")]
        public Input<string>? ProjectKey { get; set; }

        /// <summary>
        /// Set to `true` if this environment requires comments for flag and segment changes. This field will default to `false` when not set.
        /// </summary>
        [Input("requireComments")]
        public Input<bool>? RequireComments { get; set; }

        /// <summary>
        /// Set to `true` to ensure a user of the client-side SDK cannot impersonate another user. This field will default to `false` when not set.
        /// </summary>
        [Input("secureMode")]
        public Input<bool>? SecureMode { get; set; }

        [Input("tags")]
        private InputList<string>? _tags;

        /// <summary>
        /// Set of tags associated with the environment.
        /// </summary>
        public InputList<string> Tags
        {
            get => _tags ?? (_tags = new InputList<string>());
            set => _tags = value;
        }

        public EnvironmentState()
        {
        }
        public static new EnvironmentState Empty => new EnvironmentState();
    }
}
