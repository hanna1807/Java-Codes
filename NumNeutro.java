package numneutro;
import java.util.Scanner;
public class NumNeutro {
	public static void main (String[]args) {
		double  neutro, p, num, i;
		Scanner in= new Scanner (System.in);
		System.out.println ("digite um número");
		num=in.nextDouble(); 
		if (num==0);
			System.out.println ("neutro"); 
		 if(num>0) 
		System.out.println ("positivo"); 
	 if (num<0) 
	System.out.println("negativo");
		neutro=in.nextDouble();
		System.out.println (num + ">" + "que 0 ele é positivo");

	}

}
