package learn.selenium.baiduwenku.signin.actions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import learn.selenium.baiduwenku.signin.pages.LoginPage;

public class LoginActions {
	
	public static void login(String user,String password,WebDriver driver){
		
		LoginPage.userName(driver).sendKeys(user);
		LoginPage.password(driver).sendKeys(password);
		LoginPage.password(driver).click();
		
	}
	
	
   public static void main(String[] args){
//	   System.setProperty("", "webdrivers/chromedriver.exe");
	   WebDriver driver = new ChromeDriver();
	   driver.get("http://wenku.baidu.com/");
	   
	   
	   
	   
   }

}
