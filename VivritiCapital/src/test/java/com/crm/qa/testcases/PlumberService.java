package com.crm.qa.testcases;

import java.io.IOException;
import org.testng.annotations.Test;
import com.crm.qa.base.TestBase;
import com.crm.qa.pages.DateSelection;
import com.crm.qa.pages.EmailOrPhoneNumber;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.NeedPage;
import com.crm.qa.pages.PlumberAddInfo;
import com.crm.qa.pages.PlumbingHelpTime;
import com.crm.qa.pages.ProblemDescription;
import com.crm.qa.pages.ProblemItem;
import com.crm.qa.pages.TimeSelection;

public class PlumberService extends TestBase {

	@Test
	public void test() throws IOException {
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

		hp.getHomePage();
		pi.getproblemsFacingItems();
		np.getNeedPageItems();
		pd.getProblemDescription();
		pa.getplumberAdditionalInfoPage();
		ph.geTimeOfPlumbingPage();
		ds.getDatePage();
		ts.getTimePage();
		ep.getEmailOrPhoneNumberField();

	}

}
