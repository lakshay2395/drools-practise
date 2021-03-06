package com.sample.runner;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

import com.sample.models.Product;

public class DroolsTest {
	
	public static void main(String...s)throws Exception {
		DroolsTest t = new DroolsTest();
		t.execute();
	}

	
	public void execute() {
		KieServices ks = KieServices.get();
		KieContainer kContainer = ks.getKieClasspathContainer();
		KieSession kSession = kContainer.newKieSession("ksession-rules");
		
		Product p = new Product();
		p.setType("gold");
		p.setBuyer("platinum");
		p.setEventType("sale");
		kSession.insert(p);
		kSession.fireAllRules();
		
		System.out.println("Product -> "+p);
	}
}
