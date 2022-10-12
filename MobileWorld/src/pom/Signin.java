package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Signin {
@Test(dataProvider = "getData")
	public  void signin(String userName,String passWord) throws InterruptedException {
		// TODO Auto-generated method stub
	System.setProperty("webdriver.chrome.driver","C:\\Users\\ambika.tallalli\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://qualicoach.org/mwapp/index.html");
    
 	
 	 LandingPage ob = new LandingPage(driver);
        
        ob.SignIn(userName, passWord);
        //ob.SignIn("ambika", "ambika25");
        driver.quit();
        

	}
@DataProvider
public Object[][] getData(){
 	Object[][] data = new Object[3][2];
 	
 	data[0][0]="ambika";
 	data[0][1]="2683826";
 	
 	data[1][0]="ambika23";
 	data[1][1]="@#$$%%";
 	
 	data[2][0]="";
 	data[2][1]="ambika";
 	return data;
 }

}
