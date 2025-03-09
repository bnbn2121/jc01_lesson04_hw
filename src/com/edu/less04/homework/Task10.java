package com.edu.less04.homework;

/*
 * Известен радиус шара. Найти его объем и площадь поверхности.
 */
public class Task10 {

	public static void main(String[] args) {
		double radius;
		double area;
		double volume;
		double pi = Math.PI;

		radius = 3.9;

		area = 4 * pi * Math.pow(radius, 2);
		volume = 4 * pi * Math.pow(radius, 3) / 3;
		
		System.out.printf("Радиус шара: %.1f%n", radius);
		System.out.printf("Площадь поверхности шара: %.1f%n", area);
		System.out.printf("Объем шара: %.1f%n", volume);

	}

}
