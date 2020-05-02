package com.testcases;

import java.io.IOException;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.base.TestBase;
import com.pages.DateSelection;
import com.pages.EmailOrPhoneNumber;
import com.pages.HomePage;
import com.pages.NeedPage;
import com.pages.PlumberAddInfo;
import com.pages.PlumbingHelpTime;
import com.pages.ProblemDescription;
import com.pages.ProblemItem;
import com.pages.TimeSelection;
import com.testdata.DataProviderClass;

public class StarOfService extends TestBase {

	@Test(dataProvider = "GetData", dataProviderClass = DataProviderClass.class)
	public void test(String location, String text, String time) throws IOException {

		initialization();

		HomePage hp = new HomePage();
		ProblemItem pi = new ProblemItem();
		NeedPage np = new NeedPage();
		ProblemDescription pd = new ProblemDescription();
		PlumberAddInfo pa = new PlumberAddInfo();
		PlumbingHelpTime ph = new PlumbingHelpTime();
		DateSelection ds = new DateSelection();
		TimeSelection ts = new TimeSelection();
		EmailOrPhoneNumber ep = new EmailOrPhoneNumber();

		hp.getHomePage(location);

		for (int i = 0; i < 10; i++) {

			String page = driver.findElement(By.xpath("//*[@class='v2__title___1Covm v2__commonFormTitle___3kSbd']"))
					.getText();

			switch (page) {
			case "The problems are to do with which of the following things?": {
				pi.getproblemsFacingItems();
				break;
			}
			case "What do you need done?": {
				np.getNeedPageItems();
				break;
			}
			case "What problem(s) do you have?": {
				pd.getProblemDescription();
				break;
			}
			case "Is there anything else that the Plumber needs to know?": {
				pa.getplumberAdditionalInfoPage(text);
				break;
			}

			case "When do you require plumbing?": {
				ph.geTimeOfPlumbingPage();
				break;
			}
			case "On what date?": {
				ds.getDatePage();
				ts.getTimePage(time);
				break;
			}
			case "Get responses faster with SMS notifications.": {
				ep.getEmailOrPhoneNumberField();
				break;
			}

			}

		}
	}

}
