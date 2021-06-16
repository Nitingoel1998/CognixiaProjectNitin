package com.cognixia.training.MavenTestNGSelenium;

import java.io.File;

import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.cognixia.training.MavenTestNGSelenium.common.Base;

public class sss extends Base {

	public static void main(String[] args) throws IOException {
		
		 openBrowser("chrome");
		
		driver.get("https://register.rediff.com/register/register.php");
		File f;
		f=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(f,new File("C:\\Users\\Administrator\\Pictures\\Screenshots/image1.jpg"));
}
}