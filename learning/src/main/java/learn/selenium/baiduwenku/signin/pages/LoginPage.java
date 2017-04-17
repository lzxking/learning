package learn.selenium.baiduwenku.signin.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	
   public static WebElement userName(WebDriver driver ){
	   
	   return driver.findElement(By.name("userName"));
   }
   
 public static WebElement password(WebDriver driver ){
	   
	   return driver.findElement(By.name("password"));
   }
 
 public static WebElement submitButton(WebDriver driver){
	 
	 return driver.findElement(By.xpath("\\input[contains(@class,'pass-button-submit')]"));
 }

}
