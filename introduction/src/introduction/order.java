package introduction;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class order {
	
    @Test
	public  void order() throws InterruptedException{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ambika.tallalli\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://mobileworld.banyanpro.com/");
		Thread.sleep(500);
        driver.findElement(By.linkText("Support")).click();
        Thread.sleep(500);
        driver.findElement(By.linkText("Order")).click();
        Thread.sleep(1000);
        Set<String> windows = driver.getWindowHandles(); //[parentid,childid,subchildId]

        Iterator<String>it = windows.iterator();

        String parentId = it.next();

        String childId = it.next();

          driver.switchTo().window(childId);
          driver.findElement(By.id("inputFirstName")).sendKeys("ambika");
          driver.findElement(By.xpath("//body/div[@class='container']/div[@class='card']/div[@class='card-body']/form[@id='myForm']/div[1]/div[2]/input[1]")).sendKeys("tallalli");
          driver.findElement(By.cssSelector("input[type='email']")).sendKeys("ambika123@gmail.com");
          driver.findElement(By.id("inputPassword")).sendKeys("ambika123");
          driver.findElement (By.xpath("//label[@for='flexRadioDefault1']")).click();
          //driver.findElement (By.xpath("//label[@for='flexRadioDefault1']")).click();
          driver.findElement(By.cssSelector("input[placeholder='00000000000']")).sendKeys("9845874576");
          driver.findElement (By.xpath("//input[@id='address2']")).sendKeys("Main road sedam");
          Thread.sleep(1000);
          driver.findElement (By.xpath("//input[@id=' address1']")).sendKeys("Main road sedam");
          driver.findElement (By.xpath("//input[@id='inputCity']")).sendKeys("sedam");       
          driver.findElement (By.xpath("//input[@id='inputZip']")).sendKeys("9857437653");
          Thread.sleep(1000);
          driver.findElement (By.xpath("//select[@id='inputState']")).sendKeys("karnatak a");
          driver.findElement (By.xpath("//input[@rel='apple']")).click();
         driver.findElement (By.xpath("//input[@placeholder='no of mobiles']")).sendKeys("4");
         driver.findElement (By.xpath("//select[@id='bought']")).sendKeys("Yes");
         driver.findElement (By.xpath("//input[@id='time']")).sendKeys("3");
         //driver.findElement (By.xpath("//label[normalize-space()='If your Address is Correct']")).click();
         driver.findElement (By.xpath("//label[normalize-space()='If your Mobile Number is Correct']")).click();
         //Thread.sleep(2000);
         driver.findElement (By.xpath("//button[normalize-space()='Order Now']")).click();
         driver.switchTo().alert().dismiss();
         ;
       
	}

}
