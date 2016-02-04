#!/usr/bin/env groovy

import hudson.model.*;
import jenkins.model.*;

// Install the plugins we want to use.
//
// See https://aespinosa.github.io/blog/2014-10-17-jenkins-plugin-management-in-groovy.html
// for more information.

Jenkins.instance.pluginManager.getPlugin("git").enable()
Jenkins.instance.pluginManager.getPlugin("git-changelog").enable()
Jenkins.instance.pluginManager.getPlugin("git-parameter").enable()
Jenkins.instance.pluginManager.getPlugin("modernstatus").enable()
