package programaImc;
import java.util.Scanner;
public class programaImc {
	public static void main (String[]args) {
		Scanner in = new Scanner (System.in);
		double peso, alt, imc;
		System.out.println ("Leia o peso do usuário");
		peso = in.nextDouble ();
		System.out.println ("Leia a altura do usuário");
		alt = in.nextDouble();
		System.out.println ("Calcule o imc");
		imc = peso/alt*(alt);
		if (imc<18.5) {
		   System.out.println ("Excesso de magreza");
		}else if (imc==18.5-25) {
			System.out.println("Peso normal");
		}else if (imc==25-30) {
			System.out.println ("Excesso de peso");
		}else if (imc==30-35) {
		    System.out.println ("Obesidade (grau 1)");
	    }else if (imc==35-40) {
            System.out.println ("Obesidade grau 2");
        }else if (imc>40) {
        	System.out.println ("Obesidade grau 3");
        	in.close ();
        }
		    	
		    }	
	}

