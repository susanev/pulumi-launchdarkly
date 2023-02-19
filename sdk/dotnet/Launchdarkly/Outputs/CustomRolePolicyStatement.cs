// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;
using Pulumi;

namespace Lbrlabs.PulumiPackage.Launchdarkly.Outputs
{

    [OutputType]
    public sealed class CustomRolePolicyStatement
    {
        /// <summary>
        /// The list of action specifiers defining the actions to which the statement applies. Either `actions` or `not_actions` must be specified. For a list of available actions read [Actions reference](https://docs.launchdarkly.com/home/members/role-actions#actions-reference).
        /// </summary>
        public readonly ImmutableArray<string> Actions;
        /// <summary>
        /// - Either `allow` or `deny`. This argument defines whether the statement allows or denies access to the named resources and actions.
        /// </summary>
        public readonly string Effect;
        /// <summary>
        /// The list of action specifiers defining the actions to which the statement does not apply. Either `actions` or `not_actions` must be specified. For a list of available actions read [Actions reference](https://docs.launchdarkly.com/home/members/role-actions#actions-reference).
        /// </summary>
        public readonly ImmutableArray<string> NotActions;
        /// <summary>
        /// - The list of resource specifiers defining the resources to which the statement does not apply. Either `resources` or `not_resources` must be specified. For a list of available resources read [Understanding resource types and scopes](https://docs.launchdarkly.com/home/members/role-resources#understanding-resource-types-and-scopes).
        /// </summary>
        public readonly ImmutableArray<string> NotResources;
        /// <summary>
        /// - The list of resource specifiers defining the resources to which the statement applies. Either `resources` or `not_resources` must be specified. For a list of available resources read [Understanding resource types and scopes](https://docs.launchdarkly.com/home/members/role-resources#understanding-resource-types-and-scopes).
        /// </summary>
        public readonly ImmutableArray<string> Resources;

        [OutputConstructor]
        private CustomRolePolicyStatement(
            ImmutableArray<string> actions,

            string effect,

            ImmutableArray<string> notActions,

            ImmutableArray<string> notResources,

            ImmutableArray<string> resources)
        {
            Actions = actions;
            Effect = effect;
            NotActions = notActions;
            NotResources = notResources;
            Resources = resources;
        }
    }
}
