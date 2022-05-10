package com.cts.TransformerMonitoring.model;

public class Transformer {
	private double Vry;
	private double Vyb;
	private double Vbr;
	private double Ir;
	private double Iy;
	private double Ib;
	private double room_temp;
	private double oil_temp;
	private String status;
	//constructors
	public Transformer() {}
	public Transformer(double vry, double vyb, double vbr, double ir, double iy, double ib, double room_temp,
			double oil_temp,String status) {
		super();
		this.Vry = vry;
		this.Vyb = vyb;
		this.Vbr = vbr;
		this.Ir = ir;
		this.Iy = iy;
		this.Ib = ib;
		this.room_temp = room_temp;
		this.oil_temp = oil_temp;
		this.status=status;
		setVry(vry);
		setVyb(Vyb);
		setVbr(Vbr);
		setIr(ir);
		setIy(iy);
		setIb(ib);
		setRoom_temp(room_temp);
		setStatus(status);
		setOil_temp(oil_temp);
	}
	
	//setters and getters
	public double getVry() {
		return Vry;
	}
	public void setVry(double vry) {
		Vry = vry;
	}
	public double getVyb() {
		return Vyb;
	}
	public void setVyb(double vyb) {
		Vyb = vyb;
	}
	public double getVbr() {
		return Vbr;
	}
	public void setVbr(double vbr) {
		Vbr = vbr;
	}
	public double getIr() {
		return Ir;
	}
	public void setIr(double ir) {
		Ir = ir;
	}
	public double getIy() {
		return Iy;
	}
	public void setIy(double iy) {
		Iy = iy;
	}
	public double getIb() {
		return Ib;
	}
	public void setIb(double ib) {
		Ib = ib;
	}
	public double getRoom_temp() {
		return room_temp;
	}
	public void setRoom_temp(double room_temp) {
		this.room_temp = room_temp;
	}
	public double getOil_temp() {
		return oil_temp;
	}
	public void setOil_temp(double oil_temp) {
		this.oil_temp = oil_temp;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "Transformer [Vry=" + Vry + ", Vyb=" + Vyb + ", Vbr=" + Vbr + ", Ir=" + Ir + ", Iy=" + Iy + ", Ib=" + Ib
				+ ", room_temp=" + room_temp + ", oil_temp=" + oil_temp + ", status=" + status + "]";
	}
	
	

}
