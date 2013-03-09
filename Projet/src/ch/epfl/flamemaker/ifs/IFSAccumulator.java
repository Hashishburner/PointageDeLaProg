
package ch.epfl.flamemaker.ifs;
import java.util.Arrays;

public  class IFSAccumulator {
	private boolean [][] isHit;
	
	public IFSAccumulator(boolean [][] isHit){this.isHit=new boolean [isHit.length][isHit[0].length];
		for(int i=0;i<isHit.length;i++) {for(int j=0;j<isHit[i].length;j++){
			this.isHit[i][j]=(isHit[i][j]&&0==0);
		}
		
			
		}
	}

	public int width(){
		return this.isHit[0].length;
	}
	
	public int height() {
		return this.isHit.length;
	}
	
	
	public boolean isHit(int x,int y){
boolean b=false;		
		if (this.isHit[x][y]){
			b=true;
		}
		
		if(!(0<=x&&x<isHit[0].length&&0<=y&&y<isHit.length)){
			throw new IndexOutOfBoundsException();
		}
		
	
		
		return b;
		
		
	}
	
	
	
	
	
}
