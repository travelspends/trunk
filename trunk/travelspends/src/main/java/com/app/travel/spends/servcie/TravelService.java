/**
 * 
 */
package com.app.travel.spends.servcie;

import java.util.List;

import com.app.travel.spends.entities.Travels;

/**
 * @author Hp
 * 
 */
public interface TravelService {

	public void create(Travels travel);

	public List<Travels> listTravels();
}
