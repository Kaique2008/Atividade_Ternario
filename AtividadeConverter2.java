package Atividades1004;
import java.util.Scanner;

public class AtividadeConverter2 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		double a = ler.nextDouble();
		
		String msg = (a % 5 == 0) ? "é multiplo de 5" : "não é multiplo de 5";
		System.out.println("O valor "+ a+ msg);
		
		

	}

}
