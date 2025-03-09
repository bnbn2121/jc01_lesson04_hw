package com.edu.less04.homework;

import java.util.Scanner;

/*
 * Найти сумму цифр заданного четырёхзначного числа.
 */
public class Task06 {

	public static void main(String[] args) {
		int number;
		int sumDigits;
		int digitsLimit = 4;
		Scanner scanner = new Scanner(System.in);

		while (true) {
			System.out.print("Введите " + digitsLimit + "-значное число: ");
			if (!scanner.hasNextInt()) {
				scanner.next();
				System.out.println("Введено не число");
			} else {
				number = Math.abs(scanner.nextInt());
				if (countDigits(number) == digitsLimit) {
					break;
				} else {
					System.out.println("Число не четырехзначное");
				}
			}
		}
		sumDigits = calcSumDigits(number);
		System.out.printf("Сумма цифр в числе равна %d", sumDigits);
		scanner.close();
	}

	public static int countDigits(int num) {
		int countDigit = 1;
		while (num / 10 > 0) {
			num /= 10;
			countDigit++;
		}
		return countDigit;
	}

	public static int calcSumDigits(int num) {
		int sum = 0;
		while (num > 0) {
			sum += num % 10;
			num /= 10;
		}
		return sum;
	}

}
