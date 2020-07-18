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
}
