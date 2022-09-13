# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

from . import _utilities
import typing
# Export this package's modules as members:
from .access_token import *
from .custom_role import *
from .destination import *
from .environment import *
from .feature_flag import *
from .feature_flag_environment import *
from .get_environment import *
from .get_feature_flag import *
from .get_feature_flag_environment import *
from .get_project import *
from .get_segment import *
from .get_team_member import *
from .get_webhook import *
from .project import *
from .provider import *
from .segment import *
from .team_member import *
from .webhook import *
from ._inputs import *
from . import outputs

# Make subpackages available:
if typing.TYPE_CHECKING:
    import lbrlabs_pulumi_launchdarkly.config as __config
    config = __config
else:
    config = _utilities.lazy_import('lbrlabs_pulumi_launchdarkly.config')

_utilities.register(
    resource_modules="""
[
 {
  "pkg": "launchdarkly",
  "mod": "index/accessToken",
  "fqn": "lbrlabs_pulumi_launchdarkly",
  "classes": {
   "launchdarkly:index/accessToken:AccessToken": "AccessToken"
  }
 },
 {
  "pkg": "launchdarkly",
  "mod": "index/customRole",
  "fqn": "lbrlabs_pulumi_launchdarkly",
  "classes": {
   "launchdarkly:index/customRole:CustomRole": "CustomRole"
  }
 },
 {
  "pkg": "launchdarkly",
  "mod": "index/destination",
  "fqn": "lbrlabs_pulumi_launchdarkly",
  "classes": {
   "launchdarkly:index/destination:Destination": "Destination"
  }
 },
 {
  "pkg": "launchdarkly",
  "mod": "index/environment",
  "fqn": "lbrlabs_pulumi_launchdarkly",
  "classes": {
   "launchdarkly:index/environment:Environment": "Environment"
  }
 },
 {
  "pkg": "launchdarkly",
  "mod": "index/featureFlag",
  "fqn": "lbrlabs_pulumi_launchdarkly",
  "classes": {
   "launchdarkly:index/featureFlag:FeatureFlag": "FeatureFlag"
  }
 },
 {
  "pkg": "launchdarkly",
  "mod": "index/featureFlagEnvironment",
  "fqn": "lbrlabs_pulumi_launchdarkly",
  "classes": {
   "launchdarkly:index/featureFlagEnvironment:FeatureFlagEnvironment": "FeatureFlagEnvironment"
  }
 },
 {
  "pkg": "launchdarkly",
  "mod": "index/project",
  "fqn": "lbrlabs_pulumi_launchdarkly",
  "classes": {
   "launchdarkly:index/project:Project": "Project"
  }
 },
 {
  "pkg": "launchdarkly",
  "mod": "index/segment",
  "fqn": "lbrlabs_pulumi_launchdarkly",
  "classes": {
   "launchdarkly:index/segment:Segment": "Segment"
  }
 },
 {
  "pkg": "launchdarkly",
  "mod": "index/teamMember",
  "fqn": "lbrlabs_pulumi_launchdarkly",
  "classes": {
   "launchdarkly:index/teamMember:TeamMember": "TeamMember"
  }
 },
 {
  "pkg": "launchdarkly",
  "mod": "index/webhook",
  "fqn": "lbrlabs_pulumi_launchdarkly",
  "classes": {
   "launchdarkly:index/webhook:Webhook": "Webhook"
  }
 }
]
""",
    resource_packages="""
[
 {
  "pkg": "launchdarkly",
  "token": "pulumi:providers:launchdarkly",
  "fqn": "lbrlabs_pulumi_launchdarkly",
  "class": "Provider"
 }
]
"""
)
