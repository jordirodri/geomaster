package com.sillynamedvars.geomaster.freeapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Menu2GameActivity extends Activity {

	private static final int PLAY_SCREEN_ACTIVITY = 1;
	private static final int MENU3_SCREEN_ACTIVITY = 2;

	Bundle bundle = null;

	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.menu2);

		// bundle = this.getIntent().getExtras();
		// String difficulty = (String) bundle.get(GameConstants.DIFFICULTY);

		Button playWorldButton = (Button) findViewById(R.id.buttonPlayWorld);
		playWorldButton.setOnClickListener(new View.OnClickListener() {

			public void onClick(View view) {

				bundle = new Bundle();
				bundle.putString(GameConstants.MAP_PLAYED, GameConstants.PLAYMAP_WORLD);

				Intent myIntent = new Intent(view.getContext(), Menu3GameActivity.class);
				// Intent myIntent = new Intent(view.getContext(),
				// GeoMaster.class);
				myIntent.putExtras(bundle);
				startActivityForResult(myIntent, MENU3_SCREEN_ACTIVITY);

			}

		});

		Button playEuropeButton = (Button) findViewById(R.id.buttonPlayEurope);
		playEuropeButton.setOnClickListener(new View.OnClickListener() {

			public void onClick(View view) {

				bundle = new Bundle();
				bundle.putString(GameConstants.MAP_PLAYED, GameConstants.PLAYMAP_EUROPE);

				Intent myIntent = new Intent(view.getContext(), Menu3GameActivity.class);
				myIntent.putExtras(bundle);
				startActivityForResult(myIntent, MENU3_SCREEN_ACTIVITY);

			}

		});

		Button playAmericaButton = (Button) findViewById(R.id.buttonPlayAmerica);
		playAmericaButton.setOnClickListener(new View.OnClickListener() {

			public void onClick(View view) {

				bundle = new Bundle();
				bundle.putString(GameConstants.MAP_PLAYED, GameConstants.PLAYMAP_AMERICA);

				Intent myIntent = new Intent(view.getContext(), Menu3GameActivity.class);
				myIntent.putExtras(bundle);
				startActivityForResult(myIntent, MENU3_SCREEN_ACTIVITY);

			}

		});

		Button playAfricaButton = (Button) findViewById(R.id.buttonPlayAfrica);
		playAfricaButton.setOnClickListener(new View.OnClickListener() {

			public void onClick(View view) {

				bundle = new Bundle();
				bundle.putString(GameConstants.MAP_PLAYED, GameConstants.PLAYMAP_AFRICA);

				Intent myIntent = new Intent(view.getContext(), Menu3GameActivity.class);
				myIntent.putExtras(bundle);
				startActivityForResult(myIntent, MENU3_SCREEN_ACTIVITY);

			}

		});

		Button playAsiaButton = (Button) findViewById(R.id.buttonPlayAsia);
		playAsiaButton.setOnClickListener(new View.OnClickListener() {

			public void onClick(View view) {

				if (GameConstants.isFullVersion) {
					bundle = new Bundle();
					bundle.putString(GameConstants.MAP_PLAYED, GameConstants.PLAYMAP_ASIA);

					Intent myIntent = new Intent(view.getContext(), Menu3GameActivity.class);
					myIntent.putExtras(bundle);
					startActivityForResult(myIntent, MENU3_SCREEN_ACTIVITY);

				} else {

					Toast toast = Toast.makeText(Menu2GameActivity.this, getResources().getString(R.string.buy_full_version), Toast.LENGTH_SHORT);
					toast.setGravity(Gravity.CENTER, 0, 0);
					toast.show();

				}

			}

		});

		Button playOceaniaButton = (Button) findViewById(R.id.buttonPlayOceania);
		playOceaniaButton.setOnClickListener(new View.OnClickListener() {

			public void onClick(View view) {

				if (GameConstants.isFullVersion) {
					bundle = new Bundle();
					bundle.putString(GameConstants.MAP_PLAYED, GameConstants.PLAYMAP_OCEANIA);

					Intent myIntent = new Intent(view.getContext(), Menu3GameActivity.class);
					myIntent.putExtras(bundle);
					startActivityForResult(myIntent, MENU3_SCREEN_ACTIVITY);

				} else {

					Toast toast = Toast.makeText(Menu2GameActivity.this, getResources().getString(R.string.buy_full_version), Toast.LENGTH_SHORT);
					toast.setGravity(Gravity.CENTER, 0, 0);
					toast.show();

				}

			}

		});

		Button playUSStates = (Button) findViewById(R.id.buttonPlayUSStates);
		playUSStates.setOnClickListener(new View.OnClickListener() {

			public void onClick(View view) {

				if (GameConstants.isFullVersion) {
					bundle = new Bundle();
					bundle.putString(GameConstants.MAP_PLAYED, GameConstants.PLAYMAP_US_STATES);

					Intent myIntent = new Intent(view.getContext(), Menu3GameActivity.class);
					myIntent.putExtras(bundle);
					startActivityForResult(myIntent, MENU3_SCREEN_ACTIVITY);

				} else {

					Toast toast = Toast.makeText(Menu2GameActivity.this, getResources().getString(R.string.buy_full_version), Toast.LENGTH_SHORT);
					toast.setGravity(Gravity.CENTER, 0, 0);
					toast.show();

				}
			}

		});

		Button playFamousPlaces = (Button) findViewById(R.id.buttonPlayFamousPlaces);
		playFamousPlaces.setOnClickListener(new View.OnClickListener() {

			public void onClick(View view) {

				if (GameConstants.isFullVersion) {
					bundle = new Bundle();
					bundle.putString(GameConstants.MAP_PLAYED, GameConstants.PLAYMAP_FAMOUS_PLACES);

					Intent myIntent = new Intent(view.getContext(), Menu3GameActivity.class);
					myIntent.putExtras(bundle);
					startActivityForResult(myIntent, MENU3_SCREEN_ACTIVITY);

				} else {

					Toast toast = Toast.makeText(Menu2GameActivity.this, getResources().getString(R.string.buy_full_version), Toast.LENGTH_SHORT);
					toast.setGravity(Gravity.CENTER, 0, 0);
					toast.show();

				}

			}

		});

	}

}
