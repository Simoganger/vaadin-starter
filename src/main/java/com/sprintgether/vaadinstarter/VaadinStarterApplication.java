package com.sprintgether.vaadinstarter;

import com.vaadin.flow.component.page.AppShellConfigurator;
import com.vaadin.flow.server.PWA;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * The entry point of the Spring Boot application.
 *
 * Use the @PWA annotation make the application installable on phones, tablets
 * and some desktop browsers.
 *
 */
@SpringBootApplication
@PWA(name = "Project Base for Vaadin with Spring", shortName = "Vaadin Project")
public class VaadinStarterApplication implements AppShellConfigurator {

	public static void main(String[] args) {
		SpringApplication.run(VaadinStarterApplication.class, args);
	}

}
