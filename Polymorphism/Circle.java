package Polymorphism;

public class Circle extends Shape {
	private double radius;

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public Circle(String color, boolean isFilled, double radius) {
		super(color, isFilled);
		this.radius = radius;
		// TODO Auto-generated constructor stub
	}
	
	public double getParimeter() {
		return 2 * Math.PI * this.radius;
	}
	
	public double getArea() {
		return Math.PI * this.radius * this.radius;
	}

	@Override
	public String toString() {
		return super.toString() + "Radius=" + radius;
	}
	
	

	
	
	
	
	
}
