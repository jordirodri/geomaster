package com.sillynamedvars.geomaster.model;

public class City {

	private String name;
	private String country;
	private String continent;
	private double lat;
	private double lng;
	private boolean isCapital;
	private boolean isEasy;
	private boolean isNormal;
	private boolean isHard;
	private boolean isDisabled;
	private String flagImage;
	private String distancePlayed;

	public City(String name, double lng, double lat) {
		this.name = name;
		this.lng = lng;
		this.lat = lat;

	}

	public City(String name, String country, String continent, double lat, double lng, boolean isCapital, boolean isEasy, boolean isNormal, boolean isHard) {

		this(name, country, continent, lat, lng, isCapital, isEasy, isNormal, isHard, false, null);
	}

	public City(String name, String country, String continent, double lat, double lng, boolean isCapital, boolean isEasy, boolean isNormal, boolean isHard, boolean isDisabled) {

		this(name, country, continent, lat, lng, isCapital, isEasy, isNormal, isHard, isDisabled, null);
	}

	public City(String name, String country, String continent, double lat, double lng, boolean isCapital, boolean isEasy, boolean isNormal, boolean isHard, boolean isDisabled, String flagImage) {
		this.name = name;
		this.lng = lng;
		this.lat = lat;
		this.country = country;
		this.continent = continent;
		this.isCapital = isCapital;
		this.isEasy = isEasy;
		this.isNormal = isNormal;
		this.isHard = isHard;
		this.isDisabled = isDisabled;
		this.flagImage = flagImage;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getContinent() {
		return continent;
	}

	public void setContinent(String continent) {
		this.continent = continent;
	}

	public boolean isCapital() {
		return isCapital;
	}

	public void setCapital(boolean isCapital) {
		this.isCapital = isCapital;
	}

	public boolean isEasy() {
		return isEasy;
	}

	public void setEasy(boolean isEasy) {
		this.isEasy = isEasy;
	}

	public boolean isNormal() {
		return isNormal;
	}

	public void setNormal(boolean isNormal) {
		this.isNormal = isNormal;
	}

	public boolean isHard() {
		return isHard;
	}

	public void setHard(boolean isHard) {
		this.isHard = isHard;
	}

	public boolean isDisabled() {
		return isDisabled;
	}

	public void setDisabled(boolean isDisabled) {
		this.isDisabled = isDisabled;
	}

	public double getLat() {
		return lat;
	}

	public void setLat(double lat) {
		this.lat = lat;
	}

	public double getLng() {
		return lng;
	}

	public void setLng(double lng) {
		this.lng = lng;
	}

	
	
	public String getDistancePlayed() {
		return distancePlayed;
	}

	public void setDistancePlayed(String distancePlayed) {
		this.distancePlayed = distancePlayed;
	}

	public String getFlagImage() {

		if (flagImage != null) {
			return flagImage;

		} else if ("US States".equals(continent)) {
			return country + "-Flag-48.png";
		} else if ("Asia".equals(continent)) {
			return "50px-Flag_of_" + country + ".svg.png";
		} else {
			return "";
		}

	}

	public void setFlagImage(String flagImage) {
		this.flagImage = flagImage;
	}

	@Override
	public String toString() {
		return this.name + " (" + this.country + ")";
	}

	@Override
	public boolean equals(Object o) {

		if (this == o) {

			return true;

		} else if (o instanceof City) {

			City otherCity = (City) o;

			if (otherCity.getName().equals(this.getName()) && otherCity.getCountry().equals(this.getCountry())) {
				return true;
			} else {
				return false;
			}

		} else {
			return false;
		}

	}
	
	

}
