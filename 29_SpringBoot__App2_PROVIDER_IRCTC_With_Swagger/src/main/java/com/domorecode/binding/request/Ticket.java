package com.domorecode.binding.request;

import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Ticket {
private Integer ticketId;
private String ticketFrom;
private String ticketTo;
private String trainNum;
private String ticketCost;
private String ticketStatus;
public Ticket() {
}
public Integer getTicketId() {
	return ticketId;
}
public void setTicketId(Integer ticketId) {
	this.ticketId = ticketId;
}
public String getTicketFrom() {
	return ticketFrom;
}
public void setTicketFrom(String ticketFrom) {
	this.ticketFrom = ticketFrom;
}
public String getTicketTo() {
	return ticketTo;
}
public void setTicketTo(String ticketTo) {
	this.ticketTo = ticketTo;
}
public String getTrainNum() {
	return trainNum;
}
public void setTrainNum(String trainNum) {
	this.trainNum = trainNum;
}
public String getTicketCost() {
	return ticketCost;
}
public void setTicketCost(String ticketCost) {
	this.ticketCost = ticketCost;
}
public String getTicketStatus() {
	return ticketStatus;
}
public void setTicketStatus(String ticketStatus) {
	this.ticketStatus = ticketStatus;
}
@Override
public String toString() {
	return "Ticket [ticketId=" + ticketId + ", ticketFrom=" + ticketFrom + ", ticketTo=" + ticketTo + ", trainNum="
			+ trainNum + ", ticketCost=" + ticketCost + ", ticketStatus=" + ticketStatus + "]";
}


}
