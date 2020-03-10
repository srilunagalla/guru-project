package com.guru99.qa;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.FilenameUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class Registertestcase extends Basetestcase {

	@Test
	public void clickregisterbtn(){
		
		Rp.clickregister();
		Rp.entername("Lakshmi", "paturi","6785252527");
		Rp.dateofbirth("1981", "12", "30");
		Rp.address("lakewateree", "florence"," marion");
		Rp.pinnumber("29501");
		Rp.mail("srilunagalla@yahoo.com", "Saicharan12", "Saicharan12");
		
		Rp.clickCreate();
	}
	public void Screenshot(WebDriver driver) throws IOException{
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src = ts.getScreenshotAs( OutputType.FILE);
	File target = new File("homepage.png");
		FileUtils.copyFile(src, target);
}
}