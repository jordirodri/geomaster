package com.sillynamedvars.geomaster.freeapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Menu3GameActivity extends Activity {

	// private boolean isFullVersion = false;

	private static final int PLAY_SCREEN_ACTIVITY = 1;
	Bundle bundle = null;

	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.menu3);

		bundle = this.getIntent().getExtras();
		// String difficulty = (String) bundle.get(GameConstants.DIFFICULTY);

		Button playEasyButton = (Button) findViewById(R.id.buttonEasyPlay);
		playEasyButton.setOnClickListener(new View.OnClickListener() {

			public void onClick(View view) {

				// Bundle bundle = new Bundle();
				bundle.putString(GameConstants.DIFFICULTY, GameConstants.DIFFICULTY_EASY);

				Intent myIntent = new Intent(view.getContext(), GeoMaster.class);
				myIntent.putExtras(bundle);
				startActivityForResult(myIntent, PLAY_SCREEN_ACTIVITY);

			}

		});

		Button playNormalButton = (Button) findViewById(R.id.buttonNormalPlay);
		playNormalButton.setOnClickListener(new View.OnClickListener() {

			public void onClick(View view) {
				// Bundle bundle = new Bundle();
				bundle.putString(GameConstants.DIFFICULTY, GameConstants.DIFFICULTY_NORMAL);

				Intent myIntent = new Intent(view.getContext(), GeoMaster.class);
				myIntent.putExtras(bundle);
				startActivityForResult(myIntent, PLAY_SCREEN_ACTIVITY);
			}

		});

		Button playHardButton = (Button) findViewById(R.id.buttonHardPlay);
		playHardButton.setOnClickListener(new View.OnClickListener() {

			public void onClick(View view) {

				if (GameConstants.isFullVersion) {

					bundle.putString(GameConstants.DIFFICULTY, GameConstants.DIFFICULTY_HARD);

					Intent myIntent = new Intent(view.getContext(), GeoMaster.class);
					myIntent.putExtras(bundle);
					startActivityForResult(myIntent, PLAY_SCREEN_ACTIVITY);

				} else {

					Toast toast = Toast.makeText(Menu3GameActivity.this, getResources().getString(R.string.buy_full_version), Toast.LENGTH_SHORT);
					toast.setGravity(Gravity.CENTER, 0, 0);
					toast.show();

				}
			}

		});

	}
}
