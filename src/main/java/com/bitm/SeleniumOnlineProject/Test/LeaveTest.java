package com.bitm.SeleniumOnlineProject.Test;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import com.bitm.SeleniumOnlineProject.DTO.LeaveDTO;
import com.bitm.SeleniumOnlineProject.DataProvider.LeaveDataProvider;
import com.bitm.SeleniumOnlineProject.Utils.DriverManager;
import com.bitm.SeleniumOnlineProject.Utils.XpathUtils;

public class LeaveTest {

	private WebDriver driver =null;
	
	@Test
	public void AssignTest() throws InterruptedException 
	{
		driver = DriverManager.driver;
		Thread.sleep(3000);
		
	}
	
	
	@Test
	
	public void assignTest() throws InterruptedException {
		
		driver.findElement(By.xpath(XpathUtils.DashBoardModule.assignLeaveimg)).click();
		Thread.sleep(3000);
	}
	
	
	@Test(dataProvider ="leaveData", dataProviderClass = LeaveDataProvider.class )
	public void leavetest(List<LeaveDTO> logdata) throws InterruptedException   {
		
		for(LeaveDTO leave : logdata)	{
		driver.findElement(By.xpath(XpathUtils.LeaveModule.emp_name)).sendKeys(leave.getEmpname());
		Thread.sleep(3000);
		
		Select leavetype = new Select(driver.findElement(By.xpath(XpathUtils.LeaveModule.leavetype)));
		leavetype.selectByVisibleText(leave.getLeavetype());
		Thread.sleep(3000);
			
		driver.findElement(By.xpath(XpathUtils.LeaveModule.fromdate)).click();
		Thread.sleep(3000);
		
		//Select Month
		driver.findElement(By.xpath(XpathUtils.LeaveModule.frommonth)).click();
		Select FromMonth = new Select(driver.findElement(By.xpath(XpathUtils.LeaveModule.frommonth)));
		FromMonth.selectByVisibleText(leave.getFrommonth());
		Thread.sleep(3000);
		
		driver.findElement(By.xpath(XpathUtils.LeaveModule.fromyear)).click();
		Select FromYear = new Select(driver.findElement(By.xpath(XpathUtils.LeaveModule.fromyear)));
		FromYear.selectByVisibleText(leave.getFromyear());
		Thread.sleep(3000);
		
		WebElement Fromdate = driver.findElement(By.className(XpathUtils.LeaveModule.Fromdayclass));
		List<WebElement> fromcolumns = Fromdate.findElements(By.tagName("td"));
		for (WebElement cell : fromcolumns) {
			if (cell.getText().equals(leave.getFromday())) {
				cell.findElement(By.linkText(leave.getFromday())).click();
				break;
			
			}
		}
		
		//picking todate
		driver.findElement(By.xpath(XpathUtils.LeaveModule.todate)).click();
		//Select Month
		driver.findElement(By.xpath(XpathUtils.LeaveModule.Tomonth)).click();
	
		Select ToMonth = new Select(driver.findElement(By.xpath(XpathUtils.LeaveModule.Tomonth)));
		ToMonth.selectByVisibleText(leave.getTomonth());
		Thread.sleep(3000);
		
		driver.findElement(By.xpath(XpathUtils.LeaveModule.Toyear)).click();
		Select ToYear = new Select(driver.findElement(By.xpath(XpathUtils.LeaveModule.Toyear)));
		ToYear.selectByVisibleText(leave.getToyear());
		
		WebElement Todate = driver.findElement(By.className(XpathUtils.LeaveModule.Fromdayclass));
		List<WebElement> tocolumns = Todate.findElements(By.tagName("td"));
		for (WebElement cell : tocolumns) {
			if (cell.getText().equals(leave.getToday())) {
				cell.findElement(By.linkText(leave.getToday())).click();
				break;
			}
		}
			
	
		 driver.findElement(By.xpath(XpathUtils.LeaveModule.comment)).sendKeys(leave.getComment());
		 Thread.sleep(3000);
		 driver.findElement(By.xpath(XpathUtils.LeaveModule.assign)).click();
		 Thread.sleep(3000);
		 driver.findElement(By.xpath(XpathUtils.Confirm.confirmassign)).click();
		 Thread.sleep(3000);
         driver.close();

		
		
   }
  }
}
