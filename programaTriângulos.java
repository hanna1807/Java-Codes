package programaTri�ngulos;
import java.util.Scanner;
public class programaTri�ngulos {
	public static void main (String[]args) {
          Scanner in = new Scanner (System.in);
          double a, b, c;
          System.out.println ("Leia o lado A");
          a = in.nextDouble ();
          System.out.println ("Leia o lado B");
          b = in.nextDouble ();
          System.out.println ("Leia o lado c");
          c = in.nextDouble ();
          if (a>b+c && b>a+c && c>a+b) {
        	  System.out.println ("n�o � um tri�ngulo");
          }else if (a==b && b==c && c==a) {
        	  System.out.println ("tri�ngulo equil�tero");
          }else if (a!=b && b!=c && a!=c) {
        	  System.out.println ("tri�ngulo is�sceles");
        	  
        	  
        	  
        	  
        	  
          }
		
		
	}		
}
