package com.example.tests;

import com.thoughtworks.selenium.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.regex.Pattern;

public class SearchForJava {
	private Selenium selenium;

	@Before
	public void setUp() throws Exception {
		selenium = new DefaultSelenium("localhost", 4444, "*chrome", "http://www.vpl.ca/");
		selenium.start();
	}

	@Test
	public void testSearchForJava() throws Exception {
		selenium.open("/");
		selenium.click("id=globalQuery");
		selenium.type("id=globalQuery", "java");
		selenium.click("css=input.search_button");
		selenium.waitForPageToLoad("30000");
	}

	@After
	public void tearDown() throws Exception {
		selenium.stop();
	}
}
