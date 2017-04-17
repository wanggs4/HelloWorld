package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import utolity.utills;



public class test4 {
	
		@BeforeTest
		public void BeforTest(){
			String browser = System.getProperty("pom.browser");
			String url = System.getProperty("pom.url");
			utills.openBrowser(url, browser);
			
		
	}
	@Test
	public  void CreateRecord() throws Exception {
		utills.openBrowser("http://172.166.100.103:85/","firefox");
		utills.inputValue("admin", "username_editbox_locator");
		utills.inputValue("", "password_editbox_locator");
		utills.elementClick("login_button_locator");
		
		try{	
			//需要进行异常捕捉的语句
			Thread.sleep(3000);
		}catch(Exception w){
			//对异常进行处理的语句
			w.printStackTrace();
		}finally{
			//不管是否异常都会被执行的语句
		
		}
	
	
		int age = 61;
		if(age>=61){System.out.println("还行");		
		}else if(age>=70){System.out.println("凑合");
		}else if(age>=90){System.out.println("不错");
		}else{System.out.println("非常不错");
		}	

	for(int i=1;i>=8;i++){
	}
	}
	}
