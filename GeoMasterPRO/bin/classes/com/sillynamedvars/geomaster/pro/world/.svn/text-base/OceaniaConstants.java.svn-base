package com.sillynamedvars.geomaster.pro.world;

import java.util.ArrayList;
import java.util.List;

import com.sillynamedvars.geomaster.pro.model.City;
import com.sillynamedvars.geomaster.pro.util.ApplicationUtils;


public abstract class OceaniaConstants {

	public static List<City> createCitiesMoreEasyOceania(int roundsToPlay) {

		List<City> cities = createCitiesOceania();
		List<City> citiesEasy = new ArrayList<City>();

		for (City easyCity : cities) {
			if (easyCity.isEasy()) {
				citiesEasy.add(easyCity);
			}
		}

		return citiesEasy;
	}

	public static List<City> createCitiesMoreNormalOceania(int roundsToPlay) {

		List<City> cities = createCitiesOceania();
		List<City> citiesNormal = new ArrayList<City>();

		for (City normalCity : cities) {
			if (normalCity.isEasy() || normalCity.isNormal()) {
				citiesNormal.add(normalCity);

			}
		}

		return citiesNormal;

	}

	public static List<City> createCitiesEasyOceania(int roundsToPlay) {

		List<City> cities = createCitiesOceania();
		List<City> citiesEasy = new ArrayList<City>();

		for (City easyCity : cities) {
			if (easyCity.isCapital() && easyCity.isEasy()) {
				citiesEasy.add(easyCity);
			}
		}

		boolean listExhausted = false;
		while (citiesEasy.size() < roundsToPlay && !listExhausted) {
			for (City city : cities) {
				if (!city.isCapital() && city.isEasy() && !citiesEasy.contains(city)) {
					citiesEasy.add(city);
				}
			}
			listExhausted = true;
		}

		listExhausted = false;
		while (citiesEasy.size() < roundsToPlay && !listExhausted) {
			for (City city : cities) {
				if (city.isNormal() && !citiesEasy.contains(city)) {
					citiesEasy.add(city);
				}
			}
			listExhausted = true;
		}

		listExhausted = false;
		while (citiesEasy.size() < roundsToPlay && !listExhausted) {
			for (City city : cities) {
				if (city.isHard() && !citiesEasy.contains(city)) {
					citiesEasy.add(city);
				}
			}
			listExhausted = true;
		}

		List<City> citiesPlayed = ApplicationUtils.randomizeCities(citiesEasy, roundsToPlay);

		return citiesPlayed;

	}

	public static List<City> createCitiesNormalOceania(int roundsToPlay) {

		List<City> cities = createCitiesOceania();
		List<City> citiesNormal = new ArrayList<City>();

		for (City normalCity : cities) {
			if (normalCity.isEasy() || normalCity.isNormal()) {
				citiesNormal.add(normalCity);

			}
		}

		while (citiesNormal.size() < roundsToPlay) {
			for (City city : cities) {
				if (city.isHard() && !citiesNormal.contains(city)) {
					citiesNormal.add(city);
				}
			}
		}

		List<City> citiesPlayed = ApplicationUtils.randomizeCities(citiesNormal, roundsToPlay);
		return citiesPlayed;

	}

	public static List<City> createCitiesHardOceania(int roundsToPlay) {

		List<City> cities = createCitiesOceania();
		List<City> citiesPlayed = ApplicationUtils.randomizeCities(cities, roundsToPlay);

		return citiesPlayed;

	}

	public static List<City> createCitiesOceania() {

		List<City> lstCities = new ArrayList<City>();

		lstCities.add(new City("Pago Pago", "American Samoa", "Oceania", -14.279444, -170.700556, true, false, false, true, false, "50px-Flag_of_American_Samoa.svg.png"));
		lstCities.add(new City("Adelaide", "Australia", "Oceania", -34.93, 138.6, false, false, false, true, false, "50px-Flag_of_Australia.svg.png"));
		lstCities.add(new City("Brisbane", "Australia", "Oceania", -27.46, 153.02, false, false, false, true, false, "50px-Flag_of_Australia.svg.png"));
		lstCities.add(new City("Canberra", "Australia", "Oceania", -35.308056, 149.124444, true, true, false, false, false, "50px-Flag_of_Australia.svg.png"));
		lstCities.add(new City("Gold Coast-Tweed", "Australia", "Oceania", -28.07, 153.44, false, false, false, true, false, "50px-Flag_of_Australia.svg.png"));
		lstCities.add(new City("Melbourne", "Australia", "Oceania", -37.81, 144.96, false, true, false, false, false, "50px-Flag_of_Australia.svg.png"));
		lstCities.add(new City("Perth", "Australia", "Oceania", -31.96, 115.84, false, false, false, true, false, "50px-Flag_of_Australia.svg.png"));
		lstCities.add(new City("Sydney", "Australia", "Oceania", -33.87, 151.21, false, true, false, false, false, "50px-Flag_of_Australia.svg.png"));
		lstCities.add(new City("Avarua", "Cook Islands", "Oceania", -21.2, -159.766667, true, false, false, true, false, "50px-Flag_of_the_Cook_Islands.svg.png"));
		lstCities.add(new City("Suva", "Fiji", "Oceania", -18.1416, 178.4419, true, false, false, true, false, "50px-Flag_of_Fiji.svg.png"));
		lstCities.add(new City("Papeete", "French Polynesia", "Oceania", -17.535022, -149.569594, true, false, false, true, false, "50px-Flag_of_French_Polynesia.svg.png"));
		lstCities.add(new City("Hagatña", "Guam", "Oceania", 13.483333, 144.75, true, false, false, true, false, "50px-Flag_of_Guam.svg.png"));
		lstCities.add(new City("Bandar Lampung", "Indonesia", "Oceania", -5.44, 105.27, false, false, false, true, false, "50px-Flag_of_Indonesia.svg.png"));
		lstCities.add(new City("Bandung", "Indonesia", "Oceania", -6.91, 107.6, false, false, false, true, false, "50px-Flag_of_Indonesia.svg.png"));
		lstCities.add(new City("Banjarmasin", "Indonesia", "Oceania", -3.33, 114.59, false, false, false, true, false, "50px-Flag_of_Indonesia.svg.png"));
		// lstCities.add(new City("Bekasi", "Indonesia", "Oceania", -6.22,
		// 106.97, false, false, false, true, false,
		// "50px-Flag_of_Indonesia.svg.png"));
		// lstCities.add(new City("Bogor", "Indonesia", "Oceania", -6.58,
		// 106.79, false, false, false, true, false,
		// "50px-Flag_of_Indonesia.svg.png"));
		// lstCities.add(new City("Depok", "Indonesia", "Oceania", -6.39,
		// 106.83, false, false, false, true, false,
		// "50px-Flag_of_Indonesia.svg.png"));
		// lstCities.add(new City("Jakarta", "Indonesia", "Oceania", -6.18,
		// 106.83, true, true, false, false, false,
		// "50px-Flag_of_Indonesia.svg.png"));
		// lstCities.add(new City("Makasar", "Indonesia", "Oceania", -5.14,
		// 119.41, false, false, false, true, false,
		// "50px-Flag_of_Indonesia.svg.png"));
		// lstCities.add(new City("Malang", "Indonesia", "Oceania", -7.98,
		// 112.62, false, false, false, true, false,
		// "50px-Flag_of_Indonesia.svg.png"));
		// lstCities.add(new City("Manado", "Indonesia", "Oceania", 1.5, 124.84,
		// false, false, false, true, false, "50px-Flag_of_Indonesia.svg.png"));
		// lstCities.add(new City("Medan", "Indonesia", "Oceania", 3.59, 98.67,
		// false, false, false, true, false, "50px-Flag_of_Indonesia.svg.png"));
		// lstCities.add(new City("Padang", "Indonesia", "Oceania", -0.95,
		// 100.35, false, false, false, true, false,
		// "50px-Flag_of_Indonesia.svg.png"));
		// lstCities.add(new City("Palembang", "Indonesia", "Oceania", -2.99,
		// 104.75, false, false, false, true, false,
		// "50px-Flag_of_Indonesia.svg.png"));
		// lstCities.add(new City("Pekan Baru", "Indonesia", "Oceania", 0.56,
		// 101.43, false, false, false, true, false,
		// "50px-Flag_of_Indonesia.svg.png"));
		// lstCities.add(new City("Semarang", "Indonesia", "Oceania", -6.97,
		// 110.42, false, false, false, true, false,
		// "50px-Flag_of_Indonesia.svg.png"));
		// lstCities.add(new City("Surabaya", "Indonesia", "Oceania", -7.24,
		// 112.74, false, false, false, true, false,
		// "50px-Flag_of_Indonesia.svg.png"));
		// lstCities.add(new City("Surakarta", "Indonesia", "Oceania", -7.57,
		// 110.82, false, false, false, true, false,
		// "50px-Flag_of_Indonesia.svg.png"));
		// lstCities.add(new City("Tangerang", "Indonesia", "Oceania", -6.18,
		// 106.63, false, false, false, true, false,
		// "50px-Flag_of_Indonesia.svg.png"));
		// lstCities.add(new City("Yogyakarta", "Indonesia", "Oceania", -7.78,
		// 110.37, false, false, false, true, false,
		// "50px-Flag_of_Indonesia.svg.png"));
		lstCities.add(new City("South Tarawa", "Kiribati", "Oceania", 1.325556, 172.983333, true, false, false, true, false, "50px-Flag_of_Kiribati.svg.png"));
		lstCities.add(new City("Majuro", "Marshall Islands", "Oceania", 7.066667, 171.266667, true, false, false, true, false, "50px-Flag_of_the_Marshall_Islands.svg.png"));
		lstCities.add(new City("Palikir", "Micronesia", "Oceania", 6.917778, 158.185, true, false, false, true, false, "50px-Flag_of_the_Federated_States_of_Micronesia.svg.png"));
		lstCities.add(new City("Yaren", "Nauru", "Oceania", -0.5477, 166.920867, true, false, false, true, false, "50px-Flag_of_Nauru.svg.png"));
		lstCities.add(new City("Noumea", "New Caledonia", "Oceania", -22.2758, 166.458, true, false, true, false, false, "50px-Flag_of_New_Caledonia.svg.png"));
		lstCities.add(new City("Wellington", "New Zealand", "Oceania", -41.288889, 174.777222, true, false, true, false, false, "50px-Flag_of_New_Zealand.svg.png"));
		lstCities.add(new City("Alofi", "Niue", "Oceania", -19.058873, -169.875412, true, false, false, true, false, "50px-Flag_of_Niue.svg.png"));
		lstCities.add(new City("Kingston", "Norfolk Island", "Oceania", -29.066667, 167.966667, true, false, false, true, false, "50px-Flag_of_Norfolk_Island.svg.png"));
		lstCities.add(new City("Saipan", "Northern Mariana Islands", "Oceania", 15.183333, 145.75, true, false, false, true, false, "50px-Flag_of_the_Northern_Mariana_Islands.svg.png"));
		lstCities.add(new City("Ngerulmud", "Palau", "Oceania", 7.500556, 134.624167, true, false, false, true, false, "50px-Flag_of_Palau.svg.png"));
		lstCities.add(new City("Port Moresby", "Papua New Guinea", "Oceania", -9.416667, 147.283333, true, false, true, false, false, "50px-Flag_of_Papua_New_Guinea.svg.png"));
		lstCities.add(new City("Adamstown", "Pitcairn Islands", "Oceania", -25.066667, -130.1, true, false, false, true, false, "50px-Flag_of_the_Pitcairn_Islands.svg.png"));
		lstCities.add(new City("Apia", "Samoa", "Oceania", -13.833333, -171.766667, true, false, false, true, false, "50px-Flag_of_Samoa.svg.png"));
		lstCities.add(new City("Honiara", "Solomon Islands", "Oceania", -9.466667, 159.816667, true, false, false, true, false, "50px-Flag_of_the_Solomon_Islands.svg.png"));
		lstCities.add(new City("Nukunonu", "Tokelau", "Oceania", -9.168333, -171.809722, true, false, false, true, false, "50px-Flag_of_Tokelau.svg.png"));
		lstCities.add(new City("Nuku'alofa", "Tonga", "Oceania", -21.133333, -175.2, true, false, false, true, false, "50px-Flag_of_Tonga.svg.png"));
		lstCities.add(new City("Funafuti", "Tuvalu", "Oceania", -8.516667, 179.216667, true, false, false, true, false, "50px-Flag_of_Tuvalu.svg.png"));
		lstCities.add(new City("Port Vila", "Vanuatu", "Oceania", -17.75, 168.3, true, false, false, true, false, "50px-Flag_of_Vanuatu.svg.png"));
		lstCities.add(new City("Mata-Utu", "Wallis and Futuna", "Oceania", -13.283333, -176.183333, true, false, false, true, false, "50px-Flag_of_France.svg.png"));

		return lstCities;

	}
}
