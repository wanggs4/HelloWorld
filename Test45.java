package day14.p;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class Test45 {
	WebDriver driver;
	
	@CacheLookup
//	将搜索功能封装成一个页面对象test45
	@FindBy(how=How.ID_OR_NAME,using="keyword")WebElement input;
	@FindBy(how=How.NAME,using="imageField")WebElement search;
	
//	在定义完页面元素之后，必须要在构造方法中使用PageFactory中
//	的initElements()方法来初始化化所有定义的页面元素。
	public Test45(WebDriver dr){
		this.driver= dr;
		PageFactory.initElements(driver, this);
	}
// 
	public void open(String url) throws InterruptedException{
		driver.get(url);
		Thread.sleep(3000);	
	}	
//	实现搜索
	public void dro(String un) throws InterruptedException{
		input.sendKeys(un);
		search.click();
		Thread.sleep(3000);
		
	}
			
}
