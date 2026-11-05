package ComparableCircle;

public class ComparableCircle extends Circle  implements Comparable<GeometricObject> {
	
	
	public ComparableCircle(int radius) {
		super(radius);
	}
	
	
	@Override
	  public double getArea() {
	        return radius * radius * Math.PI;
	    }

	@Override
	    public double getPerimeter() {
	        return 2 * radius * Math.PI;
	    }
	
	@Override
	public int compareTo(GeometricObject o) {
		if(this.getArea()>o.getArea()) {
    		return 1;
    		
    	}
    	
    	else if(this.getArea()<o.getArea()) {
    		
    		return -1;
    	}
    	
    	else {
    		return 0;
	}
		
	}
	

	
	
}
	

	
	
	
	
	

	






