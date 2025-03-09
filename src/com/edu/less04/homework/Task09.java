package com.edu.less04.homework;

/*
 * Дана сторона правильного четырёхугольника (квадрата).
 * Найти его площадь, диагональ и радиусы вписанной и описанной окружностей.
 */
public class Task09 {

	static class Square {
		private double side;
		private double diagonal;

		Square(double side) {
			this.side = side;
			diagonal = side * Math.sqrt(2);
		}

		double calcArea() {
			double area = side * side;
			return area;
		}

		double calcRadiusIn() {
			double radiusIn = side / 2;
			return radiusIn;
		}

		double calcRadiusOut() {
			double radiusOut = diagonal / 2;
			return radiusOut;
		}
	}

	public static void main(String[] args) {

		double side = 5.6;
		Square square = new Square(side);

		System.out.printf("Длина стороны квадрата: %.1f%n", square.side);
		System.out.printf("Длина диагонили квадрата: %.1f%n", square.diagonal);
		System.out.printf("Площадь квадрата: %.1f%n", square.calcArea());
		System.out.printf("Радиус вписанной окружности: %.1f%n", square.calcRadiusIn());
		System.out.printf("Радиус описанной окружности: %.1f%n", square.calcRadiusOut());

	}

}
