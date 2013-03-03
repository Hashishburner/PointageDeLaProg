
package ch.epfl.flamemaker.geometry2d;

public class Point {
	private double x; //abcisse
	private double y;  //ordonnee 
	public Point (double x,double y){
		this.x=x;
		this.y=y;
	}
	public double x(){return this.x;}
	public double y (){return this.y;}
	public double r() {double sommecarres=x*x+y*y;
	double racine=Math.sqrt(sommecarres);
	return racine;
	}
	 
	public double theta(){
		return Math.atan2(y, x);
	}

	public String toString(){
		return("("+this.x()+","+this.y()+")");
	}
	public static final Point ORIGIN = new Point (0,0);
}
