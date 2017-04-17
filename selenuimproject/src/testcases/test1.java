package testcases;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utolity.log;

public class test1 {
	
		WebDriver driver;
		@BeforeMethod
		public void setUp() throws Exception {
//		System.getProperty("webdriver.firefox.bin", "F:\\ Firefox\\firefox.exe");
//		FirefoxProfile profile = new FirefoxProfile();
//		profile.setPreference("dom.ipc.plugins.enabled", false);
//		driver = new FirefoxDriver(profile);
		System.setProperty("webdriver.firefox.bin", "F:\\ Firefox\\firefox.exe");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		}
		@Test
		public void test(){
			log.info("firefox driver is open");
			driver.get("https://www.baidu.com");
			log.info("baidu page is open");
			driver.quit();
		}



}
