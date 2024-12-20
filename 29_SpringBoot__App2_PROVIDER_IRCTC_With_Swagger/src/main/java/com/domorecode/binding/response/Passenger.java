package com.domorecode.binding.response;



public class Passenger {
	private Integer PassengerId;
	private String fName;
	private String lName;
	private String from;
	private String to;
	private String trainNum;
	private String doj;
	public Passenger() {
	}
	public Integer getPassengerId() {
		return PassengerId;
	}
	public void setPassengerId(Integer passengerId) {
		PassengerId = passengerId;
	}
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public String getlName() {
		return lName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	public String getTrainNum() {
		return trainNum;
	}
	public void setTrainNum(String trainNum) {
		this.trainNum = trainNum;
	}
	public String getDoj() {
		return doj;
	}
	public void setDoj(String doj) {
		this.doj = doj;
	}
	@Override
	public String toString() {
		return "Passenger [PassengerId=" + PassengerId + ", fName=" + fName + ", lName=" + lName + ", from=" + from
				+ ", to=" + to + ", trainNum=" + trainNum + ", doj=" + doj + "]";
	}
	
	
}
