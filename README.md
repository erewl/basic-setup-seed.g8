This is a [Giter8][g8] template for Scala.

I want to speed up my protoyping process by creating this template which bundles up my basic goto-dependencies for a project.

I have classified my dependencies into following categories:
- WebDependencies: everything around setting up a webserver, defining endpoints, serializing JSON
- BasicDependencies: libraries from the ecosystem of my choice (functional scala)
- LoggingDependencies
- DatabaseDependencies


Get your own project template via:

```
sbt new erewl/basic-setup-seed.g8
```

If you want to export it to bloop:

```
sbt bloopInstall
```

Template license
----------------
Written in 2016-2018 by Lightbend, Inc.

To the extent possible under law, the author(s) have dedicated all copyright and related
and neighboring rights to this template to the public domain worldwide.
This template is distributed without any warranty. See <http://creativecommons.org/publicdomain/zero/1.0/>.

[g8]: http://www.foundweekends.org/giter8/
