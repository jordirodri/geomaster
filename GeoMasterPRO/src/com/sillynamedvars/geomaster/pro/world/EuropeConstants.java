package com.sillynamedvars.geomaster.pro.world;

import java.util.ArrayList;
import java.util.List;

import com.sillynamedvars.geomaster.pro.model.City;
import com.sillynamedvars.geomaster.pro.util.ApplicationUtils;

public abstract class EuropeConstants {

	public static List<City> createCitiesEasyEurope(int roundsToPlay) {

		List<City> cities = createCitiesEurope();
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

		List<City> citiesPlayed = ApplicationUtils.randomizeCities(citiesEasy, roundsToPlay);

		return citiesPlayed;

	}

	public static List<City> createCitiesNormalEurope(int roundsToPlay) {

		List<City> cities = createCitiesEurope();
		List<City> citiesNormal = new ArrayList<City>();

		for (City normalCity : cities) {
			if (normalCity.isEasy() || normalCity.isNormal()) {
				citiesNormal.add(normalCity);

			}
		}

		List<City> citiesPlayed = ApplicationUtils.randomizeCities(citiesNormal, roundsToPlay);

		return citiesPlayed;

	}

	public static List<City> createCitiesHardEurope(int roundsToPlay) {

		List<City> cities = createCitiesEurope();
		List<City> citiesHard = new ArrayList<City>();

		// int counter = 0;
		// for (City hardCity : cities) {
		// if (hardCity.isCapital() && (hardCity.isHard() ||
		// hardCity.isNormal())) {
		// citiesHard.add(hardCity);
		//
		// }else if (hardCity.isHard() && counter<=20) {
		// citiesHard.add(hardCity);
		// counter++;
		// }
		// }

		citiesHard = cities;
		List<City> citiesPlayed = ApplicationUtils.randomizeCities(citiesHard, roundsToPlay);

		return citiesPlayed;

	}

	public static List<City> createCitiesEurope() {

		List<City> lstCities = new ArrayList<City>();

		lstCities.add(new City("Mariehamn", "Aland Islands", "Europe", 60.116667, 19.9, true, false, true, false, false, "50px-Flag_of_Aland.svg.png"));
		lstCities.add(new City("Tirana", "Albania", "Europe", 41.33, 19.82, true, true, false, false, false, "50px-Flag_of_Albania.svg.png"));
		lstCities.add(new City("Andorra la Vella", "Andorra", "Europe", 42.5, 1.5, true, false, true, false, false, "50px-Flag_of_Andorra.svg.png"));
		lstCities.add(new City("Vienna", "Austria", "Europe", 48.22, 16.37, true, true, false, false, false, "50px-Flag_of_Austria.svg.png"));
		lstCities.add(new City("Minsk", "Belarus", "Europe", 53.91, 27.55, true, false, true, false, false, "50px-Flag_of_Belarus.svg.png"));
		lstCities.add(new City("Brussels", "Belgium", "Europe", 50.83, 4.33, true, true, false, false, false, "50px-Flag_of_Belgium.svg.png"));
		lstCities.add(new City("Sarajevo", "Bosnia and Herzegovina", "Europe", 43.8476, 18.3564, true, false, true, false, false, "50px-Flag_of_Bosnia_and_Herzegovina.svg.png"));
		lstCities.add(new City("Sofia", "Bulgaria", "Europe", 42.69, 23.31, true, true, false, false, false, "50px-Flag_of_Bulgaria.svg.png"));
		lstCities.add(new City("Zagreb", "Croatia", "Europe", 45.8, 15.97, true, false, true, false, false, "50px-Flag_of_Croatia.svg.png"));
		lstCities.add(new City("Prague", "Czech Republic", "Europe", 50.08, 14.43, true, true, false, false, false, "50px-Flag_of_the_Czech_Republic.svg.png"));
		lstCities.add(new City("Copenhagen", "Denmark", "Europe", 55.676111, 12.568333, true, true, false, false, false, "50px-Flag_of_Denmark.svg.png"));
		lstCities.add(new City("Tallinn", "Estonia", "Europe", 59.437222, 24.745278, true, false, false, true, false, "50px-Flag_of_Estonia.svg.png"));
		lstCities.add(new City("Torshavn", "Faroe Islands", "Europe", 62.011667, -6.7675, true, false, false, true, false, "50px-Flag_of_the_Faroe_Islands.svg.png"));
		lstCities.add(new City("Helsinki", "Finland", "Europe", 60.17, 24.94, true, true, false, false, false, "50px-Flag_of_Finland.svg.png"));
		lstCities.add(new City("Paris", "France", "Europe", 48.86, 2.34, true, true, false, false, false, "50px-Flag_of_France.svg.png"));
		lstCities.add(new City("Marseille", "France", "Europe", 43.31, 5.37, false, true, false, false, false, "50px-Flag_of_France.svg.png"));
		lstCities.add(new City("Berlin", "Germany", "Europe", 52.52, 13.38, true, true, false, false, false, "50px-Flag_of_Germany.svg.png"));
		lstCities.add(new City("Hamburg", "Germany", "Europe", 53.55, 10, false, true, false, false, false, "50px-Flag_of_Germany.svg.png"));
		lstCities.add(new City("Munich", "Germany", "Europe", 48.14, 11.58, false, true, false, false, false, "50px-Flag_of_Germany.svg.png"));
		lstCities.add(new City("Cologne", "Germany", "Europe", 50.95, 6.97, false, false, true, false, false, "50px-Flag_of_Germany.svg.png"));
		lstCities.add(new City("Frankfurt", "Germany", "Europe", 50.12, 8.68, false, true, false, false, false, "50px-Flag_of_Germany.svg.png"));
		lstCities.add(new City("Stuttgart", "Germany", "Europe", 48.79, 9.19, false, true, false, false, false, "50px-Flag_of_Germany.svg.png"));
		lstCities.add(new City("Düsseldorf", "Germany", "Europe", 51.24, 6.79, false, false, true, false, false, "50px-Flag_of_Germany.svg.png"));
		lstCities.add(new City("Dortmund", "Germany", "Europe", 51.51, 7.48, false, false, true, false, false, "50px-Flag_of_Germany.svg.png"));
		lstCities.add(new City("Essen", "Germany", "Europe", 51.47, 7, false, false, false, true, false, "50px-Flag_of_Germany.svg.png"));
		lstCities.add(new City("Bremen", "Germany", "Europe", 53.08, 8.81, false, false, true, false, false, "50px-Flag_of_Germany.svg.png"));
		lstCities.add(new City("Hanover", "Germany", "Europe", 52.4, 9.73, false, true, false, false, false, "50px-Flag_of_Germany.svg.png"));
		lstCities.add(new City("Leipzig", "Germany", "Europe", 51.35, 12.4, false, false, false, true, false, "50px-Flag_of_Germany.svg.png"));
		lstCities.add(new City("Dresden", "Germany", "Europe", 51.05, 13.74, false, false, false, true, false, "50px-Flag_of_Germany.svg.png"));
		lstCities.add(new City("Nuremberg", "Germany", "Europe", 49.45, 11.05, false, false, false, true, false, "50px-Flag_of_Germany.svg.png"));
		lstCities.add(new City("Gibraltar", "Gibraltar", "Europe", 36.133333, -5.35, false, false, true, false, false, "50px-Flag_of_Gibraltar.svg.png"));
		lstCities.add(new City("Athens", "Greece", "Europe", 37.98, 23.73, true, true, false, false, false, "50px-Flag_of_Greece.svg.png"));
		lstCities.add(new City("Saint Peter Port", "Guernsey", "Europe", 49.45, -2.533333, true, false, false, true, false, "50px-Flag_of_Guernsey.svg.png"));
		lstCities.add(new City("Budapest", "Hungary", "Europe", 47.51, 19.08, true, true, false, false, false, "50px-Flag_of_Hungary.svg.png"));
		lstCities.add(new City("Reykjavik", "Iceland", "Europe", 64.133333, -21.933333, true, true, false, false, false, "50px-Flag_of_Iceland.svg.png"));
		lstCities.add(new City("Dublin", "Ireland", "Europe", 53.33, -6.25, true, true, false, false, false, "50px-Flag_of_Ireland.svg.png"));
		lstCities.add(new City("Douglas", "Isle of Man", "Europe", 54.14521, -4.48172, false, false, false, true, false, "50px-Flag_of_the_Isle_of_Man.svg.png"));
		lstCities.add(new City("Rome", "Italy", "Europe", 41.89, 12.5, true, true, false, false, false, "50px-Flag_of_Italy.svg.png"));
		lstCities.add(new City("Milan", "Italy", "Europe", 45.48, 9.19, false, true, false, false, false, "50px-Flag_of_Italy.svg.png"));
		lstCities.add(new City("Naples", "Italy", "Europe", 40.85, 14.27, false, false, true, false, false, "50px-Flag_of_Italy.svg.png"));
		lstCities.add(new City("Turin", "Italy", "Europe", 45.08, 7.68, false, false, true, false, false, "50px-Flag_of_Italy.svg.png"));
		lstCities.add(new City("Palermo", "Italy", "Europe", 38.12, 13.36, false, false, true, false, false, "50px-Flag_of_Italy.svg.png"));
		lstCities.add(new City("Genoa", "Italy", "Europe", 44.42, 8.93, false, false, true, false, false, "50px-Flag_of_Italy.svg.png"));
		lstCities.add(new City("Saint Helier", "Jersey", "Europe", 49.187, -2.107, true, false, false, true, false, "50px-Flag_of_Jersey.svg.png"));
		lstCities.add(new City("Pristina", "Kosovo", "Europe", 42.666667, 21.166667, true, false, false, true, false, "50px-Flag_of_Kosovo.svg.png"));
		lstCities.add(new City("Riga", "Latvia", "Europe", 56.97, 24.13, true, false, false, true, false, "50px-Flag_of_Latvia.svg.png"));
		lstCities.add(new City("Vaduz", "Liechtenstein", "Europe", 47.141, 9.521, true, true, false, false, false, "50px-Flag_of_Liechtenstein.svg.png"));
		lstCities.add(new City("Vilnius", "Lithuania", "Europe", 54.7, 25.27, true, false, false, true, false, "50px-Flag_of_Lithuania.svg.png"));
		lstCities.add(new City("Luxembourg", "Luxembourg", "Europe", 49.611667, 6.13, true, true, false, false, false, "50px-Flag_of_Luxembourg.svg.png"));
		lstCities.add(new City("Skopje", "Macedonia", "Europe", 42, 21.433333, true, false, true, false, false, "50px-Flag_of_Macedonia.svg.png"));
		lstCities.add(new City("Valletta", "Malta", "Europe", 35.897778, 14.5125, true, false, true, false, false, "50px-Flag_of_Malta.svg.png"));
		lstCities.add(new City("Chisinau", "Moldova", "Europe", 47.03, 28.83, true, false, true, false, false, "50px-Flag_of_Moldova.svg.png"));
		lstCities.add(new City("Monaco", "Monaco", "Europe", 43.732778, 7.419722, true, true, false, false, false, "40px-Flag_of_Monaco.svg.png"));
		lstCities.add(new City("Podgorica", "Montenegro", "Europe", 42.466667, 19.266667, true, false, true, false, false, "50px-Flag_of_Montenegro.svg.png"));
		lstCities.add(new City("Amsterdam", "Netherlands", "Europe", 52.37, 4.89, true, true, false, false, false, "50px-Flag_of_the_Netherlands.svg.png"));
		lstCities.add(new City("Rotterdam", "Netherlands", "Europe", 51.93, 4.48, false, false, true, false, false, "50px-Flag_of_the_Netherlands.svg.png"));
		lstCities.add(new City("Oslo", "Norway", "Europe", 59.91, 10.75, true, true, false, false, false, "50px-Flag_of_Norway.svg.png"));
		lstCities.add(new City("Warsaw", "Poland", "Europe", 52.26, 21.02, true, true, false, false, false, "50px-Flag_of_Poland.svg.png"));
		lstCities.add(new City("Cracow", "Poland", "Europe", 50.06, 19.96, false, true, false, false, false, "50px-Flag_of_Poland.svg.png"));
		lstCities.add(new City("Lódz", "Poland", "Europe", 51.77, 19.46, false, false, false, true, false, "50px-Flag_of_Poland.svg.png"));
		lstCities.add(new City("Wroclaw", "Poland", "Europe", 51.11, 17.03, false, false, false, true, false, "50px-Flag_of_Poland.svg.png"));
		lstCities.add(new City("Poznan", "Poland", "Europe", 52.4, 16.9, false, false, false, true, false, "50px-Flag_of_Poland.svg.png"));
		lstCities.add(new City("Lisbon", "Portugal", "Europe", 38.713811, -9.139386, true, true, false, false, false, "50px-Flag_of_Portugal.svg.png"));
		lstCities.add(new City("Bucharest", "Romania", "Europe", 44.44, 26.1, true, true, false, false, false, "50px-Flag_of_Romania.svg.png"));
		lstCities.add(new City("Moscow", "Russia", "Europe", 55.75, 37.62, true, true, false, false, false, "50px-Flag_of_Russia.svg.png"));
		lstCities.add(new City("Saint Petersburg", "Russia", "Europe", 59.93, 30.32, false, true, false, false, false, "50px-Flag_of_Russia.svg.png"));
		// lstCities.add(new City("Novosibirsk", "Russia", "Europe", 55.04,
		// 82.93, false, false, true, false, false,
		// "50px-Flag_of_Russia.svg.png"));
		//
		// lstCities.add(new City("Yekaterinburg", "Russia", "Europe", 56.85,
		// 60.6, false, false, true, false, false,
		// lstCities.add(new City("NizhniyNovgorod", "Russia", "Europe", 56.33,
		// 44, false, false, true, false, false,
		// lstCities.add(new City("Omsk", "Russia", "Europe", 55, 73.4, false,
		// false, true, false, false, "50px-Flag_of_Russia.svg.png"));
		// lstCities.add(new City("Kazan", "Russia", "Europe", 55.75, 49.13,
		// false, false, true, false, false, "50px-Flag_of_Russia.svg.png"));
		// lstCities.add(new City("Samara", "Russia", "Europe", 53.2, 50.15,
		// lstCities.add(new City("Chelyabinsk", "Russia", "Europe", 55.15,
		// 61.43, false, false, true, false, false,
		// lstCities.add(new City("Rostov-na-Donu", "Russia", "Europe", 47.24,
		// 39.71, false, false, true, false, false,
		// lstCities.add(new City("Ufa", "Russia", "Europe", 54.78, 56.04,
		// lstCities.add(new City("Perm", "Russia", "Europe", 58, 56.25, false,
		// false, false, true, false, "50px-Flag_of_Russia.svg.png"));
		// lstCities.add(new City("Volgograd", "Russia", "Europe", 48.71, 44.48,
		// false, false, false, true, false, "50px-Flag_of_Russia.svg.png"));
		// lstCities.add(new City("Krasnoyarsk", "Russia", "Europe", 56.02,
		// 93.06, false, false, false, true, false,
		// lstCities.add(new City("Voronezh", "Russia", "Europe", 51.72, 39.26,
		// lstCities.add(new City("Saratov", "Russia", "Europe", 51.57, 46.03,
		// lstCities.add(new City("Tolyatti", "Russia", "Europe", 53.48, 49.51,
		// lstCities.add(new City("Krasnodar", "Russia", "Europe", 45.03, 38.98,
		// lstCities.add(new City("Izhevsk", "Russia", "Europe", 56.85, 53.23,
		// lstCities.add(new City("Ulyanovsk", "Russia", "Europe", 54.33, 48.4,
		// lstCities.add(new City("Yaroslavl", "Russia", "Europe", 57.62, 39.87,
		// lstCities.add(new City("Barnaul", "Russia", "Europe", 53.36, 83.75,
		// lstCities.add(new City("Khabarovsk", "Russia", "Europe", 48.42,
		// 135.12, false, false, false, true, false,
		// lstCities.add(new City("Vladivostok", "Russia", "Europe", 43.13,
		// 131.9, false, false, false, true, false,
		// lstCities.add(new City("Tyumen", "Russia", "Europe", 57.15, 65.53,
		// lstCities.add(new City("Irkutsk", "Russia", "Europe", 52.33, 104.24,
		// lstCities.add(new City("Novokuznetsk", "Russia", "Europe", 53.75,
		// 87.1, false, false, false, true, false,
		// lstCities.add(new City("Orenburg", "Russia", "Europe", 51.78, 55.1,
		// lstCities.add(new City("Kemerovo", "Russia", "Europe", 55.33, 86.08,
		// lstCities.add(new City("Ryazan", "Russia", "Europe", 54.62, 39.74,
		// lstCities.add(new City("Penza", "Russia", "Europe", 53.2, 45, false,
		// lstCities.add(new City("Yarchally", "Russia", "Europe", 55.69, 52.32,
		// lstCities.add(new City("Lipetsk", "Russia", "Europe", 52.62, 39.62,
		lstCities.add(new City("San Marino", "SanMarino", "Europe", 43.9346, 12.4473, true, true, false, false, false, "50px-Flag_of_San_Marino.svg.png"));
		lstCities.add(new City("Belgrade", "Serbia", "Europe", 44.83, 20.5, true, false, false, false, false, "50px-Flag_of_Serbia.svg.png"));
		lstCities.add(new City("Bratislava", "Slovakia", "Europe", 48.143889, 17.109722, true, true, false, false, false, "50px-Flag_of_Slovakia.svg.png"));
		lstCities.add(new City("Ljubljana", "Slovenia", "Europe", 46.055556, 14.508333, true, false, false, false, false, "50px-Flag_of_Slovenia.svg.png"));
		lstCities.add(new City("Madrid", "Spain", "Europe", 40.42, -3.71, true, true, false, false, false, "50px-Flag_of_Spain.svg.png"));
		lstCities.add(new City("Barcelona", "Spain", "Europe", 41.4, 2.17, false, true, false, false, false, "50px-Flag_of_Spain.svg.png"));
		lstCities.add(new City("Valencia", "Spain", "Europe", 39.48, -0.39, false, true, false, false, false, "50px-Flag_of_Spain.svg.png"));
		lstCities.add(new City("Sevilla", "Spain", "Europe", 37.4, -5.98, false, true, false, false, false, "50px-Flag_of_Spain.svg.png"));
		lstCities.add(new City("Zaragoza", "Spain", "Europe", 41.65, -0.89, false, false, true, false, false, "50px-Flag_of_Spain.svg.png"));
		lstCities.add(new City("Málaga", "Spain", "Europe", 36.72, -4.42, false, false, true, false, false, "50px-Flag_of_Spain.svg.png"));
		// lstCities.add(new City("Longyearbyen", "Svalbard", "Europe", 78.22,
		// 15.65, true, false, false, true, false,
		// "50px-Flag_of_Norway.svg.png"));
		lstCities.add(new City("Stockholm", "Sweden", "Europe", 59.33, 18.07, true, true, false, false, false, "50px-Flag_of_Sweden.svg.png"));
		lstCities.add(new City("Goteborg", "Sweden", "Europe", 57.72, 12.01, false, true, false, false, false, "50px-Flag_of_Sweden.svg.png"));
		lstCities.add(new City("Bern", "Switzerland", "Europe", 46.95, 7.45, true, true, false, false, false, "40px-Flag_of_Switzerland.svg.png"));
		lstCities.add(new City("Tiraspol", "Transnistria", "Europe", 46.85, 29.633333, true, false, false, true, false, "50px-Flag_of_Transnistria.svg.png"));
		lstCities.add(new City("Kiev", "Ukraine", "Europe", 50.43, 30.52, true, true, false, false, false, "50px-Flag_of_Ukraine.svg.png"));
		// lstCities.add(new City("Kharkiv", "Ukraine", "Europe", 49.98, 36.22,
		// false, false, false, true, false, "50px-Flag_of_Ukraine.svg.png"));
		// lstCities.add(new City("Dnipropetrovs'k", "Ukraine", "Europe", 48.45,
		// 34.98, false, false, false, true, false,
		// "50px-Flag_of_Ukraine.svg.png"));
		lstCities.add(new City("Odesa", "Ukraine", "Europe", 46.47, 30.73, false, false, true, false, false, "50px-Flag_of_Ukraine.svg.png"));
		lstCities.add(new City("Donetsk", "Ukraine", "Europe", 48, 37.82, false, false, true, false, false, "50px-Flag_of_Ukraine.svg.png"));
		// lstCities.add(new City("Zaporizhzhya", "Ukraine", "Europe", 47.85,
		// 35.17, false, false, false, true, false,
		// lstCities.add(new City("Lviv", "Ukraine", "Europe", 49.83, 24, false,
		// false, false, true, false, "50px-Flag_of_Ukraine.svg.png"));
		// lstCities.add(new City("KryvyyRih", "Ukraine", "Europe", 47.92,
		// 33.35, false, false, false, true, false,
		// lstCities.add(new City("Mykolayiv", "Ukraine", "Europe", 46.97, 32,
		lstCities.add(new City("London", "United Kingdom", "Europe", 51.52, -0.1, true, true, false, false, false, "50px-Flag_of_the_United_Kingdom.svg.png"));
		lstCities.add(new City("Birmingham", "United Kingdom", "Europe", 52.48, -1.91, false, false, true, false, false, "50px-Flag_of_the_United_Kingdom.svg.png"));
		lstCities.add(new City("Glasgow", "United Kingdom", "Europe", 55.87, -4.27, false, true, false, false, false, "50px-Flag_of_the_United_Kingdom.svg.png"));
		lstCities.add(new City("Vatican City", "Vatican City", "Europe", 41.904, 12.453, true, true, false, false, false, "40px-Flag_of_the_Vatican_City.svg.png"));

		return lstCities;
	}

}
