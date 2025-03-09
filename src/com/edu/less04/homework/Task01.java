package com.edu.less04.homework;

/*
 * Вычислить периметр и площадь прямоугольника 
 * по заданным длинам его сторон a и b.
 */
public class Task01 {

	public static void main(String[] args) {
		double sideA;
		double sideB;
		double perimeter;
		double area;

		sideA = 2.6;
		sideB = 5;

		perimeter = 2 * (sideA + sideB);
		area = sideA * sideB;

		System.out.println("Perimeter = " + perimeter);
		System.out.println("Area = " + area);
	}

}
