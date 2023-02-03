package Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ReadConfig {
	
	//first create a constructor
	Properties prop;
	public WebDriver driver;
	public ReadConfig() {
		
		//File src=new File("./Configurations/config.properties");
		
		try {
			FileInputStream fis=new FileInputStream(System.getProperty("user.dir")+"\\Configurations\\config.properties");
			prop=new Properties();
			prop.load(fis);
		}catch(Exception e) {
			System.out.println("Exception is "+e.getMessage());
		}
		
	}
	
	public String getUrl() {
	String url=prop.getProperty("baseUrl");
	return url;
	}
	
	public String getUsername() {
		String username=prop.getProperty("userId");
		return username;
	}
	
	public String getPassword() {
		String userPassword=prop.getProperty("pwd");
		return userPassword;
	}
	
	}
	

