package com.tinf15b2.wicket.components.basics;

import org.apache.wicket.markup.html.link.BookmarkablePageLink;
import org.apache.wicket.markup.html.panel.Panel;

import com.tinf15b2.wicket.pages.HelloWorldPage;
import com.tinf15b2.wicket.pages.HomePage;

public class NavigationPanel extends Panel {

	public NavigationPanel(String id) {
		super(id);
		
		add(new BookmarkablePageLink<>("home", HomePage.class));
		add(new BookmarkablePageLink<>("hello-world", HelloWorldPage.class));
	}

}