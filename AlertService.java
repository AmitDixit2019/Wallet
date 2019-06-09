package com.walletproject.alerts.service;

import java.util.List;

import com.walletproject.alerts.model.Alerts;

public interface AlertService {

	void saveAlerts(Alerts alerts);

	List<Alerts> findAllAlerts();

	void deleteAlertbyUserId(String userID);

	Alerts findByAlertId(String alertID);

	void updateAlerts(Alerts alerts);
}