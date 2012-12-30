package com.adamratana.rotationvectorcompass;

import com.adamratana.rotationvectorcompass.math.Matrix;

public interface OrientationCalculator {
	/**
	 * Given a rotation matrix and the current device screen rotation, produce
	 * values for azimuth, altitude, roll (yaw, pitch, roll)
	 * 
	 * @param rotationMatrix
	 *            - device rotation
	 * @param screenRotation
	 *            - device screen rotation
	 * @param out
	 *            - array of float[3] to dump values into
	 */
	public void getOrientation(Matrix rotationMatrix, int screenRotation, float[] out);
}
