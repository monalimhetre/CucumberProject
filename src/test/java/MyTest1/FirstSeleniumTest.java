package MyTest1;
import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class FirstSeleniumTest {
	
	public static void main(String [] args) {

	System.setProperty("webdriver.chrome.driver","C:\\Users\\monal\\OneDrive\\Documents\\MyProject\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	//driver.navigate().to("https://www.google.com/"); 
	//WebElement element = driver.findElement(By.xpath("//div//textarea[@title='Search']"));
//	element.clear();
//	element.sendKeys("Java Automation");
//	element.submit();
	

	driver.navigate().to("https://the-internet.herokuapp.com/upload");
    File uploadFile = new File("src/test/resources/FilesStored/MonaliM.pdf");

    WebElement element3 = driver.findElement(By.cssSelector("input[type=file]"));
    element3.sendKeys(uploadFile.getAbsolutePath());
    driver.findElement(By.id("file-submit")).click();

   
	//element.sendKeys(Keys.ENTER);
    //WebElement element1 = driver.findElement(By.xpath("//input[contains(text(), 'Google Search')]"));
	//element1.click();
    //WebElement element2 = driver.findElement(By.name("btnK"));

	
//	driver.navigate().to("https://todomvc4tasj.herokuapp.com/");
//	WebElement element = driver.findElement(By.xpath("//input[@id='new-todo']"));
//	element.clear();
//	element.sendKeys("todo1"+Keys.ENTER);
//	//element.submit();
	System.out.println("Test passed");
	
//	driver.close();
//	driver.quit();
	
	
	}
	
}
