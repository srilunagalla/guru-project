package com.guru99.qa;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.guru.pages.Register;
import com.guru99.base.DriverScript;

public class Basetestcase extends DriverScript{
	Register Rp;
	public  Basetestcase(){
		super();
	}
@BeforeMethod
public void beforetest(){
	initbrowser();
	Rp = new Register();
	
}
@AfterMethod
public void teardown(){
	driver.close();
	
}
	
	
	
	

}



