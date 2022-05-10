package com.cts.TransformerMonitoring.exception;


public class CriticalException extends Exception{
	String strMsg1;
	Throwable strMsg2;
	
	
	public CriticalException() {
		super();
	}
	public CriticalException(String strMsg1)
	{
		super(strMsg1);
	}
	
	public CriticalException(String strMsg1, Throwable strMsg2) {
		super();
		this.strMsg1 = strMsg1;
		this.strMsg2 = strMsg2;
	}
}

