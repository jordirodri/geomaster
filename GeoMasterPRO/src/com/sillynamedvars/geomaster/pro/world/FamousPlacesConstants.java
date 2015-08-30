package com.sillynamedvars.geomaster.pro.world;

import java.util.ArrayList;
import java.util.List;

import com.sillynamedvars.geomaster.pro.model.City;
import com.sillynamedvars.geomaster.pro.util.ApplicationUtils;

public abstract class FamousPlacesConstants {

	public static List<City> createCitiesEasyFamousPlaces(int roundsToPlay) {

		List<City> cities = createFamousPlaces();
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

	public static List<City> createCitiesNormalFamousPlaces(int roundsToPlay) {

		List<City> cities = createFamousPlaces();
		List<City> citiesNormal = new ArrayList<City>();

		for (City normalCity : cities) {
			if (normalCity.isEasy() || normalCity.isNormal()) {
				citiesNormal.add(normalCity);

			}
		}

		List<City> citiesPlayed = ApplicationUtils.randomizeCities(citiesNormal, roundsToPlay);

		return citiesPlayed;

	}

	public static List<City> createCitiesHardFamousPlaces(int roundsToPlay) {

		List<City> cities = createFamousPlaces();
		List<City> citiesHard = new ArrayList<City>();

		// for (City hardCity : cities) {
		// if (hardCity.isHard() || hardCity.isNormal()) {
		// citiesHard.add(hardCity);
		//
		// }
		// }
		citiesHard = cities;
		List<City> citiesPlayed = ApplicationUtils.randomizeCities(citiesHard, roundsToPlay);

		return citiesPlayed;

	}

	public static List<City> createFamousPlaces() {

		List<City> lstCities = new ArrayList<City>();

		lstCities.add(new City("Giza Pyramid", "Egypt", "Africa", 29.975278, 31.137778, false, true, false, false, false, "50px-Flag_of_Egypt.svg.png"));
		lstCities.add(new City("Taj Mahal", "India", "Asia", 27.174167, 78.042222, false, true, false, false, false, "50px-Flag_of_India.svg.png"));
		lstCities.add(new City("Stonehenge", "United Kingdom", "Europe", 51.178844, -1.826189, false, true, false, false, false, "50px-Flag_of_the_United_Kingdom.svg.png"));
		lstCities.add(new City("Angkor", "Cambodia", "Asia", 13.433333, 103.833333, false, false, false, true, false, "50px-Flag_of_Cambodia.svg.png"));
		lstCities.add(new City("Acropolis of Athens", "Greece", "Europe", 37.971421, 23.726166, false, true, false, false, false, "50px-Flag_of_Greece.svg.png"));
		lstCities.add(new City("Colosseum", "Italy", "Europe", 41.890169, 12.492269, false, true, false, false, false, "50px-Flag_of_Italy.svg.png"));
		lstCities.add(new City("Potala Palace", "Nepal", "Asia", 29.657778, 91.116944, false, false, false, true, false, "35px-Flag_of_Nepal.svg.png"));
		lstCities.add(new City("Statue of Liberty", "United States of America", "America", 40.689167, -74.044444, false, true, false, false, false, "50px-Flag_of_the_United_States.svg.png"));
		lstCities.add(new City("Eiffel Tower", "France", "Europe", 48.8583, 2.2945, false, true, false, false, false, "50px-Flag_of_France.svg.png"));
		lstCities.add(new City("Palace of Westminster", "United Kingdom", "Europe", 51.499167, -0.124722, false, false, true, false, false, "50px-Flag_of_the_United_Kingdom.svg.png"));
		lstCities.add(new City("Empire State Building", "United States of America", "America", 40.748433, -73.985656, false, true, false, false, false, "50px-Flag_of_the_United_States.svg.png"));
		lstCities.add(new City("Forbidden City", "China", "Asia", 39.914722, 116.390556, false, true, false, false, false, "50px-Flag_of_the_People's_Republic_of_China.svg.png"));
		lstCities.add(new City("Sydney Opera House", "Australia", "Oceania", -33.856944, 151.215278, false, false, true, false, false, "50px-Flag_of_Australia.svg.png"));
		lstCities.add(new City("Leaning Tower of Pisa", "Italy", "Europe", 43.723333, 10.394167, false, true, false, false, false, "50px-Flag_of_Italy.svg.png"));
		lstCities.add(new City("Shwedagon Pagoda", "Myanmar", "Asia", 16.798436, 96.149464, false, false, false, true, false, "50px-Flag_of_Myanmar.svg.png"));
		lstCities.add(new City("Cologne Cathedral", "Germany", "Europe", 50.9413, 6.958, false, false, false, true, false, "50px-Flag_of_Germany.svg.png"));
		lstCities.add(new City("Brandenburg Gate", "Germany", "Europe", 52.516272, 13.377722, false, false, true, false, false, "50px-Flag_of_Germany.svg.png"));
		lstCities.add(new City("Luxor", "Egypt", "Africa", 25.683333, 32.65, false, true, false, false, false, "50px-Flag_of_Egypt.svg.png"));
		lstCities.add(new City("Chichen Itza", "Mexico", "America", 20.6829, -88.56865, false, false, true, false, false, "50px-Flag_of_Mexico.svg.png"));
		lstCities.add(new City("Hagia Sophia", "Turkey", "Europe", 41.008611, 28.98, false, false, false, true, false, "50px-Flag_of_Turkey.svg.png"));
		lstCities.add(new City("Temple Mount", "Israel", "Asia", 31.777972, 35.235806, false, false, false, true, false, "50px-Flag_of_Israel.svg.png"));
		lstCities.add(new City("Basilica of Saint Peter", "Vatican City", "Europe", 41.902222, 12.453333, false, true, false, false, false, "40px-Flag_of_the_Vatican_City.svg.png"));
		lstCities.add(new City("Moscow Kremlin", "Russia", "Europe", 55.751667, 37.617778, false, true, false, false, false, "50px-Flag_of_Russia.svg.png"));
		lstCities.add(new City("The White House  ", "United States of America", "America", 38.89767, -77.03655, false, true, false, false, false, "50px-Flag_of_the_United_States.svg.png"));
		lstCities.add(new City("Palace of Versailles ", "France", "Europe", 48.804404, 2.123162, false, true, false, false, false, "50px-Flag_of_France.svg.png"));
		lstCities.add(new City("Schonbrunn Palace", "Austria", "Europe", 48.184516, 16.311865, false, false, false, true, false, "50px-Flag_of_Austria.svg.png"));
		lstCities.add(new City("Mount Fuji", "Japan", "Asia", 35.358, 138.731, false, true, false, false, false, "50px-Flag_of_Japan.svg.png"));
		lstCities.add(new City("Mount Everest ", "Nepal", "Asia", 27.988056, 86.925278, false, true, false, false, false, "35px-Flag_of_Nepal.svg.png"));
		lstCities.add(new City("Kilimanjaro ", "Tanzania", "Africa", -3.075833, 37.353333, false, true, false, false, false, "50px-Flag_of_Tanzania.svg.png"));
		lstCities.add(new City("Mount Vesuvius", "Italy", "Europe", 40.816667, 14.433333, false, false, true, false, false, "50px-Flag_of_Italy.svg.png"));
		lstCities.add(new City("Mount Olympus", "Greece", "Europe", 40.085556, 22.358611, false, false, true, false, false, "50px-Flag_of_Greece.svg.png"));
		lstCities.add(new City("Ayers Rock (Uluru)", "Australia", "Oceania", -25.345, 131.036111, false, false, false, true, false, "50px-Flag_of_Australia.svg.png"));
		lstCities.add(new City("Mount Ararat", "Turkey", "Europe", 39.701883, 44.298317, false, false, false, true, false, "50px-Flag_of_Turkey.svg.png"));
		lstCities.add(new City("Mount Kailash", "Nepal", "Asia", 31.066667, 81.3125, false, false, false, true, false, "35px-Flag_of_Nepal.svg.png"));
		lstCities.add(new City("Machu Picchu", "Peru", "America", -13.163056, -72.545556, false, true, false, false, false, "50px-Flag_of_Peru.svg.png"));
		lstCities.add(new City("Sagrada Familia", "Spain", "Europe", 41.403611, 2.174444, false, false, true, false, false, "50px-Flag_of_Spain.svg.png"));

		return lstCities;

	}
}
