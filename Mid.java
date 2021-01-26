package com;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import Utilities.Constants;
import Utilities.ObjectMap;

public class Mid {
	public static WebDriverWait wait;
    public static void wai(By ele) {
	wait.until(ExpectedConditions.visibilityOfElementLocated(ele)).click();;
}
	public static void main(String[] args) {
		System.setProperty(Constants.chromKey,Constants.path);
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 wait=new WebDriverWait(driver,30);
		driver.get(Constants.url);
		driver.findElement(ObjectMap.id).sendKeys("ravinder7525@gmail.com");
		driver.findElement(ObjectMap.password).sendKeys("Sareddy");
		wai(ObjectMap.login);
	    wai(ObjectMap.t_shirts);
	    wai(ObjectMap.dress);
	
	    Select size=new Select(driver.findElement(ObjectMap.size));
	    size.selectByValue("3");
	    wai(ObjectMap.add_to_cart);
	    wai(ObjectMap.proceed);
	    wai(ObjectMap.address);
	    wai(ObjectMap.check_out);
	    wait.until(ExpectedConditions.visibilityOfElementLocated(ObjectMap.click_agree));
	    driver.findElement(ObjectMap.after_agree_visability).click();
		wai(ObjectMap.after_agree_check_out);

			}

}
