package com.cts.TransformerMonitoring.service;

import java.util.ArrayList;
import java.util.List;
import com.cts.TransformerMonitoring.exception.CriticalException;
import com.cts.TransformerMonitoring.model.Transformer;
import com.cts.TransformerMonitoring.util.ApplicationUtil;


public class MonitoringService {

public static ArrayList <Transformer> buildMonitoringList(List <String> MontoringRecords) {
		
		
		final String COMMADELIMITER = ",";
		ArrayList <Transformer> monitoringList = new ArrayList<Transformer>();
		//Fill the code here
		
		for(String customer:MontoringRecords) {
			//		<membershipType>,<insuranceType>,<dueDate>,<numberOfMonths>,<hospitalName>,<waitingPeriod>,<percentageCovered>.
//(Customer customer, String membershipType, String insuranceType, String dueDate,			int numberOfMonths, String hospitalName, int waitingPeriod, int percentageCovered, double policyPremium)
			String details[]=customer.split(COMMADELIMITER);
		
			Transformer cust =new Transformer(Double.parseDouble(details[0]),Double.parseDouble(details[1]),Double.parseDouble(details[2]),Double.parseDouble(details[3]),Double.parseDouble(details[4]),Double.parseDouble(details[5]),Double.parseDouble(details[6]),Double.parseDouble(details[7]),calculateStatus(Double.parseDouble(details[0]),Double.parseDouble(details[1]),Double.parseDouble(details[2])));
		
		System.out.println(Double.parseDouble(details[0])+","+Double.parseDouble(details[1])+","+Double.parseDouble(details[2])+","+Double.parseDouble(details[3])+","+Double.parseDouble(details[4])+","+Double.parseDouble(details[5])+","+Double.parseDouble(details[6])+","+Double.parseDouble(details[7])+","+calculateStatus(Double.parseDouble(details[0]),Double.parseDouble(details[1]),Double.parseDouble(details[2])));
			monitoringList.add(cust);
			}
		
		return monitoringList;
	}
	
	public boolean addMonitoringList(String inputFeed) throws CriticalException 
	{List<String> validRecords = new ArrayList<String>();
		//Fill the code here
	validRecords=ApplicationUtil.readFile(inputFeed);
buildMonitoringList(validRecords);
	
		return false;
	}
	
	public static String calculateStatus(double vry,double vyb,double vbr)
	{
		String status=null;
		//Fill the code here
		if(vry>=240&&vry<=250&&vyb>=240&&vyb<=250&&vbr>=240&&vbr<=250)
			status="Normal Voltage";
		else if(vry>250&&vry<=275||vyb>250&&vyb<=275||vbr>250&&vbr<=275)
			status="Critical Voltage";
		else if(vry<240||vyb<240||vbr<240)
		status="Low Voltage";
		else
			status="Over Voltage";
	
		
		return status;
	}
}
