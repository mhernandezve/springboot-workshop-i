# Spring Boot Workshop

By FaustoC

## Basics

### Generating a project

Generate a gradle project from [Spring site]( https://start.spring.io )
Suggested values to be filled in the form:
* **Spring Boot 2.0.0**
* Group: **org.test**
* Artifact: **tvseries**
* Starters: **H2**, **JDBC**, **JPA**

After that, run:
```
./gradlew bootRun
```

Convert it as an IntelliJ project. Edit **build.gradle** file and add:
```
apply plugin: 'idea'
```
After that, run:
```
./gradlew idea
```
### Starters
**Spring Boot starters** are a sets of libraries that includes everything for specific funcionalities.

| Popular Starters           | Description                                            |
| ---                        | ---                                                    |
| spring-boot-starter      | Base starter. It's a dependency of the other starters.
| spring-boot-starter-jdbc | For database connections based on JDBC                 |
| spring-boot-starter-test | For testing, stubbing and mocking                      |
| ...                        | ...                                                    |

Example *spring.profile* of `spring-boot-starter-test`:
```
provides: spring-test, spring-boot, junit, mockito,
hamcrest-library, assertj, jsonassert, json-path

```

### A runnable application
```java
@SpringBootApplication
public class TvSeriesApplication {

  public static void main(String[] args) {
      SpringApplication.run(TvSeriesApplication.class, args);
  }
}
```
