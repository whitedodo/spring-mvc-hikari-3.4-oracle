# spring-mvc-hikariCP-3.4-oracle
Spring MVC - HikariCP-3.4(Connection Pool)과 Oracle 19 연동하기(Java. Properties방식)

### 기본 정보(Information)
##### 제작일자(Create date): 2020-09-22 ~ 2020-09-23
##### 작성언어(Write language): Java
##### IDE: Eclipse IDE with Spring Tool Suite 4-4.7.2, SQL Developer
##### Spring  (Eclipse Help -> Marketplace에서 설치함.) // JBoss-Hibernate (Installed from Eclipse Help -> Marketplace.)
##### 데이터베이스: MySQL 8.0.21 Server, MySQL Workbench 8.0 CE
##### 제작자(Author): 도도(Dodo) / rabbit.white at daum dot net
##### 프레임워크(Framework): 
##### 라이브러리(Library): 
##### 1. Apache-Maven 3.6.3/1.16.0.2.20200610-1735 (https://maven.apache.org/)
##### (소프트웨어 프로젝트 관리 및 이해 도구)
##### 2. javax.servlet-api (4.0.1) - https://mvnrepository.com/artifact/javax.servlet/javax.servlet-api
##### 3. mysql-connector-java (8.0.21) - https://mvnrepository.com/artifact/mysql/mysql-connector-java
##### 4. HikariCP 3.4 - https://search.maven.org/search?q=a:HikariCP, https://github.com/brettwooldridge/HikariCP

### 1. 소개(Description)
##### 1. 해당 프로젝트는 Hikari-3.4 (Oracle) 라이브러리를 사용하여 커넥션풀을 구현하는 프로젝트이다.
##### (This project is a project that implements connection pool using Hikari-3.4 (Oracle) library.)
##### 2. 현재는 XML 방식은 사용되지 않으며, Java, Properties 방식 두 가지로 커넥션풀을 구현할 수 있다.
##### (Currently, XML method is not used, and connection pool can be implemented in both Java and Properties methods.)

### 2. 시연(Demonstration)
##### 1. [1부] Spring-MVC, HikariCP 3.4, Oracle 19g 연동하기(Java, Properties 방식), https://youtu.be/VqTfvzu5uDM, Accessed by 2020-09-23, Last Modified 2020-09-23.


### 3. 참고자료(Reference)
##### 1. Maven Repository: Search/Browse/Explore, https://mvnrepository.com/, Accessed by 2020-09-20, Last Modified .
##### 2. Maven - Welcome to Apache Maven, https://maven.apache.org/, Accessed by 2020-09-20, Last Modified .
##### 3. Spring | Tools, https://spring.io/tools, Accessed by 2020-09-20, Last Modified .
##### 4. OpenJDK, https://openjdk.java.net/, Accessed by 2020-09-20, Last Modified .
##### 5. Database 19C | Oracle 대한민국, https://www.oracle.com/kr/database/technologies/, Accessed by 2020-09-20, Last Modified .
##### 6. [Spring] 커넥션 풀(Connection pool)이란?, https://linked2ev.github.io/spring/2019/08/14/Spring-3-%EC%BB%A4%EB%84%A5%EC%85%98-%ED%92%80%EC%9D%B4%EB%9E%80/ , Accessed by 2020-09-23, Last Modified 2019-08-14.
##### 7. Spring-Hikari-Oracle연동 시 나는 oracle.jdbc.driver.OracleDriver not found 에러, https://apiclass.tistory.com/entry/Spring-Hikari-Oracle%EC%97%B0%EB%8F%99-%EC%8B%9C-%EB%82%98%EB%8A%94-oraclejdbcdriverOracleDriver-not-found-%EC%97%90%EB%9F%AC, Accessed by 2020-09-23, Last Modified 2019-10-16.
##### 8. Introduction to HikariCP, https://www.baeldung.com/hikaricp, Accessed by 2020-09-23, Last Modified 2020-06-02.
##### 9. Maven Repository: mysql » mysql-connector-java » 8.0.21, https://mvnrepository.com/artifact/mysql/mysql-connector-java/8.0.21, Accessed by 2020-09-23, Last Modified .
##### 10. GitHub - brettwooldridge/HikariCP: 光 HikariCP・A solid, high-performance, JDBC connection pool at last., https://github.com/brettwooldridge/HikariCP, Accessed by 2020-09-23, Last Modified .
##### 11. [Spring][04]커넥션 풀 설정(HikariCP), https://kimvampa.tistory.com/57, Accessed by 2020-09-23, Last Modified 2020-04-10.
##### 12. [Spring] Spring Test 오류 해결 모음(SpringJUnit4ClassRunner , Resource specification), https://life-with-coding.tistory.com/373, Accessed by 2020-09-23, Last Modified 2020-07-08.
##### 13. [오류, 에러] Spring Junit Test 환경설정 / Class<SpringJUnit4ClassRunner> cannot be resolved to a type, https://developerntraveler.tistory.com/1, Accessed by 2020-09-23, Last Modified 2020-05-14.
##### 14. SpringBoot error: Registered driver with driverClassName=oracle.jdbc.driver.OracleDriver was not found, trying direct instantiation, https://stackoverflow.com/questions/52014595/springboot-error-registered-driver-with-driverclassname-oracle-jdbc-driver-orac, Accessed by 2020-09-23, Last Modified 2018.
##### 15. Spring에서 Properties 사용, https://yookeun.github.io/java/2015/12/22/spring-properties/, Accessed by 2020-09-23, Last Modified 2015-12-22.
##### 16. Java에서 Properties 파일 읽기, https://prettymucho.tistory.com/7, Accessed by 2020-09-23, Last Modified 2017-06-12.
