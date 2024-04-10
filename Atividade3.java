package Atividades1004;
import java.util.Scanner;

public class Atividade3 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Quantos foram os anos de trabalho: ");
		int tp = ler.nextInt();
		
		String msg = tp <= 3 ? "O bônus salarial é de 5%" : "Seu bônus salarial é de 7%";
		System.out.println(msg);
		

	}

}
