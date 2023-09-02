package com.example.spring.project.config;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import io.swagger.v3.oas.annotations.servers.Server;

@OpenAPIDefinition(
		info = @Info(
			contact = @Contact(
					name="Vishva A",
					email="vishvaanbu46@gamil.com",
					url="https://vendormanagement-url.com"
			),
			description = "This is open api documentation for Vendormanagement",
			title = "VendorManagement",
			version = "1.0",
			license = @License(
					name="MIT",
					url="https://vendormanagement-url.com"
					),
			termsOfService = "Terms of Service"
			),
		servers = @Server(
				description = "DEV ENV ",
				url="https://vendormanagement-url.com"
				)
		
			
			
			
		
	)
public class OpenApiConfig {

}
