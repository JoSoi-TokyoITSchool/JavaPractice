package question09;

public class Circle {

	double piValue = Math.PI;

	public double circleCalc(double radius) {

		double area = (radius * radius) * piValue;

		return area;

	}

	/*
	 double circleCalc(double radius) {
		double result = radius * radius * 3.14;
		return result;
	}
	 */

}
