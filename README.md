# system-read-permission-plugin

This is a temporary plugin which allows using the `SYSTEM_READ` permission without bumping a plugin minimum Jenkins version
to a high baseline. Users won't be able to use the feature unless they're on newer jenkins versions though.

Usage:
```java
Jenkins.get().checkPermission(SystemReadPermission.SYSTEM_READ);
```
