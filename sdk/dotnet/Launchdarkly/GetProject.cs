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
    public static class GetProject
    {
        /// <summary>
        /// Provides a LaunchDarkly project data source.
        /// 
        /// This data source allows you to retrieve project information from your LaunchDarkly organization.
        /// 
        /// &gt; **Note:** LaunchDarkly data sources do not provide access to the project's environments. If you wish to import environment configurations as data sources you must use the [`launchdarkly.Environment` data source](https://www.terraform.io/docs/providers/launchdarkly/d/environment.html).
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
        ///     var example = Launchdarkly.GetProject.Invoke(new()
        ///     {
        ///         Key = "example-project",
        ///     });
        /// 
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetProjectResult> InvokeAsync(GetProjectArgs args, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.InvokeAsync<GetProjectResult>("launchdarkly:index/getProject:getProject", args ?? new GetProjectArgs(), options.WithDefaults());

        /// <summary>
        /// Provides a LaunchDarkly project data source.
        /// 
        /// This data source allows you to retrieve project information from your LaunchDarkly organization.
        /// 
        /// &gt; **Note:** LaunchDarkly data sources do not provide access to the project's environments. If you wish to import environment configurations as data sources you must use the [`launchdarkly.Environment` data source](https://www.terraform.io/docs/providers/launchdarkly/d/environment.html).
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
        ///     var example = Launchdarkly.GetProject.Invoke(new()
        ///     {
        ///         Key = "example-project",
        ///     });
        /// 
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Output<GetProjectResult> Invoke(GetProjectInvokeArgs args, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.Invoke<GetProjectResult>("launchdarkly:index/getProject:getProject", args ?? new GetProjectInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetProjectArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The project's unique key.
        /// </summary>
        [Input("key", required: true)]
        public string Key { get; set; } = null!;

        [Input("tags")]
        private List<string>? _tags;

        /// <summary>
        /// The project's set of tags.
        /// </summary>
        public List<string> Tags
        {
            get => _tags ?? (_tags = new List<string>());
            set => _tags = value;
        }

        public GetProjectArgs()
        {
        }
        public static new GetProjectArgs Empty => new GetProjectArgs();
    }

    public sealed class GetProjectInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The project's unique key.
        /// </summary>
        [Input("key", required: true)]
        public Input<string> Key { get; set; } = null!;

        [Input("tags")]
        private InputList<string>? _tags;

        /// <summary>
        /// The project's set of tags.
        /// </summary>
        public InputList<string> Tags
        {
            get => _tags ?? (_tags = new InputList<string>());
            set => _tags = value;
        }

        public GetProjectInvokeArgs()
        {
        }
        public static new GetProjectInvokeArgs Empty => new GetProjectInvokeArgs();
    }


    [OutputType]
    public sealed class GetProjectResult
    {
        /// <summary>
        /// A map describing whether flags in this project are available to the client-side JavaScript SDK by default. To learn more, read Nested Client-Side Availability Block.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetProjectClientSideAvailabilityResult> ClientSideAvailabilities;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly string Key;
        /// <summary>
        /// The project's name.
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// The project's set of tags.
        /// </summary>
        public readonly ImmutableArray<string> Tags;

        [OutputConstructor]
        private GetProjectResult(
            ImmutableArray<Outputs.GetProjectClientSideAvailabilityResult> clientSideAvailabilities,

            string id,

            string key,

            string name,

            ImmutableArray<string> tags)
        {
            ClientSideAvailabilities = clientSideAvailabilities;
            Id = id;
            Key = key;
            Name = name;
            Tags = tags;
        }
    }
}
