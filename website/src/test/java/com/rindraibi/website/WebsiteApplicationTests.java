package com.rindraibi.website;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.rindraibi.website.business.model.domainobject.Identity;
import com.rindraibi.website.business.model.domainobject.Portfolio;
import com.rindraibi.website.business.model.domainobject.Resume;
import com.rindraibi.website.business.service.applicationservice.intf.ResumeASIntf;
import com.rindraibi.website.dataaccess.dao.IdentityDAO;
import com.rindraibi.website.dataaccess.dao.PortfolioDAO;
import com.rindraibi.website.dataaccess.dao.ResumeDAO;

@SpringBootTest
class WebsiteApplicationTests {
	
	@Autowired 
	ResumeASIntf resumeAS;

	
	@Test
	void contextLoads() {
//		System.out.println(this.resumeAS.getResume());
	}
	

}
