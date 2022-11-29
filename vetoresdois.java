package vetorum;
import java.util.Scanner;
public class vetoresdois {
   public static void main (String [ ] args ) {
		 Scanner in= new Scanner (System.in);
		 final int TAM =10;
		 int a [], b[], c[], i; 
		           a =new int[TAM];
		           b =new int[TAM];
		           c =new int[TAM];
		          for (i=0; i<10; i++){
		              System.out.println("Digite o" + (i+1)+  "valores dos vetores b");
		             b[i] = in.nextInt(); 
		            c[i] = a[i] + b[i];
		           System.out.print ("\nC = ");
		           for (i=0; i<TAM; i++) {
		          }
		    }
		}

}
