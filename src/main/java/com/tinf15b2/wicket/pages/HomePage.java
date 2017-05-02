package com.tinf15b2.wicket.pages;

import org.apache.wicket.markup.html.WebPage;

import com.tinf15b2.wicket.components.basics.NavigationPanel;

public class HomePage extends WebPage {

	public HomePage() {
		add(new NavigationPanel("navigation"));
	}
	
}