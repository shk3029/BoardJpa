# Springboot, jpa를 이용한 게시판
### 실행환경
- SpringBoot, JPA, H2, PSQL, Docker
- application.properties
<pre><code>
spring.datasource.url=jdbc:postgresql://localhost:5432/springdata
spring.datasource.username=jongseon
spring.datasource.password=pass

spring.jpa.hibernate.ddl-auto=update
spring.jpa.properties.hibernate.jdbc.lab.non_contextal_creation = true
spring.jpa.properties.hibernate.temp.use_jdbc_metadata_defaults = false

spring.jpa.show-sql=true
spring.jpa.properties.hibernate.format_sql=true

logging.level..org.hibernate.type.descriptor.sql = trace
</code></pre>

### 기능
- 단순 SELECT, INSERT, DELETE 기능
- Page, Sort
