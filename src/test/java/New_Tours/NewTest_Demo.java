package New_Tours;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class NewTest_Demo {
	WebDriver driver;
  @Test
  public void f() throws InterruptedException {
	  driver.findElement(By.name("userName")).sendKeys("Gitano");
	  driver.findElement(By.name("password")).sendKeys("123456");
	  driver.findElement(By.name("login")).click();
	  String actual=driver.findElement(By.xpath("//a[@href='mercurysignoff.php']")).getText();
	  String excepted="SIGN-OFF";
	  System.out.println("Actual is:"+actual);
	  Assert.assertTrue(actual.contains(excepted));
	  Thread.sleep(3000);
	  driver.findElement(By.className("mouseOut")).click();
	  
	  
	  
	  
  }
  @BeforeMethod
  public void beforeMethod() {
	  WebDriverManager.chromedriver().setup();
	  driver=new ChromeDriver();
	  driver.get("http://newtours.demoaut.com");
	  
	  driver.manage().window().maximize();
  }

  @AfterMethod
  public void afterMethod() {
	  driver.close();
  }
}
