package com.sillynamedvars.geomaster.world;

import java.util.ArrayList;
import java.util.List;

import com.sillynamedvars.geomaster.model.City;
import com.sillynamedvars.geomaster.util.ApplicationUtils;

public abstract class AsiaConstants {

	public static List<City> createCitiesEasyAsia(int roundsToPlay) {

		List<City> cities = createCitiesAsia();
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

	public static List<City> createCitiesNormalAsia(int roundsToPlay) {

		List<City> cities = createCitiesAsia();
		List<City> citiesNormal = new ArrayList<City>();

		for (City normalCity : cities) {
			if (normalCity.isEasy() || normalCity.isNormal()) {
				citiesNormal.add(normalCity);
			}
		}

		List<City> citiesPlayed = ApplicationUtils.randomizeCities(citiesNormal, roundsToPlay);
		return citiesPlayed;

	}

	public static List<City> createCitiesHardAsia(int roundsToPlay) {

		List<City> cities = createCitiesAsia();
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

	public static List<City> createCitiesAsia() {

		List<City> lstCities = new ArrayList<City>();

		lstCities.add(new City("Sukhumi", "Abkhazia", "Asia", 43, 41.016667, true, false, false, true));
		lstCities.add(new City("Kabul", "Afghanistan", "Asia", 34.533056, 69.166111, true, true, false, false));
		lstCities.add(new City("Episkopi Cantonment", "Akrotiri and Dhekelia", "Asia", 34.666667, 32.85, true, false, false, true, false, "50px-Flag_of_the_United_Kingdom.svg.png"));
		lstCities.add(new City("Yerevan", "Armenia", "Asia", 40.183333, 44.516667, true, false, false, true));
		lstCities.add(new City("Baku", "Azerbaijan", "Asia", 40.395278, 49.882222, true, false, false, true));
		lstCities.add(new City("Manama", "Bahrain", "Asia", 26.216667, 50.583333, true, false, false, true));
		lstCities.add(new City("Chattagam", "Bangladesh", "Asia", 22.33, 91.81, false, false, false, true));
		lstCities.add(new City("Dhaka", "Bangladesh", "Asia", 23.7, 90.375, true, false, false, true));
		lstCities.add(new City("Khulna", "Bangladesh", "Asia", 22.84, 89.56, false, false, false, true));
		lstCities.add(new City("Narayanganj", "Bangladesh", "Asia", 23.62, 90.5, false, false, false, true));
		lstCities.add(new City("Rajshahi", "Bangladesh", "Asia", 24.37, 88.59, false, false, false, true));
		lstCities.add(new City("Thimphu", "Bhutan", "Asia", 27.466667, 89.641667, true, false, false, true));
		lstCities.add(new City("Diego Garcia", "British Indina Ocean Territory", "Asia", -7.3, 72.4, true, false, false, true, false, "50px-Flag_of_the_British_Indian_Ocean_Territory.svg.png"));
		lstCities.add(new City("Bandar Seri Begawan", "Brunei", "Asia", 4.890278, 114.942222, true, false, false, true));
		lstCities.add(new City("Phnom Penh", "Cambodia", "Asia", 11.55, 104.916667, true, false, true, false));
		// lstCities.add(new City("Anshan", "China", "Asia", 41.12, 122.95,
		// false, false, false, true));
		//
		// lstCities.add(new City("Anyang", "China", "Asia", 36.08, 114.35,
		// lstCities.add(new City("Aomen", "China", "Asia", 22.27, 113.56,
		// lstCities.add(new City("Baoding", "China", "Asia", 38.87, 115.48,
		// lstCities.add(new City("Baotou", "China", "Asia", 40.6, 110.05,
		lstCities.add(new City("Beijing", "China", "Asia", 39.913889, 116.391667, true, true, false, false, false, "50px-Flag_of_the_People's_Republic_of_China.svg.png"));
		// lstCities.add(new City("Bengbu", "China", "Asia", 32.95, 117.33,
		// lstCities.add(new City("Benxi", "China", "Asia", 41.33, 123.75,
		// lstCities.add(new City("Cangzhou", "China", "Asia", 38.32, 116.87,
		// lstCities.add(new City("Changchun", "China", "Asia", 43.87, 125.35,
		// lstCities.add(new City("Changde", "China", "Asia", 29.03, 111.68,
		// lstCities.add(new City("Changsha", "China", "Asia", 28.2, 112.97,
		// lstCities.add(new City("Changzhi", "China", "Asia", 35.22, 111.75,
		// lstCities.add(new City("Changzhou", "China", "Asia", 31.78, 119.97,
		// lstCities.add(new City("Chaoyang", "China", "Asia", 41.55, 120.42,
		// lstCities.add(new City("Chaozhou", "China", "Asia", 23.67, 116.64,
		// lstCities.add(new City("Chengdu", "China", "Asia", 30.67, 104.07,
		// lstCities.add(new City("Chongqing", "China", "Asia", 29.57, 106.58,
		// lstCities.add(new City("Dalian", "China", "Asia", 38.92, 121.65,
		// lstCities.add(new City("Dandong", "China", "Asia", 40.13, 124.4,
		// lstCities.add(new City("Datong", "China", "Asia", 40.08, 113.3,
		// lstCities.add(new City("Foshan", "China", "Asia", 23.03, 113.12,
		// lstCities.add(new City("Fushun", "China", "Asia", 41.87, 123.88,
		// lstCities.add(new City("Fuxin", "China", "Asia", 42.01, 121.65,
		// lstCities.add(new City("Fuzhou", "China", "Asia", 26.08, 119.3,
		lstCities.add(new City("Guangzhou", "China", "Asia", 23.12, 113.25, false, true, false, false, false, "50px-Flag_of_the_People's_Republic_of_China.svg.png"));
		lstCities.add(new City("Guilin", "China", "Asia", 25.28, 110.28, false, false, false, true, false, "50px-Flag_of_the_People's_Republic_of_China.svg.png"));
		// lstCities.add(new City("Guiyang", "China", "Asia", 26.58, 106.72,
		// lstCities.add(new City("Haikou", "China", "Asia", 20.05, 110.32,
		// lstCities.add(new City("Handan", "China", "Asia", 36.58, 114.48,
		lstCities.add(new City("Hangzhou", "China", "Asia", 30.25, 120.17, false, false, true, false, false, "50px-Flag_of_the_People's_Republic_of_China.svg.png"));
		// lstCities.add(new City("Harbin", "China", "Asia", 45.75, 126.65,
		// lstCities.add(new City("Hefei", "China", "Asia", 31.85, 117.28,
		// lstCities.add(new City("Hegang", "China", "Asia", 47.4, 130.37,
		// lstCities.add(new City("Hengyang", "China", "Asia", 26.89, 112.62,
		// lstCities.add(new City("Hohhot", "China", "Asia", 40.82, 111.64,
		// lstCities.add(new City("Huaibei", "China", "Asia", 33.95, 116.75,
		// lstCities.add(new City("Huainan", "China", "Asia", 32.63, 116.98,
		// lstCities.add(new City("Huaiyin", "China", "Asia", 33.58, 119.03,
		// lstCities.add(new City("Huangshi", "China", "Asia", 30.22, 115.1,
		// lstCities.add(new City("Jiamusi", "China", "Asia", 46.83, 130.35,
		// lstCities.add(new City("Jiangmen", "China", "Asia", 22.58, 113.08,
		// lstCities.add(new City("Jiaozuo", "China", "Asia", 35.25, 113.22,
		// lstCities.add(new City("Jilin", "China", "Asia", 43.85, 126.55,
		// lstCities.add(new City("Jinan", "China", "Asia", 36.67, 117, false,
		// false, false, true));
		// lstCities.add(new City("Jining", "China", "Asia", 35.4, 116.55,
		// lstCities.add(new City("Jinzhou", "China", "Asia", 41.12, 121.1,
		// lstCities.add(new City("Jiulong", "China", "Asia", 22.32, 114.17,
		// lstCities.add(new City("Kaifeng", "China", "Asia", 34.85, 114.35,
		// lstCities.add(new City("Kunming", "China", "Asia", 25.05, 102.7,
		// lstCities.add(new City("Langfang", "China", "Asia", 39.52, 116.68,
		// lstCities.add(new City("Lanzhou", "China", "Asia", 36.05, 103.68,
		// lstCities.add(new City("Liaoyang", "China", "Asia", 41.28, 123.18,
		// lstCities.add(new City("Liuzhou", "China", "Asia", 24.28, 109.25,
		// lstCities.add(new City("Luancheng", "China", "Asia", 37.88, 114.65,
		// lstCities.add(new City("Luohe", "China", "Asia", 33.57, 114.03,
		// lstCities.add(new City("Luoyang", "China", "Asia", 34.68, 112.47,
		// lstCities.add(new City("Maanshan", "China", "Asia", 31.73, 118.48,
		// lstCities.add(new City("Maoming", "China", "Asia", 21.92, 110.87,
		// lstCities.add(new City("Mudanjiang", "China", "Asia", 44.58, 129.6,
		// lstCities.add(new City("Nanchang", "China", "Asia", 28.68, 115.88,
		// lstCities.add(new City("Nanjing", "China", "Asia", 32.05, 118.78,
		// lstCities.add(new City("Nanning", "China", "Asia", 22.82, 108.32,
		// lstCities.add(new City("Nantong", "China", "Asia", 32.02, 120.82,
		// lstCities.add(new City("Neijiang", "China", "Asia", 29.58, 105.05,
		// lstCities.add(new City("Ningbo", "China", "Asia", 29.88, 121.55,
		// lstCities.add(new City("Panjin", "China", "Asia", 41.18, 122.05,
		// lstCities.add(new City("Pingdingshan", "China", "Asia", 33.73, 113.3,
		// lstCities.add(new City("Puyang", "China", "Asia", 35.7, 114.98,
		lstCities.add(new City("Qingdao", "China", "Asia", 36.07, 120.32, false, false, true, true, false, "50px-Flag_of_the_People's_Republic_of_China.svg.png"));
		// lstCities.add(new City("Qinhuangdao", "China", "Asia", 39.93, 119.62,
		// lstCities.add(new City("Qiqihar", "China", "Asia", 47.35, 124, false,
		// lstCities.add(new City("Rongcheng", "China", "Asia", 23.54, 116.34,
		lstCities.add(new City("Shanghai", "China", "Asia", 31.23, 121.47, false, true, false, false, false, "50px-Flag_of_the_People's_Republic_of_China.svg.png"));
		// lstCities.add(new City("Shantou", "China", "Asia", 23.37, 116.67,
		// lstCities.add(new City("Shaoguan", "China", "Asia", 24.8, 113.58,
		// lstCities.add(new City("Shaoxing", "China", "Asia", 30, 120.57,
		// lstCities.add(new City("Shaoyang", "China", "Asia", 27, 111.2, false,
		// lstCities.add(new City("Shashi", "China", "Asia", 30.32, 112.23,
		// lstCities.add(new City("Shatian", "China", "Asia", 22.38, 114.19,
		// lstCities.add(new City("Shenyang", "China", "Asia", 41.8, 123.45,
		lstCities.add(new City("Shenzhen", "China", "Asia", 22.53, 114.13, false, false, false, true, false, "50px-Flag_of_the_People's_Republic_of_China.svg.png"));
		// lstCities.add(new City("Shihezi", "China", "Asia", 44.3, 86.03,
		// lstCities.add(new City("Shijiazhuang", "China", "Asia", 38.05,
		// 114.48, false, false, false, true));
		// lstCities.add(new City("Shiongshui", "China", "Asia", 22.52, 114.12,
		// lstCities.add(new City("Siping", "China", "Asia", 43.17, 124.33,
		lstCities.add(new City("Suzhou", "China", "Asia", 31.3, 120.62, false, false, false, true, false, "50px-Flag_of_the_People's_Republic_of_China.svg.png"));
		// lstCities.add(new City("Taian", "China", "Asia", 36.2, 117.12, false,
		// lstCities.add(new City("Taiyuan", "China", "Asia", 37.87, 112.55,
		// lstCities.add(new City("Taizhou", "China", "Asia", 32.49, 119.9,
		// lstCities.add(new City("Tanggu", "China", "Asia", 39, 117.67, false,
		// lstCities.add(new City("Tangshan", "China", "Asia", 39.62, 118.19,
		// lstCities.add(new City("Tianjin", "China", "Asia", 39.13, 117.2,
		// lstCities.add(new City("Urumqi", "China", "Asia", 43.8, 87.58, false,
		// lstCities.add(new City("Wenzhou", "China", "Asia", 28.02, 120.65,
		// lstCities.add(new City("Wuhan", "China", "Asia", 30.58, 114.27,
		// lstCities.add(new City("Wuhu", "China", "Asia", 31.35, 118.37, false,
		// lstCities.add(new City("Wuxi", "China", "Asia", 31.58, 120.3, false,
		// lstCities.add(new City("Xiamen", "China", "Asia", 24.45, 118.08,
		lstCities.add(new City("Xian", "China", "Asia", 34.27, 108.9, false, false, false, true, false, "50px-Flag_of_the_People's_Republic_of_China.svg.png"));
		// lstCities.add(new City("Xianggangdao", "China", "Asia", 22.27,
		// 114.14, false, false, false, true));
		// lstCities.add(new City("Xiangtan", "China", "Asia", 27.85, 112.9,
		// lstCities.add(new City("Xianyang", "China", "Asia", 34.37, 108.7,
		// lstCities.add(new City("Xigong", "China", "Asia", 22.33, 114.25,
		// lstCities.add(new City("Xingtai", "China", "Asia", 37.07, 114.49,
		// lstCities.add(new City("Xining", "China", "Asia", 36.62, 101.77,
		// lstCities.add(new City("Xinxiang", "China", "Asia", 35.32, 113.87,
		// lstCities.add(new City("Xinyang", "China", "Asia", 32.13, 114.07,
		// lstCities.add(new City("Xuchang", "China", "Asia", 34.02, 113.82,
		// lstCities.add(new City("Xuzhou", "China", "Asia", 34.27, 117.18,
		// lstCities.add(new City("Yancheng", "China", "Asia", 33.39, 120.12,
		lstCities.add(new City("Yangzhou", "China", "Asia", 32.4, 119.43, false, false, false, true, false, "50px-Flag_of_the_People's_Republic_of_China.svg.png"));
		// lstCities.add(new City("Yantai", "China", "Asia", 37.53, 121.4,
		// lstCities.add(new City("Yingkou", "China", "Asia", 40.67, 122.28,
		// lstCities.add(new City("Yuanlong", "China", "Asia", 22.44, 114.02,
		// lstCities.add(new City("Yueyang", "China", "Asia", 29.38, 113.1,
		// lstCities.add(new City("Zhangdian", "China", "Asia", 36.8, 118.06,
		// lstCities.add(new City("Zhangjiakou", "China", "Asia", 40.83, 114.93,
		// lstCities.add(new City("Zhangzhou", "China", "Asia", 24.52, 117.67,
		// lstCities.add(new City("Zhanjiang", "China", "Asia", 21.2, 110.38,
		// lstCities.add(new City("Zhengzhou", "China", "Asia", 34.75, 113.67,
		// lstCities.add(new City("Zhenjiang", "China", "Asia", 32.22, 119.43,
		// lstCities.add(new City("Zhuhai", "China", "Asia", 22.28, 113.57,
		// lstCities.add(new City("Zhunmen", "China", "Asia", 22.41, 113.98,
		// lstCities.add(new City("Zhuzhou", "China", "Asia", 27.83, 113.15,
		// lstCities.add(new City("Zigong", "China", "Asia", 29.4, 104.78,
		// lstCities.add(new City("Zunyi", "China", "Asia", 27.7, 106.92, false,
		lstCities.add(new City("Flying Fish Cove", "Christmas Island", "Asia", -10.421667, 105.678056, true, false, false, true, false, "50px-Flag_of_Christmas_Island.svg.png"));
		lstCities.add(new City("West Island", "Cocos (Keeling Islands)", "Asia", -12.186944, 96.828333, true, false, false, true, false, "50px-Flag_of_the_Cocos_(Keeling)_Islands.svg.png"));
		lstCities.add(new City("Nicosia", "Cyprus", "Asia", 35.166667, 33.366667, true, false, true, false));
		lstCities.add(new City("Dili", "East Timor", "Asia", -8.55, 125.583333, true, false, true, false, false, "50px-Flag_of_East_Timor.svg.png"));
		lstCities.add(new City("Tbilisi", "Georgia", "Asia", 41.716667, 44.783333, true, false, true, false));
		lstCities.add(new City("Hong Kong", "Hong Kong", "Asia", 22.278333, 114.158889, true, true, false, false, false, "50px-Flag_of_Hong_Kong.svg.png"));
		lstCities.add(new City("Agra", "India", "Asia", 27.19, 78.01, false, false, false, true));
		// lstCities.add(new City("Ahmadabad", "India", "Asia", 23.03, 72.58,
		// lstCities.add(new City("Ajmer", "India", "Asia", 26.45, 74.64, false,
		// lstCities.add(new City("Aligarh", "India", "Asia", 27.89, 78.06,
		// lstCities.add(new City("Allahabad", "India", "Asia", 25.45, 81.84,
		// lstCities.add(new City("Amravati", "India", "Asia", 20.95, 77.76,
		// lstCities.add(new City("Amritsar", "India", "Asia", 31.64, 74.87,
		// lstCities.add(new City("Asansol", "India", "Asia", 23.69, 86.98,
		// lstCities.add(new City("Aurangabad", "India", "Asia", 19.89, 75.32,
		// lstCities.add(new City("Bangalore", "India", "Asia", 12.97, 77.56,
		// lstCities.add(new City("Bareli", "India", "Asia", 28.36, 79.41,
		// lstCities.add(new City("Bhatpara", "India", "Asia", 22.89, 88.42,
		// lstCities.add(new City("Bhavnagar", "India", "Asia", 21.79, 72.13,
		// lstCities.add(new City("Bhilai", "India", "Asia", 21.21, 81.38,
		// lstCities.add(new City("Bhiwandi", "India", "Asia", 19.3, 73.05,
		// lstCities.add(new City("Bhopal", "India", "Asia", 23.24, 77.4, false,
		// lstCities.add(new City("Bhubaneswar", "India", "Asia", 20.27, 85.84,
		// lstCities.add(new City("Bikaner", "India", "Asia", 28.03, 73.32,
		lstCities.add(new City("Bombay", "India", "Asia", 18.96, 72.82, false, true, false, false));
		lstCities.add(new City("Calcutta", "India", "Asia", 22.57, 88.36, false, false, false, true));
		// lstCities.add(new City("Chandigarh", "India", "Asia", 30.75, 76.78,
		// lstCities.add(new City("Dehra Dun", "India", "Asia", 30.34, 78.05,
		// lstCities.add(new City("Durgapur", "India", "Asia", 23.5, 87.31,
		// lstCities.add(new City("Faridabad", "India", "Asia", 28.38, 77.3,
		// lstCities.add(new City("Ghaziabad", "India", "Asia", 28.66, 77.41,
		// lstCities.add(new City("Gorakhpur", "India", "Asia", 26.76, 83.36,
		// lstCities.add(new City("Gulbarga", "India", "Asia", 17.34, 76.82,
		// lstCities.add(new City("Guntur", "India", "Asia", 16.31, 80.44,
		// lstCities.add(new City("Guwahati", "India", "Asia", 26.19, 91.75,
		// lstCities.add(new City("Gwalior", "India", "Asia", 26.23, 78.17,
		// lstCities.add(new City("Haora", "India", "Asia", 22.58, 88.33, false,
		// lstCities.add(new City("Hubli", "India", "Asia", 15.36, 75.13, false,
		// lstCities.add(new City("Hyderabad", "India", "Asia", 17.4, 78.48,
		// lstCities.add(new City("Indore", "India", "Asia", 22.72, 75.86,
		// lstCities.add(new City("Jabalpur", "India", "Asia", 23.17, 79.94,
		// lstCities.add(new City("Jaipur", "India", "Asia", 26.92, 75.8, false,
		// lstCities.add(new City("Jalandhar", "India", "Asia", 31.33, 75.57,
		// lstCities.add(new City("Jalgaon", "India", "Asia", 21.01, 75.56,
		// lstCities.add(new City("Jammu", "India", "Asia", 32.71, 74.85, false,
		// lstCities.add(new City("Jamnagar", "India", "Asia", 22.47, 70.07,
		// lstCities.add(new City("Jamshedpur", "India", "Asia", 22.79, 86.2,
		// lstCities.add(new City("Jodhpur", "India", "Asia", 26.29, 73.02,
		// lstCities.add(new City("Kalyan", "India", "Asia", 19.25, 73.16,
		// lstCities.add(new City("Kanpur", "India", "Asia", 26.47, 80.33,
		// lstCities.add(new City("Kataka", "India", "Asia", 20.47, 85.88,
		// lstCities.add(new City("Kolhapur", "India", "Asia", 16.7, 74.22,
		// lstCities.add(new City("Korba", "India", "Asia", 22.35, 82.69, false,
		// lstCities.add(new City("Kota", "India", "Asia", 25.18, 75.83, false,
		// lstCities.add(new City("Koyampattur", "India", "Asia", 11.01, 76.96,
		// lstCities.add(new City("Lakhnau", "India", "Asia", 26.85, 80.92,
		// lstCities.add(new City("Ludhiana", "India", "Asia", 30.91, 75.84,
		// lstCities.add(new City("Madras", "India", "Asia", 13.09, 80.27,
		// lstCities.add(new City("Madurai", "India", "Asia", 9.92, 78.12,
		// lstCities.add(new City("Maheshtala", "India", "Asia", 22.51, 88.23,
		// lstCities.add(new City("Maisuru", "India", "Asia", 12.31, 76.65,
		// lstCities.add(new City("Mira Bhayandar", "India", "Asia", 19.29,
		// 72.85, false, false, false, true));
		// lstCities.add(new City("Mirat", "India", "Asia", 28.99, 77.7, false,
		// lstCities.add(new City("Moradabad", "India", "Asia", 28.84, 78.76,
		// lstCities.add(new City("Nagpur", "India", "Asia", 21.16, 79.08,
		// false, false, true, false));
		// lstCities.add(new City("Nanded", "India", "Asia", 19.17, 77.29,
		// lstCities.add(new City("Nashik", "India", "Asia", 20.01, 73.78,
		// lstCities.add(new City("Navi Mumbai", "India", "Asia", 19.11, 73.06,
		// lstCities.add(new City("New Delhi", "India", "Asia", 28.613889,
		// 77.208889, true, true, false, false));
		// lstCities.add(new City("Noida", "India", "Asia", 28.58, 77.33, false,
		// lstCities.add(new City("Patna", "India", "Asia", 25.62, 85.13, false,
		// lstCities.add(new City("Pimpri", "India", "Asia", 18.62, 73.8, false,
		// lstCities.add(new City("Pune", "India", "Asia", 18.53, 73.84, false,
		// lstCities.add(new City("Raipur", "India", "Asia", 21.24, 81.63,
		// lstCities.add(new City("Rajkot", "India", "Asia", 22.31, 70.79,
		// lstCities.add(new City("Rajpur", "India", "Asia", 22.44, 88.44,
		// lstCities.add(new City("Ranchi", "India", "Asia", 23.36, 85.33,
		// lstCities.add(new City("Saharanpur", "India", "Asia", 29.97, 77.54,
		// lstCities.add(new City("Salem", "India", "Asia", 11.67, 78.16, false,
		// lstCities.add(new City("Sangli-Miraj", "India", "Asia", 16.86, 74.57,
		// lstCities.add(new City("Shiliguri", "India", "Asia", 26.73, 88.42,
		// lstCities.add(new City("Sholapur", "India", "Asia", 17.67, 75.89,
		// lstCities.add(new City("South Dum Dum", "India", "Asia", 22.61,
		// 88.41, false, false, false, true));
		// lstCities.add(new City("Srinagar", "India", "Asia", 34.09, 74.79,
		// lstCities.add(new City("Surat", "India", "Asia", 21.2, 72.82, false,
		// lstCities.add(new City("Thana", "India", "Asia", 19.2, 72.97, false,
		// lstCities.add(new City("Thiruvananthapur", "India", "Asia", 8.51,
		// 76.95, false, false, false, true));
		// lstCities.add(new City("Tiruchchirappall", "India", "Asia", 10.81,
		// 78.69, false, false, false, true));
		// lstCities.add(new City("Ulhasnagar", "India", "Asia", 19.23, 73.15,
		// lstCities.add(new City("Vadodara", "India", "Asia", 22.31, 73.18,
		// lstCities.add(new City("Varanasi", "India", "Asia", 25.32, 83.01,
		// lstCities.add(new City("Vijayawada", "India", "Asia", 16.52, 80.63,
		// lstCities.add(new City("Visakhapatnam", "India", "Asia", 17.73, 83.3,
		// lstCities.add(new City("Warangal", "India", "Asia", 18.01, 79.58,
		lstCities.add(new City("Jakarta", "Indonesia", "Asia", -6.2, 106.8, true, false, true, false));
		// lstCities.add(new City("Ahvaz", "Iran", "Asia", 31.28, 48.72, false,
		// lstCities.add(new City("Esfahan", "Iran", "Asia", 32.68, 51.68,
		// lstCities.add(new City("Karaj", "Iran", "Asia", 35.8, 50.97, false,
		// lstCities.add(new City("Kerman", "Iran", "Asia", 30.3, 57.08, false,
		// lstCities.add(new City("Kermanshah", "Iran", "Asia", 34.38, 47.06,
		// lstCities.add(new City("Mashhad", "Iran", "Asia", 36.27, 59.57,
		// lstCities.add(new City("Orumiyeh", "Iran", "Asia", 37.53, 45, false,
		// lstCities.add(new City("Qom", "Iran", "Asia", 34.65, 50.95, false,
		// lstCities.add(new City("Resht", "Iran", "Asia", 37.3, 49.63, false,
		// lstCities.add(new City("Shiraz", "Iran", "Asia", 29.63, 52.57, false,
		// lstCities.add(new City("Tabriz", "Iran", "Asia", 38.08, 46.3, false,
		lstCities.add(new City("Tehran", "Iran", "Asia", 35.683333, 51.416667, true, true, false, false));
		// lstCities.add(new City("Zahedan", "Iran", "Asia", 29.5, 60.83, false,
		lstCities.add(new City("al-Basrah", "Iraq", "Asia", 30.53, 47.82, false, false, false, true));
		// lstCities.add(new City("al-H?illah", "Iraq", "Asia", 32.48, 44.43,
		// false, false, false, true));
		lstCities.add(new City("al-Mawsil", "Iraq", "Asia", 36.34, 43.14, false, false, false, true));
		lstCities.add(new City("an-Najaf", "Iraq", "Asia", 32, 44.34, false, false, false, true));
		lstCities.add(new City("as-Sulaymaniyah", "Iraq", "Asia", 35.56, 45.43, false, false, false, true));
		lstCities.add(new City("Baghdad", "Iraq", "Asia", 33.325, 44.422, true, true, false, false));
		lstCities.add(new City("Irbil", "Iraq", "Asia", 36.18, 44.01, false, false, false, true));
		lstCities.add(new City("Karbala'", "Iraq", "Asia", 32.61, 44.03, false, false, false, true));
		lstCities.add(new City("Kirkuk", "Iraq", "Asia", 35.47, 44.39, false, false, false, true));
		lstCities.add(new City("Jerusalem", "Israel", "Asia", 31.783333, 35.216667, true, true, false, false));
		lstCities.add(new City("Chiba", "Japan", "Asia", 35.61, 140.11, false, false, false, true));
		lstCities.add(new City("Fukuoka", "Japan", "Asia", 33.59, 130.41, false, false, false, true));
		lstCities.add(new City("Funabashi", "Japan", "Asia", 35.7, 139.99, false, false, false, true));
		// lstCities.add(new City("Hachioji", "Japan", "Asia", 35.66, 139.33,
		// false, false, false, true));
		// lstCities.add(new City("Hamamatsu", "Japan", "Asia", 34.72, 137.73,
		// false, false, false, true));
		lstCities.add(new City("Higashiosaka", "Japan", "Asia", 34.67, 135.59, false, false, false, true));
		lstCities.add(new City("Hiroshima", "Japan", "Asia", 34.39, 132.44, false, false, false, true));
		lstCities.add(new City("Kagoshima", "Japan", "Asia", 31.59, 130.56, false, false, false, true));
		lstCities.add(new City("Kawasaki", "Japan", "Asia", 35.53, 139.7, false, false, false, true));
		// lstCities.add(new City("Kitakyushu", "Japan", "Asia", 33.88, 130.86,
		// false, false, false, true));
		lstCities.add(new City("Kobe", "Japan", "Asia", 34.68, 135.17, false, false, false, true));
		lstCities.add(new City("Kumamoto", "Japan", "Asia", 32.8, 130.71, false, false, false, true));
		lstCities.add(new City("Kyoto", "Japan", "Asia", 35.01, 135.75, false, false, false, true));
		lstCities.add(new City("Matsuyama", "Japan", "Asia", 33.84, 132.77, false, false, false, true));
		// lstCities.add(new City("Nagoya", "Japan", "Asia", 35.15, 136.91,
		// false, false, false, true));
		// lstCities.add(new City("Niigata", "Japan", "Asia", 37.92, 139.04,
		// false, false, false, true));
		lstCities.add(new City("Okayama", "Japan", "Asia", 34.67, 133.92, false, false, false, true));
		lstCities.add(new City("Osaka", "Japan", "Asia", 34.68, 135.5, false, true, false, false));
		lstCities.add(new City("Sagamihara", "Japan", "Asia", 35.58, 139.38, false, false, false, true));
		lstCities.add(new City("Saitama", "Japan", "Asia", 35.87, 139.64, false, false, false, true));
		lstCities.add(new City("Sakai", "Japan", "Asia", 34.57, 135.48, false, false, false, true));
		lstCities.add(new City("Sapporo", "Japan", "Asia", 43.06, 141.34, false, false, false, true));
		lstCities.add(new City("Sendai", "Japan", "Asia", 38.26, 140.89, false, false, false, true));
		// lstCities.add(new City("Shizuoka", "Japan", "Asia", 34.98, 138.39,
		// false, false, false, true));
		lstCities.add(new City("Tokyo", "Japan", "Asia", 35.700556, 139.715, true, true, false, false));
		lstCities.add(new City("Yokohama", "Japan", "Asia", 35.47, 139.62, false, false, false, true));
		lstCities.add(new City("Amman", "Jordan", "Asia", 31.933333, 35.933333, true, true, false, false));
		lstCities.add(new City("Almaty", "Kazakhstan", "Asia", 43.32, 76.92, false, false, false, true));
		lstCities.add(new City("Astana", "Kazakhstan", "Asia", 51.1807, 71.461, true, false, true, false));
		lstCities.add(new City("Hamhung", "Korea (North)", "Asia", 39.91, 127.54, false, false, false, true, false, "50px-Flag_of_North_Korea.svg.png"));
		lstCities.add(new City("Pyongyang", "Korea (North)", "Asia", 39.02, 125.75, false, false, false, true, false, "50px-Flag_of_North_Korea.svg.png"));
		// lstCities.add(new City("Ansan", "South Korea", "Asia", 37.35,
		// 126.86, false, false, false, true));
		lstCities.add(new City("Anyang", "South Korea", "Asia", 37.39, 126.92, false, false, false, true, false, "50px-Flag_of_South_Korea.svg.png"));
		lstCities.add(new City("Changwon", "South Korea", "Asia", 35.27, 128.62, false, false, false, true, false, "50px-Flag_of_South_Korea.svg.png"));
		lstCities.add(new City("Chonju", "South Korea", "Asia", 35.83, 127.14, false, false, false, true, false, "50px-Flag_of_South_Korea.svg.png"));
		lstCities.add(new City("Inchon", "South Korea", "Asia", 37.48, 126.64, false, false, false, true, false, "50px-Flag_of_South_Korea.svg.png"));
		lstCities.add(new City("Koyang", "South Korea", "Asia", 37.7, 126.93, false, false, false, true, false, "50px-Flag_of_South_Korea.svg.png"));
		lstCities.add(new City("Kwangju", "South Korea", "Asia", 35.16, 126.91, false, false, false, true, false, "50px-Flag_of_South_Korea.svg.png"));
		lstCities.add(new City("Puchon", "South Korea", "Asia", 37.48, 126.77, false, false, false, true, false, "50px-Flag_of_South_Korea.svg.png"));
		lstCities.add(new City("Pusan", "South Korea", "Asia", 35.11, 129.03, false, false, false, true, false, "50px-Flag_of_South_Korea.svg.png"));
		lstCities.add(new City("Shihung", "South Korea", "Asia", 37.46, 126.89, false, false, false, true, false, "50px-Flag_of_South_Korea.svg.png"));
		// lstCities.add(new City("Songnam", "South Korea", "Asia", 37.44,
		// 127.15, false, false, false, true, false,
		// "50px-Flag_of_South_Korea.svg.png"));
		// lstCities.add(new City("Soul", "South Korea", "Asia", 37.56, 126.99,
		// true, true, false, true, false, "50px-Flag_of_South_Korea.svg.png"));
		lstCities.add(new City("Suwon", "South Korea", "Asia", 37.26, 127.01, false, false, false, true, false, "50px-Flag_of_South_Korea.svg.png"));
		lstCities.add(new City("Taegu", "South Korea", "Asia", 35.87, 128.6, false, false, false, true, false, "50px-Flag_of_South_Korea.svg.png"));
		// lstCities.add(new City("Taejon", "South Korea", "Asia", 36.33,
		// 127.43, false, false, false, true, false,
		// "50px-Flag_of_South_Korea.svg.png"));
		lstCities.add(new City("Uijongbu", "South Korea", "Asia", 37.74, 127.04, false, false, false, true, false, "50px-Flag_of_South_Korea.svg.png"));
		lstCities.add(new City("Ulsan", "South Korea", "Asia", 35.55, 129.31, false, false, false, true, false, "50px-Flag_of_South_Korea.svg.png"));
		lstCities.add(new City("Kuwait City", "Kuwait", "Asia", 29.369722, 47.978333, true, true, false, false));
		lstCities.add(new City("Bishkek", "Kyrgyzstan", "Asia", 42.874722, 74.612222, true, false, false, true));
		lstCities.add(new City("Vientiane", "Laos", "Asia", 17.966667, 102.6, true, true, false, false));
		lstCities.add(new City("Beirut", "Lebanon", "Asia", 33.886944, 35.513056, true, true, false, false));
		lstCities.add(new City("Macau", "Macau", "Asia", 22.166667, 113.55, true, true, false, false));
		lstCities.add(new City("Ampang Jaya", "Malaysia", "Asia", 3.15, 101.77, false, false, false, true));
		lstCities.add(new City("Ipoh", "Malaysia", "Asia", 4.6, 101.07, false, false, false, true));
		lstCities.add(new City("Johor Bahru", "Malaysia", "Asia", 1.48, 103.75, false, false, false, true));
		// lstCities.add(new City("Klang", "Malaysia", "Asia", 3.04, 101.45,
		// false, false, false, true));
		lstCities.add(new City("Kota Kinabalu", "Malaysia", "Asia", 5.97, 116.07, false, false, false, true));
		lstCities.add(new City("Kuala Lumpur", "Malaysia", "Asia", 3.1357, 101.688, true, true, false, false));
		// lstCities.add(new City("Kuching", "Malaysia", "Asia", 1.55, 110.34,
		// false, false, false, true));
		// lstCities.add(new City("Petaling Jaya", "Malaysia", "Asia", 3.1,
		// 101.62, false, false, false, true));
		lstCities.add(new City("Sandakan", "Malaysia", "Asia", 5.85, 118.11, false, false, false, true));
		lstCities.add(new City("Shah Alam", "Malaysia", "Asia", 3.07, 101.56, false, false, false, true));
		lstCities.add(new City("Subang Jaya", "Malaysia", "Asia", 3.15, 101.53, false, false, false, true));
		lstCities.add(new City("Male", "Maldives", "Asia", 4.175, 73.508889, true, false, true, false));
		lstCities.add(new City("Ulaanbaatar", "Mongolia", "Asia", 47.92, 106.92, true, true, false, false));
		// lstCities.add(new City("Mandalay", "Myanmar", "Asia", 21.98, 96.09,
		// false, false, false, true));
		lstCities.add(new City("Mawlamyine", "Myanmar", "Asia", 16.49, 97.63, false, false, false, true));
		lstCities.add(new City("Rangoon", "Myanmar", "Asia", 16.79, 96.15, false, false, false, true));
		lstCities.add(new City("Naypyidaw", "Myanmar", "Asia", 19.75, 96.1, true, false, false, true));
		lstCities.add(new City("Stepanakert", "Nagorno-Kara bakh", "Asia", 39.815278, 46.751944, true, false, false, true));
		lstCities.add(new City("Kathmandu", "Nepal", "Asia", 27.7, 85.333333, true, true, false, false));
		lstCities.add(new City("Pyongyang", "North Korea", "Asia", 39.019444, 125.738056, true, true, false, false));
		// lstCities.add(new City("Nicosia", "Northern Cyprus", "Asia",
		// 35.166667, 33.366667, true, true, false, false));
		lstCities.add(new City("Muscat", "Oman", "Asia", 23.61, 58.54, true, false, true, false));
		// lstCities.add(new City("Bahawalpur", "Pakistan", "Asia", 29.39,
		// 71.67, false, false, false, true));
		// lstCities.add(new City("Faisalabad", "Pakistan", "Asia", 31.41,
		// 73.11, false, false, false, true));
		// lstCities.add(new City("Gujranwala", "Pakistan", "Asia", 32.16,
		// 74.18, false, false, false, true));
		lstCities.add(new City("Hyderabad", "Pakistan", "Asia", 25.38, 68.37, false, false, false, true));
		lstCities.add(new City("Islamabad", "Pakistan", "Asia", 33.716667, 73.066667, true, true, false, false));
		lstCities.add(new City("Karachi", "Pakistan", "Asia", 24.86, 67.01, false, false, false, true));
		// lstCities.add(new City("Lahore", "Pakistan", "Asia", 31.56, 74.35,
		// false, false, false, true));
		lstCities.add(new City("Multan", "Pakistan", "Asia", 30.2, 71.45, false, false, false, true));
		lstCities.add(new City("Peshawar", "Pakistan", "Asia", 34.01, 71.54, false, false, false, true));
		// lstCities.add(new City("Quetta", "Pakistan", "Asia", 30.21, 67.02,
		// false, false, false, true));
		// lstCities.add(new City("Rawalpindi", "Pakistan", "Asia", 33.6, 73.04,
		// false, false, false, true));
		lstCities.add(new City("Sargodha", "Pakistan", "Asia", 32.08, 72.67, false, false, false, true));
		lstCities.add(new City("Sialkot", "Pakistan", "Asia", 32.52, 74.55, false, false, false, true));
		lstCities.add(new City("Gazzah", "Palestine", "Asia", 31.53, 34.44, false, false, false, true));
		lstCities.add(new City("Ramallah", "Palestine", "Asia", 31.905128, 35.205878, true, true, false, false));
		// lstCities.add(new City("Antipolo", "Philippines", "Asia", 14.59,
		// 121.18, false, false, false, true, false,
		// "50px-Flag_of_the_Philippines.svg.png"));
		lstCities.add(new City("Cagayan", "Philippines", "Asia", 8.45, 124.67, false, false, false, true, false, "50px-Flag_of_the_Philippines.svg.png"));
		lstCities.add(new City("Calamba", "Philippines", "Asia", 14.21, 121.15, false, false, false, true, false, "50px-Flag_of_the_Philippines.svg.png"));
		// lstCities.add(new City("Cebu", "Philippines", "Asia", 10.32, 123.9,
		// false, false, false, true, false,
		// "50px-Flag_of_the_Philippines.svg.png"));
		// lstCities.add(new City("Dadiangas", "Philippines", "Asia", 6.1,
		// 125.25, false, false, false, true, false,
		// "50px-Flag_of_the_Philippines.svg.png"));
		// lstCities.add(new City("Dasmariñas", "Philippines", "Asia", 14.33,
		// 120.93, false, false, false, true, false,
		// "50px-Flag_of_the_Philippines.svg.png"));
		lstCities.add(new City("Davao", "Philippines", "Asia", 7.11, 125.63, false, false, false, true, false, "50px-Flag_of_the_Philippines.svg.png"));
		lstCities.add(new City("Manila", "Philippines", "Asia", 14.583333, 120.966667, true, true, false, false, false, "50px-Flag_of_the_Philippines.svg.png"));
		lstCities.add(new City("Zamboanga", "Philippines", "Asia", 6.92, 122.08, false, false, false, true, false, "50px-Flag_of_the_Philippines.svg.png"));
		lstCities.add(new City("Doha", "Qatar", "Asia", 25.286667, 51.533333, true, false, true, false));
		// lstCities.add(new City("ad-Dammam", "Saudi Arabia", "Asia", 26.43,
		// 50.1, false, false, false, true, false,
		// "50px-Flag_of_Saudi_Arabia.svg.png"));
		lstCities.add(new City("al-Madinah", "Saudi Arabia", "Asia", 24.48, 39.59, false, false, false, true, false, "50px-Flag_of_Saudi_Arabia.svg.png"));
		// lstCities.add(new City("at-Ta'if", "Saudi Arabia", "Asia", 21.26,
		// 40.38, false, false, false, true, false,
		// "50px-Flag_of_Saudi_Arabia.svg.png"));
		lstCities.add(new City("Jiddah", "Saudi Arabia", "Asia", 21.5, 39.17, false, false, false, true, false, "50px-Flag_of_Saudi_Arabia.svg.png"));
		lstCities.add(new City("Mecca", "Saudi Arabia", "Asia", 21.43, 39.82, false, true, false, true, false, "50px-Flag_of_Saudi_Arabia.svg.png"));
		lstCities.add(new City("Riyadh", "Saudi Arabia", "Asia", 24.711667, 46.724167, true, false, true, false, false, "50px-Flag_of_Saudi_Arabia.svg.png"));
		// lstCities.add(new City("Tabuk", "Saudi Arabia", "Asia", 28.39, 36.57,
		// false, false, false, true, false,
		// "50px-Flag_of_Saudi_Arabia.svg.png"));
		lstCities.add(new City("Singapore", "Singapore", "Asia", 1.283333, 103.833333, true, true, false, false));
		lstCities.add(new City("Bloemfontein", "South Africa", "Asia", -29.15, 26.23, false, false, false, true));
		lstCities.add(new City("Seoul", "South Korea", "Asia", 37.568889, 126.976667, true, true, false, false, false, "50px-Flag_of_South_Korea.svg.png"));
		lstCities.add(new City("Tskhinvali", "South Ossetia", "Asia", 42.233333, 43.966667, true, false, false, true));
		lstCities.add(new City("Colombo", "Sri Lanka", "Asia", 6.93, 79.85, false, false, false, true));
		lstCities.add(new City("Sri Jayawardenapura Kotte", "Sri Lanka", "Asia", 6.910833, 79.887836, true, false, true, false));
		lstCities.add(new City("Aleppo", "Syria", "Africa", 36.23, 37.17, false, false, false, true, false, "50px-Flag_of_Syria.svg.png"));
		lstCities.add(new City("Damascus", "Syria", "Africa", 33.5, 36.32, false, false, true, false, false, "50px-Flag_of_Syria.svg.png"));
		lstCities.add(new City("Hamah", "Syria", "Africa", 35.15, 36.73, false, false, false, true, false, "50px-Flag_of_Syria.svg.png"));
		lstCities.add(new City("Hims", "Syria", "Africa", 34.73, 36.72, false, false, false, true, false, "50px-Flag_of_Syria.svg.png"));

		// lstCities.add(new City("Banqiáo", "Taiwan", "Asia", 25.02, 121.44,
		// false, false, false, true, false,
		// "50px-Flag_of_the_Republic_of_China.svg.png"));
		// lstCities.add(new City("Gaoxióng", "Taiwan", "Asia", 22.63, 120.27,
		// false, false, false, true, false,
		// "50px-Flag_of_the_Republic_of_China.svg.png"));
		// lstCities.add(new City("Táinán", "Taiwan", "Asia", 23, 120.19, false,
		// false, false, true, false,
		// "50px-Flag_of_the_Republic_of_China.svg.png"));
		lstCities.add(new City("Taipei", "Taiwan", "Asia", 25.033333, 121.633333, true, true, false, false, false, "50px-Flag_of_the_Republic_of_China.svg.png"));
		// lstCities.add(new City("Táizhong", "Taiwan", "Asia", 24.15, 120.68,
		// false, false, false, true, false,
		// "50px-Flag_of_the_Republic_of_China.svg.png"));
		lstCities.add(new City("Dushanbe", "Tajikistan", "Asia", 38.536667, 68.78, true, false, true, false));
		lstCities.add(new City("Bangkok", "Thailand", "Asia", 13.752222, 100.493889, true, true, false, false));
		lstCities.add(new City("Ankara", "Turkey", "Asia", 39.875, 32.8333, true, true, false, false));
		lstCities.add(new City("Asgabat", "Turkmenistan", "Asia", 37.95, 58.38, false, false, false, true));
		lstCities.add(new City("Ashgabat", "Turkmenistan", "Asia", 37.933333, 58.366667, true, false, true, false));
		lstCities.add(new City("Abu Dhabi", "United Arab Emirates", "Asia", 24.466667, 54.366667, true, true, false, false, false, "50px-Flag_of_the_United_Arab_Emirates.svg.png"));
		lstCities.add(new City("Dubai", "United Arab Emirates", "Asia", 25.27, 55.33, false, false, false, true, false, "50px-Flag_of_the_United_Arab_Emirates.svg.png"));
		lstCities.add(new City("Sharjah", "United Arab Emirates", "Asia", 25.37, 55.41, false, false, false, true, false, "50px-Flag_of_the_United_Arab_Emirates.svg.png"));
		lstCities.add(new City("Tashkent", "Uzbekistan", "Asia", 41.266667, 69.216667, true, false, true, false));
		// lstCities.add(new City("H?i Phòng", "Vietnam", "Asia", 20.86, 106.68,
		// false, false, false, true));
		lstCities.add(new City("Hanoi", "Vietnam", "Asia", 21.033333, 105.85, true, true, false, false));
		lstCities.add(new City("Ho Chi Minh City", "Vietnam", "Asia", 10.78, 106.69, false, false, false, true));
		lstCities.add(new City("Adan", "Yemen", "Asia", 12.79, 45.03, false, false, false, true));
		lstCities.add(new City("Sana'a", "Yemen", "Asia", 15.348333, 44.206389, true, false, true, false));
		// lstCities.add(new City("Ta'izz", "Yemen", "Asia", 13.6, 44.04, false,
		// false, false, true));

		return lstCities;

	}
}
