package com.cts.TransformerMonitoring.dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;

import com.cts.TransformerMonitoring.exception.CriticalException;
import com.cts.TransformerMonitoring.model.Transformer;
import com.mysql.jdbc.PreparedStatement;

public class MonitorDAO {
	public static Connection connection,connection1 = null;

	public boolean insertMonitoringList(ArrayList<Transformer> list) throws CriticalException {
		boolean recordsAdded = false;
		// Type code here
	

		//FILL THE CODE HERE
		Connection con=null;
		try {
		int status[];
		DBConnectionManager dbManager = DBConnectionManager.getInstance();
		con = dbManager.getConnection();
//change this line accordingly
		java.sql.PreparedStatement pstmt = con.prepareStatement("INSERT INTO ENGGADMISSION_LIST('ADMISSION_NO','APPLICANT_NAME','DATEOFBIRTH','PHYSICS_MARK','CHEMISTRY_MARK','MATHS_MARK','PREFERRED_STREAM','ADMISSION_FEE') VALUES(?,?,?,?,?,?,?,?)");
		for (Transformer student : list) {
		try {

		pstmt.setDouble(1, student.getVbr());
		pstmt.setDouble(2, student.getVry());
		pstmt.setDouble(3, student.getVyb());
		pstmt.setDouble(4, student.getIb());
		pstmt.setDouble(5, student.getIr());
		pstmt.setDouble(6, student.getIy());
		pstmt.setDouble(7, student.getRoom_temp());
		pstmt.setDouble(8, student.getOil_temp());
		pstmt.setString(9, student.getStatus());
		pstmt.addBatch();
		} catch (SQLException e) {
		con.rollback();
		con.commit();
		// TODO Auto-generated catch block
		e.printStackTrace();

		}
		}
		status=pstmt.executeBatch();
		recordsAdded=true;
		for(int s:status){
		if(s<0){
		   recordsAdded=false;
		}
		}
		}

		catch (SQLException e) {
		e.printStackTrace();

		}


		finally {
		if(con!=null) {
		try{
		con.close();
		}
		catch(Exception e)
		{
		 e.printStackTrace();
		}
		}
		}
		return recordsAdded;

		}


		
	
	
}
