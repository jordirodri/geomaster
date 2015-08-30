package com.sillynamedvars.geomaster.pro.world;

import java.util.ArrayList;
import java.util.List;

import com.sillynamedvars.geomaster.pro.model.City;
import com.sillynamedvars.geomaster.pro.util.ApplicationUtils;

public abstract class AfricaConstants {

	public static List<City> createCitiesEasyAfrica(int roundsToPlay) {

		List<City> cities = createCitiesAfrica();
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

	public static List<City> createCitiesNormalAfrica(int roundsToPlay) {

		List<City> cities = createCitiesAfrica();
		List<City> citiesNormal = new ArrayList<City>();

		for (City normalCity : cities) {
			if (normalCity.isEasy() || normalCity.isNormal()) {
				citiesNormal.add(normalCity);
			}
		}

		List<City> citiesPlayed = ApplicationUtils.randomizeCities(citiesNormal, roundsToPlay);
		return citiesPlayed;

	}

	public static List<City> createCitiesHardAfrica(int roundsToPlay) {

		List<City> citiesPlayed = ApplicationUtils.randomizeCities(createCitiesAfrica(), roundsToPlay);
		return citiesPlayed;

	}

	public static List<City> createCitiesAfrica() {

		List<City> lstCities = new ArrayList<City>();

		lstCities.add(new City("Algiers", "Algeria", "Africa", 36.7, 3.216667, true, true, false, false, false, "50px-Flag_of_Algeria.svg.png"));
		lstCities.add(new City("Wahran", "Algeria", "Africa", 35.7, -0.62, false, false, false, true, false, "50px-Flag_of_Algeria.svg.png"));
		lstCities.add(new City("Luanda", "Angola", "Africa", -8.838333, 13.234444, true, true, false, false, false, "50px-Flag_of_Angola.svg.png"));
		lstCities.add(new City("Abomey-Calavi", "Benin", "Africa", 6.44, 2.36, false, false, false, true, false, "50px-Flag_of_Benin.svg.png"));
		lstCities.add(new City("Cotonou", "Benin", "Africa", 6.36, 2.44, false, false, false, true, false, "50px-Flag_of_Benin.svg.png"));
		lstCities.add(new City("Porto-Novo", "Benin", "Africa", 6.497222, 2.605, true, false, true, false, false, "50px-Flag_of_Benin.svg.png"));
		lstCities.add(new City("Gaborone", "Botswana", "Africa", -24.658056, 25.912222, true, false, true, false, false, "50px-Flag_of_Botswana.svg.png"));
		lstCities.add(new City("Ouagadougou", "Burkina Faso", "Africa", 12.357222, -1.535278, true, false, true, false, false, "50px-Flag_of_Burkina_Faso.svg.png"));
		lstCities.add(new City("Bujumbura", "Burundi", "Africa", -3.383333, 29.366667, true, false, true, false, false, "50px-Flag_of_Burundi.svg.png"));
		lstCities.add(new City("Bamenda", "Cameroon", "Africa", 5.96, 10.15, false, false, false, true, false, "50px-Flag_of_Cameroon.svg.png"));
		lstCities.add(new City("Douala", "Cameroon", "Africa", 4.06, 9.71, false, false, false, true, false, "50px-Flag_of_Cameroon.svg.png"));
		lstCities.add(new City("Garoua", "Cameroon", "Africa", 9.3, 13.39, false, false, false, true, false, "50px-Flag_of_Cameroon.svg.png"));
		lstCities.add(new City("Yaounde", "Cameroon", "Africa", 3.866667, 11.516667, true, true, false, false, false, "50px-Flag_of_Cameroon.svg.png"));
		lstCities.add(new City("Praia", "Cape Verde", "Africa", 14.920833, -23.508333, true, false, true, false, false, "50px-Flag_of_Cape_Verde.svg.png"));
		lstCities.add(new City("Bangui", "Central African Republic", "Africa", 4.366667, 18.583333, true, false, true, false, false, "50px-Flag_of_the_Central_African_Republic.svg.png"));
		lstCities.add(new City("N'Djamena", "Chad", "Africa", 12.112, 15.035, true, false, true, false, false, "50px-Flag_of_Chad.svg.png"));
		lstCities.add(new City("Moroni", "Comoros", "Africa", -11.75, 43.2, true, false, true, false, false, "50px-Flag_of_the_Comoros.svg.png"));
		lstCities.add(new City("Brazzaville", "Congo", "Africa", -4.25, 15.26, false, false, false, true, false, "50px-Flag_of_the_Republic_of_the_Congo.svg.png"));
		lstCities.add(new City("Pointe Noire", "Congo", "Africa", -4.77, 11.87, false, false, false, true, false, "50px-Flag_of_the_Republic_of_the_Congo.svg.png"));
		lstCities.add(new City("Brazzaville", "Congo", "Africa", -4.266667, 15.283333, true, false, true, false, false, "50px-Flag_of_the_Republic_of_the_Congo.svg.png"));
		lstCities.add(new City("Bukavu", "Congo (Dem. Rep.)", "Africa", -2.51, 28.84, false, false, false, true, false, "50px-Flag_of_the_Democratic_Republic_of_the_Congo.svg.png"));
		lstCities.add(new City("Kananga", "Congo (Dem. Rep.)", "Africa", -5.89, 22.4, false, false, false, true, false, "50px-Flag_of_the_Democratic_Republic_of_the_Congo.svg.png"));
		lstCities.add(new City("Kinshasa", "Congo (Dem. Rep.)", "Africa", -4.31, 15.32, false, false, false, true, false, "50px-Flag_of_the_Democratic_Republic_of_the_Congo.svg.png"));
		lstCities.add(new City("Kisangani", "Congo (Dem. Rep.)", "Africa", 0.53, 25.19, false, false, false, true, false, "50px-Flag_of_the_Democratic_Republic_of_the_Congo.svg.png"));
		lstCities.add(new City("Lubumbashi", "Congo (Dem. Rep.)", "Africa", -11.66, 27.48, false, false, false, true, false, "50px-Flag_of_the_Democratic_Republic_of_the_Congo.svg.png"));
		lstCities.add(new City("Mbuji-Mayi", "Congo (Dem. Rep.)", "Africa", -6.13, 23.59, false, false, false, true, false, "50px-Flag_of_the_Democratic_Republic_of_the_Congo.svg.png"));
		lstCities.add(new City("Tshikapa", "Congo (Dem. Rep.)", "Africa", -6.41, 20.77, false, false, true, false, false, "50px-Flag_of_the_Democratic_Republic_of_the_Congo.svg.png"));
		lstCities.add(new City("Kinshasa", "Congo (Dem. Rep.)", "Africa", -4.325, 15.322222, true, true, false, false, false, "50px-Flag_of_the_Democratic_Republic_of_the_Congo.svg.png"));
		lstCities.add(new City("Djibouti", "Djibouti", "Africa", 11.588, 43.145, true, true, false, false, false, "50px-Flag_of_Djibouti.svg.png"));
		lstCities.add(new City("Alexandria", "Egypt", "Africa", 31.22, 29.95, false, false, false, true, false, "50px-Flag_of_Egypt.svg.png"));
		lstCities.add(new City("Cairo", "Egypt", "Africa", 30.058056, 31.228889, true, true, false, false, false, "50px-Flag_of_Egypt.svg.png"));
		lstCities.add(new City("Gizeh", "Egypt", "Africa", 30.01, 31.21, false, false, false, true, false, "50px-Flag_of_Egypt.svg.png"));
		lstCities.add(new City("Port Said", "Egypt", "Africa", 31.26, 32.29, false, false, false, true, false, "50px-Flag_of_Egypt.svg.png"));
		lstCities.add(new City("Shubra-El-Khema", "Egypt", "Africa", 30.11, 31.25, false, false, false, true, false, "50px-Flag_of_Egypt.svg.png"));
		lstCities.add(new City("Suez", "Egypt", "Africa", 29.98, 32.54, false, false, false, true, false, "50px-Flag_of_Egypt.svg.png"));
		lstCities.add(new City("Malabo", "Equatorial Guinea", "Africa", 3.75, 8.783333, true, false, true, false, false, "50px-Flag_of_Equatorial_Guinea.svg.png"));
		lstCities.add(new City("Asmara", "Eritrea", "Africa", 15.333333, 38.933333, true, false, true, false, false, "50px-Flag_of_Eritrea.svg.png"));
		lstCities.add(new City("Addis Ababa", "Ethiopia", "Africa", 9.03, 38.74, true, false, true, false, false, "50px-Flag_of_Ethiopia.svg.png"));
		lstCities.add(new City("Libreville", "Gabon", "Africa", 0.3901, 9.4544, true, false, true, false, false, "50px-Flag_of_Gabon.svg.png"));
		lstCities.add(new City("Banjul", "Gambia", "Africa", 13.453056, -16.5775, true, true, false, false, false, "50px-Flag_of_The_Gambia.svg.png"));
		lstCities.add(new City("Accra", "Ghana", "Africa", 5.55, -0.2, true, false, true, false, false, "50px-Flag_of_Ghana.svg.png"));
		lstCities.add(new City("Kumasi", "Ghana", "Africa", 6.69, -1.63, false, false, false, true, false, "50px-Flag_of_Ghana.svg.png"));
		lstCities.add(new City("Conakry", "Guinea", "Africa", 9.509167, -13.712222, true, false, true, false, false, "50px-Flag_of_Guinea.svg.png"));
		lstCities.add(new City("Bissau", "Guinea-Bissau", "Africa", 11.85, -15.566667, true, false, true, false, false, "50px-Flag_of_Guinea-Bissau.svg.png"));
		lstCities.add(new City("Abidjan", "Ivory Coast", "Africa", 5.33, -4.03, false, false, false, true, false, "50px-Flag_of_Cote_d'Ivoire.svg.png"));
		lstCities.add(new City("Bouaké", "Ivory Coast", "Africa", 7.69, -5.03, false, false, false, true, false, "50px-Flag_of_Cote_d'Ivoire.svg.png"));
		lstCities.add(new City("Yamoussoukro", "Ivory Coast", "Africa", 6.816667, -5.283333, true, false, true, false, false, "50px-Flag_of_Cote_d'Ivoire.svg.png"));
		lstCities.add(new City("Mombasa", "Kenya", "Africa", -4.04, 39.66, false, false, false, true, false, "50px-Flag_of_Kenya.svg.png"));
		lstCities.add(new City("Nairobi", "Kenya", "Africa", -1.283333, 36.816667, true, true, false, false, false, "50px-Flag_of_Kenya.svg.png"));
		lstCities.add(new City("Bayrut", "Lebanon", "Africa", 33.89, 35.5, false, false, false, true, false, "50px-Flag_of_Lebanon.svg.png"));
		lstCities.add(new City("Maseru", "Lesotho", "Africa", -29.31, 27.48, true, false, true, false, false, "50px-Flag_of_Lesotho.svg.png"));
		lstCities.add(new City("Monrovia", "Liberia", "Africa", 6.313333, -10.801389, true, true, false, false, false, "50px-Flag_of_Liberia.svg.png"));
		lstCities.add(new City("Bangazi", "Libya", "Africa", 32.11, 20.08, false, false, false, true, false, "50px-Flag_of_Libya.svg.png"));
		lstCities.add(new City("Tarabulus", "Libya", "Africa", 32.83, 13.08, false, false, false, true, false, "50px-Flag_of_Libya.svg.png"));
		lstCities.add(new City("Tripoli", "Libya", "Africa", 32.902222, 13.185833, true, true, false, false, false, "50px-Flag_of_Libya.svg.png"));
		lstCities.add(new City("Antananarivo", "Madagascar", "Africa", -18.933333, 47.516667, true, false, true, false, false, "50px-Flag_of_Madagascar.svg.png"));
		lstCities.add(new City("Blantyre", "Malawi", "Africa", -15.79, 34.99, false, false, false, true, false, "50px-Flag_of_Malawi.svg.png"));
		lstCities.add(new City("Lilongwe", "Malawi", "Africa", -13.983333, 33.783333, true, false, true, false, false, "50px-Flag_of_Malawi.svg.png"));
		lstCities.add(new City("Bamako", "Mali", "Africa", 12.65, -8, true, true, false, false, false, "50px-Flag_of_Mali.svg.png"));
		lstCities.add(new City("Nouakchott", "Mauritania", "Africa", 18.1, -15.95, true, false, true, false, false, "50px-Flag_of_Mauritania.svg.png"));
		lstCities.add(new City("Port Louis", "Mauritius", "Africa", -20.166667, 57.516667, true, false, true, false, false, "50px-Flag_of_Mauritius.svg.png"));
		lstCities.add(new City("Mamoudzou", "Mayotte", "Africa", -12.780556, 45.227778, true, false, true, false, false, "50px-Flag_of_France.svg.png"));
		lstCities.add(new City("Agadir", "Morocco", "Africa", 30.42, -9.61, false, false, false, true, false, "50px-Flag_of_Morocco.svg.png"));
		lstCities.add(new City("Casablanca", "Morocco", "Africa", 33.6, -7.62, false, false, false, true, false, "50px-Flag_of_Morocco.svg.png"));
		lstCities.add(new City("Fez", "Morocco", "Africa", 34.05, -5, false, false, false, true, false, "50px-Flag_of_Morocco.svg.png"));
		lstCities.add(new City("Marrakesh", "Morocco", "Africa", 31.63, -8, false, false, false, true, false, "50px-Flag_of_Morocco.svg.png"));
		lstCities.add(new City("Meknes", "Morocco", "Africa", 33.9, -5.56, false, false, false, true, false, "50px-Flag_of_Morocco.svg.png"));
		lstCities.add(new City("Rabat", "Morocco", "Africa", 34.033333, -6.833333, true, true, false, false, false, "50px-Flag_of_Morocco.svg.png"));
		lstCities.add(new City("Tangier", "Morocco", "Africa", 35.79, -5.81, false, false, false, true, false, "50px-Flag_of_Morocco.svg.png"));
		lstCities.add(new City("Maputo", "Mozambique", "Africa", -25.966667, 32.583333, true, true, false, false, false, "50px-Flag_of_Mozambique.svg.png"));
		lstCities.add(new City("Matola", "Mozambique", "Africa", -25.97, 32.46, false, false, false, true, false, "50px-Flag_of_Mozambique.svg.png"));
		lstCities.add(new City("Nampula", "Mozambique", "Africa", -15.13, 39.24, false, false, false, true, false, "50px-Flag_of_Mozambique.svg.png"));
		lstCities.add(new City("Windhoek", "Namibia", "Africa", -22.57, 17.083611, true, false, true, false, false, "50px-Flag_of_Namibia.svg.png"));
		lstCities.add(new City("Niamey", "Niger", "Africa", 13.521389, 2.105278, true, true, false, false, false, "50px-Flag_of_Niger.svg.png"));
		lstCities.add(new City("Aba", "Nigeria", "Africa", 5.1, 7.35, false, false, false, true, false, "50px-Flag_of_Nigeria.svg.png"));
		lstCities.add(new City("Abeokuta", "Nigeria", "Africa", 7.16, 3.35, false, false, false, true, false, "50px-Flag_of_Nigeria.svg.png"));
		lstCities.add(new City("Abuja", "Nigeria", "Africa", 9.066667, 7.483333, true, true, false, false, false, "50px-Flag_of_Nigeria.svg.png"));
		lstCities.add(new City("Akure", "Nigeria", "Africa", 7.25, 5.19, false, false, false, true, false, "50px-Flag_of_Nigeria.svg.png"));
		lstCities.add(new City("Benin", "Nigeria", "Africa", 6.34, 5.62, false, false, false, true, false, "50px-Flag_of_Nigeria.svg.png"));
		lstCities.add(new City("Enugu", "Nigeria", "Africa", 6.44, 7.51, false, false, false, true, false, "50px-Flag_of_Nigeria.svg.png"));
		lstCities.add(new City("Ibadan", "Nigeria", "Africa", 7.38, 3.93, false, false, false, true, false, "50px-Flag_of_Nigeria.svg.png"));
		lstCities.add(new City("Ife", "Nigeria", "Africa", 7.48, 4.56, false, false, false, true, false, "50px-Flag_of_Nigeria.svg.png"));
		lstCities.add(new City("Ilorin", "Nigeria", "Africa", 8.49, 4.55, false, false, false, true, false, "50px-Flag_of_Nigeria.svg.png"));
		lstCities.add(new City("Jos", "Nigeria", "Africa", 9.93, 8.89, false, false, false, true, false, "50px-Flag_of_Nigeria.svg.png"));
		lstCities.add(new City("Kaduna", "Nigeria", "Africa", 10.52, 7.44, false, false, false, true, false, "50px-Flag_of_Nigeria.svg.png"));
		lstCities.add(new City("Kano", "Nigeria", "Africa", 12, 8.52, false, false, false, true, false, "50px-Flag_of_Nigeria.svg.png"));
		lstCities.add(new City("Lagos", "Nigeria", "Africa", 6.5, 3.35, false, false, false, true, false, "50px-Flag_of_Nigeria.svg.png"));
		lstCities.add(new City("Maiduguri", "Nigeria", "Africa", 11.85, 13.16, false, false, false, true, false, "50px-Flag_of_Nigeria.svg.png"));
		lstCities.add(new City("Onitsha", "Nigeria", "Africa", 6.14, 6.78, false, false, false, true, false, "50px-Flag_of_Nigeria.svg.png"));
		lstCities.add(new City("Oshogbo", "Nigeria", "Africa", 7.77, 4.56, false, false, false, true, false, "50px-Flag_of_Nigeria.svg.png"));
		lstCities.add(new City("Port Harcourt", "Nigeria", "Africa", 4.81, 7.01, false, false, false, true, false, "50px-Flag_of_Nigeria.svg.png"));
		lstCities.add(new City("Warri", "Nigeria", "Africa", 5.52, 5.76, false, false, false, true, false, "50px-Flag_of_Nigeria.svg.png"));
		lstCities.add(new City("Zaria", "Nigeria", "Africa", 11.08, 7.71, false, false, false, true, false, "50px-Flag_of_Nigeria.svg.png"));
		lstCities.add(new City("Saint-Denis", "Réunion", "Africa", -20.8789, 55.4481, true, false, true, false, false, "50px-Flag_of_France.svg.png"));
		lstCities.add(new City("Kigali", "Rwanda", "Africa", -1.943889, 30.059444, true, true, false, false, false, "50px-Flag_of_Rwanda.svg.png"));
		lstCities.add(new City("Sao Tomé", "Sao Tome and Principe", "Africa", 0.336111, 6.681389, true, false, true, false, false, "50px-Flag_of_Sao_Tome_and_Principe.svg.png"));
		lstCities.add(new City("Dakar", "Senegal", "Africa", 14.72, -17.48, false, false, false, true, false, "50px-Flag_of_Senegal.svg.png"));
		lstCities.add(new City("Dakar", "Senegal", "Africa", 14.692778, -17.446667, true, true, false, false, false, "50px-Flag_of_Senegal.svg.png"));
		lstCities.add(new City("Victoria", "Seychelles", "Africa", -4.6167, 55.45, true, false, true, false, false, "50px-Flag_of_the_Seychelles.svg.png"));
		lstCities.add(new City("Freetown", "Sierra Leone", "Africa", 8.49, -13.24, true, true, false, false, false, "50px-Flag_of_Somalia.svg.png"));
		lstCities.add(new City("Mogadishu", "Somalia", "Africa", 2.033333, 45.35, true, true, false, false, false, "50px-Flag_of_Somalia.svg.png"));
		lstCities.add(new City("Muqdisho", "Somalia", "Africa", 2.05, 45.33, false, false, false, true, false, "50px-Flag_of_Somalia.svg.png"));
		lstCities.add(new City("Hargeisa", "Somaliland", "Africa", 9.55, 44.066667, true, false, true, false, false, "50px-Flag_of_Somaliland.svg.png"));
		lstCities.add(new City("Benoni", "South Africa", "Africa", -26.15, 28.33, false, false, false, true, false, "50px-Flag_of_South_Africa.svg.png"));
		lstCities.add(new City("Cape Town", "South Africa", "Africa", -33.93, 18.46, false, false, false, true, false, "50px-Flag_of_South_Africa.svg.png"));
		lstCities.add(new City("Durban", "South Africa", "Africa", -29.87, 30.99, false, false, false, true, false, "50px-Flag_of_South_Africa.svg.png"));
		lstCities.add(new City("Johannesburg", "South Africa", "Africa", -26.19, 28.04, false, false, false, true, false, "50px-Flag_of_South_Africa.svg.png"));
		lstCities.add(new City("Pietermaritzburg", "South Africa", "Africa", -29.61, 30.39, false, false, false, true, false, "50px-Flag_of_South_Africa.svg.png"));
		lstCities.add(new City("Port Elizabeth", "South Africa", "Africa", -33.96, 25.59, false, false, false, true, false, "50px-Flag_of_South_Africa.svg.png"));
		lstCities.add(new City("Pretoria", "South Africa", "Africa", -25.753333, 28.186944, true, true, false, false, false, "50px-Flag_of_South_Africa.svg.png"));
		lstCities.add(new City("Soweto", "South Africa", "Africa", -26.28, 27.84, false, false, false, true, false, "50px-Flag_of_South_Africa.svg.png"));
		lstCities.add(new City("Tembisa", "South Africa", "Africa", -25.99, 28.22, false, false, false, true, false, "50px-Flag_of_South_Africa.svg.png"));
		lstCities.add(new City("Juba", "South Sudan", "Africa", 4.85, 31.6, true, false, true, false, false, "50px-Flag_of_South_Sudan.svg.png"));
		lstCities.add(new City("al-Hartum Bahr", "Sudan", "Africa", 15.64, 32.52, false, false, false, true, false, "50px-Flag_of_Sudan.svg.png"));
		lstCities.add(new City("Bur Sudan", "Sudan", "Africa", 19.63, 37.12, false, false, false, true, false, "50px-Flag_of_Sudan.svg.png"));
		lstCities.add(new City("Kassala", "Sudan", "Africa", 15.46, 36.39, false, false, false, true, false, "50px-Flag_of_Sudan.svg.png"));
		lstCities.add(new City("Khartoum", "Sudan", "Africa", 15.633333, 32.533333, true, true, false, false, false, "50px-Flag_of_Sudan.svg.png"));
		lstCities.add(new City("Kusti", "Sudan", "Africa", 13.17, 32.66, false, false, false, true, false, "50px-Flag_of_Sudan.svg.png"));
		lstCities.add(new City("Umm Durman", "Sudan", "Africa", 15.65, 32.48, false, false, false, true, false, "50px-Flag_of_Sudan.svg.png"));
		lstCities.add(new City("Mbabane", "Swaziland", "Africa", -26.316667, 31.133333, true, false, true, false, false, "50px-Flag_of_Swaziland.svg.png"));
		lstCities.add(new City("Dar es Salaam", "Tanzania", "Africa", -6.82, 39.28, false, false, false, true, false, "50px-Flag_of_Tanzania.svg.png"));
		lstCities.add(new City("Dodoma ", "Tanzania", "Africa", -6.173056, 35.741944, true, true, false, false, false, "50px-Flag_of_Tanzania.svg.png"));
		lstCities.add(new City("Mwanza", "Tanzania", "Africa", -2.52, 32.89, false, false, false, true, false, "50px-Flag_of_Tanzania.svg.png"));
		lstCities.add(new City("Lome", "Togo", "Africa", 6.137778, 1.2125, true, false, true, false, false, "50px-Flag_of_Togo.svg.png"));
		lstCities.add(new City("Tunis", "Tunisia", "Africa", 36.8, 10.183333, true, true, false, false, false, "50px-Flag_of_Tunisia.svg.png"));
		lstCities.add(new City("Kampala", "Uganda", "Africa", 0.313611, 32.581111, true, true, false, false, false, "50px-Flag_of_Uganda.svg.png"));
		lstCities.add(new City("Kitwe", "Zambia", "Africa", -12.81, 28.22, false, false, false, true, false, "50px-Flag_of_Zambia.svg.png"));
		lstCities.add(new City("Lusaka", "Zambia", "Africa", -15.416667, 28.283333, true, true, false, false, false, "50px-Flag_of_Zambia.svg.png"));
		lstCities.add(new City("Bulawayo", "Zimbabwe", "Africa", -20.17, 28.58, false, false, false, true, false, "50px-Flag_of_Zimbabwe.svg.png"));
		lstCities.add(new City("Harare", "Zimbabwe", "Africa", -17.863889, 31.029722, true, true, false, false, false, "50px-Flag_of_Zimbabwe.svg.png"));

		return lstCities;

	}
}
