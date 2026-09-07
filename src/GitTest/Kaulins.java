package GitTest;

import java.util.Random;

public class Kaulins {
   
	static void mestKaulinu(int reizes) {// mestKaulinu()
			int sk;
		Random rand = new Random();
		for(int i = 1; i<=reizes; i++) {
		sk = rand.nextInt(6)+1;
		System.out.println("Uzkrita skaitlis: " + sk);
	}
    }//mestKaulinu() END
	
	
	
	
	public static void main(String[] args) {
		mestKaulinu(5);	
	}
}
