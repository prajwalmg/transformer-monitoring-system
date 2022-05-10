package com.cts.TransformerMonitoring.client;

import com.cts.TransformerMonitoring.skeleton.SkeletonValidator;
import com.cts.TransformerMonitoring.exception.CriticalException;
import com.cts.TransformerMonitoring.service.MonitoringService;

public class TransformerMonitorMain 
{
	public static void main(String[] args) throws CriticalException {
		// CODE SKELETON - VALIDATION STARTS
		// DO NOT CHANGE THIS CODE

		MonitoringService monitoringService = new MonitoringService();
		monitoringService.addMonitoringList("C:/Users/shahul/Downloads/tm/Transformer Monitoring/TransformerMonitoring/inputfeed.txt");//chnage path
		// CODE SKELETON - VALIDATION ENDS C:\Users\shahul\Downloads\tm\Transformer Monitoring\TransformerMonitoring

// TYPE YOUR CODE HERE
	}

}
