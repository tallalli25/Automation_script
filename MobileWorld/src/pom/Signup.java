package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Signup {
@Test
	public  void SignUp() throws InterruptedException {
		// TODO Auto-generated method stub
	System.setProperty("webdriver.chrome.driver","C:\\Users\\ambika.tallalli\\Downloads\\chromedriver_win32\\chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    LandingPage sign_up= new LandingPage(driver);
    driver.get("https://mobileworld.banyanpro.com/");
  sign_up.goTologin1();
    sign_up.goToSignUp("Aww", "rt", "asd@gmail.com", "abc123", "11/0-9/2000", "899799989", "fgkjhkjb");
    Thread.sleep(2000);
	  driver.switchTo().alert().accept();
	  driver.quit();
//sup.SignUp("a", "r"," @gmail.com ","abc1234", "11/09/2000", "00999809000", "srt");

}

}





	


