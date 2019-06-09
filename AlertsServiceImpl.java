package com.walletproject.alerts.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.walletproject.alerts.dao.AlertsDao;
import com.walletproject.alerts.model.Alerts;

@Service("alertService")
@Transactional
public class AlertsServiceImpl implements AlertService {

	@Autowired
	private AlertsDao dao;

	public void saveAlerts(Alerts alerts) {
		dao.saveAlerts(alerts);
	}

	public List<Alerts> findAllAlerts() {
		return dao.findAllAlerts();
	}

	public void deleteUserByAlertId(String userID) {
		dao.deleteAlertByUserId(userID);
	}

	/*public User findById(Long userID) {
		return dao.findById(userID);
	}*/

	public void updateAlerts(Alerts alerts) {
		dao.updateAlerts(alerts);
	}

	/*public List<Alerts> findAllAlerts() {
		// TODO Auto-generated method stub
		return dao.findAllAlerts();
		
	}*/

	public Alerts findByAlertId(String alertID) {
		return dao.findByAlertId(alertID);
	}

	public void deleteAlertbyUserId(String userID) {
		// TODO Auto-generated method stub
		
	}

	/*public User findById(Long userID) {
		return dao.findById(userID);
	}*/

}