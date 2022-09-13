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
    public static class GetFeatureFlag
    {
        /// <summary>
        /// Provides a LaunchDarkly feature flag data source.
        /// 
        /// This data source allows you to retrieve feature flag information from your LaunchDarkly organization.
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using Pulumi;
        /// using Launchdarkly = Pulumi.Launchdarkly;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var example = Launchdarkly.GetFeatureFlag.Invoke(new()
        ///     {
        ///         Key = "example-flag",
        ///         ProjectKey = "example-project",
        ///     });
        /// 
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetFeatureFlagResult> InvokeAsync(GetFeatureFlagArgs args, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.InvokeAsync<GetFeatureFlagResult>("launchdarkly:index/getFeatureFlag:getFeatureFlag", args ?? new GetFeatureFlagArgs(), options.WithDefaults());

        /// <summary>
        /// Provides a LaunchDarkly feature flag data source.
        /// 
        /// This data source allows you to retrieve feature flag information from your LaunchDarkly organization.
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using Pulumi;
        /// using Launchdarkly = Pulumi.Launchdarkly;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var example = Launchdarkly.GetFeatureFlag.Invoke(new()
        ///     {
        ///         Key = "example-flag",
        ///         ProjectKey = "example-project",
        ///     });
        /// 
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Output<GetFeatureFlagResult> Invoke(GetFeatureFlagInvokeArgs args, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.Invoke<GetFeatureFlagResult>("launchdarkly:index/getFeatureFlag:getFeatureFlag", args ?? new GetFeatureFlagInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetFeatureFlagArgs : global::Pulumi.InvokeArgs
    {
        [Input("archived")]
        public bool? Archived { get; set; }

        [Input("customProperties")]
        private List<Inputs.GetFeatureFlagCustomPropertyArgs>? _customProperties;

        /// <summary>
        /// List of nested blocks describing the feature flag's [custom properties](https://docs.launchdarkly.com/docs/custom-properties). To learn more, read Nested Custom Properties.
        /// </summary>
        public List<Inputs.GetFeatureFlagCustomPropertyArgs> CustomProperties
        {
            get => _customProperties ?? (_customProperties = new List<Inputs.GetFeatureFlagCustomPropertyArgs>());
            set => _customProperties = value;
        }

        /// <summary>
        /// A map describing the index of the variation served when the flag is on for new environments. To learn more, read Nested Defaults Blocks.
        /// </summary>
        [Input("defaults")]
        public Inputs.GetFeatureFlagDefaultsArgs? Defaults { get; set; }

        /// <summary>
        /// The variation's description.
        /// </summary>
        [Input("description")]
        public string? Description { get; set; }

        [Input("includeInSnippet")]
        public bool? IncludeInSnippet { get; set; }

        /// <summary>
        /// The unique feature flag key that references the flag in your application code.
        /// </summary>
        [Input("key", required: true)]
        public string Key { get; set; } = null!;

        /// <summary>
        /// The feature flag maintainer's 24 character alphanumeric team member ID.
        /// </summary>
        [Input("maintainerId")]
        public string? MaintainerId { get; set; }

        /// <summary>
        /// The feature flag's project key.
        /// </summary>
        [Input("projectKey", required: true)]
        public string ProjectKey { get; set; } = null!;

        [Input("tags")]
        private List<string>? _tags;

        /// <summary>
        /// Set of feature flag tags.
        /// </summary>
        public List<string> Tags
        {
            get => _tags ?? (_tags = new List<string>());
            set => _tags = value;
        }

        /// <summary>
        /// Whether the flag is a temporary flag.
        /// </summary>
        [Input("temporary")]
        public bool? Temporary { get; set; }

        [Input("variations")]
        private List<Inputs.GetFeatureFlagVariationArgs>? _variations;

        /// <summary>
        /// List of nested blocks describing the variations associated with the feature flag. To learn more, read Nested Variations Blocks.
        /// </summary>
        public List<Inputs.GetFeatureFlagVariationArgs> Variations
        {
            get => _variations ?? (_variations = new List<Inputs.GetFeatureFlagVariationArgs>());
            set => _variations = value;
        }

        public GetFeatureFlagArgs()
        {
        }
        public static new GetFeatureFlagArgs Empty => new GetFeatureFlagArgs();
    }

    public sealed class GetFeatureFlagInvokeArgs : global::Pulumi.InvokeArgs
    {
        [Input("archived")]
        public Input<bool>? Archived { get; set; }

        [Input("customProperties")]
        private InputList<Inputs.GetFeatureFlagCustomPropertyInputArgs>? _customProperties;

        /// <summary>
        /// List of nested blocks describing the feature flag's [custom properties](https://docs.launchdarkly.com/docs/custom-properties). To learn more, read Nested Custom Properties.
        /// </summary>
        public InputList<Inputs.GetFeatureFlagCustomPropertyInputArgs> CustomProperties
        {
            get => _customProperties ?? (_customProperties = new InputList<Inputs.GetFeatureFlagCustomPropertyInputArgs>());
            set => _customProperties = value;
        }

        /// <summary>
        /// A map describing the index of the variation served when the flag is on for new environments. To learn more, read Nested Defaults Blocks.
        /// </summary>
        [Input("defaults")]
        public Input<Inputs.GetFeatureFlagDefaultsInputArgs>? Defaults { get; set; }

        /// <summary>
        /// The variation's description.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        [Input("includeInSnippet")]
        public Input<bool>? IncludeInSnippet { get; set; }

        /// <summary>
        /// The unique feature flag key that references the flag in your application code.
        /// </summary>
        [Input("key", required: true)]
        public Input<string> Key { get; set; } = null!;

        /// <summary>
        /// The feature flag maintainer's 24 character alphanumeric team member ID.
        /// </summary>
        [Input("maintainerId")]
        public Input<string>? MaintainerId { get; set; }

        /// <summary>
        /// The feature flag's project key.
        /// </summary>
        [Input("projectKey", required: true)]
        public Input<string> ProjectKey { get; set; } = null!;

        [Input("tags")]
        private InputList<string>? _tags;

        /// <summary>
        /// Set of feature flag tags.
        /// </summary>
        public InputList<string> Tags
        {
            get => _tags ?? (_tags = new InputList<string>());
            set => _tags = value;
        }

        /// <summary>
        /// Whether the flag is a temporary flag.
        /// </summary>
        [Input("temporary")]
        public Input<bool>? Temporary { get; set; }

        [Input("variations")]
        private InputList<Inputs.GetFeatureFlagVariationInputArgs>? _variations;

        /// <summary>
        /// List of nested blocks describing the variations associated with the feature flag. To learn more, read Nested Variations Blocks.
        /// </summary>
        public InputList<Inputs.GetFeatureFlagVariationInputArgs> Variations
        {
            get => _variations ?? (_variations = new InputList<Inputs.GetFeatureFlagVariationInputArgs>());
            set => _variations = value;
        }

        public GetFeatureFlagInvokeArgs()
        {
        }
        public static new GetFeatureFlagInvokeArgs Empty => new GetFeatureFlagInvokeArgs();
    }


    [OutputType]
    public sealed class GetFeatureFlagResult
    {
        public readonly bool? Archived;
        /// <summary>
        /// A map describing whether this flag has been made available to the client-side JavaScript SDK. To learn more, read Nested Client-Side Availability Block.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetFeatureFlagClientSideAvailabilityResult> ClientSideAvailabilities;
        /// <summary>
        /// List of nested blocks describing the feature flag's [custom properties](https://docs.launchdarkly.com/docs/custom-properties). To learn more, read Nested Custom Properties.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetFeatureFlagCustomPropertyResult> CustomProperties;
        /// <summary>
        /// A map describing the index of the variation served when the flag is on for new environments. To learn more, read Nested Defaults Blocks.
        /// </summary>
        public readonly Outputs.GetFeatureFlagDefaultsResult Defaults;
        /// <summary>
        /// The variation's description.
        /// </summary>
        public readonly string? Description;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly bool? IncludeInSnippet;
        /// <summary>
        /// The unique custom property key.
        /// </summary>
        public readonly string Key;
        /// <summary>
        /// The feature flag maintainer's 24 character alphanumeric team member ID.
        /// </summary>
        public readonly string MaintainerId;
        /// <summary>
        /// The name of the custom property.
        /// </summary>
        public readonly string Name;
        public readonly string ProjectKey;
        /// <summary>
        /// Set of feature flag tags.
        /// </summary>
        public readonly ImmutableArray<string> Tags;
        /// <summary>
        /// Whether the flag is a temporary flag.
        /// </summary>
        public readonly bool? Temporary;
        /// <summary>
        /// The feature flag's variation type: `boolean`, `string`, `number` or `json`.
        /// </summary>
        public readonly string VariationType;
        /// <summary>
        /// List of nested blocks describing the variations associated with the feature flag. To learn more, read Nested Variations Blocks.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetFeatureFlagVariationResult> Variations;

        [OutputConstructor]
        private GetFeatureFlagResult(
            bool? archived,

            ImmutableArray<Outputs.GetFeatureFlagClientSideAvailabilityResult> clientSideAvailabilities,

            ImmutableArray<Outputs.GetFeatureFlagCustomPropertyResult> customProperties,

            Outputs.GetFeatureFlagDefaultsResult defaults,

            string? description,

            string id,

            bool? includeInSnippet,

            string key,

            string maintainerId,

            string name,

            string projectKey,

            ImmutableArray<string> tags,

            bool? temporary,

            string variationType,

            ImmutableArray<Outputs.GetFeatureFlagVariationResult> variations)
        {
            Archived = archived;
            ClientSideAvailabilities = clientSideAvailabilities;
            CustomProperties = customProperties;
            Defaults = defaults;
            Description = description;
            Id = id;
            IncludeInSnippet = includeInSnippet;
            Key = key;
            MaintainerId = maintainerId;
            Name = name;
            ProjectKey = projectKey;
            Tags = tags;
            Temporary = temporary;
            VariationType = variationType;
            Variations = variations;
        }
    }
}
