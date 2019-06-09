package com.walletproject.corepackage.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import com.walletproject.corepackage.model.User;

@Repository("userDao")
public class UserDaoImpl extends AbstractDao implements UserDao {

	public void saveUser(User user) {
		persist(user);
	}

	@SuppressWarnings("unchecked")
	public List<User> findAllEmployees() {
		Criteria criteria = getSession().createCriteria(User.class);
		return (List<User>) criteria.list();
	}

	public void deleteUserById(String userID) {
		Query query = getSession().createSQLQuery("delete from walletuser where userID = :userID");
		query.setString("userID", userID);
		query.executeUpdate();
	}

	public User findById(String userID) {
		Criteria criteria = getSession().createCriteria(User.class);
		criteria.add(Restrictions.eq("userID", userID));
		return (User) criteria.uniqueResult();
	}

	public void updateUser(User user) {
		getSession().update(user);
	}

	@SuppressWarnings("unchecked")
	public List<User> findAllUser() {
		Criteria criteria = getSession().createCriteria(User.class);
		return (List<User>) criteria.list();
	}

	public User findById(Long userID) {
		Criteria criteria = getSession().createCriteria(User.class);
		criteria.add(Restrictions.eq("userID", userID));
		return (User) criteria.uniqueResult();
		}

}