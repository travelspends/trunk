package com.app.travel.spends.dao;

import java.util.List;

import com.app.travel.spends.entities.Travels;

public interface TravelDao {

	public void create(Travels travel);

	public List<Travels> listTravels();
}
