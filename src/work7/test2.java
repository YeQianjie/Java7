package work7;

import java.util.Random;

public class test2 {

	public static void main(String[] args) {
		
		Random r=new Random(1000);
		
		
		for(int j=0;j<50;j++) {
			System.out.print(r.nextInt(100)+" ");
		}
		

	}

}
