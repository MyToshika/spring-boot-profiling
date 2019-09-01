## Use JPA + Hibernate + MySQL in Spring Boot


### Usage

Every enterprise application has many environments, like:
Dev | Test | Stage | Prod | UAT / Pre-Prod
Each environment requires a setting that is specific to them. For example, in DEV, we do not need to constantly check database consistency. Whereas in TEST and STAGE, we need to. These environments host specific configurations called Profiles.


### Build and run

#### Configurations

we need to create three   more application.properties:
1.	 application-dev.properties 
2.	 application-test.properties 
3.	 application-prod.properties 

application.properties
spring.profiles.active=${MYENV}
spring.application.name=Profiles
server.port=8087

application-dev.properties
app.message= This is the property file for the ${spring.application.name} specific to DEV Environment
spring.datasource.driver-class-name=org.h2.Driver
spring.datasource.url=jdbc:h2:mem:db;DB_CLOSE_DELAY=-1
spring.datasource.username=root
spring.datasource.password=root

application-prod.properties
app.message = This is the property file for the ${spring.application.name} specific to PRODUCTION Environment!! Be ALERT!! 

spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
spring.datasource.url=jdbc:mysql://localhost:3306/profiles
spring.datasource.username=root
spring.datasource.password=root


#### Prerequisites

- Java 1.8
- Maven 3.6.0

#### From terminal

Go on the project's root folder, then type:

    $ mvn spring-boot:run

#### From Eclipse (Spring Tool Suite)

Import as *Existing Maven Project* and run it as *Spring Boot App*.
