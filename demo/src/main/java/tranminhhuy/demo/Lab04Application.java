package tranminhhuy.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

# Database connection properties
		spring.datasource.url=jdbc:mysql://localhost:3306/bookstore
		spring.datasource.username=root
		spring.datasource.password=
		spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver

		# Hibernate properties
		spring.jpa.hibernate.ddl-auto=update
		spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQLDialect

		#Spring Security
		spring.autoconfigure.exclude=org.springframework.boot.autoconfigure.security.ser
		vlet.SecurityAutoConfiguration

@SpringBootApplication
public class Lab04Application {

	public static void main(String[] args) {

		SpringApplication.run(Lab04Application.class, args);
	}

}
