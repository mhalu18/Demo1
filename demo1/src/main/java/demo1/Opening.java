package demo1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Opening {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./src/main/resources/chromedriver.exe");
	}
	public static void main(String[] args) {
		

	WebDriver driver=new ChromeDriver();
	driver.get("http://www.google.com");
	}
}
