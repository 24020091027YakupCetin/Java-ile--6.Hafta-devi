package ComparableCircle;



public class Rectangle extends GeometricObject{
	
	
	private int width;
	private int height;
	
	
	public Rectangle(int width,int height) {
		
		this.height=height;
		this.width=width;
		
	}

	

	public double getArea() {
        return (int)width * height;
    }

    @Override
    public double getPerimeter() {
        return (int)2 * (width + height);
    }
    
   
    	
    

    @Override
    public String toString() {
        return "Rectangle [Width: " + width + ", Height: " + height + ", Area: " + getArea() + "]";
    }



	
}
