
package ch.epfl.flamemaker.geometry2d;
import static org.junit.Assert.*;
import org.junit.Test;

public class TransformationTest {
	private static double DELTA=0.000000001;
@Test
public void testAffineTransformation(){
	new AffineTransformation(0,1,2,3,4,5);
}
@Test
public void testNewTranslation(){
	AffineTransformation t=new AffineTransformation(1,0,0,0,1,0);
	assertEquals(t.newTranslation(2, 2).getC(),2,DELTA);
	assertEquals(t.newTranslation(2, 2).getF(),2,DELTA);
}
@Test
public void testNewRotation(){
	AffineTransformation t =new AffineTransformation(1,0,0,0,1,0);
	assertEquals(t.newRotation(Math.PI).getA(),-1,DELTA);
	assertEquals(t.newRotation(Math.PI).getB(),0,DELTA);
}
@Test
public void testNewScaling(){
	
	AffineTransformation t =new AffineTransformation(1,0,0,0,1,0);
	assertTrue(t.newScaling(1, 1).getA()==1&&t.newScaling(1, 1).getE()==1);
}

@Test
public void testNewShearX(){
	AffineTransformation t =new AffineTransformation(1,0,0,0,1,0);
	assertTrue(t.newShearX(3).getB()==3);
	assertEquals(t.newShearX(3).getA(),1,DELTA);
}

@Test
public void testNewShearY(){
	AffineTransformation t =new AffineTransformation(1,0,0,0,1,0);
	assertEquals(t.newShearY(6).getD(),6,DELTA);
	assertEquals(t.newShearY(6).getA(),1,DELTA);
}

@Test
public void testTransformPoint(){
	AffineTransformation t =new AffineTransformation(1,0,0,0,1,0);
	assertTrue(t.transformPoint(new Point(1,1)).x()==1);
	
}
@Test
public void testTranslationX(){
	AffineTransformation t =new AffineTransformation(1,0,0,0,1,0);
	assertEquals(0,t.translationX(),DELTA);
	
}
@Test
public void testTranslationY(){
	AffineTransformation t =new AffineTransformation(1,0,0,0,1,0);
	assertEquals(0,t.translationY(),DELTA);
	
}
@Test
public void testComposeWith()
{
AffineTransformation t=new AffineTransformation(1,0,0,0,1,0);
AffineTransformation l=new AffineTransformation(2,5,6,8,3,4);
assertTrue (t.ComposeWith(l).getA()==2);
}

}
