package com.edu.less04.homework;

/*
 * Написать программу, которая выводит на экран 
 * первые четыре степени числа e (экспоненты).
 */
public class Task05 {

	public static void main(String[] args) {
		double e = Math.E;

		for (int i = 1; i <= 4; i++) {
			System.out.printf("экспонента в степени %d равна %.2f%n", i, Math.pow(e, i));
		}

	}

}
