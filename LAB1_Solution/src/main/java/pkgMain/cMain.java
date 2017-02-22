package pkgMain;
//Sam Wekselblatt, Kirstie Niessen, Ben Shopp, Joseph Stapleton
//We all worked equally 
import java.util.Scanner;

import org.apache.poi.ss.formula.functions.*;

public class cMain {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("How many years will you be retired? ");
		int yearsRetired = in.nextInt();
		
		System.out.print("What is your annual return? ");
		double annualReturn2 = in.nextDouble();
		
		System.out.print("What is your required income? ");
		double requiredIncome = in.nextDouble();
		
		System.out.print("What is your monthly SSI? ");
		double monthlySSI = in.nextDouble();
		
		System.out.print("How many years left? ");
		int yearsLeft = in.nextInt();

		System.out.print("What is your annual return? ");
		double annualReturn1 = in.nextDouble();
		
		double r = annualReturn2/12;
		double n = yearsRetired*12;
		double y = Math.abs( requiredIncome - monthlySSI) * -1;
		double f = 0;
		boolean t = false;
		
		double pv = FindPV(r, n, y, f, t);
		System.out.println(pv);
		r = annualReturn1/12;
		n = yearsLeft * 12;
		y = Math.abs(FindPMT(r, n, 0, pv, t));
		System.out.printf("%.2f",y);

	}
	
	public static double FindPMT(double r, double n, double p, double f, boolean t)
	{
		return FinanceLib.pmt(r, n, p, f, t);
	}
	
	
	public static double FindPV(double r, double n, double y, double f, boolean t)
	{
		return FinanceLib.pv(r, n, y, f, t);
	}

}
