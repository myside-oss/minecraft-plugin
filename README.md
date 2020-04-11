# Minecraft Plugin

> Template Plugin for MySide. 

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

### Publishing a new release
To publish a new release of the plugin or api then run following commands
```
$ git tag <semantic version, E.g. 1.0.0>

$ git push origin --tags
```
When publishing a new tag the workflows will automatic create javadoc, artifacts and create a release note with the new version.

## Contributing

Contributions are what make the open source community such an amazing place to be learn, inspire, and create. Any contributions you make are **greatly appreciated**.

1. Fork the Project
2. Create your Feature Branch (`git checkout -b feature/AmazingFeature`)
3. Commit your Changes (`git commit -m 'Add some AmazingFeature'`)
4. Push to the Branch (`git push origin feature/AmazingFeature`)
5. Open a Pull Request

# Versioning
We use [Semantic Versioning](http://semver.org/) for versioning. For the versions available, see the [tags on this repository](https://github.com/myside-oss/minecraft-plugin/tags). 

## License
Distributed under the MIT License. See `LICENSE` for more information.

[Gradle]: https://www.gradle.org/
[Homepage]: https://github.com/myside-oss/minecraft-plugin/
[IntelliJ]: https://www.jetbrains.com/idea/
[Source]: https://github.com/myside-oss/minecraft-plugin/
[Issues]: https://github.com/myside-oss/minecraft-plugin/issues/
[MIT License]: https://www.tldrlegal.com/license/mit-license
[Javadocs]: https://myside-oss.github.io/minecraft-plugin/
