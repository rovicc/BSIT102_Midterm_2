import java.util.Scanner;
import java.util.Random;
import java.math.RoundingMode;
import java.text.DecimalFormat;

public class Javelin {
	
	public static void main(String[] args)throws Exception {
		DecimalFormat df = new DecimalFormat(".##");
		Scanner sc = new Scanner(System.in);
		
		String p1,p2,p3,p4;
		
		Random rand = new Random();
		int initial = 20;
		int rangeMax = 150;
		int rangeMin = 50;
		
		double a1 = initial + (rangeMax - rangeMin) * rand.nextDouble();
		double a2 = initial + (rangeMax - rangeMin) * rand.nextDouble();
		double a3 = initial + (rangeMax - rangeMin) * rand.nextDouble();
		double a4 = initial + (rangeMax - rangeMin) * rand.nextDouble();

		
		System.out.println("Enter Player 1: ");
		p1 = sc.nextLine();
		System.out.println("Enter Player 2: ");
		p2 = sc.nextLine();
		System.out.println("Enter Player 3: ");
		p3 = sc.nextLine();
		System.out.println("Enter Player 4: ");
		p4 = sc.nextLine();
		
		System.out.println("Player 1: "+ p1 + "has thrown at " + df.format(a1) + " meters. ");
		System.out.println("Player 2: "+ p2 + "has thrown at " + df.format(a2) + " meters. ");
		System.out.println("Player 3: "+ p3 + "has thrown at " + df.format(a3) + " meters. ");
		System.out.println("Player 4: "+ p4 + "has thrown at " + df.format(a4) + " meters. ");
	}
}
