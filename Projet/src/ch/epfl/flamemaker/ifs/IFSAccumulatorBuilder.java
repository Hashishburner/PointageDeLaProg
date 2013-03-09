
package ch.epfl.flamemaker.ifs;
import ch.epfl.flamemaker.geometry2d.Rectangle;
import ch.epfl.flamemaker.geometry2d.Point;
public class IFSAccumulatorBuilder {
	private Rectangle frame;
	private IFSAccumulator accumulator;
	
	public IFSAccumulatorBuilder(Rectangle frame,int width,int height){
	
		if(width<=0||height<=0){
			throw new IllegalArgumentException();
			
		}
		
		this.frame=frame;
		this.accumulator=new IFSAccumulator(new boolean [height][width]);
	   
	    
		}
	
	
	public void hit(Point p){
	   
	}
	
	
	
	

}
