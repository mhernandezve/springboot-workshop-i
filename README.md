# Spring Boot Workshop

---
## Basics

---
### Templates and Starters

Generate a gradle project from [Spring site]( https://start.spring.io )
Suggested values to be filled in the form:
* **Spring Boot 2.0.0**
* Group: **org.test**
* Artifact: **tvseries**

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
---
**Spring Boot starters** are a sets of libraries that includes everything for specific funcionalities.

| Popular Starters           | Description                                            |
| ---                        | ---                                                    |
| `spring-boot-starter`      | Base starter. It's a dependency of the other starters.
| `spring-boot-starter-jdbc` | For database connections based on JDBC                 |
| `spring-boot-starter-test` | For testing, stubbing and mocking                      |
| ...                        | ...                                                    |

---


