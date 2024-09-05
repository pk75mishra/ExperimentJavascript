package JavaScriptExperiments;

import java.time.Duration;

//started working

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptsCodePractice {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://tutorialsninja.com/demo/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		// driver.findElement(By.xpath("//span[text()=\"My Account\"]")).click();
		// WebElement myAccountButton = driver.findElement(By.xpath("//span[text()=\"My
		// Account\"]"));
		// driver.findElement(By.linkText("Login")).click();
		WebElement searchBox = driver.findElement(By.name("search"));
		WebElement searchButton = driver.findElement(By.xpath("//div[@id='search']/descendant::button"));

		// Clicking on button by using javascript

		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("arguments[0].value='hp'", searchBox);
		jse.executeScript("arguments[0].click()", searchButton);

		// Generating alert by using javascript

		// jse.executeScript("alert('pawan kumar')");

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// Scrolling page by using javascript

		jse.executeScript("window.scrollBy(0, 400)");

	}

}
