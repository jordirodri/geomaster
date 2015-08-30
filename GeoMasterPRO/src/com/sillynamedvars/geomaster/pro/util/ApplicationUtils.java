package com.sillynamedvars.geomaster.pro.util;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import android.content.SharedPreferences;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.Typeface;
import android.widget.TextView;

import com.google.android.maps.GeoPoint;
import com.google.android.maps.MapView;
import com.google.android.maps.Projection;
import com.sillynamedvars.geomaster.pro.GameConstants;
import com.sillynamedvars.geomaster.pro.model.City;


public class ApplicationUtils {

	public static final String FONT_NAME = "fonts/disc.TTF";

	public static List<City> randomizeCities(List<City> citiesFull, int roundsToPlay) {

		List<City> citiesPlayed = new ArrayList<City>();
		List<City> citiesAux = new ArrayList<City>();
		citiesAux.addAll(citiesFull);

		while (citiesPlayed.size() < roundsToPlay) {

			long time2 = new Date().getTime();
			long randomNum = (time2 * 2) % citiesAux.size();
			int randomNum2 = (int) randomNum;

			City citySelected = citiesAux.get(randomNum2);
			citiesAux.remove(randomNum2);

			if (citySelected != null && !citiesPlayed.contains(citySelected)) {
				citiesPlayed.add(citySelected);
			}

		}

		return citiesPlayed;
	}

	public static void setLayoutFont(Typeface tf, TextView... params) {
		for (TextView tv : params) {
			tv.setTypeface(tf);
		}
	}

	public static char[] convertNumToCharArray(Integer num, Integer maxDigits) {

		char[] numberArray = { '0', '0', '0', '0', '0' };

		int posArray = maxDigits - 1;
		int numSize = num.toString().length();

		for (int i = numSize - 1; i >= 0; i--) {

			numberArray[posArray] = num.toString().charAt(i);
			posArray--;
		}

		return numberArray;
	}

	public static void drawLine(GeoPoint gP1, GeoPoint gP2, MapView mapView, Canvas canvas) {
		Paint mPaint = new Paint();
		mPaint.setDither(true);
		mPaint.setColor(Color.RED);
		mPaint.setStyle(Paint.Style.FILL_AND_STROKE);
		mPaint.setStrokeJoin(Paint.Join.ROUND);
		mPaint.setStrokeCap(Paint.Cap.ROUND);
		mPaint.setStrokeWidth(2);

		Point p1 = new Point();
		Point p2 = new Point();

		Path path = new Path();

		Projection projection = mapView.getProjection();
		projection.toPixels(gP1, p1);
		projection.toPixels(gP2, p2);

		path.moveTo(p2.x, p2.y);
		path.lineTo(p1.x, p1.y);

		canvas.drawPath(path, mPaint);

	}

	public static void fillGameText(TextView viewText, String text, int width, boolean isLink) {

		viewText.setWidth(width);
		if (isLink) {
			viewText.setClickable(true);
		} else {
			viewText.setText(text);
		}
		viewText.setPadding(4, 4, 4, 4);
		viewText.setTextColor(Color.WHITE);
		viewText.setTextSize(14);
		viewText.setLineSpacing(5, 1);
		viewText.setShadowLayer(1, 1, 1, 0);
		viewText.setTypeface(null, Typeface.BOLD);

	}

	public static Bitmap loadImageFlag(Resources res, City city) {

		Bitmap image = null;
		if ("Europe".equals(city.getContinent())) {

			image = loadImage(res, "img/flags/europe/" + city.getFlagImage());

		} else if ("Africa".equals(city.getContinent())) {

			image = loadImage(res, "img/flags/africa/" + city.getFlagImage());

		} else if ("Asia".equals(city.getContinent())) {

			image = loadImage(res, "img/flags/asia/" + city.getFlagImage());

		} else if ("Oceania".equals(city.getContinent())) {

			image = loadImage(res, "img/flags/oceania/" + city.getFlagImage());

		} else if ("America".equals(city.getContinent())) {

			image = loadImage(res, "img/flags/america/" + city.getFlagImage());

		} else if ("US States".equals(city.getContinent())) {

			image = loadImage(res, "img/flags/us-states/" + city.getFlagImage());

		}

		return image;

	}

	public static Bitmap loadImage(Resources res, String imgName) {

		InputStream is = null;
		try {
			is = res.getAssets().open(imgName);
		} catch (IOException e) {
			e.getCause();
		}

		Bitmap image = null;
		if (is != null) {
			image = BitmapFactory.decodeStream(is);
		}
		return image;

	}

	public static void saveSharedPreferences(SharedPreferences prefs, String prefName, int value) {

		SharedPreferences.Editor editor = prefs.edit();
		editor.putInt(prefName, value);
		editor.commit();
	}

	public static void saveSharedPreferences(SharedPreferences prefs, String prefName, String value) {

		SharedPreferences.Editor editor = prefs.edit();
		editor.putString(prefName, value);
		editor.commit();
	}

	public static String loadSharedPreferences(SharedPreferences prefs, String prefName, String defValue) {

		return prefs.getString(prefName, defValue);
	}

	public static int loadSharedPreferences(SharedPreferences prefs, String prefName, int defValue) {

		return prefs.getInt(prefName, defValue);
	}

	public static Integer updateScoreGameTop5(SharedPreferences prefs, int score, String difficulty, String map, String distanceUnit) {

		Integer rankPosition = null;

		if (GameConstants.DIFFICULTY_EASY.equals(difficulty)) {

			rankPosition = updateEasyGameTop5(prefs, score, map, distanceUnit);

		} else if (GameConstants.DIFFICULTY_NORMAL.equals(difficulty)) {

			rankPosition = updateNormalGameTop5(prefs, score, map, distanceUnit);

		} else if (GameConstants.DIFFICULTY_HARD.equals(difficulty)) {

			rankPosition = updateHardGameTop5(prefs, score, map, distanceUnit);

		}

		return rankPosition;
	}

	private static Integer updateEasyGameTop5(SharedPreferences prefs, int score, String map, String distanceUnit) {

		Integer rankPosition = null;

		int maxValue = 999999999;

		int top1 = 0;
		int top2 = 0;
		int top3 = 0;
		int top4 = 0;
		int top5 = 0;

		top1 = loadSharedPreferences(prefs, GameConstants.TOP1_EASY_SCORE, maxValue);
		top2 = loadSharedPreferences(prefs, GameConstants.TOP2_EASY_SCORE, maxValue);
		top3 = loadSharedPreferences(prefs, GameConstants.TOP3_EASY_SCORE, maxValue);
		top4 = loadSharedPreferences(prefs, GameConstants.TOP4_EASY_SCORE, maxValue);
		top5 = loadSharedPreferences(prefs, GameConstants.TOP5_EASY_SCORE, maxValue);

		String top1DistUnit = loadSharedPreferences(prefs, GameConstants.TOP1_EASY_DISTANCE_UNIT, GameConstants.DISTANCE_UNITS_KM);
		String top2DistUnit = loadSharedPreferences(prefs, GameConstants.TOP2_EASY_DISTANCE_UNIT, GameConstants.DISTANCE_UNITS_KM);
		String top3DistUnit = loadSharedPreferences(prefs, GameConstants.TOP3_EASY_DISTANCE_UNIT, GameConstants.DISTANCE_UNITS_KM);
		String top4DistUnit = loadSharedPreferences(prefs, GameConstants.TOP4_EASY_DISTANCE_UNIT, GameConstants.DISTANCE_UNITS_KM);
		String top5DistUnit = loadSharedPreferences(prefs, GameConstants.TOP5_EASY_DISTANCE_UNIT, GameConstants.DISTANCE_UNITS_KM);

		SharedPreferences.Editor editor = prefs.edit();

		if (score <= GeoTools.convertDistanceToDiffUnit(top1, top1DistUnit, distanceUnit)) {
			moveOthersEasyGameTop5(prefs, 1);
			editor.putInt(GameConstants.TOP1_EASY_SCORE, score);
			editor.putString(GameConstants.TOP1_EASY_MAP, map);
			editor.putString(GameConstants.TOP1_EASY_DISTANCE_UNIT, distanceUnit);
			rankPosition = 1;

		} else if (score <= GeoTools.convertDistanceToDiffUnit(top2, top2DistUnit, distanceUnit)) {
			moveOthersEasyGameTop5(prefs, 2);
			editor.putInt(GameConstants.TOP2_EASY_SCORE, score);
			editor.putString(GameConstants.TOP2_EASY_MAP, map);
			editor.putString(GameConstants.TOP2_EASY_DISTANCE_UNIT, distanceUnit);
			rankPosition = 2;

		} else if (score <= GeoTools.convertDistanceToDiffUnit(top3, top3DistUnit, distanceUnit)) {
			moveOthersEasyGameTop5(prefs, 3);
			editor.putInt(GameConstants.TOP3_EASY_SCORE, score);
			editor.putString(GameConstants.TOP3_EASY_MAP, map);
			editor.putString(GameConstants.TOP3_EASY_DISTANCE_UNIT, distanceUnit);
			rankPosition = 3;

		} else if (score <= GeoTools.convertDistanceToDiffUnit(top4, top4DistUnit, distanceUnit)) {
			moveOthersEasyGameTop5(prefs, 4);
			editor.putInt(GameConstants.TOP4_EASY_SCORE, score);
			editor.putString(GameConstants.TOP4_EASY_MAP, map);
			editor.putString(GameConstants.TOP4_EASY_DISTANCE_UNIT, distanceUnit);
			rankPosition = 4;

		} else if (score <= GeoTools.convertDistanceToDiffUnit(top5, top5DistUnit, distanceUnit)) {

			editor.putInt(GameConstants.TOP5_EASY_SCORE, score);
			editor.putString(GameConstants.TOP5_EASY_MAP, map);
			editor.putString(GameConstants.TOP5_EASY_DISTANCE_UNIT, distanceUnit);
			rankPosition = 5;
		}

		editor.commit();

		return rankPosition;

	}

	private static Integer updateNormalGameTop5(SharedPreferences prefs, int score, String map, String distanceUnit) {

		Integer rankPosition = null;

		int maxValue = 999999999;
		int top1 = 0;
		int top2 = 0;
		int top3 = 0;
		int top4 = 0;
		int top5 = 0;

		top1 = loadSharedPreferences(prefs, GameConstants.TOP1_NORMAL_SCORE, maxValue);
		top2 = loadSharedPreferences(prefs, GameConstants.TOP2_NORMAL_SCORE, maxValue);
		top3 = loadSharedPreferences(prefs, GameConstants.TOP3_NORMAL_SCORE, maxValue);
		top4 = loadSharedPreferences(prefs, GameConstants.TOP4_NORMAL_SCORE, maxValue);
		top5 = loadSharedPreferences(prefs, GameConstants.TOP5_NORMAL_SCORE, maxValue);

		String top1DistUnit = loadSharedPreferences(prefs, GameConstants.TOP1_NORMAL_DISTANCE_UNIT, GameConstants.DISTANCE_UNITS_KM);
		String top2DistUnit = loadSharedPreferences(prefs, GameConstants.TOP2_NORMAL_DISTANCE_UNIT, GameConstants.DISTANCE_UNITS_KM);
		String top3DistUnit = loadSharedPreferences(prefs, GameConstants.TOP3_NORMAL_DISTANCE_UNIT, GameConstants.DISTANCE_UNITS_KM);
		String top4DistUnit = loadSharedPreferences(prefs, GameConstants.TOP4_NORMAL_DISTANCE_UNIT, GameConstants.DISTANCE_UNITS_KM);
		String top5DistUnit = loadSharedPreferences(prefs, GameConstants.TOP5_NORMAL_DISTANCE_UNIT, GameConstants.DISTANCE_UNITS_KM);

		SharedPreferences.Editor editor = prefs.edit();

		if (score <= GeoTools.convertDistanceToDiffUnit(top1, top1DistUnit, distanceUnit)) {
			moveOthersNormalGameTop5(prefs, 1);
			editor.putInt(GameConstants.TOP1_NORMAL_SCORE, score);
			editor.putString(GameConstants.TOP1_NORMAL_MAP, map);
			editor.putString(GameConstants.TOP1_NORMAL_DISTANCE_UNIT, distanceUnit);
			rankPosition = 1;

		} else if (score <= GeoTools.convertDistanceToDiffUnit(top2, top2DistUnit, distanceUnit)) {
			moveOthersNormalGameTop5(prefs, 2);
			editor.putInt(GameConstants.TOP2_NORMAL_SCORE, score);
			editor.putString(GameConstants.TOP2_NORMAL_MAP, map);
			editor.putString(GameConstants.TOP2_NORMAL_DISTANCE_UNIT, distanceUnit);
			rankPosition = 2;

		} else if (score <= GeoTools.convertDistanceToDiffUnit(top3, top3DistUnit, distanceUnit)) {
			moveOthersNormalGameTop5(prefs, 3);
			editor.putInt(GameConstants.TOP3_NORMAL_SCORE, score);
			editor.putString(GameConstants.TOP3_NORMAL_MAP, map);
			editor.putString(GameConstants.TOP3_NORMAL_DISTANCE_UNIT, distanceUnit);
			rankPosition = 3;

		} else if (score <= GeoTools.convertDistanceToDiffUnit(top4, top4DistUnit, distanceUnit)) {
			moveOthersNormalGameTop5(prefs, 4);
			editor.putInt(GameConstants.TOP4_NORMAL_SCORE, score);
			editor.putString(GameConstants.TOP4_NORMAL_MAP, map);
			editor.putString(GameConstants.TOP4_NORMAL_DISTANCE_UNIT, distanceUnit);
			rankPosition = 4;

		} else if (score <= GeoTools.convertDistanceToDiffUnit(top5, top5DistUnit, distanceUnit)) {

			editor.putInt(GameConstants.TOP5_NORMAL_SCORE, score);
			editor.putString(GameConstants.TOP5_NORMAL_MAP, map);
			editor.putString(GameConstants.TOP5_NORMAL_DISTANCE_UNIT, distanceUnit);
			rankPosition = 5;

		}

		editor.commit();

		return rankPosition;

	}

	private static Integer updateHardGameTop5(SharedPreferences prefs, int score, String map, String distanceUnit) {

		Integer rankPosition = null;

		int maxValue = 999999999;

		int top1 = 0;
		int top2 = 0;
		int top3 = 0;
		int top4 = 0;
		int top5 = 0;

		top1 = loadSharedPreferences(prefs, GameConstants.TOP1_HARD_SCORE, maxValue);
		top2 = loadSharedPreferences(prefs, GameConstants.TOP2_HARD_SCORE, maxValue);
		top3 = loadSharedPreferences(prefs, GameConstants.TOP3_HARD_SCORE, maxValue);
		top4 = loadSharedPreferences(prefs, GameConstants.TOP4_HARD_SCORE, maxValue);
		top5 = loadSharedPreferences(prefs, GameConstants.TOP5_HARD_SCORE, maxValue);

		String top1DistUnit = loadSharedPreferences(prefs, GameConstants.TOP1_HARD_DISTANCE_UNIT, GameConstants.DISTANCE_UNITS_KM);
		String top2DistUnit = loadSharedPreferences(prefs, GameConstants.TOP2_HARD_DISTANCE_UNIT, GameConstants.DISTANCE_UNITS_KM);
		String top3DistUnit = loadSharedPreferences(prefs, GameConstants.TOP3_HARD_DISTANCE_UNIT, GameConstants.DISTANCE_UNITS_KM);
		String top4DistUnit = loadSharedPreferences(prefs, GameConstants.TOP4_HARD_DISTANCE_UNIT, GameConstants.DISTANCE_UNITS_KM);
		String top5DistUnit = loadSharedPreferences(prefs, GameConstants.TOP5_HARD_DISTANCE_UNIT, GameConstants.DISTANCE_UNITS_KM);

		SharedPreferences.Editor editor = prefs.edit();

		if (score <= GeoTools.convertDistanceToDiffUnit(top1, top1DistUnit, distanceUnit)) {
			moveOthersHardGameTop5(prefs, 1);
			editor.putInt(GameConstants.TOP1_HARD_SCORE, score);
			editor.putString(GameConstants.TOP1_HARD_MAP, map);
			editor.putString(GameConstants.TOP1_HARD_DISTANCE_UNIT, distanceUnit);
			rankPosition = 1;

		} else if (score <= GeoTools.convertDistanceToDiffUnit(top2, top2DistUnit, distanceUnit)) {
			moveOthersHardGameTop5(prefs, 2);
			editor.putInt(GameConstants.TOP2_HARD_SCORE, score);
			editor.putString(GameConstants.TOP2_HARD_MAP, map);
			editor.putString(GameConstants.TOP2_HARD_DISTANCE_UNIT, distanceUnit);
			rankPosition = 2;

		} else if (score <= GeoTools.convertDistanceToDiffUnit(top3, top3DistUnit, distanceUnit)) {
			moveOthersHardGameTop5(prefs, 3);
			editor.putInt(GameConstants.TOP3_HARD_SCORE, score);
			editor.putString(GameConstants.TOP3_HARD_MAP, map);
			editor.putString(GameConstants.TOP3_HARD_DISTANCE_UNIT, distanceUnit);
			rankPosition = 3;

		} else if (score <= GeoTools.convertDistanceToDiffUnit(top4, top4DistUnit, distanceUnit)) {
			moveOthersHardGameTop5(prefs, 4);
			editor.putInt(GameConstants.TOP4_HARD_SCORE, score);
			editor.putString(GameConstants.TOP4_HARD_MAP, map);
			editor.putString(GameConstants.TOP4_HARD_DISTANCE_UNIT, distanceUnit);
			rankPosition = 4;

		} else if (score <= GeoTools.convertDistanceToDiffUnit(top5, top5DistUnit, distanceUnit)) {

			editor.putInt(GameConstants.TOP5_HARD_SCORE, score);
			editor.putString(GameConstants.TOP5_HARD_MAP, map);
			editor.putString(GameConstants.TOP5_HARD_DISTANCE_UNIT, distanceUnit);
			rankPosition = 5;
		}

		editor.commit();

		return rankPosition;

	}

	private static void moveOthersEasyGameTop5(SharedPreferences prefs, int position) {

		SharedPreferences.Editor editor = prefs.edit();

		int top1Score = loadSharedPreferences(prefs, GameConstants.TOP1_EASY_SCORE, 0);
		int top2Score = loadSharedPreferences(prefs, GameConstants.TOP2_EASY_SCORE, 0);
		int top3Score = loadSharedPreferences(prefs, GameConstants.TOP3_EASY_SCORE, 0);
		int top4Score = loadSharedPreferences(prefs, GameConstants.TOP4_EASY_SCORE, 0);

		String top1Map = loadSharedPreferences(prefs, GameConstants.TOP1_EASY_MAP, "");
		String top2Map = loadSharedPreferences(prefs, GameConstants.TOP2_EASY_MAP, "");
		String top3Map = loadSharedPreferences(prefs, GameConstants.TOP3_EASY_MAP, "");
		String top4Map = loadSharedPreferences(prefs, GameConstants.TOP4_EASY_MAP, "");

		String top1DistUnit = loadSharedPreferences(prefs, GameConstants.TOP1_EASY_DISTANCE_UNIT, "");
		String top2DistUnit = loadSharedPreferences(prefs, GameConstants.TOP2_EASY_DISTANCE_UNIT, "");
		String top3DistUnit = loadSharedPreferences(prefs, GameConstants.TOP3_EASY_DISTANCE_UNIT, "");
		String top4DistUnit = loadSharedPreferences(prefs, GameConstants.TOP4_EASY_DISTANCE_UNIT, "");

		switch (position) {

		case 1:
			if (top4Score != 0) {
				editor.putInt(GameConstants.TOP5_EASY_SCORE, top4Score);
				editor.putString(GameConstants.TOP5_EASY_MAP, top4Map);
				editor.putString(GameConstants.TOP5_EASY_DISTANCE_UNIT, top4DistUnit);
			}

			if (top3Score != 0) {
				editor.putInt(GameConstants.TOP4_EASY_SCORE, top3Score);
				editor.putString(GameConstants.TOP4_EASY_MAP, top3Map);
				editor.putString(GameConstants.TOP4_EASY_DISTANCE_UNIT, top3DistUnit);
			}

			if (top2Score != 0) {

				editor.putInt(GameConstants.TOP3_EASY_SCORE, top2Score);
				editor.putString(GameConstants.TOP3_EASY_MAP, top2Map);
				editor.putString(GameConstants.TOP3_EASY_DISTANCE_UNIT, top2DistUnit);
			}

			if (top1Score != 0) {
				editor.putInt(GameConstants.TOP2_EASY_SCORE, top1Score);
				editor.putString(GameConstants.TOP2_EASY_MAP, top1Map);
				editor.putString(GameConstants.TOP2_EASY_DISTANCE_UNIT, top1DistUnit);
			}

			break;
		case 2:

			if (top4Score != 0) {
				editor.putInt(GameConstants.TOP5_EASY_SCORE, top4Score);
				editor.putString(GameConstants.TOP5_EASY_MAP, top4Map);
				editor.putString(GameConstants.TOP5_EASY_DISTANCE_UNIT, top4DistUnit);

			}

			if (top3Score != 0) {
				editor.putInt(GameConstants.TOP4_EASY_SCORE, top3Score);
				editor.putString(GameConstants.TOP4_EASY_MAP, top3Map);
				editor.putString(GameConstants.TOP4_EASY_DISTANCE_UNIT, top3DistUnit);
			}

			if (top2Score != 0) {
				editor.putInt(GameConstants.TOP3_EASY_SCORE, top2Score);
				editor.putString(GameConstants.TOP3_EASY_MAP, top2Map);
				editor.putString(GameConstants.TOP3_EASY_DISTANCE_UNIT, top2DistUnit);
			}
			break;

		case 3:
			if (top4Score != 0) {
				editor.putInt(GameConstants.TOP5_EASY_SCORE, top4Score);
				editor.putString(GameConstants.TOP5_EASY_MAP, top4Map);
				editor.putString(GameConstants.TOP5_EASY_DISTANCE_UNIT, top4DistUnit);

			}

			if (top3Score != 0) {
				editor.putInt(GameConstants.TOP4_EASY_SCORE, top3Score);
				editor.putString(GameConstants.TOP4_EASY_MAP, top3Map);
				editor.putString(GameConstants.TOP4_EASY_DISTANCE_UNIT, top3DistUnit);
			}

			break;

		case 4:

			if (top4Score != 0) {
				editor.putInt(GameConstants.TOP5_EASY_SCORE, top4Score);
				editor.putString(GameConstants.TOP5_EASY_MAP, top4Map);
				editor.putString(GameConstants.TOP5_EASY_DISTANCE_UNIT, top4DistUnit);

			}
			break;

		/*
		 * case 5:
		 * 
		 * break;
		 */

		default:

		}

		editor.commit();

	}

	private static void moveOthersNormalGameTop5(SharedPreferences prefs, int position) {

		SharedPreferences.Editor editor = prefs.edit();

		int top1Score = loadSharedPreferences(prefs, GameConstants.TOP1_NORMAL_SCORE, 0);
		int top2Score = loadSharedPreferences(prefs, GameConstants.TOP2_NORMAL_SCORE, 0);
		int top3Score = loadSharedPreferences(prefs, GameConstants.TOP3_NORMAL_SCORE, 0);
		int top4Score = loadSharedPreferences(prefs, GameConstants.TOP4_NORMAL_SCORE, 0);

		String top1Map = loadSharedPreferences(prefs, GameConstants.TOP1_NORMAL_MAP, "");
		String top2Map = loadSharedPreferences(prefs, GameConstants.TOP2_NORMAL_MAP, "");
		String top3Map = loadSharedPreferences(prefs, GameConstants.TOP3_NORMAL_MAP, "");
		String top4Map = loadSharedPreferences(prefs, GameConstants.TOP4_NORMAL_MAP, "");

		String top1DistUnit = loadSharedPreferences(prefs, GameConstants.TOP1_NORMAL_DISTANCE_UNIT, "");
		String top2DistUnit = loadSharedPreferences(prefs, GameConstants.TOP2_NORMAL_DISTANCE_UNIT, "");
		String top3DistUnit = loadSharedPreferences(prefs, GameConstants.TOP3_NORMAL_DISTANCE_UNIT, "");
		String top4DistUnit = loadSharedPreferences(prefs, GameConstants.TOP4_NORMAL_DISTANCE_UNIT, "");

		switch (position) {

		case 1:
			if (top4Score != 0) {
				editor.putInt(GameConstants.TOP5_NORMAL_SCORE, top4Score);
				editor.putString(GameConstants.TOP5_NORMAL_MAP, top4Map);
				editor.putString(GameConstants.TOP5_NORMAL_DISTANCE_UNIT, top4DistUnit);
			}

			if (top3Score != 0) {
				editor.putInt(GameConstants.TOP4_NORMAL_SCORE, top3Score);
				editor.putString(GameConstants.TOP4_NORMAL_MAP, top3Map);
				editor.putString(GameConstants.TOP4_NORMAL_DISTANCE_UNIT, top3DistUnit);
			}

			if (top2Score != 0) {

				editor.putInt(GameConstants.TOP3_NORMAL_SCORE, top2Score);
				editor.putString(GameConstants.TOP3_NORMAL_MAP, top2Map);
				editor.putString(GameConstants.TOP3_NORMAL_DISTANCE_UNIT, top2DistUnit);
			}

			if (top1Score != 0) {
				editor.putInt(GameConstants.TOP2_NORMAL_SCORE, top1Score);
				editor.putString(GameConstants.TOP2_NORMAL_MAP, top1Map);
				editor.putString(GameConstants.TOP2_NORMAL_DISTANCE_UNIT, top1DistUnit);
			}

			break;
		case 2:

			if (top4Score != 0) {
				editor.putInt(GameConstants.TOP5_NORMAL_SCORE, top4Score);
				editor.putString(GameConstants.TOP5_NORMAL_MAP, top4Map);
				editor.putString(GameConstants.TOP5_NORMAL_DISTANCE_UNIT, top4DistUnit);

			}

			if (top3Score != 0) {
				editor.putInt(GameConstants.TOP4_NORMAL_SCORE, top3Score);
				editor.putString(GameConstants.TOP4_NORMAL_MAP, top3Map);
				editor.putString(GameConstants.TOP4_NORMAL_DISTANCE_UNIT, top3DistUnit);
			}

			if (top2Score != 0) {
				editor.putInt(GameConstants.TOP3_NORMAL_SCORE, top2Score);
				editor.putString(GameConstants.TOP3_NORMAL_MAP, top2Map);
				editor.putString(GameConstants.TOP3_NORMAL_DISTANCE_UNIT, top2DistUnit);
			}
			break;

		case 3:
			if (top4Score != 0) {
				editor.putInt(GameConstants.TOP5_NORMAL_SCORE, top4Score);
				editor.putString(GameConstants.TOP5_NORMAL_MAP, top4Map);
				editor.putString(GameConstants.TOP5_NORMAL_DISTANCE_UNIT, top4DistUnit);

			}

			if (top3Score != 0) {
				editor.putInt(GameConstants.TOP4_NORMAL_SCORE, top3Score);
				editor.putString(GameConstants.TOP4_NORMAL_MAP, top3Map);
				editor.putString(GameConstants.TOP4_NORMAL_DISTANCE_UNIT, top3DistUnit);
			}

			break;

		case 4:

			if (top4Score != 0) {
				editor.putInt(GameConstants.TOP5_NORMAL_SCORE, top4Score);
				editor.putString(GameConstants.TOP5_NORMAL_MAP, top4Map);
				editor.putString(GameConstants.TOP5_NORMAL_DISTANCE_UNIT, top4DistUnit);

			}
			break;

		/*
		 * case 5:
		 * 
		 * break;
		 */

		default:

		}

		editor.commit();

	}

	private static void moveOthersHardGameTop5(SharedPreferences prefs, int position) {

		SharedPreferences.Editor editor = prefs.edit();

		int top1Score = loadSharedPreferences(prefs, GameConstants.TOP1_HARD_SCORE, 0);
		int top2Score = loadSharedPreferences(prefs, GameConstants.TOP2_HARD_SCORE, 0);
		int top3Score = loadSharedPreferences(prefs, GameConstants.TOP3_HARD_SCORE, 0);
		int top4Score = loadSharedPreferences(prefs, GameConstants.TOP4_HARD_SCORE, 0);

		String top1Map = loadSharedPreferences(prefs, GameConstants.TOP1_HARD_MAP, "");
		String top2Map = loadSharedPreferences(prefs, GameConstants.TOP2_HARD_MAP, "");
		String top3Map = loadSharedPreferences(prefs, GameConstants.TOP3_HARD_MAP, "");
		String top4Map = loadSharedPreferences(prefs, GameConstants.TOP4_HARD_MAP, "");

		String top1DistUnit = loadSharedPreferences(prefs, GameConstants.TOP1_HARD_DISTANCE_UNIT, "");
		String top2DistUnit = loadSharedPreferences(prefs, GameConstants.TOP2_HARD_DISTANCE_UNIT, "");
		String top3DistUnit = loadSharedPreferences(prefs, GameConstants.TOP3_HARD_DISTANCE_UNIT, "");
		String top4DistUnit = loadSharedPreferences(prefs, GameConstants.TOP4_HARD_DISTANCE_UNIT, "");

		switch (position) {

		case 1:
			if (top4Score != 0) {
				editor.putInt(GameConstants.TOP5_HARD_SCORE, top4Score);
				editor.putString(GameConstants.TOP5_HARD_MAP, top4Map);
				editor.putString(GameConstants.TOP5_HARD_DISTANCE_UNIT, top4DistUnit);

			}

			if (top3Score != 0) {
				editor.putInt(GameConstants.TOP4_HARD_SCORE, top3Score);
				editor.putString(GameConstants.TOP4_HARD_MAP, top3Map);
				editor.putString(GameConstants.TOP4_HARD_DISTANCE_UNIT, top3DistUnit);

			}

			if (top2Score != 0) {

				editor.putInt(GameConstants.TOP3_HARD_SCORE, top2Score);
				editor.putString(GameConstants.TOP3_HARD_MAP, top2Map);
				editor.putString(GameConstants.TOP3_HARD_DISTANCE_UNIT, top2DistUnit);

			}

			if (top1Score != 0) {
				editor.putInt(GameConstants.TOP2_HARD_SCORE, top1Score);
				editor.putString(GameConstants.TOP2_HARD_MAP, top1Map);
				editor.putString(GameConstants.TOP2_HARD_DISTANCE_UNIT, top1DistUnit);

			}

			break;
		case 2:

			if (top4Score != 0) {
				editor.putInt(GameConstants.TOP5_HARD_SCORE, top4Score);
				editor.putString(GameConstants.TOP5_HARD_MAP, top4Map);
				editor.putString(GameConstants.TOP5_HARD_DISTANCE_UNIT, top4DistUnit);

			}

			if (top3Score != 0) {
				editor.putInt(GameConstants.TOP4_HARD_SCORE, top3Score);
				editor.putString(GameConstants.TOP4_HARD_MAP, top3Map);
				editor.putString(GameConstants.TOP4_HARD_DISTANCE_UNIT, top3DistUnit);

			}

			if (top2Score != 0) {
				editor.putInt(GameConstants.TOP3_HARD_SCORE, top2Score);
				editor.putString(GameConstants.TOP3_HARD_MAP, top2Map);
				editor.putString(GameConstants.TOP3_HARD_DISTANCE_UNIT, top2DistUnit);

			}
			break;

		case 3:
			if (top4Score != 0) {
				editor.putInt(GameConstants.TOP5_HARD_SCORE, top4Score);
				editor.putString(GameConstants.TOP5_HARD_MAP, top4Map);
				editor.putString(GameConstants.TOP5_HARD_DISTANCE_UNIT, top4DistUnit);

			}

			if (top3Score != 0) {
				editor.putInt(GameConstants.TOP4_HARD_SCORE, top3Score);
				editor.putString(GameConstants.TOP4_HARD_MAP, top3Map);
				editor.putString(GameConstants.TOP4_HARD_DISTANCE_UNIT, top3DistUnit);

			}

			break;

		case 4:

			if (top4Score != 0) {
				editor.putInt(GameConstants.TOP5_HARD_SCORE, top4Score);
				editor.putString(GameConstants.TOP5_HARD_MAP, top4Map);
				editor.putString(GameConstants.TOP5_HARD_DISTANCE_UNIT, top4DistUnit);

			}
			break;

		/*
		 * case 5:
		 * 
		 * break;
		 */

		default:

		}

		editor.commit();

	}

}
