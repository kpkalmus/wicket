package com.tinf15b2.wicket.application;

import org.apache.wicket.Application;
import org.apache.wicket.Page;
import org.apache.wicket.Session;
import org.apache.wicket.protocol.http.WebApplication;
import org.apache.wicket.protocol.http.WebSession;
import org.apache.wicket.request.Request;
import org.apache.wicket.request.Response;

import com.tinf15b2.wicket.pages.HomePage;

public class WicketApplication extends WebApplication {

	public WicketApplication() { }
	
	@Override
	public Class<? extends Page> getHomePage() {
		return HomePage.class;
	}

}