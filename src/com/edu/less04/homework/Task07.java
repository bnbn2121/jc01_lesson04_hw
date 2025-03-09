package com.edu.less04.homework;

/*
 * Даны два числа. Найти среднее арифметическое их квадратов
 * и среднее геометрическое их модулей.
 */
public class Task07 {

	public static void main(String[] args) {
		double num1;
		double num2;
		double arithmeticMeanSquares;
		double geometricMeanModuls;

		num1 = -2.3;
		num2 = 4.9;

		arithmeticMeanSquares = (Math.pow(num1, 2) + Math.pow(num2, 2)) / 2;
		geometricMeanModuls = Math.sqrt(Math.abs(num1) * Math.abs(num2));

		System.out.printf("Даны два числа: [%.1f] и [%.1f]%n", num1, num2);
		System.out.printf("Среднее арифметическое их квадратов = %.2f%n", arithmeticMeanSquares);
		System.out.printf("Среднее геометрическое модулей = %.2f%n", geometricMeanModuls);

	}

}
