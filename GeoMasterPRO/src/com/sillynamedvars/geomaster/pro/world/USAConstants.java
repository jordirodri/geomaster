package com.sillynamedvars.geomaster.pro.world;

import java.util.ArrayList;
import java.util.List;

import com.sillynamedvars.geomaster.pro.model.City;
import com.sillynamedvars.geomaster.pro.util.ApplicationUtils;


public abstract class USAConstants {

	public static List<City> createCitiesEasyUSA(int roundsToPlay) {

		List<City> cities = createCitiesUSStates();
		List<City> citiesEasy = new ArrayList<City>();

		for (City easyCity : cities) {
			if (easyCity.isEasy()) {
				citiesEasy.add(easyCity);
			}
		}

		boolean listExhausted = false;
		while (citiesEasy.size() < roundsToPlay && !listExhausted) {

			for (City easyCity : cities) {
				if (easyCity.isNormal() && !citiesEasy.contains(easyCity)) {
					citiesEasy.add(easyCity);
				}
			}
			listExhausted = true;
		}

		List<City> citiesPlayed = ApplicationUtils.randomizeCities(citiesEasy, roundsToPlay);

		return citiesPlayed;

	}

	public static List<City> createCitiesNormalUSA(int roundsToPlay) {

		List<City> cities = createCitiesUSStates();
		List<City> citiesNormal = new ArrayList<City>();

		for (City normalCity : cities) {
			if (normalCity.isEasy() || normalCity.isNormal()) {
				citiesNormal.add(normalCity);

			}
		}

		List<City> citiesPlayed = ApplicationUtils.randomizeCities(citiesNormal, roundsToPlay);

		return citiesPlayed;

	}

	public static List<City> createCitiesHardUSA(int roundsToPlay) {

		List<City> cities = createCitiesUSStates();
		List<City> citiesPlayed = ApplicationUtils.randomizeCities(cities, roundsToPlay);

		return citiesPlayed;

	}

	public static List<City> createCitiesUSStates() {

		List<City> lstCities = new ArrayList<City>();

		lstCities.add(new City("Montgomery", "Alabama", "US States", 32.361667, -86.279167, true, true, false, false, false, "Alabama-Flag-48.png"));
		lstCities.add(new City("Juneau", "Alaska", "US States", 58.444444, -134.229722, true, false, false, true, false, "Alaska-Flag-48.png"));
		lstCities.add(new City("Phoenix", "Arizona", "US States", 33.4482, -112.0738, true, true, false, false, false, "Arizona-Flag-48.png"));
		lstCities.add(new City("Little Rock", "Arkansas", "US States", 34.736111, -92.331111, true, true, false, false, false, "Arkansas-Flag-48.png"));
		lstCities.add(new City("Sacramento", "California", "US States", 38.555556, -121.468889, true, true, false, false, false, "California-Flag-48.png"));
		lstCities.add(new City("Denver", "Colorado", "US States", 39.739167, -104.984722, true, false, true, false, false, "Colorado-Flag-48.png"));
		lstCities.add(new City("Hartford", "Connecticut", "US States", 41.762736, -72.674286, true, false, false, true, false, "Connecticut-Flag-48.png"));
		lstCities.add(new City("Dover", "Delaware", "US States", 39.161944, -75.526667, true, false, false, true));
		lstCities.add(new City("Tallahassee", "Florida", "US States", 30.451667, -84.268533, true, false, true, false));
		lstCities.add(new City("Atlanta", "Georgia", "US States", 33.755, -84.39, true, true, false, false));
		lstCities.add(new City("Honolulu", "Hawaii", "US States", 21.308889, -157.826111, true, false, true, false));
		lstCities.add(new City("Boise", "Idaho", "US States", 43.613739, -116.237651, true, false, false, true));
		lstCities.add(new City("Springfield", "Illinois", "US States", 39.78325, -89.650373, true, true, false, false));
		lstCities.add(new City("Indianapolis", "Indiana", "US States", 39.790942, -86.147685, true, true, false, false));
		lstCities.add(new City("Des Moines", "Iowa", "US States", 41.590833, -93.620833, true, false, false, true));
		lstCities.add(new City("Topeka", "Kansas", "US States", 39.055833, -95.689444, true, false, false, true));
		lstCities.add(new City("Frankfort", "Kentucky", "US States", 38.197274, -84.86311, true, false, true, false));
		lstCities.add(new City("Baton Rouge", "Louisiana", "US States", 30.45809, -91.140229, true, false, false, true));
		lstCities.add(new City("Augusta", "Maine", "US States", 44.323535, -69.765261, true, false, false, true));
		lstCities.add(new City("Annapolis", "Maryland", "US States", 38.972944, -76.501158, true, false, true, false));
		lstCities.add(new City("Boston", "Massachusetts", "US States", 42.357778, -71.061667, true, true, false, false));
		lstCities.add(new City("Lansing", "Michigan", "US States", 42.7335, -84.5467, true, false, false, true));
		lstCities.add(new City("Saint Paul", "Minnesota", "US States", 44.9441, -93.0852, true, false, false, true));
		lstCities.add(new City("Jackson", "Mississippi", "US States", 32.298889, -90.184722, true, true, false, false));
		lstCities.add(new City("Jefferson City", "Missouri", "US States", 38.576667, -92.173611, true, false, false, true));
		lstCities.add(new City("Helena", "Montana", "US States", 46.595805, -112.027031, true, false, false, true));
		lstCities.add(new City("Lincoln", "Nebraska", "US States", 40.809722, -96.675278, true, false, false, true));
		lstCities.add(new City("Carson City", "Nevada", "US States", 39.160833, -119.753889, true, false, false, true));
		lstCities.add(new City("Concord", "New Hampshire", "US States", 43.206667, -71.538056, true, false, false, true, false, "New-Hampshire-Flag-48.png"));
		lstCities.add(new City("Trenton", "New Jersey", "US States", 40.221667, -74.756111, true, false, true, false, false, "New-Jersey-Flag-48.png"));
		lstCities.add(new City("Santa Fe", "New Mexico", "US States", 35.667222, -105.964444, true, true, false, false, false, "New-Mexico-Flag-48.png"));
		lstCities.add(new City("Albany", "New York", "US States", 42.652594, -73.757314, true, false, false, true, false, "New-York-Flag-48.png"));
		lstCities.add(new City("Raleigh", "North Carolina", "US States", 35.818889, -78.644722, true, false, false, true, false, "North-Carolina-Flag-48.png"));
		lstCities.add(new City("Bismarck", "North Dakota", "US States", 46.813343, -100.779004, true, false, false, true, false, "North-Dakota-Flag-48.png"));
		lstCities.add(new City("Columbus", "Ohio", "US States", 39.983333, -82.983333, true, false, true, false));
		lstCities.add(new City("Oklahoma City", "Oklahoma", "US States", 35.4823, -97.5352, true, true, false, false));
		lstCities.add(new City("Salem", "Oregon", "US States", 44.930833, -123.028889, true, false, false, true));
		lstCities.add(new City("Harrisburg", "Pennsylvania", "US States", 40.269722, -76.875556, true, false, false, true));
		lstCities.add(new City("Providence", "Rhode Island", "US States", 41.823611, -71.422222, true, false, false, true, false, "Rhode-Island-Flag-48.png"));
		lstCities.add(new City("Columbia", "South Carolina", "US States", 34.000556, -81.044167, true, false, false, true, false, "South-Carolina-Flag-48.png"));
		lstCities.add(new City("Pierre", "South Dakota", "US States", 44.367966, -100.336378, true, false, false, true, false, "South-Dakota-Flag-48.png"));
		lstCities.add(new City("Nashville", "Tennessee", "US States", 36.166667, -86.783333, true, true, false, false));
		lstCities.add(new City("Austin", "Texas", "US States", 30.25, -97.75, true, false, true, false));
		lstCities.add(new City("Salt Lake City", "Utah", "US States", 40.75, -111.883333, true, true, false, false, false, "West-Virginia-Flag-48.png"));
		lstCities.add(new City("Montpelier", "Vermont", "US States", 44.25, -72.566667, true, false, false, true));
		lstCities.add(new City("Richmond", "Virginia", "US States", 37.540972, -77.432889, true, true, false, false));
		lstCities.add(new City("Olympia", "Washington", "US States", 47.0425, -122.893056, true, false, false, true));
		lstCities.add(new City("Charleston", "West Virginia", "US States", 38.347222, -81.633333, true, false, false, true));
		lstCities.add(new City("Madison", "Wisconsin", "US States", 43.066667, -89.4, true, false, false, true));
		lstCities.add(new City("Cheyenne", "Wyoming", "US States", 41.145556, -104.801944, true, false, true, false));

		return lstCities;

	}
}
