package ComparableCircle;


public abstract class GeometricObject  {
	
	private int side1;
	private int side2;
	private int side3;
    private String renk;
    private boolean filled;
    
    public GeometricObject() {
    	this(0,0,0,"mavi",false);
    }
    
    public GeometricObject(int side1,int side2,int side3,String renk, boolean filled) {
    	this.side1=side1;
    	this.side2=side2;
    	this.side3=side3;
    	
        this.renk = renk;
        this.filled = filled;
    }
    
    
  public int getSide1() {
	  return this.side1;
  }
  
  public int getSide2() {
	  return this.side2;
  }
  
  public int getSide3() {
	  return this.side3;
  }
    
    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }
    
    public boolean getFilled() {
    	return this.filled;
    }
    
    public void setFilled(boolean filled) {
        this.filled = filled;
    }
    
    public boolean isFilled() {
        return getFilled();
    }
    
    
    public abstract double getArea();
    public abstract double getPerimeter();
    
    public String toString() {
    	return "üçgenin rengi:"+ renk+"---"+ "üçgen dolumu:"+filled;
    	
    }
    
   

}
    
 	
    	
    
    
    





