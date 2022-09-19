package pom;

import org.openqa.selenium.WebDriver;

public class order {

	public  void order() {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ambika.tallalli\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
        driver.get("https://mobileworld.banyanpro.com/");
  LandingPage ordr = new LandingPage(driver);
        
        ordr.Order("ambika","tallalli","ambikatallalli@gmail.com", "ambika24", "9842575665","main road sedam  ", "  sedam","Bangalore", "5464789654", "1", "3");



	}


	}

}
