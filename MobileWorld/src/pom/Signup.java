package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Signup {
@Test(dataProvider = "getData")
	public  void SignUp(String firstName,String lastName,String Email,String password,String DOB,String Mobnum,String Shortbio) throws InterruptedException {
		// TODO Auto-generated method stub
	System.setProperty("webdriver.chrome.driver","C:\\Users\\ambika.tallalli\\Downloads\\chromedriver_win32\\chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    LandingPage sign_up= new LandingPage(driver);
    driver.get("https://qualicoach.org/mwapp/index.html");
  sign_up.goTosignup();
//    sign_up.goToSignUp("ambikaa", "tallalli", "ambikatallalli@gmail.com", "ambika34", "11/0-9/2000", "8997999896", "im an student");
  sign_up.goToSignUp(firstName, lastName, Email, password, DOB, Mobnum, Shortbio);
    Thread.sleep(500);
	  driver.switchTo().alert().accept();
	  driver.quit();;

}
@DataProvider
public Object[][] getData(){
 	Object[][] data = new Object[2][7];
 	
 	data[0][0]="ambika";
 	data[0][1]="tallalli";
 	data[0][2]="ambikatallalli@gmail.com";
 	data[0][3]="2683826";
 	data[0][4]="17/11/1999";
 	data[0][5]="9916854675";
 	data[0][6]="im a student";
 	
 	data[1][0]="5783";
 	data[1][1]="tallali@24";
 	data[1][2]="ambika@@gmail";
 	data[1][3]="asnkjwns";
 	data[1][4]="";
 	data[1][5]="854675";
 	data[1][6]="dc682nf78";
 	return data;
 }

}
