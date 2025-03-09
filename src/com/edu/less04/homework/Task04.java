package com.edu.less04.homework;

/*
 * Вычислить длину дуги и площадь сектора окружности
 * с заданным радиусом R и центральным углом α (в градусах).
 */
public class Task04 {

	public static void main(String[] args) {
		double radius;
		int angle; 				// в градусах
		double arcLength;
		double sectorArea;
		double pi = Math.PI;

		radius = 5.5;
		angle = 48;

		arcLength = 2 * pi * radius / 360 * angle;
		sectorArea = pi * radius * radius / 360 * angle;

		System.out.printf("дано: радиус = %.1f, угол = %d;%n", radius, angle);
		System.out.printf("длина дуги = %.1f%n", arcLength);
		System.out.printf("площадь сектора = %.1f%n", sectorArea);

	}

}
