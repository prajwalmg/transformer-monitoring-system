package com.cts.TransformerMonitoring.util;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.cts.TransformerMonitoring.exception.CriticalException;

public class ApplicationUtil {


	public static List<String> readFile(String inputfeed) throws CriticalException  
	{
		List<String> monitorList = new ArrayList<String>();
	   //Fill the code here
		final String COMMADELIMITER = ",";
	
		// FILL THE CODE HERE
		Scanner myReader = null;
		try {
		File myObj = new File(inputfeed);
		myReader = new Scanner(myObj);

		while (myReader.hasNextLine()) {
		String line=myReader.nextLine();
		String inputLine[]=line.split(COMMADELIMITER);
		try {
		if(check_if__sensor_connected(Double.parseDouble(inputLine[7]))) {
		monitorList.add(line);
		}else {
		//throw new MarkEligibilityException("Not Eligible");
		}
		} catch (NumberFormatException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		} 
		}
		} catch (FileNotFoundException e) {
		e.printStackTrace();
		} finally {
		myReader.close();
		}
		return monitorList;
	}
	
	public static boolean check_if__sensor_connected(double oil_temp_sensor) throws CriticalException
	{
		
		boolean check =false;
		//Fill the code here
		if(oil_temp_sensor>0)
		{
			check=true;
		}
		return check;
	}
}

