package com.tinf15b2.wicket.pages;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.model.IModel;
import org.apache.wicket.model.Model;

import com.tinf15b2.wicket.components.basics.NavigationPanel;

public class HelloWorldPage extends WebPage {

	public HelloWorldPage() {
		IModel<String> message = Model.of("Hello World!");
		add(new NavigationPanel("navigation"));
		add(new Label("message", message));
	}
	
}