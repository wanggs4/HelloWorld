package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import utolity.log;



public class test2 {
	WebDriver dr;
	  @BeforeTest
	  public void setUp() throws Exception {
		System.setProperty("webdriver.firefox.bin", "F:\\ Firefox\\firefox.exe");
	    dr = new FirefoxDriver();
	    
	  }
	    @Test
	    public void testa() throws Exception{
	    dr.get("http://172.166.100.103:85");
	    dr.manage().window().maximize();
	    WebElement el = dr.findElement(By.name("account"));
	    el.sendKeys("admin");
	    log.info("输入用户名");
	    dr.findElement(By.name("password")).sendKeys("");
	    log.info("输入密码");
	    dr.findElement(By.id("submit")).click();
	    log.info("登录成功");
	    Thread.sleep(2000);
	    dr.findElement(By.xpath(".//*[@id='r1']/ul/li[5]/table/tbody/tr/td[2]")).click();
	    log.info("点击行政办公");
	    Thread.sleep(2000);
	    dr.findElement(By.xpath(".//*[@id='m09']/ul/li[1]/div[1]")).click();
	    log.info("点击办公用品");
	    dr.findElement(By.xpath(".//*[@id='m09']/ul/li[1]/div[2]/ul/li[4]/span")).click();
	    log.info("点击办公用品管理");
	    Thread.sleep(2000);
	    dr.findElement(By.xpath("html/body/div[1]/div[1]/div/div[2]/span[1]")).click();
	    log.info("点击新增");
	    dr.findElement(By.xpath(".//*[@id='_2_']/div/input")).sendKeys("0");
	    log.info("办公用品名称");
	    dr.findElement(By.xpath(".//*[@id='_6_']/div/div[2]/div[1]/div[2]/div/div/input")).sendKeys("1");
	    log.info("计量单位");
	    WebElement wl =dr.findElement(By.xpath(".//*[@id='_3_']"));
	    Select te = new Select(wl);
//	    String we = te.getFirstSelectedOption().getText();
//	    assertEquals("",we);
	    te.selectByValue("16");
	    
	    dr.quit();
	    }

}
