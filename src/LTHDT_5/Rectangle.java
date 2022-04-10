package LTHDT_5;

public class Rectangle extends GeometricObject implements Comparable<Rectangle> {
	double width;
	double height;
	public Rectangle() {
		// TODO Auto-generated constructor stub
	}
	public Rectangle(String color, boolean filled, double width, double height) {
		super(color, filled);
		this.width = width;
		this.height = height;
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	@Override
	public double getArea() {
		return (height * width);
	}

	@Override
	public double getPerimeter() {
		return ((height + width) * 2);
	}
	
	
	@Override
	public String toString() {
		return "Rectangle [width=" + width + ", height=" + height + ", getArea()=" + getArea() + ", getPerimeter()="
				+ getPerimeter() + ", getColor()=" + getColor() + ", isFilled()=" + isFilled() + "]";
	}
	@Override
	public int compareTo(Rectangle o) {
		if(getPerimeter() < o.getPerimeter()) {
			return -1;
		}else if(getPerimeter() == o.getPerimeter()) {
			return 0;
		}else 
			return 1;
		
	}
	
}
