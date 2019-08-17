package io.jenkins.plugins.systemreadpermission;

import hudson.Extension;
import hudson.security.Permission;
import hudson.security.PermissionScope;

import static jenkins.model.Jenkins.ADMINISTER;
import static jenkins.model.Jenkins.PERMISSIONS;

@Extension
public class SystemReadPermission {

    public static final Permission SYSTEM_READ = new Permission(PERMISSIONS, "SystemRead", Messages._SystemReadPermission_Description(), ADMINISTER, PermissionScope.JENKINS);
}
