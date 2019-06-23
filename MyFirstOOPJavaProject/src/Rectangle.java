
public class Rectangle {

	
	private double length;
	private double width;
	
	public Rectangle() {
		// TODO Auto-generated constructor stub
	}
	
	public void setLength(double l) {
		this.length=l;
	}
	
	public void setWidth(double w) {
		this.width=w;
	}
	
	public double getLength() {
		return length;
	}
	
	public double getWidth() {
		return width;
	}
	
	public double getArea() {
		return width*length;
	}
}
