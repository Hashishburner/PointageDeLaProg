
package ch.epfl.flamemaker.ifs;
import java.util.Random;
import ch.epfl.flamemaker.geometry2d.Point;
import ch.epfl.flamemaker.geometry2d.Rectangle;
import java.util.List;
import java.util.ArrayList;
import ch.epfl.flamemaker.geometry2d.Transformations;
import ch.epfl.flamemaker.geometry2d.AffineTransformation;
public class IFS {
private List <AffineTransformation> transformations=new ArrayList<AffineTransformation> ();
public IFS(List <AffineTransformation> list){
this.transformations=new ArrayList<AffineTransformation>(list)	;
}

public IFSAccumulator compute(Rectangle frame,int width,int height,int density){
	Point p=new Point(0,0);
	Random r=new Random();
	for(int k=0;k<20;k++){
		int i=r.nextInt(transformations.size());
		p=transformations.get(i).transformPoint(p);
	}
	
	for(int j=0;j<)
	
}





}



	
	
