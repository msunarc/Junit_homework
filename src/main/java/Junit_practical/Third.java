package Junit_practical;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Third {
	WebDriver driver;

	@Test
	public void launch() {
		System.setProperty("webdriver.chrome.driver", ".\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(" http://techfios.com/test/101/");
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		driver.findElement(By.cssSelector("input[name=\"data\"]")).sendKeys("sunday112");
		driver.findElement(By.cssSelector("input[value=\"Add\"]")).click();
		driver.findElement(By.cssSelector("input[name=\"data\"]")).sendKeys("Monday112");
		driver.findElement(By.cssSelector("input[value=\"Add\"]")).click();
		driver.findElement(By.cssSelector("input[name=\"data\"]")).sendKeys("Tuesday112");
		driver.findElement(By.cssSelector("input[name=\"data\"]")).click();
		driver.findElement(By.cssSelector("input[name=\"data\"]")).sendKeys("sunday32");
		driver.findElement(By.cssSelector("input[value=\"Add\"]")).click();
		driver.findElement(By.cssSelector("input[name=\"data\"]")).sendKeys("Monday32");
		driver.findElement(By.cssSelector("input[value=\"Add\"]")).click();
		driver.findElement(By.cssSelector("input[name=\"data\"]")).sendKeys("Tuesday32");
		driver.findElement(By.cssSelector("input[name=\"data\"]")).click();
		WebElement toggle_Locator = driver.findElement(By.cssSelector("div.controls>input[type='checkbox']"));
		WebElement Remove_locator = driver.findElement(By.cssSelector("input[value=\"Remove\"]"));
		toggle_Locator.click();
		
		if (toggle_Locator.isSelected()) {
			System.out.println("All datas are Toggled");
		} else {
			System.out.println("datas are not Toggled");
		}

		List<WebElement> datas = driver.findElements(By.xpath("//ul/li"));

		int num_datas = datas.size();
		System.out.println("Total datas ="+num_datas);
		// input[name="todo[0]"]
		String before_path = "input[name='todo[";
		String after_path = "]']";
		for (int i = 0; i < num_datas; i++) {
			String name = driver.findElement(By.cssSelector("input[name='todo[" + i + "]']")).getText();
			System.out.println(name);

			if (name.equalsIgnoreCase(name)) {
				Remove_locator.click();
				System.out.println("names are toggled");
			} else {
				System.out.println("names are not available");
			}
			if (name.isEmpty()) {
				System.out.println("remove is validated");
			} else {
				System.out.println("invalid method");
			}

		}
	}

}
