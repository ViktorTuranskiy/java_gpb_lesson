package ru.stqa.JGPBL.sandbox;

public class MyFirstProgram {
	public static void main(String[] args)
	{
		Point p1 = new Point(3, 4);
		Point p2 = new Point(7, 1);
		System.out.println("расстояние между точкой А с координатами x=" + p1.x + "/" + "y=" + p1.y + " и точкой B с координатами x=" + p2.x + "/" + "y=" + p2.y + " = " + distance(p1,p2));
		System.out.println("расстояние между точкой А с координатами x=" + p1.x + "/" + "y=" + p1.y + " и точкой B с координатами x=" + p2.x + "/" + "y=" + p2.y + " = " + Point.distance(p1,p2));
	}

	public static double distance(Point p1, Point p2) {
		return Math.sqrt((p2.y - p1.y) * (p2.y - p1.y) + (p2.x - p1.x) * (p2.x - p1.x));
	}

}