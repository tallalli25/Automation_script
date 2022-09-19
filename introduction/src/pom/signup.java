package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class signup {
@Test
	public  void SignUp(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	System.setProperty("webdriver.chrome.driver","C:\\Users\\ambika.tallalli\\Downloads\\chromedriver_win32\\chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    driver.get("https://mobileworld.banyanpro.com/");
    LandingPage sup = new LandingPage(driver);
//    sup.SignUp("ambika","tallalli","ambikatallalli@gmail.com","ambika24","11/9/2000","9916913583","This is mobile world");

sup.SignUp("a", "r"," abc@gmail.com ","abc1234", "11/09/2000", "00999809000", "srt");

}

}





	


