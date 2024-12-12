package com.geometry.shapes3d;

public class Cube implements Shape3D {
	private final double side;

	public Cube(double side) {
		if (side <= 0) {
			throw new IllegalArgumentException("Side length must be positive");
		}
		this.side = side;
	}

	@Override
	public double getVolume() {
		return Math.pow(side, 3);
	}

	@Override
	public double getSurfaceArea() {
		return 6 * Math.pow(side, 2);
	}
}