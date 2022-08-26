package com.test.bdd.core;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.Scenario;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Helpers {
	public static Scenario scenario;
	public static WebDriver driver = null;
//	HashMap<String, String> config = null;
	public static Properties config;
	
	static {
		Helpers help = new Helpers();
		help.readConfig();
	}

	public static WebDriver crateWebDriverInstance() {
		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		return driver;
	}

	public void launchApplication() {
		driver.get(config.get("url").toString());
	}

	public void readConfig() {
		
		String path= System.getProperty("user.dir");
		System.out.println(path);
		File file = new File("config.properties");
		FileInputStream fileIn;
		try {
			fileIn = new FileInputStream(file);

			config = new Properties();

			config.load(fileIn);
			System.out.println(config.get("url").toString());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	

}
