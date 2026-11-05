package mainTest;

import ComparableCircle.ComparableCircle;
import ComparableCircle.Rectangle;
import ComparableCircle.GeometricObject;


public class main {
	
	public static void main(String[] args) {
		
		
		GeometricObject g1= new Rectangle(3,5);
		
		ComparableCircle c1 = new ComparableCircle(2);
		ComparableCircle c2 = new ComparableCircle(4);
		
		
		System.out.println(" dairelerden alanı büyük olanın alanı:"+c1.compareTo(c2));
		
		
		
		
		System.out.println("daire ve dikdörtgenden alanı büyük olanın alanı:"+ c1.compareTo(g1));
		
		
		double büyükDaire;
		if (c1.compareTo(c2) > 0) {
			 büyükDaire = c1.getArea();
		} else {
			 büyükDaire = c2.getArea();
		}
		
		
		double büyükŞekil;
		if(c1.compareTo(g1)>0) {
			büyükŞekil=c1.getArea();
		}
		else {
			büyükŞekil=g1.getArea();
		}
		
	
	
	
	System.out.println("dairelerden alanı büyük olan:"+ büyükDaire);
	System.out.println("daire ve dikdörtgenden  alanı büyük olan:"+ büyükŞekil);

	

}
	}
