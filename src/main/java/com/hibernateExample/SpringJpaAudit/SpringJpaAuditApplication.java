package com.hibernateExample.SpringJpaAudit;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition(
		info = @Info(
			title = "Spring JPA Audit",
			version = "1.0.0",
			description = "Create a poc to have audit of db transactions",
			termsOfService = "NoobJavaDeveloper",
			contact = @Contact(
					name = "Bibhuti Bhusan Pani",
					email = "panibibhutibhusan2@gmail.com"
		)	,
				license = @License(
						name = "licence",
						url = "NA"
				)
		)
)
public class SpringJpaAuditApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringJpaAuditApplication.class, args);
	}

}
