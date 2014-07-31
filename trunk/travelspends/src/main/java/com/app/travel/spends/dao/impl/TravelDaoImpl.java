/**
 * 
 */
package com.app.travel.spends.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.app.travel.spends.dao.TravelDao;
import com.app.travel.spends.entities.Travels;

/**
 * @author Hp
 * 
 */
public class TravelDaoImpl implements TravelDao {

	@Autowired
	private SessionFactory sessionFactory;

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.app.travel.spends.dao.TravelDao#create(com.app.travel.spends.entities
	 * .Travels)
	 */
	public void create(Travels travel) {
		sessionFactory.getCurrentSession().save(travel);

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.app.travel.spends.dao.TravelDao#listTravels()
	 */
	public List<Travels> listTravels() {
		return sessionFactory.getCurrentSession().createQuery("from Travels")
				.list();
	}

}
