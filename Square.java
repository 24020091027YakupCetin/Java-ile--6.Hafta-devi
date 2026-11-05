package Square;

public class Square extends  GeometricObject implements Colorable {
	
	private double side;
	
	
	public Square() {
		this(0);
	}
	
	
	public Square(double side) {
		this.side=side;
	}
	
	public double getSide() {
		
		return this.side;
	}
	
	
	public void setSide(double side) {
		this.side=side;
	}


	@Override
	public double getArea() {
		
		return getSide()*getSide();
	}
		
		


	@Override
	public double getPerimeter() {
		
		return getSide()*4;
		
	}

	@Override
	public void howToColor() {
		
		System.out.println(" Karenin Dört kenarıda renklendir");
		
	}

}
