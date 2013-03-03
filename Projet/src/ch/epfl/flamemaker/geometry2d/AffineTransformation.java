
package ch.epfl.flamemaker.geometry2d;

public class AffineTransformation implements Transformations {
private double a;
private double b;
private double c;
private double d;
private double e;
private double f;
public static final AffineTransformation IDENTITY=new AffineTransformation (1,0,0,0,1,0);

public AffineTransformation(double a,double b,double c,double d,double e,double f){
	this.a=a;
	this.b=b;
	this.c=c;
	this.d=d;
	this.e=e;
	this.f=f;
	
}

public double getA(){
	return a;
}
public double getB(){
	return b;
}
public double getC(){
	return c;
}
public double getD(){
	return d;
}
public double getE(){
	return e;
}
public double getF(){
	return f;
}


public AffineTransformation newTranslation(double dx,double dy){
	return new AffineTransformation(0,0,dx,0,0,dy);
}

public AffineTransformation newRotation(double theta){
	return new AffineTransformation(Math.cos(theta),Math.sin(theta),0,Math.sin(theta),Math.cos(theta),0);
	
}

public AffineTransformation newScaling(double sx, double sy){
	return new AffineTransformation(sx,0,0,0,sy,0);
}

public AffineTransformation newShearX(double sx){
	return new AffineTransformation(1,sx,0,0,1,0);
}

public AffineTransformation newShearY(double sy) {
	return new AffineTransformation(1,0,0,sy,1,0);
}

public Point transformPoint(Point p){double newAbcisse=this.a*p.x()+this.b*p.y()+this.c;
double newOrdonnee=this.d*p.x()+this.e*p.y()+this.f;
return new Point(newAbcisse,newOrdonnee);
	
}

public double translationX(){
	return this.c;
}
public double translationY(){
	return this.f;
}

public AffineTransformation ComposeWith(AffineTransformation that){
	double newA=this.a*that.a+this.b*that.d;
	double newB=this.a*that.b+this.b*that.e;
	double newC=this.a*that.c+this.b*that.f+this.c;
	double newD=this.d*that.a+this.e*that.d;
	double newE=this.d*that.b+this.e*that.e;
	double newF=this.d*that.c+this.e*that.f+this.f;
	return new AffineTransformation(newA,newB,newC,newD,newE,newF);
}
}
