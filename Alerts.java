package com.walletproject.alerts.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="[ALERTS]")
public class Alerts{
	
	

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "alertID")

	private String alertID;

	@Column(name = "TYPE", nullable = false)
	private String type;

	@Column(name = "MESSAGE", nullable = false)
	private String message;
	
	@Column(name = "DATE", nullable = false)
	private Date date;
	
	@Column(name = "RECEIVER", nullable = false)
	private String receiver;

	
	
	void alerts(String alertID, String type, String message, Date date, String receiver) {
        this.alertID = alertID;
        this.type = type;
        this.message = message;
        this.date = date;
        this.receiver = receiver;
      
    }



	public String getAlertID() {
		return alertID;
	}



	public void setAlertID(String alertID) {
		this.alertID = alertID;
	}



	public String getType() {
		return type;
	}



	public void setType(String type) {
		this.type = type;
	}



	public String getMessage() {
		return message;
	}



	public void setMessage(String message) {
		this.message = message;
	}



	public Date getDate() {
		return date;
	}



	public void setDate(Date date) {
		this.date = date;
	}



	public String getReceiver() {
		return receiver;
	}



	public void setReceiver(String receiver) {
		this.receiver = receiver;
	}

}