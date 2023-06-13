package selinium.Learning;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GuviProjectPractise {
	
	
	
	@Test
	public void brokenLink() throws IOException, Exception {
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.bestbuy.com/");
		String url = "https://www.bestbuy.com/";
		
		HttpURLConnection connection = (HttpURLConnection) new URL(url).openConnection();
		connection.setRequestMethod("HEAD");
		connection.connect();
		int respCode = connection.getResponseCode();
		
		System.out.println("Response Code: "+ respCode);
		
	}
	
	@Test
	public void signIn() {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		
		
		
	}

}
