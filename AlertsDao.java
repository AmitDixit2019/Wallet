package com.walletproject.alerts.dao;

import java.util.List;

import com.walletproject.alerts.model.Alerts;

public interface AlertsDao {

	void saveAlerts(Alerts alerts);

	List<Alerts> findAllAlerts();

	void deleteAlertByUserId(String userID);

	Alerts findByAlertId(String alertID);

	void updateAlerts(Alerts alerts);
}