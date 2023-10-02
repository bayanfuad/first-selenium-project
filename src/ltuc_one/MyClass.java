package ltuc_one;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MyClass {
	
	WebDriver driver = new ChromeDriver();
	
@BeforeTest
public void MyBeforTest() {
	String userName = "standard_user";
	String password = "secret_sauce";
	String Url = "https://www.saucedemo.com/v1/";
	driver.get(Url);
	driver.findElement(By.id("user-name")).sendKeys(userName);
	driver.findElement(By.name("password")).sendKeys(password);
	driver.findElement(By.id("login-button")).click();
	
	List<WebElement> myElements = driver.findElements(By.className("btn_primary"));
	
	for (int i=0;i<myElements.size();i++) {
		myElements.get(i).click();
	}
	driver.findElement(By.xpath("//*[@id=\"inventory_container\"]/div/div[6]/div[3]/button")).click();
}
@Test()
public void MyTest() {
	
}

@AfterTest
public void MyAfterTest() {
	driver.manage().window().maximize();
}

}
