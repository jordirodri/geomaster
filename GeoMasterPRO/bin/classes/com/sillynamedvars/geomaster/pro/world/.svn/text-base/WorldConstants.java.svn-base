package com.sillynamedvars.geomaster.pro.world;

import java.util.ArrayList;
import java.util.List;

import com.sillynamedvars.geomaster.pro.model.City;
import com.sillynamedvars.geomaster.pro.util.ApplicationUtils;

public abstract class WorldConstants {

	public static List<City> createCitiesEasyWorld(int roundsToPlay) {

		List<City> citiesAfrica = AfricaConstants.createCitiesEasyAfrica(roundsToPlay);
		List<City> citiesAmerica = AmericaConstants.createCitiesEasyAmerica(roundsToPlay);
		List<City> citiesEurope = EuropeConstants.createCitiesEasyEurope(roundsToPlay);
		List<City> citiesAsia = AsiaConstants.createCitiesEasyAsia(roundsToPlay);
		List<City> citiesOceania = OceaniaConstants.createCitiesMoreEasyOceania(roundsToPlay);

		List<City> citiesEasy = new ArrayList<City>();

		while (citiesEasy.size() < roundsToPlay) {

			List<City> citiesAux = new ArrayList<City>();
			citiesAux = ApplicationUtils.randomizeCities(citiesAfrica, 1);

			if (citiesEasy.size() < roundsToPlay && !citiesEasy.contains((citiesAux).get(0))) {
				citiesEasy.add((citiesAux).get(0));
			}

			citiesAux = ApplicationUtils.randomizeCities(citiesAmerica, 1);

			if (citiesEasy.size() < roundsToPlay && !citiesEasy.contains((citiesAux).get(0))) {
				citiesEasy.add((citiesAux).get(0));
			}

			citiesAux = ApplicationUtils.randomizeCities(citiesEurope, 1);

			if (citiesEasy.size() < roundsToPlay && !citiesEasy.contains((citiesAux).get(0))) {
				citiesEasy.add((citiesAux).get(0));
			}

			citiesAux = ApplicationUtils.randomizeCities(citiesAsia, 1);

			if (citiesEasy.size() < roundsToPlay && !citiesEasy.contains((citiesAux).get(0))) {
				citiesEasy.add((citiesAux).get(0));
			}

			citiesAux = ApplicationUtils.randomizeCities(citiesOceania, 1);

			if (citiesEasy.size() < roundsToPlay && !citiesEasy.contains((citiesAux).get(0))) {
				citiesEasy.add((citiesAux).get(0));
			}

		}

		return citiesEasy;

	}

	public static List<City> createCitiesNormalWorld(int roundsToPlay) {

		List<City> citiesAfrica = AfricaConstants.createCitiesNormalAfrica(roundsToPlay);
		List<City> citiesAmerica = AmericaConstants.createCitiesNormalAmerica(roundsToPlay);
		List<City> citiesEurope = EuropeConstants.createCitiesNormalEurope(roundsToPlay);
		List<City> citiesAsia = AsiaConstants.createCitiesNormalAsia(roundsToPlay);
		List<City> citiesOceania = OceaniaConstants.createCitiesMoreNormalOceania(roundsToPlay);

		List<City> citiesNormal = new ArrayList<City>();

		while (citiesNormal.size() < roundsToPlay) {

			List<City> citiesAux = new ArrayList<City>();
			citiesAux = ApplicationUtils.randomizeCities(citiesAfrica, 1);

			if (citiesNormal.size() < roundsToPlay && !citiesNormal.contains((citiesAux).get(0))) {
				citiesNormal.add((citiesAux).get(0));
			}

			citiesAux = ApplicationUtils.randomizeCities(citiesAmerica, 1);

			if (citiesNormal.size() < roundsToPlay && !citiesNormal.contains((citiesAux).get(0))) {
				citiesNormal.add((citiesAux).get(0));
			}

			citiesAux = ApplicationUtils.randomizeCities(citiesEurope, 1);

			if (citiesNormal.size() < roundsToPlay && !citiesNormal.contains((citiesAux).get(0))) {
				citiesNormal.add((citiesAux).get(0));
			}

			citiesAux = ApplicationUtils.randomizeCities(citiesAsia, 1);

			if (citiesNormal.size() < roundsToPlay && !citiesNormal.contains((citiesAux).get(0))) {
				citiesNormal.add((citiesAux).get(0));
			}

			citiesAux = ApplicationUtils.randomizeCities(citiesOceania, 1);

			if (citiesNormal.size() < roundsToPlay && !citiesNormal.contains((citiesAux).get(0))) {
				citiesNormal.add((citiesAux).get(0));
			}

		}

		return citiesNormal;

	}

	public static List<City> createCitiesHardWorld(int roundsToPlay) {

		List<City> citiesAfrica = AfricaConstants.createCitiesHardAfrica(roundsToPlay);
		List<City> citiesAmerica = AmericaConstants.createCitiesHardAmerica(roundsToPlay);
		List<City> citiesEurope = EuropeConstants.createCitiesHardEurope(roundsToPlay);
		List<City> citiesAsia = AsiaConstants.createCitiesHardAsia(roundsToPlay);
		List<City> citiesOceania = OceaniaConstants.createCitiesHardOceania(roundsToPlay);

		List<City> citiesHard = new ArrayList<City>();

		while (citiesHard.size() < roundsToPlay) {

			List<City> citiesAux = new ArrayList<City>();
			citiesAux = ApplicationUtils.randomizeCities(citiesAfrica, 1);

			if (citiesHard.size() < roundsToPlay && !citiesHard.contains((citiesAux).get(0))) {
				citiesHard.add((citiesAux).get(0));
			}

			citiesAux = ApplicationUtils.randomizeCities(citiesAmerica, 1);

			if (citiesHard.size() < roundsToPlay && !citiesHard.contains((citiesAux).get(0))) {
				citiesHard.add((citiesAux).get(0));
			}

			citiesAux = ApplicationUtils.randomizeCities(citiesEurope, 1);

			if (citiesHard.size() < roundsToPlay && !citiesHard.contains((citiesAux).get(0))) {
				citiesHard.add((citiesAux).get(0));
			}

			citiesAux = ApplicationUtils.randomizeCities(citiesAsia, 1);

			if (citiesHard.size() < roundsToPlay && !citiesHard.contains((citiesAux).get(0))) {
				citiesHard.add((citiesAux).get(0));
			}

			citiesAux = ApplicationUtils.randomizeCities(citiesOceania, 1);

			if (citiesHard.size() < roundsToPlay && !citiesHard.contains((citiesAux).get(0))) {
				citiesHard.add((citiesAux).get(0));
			}

		}

		return citiesHard;

	}

}
