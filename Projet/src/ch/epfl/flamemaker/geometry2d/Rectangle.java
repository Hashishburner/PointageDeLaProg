
package ch.epfl.flamemaker.geometry2d;
import java.util.Scanner;
public class Rectangle  {
Scanner scanner=new Scanner(System.in);
	private Point centre;
	private double hauteur;
	private double largeur;
	public Rectangle(Point centre,double l,double h){
		this.centre=centre;
		hauteur=h;
		largeur=l;
		if(h<0||l<0){throw new IllegalArgumentException("dimension(s) invalide(s)");}
		
	
		
	}//fin du constructeur
	
	public double left(){
		double moitiedelongueur=this.largeur/2.0;
		return this.centre.x()-moitiedelongueur;
	}
	public double right(){
		return this.left()+this.largeur;
	}
	public double bottom(){
		double moitiedehauteur=this.hauteur/2.0;
		return this.centre.y()-moitiedehauteur;
	}
public double top()	{
	return this.bottom()+this.hauteur;
}
public double width(){
	return this.largeur;
}
public double height(){
	return hauteur;
}
public Point center(){
	return centre;
}
boolean contains(Point p){
	
	return(p.x()>=this.left())&&(p.x()<=this.right())&&(p.y()>=this.bottom())&&(p.y()<=this.top());
	
}
public double aspectRatio(){
	return largeur/hauteur;
}

public Rectangle expandToAspectRatio(double aspectRatio) throws IllegalArgumentException {
	if ( aspectRatio <= 0 ) throw new IllegalArgumentException("Ratio négative") ;
	else if ( aspectRatio < aspectRatio() ) {
		return new Rectangle(centre, largeur, largeur/aspectRatio) ;
	}
	else {
		return new Rectangle(centre, hauteur * aspectRatio, hauteur) ;
	}
}

	
  


public String toString(){
	return ("("+this.centre+","+this.largeur+","+this.hauteur+")");
}
}
