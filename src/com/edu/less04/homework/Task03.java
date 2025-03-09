package com.edu.less04.homework;

/*
 * Даны координаты трёх вершин прямоугольного
 * треугольника (x1,y1), (x2,y2), (x3,y3).
 * Найти длины его катетов и гипотенузы.
 */
public class Task03 {

	static class Point {
		int x;
		int y;

		Point(int x, int y) {
			this.x = x;
			this.y = y;
		}

	}

	static class RightTriangle {
		private Point pointA;
		private Point pointB;
		private Point pointC;
		private double sideAB;
		private double sideBC;
		private double sideCA;
		boolean is90Degrees;

		RightTriangle(Point pointA, Point pointB, Point pointC) {
			this.pointA = pointA;
			this.pointB = pointB;
			this.pointC = pointC;
			sideAB = this.calculateSide(pointA, pointB);
			sideBC = this.calculateSide(pointB, pointC);
			sideCA = this.calculateSide(pointC, pointA);
		}

		public double calculateSide(Point point1, Point point2) {
			double side = Math.sqrt(Math.pow(point1.x - point2.x, 2) + Math.pow(point1.y - point2.y, 2));
			return side;
		}

		public void check90Degrees() {
			if (Math.abs(sideAB * sideAB + sideBC * sideBC - sideCA * sideCA) < 10e-5) {
				is90Degrees = true;
			} else if (Math.abs(sideAB * sideAB + sideCA * sideCA - sideBC * sideBC) < 10e-5) {
				is90Degrees = true;
			} else if (Math.abs(sideCA * sideCA + sideBC * sideBC - sideAB * sideAB) < 10e-5) {
				is90Degrees = true;
			} else {
				System.out.println("треугольник не прямоугольный");
				is90Degrees = false;
			}
		}

		public void printSide(double side) {
			double hypotenuse = Math.max(sideAB, Math.max(sideBC, sideCA));
			if (side == hypotenuse) {
				System.out.printf("гипотенуза = %.1f%n", side);
			} else {
				System.out.printf("катет = %.1f%n", side);
			}
		}

		public void printSides() {
			if (is90Degrees) {
				this.printSide(sideAB);
				this.printSide(sideBC);
				this.printSide(sideCA);
			}
		}

	}

	public static void main(String[] args) {
		Point point1 = new Point(0, 0);
		Point point2 = new Point(4, 0);
		Point point3 = new Point(4, 3);

		RightTriangle triangle = new RightTriangle(point1, point2, point3);
		triangle.check90Degrees();
		triangle.printSides();

	}

}