# Spring Boot Workshop

By FaustoC

## Basics

### Generating a project

Generate a gradle project from https://start.spring.io

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

| Popular Starters                        | Description                                                      |
| ---                                     | ---                                                              |
| <sub>spring-boot-starter</sub>          | <sub>Base starter. It's a dependency of the other starters</sub> |
| <sub>spring-boot-starter-jdbc</sub>     | <sub>For database connections based on JDBC</sub>                |
| <sub>spring-boot-starter-test</sub>     | <sub>For testing, stubbing and mocking</sub>                     |
| <sub>spring-boot-starter-security</sub> | <sub>Depedencies for spring-security</sub>                       |
| <sub>spring-boot-starter-social-x</sub> | <sub>x -> {Facebook, Twitter, LinkedIn}</sub>                    |
| ...                                     | ...                                                              |

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

### REST Services -> Entities
```java
@Entity
public class Actor {
  @Id
  @GeneratedValue
  private Integer id;
  private String name;

  ...
}
```
```java
@Entity
public class TvSerie {
  @Id
  @GeneratedValue
  private Integer id;
  private String name;
  @ManyToMany
  private List<Actor> actors;

  ...
}
```
### REST Services -> Repository and Runner
```java
@Repository
public interface TvSeriesRepository extends
                 CrudRepository<TvSerie, Long> {}

```
```java
public class StartupRunner implements CommandLineRunner {
  private final Log logger = LogFactory.getLog(getClass());
  @Autowired
  private TvSeriesRepository repository;

  public void run(String... args) {
    logger.info("Number of tvSeries" + repository.count());
  }
}
```
```java
public class TvSeriesApplication {
  ...

  @Bean
  public StartupRunner scheduleRunner() {
    return new StartupRunner();
  }
}

```

### REST Services -> Controller
**build.gradle**
```groovy
...
dependencies {
  compile('org.springframework.boot:spring-boot-starter-web')
}
...
```
```java
@RestController
@RequestMapping("tvseries")
public class TvSeriesController {

  @Autowired
  private TvSeriesRepository repository;

  @RequestMapping(value = "", method = RequestMethod.GET)
  public Iterable<TvSerie> getAllTvSeries() {
    return repository.findAll();
  }
}
```
### Spring Data REST

**build.gradle**
```groovy
...
dependencies {
  compile('org.springframework.boot:spring-boot-starter-data-rest')
}
...
```
```java
@RepositoryRestResource
public interface ActorRepository extends
                 PagingAndSortingRepository<Actor, Long> {}
```
# Feedback?
Where are the tests?
```
git clone https://github.com/faustocv/springboot-workshop-i.git
```
