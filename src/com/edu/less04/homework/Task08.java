package com.edu.less04.homework;

/*
 * Дана длина стороны правильного шестигранника.
 * Найти его периметр, площадь и объём правильной
 * призмы на его основе с заданной высотой.
 */
public class Task08 {

	public static void main(String[] args) {
		double side;
		double h;
		double perimeter;
		double area;
		double volume;

		side = 4.5;
		h = 11;

		perimeter = 6 * side;
		area = 6 * Math.pow(side, 2) * Math.sqrt(3) / 4;
		volume = area * h;

		System.out.printf("Длина стороны шестиугольника: %.1f%n", side);
		System.out.printf("Периметр шестиугольника: %.1f%n", perimeter);
		System.out.printf("Площадь шестиугольника: %.1f%n", area);
		System.out.printf("Объем призмы с высотой h = %.1f составляет: %.1f%n", h, volume);

	}

}
