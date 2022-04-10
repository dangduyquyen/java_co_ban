package LTHDT_5;

public class Circle extends GeometricObject implements Comparable<Circle> {
	double radius;
	public Circle() {
		// TODO Auto-generated constructor stub
	}
	public Circle(String color, boolean filled, double radius) {
		super(color, filled);
		this.radius = radius;
	}
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}


	@Override
	public double getArea() {
		return ((Math.pow(radius, 2))*3.14159);
	}

	@Override
	public double getPerimeter() {
		return  (2 * radius * 3.14159);
	}
	@Override
	public String toString() {
		return "Circle [radius=" + radius + ", getArea()=" + getArea() + ", getPerimeter()=" + getPerimeter()
				+ ", getColor()=" + getColor() + ", isFilled()=" + isFilled() + "]";
	}
	
	
	@Override
	public int compareTo(Circle o) {
		if(getArea() < o.getArea()) {
			return -1;
		}else if(getArea() == o.getArea()) {
			return 0;
		}else
			return 1;
	}
	
}
