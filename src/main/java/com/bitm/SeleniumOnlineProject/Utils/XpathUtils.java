package com.bitm.SeleniumOnlineProject.Utils;

public class XpathUtils {

	public static class LoginModule{
		
		public static final String user_name= "//*[@id=\"txtUsername\"]";
		public static final String password= "//*[@id=\"txtPassword\"]";
		public static final String signIN_BTN="//*[@id=\"btnLogin\"]";
	}
	
	public static class DashBoardModule{
		
		public static final String assignLeaveimg="//*[@id=\"dashboard-quick-launch-panel-menu_holder\"]/table/tbody/tr/td[1]/div/a/img";
	}
	
	public static class LeaveModule{
		
		public static final String emp_name= "//*[@id=\"assignleave_txtEmployee_empName\"]";
		public static final String leavetype="//*[@id=\"assignleave_txtLeaveType\"]";
		
		public static final String fromdate="//*[@id=\"assignleave_txtFromDate\"]";
		public static final String frommonth="//*[@id=\"ui-datepicker-div\"]/div/div/select[1]";
		public static final String fromyear="//*[@id=\"ui-datepicker-div\"]/div/div/select[2]";
		public static final String Fromdayclass="ui-datepicker-calendar";
		
		public static final String todate="//*[@id=\"assignleave_txtToDate\"]";
		public static final String Tomonth="//*[@id=\"ui-datepicker-div\"]/div/div/select[1]";
		public static final String Toyear="//*[@id=\"ui-datepicker-div\"]/div/div/select[2]";
		public static final String Todayclass="ui-datepicker-calendar";
		
		
		public static final String comment = "//*[@id=\"assignleave_txtComment\"]";
		public static final String assign= "//*[@id=\"assignBtn\"]";
		

		public static final String justclick="/html/body/div[1]/div[3]/div[1]/div[2]/form/fieldset/ol/li[2]/label";
		
	}
	
	public static class Confirm{

		public static final String confirmassign ="//*[@id=\"confirmOkButton\"]";
	}
	
}
