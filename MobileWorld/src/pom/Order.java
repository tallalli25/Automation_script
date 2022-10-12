package pom;
 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Order {
@Test(dataProvider = "getData")
	public  void order(String Fname,String Lname,String email,String password1,String Num,String Add1,String Add2,String City ,String Zip,String Count,String numoftimes) throws InterruptedException {
//	System.setProperty("webdriver.chrome.driver","C:\\Users\\ambika.tallalli\\Downloads\\chromedriver_win32\\chromedriver.exe");
//	WebDriver driver = new ChromeDriver();
   System.setProperty("webdriver.edge.driver","C:\\Users\\ambika.tallalli\\Downloads\\edgedriver_win64\\msedgedriver.exe");
   WebDriver driver = new EdgeDriver();
        driver.get("https://qualicoach.org/mwapp/index.html");
  LandingPage ordr = new LandingPage(driver);
        
        ordr.Order(Fname,Lname,email, password1, Num,Add1, Add2,City,  Zip, Count,numoftimes);

driver.quit();

	}
@DataProvider
public Object[][] getData(){
 	Object[][] data = new Object[2][11];
 	
 	data[0][0]="ambika";
 	data[0][1]="tallalli";
 	data[0][2]="ambikatallalli@gmail.com";
 	data[0][3]="2683826";
 	data[0][4]="9916854675";
 	data[0][5]="main road sedam";
 	data[0][6]="main road sedam";
 	data[0][7]="gulbarga";
 	data[0][8]="8332734843";
 	data[0][9]="2";
 	data[0][10]="1";
 	
 	data[1][0]="";
 	data[1][1]="tallalli25";
 	data[1][2]="46126@gmail.com";
 	data[1][3]="ambika";
 	data[1][4]="95";
 	data[1][5]="main road sedam";
 	data[1][6]="main road sedam";
 	data[1][7]="ab";
 	data[1][8]="5668";
 	data[1][9]="";
 	data[1][10]="-1";
 	return data;
 }


	}


