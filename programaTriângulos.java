package programaTriângulos;
import java.util.Scanner;
public class programaTriângulos {
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
        	  System.out.println ("não é um triângulo");
          }else if (a==b && b==c && c==a) {
        	  System.out.println ("triângulo equilátero");
          }else if (a!=b && b!=c && a!=c) {
        	  System.out.println ("triângulo isósceles");
        	  
        	  
        	  
        	  
        	  
          }
		
		
	}		
}
