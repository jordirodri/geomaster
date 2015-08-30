package com.sillynamedvars.geomaster.freeapp;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.sillynamedvars.geomaster.util.ApplicationUtils;
import com.sillynamedvars.geomaster.util.GeoTools;

public class ScoresActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.scores);

		Button buttonSettingOk = (Button) findViewById(R.id.buttonDone);
		buttonSettingOk.setOnClickListener(new View.OnClickListener() {

			public void onClick(View view) {
				ScoresActivity.this.finish();
			}
		});

		SharedPreferences prefs = getSharedPreferences(GameConstants.SHARED_PREFS, Context.MODE_PRIVATE);

		int defaultScore = 0;
		String defaultMap = "";
		String defaultDistanceUnit = "";

		int easyScoreTop1 = ApplicationUtils.loadSharedPreferences(prefs, GameConstants.TOP1_EASY_SCORE, defaultScore);
		int easyScoreTop2 = ApplicationUtils.loadSharedPreferences(prefs, GameConstants.TOP2_EASY_SCORE, defaultScore);
		int easyScoreTop3 = ApplicationUtils.loadSharedPreferences(prefs, GameConstants.TOP3_EASY_SCORE, defaultScore);
		int easyScoreTop4 = ApplicationUtils.loadSharedPreferences(prefs, GameConstants.TOP4_EASY_SCORE, defaultScore);
		int easyScoreTop5 = ApplicationUtils.loadSharedPreferences(prefs, GameConstants.TOP5_EASY_SCORE, defaultScore);

		String easyMapTop1 = ApplicationUtils.loadSharedPreferences(prefs, GameConstants.TOP1_EASY_MAP, defaultMap);
		String easyMapTop2 = ApplicationUtils.loadSharedPreferences(prefs, GameConstants.TOP2_EASY_MAP, defaultMap);
		String easyMapTop3 = ApplicationUtils.loadSharedPreferences(prefs, GameConstants.TOP3_EASY_MAP, defaultMap);
		String easyMapTop4 = ApplicationUtils.loadSharedPreferences(prefs, GameConstants.TOP4_EASY_MAP, defaultMap);
		String easyMapTop5 = ApplicationUtils.loadSharedPreferences(prefs, GameConstants.TOP5_EASY_MAP, defaultMap);

		String top1EasyDistUnit = ApplicationUtils.loadSharedPreferences(prefs, GameConstants.TOP1_EASY_DISTANCE_UNIT, GameConstants.DISTANCE_UNITS_KM);
		String top2EasyDistUnit = ApplicationUtils.loadSharedPreferences(prefs, GameConstants.TOP2_EASY_DISTANCE_UNIT, GameConstants.DISTANCE_UNITS_KM);
		String top3EasyDistUnit = ApplicationUtils.loadSharedPreferences(prefs, GameConstants.TOP3_EASY_DISTANCE_UNIT, GameConstants.DISTANCE_UNITS_KM);
		String top4EasyDistUnit = ApplicationUtils.loadSharedPreferences(prefs, GameConstants.TOP4_EASY_DISTANCE_UNIT, GameConstants.DISTANCE_UNITS_KM);
		String top5EasyDistUnit = ApplicationUtils.loadSharedPreferences(prefs, GameConstants.TOP5_EASY_DISTANCE_UNIT, GameConstants.DISTANCE_UNITS_KM);

		int normalScoreTop1 = ApplicationUtils.loadSharedPreferences(prefs, GameConstants.TOP1_NORMAL_SCORE, defaultScore);
		int normalScoreTop2 = ApplicationUtils.loadSharedPreferences(prefs, GameConstants.TOP2_NORMAL_SCORE, defaultScore);
		int normalScoreTop3 = ApplicationUtils.loadSharedPreferences(prefs, GameConstants.TOP3_NORMAL_SCORE, defaultScore);
		int normalScoreTop4 = ApplicationUtils.loadSharedPreferences(prefs, GameConstants.TOP4_NORMAL_SCORE, defaultScore);
		int normalScoreTop5 = ApplicationUtils.loadSharedPreferences(prefs, GameConstants.TOP5_NORMAL_SCORE, defaultScore);

		String normalMapTop1 = ApplicationUtils.loadSharedPreferences(prefs, GameConstants.TOP1_NORMAL_MAP, defaultMap);
		String normalMapTop2 = ApplicationUtils.loadSharedPreferences(prefs, GameConstants.TOP2_NORMAL_MAP, defaultMap);
		String normalMapTop3 = ApplicationUtils.loadSharedPreferences(prefs, GameConstants.TOP3_NORMAL_MAP, defaultMap);
		String normalMapTop4 = ApplicationUtils.loadSharedPreferences(prefs, GameConstants.TOP4_NORMAL_MAP, defaultMap);
		String normalMapTop5 = ApplicationUtils.loadSharedPreferences(prefs, GameConstants.TOP5_NORMAL_MAP, defaultMap);

		String top1NormalDistUnit = ApplicationUtils.loadSharedPreferences(prefs, GameConstants.TOP1_NORMAL_DISTANCE_UNIT, GameConstants.DISTANCE_UNITS_KM);
		String top2NormalDistUnit = ApplicationUtils.loadSharedPreferences(prefs, GameConstants.TOP2_NORMAL_DISTANCE_UNIT, GameConstants.DISTANCE_UNITS_KM);
		String top3NormalDistUnit = ApplicationUtils.loadSharedPreferences(prefs, GameConstants.TOP3_NORMAL_DISTANCE_UNIT, GameConstants.DISTANCE_UNITS_KM);
		String top4NormalDistUnit = ApplicationUtils.loadSharedPreferences(prefs, GameConstants.TOP4_NORMAL_DISTANCE_UNIT, GameConstants.DISTANCE_UNITS_KM);
		String top5NormalDistUnit = ApplicationUtils.loadSharedPreferences(prefs, GameConstants.TOP5_NORMAL_DISTANCE_UNIT, GameConstants.DISTANCE_UNITS_KM);

		int hardScoreTop1 = ApplicationUtils.loadSharedPreferences(prefs, GameConstants.TOP1_HARD_SCORE, defaultScore);
		int hardScoreTop2 = ApplicationUtils.loadSharedPreferences(prefs, GameConstants.TOP2_HARD_SCORE, defaultScore);
		int hardScoreTop3 = ApplicationUtils.loadSharedPreferences(prefs, GameConstants.TOP3_HARD_SCORE, defaultScore);
		int hardScoreTop4 = ApplicationUtils.loadSharedPreferences(prefs, GameConstants.TOP4_HARD_SCORE, defaultScore);
		int hardScoreTop5 = ApplicationUtils.loadSharedPreferences(prefs, GameConstants.TOP5_HARD_SCORE, defaultScore);

		String hardMapTop1 = ApplicationUtils.loadSharedPreferences(prefs, GameConstants.TOP1_HARD_MAP, defaultMap);
		String hardMapTop2 = ApplicationUtils.loadSharedPreferences(prefs, GameConstants.TOP2_HARD_MAP, defaultMap);
		String hardMapTop3 = ApplicationUtils.loadSharedPreferences(prefs, GameConstants.TOP3_HARD_MAP, defaultMap);
		String hardMapTop4 = ApplicationUtils.loadSharedPreferences(prefs, GameConstants.TOP4_HARD_MAP, defaultMap);
		String hardMapTop5 = ApplicationUtils.loadSharedPreferences(prefs, GameConstants.TOP5_HARD_MAP, defaultMap);

		String top1HardDistUnit = ApplicationUtils.loadSharedPreferences(prefs, GameConstants.TOP1_HARD_DISTANCE_UNIT, GameConstants.DISTANCE_UNITS_KM);
		String top2HardDistUnit = ApplicationUtils.loadSharedPreferences(prefs, GameConstants.TOP2_HARD_DISTANCE_UNIT, GameConstants.DISTANCE_UNITS_KM);
		String top3HardDistUnit = ApplicationUtils.loadSharedPreferences(prefs, GameConstants.TOP3_HARD_DISTANCE_UNIT, GameConstants.DISTANCE_UNITS_KM);
		String top4HardDistUnit = ApplicationUtils.loadSharedPreferences(prefs, GameConstants.TOP4_HARD_DISTANCE_UNIT, GameConstants.DISTANCE_UNITS_KM);
		String top5HardDistUnit = ApplicationUtils.loadSharedPreferences(prefs, GameConstants.TOP5_HARD_DISTANCE_UNIT, GameConstants.DISTANCE_UNITS_KM);

		String distanceUnits = ApplicationUtils.loadSharedPreferences(prefs, "distanceUnits", GameConstants.DISTANCE_UNITS_KM);

		// Conversion to Distance Units in settings
		// 1. EASY
		if (!top1EasyDistUnit.equals(distanceUnits)) {
			if (GameConstants.DISTANCE_UNITS_KM.equals(distanceUnits)) {
				easyScoreTop1 = GeoTools.convertMilesToKm(easyScoreTop1);
			} else {
				easyScoreTop1 = GeoTools.convertKmToMiles(easyScoreTop1);
			}
		}

		if (!top2EasyDistUnit.equals(distanceUnits)) {
			if (GameConstants.DISTANCE_UNITS_KM.equals(distanceUnits)) {
				easyScoreTop2 = GeoTools.convertMilesToKm(easyScoreTop2);
			} else {
				easyScoreTop2 = GeoTools.convertKmToMiles(easyScoreTop2);
			}
		}

		if (!top3EasyDistUnit.equals(distanceUnits)) {
			if (GameConstants.DISTANCE_UNITS_KM.equals(distanceUnits)) {
				easyScoreTop3 = GeoTools.convertMilesToKm(easyScoreTop3);
			} else {
				easyScoreTop3 = GeoTools.convertKmToMiles(easyScoreTop3);
			}
		}

		if (!top4EasyDistUnit.equals(distanceUnits)) {
			if (GameConstants.DISTANCE_UNITS_KM.equals(distanceUnits)) {
				easyScoreTop4 = GeoTools.convertMilesToKm(easyScoreTop4);
			} else {
				easyScoreTop4 = GeoTools.convertKmToMiles(easyScoreTop4);
			}
		}

		if (!top5EasyDistUnit.equals(distanceUnits)) {
			if (GameConstants.DISTANCE_UNITS_KM.equals(distanceUnits)) {
				easyScoreTop5 = GeoTools.convertMilesToKm(easyScoreTop5);
			} else {
				easyScoreTop5 = GeoTools.convertKmToMiles(easyScoreTop5);
			}
		}

		// 2. NORMAL
		if (!top1NormalDistUnit.equals(distanceUnits)) {
			if (GameConstants.DISTANCE_UNITS_KM.equals(distanceUnits)) {
				normalScoreTop1 = GeoTools.convertMilesToKm(normalScoreTop1);
			} else {
				normalScoreTop1 = GeoTools.convertKmToMiles(normalScoreTop1);
			}
		}

		if (!top2NormalDistUnit.equals(distanceUnits)) {
			if (GameConstants.DISTANCE_UNITS_KM.equals(distanceUnits)) {
				normalScoreTop2 = GeoTools.convertMilesToKm(normalScoreTop2);
			} else {
				normalScoreTop2 = GeoTools.convertKmToMiles(normalScoreTop2);
			}
		}

		if (!top3NormalDistUnit.equals(distanceUnits)) {
			if (GameConstants.DISTANCE_UNITS_KM.equals(distanceUnits)) {
				normalScoreTop3 = GeoTools.convertMilesToKm(normalScoreTop3);
			} else {
				normalScoreTop3 = GeoTools.convertKmToMiles(normalScoreTop3);
			}
		}

		if (!top4NormalDistUnit.equals(distanceUnits)) {
			if (GameConstants.DISTANCE_UNITS_KM.equals(distanceUnits)) {
				normalScoreTop4 = GeoTools.convertMilesToKm(normalScoreTop4);
			} else {
				normalScoreTop4 = GeoTools.convertKmToMiles(normalScoreTop4);
			}
		}

		if (!top5NormalDistUnit.equals(distanceUnits)) {
			if (GameConstants.DISTANCE_UNITS_KM.equals(distanceUnits)) {
				normalScoreTop5 = GeoTools.convertMilesToKm(normalScoreTop5);
			} else {
				normalScoreTop5 = GeoTools.convertKmToMiles(normalScoreTop5);
			}
		}

		// 3. HARD
		if (!top1HardDistUnit.equals(distanceUnits)) {
			if (GameConstants.DISTANCE_UNITS_KM.equals(distanceUnits)) {
				hardScoreTop1 = GeoTools.convertMilesToKm(hardScoreTop1);
			} else {
				hardScoreTop1 = GeoTools.convertKmToMiles(hardScoreTop1);
			}
		}

		if (!top2HardDistUnit.equals(distanceUnits)) {
			if (GameConstants.DISTANCE_UNITS_KM.equals(distanceUnits)) {
				hardScoreTop2 = GeoTools.convertMilesToKm(hardScoreTop2);
			} else {
				hardScoreTop2 = GeoTools.convertKmToMiles(hardScoreTop2);
			}
		}

		if (!top3HardDistUnit.equals(distanceUnits)) {
			if (GameConstants.DISTANCE_UNITS_KM.equals(distanceUnits)) {
				hardScoreTop3 = GeoTools.convertMilesToKm(hardScoreTop3);
			} else {
				hardScoreTop3 = GeoTools.convertKmToMiles(hardScoreTop3);
			}
		}

		if (!top4HardDistUnit.equals(distanceUnits)) {
			if (GameConstants.DISTANCE_UNITS_KM.equals(distanceUnits)) {
				hardScoreTop4 = GeoTools.convertMilesToKm(hardScoreTop4);
			} else {
				hardScoreTop4 = GeoTools.convertKmToMiles(hardScoreTop4);
			}
		}

		if (!top5HardDistUnit.equals(distanceUnits)) {
			if (GameConstants.DISTANCE_UNITS_KM.equals(distanceUnits)) {
				hardScoreTop5 = GeoTools.convertMilesToKm(hardScoreTop5);
			} else {
				hardScoreTop5 = GeoTools.convertKmToMiles(hardScoreTop5);
			}
		}

		// 1. EASY SCORES

		TextView textScoreTop1 = (TextView) findViewById(R.id.textScoresTop1Easy);
		textScoreTop1.setText("Top1 : " + ((easyScoreTop1 != 0) ? easyScoreTop1 + " " + distanceUnits : "---") + " " + easyMapTop1);

		TextView textScoreTop2 = (TextView) findViewById(R.id.textScoresTop2Easy);
		textScoreTop2.setText("Top2 : " + ((easyScoreTop2 != 0) ? easyScoreTop2 + " " + distanceUnits : "---") + " " + easyMapTop2);

		TextView textScoreTop3 = (TextView) findViewById(R.id.textScoresTop3Easy);
		textScoreTop3.setText("Top3 : " + ((easyScoreTop3 != 0) ? easyScoreTop3 + " " + distanceUnits : "---") + " " + easyMapTop3);

		TextView textScoreTop4 = (TextView) findViewById(R.id.textScoresTop4Easy);
		textScoreTop4.setText("Top4 : " + ((easyScoreTop4 != 0) ? easyScoreTop4 + " " + distanceUnits : "---") + " " + easyMapTop4);

		TextView textScoreTop5 = (TextView) findViewById(R.id.textScoresTop5Easy);
		textScoreTop5.setText("Top5 : " + ((easyScoreTop5 != 0) ? easyScoreTop5 + " " + distanceUnits : "---") + " " + easyMapTop5);

		// 1. NORMAL SCORES

		TextView textScoreNormalTop1 = (TextView) findViewById(R.id.textScoresTop1Normal);
		textScoreNormalTop1.setText("Top1 : " + ((normalScoreTop1 != 0) ? normalScoreTop1 + " " + distanceUnits : "---") + " " + normalMapTop1);

		TextView textScoreNormalTop2 = (TextView) findViewById(R.id.textScoresTop2Normal);
		textScoreNormalTop2.setText("Top2 : " + ((normalScoreTop2 != 0) ? normalScoreTop2 + " " + distanceUnits : "---") + " " + normalMapTop2);

		TextView textScoreNormalTop3 = (TextView) findViewById(R.id.textScoresTop3Normal);
		textScoreNormalTop3.setText("Top3 : " + ((normalScoreTop3 != 0) ? normalScoreTop3 + " " + distanceUnits : "---") + " " + normalMapTop3);

		TextView textScoreNormalTop4 = (TextView) findViewById(R.id.textScoresTop4Normal);
		textScoreNormalTop4.setText("Top4 : " + ((normalScoreTop4 != 0) ? normalScoreTop4 + " " + distanceUnits : "---") + " " + normalMapTop4);

		TextView textScoreNormalTop5 = (TextView) findViewById(R.id.textScoresTop5Normal);
		textScoreNormalTop5.setText("Top5 : " + ((normalScoreTop5 != 0) ? normalScoreTop5 + " " + distanceUnits : "---") + " " + normalMapTop5);

		// 1. HARD SCORES

		TextView textScoreHardTop1 = (TextView) findViewById(R.id.textScoresTop1Hard);
		textScoreHardTop1.setText("Top1 : " + ((hardScoreTop1 != 0) ? hardScoreTop1 + " " + distanceUnits : "---") + " " + hardMapTop1);

		TextView textScoreHardTop2 = (TextView) findViewById(R.id.textScoresTop2Hard);
		textScoreHardTop2.setText("Top2 : " + ((hardScoreTop2 != 0) ? hardScoreTop2 + " " + distanceUnits : "---") + " " + hardMapTop2);

		TextView textScoreHardTop3 = (TextView) findViewById(R.id.textScoresTop3Hard);
		textScoreHardTop3.setText("Top3 : " + ((hardScoreTop3 != 0) ? hardScoreTop3 + " " + distanceUnits : "---") + " " + hardMapTop3);

		TextView textScoreHardTop4 = (TextView) findViewById(R.id.textScoresTop4Hard);
		textScoreHardTop4.setText("Top4 : " + ((hardScoreTop4 != 0) ? hardScoreTop4 + " " + distanceUnits : "---") + " " + hardMapTop4);

		TextView textScoreHardTop5 = (TextView) findViewById(R.id.textScoresTop5Hard);
		textScoreHardTop5.setText("Top5 : " + ((hardScoreTop5 != 0) ? hardScoreTop5 + " " + distanceUnits : "---") + " " + hardMapTop5);

	}

}
