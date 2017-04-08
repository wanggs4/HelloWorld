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
//	���������ܷ�װ��һ��ҳ�����test45
	@FindBy(how=How.ID_OR_NAME,using="keyword")WebElement input;
	@FindBy(how=How.NAME,using="imageField")WebElement search;
	
//	�ڶ�����ҳ��Ԫ��֮�󣬱���Ҫ�ڹ��췽����ʹ��PageFactory��
//	��initElements()��������ʼ�������ж����ҳ��Ԫ�ء�
	public Test45(WebDriver dr){
		this.driver= dr;
		PageFactory.initElements(driver, this);
	}
// 
	public void open(String url) throws InterruptedException{
		driver.get(url);
		Thread.sleep(3000);	
	}	
//	ʵ������
	public void dro(String un) throws InterruptedException{
		input.sendKeys(un);
		search.click();
		Thread.sleep(3000);
		
	}
			
}
