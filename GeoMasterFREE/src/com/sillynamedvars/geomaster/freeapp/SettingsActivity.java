package com.sillynamedvars.geomaster.freeapp;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.RadioButton;

import com.sillynamedvars.geomaster.util.ApplicationUtils;

public class SettingsActivity extends Activity {

	public final static int SETTINGS_ROUNDS_OPTION1 = 10;
	public final static int SETTINGS_ROUNDS_OPTION2 = 15;
	public final static int SETTINGS_ROUNDS_OPTION3 = 20;

	public final static String SETTINGS_MAP_TYPE_OPTION1 = "Satellite";
	public final static String SETTINGS_MAP_TYPE_OPTION2 = "Normal";

	public final static String SETTINGS_DISTANCE_UNITS_OPTION1 = GameConstants.DISTANCE_UNITS_KM;
	public final static String SETTINGS_DISTANCE_UNITS_OPTION2 = GameConstants.DISTANCE_UNITS_MILES;

	private int rounds = SETTINGS_ROUNDS_OPTION1;
	private String mapType = SETTINGS_MAP_TYPE_OPTION1;
	private String distanceUnits = SETTINGS_DISTANCE_UNITS_OPTION1;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.settings);

		SharedPreferences prefs = getSharedPreferences(GameConstants.SHARED_PREFS, Context.MODE_PRIVATE);
		rounds = ApplicationUtils.loadSharedPreferences(prefs, "rounds", rounds);
		mapType = ApplicationUtils.loadSharedPreferences(prefs, "mapType", mapType);
		distanceUnits = ApplicationUtils.loadSharedPreferences(prefs, "distanceUnits", distanceUnits);

		Button buttonSettingOk = (Button) findViewById(R.id.buttonDone);
		buttonSettingOk.setOnClickListener(new View.OnClickListener() {

			public void onClick(View view) {
				SettingsActivity.this.finish();
			}
		});

		// 1. Set the Number of Rounds (10, 20 or 30)

		RadioButton radioRound10 = (RadioButton) findViewById(R.id.radioSettingsRound10);
		RadioButton radioRound20 = (RadioButton) findViewById(R.id.radioSettingsRound20);
		RadioButton radioRound30 = (RadioButton) findViewById(R.id.radioSettingsRound30);

		if (rounds == SETTINGS_ROUNDS_OPTION1) {
			radioRound10.setSelected(true);
			radioRound10.setChecked(true);
		} else if (rounds == SETTINGS_ROUNDS_OPTION2) {
			radioRound20.setSelected(true);
			radioRound20.setChecked(true);
		} else {
			radioRound30.setSelected(true);
			radioRound30.setChecked(true);
		}

		radioRound10.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {

				rounds = SETTINGS_ROUNDS_OPTION1;
				ApplicationUtils.saveSharedPreferences(getSharedPreferences(GameConstants.SHARED_PREFS, Context.MODE_PRIVATE), "rounds", rounds);

			}
		});

		radioRound20.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {

				rounds = SETTINGS_ROUNDS_OPTION2;
				ApplicationUtils.saveSharedPreferences(getSharedPreferences(GameConstants.SHARED_PREFS, Context.MODE_PRIVATE), "rounds", rounds);

			}
		});

		radioRound30.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {

				rounds = SETTINGS_ROUNDS_OPTION3;
				ApplicationUtils.saveSharedPreferences(getSharedPreferences(GameConstants.SHARED_PREFS, Context.MODE_PRIVATE), "rounds", rounds);

			}
		});

		// 2. Set the Map Type (Satellite or Normal)

		RadioButton mapType1 = (RadioButton) findViewById(R.id.radioSettingsMapSatellite);
		RadioButton mapType2 = (RadioButton) findViewById(R.id.radioSettingsMapNormal);

		if (SETTINGS_MAP_TYPE_OPTION1.equals(mapType)) {
			mapType1.setSelected(true);
			mapType1.setChecked(true);
		} else {
			mapType2.setSelected(true);
			mapType2.setChecked(true);
		}

		mapType1.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {

				mapType = SETTINGS_MAP_TYPE_OPTION1;
				ApplicationUtils.saveSharedPreferences(getSharedPreferences(GameConstants.SHARED_PREFS, Context.MODE_PRIVATE), "mapType", mapType);

			}
		});

		mapType2.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {

				mapType = SETTINGS_MAP_TYPE_OPTION2;
				ApplicationUtils.saveSharedPreferences(getSharedPreferences(GameConstants.SHARED_PREFS, Context.MODE_PRIVATE), "mapType", mapType);

			}
		});

		// 3. Set the Distance Units (Km or Miles)

		RadioButton distanceUnits1 = (RadioButton) findViewById(R.id.radioSettingsKm);
		RadioButton distanceUnits2 = (RadioButton) findViewById(R.id.radioSettingsMiles);

		if (SETTINGS_DISTANCE_UNITS_OPTION1.equals(distanceUnits)) {
			distanceUnits1.setSelected(true);
			distanceUnits1.setChecked(true);
		} else {
			distanceUnits2.setSelected(true);
			distanceUnits2.setChecked(true);
		}

		distanceUnits1.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {

				distanceUnits = SETTINGS_DISTANCE_UNITS_OPTION1;
				ApplicationUtils.saveSharedPreferences(getSharedPreferences(GameConstants.SHARED_PREFS, Context.MODE_PRIVATE), "distanceUnits", distanceUnits);

			}
		});

		distanceUnits2.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {

				distanceUnits = SETTINGS_DISTANCE_UNITS_OPTION2;
				ApplicationUtils.saveSharedPreferences(getSharedPreferences(GameConstants.SHARED_PREFS, Context.MODE_PRIVATE), "distanceUnits", distanceUnits);

			}
		});

	}

}
