package testcases;


import static org.junit.Assert.assertEquals;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import utolity.log;

public class test3 {
	
	WebDriver dr;
	
	 @BeforeTest
	  public void setUp() throws Exception {
		System.setProperty("webdriver.firefox.bin", "F:\\ Firefox\\firefox.exe");
	    dr = new FirefoxDriver();
	    dr.manage().window().maximize();
	    dr.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	    
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
		    dr.findElement(By.xpath(".//*[@id='m09']/ul/li[1]/div[2]/ul/li[3]/span")).click();
		    log.info("点击办公用品登录");
		    Thread.sleep(3000);
		    dr.switchTo().frame("context");
		    log.info("切换到frame里");
		    dr.findElement(By.xpath("html/body/div[1]/div[1]/div/div[2]/span[1]")).click();
		    log.info("点击新增登记");
		    Thread.sleep(3000);
		    
		    WebElement ret = dr.findElement(By.xpath(".//*[@id='_8_']"));
		    log.info("定位办公用品元素");
			Select tag = new Select(ret);
			String selected = tag.getFirstSelectedOption().getText();
			assertEquals("--请选择办公用品--",selected);
			tag.selectByValue("212");
			List<WebElement> li = tag.getOptions();
			for(WebElement e:li){
				if(e.getText().contains("A4纸")){
					e.click();
					break;	
				}
			}
			log.info("选择办公用品");
			dr.findElement(By.xpath(".//*[@id='_10_']/div/div[3]/div[1]/div[2]/div/div/input")).sendKeys("3");
			log.info("输入数量");
			dr.findElement(By.xpath(".//*[@id='price']/div[1]/div[2]/div/div/input")).sendKeys("40");
			log.info("输入单价");
			dr.findElement(By.xpath(".//*[@id='_10_']/div/div[6]/div[1]/div[2]/div/div/textarea")).sendKeys("我爱我家");
			log.info("输入登记备注");
			dr.findElement(By.xpath("html/body/div[1]/div[1]/div/div[2]/span[1]")).click();
			log.info("点击按钮保存");
			dr.findElement(By.xpath("html/body/div[1]/div[1]/div/div[2]/span[1]")).click();
			log.info("点击退出按钮");
			Thread.sleep(3000);
			dr.quit();
			
	    }
	    
	    
	 

}
