package com.sillynamedvars.geomaster.freeapp;

import java.util.List;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.ZoomButtonsController;

import com.google.android.maps.GeoPoint;
import com.google.android.maps.MapActivity;
import com.google.android.maps.MapController;
import com.google.android.maps.MapView;
import com.sillynamedvars.geomaster.model.City;
import com.sillynamedvars.geomaster.overlay.CrossHairOverlay;
import com.sillynamedvars.geomaster.overlay.Marker;
import com.sillynamedvars.geomaster.util.ApplicationUtils;
import com.sillynamedvars.geomaster.util.GeoTools;

public class GeoMaster extends MapActivity {

	// private int zoomLevel = 4;

	ZoomButtonsController zc;
	MapController mc;
	Bundle bundle;
	PlayConfig playConfig;
	MapView mapView = null;
	boolean animationEnded = true;

	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.playscreen);

		bundle = this.getIntent().getExtras();
		String difficulty = (String) bundle.get(GameConstants.DIFFICULTY);
		String mapPlayed = (String) bundle.get(GameConstants.MAP_PLAYED);

		playConfig = new PlayConfig(difficulty, mapPlayed, getSharedPreferences(GameConstants.SHARED_PREFS, Context.MODE_PRIVATE));
		playConfig.playNewCity();

		TextView kmTextTotal = (TextView) findViewById(R.id.textKmTotal);
		kmTextTotal.setText(playConfig.getDistanceTotal() + " " + playConfig.getDistanceUnit());

		updateRound();
		updateLocateCityInfo();

		mapView = (MapView) findViewById(R.id.map1);
		mapView.setBuiltInZoomControls(true);
		mapView.setSatellite(playConfig.isSatelliteMap());

		// mapView.setDrawingCacheEnabled(true);
		// mapView.setDrawingCacheBackgroundColor(Color.BLUE);
		// mapView.setBackgroundColor(Color.BLUE);

		mc = mapView.getController();

		Button playButton = (Button) findViewById(R.id.googlemaps_select_location);
		playButton.setOnClickListener(new View.OnClickListener() {

			public void onClick(View view) {

				if (animationEnded) {
					GeoPoint centerGp = mapView.getMapCenter();

					playConfig.setDistance(GeoTools.distance(playConfig.getPlayedCityGeoPoint(), centerGp, playConfig.getDistanceUnit()));
					playConfig.setDistanceTotal(playConfig.getDistanceTotal() + playConfig.getDistance());

					updateScoreBoard();

					List listOfOverlays = mapView.getOverlays();
					listOfOverlays.clear();
					listOfOverlays.add(new Marker(view.getContext(), centerGp, playConfig.getPlayedCityGeoPoint(), playConfig.isSatelliteMap()));
					listOfOverlays.add(new CrossHairOverlay());

					mc.animateTo(playConfig.getPlayedCityGeoPoint());
					mapView.invalidate();

					runAnimations();

				}
			}

		});

		mapView.setBuiltInZoomControls(false);
		mapView.setOnTouchListener(new OnTouchListener() {
	        public boolean onTouch(View v, MotionEvent event) {
	            if(event.getPointerCount() > 1) {
	                return true;
	            }
	            return false;
	        }
	    });
		
//		zc = mapView.getZoomButtonsController();
//		zc.setOnZoomListener(new OnZoomListener() {
//
//			@Override
//			public void onZoom(boolean zoomedIn) {
//
//				if (zoomedIn) {
//					if (playConfig.getZoomLevel() >= GameConstants.MAX_ZOOM_LVL) {
//						zc.setZoomInEnabled(false);
//					} else {
//						playConfig.setZoomLevel(playConfig.getZoomLevel() + 1);
//						zc.setZoomInEnabled(true);
//						mc.setZoom(playConfig.getZoomLevel());
//					}
//				} else {
//
//					if (playConfig.getZoomLevel() <= GameConstants.MIN_ZOOM_LVL) {
//						zc.setZoomInEnabled(false);
//					} else {
//						playConfig.setZoomLevel(playConfig.getZoomLevel() - 1);
//						zc.setZoomInEnabled(true);
//						mc.setZoom(playConfig.getZoomLevel());
//					}
//
//					// playConfig.setZoomLevel(playConfig.getZoomLevel() - 1);
//					// if (playConfig.getZoomLevel() <
//					// GameConstants.MAX_ZOOM_LVL) {
//					// zc.setZoomInEnabled(true);
//					// mc.setZoom(playConfig.getZoomLevel());
//					// }
//
//				}
//
//			}
//
//			@Override
//			public void onVisibilityChanged(boolean arg0) {
//
//			}
//		});

		mc.animateTo(playConfig.getInitGeoPoint());
		mc.setZoom(playConfig.getZoomLevel());

		// ---Add a location marker---
		List listOfOverlays = mapView.getOverlays();
		listOfOverlays.add(new CrossHairOverlay());

		mapView.invalidate();

		Dialog dialog = createDialogStartGameInfo();
		dialog.show();

	}

	@Override
	protected boolean isRouteDisplayed() {
		return false;
	}

	public Dialog createDialogStartGameInfo() {
		Context mContext = GeoMaster.this;
		final Dialog dialog = new Dialog(mContext);

		dialog.requestWindowFeature(dialog.getWindow().FEATURE_NO_TITLE);
		dialog.getWindow().setBackgroundDrawable(new ColorDrawable(android.graphics.Color.TRANSPARENT));
		
		// dialog.getWindow().setAttributes(LayoutParams)
		dialog.getWindow().getAttributes().y = 100;
		dialog.getWindow().setGravity(Gravity.TOP);
		dialog.setContentView(R.layout.startgameinfo);

		SharedPreferences prefs = getSharedPreferences(GameConstants.SHARED_PREFS, Context.MODE_PRIVATE);

		Integer top1Score = null;
		String top1DistUnit = null;

		if (GameConstants.DIFFICULTY_EASY.equals(playConfig.getDifficulty())) {

			if (prefs.contains(GameConstants.TOP1_EASY_SCORE)) {
				top1Score = ApplicationUtils.loadSharedPreferences(prefs, GameConstants.TOP1_EASY_SCORE, 0);
				top1DistUnit = ApplicationUtils.loadSharedPreferences(prefs, GameConstants.TOP1_EASY_DISTANCE_UNIT, GameConstants.DISTANCE_UNITS_KM);
			}

		} else if (GameConstants.DIFFICULTY_NORMAL.equals(playConfig.getDifficulty())) {

			if (prefs.contains(GameConstants.TOP1_NORMAL_SCORE)) {
				top1Score = ApplicationUtils.loadSharedPreferences(prefs, GameConstants.TOP1_NORMAL_SCORE, 0);
				top1DistUnit = ApplicationUtils.loadSharedPreferences(prefs, GameConstants.TOP1_NORMAL_DISTANCE_UNIT, GameConstants.DISTANCE_UNITS_KM);
			}

		} else if (GameConstants.DIFFICULTY_HARD.equals(playConfig.getDifficulty())) {

			if (prefs.contains(GameConstants.TOP1_HARD_SCORE)) {
				top1Score = ApplicationUtils.loadSharedPreferences(prefs, GameConstants.TOP1_HARD_SCORE, 0);
				top1DistUnit = ApplicationUtils.loadSharedPreferences(prefs, GameConstants.TOP1_HARD_DISTANCE_UNIT, GameConstants.DISTANCE_UNITS_KM);
			}
		}

		TextView text = (TextView) dialog.findViewById(R.id.textPopUp1);
		text.setText("Level " + playConfig.getDifficulty());

		text = (TextView) dialog.findViewById(R.id.textPopUp3);
		text.setText("Map " + playConfig.getMapPlayed());

		text = (TextView) dialog.findViewById(R.id.textPopUp2);
		text.setText(playConfig.getCities().size() + " x Rounds");

		text = (TextView) dialog.findViewById(R.id.textPopUp4);
		if (top1Score == null) {
			// text.setText("Top score ---");
		} else {

			int topDistance = top1Score;

			if (!playConfig.getDistanceUnit().equals(top1DistUnit)) {
				topDistance = GeoTools.convertDistanceToDiffUnit(top1Score.intValue(), top1DistUnit, playConfig.getDistanceUnit());
			}

			text.setText("Best Score " + topDistance + " " + playConfig.getDistanceUnit());
		}

		Button buttonContinue = (Button) dialog.findViewById(R.id.buttonPopup);
		buttonContinue.setOnClickListener(new View.OnClickListener() {

			public void onClick(View view) {

				dialog.dismiss();
			}

		});

		return dialog;
	}

	public Dialog createDialogEndGameInfo(Integer rankPosition) {

		Context mContext = GeoMaster.this;
		final Dialog dialog = new Dialog(mContext);

		dialog.requestWindowFeature(dialog.getWindow().FEATURE_NO_TITLE);
		dialog.getWindow().setBackgroundDrawable(new ColorDrawable(android.graphics.Color.TRANSPARENT));
		// dialog.setTitle(getResources().getString(R.string.game_over_title));

		// dialog.getWindow().setAttributes(LayoutParams)
		dialog.getWindow().getAttributes().y = 100;
		dialog.getWindow().setGravity(Gravity.TOP);
		dialog.setContentView(R.layout.endgameinfo);

		// TextView text1 = (TextView)
		// dialog.findViewById(R.id.textEndGamePopUp1);
		// text1.setText(getResources().getString(R.string.game_over_title));

		if (rankPosition != null) {

			ImageView imageEndGame = (ImageView) dialog.findViewById(R.id.imageEndGame);
			imageEndGame.setImageResource(R.drawable.trophy);

			TextView text4 = (TextView) dialog.findViewById(R.id.textEndGamePopUp2);
			text4.setText("Final score " + playConfig.getDistanceTotal() + " " + playConfig.getDistanceUnit());

			TextView text2 = (TextView) dialog.findViewById(R.id.textEndGamePopUp3);
			text2.setText(getResources().getString(R.string.game_over_top_score1));

			TextView text3 = (TextView) dialog.findViewById(R.id.textEndGamePopUp4);
			text3.setText(getResources().getString(R.string.game_over_top_score2) + rankPosition);

		} else {

			ImageView imageEndGame = (ImageView) dialog.findViewById(R.id.imageEndGame);

			if (playConfig.getDistanceTotal() >= 10000) {

				imageEndGame.setImageResource(R.drawable.emoticonevil);

			} else if (playConfig.getDistanceTotal() >= 5000) {

				imageEndGame.setImageResource(R.drawable.emoticonangry);

			} else if (playConfig.getDistanceTotal() >= 2000) {

				imageEndGame.setImageResource(R.drawable.emoticonidiot);

			} else if (playConfig.getDistanceTotal() >= 1000) {

				imageEndGame.setImageResource(R.drawable.emoticon);
			} else {

				imageEndGame.setImageResource(R.drawable.emoticonfantasydreams);
			}

			TextView text4 = (TextView) dialog.findViewById(R.id.textEndGamePopUp3);
			text4.setText("Final score " + playConfig.getDistanceTotal() + " " + playConfig.getDistanceUnit());

		}

		Button buttonContinue = (Button) dialog.findViewById(R.id.buttonEndGamePopupOk);
		buttonContinue.setOnClickListener(new View.OnClickListener() {

			public void onClick(View view) {

				GeoMaster.this.finish();
			}

		});

		Button buttonVisitedPlaces = (Button) dialog.findViewById(R.id.buttonEndGamePopupViewCities);
		buttonVisitedPlaces.setOnClickListener(new View.OnClickListener() {

			public void onClick(View view) {

				final Dialog dialog = new Dialog(GeoMaster.this);
				dialog.requestWindowFeature(dialog.getWindow().FEATURE_NO_TITLE);
				dialog.getWindow().setBackgroundDrawable(new ColorDrawable(android.graphics.Color.TRANSPARENT));

				// dialog.getWindow().setAttributes(LayoutParams)
				dialog.getWindow().getAttributes().y = 10;
				dialog.getWindow().setGravity(Gravity.TOP);
				dialog.setContentView(R.layout.visitedplaces);

				LinearLayout layout = (LinearLayout) dialog.findViewById(R.id.VisitedPlacesLayout);

				TextView viewTextLine1 = new TextView(view.getContext());
				viewTextLine1.setBackgroundColor(Color.WHITE);
				viewTextLine1.setWidth(LayoutParams.FILL_PARENT);
				viewTextLine1.setHeight(1);

				layout.addView(viewTextLine1);

				int count = 1;
				for (final City city : playConfig.getCities()) {

					TextView viewText1 = new TextView(view.getContext());
					viewText1.setMovementMethod(LinkMovementMethod.getInstance());
					viewText1.setOnClickListener(new View.OnClickListener() {
						public void onClick(View view) {

							// view.setBackgroundColor(Color.BLUE);

							Uri uri = Uri.parse("http://en.wikipedia.org/wiki/" + city.getName());
							startActivity(new Intent(Intent.ACTION_VIEW, uri));
						}
					});

					String text = count + ". " + city.getName() + " (" + city.getCountry() + ") " + city.getDistancePlayed();
					ApplicationUtils.fillGameText(viewText1, text, 200, false);

					TextView viewTextLine = new TextView(view.getContext());
					viewTextLine.setBackgroundColor(Color.WHITE);
					viewTextLine.setWidth(LayoutParams.FILL_PARENT);
					viewTextLine.setHeight(1);

					layout.addView(viewText1);
					layout.addView(viewTextLine);
					count++;
				}

				// layout.addView(viewTextLine);
				layout.setLayoutParams(new ScrollView.LayoutParams(300, 250));

				Button buttonVisitedPlacesBack = (Button) dialog.findViewById(R.id.buttonVisitedPlacesBack);

				buttonVisitedPlacesBack.setOnClickListener(new View.OnClickListener() {
					public void onClick(View view) {
						dialog.dismiss();
					}

				});

				dialog.show();

			}

		});

		return dialog;
	}

	private void runAnimations() {

		animationEnded = false;

		Animation a = AnimationUtils.loadAnimation(this, R.anim.scale);
		a.reset();

		TextView tv = (TextView) findViewById(R.id.textKmTotal);
		tv.clearAnimation();
		tv.startAnimation(a);

		// a = AnimationUtils.loadAnimation(this, R.anim.scaledelayed2);
		a = AnimationUtils.loadAnimation(this, R.anim.scaletrans);
		a.reset();
		tv = (TextView) findViewById(R.id.textKmPlayed);
		tv.clearAnimation();
		tv.startAnimation(a);

		Animation animation = tv.getAnimation();

		animation.setAnimationListener(new Animation.AnimationListener() {

			@Override
			public void onAnimationStart(Animation animation) {
				// TODO Auto-generated method stub

			}

			@Override
			public void onAnimationRepeat(Animation animation) {
				// TODO Auto-generated method stub

			}

			@Override
			public void onAnimationEnd(Animation animation) {

				if (playConfig.getRound() == playConfig.getCities().size()) {

					// End game
					Integer rankPosition = ApplicationUtils.updateScoreGameTop5(getSharedPreferences(GameConstants.SHARED_PREFS, Context.MODE_PRIVATE), playConfig.getDistanceTotal(),
							playConfig.getDifficulty(), playConfig.getMapPlayed(), playConfig.getDistanceUnit());

					Dialog dialog = createDialogEndGameInfo(rankPosition);
					dialog.show();

				} else {

					GeoPoint centerGp = mapView.getMapCenter();
					List listOfOverlays = mapView.getOverlays();
					listOfOverlays.clear();

					listOfOverlays.add(new CrossHairOverlay());
					// mapView.invalidate();

					playConfig.playNewCity();
					updateLocateCityInfo();

					TextView textKmPlayed = (TextView) findViewById(R.id.textKmPlayed);
					textKmPlayed.setText("");

					updateRound();
					animationEnded = true;
				}
			}
		});

	}

	private void updateScoreBoard() {

		// TextView kmText = (TextView) findViewById(R.id.textKm);
		// kmText.setText(playConfig.getDistance() + " km");

		TextView kmText2 = (TextView) findViewById(R.id.textKmPlayed);
		kmText2.setText(playConfig.getDistance() + " " + playConfig.getDistanceUnit());
		playConfig.getPlayedCity().setDistancePlayed(playConfig.getDistance() + " " + playConfig.getDistanceUnit());

		TextView kmTextTotal = (TextView) findViewById(R.id.textKmTotal);
		kmTextTotal.setText(playConfig.getDistanceTotal() + " " + playConfig.getDistanceUnit());

	}

	private void updateRound() {
		TextView roundText = (TextView) findViewById(R.id.textRound);
		roundText.setText("Round " + playConfig.getRound() + "/" + playConfig.getCities().size());

	}

	private void updateLocateCityInfo() {

		TextView cityPlayedText = (TextView) findViewById(R.id.textCityPlayed);
		cityPlayedText.setText(playConfig.getPlayedCity().getName());

		ImageView flag = (ImageView) findViewById(R.id.flagButton);

		Bitmap image = ApplicationUtils.loadImageFlag(this.getResources(), playConfig.getPlayedCity());
		flag.setImageBitmap(image);

		// flag.setImageResource(R.drawable.flag_albania);
		flag.setVisibility(ImageView.VISIBLE);

	}

	@Override
	public boolean onKeyDown(int keyCode, KeyEvent event) {

		if (keyCode == KeyEvent.KEYCODE_BACK) {

			Context mContext = GeoMaster.this;
			final Dialog dialog = new Dialog(mContext);

			dialog.requestWindowFeature(dialog.getWindow().FEATURE_NO_TITLE);
			dialog.getWindow().setBackgroundDrawable(new ColorDrawable(android.graphics.Color.TRANSPARENT));
			dialog.setContentView(R.layout.confirmexit);

			Button buttonOk = (Button) dialog.findViewById(R.id.buttonPopupOk);
			buttonOk.setOnClickListener(new View.OnClickListener() {

				public void onClick(View view) {

					GeoMaster.this.finish();
				}

			});

			Button buttonCancel = (Button) dialog.findViewById(R.id.buttonPopupCancel);
			buttonCancel.setOnClickListener(new View.OnClickListener() {

				public void onClick(View view) {

					dialog.dismiss();
				}

			});

			dialog.show();

			return true;

		}

		return super.onKeyDown(keyCode, event);

	}

}
