package Junit_practical;

import java.util.List;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Second {
	WebDriver driver;

	@Test
	public void launch() {
		System.setProperty("webdriver.chrome.driver", ".\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(" http://techfios.com/test/101/");
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

		// Datas are added

		driver.findElement(By.cssSelector("input[name=\"data\"]")).sendKeys("sundayx");
		driver.findElement(By.cssSelector("input[value=\"Add\"]")).click();
		driver.findElement(By.cssSelector("input[name=\"data\"]")).sendKeys("Mondayx");
		driver.findElement(By.cssSelector("input[value=\"Add\"]")).click();
		driver.findElement(By.cssSelector("input[name=\"data\"]")).sendKeys("Tuesdayx");
		driver.findElement(By.cssSelector("input[value=\"Add\"]")).click();
		
		
		
		Scanner num = new Scanner(System.in);
		int index = num.nextInt();

		List<WebElement> datas = driver.findElements(By.xpath("//ul/li"));

		// "input[name="todo[9]"];
		// String before_path="input[name="todo[9";
		// String after_path= "]"]"
		
		int num_datas = datas.size();
		System.out.println("max.input=" +num_datas);
		
		if (index <= datas.size()) {
			String name = driver.findElement(By.cssSelector("input[name=\"todo[" + index + "]\"]")).getText();
			System.out.println(name);
			driver.findElement(By.cssSelector("input[name=\"todo[" + index + "]\"]")).click();
			System.out.println("data is checked");
		} else {
			System.out.println("invalid entry");
		}
		WebElement RemoveLocator =driver.findElement(By.cssSelector("input[value=\"Remove\"]"));
		RemoveLocator.click();
		
	}
}
