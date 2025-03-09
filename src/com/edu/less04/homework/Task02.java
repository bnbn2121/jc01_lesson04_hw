package com.edu.less04.homework;

/*
 * Вычислить расстояние между центрами двух окружностей 
 * с заданными координатами их центров (x1,y1) и (x2,y2).
 */
public class Task02 {

	public static void main(String[] args) {
		int x1, y1;
		int x2, y2;
		double distance12;

		x1 = 2;
		y1 = 5;
		x2 = -3;
		y2 = 11;

		distance12 = Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
		System.out.println("distance = " + Math.round(distance12 * 10) / 10.0);

	}

}
