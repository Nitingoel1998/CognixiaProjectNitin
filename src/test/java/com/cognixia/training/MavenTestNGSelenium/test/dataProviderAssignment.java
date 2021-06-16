package com.cognixia.training.MavenTestNGSelenium.test;

import java.io.IOException;

import com.cognixia.training.MavenTestNGSelenium.common.ReadFromExcel;



import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataProviderAssignment  extends TestNGBase{

		@Test (dataProvider = "getDataFromExcel")
		public void myTest(String searchstring, String expectedstring) {
			String searchstrings = searchstring;
			searchbox.sendKeys(searchstrings);
			searchbox.submit();
			
			Assert.assertEquals( driver.getTitle(), expectedstring);

		}
		
		@DataProvider
		public Object[][] getDataFromExcel() throws IOException {
			return ReadFromExcel.readExcelData("C:\\Users\\Administrator\\eclipse-workspace\\MavenTestNGSelenium\\resource\\search.xlsx");
		}
	}

