import java.util.*;
public class primos {
	      public static void main (String args []){
	         Scanner in= new Scanner (System.in);
	         int i, n;
	         System.out.println("Digite um n�mero");
	         n=in.nextInt();
	        for (i=1;i<2;i++){
	          if (n% 2== 0){
	             System.out.print("O n�mero n�o � Primo");
	         }else{
	               System.out.print("O n�mero � primo");
	        }
	    }
	 }
	}

