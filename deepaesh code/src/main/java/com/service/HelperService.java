package com.service;

import org.springframework.stereotype.Service;

import com.model.HelperBean;

//use appropriate annotation to configure HelperService as a Service

@Service
public class HelperService {
	
	
	
	//calculate the totalCost and return the cost
	public double calculateTotalCost(HelperBean helperBean)
	{
		double val=300;
		double val1;
		if(helperBean.getServiceType().equals("ACService"))
		{
			val=400;
		}
		else if(helperBean.getServiceType().equals("WashingMachineService"))
		{
			val=500;
			
		}
		helperBean.setServiceCostPerHour((float)val);
		val1=val*helperBean.getNoOfHours();
		return val1;
		
		
	}

}
	 	  	    	    	     	      	 	
