package GitTest;

import java.util.Random;
import java.util.Scanner;

public class Kaulins {


	public static void main(String[] args) {
		int reizes;
		Random rand = new Random();
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Cik reizes metisim kaulinu?");
		reizes = scan.nextInt();
		mestKaulinu(reizes);
		scan.close();
	}

   
	static void mestKaulinu(int reizes) {// mestKaulinu()
			int sk;
		Random rand = new Random();
		for(int i = 1; i<=reizes; i++) {
		sk = rand.nextInt(6)+1;
		System.out.println("Uzkrita skaitlis: " + sk);
		}
		
	}//mestKaulinu() END
	
    }
	
	
	
	


