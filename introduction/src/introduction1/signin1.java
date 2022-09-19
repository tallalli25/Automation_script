package introduction1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class signin1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ambika.tallalli\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://mobileworld.banyanpro.com/");
		Thread.sleep(1000);
         driver.findElement (By.className("btn-warning")).click();
         driver.findElement (By.id("username")).sendKeys("ambikatallalli@gmail.com");
         driver.findElement (By.name("password")).sendKeys("ambika25");
         Thread.sleep(1000);
         driver.findElement (By.className("btn-primary")).click();

	}

}
