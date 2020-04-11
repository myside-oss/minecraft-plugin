# Minecraft Plugin

> Template Plugin for MySide. 
> It is licensed under the [MIT License]. 

* [Homepage]
* [Source]
* [Issues]
* [Javadocs]

## Installation

Add to `pom.xml`
```
<dependency>
  <groupId>org.myside</groupId>
  <artifactId><project name>-api</artifactId>
  <version><latest version></version>
</dependency>
```

Run via command line
```
$ mvn install
```

## Development

### Getting started
To get started, clone the repository then run `gradle init`
```
$ git clone https://github.com/myside-oss/minecraft-plugin.git

$ cd minecraft-plugin

$ gradle init
```
When initializing gradle, there will automatically be created a 
directory called `server` with the latest version of paperspigot in. 

[Gradle]: https://www.gradle.org/
[Homepage]: https://github.com/myside-oos/minecraft-plugin/
[IntelliJ]: https://www.jetbrains.com/idea/
[Source]: https://github.com/myside-oos/minecraft-plugin/
[Issues]: https://github.com/myside-oos/minecraft-plugin/issues/
[MIT License]: https://www.tldrlegal.com/license/mit-license
[Javadocs]: https://myside-oos.github.io/minecraft-plugin/
