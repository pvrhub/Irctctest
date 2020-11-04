package com.irctc.test;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import com.irctc.base.TestBase;
import com.irctc.qa.pages.IrctcLaunch;
//import com.irctc.qa.pages.IrctcLaunch;

public class FirstTest extends TestBase {
	
	

	public FirstTest() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}



	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		IrctcLaunch t = new IrctcLaunch();
		t.IrctcIntialize();
		//t.IrctcIntialize();
		t.pageLoad( );
		t.iWait();
		//String a = t.Title1();
		
		
	}

	

	@Test
	
public void getTitle() throws IOException{
		
		
		String expected =(ppt.getProperty("title"));
		
		//System.out.println(Title());
		Assert.assertEquals(expected, Title());
	}
	 
	
	
	
	
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		driverclose();
		
	}

}
