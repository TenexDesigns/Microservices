server.port=8090

spring.datasource.url=jdbc:postgresql://localhost:5433/books
spring.datasource.username=postgres
spring.datasource.password=GacauEliud
spring.datasource.driver-class-name=org.postgresql.Driver
spring.jpa.hibernate.ddl-auto=update


spring.flyway.enabled=true
spring.flyway.locations=classpath:db/migration


spring.application.name=catalogue-service
eureka.client.service-url.default-zone=http://localhost:8761/eureka/
