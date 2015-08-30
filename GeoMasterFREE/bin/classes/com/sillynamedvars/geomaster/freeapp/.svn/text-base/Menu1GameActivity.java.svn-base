package com.sillynamedvars.geomaster.freeapp;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Menu1GameActivity extends Activity {

	private static final int MENU2_SCREEN_ACTIVITY = 1;
	private static final int SETTINGS_ACTIVITY = 2;
	private static final int SCORES_ACTIVITY = 3;
	private static final int INSTRUCTIONS_ACTIVITY = 4;

	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.menu1);

		Button playNewGameButton = (Button) findViewById(R.id.buttonNewGamePlay);
		playNewGameButton.setOnClickListener(new View.OnClickListener() {

			public void onClick(View view) {

				Intent myIntent = new Intent(view.getContext(), Menu2GameActivity.class);
				startActivityForResult(myIntent, MENU2_SCREEN_ACTIVITY);

			}

		});

		Button instructionsButton = (Button) findViewById(R.id.buttonInstructions);
		instructionsButton.setOnClickListener(new View.OnClickListener() {

			public void onClick(View view) {
				Intent myIntent = new Intent(view.getContext(), InstructionsActivity.class);
				startActivityForResult(myIntent, INSTRUCTIONS_ACTIVITY);

			}

		});

		Button settingsButton = (Button) findViewById(R.id.buttonSettings);
		settingsButton.setOnClickListener(new View.OnClickListener() {

			public void onClick(View view) {
				Intent myIntent = new Intent(view.getContext(), SettingsActivity.class);
				startActivityForResult(myIntent, SETTINGS_ACTIVITY);

			}

		});

		Button scoresButton = (Button) findViewById(R.id.buttonScores);
		scoresButton.setOnClickListener(new View.OnClickListener() {

			public void onClick(View view) {
				Intent myIntent = new Intent(view.getContext(), ScoresActivity.class);
				startActivityForResult(myIntent, SCORES_ACTIVITY);

			}

		});

		Button buyFullVersionButton = (Button) findViewById(R.id.buttonBuyFullVersion);
		buyFullVersionButton.setOnClickListener(new View.OnClickListener() {

			public void onClick(View view) {

				Uri uri = Uri.parse("market://details?id=com.sillynamedvars.geomaster.pro");
				startActivity(new Intent(Intent.ACTION_VIEW, uri));

			}

		});

	}

}
