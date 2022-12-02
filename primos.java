import java.util.*;
public class primos {
	      public static void main (String args []){
	         Scanner in= new Scanner (System.in);
	         int i, n;
	         System.out.println("Digite um número");
	         n=in.nextInt();
	        for (i=1;i<2;i++){
	          if (n% 2== 0){
	             System.out.print("O número não é Primo");
	         }else{
	               System.out.print("O número é primo");
	        }
	    }
	 }
	}

