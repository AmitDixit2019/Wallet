package com.walletproject.alerts.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import com.walletproject.alerts.model.Alerts;
import com.walletproject.corepackage.model.User;

@Repository("alertsDao")
public class AlertsDaoImpl extends AbstractDao implements AlertsDao {

	public void saveAlerts(Alerts alerts) {
		persist(alerts);
	}

	/*@SuppressWarnings("unchecked")
	public List<Alerts> findAllAlerts() {
		Criteria criteria = getSession().createCriteria(Alerts.class);
		return (List<Alerts>) criteria.list();
	}*/

	public void deleteUserById(String userID) {
		Query query = getSession().createSQLQuery("delete from alerts where userID = :userID");
		query.setString("userID", userID);
		query.executeUpdate();
	}

	public User findById(String userID) {
		Criteria criteria = getSession().createCriteria(User.class);
		criteria.add(Restrictions.eq("userID", userID));
		return (User) criteria.uniqueResult();
	}

	public void updateAlerts(Alerts alerts) {
		getSession().update(alerts);
	}

	@SuppressWarnings("unchecked")
	public List<Alerts> findAllAlerts() {
		Criteria criteria = getSession().createCriteria(Alerts.class);
		return (List<Alerts>) criteria.list();
	}

	public Alerts findByAlertId(Long alertID) {
		Criteria criteria = getSession().createCriteria(Alerts.class);
		criteria.add(Restrictions.eq("alertID", alertID));
		return (Alerts) criteria.uniqueResult();
		}

	public void deleteAlertByUserId(String userID) {
		// TODO Auto-generated method stub
		
	}

	public Alerts findByAlertId(String alertID) {
		// TODO Auto-generated method stub
		return null;
	}

	

}