package LTHDT_5;

public abstract class GeometricObject {
	String color;
	boolean filled;
	public GeometricObject() {
		// TODO Auto-generated constructor stub
	}
	public GeometricObject(String color, boolean filled) {
		super();
		this.color = color;
		this.filled = filled;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public boolean isFilled() {
		return filled;
	}
	public void setFilled(boolean filled) {
		this.filled = filled;
	}
	
	public abstract double getArea();
	
	public abstract double getPerimeter();
	public int compareTo(Rectangle o) {
		// TODO Auto-generated method stub
		return 0;
	}
}
