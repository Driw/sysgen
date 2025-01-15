# System Engine Framework - Sysgine

This framework was build to simplify complex implementation of applications, inspired by Spring Boot Framework.

## Getting Started

These instructions will get you a copy of the project up and running on your local machine for development and testing purposes.

### Prerequisites

You need have [Maven](https://maven.apache.org/) to install Scarlet Base and you can found it on [Maven Repository](https://mvnrepository.com/).

### Installing

Specify the maven import as the following example on your [pom.xml](https://maven.apache.org/pom.html) inside of your project.

```xml
<dependency>
	<groupId>br.com.driw.sysgine</groupId>
	<artifactId>sysgine-framework-{MODULE_NAME}</artifactId>
	<version>0.1.0-ALPHA</version>
</dependency>
```

1. Alternatively you could install locally using maven and the repo source code, starting installing the BOM module 
enabling the build of framework modules, following as inside BOM project:

``mvn clean install``

2. After that the BOM module will be generated and installed locally in your maven repository, now you can install the framework modules because they use this BOM module to centralize some dependencies and your versions. Different of BOM module, the framework could be installed isolated, so you can install all modules or specify what modules you want.

**NOTE**: *Both alternatives should be executed on root path of this project.*

#### Install all modules
``mvn clean install``

#### Install only specific modules
``mvn clean install --projects
sysgine-framework-test,
sysgine-framework-common,
sysgine-framework-context,
sysgine-framework-reflection``

3. Look out the modules README to understand more about it one.

## Running the tests

The test can be executed just running the project with JUnit Test 5 or by maven.

```mvn test```

## Versioning

We use [SemVer](http://semver.org/) for versioning. For the versions available, see the [tags on this repository](https://github.com/driw/sysgine-framework/tags).

## Authors

* **Andrew Mello da Silva** - *Software Engineer* - [Driw](https://github.com/Driw)

## License

This project is licensed under the MIT License - see the [LICENSE.md](LICENSE.md) file for details

## Acknowledgments

* **Billie Thompson** - *[Readme template](https://gist.github.com/PurpleBooth/109311bb0361f32d87a2)* - [PurpleBooth](https://github.com/PurpleBooth)
