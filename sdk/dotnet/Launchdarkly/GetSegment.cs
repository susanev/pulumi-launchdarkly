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
    public static class GetSegment
    {
        /// <summary>
        /// Provides a LaunchDarkly segment data source.
        /// 
        /// This data source allows you to retrieve segment information from your LaunchDarkly organization.
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
        ///     var example = Launchdarkly.GetSegment.Invoke(new()
        ///     {
        ///         EnvKey = "example-env",
        ///         Key = "example-segment",
        ///         ProjectKey = "example-project",
        ///     });
        /// 
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetSegmentResult> InvokeAsync(GetSegmentArgs args, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.InvokeAsync<GetSegmentResult>("launchdarkly:index/getSegment:getSegment", args ?? new GetSegmentArgs(), options.WithDefaults());

        /// <summary>
        /// Provides a LaunchDarkly segment data source.
        /// 
        /// This data source allows you to retrieve segment information from your LaunchDarkly organization.
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
        ///     var example = Launchdarkly.GetSegment.Invoke(new()
        ///     {
        ///         EnvKey = "example-env",
        ///         Key = "example-segment",
        ///         ProjectKey = "example-project",
        ///     });
        /// 
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Output<GetSegmentResult> Invoke(GetSegmentInvokeArgs args, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.Invoke<GetSegmentResult>("launchdarkly:index/getSegment:getSegment", args ?? new GetSegmentInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetSegmentArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The description of the segment's purpose.
        /// </summary>
        [Input("description")]
        public string? Description { get; set; }

        /// <summary>
        /// The segment's environment key.
        /// </summary>
        [Input("envKey", required: true)]
        public string EnvKey { get; set; } = null!;

        [Input("excludeds")]
        private List<string>? _excludeds;

        /// <summary>
        /// List of user keys excluded from the segment.
        /// </summary>
        public List<string> Excludeds
        {
            get => _excludeds ?? (_excludeds = new List<string>());
            set => _excludeds = value;
        }

        [Input("includeds")]
        private List<string>? _includeds;

        /// <summary>
        /// List of user keys included in the segment.
        /// </summary>
        public List<string> Includeds
        {
            get => _includeds ?? (_includeds = new List<string>());
            set => _includeds = value;
        }

        /// <summary>
        /// The unique key that references the segment.
        /// </summary>
        [Input("key", required: true)]
        public string Key { get; set; } = null!;

        /// <summary>
        /// The segment's project key.
        /// </summary>
        [Input("projectKey", required: true)]
        public string ProjectKey { get; set; } = null!;

        [Input("rules")]
        private List<Inputs.GetSegmentRuleArgs>? _rules;

        /// <summary>
        /// List of nested custom rule blocks to apply to the segment. To learn more, read Nested Rules Blocks.
        /// </summary>
        public List<Inputs.GetSegmentRuleArgs> Rules
        {
            get => _rules ?? (_rules = new List<Inputs.GetSegmentRuleArgs>());
            set => _rules = value;
        }

        [Input("tags")]
        private List<string>? _tags;

        /// <summary>
        /// Set of tags for the segment.
        /// </summary>
        public List<string> Tags
        {
            get => _tags ?? (_tags = new List<string>());
            set => _tags = value;
        }

        public GetSegmentArgs()
        {
        }
        public static new GetSegmentArgs Empty => new GetSegmentArgs();
    }

    public sealed class GetSegmentInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The description of the segment's purpose.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// The segment's environment key.
        /// </summary>
        [Input("envKey", required: true)]
        public Input<string> EnvKey { get; set; } = null!;

        [Input("excludeds")]
        private InputList<string>? _excludeds;

        /// <summary>
        /// List of user keys excluded from the segment.
        /// </summary>
        public InputList<string> Excludeds
        {
            get => _excludeds ?? (_excludeds = new InputList<string>());
            set => _excludeds = value;
        }

        [Input("includeds")]
        private InputList<string>? _includeds;

        /// <summary>
        /// List of user keys included in the segment.
        /// </summary>
        public InputList<string> Includeds
        {
            get => _includeds ?? (_includeds = new InputList<string>());
            set => _includeds = value;
        }

        /// <summary>
        /// The unique key that references the segment.
        /// </summary>
        [Input("key", required: true)]
        public Input<string> Key { get; set; } = null!;

        /// <summary>
        /// The segment's project key.
        /// </summary>
        [Input("projectKey", required: true)]
        public Input<string> ProjectKey { get; set; } = null!;

        [Input("rules")]
        private InputList<Inputs.GetSegmentRuleInputArgs>? _rules;

        /// <summary>
        /// List of nested custom rule blocks to apply to the segment. To learn more, read Nested Rules Blocks.
        /// </summary>
        public InputList<Inputs.GetSegmentRuleInputArgs> Rules
        {
            get => _rules ?? (_rules = new InputList<Inputs.GetSegmentRuleInputArgs>());
            set => _rules = value;
        }

        [Input("tags")]
        private InputList<string>? _tags;

        /// <summary>
        /// Set of tags for the segment.
        /// </summary>
        public InputList<string> Tags
        {
            get => _tags ?? (_tags = new InputList<string>());
            set => _tags = value;
        }

        public GetSegmentInvokeArgs()
        {
        }
        public static new GetSegmentInvokeArgs Empty => new GetSegmentInvokeArgs();
    }


    [OutputType]
    public sealed class GetSegmentResult
    {
        /// <summary>
        /// The segment's creation date represented as a UNIX epoch timestamp.
        /// </summary>
        public readonly int CreationDate;
        /// <summary>
        /// The description of the segment's purpose.
        /// </summary>
        public readonly string? Description;
        public readonly string EnvKey;
        /// <summary>
        /// List of user keys excluded from the segment.
        /// </summary>
        public readonly ImmutableArray<string> Excludeds;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// List of user keys included in the segment.
        /// </summary>
        public readonly ImmutableArray<string> Includeds;
        public readonly string Key;
        /// <summary>
        /// The human-friendly name for the segment.
        /// </summary>
        public readonly string Name;
        public readonly string ProjectKey;
        /// <summary>
        /// List of nested custom rule blocks to apply to the segment. To learn more, read Nested Rules Blocks.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetSegmentRuleResult> Rules;
        /// <summary>
        /// Set of tags for the segment.
        /// </summary>
        public readonly ImmutableArray<string> Tags;

        [OutputConstructor]
        private GetSegmentResult(
            int creationDate,

            string? description,

            string envKey,

            ImmutableArray<string> excludeds,

            string id,

            ImmutableArray<string> includeds,

            string key,

            string name,

            string projectKey,

            ImmutableArray<Outputs.GetSegmentRuleResult> rules,

            ImmutableArray<string> tags)
        {
            CreationDate = creationDate;
            Description = description;
            EnvKey = envKey;
            Excludeds = excludeds;
            Id = id;
            Includeds = includeds;
            Key = key;
            Name = name;
            ProjectKey = projectKey;
            Rules = rules;
            Tags = tags;
        }
    }
}
