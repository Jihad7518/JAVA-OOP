package Polymorphism;

import java.util.ArrayList;

public class ShapeDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Shape> shapes = new ArrayList<Shape>();
		
		shapes.add(new Circle("Red", true, 6));
		shapes.add(new Rectangle("White", false, 6, 4));
		shapes.add(new Circle("Green", true, 8.5));
		shapes.add(new Rectangle("Yellow", true, 9.3, 7.2));
		
		for(Shape s: shapes) {
			System.out.println(s.toString());
			System.out.println("Area; "+ s.getArea());
			if(s instanceof Circle) {
				System.out.println("Parimeter: " +((Circle) s).getParimeter());
			}
			System.out.println(s.getClass().toString());
		}
		
		
	}

}
