package Junit_practical;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class First {
	WebDriver driver;
@Test
	public void launch() {
		System.setProperty("webdriver.chrome.driver", ".\\driver\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get(" http://techfios.com/test/101/");
	    driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	    
	    //Datas are added
	    driver.findElement(By.cssSelector("input[name=\"data\"]")).sendKeys("sunday");
	    driver.findElement(By.cssSelector("input[value=\"Add\"]")).click();
	    driver.findElement(By.cssSelector("input[name=\"data\"]")).sendKeys("Monday");
	    driver.findElement(By.cssSelector("input[value=\"Add\"]")).click();
	    driver.findElement(By.cssSelector("input[name=\"data\"]")).sendKeys("Tuesday");
	    driver.findElement(By.cssSelector("input[value=\"Add\"]")).click();
 
		WebElement toggle_Locator = driver.findElement(By.cssSelector("div.controls>input[type='checkbox']"));
		toggle_Locator.click();
		if (toggle_Locator.isSelected()) {
			System.out.println("All datas are Toggled");
		} else {
			System.out.println("datas are not Toggled");

}
}}
