package com.sillynamedvars.geomaster.util;

import com.google.android.maps.GeoPoint;
import com.sillynamedvars.geomaster.freeapp.GameConstants;


public class GeoTools {

	public static float distFrom(float lat1, float lng1, float lat2, float lng2) {
		double earthRadius = 3958.75;
		double dLat = Math.toRadians(lat2 - lat1);
		double dLng = Math.toRadians(lng2 - lng1);
		double a = Math.sin(dLat / 2) * Math.sin(dLat / 2) + Math.cos(Math.toRadians(lat1)) * Math.cos(Math.toRadians(lat2)) * Math.sin(dLng / 2) * Math.sin(dLng / 2);
		double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));
		double dist = earthRadius * c;

		int meterConversion = 1609;

		return new Float(dist * meterConversion).floatValue();
	}

	// public static double getDistanceBetweenPoints(GeoPoint p1, GeoPoint p2,
	// String unit) {
	//
	// // cities.add(new City("Valencia",-0.39,39.48));
	// // cities.add(new City("Barcelona",-64.72,10.13));
	//
	// double longitudep1 = -0.39;
	// double latitudep1 = 39.48;
	//
	// double longitudep2 = -64.72;
	// double latitudep2 = 10.13;
	//
	// double theta = longitudep1 - longitudep2;
	// double dist =
	// Math.sin(deg2rad(latitudep1)) * Math.sin(deg2rad(latitudep2))
	// + Math.cos(deg2rad(latitudep1)) * Math.cos(deg2rad(latitudep2))
	// * Math.cos(deg2rad(theta));
	// dist = Math.acos(dist);
	// dist = rad2deg(dist);
	// dist = dist * 60 * 1.1515;
	// if (unit.equals("K")) {
	// dist = dist * 1.609344;
	// } else if (unit.equals("M")) {
	// dist = dist * 0.8684;
	// }
	// return (dist);
	// }

	// public static Double deg2rad(double deg) {
	// return new Double(Math.PI * deg / 180);
	// }
	//
	// public static Double rad2deg(double rad) {
	// return Math.toDegrees(rad);
	//
	// }

	/*
	 * ::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::
	 * ::
	 */
	/* :: : */
	/* :: This routine calculates the distance between two points (given the : */
	/* :: latitude/longitude of those points). It is being used to calculate : */
	/* :: the distance between two ZIP Codes or Postal Codes using our : */
	/* :: ZIPCodeWorld(TM) and PostalCodeWorld(TM) products. : */
	/* :: : */
	/* :: Definitions: : */
	/* :: South latitudes are negative, east longitudes are positive : */
	/* :: : */
	/* :: Passed to function: : */
	/* :: lat1, lon1 = Latitude and Longitude of point 1 (in decimal degrees) : */
	/* :: lat2, lon2 = Latitude and Longitude of point 2 (in decimal degrees) : */
	/* :: unit = the unit you desire for results : */
	/* :: where: 'M' is statute miles : */
	/* :: 'K' is kilometers (default) : */
	/* :: 'N' is nautical miles : */
	/*
	 * :: United States ZIP Code/ Canadian Postal Code databases with latitude &
	 * :
	 */
	/* :: longitude are available at http://www.zipcodeworld.com : */
	/* :: : */
	/* :: For enquiries, please contact sales@zipcodeworld.com : */
	/* :: : */
	/* :: Official Web site: http://www.zipcodeworld.com : */
	/* :: : */
	/* :: Hexa Software Development Center © All Rights Reserved 2004 : */
	/* :: : */
	/*
	 * ::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::
	 * ::
	 */

	// public static double distance(double lat1, double lon1, double lat2,
	// double lon2,
	// String unit) {

	public static int distance(GeoPoint p1, GeoPoint p2, String unit) {
		// public static double distance() {

		double lat1 = p1.getLatitudeE6() / 1E6;
		double lon1 = p1.getLongitudeE6() / 1E6;
		double lat2 = p2.getLatitudeE6() / 1E6;
		double lon2 = p2.getLongitudeE6() / 1E6;

		// String unit = "K";

		// lon1 = -0.39;
		// lat1 = 39.48;
		//
		// lon2 = 2.17;
		// lat2 = 41.4;

		double theta = lon1 - lon2;
		double dist = Math.sin(deg2rad(lat1)) * Math.sin(deg2rad(lat2)) + Math.cos(deg2rad(lat1)) * Math.cos(deg2rad(lat2)) * Math.cos(deg2rad(theta));
		dist = Math.acos(dist);
		dist = rad2deg(dist);
		dist = dist * 60 * 1.1515;
		if (unit == GameConstants.DISTANCE_UNITS_KM) {
			dist = dist * 1.609344;
		} else if (unit == GameConstants.DISTANCE_UNITS_MILES) {
			dist = dist * 0.8684;
		}
		return ((int) dist);
	}

	/* ::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::: */
	/* :: This function converts decimal degrees to radians : */
	/* ::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::: */
	private static double deg2rad(double deg) {
		return (deg * Math.PI / 180.0);
	}

	/* ::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::: */
	/* :: This function converts radians to decimal degrees : */
	/* ::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::: */
	private static double rad2deg(double rad) {
		return (rad * 180.0 / Math.PI);
	}

	public static int convertDistanceToDiffUnit(int distance, String topScoreUnit, String distUnitPlayed) {

		int resDist = 0;

		if (topScoreUnit.equals(distUnitPlayed)) {

			resDist = distance;

		} else if (GameConstants.DISTANCE_UNITS_KM.equals(distUnitPlayed)) {

			resDist = convertMilesToKm(distance);

		} else {

			resDist = convertKmToMiles(distance);
		}

		return resDist;

	}

	public static int convertMilesToKm(int miles) {

		double km = miles / 0.621;

		// double km = miles / 1.609344;
		// // km = Math.round(km);
		// km *= 0.8684;

		km = Math.round(km);
		return (int) km;

	}

	public static int convertKmToMiles(int km) {

		double miles = km * 0.621;

		// double miles = km / 0.8684;
		// miles = Math.round(miles);
		// miles *= 1.609344;

		miles = Math.round(miles);
		return (int) miles;

	}
	// system.println(distance(32.9697, -96.80322, 29.46786, -98.53506, "M") +
	// " Miles\n");
	// system.println(distance(32.9697, -96.80322, 29.46786, -98.53506, "K") +
	// " Kilometers\n");
	// system.println(distance(32.9697, -96.80322, 29.46786, -98.53506, "N") +
	// " Nautical Miles\n");

}
