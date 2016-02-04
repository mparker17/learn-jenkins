#!/usr/bin/env groovy

import hudson.model.*;
import jenkins.model.*;

// Disable all active plugins.
//
// See https://aespinosa.github.io/blog/2014-10-17-jenkins-plugin-management-in-groovy.html
// for more information.
plugins = Jenkins.instance.pluginManager.plugins
plugins.each {
  it.disable()
}
