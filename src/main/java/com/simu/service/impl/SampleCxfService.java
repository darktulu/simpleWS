package com.simu.service.impl;

import javax.jws.WebService;

import com.simu.service.intf.ISampleCxfService;

@WebService(endpointInterface = "com.simu.service.intf.ISampleCxfService")
public class SampleCxfService implements ISampleCxfService {

	public String sampleService(String inputParam) {
		
		String retVal ="sample output";
		
		return retVal;
	}

}
