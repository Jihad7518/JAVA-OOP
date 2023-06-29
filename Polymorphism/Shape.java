package Polymorphism;

public class Shape {
	private String color;
	private boolean isFilled;
	public String getColor() {
		return color;
	}
	public boolean isFilled() {
		return isFilled;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public void setFilled(boolean isFilled) {
		this.isFilled = isFilled;
	}
	public Shape(String color, boolean isFilled) {
		super();
		this.color = color;
		this.isFilled = isFilled;
	}
	
	public double getArea() {
		return 0.0;
	}
	
	@Override
	public String toString() {
		return "Shape [color=" + color + ", isFilled=" + isFilled + "]";
	}
	
	
	
}
