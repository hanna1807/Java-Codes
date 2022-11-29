package vetorum;
import java.util.Scanner;
public class vetorum{
     public static void main (String [ ] args ) {
         Scanner in= new Scanner (System.in);
     int  i, j, a[], b[];
    a = new int [10];
    b = new int [10];  
    j = 9;
   for ( i =0; i<10; i++) {
      System.out.println("Digite o  "+i+"  elemento do vetor");
      a [i] = in.nextInt ();
      b [j] = a [i];
      j--;
    }
    System.out.print("\nVetor a[");
    for (i=0;i<10;i++){
       System.out.print(a[i] + "");
    }
    System.out.print(" ] ");
    System.out.print("\nvetor b[");
   for (i=0; i<10; i++){
     System.out.print(b[i]+ "");
   }
 System.out.print("]");

         }
    }      
 
 

