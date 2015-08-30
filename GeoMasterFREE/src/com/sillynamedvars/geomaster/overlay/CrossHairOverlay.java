package com.sillynamedvars.geomaster.overlay;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Point;
import android.view.MotionEvent;

import com.google.android.maps.GeoPoint;
import com.google.android.maps.MapView;
import com.google.android.maps.Overlay;
import com.google.android.maps.Projection;

public class CrossHairOverlay extends Overlay {

	@Override
	public void draw(Canvas canvas, MapView mapView, boolean shadow) {
		// TODO Auto-generated method stub
		super.draw(canvas, mapView, shadow);

		GeoPoint centerGp = mapView.getMapCenter();
		Projection projection = mapView.getProjection();
		Point centerPoint = projection.toPixels(centerGp, null);

		drawCircle(canvas, centerPoint, mapView);
	}

	protected void drawCircle(Canvas canvas, Point curScreenCoords, MapView mapView) {
		Paint lp4;
		lp4 = new Paint();
		lp4.setColor(Color.RED);
		lp4.setAntiAlias(true);
		lp4.setStyle(Style.STROKE);
		canvas.drawCircle(mapView.getWidth() / 2, mapView.getHeight() / 2, 20, lp4);

		// Paint lp4;
		lp4 = new Paint();
		lp4.setColor(Color.RED);
		lp4.setAntiAlias(true);
		lp4.setStyle(Style.STROKE);
		canvas.drawCircle(mapView.getWidth() / 2, mapView.getHeight() / 2, 5, lp4);

		Paint point;
		point = new Paint();
		point.setColor(Color.RED);
		point.setAntiAlias(true);
		point.setStyle(Style.STROKE);
		point.setStrokeWidth(3);
		canvas.drawPoint(mapView.getWidth() / 2, mapView.getHeight() / 2, point);
	}

	@Override
	public boolean onTap(GeoPoint p, MapView arg1) {
		return super.onTap(p, arg1);
	}

	@Override
	public boolean onTouchEvent(MotionEvent arg0, MapView arg1) {
		return super.onTouchEvent(arg0, arg1);
	}

}
