package org.springfield.lou.application.types;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.*;

import org.dom4j.*;
import org.springfield.lou.application.*;
import org.springfield.lou.fs.*;
import org.springfield.lou.homer.*;
import org.springfield.lou.screen.Screen;

public class WebsiteservicetwoApplication extends Html5Application{
	
	
 	public WebsiteservicetwoApplication(String id) {
		super(id); 
	}
	
	public void onNewScreen(Screen s) {
		loadStyleSheet(s,appname);
		s.setRole("mainscreen");
		loadContent(s, "titlepart");
		s.setContent("defaultoutput", "Website component two");
	}
	

}
