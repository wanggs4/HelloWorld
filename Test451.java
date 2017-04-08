package day14.p;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

import day12.pageObjects.LoginPage;

public  class Test451 {
	WebDriver driver;
	Test45 pp;
	String url="http://localhost/upload/index.php";
	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.firefox.bin", "F:\\ Firefox\\firefox.exe");
		FirefoxProfile profile = new FirefoxProfile();
		profile.setPreference(
		  		"dom.ipc.plugins.enabled", 
		  		false);
		driver = new FirefoxDriver(profile);
		driver.manage().window().maximize();
		
	}
	
	@Test
	public void test() throws Exception{
		pp= new Test45(driver);
		pp.open(url);
		pp.dro("a");
		
	}

	@After
	public void tearDown() throws Exception {
		driver.quit();
	}

	

}
