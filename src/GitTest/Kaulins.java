package GitTest;

import java.util.Random;

public class Kaulins {
   
	static void mestKaulinu() {// mestKaulinu()
			int sk;
		Random rand = new Random();
		sk = rand.nextInt(6)+1;
		
		System.out.println("Uzkrita skaitlis: " + sk);
    }//mestKaulinu() END
	
	
	
	
	public static void main(String[] args) {
		mestKaulinu();	
	}
}
