package com.sillynamedvars.geomaster.pro;

import java.util.ArrayList;
import java.util.List;

import android.content.SharedPreferences;

import com.google.android.maps.GeoPoint;
import com.sillynamedvars.geomaster.pro.model.City;
import com.sillynamedvars.geomaster.pro.util.ApplicationUtils;
import com.sillynamedvars.geomaster.pro.world.AfricaConstants;
import com.sillynamedvars.geomaster.pro.world.AmericaConstants;
import com.sillynamedvars.geomaster.pro.world.AsiaConstants;
import com.sillynamedvars.geomaster.pro.world.EuropeConstants;
import com.sillynamedvars.geomaster.pro.world.FamousPlacesConstants;
import com.sillynamedvars.geomaster.pro.world.OceaniaConstants;
import com.sillynamedvars.geomaster.pro.world.USAConstants;
import com.sillynamedvars.geomaster.pro.world.WorldConstants;

public class PlayConfig {

	private String difficulty;
	private String mapPlayed;
	private int distance;
	private int distanceTotal;
	private int round = 0;
	private int zoomLevel = 5;

	private int roundsToPlay = SettingsActivity.SETTINGS_ROUNDS_OPTION1;
	private String mapType = SettingsActivity.SETTINGS_MAP_TYPE_OPTION1;
	private String distanceUnits = SettingsActivity.SETTINGS_DISTANCE_UNITS_OPTION1;

	private List<City> cities = new ArrayList<City>();

	private City playedCity = null;
	private GeoPoint initGeoPoint = null;

	public PlayConfig(String difficulty, String mapPlayed, SharedPreferences prefs) {

		this.difficulty = difficulty;
		this.mapPlayed = mapPlayed;

		int rounds = SettingsActivity.SETTINGS_ROUNDS_OPTION1;

		roundsToPlay = ApplicationUtils.loadSharedPreferences(prefs, "rounds", rounds);
		mapType = ApplicationUtils.loadSharedPreferences(prefs, "mapType", mapType);
		distanceUnits = ApplicationUtils.loadSharedPreferences(prefs, "distanceUnits", distanceUnits);

		// TODO remove
		// roundsToPlay = 3;

		// default
		initGeoPoint = new GeoPoint(GameConstants.PLAYMAP_EUROPE_INIT_LAT, GameConstants.PLAYMAP_EUROPE_INIT_LON);

		if (GameConstants.DIFFICULTY_EASY.equals(difficulty)) {

			if (GameConstants.PLAYMAP_WORLD.equals(mapPlayed)) {

				cities = WorldConstants.createCitiesEasyWorld(roundsToPlay);
				initGeoPoint = new GeoPoint(GameConstants.PLAYMAP_EUROPE_INIT_LAT, GameConstants.PLAYMAP_EUROPE_INIT_LON);
				zoomLevel = 4;

			} else if (GameConstants.PLAYMAP_EUROPE.equals(mapPlayed)) {

				cities = EuropeConstants.createCitiesEasyEurope(roundsToPlay);
				initGeoPoint = new GeoPoint(GameConstants.PLAYMAP_EUROPE_INIT_LAT, GameConstants.PLAYMAP_EUROPE_INIT_LON);				

			} else if (GameConstants.PLAYMAP_AMERICA.equals(mapPlayed)) {

				cities = AmericaConstants.createCitiesEasyAmerica(roundsToPlay);
				initGeoPoint = new GeoPoint(GameConstants.PLAYMAP_AMERICA_INIT_LAT, GameConstants.PLAYMAP_AMERICA_INIT_LON);
				zoomLevel = 4;

			} else if (GameConstants.PLAYMAP_AFRICA.equals(mapPlayed)) {

				cities = AfricaConstants.createCitiesEasyAfrica(roundsToPlay);
				initGeoPoint = new GeoPoint(GameConstants.PLAYMAP_AFRICA_INIT_LAT, GameConstants.PLAYMAP_AFRICA_INIT_LON);
				zoomLevel = 4;

			} else if (GameConstants.PLAYMAP_ASIA.equals(mapPlayed)) {

				cities = AsiaConstants.createCitiesEasyAsia(roundsToPlay);
				initGeoPoint = new GeoPoint(GameConstants.PLAYMAP_ASIA_INIT_LAT, GameConstants.PLAYMAP_ASIA_INIT_LON);

			} else if (GameConstants.PLAYMAP_OCEANIA.equals(mapPlayed)) {

				cities = OceaniaConstants.createCitiesEasyOceania(roundsToPlay);
				initGeoPoint = new GeoPoint(GameConstants.PLAYMAP_OCEANIA_INIT_LAT, GameConstants.PLAYMAP_OCEANIA_INIT_LON);

			} else if (GameConstants.PLAYMAP_US_STATES.equals(mapPlayed)) {

				cities = USAConstants.createCitiesEasyUSA(roundsToPlay);
				initGeoPoint = new GeoPoint(GameConstants.PLAYMAP_US_STATES_INIT_LAT, GameConstants.PLAYMAP_US_STATES_INIT_LON);

			} else if (GameConstants.PLAYMAP_FAMOUS_PLACES.equals(mapPlayed)) {

				cities = FamousPlacesConstants.createCitiesEasyFamousPlaces(roundsToPlay);
				initGeoPoint = new GeoPoint(GameConstants.PLAYMAP_FAMOUS_PLACES_INIT_LAT, GameConstants.PLAYMAP_FAMOUS_PLACES_INIT_LON);
				zoomLevel = 4;
			}

		} else if (GameConstants.DIFFICULTY_NORMAL.equals(difficulty)) {

			if (GameConstants.PLAYMAP_WORLD.equals(mapPlayed)) {

				cities = WorldConstants.createCitiesNormalWorld(roundsToPlay);
				initGeoPoint = new GeoPoint(GameConstants.PLAYMAP_EUROPE_INIT_LAT, GameConstants.PLAYMAP_EUROPE_INIT_LON);
				zoomLevel = 4;

			} else if (GameConstants.PLAYMAP_EUROPE.equals(mapPlayed)) {

				cities = EuropeConstants.createCitiesNormalEurope(roundsToPlay);
				initGeoPoint = new GeoPoint(GameConstants.PLAYMAP_EUROPE_INIT_LAT, GameConstants.PLAYMAP_EUROPE_INIT_LON);

			} else if (GameConstants.PLAYMAP_AMERICA.equals(mapPlayed)) {

				cities = AmericaConstants.createCitiesNormalAmerica(roundsToPlay);
				initGeoPoint = new GeoPoint(GameConstants.PLAYMAP_AMERICA_INIT_LAT, GameConstants.PLAYMAP_AMERICA_INIT_LON);
				zoomLevel = 4;

			} else if (GameConstants.PLAYMAP_AFRICA.equals(mapPlayed)) {

				cities = AfricaConstants.createCitiesNormalAfrica(roundsToPlay);
				initGeoPoint = new GeoPoint(GameConstants.PLAYMAP_AFRICA_INIT_LAT, GameConstants.PLAYMAP_AFRICA_INIT_LON);
				zoomLevel = 4;

			} else if (GameConstants.PLAYMAP_ASIA.equals(mapPlayed)) {

				cities = AsiaConstants.createCitiesNormalAsia(roundsToPlay);
				initGeoPoint = new GeoPoint(GameConstants.PLAYMAP_ASIA_INIT_LAT, GameConstants.PLAYMAP_ASIA_INIT_LON);

			} else if (GameConstants.PLAYMAP_OCEANIA.equals(mapPlayed)) {

				cities = OceaniaConstants.createCitiesNormalOceania(roundsToPlay);
				initGeoPoint = new GeoPoint(GameConstants.PLAYMAP_OCEANIA_INIT_LAT, GameConstants.PLAYMAP_OCEANIA_INIT_LON);

			} else if (GameConstants.PLAYMAP_US_STATES.equals(mapPlayed)) {

				cities = USAConstants.createCitiesNormalUSA(roundsToPlay);
				initGeoPoint = new GeoPoint(GameConstants.PLAYMAP_US_STATES_INIT_LAT, GameConstants.PLAYMAP_US_STATES_INIT_LON);

			} else if (GameConstants.PLAYMAP_FAMOUS_PLACES.equals(mapPlayed)) {

				cities = FamousPlacesConstants.createCitiesNormalFamousPlaces(roundsToPlay);
				initGeoPoint = new GeoPoint(GameConstants.PLAYMAP_FAMOUS_PLACES_INIT_LAT, GameConstants.PLAYMAP_FAMOUS_PLACES_INIT_LON);
				zoomLevel = 4;

			}

		} else if (GameConstants.DIFFICULTY_HARD.equals(difficulty)) {

			if (GameConstants.PLAYMAP_WORLD.equals(mapPlayed)) {

				cities = WorldConstants.createCitiesHardWorld(roundsToPlay);
				initGeoPoint = new GeoPoint(GameConstants.PLAYMAP_EUROPE_INIT_LAT, GameConstants.PLAYMAP_EUROPE_INIT_LON);
				zoomLevel = 4;

			} else if (GameConstants.PLAYMAP_EUROPE.equals(mapPlayed)) {

				cities = EuropeConstants.createCitiesHardEurope(roundsToPlay);
				initGeoPoint = new GeoPoint(GameConstants.PLAYMAP_EUROPE_INIT_LAT, GameConstants.PLAYMAP_EUROPE_INIT_LON);

			} else if (GameConstants.PLAYMAP_AMERICA.equals(mapPlayed)) {

				cities = AmericaConstants.createCitiesHardAmerica(roundsToPlay);
				initGeoPoint = new GeoPoint(GameConstants.PLAYMAP_AMERICA_INIT_LAT, GameConstants.PLAYMAP_AMERICA_INIT_LON);
				zoomLevel = 4;

			} else if (GameConstants.PLAYMAP_AFRICA.equals(mapPlayed)) {

				cities = AfricaConstants.createCitiesHardAfrica(roundsToPlay);
				initGeoPoint = new GeoPoint(GameConstants.PLAYMAP_AFRICA_INIT_LAT, GameConstants.PLAYMAP_AFRICA_INIT_LON);
				zoomLevel = 4;

			} else if (GameConstants.PLAYMAP_ASIA.equals(mapPlayed)) {

				cities = AsiaConstants.createCitiesHardAsia(roundsToPlay);
				initGeoPoint = new GeoPoint(GameConstants.PLAYMAP_ASIA_INIT_LAT, GameConstants.PLAYMAP_ASIA_INIT_LON);

			} else if (GameConstants.PLAYMAP_OCEANIA.equals(mapPlayed)) {

				cities = OceaniaConstants.createCitiesHardOceania(roundsToPlay);
				initGeoPoint = new GeoPoint(GameConstants.PLAYMAP_OCEANIA_INIT_LAT, GameConstants.PLAYMAP_OCEANIA_INIT_LON);

			} else if (GameConstants.PLAYMAP_US_STATES.equals(mapPlayed)) {

				cities = USAConstants.createCitiesHardUSA(roundsToPlay);
				initGeoPoint = new GeoPoint(GameConstants.PLAYMAP_US_STATES_INIT_LAT, GameConstants.PLAYMAP_US_STATES_INIT_LON);

			} else if (GameConstants.PLAYMAP_FAMOUS_PLACES.equals(mapPlayed)) {

				cities = FamousPlacesConstants.createCitiesHardFamousPlaces(roundsToPlay);
				initGeoPoint = new GeoPoint(GameConstants.PLAYMAP_FAMOUS_PLACES_INIT_LAT, GameConstants.PLAYMAP_FAMOUS_PLACES_INIT_LON);
				zoomLevel = 4;

			}

		}

	}

	public boolean isSatelliteMap() {

		if ("Satellite".equals(mapType)) {
			return true;
		} else {
			return false;
		}

	}

	public String getDistanceUnit() {

		return distanceUnits;
	}

	public String getDifficulty() {
		return difficulty;
	}

	public void setDifficulty(String difficulty) {
		this.difficulty = difficulty;
	}

	public void playNewCity() {

		if (round > 0) {
			this.initGeoPoint = new GeoPoint((int) (getPlayedCity().getLat() * 1E6), (int) (getPlayedCity().getLng() * 1E6));
		}
		setPlayedCity(getCities().get(round));
		round++;

	}

	public List<City> getCities() {
		return cities;
	}

	public void setCities(List<City> cities) {
		this.cities = cities;
	}

	public String getMapPlayed() {
		return mapPlayed;
	}

	public void setMapPlayed(String mapPlayed) {
		this.mapPlayed = mapPlayed;
	}

	public GeoPoint getPlayedCityGeoPoint() {
		GeoPoint location = new GeoPoint((int) (getPlayedCity().getLat() * 1E6), (int) (getPlayedCity().getLng() * 1E6));

		return location;
	}

	public City getPlayedCity() {
		return playedCity;
	}

	public void setPlayedCity(City playedCity) {
		this.playedCity = playedCity;
	}

	public int getDistance() {
		return distance;
	}

	public void setDistance(int distance) {
		this.distance = distance;
	}

	public int getDistanceTotal() {
		return distanceTotal;
	}

	public void setDistanceTotal(int distanceTotal) {
		this.distanceTotal = distanceTotal;
	}

	public int getRound() {
		return round;
	}

	public void setRound(int round) {
		this.round = round;
	}

	public GeoPoint getInitGeoPoint() {
		return initGeoPoint;
	}

	public void setInitGeoPoint(GeoPoint initGeoPoint) {
		this.initGeoPoint = initGeoPoint;
	}

	public int getZoomLevel() {
		return zoomLevel;
	}

	public void setZoomLevel(int zoomLevel) {
		this.zoomLevel = zoomLevel;
	}

}
