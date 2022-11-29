package programaNota;
import java.util.Scanner;
public class programaNota {
	public static void main (String [] args) {
		Scanner in = new Scanner (System.in);
		int nota1, nota2, m, exa1;
		System.out.println ("Leia a primeira nota");
		nota1 = in.nextInt();
		System.out.println ("Leia a segunda nota");
		nota2 = in.nextInt();
		m=(nota1+nota2)/2;
		System.out.println ("A média é"+ m);
		if (m<3) {
			System.out.println ("reprovado");
		}else if (m>=6) {
			System.out.println ("aprovado");
		}else if (m<6) {
			System.out.println ("você está em exame, solicite uma nota de exame, extrair uma nova média anterior e a nota do exame");
			System.out.println ("Digite a primeira nota");
			exa1 = in.nextInt();
			m=(nota1+nota2)+(exa1)/3;
		} if (m>=6) {
			System.out.println ("aprovado");
		}else {
			System.out.println ("reprovado");
			in.close();
		}
			
		   
		
	}

}
