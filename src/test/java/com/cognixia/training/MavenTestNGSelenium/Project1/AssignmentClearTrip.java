package com.cognixia.training.MavenTestNGSelenium.Project1;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class AssignmentClearTrip extends AssignmentBase {
     @Test
     
	 public void testClearTrip() {
    	 //Select the Round Trip
    	 WebElement clickOnRoundTrip= driver.findElement(By.xpath("//*[@class='fs-3 fw-600 c-neutral-900'][contains(text(),'Round trip')]"));
    	 clickOnRoundTrip.click();
    	 //Select From
    	 WebElement From= driver.findElement(By.xpath("//input[starts-with(@class,'field bw-1 bs-solid')][1]"));
    	 From.click();
    	 //Select New Delhi
    	 WebElement FromNewDelhi= driver.findElement(By.xpath("//*[@class='to-ellipsis o-hidden ws-nowrap c-inherit fs-3'][contains(text(),'New Delhi, IN - Indira Gandhi Airport (DEL)')]"));
    	 FromNewDelhi.click();
    	 //Select To
    	 WebElement To= driver.findElement(By.xpath("//input[@class,'field bw-1 bs-solid')][2]"));
    	 To.click();
    	 //Select the Departdate
    	
    	 WebElement departOn= driver.findElement(By.xpath("//div[@class=\"flex flex-middle p-relative homeCalender\"]"));
    	 departOn.click();
    	 //Select 1July
    	 WebElement onDate= driver.findElement(By.xpath("//*[@class='p-1 day-gridContent flex flex-middle flex-column flex-center flex-top monthStart'][contains(text(),'1')]"));
    	 onDate.click();
    	 //Select SearchFlight
    	 WebElement searchFlight= driver.findElement(By.xpath("//button[@class='px-7 bg-primary-500 hover:bg-primary-600 c-white bc-transparent c-pointer w-100p py-2 px-5 h-10 fs-4 fw-600 t-all button bs-solid tp-color td-500 bw-1 br-4 lh-solid box-border']"));
    	 searchFlight.click();
	 }
}     