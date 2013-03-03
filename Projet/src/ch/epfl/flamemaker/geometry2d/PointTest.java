
package ch.epfl.flamemaker.geometry2d;
import static org.junit.Assert.*;
import  org.junit.Test;


public class PointTest {

	private static double DELTA=0.00000001;
	
	@Test
	public void testPoint(){
	new Point(1,1);	
      
	}
	@Test
	public void testX(){
		Point p=new Point(8,1);
		assertEquals(p.x(),8,DELTA);
		
		
	}
	@Test
	public void testY(){
		Point p=new Point(1,8);
		assertEquals(p.y(),8,DELTA);
	}
	@Test
	public void TestR(){
	  Point p=new Point(1,1);
	  assertEquals(p.r(),Math.sqrt(2),DELTA);
	}
	@Test
	public void TestTheta(){
		Point p=new Point(1,1);
		assertEquals(p.theta(),(Math.PI)/4.0,DELTA);
	}
	
}
