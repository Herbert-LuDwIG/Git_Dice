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
		System.out.println("Visu ieguto skaitļu summa: " + mestKaulinu(reizes));
		scan.close();
	}

   
	static int mestKaulinu(int reizes) {// mestKaulinu()
			int sk, sum = 0;
		Random rand = new Random();
		for(int i = 1; i<=reizes; i++) {
		sk = rand.nextInt(6)+1;
		sum+=sk;
		System.out.println("Uzkrita skaitlis: " + sk);
		}
		return sum;
	}//mestKaulinu() END
	
    }
	
	
	
	


