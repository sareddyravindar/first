package com;



import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class BookFlight {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Ravindar Reddy\\Downloads\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://zero.webappsecurity.com/");
	driver.manage().window().maximize();
	 String actual_title= driver.findElement(By.xpath("//title[contains(text(),'Zero - Personal Banking - Loans - Credit Cards')]")).getText();
     if(actual_title.equalsIgnoreCase("zero bank")) {
   	  System.out.println("true");
     }else {
   	  System.out.println("false");
     }
     driver.findElement(By.id("signin_button")).click();
     driver.findElement(By.id("user_login")).sendKeys("username");
     driver.findElement(By.id("user_password")).sendKeys("password");
     driver.findElement(By.xpath("//input[@class='btn btn-primary']")).click();
     
     String actual_title1= driver.findElement(By.xpath("/html/head/title")).getText();
     if(actual_title1.equalsIgnoreCase("Zero - Account Summary")) {
   	  System.out.println("true");
     }else {
   	  System.out.println("false");
     }
     
     driver.findElement(By.id("transfer_funds_tab")).click();
     String actual_title_funds= driver.findElement(By.xpath("//title[contains(text(),'Zero - Transfer Funds')]")).getText();
     System.out.println(actual_title_funds);
     if(actual_title_funds.equalsIgnoreCase("Zero - Transfer Funds")) {
      	  System.out.println("true");
        }else {
      	  System.out.println("false");
        }
     driver.findElement(By.xpath("//input[@id='tf_amount']")).sendKeys("4555");
     driver.findElement(By.xpath("//input[@id='tf_description']")).sendKeys("hello usename");

     driver.findElement(By.id("btn_submit")).click();
     
     driver.findElement(By.xpath("//body/div/div/div/div/div[@id='settingsBox']/ul/li[3]/a[1]")).click();
     driver.findElement(By.id("logout_link")).click();
	
	
	
	
//	//username
//	driver.findElement(By.name("userName")).sendKeys("mercury");
//	//password
//	driver.findElement(By.name("password")).sendKeys("mercury");
//	//signIn
//	driver.findElement(By.name("login")).click();
//	//radio
//	List<WebElement> radio=driver.findElements(By.name("tripType"));
//	radio.get(1).click();
//	//passengers
//	Select passengers=new Select(driver.findElement(By.name("passCount")));
//	passengers.selectByVisibleText("2");
//	//Departing From
//	Select Departing_From=new Select(driver.findElement(By.name("fromPort")));
//	Departing_From.selectByVisibleText("London");
//	//on
//	Select on=new Select(driver.findElement(By.name("fromMonth")));
//	on.selectByVisibleText("December");
//	//day
//	    Select day=new Select(driver.findElement(By.name("fromDay")));
//		day.selectByVisibleText("22");
//		//toPort
//		 Select toPort=new Select(driver.findElement(By.name("toPort")));
//		 toPort.selectByVisibleText("Sydney");
//		  //Returning
//		 Select Returning=new Select(driver.findElement(By.name("toMonth")));
//		 Returning.selectByVisibleText("January");	
//		 //Returning_day
//		 Select Returning_day=new Select(driver.findElement(By.name("toDay")));
//		 Returning_day.selectByVisibleText("20");
//    //Preferences 
//		 //serviceClass
//		 List<WebElement> service=driver.findElements(By.name("servClass"));
//		 service.get(2).click();
////    //Airline
////		 Select airline=new Select(driver.findElement(By.name("airline")));
////		 Returning_day.selectByVisibleText("Unified Airlines");
//   //click
//		 driver.findElement(By.name("findFlights")).click();
//		 
//		 //depart
//		 driver.findElement(By.xpath("//table//table//table//table//table[1]//tbody[1]//tr[5]//td[1]//input[1]")).click();
//		 //return
//		 driver.findElement(By.xpath("//table[2]//tbody[1]//tr[9]//td[1]//input[1]")).click();
////continue
//		 driver.findElement(By.xpath("//input[@name='reserveFlights']")).click();
//		 //bbok a flight
//		 // first passengersdetails
//		 //first_name
//		 
//		 driver.findElement(By.xpath("//input[@name='passFirst0']")).sendKeys("Ravindar");
//		 //lastNAme
//		 driver.findElement(By.xpath("//input[@name='passLast0']")).sendKeys("Sareddy");
//	    //meal
//		 Select meal=new Select(driver.findElement(By.xpath("//select[@name='pass.0.meal']")));
//		 meal.selectByIndex(4);
//		//2nd passenger 
//         //first_name
//		 
//		 driver.findElement(By.xpath("//input[@name='passFirst1']")).sendKeys("Ravindar");
//		 //lastNAme
//		 driver.findElement(By.xpath("//input[@name='passLast1']")).sendKeys("Sareddy");
//	    //meal
//		 Select meal2=new Select(driver.findElement(By.xpath("//select[@name='pass.1.meal']")));
//		 meal2.selectByIndex(3);
//		//credit card
//		 //card Type
//		 Select card_type=new Select(driver.findElement(By.xpath("//select[@name='creditCard']")));
//		 card_type.selectByValue("IK");;
//		 //number
//		 driver.findElement(By.xpath("//input[@name='creditnumber']")).sendKeys("12345678910");
//		//ExpireMonth
//		 Select expireMonth=new Select(driver.findElement(By.xpath("//select[@name='cc_exp_dt_mn']")));
//		 expireMonth.selectByIndex(6);;
//		//expireYear
//		 Select expireYear=new Select(driver.findElement(By.xpath("//select[@name='cc_exp_dt_yr']")));
//		 expireYear.selectByVisibleText("2010");
//		 //firstName
//		 driver.findElement(By.xpath("//input[@name='cc_frst_name']")).sendKeys("Ravindar");
//		 //MiddleName
//		 driver.findElement(By.xpath("//input[@name='cc_mid_name']")).sendKeys("Reddy");
//		 //lastName
//		 driver.findElement(By.xpath("//input[@name='cc_last_name']")).sendKeys("Sareddy");
//		 //address
//		 driver.findElement(By.xpath("//input[@name='billAddress1']")).clear();
//		 driver.findElement(By.xpath("//input[@name='billAddress1']")).sendKeys("6935 rue dumas");
//		//city
//		 driver.findElement(By.xpath("//input[@name='billCity']")).clear();
//		 driver.findElement(By.xpath("//input[@name='billCity']")).sendKeys("Montreal");
//		//province
//		 driver.findElement(By.xpath("//input[@name='billState']")).clear();
//		 driver.findElement(By.xpath("//input[@name='billState']")).sendKeys("QC");
//		//Postal code
//		 driver.findElement(By.xpath("//input[@name='billZip']")).clear();
//		 driver.findElement(By.xpath("//input[@name='billZip']")).sendKeys("H4E3A2");
//		//country
//		 Select country=new Select(driver.findElement(By.xpath("//select[@name='delCountry']")));
//		 country.selectByVisibleText("CANADA");
//		 
//		 Alert alert = driver.switchTo().alert();
//		 driver.switchTo().alert().accept();
//		 driver.findElement(By.name("buyFlights")).click();
//		}
	}
}
