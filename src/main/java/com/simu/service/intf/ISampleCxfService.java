package com.simu.service.intf;

import javax.jws.WebService;

@WebService
public interface ISampleCxfService {
	
	public String sampleService(String inputParam);
	
}
