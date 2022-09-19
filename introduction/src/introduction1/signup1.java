package introduction1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class signup1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ambika.tallalli\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://mobileworld.banyanpro.com/");
	    driver.findElement(By.className("btn-warning")).click();
	    Thread.sleep(500);
	    driver.findElement(By.cssSelector("a[href='signup.html']")).click();
	    driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("ambika");
        driver.findElement(By.xpath("//input[@ placeholder='Last Name']")).sendKeys("tallalli");
	    driver.findElement(By.xpath("//input[@placeholder='Enter Email']")).sendKeys("ambikatallalli@gmail.com");
	    driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("ambika25");
	    driver.findElement(By.xpath("//input[@type='date']")).sendKeys("02/08/2000");
	    driver.findElement(By.xpath("//div[@class='col-md-2']//input[@name='gender']")).click();
	    Thread.sleep(500);
 	    driver.findElement(By.xpath("//input[@placeholder='91XXXXXXXXXX']")).sendKeys("9916913583");
 	    driver.findElement(By.xpath("//textarea[@placeholder='Short Bio']")).sendKeys("Student");
     	Thread.sleep(2000);
	    driver.findElement(By.cssSelector("button[type='submit']")).click();
	    Thread.sleep(2000);
		    driver.switchTo().alert().accept();


	}

}
