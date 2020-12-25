package entities;

public class Rectangle {
	
	public double width;
	public double height;
	
	public double area() {
		return width * height;
	}
	
	public double perimeter() {
		return width + width + height + height;
	}
	
	public double diagonal() {
		
		double d = Math.pow(height , 2 ) + Math.pow(width, 2); 
		return Math.sqrt(d);
	}
	
	public String toString() {
		return "Area = " +
				String.format("%.2f",  area()) +
				" Perimeter = " +
				String.format("%.2f" ,perimeter()) +
				" Diagonal = " +
				String.format("%.2f", diagonal());
	}
}
