package com.sillynamedvars.geomaster.pro.overlay;

import android.content.Context;
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
import com.sillynamedvars.geomaster.pro.util.ApplicationUtils;

public class Marker extends Overlay {

	private GeoPoint currentLocation = null;
	private GeoPoint destLocation = null;
	private boolean isSatelliteMap = true;

	private final Context context;

	public Marker(Context context, GeoPoint currentLocation, GeoPoint destLocation, boolean isSatelliteMap) {

		super();
		this.context = context;
		this.currentLocation = currentLocation;
		this.destLocation = destLocation;
		this.isSatelliteMap = isSatelliteMap;
	}

	@Override
	public void draw(Canvas canvas, MapView mapView, boolean shadow) {
		super.draw(canvas, mapView, shadow);

		if (this.currentLocation != null && destLocation != null) {
			ApplicationUtils.drawLine(currentLocation, destLocation, mapView, canvas);

			Point pointIni = new Point();
			Projection projectionIni = mapView.getProjection();
			projectionIni.toPixels(currentLocation, pointIni);

			Point pointEnd = new Point();
			Projection projectionEnd = mapView.getProjection();
			projectionEnd.toPixels(destLocation, pointEnd);

			// Bitmap bmp = BitmapFactory.decodeResource(context.getResources(),
			// R.drawable.pin);
			// canvas.drawBitmap(bmp, pointIni.x - 6, pointIni.y - 30, null);
			// canvas.drawBitmap(bmp, pointEnd.x - 6, pointEnd.y - 30, null);

			drawPoint(canvas, pointIni);
			drawPoint(canvas, pointEnd);
		}

	}

	public void drawPoint(Canvas canvas, Point point) {
		Paint paint;
		paint = new Paint();

		if (isSatelliteMap) {
			paint.setColor(Color.YELLOW);
		} else {
			paint.setColor(Color.BLUE);
		}

		paint.setAntiAlias(true);
		paint.setStyle(Style.STROKE);
		paint.setStrokeWidth(3);
		canvas.drawPoint(point.x, point.y, paint);
	}

	@Override
	public boolean onTouchEvent(MotionEvent e, MapView mapView) {
		return super.onTouchEvent(e, mapView);

	}

	@Override
	public boolean onTap(GeoPoint p, MapView mapView) {

		return super.onTap(p, mapView);
	}

}
