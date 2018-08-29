package com.practise.drools;

import org.kie.api.KieServices;
import org.kie.api.builder.KieBuilder;
import org.kie.api.builder.KieFileSystem;
import org.kie.api.builder.KieModule;
import org.kie.api.runtime.KieContainer;
import org.kie.internal.io.ResourceFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class PersonEmployeeSpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(PersonEmployeeSpringBootApplication.class, args);
	}
	
	@Bean
	public KieContainer getKieContainer() {
		KieServices kieServices = KieServices.Factory.get();
        KieFileSystem kieFileSystem = kieServices.newKieFileSystem();
        kieFileSystem.write(ResourceFactory.newClassPathResource("rules/greet-person.drl"));
        kieFileSystem.write(ResourceFactory.newClassPathResource("rules/employee-department.drl"));
        KieBuilder kieBuilder = kieServices.newKieBuilder(kieFileSystem);
        kieBuilder.buildAll();
        KieModule kieModule = kieBuilder.getKieModule();
        KieContainer container = kieServices.newKieContainer(kieModule.getReleaseId());
        return container;
	}
}
