package com.app.travel.spends.servcie.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.app.travel.spends.dao.TravelDao;
import com.app.travel.spends.entities.Travels;
import com.app.travel.spends.servcie.TravelService;

public class TravelServcieImpl implements TravelService {

	@Autowired
	private TravelDao travelDao;

	@Transactional
	public void create(Travels travel) {
		travelDao.create(travel);
	}

	@Transactional
	public List<Travels> listTravels() {
		return travelDao.listTravels();
	}

}
