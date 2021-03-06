package com.practise.drools.listener;

import java.util.ArrayList;
import java.util.List;

import org.drools.core.event.DefaultAgendaEventListener;
import org.kie.api.definition.rule.Rule;
import org.kie.api.event.rule.AfterMatchFiredEvent;

public class TracingEmployeeEventListener extends DefaultAgendaEventListener{
	
	private List<String> activations = new ArrayList<String>();
	
	@Override
	public void afterMatchFired(AfterMatchFiredEvent event) {
	    Rule rule = event.getMatch().getRule();
	    String ruleName = rule.getName();
	    activations.add(ruleName);
	    System.out.println("Rule fired: " + ruleName);
	}

	

}
