package com.sillynamedvars.geomaster.world;

import java.util.ArrayList;
import java.util.List;

import com.sillynamedvars.geomaster.model.City;
import com.sillynamedvars.geomaster.util.ApplicationUtils;

public abstract class AmericaConstants {

	public static List<City> createCitiesEasyAmerica(int roundsToPlay) {

		List<City> cities = createCitiesAmerica();
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

	public static List<City> createCitiesNormalAmerica(int roundsToPlay) {

		List<City> cities = createCitiesAmerica();
		List<City> citiesNormal = new ArrayList<City>();

		for (City normalCity : cities) {
			if (normalCity.isEasy() || normalCity.isNormal()) {
				citiesNormal.add(normalCity);
			}
		}

		List<City> citiesPlayed = ApplicationUtils.randomizeCities(citiesNormal, roundsToPlay);
		return citiesPlayed;

	}

	public static List<City> createCitiesHardAmerica(int roundsToPlay) {

		List<City> cities = createCitiesAmerica();
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

	public static List<City> createCitiesAmerica() {

		List<City> lstCities = new ArrayList<City>();

		lstCities.add(new City("The Valley", "Anguilla", "America", 18.220833, -63.051667, false, false, false, true, false, "50px-Flag_of_Anguilla.svg.png"));
		lstCities.add(new City("Saint John's", "Antigua and Barbuda", "America", 17.116667, -61.85, false, false, false, true, false, "50px-Flag_of_Antigua_and_Barbuda.svg.png"));
		lstCities.add(new City("Buenos Aires", "Argentina", "America", -34.61, -58.37, true, true, false, false, false, "50px-Flag_of_Argentina.svg.png"));
		lstCities.add(new City("Cordoba", "Argentina", "America", -31.4, -64.19, false, false, true, false, false, "50px-Flag_of_Argentina.svg.png"));
		lstCities.add(new City("Mar de la Plata", "Argentina", "America", -38, -57.58, false, false, true, false, false, "50px-Flag_of_Argentina.svg.png"));
		lstCities.add(new City("Mendoza", "Argentina", "America", -32.89, -68.83, false, false, true, false, false, "50px-Flag_of_Argentina.svg.png"));
		lstCities.add(new City("Rosario", "Argentina", "America", -32.94, -60.67, false, false, true, false, false, "50px-Flag_of_Argentina.svg.png"));
		lstCities.add(new City("Salta", "Argentina", "America", -24.79, -65.41, false, false, false, true, true, "50px-Flag_of_Argentina.svg.png"));
		lstCities.add(new City("Santa Fe", "Argentina", "America", -31.6, -60.69, false, false, true, false, true, "50px-Flag_of_Argentina.svg.png"));
		lstCities.add(new City("Tucuman", "Argentina", "America", -26.83, -65.22, false, false, true, false, false, "50px-Flag_of_Argentina.svg.png"));
		lstCities.add(new City("Oranjestad", "Aruba", "America", 12.519, -70.037, true, false, false, true, false, "50px-Flag_of_Aruba.svg.png"));
		lstCities.add(new City("Nassau", "Bahamas", "America", 25.06, -77.345, true, false, true, false, false, "50px-Flag_of_the_Bahamas.svg.png"));
		lstCities.add(new City("Bridgetown", "Barbados", "America", 13.105833, -59.613056, true, false, true, false, false, "50px-Flag_of_Barbados.svg.png"));
		lstCities.add(new City("Belmopan", "Belize", "America", 17.251389, -88.766944, true, false, false, true, false, "50px-Flag_of_Belize.svg.png"));
		lstCities.add(new City("Hamilton", "Bermuda", "America", 32.293, -64.782, true, false, false, true, false, "50px-Flag_of_Bermuda.svg.png"));
		lstCities.add(new City("Cochabamba", "Bolivia", "America", -17.38, -66.17, false, false, false, true, false, "50px-Flag_of_Bolivia.svg.png"));
		lstCities.add(new City("El Alto", "Bolivia", "America", -16.5, -68.17, false, false, true, false, false, "50px-Flag_of_Bolivia.svg.png"));
		lstCities.add(new City("La Paz", "Bolivia", "America", -16.5, -68.15, false, true, false, false, false, "50px-Flag_of_Bolivia.svg.png"));
		lstCities.add(new City("Santa Cruz", "Bolivia", "America", -17.77, -63.21, false, false, false, true, false, "50px-Flag_of_Bolivia.svg.png"));
		lstCities.add(new City("Sucre", "Bolivia", "America", -19.0339, -65.2626, true, true, false, false, false, "50px-Flag_of_Bolivia.svg.png"));
		lstCities.add(new City("Kralendijk", "Bonaire", "America", 12.1507, -68.2767, true, false, false, true, false, "50px-Flag_of_Bonaire.svg.png"));
		lstCities.add(new City("Aparecida de Goi", "Brazil", "America", -16.82, -49.24, false, false, false, true, true, "50px-Flag_of_Brazil.svg.png"));
		lstCities.add(new City("Aracaju", "Brazil", "America", -10.91, -37.07, false, false, false, true, true, "50px-Flag_of_Brazil.svg.png"));
		lstCities.add(new City("Belem", "Brazil", "America", -1.44, -48.5, false, false, false, true, true, "50px-Flag_of_Brazil.svg.png"));
		// lstCities.add(new City("Belford Roxo", "Brazil", "America", -22.75,
		// -43.42, false, false, false, true,
		// true,"50px-Flag_of_Brazil.svg.png"));
		lstCities.add(new City("Belo Horizonte", "Brazil", "America", -19.92, -43.94, false, false, false, true, true, "50px-Flag_of_Brazil.svg.png"));
		// lstCities.add(new City("Betim", "Brazil", "America", -19.97, -44.19,
		// false, false, false, true, true,"50px-Flag_of_Brazil.svg.png"));
		lstCities.add(new City("Brasilia", "Brazil", "America", -15.78, -47.91, true, true, false, false, false, "50px-Flag_of_Brazil.svg.png"));
		// lstCities.add(new City("Campinas", "Brazil", "America", -22.91,
		// -47.08, false, false, false, true,
		// false,"50px-Flag_of_Brazil.svg.png"));
		// lstCities.add(new City("Campo Grande", "Brazil", "America", -20.45,
		// -54.63, false, false, false, true,
		// true,"50px-Flag_of_Brazil.svg.png"));
		// lstCities.add(new City("Contagem", "Brazil", "America", -19.91,
		// -44.1, false, false, false, true,
		// true,"50px-Flag_of_Brazil.svg.png"));
		// lstCities.add(new City("Cuiabá", "Brazil", "America", -15.61, -56.09,
		// false, false, false, true, true,"50px-Flag_of_Brazil.svg.png"));
		// lstCities.add(new City("Curitiba", "Brazil", "America", -25.42,
		// -49.29, false, false, false, true,
		// true,"50px-Flag_of_Brazil.svg.png"));
		// lstCities.add(new City("Duque de Caxias", "Brazil", "America",
		// -22.77, -43.31, false, false, false, true,
		// true,"50px-Flag_of_Brazil.svg.png"));
		// lstCities.add(new City("Feira de Santana", "Brazil", "America",
		// -12.25, -38.97, false, false, false, true,
		// true,"50px-Flag_of_Brazil.svg.png"));
		// lstCities.add(new City("Florianópolis", "Brazil", "America", -27.6,
		// -48.54, false, false, false, true,
		// true,"50px-Flag_of_Brazil.svg.png"));
		lstCities.add(new City("Fortaleza", "Brazil", "America", -3.78, -38.59, false, false, false, true, false, "50px-Flag_of_Brazil.svg.png"));
		// lstCities.add(new City("Goiânia", "Brazil", "America", -16.72,
		// -49.26, false, false, false, true,
		// true,"50px-Flag_of_Brazil.svg.png"));
		// lstCities.add(new City("Guarulhos", "Brazil", "America", -23.46,
		// -46.49, false, false, false, true,
		// true,"50px-Flag_of_Brazil.svg.png"));
		// lstCities.add(new City("Jaboatão", "Brazil", "America", -8.11,
		// -35.02, false, false, false, true,
		// true,"50px-Flag_of_Brazil.svg.png"));
		// lstCities.add(new City("João Pessoa", "Brazil", "America", -7.12,
		// -34.86, false, false, false, true,
		// true,"50px-Flag_of_Brazil.svg.png"));
		// lstCities.add(new City("Joinville", "Brazil", "America", -26.32,
		// -48.84, false, false, false, true,
		// true,"50px-Flag_of_Brazil.svg.png"));
		// lstCities.add(new City("Juiz de Fora", "Brazil", "America", -21.75,
		// -43.36, false, false, false, true,
		// true,"50px-Flag_of_Brazil.svg.png"));
		// lstCities.add(new City("Londrina", "Brazil", "America", -23.3,
		// -51.18, false, false, false, true,
		// true,"50px-Flag_of_Brazil.svg.png"));
		// lstCities.add(new City("Maceió", "Brazil", "America", -9.65, -35.75,
		// false, false, false, true, true,"50px-Flag_of_Brazil.svg.png"));
		// lstCities.add(new City("Manaus", "Brazil", "America", -3.12, -60.02,
		// false, false, false, true, true,"50px-Flag_of_Brazil.svg.png"));
		lstCities.add(new City("Natal", "Brazil", "America", -5.8, -35.22, false, false, false, true, false, "50px-Flag_of_Brazil.svg.png"));
		// lstCities.add(new City("Nova Iguaçu", "Brazil", "America", -22.74,
		// -43.47, false, false, false, true,
		// true,"50px-Flag_of_Brazil.svg.png"));
		// lstCities.add(new City("Osasco", "Brazil", "America", -23.53, -46.78,
		// false, false, false, true, true,"50px-Flag_of_Brazil.svg.png"));
		lstCities.add(new City("Porto Alegre", "Brazil", "America", -30.04, -51.22, false, false, false, true, false, "50px-Flag_of_Brazil.svg.png"));
		lstCities.add(new City("Recife", "Brazil", "America", -8.08, -34.92, false, false, false, true, true, "50px-Flag_of_Brazil.svg.png"));
		// lstCities.add(new City("Ribeirão das Nev", "Brazil", "America",
		// -19.76, -44.08, false, false, false, true,
		// true,"50px-Flag_of_Brazil.svg.png"));
		// lstCities.add(new City("Ribeirão Preto", "Brazil", "America", -21.17,
		// -47.8, false, false, false, true,
		// true,"50px-Flag_of_Brazil.svg.png"));
		lstCities.add(new City("Rio de Janeiro", "Brazil", "America", -22.91, -43.2, false, true, false, false, false, "50px-Flag_of_Brazil.svg.png"));
		// lstCities.add(new City("Salvador", "Brazil", "America", -12.97,
		// -38.5, false, false, false, true,
		// true,"50px-Flag_of_Brazil.svg.png"));
		// lstCities.add(new City("Santo André", "Brazil", "America", -23.65,
		// -46.53, false, false, false, true,
		// true,"50px-Flag_of_Brazil.svg.png"));
		// lstCities.add(new City("São Bernardo", "Brazil", "America", -23.71,
		// -46.54, false, false, false, true,
		// true,"50px-Flag_of_Brazil.svg.png"));
		// lstCities.add(new City("São Gonçalo", "Brazil", "America", -22.84,
		// -43.07, false, false, false, true,
		// true,"50px-Flag_of_Brazil.svg.png"));
		// lstCities.add(new City("São José dos Cam", "Brazil", "America",
		// -23.2, -45.88, false, false, false, true,
		// true,"50px-Flag_of_Brazil.svg.png"));
		// lstCities.add(new City("São Luís", "Brazil", "America", -2.5, -44.3,
		// false, false, false, true, true,"50px-Flag_of_Brazil.svg.png"));
		lstCities.add(new City("Sao Paulo", "Brazil", "America", -23.53, -46.63, false, true, false, false, false, "50px-Flag_of_Brazil.svg.png"));
		// lstCities.add(new City("Serra", "Brazil", "America", -20.13, -40.32,
		// false, false, false, false, false,"50px-Flag_of_Brazil.svg.png"));
		lstCities.add(new City("Sorocaba", "Brazil", "America", -23.49, -47.47, false, false, true, false, false, "50px-Flag_of_Brazil.svg.png"));
		// lstCities.add(new City("Teresina", "Brazil", "America", -5.1, -42.8,
		// false, false, false, true, true,"50px-Flag_of_Brazil.svg.png"));
		// lstCities.add(new City("Uberlândia", "Brazil", "America", -18.9,
		// -48.28, false, false, false, true,
		// false,"50px-Flag_of_Brazil.svg.png"));
		lstCities.add(new City("Road Town", "British Virgin Islands", "America", 18.431389, -64.623056, true, false, true, false, false, "50px-Flag_of_the_British_Virgin_Islands.svg.png"));
		lstCities.add(new City("Calgary", "Canada", "America", 51.05, -114.06, false, true, false, false, false, "50px-Flag_of_Canada.svg.png"));
		lstCities.add(new City("Edmonton", "Canada", "America", 53.57, -113.54, false, false, true, false, false, "50px-Flag_of_Canada.svg.png"));
		lstCities.add(new City("Hamilton", "Canada", "America", 43.26, -79.85, false, false, false, true, false, "50px-Flag_of_Canada.svg.png"));
		lstCities.add(new City("Montreal", "Canada", "America", 45.52, -73.57, false, true, false, false, false, "50px-Flag_of_Canada.svg.png"));
		lstCities.add(new City("Ottawa", "Canada", "America", 45.42, -75.71, true, true, false, false, false, "50px-Flag_of_Canada.svg.png"));
		lstCities.add(new City("Quebec", "Canada", "America", 46.82, -71.23, false, false, true, false, false, "50px-Flag_of_Canada.svg.png"));
		lstCities.add(new City("Toronto", "Canada", "America", 43.65, -79.38, false, true, false, false, false, "50px-Flag_of_Canada.svg.png"));
		lstCities.add(new City("Vancouver", "Canada", "America", 49.28, -123.13, false, true, false, false, false, "50px-Flag_of_Canada.svg.png"));
		lstCities.add(new City("Winnipeg", "Canada", "America", 49.88, -97.17, false, false, true, false, false, "50px-Flag_of_Canada.svg.png"));
		lstCities.add(new City("George Town", "Cayman Islands", "America", 19.3034, -81.3863, true, false, true, false, false, "50px-Flag_of_the_Cayman_Islands.svg.png"));
		lstCities.add(new City("Santiago de Chile", "Chile", "America", -33.46, -70.64, true, true, false, false, false, "50px-Flag_of_Chile.svg.png"));
		lstCities.add(new City("Clipperton Island", "Clipperton Island", "America", 10.3, -109.216667, false, false, false, true, false, "50px-Flag_of_France.svg.png"));
		lstCities.add(new City("Barranquilla", "Colombia", "America", 10.96, -74.8, false, false, true, false, false, "50px-Flag_of_Colombia.svg.png"));
		lstCities.add(new City("Bogota", "Colombia", "America", 4.63, -74.09, true, true, false, false, false, "50px-Flag_of_Colombia.svg.png"));
		lstCities.add(new City("Bucaramanga", "Colombia", "America", 7.13, -73.13, false, false, false, true, true, "50px-Flag_of_Colombia.svg.png"));
		lstCities.add(new City("Cali", "Colombia", "America", 3.44, -76.52, false, false, false, true, true, "50px-Flag_of_Colombia.svg.png"));
		lstCities.add(new City("Cartagena", "Colombia", "America", 10.4, -75.5, false, false, true, false, false, "50px-Flag_of_Colombia.svg.png"));
		lstCities.add(new City("Cucuta", "Colombia", "America", 7.88, -72.51, false, false, false, true, true, "50px-Flag_of_Colombia.svg.png"));
		lstCities.add(new City("Ibagué", "Colombia", "America", 4.45, -75.24, false, false, false, true, true, "50px-Flag_of_Colombia.svg.png"));
		lstCities.add(new City("Medellin", "Colombia", "America", 6.29, -75.54, false, false, true, false, false, "50px-Flag_of_Colombia.svg.png"));
		lstCities.add(new City("Soledad", "Colombia", "America", 10.92, -74.77, false, false, false, true, false, "50px-Flag_of_Colombia.svg.png"));
		lstCities.add(new City("San Jose", "Costa Rica", "America", 9.933333, -84.083333, true, true, false, false, false, "50px-Flag_of_Costa_Rica.svg.png"));
		lstCities.add(new City("Havanna", "Cuba", "America", 23.13, -82.39, true, true, false, false, false, "50px-Flag_of_Cuba.svg.png"));
		lstCities.add(new City("Willemstad", "Curaçao", "America", 12.116667, -68.933333, true, false, true, false, false, "50px-Flag_of_Curacao.svg.png"));
		lstCities.add(new City("Roseau", "Dominica", "America", 15.301389, -61.388333, true, false, true, false, false, "50px-Flag_of_Dominica.svg.png"));
		lstCities.add(new City("Santiago", "Dominican Republic", "America", 19.48, -70.69, false, false, false, true, false, "50px-Flag_of_the_Dominican_Republic.svg.png"));
		lstCities.add(new City("Santo Domingo", "Dominican Republic", "America", 18.48, -69.91, true, true, false, false, false, "50px-Flag_of_the_Dominican_Republic.svg.png"));
		lstCities.add(new City("Guayaquil", "Ecuador", "America", -2.21, -79.9, false, false, false, true, false, "50px-Flag_of_Ecuador.svg.png"));
		lstCities.add(new City("Quito", "Ecuador", "America", -0.19, -78.5, true, true, false, false, false, "50px-Flag_of_Ecuador.svg.png"));
		lstCities.add(new City("San Salvador", "El Salvador", "America", 13.69, -89.19, true, true, false, false, false, "50px-Flag_of_El_Salvador.svg.png"));
		lstCities.add(new City("Stanley", "Falkland Islands", "America", -51.6921, -57.8589, true, false, true, false, false, "50px-Flag_of_the_Falkland_Islands.svg.png"));
		lstCities.add(new City("Cayenne", "French Guiana", "America", 4.9227, -52.3269, true, false, true, false, false, "50px-Flag_of_France.svg.png"));
		lstCities.add(new City("Nuuk", "Greenland", "America", 64.175, -51.738889, true, false, true, false, false, "50px-Flag_of_Greenland.svg.png"));
		lstCities.add(new City("SaintGeorge's", "Grenada", "America", 12.05, -61.75, true, false, true, false, false, "50px-Flag_of_Grenada.svg.png"));
		lstCities.add(new City("Basse-Terre", "Guadeloupe", "America", 15.9958, -61.7292, true, false, true, false, false, "50px-Flag_of_France.svg.png"));
		lstCities.add(new City("Guatemala City", "Guatemala", "America", 14.63, -90.55, true, true, false, false, false, "50px-Flag_of_Guatemala.svg.png"));
		lstCities.add(new City("Mixco", "Guatemala", "America", 14.64, -90.6, false, false, false, true, true, "50px-Flag_of_Guatemala.svg.png"));
		lstCities.add(new City("Villa Nueva", "Guatemala", "America", 14.53, -90.59, false, false, false, true, false, "50px-Flag_of_Guatemala.svg.png"));
		lstCities.add(new City("Georgetown", "Guyana", "America", 6.8, -58.166667, true, false, true, false, false, "50px-Flag_of_Guyana.svg.png"));
		lstCities.add(new City("Port-au-Prince", "Haiti", "America", 18.533333, -72.333333, true, true, false, false, false, "50px-Flag_of_Haiti.svg.png"));
		lstCities.add(new City("San Pedro Sula", "Honduras", "America", 15.47, -88.03, false, false, false, true, false, "50px-Flag_of_Honduras.svg.png"));
		lstCities.add(new City("Tegucigalpa", "Honduras", "America", 14.0833, -87.2167, true, true, false, false, false, "50px-Flag_of_Honduras.svg.png"));
		lstCities.add(new City("Kingston", "Jamaica", "America", 17.99, -76.8, true, true, false, false, false, "50px-Flag_of_Jamaica.svg.png"));
		lstCities.add(new City("Fort-de-France", "Martinique", "America", 14.6, -61.08334, true, false, true, false, false, "50px-Flag_of_France.svg.png"));
		lstCities.add(new City("Acapulco", "Mexico", "America", 16.85, -99.92, false, true, false, false, false, "50px-Flag_of_Mexico.svg.png"));
		lstCities.add(new City("Aguascalientes", "Mexico", "America", 21.88, -102.3, false, false, true, false, false, "50px-Flag_of_Mexico.svg.png"));
		lstCities.add(new City("Cancun", "Mexico", "America", 21.17, -86.83, false, false, true, false, false, "50px-Flag_of_Mexico.svg.png"));
		lstCities.add(new City("Chihuahua", "Mexico", "America", 28.63, -106.08, false, false, true, false, false, "50px-Flag_of_Mexico.svg.png"));
		lstCities.add(new City("Chimalhuacan", "Mexico", "America", 19.44, -98.96, false, false, false, true, true, "50px-Flag_of_Mexico.svg.png"));
		lstCities.add(new City("Cuautitlan Izcal", "Mexico", "America", 19.65, -99.25, false, false, false, true, false, "50px-Flag_of_Mexico.svg.png"));
		lstCities.add(new City("Culiacan", "Mexico", "America", 24.8, -107.39, false, false, false, true, false, "50px-Flag_of_Mexico.svg.png"));
		// lstCities.add(new City("Ecatepec", "Mexico", "America", 19.6, -99.05,
		// false, false, false, true, false, "50px-Flag_of_Mexico.svg.png"));
		lstCities.add(new City("Guadalajara", "Mexico", "America", 20.67, -103.35, false, true, false, false, false, "50px-Flag_of_Mexico.svg.png"));
		lstCities.add(new City("Guadalupe", "Mexico", "America", 25.68, -100.26, false, false, true, false, false, "50px-Flag_of_Mexico.svg.png"));
		lstCities.add(new City("Hermosillo", "Mexico", "America", 29.07, -110.97, false, false, true, false, false, "50px-Flag_of_Mexico.svg.png"));
		lstCities.add(new City("Juarez", "Mexico", "America", 31.74, -106.49, false, false, true, false, false, "50px-Flag_of_Mexico.svg.png"));
		// lstCities.add(new City("Leon", "Mexico", "America", 21.12, -101.69,
		// false, false, false, true, true, "50px-Flag_of_Mexico.svg.png"));
		// lstCities.add(new City("López Mateos", "Mexico", "America", 19.57,
		// -99.26, false, false, false, true, false,
		// "50px-Flag_of_Mexico.svg.png"));
		lstCities.add(new City("Merida", "Mexico", "America", 20.97, -89.62, false, false, true, false, false, "50px-Flag_of_Mexico.svg.png"));
		lstCities.add(new City("Mexicali", "Mexico", "America", 32.65, -115.47, false, false, false, true, false, "50px-Flag_of_Mexico.svg.png"));
		lstCities.add(new City("Mexico City", "Mexico", "America", 19.43, -99.14, true, true, false, false, false, "50px-Flag_of_Mexico.svg.png"));
		// lstCities.add(new City("Monterrey", "Mexico", "America", 25.67,
		// -100.32, false, false, false, true, false,
		// "50px-Flag_of_Mexico.svg.png"));
		// lstCities.add(new City("Morelia", "Mexico", "America", 19.72,
		// -101.18, false, false, false, true, true,
		// "50px-Flag_of_Mexico.svg.png"));
		lstCities.add(new City("Naucalpan", "Mexico", "America", 19.48, -99.23, false, false, false, true, true, "50px-Flag_of_Mexico.svg.png"));
		// lstCities.add(new City("Nezahualcóyotl", "Mexico", "America", 19.41,
		// -99.03, false, false, false, true, true,
		// "50px-Flag_of_Mexico.svg.png"));
		// lstCities.add(new City("Puebla", "Mexico", "America", 19.05, -98.22,
		// false, false, false, true, true, "50px-Flag_of_Mexico.svg.png"));
		// lstCities.add(new City("Querétaro", "Mexico", "America", 20.59,
		// -100.4, false, false, false, true, false,
		// "50px-Flag_of_Mexico.svg.png"));
		// lstCities.add(new City("Reynosa", "Mexico", "America", 26.08, -98.28,
		// false, false, false, true, false, "50px-Flag_of_Mexico.svg.png"));
		// lstCities.add(new City("Saltillo", "Mexico", "America", 25.42, -101,
		// false, false, false, true, false, "50px-Flag_of_Mexico.svg.png"));
		// lstCities.add(new City("San Luis Potosí", "Mexico", "America", 22.16,
		// -100.98, false, false, false, true, false,
		// "50px-Flag_of_Mexico.svg.png"));
		lstCities.add(new City("San Nicolas", "Mexico", "America", 25.75, -100.3, false, false, false, true, true, "50px-Flag_of_Mexico.svg.png"));
		// lstCities.add(new City("Tijuana", "Mexico", "America", 32.53,
		// -117.02, false, true, false, false, false,
		// "50px-Flag_of_Mexico.svg.png"));
		// lstCities.add(new City("Tlalnepantla", "Mexico", "America", 19.54,
		// -99.19, false, false, false, true, true,
		// "50px-Flag_of_Mexico.svg.png"));
		// lstCities.add(new City("Tlaquepaque", "Mexico", "America", 20.64,
		// -103.32, false, false, false, true, true,
		// "50px-Flag_of_Mexico.svg.png"));
		// lstCities.add(new City("Toluca", "Mexico", "America", 19.29, -99.67,
		// false, false, false, true, true, "50px-Flag_of_Mexico.svg.png"));
		// lstCities.add(new City("Tonalá", "Mexico", "America", 20.62, -103.23,
		// false, false, false, true, true, "50px-Flag_of_Mexico.svg.png"));
		// lstCities.add(new City("Torreón", "Mexico", "America", 25.55,
		// -103.43, false, false, false, true, true,
		// "50px-Flag_of_Mexico.svg.png"));
		// lstCities.add(new City("Tuxtla Gutiérrez", "Mexico", "America",
		// 16.75, -93.12, false, false, false, true, true,
		// "50px-Flag_of_Mexico.svg.png"));
		lstCities.add(new City("Veracruz", "Mexico", "America", 19.19, -96.14, false, true, false, false, false, "50px-Flag_of_Mexico.svg.png"));
		// lstCities.add(new City("Zapopan", "Mexico", "America", 20.72, -103.4,
		// false, false, false, true, false, "50px-Flag_of_Mexico.svg.png"));
		lstCities.add(new City("Plymouth", "Montserrat", "America", 16.706417, -62.215839, true, false, true, false, false, "50px-Flag_of_Montserrat.svg.png"));
		lstCities.add(new City("Navassa Island", "Navassa Island", "America", 18.402778, -75.0125, true, false, false, true, false, "50px-Flag_of_the_United_States.svg.png"));
		lstCities.add(new City("Managua", "Nicaragua", "America", 12.15, -86.27, true, true, false, false, false, "50px-Flag_of_Nicaragua.svg.png"));
		lstCities.add(new City("Panama City", "Panama", "America", 8.983333, -79.516667, true, true, false, false, false, "50px-Flag_of_Panama.svg.png"));
		lstCities.add(new City("Asunción", "Paraguay", "America", -25.3, -57.63, true, true, false, false, false, "50px-Flag_of_Paraguay.svg.png"));
		lstCities.add(new City("Arequipa", "Peru", "America", -16.39, -71.53, false, false, false, true, false, "50px-Flag_of_Peru.svg.png"));
		lstCities.add(new City("Chiclayo", "Peru", "America", -6.76, -79.84, false, false, false, true, false, "50px-Flag_of_Peru.svg.png"));
		lstCities.add(new City("Lima", "Peru", "America", -12.07, -77.05, true, true, false, false, false, "50px-Flag_of_Peru.svg.png"));
		lstCities.add(new City("Trujillo", "Peru", "America", -8.11, -79.03, false, false, true, false, false, "50px-Flag_of_Peru.svg.png"));
		lstCities.add(new City("San Juan", "Puerto Rico", "America", 18.45, -66.066667, true, false, false, true, false, "50px-Flag_of_Puerto_Rico.svg.png"));
		lstCities.add(new City("The Bottom", "Saba", "America", 17.626111, -63.249167, true, false, false, true, false, "50px-Flag_of_Saba.svg.png"));
		lstCities.add(new City("Gustavia", "Saint Barthelemy", "America", 17.897908, -62.850556, true, false, false, true, false, "50px-Flag_of_France.svg.png"));
		lstCities.add(new City("Basseterre", "Saint Kitts and Nevis", "America", 17.3, -62.733333, true, false, false, true, false, "50px-Flag_of_Saint_Kitts_and_Nevis.svg.png"));
		lstCities.add(new City("Castries", "Saint Lucia", "America", 14.016667, -60.983333, true, false, false, true, false, "50px-Flag_of_Saint_Lucia.svg.png"));
		lstCities.add(new City("Marigot", "Saint Martin", "America", 18.0731, -63.0822, true, false, false, true, false, "50px-Flag_of_France.svg.png"));
		lstCities.add(new City("Saint-Pierre", "Saint Pierre and Miquelon", "America", 46.777778, -56.177778, true, false, false, true, false, "50px-Flag_of_France.svg.png"));
		lstCities.add(new City("Kingstown", "Saint Vincent and the Grenadines", "America", 13.166667, -61.233333, true, false, false, true, false,
				"50px-Flag_of_Saint_Vincent_and_the_Grenadines.svg.png"));
		lstCities.add(new City("Oranjestad", "Sint Eustatius", "America", 17.483333, -62.983333, true, false, false, true, false, "50px-Flag_of_Sint_Eustatius.svg.png"));
		lstCities.add(new City("Philipsburg", "Sint Maarten", "America", 18.0237, -63.0458, true, false, true, false, false, "50px-Flag_of_Sint_Maarten.svg.png"));
		lstCities.add(new City("Paramaribo", "Suriname", "America", 5.866667, -55.166667, true, false, true, false, false, "50px-Flag_of_Suriname.svg.png"));
		lstCities.add(new City("Port of Spain", "Trinidad and Tobago", "America", 10.666667, -61.516667, true, false, true, false, false, "50px-Flag_of_Trinidad_and_Tobago.svg.png"));
		lstCities.add(new City("Cockburn Town", "Turks and Caicos Islands", "America", 21.459, -71.139, true, false, true, false, false, "50px-Flag_of_the_Turks_and_Caicos_Islands.svg.png"));
		lstCities.add(new City("Albuquerque", "United States of America", "America", 35.12, -106.62, false, true, false, false, false, "50px-Flag_of_the_United_States.svg.png"));
		lstCities.add(new City("Atlanta", "United States of America", "America", 33.76, -84.42, false, true, false, false, false, "50px-Flag_of_the_United_States.svg.png"));
		lstCities.add(new City("Austin", "United States of America", "America", 30.31, -97.75, false, false, true, false, false, "50px-Flag_of_the_United_States.svg.png"));
		lstCities.add(new City("Baltimore", "United States of America", "America", 39.3, -76.61, false, false, true, false, false, "50px-Flag_of_the_United_States.svg.png"));
		lstCities.add(new City("Boston", "United States of America", "America", 42.34, -71.02, false, true, false, false, false, "50px-Flag_of_the_United_States.svg.png"));
		lstCities.add(new City("Charlotte", "United States of America", "America", 35.2, -80.83, false, false, true, false, false, "50px-Flag_of_the_United_States.svg.png"));
		lstCities.add(new City("Columbus", "United States of America", "America", 39.99, -82.99, false, true, false, false, false, "50px-Flag_of_the_United_States.svg.png"));
		lstCities.add(new City("Dallas", "United States of America", "America", 32.79, -96.77, false, true, false, false, false, "50px-Flag_of_the_United_States.svg.png"));
		lstCities.add(new City("Denver", "United States of America", "America", 39.77, -104.87, false, true, false, false, false, "50px-Flag_of_the_United_States.svg.png"));
		lstCities.add(new City("Detroit", "United States of America", "America", 42.38, -83.1, false, true, false, false, false, "50px-Flag_of_the_United_States.svg.png"));
		lstCities.add(new City("ElPaso", "United States of America", "America", 31.85, -106.44, false, false, true, false, false, "50px-Flag_of_the_United_States.svg.png"));
		lstCities.add(new City("Fort Worth", "United States of America", "America", 32.75, -97.34, false, false, true, false, false, "50px-Flag_of_the_United_States.svg.png"));
		lstCities.add(new City("Houston", "United States of America", "America", 29.77, -95.39, false, false, true, false, false, "50px-Flag_of_the_United_States.svg.png"));
		lstCities.add(new City("Indianapolis", "United States of America", "America", 39.78, -86.15, false, true, false, false, false, "50px-Flag_of_the_United_States.svg.png"));
		lstCities.add(new City("Jacksonville", "United States of America", "America", 30.33, -81.66, false, true, false, false, false, "50px-Flag_of_the_United_States.svg.png"));
		lstCities.add(new City("Las Vegas", "United States of America", "America", 36.21, -115.22, false, true, false, false, false, "50px-Flag_of_the_United_States.svg.png"));
		lstCities.add(new City("Los Angeles", "United States of America", "America", 34.11, -118.41, false, true, false, false, false, "50px-Flag_of_the_United_States.svg.png"));
		lstCities.add(new City("Louisville", "United States of America", "America", 38.22, -85.74, false, false, true, false, false, "50px-Flag_of_the_United_States.svg.png"));
		lstCities.add(new City("Memphis", "United States of America", "America", 35.11, -90.01, false, true, false, false, false, "50px-Flag_of_the_United_States.svg.png"));
		lstCities.add(new City("Milwaukee", "United States of America", "America", 43.06, -87.97, false, true, false, false, false, "50px-Flag_of_the_United_States.svg.png"));
		lstCities.add(new City("Nashville", "United States of America", "America", 36.17, -86.78, false, true, false, false, false, "50px-Flag_of_the_United_States.svg.png"));
		lstCities.add(new City("NewYork", "United States of America", "America", 40.67, -73.94, false, true, false, false, false, "50px-Flag_of_the_United_States.svg.png"));
		lstCities.add(new City("Oklahoma City", "United States of America", "America", 35.47, -97.51, false, true, false, false, false, "50px-Flag_of_the_United_States.svg.png"));
		lstCities.add(new City("Philadelphia", "United States of America", "America", 40.01, -75.13, false, true, false, false, false, "50px-Flag_of_the_United_States.svg.png"));
		lstCities.add(new City("Phoenix", "United States of America", "America", 33.54, -112.07, false, true, false, false, false, "50px-Flag_of_the_United_States.svg.png"));
		lstCities.add(new City("Portland", "United States of America", "America", 45.54, -122.66, false, true, false, false, false, "50px-Flag_of_the_United_States.svg.png"));
		lstCities.add(new City("San Antonio", "United States of America", "America", 29.46, -98.51, false, false, true, false, false, "50px-Flag_of_the_United_States.svg.png"));
		lstCities.add(new City("San Diego", "United States of America", "America", 32.81, -117.14, false, false, true, false, false, "50px-Flag_of_the_United_States.svg.png"));
		lstCities.add(new City("San Francisco", "United States of America", "America", 37.77, -122.45, false, true, false, false, false, "50px-Flag_of_the_United_States.svg.png"));
		lstCities.add(new City("San Jose", "United States of America", "America", 37.3, -121.85, false, false, true, false, false, "50px-Flag_of_the_United_States.svg.png"));
		lstCities.add(new City("Seattle", "United States of America", "America", 47.62, -122.35, false, true, false, false, false, "50px-Flag_of_the_United_States.svg.png"));
		lstCities.add(new City("Tucson", "United States of America", "America", 32.2, -110.89, false, false, true, false, false, "50px-Flag_of_the_United_States.svg.png"));
		lstCities.add(new City("Washington", "United States of America", "America", 38.91, -77.02, true, true, false, false, false, "50px-Flag_of_the_United_States.svg.png"));
		lstCities
				.add(new City("Charlotte Amalie", "United States Virgin Islands", "America", 18.35, -64.95, false, false, false, true, false, "50px-Flag_of_the_United_States_Virgin_Islands.svg.png"));
		lstCities.add(new City("Montevideo", "Uruguay", "America", -34.883611, -56.181944, true, true, false, false, false, "50px-Flag_of_Uruguay.svg.png"));
		lstCities.add(new City("Barcelona", "Venezuela", "America", 10.13, -64.72, false, true, false, false, false, "50px-Flag_of_Venezuela.svg.png"));
		lstCities.add(new City("Barquisimeto", "Venezuela", "America", 10.05, -69.3, false, false, false, true, false, "50px-Flag_of_Venezuela.svg.png"));
		lstCities.add(new City("Caracas", "Venezuela", "America", 10.54, -66.93, true, true, false, false, false, "50px-Flag_of_Venezuela.svg.png"));
		lstCities.add(new City("Ciudad Guayana", "Venezuela", "America", 8.37, -62.62, false, false, false, true, false, "50px-Flag_of_Venezuela.svg.png"));
		lstCities.add(new City("Maracaibo", "Venezuela", "America", 10.73, -71.66, false, false, true, false, false, "50px-Flag_of_Venezuela.svg.png"));
		lstCities.add(new City("Maracay", "Venezuela", "America", 10.33, -67.47, false, false, false, true, true, "50px-Flag_of_Venezuela.svg.png"));
		lstCities.add(new City("Maturin", "Venezuela", "America", 9.75, -63.17, false, false, false, true, true, "50px-Flag_of_Venezuela.svg.png"));
		lstCities.add(new City("Petare", "Venezuela", "America", 10.52, -66.83, false, false, false, true, false, "50px-Flag_of_Venezuela.svg.png"));
		lstCities.add(new City("Valencia", "Venezuela", "America", 10.23, -67.98, false, false, false, true, false, "50px-Flag_of_Venezuela.svg.png"));

		return lstCities;

	}

}
